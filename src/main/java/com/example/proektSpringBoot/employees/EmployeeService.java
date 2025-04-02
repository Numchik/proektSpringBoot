package com.example.proektSpringBoot.employees;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    public List<employee> getAllEmployees() {
return List.of(
        new employee(
                1l,
                "Vasya",
                "vasya@gmail.com",
                LocalDate.of(2000, 1, 10),
                24,
                10000
        ),
        new employee(
                2l,
                "Pasha",
                "pasha@gmail.com",
                LocalDate.of(2002, 3, 10),
                24,
                20000
        )
);
    }

}
