package controller;

import storage.StudentClawler;
import storage.StudentData;
import storage.StudentFileBinary;
import storage.StudentFileExcel;

import java.util.List;

public class StudentControler {
    StudentData fileBinary = new StudentClawler();
    List list = fileBinary.readData();

    public void addNewStudent(){
        fileBinary.writeData();
    }
}