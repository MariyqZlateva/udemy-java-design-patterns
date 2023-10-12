package com.zlateva;

public class Client {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMerriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMerriedWomanExpression();

        InterpreterContext ic = new InterpreterContext("John");
        System.out.println("John is male? "+ isMale.interpret(ic));

        InterpreterContext ic2 = new InterpreterContext("Married Julie");
        System.out.println("Julie is a married women? "+ isMarriedWomen.interpret(ic2));

        InterpreterContext ic3 =new InterpreterContext("Lucy");
        System.out.println("Is Luci male? "+ isMale.interpret(ic3));
    }
}
