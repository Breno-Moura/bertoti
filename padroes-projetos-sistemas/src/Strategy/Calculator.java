package Strategy;

import java.util.Scanner;

public class Calculator {

    public Float calculator(Float a, Float b){
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Insira opção");
    	String op = scanner.nextLine();
        scanner.close();
        return funcao(op ,a,b);
    }
    private Float funcao(String op, Float a, Float b) {
    	switch (op) {
		case "+":
			return soma(a, b);			
		case "-":
			return subtracao(a, b);			
		case "*":
			return multiplicacao(a, b);			
		case "/":
			return divisao(a, b);			
		default:
			return 0f;
		}
    }
    
    private Float soma(Float a, Float b) {
    	return a+b;
    }
    private Float subtracao(Float a, Float b) {
    	return a-b;
    }
    private Float multiplicacao(Float a, Float b) {
    	return a*b;
    }
    private Float divisao(Float a, Float b) {
    	return a/b;
    }
}
