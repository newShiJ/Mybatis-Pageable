package learnspringboot.mybatis.interceptor;

import learnspringboot.mybatis.page.PageInterceptor;
import learnspringboot.mybatis.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenmingming
 * @date 2018/9/21
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ModelDao dao;

    @GetMapping("/save")
    public Object save(){
        Model model = new Model();
        dao.save(model);
        return true;
    }

    @GetMapping("/all")
    public Object all(){
        PageInterceptor.startPage(1,2);
        List<Model> all = dao.findAll();
        PageResult<Model> modelPageResult = new PageResult<>(all);
        return modelPageResult;
    }
}
