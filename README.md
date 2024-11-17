# To-Do-list-manager
Create a simple console application to manage a list of tasks. Users can add, remove, and view their tasks.


### Detailed Description of the To-Do List Manager Program

The Java program provided implements a simple **To-Do List Manager** that allows users to manage tasks interactively. The application presents a menu-driven interface through which the user can add tasks, remove tasks, view all tasks, or exit the program. It makes use of a `Scanner` object to accept user inputs and an `ArrayList` to store and manage tasks dynamically.

### Working Procedure in Detail

#### 1. **Initialization of Variables and Objects**:
   - The program starts by creating a `Scanner` object (`scanner`) for reading user input from the console.
   - An `ArrayList<String>` called `tasks` is initialized to store the tasks. This list will grow and shrink dynamically as tasks are added or removed.

#### 2. **Infinite Loop for Continuous Menu Display**:
   - The program runs inside an infinite `while (true)` loop to continuously display the menu options until the user chooses to exit. The loop ensures that the user can perform multiple operations (add, remove, view tasks) without restarting the program.
   
#### 3. **Menu Presentation**:
   - The menu is displayed in the console with four options:
     - Option 1: Add a new task.
     - Option 2: Remove an existing task.
     - Option 3: View all current tasks.
     - Option 4: Exit the program.
   - The program prompts the user to enter their choice.

#### 4. **Choice Handling with Switch Statement**:
   - After the user inputs their choice, the program uses a `switch` statement to perform the appropriate action:
     
     **Case 1 - Add Task**:
     - If the user selects option 1 (Add Task), the program prompts the user to enter a description of the task.
     - The task is then added to the `tasks` list using the `add()` method.
     - A confirmation message is displayed to indicate that the task has been successfully added.

     **Case 2 - Remove Task**:
     - If the user selects option 2 (Remove Task), the program checks if the `tasks` list is empty. If so, it notifies the user that there are no tasks to remove.
     - If there are tasks, the program asks the user to enter the task number (index) they wish to remove. The task number corresponds to the index in the list, starting from 1 (user-friendly numbering).
     - The input is validated, and if the entered task number is valid (within the list bounds), the task is removed using the `remove()` method. A success message is displayed.
     - If the entered number is invalid, the program notifies the user and asks for a correct input.

     **Case 3 - View Tasks**:
     - If the user selects option 3 (View Tasks), the program checks if the `tasks` list is empty.
     - If the list contains tasks, it iterates over the `tasks` list and displays each task along with its corresponding task number.
     - If the list is empty, a message is displayed stating there are no tasks to show.

     **Case 4 - Quit**:
     - If the user selects option 4 (Quit), the program displays a message indicating that it is exiting the To-Do List Manager.
     - The `scanner.close()` method is called to close the `Scanner` object and free up resources, followed by `System.exit(0)` to terminate the program.

     **Default Case - Invalid Choice**:
     - If the user enters a choice that is not 1, 2, 3, or 4, the program prints an error message and prompts the user to try again.

#### 5. **Exception Handling for Invalid Input**:
   - The program is wrapped in a `try-catch` block to handle invalid inputs gracefully.
   - If the user enters non-integer input when prompted for a menu choice (e.g., a string or a floating-point number), the `InputMismatchException` is caught, and a message is displayed asking the user to enter a valid number.
   - `scanner.nextLine()` is called to clear the invalid input from the buffer, allowing the program to continue.

#### 6. **Exit Procedure**:
   - The program runs in an infinite loop until the user selects the "Quit" option (Option 4). Upon quitting, it ensures that the `Scanner` resource is properly closed by invoking `scanner.close()` to prevent resource leaks.

### Summary of Key Features:
- **Dynamic Task Management**: Tasks are stored in an `ArrayList`, allowing the user to add and remove tasks dynamically.
- **Menu-driven Interface**: A simple text-based menu allows the user to choose from various actions (add, remove, view tasks, or quit).
- **Error Handling**: The program handles invalid inputs (non-integer values) using `try-catch` blocks and provides appropriate feedback to the user.
- **Input Validation**: Ensures that the task removal operation is only performed for valid task numbers.

### Example of Program Execution:
- The program starts by presenting the menu:
  ```
  To-Do List Manager
  1. Add Task
  2. Remove Task
  3. View Tasks
  4. Quit
  Enter your choice:
  ```
- If the user selects "1" to add a task, they would input a task (e.g., "Buy groceries"), and the program adds it to the list.
- If the user selects "3", the program will display all tasks.
- If the user selects "2", the program will prompt for a task number to remove, and upon valid input, it removes the task.
- If the user selects "4", the program exits.

This design is simple, efficient, and easy to use for managing a small set of tasks.
