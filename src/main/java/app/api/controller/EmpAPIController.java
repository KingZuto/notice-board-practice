package app.api.controller;

import app.entity.Emp;
import app.service.EmpService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class EmpAPIController {

    private final EmpService empService;

    @DeleteMapping("/api/emp/{empno}")
    public Emp deleteEmp(@PathVariable Integer empno) {
        return empService.deleteEmp(empno);
    }
}
