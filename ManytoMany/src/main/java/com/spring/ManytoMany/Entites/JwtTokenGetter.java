package com.spring.ManytoMany.Entites;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JwtTokenGetter implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String token;
}
