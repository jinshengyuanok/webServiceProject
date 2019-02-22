package general;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 17:03
 * description:
 **/
public class PublishMain {
    public static void main(String[] args) {
        jaxWsPublish();
        cxfPublish();
    }

    /**
     * 使用JDK自带的 jax-ws 发布WebService
     */
    public static void jaxWsPublish(){
        Endpoint.publish("http://127.0.0.1:8888/javaHello",new HelloInterfaceImpl());
    }

    /**
     * 使用 cxf 发布 WebService
     */
    public static void cxfPublish(){
        //JaxWsServerFactoryBean发布服务
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置服务接口
        jaxWsServerFactoryBean.setServiceClass(HelloInterfaceImpl.class);
        //设置服务实现类
        jaxWsServerFactoryBean.setServiceBean(new HelloInterfaceImpl());
        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:8889/cxfHello");
        //发布
        jaxWsServerFactoryBean.create();
    }
}
