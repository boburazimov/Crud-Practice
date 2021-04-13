package uz.sav.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.sav.crud.entity.TaskEntity;
import uz.sav.crud.entity.template.ResponseData;
import uz.sav.crud.services.TaskService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rest/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public ResponseData<List<TaskEntity>> getAllTasks() {

        return new ResponseData(taskService.getAllTasks());
    }


    @PostMapping("/save")
    public ResponseData saveTask(@RequestBody TaskEntity taskEntity) {
        taskService.save(taskEntity);
        return new ResponseData(HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseData deleteById(@PathVariable("id") UUID id) {
        if (taskService.delete(id) == true) {

            return new ResponseData(HttpStatus.OK);
        } else return new ResponseData(HttpStatus.BAD_REQUEST);
    }





}
