package com.kuang.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
       Student student = new Student();
        student.setData("郑贵阳");
        student.getResult();
        
        Graduate gra=new Graduate();
        //创建子类对象时候会默认调用父类的无参构造方法根本就没有给父类的学生属性赋值和上面的学生对象不是同一个对象
        gra.cook();
        gra.setData("计算机应用");
        gra.getResult();

        List<String> list = Arrays.asList("哈哈");
        for (int i = 0; i < list.size(); i++) {


        }

        list.forEach(s -> {
            if (s != null) {

            }
            System.out.println(s);
        });
        list.stream().map(String::getBytes).collect(Collectors.toList());
        for (String s : list) {

        }
        list.stream().filter(s -> "1".equals(s)).collect(Collectors.toList());
    }




}
class Student{
    String name;
    Score s=new Score();

    public Student() {
       /* this.name = "郑贵阳";
        System.out.println("调用的是无参构造");*/
    }

    public void setData(String name) {
        this.name = name;
    }

    public void getResult(){
        System.out.println("姓名："+name+" 成绩："+s.grade);
    }
}
interface Cooking{
    void cook();
}
class Graduate extends Student implements Cooking{
    public void cook(){
        System.out.println(super.name+"厨艺很好！");
    }
    String major;
    public void setData(String major){
        this.major=major;
    }
    public void getResult(){
        System.out.println("姓名："+super.name+" 科目："+s.course
                +" 成绩："+s.grade+" 研究方向:"+major);
    }
}
class Score{
    String course="面向对象成绩设计";
    int grade=90;
}