package com.zlateva;

public interface Visitor {
    void visit(Book book);

    void visit(CD cd);

    void visit(DVD dvd);

    double getTotalPostage();
}

class USPostageVisitor implements Visitor {
    private double totalPostage = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() < 20) {
            totalPostage += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() < 20) {
            totalPostage += cd.getWeight() * 2.5;
        }

    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() < 20) {
            totalPostage += dvd.getWeight() * 3;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostage;
    }
}

class SouthAmericaVisitor implements Visitor {
    double totalPostage = 0;

    @Override
    public void visit(Book book) {
        if (book.getPrice() < 30) {
            totalPostage += (book.getWeight() * 2) * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if (cd.getPrice() < 30) {
            totalPostage += (cd.getWeight() * 2.5) * 2;
        }
    }

    @Override
    public void visit(DVD dvd) {
        if (dvd.getPrice() < 30) {
            totalPostage += (dvd.getWeight() * 3) * 2;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostage;
    }
}
