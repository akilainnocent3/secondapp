package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public class v9e0 {
    public int a;
    public final aep b;
    public String c;
    public final StringBuilder d;
    public final String e;

    public v9e0(String str) {
        str.getClass();
        aep aepVar = new aep();
        aepVar.a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        aepVar.b = iArr;
        aepVar.c = -1;
        this.b = aepVar;
        this.d = new StringBuilder();
        this.e = str;
    }

    public static /* synthetic */ void l(v9e0 v9e0Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = v9e0Var.a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        v9e0Var.k(i, str, str2);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (m(i + 3, charSequence) + (m(i, charSequence) << 12) + (m(i + 1, charSequence) << 8) + (m(i + 2, charSequence) << 4)));
            return i2;
        }
        this.a = i;
        if (i2 < charSequence.length()) {
            return a(this.a, charSequence);
        }
        l(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
    }

    public final void c(int i, String str) {
        if (n().length() - i < str.length()) {
            l(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (n().charAt(i + i2) | ' ')) {
                l(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.a = str.length() + i;
    }

    public final String d() {
        String string;
        g('\"');
        int i = this.a;
        String str = this.e;
        int iS = StringsKt.S(str, '\"', i, 4);
        if (iS == -1) {
            j();
            int i2 = this.a;
            l(this, tug.a("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iS) {
            if (str.charAt(i3) == '\\') {
                int iR = this.a;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (true) {
                    StringBuilder sb = this.d;
                    if (cCharAt == '\"') {
                        if (z) {
                            sb.append((CharSequence) n(), iR, i3);
                            string = sb.toString();
                            sb.setLength(0);
                        } else {
                            string = n().subSequence(iR, i3).toString();
                        }
                        this.a = i3 + 1;
                        return string;
                    }
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) n(), iR, i3);
                        int iR2 = r(i3 + 1);
                        if (iR2 == -1) {
                            l(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iR2 + 1;
                        char cCharAt2 = str.charAt(iR2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c = cCharAt2 < 'u' ? y77.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                l(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iR = r(iA);
                        if (iR == -1) {
                            l(this, "Unexpected EOF", iR, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) n(), iR, i3);
                            iR = r(i3);
                            if (iR == -1) {
                                l(this, "Unexpected EOF", iR, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iR;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
            } else {
                i3++;
            }
        }
        this.a = iS + 1;
        return str.substring(i, iS);
    }

    public byte e() {
        String str;
        int i = this.a;
        while (true) {
            str = this.e;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i2;
                return uzh.a(cCharAt);
            }
            i = i2;
        }
        this.a = str.length();
        return (byte) 10;
    }

    public final byte f(byte b) {
        byte bE = e();
        if (bE == b) {
            return bE;
        }
        String strD = uzh.d(b);
        int i = this.a;
        int i2 = i - 1;
        l(this, tx5.a("Expected ", strD, ", but had '", (i == n().length() || i2 < 0) ? "EOF" : String.valueOf(n().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void g(char c) {
        int i = this.a;
        if (i == -1) {
            u(c);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.a = -1;
                u(c);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.a = i2;
                if (cCharAt == c) {
                    return;
                }
                u(c);
                throw null;
            }
            i = i2;
        }
    }

    public final long h() {
        boolean z;
        boolean z2;
        double dPow;
        int iR = r(s());
        int i = 0;
        if (iR >= n().length() || iR == -1) {
            l(this, "EOF", 0, null, 6);
            throw null;
        }
        if (n().charAt(iR) == '\"') {
            iR++;
            if (iR == n().length()) {
                l(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i2 = iR;
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i2 == n().length()) {
                z = z;
                z2 = z3;
                break;
            }
            char cCharAt = n().charAt(i2);
            if ((cCharAt != 'e' && cCharAt != 'E') || z3) {
                z = z;
                if (cCharAt == '-' && z3) {
                    if (i2 == iR) {
                        l(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    i3 = i;
                } else if (cCharAt != '+' || !z3) {
                    z2 = z3;
                    if (cCharAt != '-') {
                        if (uzh.a(cCharAt) != 0) {
                            break;
                        }
                        i2++;
                        int i4 = cCharAt - '0';
                        if (i4 < 0 || i4 >= 10) {
                            l(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 6);
                            throw null;
                        }
                        if (z2) {
                            j = (j * 10) + ((long) i4);
                            z3 = z2;
                        } else {
                            j2 = (j2 * 10) - ((long) i4);
                            if (j2 > 0) {
                                l(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z = z;
                            z3 = z2;
                            i = 0;
                        }
                    } else {
                        if (i2 != iR) {
                            l(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        z = z;
                        z3 = z2;
                        z4 = true;
                    }
                } else {
                    if (i2 == iR) {
                        l(this, "Unexpected symbol '+' in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    z = z;
                    i3 = 1;
                }
            } else {
                if (i2 == iR) {
                    l(this, "Unexpected symbol " + cCharAt + " in numeric literal", i, null, 6);
                    throw null;
                }
                i2++;
                i3 = 1;
                z3 = true;
            }
        }
        boolean z5 = i2 != iR;
        if (iR == i2 || (z4 && iR == i2 - 1)) {
            l(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z) {
            if (!z5) {
                l(this, "EOF", 0, null, 6);
                throw null;
            }
            if (n().charAt(i2) != '\"') {
                l(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i2++;
        }
        this.a = i2;
        if (z2) {
            double d = j2;
            if (i3 == 0) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (i3 != 1) {
                    uhc.a();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                l(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                l(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z4) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        l(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String i() {
        String str = this.c;
        if (str == null) {
            return d();
        }
        str.getClass();
        this.c = null;
        return str;
    }

    public final String j() {
        String string;
        String str = this.c;
        if (str != null) {
            str.getClass();
            this.c = null;
            return str;
        }
        int iS = s();
        if (iS >= n().length() || iS == -1) {
            l(this, "EOF", iS, null, 4);
            throw null;
        }
        byte bA = uzh.a(n().charAt(iS));
        if (bA == 1) {
            return i();
        }
        if (bA != 0) {
            l(this, "Expected beginning of the string, but got " + n().charAt(iS), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (true) {
            byte bA2 = uzh.a(n().charAt(iS));
            StringBuilder sb = this.d;
            if (bA2 != 0) {
                int i = this.a;
                if (z) {
                    sb.append((CharSequence) n(), i, iS);
                    string = sb.toString();
                    sb.setLength(0);
                } else {
                    string = n().subSequence(i, iS).toString();
                }
                this.a = iS;
                return string;
            }
            iS++;
            if (iS >= n().length()) {
                sb.append((CharSequence) n(), this.a, iS);
                int iR = r(iS);
                if (iR == -1) {
                    this.a = iS;
                    sb.append((CharSequence) n(), 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iS = iR;
                z = true;
            }
        }
    }

    public final void k(int i, String str, String str2) {
        str2.getClass();
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbB = mq0.b(str, " at path: ");
        sbB.append(this.b.a());
        sbB.append(strConcat);
        throw jdp.c(i, n(), sbB.toString());
    }

    public final int m(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        l(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String n() {
        return this.e;
    }

    public final String o(String str) {
        str.getClass();
        int i = this.a;
        try {
            if (e() == 6 && Intrinsics.g(q(), str)) {
                this.c = null;
                if (e() == 5) {
                    return q();
                }
            }
            return null;
        } finally {
            this.a = i;
            this.c = null;
        }
    }

    public byte p() {
        String strN = n();
        int i = this.a;
        while (true) {
            int iR = r(i);
            if (iR == -1) {
                this.a = iR;
                return (byte) 10;
            }
            char cCharAt = strN.charAt(iR);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.a = iR;
                return uzh.a(cCharAt);
            }
            i = iR + 1;
        }
    }

    public final String q() {
        if (p() != 1) {
            return null;
        }
        String strI = i();
        this.c = strI;
        return strI;
    }

    public final int r(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    public int s() {
        char cCharAt;
        int i = this.a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.a = i;
        return i;
    }

    public final boolean t() {
        int iS = s();
        String strN = n();
        if (iS >= strN.length() || iS == -1 || strN.charAt(iS) != ',') {
            return false;
        }
        this.a++;
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) n());
        sb.append("', currentPosition=");
        return rr1.b(sb, this.a, ')');
    }

    public final void u(char c) {
        int i = this.a;
        if (i > 0 && c == '\"') {
            try {
                this.a = i - 1;
                String strJ = j();
                this.a = i;
                if (Intrinsics.g(strJ, "null")) {
                    k(this.a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.a = i;
                throw th;
            }
        }
        String strD = uzh.d(uzh.a(c));
        int i2 = this.a;
        int i3 = i2 - 1;
        String str = this.e;
        l(this, tx5.a("Expected ", strD, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }
}
