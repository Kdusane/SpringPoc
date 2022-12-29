package com.foobar.bar.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "BAR")
public class Bar {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "BAR")
    private String bar;
}
