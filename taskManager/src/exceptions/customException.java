package exceptions;
import core.*;

import java.util.ArrayList;
import java.util.HashMap;

import utils.illegalInputException;

public class customException {
	public static void deleteTask(int taskId, HashMap<Integer, Task> tasks) throws illegalInputException{
		if(tasks.get(taskId) == null)
			throw new illegalInputException("Task Id not found...");
		tasks.remove(taskId);
		
	}
	
	public static Status parseStatus(String st) {
		return Status.valueOf(st);
	}
	
	public static Task validateTaskId(int id, HashMap<Integer, Task> tasks) throws illegalInputException{
		if(tasks.get(id) == null)
			throw new illegalInputException("Invalid Task id");
		return tasks.get(id);
	}	
}


