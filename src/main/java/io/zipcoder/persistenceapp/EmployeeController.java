package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

@Autowired
    private EmployeeRepository er;


    public EmployeeController(EmployeeRepository er) {
        this.er = er;
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee e){
        return new ResponseEntity<>(er.save(e), HttpStatus.OK);

    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> update(@RequestBody Employee e){
        Long id = e.getEmployeeNumber();
        e.setManager(new Employee("Cristina", "McClintock", "VP", 8142791404L,
                "sfsdf@gmail.com", 10121991L, new Employee(), 234L));

        return new ResponseEntity<>(er.save(e),HttpStatus.OK);

    }
}
