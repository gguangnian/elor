package com.github.gguangnian.elor.demo;

import com.github.gguangnian.elor.Configuration;
import com.github.gguangnian.elor.executor.RecordExecutor;

public class TestMain {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        RecordExecutor recordExecutor = configuration.newRecordExecutor();
        recordExecutor.setVariable("var", "var");
        System.out.println(recordExecutor.parseExpression("aaa#{#var}ccc"));
    }
}
