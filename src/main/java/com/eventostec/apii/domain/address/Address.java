package com.eventostec.apii.domain.address;


import com.eventostec.apii.domain.Event;
import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "address")
@Entity
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String city;

    private String uf;

    @ManyToOne
    @JoinColumn(name = "envent_id")
    private Event event;
}
