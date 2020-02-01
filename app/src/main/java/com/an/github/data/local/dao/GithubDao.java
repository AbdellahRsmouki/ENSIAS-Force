package com.an.github.data.local.dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.an.github.data.local.entity.GithubEntity;

import java.util.List;

@Dao
public interface GithubDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long[] insertRepositories(List<GithubEntity> githubEntities);

    @Query("SELECT * FROM `GithubEntity` where page = :page")
    List<GithubEntity> getRepositoriesByPage(Long page);
}
