package io.zipcoder.persistenceapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentNumber;
    private String name;
    private Employee departmentManager;

    public Department(String name, Employee departmentManager) {
        this(null, name,departmentManager);
    }

    public Department(Long departmentNumber, String name, Employee departmentManager) {
        this.departmentNumber = departmentNumber;
        this.name = name;
        this.departmentManager = departmentManager;
    }
}
