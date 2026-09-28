package defpackage;

import java.io.EOFException;
import java.io.IOException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class gfp extends jep {
    public static final rl5 A;
    public static final rl5 B;
    public static final rl5 C;
    public static final rl5 D;
    public static final rl5 z;
    public final cc5 e;
    public final lb5 f;
    public int i;
    public long v;
    public int w;
    public String y;

    static {
        rl5 rl5Var = rl5.d;
        z = rl5.a.c("'\\");
        A = rl5.a.c("\"\\");
        B = rl5.a.c("{}[]:, \n\t\r\f/\\;#=");
        C = rl5.a.c("\n\r");
        D = rl5.a.c("*/");
    }

    public gfp(cc5 cc5Var) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.i = 0;
        this.e = cc5Var;
        this.f = cc5Var.e();
        P(6);
    }

    @Override // defpackage.jep
    public final int F() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            long j = this.v;
            int i = (int) j;
            if (j == i) {
                this.i = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new lcp("Expected an int but was " + this.v + " at path " + m());
        }
        if (iC0 == 17) {
            long j2 = this.w;
            lb5 lb5Var = this.f;
            lb5Var.getClass();
            this.y = lb5Var.V(j2, Charsets.UTF_8);
        } else if (iC0 == 9 || iC0 == 8) {
            String strL0 = iC0 == 9 ? l0(A) : l0(z);
            this.y = strL0;
            try {
                int i3 = Integer.parseInt(strL0);
                this.i = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iC0 != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(J());
            hxa.b(sb, m());
            return 0;
        }
        this.i = 11;
        try {
            double d = Double.parseDouble(this.y);
            int i5 = (int) d;
            if (i5 != d) {
                dfp.a(this.y, "Expected an int but was ", m());
                return 0;
            }
            this.y = null;
            this.i = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            dfp.a(this.y, "Expected an int but was ", m());
            return 0;
        }
    }

    @Override // defpackage.jep
    public final void G() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 7) {
            StringBuilder sb = new StringBuilder("Expected null but was ");
            sb.append(J());
            hxa.b(sb, m());
        } else {
            this.i = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    @Override // defpackage.jep
    public final String H() {
        String strV;
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 10) {
            strV = n0();
        } else if (iC0 == 9) {
            strV = l0(A);
        } else if (iC0 == 8) {
            strV = l0(z);
        } else if (iC0 == 11) {
            strV = this.y;
            this.y = null;
        } else if (iC0 == 16) {
            strV = Long.toString(this.v);
        } else {
            if (iC0 != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(J());
                hxa.b(sb, m());
                return null;
            }
            long j = this.w;
            lb5 lb5Var = this.f;
            lb5Var.getClass();
            strV = lb5Var.V(j, Charsets.UTF_8);
        }
        this.i = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strV;
    }

    @Override // defpackage.jep
    public final jep.b J() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        switch (iC0) {
            case 1:
                return jep.b.c;
            case 2:
                return jep.b.d;
            case 3:
                return jep.b.a;
            case 4:
                return jep.b.b;
            case 5:
            case 6:
                return jep.b.v;
            case 7:
                return jep.b.w;
            case 8:
            case 9:
            case 10:
            case 11:
                return jep.b.f;
            case 12:
            case 13:
            case 14:
            case 15:
                return jep.b.e;
            case 16:
            case 17:
                return jep.b.i;
            case 18:
                return jep.b.y;
            default:
                x01.a();
                return null;
        }
    }

    @Override // defpackage.jep
    public final int V(jep.a aVar) throws fdp, EOFException {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 < 12 || iC0 > 15) {
            return -1;
        }
        if (iC0 == 15) {
            return d0(this.y, aVar);
        }
        int iH0 = this.e.H0(aVar.b);
        if (iH0 != -1) {
            this.i = 0;
            this.c[this.a - 1] = aVar.a[iH0];
            return iH0;
        }
        String str = this.c[this.a - 1];
        String strG0 = g0();
        int iD0 = d0(strG0, aVar);
        if (iD0 == -1) {
            this.i = 15;
            this.y = strG0;
            this.c[this.a - 1] = str;
        }
        return iD0;
    }

    @Override // defpackage.jep
    public final void Y() throws fdp, EOFException {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 14) {
            long jS = this.e.S(B);
            lb5 lb5Var = this.f;
            if (jS == -1) {
                jS = lb5Var.b;
            }
            lb5Var.skip(jS);
        } else if (iC0 == 13) {
            z0(A);
        } else if (iC0 == 12) {
            z0(z);
        } else if (iC0 != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(J());
            hxa.b(sb, m());
            return;
        }
        this.i = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // defpackage.jep
    public final void Z() throws fdp, EOFException {
        int i = 0;
        do {
            int iC0 = this.i;
            if (iC0 == 0) {
                iC0 = c0();
            }
            if (iC0 == 3) {
                P(1);
            } else {
                if (iC0 == 1) {
                    P(3);
                } else if (iC0 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(J());
                        hxa.b(sb, m());
                        return;
                    }
                    this.a--;
                } else if (iC0 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(J());
                        hxa.b(sb2, m());
                        return;
                    }
                    this.a--;
                } else {
                    lb5 lb5Var = this.f;
                    if (iC0 == 14 || iC0 == 10) {
                        long jS = this.e.S(B);
                        if (jS == -1) {
                            jS = lb5Var.b;
                        }
                        lb5Var.skip(jS);
                    } else if (iC0 == 9 || iC0 == 13) {
                        z0(A);
                    } else if (iC0 == 8 || iC0 == 12) {
                        z0(z);
                    } else if (iC0 == 17) {
                        lb5Var.skip(this.w);
                    } else if (iC0 == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(J());
                        hxa.b(sb3, m());
                        return;
                    }
                }
                this.i = 0;
            }
            i++;
            this.i = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final void b0() throws fdp {
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014d  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x01ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:176:0x0200  */
    /* JADX WARN: Code duplicated, block: B:178:0x020c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0214  */
    /* JADX WARN: Code duplicated, block: B:238:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x0144  */
    public final int c0() {
        int i;
        String str;
        String str2;
        long j;
        int i2;
        char cM;
        int i3;
        char c;
        int i4;
        int i5;
        byte bM;
        char c2;
        int[] iArr = this.b;
        int i6 = this.a - 1;
        int i7 = iArr[i6];
        cc5 cc5Var = this.e;
        long j2 = 0;
        lb5 lb5Var = this.f;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else if (i7 == 2) {
            int iH0 = h0(true);
            lb5Var.readByte();
            if (iH0 != 44) {
                if (iH0 != 59) {
                    if (iH0 == 93) {
                        this.i = 4;
                        return 4;
                    }
                    a0("Unterminated array");
                    throw null;
                }
                b0();
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6] = 4;
                if (i7 == 5) {
                    int iH1 = h0(true);
                    lb5Var.readByte();
                    if (iH1 != 44) {
                        if (iH1 != 59) {
                            if (iH1 == 125) {
                                this.i = 2;
                                return 2;
                            }
                            a0("Unterminated object");
                            throw null;
                        }
                        b0();
                    }
                }
                int iH2 = h0(true);
                if (iH2 == 34) {
                    lb5Var.readByte();
                    this.i = 13;
                    return 13;
                }
                if (iH2 == 39) {
                    lb5Var.readByte();
                    b0();
                    this.i = 12;
                    return 12;
                }
                if (iH2 != 125) {
                    b0();
                    if (f0((char) iH2)) {
                        this.i = 14;
                        return 14;
                    }
                    a0("Expected name");
                    throw null;
                }
                if (i7 == 5) {
                    a0("Expected name");
                    throw null;
                }
                lb5Var.readByte();
                this.i = 2;
                return 2;
            }
            if (i7 == 4) {
                iArr[i6] = 5;
                int iH3 = h0(true);
                lb5Var.readByte();
                if (iH3 != 58) {
                    if (iH3 != 61) {
                        a0("Expected ':'");
                        throw null;
                    }
                    b0();
                    if (cc5Var.request(1L) && lb5Var.m(0L) == 62) {
                        lb5Var.readByte();
                    }
                }
            } else if (i7 == 6) {
                iArr[i6] = 7;
            } else if (i7 == 7) {
                if (h0(false) == -1) {
                    this.i = 18;
                    return 18;
                }
                b0();
            } else {
                if (i7 == 9) {
                    throw null;
                }
                if (i7 == 8) {
                    ib5.a("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iH4 = h0(true);
        if (iH4 == 34) {
            lb5Var.readByte();
            this.i = 9;
            return 9;
        }
        if (iH4 == 39) {
            b0();
            lb5Var.readByte();
            this.i = 8;
            return 8;
        }
        if (iH4 != 44 && iH4 != 59) {
            if (iH4 == 91) {
                lb5Var.readByte();
                this.i = 3;
                return 3;
            }
            if (iH4 != 93) {
                if (iH4 == 123) {
                    lb5Var.readByte();
                    this.i = 1;
                    return 1;
                }
                byte bM2 = lb5Var.m(0L);
                if (bM2 == 116 || bM2 == 84) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                } else {
                    if (bM2 != 102 && bM2 != 70) {
                        if (bM2 == 110 || bM2 == 78) {
                            i = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j = 0;
                        }
                        i2 = 0;
                        if (i2 != 0) {
                            return i2;
                        }
                        boolean z2 = true;
                        long j3 = j;
                        i3 = 0;
                        boolean z3 = false;
                        c = 0;
                        while (true) {
                            i4 = i3 + 1;
                            if (cc5Var.request(i4)) {
                                bM = lb5Var.m(i3);
                                if (bM != 43) {
                                    if (bM != 69 || bM == 101) {
                                        if (c != 2 || c == 4) {
                                            c = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = 0;
                                        }
                                    } else if (bM == 45) {
                                        c2 = 6;
                                        if (c == 0) {
                                            z3 = true;
                                            c = 1;
                                        } else {
                                            if (c != 5) {
                                                i5 = 0;
                                            }
                                            c = c2;
                                        }
                                        i3 = i4;
                                    } else if (bM != 46) {
                                        if (bM >= 48 && bM <= 57) {
                                            if (c == 1 || c == 0) {
                                                j3 = -(bM - 48);
                                                c = 2;
                                            } else if (c == 2) {
                                                if (j3 != j) {
                                                    long j4 = (10 * j3) - ((long) (bM - 48));
                                                    z2 &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                    j3 = j4;
                                                }
                                            } else if (c == 3) {
                                                c = 4;
                                            } else if (c == 5 || c == 6) {
                                                c = 7;
                                            }
                                            i3 = i4;
                                        } else if (!f0(bM)) {
                                        }
                                        i5 = 0;
                                    } else if (c == 2) {
                                        c = 3;
                                        i3 = i4;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (f0(lb5Var.m(j))) {
                                        a0("Expected value");
                                        throw null;
                                    }
                                    b0();
                                    this.i = 10;
                                    return 10;
                                }
                                c2 = 6;
                                if (c != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (f0(lb5Var.m(j))) {
                                        a0("Expected value");
                                        throw null;
                                    }
                                    b0();
                                    this.i = 10;
                                    return 10;
                                }
                                c = c2;
                                i3 = i4;
                            }
                            if (c != 2 && z2 && ((j3 != Long.MIN_VALUE || z3) && (j3 != j || !z3))) {
                                if (!z3) {
                                    j3 = -j3;
                                }
                                this.v = j3;
                                lb5Var.skip(i3);
                                i5 = 16;
                                this.i = 16;
                            } else if (c != 2 || c == 4 || c == 7) {
                                this.w = i3;
                                i5 = 17;
                                this.i = 17;
                            } else {
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (f0(lb5Var.m(j))) {
                                a0("Expected value");
                                throw null;
                            }
                            b0();
                            this.i = 10;
                            return 10;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        j = j2;
                        if (!cc5Var.request(length + 1) || !f0(lb5Var.m(length))) {
                            lb5Var.skip(length);
                            this.i = i;
                            i2 = i;
                            break;
                        }
                    } else {
                        int i9 = i8 + 1;
                        j = j2;
                        if (cc5Var.request(i9) && ((cM = lb5Var.m(i8)) == str2.charAt(i8) || cM == str.charAt(i8))) {
                            i8 = i9;
                            j2 = j;
                        }
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                boolean z4 = true;
                long j5 = j;
                i3 = 0;
                boolean z5 = false;
                c = 0;
                while (true) {
                    i4 = i3 + 1;
                    if (cc5Var.request(i4)) {
                        bM = lb5Var.m(i3);
                        if (bM != 43) {
                            if (bM != 69) {
                                if (c != 2) {
                                }
                                c = 5;
                                i3 = i4;
                            } else {
                                if (c != 2) {
                                }
                                c = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (f0(lb5Var.m(j))) {
                                a0("Expected value");
                                throw null;
                            }
                            b0();
                            this.i = 10;
                            return 10;
                        }
                        c2 = 6;
                        if (c != 5) {
                            i5 = 0;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (f0(lb5Var.m(j))) {
                                a0("Expected value");
                                throw null;
                            }
                            b0();
                            this.i = 10;
                            return 10;
                        }
                        c = c2;
                        i3 = i4;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.w = i3;
                        i5 = 17;
                        this.i = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.w = i3;
                        i5 = 17;
                        this.i = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (f0(lb5Var.m(j))) {
                        a0("Expected value");
                        throw null;
                    }
                    b0();
                    this.i = 10;
                    return 10;
                }
            }
            if (i7 == 1) {
                lb5Var.readByte();
                this.i = 4;
                return 4;
            }
        }
        if (i7 != 1 && i7 != 2) {
            a0("Unexpected value");
            throw null;
        }
        b0();
        this.i = 7;
        return 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i = 0;
        this.b[0] = 8;
        this.a = 1;
        this.f.d();
        this.e.close();
    }

    @Override // defpackage.jep
    public final void d() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 3) {
            P(1);
            this.d[this.a - 1] = 0;
            this.i = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(J());
            hxa.b(sb, m());
        }
    }

    public final int d0(String str, jep.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.i = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final int e0(String str, jep.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.i = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.jep
    public final void f() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 1) {
            P(3);
            this.i = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(J());
            hxa.b(sb, m());
        }
    }

    public final boolean f0(int i) throws fdp {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b0();
        return false;
    }

    @Override // defpackage.jep
    public final void g() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(J());
            hxa.b(sb, m());
        } else {
            int i = this.a;
            this.a = i - 1;
            int[] iArr = this.d;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.i = 0;
        }
    }

    public final String g0() throws fdp, EOFException {
        String strL0;
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 14) {
            strL0 = n0();
        } else if (iC0 == 13) {
            strL0 = l0(A);
        } else if (iC0 == 12) {
            strL0 = l0(z);
        } else {
            if (iC0 != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(J());
                hxa.b(sb, m());
                return null;
            }
            strL0 = this.y;
            this.y = null;
        }
        this.i = 0;
        this.c[this.a - 1] = strL0;
        return strL0;
    }

    public final int h0(boolean z2) throws fdp, EOFException {
        cc5 cc5Var;
        long j;
        lb5 lb5Var;
        byte bM;
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                cc5Var = this.e;
                if (!cc5Var.request(i2)) {
                    if (z2) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j = i;
                lb5Var = this.f;
                bM = lb5Var.m(j);
                if (bM == 10 || bM == 32 || bM == 13 || bM == 9) {
                    i = i2;
                }
            }
            lb5Var.skip(j);
            rl5 rl5Var = C;
            if (bM == 47) {
                if (cc5Var.request(2L)) {
                    b0();
                    byte bM2 = lb5Var.m(1L);
                    if (bM2 == 42) {
                        lb5Var.readByte();
                        lb5Var.readByte();
                        rl5 rl5Var2 = D;
                        long jM0 = cc5Var.m0(rl5Var2);
                        boolean z3 = jM0 != -1;
                        lb5Var.skip(z3 ? jM0 + ((long) rl5Var2.a.length) : lb5Var.b);
                        if (!z3) {
                            a0("Unterminated comment");
                            throw null;
                        }
                    } else if (bM2 == 47) {
                        lb5Var.readByte();
                        lb5Var.readByte();
                        long jS = cc5Var.S(rl5Var);
                        lb5Var.skip(jS != -1 ? jS + 1 : lb5Var.b);
                    }
                }
                return bM;
            }
            if (bM != 35) {
                return bM;
            }
            b0();
            long jS2 = cc5Var.S(rl5Var);
            lb5Var.skip(jS2 != -1 ? jS2 + 1 : lb5Var.b);
        }
    }

    @Override // defpackage.jep
    public final void l() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(J());
            hxa.b(sb, m());
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i = 0;
    }

    public final String l0(rl5 rl5Var) throws fdp, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jS = this.e.S(rl5Var);
            if (jS == -1) {
                a0("Unterminated string");
                throw null;
            }
            lb5 lb5Var = this.f;
            if (lb5Var.m(jS) != 92) {
                if (sb == null) {
                    String strV = lb5Var.V(jS, Charsets.UTF_8);
                    lb5Var.readByte();
                    return strV;
                }
                sb.append(lb5Var.V(jS, Charsets.UTF_8));
                lb5Var.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(lb5Var.V(jS, Charsets.UTF_8));
            lb5Var.readByte();
            sb.append(u0());
        }
    }

    public final String n0() {
        long jS = this.e.S(B);
        lb5 lb5Var = this.f;
        if (jS == -1) {
            return lb5Var.Y();
        }
        lb5Var.getClass();
        return lb5Var.V(jS, Charsets.UTF_8);
    }

    @Override // defpackage.jep
    public final boolean o() {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        return (iC0 == 2 || iC0 == 4 || iC0 == 18) ? false : true;
    }

    public final String toString() {
        return "JsonReader(" + this.e + ")";
    }

    @Override // defpackage.jep
    public final double u() throws fdp {
        int iC0 = this.i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            this.i = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.v;
        }
        if (iC0 == 17) {
            long j = this.w;
            lb5 lb5Var = this.f;
            lb5Var.getClass();
            this.y = lb5Var.V(j, Charsets.UTF_8);
        } else if (iC0 == 9) {
            this.y = l0(A);
        } else if (iC0 == 8) {
            this.y = l0(z);
        } else if (iC0 == 10) {
            this.y = n0();
        } else if (iC0 != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(J());
            hxa.b(sb, m());
            return 0.0d;
        }
        this.i = 11;
        try {
            double d = Double.parseDouble(this.y);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbA = ffp.a(d, "JSON forbids NaN and infinities: ", " at path ");
                sbA.append(m());
                throw new fdp(sbA.toString());
            }
            this.y = null;
            this.i = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            dfp.a(this.y, "Expected a double but was ", m());
            return 0.0d;
        }
    }

    public final char u0() throws fdp, EOFException {
        int i;
        cc5 cc5Var = this.e;
        if (!cc5Var.request(1L)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        lb5 lb5Var = this.f;
        byte b = lb5Var.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            a0("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!cc5Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(m()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bM = lb5Var.m(i2);
            char c2 = (char) (c << 4);
            if (bM >= 48 && bM <= 57) {
                i = bM - 48;
            } else if (bM >= 97 && bM <= 102) {
                i = bM - 87;
            } else {
                if (bM < 65 || bM > 70) {
                    a0("\\u".concat(lb5Var.V(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = bM - 55;
            }
            c = (char) (i + c2);
        }
        lb5Var.skip(4L);
        return c;
    }

    public final void z0(rl5 rl5Var) throws fdp, EOFException {
        while (true) {
            long jS = this.e.S(rl5Var);
            if (jS == -1) {
                a0("Unterminated string");
                throw null;
            }
            lb5 lb5Var = this.f;
            if (lb5Var.m(jS) != 92) {
                lb5Var.skip(jS + 1);
                return;
            } else {
                lb5Var.skip(jS + 1);
                u0();
            }
        }
    }
}
