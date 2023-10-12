package com.zlateva;

public interface Expression {

    boolean interpret(InterpreterContext context);
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return context.getResult(data);
    }
}

class AndExpression implements Expression {
    private Expression e1;
    private Expression e2;

    public AndExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return this.e1.interpret(context) && this.e2.interpret(context);
    }
}

class OrExpression implements Expression {
    private Expression e1 = null;
    private Expression e2 = null;

    public OrExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public boolean interpret(InterpreterContext context) {
        return this.e1.interpret(context) || this.e2.interpret(context);
    }
}