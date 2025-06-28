# FILE-HANDLING-UTILITY

*COMPANY*:CODTECH IT SOLUTIONS

*NAME*:SREENANDHA K

*INTERN ID*:CT04DG2749

*DOMAIN*:JAVA PROGRAMMING

*DURATION*:4 WEEKS(25 JUNE 2025-25 JULY 2025)

*MENTOR*:NEELA SANTHOSH

DESCRIPTION OF TASK:
The objective of this internship task is to demonstrate the basic concepts of file handling using the Java programming language. File handling is one of the most fundamental and essential features in any programming language, as it enables programs to interact with files stored in the system for reading, writing, and modification purposes. Through this assignment, we aim to understand how Java provides a systematic approach to performing file operations using the classes available in the java.io package.
    In this task, a simple menu-driven Java application is developed that allows the user to create a text file, write content to the file, read and display the contents of the file, and modify the file by appending new content to it. The program provides an interactive console-based interface where the user can choose the operation they wish to perform. Based on the user’s choice, the respective file handling operation is executed.
   The task not only focuses on implementing the functionality but also emphasizes the importance of exception handling. It ensures that common errors such as file not found, file access issues, and input/output errors are properly managed, so the program remains stable and provides clear error messages to the user.

   CODE EXPLANATION:
   
METHOD: createAndWriteFile:
               This method is responsible for creating a new text file (if it does not already exist) and writing the content provided by the user into the file. If the file already exists, its contents are 
    overwritten with the new content. This is achieved by using the BufferedWriter class in combination with the FileWriter class.

Implementation Details:
     The method takes two arguments: the name of the file and the content to be written. A BufferedWriter is created by wrapping a FileWriter object, which points to the specified file. The write() method of the BufferedWriter is used to write the content into the file. If the file does not exist, it is automatically created.

Error Handling:
    All possible IOExceptions that may occur during file creation or writing are caught using a try-catch block, ensuring the program does not terminate abruptly if an error occurs.

METHOD: readFile:
  This method reads the content of the specified file line by line and displays it on the console. The purpose of this method is to verify the content written into the file or to check the existing contents before modification.

Implementation Details:
    The method accepts the filename as an argument. A BufferedReader is created by wrapping a FileReader object. A while loop reads each line from the file using the readLine() method until the end of the file is reached. Each line is displayed on the console.

Error Handling:
    The method includes a try-catch block to handle IOExceptions that may occur during file reading. If the file is not found or any other reading error occurs, a user-friendly error message is displayed.

METHOD: modifyFile:
    The purpose of this method is to append new content to the existing file without deleting the current content. This demonstrates the ability to modify files by adding additional information without overwriting previous data.

Implementation Details:
    The method takes the filename and the new content to be added as arguments. A BufferedWriter is created by wrapping a FileWriter object in append mode, achieved by passing true as the second argument to the FileWriter constructor. The write() method of the BufferedWriter adds the new content to the end of the file, followed by a newline for clarity.

Error Handling:
Like the previous methods, IOExceptions are properly handled to prevent the program from crashing in case of an error during file modification.

Main Method:
   The main method serves as the entry point of the program. It provides a simple menu-driven interface where the user can choose to:

Write content to a file

Read and display the file contents

Append new content to the file

The program uses the Scanner class to accept user input. Based on the user’s choice, the corresponding method is called to perform the selected operation. After completion, the program provides confirmation messages to inform the user of successful file operations.

*OUTPUT*:

  ![Screenshot 2025-06-28 130842](https://github.com/user-attachments/assets/d5277816-2b8d-44f3-9031-56c808a72cb1)


