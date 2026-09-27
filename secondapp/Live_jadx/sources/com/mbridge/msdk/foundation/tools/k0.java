package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f67428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f67429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f67430c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, yr.a.f159811k, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, zi.c.f161635m, zi.c.f161636n, 13, zi.c.f161638p, zi.c.f161639q, zi.c.f161640r, 17, zi.c.f161643u, 19, zi.c.f161646x, zi.c.f161647y, zi.c.f161648z, zi.c.A, zi.c.B, zi.c.C, -1, -1, -1, -1, -1, -1, zi.c.D, zi.c.E, 28, zi.c.G, zi.c.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f67431d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', fw.b.f85389p, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f67428a = map;
        map.put('v', 'A');
        f67428a.put('S', 'B');
        f67428a.put('o', 'C');
        f67428a.put('a', 'D');
        f67428a.put('j', 'E');
        f67428a.put('c', 'F');
        f67428a.put('7', 'G');
        f67428a.put('d', 'H');
        f67428a.put('R', 'I');
        f67428a.put('z', 'J');
        f67428a.put('p', 'K');
        f67428a.put('W', 'L');
        f67428a.put('i', 'M');
        f67428a.put('f', 'N');
        f67428a.put('G', 'O');
        f67428a.put('y', 'P');
        f67428a.put('N', 'Q');
        f67428a.put('x', 'R');
        f67428a.put('Z', 'S');
        f67428a.put('n', 'T');
        f67428a.put('V', 'U');
        f67428a.put('5', 'V');
        f67428a.put('k', 'W');
        f67428a.put('+', 'X');
        f67428a.put('D', 'Y');
        f67428a.put('H', 'Z');
        f67428a.put('L', 'a');
        f67428a.put('Y', 'b');
        f67428a.put('h', 'c');
        f67428a.put('J', 'd');
        f67428a.put('4', 'e');
        f67428a.put('6', 'f');
        f67428a.put('l', 'g');
        f67428a.put('t', 'h');
        f67428a.put('0', 'i');
        f67428a.put('U', 'j');
        f67428a.put('3', 'k');
        f67428a.put('Q', 'l');
        f67428a.put('r', 'm');
        f67428a.put('g', 'n');
        f67428a.put('E', 'o');
        f67428a.put(Character.valueOf(fw.b.f85389p), 'p');
        f67428a.put('q', 'q');
        f67428a.put('8', 'r');
        f67428a.put('s', 's');
        f67428a.put('w', 't');
        f67428a.put('/', Character.valueOf(fw.b.f85389p));
        f67428a.put('X', 'v');
        f67428a.put('M', 'w');
        f67428a.put('e', 'x');
        f67428a.put('B', 'y');
        f67428a.put('A', 'z');
        f67428a.put('T', '0');
        f67428a.put('2', '1');
        f67428a.put('F', '2');
        f67428a.put('b', '3');
        f67428a.put('9', '4');
        f67428a.put('P', '5');
        f67428a.put('1', '6');
        f67428a.put('O', '7');
        f67428a.put('I', '8');
        f67428a.put('K', '9');
        f67428a.put('m', '+');
        f67428a.put('C', '/');
        HashMap map2 = new HashMap();
        f67429b = map2;
        map2.put('A', 'v');
        f67429b.put('B', 'S');
        f67429b.put('C', 'o');
        f67429b.put('D', 'a');
        f67429b.put('E', 'j');
        f67429b.put('F', 'c');
        f67429b.put('G', '7');
        f67429b.put('H', 'd');
        f67429b.put('I', 'R');
        f67429b.put('J', 'z');
        f67429b.put('K', 'p');
        f67429b.put('L', 'W');
        f67429b.put('M', 'i');
        f67429b.put('N', 'f');
        f67429b.put('O', 'G');
        f67429b.put('P', 'y');
        f67429b.put('Q', 'N');
        f67429b.put('R', 'x');
        f67429b.put('S', 'Z');
        f67429b.put('T', 'n');
        f67429b.put('U', 'V');
        f67429b.put('V', '5');
        f67429b.put('W', 'k');
        f67429b.put('X', '+');
        f67429b.put('Y', 'D');
        f67429b.put('Z', 'H');
        f67429b.put('a', 'L');
        f67429b.put('b', 'Y');
        f67429b.put('c', 'h');
        f67429b.put('d', 'J');
        f67429b.put('e', '4');
        f67429b.put('f', '6');
        f67429b.put('g', 'l');
        f67429b.put('h', 't');
        f67429b.put('i', '0');
        f67429b.put('j', 'U');
        f67429b.put('k', '3');
        f67429b.put('l', 'Q');
        f67429b.put('m', 'r');
        f67429b.put('n', 'g');
        f67429b.put('o', 'E');
        f67429b.put('p', Character.valueOf(fw.b.f85389p));
        f67429b.put('q', 'q');
        f67429b.put('r', '8');
        f67429b.put('s', 's');
        f67429b.put('t', 'w');
        f67429b.put(Character.valueOf(fw.b.f85389p), '/');
        f67429b.put('v', 'X');
        f67429b.put('w', 'M');
        f67429b.put('x', 'e');
        f67429b.put('y', 'B');
        f67429b.put('z', 'A');
        f67429b.put('0', 'T');
        f67429b.put('1', '2');
        f67429b.put('2', 'F');
        f67429b.put('3', 'b');
        f67429b.put('4', '9');
        f67429b.put('5', 'P');
        f67429b.put('6', '1');
        f67429b.put('7', 'O');
        f67429b.put('8', 'I');
        f67429b.put('9', 'K');
        f67429b.put('+', 'm');
        f67429b.put('/', 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
