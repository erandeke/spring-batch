package com.springbatch.batchJob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbatch.batchJob.model.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
