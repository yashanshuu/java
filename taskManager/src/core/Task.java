package core;
import java.time.LocalDate;

public class Task {
	//taskId, taskName, description, taskDate, status, active
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status staus;
	private boolean active;
	private static int nextId = 1;
	
	public Task(String taskName, String description, LocalDate taskDate, Status staus, boolean active) {
		super();
		this.taskId = nextId++;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.staus = staus;
		this.active = active;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public Status getStaus() {
		return staus;
	}

	public void setStaus(Status staus) {
		this.staus = staus;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", staus=" + staus + ", active=" + active + "]";
	}
	
	
}
