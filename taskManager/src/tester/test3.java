package tester;

import static java.time.LocalDate.parse;

import java.time.LocalDate;

import static exceptions.customException.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import core.Status;
import core.Task;

public class test3 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			HashMap<Integer, Task> tasks = new HashMap<>();
			try {
				while(!exit) {
					System.out.println("1. Add New Task \n"
							+ "2. Delete a task \n"
							+ "3. Update task status\n"
							+ "4. Display all pending tasks\n"
							+ "5. Display all pending tasks for today\n"
							+ "6. Display all tasks sorted by taskDate"
							+ "7. Exit");
					System.out.println("Select option: ");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Adding a new task...");
						//taskName, description, taskDate, status, active
						System.out.println("Enter task name, description, task date");
						Task t = new Task(sc.next(),sc.next(),parse(sc.next()),Status.PENDING,true);
						tasks.put(t.getTaskId(), t);
						break;
					case 2:
						System.out.println("Deleting a task...");
						System.out.println("Enter taskid which is to be deleted: ");
						int id1 = sc.nextInt();
						deleteTask(id1, tasks);
						break;
					case 3:
						System.out.println("Enter task id whose status is to be updated: ");
						int id2 = sc.nextInt();
						Task t2 = validateTaskId(id2, tasks);
						System.out.println("Enter status to be updated: ");
						Status st = Status.valueOf(sc.next().toUpperCase());
						t2.setStaus(st);
						break;
					case 4:
						System.out.println("Displaying all pending tasks:");
						tasks.values().stream().filter(p->p.getStaus().equals(Status.PENDING))
						.forEach(p1->System.out.println(p1));
						break;
					case 5:
						System.out.println("Displaying all pending tasks for today:");
						tasks.values().stream().filter(p2->p2.getStaus().equals(Status.PENDING) && p2.getTaskDate().isEqual(LocalDate.now())).forEach(p3->System.out.println(p3));
						break;
					case 6:
						System.out.println("Tasks sorted by date:");
						tasks.values().stream().sorted(Comparator.comparing(Task::getTaskDate)).forEach(i->System.out.println(i));
						break;
					case 7:
						exit = true;
						System.out.println("Bye...");
						break;
					}
				}
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		}
  }

