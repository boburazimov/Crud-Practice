package uz.sav.crud.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.sav.crud.entity.Enum.RoleEnum;
import uz.sav.crud.entity.template.TemplateModel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleEntity extends TemplateModel {

    @ManyToMany
    private List<UserEntity> user;

    @Enumerated(value = EnumType.STRING)
    private RoleEnum role;


}
