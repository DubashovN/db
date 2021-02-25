package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public abstract class Human {
    private String name;
    private String patronymic;
    private String secondName;
    private int age;
    private int phoneNumber;
    private String eMail;

}
