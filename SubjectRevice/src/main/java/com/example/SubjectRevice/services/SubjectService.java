package com.example.SubjectRevice.services;

import com.example.SubjectRevice.models.Subject;
import com.example.SubjectRevice.repositories.SubjectRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectService {
    private final SubjectRepositoty subjectRepositoty;
    @Autowired
    public SubjectService(SubjectRepositoty subjectRepositoty){
        this.subjectRepositoty = subjectRepositoty;
    }
    public List<Subject> getSubjects(){
        return subjectRepositoty.findAll();
    }
    public Subject addSubject(Subject subject){
        return subjectRepositoty.save(subject);
    }
}
