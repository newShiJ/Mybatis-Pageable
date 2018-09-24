package learnspringboot.mybatis.interceptor;

import org.apache.ibatis.plugin.InterceptorChain;
import org.apache.ibatis.session.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

/**
 * @author chenmingming
 * @date 2018/9/23
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {

//    @Autowired
//    private Configuration configuration;
//
//    @PostConstruct
//    public void Configuration(){
//        configuration.addInterceptor(new MyIntertceptor());
//    }
}
