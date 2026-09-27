package com.mbridge.msdk.foundation.tools;

import com.ironsource.G5;
import java.util.HashMap;
import java.util.Map;
import r7.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f67471a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', fw.b.f85389p, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f67472b = new byte[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f67473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f67474d;

    static {
        HashMap map = new HashMap();
        f67473c = map;
        map.put('A', 'v');
        f67473c.put('B', 'S');
        f67473c.put('C', 'o');
        f67473c.put('D', 'a');
        f67473c.put('E', 'j');
        f67473c.put('F', 'c');
        f67473c.put('G', '7');
        f67473c.put('H', 'd');
        f67473c.put('I', 'R');
        f67473c.put('J', 'z');
        f67473c.put('K', 'p');
        f67473c.put('L', 'W');
        f67473c.put('M', 'i');
        f67473c.put('N', 'f');
        f67473c.put('O', 'G');
        f67473c.put('P', 'y');
        f67473c.put('Q', 'N');
        f67473c.put('R', 'x');
        f67473c.put('S', 'Z');
        f67473c.put('T', 'n');
        f67473c.put('U', 'V');
        f67473c.put('V', '5');
        f67473c.put('W', 'k');
        f67473c.put('X', '+');
        f67473c.put('Y', 'D');
        f67473c.put('Z', 'H');
        f67473c.put('a', 'L');
        f67473c.put('b', 'Y');
        f67473c.put('c', 'h');
        f67473c.put('d', 'J');
        f67473c.put('e', '4');
        f67473c.put('f', '6');
        f67473c.put('g', 'l');
        f67473c.put('h', 't');
        f67473c.put('i', '0');
        f67473c.put('j', 'U');
        f67473c.put('k', '3');
        f67473c.put('l', 'Q');
        f67473c.put('m', 'r');
        f67473c.put('n', 'g');
        f67473c.put('o', 'E');
        f67473c.put('p', Character.valueOf(fw.b.f85389p));
        f67473c.put('q', 'q');
        f67473c.put('r', '8');
        f67473c.put('s', 's');
        f67473c.put('t', 'w');
        f67473c.put(Character.valueOf(fw.b.f85389p), '/');
        f67473c.put('v', 'X');
        f67473c.put('w', 'M');
        f67473c.put('x', 'e');
        f67473c.put('y', 'B');
        f67473c.put('z', 'A');
        f67473c.put('0', 'T');
        f67473c.put('1', '2');
        f67473c.put('2', 'F');
        f67473c.put('3', 'b');
        f67473c.put('4', '9');
        f67473c.put('5', 'P');
        f67473c.put('6', '1');
        f67473c.put('7', 'O');
        f67473c.put('8', 'I');
        f67473c.put('9', 'K');
        f67473c.put('+', 'm');
        f67473c.put('/', 'C');
        f67474d = new char[64];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = f67471a;
            if (i11 >= cArr.length) {
                break;
            }
            f67474d[i11] = f67473c.get(Character.valueOf(cArr[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f67472b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 127;
            i12++;
        }
        while (true) {
            char[] cArr2 = f67474d;
            if (i10 >= cArr2.length) {
                return;
            }
            f67472b[cArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f67472b;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
            bArr[i10 + 2] = (byte) (((b12 << 6) & 192) | (b13 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public static byte[] a(String str) {
        int i10;
        int i11;
        try {
            int length = str.length();
            int i12 = i1.d.HandlerC1208d.f123895j;
            if (length < 259) {
                i12 = length;
            }
            char[] cArr = new char[i12];
            int i13 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i13];
            int i14 = 0;
            int iA = 0;
            int i15 = 0;
            while (i14 < length) {
                int i16 = i14 + 256;
                if (i16 <= length) {
                    str.getChars(i14, i16, cArr, i15);
                    i10 = i15 + 256;
                } else {
                    str.getChars(i14, length, cArr, i15);
                    i10 = (length - i14) + i15;
                }
                int i17 = i15;
                while (i15 < i10) {
                    char c10 = cArr[i15];
                    if (c10 != '=') {
                        byte[] bArr2 = f67472b;
                        if (c10 < bArr2.length && bArr2[c10] != 127) {
                            i11 = i17 + 1;
                            cArr[i17] = c10;
                            if (i11 == 4) {
                                iA += a(cArr, bArr, iA);
                                i17 = 0;
                            } else {
                                i17 = i11;
                            }
                        }
                    } else {
                        i11 = i17 + 1;
                        cArr[i17] = c10;
                        if (i11 == 4) {
                            iA += a(cArr, bArr, iA);
                            i17 = 0;
                        } else {
                            i17 = i11;
                        }
                    }
                    i15++;
                }
                i14 = i16;
                i15 = i17;
            }
            if (iA == i13) {
                return bArr;
            }
            byte[] bArr3 = new byte[iA];
            System.arraycopy(bArr, 0, bArr3, 0, iA);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & 255) << 16) + ((bArr[i10 + 1] & 255) << 8) + (bArr[i10 + 2] & 255);
                char[] cArr2 = f67474d;
                cArr[i12] = cArr2[i13 >> 18];
                cArr[i12 + 1] = cArr2[(i13 >> 12) & 63];
                int i14 = i12 + 3;
                cArr[i12 + 2] = cArr2[(i13 >> 6) & 63];
                i12 += 4;
                cArr[i14] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i15 = bArr[i10] & 255;
                char[] cArr3 = f67474d;
                cArr[i12] = cArr3[i15 >> 2];
                cArr[i12 + 1] = cArr3[(i15 << 4) & 63];
                int i16 = i12 + 3;
                cArr[i12 + 2] = G5.T;
                i12 += 4;
                cArr[i16] = G5.T;
            } else if (i11 == 2) {
                int i17 = ((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255);
                char[] cArr4 = f67474d;
                cArr[i12] = cArr4[i17 >> 10];
                cArr[i12 + 1] = cArr4[(i17 >> 4) & 63];
                int i18 = i12 + 3;
                cArr[i12 + 2] = cArr4[(i17 << 2) & 63];
                i12 += 4;
                cArr[i18] = G5.T;
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }
}
