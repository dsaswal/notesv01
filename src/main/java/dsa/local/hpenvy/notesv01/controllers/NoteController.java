package dsa.local.hpenvy.notesv01.controllers;

import dsa.local.hpenvy.notesv01.entity.Note;
import dsa.local.hpenvy.notesv01.repository.NoteRepository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notesv01/api")
public class NoteController {

    private static final Logger logger = LoggerFactory.getLogger(NoteController.class);

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping("/note")
    public void addNote(@RequestBody Note note) {
        logger.debug(note.toString());
        noteRepository.save(note);
    }

    @PutMapping("/note")
    public void updateNote(@RequestBody Note inpNote) {
        logger.debug(inpNote.toString());
        Note mergedNote = noteRepository.findById(inpNote.getId()).orElse(null);
        mergedNote.setNote(inpNote.getNote());
        mergedNote.setTitle(inpNote.getTitle());
        mergedNote.setVersion(inpNote.getVersion());
        noteRepository.save(mergedNote);
    }
}
