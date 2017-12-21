package com.mbsoft.easytasks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbsoft.easytasks.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
