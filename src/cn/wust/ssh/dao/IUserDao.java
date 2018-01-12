package cn.wust.ssh.dao;

import java.util.List;

import cn.wust.ssh.domain.User;

public interface IUserDao {
   
   //����һ���û�
   public void saveUser(User user);
   
   //ɾ��һ���û�
   public void deleteUser(User user);
   
   //�޸�һ���û�
   public void updateUser(User user);

   //��ȡ���е��û�
   public List<User> getUserList();

   //����id��ȡһ���û�
   public User getUserById(Long id);
}
