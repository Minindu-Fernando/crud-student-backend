package edu.icet.crm.model;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String studentName;
    private String studentAge;
    private String studentContact;
    private String gurdianName;
    private String gurdianAddress;
    private String gurdianContact;
}
