package ru.geekbrains.SpringHW5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.SpringHW5.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
