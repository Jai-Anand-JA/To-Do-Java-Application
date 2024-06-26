package com.backend.todo.repo;

import java.io.IOException;
import java.util.ArrayList;

import com.backend.todo.dto.ToDoDTO;

public interface IToDoRepo {

	public boolean addTask(ArrayList<ToDoDTO> todo) throws IOException;
	
	public ArrayList<ToDoDTO> printTasks() throws IOException, ClassNotFoundException;

}
