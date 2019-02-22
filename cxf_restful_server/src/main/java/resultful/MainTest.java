package resultful;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 15:38
 * description:
 **/
public class MainTest {
    /**
     * 发布服务
     */
    public static void main(String[] args) {
        //JAXRSServerFactoryBean发布REST的服务
        JAXRSServerFactoryBean jaxRSServerFactoryBean = new JAXRSServerFactoryBean();
        //设置服务实现类
        jaxRSServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
        //设置资源类，如果有多个资源类，可以以“,”隔开。
        jaxRSServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);
        //设置服务地址
        jaxRSServerFactoryBean.setAddress("http://127.0.0.1:8888/");
        //发布RESTFul服务
        jaxRSServerFactoryBean.create();
    }
}
