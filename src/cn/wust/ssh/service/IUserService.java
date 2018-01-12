package cn.wust.ssh.service;

import java.util.List;

import cn.wust.ssh.domain.User;

public interface IUserService {
	// 增加一个用户
	public void saveUser(User user);

	// 删除一个用户
	public void deleteUser(User user);

	// 修改一个用户
	public void updateUser(User user);

	// 获取所有的用户
	public List<User> getUserList();

	// 根据id获取一个用户
	public User getUserById(Long id);
}
