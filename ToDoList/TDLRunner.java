package ToDoList;

import java.util.Scanner;


/* TODO----------------
 * 
 * ADD toString() FOR THE PROGRAM
 * 
 * CLEAN UP CODE
 * 
 * ADD OPTION TO DISPLAY toString() WHENEVER
 * 
 * COMPLETE / TURN IN
 */
public class TDLRunner {
    public static void main(String[] args) {
        ToDoList tdl = new ToDoList(10);
        Scanner s = new Scanner(System.in);
        
        int choice = 0;
        do {
            System.out.println(tdl); //this is a call to ToDoList's toString().
            System.out.println("(1) add an item\n(2) mark an item complete\n-------------------- ");
            choice = s.nextInt();
            s.nextLine();
            if (choice == 1) {
                System.out.println("Enter the name of the task: ");
                String newTask = s.nextLine();
                // enter a command to add this task to our tdl object
                
                boolean completed = tdl.addTask(newTask);
                System.out.println();
                
                
                
            } else if (choice == 2) {
            	
                System.out.println("Enter the task number: ");
                int taskNum = s.nextInt();
               
               
                boolean completed =  tdl.completeTask(taskNum);
                System.out.println();
                
                // enter a command to mark this task as complete in our tdl object
                
            }
        } while (choice > 0 && choice < 3);

	// Finally, ToDoList's toString() is called to print out the to-do list.
   //     System.out.println("Final list\n----------\n" + tdl);
    }
}