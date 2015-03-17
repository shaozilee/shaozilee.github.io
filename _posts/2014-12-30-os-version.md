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


1969年，Ken提议在PDP-7上开发一个新的层次结构式操作系统的项目，Multics的原有成员，加上Rudd Canady，都投入这个项目。肯·汤普逊发现要编写驱动程序来驱动文件系统，进行测试，并不容易，于是开发了一个壳层（shell）与一些驱动程序，做出一个操作系统的雏形。在团队合作下，Multics的许多功能都被采纳，重新实现，最终做出了一个分时多任务操作系统，成为第一版UNIX。

在1970年，那部PDP-7却只能支持两个用户，彼得·纽曼（Peter G. Neumann）戏称他们的系统其实是:“UNiplexed Information and Computing System”（单工操作系统），缩写为“UNICS”。于是这个项目被称为UnICS（Uniplexed Information and Computing System）。因为PDP-7的性能不佳，肯·汤普逊与丹尼斯·里奇决定把第一版UNIX移植到PDP-11/20的机器上，开发第二版UNIX。在性能提升后，真正可以提供多人同时使用，布莱恩·柯林汉提议将它的名称改为UNIX。

第一版UNIX是用PDP-7汇编语言编写的，一些应用是由叫做B语言的解释型语言和汇编语言混合编写的。在进行系统编程时不够强大，所以汤普逊和里奇对其进行了改造，并于1971年共同发明了C语言。

1973年汤普逊和里奇用C语言重写了Unix，形成第三版UNIX。

1974年，第一个伯克利的Unix系统被安装在PDP-11机器上，计算机科学系而后将其用作扩展研究。

1975年，UNIX发布了4、5、6三个版本。

1977年，伯克利的研究生Bill Joy将程序整理到磁带上，作为first Berkeley Software Distribution（1BSD）发行。1BSD被作为第六版Unix系列，而不是单独的操作系统。

1978年，发布Second Berkeley Software Distribution（2BSD）。伯克利安装了第一台VAX 计算机，但将Unix移植到VAX构架的UNIX/32V，并没有利用VAX 虚拟内存的能力。伯克利的学生重写了32V的大部分内核，以实现虚拟内存的支持。

1979年，版本7发布，这是最后一个广泛发布的研究型UNIX版本。同年，3BSD诞生了，这个新系统完整包括了一个新内核、从2BSD移植到VAX的工具，还有32V原来的工具

1980年10月，伯克利CSRG发布了4BSD，该版本对3BSD有许多改进。由于3BSD的成功，美国国防部高级研究规划署决定资助伯克利的Computer Systems Research Group（CSRG，计算机系统研究组），以开发一个Unix标准平台，以供DARPA未来的研究。

1981年6月，终于发布了4.1BSD。Bill Joy大幅度提高了4.1BSD 内核的性能，可以跟VMS在多个平台上媲美。为了避免与AT&T的UNIX System V（UNIX第五版）混淆，这个版本没有取名为5BSD。

1982年，AT&T基于版本7开发了UNIX System Ⅲ的第一个版本，这是一个Commercial Unix(商业版本)仅供出售。

1983年，为了解决混乱的UNIX版本情况，AT&T综合了其他大学和公司开发的各种UNIX，开发了UNIX System V Release 1。

1983年8月，4.2BSD正式发布。这是1982年Bill Joy离开前去创建Sun公司后的第一个版本。值得一提的是，这次BSD小恶魔正式出场，最初是Marshall Kirk McKusick的画作，出现在打印好的文档封面上

![]({{ site.url }}/images/post/os-BSD.jpg)

BSD小恶魔

1983年,Bill Joy创办Sun公司后，基于4.1BSD开发了SunOS 1.0，直至1994年11月，SunOS 4.1.4 基于BSD Unix设计，此后不再基于BSD Unix。

1989年6月，BSD Networking Release 1（**Net/1**）诞生了，没有AT&T授权也能使用，可遵照BSD许可证进行自由再发布。在此之前，所有的BSD版本混合了专属的AT&T UNIX代码，这样继续使用就需要从AT&T获得许可证。源码许可证当时非常地昂贵，几个其他组织对单独的网络代码版感兴趣，完全独立于AT&T，这样就可不受许可证的支配。

1989年9月18日,NeXT.Inc（乔布斯创办)发布NeXTSTEP 1.0，NeXTSTEP只能在NeXT电脑的Motorola 68000上运行。

20世纪80年代，UNIX相继发布的8、9、10版本，此後这个方向上的研究导致了PLAN 9的出现，这是一个新的分布式操作系统。

1990年初，推出了**4.3BSD-Reno**。该版本是4.4BSD早期开发的过渡版，使用该版本被戏称为是一种赌博（过渡版，你懂得），因为Reno就是内华达州的赌城雷诺。

1990年发布System V Release 4.0,UNIX Systems Laboratories和Sun联合进行的项目，它融合了来自Release 3，4.3BSD，Xenix，以及SunOS的技术。

1990年，Linus Torvalds决定编写一个自己的Minix内核，初名为Linus'Minix，意为Linus的Minix内核，后来改名为Linux。

