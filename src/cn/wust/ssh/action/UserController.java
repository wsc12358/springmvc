package cn.wust.ssh.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.wust.ssh.domain.User;
import cn.wust.ssh.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/userList")
	public ModelAndView userList(Model model){
		List<User> list=userService.getUserList();
		model.addAttribute("userList", list);
		return new ModelAndView("list","model",model);
	}
}
