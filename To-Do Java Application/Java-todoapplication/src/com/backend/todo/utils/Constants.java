package com.backend.todo.utils;

public interface Constants {
	public static final String MESSAGE_BUNDLE_FILE_NAME = "messages";
	int ADD_TASK = 1;
	int DELETE_TASK = 2;
	int UPDATE_TASK = 3;
	int SEARCH_TASK = 4;
	int PRINT_TASK = 5;
	int EXIT = 6;
	String PENDING = "Pending";
	String COMPLETE = "Completed";
	String DELETED = "Deleted";
	String PATH = System.getProperty("user.dir") + "\\src\\files\\tasks.dat";

}
