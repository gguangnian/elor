package com.github.gguangnian.elor.template.defaults;

import com.github.gguangnian.elor.Configuration;
import com.github.gguangnian.elor.executor.SafetyRecordExecutor;
import com.github.gguangnian.elor.executor.StandardRecordExecutor;
import com.github.gguangnian.elor.template.RecordTemplate;
import com.github.gguangnian.elor.template.RecordTemplateFactory;

public class DefaultRecordTemplateFactory implements RecordTemplateFactory {

    private Configuration configuration;

    @Override
    public RecordTemplate getRecordTemple(boolean standard) {
        return new DefaultRecordTemplate(standard ? new StandardRecordExecutor(configuration) : new SafetyRecordExecutor(configuration));
    }

    @Override
    public RecordTemplate getRecordTemple() {
        return getRecordTemple(false);
    }

    public DefaultRecordTemplateFactory(Configuration configuration) {
        this.configuration = configuration;
    }
}
