package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.ZooEntity;

public class ZooDAOImpl implements ZooDAO{
	private SessionFactory factory;
	
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	public ZooDAOImpl() {
		System.out.println("created\t"+getClass().getName());
	}

	public void saveById(ZooEntity entity) {
		try {
			Session session  = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			session.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
