package search;

import mobile_bg.Listing;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class QuerySearch {
    private QueryParser parser = new QueryParser();

    public List<Listing> search(List<Listing> listings, String query) {
        List<String> polishNotation = parser.toPolishNotation(query);
        List<Listing> result = new ArrayList<>();

        for (Listing listing : listings) {
            if (evaluate(polishNotation, listing)) {
                result.add(listing);
            }
        }

        return result; // Гарантирано връщане на резултат
    }

    private boolean evaluate(List<String> polishNotation, Listing listing) {
        Stack<Boolean> stack = new Stack<>();
        for (String token : polishNotation) {
            switch (token) {
                case "|" -> stack.push(stack.pop() || stack.pop());
                case "&" -> stack.push(stack.pop() && stack.pop());
                case "=" -> stack.push(evaluateEquality(stack.pop(), stack.pop()));
                case "<" -> stack.push(evaluateComparison(stack.pop(), stack.pop(), "<"));
                case ">" -> stack.push(evaluateComparison(stack.pop(), stack.pop(), ">"));
                default -> stack.push(evaluateOperand(token, listing));
            }
        }
        return !stack.isEmpty() && stack.pop();
    }

    private boolean evaluateOperand(String token, Listing listing) {
        if (token.startsWith("brand")) {
            return listing.getCar().getBrand().equals(token.split("=")[1].replace("'", ""));
        } else if (token.startsWith("model")) {
            return listing.getCar().getModel().equals(token.split("=")[1].replace("'", ""));
        } else if (token.startsWith("year")) {
            return evaluateComparison(listing.getCar().getYear(), Integer.parseInt(token.split("=")[1]), "=");
        }
        return false;
    }

    private boolean evaluateEquality(Boolean value1, Boolean value2) {
        return value1.equals(value2);
    }

    private boolean evaluateComparison(Object value1, Object value2, String operator) {
        if (value1 instanceof Integer && value2 instanceof Integer) {
            int num1 = (Integer) value1;
            int num2 = (Integer) value2;

            return switch (operator) {
                case "<" -> num1 < num2;
                case ">" -> num1 > num2;
                default -> num1 == num2;
            };
        }
        return false; // В случай, че стойностите не са числа
    }

}
