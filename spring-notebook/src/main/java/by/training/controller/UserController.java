package by.training.controller;

import by.training.model.Note;
import by.training.service.note.NoteService;
import by.training.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private NoteService noteService;

    @RequestMapping(value = "{id}/notes", method = RequestMethod.GET)
    public ResponseEntity setCategory(@PathVariable Long id,
                                      PersistentEntityResourceAssembler assembler) {
        return ResponseEntity.ok(
                assembler.toFullResource(userService.findAllNotes(id))
        );
    }

    @RequestMapping(value = "{id}/notes", method = RequestMethod.POST)
    public ResponseEntity setCategory(@PathVariable Long id,
                                      @RequestBody Note note,
                                      PersistentEntityResourceAssembler assembler) {
        if (noteService.checkAllFields(note)) {
            return ResponseEntity.ok(
                    assembler.toFullResource(userService.createNote(id, note))
            );
        } else {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(Collections.singletonMap("message", "wrong input"));
        }
    }
}
