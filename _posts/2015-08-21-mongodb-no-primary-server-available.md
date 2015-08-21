---
layout: post
title: node-mongodb-native驱动模块连接mongodb报no primary server available
---
<img src="{{ site.url }}/images/post/no-primary-server.jpg" class="excerpt">
最近开发公司的系统，遇到nodejs用node-mongodb-native连接mongo replset集群，nodejs日志报“no primary server available”错误，后来仔细推敲想明白了其中的原因，问题已经解决，所以如果你也遇上这个问题，请看详细报告

<!-- ## -->
单从日志的字面意思是“没有主节点服务器可以使用”，后来查了mongodb的驱动包，发现确实是因为主节点没有导致的，也就是说集群仲裁不出可用的主节点。

![]({{ site.url }}/images/post/no-primary-server.jpg)

##重现问题
------------------------------------
开启node集群，建立mongodb连接池maxSize=50，node集群大约12个节点，也就是说系统连接mongodb的连接大约有600个连接，当访问mongo的数量比较大的时候，很快连接池的连接就达到上限。
这时由于主节点mongodb的连接数很快被占满，导致mongo服务器仲裁选择新的主节点，但是由于nodejs连接mongo集群是根据连接URL中的节点有多少就连接多少，保持与每个mongo的长连接，于是
造成了，其他的节点作为主节点也不能承载更多的连接，最终仲裁选择不出主节点，集群返回的primary server列表为空。驱动包最终报出标题的错误信息。


##解决问题
上面分析了问题产生的原因，好了，那么我们就要从mongodb的连接的数量上进行着手
1.增加mongodb的最大文件访问数提升socket的连接上限(linux ulimit)
2.减少nodejs的mongodb连接池的大小(url maxSize)

以上两种方式均可以解决这个问题，依据你实际情况选择。



---
##参考资料
<http://serverfault.com/questions/480605/mongodb-keeps-reporting-no-primary-found-but-shell-works-fine>
<http://stackoverflow.com/questions/15060698/error-no-primary-server-found-in-set>
















