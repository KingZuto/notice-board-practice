package app.api.controller;

import app.entity.Emp;
import app.service.EmpService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/emp")
public class EmpAPIController {

    private final EmpService empService;

    @DeleteMapping("/{empno}")
    public Emp deleteEmp(@PathVariable Integer empno) {
        return empService.deleteEmp(empno);
    }
}
