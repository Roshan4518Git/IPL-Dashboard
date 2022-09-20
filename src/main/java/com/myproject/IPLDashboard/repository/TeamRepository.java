package com.myproject.IPLDashboard.repository;

import com.myproject.IPLDashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team,Long> {
    Team findByTeamName(String teamName);
}
