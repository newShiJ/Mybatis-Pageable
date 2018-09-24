package learnspringboot.mybatis.page;

import org.springframework.stereotype.Component;

/**
 * @author chenmingming
 * @date 2018/9/23
 */
@Component
public class MysqlDialect implements Dialect {

    private static final String PATTERN = "%s limit %s, %s";

    private static final String PATTERN_FIRST = "%s limit %s";

    @Override
    public String getLimitSql(String targetSql, int offset, int limit) {
        if (offset == 0) {
            return String.format(PATTERN_FIRST, targetSql, limit);
        }

        return String.format(PATTERN, targetSql, offset, limit);
    }
}
