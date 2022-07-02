package com.lee.simpledbapp.Model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Accessors(chain = true)
@Getter
@Setter
@ToString(of = {"name", "height"})
@NoArgsConstructor
@AllArgsConstructor
public class PlantDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int height;
}
