---
layout: post
title: Markdown标记语法规则Demo
---
<img src="{{ site.url }}/images/post/markdown-rule.jpg" class="excerpt">
此文只是用来测试Markdown语法规则以及各标记对应的显示效果，目前只有常用写作标签Demo，对于一些不怎么常用的后续慢慢补充，如果你对Markdown的写作有更多的心得或者经验，请留言或者发e-mail给我，甚是感激。

<!-- ## -->

##段落和换行
------------------------------------
```
关于段落：输入一段文字然后回车2次换行，保证两个段落间有一个空行即可，如下编码：
```
![]({{ site.url }}/images/post/markdown-rule-p.jpg)

展示效果:

XXXXXXXXX第一段XXXXXXXXXXXXXX
XXXXXXXXX第一段XXXXXXXXXXXXXX

XXXXXXXXX第二段XXXXXXXXXXXXXX
XXXXXXXXX第二段XXXXXXXXXXXXXX

```
关于换行：输入一段文字然后再要换行的位置，输入至少两个空格即可换行，如下图中红线处点代表空格：
```
![]({{ site.url }}/images/post/markdown-rule-br.jpg)

XXXXXXXXX第一段XXXXXXXXXXXXXX  
XXXXXXXXX第一段XXXXXXXXXXXXXX

XXXXXXXXX第二段XXXXXXXXXXXXXX
XXXXXXXXX第二段XXXXXXXXXXXXXX

   

   
##标题
------------------------------------
标题独占一行，不可用多空格换行，一共6级标题：

```
#H1
##H2
###H3
####H4
#####H5
######H6

```
#H1
##H2
###H3
####H4
#####H5
######H6


##列表
------------------------------------
Markdown 支持有序列表和无序列表。无序列表使用星号、加号或是减号作为列表标记。
###无序列表：

```
* aaaaaa
* bbbbbb
* cccccc
```
* aaaaaa
* bbbbbb
* cccccc


###有序列表:

```
1. aaaaaa
2. bbbbbb
2. cccccc
```
1. aaaaaa
2. bbbbbb
2. cccccc

PS:\*与后面的aaaaa之间是有空格的，1.与后面的aaaaaa也有空格，**不可缺少!**


##代码
------------------------------------

###整块代码：
```
	```js
		var a=1;
		if(a>0){
			console.log("XXOO");
		}
	```
```

```js
	var a=1;
	if(a>0){
		console.log("XXOO");
	}
```
###行内代码：

```
这一行是为了表示行内代码`console.log("XXOO")`的一个demo

```
这一行是为了表示行内代码`console.log("XXOO")`的一个demo

PS: `` ` ``这个符号，得在英文输入法下，按ESC下面 1左边的那个键，才能打出来。


##分隔线
------------------------------------
```
	---
```
---
上面这条就是demo显示的线，由至少三个`-`才能表示一条直线。可以通过修改hr的border来改变hr边框的显示效果


##超链接
------------------------------------
Markdown 支持两种形式的链接语法： 行内式和参考式两种形式。
###行内式：
```
	跳转到：[shaozilee实验室](http://www.shaozilee.com/)  
	关于我：[shaozilee](/contact.html)
```
跳转到：[shaozilee实验室](http://www.shaozilee.com/)  
关于我：[shaozilee](/contact.html)
###参考式：
```
	跳转到：[shaozilee实验室][1]  
	关于我：[shaozilee][2]
	[1]: http://www.shaozilee.com/
	[2]: /contact.html
```
跳转到：[shaozilee实验室][1]  
关于我：[shaozilee][2]

[1]: http://www.shaozilee.com/
[2]: /contact.html
###隐式链接：
指没有具体连接的文字，直接以连接地址作为显示文字
```
<http://www.shaozilee.com/>
```
显示效果：
<http://www.shaozilee.com/>



##强调
------------------------------------
###单符号代表斜体:
```
*single asterisks*   
_single underscores_

```

*single asterisks*   
_single underscores_

###双符号代表粗体:
```
**double asterisks**   
__double underscores__
```

**double asterisks**   
__double underscores__



##图片
------------------------------------
语法和链接很相似,同样也允许两种样式： 行内式和参考式。   
###行内式：
```
	![图片不存在时的提示文字](/images/post/markdown-rule-img.gif)
```
![图片不存在时的提示文字](/images/post/markdown-rule-img.gif)   

###参考式：
```
	![图片不存在时的提示文字][img1]
	[img1]: /images/post/markdown-rule-img.gif
```
![图片不存在时的提示文字][img1]
[img1]: /images/post/markdown-rule-img.gif

PS：利用Markdown的图片插入规则不能调整图片显示的宽度和高度，如果需要可以采用``<img src=xxxx>``标记显示


##引用
------------------------------------
在html中为blockquote标记，用以展示内容层级关系，引用层级间**要有空行**

```
> This is the first level of quoting.

>> This is nested blockquote.

>>> This is three level

> Back to the first level.

```

> This is the first level of quoting.

>> This is nested blockquote.

>>> This is three level

> Back to the first level.

PS：此处左边的绿色条是我自定义blockquote>p的左边框样式，默认只有引用层级，没有任何区分效果。

##特殊符号
---
用"\"来转义，表示文本中的markdown符号

`下面这句话包含\*字符`   
下面这句话包含\*字符











