//File name is Token
//Written by Garrison Konschak
//Written on 2/24/2022
package token;
import java.util.Stack;
public class Token
{
    public static int evaluate(String expression)
    {
        char[] tokens = expression.toCharArray();
        Stack<Integer> values = new Stack<>();
        Stack<Character> num = new Stack<>();
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                StringBuilder alpha = new StringBuilder();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    alpha.append(tokens[i++]);
                values.push(Integer.parseInt(alpha.toString()));
            }
            else if (tokens[i] == '(')
                num.push(tokens[i]);           
            else if (tokens[i] == ')')
            {
                while (num.peek() != '(')
                  values.push(applyCalc(num.pop(), values.pop(), values.pop()));
                num.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                     tokens[i] == '*' || tokens[i] == '/')
            {
                while (!num.empty() && hasPriority(tokens[i], num.peek()))
                  values.push(applyCalc(num.pop(), values.pop(), values.pop()));
                num.push(tokens[i]);
            }
        }
        while (!num.empty())
            values.push(applyCalc(num.pop(), values.pop(), values.pop()));
        return values.pop();
    }
    public static boolean hasPriority(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        return !((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'));
    }
    public static int applyCalc(char op, int b, int a)
    {
        switch (op)
        {
        case '+':
            return a + b;
        case '-':
            return a - b;
        case '*':
            return a * b;
        case '/':
            if (b == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        System.out.println(Token.evaluate("10 + 2 * 6"));
        System.out.println(Token.evaluate("100 * 2 + 12"));
        System.out.println(Token.evaluate("100 * ( 2 + 12 )"));
        System.out.println(Token.evaluate("100 * ( 2 + 12 ) / 14"));
    }
}
