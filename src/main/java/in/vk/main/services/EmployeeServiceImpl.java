package in.vk.main.services;

import org.springframework.stereotype.Service;

import in.vk.main.entity.Employee;
import in.vk.main.repository.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public boolean Empregister(Employee emp) {
		try {
			employeeRepo.save(emp);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
		
	}

	@Override
	public Employee Emplogin(String email, String password) {
	 Employee validemp=employeeRepo.findByEmail(email);
	 if(validemp!=null && validemp.getPassword().equals(password)) {
		 return validemp;
		 
	 }
		return null;
	}

	
}
