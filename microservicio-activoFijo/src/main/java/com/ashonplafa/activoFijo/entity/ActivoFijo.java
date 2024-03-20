package com.ashonplafa.activoFijo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "ACTIVO_FIJO")
@AllArgsConstructor
@NoArgsConstructor
public class ActivoFijo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "test_text")
    private String testText;

}
