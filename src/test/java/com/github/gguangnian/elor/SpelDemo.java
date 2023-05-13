package com.github.gguangnian.elor;

import com.github.gguangnian.elor.demo.SimpleEvaluationMethodVariable;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class SpelDemo {
    public static void main(String[] args) {
        //1可重用线程安全
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();

        //2获取 expressionString
        //3创建Expression


        //expression可重用但线程不安全
        Expression expression = spelExpressionParser.parseExpression("aaa#{#abc.apply(#val)}ccc", new TemplateParserContext());

        //4获取Variable  或自定义方法
        //45没有顺序
        //5创建EvaluationContext

        //6设置Variable rootObj

        //设置值
        EvaluationContext evaluationContext = SimpleEvaluationContext.forReadOnlyDataBinding().withInstanceMethods().build();
        SimpleEvaluationMethodVariable simpleEvaluationMethodVariable = new SimpleEvaluationMethodVariable();
        evaluationContext.setVariable("val", " val ");
        evaluationContext.setVariable(simpleEvaluationMethodVariable.variableName(), simpleEvaluationMethodVariable);
        // 7解析

        //执行
        System.out.println(expression.getValue(evaluationContext));

        //8持节策略
        //9清理

    }
}
