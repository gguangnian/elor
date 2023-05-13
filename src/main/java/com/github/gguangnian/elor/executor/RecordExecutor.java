package com.github.gguangnian.elor.executor;

public interface RecordExecutor {

    /**
     * 设置变量
     *
     * @param name
     * @param variable
     */
    void setVariable(String name, Object variable);

    /**
     * 解析表达式
     *
     * @param expressionString
     * @return
     */
    String parseExpression(String expressionString);


}
