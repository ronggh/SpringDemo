package annotation.config;

import annotation.bean.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 表示用这个类作为Spring的配置类，代替xml配置文件
 */
@Configuration
// 配置组件扫描
@ComponentScan(basePackages = {"annotation"},
//        excludeFilters = {
//            @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class})
//        },
        includeFilters = {
            @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        })
public class SpringConfigComponentScan {

}
