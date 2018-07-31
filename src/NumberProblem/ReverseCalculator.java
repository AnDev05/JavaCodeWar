/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberProblem;

import java.util.Stack;

/**
 *
 * @author Admin
 */
public class ReverseCalculator {


//    public double evaluate(String expr) {
//        if (expr.isEmpty())
//            return 0;
//   
//        String[] spl = expr.split("\\s+");
//        Stack<Double> stack = new Stack();
//        double operand_1;
//        double operand_2;
//        for (String c : spl) {
//            if (c.equals("+")) {
//                operand_1 = stack.pop();
//                operand_2 = stack.pop();
//                stack.push(operand_1 + operand_2);
//            } else if (c.equals("-")) {
//                operand_1 = stack.pop();
//                operand_2 = stack.pop();
//                stack.push(operand_1 + operand_2);
//            } else if (c.equals("*")) {
//                operand_1 = stack.pop();
//                operand_2 = stack.pop();
//                stack.push(operand_1 + operand_2);
//            } else if (c.equals("/")) {
//                operand_1 = stack.pop();
//                operand_2 = stack.pop();
//                stack.push(operand_1 + operand_2);
//            } else {
//
//            }
//
//        }
//        return (double) stack.pop();
//    }
//}

    public double evaluate(String expr) {
        if (expr.isEmpty())
            return 0;
   
        String[] spl = expr.split("\\s+");
        Stack<Double> stack = new Stack();
        double operand_1;
        double operand_2;
        for (String s : spl) {
            switch (s) {
                case "+":
                    operand_1 = stack.pop();
                    operand_2 = stack.pop();
                    stack.push(operand_2 + operand_1);
                    break;
                case "-":
                    operand_1 = stack.pop();
                    operand_2 = stack.pop();
                    stack.push(operand_2 - operand_1);
                    break;
                case "*":
                    operand_1 = stack.pop();
                    operand_2 = stack.pop();
                    stack.push(operand_2 * operand_1);
                    break;
                case "/":
                    operand_1 = stack.pop();
                    operand_2 = stack.pop();
                    stack.push(operand_2 / operand_1);
                    break;
                default:
                    stack.push(Double.valueOf(s));
                    break;
            }

        }
        return stack.pop();
    }
}
