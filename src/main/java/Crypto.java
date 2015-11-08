/**
 * Author: Will Dang
 * 10/15/2015.
 */
public class Crypto {

    public static void rotN(String line, int shift) {
        line = line.toLowerCase();
        char[] output = new char[line.length()];
        int i = 0;
        for (char ch : line.toCharArray()) {
            output[i] = ch >= 97 && ch <= 122 ? (char) (((ch - 97 + shift) % 26) + 97) : ch;
            i++;
        }
        String outString = new String(output).toUpperCase();
        System.out.println(outString);
        System.out.println("n = " + shift);
    }

    public static void patternAnalyze(String line) {
        int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
        a = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = 0;
        for (char ch : line.toUpperCase().toCharArray()) {
            switch (ch) {
                case 'A':
                    a++;
                    break;
                case 'B':
                    b++;
                    break;
                case 'C':
                    c++;
                    break;
                case 'D':
                    d++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'F':
                    f++;
                    break;
                case 'G':
                    g++;
                    break;
                case 'H':
                    h++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'J':
                    j++;
                    break;
                case 'K':
                    k++;
                    break;
                case 'L':
                    l++;
                    break;
                case 'M':
                    m++;
                    break;
                case 'N':
                    n++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'P':
                    p++;
                    break;
                case 'Q':
                    q++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'S':
                    s++;
                    break;
                case 'T':
                    t++;
                    break;
                case 'U':
                    u++;
                    break;
                case 'V':
                    v++;
                    break;
                case 'W':
                    w++;
                    break;
                case 'X':
                    x++;
                    break;
                case 'Y':
                    y++;
                    break;
                case 'Z':
                    z++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("a : " + a + "\n"
                + "b : " + b + "\n"
                + "c : " + c + "\n"
                + "d : " + d + "\n"
                + "e : " + e + "\n"
                + "f : " + f + "\n"
                + "g : " + g + "\n"
                + "h : " + h + "\n"
                + "i : " + i + "\n"
                + "j : " + j + "\n"
                + "k : " + k + "\n"
                + "l : " + l + "\n"
                + "m : " + m + "\n"
                + "n : " + n + "\n"
                + "o : " + o + "\n"
                + "p : " + p + "\n"
                + "q : " + q + "\n"
                + "r : " + r + "\n"
                + "s : " + s + "\n"
                + "t : " + t + "\n"
                + "u : " + u + "\n"
                + "v : " + v + "\n"
                + "w : " + w + "\n"
                + "x : " + x + "\n"
                + "y : " + y + "\n"
                + "z : " + z);
    }
}
