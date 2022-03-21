package myPackage;


import java.util.Scanner;

public class InfixToPostFixsolution {

    public static boolean precedence ( char first, char second ) {
        int v1 = 0, v2 = 0;
        //find value for first

        switch (first) {
            case '-', '+' -> v1 = 1;
            case '*', '/' -> v1 = 2;
        }

        //find value for second
        switch (second) {
            case '-', '+' -> v2 = 1;
            case '*', '/' -> v2 = 2;
        }

        if (v1 < v2) {
            return false;
        }//end if

        return true;
    }//end precedence method

    //converts infix expression into postfix expression
   /* public static String theConversion ( String infixExp ) {
        String postFix = "The Postfix Expression is: ";
        Stack stack = new Stack();
        char character = ' ';

        for (int i = 0; i < infixExp.length(); i++) {
            character = infixExp.charAt(i);

            //determine if character is an operator
            if (character == '*' || character == '-' || character == '/' || character == '+') {

                while (!stack.isEmpty() && precedence((Character) stack.peek(), character)) {
                    postFix += stack.pop();
                }//end while
                stack.push(character);
            } else if (character == '(') //check for left parenthesis
            {
                stack.push(character);
            } else if (character == ')') {
                while (!stack.peek().equals('(') && !stack.isEmpty()) { //add characters until left parenthesis
                    postFix += stack.pop();
                }//end while

                if (!stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop(); // pop/remove left parenthesis
                }
            } else {
                postFix += character;
            }//end if
        }//end for
        while (!stack.isEmpty()) //add the remaining elements of stack to postfix expression
        {
            if (stack.peek().equals('(')) {
                postFix = "There is no matching right parenthesis.";
                return postFix;
            }
            postFix += stack.pop();
        }
        return postFix;
    }//end convertToPostfix*/

    //converts infix expression into postfix expression
     static ArrayList theConversionArrayList ( ArrayList infixExp ) {
        ArrayList postFix = new ArrayList();
        Stack stack = new Stack();
        char x = ' ';

        for (int i = 0; i < infixExp.size(); i++) {
            x = (Character) infixExp.get(i);

            //determine if character is an operator
            if (x == '*' || x == '-' || x == '/' || x == '+') {

                while (!stack.isEmpty() && precedence((Character) stack.peek(), x)) {
                    postFix.add(stack.pop());
                }//end while
                stack.push(x);
            } else if (x == '(') //check for left parenthesis
            {
                stack.push(x);
            } else if (x == ')') {
                while (!stack.peek().equals('(') && !stack.isEmpty()) { //add characters until left parenthesis
                    postFix.add(stack.pop());
                }//end while

                if (!stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop(); // pop/remove left parenthesis
                }
            } else {
                postFix.add(character);
            }//end if
        }//end for
        while (!stack.isEmpty()) //add the remaining elements of stack to postfix expression
        {
            if (stack.peek().equals('(')) {
                System.out.println("There is no matching right parenthesis.");
                return postFix;
            }
            postFix.add(stack.pop());
        }
        return postFix;
    }//end convertToPostfix

  public static void main ( String[] args ) {

        String userInput = "y";

        do {

            // TODO Auto-generated method stub
            ArrayList infix = new ArrayList();
            System.out.println("Please enter your expression?");
            Scanner scanner = new Scanner(System.in);

            String expresion = "";
            //a while loop to runt trough the expresion
            while (scanner.hasNext()) {
                expresion = scanner.next();
                break;
            }

            for (int i = 0; i < expresion.length(); i++) {
                infix.add(expresion.charAt(i));
            }

            ArrayList postfix = theConversionArrayList(infix);

            System.out.print("The postfix expression is: ");
            for (int i = 0; i < postfix.size(); i++) {
                System.out.print(postfix.get(i));
            }
            System.out.println();

            //        //Scanner scanner = new Scanner(System.in);
            //        String f ="a+e+r*t-q+h";
            //       // System.out.println("Please enter your expressio?");
            //        System.out.print(theConversion(f));
            //       // scanner.close();

            System.out.print("Do you want to continue (y:yes, n:no):");
            userInput = scanner.next();
        }while(userInput.equals("y"));

    }
}

