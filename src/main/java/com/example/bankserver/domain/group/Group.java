package com.example.bankserver.domain.group;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "group")
public class Group {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Getter
    @Setter
    @Column(length = 31, nullable = false)
    private String name;
}
