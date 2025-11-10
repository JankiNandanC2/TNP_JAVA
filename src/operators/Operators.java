package operators;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // 2. Unary Operators

        System.out.println("Unary Operators:");
        System.out.println("++a = " + (++a));   // pre-increment


        System.out.println("b++ = " + (b++));   // post-increment
        System.out.println("--a = " + (--a));   // pre-decrement
       System.out.println("b-- = " + (b--));   // post-decrement
        System.out.println("Unary minus: -a = " + (-a));
        System.out.println("Unary plus: +a = " + (+a));
        System.out.println("Logical NOT: !(a > b) = " + (!(a > b)));
        System.out.println();

        // 3. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println();

        // 4. Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("(a > b) && (b > 0) : " + ((a > b) && (b > 0)));
        System.out.println("(a < b) || (b > 0) : " + ((a < b) || (b > 0)));
        System.out.println("!(a < b) : " + (!(a < b)));
        System.out.println();

        // 5. Bitwise Operators
        int x = 6, y = 3; // 6 = 110, 3 = 011
        System.out.println("Bitwise Operators:");
        System.out.println("x & y = " + (x & y));   // AND
        System.out.println("x | y = " + (x | y));   // OR
        System.out.println("x ^ y = " + (x ^ y));   // XOR
        System.out.println("~x = " + (~x));         // NOT
        System.out.println();

        // 6. Shift Operators
        System.out.println("Shift Operators:");
        System.out.println("x << 1 = " + (x << 1));   // Left shift
        System.out.println("x >> 1 = " + (x >> 1));   // Right shift
        System.out.println("x >>> 1 = " + (x >>> 1)); // Unsigned right shift
        System.out.println();

        // 7. Assignment Operators
        int c = 10;
        System.out.println("Assignment Operators:");
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5 : " + c);
        c -= 3;
        System.out.println("c -= 3 : " + c);
        c *= 2;
        System.out.println("c *= 2 : " + c);
        c /= 4;
        System.out.println("c /= 4 : " + c);
        c %= 3;
        System.out.println("c %= 3 : " + c);
        c &= 2;
        System.out.println("c &= 2 : " + c);
        c |= 1;
        System.out.println("c |= 1 : " + c);
        c ^= 2;
        System.out.println("c ^= 2 : " + c);
        c <<= 1;
        System.out.println("c <<= 1: " + c);
        c >>= 1;
        System.out.println("c >>= 1: " + c);
        c >>>= 1;
        System.out.println("c >>>= 1: " + c);
        System.out.println();

        // 8. Ternary Operator
        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);
    }
}
