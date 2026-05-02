package in.vk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vk.main.entity.Employee;
import java.util.List;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
Employee findByEmail(String email);
}
