package app.api.controller;

import app.entity.Dept;
import app.entity.Emp;
import app.repository.EmpRepository;
import app.service.EmpService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmpAPIController {

    private final EmpService empService;
    
	@GetMapping("/api/emp/{empno}")
	public Emp getDeptByDeptno(@PathVariable Integer empno) {
		Emp emp = empService.getEmpByEmpno(empno);
		return emp;
	}
}