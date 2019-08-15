package gl.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gl.service.impl.UserServiceImpl;
import gl.vo.Users;
//����Spring�й�
@Controller
@RequestMapping(value="/cu")
public class UserController {
	//�˴���new���������
	@Autowired
	private UserServiceImpl userServiceImpl;
	@RequestMapping(value="islogin",method=RequestMethod.POST)
	public String islogin(Users u,HttpServletRequest request) {
		Users users=userServiceImpl.islogin(u);
		
		if(users!=null) {
			
			request.getSession().setAttribute("myusers", users);
			return "suc";
		}
		return "login";
	}
}
