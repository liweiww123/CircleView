# CircleView
Circle Demo for me

可以将图片圆形显示的View，实现方式很简单，做这个控件就是为了可以直接方便的显示圆形图片，在显示的时候，提供了更多的选择，比如下面讲到的偏移显示。

## 使用方法

在`build.gradle`文件中加上这句：

`ompile 'com.github.youngkaaa:circleview:0.1.0'`



使用方法很简单就是在布局文件中声明它就行了，比如这样：

```
<com.example.youngkaaa.ycircleview.CircleView
            android:layout_width="230dp"
            android:layout_height="230dp"
            app:imgSrc="@drawable/jay_jay"/>
```

其中`imgSrc`属性就是给该控件设置图片资源,然后显示出来就是下面这样：

![](https://github.com/youngkaaa/CircleView/blob/master/app/pics/circle1.png)

该控件会自动把你的图片的宽度（或者高度，这个要看长度和宽度哪个小，就以那个为准，这个下面讲）缩小为控件的宽度（或者高度）一样，这样做是为了保证图片的最大化显示，而不会出现当控件变小时，显示的只是图片的很小一部分这种情况！上面的图应该可以看出来。

然后，我换了张图片来测试上面的图片最大化显示，然后就出现了下面这样的情况：

![](https://github.com/youngkaaa/CircleView/blob/master/app/pics/circle2.png)

我去，这什么鬼呀？我伦正脸呢？我要看他帅气的正脸啊，唉呀好尴尬。。

然后，我加了两个属性，解决了，毕竟我还是想看我伦正脸的啊！！！

*  leftPadding : 类似于Android中的`paddingLeft`属性（为了区别开），该属性含义下面讲
*  topPadding: 类比上面的

然后上面那两个属性的含义看下面这张图：

![](https://github.com/youngkaaa/CircleView/blob/master/app/pics/circle_guide.png)

上面图画出了两种常见的情况，第一种就是图片宽度大于高度，此时你可以设置`leftPadding`来将`Circle`往右移动，注意此时你不能设置`topPadding`的，因为此时图片的高度已经缩放为和`Circle`的高度一样了，没办法往下`padding`了，此时如果你失误设置了`topPadding`，这时就会抛出一个`IllegalArgumentException`，内容为`you can't set topPadding when img's width>height`而当你设置`leftPadding`过大时，以至于显示的`Circle`边缘超过了图片右边缘，此时同样会抛出一个`IllegalArgumentException`，内容为：`leftPadding is too large`。
而上面图中第二种情况就是高度大于宽度，和上面的同理可以类比。
由上图我们也可以看出来，`Circle`的宽度（因为是正圆，所以高度宽度一样大）要不就是和图片的宽度一样，或者`Circle`的高度和图片的高度一样。这样就是内部缩放图片的结果。所以`leftPadding`和`topPadding`两者同时只能使用一个！

然后看一下我们给其中一个`CircleView`设置`leftPadding`属性，让我伦的正脸显示出来，部分布局代码如下：

```
 <com.example.youngkaaa.ycircleview.CircleView
            android:layout_width="230dp"
            android:layout_height="230dp"
            app:leftPadding="160dp"
            app:imgSrc="@drawable/jay_jay"/>
```

然后运行图如下：

![](https://github.com/youngkaaa/CircleView/blob/master/app/pics/circle3.png)

看吧，我伦的正脸可以看到了吧。

### 继续更新

这次加入旋转功能，即有时候你会遇到当你使用圆形显示了图片后由于原图片中有些场景是倾斜的，导致显示出来的圆形中的图案不是很端正的，你就想着可不可以旋转一下显示。这次加入`rotation`属性。
使用方法很简单，就像下面这样：

```
<com.example.youngkaaa.ycircleview.CircleView
            android:layout_width="230dp"
            android:layout_height="230dp"
            app:rotation="180"
            app:imgSrc="@drawable/jay_back"/>
```

即旋转180度（方向默认为顺时针），然后可以了，该属性可以搭配上面的`leftPadding`和`topPadding`属性一起使用，即可以同时偏移并且旋转。
下面贴一张效果图：

![](https://github.com/youngkaaa/CircleView/blob/master/app/pics/circle_rotation.png)

然而在我调试完成这个属性后，我发现系统中原本就自带了该属性：`android:rotation`,哎呀丢死个人。。

## 写在最后

以后如果有其它好的属性，我会加入到本项目中的。

欢迎大神提意见，你有任何好的pr都欢迎！

如果该项目对你有用的话，给个star以示鼓励吧！你也可以顺便围观一下我的其他项目谢谢！
