package ex01;

/**
 * @Author : zs.sun
 * @Date : 2018/7/31 20:27
 * @Package : ex01
 * @ProjectName: learnjava
 * @Description:
 */

import java.io.*;
public class Ex01{
    public static void main(String[] args) throws IOException
    {
        //创建可容纳 1000 个字符的数组
        char a[]=new char[1000];

//        String root = System.getProperty("user.dir");
//        String abcPath = root + File.separator + "file" + File.separator + "abc.txt";
//        System.out.println(abcPath);



//        // 方法1：通过绝对路径读取文件
      //FileReader b = new FileReader("D:\\code\\mycode\\javase\\io-test\\src\\main\\resources\\ex01.txt");

        // 方法2：通过相对路径读取文件
        FileReader b = new FileReader("io-test/src/main/resources/ex01.txt");


        //将数据读入到数组 a 中，并返回字符数
        int num=b.read(a);

        //将字符串数组转换成字符串
        String str=new String(a,0,num);
        System.out.println("读取的字符个数为："+num+",内容为：\n");
        System.out.println(str);
    }
}
