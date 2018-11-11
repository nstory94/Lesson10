package edu.dcccd.lesson10.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor

public class Greeting {
    @Getter
    private String greeting;

}
