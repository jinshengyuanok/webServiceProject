package resultful;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 15:29
 * description:
 **/
public class StudentInterfaceImpl implements StudentInterface {
    private static List<Student> studentList;
    public StudentInterfaceImpl(){
        System.out.println("1.无参数构造方法执行了");
    }
    static {
        System.out.println("2.静态代码块执行了。。。。。");

        studentList = new ArrayList<>();
        Student student1 = new Student();
        student1.setId(2);
        student1.setName("李四");
        student1.setBirthday(new Date());
        studentList.add(student1);
        Student student2 = new Student();
        student2.setId(3);
        student2.setName("name_王五");
        student2.setBirthday(new Date());
        studentList.add(student2);

        Student student3 = new Student();
        student3.setId(4);
        student3.setName("name_1");
        student3.setBirthday(new Date());
        studentList.add(student3);

        Student student4 = new Student();
        student4.setId(5);
        student4.setName("name_2");
        student4.setBirthday(new Date());
        studentList.add(student4);

        Student student5 = new Student();
        student5.setId(6);
        student5.setName("name_3");
        student5.setBirthday(new Date());
        studentList.add(student5);

    }
    @Override
    public Student query(long id) {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setBirthday(new Date());
        return student;
    }

    @Override
    public List<Student> queryList(String name) {
        //Student s = (Student) studentList.stream().filter(e -> e.getName().contains("name"));
       return  studentList;
    }
}
