package edu.mum.cs.cs425.studentmgmt.repository;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TranscriptRepository extends JpaRepository<Transcript, Long> {
}
