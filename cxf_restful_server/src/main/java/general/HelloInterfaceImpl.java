package general;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 17:02
 * description:
 **/
public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
