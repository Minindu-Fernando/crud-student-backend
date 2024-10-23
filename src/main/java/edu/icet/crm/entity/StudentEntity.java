package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    private String studentName;
    private String studentAge;
    private String studentContact;
    private String gurdianName;
    private String gurdianAddress;
    private String gurdianContact;
}
