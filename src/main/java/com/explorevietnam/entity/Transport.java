package com.explorevietnam.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transports")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String name;

    @ManyToMany(mappedBy = "transports")
    private List<Tour> tours;
}
