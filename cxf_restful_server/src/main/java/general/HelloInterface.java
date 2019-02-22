package general;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 17:00
 * description:
 * @WebService，@WebMethod，@WebResult，@WebParam 等注解可放在接口上也可放在实现类上
 * 放在实现类上比较灵活,可以在不同的业务实现类上指定不同的方法名、返回结果名称及参数名称等
 **/
@WebService
public interface HelloInterface {
    @WebMethod
    @WebResult(name = "wsResult")
    String sayHello(@WebParam(name = "name") String name);
}

