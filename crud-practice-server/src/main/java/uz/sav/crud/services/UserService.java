package uz.sav.crud.services;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import uz.sav.crud.entity.UserEntity;
import uz.sav.crud.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    public boolean delete(UUID id){
        Optional<UserEntity> userEntity=userRepository.findById(id);
        if (userEntity.isPresent()){
            userRepository.delete(userEntity.get());
        return true;
        }
        else return false;
    }


}
