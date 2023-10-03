//Ezzel kérjük le az adatbázisba dolgozás
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.CourseEntity;


@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long>{

}
