package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class ifp extends rfp {
    public static final String[] w = new String[128];
    public final bc5 i;
    public String v;

    static {
        for (int i = 0; i <= 31; i++) {
            w[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public ifp(bc5 bc5Var) {
        this.a = 0;
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.f = -1;
        if (bc5Var == null) {
            bmy.a("sink == null");
            throw null;
        }
        this.i = bc5Var;
        G(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void c0(bc5 bc5Var, String str) {
        String str2;
        bc5Var.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = w[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        bc5Var.n1(i, i2, str);
                    }
                    bc5Var.R(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    bc5Var.n1(i, i2, str);
                }
                bc5Var.R(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            bc5Var.n1(i, length, str);
        }
        bc5Var.writeByte(34);
    }

    @Override // defpackage.rfp
    public final rfp H(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            pfp.a(d, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.e) {
            this.e = false;
            o(Double.toString(d));
            return this;
        }
        d0();
        Z();
        this.i.R(Double.toString(d));
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.rfp
    public final rfp J(long j) {
        if (this.e) {
            this.e = false;
            o(Long.toString(j));
            return this;
        }
        d0();
        Z();
        this.i.R(Long.toString(j));
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.rfp
    public final rfp P(Float f) {
        String string = f.toString();
        if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
            z9l.a(f, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.e) {
            this.e = false;
            o(string);
            return this;
        }
        d0();
        Z();
        this.i.R(string);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.rfp
    public final rfp V(String str) {
        if (str == null) {
            u();
            return this;
        }
        if (this.e) {
            this.e = false;
            o(str);
            return this;
        }
        d0();
        Z();
        c0(this.i, str);
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.rfp
    public final rfp Y(boolean z) {
        if (this.e) {
            ib5.a("Boolean cannot be used as a map key in JSON at path ".concat(m()));
            return null;
        }
        d0();
        Z();
        this.i.R(z ? "true" : "false");
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void Z() {
        int iF = F();
        int i = 2;
        if (iF != 1) {
            bc5 bc5Var = this.i;
            if (iF == 2) {
                bc5Var.writeByte(44);
            } else if (iF == 4) {
                bc5Var.R(":");
                i = 5;
            } else if (iF == 9) {
                ib5.a("Sink from valueSink() was not closed");
                return;
            } else {
                if (iF != 6) {
                    if (iF == 7) {
                        ib5.a("JSON must have only one top-level value.");
                        return;
                    } else {
                        ib5.a("Nesting problem.");
                        return;
                    }
                }
                i = 7;
            }
        }
        this.b[this.a - 1] = i;
    }

    public final void a0(int i, int i2, char c) {
        int iF = F();
        if (iF != i2 && iF != i) {
            ib5.a("Nesting problem.");
            return;
        }
        if (this.v != null) {
            uj5.a(this.v, "Dangling name: ");
            return;
        }
        int i3 = this.a;
        int i4 = ~this.f;
        if (i3 == i4) {
            this.f = i4;
            return;
        }
        int i5 = i3 - 1;
        this.a = i5;
        this.c[i5] = null;
        int[] iArr = this.d;
        int i6 = i3 - 2;
        iArr[i6] = iArr[i6] + 1;
        this.i.writeByte(c);
    }

    public final void b0(int i, int i2, char c) {
        int i3;
        int i4 = this.a;
        int i5 = this.f;
        if (i4 == i5 && ((i3 = this.b[i4 - 1]) == i || i3 == i2)) {
            this.f = ~i5;
            return;
        }
        Z();
        int i6 = this.a;
        int[] iArr = this.b;
        if (i6 == iArr.length) {
            if (i6 == 256) {
                throw new lcp("Nesting too deep at " + m() + ": circular reference?");
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        G(i);
        this.d[this.a - 1] = 0;
        this.i.writeByte(c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.i.close();
        int i = this.a;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            i08.a("Incomplete document");
        } else {
            this.a = 0;
        }
    }

    @Override // defpackage.rfp
    public final rfp d() {
        if (this.e) {
            ib5.a("Array cannot be used as a map key in JSON at path ".concat(m()));
            return null;
        }
        d0();
        b0(1, 2, '[');
        return this;
    }

    public final void d0() {
        if (this.v != null) {
            int iF = F();
            bc5 bc5Var = this.i;
            if (iF == 5) {
                bc5Var.writeByte(44);
            } else if (iF != 3) {
                ib5.a("Nesting problem.");
                return;
            }
            this.b[this.a - 1] = 4;
            c0(bc5Var, this.v);
            this.v = null;
        }
    }

    @Override // defpackage.rfp
    public final rfp f() {
        if (this.e) {
            ib5.a("Object cannot be used as a map key in JSON at path ".concat(m()));
            return null;
        }
        d0();
        b0(3, 5, '{');
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.a != 0) {
            this.i.flush();
        } else {
            ib5.a("JsonWriter is closed.");
        }
    }

    @Override // defpackage.rfp
    public final rfp g() {
        a0(1, 2, ']');
        return this;
    }

    @Override // defpackage.rfp
    public final rfp l() {
        this.e = false;
        a0(3, 5, '}');
        return this;
    }

    @Override // defpackage.rfp
    public final rfp o(String str) {
        if (str == null) {
            bmy.a("name == null");
            return null;
        }
        if (this.a == 0) {
            ib5.a("JsonWriter is closed.");
            return null;
        }
        int iF = F();
        if ((iF != 3 && iF != 5) || this.v != null || this.e) {
            ib5.a("Nesting problem.");
            return null;
        }
        this.v = str;
        this.c[this.a - 1] = str;
        return this;
    }

    @Override // defpackage.rfp
    public final rfp u() {
        if (this.e) {
            ib5.a("null cannot be used as a map key in JSON at path ".concat(m()));
            return null;
        }
        if (this.v != null) {
            this.v = null;
            return this;
        }
        Z();
        this.i.R("null");
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
