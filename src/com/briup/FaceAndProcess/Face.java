package com.briup.FaceAndProcess;
/**
 * @Author: king
 * @Date: 2022/7/27 11:24
 * @Description:
 */
/**
 * 面向对象例子，以及验证子父类关系，子类多有的方法
 */
public class Face {
    public static void main(String[] args) {
        Penson  p =new Teacher();
        p.show();

        if( p instanceof Teacher){
            System.out.println(true);
        }else {
            Teacher t = (Teacher) p;
            t.play();
        }
    }
}

class Penson{
    void show(){
        System.out.println("父类");
    }
}

class Teacher extends Penson{
    private int id;
    private String name;
    @Override
    void show(){
        System.out.println("面向对象例子，重写父类方法");
    }
    void play(){
        System.out.println("子类独有的方法，玩游戏");
    }
}





