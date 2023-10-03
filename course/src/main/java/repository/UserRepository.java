//Ezzel kérjük le az adatbázisba dolgozás
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

}

