package dsa.local.hpenvy.notesv01.repository;

import dsa.local.hpenvy.notesv01.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
   
    
}
