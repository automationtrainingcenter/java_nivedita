package basics;
/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1:
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

import java.util.Scanner;

public class ConditionalStatements {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		
		//if statement
		if(num >= 0) {
			System.out.println("given number is positive");
		}
		
		//if else statement
		if(num % 2 == 0) {
			System.out.println("given number is even number");
		}else {
			System.out.println("given number is odd number");
		}
		
		//else if ladder
		System.out.println("enter your score");
		int score = s.nextInt();
		
		if(score < 500) {
			System.out.println("no medal");
		}else if(score < 600) {
			System.out.println("bronze medal");
		}else if(score < 800) {
			System.out.println("silver medal");
		}else {
			System.out.println("Gold medal");
		}
		
		//nested if 
		System.out.println("enter username");
		String uname = s.next();
		if(uname.equalsIgnoreCase("surya")) {
			System.out.println("enter password");
			String pwd = s.next();
			if(pwd.equals("selenium")) {
				System.out.println("welcome "+uname);
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("invalid username");
		}
	}

}
