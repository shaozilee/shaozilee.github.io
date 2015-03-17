---
layout: post
title: unix&linux操作系统族谱
---
<img src="{{ site.url }}/images/post/os.jpg" class="excerpt">
在操作系统的历史上，unix和linux占有重要的两席之地，这也是此报告的目的，我们要弄清楚uninx和linux是从哪里来，要到哪里去？作为一篇比较扯淡的文章，各位看完就当一乐，个中野史不明出处，还请各位轻喷。

<!-- ## -->
![]({{ site.url }}/images/post/os.jpg)

上图来源于维基百科，分量相对来说比较重。谨以此图向大家展示uninx和linux的发展史。

早在二战时期，英国盟军因受到德国的攻击屡屡战败，为了破解恩格玛加密机，特此邀请了图灵先生进行研究破解德国的加密系统，当时德国采用的是三转子的恩格玛机，这种加密机是通过设定一定的字母序列，然后复式替换密码，发送方和接收方都要设定一样的序列才能进行正确的通信。图灵设计了一套机械系统，通过不停的运算，来算出来德国军方设定的字母序列，就是这样的大机器破解先进的恩格玛加密机，这个庞然大物就是计算机的起源，此后图灵以此构建了图灵机这个抽象的概念，图灵机的诞生为后来的计算机的发展奠定了相当重的基础，在此向这位伟大的阿兰·图灵致敬。

2014年由莫腾·泰杜姆执导，本尼迪克特·康伯巴奇、凯拉·奈特莉等主演的传记电影**《The Imitation Game》**，影片改编自安德鲁·霍奇斯编著的传记**《艾伦·图灵传》**，说到**本尼迪克特·康伯巴奇**大家肯定不陌生，就是最火英剧《神探夏洛克》中的夏洛克。*好了，说到这里，想要种子的请留邮箱*

回到正题，unix的创始人Ken·Thompson(肯·汤普逊)于1966年加入贝尔实验室，然后参与由贝尔实验室、AT&T、麻省理工及美国通用电气共同研发一套多使用者分时作业系统[Multics](http://www.multicians.org/multics.html)运行在GE-645大型主机上。

![]({{ site.url }}/images/post/os-multics.jpg)

Multics logo

由于项目进展缓慢，AT&T公司最终撤出了投入Multics项目的资源，中止这项合作项目，此时Ken刚刚加入项目才不久，但因为机器仍然保留在贝尔实验室，他继续在GE-645上开发软件，写出了一个模拟器，可以让一个文件系统与存储器标签页机制运作起来。他同时也写了一个编程语言Bon，编写了一个太空旅行游戏。经过实际运行后，他发现游戏速度很慢而且耗费昂贵，每次运行会花费75美元。在GE-645被搬走后，肯·汤普逊在实验室中查找没人使用的机器，找到了几台PDP-7。丹尼斯·里奇的帮助下，汤普逊用PDP-7的汇编语言重写了这个游戏，并使其在DEC PDP-7上运行起来。



终于捋完了整个Unix和Linux系统编年史，希望此篇报告能对你了解操作系统有一个帮助。



---
##参考资料
<http://commons.wikimedia.org/wiki/File:Unix_timeline.en.svg?uselang=zh>

<http://zh.wikipedia.org/wiki/%E8%89%BE%E4%BC%A6%C2%B7%E5%9B%BE%E7%81%B5>

<http://zh.wikipedia.org/wiki/UNIX>

<http://zh.wikipedia.org/wiki/Linux>   

<http://zh.wikipedia.org/wiki/Linux%E5%8E%86%E5%8F%B2>

<http://upload.wikimedia.org/wikipedia/commons/1/11/Unix-history.svg>

<http://zh.wikipedia.org/wiki/BSD>

<http://www.csdn.net/article/2012-02-21/312220>

