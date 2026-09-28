package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import java.io.EOFException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class hfp extends hep {
    public static final rl5 A;
    public static final rl5 B;
    public static final rl5 C;
    public final y740 f;
    public final lb5 i;
    public int v;
    public long w;
    public int y;
    public String z;

    static {
        rl5 rl5Var = rl5.d;
        A = rl5.a.c("'\\");
        B = rl5.a.c("\"\\");
        C = rl5.a.c("{}[]:, \n\t\r\f/\\;#=");
        rl5.a.c("\n\r");
        rl5.a.c("*/");
    }

    public hfp(y740 y740Var) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.v = 0;
        this.f = y740Var;
        this.i = y740Var.b;
        P(6);
    }

    @Override // defpackage.hep
    public final double F() throws hdp, EOFException {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            this.v = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.w;
        }
        if (iC0 == 17) {
            long j = this.y;
            lb5 lb5Var = this.i;
            lb5Var.getClass();
            this.z = lb5Var.V(j, Charsets.UTF_8);
        } else if (iC0 == 9) {
            this.z = h0(B);
        } else if (iC0 == 8) {
            this.z = h0(A);
        } else if (iC0 == 10) {
            this.z = l0();
        } else if (iC0 != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(J());
            efp.a(sb, m());
            return 0.0d;
        }
        this.v = 11;
        try {
            double d = Double.parseDouble(this.z);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sbA = ffp.a(d, "JSON forbids NaN and infinities: ", " at path ");
                sbA.append(m());
                throw new hdp(sbA.toString());
            }
            this.z = null;
            this.v = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new mcp("Expected a double but was " + this.z + " at path " + m());
        }
    }

    @Override // defpackage.hep
    public final int G() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            long j = this.w;
            int i = (int) j;
            if (j == i) {
                this.v = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new mcp("Expected an int but was " + this.w + " at path " + m());
        }
        if (iC0 == 17) {
            long j2 = this.y;
            lb5 lb5Var = this.i;
            lb5Var.getClass();
            this.z = lb5Var.V(j2, Charsets.UTF_8);
        } else if (iC0 == 9 || iC0 == 8) {
            String strH0 = iC0 == 9 ? h0(B) : h0(A);
            this.z = strH0;
            try {
                int i3 = Integer.parseInt(strH0);
                this.v = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iC0 != 11) {
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(J());
            efp.a(sb, m());
            return 0;
        }
        this.v = 11;
        try {
            double d = Double.parseDouble(this.z);
            int i5 = (int) d;
            if (i5 == d) {
                this.z = null;
                this.v = 0;
                int[] iArr3 = this.d;
                int i6 = this.a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new mcp("Expected an int but was " + this.z + " at path " + m());
        } catch (NumberFormatException unused2) {
            throw new mcp("Expected an int but was " + this.z + " at path " + m());
        }
    }

    @Override // defpackage.hep
    public final String H() {
        String strV;
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 10) {
            strV = l0();
        } else if (iC0 == 9) {
            strV = h0(B);
        } else if (iC0 == 8) {
            strV = h0(A);
        } else if (iC0 == 11) {
            strV = this.z;
            this.z = null;
        } else if (iC0 == 16) {
            strV = Long.toString(this.w);
        } else {
            if (iC0 != 17) {
                StringBuilder sb = new StringBuilder("Expected a string but was ");
                sb.append(J());
                efp.a(sb, m());
                return null;
            }
            long j = this.y;
            lb5 lb5Var = this.i;
            lb5Var.getClass();
            strV = lb5Var.V(j, Charsets.UTF_8);
        }
        this.v = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strV;
    }

    @Override // defpackage.hep
    public final hep.b J() throws hdp, EOFException {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        switch (iC0) {
            case 1:
                return hep.b.c;
            case 2:
                return hep.b.d;
            case 3:
                return hep.b.a;
            case 4:
                return hep.b.b;
            case 5:
            case 6:
                return hep.b.v;
            case 7:
                return hep.b.w;
            case 8:
            case 9:
            case 10:
            case 11:
                return hep.b.f;
            case 12:
            case 13:
            case 14:
            case 15:
                return hep.b.e;
            case 16:
            case 17:
                return hep.b.i;
            case 18:
                return hep.b.y;
            default:
                x01.a();
                return null;
        }
    }

    @Override // defpackage.hep
    public final int V(hep.a aVar) {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 < 12 || iC0 > 15) {
            return -1;
        }
        if (iC0 == 15) {
            return d0(this.z, aVar);
        }
        int iH0 = this.f.H0(aVar.b);
        if (iH0 != -1) {
            this.v = 0;
            this.c[this.a - 1] = aVar.a[iH0];
            return iH0;
        }
        String str = this.c[this.a - 1];
        String strF0 = f0();
        int iD0 = d0(strF0, aVar);
        if (iD0 == -1) {
            this.v = 15;
            this.z = strF0;
            this.c[this.a - 1] = str;
        }
        return iD0;
    }

    @Override // defpackage.hep
    public final void Y() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 14) {
            long jS = this.f.S(C);
            lb5 lb5Var = this.i;
            if (jS == -1) {
                jS = lb5Var.b;
            }
            lb5Var.skip(jS);
        } else if (iC0 == 13) {
            u0(B);
        } else if (iC0 == 12) {
            u0(A);
        } else if (iC0 != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(J());
            efp.a(sb, m());
            return;
        }
        this.v = 0;
        this.c[this.a - 1] = "null";
    }

    @Override // defpackage.hep
    public final void Z() {
        int i = 0;
        do {
            int iC0 = this.v;
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
                        efp.a(sb, m());
                        return;
                    }
                    this.a--;
                } else if (iC0 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(J());
                        efp.a(sb2, m());
                        return;
                    }
                    this.a--;
                } else {
                    lb5 lb5Var = this.i;
                    if (iC0 == 14 || iC0 == 10) {
                        long jS = this.f.S(C);
                        if (jS == -1) {
                            jS = lb5Var.b;
                        }
                        lb5Var.skip(jS);
                    } else if (iC0 == 9 || iC0 == 13) {
                        u0(B);
                    } else if (iC0 == 8 || iC0 == 12) {
                        u0(A);
                    } else if (iC0 == 17) {
                        lb5Var.skip(this.y);
                    } else if (iC0 == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(J());
                        efp.a(sb3, m());
                        return;
                    }
                }
                this.v = 0;
            }
            i++;
            this.v = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    public final void b0() throws hdp {
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.v = 0;
        this.b[0] = 8;
        this.a = 1;
        this.i.d();
        this.f.close();
    }

    @Override // defpackage.hep
    public final void d() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 3) {
            P(1);
            this.d[this.a - 1] = 0;
            this.v = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(J());
            efp.a(sb, m());
        }
    }

    public final int d0(String str, hep.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.v = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean e0(int i) throws hdp {
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
        throw null;
    }

    @Override // defpackage.hep
    public final void f() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 1) {
            P(3);
            this.v = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(J());
            efp.a(sb, m());
        }
    }

    public final String f0() {
        String strH0;
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 14) {
            strH0 = l0();
        } else if (iC0 == 13) {
            strH0 = h0(B);
        } else if (iC0 == 12) {
            strH0 = h0(A);
        } else {
            if (iC0 != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(J());
                efp.a(sb, m());
                return null;
            }
            strH0 = this.z;
        }
        this.v = 0;
        this.c[this.a - 1] = strH0;
        return strH0;
    }

    @Override // defpackage.hep
    public final void g() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 4) {
            StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
            sb.append(J());
            efp.a(sb, m());
        } else {
            int i = this.a;
            this.a = i - 1;
            int[] iArr = this.d;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.v = 0;
        }
    }

    public final int g0(boolean z) throws hdp, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            y740 y740Var = this.f;
            if (!y740Var.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            lb5 lb5Var = this.i;
            byte bM = lb5Var.m(j);
            if (bM != 10 && bM != 32 && bM != 13 && bM != 9) {
                lb5Var.skip(j);
                if (bM == 47) {
                    if (y740Var.request(2L)) {
                        b0();
                        throw null;
                    }
                } else if (bM == 35) {
                    b0();
                    throw null;
                }
                return bM;
            }
            i = i2;
        }
    }

    public final String h0(rl5 rl5Var) throws hdp, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jS = this.f.S(rl5Var);
            if (jS == -1) {
                a0("Unterminated string");
                throw null;
            }
            lb5 lb5Var = this.i;
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
            sb.append(n0());
        }
    }

    @Override // defpackage.hep
    public final void l() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 2) {
            StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
            sb.append(J());
            efp.a(sb, m());
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.v = 0;
    }

    public final String l0() {
        long jS = this.f.S(C);
        lb5 lb5Var = this.i;
        if (jS == -1) {
            return lb5Var.Y();
        }
        lb5Var.getClass();
        return lb5Var.V(jS, Charsets.UTF_8);
    }

    public final char n0() throws hdp, EOFException {
        int i;
        y740 y740Var = this.f;
        if (!y740Var.request(1L)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        lb5 lb5Var = this.i;
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
        if (!y740Var.request(4L)) {
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

    @Override // defpackage.hep
    public final boolean o() throws hdp, EOFException {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        return (iC0 == 2 || iC0 == 4 || iC0 == 18) ? false : true;
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    @Override // defpackage.hep
    public final boolean u() {
        int iC0 = this.v;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 5) {
            this.v = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iC0 != 6) {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(J());
            efp.a(sb, m());
            return false;
        }
        this.v = 0;
        int[] iArr2 = this.d;
        int i2 = this.a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final void u0(rl5 rl5Var) throws hdp, EOFException {
        while (true) {
            long jS = this.f.S(rl5Var);
            if (jS == -1) {
                a0("Unterminated string");
                throw null;
            }
            lb5 lb5Var = this.i;
            if (lb5Var.m(jS) != 92) {
                lb5Var.skip(jS + 1);
                return;
            } else {
                lb5Var.skip(jS + 1);
                n0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    public final int c0() throws hdp, EOFException {
        int i;
        String str;
        String str2;
        long j;
        char cM;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bM;
        int i6;
        int[] iArr = this.b;
        int i7 = this.a - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        lb5 lb5Var = this.i;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iG0 = g0(true);
            lb5Var.readByte();
            if (iG0 != 44) {
                if (iG0 == 59) {
                    b0();
                    throw null;
                }
                if (iG0 == 93) {
                    this.v = 4;
                    return 4;
                }
                a0("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iG1 = g0(true);
                    lb5Var.readByte();
                    if (iG1 != 44) {
                        if (iG1 == 59) {
                            b0();
                            throw null;
                        }
                        if (iG1 == 125) {
                            this.v = 2;
                            return 2;
                        }
                        a0(TEFcJcMqR.bocmxZiDmpVnrt);
                        throw null;
                    }
                }
                int iG2 = g0(true);
                if (iG2 == 34) {
                    lb5Var.readByte();
                    this.v = 13;
                    return 13;
                }
                if (iG2 == 39) {
                    lb5Var.readByte();
                    b0();
                    throw null;
                }
                if (iG2 != 125) {
                    b0();
                    throw null;
                }
                if (i8 == 5) {
                    a0("Expected name");
                    throw null;
                }
                lb5Var.readByte();
                this.v = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iG3 = g0(true);
                lb5Var.readByte();
                if (iG3 != 58) {
                    if (iG3 != 61) {
                        a0("Expected ':'");
                        throw null;
                    }
                    b0();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (g0(false) == -1) {
                        this.v = 18;
                        return 18;
                    }
                    b0();
                    throw null;
                }
                if (i8 == 8) {
                    ib5.a("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iG4 = g0(true);
        if (iG4 == 34) {
            lb5Var.readByte();
            this.v = 9;
            return 9;
        }
        if (iG4 == 39) {
            b0();
            throw null;
        }
        if (iG4 != 44 && iG4 != 59) {
            if (iG4 == 91) {
                lb5Var.readByte();
                this.v = 3;
                return 3;
            }
            if (iG4 != 93) {
                if (iG4 == 123) {
                    lb5Var.readByte();
                    this.v = 1;
                    return 1;
                }
                byte bM2 = lb5Var.m(0L);
                y740 y740Var = this.f;
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
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (y740Var.request(i4)) {
                                bM = lb5Var.m(i3);
                                if (bM != 43) {
                                    if (bM != 69 || bM == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bM == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bM != 46) {
                                        if (bM >= 48 && bM <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bM - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bM - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!e0(bM)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (e0(lb5Var.m(j))) {
                                        b0();
                                        throw null;
                                    }
                                    a0("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (e0(lb5Var.m(j))) {
                                        a0("Expected value");
                                        throw null;
                                    }
                                    b0();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.w = j2;
                                lb5Var.skip(i3);
                                i5 = 16;
                                this.v = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.y = i3;
                                i5 = 17;
                                this.v = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (e0(lb5Var.m(j))) {
                                a0("Expected value");
                                throw null;
                            }
                            b0();
                            throw null;
                        }
                    }
                    i = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!y740Var.request(length + 1) || !e0(lb5Var.m(length))) {
                            lb5Var.skip(length);
                            this.v = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (y740Var.request(i13) && ((cM = lb5Var.m(i12)) == str2.charAt(i12) || cM == str.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (y740Var.request(i4)) {
                        bM = lb5Var.m(i3);
                        if (bM != 43) {
                            if (bM != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (e0(lb5Var.m(j))) {
                                a0("Expected value");
                                throw null;
                            }
                            b0();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (e0(lb5Var.m(j))) {
                                a0("Expected value");
                                throw null;
                            }
                            b0();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.y = i3;
                        i5 = 17;
                        this.v = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.y = i3;
                        i5 = 17;
                        this.v = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (e0(lb5Var.m(j))) {
                        a0("Expected value");
                        throw null;
                    }
                    b0();
                    throw null;
                }
            }
            if (i8 == 1) {
                lb5Var.readByte();
                this.v = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            b0();
            throw null;
        }
        a0("Unexpected value");
        throw null;
    }
}
