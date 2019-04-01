package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository dr;


    public DepartmentController(DepartmentRepository dr) {
        this.dr = dr;
    }

    @PostMapping("/departments")
    public ResponseEntity<Department> createEmployee(@RequestBody Department d){
        return new ResponseEntity<>(dr.save(d), HttpStatus.OK);

    }
}
