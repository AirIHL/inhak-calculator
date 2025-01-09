package com.example.calculator3;

public enum OperatorType {

    PLUS('+') {
        @Override
        public <T extends Number> double calculate(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }
    },
    MINUS('-') {
        @Override
        public <T extends Number> double calculate(T a, T b) {
            return a.doubleValue() - b.doubleValue();
        }
    },
    MULTIPLY('*') {
        @Override
        public <T extends Number> double calculate(T a, T b) {
            return a.doubleValue() * b.doubleValue();
        }
    },
    DIVIDE('/') {
        @Override
        public <T extends Number> double calculate(T a, T b) {
            if (b.doubleValue() == 0)
                throw new ArithmeticException("0으로 나눌 수 없습니다!");

            return a.doubleValue() / b.doubleValue();
        }
    };

    private final char symbol;

    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract <T extends Number> double calculate(T a, T b);

    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType type : values()) {
            if (type.symbol == symbol) return type;
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
    }

}