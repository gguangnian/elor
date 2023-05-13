package com.github.gguangnian.elor.template;

public interface RecordTemplate {

    /**
     * 设置变量
     *
     * @param name
     * @param variable
     */
    void setVariable(String name, Object variable);

    String parseTemplate(String expressionString);
}
