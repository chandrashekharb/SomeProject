package chan.shre.dars.services.pub;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import chan.shre.dars.dao.pub.RegistrationDao;
import chan.shre.dars.model.pub.User;

@Service("registrationService")


public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	@Transactional
	public User registerUser(User user) {
		
		return registrationDao.registerUser(user);
	}
}
