package com.github.gguangnian.elor;

import com.github.gguangnian.elor.support.EvaluationVariable;
import com.github.gguangnian.elor.template.RecordTemplate;
import com.github.gguangnian.elor.template.RecordTemplateFactory;
import com.github.gguangnian.elor.template.defaults.DefaultRecordTemplateFactory;
import org.junit.Test;

public class SpelDemo {
    @Test
    public void test() {
        EvaluationVariable evaluationVariable = new EvaluationVariable() {
            @Override
            public String variableName() {
                return "dddccc";
            }

            @Override
            public String apply(String value) {
                System.out.println(value);
                return "abc";
            }
        };

        Configuration configuration = new Configuration();
        RecordTemplateFactory recordTemplateFactory = new DefaultRecordTemplateFactory(configuration);
        RecordTemplate recordTemple = recordTemplateFactory.getRecordTemple();
        recordTemple.setVariable("var", "var");
        recordTemple.setVariable(evaluationVariable.variableName(), evaluationVariable);
        System.out.println(recordTemple.parseTemplate("aaa#{#dddccc.apply(#var)}zzz"));

        RecordTemplate recordTemple1 = recordTemplateFactory.getRecordTemple(true);
        recordTemple1.setVariable("var", "var");
        System.out.println(recordTemple1.parseTemplate("aaa#{#var}zzz"));
    }
}
