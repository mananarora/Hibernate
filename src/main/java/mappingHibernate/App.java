package mappingHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StudentEmbeddable embed=new StudentEmbeddable();
		embed.setLname("arora");
		embed.setId(3990);*/
		Student s=new Student();
		s.setRollno(2);
		s.setName("aman");
		s.setMarks(10);
		//s.setEmbed(embed);
		Laptop l=new Laptop();
		l.setLid(2);
		l.setLname("lenovo1");
		//l.setStudent(s);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		//ServiceRegistry reg=con.getStandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(l);
		session.save(s);
		Query q=session.createQuery("from Student" );
		List<Student> list = q.getResultList();
		for(Student st : list)
		{
			System.out.println(st);
		}
		tx.commit();
	}

}
