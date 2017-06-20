import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;

/**
 * Created by think on 2017/6/14.
 */
public class RMIClientTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("rmi-client.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String s:beanDefinitionNames){
            System.out.println("已经实例化的bean："+s);
        }

        StudentService _ss = (StudentService) context.getBean("studentService");

        System.out.println(_ss.selectByPrimaryKey(Long.valueOf("21")));

    }

}
