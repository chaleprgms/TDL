package ToDoList;

public class ToDoList {
    private Task[] myTasks;
    private int taskCounter;

    public ToDoList(int size) {
    	
        myTasks = new Task[size];
        taskCounter = 0;
       
        
    }

    public boolean addTask(String name) {
        // Find the 1st open slot in the array,
        // and add the supplied task to it.
        // Return boolean indicating success.
        // i.e. if the array is full, return false.
    	boolean returnVal;
    	
    	if(taskCounter < 10){
    		
    		Task nextTask = new Task(name);
    		myTasks[taskCounter] = nextTask;
    		
    		System.out.println("Task added at index " + taskCounter);
    		
    		taskCounter++;
    		returnVal = true;
    	}else{
    		System.out.println("The task list is full!");
    		returnVal = false;
    	}
    	
    	return returnVal;

    }

    public boolean completeTask(int indexPos) {
        // Mark the indicated task as completed.
        // Make sure that the supplied number is
        // within the bounds of the array.
    	
    	
    	if(indexPos < 10 && indexPos > 0){
    		int absolutePos = indexPos - 1;
    		myTasks[absolutePos].setStatus(true);
    		System.out.println("Task Updated, Good Work! ");
    		
    		return true;
    		
    	}else{
    		int absolutePos = indexPos - 1;
    		System.out.println("Doesnt look like you have a task at index " + absolutePos);
    		return false;
    	}
    	
    	

    }

    public String toString() {
        String out = "My To-do List:\n";
        out += "--------------\n";
        // Add each task and its status to out.
        // Summon Task's toString to help.
        int i = 0;
        boolean RunLoop = true;
        
        while(RunLoop){
        	int arraySize = myTasks.length;
        	if(i < arraySize){
        		if(myTasks[i] == null || i >= 10){
        			RunLoop = false;
        		}else{
        			int pos = i;
        			out += "(" + pos + "): " + myTasks[i].toString() + "\n";
        			if(i < 10){
        				i++;
            			RunLoop = true;
        			}else{
        				RunLoop = false;
        			}
        		}
        	}
        } 
        
        return out;
   }
}
