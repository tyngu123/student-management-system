package net.yago.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.yago.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
