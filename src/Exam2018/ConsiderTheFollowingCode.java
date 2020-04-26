package Exam2018;

import java.io.Console;

public class ConsiderTheFollowingCode {

//	Console bigConsole = new Console(100, 100); // This is the big console
//	Console smallConsole = new Console(10, 10); // This is the small console

//	bigConsole.println(“Boltzmann”);
//	smallConsole.println(“Einstein”);
//
//	bigConsole = smallConsole;
//	
//	bigConsole.println(“Maxwell”);
//	String name = “Feynman”;
	
	
//	QUESTION.
//	(a) Please say whether the name “Boltzmann” is printed on the small console or on the big console and explain your answer. [2 marks]
	
//	ANSWER.
//	The name "Boltzmann" will be printed in the big console. The print method is called when the reference bigConsole is referencing the object Console of dimensions 100, 100.
	
//	QUESTION
//	(b) Please say whether the name “Einstein” is printed on the small console or on the big console and explain your answer. [2 marks]

//	ANSWER.
//	As in the previous example but with the small console, the name "Einstein" is printed when the reference smallConsole is referencing the object Console with dimensions 10, 10.
	
//	QUESTION
//	(c) Please say whether the name “Maxwell” is printed on the small console or on the big console and explain your answer. [3 marks]

//	ANSWER.
//	The name "Maxwell" will be printed in the small Console. This is because the bigConsole is now referencing to the same object that smallConsole is referring. This is an example of
//	polimorphism.
	
//	QUESTION.
//	(d) Is it possible to print the string name on the big console? If yes, how? If no, why? [3 marks]

//	ANSWER.
//	It won't be possible to print the last name in the big console after the reference bigConsole refers to the small console.
//	This happens because the object bigConsole has no reference, and the Java garbage collector deletes all not referenced instances.
}
