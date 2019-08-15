package gl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import gl.dao.IUserDAO;
import gl.service.IUserService;
import gl.vo.Users;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDAO userDAO;
	public Users islogin(Users u) {
		
		return userDAO.findUsersByNameAndPwd(u);
	}

}
