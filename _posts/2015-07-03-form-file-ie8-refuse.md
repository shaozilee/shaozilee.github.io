---
layout: post
title: Form上传图片，非用户点击File按钮选择文件，在IE8浏览器下报“拒绝访问”
---
<img src="{{ site.url }}/images/post/file-ie8.jpg" class="excerpt">
开发网站的人总会遇到文件上传，Form表单的File上传方案最最正常的了，不过大家伙有没有人遇到过IE8下，不是直接点击File控件选择文件，而是通过js调用触发File控件弹出选择文件的窗口，这个时候进行提交的From会被IE8浏览器阻止，给出错误信息“拒绝访问”。我遇到了所以我把我的解决方案和过程记录下来，方便大家。

<!-- ## -->
这个问题在任何版本的的IE浏览器下都不会发生，除了IE8，所以网站在兼容性上要格外注意这个bug。

![]({{ site.url }}/images/post/file-ie8.jpg)

##操作说明
文件上传通过一个超链接按钮点击后弹出文件选择框，选择文件确定后发送异步上传请求。

##重现问题
------------------------------------

![]({{ site.url }}/images/post/file-ie8-no1.jpg)

![]({{ site.url }}/images/post/file-ie8-no2.jpg)

![]({{ site.url }}/images/post/file-ie8-no3.jpg)

最后一个弹出提示后，浏览器不会发送上传请求，javascript控制台会显示“拒绝访问”错误。


##解决问题
首先要找到问题的根源，这个问题的根源是浏览器对于非用户点击的选择文件按钮，会阻止表单的提交。
OK，既然必须点击选择，那么就把选择按钮做成透明的层覆盖在显示按钮上面，这样就能保证浏览器的安全限制。
看一下效果：

![]({{ site.url }}/images/post/file-ie8-ok.jpg)


##Demo程序
***【[upload.html](https://github.com/shaozilee/shaozilee.github.io/tree/master/test/file-ie8/upload.html)】***






---
##参考资料


















