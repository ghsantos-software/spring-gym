package spring.gym.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.gym.database.model.RoleEntity;

import java.util.Optional;

public interface IRoleRepository extends JpaRepository<RoleEntity, Integer> {

    Optional<RoleEntity> findByNome(String nome);
}
