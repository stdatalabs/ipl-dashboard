package com.stdatalabs.ipldashboard.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long totalMatches;
    private long totalWins;

    @Transient
    private List<Match> matches;

    public Team(String teamName, long totalMatches) {
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }
}
