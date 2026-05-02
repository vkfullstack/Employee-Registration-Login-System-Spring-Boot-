package in.vk.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.vk.main.entity.Employee;
import in.vk.main.services.EmployeeService;
import jakarta.servlet.http.HttpSession;

@Controller
public class Empcontroller {
	private EmployeeService employeeService;
	
	public Empcontroller(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/register")
	public String openRegistration(Model model) {
	    model.addAttribute("employee", new Employee());
	    return "register";
	}

	@PostMapping("/regform")
	public String submitRegForm(@ModelAttribute("employee") Employee employee ,Model model) {
	     boolean status=employeeService.Empregister(employee);
	     if(status) {
	    	 model.addAttribute("success", "Employee register success");
	     }
	     else {
	    	 model.addAttribute("Error", "Employee not register due to some error");
	     }
	    return "register"; 
	}
	@GetMapping("/login")
	public String openloginpage( Model model) {
		model.addAttribute("employee", new Employee());
		return "login";
	}
	@PostMapping("/loginform")
	public String submitlogin(@ModelAttribute("employee") Employee employee ,Model model) {
	 Employee validemp=	employeeService.Emplogin(employee.getEmail(), employee.getPassword());
	 if(validemp !=null) {
		 model.addAttribute("modelname", validemp.getName());
		 return "profile";
		 
	 }
	 else {
		 model.addAttribute("Error", "invalid email and password");
		 return "login";
	 }
		
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/login";
	}
	}

