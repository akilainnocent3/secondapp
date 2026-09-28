package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes8.dex */
public final class z3c {
    public static final String a;
    public static final String b;
    public static final char[] c;

    public static class a extends gv90 {
        @Override // defpackage.gv90
        public final void b(String str, StringWriter stringWriter) throws IOException {
            String string = str.toString();
            char[] cArr = z3c.c;
            int i = iae0.a;
            if (string != null && cArr != null) {
                int length = string.length();
                int i2 = length - 1;
                int length2 = cArr.length;
                int i3 = length2 - 1;
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = string.charAt(i4);
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string.charAt(i4 + 1)))) {
                            stringWriter.write(34);
                            stringWriter.write(iae0.a(string, z3c.a, z3c.b));
                            stringWriter.write(34);
                            return;
                        }
                    }
                }
            }
            stringWriter.write(string);
        }
    }

    public static class b extends gv90 {
        @Override // defpackage.gv90
        public final void b(String str, StringWriter stringWriter) throws IOException {
            if (str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
                stringWriter.write(str.toString());
                return;
            }
            String string = str.subSequence(1, str.length() - 1).toString();
            char[] cArr = z3c.c;
            int i = iae0.a;
            if (string != null && string.length() != 0) {
                if ((cArr != null ? Array.getLength(cArr) : 0) != 0) {
                    int length = string.length();
                    int length2 = cArr.length;
                    int i2 = length - 1;
                    int i3 = length2 - 1;
                    for (int i4 = 0; i4 < length; i4++) {
                        char cCharAt = string.charAt(i4);
                        for (int i5 = 0; i5 < length2; i5++) {
                            if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string.charAt(i4 + 1)))) {
                                stringWriter.write(iae0.a(string, z3c.b, z3c.a));
                                return;
                            }
                        }
                    }
                }
            }
            stringWriter.write(string);
        }
    }

    static {
        String strValueOf = String.valueOf('\"');
        a = strValueOf;
        b = yk10.a(strValueOf, strValueOf);
        c = new char[]{',', '\"', '\r', '\n'};
    }
}
