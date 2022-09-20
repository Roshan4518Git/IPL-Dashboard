package com.myproject.IPLDashboard.repository;

import com.myproject.IPLDashboard.model.Match;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface MatchRepository extends CrudRepository<Match,Long> {

    List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);

    default List<Match> findLatestMatchesByTeam(String teamName,int count){
        return getByTeam1OrTeam2OrderByDateDesc(teamName,teamName, (Pageable) PageRequest.of(0,count));
    }
}
