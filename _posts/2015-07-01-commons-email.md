---
layout: post
title: commons-email给你的网站添加邮件发送功能
---
<img src="{{ site.url }}/images/post/commons-email.jpg" class="excerpt">
我的网站上线试运行，很多数据或者通知都需要邮件发送，还有就是用户的注册邮箱真实激活验证也用到了发送邮件功能。所以就一起把发送邮件的报告写了吧，希望大家也能参考下。

<!-- ## -->
![]({{ site.url }}/images/post/commons-email.jpg)

首先java环境下开发发送邮件的功能，大家一定会想到javaMail，好吧，我也是第一个先想到这个，不过我我觉得apache下貌似也有mail的jar包支持，
所以就去<www.apache.org>下查找了一下，果然有个强大的`commons-email`，官方地址：<http://commons.apache.org/proper/commons-email/>。

我也是摸索的去查阅资料开发，SO，先去看看官网说明：

***这个`commons-email.jar`包旨在提供一个发送email的接口，它是基于Java Mail API之上封装的，目的为了使用更简单。***

提供了以下几个类开发不同的邮件类型：

* SimpleEmail - 开发简单的文本邮件。
* MultiPartEmail - 开发带附件的邮件。
* HtmlEmail - 开发HTML网页格式的邮件，它具有全部的MutiPartEmail的特性，同时还能嵌入图像。
* ImageHtmlEmail - 这是用于发送内嵌图像的HTML格式的邮件，它具有所有的HtmlEmail的特性，但是转换所有的图像到正文里面。
* EmailAttachment - 这是一个附件容器类，主要和MultiPartEmail和HtmlEmail的实例一起使用。


##先准备需要的环境
------------------------------------
commons-email 1.4,
【[下载](http://mirrors.cnnic.cn/apache//commons/email/binaries/commons-email-1.4-bin.zip)】

JDK需要 1.5+,
【[访问](http://www.oracle.com/technetwork/java/javase/downloads/index.html)】

JavaMail 1.5.4,注意JavaMail需要JAF支持，最低版本1.0.2，推荐用最新版JAF，JAF1.1被包含在JDK1.6，JAR1.1.1被包含在JDK1.60_10+,
所以如果用的JDK低于1.6那么需要单独下载JAF（自己google吧），其他情况不用下载，只管用就可以了，我的JDK1.7就不用再单独下载JAF了。
【[下载](http://java.net/projects/javamail/downloads/download/javax.mail.jar)】


***Demo：【[Main.java](https://github.com/shaozilee/shaozilee.github.io/tree/master/test/commons-email/Main.java)】***

##发送一个简单文本的邮件
```java
    private static void sendSimpleEmail() throws EmailException {
        Date date = new Date();
        Email email = new SimpleEmail();
        init(email);
        //发送给谁
        email.addTo("shaozilee@gmail.com");
        //邮件标题
        email.setSubject("this is SimpleEmail");
        //邮件正文
        email.setMsg("Welcome to shaozilee.com!");
        email.send();

        System.out.println("sendSimpleEmal成功!"+(new Date().getTime()-date.getTime()));
    }

```

***console：sendSimpleEmal成功!1331***

1331为发布成功所消耗的时长单位毫秒，本次测试为阿里云企业邮箱SMTP测试，之前测试过hotmail的SMTP的TLS通道发送，耗时达到20秒以上

![]({{ site.url }}/images/post/commons-email-simple.jpg)


##发送一个带附件的邮件
```java
    private static void sendMultiPartEmail() throws EmailException {
        Date date = new Date();
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("logo.gif");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("the logo of shaozilee.com");
        attachment.setName("logo.gif");

        MultiPartEmail email = new MultiPartEmail();
        init(email);
        email.addTo("shaozilee@gmail.com");
        email.setSubject("this is MultiPartEmail");
        email.setMsg("Welcome to shaozilee.com!");
        email.attach(attachment);
        email.send();

        System.out.println("sendMultiPartEmail成功!"+(new Date().getTime()-date.getTime()));
    }


```
***console：sendMultiPartEmail成功!671***

![]({{ site.url }}/images/post/commons-email-multi.jpg)

##发送一个HTML格式的邮件
```java

    private static void sendHtmlEmail() throws EmailException, MalformedURLException {
        Date date = new Date();
        HtmlEmail email = new HtmlEmail();
        init(email);
        String cid = email.embed(new URL("http://www.shaozilee.com/images/logo.gif"), "shaozilee logo");
        email.setHtmlMsg("<html>The shaozilee logo - <img src=\"cid:" + cid + "\"></html>");
        email.setTextMsg("Welcome to shaozilee.com!");
        email.addTo("shaozilee@gmail.com");
        email.setSubject("this is HtmlEmail");
        email.send();

        System.out.println("sendHtmlEmail成功!"+(new Date().getTime()-date.getTime()));
    }


```
***console：sendHtmlEmail成功!1188***

![]({{ site.url }}/images/post/commons-email-html.jpg)

##发送一个内嵌图片的HTML邮件
```java

    private static void sendImageHtmlEmail() throws EmailException, MalformedURLException {
        Date date = new Date();
        String htmlEmailTemplate = "<html>welcome to <a href=\"http://www.shaozilee.com\">shaozilee.com</a> - <img src=\"http://www.shaozilee.com/images/logo.gif\"> </html>";

        ImageHtmlEmail email = new ImageHtmlEmail();
        init(email);
        email.setDataSourceResolver(new DataSourceUrlResolver(new URL("http://www.shaozilee.com")));
        email.addTo("shaozilee@gmail.com");
        email.setSubject("this is ImageHtmlEmail");
        email.setMsg("Welcome to shaozilee.com!");
        email.setHtmlMsg(htmlEmailTemplate);
        email.setTextMsg("Your email client does not support HTML messages");
        email.send();

        System.out.println("sendImageHtmlEmail成功!"+(new Date().getTime()-date.getTime()));
    }

```
***console：sendImageHtmlEmail成功!1633***

![]({{ site.url }}/images/post/commons-email-image.jpg)

##需要特别注意
在Main.java中的init方法里面，设置端口要根据SMTP服务器提供的可用端口，25一般为STARTTLS加密通道端口，465为SSL/TLS，
也有其他的邮箱服务提供其他端口如hotmail TLS用的587端口。如果采用ssl安全加密通道发送，
需要调用`email.setStartTLSRequired(true);`强制开启SSL/TLS加密发送。



---
##参考资料

<http://commons.apache.org/proper/commons-email/>

<http://java.net/projects/javamail>



