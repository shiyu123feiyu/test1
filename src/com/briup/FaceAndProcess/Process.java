package com.briup.FaceAndProcess;

/**
 * @Author: king
 * @Date: 2022/7/27 11:24
 * @Description:
 */
/**
 * 面向过程
 *
 * 1）注重解决问题的过程，一般采取自顶向下的设计方法； 2）数据和数据之上的操作（处理）分离； 3）程序的基本单元为函数。
 */
public class Process {
    public static double area(double a,double b,double c){
        double p=(a+b+c)/2;
        double ret=0.0;
        ret = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return ret;
    }
    public static void main(String[] args) {
        double x=3.0;
        double y=4.0;
        double z=5.0;
        double s = area(x,y,z);
        System.out.println("a=3,b=4,c=5的三角形面积为:"+s);
    }
}




