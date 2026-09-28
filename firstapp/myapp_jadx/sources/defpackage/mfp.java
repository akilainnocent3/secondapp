package defpackage;

import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.Iterator;
import java.util.regex.Pattern;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class mfp implements Iterable<mfp> {
    public c a;
    public String b;
    public double c;
    public long d;
    public String e;
    public mfp f;
    public mfp i;
    public mfp v;
    public int w;

    public static class b {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c i;
        public static final /* synthetic */ c[] v;

        static {
            c cVar = new c("object", 0);
            a = cVar;
            c cVar2 = new c("array", 1);
            b = cVar2;
            c cVar3 = new c("stringValue", 2);
            c = cVar3;
            c cVar4 = new c("doubleValue", 3);
            d = cVar4;
            c cVar5 = new c("longValue", 4);
            e = cVar5;
            c cVar6 = new c("booleanValue", 5);
            f = cVar6;
            c cVar7 = new c("nullValue", 6);
            i = cVar7;
            v = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) v.clone();
        }
    }

    public mfp(c cVar) {
        this.a = cVar;
    }

    public static void q(int i, j9e0 j9e0Var) {
        for (int i2 = 0; i2 < i; i2++) {
            j9e0Var.b('\t');
        }
    }

    public final boolean a() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            return this.b.equalsIgnoreCase("true");
        }
        if (iOrdinal == 3) {
            return this.c != 0.0d;
        }
        if (iOrdinal == 4) {
            return this.d != 0;
        }
        if (iOrdinal == 5) {
            return this.d != 0;
        }
        uj5.a(this.a, "Value cannot be converted to boolean: ");
        return false;
    }

    public final float b() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            return Float.parseFloat(this.b);
        }
        if (iOrdinal == 3) {
            return (float) this.c;
        }
        if (iOrdinal == 4) {
            return this.d;
        }
        if (iOrdinal == 5) {
            return this.d != 0 ? 1.0f : 0.0f;
        }
        uj5.a(this.a, "Value cannot be converted to float: ");
        return 0.0f;
    }

    public final float[] c() {
        float f;
        if (this.a != c.b) {
            uj5.a(this.a, "Value is not an array: ");
            return null;
        }
        float[] fArr = new float[this.w];
        mfp mfpVar = this.f;
        int i = 0;
        while (mfpVar != null) {
            int iOrdinal = mfpVar.a.ordinal();
            if (iOrdinal == 2) {
                f = Float.parseFloat(mfpVar.b);
            } else if (iOrdinal == 3) {
                f = (float) mfpVar.c;
            } else if (iOrdinal == 4) {
                f = mfpVar.d;
            } else {
                if (iOrdinal != 5) {
                    uj5.a(mfpVar.a, "Value cannot be converted to float: ");
                    return null;
                }
                f = mfpVar.d != 0 ? 1.0f : 0.0f;
            }
            fArr[i] = f;
            mfpVar = mfpVar.i;
            i++;
        }
        return fArr;
    }

    public final int d() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            return Integer.parseInt(this.b);
        }
        if (iOrdinal == 3) {
            return (int) this.c;
        }
        if (iOrdinal == 4) {
            return (int) this.d;
        }
        if (iOrdinal == 5) {
            return this.d != 0 ? 1 : 0;
        }
        uj5.a(this.a, "Value cannot be converted to int: ");
        return 0;
    }

    public final long e() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            return Long.parseLong(this.b);
        }
        if (iOrdinal == 3) {
            return (long) this.c;
        }
        if (iOrdinal == 4) {
            return this.d;
        }
        if (iOrdinal == 5) {
            return this.d != 0 ? 1L : 0L;
        }
        uj5.a(this.a, "Value cannot be converted to long: ");
        return 0L;
    }

    public final short[] f() {
        short s;
        int i;
        if (this.a != c.b) {
            uj5.a(this.a, "Value is not an array: ");
            return null;
        }
        short[] sArr = new short[this.w];
        mfp mfpVar = this.f;
        int i2 = 0;
        while (mfpVar != null) {
            int iOrdinal = mfpVar.a.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i = (int) mfpVar.c;
                } else if (iOrdinal == 4) {
                    i = (int) mfpVar.d;
                } else {
                    if (iOrdinal != 5) {
                        uj5.a(mfpVar.a, "Value cannot be converted to short: ");
                        return null;
                    }
                    s = mfpVar.d != 0 ? (short) 1 : (short) 0;
                }
                s = (short) i;
            } else {
                s = Short.parseShort(mfpVar.b);
            }
            sArr[i2] = s;
            mfpVar = mfpVar.i;
            i2++;
        }
        return sArr;
    }

    public final String h() {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 2) {
            return this.b;
        }
        if (iOrdinal == 3) {
            String str = this.b;
            return str != null ? str : Double.toString(this.c);
        }
        if (iOrdinal == 4) {
            String str2 = this.b;
            return str2 != null ? str2 : Long.toString(this.d);
        }
        if (iOrdinal == 5) {
            return this.d != 0 ? "true" : "false";
        }
        if (iOrdinal == 6) {
            return null;
        }
        uj5.a(this.a, "Value cannot be converted to string: ");
        return null;
    }

    public final mfp i(String str) {
        mfp mfpVar = this.f;
        while (mfpVar != null) {
            String str2 = mfpVar.e;
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                break;
            }
            mfpVar = mfpVar.i;
        }
        return mfpVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<mfp> iterator() {
        return new a();
    }

    public final boolean j(String str, boolean z) {
        mfp mfpVarI = i(str);
        return (mfpVarI == null || !mfpVarI.r() || mfpVarI.a == c.i) ? z : mfpVarI.a();
    }

    public final mfp k(String str) {
        mfp mfpVarI = i(str);
        if (mfpVarI == null) {
            return null;
        }
        return mfpVarI.f;
    }

    public final float l(String str, float f) {
        mfp mfpVarI = i(str);
        return (mfpVarI == null || !mfpVarI.r() || mfpVarI.a == c.i) ? f : mfpVarI.b();
    }

    public final int m(String str) {
        mfp mfpVarI = i(str);
        if (mfpVarI != null) {
            return mfpVarI.d();
        }
        hb5.a("Named value not found: ".concat(str));
        return 0;
    }

    public final int n(String str, int i) {
        mfp mfpVarI = i(str);
        return (mfpVarI == null || !mfpVarI.r() || mfpVarI.a == c.i) ? i : mfpVarI.d();
    }

    public final String o(String str) {
        mfp mfpVarI = i(str);
        if (mfpVarI != null) {
            return mfpVarI.h();
        }
        hb5.a("Named value not found: ".concat(str));
        return null;
    }

    public final String p(String str, String str2) {
        mfp mfpVarI = i(str);
        return (mfpVarI == null || !mfpVarI.r() || mfpVarI.a == c.i) ? str2 : mfpVarI.h();
    }

    public final boolean r() {
        int iOrdinal = this.a.ordinal();
        return iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6;
    }

    public final mfp t(String str) {
        mfp mfpVarI = i(str);
        if (mfpVarI != null) {
            return mfpVarI;
        }
        hb5.a("Child not found with name: ".concat(str));
        return null;
    }

    public final String toString() {
        boolean zR = r();
        String str = this.e;
        if (!zR) {
            String strA = str == null ? "" : uf80.a(new StringBuilder(), this.e, ": ");
            Pattern pattern = qfp.a;
            b bVar = new b();
            j9e0 j9e0Var = new j9e0(512);
            s(this, j9e0Var, 0, bVar);
            return strA.concat(j9e0Var.toString());
        }
        if (str == null) {
            return h();
        }
        return this.e + ": " + h();
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    public static void s(mfp mfpVar, j9e0 j9e0Var, int i, b bVar) {
        double d;
        int i2;
        boolean z;
        boolean z2;
        char c2;
        boolean z3;
        String string;
        Pattern pattern = qfp.a;
        c cVar = mfpVar.a;
        c cVar2 = c.b;
        c cVar3 = c.a;
        if (cVar == cVar3) {
            mfp mfpVar2 = mfpVar.f;
            if (mfpVar2 == null) {
                j9e0Var.c("{}");
                return;
            }
            while (true) {
                if (mfpVar2 != null) {
                    c cVar4 = mfpVar2.a;
                    if (cVar4 == cVar3 || cVar4 == cVar2) {
                        z3 = false;
                        break;
                    }
                    mfpVar2 = mfpVar2.i;
                } else {
                    z3 = true;
                    break;
                }
            }
            boolean z4 = !z3;
            int i3 = j9e0Var.b;
            loop1: while (true) {
                j9e0Var.c(z4 ? "{\n" : "{ ");
                mfp mfpVar3 = mfpVar.f;
                while (true) {
                    if (mfpVar3 == null) {
                        break loop1;
                    }
                    if (z4) {
                        q(i, j9e0Var);
                    }
                    String str = mfpVar3.e;
                    boolean z5 = z4;
                    j9e0 j9e0Var2 = new j9e0(str);
                    j9e0Var2.g('\\', "\\\\");
                    j9e0Var2.g('\r', "\\r");
                    j9e0Var2.g('\n', "\\n");
                    j9e0Var2.g('\t', "\\t");
                    if ((str.contains("//") || str.contains("/*") || !qfp.b.matcher(j9e0Var2).matches()) && !qfp.a.matcher(j9e0Var2).matches()) {
                        StringBuilder sb = new StringBuilder("\"");
                        j9e0Var2.g('\"', "\\\"");
                        sb.append(j9e0Var2.toString());
                        sb.append('\"');
                        string = sb.toString();
                    } else {
                        string = j9e0Var2.toString();
                    }
                    j9e0Var.c(string);
                    j9e0Var.c(": ");
                    s(mfpVar3, j9e0Var, i + 1, bVar);
                    if (z5) {
                        Pattern pattern2 = qfp.a;
                    } else if (mfpVar3.i != null) {
                        j9e0Var.b(',');
                    }
                    j9e0Var.b(z5 ? '\n' : ' ');
                    if (z5 || j9e0Var.b - i3 <= 0) {
                        mfpVar3 = mfpVar3.i;
                        i = i;
                        z4 = z5;
                    }
                }
                j9e0Var.h(i3);
                z4 = true;
            }
            if (z4) {
                q(i - 1, j9e0Var);
            }
            j9e0Var.b('}');
            return;
        }
        c cVar5 = c.e;
        c cVar6 = c.d;
        if (cVar == cVar2) {
            mfp mfpVar4 = mfpVar.f;
            if (mfpVar4 == null) {
                j9e0Var.c(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI);
                return;
            }
            while (true) {
                if (mfpVar4 != null) {
                    c cVar7 = mfpVar4.a;
                    if (cVar7 == cVar3 || cVar7 == cVar2) {
                        z = false;
                        break;
                    }
                    mfpVar4 = mfpVar4.i;
                } else {
                    z = true;
                    break;
                }
            }
            boolean z6 = !z;
            mfp mfpVar5 = mfpVar.f;
            while (true) {
                if (mfpVar5 != null) {
                    c cVar8 = mfpVar5.a;
                    if (cVar8 != cVar6 && cVar8 != cVar5) {
                        z2 = true;
                        break;
                    }
                    mfpVar5 = mfpVar5.i;
                } else {
                    z2 = false;
                    break;
                }
            }
            int i4 = j9e0Var.b;
            loop5: while (true) {
                j9e0Var.c(z6 ? "[\n" : "[ ");
                mfp mfpVar6 = mfpVar.f;
                while (true) {
                    if (mfpVar6 == null) {
                        break loop5;
                    }
                    if (z6) {
                        q(i, j9e0Var);
                    }
                    s(mfpVar6, j9e0Var, i + 1, bVar);
                    if (z6) {
                        Pattern pattern3 = qfp.a;
                    } else {
                        if (mfpVar6.i != null) {
                            j9e0Var.b(',');
                        }
                        if (z6) {
                            c2 = '\n';
                        } else {
                            c2 = ' ';
                        }
                        j9e0Var.b(c2);
                        if (z2 || z6 || j9e0Var.b - i4 <= 0) {
                            mfpVar6 = mfpVar6.i;
                        }
                    }
                    if (z6) {
                        c2 = '\n';
                    } else {
                        c2 = ' ';
                    }
                    j9e0Var.b(c2);
                    if (z2) {
                    }
                    mfpVar6 = mfpVar6.i;
                }
                j9e0Var.h(i4);
                z6 = true;
            }
            if (z6) {
                q(i - 1, j9e0Var);
            }
            j9e0Var.b(']');
            return;
        }
        c cVar9 = c.c;
        String string2 = lTGEJfVytU.CvY;
        if (cVar == cVar9) {
            String strH = mfpVar.h();
            if (strH != null) {
                String string3 = strH.toString();
                j9e0 j9e0Var3 = new j9e0(string3);
                j9e0Var3.g('\\', "\\\\");
                j9e0Var3.g('\r', "\\r");
                j9e0Var3.g('\n', "\\n");
                j9e0Var3.g('\t', "\\t");
                if (string3.equals("true") || string3.equals("false") || string3.equals(string2) || string3.contains("//") || string3.contains("/*") || (i2 = j9e0Var3.b) <= 0 || j9e0Var3.charAt(i2 - 1) == ' ' || !qfp.c.matcher(j9e0Var3).matches()) {
                    StringBuilder sb2 = new StringBuilder("\"");
                    j9e0Var3.g('\"', "\\\"");
                    sb2.append(j9e0Var3.toString());
                    sb2.append('\"');
                    string2 = sb2.toString();
                } else {
                    string2 = j9e0Var3.toString();
                }
            }
            j9e0Var.c(string2);
            return;
        }
        if (cVar == cVar6) {
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 2) {
                d = Double.parseDouble(mfpVar.b);
            } else if (iOrdinal == 3) {
                d = mfpVar.c;
            } else if (iOrdinal == 4) {
                d = mfpVar.d;
            } else {
                if (iOrdinal != 5) {
                    uj5.a(mfpVar.a, "Value cannot be converted to double: ");
                    return;
                }
                d = mfpVar.d != 0 ? 1.0d : 0.0d;
            }
            double dE = mfpVar.e();
            if (d == dE) {
                d = dE;
            }
            j9e0Var.c(Double.toString(d));
            return;
        }
        if (cVar != cVar5) {
            if (cVar == c.f) {
                j9e0Var.c(mfpVar.a() ? "true" : "false");
                return;
            } else if (cVar == c.i) {
                j9e0Var.c(string2);
                return;
            } else {
                sxa.b(mfpVar, "Unknown object type: ");
                return;
            }
        }
        long jE = mfpVar.e();
        if (jE == Long.MIN_VALUE) {
            j9e0Var.c("-9223372036854775808");
            return;
        }
        if (jE < 0) {
            j9e0Var.b('-');
            jE = -jE;
        }
        char[] cArr = j9e0.c;
        if (jE >= 10000) {
            if (jE >= 1000000000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 1.0E19d) / 1.0E18d)]);
            }
            if (jE >= 100000000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 1000000000000000000L) / 100000000000000000L)]);
            }
            if (jE >= 10000000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 100000000000000000L) / 10000000000000000L)]);
            }
            if (jE >= 1000000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 10000000000000000L) / 1000000000000000L)]);
            }
            if (jE >= 100000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 1000000000000000L) / 100000000000000L)]);
            }
            if (jE >= 10000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 100000000000000L) / 10000000000000L)]);
            }
            if (jE >= 1000000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 10000000000000L) / 1000000000000L)]);
            }
            if (jE >= 100000000000L) {
                j9e0Var.b(cArr[(int) ((jE % 1000000000000L) / 100000000000L)]);
            }
            if (jE >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                j9e0Var.b(cArr[(int) ((jE % 100000000000L) / RealConnection.IDLE_CONNECTION_HEALTHY_NS)]);
            }
            if (jE >= 1000000000) {
                j9e0Var.b(cArr[(int) ((jE % RealConnection.IDLE_CONNECTION_HEALTHY_NS) / 1000000000)]);
            }
            if (jE >= 100000000) {
                j9e0Var.b(cArr[(int) ((jE % 1000000000) / 100000000)]);
            }
            if (jE >= 10000000) {
                j9e0Var.b(cArr[(int) ((jE % 100000000) / 10000000)]);
            }
            if (jE >= 1000000) {
                j9e0Var.b(cArr[(int) ((jE % 10000000) / 1000000)]);
            }
            if (jE >= 100000) {
                j9e0Var.b(cArr[(int) ((jE % 1000000) / 100000)]);
            }
            j9e0Var.b(cArr[(int) ((jE % 100000) / 10000)]);
        }
        if (jE >= 1000) {
            j9e0Var.b(cArr[(int) ((jE % 10000) / 1000)]);
        }
        if (jE >= 100) {
            j9e0Var.b(cArr[(int) ((jE % 1000) / 100)]);
        }
        if (jE >= 10) {
            j9e0Var.b(cArr[(int) ((jE % 100) / 10)]);
        }
        j9e0Var.b(cArr[(int) (jE % 10)]);
    }

    public class a implements Iterator<mfp>, Iterable<mfp> {
        public mfp a;
        public mfp b;

        public a() {
            this.a = mfp.this.f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != null;
        }

        @Override // java.util.Iterator
        public final mfp next() {
            mfp mfpVar = this.a;
            this.b = mfpVar;
            if (mfpVar != null) {
                this.a = mfpVar.i;
                return mfpVar;
            }
            lrh0.a();
            return null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            mfp mfpVar = this.b;
            mfp mfpVar2 = mfpVar.v;
            mfp mfpVar3 = mfpVar.i;
            mfp mfpVar4 = mfp.this;
            if (mfpVar2 == null) {
                mfpVar4.f = mfpVar3;
                if (mfpVar3 != null) {
                    mfpVar3.v = null;
                }
            } else {
                mfpVar2.i = mfpVar3;
                mfp mfpVar5 = mfpVar.i;
                if (mfpVar5 != null) {
                    mfpVar5.v = mfpVar2;
                }
            }
            mfpVar4.w--;
        }

        @Override // java.lang.Iterable
        public final Iterator<mfp> iterator() {
            return this;
        }
    }
}
