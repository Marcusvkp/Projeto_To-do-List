package br.com.marcuskuhn.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRipository extends JpaRepository<TaskModel, UUID> {

}
