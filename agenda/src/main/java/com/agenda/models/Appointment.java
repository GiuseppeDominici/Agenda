package com.agenda.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, unique = true)
    private Long id;

    @Column(name="name", nullable = false)
    private String nameAppointment;

    @Column(name="description")
    private String description;

    @Column(name="tipology")
    private String tipology;

    @Column(name="date")
    private Date date;

    @Column(name="hour")
    private LocalDateTime hour;
}
