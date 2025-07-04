package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    private String membId;
    private String name;
    private String address;
    private String membType;
    private String membDate;
    private String expiryDate;
}
