# Mybatis-Pageable

这是我利用 Mybatis 拦截器实现的一个简易的分页工具，供大家学习参考

使用方式很简单mapper.xml 配置文件不需要修改

```xml
<select id="findAll" resultType="learnspringboot.mybatis.interceptor.Model">
	SELECT * FROM cmy_interface
</select>
```

在调用时与PageHelper类似

```java
@GetMapping("/all")
public Object all(){
    PageInterceptor.startPage(1,2);
    List<Model> all = dao.findAll();
    PageResult<Model> modelPageResult = new PageResult<>(all);
    return modelPageResult;
}
```

我的项目中是默认使用MySQL数据库方言，若有兴趣扩展可以实现 `Dialect` 接口把 `MysqlDialect` 类上的 `@Component` 注解注释，在自定义的 `Dialect`上加上即可

调用结果

```js
{  
   total:3,
   data:-   [  
      -      {  
         id:"2",
         name:null,
         code:"123"
      }
   ]
}
```

最后特此感谢[https://github.com/buzheng/mybatis-pageable](https://github.com/buzheng/mybatis-pageable)。这里代码中拦截器的代码逻辑相当一部分是参考这个仓库的代码，特此感谢。