package com.example.SubjectRevice.contronllers;


import com.example.SubjectRevice.models.Subject;
import com.example.SubjectRevice.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class SubjectContronller {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    List<Subject> getAll(){
        return subjectService.getSubjects();
    }
    @PostMapping("/subjects")
    public  Subject addSubject(@RequestBody Subject subject){
        return subjectService.addSubject(subject);


    }
}
