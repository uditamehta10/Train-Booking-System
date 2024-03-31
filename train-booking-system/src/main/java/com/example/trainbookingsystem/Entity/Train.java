package com.example.trainbookingsystem.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Train")
@Getter
@Setter
public class Train {


    @Id
    int trainId;

    String airlineName;
    int seatCapacity;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    @JsonManagedReference
    List<Schedule> schedules;

    @CreationTimestamp
    Date createdAt;

    @Column
    @UpdateTimestamp
    Date updatedAt;

}
