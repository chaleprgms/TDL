package ToDoList;

public class Task {
    private String name;
    private boolean isDone;

    public Task(String taskName) {
        name = taskName;
        isDone = false;
    }

    public boolean getStatus() {
    	return isDone;
    }

    public String getName() {
    	return name;
    }

    public void setStatus(boolean set) {
    	this.isDone = set;
    }

    public String toString() {
    	String toString = "Task: " + name + " Status: " + isDone;
    			
    	return toString;   
    }
}
