import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.ZooDAO;
import dao.ZooDAOImpl;
import entity.ZooEntity;

public class ZooTester {

	public static void main(String[] args) {

		try {
			ApplicationContext zoo = new ClassPathXmlApplicationContext("resource/context.xml");
			ZooDAO ref = zoo.getBean(ZooDAOImpl.class);
			ref.saveById(new ZooEntity("Mysure", 500, 120.40));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
