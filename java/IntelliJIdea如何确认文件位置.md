# IntelliJ Idea如何确认文件位置

## 背景描述

写一些Java IO的时候，涉及到文件位置的读取。当然，可以选择用绝对位置进行读取，但是这样代码的可移植性立马下降。一直谷歌怎么找相对路径，试了所谓的`类的绝对路径`，`CLASSPATH`文件路径，效果都不是很好。

最后在stackoverflow上面找到完美解决。

## 详细设置

先看一下项目结构，代码片段，以及Run/Debug Configurations.

### 项目结构

![项目结构](https://github.com/JosanSun/CtripTechExch/blob/master/pic/josan/java-filepath01.png)

### 代码

```
        // 方法2：通过相对路径读取文件
        FileReader b = new FileReader("io-test/src/main/resources/ex01.txt");
```

### Run/Debug Configurations

![工作目录](https://github.com/JosanSun/CtripTechExch/blob/master/pic/josan/java-settings01.png)

### 【重要】说明
可以看到，相对路径是以`Working directory`为基准。
  
## 测试代码

[点击此处](https://github.com/JosanSun/CtripTechExch/blob/master/code/josan/javase)

## 参考链接

1. [Reading files with Intellij idea IDE](https://stackoverflow.com/questions/26949985/reading-files-with-intellij-idea-ide)
