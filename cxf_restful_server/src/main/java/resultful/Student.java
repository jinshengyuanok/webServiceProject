package resultful;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 15:15
 * description:
 **/
@XmlRootElement(name = "student")//@XmlRootElement可以实现对象和XML数据之间的转换
public class Student {
    private long id;

    private String name;

    private Date birthday;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
