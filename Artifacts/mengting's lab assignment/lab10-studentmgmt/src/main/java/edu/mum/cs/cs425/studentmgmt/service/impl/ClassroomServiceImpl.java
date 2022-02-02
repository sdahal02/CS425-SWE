package edu.mum.cs.cs425.studentmgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.service.ClassroomService;
@Service
public class ClassroomServiceImpl implements ClassroomService {
  @Autowired
  ClassroomRepository classroomRepository;
  
  @Override
  public Classroom save(Classroom classroom) {
    
    return classroomRepository.save(classroom);
  }
  
}
