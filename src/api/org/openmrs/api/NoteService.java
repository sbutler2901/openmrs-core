package org.openmrs.api;

import java.util.Collection;
import java.util.List;
import org.openmrs.User;
import org.openmrs.domain.Note;


public interface NoteService { 
	
	public List<Note> getNotes(User user) throws Exception;
	public void createNote(Note note) throws Exception;
	public Note getNote(Integer noteId) throws Exception;
	public void updateNote(Note note) throws Exception;
	
}