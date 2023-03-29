import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);
    //private static String textRequest = "Input text: ";
    //private static String numberRequest = "Input number: ";

    public static void main(String[] args){
        double mem = 0;
        boolean memStore = false;

         while(true){
            // System.out.println("What operation would you like to perform? (add, subtract, multiply, divide)");
            

            if(!memStore){
                String operation = getString("Input desired operation seperated by spaces (eg. 3 + 5) or x to exit: ");
                
                if(operation.equals("x")){break;}

                String opSplit[] = operation.split(" ");
                double num1 = getDouble(opSplit[0]);
                double num2 = getDouble(opSplit[2]);
                String operator = opSplit[1];

                Calculator calculator = new Calculator(num1,num2);
                memStore = true;
                if(operator.equals("+")){
                    mem = calculator.add();
                    System.out.println("Result: " + mem);
                }else if(operator.equals("-")){
                    mem = calculator.subtract();
                    System.out.println("Result: " + mem);
                }else if(operator.equals("*")){
                    mem = calculator.multiply();
                    System.out.println("Result: " + mem);
                }else if(operator.equals("/")){               
                    if(calculator.getb()!=0){
                        mem = calculator.divide();
                        System.out.println("Result: " + mem);
                    }else{
                        System.out.println("No dividing by zero. Try again.");
                    }
                }
            }else{
                String operation = getString("Continue operation with memory, or type clear to reset or x to exit: \n" + mem);

                if(operation.equals("x")){break;}
                if(operation.equals("clear")){memStore=false;mem=0;continue;}

                String opSplit[] = operation.split(" ");
                double num1 = mem;
                double num2 = getDouble(opSplit[1]);
                String operator = opSplit[0];

                Calculator calculator = new Calculator(num1,num2);

                if(operator.equals("+")){
                    mem = calculator.add();
                    System.out.println("Result: " + mem);
                }else if(operator.equals("-")){
                    mem = calculator.subtract();
                    System.out.println("Result: " + mem);
                }else if(operator.equals("*")){
                    mem = calculator.multiply();
                    System.out.println("Result: " + mem);
                }else if(operator.equals("/")){               
                    if(calculator.getb()!=0){
                        mem = calculator.divide();
                        System.out.println("Result: " + mem);
                    }else{
                        System.out.println("No dividing by zero. Try again.");
                        mem = 0;
                        memStore=false;
                    }
                }

            }
            
          
         }
    
    }


    public static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    public static double getDouble(String str){
        return Double.valueOf(str);
    }
    
}