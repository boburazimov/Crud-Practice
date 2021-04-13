package uz.sav.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sav.crud.entity.UserEntity;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

}
