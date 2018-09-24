package learnspringboot.mybatis.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author chenmingming
 * @date 2018/9/23
 */
@Intercepts({
        @Signature(
                type = Executor.class,
                method = "update", args = {MappedStatement.class, Object.class}
        )
})
@Component
public class MyIntertceptor implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("进入拦截器");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }
}
