# EmbeddedAssignment3

The Embedded Configuration Assistant program essentially asks a user to provide
specifications of the requirements to suggest a recommended system based on different configurations. There are 4 questions that the program displays to the user. These include:

Is your budget above $100?
Do you need more than 4GB of RAM?
Do you need WiFi?
Is machine learning required?

Based on the input of the user to these questions the program finds the best embedded system match for said user. The program uses a bunch of nested if statements to check whether there is a system in the program that matches the user's requirements. If there is an embedded system present the program returns said embedded system and if there is not one present that matches the users specifications, the program notifies the user that no such system with the inputted configuration is present.

In order to run the program, download the source files of the code onto your local machine. Go into your terminal and set the pwd to the src file of the directory provided in the dropbox/ github. After cd-ing into the src folder, run the command “javac *.java” to compile the program, followed by “java Config.java” to run and subsequently start the program. Enjoy!
