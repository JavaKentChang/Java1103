
package com.ocp13;

import com.github.javafaker.Faker;
//參考project files pom.xml 加入
// <dependencies>
//        <dependency>
//            <groupId>com.github.javafaker</groupId>
//            <artifactId>javafaker</artifactId>
//            <version>0.12</version>
//        </dependency>
//    </dependencies>



import java.util.Random;
import org.omg.IOP.ExceptionDetailMessage;

//全球最大的JAVA API 中心
//https://mvnrepository.com/

public class Exam implements Comparable<Exam>{
    private String name; // 姓名
    private int chinese; //國文成績
    private int english; //英文成績
    private int math;    //數學成績
    private boolean sex;    //男:True;女:fales

    public Exam() {
        Faker faker = new Faker();
        Random r = new Random();
        name = faker.name().lastName();   
        chinese = r.nextInt(100) + 1;
        english = r.nextInt(100) + 1;
        math = r.nextInt(100) + 1;
        sex = r.nextInt(2) == 0 ? true : false; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Exam{" + "name=" + name + ", chinese=" + chinese + ", english=" + english + ", math=" + math + ", sex=" + sex + '}';
    }

    @Override
    public int compareTo(Exam o) {
        //總分由大到小比
        int sum = chinese+english+math;
        int sum2 = o.chinese+o.english+o.math;
        return sum2 - sum;
        
        //return chinese - o.chinese;//o.chinese 為要比較的元素 20,10,30 如20-10>0 結果為由小到大
        //return o.chinese-chinese ; 結果為由大到小
    }
    
}
