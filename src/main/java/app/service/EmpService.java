package app.service;

import app.dto.EmpDto;
import app.entity.Dept;
import app.entity.Emp;
import app.repository.DeptRepository;
import app.repository.EmpRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Service
public class EmpService {

    private final EmpRepository empRepository;
    private final DeptRepository deptRepository;

    @Transactional
    public Emp updateEmp(EmpDto updateEmp, Integer empno) {
        Emp emp = empRepository.findById(empno)
                .orElseThrow(() -> new EntityNotFoundException("해당 직원의 정보가 존재하지 않습니다."));
        Dept dept =deptRepository.findById(updateEmp.getDeptno())
                .orElseThrow(() -> new EntityNotFoundException("해당 부서가 존재하지 않습니다."));

        emp.updateInfo(updateEmp, dept);

        return emp;
    }
}
