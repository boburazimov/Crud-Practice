package uz.sav.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz.sav.crud.entity.PositionEntity;
import uz.sav.crud.repositories.PositionRepository;

import javax.swing.text.Position;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PositionService {
    @Autowired
    PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }


    public void save(PositionEntity positionEntity) {
        positionRepository.save(positionEntity);
    }

    public List<PositionEntity> getAll() {
        return positionRepository.findAll();
    }

    public PositionEntity getById(Integer id) {
        return positionRepository.findById(id).get();
    }

    public Optional<PositionEntity> getByName(String positionName) {
        return positionRepository.findByName(positionName);
    }

    public void delete(Integer id) {
        positionRepository.deleteById(id);
    }

}
