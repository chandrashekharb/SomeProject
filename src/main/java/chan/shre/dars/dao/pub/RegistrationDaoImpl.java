package chan.shre.dars.dao.pub;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import chan.shre.dars.model.pub.User;

@Repository("registrationDao")
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private SessionFactory sesssionFactory;
	
	public SessionFactory getSesssionFactory() {
		return sesssionFactory;
	}
	public void setSesssionFactory(SessionFactory sesssionFactory) {
		this.sesssionFactory = sesssionFactory;
	}
	
	
	@Override
	public User registerUser(User user) {
		
		Session session=this.sesssionFactory.getCurrentSession();
		session.save(user);
		return user;
	}
	
	
	

}
