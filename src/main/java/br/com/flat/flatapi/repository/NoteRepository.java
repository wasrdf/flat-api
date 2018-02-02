package br.com.flat.flatapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flat.flatapi.model.Note;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {

}
