package com.example.mynotes.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;


@Entity (tableName = "notes")
public class Notes implements Serializable {

    @PrimaryKey(autoGenerate = true)
    public int id = 0;

    @ColumnInfo(name = "privacy")
    public boolean privacy = false;

    @ColumnInfo(name = "title")
    public String title = "";

    @ColumnInfo(name = "category")
    public String category = "";

    @ColumnInfo(name = "note")
    public String note = "";

    @ColumnInfo(name = "date")
    public String date = "";

    @ColumnInfo(name = "pinned")
    public boolean pinned = false;

    public int getID() {return id;}

    public void setID(int id) {this.id = id;}

    public boolean getPrivacy(){return privacy;}

    public void setPrivacy(boolean privacy) {this.privacy = privacy;}

    public String getTitle() { return title; }

    public void setTitle(String title) {this.title = title; }

    public String getCategory() { return category; }

    public void setCategory(String category) {this.category = category; }

    public String getNote() { return note; }

    public void setNote(String note) {this.note = note; }

    public String getDate() { return date; }

    public void setDate(String date) {this.date = date; }

    public boolean getPinned() { return pinned; }

    public void setPinned(boolean pinned) {this.pinned = pinned; }


}
