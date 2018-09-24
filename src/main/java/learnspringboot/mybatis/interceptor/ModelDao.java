package learnspringboot.mybatis.interceptor;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author chenmingming
 * @date 2018/9/21
 */
@Mapper
public interface ModelDao {
    void save(Model model);

    Model findByKey(String id);

    List<Model> findAll();

}