1991年，一群BSD开发者（Donn Seeley、Mike Karels、Bill Jolitz 和 Trent Hein）离开了加州大学，创办了Berkeley Software Design, Inc (BSDI)。BSDI是第一家在便宜常见的Intel平台上提供全功能商业BSD UNIX的厂商。后来Bill Jolitz 离开了BSDI，开始了**386BSD**的工作，386BSD也叫做**JOLIX** ，是源自针对 Intel 80386的 UNIX。**386BSD**被认为是**FreeBSD**、**OpenBSD** 和 **NetBSD**的先辈。

1991年6月，**Net/2**诞生了，这是一个全新的操作系统，并且可以自由发布，不包含任何AT&T的代码，工具被替换下来，内核中AT&T的代码被剔除。Net/2成为Intel 80386构架上两种移植的主要组成，包括由William Jolitz负责的386BSD以及由BSDi负责的专属BSD/OS。386BSD本身虽然短命，但在不久之后成为了NetBSD和FreeBSD原始代码的基础。

1991年10月5日，Linus Torvalds首次发布**Linux**内核，再加上用户空间的应用程序之后，成为Linux操作系统。由于这些支持用户空间的系统工具和库主要由理查德·斯托曼于1983年发起的GNU计划提供，自由软件基金会提议将该组合系统命名为GNU/Linux，但Linux不属于GNU计划。

1992年,Bill Jolitz和他的妻子Lynne Jolitz基于4.3BSD Net/2开发了**386BSD**,发布第一版本。因为源代码中牵涉AT&T许可证问题，AT&T的UNIX Systems Laboratories（USL）附属公司对BSDi提起诉讼，这导致Net/2发布被中止，直到两年后其源码被鉴定为符合USL的版权。这两年的法律诉讼将BSD的后裔开发，特别是自由软件，延迟了两年，这导致没有法律问题的Linux内核获得了极大的支持。

1992年6月，**SunOS 5.0**开始发布，由于Sun与USL（归属于AT&T）的联合开发System V 4，SUN的操作系统开发开始转向System V 4，并且有了新的名字叫做**Solaris 2.0**。

1993年，**FreeBSD 1.0**发布，起源于386BSD 0.1。

1993年4月，**NetBSD**发布了第一个版本NetBSD 0.8。如同他的姊妹FreeBSD都是从加州柏克莱大学的4.3BSD via the Networking/2及386BSD为基础发展。因386BSD开发社区在操作系统开发的节奏与方向上的失败，该计划得以开始。NetBSD的四位发起人，Chris Demetriou、西奥·德·若特、Adam Glass以及Charles Hannum觉得开放的发展模式会有助于NetBSD项目的进行。他们的目的在于发展一套跨平台、高质量、以柏克莱软件包为基础的操作系统。由于网络对于共同发展的重要性，西奥·德·若特建议这个项目的名称叫做NetBSD，获取其他三位发起人的认同。NetBSD原始代码的版本库创建于1993年3月21日。

1993年以后，大多数商业UNIX发行商都基于**System V Release 4（SVR4）**开发自己的UNIX变体了，如**HP-UX**、**IBM-AIX**、**SGI-IRIX**。

1994年6月，4.4BSD以两种形式发布：可自由再发布的**4.4BSD-Lite**，不包含AT&T 源码；另有**4.4BSD-Encumbered**，跟以前的版本一样，遵照AT&T的许可证。

1994年12月，因为理念不合，西奥·德·若特被要求辞去NetBSD的开发工作，存取源代码的权限也遭到取消。

1995年1月，FreeBSD发布的2.0-RELEASE，因为386BSD源代码的合理性受到质疑以及Novell（当时UNIX的版权拥有者）与柏克利接连而来的诉讼，转而以柏克利加州大学的4.4BSD-Lite Release全面改写。


1995年10月，西奥·德·若特从NetBSD 1.0复刻了一个新项目，创立OpenBSD。初始版本OpenBSD 1.2于1996年7月发布，紧接着同年10月发布了OpenBSD 2.0。从那时起，该计划一直遵循每半年发布新版本的进度，并且为每个版本提供一年的维护和支持。

![]({{ site.url }}/images/post/os-OpenBSD.png)

1995年，伯克利发布最终版本**4.4BSD-Lite Release 2**，而后CSRG解散。

1995年，NeXTSTEP 3.3发布，平台也已经不限于Motorola 68000家族，亦可在IBM PC x86、Sun SPARC及HP PA-RISC等平台上运行。

1997年2月，Apple将NeXT买下，成为Mac OS X的基础。

1998年，Mac OS X首次推出，它是一套Unix基础的操作系统，包含两个主要的部份：核心名为Darwin，是以FreeBSD源代码和Mach微核心为基础，由苹果公司和独立开发者社区协力开发；及一个由苹果电脑开发，名为Aqua之专有版权的图形用户接口。

2000年，苹果公司将**Darwin**的内核发布给开放源代码社区，Darwin是一种类Unix操作系统，集成数种的技术，包含开放源代码的XNU核心，一种以微核心为基础的核心架构来实现Mach kernel。操作系统的服务和userland工具是以4.4BSD（伯克利软件套件的UNIX），特别是FreeBSD和NetBSD为基础。


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

