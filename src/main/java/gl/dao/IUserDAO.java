package gl.dao;

import gl.vo.Users;

public interface IUserDAO {
	public Users findUsersByNameAndPwd(Users u);

}
