package com.example.calculator3;

// 계산하는 메서드, Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리
// 제너릭 구현
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

    //Getter로 symbol 반환
    public char getSymbol() {
        return symbol;
    }

    public abstract <T extends Number> double calculate(T a, T b);

    // 어떤 symbol인지 판별, 해당하지 않는다면 예외 처리
    public static OperatorType fromSymbol(char symbol) {
        for (OperatorType type : values()) {
            if (type.symbol == symbol) return type;
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
    }

}