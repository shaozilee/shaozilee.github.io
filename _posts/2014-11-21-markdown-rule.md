---
layout: post
title: Markdown标记语法规则Demo
---
![]({{ site.url }}/images/post/markdown-rule.jpg)
此文只是用来测试Markdown语法规则以及各标记对应的显示效果，目前只有常用写作标签Demo，对于一些不怎么常用的后续慢慢补充，如果你对Markdown的写作有更多的心得或者经验，请留言或者发e-mail给我，甚是感激。
<!-- ## -->


##段落和换行
```c
	if(i>0){
		console.log("markdown");
	}
```

##标题
-----------------

# 这是 H1 #

## 这是 H2 ##

### 这是 H3 ######

> This is a blockquote with two paragraphs. Lorem ipsum dolor sit amet,
> consectetuer adipiscing elit. Aliquam hendrerit mi posuere lectus.
> Vestibulum enim wisi, viverra nec, fringilla in, laoreet vitae, risus.
> 
> Donec sit amet nisl. Aliquam semper ipsum sit amet velit. Suspendisse
> id sem consectetuer libero luctus adipiscing.


> This is a blockquote with two paragraphs. Lorem ipsum dolor sit amet,
consectetuer adipiscing elit. Aliquam hendrerit mi posuere lectus.
Vestibulum enim wisi, viverra nec, fringilla in, laoreet vitae, risus.



> This is the first level of quoting.
>
> > This is nested blockquote.
>
> Back to the first level.



> ## 这是一个标题。
> 
> 1.   这是第一行列表项。
> 2.   这是第二行列表项。
> 
> 给出一些例子代码：
> 
>     return shell_exec("echo $input | $markdown_script");



*   Red
*   Green
*   Blue

+   Red
+   Green
+   Blue


1.  Bird
2.  McHale
3.  Parish


*   Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
    Aliquam hendrerit mi posuere lectus. Vestibulum enim wisi,
    viverra nec, fringilla in, laoreet vitae, risus.
*   Donec sit amet nisl. Aliquam semper ipsum sit amet velit.
    Suspendisse id sem consectetuer libero luctus adipiscing.


*   Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
Aliquam hendrerit mi posuere lectus. Vestibulum enim wisi,
viverra nec, fringilla in, laoreet vitae, risus.
*   Donec sit amet nisl. Aliquam semper ipsum sit amet velit.
Suspendisse id sem consectetuer libero luctus adipiscing.



1.  This is a list item with two paragraphs. Lorem ipsum dolor
    sit amet, consectetuer adipiscing elit. Aliquam hendrerit
    mi posuere lectus.

    Vestibulum enim wisi, viverra nec, fringilla in, laoreet
    vitae, risus. Donec sit amet nisl. Aliquam semper ipsum
    sit amet velit.

2.  Suspendisse id sem consectetuer libero luctus adipiscing.


* * *

***

*****

- - -

---------------------------------------


I get 10 times more traffic from [Google] [1] than from
[Yahoo] [2] or [MSN] [3].

  [1]: http://google.com/        "Google"
  [2]: http://search.yahoo.com/  "Yahoo Search"
  [3]: http://search.msn.com/    "MSN Search"



*single asterisks*

_single underscores_

**double asterisks**

__double underscores__


Use the `printf()` function.

``There is a literal backtick (`) here.``

A single backtick in a code span: `` ` ``

A backtick-delimited string in a code span: `` `foo` ``