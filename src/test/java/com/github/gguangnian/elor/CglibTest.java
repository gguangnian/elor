package com.github.gguangnian.elor;

import com.github.gguangnian.elor.support.EvaluationVariable;
import org.springframework.cglib.proxy.InterfaceMaker;

public class CglibTest {
    public static void main(String[] args) {
        InterfaceMaker interfaceMaker =new InterfaceMaker();
        //抽取某个类的方法生成接口方法
        interfaceMaker.add(EvaluationVariable.class);
        Class<?> targetInterface=interfaceMaker.create();
    }
}
