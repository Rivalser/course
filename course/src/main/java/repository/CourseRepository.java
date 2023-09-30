package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.CourseEntity;

//Ezzel kérjük le az adatbázisból a dolgokat
@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long>{

}
