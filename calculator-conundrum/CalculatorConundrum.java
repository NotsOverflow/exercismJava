/*
*                                                                              *
*               ╔╗╔┌─┐┌┬┐┌─┐╔═╗┬  ┬┌─┐┬─┐┌─┐┬  ┌─┐┬ ┬                          *
*               ║║║│ │ │ └─┐║ ║└┐┌┘├┤ ├┬┘├┤ │  │ ││││                          *
*               ╝╚╝└─┘ ┴ └─┘╚═╝ └┘ └─┘┴└─└  ┴─┘└─┘└┴┘                          *
*                                                                              *
*               CalculatorConundrum.java created 2025/01/13                    *
*               by Richard JUAN (contact@richard-juan.com)                     *
*                                                                              *
*               Copyright © 2025 Richard JUAN. All rights reserved             *
*                                                                              *
*/

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        switch (operation) {
            case "+":
                return String.format("%d + %d = %d", operand1, operand2, operand1 + operand2);
            case "*":
                return String.format("%d * %d = %d", operand1, operand2, operand1 * operand2);
            case "/":
                try {
                    int res = operand1 / operand2;
                    return String.format("%d / %d = %d", operand1, operand2, res);
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            case "-":
                throw new IllegalArgumentException("Operation '-' does not exist");
            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
    }
}
