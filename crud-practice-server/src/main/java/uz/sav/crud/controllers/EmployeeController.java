package uz.sav.crud.controllers;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sav.crud.repositories.EmployeeRepository;
import uz.sav.crud.services.EmployeeService;

@NoArgsConstructor
@RestController
@RequestMapping("rest/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


}
