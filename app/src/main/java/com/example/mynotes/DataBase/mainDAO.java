package com.example.mynotes.DataBase;

import static androidx.room.OnConflictStrategy.REPLACE;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.mynotes.Models.Notes;
import java.util.List;

@Dao
public interface mainDAO {
    @Insert(onConflict = REPLACE)
    void insert (Notes notes);

    @Query("SELECT * FROM notes ORDER BY id DESC")
    List<Notes> getAll();
//    @Update
    @Query("UPDATE notes SET title = :title, privacy = :privacy, category = :category, note = :note, date = :date, pinned = :pinned WHERE id = :id")
    void update (int id, boolean privacy, String title, String category, String note, String date, boolean pinned);

    @Delete
    void delete (Notes notes);
}
