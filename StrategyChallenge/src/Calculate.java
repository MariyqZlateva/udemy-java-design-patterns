public interface Calculate {
    double performOperation(double num1, double num2);
}

class Addition implements Calculate {
    @Override
    public double performOperation(double num1, double num2) {
      return  num1 + num2;
    }
}

class Subtraction implements Calculate {
    @Override
    public double performOperation(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication implements Calculate {

    @Override
    public double performOperation(double num1, double num2) {
        return num1 * num2;
    }
}