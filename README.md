# GPA-Calculator
This Java application, named GPA Calculator, is designed to assist users in calculating their Grade Point Average (GPA) based on the grades obtained in various courses. The program employs a simple grading system and allows users to input information for multiple courses, including the course name, code, unit, and score.

# Program Structure
# CourseInfo Class
The CourseInfo class encapsulates the details of a course, providing methods to access and compute relevant information such as grade points, grades, and grade units. The class includes the following attributes:

name: Course name

code: Course code

unit: Course unit

score: Course score


The class contains methods to retrieve the name, code, unit, score, grade points, grades, and grade units for a given course.

# GPACalculatorApp Class
The GPACalculatorApp class serves as the main driver for the GPA calculation application. It prompts users to input the number of courses they want to evaluate and subsequently collects information for each course, including name, code, unit, and score. The application utilizes an ArrayList to store CourseInfo objects for each course.

The class calculates the total grade points and units across all courses and computes the GPA to two decimal places. The result is then displayed in a tabular form, including the course name and code, unit, grade, and grade unit. The GPA is presented with a welcoming message, and a horizontal line separates the header from the tabular data.

# User Interaction
Upon execution, the program provides a welcoming message and prompts the user to input the number of courses they wish to evaluate. For each course, the user is prompted to enter the course name, code, unit, and score. The program then processes this information and displays the GPA result in a clear and organized tabular format.

# How to Use
Run the program.

Input the number of courses to be evaluated.

For each course, provide the requested details (name, code, unit, score).

View the GPA result presented in a tabular form.

The GPA is displayed along with a closing message.
