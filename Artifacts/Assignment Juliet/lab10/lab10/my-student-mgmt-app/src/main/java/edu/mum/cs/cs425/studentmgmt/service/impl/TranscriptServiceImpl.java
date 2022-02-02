package edu.mum.cs.cs425.studentmgmt.service.impl;

import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.TranscriptRepository;
import edu.mum.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.stereotype.Service;

@Service
public class TranscriptServiceImpl implements TranscriptService {
        private TranscriptRepository transcriptRepository;

        public TranscriptServiceImpl(TranscriptRepository transcriptRepository){
            this.transcriptRepository = transcriptRepository;
        }
    @Override
    public Transcript createTranscript(Transcript transcript) {
        return transcriptRepository.save(transcript);
    }
}
