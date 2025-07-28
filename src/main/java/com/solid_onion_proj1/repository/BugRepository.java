package com.solid_onion_proj1.repository;

import java.util.List;

import com.solid_onion_proj1.entity.Bug;

public interface BugRepository {
    void insertBug(Bug b);
    List<Bug> getAllBugs();
    
}
