package org.apache.dubbo.samples.action;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.samples.api.SimpleMathService;

/**
 * @author wade
 * @date 2022/09/09 09:24
 **/
@DubboService(version = "1.0.0")
public class SimpleMathServiceImpl implements SimpleMathService {
    @Override
    public int add(int a, int b) {
        return 0;
    }
}
