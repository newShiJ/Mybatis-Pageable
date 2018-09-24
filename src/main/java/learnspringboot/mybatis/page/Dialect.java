package learnspringboot.mybatis.page;

/**
 * @author chenmingming
 * @date 2018/9/23
 */
public interface Dialect {

    /**
     * 获取countSQL语句
     * @param targetSql
     * @return
     */
    default String getCountSql(String targetSql){
        return String.format("select count(1) from (%s) tmp_count",targetSql);
    }

    String getLimitSql(String targetSql, int offset, int limit);
}
