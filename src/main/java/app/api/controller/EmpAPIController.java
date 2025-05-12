package app.api.controller;

import app.dto.EmpDto;
import app.entity.Dept;
import app.entity.Emp;
import app.repository.EmpRepository;
import app.service.EmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class EmpAPIController {

    private final EmpService empService;

    @PutMapping("/emp/{empno}")
    public EmpDto updateEmp(@RequestBody EmpDto updateEmp, @PathVariable("empno") Integer empno) {

        Emp emp = empService.updateEmp(updateEmp, empno);

        return EmpDto.from(emp);
    }
}