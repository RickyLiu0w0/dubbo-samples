package org.apache.dubbo.samples.configcenter.api.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.samples.configcenter.api.api.DemoService;
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "Hello, you!";
    }

}

