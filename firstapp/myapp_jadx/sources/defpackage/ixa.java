package defpackage;

import com.google.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ixa {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final ewa K;
    public final ewa L;
    public final ewa M;
    public final ewa N;
    public final ewa O;
    public final ewa P;
    public final ewa Q;
    public final ewa R;
    public final ewa[] S;
    public final ArrayList<ewa> T;
    public final boolean[] U;
    public a[] V;
    public ixa W;
    public int X;
    public int Y;
    public float Z;
    public boolean a;
    public int a0;
    public hw6 b;
    public int b0;
    public hw6 c;
    public int c0;
    public vjm d;
    public int d0;
    public c3i0 e;
    public int e0;
    public final boolean[] f;
    public int f0;
    public boolean g;
    public float g0;
    public int h;
    public float h0;
    public int i;
    public Object i0;
    public final u6j0 j;
    public int j0;
    public String k;
    public boolean k0;
    public boolean l;
    public String l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public boolean o;
    public final float[] o0;
    public int p;
    public final ixa[] p0;
    public int q;
    public final ixa[] q0;
    public int r;
    public ixa r0;
    public int s;
    public ixa s0;
    public int t;
    public int t0;
    public final int[] u;
    public int u0;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("FIXED", 0);
            a = aVar;
            a aVar2 = new a("WRAP_CONTENT", 1);
            b = aVar2;
            a aVar3 = new a("MATCH_CONSTRAINT", 2);
            c = aVar3;
            a aVar4 = new a("MATCH_PARENT", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public ixa() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new u6j0(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Reader.READ_DONE, Reader.READ_DONE};
        this.E = Float.NaN;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ewa ewaVar = new ewa(this, ewa.a.a);
        this.K = ewaVar;
        ewa ewaVar2 = new ewa(this, ewa.a.b);
        this.L = ewaVar2;
        ewa ewaVar3 = new ewa(this, ewa.a.c);
        this.M = ewaVar3;
        ewa ewaVar4 = new ewa(this, ewa.a.d);
        this.N = ewaVar4;
        ewa ewaVar5 = new ewa(this, ewa.a.e);
        this.O = ewaVar5;
        this.P = new ewa(this, ewa.a.i);
        this.Q = new ewa(this, ewa.a.v);
        ewa ewaVar6 = new ewa(this, ewa.a.f);
        this.R = ewaVar6;
        this.S = new ewa[]{ewaVar, ewaVar3, ewaVar2, ewaVar4, ewaVar5, ewaVar6};
        this.T = new ArrayList<>();
        this.U = new boolean[2];
        a aVar = a.a;
        this.V = new a[]{aVar, aVar};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new ixa[]{null, null};
        this.q0 = new ixa[]{null, null};
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        a();
    }

    public static void I(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        wxa.b(i, str, " :   ", ",\n", sb);
    }

    public static void J(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void q(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, a aVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = aVar.toString();
        if (!"FIXED".equals(string)) {
            hxa.c(sb, "      behavior", " :   ", string, ",\n");
        }
        I(i, 0, "      size", sb);
        I(i2, 0, "      min", sb);
        I(i3, Reader.READ_DONE, "      max", sb);
        I(i4, 0, "      matchMin", sb);
        I(i5, 0, "      matchDef", sb);
        J(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void r(StringBuilder sb, String str, ewa ewaVar) {
        if (ewaVar.f == null) {
            return;
        }
        u4.a(sb, "    ", str, " : [ '");
        sb.append(ewaVar.f);
        sb.append("'");
        if (ewaVar.h != Integer.MIN_VALUE || ewaVar.g != 0) {
            sb.append(",");
            sb.append(ewaVar.g);
            if (ewaVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(ewaVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        ewa ewaVar = this.L;
        ewa ewaVar2 = ewaVar.f;
        if (ewaVar2 != null && ewaVar2.f == ewaVar) {
            return true;
        }
        ewa ewaVar3 = this.N;
        ewa ewaVar4 = ewaVar3.f;
        return ewaVar4 != null && ewaVar4.f == ewaVar3;
    }

    public final boolean B() {
        return this.g && this.j0 != 8;
    }

    public boolean C() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public boolean D() {
        if (this.m) {
            return true;
        }
        return this.L.c && this.N.c;
    }

    public void E() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = Float.NaN;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        a[] aVarArr = this.V;
        a aVar = a.a;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.i0 = null;
        this.j0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float[] fArr = this.o0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Reader.READ_DONE;
        this.z = Reader.READ_DONE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void F() {
        ixa ixaVar = this.W;
        if (ixaVar != null && (ixaVar instanceof jxa)) {
            ((jxa) ixaVar).getClass();
        }
        ArrayList<ewa> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).j();
        }
    }

    public final void G() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList<ewa> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ewa ewaVar = arrayList.get(i);
            ewaVar.c = false;
            ewaVar.b = 0;
        }
    }

    public void H(dr5 dr5Var) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void K(int i) {
        this.d0 = i;
        this.F = i > 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public final void L(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.Z = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.Z = fAbs;
            this.a0 = i3;
        }
    }

    public final void M(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        this.l = true;
    }

    public final void N(int i, int i2) {
        if (this.m) {
            return;
        }
        this.L.l(i);
        this.N.l(i2);
        this.c0 = i;
        this.Y = i2 - i;
        if (this.F) {
            this.O.l(i + this.d0);
        }
        this.m = true;
    }

    public final void O(int i) {
        this.Y = i;
        int i2 = this.f0;
        if (i < i2) {
            this.Y = i2;
        }
    }

    public final void P(a aVar) {
        this.V[0] = aVar;
    }

    public final void Q(float f, int i, int i2, int i3) {
        this.s = i;
        this.v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.w = i3;
        this.x = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.s = 2;
    }

    public final void R(a aVar) {
        this.V[1] = aVar;
    }

    public final void S(float f, int i, int i2, int i3) {
        this.t = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void T(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public void U(boolean z, boolean z2) {
        int i;
        int i2;
        vjm vjmVar = this.d;
        boolean z3 = z & vjmVar.g;
        c3i0 c3i0Var = this.e;
        boolean z4 = z2 & c3i0Var.g;
        int i3 = vjmVar.h.g;
        int i4 = c3i0Var.h.g;
        int i5 = vjmVar.i.g;
        int i6 = c3i0Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.b0 = i3;
        }
        if (z4) {
            this.c0 = i4;
        }
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        a aVar = a.a;
        if (z3) {
            if (this.V[0] == aVar && i8 < (i2 = this.X)) {
                i8 = i2;
            }
            this.X = i8;
            int i10 = this.e0;
            if (i8 < i10) {
                this.X = i10;
            }
        }
        if (z4) {
            if (this.V[1] == aVar && i9 < (i = this.Y)) {
                i9 = i;
            }
            this.Y = i9;
            int i11 = this.f0;
            if (i9 < i11) {
                this.Y = i11;
            }
        }
    }

    public void V(ofs ofsVar, boolean z) {
        int i;
        int i2;
        c3i0 c3i0Var;
        vjm vjmVar;
        ofsVar.getClass();
        int iN = ofs.n(this.K);
        int iN2 = ofs.n(this.L);
        int iN3 = ofs.n(this.M);
        int iN4 = ofs.n(this.N);
        if (z && (vjmVar = this.d) != null) {
            zmd zmdVar = vjmVar.h;
            if (zmdVar.j) {
                zmd zmdVar2 = vjmVar.i;
                if (zmdVar2.j) {
                    iN = zmdVar.g;
                    iN3 = zmdVar2.g;
                }
            }
        }
        if (z && (c3i0Var = this.e) != null) {
            zmd zmdVar3 = c3i0Var.h;
            if (zmdVar3.j) {
                zmd zmdVar4 = c3i0Var.i;
                if (zmdVar4.j) {
                    iN2 = zmdVar3.g;
                    iN4 = zmdVar4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.b0 = iN;
        this.c0 = iN2;
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        a[] aVarArr = this.V;
        a aVar = aVarArr[0];
        a aVar2 = a.a;
        if (aVar == aVar2 && i4 < (i2 = this.X)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.Y)) {
            i5 = i;
        }
        this.X = i4;
        this.Y = i5;
        int i6 = this.f0;
        if (i5 < i6) {
            this.Y = i6;
        }
        int i7 = this.e0;
        if (i4 < i7) {
            this.X = i7;
        } else {
            i7 = i4;
        }
        int i8 = this.w;
        a aVar3 = a.c;
        if (i8 > 0 && aVar == aVar3) {
            this.X = Math.min(i7, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && this.V[1] == aVar3) {
            this.Y = Math.min(this.Y, i9);
        }
        int i10 = this.X;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.Y;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void a() {
        ewa ewaVar = this.K;
        ArrayList<ewa> arrayList = this.T;
        arrayList.add(ewaVar);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.R);
        arrayList.add(this.O);
    }

    public final void b(jxa jxaVar, ofs ofsVar, HashSet<ixa> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g2z.a(jxaVar, ofsVar, this);
            hashSet.remove(this);
            c(ofsVar, jxaVar.d0(64));
        }
        if (i == 0) {
            HashSet<ewa> hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator<ewa> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.b(jxaVar, ofsVar, hashSet, i, true);
                }
            }
            HashSet<ewa> hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator<ewa> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.b(jxaVar, ofsVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ewa> hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator<ewa> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.b(jxaVar, ofsVar, hashSet, i, true);
            }
        }
        HashSet<ewa> hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator<ewa> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.b(jxaVar, ofsVar, hashSet, i, true);
            }
        }
        HashSet<ewa> hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator<ewa> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.b(jxaVar, ofsVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:137:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x026d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0293  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:256:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:263:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:276:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:280:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:284:0x041d  */
    /* JADX WARN: Code duplicated, block: B:286:0x0422 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:289:0x0429  */
    /* JADX WARN: Code duplicated, block: B:292:0x0433  */
    /* JADX WARN: Code duplicated, block: B:295:0x0439  */
    /* JADX WARN: Code duplicated, block: B:297:0x043c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0456  */
    /* JADX WARN: Code duplicated, block: B:319:0x049d  */
    /* JADX WARN: Code duplicated, block: B:334:0x054a  */
    /* JADX WARN: Code duplicated, block: B:350:0x059b  */
    /* JADX WARN: Code duplicated, block: B:353:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:354:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:356:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:393:0x066f  */
    /* JADX WARN: Code duplicated, block: B:395:0x0675  */
    /* JADX WARN: Code duplicated, block: B:397:0x067e  */
    /* JADX WARN: Code duplicated, block: B:398:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:401:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r36v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [ixa] */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    public void c(ofs ofsVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        int i6;
        boolean z2;
        HashSet<ewa> hashSet;
        ixa ixaVar;
        jxa jxaVar;
        WeakReference<ewa> weakReference;
        WeakReference<ewa> weakReference2;
        ixa ixaVar2;
        jxa jxaVar2;
        WeakReference<ewa> weakReference3;
        WeakReference<ewa> weakReference4;
        boolean[] zArr;
        ewa ewaVar;
        boolean[] zArr2;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        a aVar;
        a aVar2;
        boolean z5;
        a aVar3;
        boolean z6;
        float f;
        int i12;
        int i13;
        uoa0 uoa0Var;
        uoa0 uoa0Var2;
        int i14;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        ewa ewaVar2;
        boolean z11;
        uoa0 uoa0Var3;
        uoa0 uoa0Var4;
        int i16;
        ?? r20;
        a aVar4;
        boolean z12;
        ?? r3;
        boolean z13;
        ?? r110;
        uoa0 uoa0Var5;
        uoa0 uoa0Var6;
        uoa0 uoa0Var7;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f2;
        ?? r27;
        c3i0 c3i0Var;
        vjm vjmVar;
        int i23;
        int i24;
        ?? Z;
        boolean zA;
        vjm vjmVar2;
        c3i0 c3i0Var2;
        boolean z14;
        ofs ofsVar2 = ofsVar;
        ewa ewaVar3 = this.K;
        uoa0 uoa0VarK = ofsVar2.k(ewaVar3);
        ewa ewaVar4 = this.M;
        uoa0 uoa0VarK2 = ofsVar2.k(ewaVar4);
        ewa ewaVar5 = this.L;
        uoa0 uoa0VarK3 = ofsVar2.k(ewaVar5);
        ewa ewaVar6 = this.N;
        uoa0 uoa0VarK4 = ofsVar2.k(ewaVar6);
        ewa ewaVar7 = this.O;
        uoa0 uoa0VarK5 = ofsVar2.k(ewaVar7);
        ixa ixaVar3 = this.W;
        a aVar5 = a.b;
        if (ixaVar3 != null) {
            a[] aVarArr = ixaVar3.V;
            i2 = 0;
            i4 = aVarArr[0] == aVar5 ? 1 : 0;
            int i25 = aVarArr[1] == aVar5 ? 1 : 0;
            int i26 = this.r;
            if (i26 != 1) {
                i = 1;
                if (i26 == 2) {
                    i4 = 0;
                } else if (i26 != 3) {
                }
                i3 = i25;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.j0;
            r19 = i3;
            boolean[] zArr3 = this.U;
            if (i5 != 8 && !this.k0) {
                ArrayList<ewa> arrayList = this.T;
                int size = arrayList.size();
                i6 = i4;
                int i27 = i2;
                while (true) {
                    if (i27 >= size) {
                        if (zArr3[i2] || zArr3[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i28 = size;
                    HashSet<ewa> hashSet2 = arrayList.get(i27).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i27++;
                    size = i28;
                }
            } else {
                i6 = i4;
            }
            z2 = this.l;
            if (z2 || this.m) {
                if (z2) {
                    ofsVar2.d(uoa0VarK, this.b0);
                    ofsVar2.d(uoa0VarK2, this.b0 + this.X);
                    if (i6 != 0 && (ixaVar2 = this.W) != null) {
                        jxaVar2 = (jxa) ixaVar2;
                        weakReference3 = jxaVar2.M0;
                        if (weakReference3 != null || weakReference3.get() == null || ewaVar3.d() > jxaVar2.M0.get().d()) {
                            jxaVar2.M0 = new WeakReference<>(ewaVar3);
                        }
                        weakReference4 = jxaVar2.O0;
                        if (weakReference4 != null || weakReference4.get() == null || ewaVar4.d() > jxaVar2.O0.get().d()) {
                            jxaVar2.O0 = new WeakReference<>(ewaVar4);
                        }
                    }
                }
                if (this.m) {
                    ofsVar2.d(uoa0VarK3, this.c0);
                    ofsVar2.d(uoa0VarK4, this.c0 + this.Y);
                    hashSet = ewaVar7.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        ofsVar2.d(uoa0VarK5, this.c0 + this.d0);
                    }
                    if (r19 != 0 && (ixaVar = this.W) != null) {
                        jxaVar = (jxa) ixaVar;
                        weakReference = jxaVar.L0;
                        if (weakReference != null || weakReference.get() == null || ewaVar5.d() > jxaVar.L0.get().d()) {
                            jxaVar.L0 = new WeakReference<>(ewaVar5);
                        }
                        weakReference2 = jxaVar.N0;
                        if (weakReference2 != null || weakReference2.get() == null || ewaVar6.d() > jxaVar.N0.get().d()) {
                            jxaVar.N0 = new WeakReference<>(ewaVar6);
                        }
                    }
                }
                if (this.l && this.m) {
                    ?? r13 = i2;
                    this.l = r13;
                    this.m = r13;
                    return;
                }
            }
            zArr = this.f;
            if (z || (vjmVar2 = this.d) == null || (c3i0Var2 = this.e) == null) {
                ewaVar = ewaVar7;
                zArr2 = zArr;
            } else {
                ewaVar = ewaVar7;
                zmd zmdVar = vjmVar2.h;
                zArr2 = zArr;
                if (zmdVar.j && vjmVar2.i.j && c3i0Var2.h.j && c3i0Var2.i.j) {
                    ofsVar2.d(uoa0VarK, zmdVar.g);
                    ofsVar2.d(uoa0VarK2, this.d.i.g);
                    ofsVar2.d(uoa0VarK3, this.e.h.g);
                    ofsVar2.d(uoa0VarK4, this.e.i.g);
                    ofsVar2.d(uoa0VarK5, this.e.k.g);
                    if (this.W == null) {
                        z14 = false;
                    } else {
                        if (i6 != 0 && zArr2[0] && !z()) {
                            ofsVar2.f(ofsVar2.k(this.W.M), uoa0VarK2, 0, 8);
                        }
                        if (r19 == 0 || !zArr2[i] || A()) {
                            z14 = false;
                        } else {
                            z14 = false;
                            ofsVar2.f(ofsVar2.k(this.W.N), uoa0VarK4, 0, 8);
                        }
                    }
                    this.l = z14;
                    this.m = z14;
                    return;
                }
            }
            if (this.W != null) {
                if (y(0)) {
                    ((jxa) this.W).Y(this, 0);
                    int i29 = i;
                    i24 = i29 == true ? 1 : 0;
                    Z = i29;
                } else {
                    i24 = i;
                    Z = z();
                }
                if (y(i24)) {
                    ((jxa) this.W).Y(this, i24);
                    zA = true;
                } else {
                    zA = A();
                }
                if (Z != 0 && i6 != 0 && this.j0 != 8 && ewaVar3.f == null && ewaVar4.f == null) {
                    ofsVar2.f(ofsVar2.k(this.W.M), uoa0VarK2, 0, 1);
                }
                if (!zA && r19 != 0 && this.j0 != 8 && ewaVar5.f == null && ewaVar6.f == null && ewaVar == null) {
                    ofsVar2.f(ofsVar2.k(this.W.N), uoa0VarK4, 0, 1);
                }
                z3 = zA;
                r12 = Z;
            } else {
                ewaVar3 = ewaVar3;
                z3 = false;
                r12 = 0;
            }
            i7 = this.X;
            i8 = this.e0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.Y;
            z4 = z3;
            i10 = this.f0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            a[] aVarArr2 = this.V;
            aVar = aVarArr2[0];
            aVar2 = a.c;
            if (aVar != aVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVar3 = aVarArr2[1];
            if (aVar3 != aVar2) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i30 = this.a0;
            this.B = i30;
            float f3 = this.Z;
            this.C = f3;
            f = f3;
            i12 = this.s;
            i13 = this.t;
            if (f > 0.0f) {
                uoa0Var = uoa0VarK4;
                if (this.j0 != 8) {
                    if (aVar == aVar2 || i12 != 0) {
                        i14 = i12;
                    } else {
                        i14 = 3;
                    }
                    if (aVar3 == aVar2 || i13 != 0) {
                        i23 = i13;
                    } else {
                        i23 = 3;
                    }
                    if (aVar != aVar2 && aVar3 == aVar2) {
                        uoa0Var2 = uoa0VarK5;
                        if (i14 == 3 && i23 == 3) {
                            if (i30 == -1) {
                                if (z5 && !z6) {
                                    this.B = 0;
                                    i30 = 0;
                                } else if (!z5 && z6) {
                                    this.B = 1;
                                    if (i30 == -1) {
                                        this.C = 1.0f / f;
                                    }
                                    i30 = 1;
                                }
                            }
                            if (i30 == 0 && (!ewaVar5.h() || !ewaVar6.h())) {
                                this.B = 1;
                            } else if (this.B == 1 && (!ewaVar3.h() || !ewaVar4.h())) {
                                this.B = 0;
                            }
                            if (this.B == -1 && (!ewaVar5.h() || !ewaVar6.h() || !ewaVar3.h() || !ewaVar4.h())) {
                                if (ewaVar5.h() && ewaVar6.h()) {
                                    this.B = 0;
                                } else if (ewaVar3.h() && ewaVar4.h()) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            int i31 = this.B;
                            if (i31 == -1) {
                                int i32 = this.v;
                                if (i32 > 0 && this.y == 0) {
                                    this.B = 0;
                                    i31 = 0;
                                } else if (i32 == 0 && this.y > 0) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                    i31 = 1;
                                }
                            }
                            i30 = i31;
                        }
                        i6 = i6;
                        z7 = true;
                        i15 = i23;
                        int[] iArr = this.u;
                        iArr[0] = i14;
                        iArr[1] = i15;
                        if (z7 || !(i30 == 0 || i30 == -1)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z7 || !(i30 == 1 || i30 == -1)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (this.V[0] == aVar5 || !(this instanceof jxa)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        ewaVar2 = this.R;
                        z11 = !ewaVar2.h();
                        boolean z15 = zArr3[0];
                        boolean z16 = zArr3[1];
                        if (this.p != 2 || this.l) {
                            uoa0Var3 = uoa0VarK;
                            uoa0Var4 = uoa0VarK2;
                            i16 = i14;
                            r20 = r12;
                            aVar4 = aVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        } else {
                            if (z && (vjmVar = this.d) != null) {
                                zmd zmdVar2 = vjmVar.h;
                                if (zmdVar2.j && vjmVar.i.j) {
                                    if (z) {
                                        ofsVar2.d(uoa0VarK, zmdVar2.g);
                                        ofsVar2.d(uoa0VarK2, this.d.i.g);
                                        if (this.W != null && i6 != 0 && zArr2[0] && !z()) {
                                            ofsVar2.f(ofsVar2.k(this.W.M), uoa0VarK2, 0, 8);
                                        }
                                    }
                                    uoa0Var3 = uoa0VarK;
                                    uoa0Var4 = uoa0VarK2;
                                    i16 = i14;
                                    r20 = r12;
                                    aVar4 = aVar5;
                                    z12 = z4;
                                    r3 = i6;
                                    z13 = z11;
                                    r110 = r19;
                                }
                            }
                            ixa ixaVar4 = this.W;
                            uoa0 uoa0VarK6 = ixaVar4 != null ? ofsVar2.k(ixaVar4.M) : null;
                            ixa ixaVar5 = this.W;
                            uoa0 uoa0VarK7 = ixaVar5 != null ? ofsVar2.k(ixaVar5.K) : null;
                            boolean z17 = zArr2[0];
                            a[] aVarArr3 = this.V;
                            i16 = i14;
                            ?? r111 = r12;
                            ?? r4 = i6;
                            boolean z18 = z11;
                            uoa0Var4 = uoa0VarK2;
                            aVar4 = aVar5;
                            uoa0Var3 = uoa0VarK;
                            ofsVar2 = ofsVar;
                            e(ofsVar2, true, r4, r19, z17, uoa0VarK7, uoa0VarK6, aVarArr3[0], z10, this.K, this.M, this.b0, i8, this.e0, this.D[0], this.g0, z8, aVarArr3[1] == aVar2, r111, z4, z15, i16, i15, this.v, this.w, this.x, z18);
                            z12 = z4;
                            r20 = r111 == true ? 1 : 0;
                            r110 = r19 == true ? 1 : 0;
                            r3 = r4;
                            z13 = z18;
                        }
                        if (z || (c3i0Var = this.e) == null) {
                            uoa0Var5 = r33;
                            uoa0Var6 = uoa0Var;
                            uoa0Var7 = uoa0Var2;
                            i17 = 0;
                            i18 = 8;
                            i19 = 1;
                            i20 = 1;
                        } else {
                            zmd zmdVar3 = c3i0Var.h;
                            if (zmdVar3.j && c3i0Var.i.j) {
                                int i33 = zmdVar3.g;
                                uoa0Var5 = uoa0VarK3;
                                ofsVar2.d(uoa0Var5, i33);
                                uoa0Var6 = uoa0Var;
                                ofsVar2.d(uoa0Var6, this.e.i.g);
                                uoa0Var7 = uoa0Var2;
                                ofsVar2.d(uoa0Var7, this.e.k.g);
                                ixa ixaVar6 = this.W;
                                if (ixaVar6 == null || z12 || r110 == 0) {
                                    i17 = 0;
                                    i18 = 8;
                                    i19 = 1;
                                } else {
                                    i19 = 1;
                                    if (zArr2[1]) {
                                        i17 = 0;
                                        i18 = 8;
                                        ofsVar2.f(ofsVar2.k(ixaVar6.N), uoa0Var6, 0, 8);
                                    } else {
                                        i17 = 0;
                                        i18 = 8;
                                    }
                                }
                                i20 = i17;
                            } else {
                                uoa0Var5 = r33;
                                uoa0Var6 = uoa0Var;
                                uoa0Var7 = uoa0Var2;
                                i17 = 0;
                                i18 = 8;
                                i19 = 1;
                                i20 = 1;
                            }
                        }
                        if (this.q == 2) {
                            i21 = i17;
                        } else {
                            i21 = i20;
                        }
                        if (i21 == 0 && !this.m) {
                            int i34 = (this.V[i19] == aVar4 && (this instanceof jxa)) ? i19 : i17;
                            int i35 = i34 != 0 ? i17 : i11;
                            ixa ixaVar7 = this.W;
                            uoa0 uoa0VarK8 = ixaVar7 != null ? ofsVar2.k(ixaVar7.N) : null;
                            ixa ixaVar8 = this.W;
                            uoa0 uoa0VarK9 = ixaVar8 != null ? ofsVar2.k(ixaVar8.L) : null;
                            int i36 = this.d0;
                            if (i36 > 0 || this.j0 == i18) {
                                r27 = z13;
                                ewa ewaVar8 = ewaVar;
                                if (ewaVar8.f != null) {
                                    ofsVar2.e(uoa0Var7, uoa0Var5, i36, i18);
                                    ofsVar2.e(uoa0Var7, ofsVar2.k(ewaVar8.f), ewaVar8.e(), i18);
                                    if (r110 != 0) {
                                        ofsVar2.f(uoa0VarK8, ofsVar2.k(ewaVar6), i17, 5);
                                    }
                                    r27 = i17;
                                } else if (this.j0 == i18) {
                                    ofsVar2.e(uoa0Var7, uoa0Var5, ewaVar8.e(), i18);
                                    r27 = z13;
                                } else {
                                    ofsVar2.e(uoa0Var7, uoa0Var5, i36, i18);
                                    r27 = z13;
                                }
                            }
                            r27 = z13;
                            boolean z19 = zArr2[i19];
                            a[] aVarArr4 = this.V;
                            int i37 = i17;
                            ofsVar2 = ofsVar;
                            e(ofsVar2, false, r110, r3, z19, uoa0VarK9, uoa0VarK8, aVarArr4[i19], i34, this.L, this.N, this.c0, i35, this.f0, this.D[i19], this.h0, z9, aVarArr4[i37] == aVar2 ? 1 : i37, z12, r20, z16, i15, i16, this.y, this.z, this.A, r27);
                        }
                        if (z7) {
                            i22 = this.B;
                            f2 = this.C;
                            if (i22 == 1) {
                                rx0 rx0VarL = ofsVar2.l();
                                rx0VarL.d.k(uoa0Var6, -1.0f);
                                rx0VarL.d.k(uoa0Var5, 1.0f);
                                rx0VarL.d.k(uoa0Var4, f2);
                                rx0VarL.d.k(uoa0Var3, -f2);
                                ofsVar2.c(rx0VarL);
                            } else {
                                rx0 rx0VarL2 = ofsVar2.l();
                                rx0VarL2.d.k(uoa0Var4, -1.0f);
                                rx0VarL2.d.k(uoa0Var3, 1.0f);
                                rx0VarL2.d.k(uoa0Var6, f2);
                                rx0VarL2.d.k(uoa0Var5, -f2);
                                ofsVar2.c(rx0VarL2);
                            }
                        }
                        if (ewaVar2.h()) {
                            ixa ixaVar9 = ewaVar2.f.d;
                            float radians = (float) Math.toRadians(this.E + 90.0f);
                            int iE = ewaVar2.e();
                            ewa.a aVar6 = ewa.a.a;
                            uoa0 uoa0VarK10 = ofsVar2.k(k(aVar6));
                            ewa.a aVar7 = ewa.a.b;
                            uoa0 uoa0VarK11 = ofsVar2.k(k(aVar7));
                            ewa.a aVar8 = ewa.a.c;
                            uoa0 uoa0VarK12 = ofsVar2.k(k(aVar8));
                            ewa.a aVar9 = ewa.a.d;
                            uoa0 uoa0VarK13 = ofsVar2.k(k(aVar9));
                            uoa0 uoa0VarK14 = ofsVar2.k(ixaVar9.k(aVar6));
                            uoa0 uoa0VarK15 = ofsVar2.k(ixaVar9.k(aVar7));
                            uoa0 uoa0VarK16 = ofsVar2.k(ixaVar9.k(aVar8));
                            uoa0 uoa0VarK17 = ofsVar2.k(ixaVar9.k(aVar9));
                            rx0 rx0VarL3 = ofsVar2.l();
                            double d = radians;
                            double dSin = Math.sin(d);
                            double d2 = iE;
                            rx0VarL3.d.k(uoa0VarK15, 0.5f);
                            rx0VarL3.d.k(uoa0VarK17, 0.5f);
                            rx0VarL3.d.k(uoa0VarK11, -0.5f);
                            rx0VarL3.d.k(uoa0VarK13, -0.5f);
                            rx0VarL3.b = -((float) (dSin * d2));
                            ofsVar2.c(rx0VarL3);
                            rx0 rx0VarL4 = ofsVar2.l();
                            float fCos = (float) (Math.cos(d) * d2);
                            rx0VarL4.d.k(uoa0VarK14, 0.5f);
                            rx0VarL4.d.k(uoa0VarK16, 0.5f);
                            rx0VarL4.d.k(uoa0VarK10, -0.5f);
                            rx0VarL4.d.k(uoa0VarK12, -0.5f);
                            rx0VarL4.b = -fCos;
                            ofsVar2.c(rx0VarL4);
                        }
                        this.l = false;
                        this.m = false;
                    }
                    uoa0Var2 = uoa0VarK5;
                    if (aVar != aVar2 && i14 == 3) {
                        this.B = 0;
                        i8 = (int) (i9 * f);
                        i6 = i6;
                        i30 = 0;
                        if (aVar3 != aVar2) {
                            i14 = 4;
                            z7 = false;
                        }
                        i15 = i23;
                        int[] iArr2 = this.u;
                        iArr2[0] = i14;
                        iArr2[1] = i15;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z7) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (this.V[0] == aVar5) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i8 = 0;
                        }
                        ewaVar2 = this.R;
                        z11 = !ewaVar2.h();
                        boolean z110 = zArr3[0];
                        boolean z111 = zArr3[1];
                        if (this.p != 2) {
                            uoa0Var3 = uoa0VarK;
                            uoa0Var4 = uoa0VarK2;
                            i16 = i14;
                            r20 = r12;
                            aVar4 = aVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        } else {
                            uoa0Var3 = uoa0VarK;
                            uoa0Var4 = uoa0VarK2;
                            i16 = i14;
                            r20 = r12;
                            aVar4 = aVar5;
                            z12 = z4;
                            r3 = i6;
                            z13 = z11;
                            r110 = r19;
                        }
                        if (z) {
                            uoa0Var5 = r33;
                            uoa0Var6 = uoa0Var;
                            uoa0Var7 = uoa0Var2;
                            i17 = 0;
                            i18 = 8;
                            i19 = 1;
                            i20 = 1;
                        } else {
                            uoa0Var5 = r33;
                            uoa0Var6 = uoa0Var;
                            uoa0Var7 = uoa0Var2;
                            i17 = 0;
                            i18 = 8;
                            i19 = 1;
                            i20 = 1;
                        }
                        if (this.q == 2) {
                            i21 = i17;
                        } else {
                            i21 = i20;
                        }
                        if (i21 == 0) {
                        }
                        if (z7) {
                            i22 = this.B;
                            f2 = this.C;
                            if (i22 == 1) {
                                rx0 rx0VarL5 = ofsVar2.l();
                                rx0VarL5.d.k(uoa0Var6, -1.0f);
                                rx0VarL5.d.k(uoa0Var5, 1.0f);
                                rx0VarL5.d.k(uoa0Var4, f2);
                                rx0VarL5.d.k(uoa0Var3, -f2);
                                ofsVar2.c(rx0VarL5);
                            } else {
                                rx0 rx0VarL6 = ofsVar2.l();
                                rx0VarL6.d.k(uoa0Var4, -1.0f);
                                rx0VarL6.d.k(uoa0Var3, 1.0f);
                                rx0VarL6.d.k(uoa0Var6, f2);
                                rx0VarL6.d.k(uoa0Var5, -f2);
                                ofsVar2.c(rx0VarL6);
                            }
                        }
                        if (ewaVar2.h()) {
                            ixa ixaVar10 = ewaVar2.f.d;
                            float radians2 = (float) Math.toRadians(this.E + 90.0f);
                            int iE2 = ewaVar2.e();
                            ewa.a aVar10 = ewa.a.a;
                            uoa0 uoa0VarK18 = ofsVar2.k(k(aVar10));
                            ewa.a aVar11 = ewa.a.b;
                            uoa0 uoa0VarK19 = ofsVar2.k(k(aVar11));
                            ewa.a aVar12 = ewa.a.c;
                            uoa0 uoa0VarK110 = ofsVar2.k(k(aVar12));
                            ewa.a aVar13 = ewa.a.d;
                            uoa0 uoa0VarK111 = ofsVar2.k(k(aVar13));
                            uoa0 uoa0VarK112 = ofsVar2.k(ixaVar10.k(aVar10));
                            uoa0 uoa0VarK113 = ofsVar2.k(ixaVar10.k(aVar11));
                            uoa0 uoa0VarK114 = ofsVar2.k(ixaVar10.k(aVar12));
                            uoa0 uoa0VarK115 = ofsVar2.k(ixaVar10.k(aVar13));
                            rx0 rx0VarL7 = ofsVar2.l();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iE2;
                            rx0VarL7.d.k(uoa0VarK113, 0.5f);
                            rx0VarL7.d.k(uoa0VarK115, 0.5f);
                            rx0VarL7.d.k(uoa0VarK19, -0.5f);
                            rx0VarL7.d.k(uoa0VarK111, -0.5f);
                            rx0VarL7.b = -((float) (dSin2 * d4));
                            ofsVar2.c(rx0VarL7);
                            rx0 rx0VarL8 = ofsVar2.l();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            rx0VarL8.d.k(uoa0VarK112, 0.5f);
                            rx0VarL8.d.k(uoa0VarK114, 0.5f);
                            rx0VarL8.d.k(uoa0VarK18, -0.5f);
                            rx0VarL8.d.k(uoa0VarK110, -0.5f);
                            rx0VarL8.b = -fCos2;
                            ofsVar2.c(rx0VarL8);
                        }
                        this.l = false;
                        this.m = false;
                    }
                    if (aVar3 == aVar2 || i23 != 3) {
                        i6 = i6;
                    } else {
                        this.B = 1;
                        if (i30 == -1) {
                            float f4 = 1.0f / f;
                            this.C = f4;
                            f = f4;
                        }
                        i11 = (int) (i7 * f);
                        if (aVar != aVar2) {
                            i30 = 1;
                            i15 = 4;
                        } else {
                            i6 = i6;
                            i30 = 1;
                        }
                    }
                    z7 = true;
                    i15 = i23;
                    int[] iArr3 = this.u;
                    iArr3[0] = i14;
                    iArr3[1] = i15;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (this.V[0] == aVar5) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    ewaVar2 = this.R;
                    z11 = !ewaVar2.h();
                    boolean z112 = zArr3[0];
                    boolean z113 = zArr3[1];
                    if (this.p != 2) {
                        uoa0Var3 = uoa0VarK;
                        uoa0Var4 = uoa0VarK2;
                        i16 = i14;
                        r20 = r12;
                        aVar4 = aVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    } else {
                        uoa0Var3 = uoa0VarK;
                        uoa0Var4 = uoa0VarK2;
                        i16 = i14;
                        r20 = r12;
                        aVar4 = aVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    }
                    if (z) {
                        uoa0Var5 = r33;
                        uoa0Var6 = uoa0Var;
                        uoa0Var7 = uoa0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    } else {
                        uoa0Var5 = r33;
                        uoa0Var6 = uoa0Var;
                        uoa0Var7 = uoa0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    }
                    if (this.q == 2) {
                        i21 = i17;
                    } else {
                        i21 = i20;
                    }
                    if (i21 == 0) {
                    }
                    if (z7) {
                        i22 = this.B;
                        f2 = this.C;
                        if (i22 == 1) {
                            rx0 rx0VarL9 = ofsVar2.l();
                            rx0VarL9.d.k(uoa0Var6, -1.0f);
                            rx0VarL9.d.k(uoa0Var5, 1.0f);
                            rx0VarL9.d.k(uoa0Var4, f2);
                            rx0VarL9.d.k(uoa0Var3, -f2);
                            ofsVar2.c(rx0VarL9);
                        } else {
                            rx0 rx0VarL10 = ofsVar2.l();
                            rx0VarL10.d.k(uoa0Var4, -1.0f);
                            rx0VarL10.d.k(uoa0Var3, 1.0f);
                            rx0VarL10.d.k(uoa0Var6, f2);
                            rx0VarL10.d.k(uoa0Var5, -f2);
                            ofsVar2.c(rx0VarL10);
                        }
                    }
                    if (ewaVar2.h()) {
                        ixa ixaVar11 = ewaVar2.f.d;
                        float radians3 = (float) Math.toRadians(this.E + 90.0f);
                        int iE3 = ewaVar2.e();
                        ewa.a aVar14 = ewa.a.a;
                        uoa0 uoa0VarK116 = ofsVar2.k(k(aVar14));
                        ewa.a aVar15 = ewa.a.b;
                        uoa0 uoa0VarK117 = ofsVar2.k(k(aVar15));
                        ewa.a aVar16 = ewa.a.c;
                        uoa0 uoa0VarK118 = ofsVar2.k(k(aVar16));
                        ewa.a aVar17 = ewa.a.d;
                        uoa0 uoa0VarK119 = ofsVar2.k(k(aVar17));
                        uoa0 uoa0VarK1110 = ofsVar2.k(ixaVar11.k(aVar14));
                        uoa0 uoa0VarK1111 = ofsVar2.k(ixaVar11.k(aVar15));
                        uoa0 uoa0VarK1112 = ofsVar2.k(ixaVar11.k(aVar16));
                        uoa0 uoa0VarK1113 = ofsVar2.k(ixaVar11.k(aVar17));
                        rx0 rx0VarL11 = ofsVar2.l();
                        double d5 = radians3;
                        double dSin3 = Math.sin(d5);
                        double d6 = iE3;
                        rx0VarL11.d.k(uoa0VarK1111, 0.5f);
                        rx0VarL11.d.k(uoa0VarK1113, 0.5f);
                        rx0VarL11.d.k(uoa0VarK117, -0.5f);
                        rx0VarL11.d.k(uoa0VarK119, -0.5f);
                        rx0VarL11.b = -((float) (dSin3 * d6));
                        ofsVar2.c(rx0VarL11);
                        rx0 rx0VarL12 = ofsVar2.l();
                        float fCos3 = (float) (Math.cos(d5) * d6);
                        rx0VarL12.d.k(uoa0VarK1110, 0.5f);
                        rx0VarL12.d.k(uoa0VarK1112, 0.5f);
                        rx0VarL12.d.k(uoa0VarK116, -0.5f);
                        rx0VarL12.d.k(uoa0VarK118, -0.5f);
                        rx0VarL12.b = -fCos3;
                        ofsVar2.c(rx0VarL12);
                    }
                    this.l = false;
                    this.m = false;
                }
                z7 = false;
                int[] iArr4 = this.u;
                iArr4[0] = i14;
                iArr4[1] = i15;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (this.V[0] == aVar5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                ewaVar2 = this.R;
                z11 = !ewaVar2.h();
                boolean z114 = zArr3[0];
                boolean z115 = zArr3[1];
                if (this.p != 2) {
                    uoa0Var3 = uoa0VarK;
                    uoa0Var4 = uoa0VarK2;
                    i16 = i14;
                    r20 = r12;
                    aVar4 = aVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                } else {
                    uoa0Var3 = uoa0VarK;
                    uoa0Var4 = uoa0VarK2;
                    i16 = i14;
                    r20 = r12;
                    aVar4 = aVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                }
                if (z) {
                    uoa0Var5 = r33;
                    uoa0Var6 = uoa0Var;
                    uoa0Var7 = uoa0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                } else {
                    uoa0Var5 = r33;
                    uoa0Var6 = uoa0Var;
                    uoa0Var7 = uoa0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                }
                if (this.q == 2) {
                    i21 = i17;
                } else {
                    i21 = i20;
                }
                if (i21 == 0) {
                }
                if (z7) {
                    i22 = this.B;
                    f2 = this.C;
                    if (i22 == 1) {
                        rx0 rx0VarL13 = ofsVar2.l();
                        rx0VarL13.d.k(uoa0Var6, -1.0f);
                        rx0VarL13.d.k(uoa0Var5, 1.0f);
                        rx0VarL13.d.k(uoa0Var4, f2);
                        rx0VarL13.d.k(uoa0Var3, -f2);
                        ofsVar2.c(rx0VarL13);
                    } else {
                        rx0 rx0VarL14 = ofsVar2.l();
                        rx0VarL14.d.k(uoa0Var4, -1.0f);
                        rx0VarL14.d.k(uoa0Var3, 1.0f);
                        rx0VarL14.d.k(uoa0Var6, f2);
                        rx0VarL14.d.k(uoa0Var5, -f2);
                        ofsVar2.c(rx0VarL14);
                    }
                }
                if (ewaVar2.h()) {
                    ixa ixaVar12 = ewaVar2.f.d;
                    float radians4 = (float) Math.toRadians(this.E + 90.0f);
                    int iE4 = ewaVar2.e();
                    ewa.a aVar18 = ewa.a.a;
                    uoa0 uoa0VarK1114 = ofsVar2.k(k(aVar18));
                    ewa.a aVar19 = ewa.a.b;
                    uoa0 uoa0VarK1115 = ofsVar2.k(k(aVar19));
                    ewa.a aVar110 = ewa.a.c;
                    uoa0 uoa0VarK1116 = ofsVar2.k(k(aVar110));
                    ewa.a aVar111 = ewa.a.d;
                    uoa0 uoa0VarK1117 = ofsVar2.k(k(aVar111));
                    uoa0 uoa0VarK1118 = ofsVar2.k(ixaVar12.k(aVar18));
                    uoa0 uoa0VarK1119 = ofsVar2.k(ixaVar12.k(aVar19));
                    uoa0 uoa0VarK11110 = ofsVar2.k(ixaVar12.k(aVar110));
                    uoa0 uoa0VarK11111 = ofsVar2.k(ixaVar12.k(aVar111));
                    rx0 rx0VarL15 = ofsVar2.l();
                    double d7 = radians4;
                    double dSin4 = Math.sin(d7);
                    double d8 = iE4;
                    rx0VarL15.d.k(uoa0VarK1119, 0.5f);
                    rx0VarL15.d.k(uoa0VarK11111, 0.5f);
                    rx0VarL15.d.k(uoa0VarK1115, -0.5f);
                    rx0VarL15.d.k(uoa0VarK1117, -0.5f);
                    rx0VarL15.b = -((float) (dSin4 * d8));
                    ofsVar2.c(rx0VarL15);
                    rx0 rx0VarL16 = ofsVar2.l();
                    float fCos4 = (float) (Math.cos(d7) * d8);
                    rx0VarL16.d.k(uoa0VarK1118, 0.5f);
                    rx0VarL16.d.k(uoa0VarK11110, 0.5f);
                    rx0VarL16.d.k(uoa0VarK1114, -0.5f);
                    rx0VarL16.d.k(uoa0VarK1116, -0.5f);
                    rx0VarL16.b = -fCos4;
                    ofsVar2.c(rx0VarL16);
                }
                this.l = false;
                this.m = false;
            }
            uoa0Var = uoa0VarK4;
            uoa0Var2 = uoa0VarK5;
            i14 = i12;
            i15 = i13;
            z7 = false;
            int[] iArr5 = this.u;
            iArr5[0] = i14;
            iArr5[1] = i15;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (this.V[0] == aVar5) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            ewaVar2 = this.R;
            z11 = !ewaVar2.h();
            boolean z116 = zArr3[0];
            boolean z117 = zArr3[1];
            if (this.p != 2) {
                uoa0Var3 = uoa0VarK;
                uoa0Var4 = uoa0VarK2;
                i16 = i14;
                r20 = r12;
                aVar4 = aVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            } else {
                uoa0Var3 = uoa0VarK;
                uoa0Var4 = uoa0VarK2;
                i16 = i14;
                r20 = r12;
                aVar4 = aVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            }
            if (z) {
                uoa0Var5 = r33;
                uoa0Var6 = uoa0Var;
                uoa0Var7 = uoa0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            } else {
                uoa0Var5 = r33;
                uoa0Var6 = uoa0Var;
                uoa0Var7 = uoa0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            }
            if (this.q == 2) {
                i21 = i17;
            } else {
                i21 = i20;
            }
            if (i21 == 0) {
            }
            if (z7) {
                i22 = this.B;
                f2 = this.C;
                if (i22 == 1) {
                    rx0 rx0VarL17 = ofsVar2.l();
                    rx0VarL17.d.k(uoa0Var6, -1.0f);
                    rx0VarL17.d.k(uoa0Var5, 1.0f);
                    rx0VarL17.d.k(uoa0Var4, f2);
                    rx0VarL17.d.k(uoa0Var3, -f2);
                    ofsVar2.c(rx0VarL17);
                } else {
                    rx0 rx0VarL18 = ofsVar2.l();
                    rx0VarL18.d.k(uoa0Var4, -1.0f);
                    rx0VarL18.d.k(uoa0Var3, 1.0f);
                    rx0VarL18.d.k(uoa0Var6, f2);
                    rx0VarL18.d.k(uoa0Var5, -f2);
                    ofsVar2.c(rx0VarL18);
                }
            }
            if (ewaVar2.h()) {
                ixa ixaVar13 = ewaVar2.f.d;
                float radians5 = (float) Math.toRadians(this.E + 90.0f);
                int iE5 = ewaVar2.e();
                ewa.a aVar112 = ewa.a.a;
                uoa0 uoa0VarK11112 = ofsVar2.k(k(aVar112));
                ewa.a aVar113 = ewa.a.b;
                uoa0 uoa0VarK11113 = ofsVar2.k(k(aVar113));
                ewa.a aVar114 = ewa.a.c;
                uoa0 uoa0VarK11114 = ofsVar2.k(k(aVar114));
                ewa.a aVar115 = ewa.a.d;
                uoa0 uoa0VarK11115 = ofsVar2.k(k(aVar115));
                uoa0 uoa0VarK11116 = ofsVar2.k(ixaVar13.k(aVar112));
                uoa0 uoa0VarK11117 = ofsVar2.k(ixaVar13.k(aVar113));
                uoa0 uoa0VarK11118 = ofsVar2.k(ixaVar13.k(aVar114));
                uoa0 uoa0VarK11119 = ofsVar2.k(ixaVar13.k(aVar115));
                rx0 rx0VarL19 = ofsVar2.l();
                double d9 = radians5;
                double dSin5 = Math.sin(d9);
                double d10 = iE5;
                rx0VarL19.d.k(uoa0VarK11117, 0.5f);
                rx0VarL19.d.k(uoa0VarK11119, 0.5f);
                rx0VarL19.d.k(uoa0VarK11113, -0.5f);
                rx0VarL19.d.k(uoa0VarK11115, -0.5f);
                rx0VarL19.b = -((float) (dSin5 * d10));
                ofsVar2.c(rx0VarL19);
                rx0 rx0VarL110 = ofsVar2.l();
                float fCos5 = (float) (Math.cos(d9) * d10);
                rx0VarL110.d.k(uoa0VarK11116, 0.5f);
                rx0VarL110.d.k(uoa0VarK11118, 0.5f);
                rx0VarL110.d.k(uoa0VarK11112, -0.5f);
                rx0VarL110.d.k(uoa0VarK11114, -0.5f);
                rx0VarL110.b = -fCos5;
                ofsVar2.c(rx0VarL110);
            }
            this.l = false;
            this.m = false;
        }
        i = 1;
        i2 = 0;
        i3 = i2;
        i4 = i3;
        i5 = this.j0;
        r19 = i3;
        boolean[] zArr4 = this.U;
        if (i5 != 8) {
            i6 = i4;
        } else {
            i6 = i4;
        }
        z2 = this.l;
        if (z2) {
            if (z2) {
                ofsVar2.d(uoa0VarK, this.b0);
                ofsVar2.d(uoa0VarK2, this.b0 + this.X);
                if (i6 != 0) {
                    jxaVar2 = (jxa) ixaVar2;
                    weakReference3 = jxaVar2.M0;
                    if (weakReference3 != null) {
                        jxaVar2.M0 = new WeakReference<>(ewaVar3);
                    } else {
                        jxaVar2.M0 = new WeakReference<>(ewaVar3);
                    }
                    weakReference4 = jxaVar2.O0;
                    if (weakReference4 != null) {
                        jxaVar2.O0 = new WeakReference<>(ewaVar4);
                    } else {
                        jxaVar2.O0 = new WeakReference<>(ewaVar4);
                    }
                }
            }
            if (this.m) {
                ofsVar2.d(uoa0VarK3, this.c0);
                ofsVar2.d(uoa0VarK4, this.c0 + this.Y);
                hashSet = ewaVar7.a;
                if (hashSet != null) {
                    ofsVar2.d(uoa0VarK5, this.c0 + this.d0);
                }
                if (r19 != 0) {
                    jxaVar = (jxa) ixaVar;
                    weakReference = jxaVar.L0;
                    if (weakReference != null) {
                        jxaVar.L0 = new WeakReference<>(ewaVar5);
                    } else {
                        jxaVar.L0 = new WeakReference<>(ewaVar5);
                    }
                    weakReference2 = jxaVar.N0;
                    if (weakReference2 != null) {
                        jxaVar.N0 = new WeakReference<>(ewaVar6);
                    } else {
                        jxaVar.N0 = new WeakReference<>(ewaVar6);
                    }
                }
            }
            if (this.l) {
                ?? r14 = i2;
                this.l = r14;
                this.m = r14;
                return;
            }
        } else {
            if (z2) {
                ofsVar2.d(uoa0VarK, this.b0);
                ofsVar2.d(uoa0VarK2, this.b0 + this.X);
                if (i6 != 0) {
                    jxaVar2 = (jxa) ixaVar2;
                    weakReference3 = jxaVar2.M0;
                    if (weakReference3 != null) {
                        jxaVar2.M0 = new WeakReference<>(ewaVar3);
                    } else {
                        jxaVar2.M0 = new WeakReference<>(ewaVar3);
                    }
                    weakReference4 = jxaVar2.O0;
                    if (weakReference4 != null) {
                        jxaVar2.O0 = new WeakReference<>(ewaVar4);
                    } else {
                        jxaVar2.O0 = new WeakReference<>(ewaVar4);
                    }
                }
            }
            if (this.m) {
                ofsVar2.d(uoa0VarK3, this.c0);
                ofsVar2.d(uoa0VarK4, this.c0 + this.Y);
                hashSet = ewaVar7.a;
                if (hashSet != null) {
                    ofsVar2.d(uoa0VarK5, this.c0 + this.d0);
                }
                if (r19 != 0) {
                    jxaVar = (jxa) ixaVar;
                    weakReference = jxaVar.L0;
                    if (weakReference != null) {
                        jxaVar.L0 = new WeakReference<>(ewaVar5);
                    } else {
                        jxaVar.L0 = new WeakReference<>(ewaVar5);
                    }
                    weakReference2 = jxaVar.N0;
                    if (weakReference2 != null) {
                        jxaVar.N0 = new WeakReference<>(ewaVar6);
                    } else {
                        jxaVar.N0 = new WeakReference<>(ewaVar6);
                    }
                }
            }
            if (this.l) {
                ?? r15 = i2;
                this.l = r15;
                this.m = r15;
                return;
            }
        }
        zArr = this.f;
        if (z) {
            ewaVar = ewaVar7;
            zArr2 = zArr;
        } else {
            ewaVar = ewaVar7;
            zArr2 = zArr;
        }
        if (this.W != null) {
            if (y(0)) {
                ((jxa) this.W).Y(this, 0);
                int i210 = i;
                i24 = i210 == true ? 1 : 0;
                Z = i210;
            } else {
                i24 = i;
                Z = z();
            }
            if (y(i24)) {
                ((jxa) this.W).Y(this, i24);
                zA = true;
            } else {
                zA = A();
            }
            if (Z != 0) {
            }
            if (!zA) {
                ofsVar2.f(ofsVar2.k(this.W.N), uoa0VarK4, 0, 1);
            }
            z3 = zA;
            r12 = Z;
        } else {
            ewaVar3 = ewaVar3;
            z3 = false;
            r12 = 0;
        }
        i7 = this.X;
        i8 = this.e0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.Y;
        z4 = z3;
        i10 = this.f0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        a[] aVarArr5 = this.V;
        aVar = aVarArr5[0];
        aVar2 = a.c;
        if (aVar != aVar2) {
            z5 = true;
        } else {
            z5 = false;
        }
        aVar3 = aVarArr5[1];
        if (aVar3 != aVar2) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i38 = this.a0;
        this.B = i38;
        float f5 = this.Z;
        this.C = f5;
        f = f5;
        i12 = this.s;
        i13 = this.t;
        if (f > 0.0f) {
            uoa0Var = uoa0VarK4;
            if (this.j0 != 8) {
                if (aVar == aVar2) {
                    i14 = i12;
                } else {
                    i14 = i12;
                }
                if (aVar3 == aVar2) {
                    i23 = i13;
                } else {
                    i23 = i13;
                }
                if (aVar != aVar2) {
                    uoa0Var2 = uoa0VarK5;
                    if (aVar != aVar2) {
                        if (aVar3 == aVar2) {
                        }
                        z7 = true;
                    } else {
                        if (aVar3 == aVar2) {
                        }
                        z7 = true;
                    }
                    i15 = i23;
                    int[] iArr6 = this.u;
                    iArr6[0] = i14;
                    iArr6[1] = i15;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z7) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (this.V[0] == aVar5) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i8 = 0;
                    }
                    ewaVar2 = this.R;
                    z11 = !ewaVar2.h();
                    boolean z118 = zArr4[0];
                    boolean z119 = zArr4[1];
                    if (this.p != 2) {
                        uoa0Var3 = uoa0VarK;
                        uoa0Var4 = uoa0VarK2;
                        i16 = i14;
                        r20 = r12;
                        aVar4 = aVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    } else {
                        uoa0Var3 = uoa0VarK;
                        uoa0Var4 = uoa0VarK2;
                        i16 = i14;
                        r20 = r12;
                        aVar4 = aVar5;
                        z12 = z4;
                        r3 = i6;
                        z13 = z11;
                        r110 = r19;
                    }
                    if (z) {
                        uoa0Var5 = r33;
                        uoa0Var6 = uoa0Var;
                        uoa0Var7 = uoa0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    } else {
                        uoa0Var5 = r33;
                        uoa0Var6 = uoa0Var;
                        uoa0Var7 = uoa0Var2;
                        i17 = 0;
                        i18 = 8;
                        i19 = 1;
                        i20 = 1;
                    }
                    if (this.q == 2) {
                        i21 = i17;
                    } else {
                        i21 = i20;
                    }
                    if (i21 == 0) {
                    }
                    if (z7) {
                        i22 = this.B;
                        f2 = this.C;
                        if (i22 == 1) {
                            rx0 rx0VarL111 = ofsVar2.l();
                            rx0VarL111.d.k(uoa0Var6, -1.0f);
                            rx0VarL111.d.k(uoa0Var5, 1.0f);
                            rx0VarL111.d.k(uoa0Var4, f2);
                            rx0VarL111.d.k(uoa0Var3, -f2);
                            ofsVar2.c(rx0VarL111);
                        } else {
                            rx0 rx0VarL112 = ofsVar2.l();
                            rx0VarL112.d.k(uoa0Var4, -1.0f);
                            rx0VarL112.d.k(uoa0Var3, 1.0f);
                            rx0VarL112.d.k(uoa0Var6, f2);
                            rx0VarL112.d.k(uoa0Var5, -f2);
                            ofsVar2.c(rx0VarL112);
                        }
                    }
                    if (ewaVar2.h()) {
                        ixa ixaVar14 = ewaVar2.f.d;
                        float radians6 = (float) Math.toRadians(this.E + 90.0f);
                        int iE6 = ewaVar2.e();
                        ewa.a aVar116 = ewa.a.a;
                        uoa0 uoa0VarK111110 = ofsVar2.k(k(aVar116));
                        ewa.a aVar117 = ewa.a.b;
                        uoa0 uoa0VarK111111 = ofsVar2.k(k(aVar117));
                        ewa.a aVar118 = ewa.a.c;
                        uoa0 uoa0VarK111112 = ofsVar2.k(k(aVar118));
                        ewa.a aVar119 = ewa.a.d;
                        uoa0 uoa0VarK111113 = ofsVar2.k(k(aVar119));
                        uoa0 uoa0VarK111114 = ofsVar2.k(ixaVar14.k(aVar116));
                        uoa0 uoa0VarK111115 = ofsVar2.k(ixaVar14.k(aVar117));
                        uoa0 uoa0VarK111116 = ofsVar2.k(ixaVar14.k(aVar118));
                        uoa0 uoa0VarK111117 = ofsVar2.k(ixaVar14.k(aVar119));
                        rx0 rx0VarL113 = ofsVar2.l();
                        double d11 = radians6;
                        double dSin6 = Math.sin(d11);
                        double d12 = iE6;
                        rx0VarL113.d.k(uoa0VarK111115, 0.5f);
                        rx0VarL113.d.k(uoa0VarK111117, 0.5f);
                        rx0VarL113.d.k(uoa0VarK111111, -0.5f);
                        rx0VarL113.d.k(uoa0VarK111113, -0.5f);
                        rx0VarL113.b = -((float) (dSin6 * d12));
                        ofsVar2.c(rx0VarL113);
                        rx0 rx0VarL114 = ofsVar2.l();
                        float fCos6 = (float) (Math.cos(d11) * d12);
                        rx0VarL114.d.k(uoa0VarK111114, 0.5f);
                        rx0VarL114.d.k(uoa0VarK111116, 0.5f);
                        rx0VarL114.d.k(uoa0VarK111110, -0.5f);
                        rx0VarL114.d.k(uoa0VarK111112, -0.5f);
                        rx0VarL114.b = -fCos6;
                        ofsVar2.c(rx0VarL114);
                    }
                    this.l = false;
                    this.m = false;
                }
                uoa0Var2 = uoa0VarK5;
                if (aVar != aVar2) {
                    if (aVar3 == aVar2) {
                    }
                    z7 = true;
                } else {
                    if (aVar3 == aVar2) {
                    }
                    z7 = true;
                }
                i15 = i23;
                int[] iArr7 = this.u;
                iArr7[0] = i14;
                iArr7[1] = i15;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (this.V[0] == aVar5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                ewaVar2 = this.R;
                z11 = !ewaVar2.h();
                boolean z1110 = zArr4[0];
                boolean z1111 = zArr4[1];
                if (this.p != 2) {
                    uoa0Var3 = uoa0VarK;
                    uoa0Var4 = uoa0VarK2;
                    i16 = i14;
                    r20 = r12;
                    aVar4 = aVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                } else {
                    uoa0Var3 = uoa0VarK;
                    uoa0Var4 = uoa0VarK2;
                    i16 = i14;
                    r20 = r12;
                    aVar4 = aVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                }
                if (z) {
                    uoa0Var5 = r33;
                    uoa0Var6 = uoa0Var;
                    uoa0Var7 = uoa0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                } else {
                    uoa0Var5 = r33;
                    uoa0Var6 = uoa0Var;
                    uoa0Var7 = uoa0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                }
                if (this.q == 2) {
                    i21 = i17;
                } else {
                    i21 = i20;
                }
                if (i21 == 0) {
                }
                if (z7) {
                    i22 = this.B;
                    f2 = this.C;
                    if (i22 == 1) {
                        rx0 rx0VarL115 = ofsVar2.l();
                        rx0VarL115.d.k(uoa0Var6, -1.0f);
                        rx0VarL115.d.k(uoa0Var5, 1.0f);
                        rx0VarL115.d.k(uoa0Var4, f2);
                        rx0VarL115.d.k(uoa0Var3, -f2);
                        ofsVar2.c(rx0VarL115);
                    } else {
                        rx0 rx0VarL116 = ofsVar2.l();
                        rx0VarL116.d.k(uoa0Var4, -1.0f);
                        rx0VarL116.d.k(uoa0Var3, 1.0f);
                        rx0VarL116.d.k(uoa0Var6, f2);
                        rx0VarL116.d.k(uoa0Var5, -f2);
                        ofsVar2.c(rx0VarL116);
                    }
                }
                if (ewaVar2.h()) {
                    ixa ixaVar15 = ewaVar2.f.d;
                    float radians7 = (float) Math.toRadians(this.E + 90.0f);
                    int iE7 = ewaVar2.e();
                    ewa.a aVar1110 = ewa.a.a;
                    uoa0 uoa0VarK111118 = ofsVar2.k(k(aVar1110));
                    ewa.a aVar1111 = ewa.a.b;
                    uoa0 uoa0VarK111119 = ofsVar2.k(k(aVar1111));
                    ewa.a aVar1112 = ewa.a.c;
                    uoa0 uoa0VarK1111110 = ofsVar2.k(k(aVar1112));
                    ewa.a aVar1113 = ewa.a.d;
                    uoa0 uoa0VarK1111111 = ofsVar2.k(k(aVar1113));
                    uoa0 uoa0VarK1111112 = ofsVar2.k(ixaVar15.k(aVar1110));
                    uoa0 uoa0VarK1111113 = ofsVar2.k(ixaVar15.k(aVar1111));
                    uoa0 uoa0VarK1111114 = ofsVar2.k(ixaVar15.k(aVar1112));
                    uoa0 uoa0VarK1111115 = ofsVar2.k(ixaVar15.k(aVar1113));
                    rx0 rx0VarL117 = ofsVar2.l();
                    double d13 = radians7;
                    double dSin7 = Math.sin(d13);
                    double d14 = iE7;
                    rx0VarL117.d.k(uoa0VarK1111113, 0.5f);
                    rx0VarL117.d.k(uoa0VarK1111115, 0.5f);
                    rx0VarL117.d.k(uoa0VarK111119, -0.5f);
                    rx0VarL117.d.k(uoa0VarK1111111, -0.5f);
                    rx0VarL117.b = -((float) (dSin7 * d14));
                    ofsVar2.c(rx0VarL117);
                    rx0 rx0VarL118 = ofsVar2.l();
                    float fCos7 = (float) (Math.cos(d13) * d14);
                    rx0VarL118.d.k(uoa0VarK1111112, 0.5f);
                    rx0VarL118.d.k(uoa0VarK1111114, 0.5f);
                    rx0VarL118.d.k(uoa0VarK111118, -0.5f);
                    rx0VarL118.d.k(uoa0VarK1111110, -0.5f);
                    rx0VarL118.b = -fCos7;
                    ofsVar2.c(rx0VarL118);
                }
                this.l = false;
                this.m = false;
                i6 = i6;
                z7 = true;
                i15 = i23;
                int[] iArr8 = this.u;
                iArr8[0] = i14;
                iArr8[1] = i15;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z7) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (this.V[0] == aVar5) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i8 = 0;
                }
                ewaVar2 = this.R;
                z11 = !ewaVar2.h();
                boolean z1112 = zArr4[0];
                boolean z1113 = zArr4[1];
                if (this.p != 2) {
                    uoa0Var3 = uoa0VarK;
                    uoa0Var4 = uoa0VarK2;
                    i16 = i14;
                    r20 = r12;
                    aVar4 = aVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                } else {
                    uoa0Var3 = uoa0VarK;
                    uoa0Var4 = uoa0VarK2;
                    i16 = i14;
                    r20 = r12;
                    aVar4 = aVar5;
                    z12 = z4;
                    r3 = i6;
                    z13 = z11;
                    r110 = r19;
                }
                if (z) {
                    uoa0Var5 = r33;
                    uoa0Var6 = uoa0Var;
                    uoa0Var7 = uoa0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                } else {
                    uoa0Var5 = r33;
                    uoa0Var6 = uoa0Var;
                    uoa0Var7 = uoa0Var2;
                    i17 = 0;
                    i18 = 8;
                    i19 = 1;
                    i20 = 1;
                }
                if (this.q == 2) {
                    i21 = i17;
                } else {
                    i21 = i20;
                }
                if (i21 == 0) {
                }
                if (z7) {
                    i22 = this.B;
                    f2 = this.C;
                    if (i22 == 1) {
                        rx0 rx0VarL119 = ofsVar2.l();
                        rx0VarL119.d.k(uoa0Var6, -1.0f);
                        rx0VarL119.d.k(uoa0Var5, 1.0f);
                        rx0VarL119.d.k(uoa0Var4, f2);
                        rx0VarL119.d.k(uoa0Var3, -f2);
                        ofsVar2.c(rx0VarL119);
                    } else {
                        rx0 rx0VarL1110 = ofsVar2.l();
                        rx0VarL1110.d.k(uoa0Var4, -1.0f);
                        rx0VarL1110.d.k(uoa0Var3, 1.0f);
                        rx0VarL1110.d.k(uoa0Var6, f2);
                        rx0VarL1110.d.k(uoa0Var5, -f2);
                        ofsVar2.c(rx0VarL1110);
                    }
                }
                if (ewaVar2.h()) {
                    ixa ixaVar16 = ewaVar2.f.d;
                    float radians8 = (float) Math.toRadians(this.E + 90.0f);
                    int iE8 = ewaVar2.e();
                    ewa.a aVar1114 = ewa.a.a;
                    uoa0 uoa0VarK1111116 = ofsVar2.k(k(aVar1114));
                    ewa.a aVar1115 = ewa.a.b;
                    uoa0 uoa0VarK1111117 = ofsVar2.k(k(aVar1115));
                    ewa.a aVar1116 = ewa.a.c;
                    uoa0 uoa0VarK1111118 = ofsVar2.k(k(aVar1116));
                    ewa.a aVar1117 = ewa.a.d;
                    uoa0 uoa0VarK1111119 = ofsVar2.k(k(aVar1117));
                    uoa0 uoa0VarK11111110 = ofsVar2.k(ixaVar16.k(aVar1114));
                    uoa0 uoa0VarK11111111 = ofsVar2.k(ixaVar16.k(aVar1115));
                    uoa0 uoa0VarK11111112 = ofsVar2.k(ixaVar16.k(aVar1116));
                    uoa0 uoa0VarK11111113 = ofsVar2.k(ixaVar16.k(aVar1117));
                    rx0 rx0VarL1111 = ofsVar2.l();
                    double d15 = radians8;
                    double dSin8 = Math.sin(d15);
                    double d16 = iE8;
                    rx0VarL1111.d.k(uoa0VarK11111111, 0.5f);
                    rx0VarL1111.d.k(uoa0VarK11111113, 0.5f);
                    rx0VarL1111.d.k(uoa0VarK1111117, -0.5f);
                    rx0VarL1111.d.k(uoa0VarK1111119, -0.5f);
                    rx0VarL1111.b = -((float) (dSin8 * d16));
                    ofsVar2.c(rx0VarL1111);
                    rx0 rx0VarL1112 = ofsVar2.l();
                    float fCos8 = (float) (Math.cos(d15) * d16);
                    rx0VarL1112.d.k(uoa0VarK11111110, 0.5f);
                    rx0VarL1112.d.k(uoa0VarK11111112, 0.5f);
                    rx0VarL1112.d.k(uoa0VarK1111116, -0.5f);
                    rx0VarL1112.d.k(uoa0VarK1111118, -0.5f);
                    rx0VarL1112.b = -fCos8;
                    ofsVar2.c(rx0VarL1112);
                }
                this.l = false;
                this.m = false;
            }
            z7 = false;
            int[] iArr9 = this.u;
            iArr9[0] = i14;
            iArr9[1] = i15;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z7) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (this.V[0] == aVar5) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                i8 = 0;
            }
            ewaVar2 = this.R;
            z11 = !ewaVar2.h();
            boolean z1114 = zArr4[0];
            boolean z1115 = zArr4[1];
            if (this.p != 2) {
                uoa0Var3 = uoa0VarK;
                uoa0Var4 = uoa0VarK2;
                i16 = i14;
                r20 = r12;
                aVar4 = aVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            } else {
                uoa0Var3 = uoa0VarK;
                uoa0Var4 = uoa0VarK2;
                i16 = i14;
                r20 = r12;
                aVar4 = aVar5;
                z12 = z4;
                r3 = i6;
                z13 = z11;
                r110 = r19;
            }
            if (z) {
                uoa0Var5 = r33;
                uoa0Var6 = uoa0Var;
                uoa0Var7 = uoa0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            } else {
                uoa0Var5 = r33;
                uoa0Var6 = uoa0Var;
                uoa0Var7 = uoa0Var2;
                i17 = 0;
                i18 = 8;
                i19 = 1;
                i20 = 1;
            }
            if (this.q == 2) {
                i21 = i17;
            } else {
                i21 = i20;
            }
            if (i21 == 0) {
            }
            if (z7) {
                i22 = this.B;
                f2 = this.C;
                if (i22 == 1) {
                    rx0 rx0VarL1113 = ofsVar2.l();
                    rx0VarL1113.d.k(uoa0Var6, -1.0f);
                    rx0VarL1113.d.k(uoa0Var5, 1.0f);
                    rx0VarL1113.d.k(uoa0Var4, f2);
                    rx0VarL1113.d.k(uoa0Var3, -f2);
                    ofsVar2.c(rx0VarL1113);
                } else {
                    rx0 rx0VarL1114 = ofsVar2.l();
                    rx0VarL1114.d.k(uoa0Var4, -1.0f);
                    rx0VarL1114.d.k(uoa0Var3, 1.0f);
                    rx0VarL1114.d.k(uoa0Var6, f2);
                    rx0VarL1114.d.k(uoa0Var5, -f2);
                    ofsVar2.c(rx0VarL1114);
                }
            }
            if (ewaVar2.h()) {
                ixa ixaVar17 = ewaVar2.f.d;
                float radians9 = (float) Math.toRadians(this.E + 90.0f);
                int iE9 = ewaVar2.e();
                ewa.a aVar1118 = ewa.a.a;
                uoa0 uoa0VarK11111114 = ofsVar2.k(k(aVar1118));
                ewa.a aVar1119 = ewa.a.b;
                uoa0 uoa0VarK11111115 = ofsVar2.k(k(aVar1119));
                ewa.a aVar11110 = ewa.a.c;
                uoa0 uoa0VarK11111116 = ofsVar2.k(k(aVar11110));
                ewa.a aVar11111 = ewa.a.d;
                uoa0 uoa0VarK11111117 = ofsVar2.k(k(aVar11111));
                uoa0 uoa0VarK11111118 = ofsVar2.k(ixaVar17.k(aVar1118));
                uoa0 uoa0VarK11111119 = ofsVar2.k(ixaVar17.k(aVar1119));
                uoa0 uoa0VarK111111110 = ofsVar2.k(ixaVar17.k(aVar11110));
                uoa0 uoa0VarK111111111 = ofsVar2.k(ixaVar17.k(aVar11111));
                rx0 rx0VarL1115 = ofsVar2.l();
                double d17 = radians9;
                double dSin9 = Math.sin(d17);
                double d18 = iE9;
                rx0VarL1115.d.k(uoa0VarK11111119, 0.5f);
                rx0VarL1115.d.k(uoa0VarK111111111, 0.5f);
                rx0VarL1115.d.k(uoa0VarK11111115, -0.5f);
                rx0VarL1115.d.k(uoa0VarK11111117, -0.5f);
                rx0VarL1115.b = -((float) (dSin9 * d18));
                ofsVar2.c(rx0VarL1115);
                rx0 rx0VarL1116 = ofsVar2.l();
                float fCos9 = (float) (Math.cos(d17) * d18);
                rx0VarL1116.d.k(uoa0VarK11111118, 0.5f);
                rx0VarL1116.d.k(uoa0VarK111111110, 0.5f);
                rx0VarL1116.d.k(uoa0VarK11111114, -0.5f);
                rx0VarL1116.d.k(uoa0VarK11111116, -0.5f);
                rx0VarL1116.b = -fCos9;
                ofsVar2.c(rx0VarL1116);
            }
            this.l = false;
            this.m = false;
        }
        uoa0Var = uoa0VarK4;
        uoa0Var2 = uoa0VarK5;
        i14 = i12;
        i15 = i13;
        z7 = false;
        int[] iArr10 = this.u;
        iArr10[0] = i14;
        iArr10[1] = i15;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z7) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (this.V[0] == aVar5) {
            z10 = false;
        } else {
            z10 = false;
        }
        if (z10) {
            i8 = 0;
        }
        ewaVar2 = this.R;
        z11 = !ewaVar2.h();
        boolean z1116 = zArr4[0];
        boolean z1117 = zArr4[1];
        if (this.p != 2) {
            uoa0Var3 = uoa0VarK;
            uoa0Var4 = uoa0VarK2;
            i16 = i14;
            r20 = r12;
            aVar4 = aVar5;
            z12 = z4;
            r3 = i6;
            z13 = z11;
            r110 = r19;
        } else {
            uoa0Var3 = uoa0VarK;
            uoa0Var4 = uoa0VarK2;
            i16 = i14;
            r20 = r12;
            aVar4 = aVar5;
            z12 = z4;
            r3 = i6;
            z13 = z11;
            r110 = r19;
        }
        if (z) {
            uoa0Var5 = r33;
            uoa0Var6 = uoa0Var;
            uoa0Var7 = uoa0Var2;
            i17 = 0;
            i18 = 8;
            i19 = 1;
            i20 = 1;
        } else {
            uoa0Var5 = r33;
            uoa0Var6 = uoa0Var;
            uoa0Var7 = uoa0Var2;
            i17 = 0;
            i18 = 8;
            i19 = 1;
            i20 = 1;
        }
        if (this.q == 2) {
            i21 = i17;
        } else {
            i21 = i20;
        }
        if (i21 == 0) {
        }
        if (z7) {
            i22 = this.B;
            f2 = this.C;
            if (i22 == 1) {
                rx0 rx0VarL1117 = ofsVar2.l();
                rx0VarL1117.d.k(uoa0Var6, -1.0f);
                rx0VarL1117.d.k(uoa0Var5, 1.0f);
                rx0VarL1117.d.k(uoa0Var4, f2);
                rx0VarL1117.d.k(uoa0Var3, -f2);
                ofsVar2.c(rx0VarL1117);
            } else {
                rx0 rx0VarL1118 = ofsVar2.l();
                rx0VarL1118.d.k(uoa0Var4, -1.0f);
                rx0VarL1118.d.k(uoa0Var3, 1.0f);
                rx0VarL1118.d.k(uoa0Var6, f2);
                rx0VarL1118.d.k(uoa0Var5, -f2);
                ofsVar2.c(rx0VarL1118);
            }
        }
        if (ewaVar2.h()) {
            ixa ixaVar18 = ewaVar2.f.d;
            float radians10 = (float) Math.toRadians(this.E + 90.0f);
            int iE10 = ewaVar2.e();
            ewa.a aVar11112 = ewa.a.a;
            uoa0 uoa0VarK111111112 = ofsVar2.k(k(aVar11112));
            ewa.a aVar11113 = ewa.a.b;
            uoa0 uoa0VarK111111113 = ofsVar2.k(k(aVar11113));
            ewa.a aVar11114 = ewa.a.c;
            uoa0 uoa0VarK111111114 = ofsVar2.k(k(aVar11114));
            ewa.a aVar11115 = ewa.a.d;
            uoa0 uoa0VarK111111115 = ofsVar2.k(k(aVar11115));
            uoa0 uoa0VarK111111116 = ofsVar2.k(ixaVar18.k(aVar11112));
            uoa0 uoa0VarK111111117 = ofsVar2.k(ixaVar18.k(aVar11113));
            uoa0 uoa0VarK111111118 = ofsVar2.k(ixaVar18.k(aVar11114));
            uoa0 uoa0VarK111111119 = ofsVar2.k(ixaVar18.k(aVar11115));
            rx0 rx0VarL1119 = ofsVar2.l();
            double d19 = radians10;
            double dSin10 = Math.sin(d19);
            double d110 = iE10;
            rx0VarL1119.d.k(uoa0VarK111111117, 0.5f);
            rx0VarL1119.d.k(uoa0VarK111111119, 0.5f);
            rx0VarL1119.d.k(uoa0VarK111111113, -0.5f);
            rx0VarL1119.d.k(uoa0VarK111111115, -0.5f);
            rx0VarL1119.b = -((float) (dSin10 * d110));
            ofsVar2.c(rx0VarL1119);
            rx0 rx0VarL11110 = ofsVar2.l();
            float fCos10 = (float) (Math.cos(d19) * d110);
            rx0VarL11110.d.k(uoa0VarK111111116, 0.5f);
            rx0VarL11110.d.k(uoa0VarK111111118, 0.5f);
            rx0VarL11110.d.k(uoa0VarK111111112, -0.5f);
            rx0VarL11110.d.k(uoa0VarK111111114, -0.5f);
            rx0VarL11110.b = -fCos10;
            ofsVar2.c(rx0VarL11110);
        }
        this.l = false;
        this.m = false;
    }

    public boolean d() {
        return this.j0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:229:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:231:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:240:0x041a  */
    /* JADX WARN: Code duplicated, block: B:257:0x044d  */
    /* JADX WARN: Code duplicated, block: B:259:0x0453  */
    /* JADX WARN: Code duplicated, block: B:270:0x0468  */
    /* JADX WARN: Code duplicated, block: B:275:0x0472  */
    /* JADX WARN: Code duplicated, block: B:277:0x0476  */
    /* JADX WARN: Code duplicated, block: B:278:0x0478  */
    /* JADX WARN: Code duplicated, block: B:281:0x0480  */
    /* JADX WARN: Code duplicated, block: B:287:0x048e A[PHI: r0
      0x048e: PHI (r0v16 int) = (r0v15 int), (r0v20 int), (r0v20 int), (r0v20 int) binds: [B:280:0x047e, B:282:0x0484, B:283:0x0486, B:285:0x048a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:292:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:294:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:337:0x051e  */
    public final void e(ofs ofsVar, boolean z, boolean z2, boolean z3, boolean z4, uoa0 uoa0Var, uoa0 uoa0Var2, a aVar, boolean z5, ewa ewaVar, ewa ewaVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int iMin;
        int i9;
        int i10;
        boolean z12;
        uoa0 uoa0VarK;
        uoa0 uoa0VarK2;
        ewa ewaVar3;
        uoa0 uoa0Var3;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        ixa ixaVar;
        boolean z17;
        int iMin2;
        boolean z18;
        int i13;
        int iE;
        int i14;
        int i15;
        HashSet<ewa> hashSet;
        boolean z19;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z20;
        boolean z21;
        int i22;
        ofsVar = ofsVar;
        int i23 = i7;
        int i24 = i8;
        uoa0 uoa0VarK3 = ofsVar.k(ewaVar);
        uoa0 uoa0VarK4 = ofsVar.k(ewaVar2);
        uoa0 uoa0VarK5 = ofsVar.k(ewaVar.f);
        uoa0 uoa0VarK6 = ofsVar.k(ewaVar2.f);
        boolean zH = ewaVar.h();
        boolean zH2 = ewaVar2.h();
        boolean zH3 = this.R.h();
        int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i25++;
        }
        int i26 = i25;
        int i27 = z6 ? 3 : i5;
        int iOrdinal = aVar.ordinal();
        boolean z22 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i27 == 4) ? false : true;
        int i28 = this.h;
        if (i28 != -1 && z) {
            this.h = -1;
            i2 = i28;
            z22 = false;
        }
        int i29 = this.i;
        if (i29 == -1 || z) {
            i29 = i2;
        } else {
            this.i = -1;
            z22 = false;
        }
        int i30 = i29;
        if (this.j0 == 8) {
            z22 = false;
            iMin = 0;
        } else {
            iMin = i30;
        }
        if (z11) {
            if (!zH && !zH2 && !zH3) {
                ofsVar.d(uoa0VarK3, i);
            } else if (zH && !zH2) {
                i9 = 8;
                ofsVar.e(uoa0VarK3, uoa0VarK5, ewaVar.e(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z22 != 0) {
            if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (i24 == -2) {
                    i24 = iMin;
                }
                if (iMin > 0 && i27 != 1) {
                    iMin = 0;
                }
                if (i23 > 0) {
                    ofsVar.f(uoa0VarK4, uoa0VarK3, i23, 8);
                    iMin = Math.max(iMin, i23);
                }
                if (i24 > 0) {
                    if (!z2 || i27 != 1) {
                        ofsVar.g(uoa0VarK4, uoa0VarK3, i24, 8);
                    }
                    iMin = Math.min(iMin, i24);
                }
                if (i27 == 1) {
                    if (z2) {
                        ofsVar.e(uoa0VarK4, uoa0VarK3, iMin, 8);
                    } else if (z8) {
                        ofsVar.e(uoa0VarK4, uoa0VarK3, iMin, 5);
                        ofsVar.g(uoa0VarK4, uoa0VarK3, iMin, 8);
                    } else {
                        ofsVar.e(uoa0VarK4, uoa0VarK3, iMin, 5);
                        ofsVar.g(uoa0VarK4, uoa0VarK3, iMin, 8);
                    }
                } else if (i27 == 2) {
                    ewa.a aVar2 = ewaVar.e;
                    ewa.a aVar3 = ewa.a.d;
                    ewa.a aVar4 = ewa.a.b;
                    if (aVar2 == aVar4 || aVar2 == aVar3) {
                        uoa0VarK = ofsVar.k(this.W.k(aVar4));
                        uoa0VarK2 = ofsVar.k(this.W.k(aVar3));
                    } else {
                        uoa0VarK = ofsVar.k(this.W.k(ewa.a.a));
                        uoa0VarK2 = ofsVar.k(this.W.k(ewa.a.c));
                    }
                    rx0 rx0VarL = ofsVar.l();
                    int i31 = i23;
                    rx0VarL.d.k(uoa0VarK4, -1.0f);
                    rx0VarL.d.k(uoa0VarK3, 1.0f);
                    rx0VarL.d.k(uoa0VarK2, f2);
                    rx0VarL.d.k(uoa0VarK, -f2);
                    ofsVar.c(rx0VarL);
                    if (z2) {
                        z22 = false;
                    }
                    z12 = z4;
                    i10 = i31;
                } else {
                    i10 = i23;
                    z12 = true;
                }
            } else {
                int iMax = Math.max(i23, iMin);
                if (i24 > 0) {
                    iMax = Math.min(i24, iMax);
                }
                ofsVar.e(uoa0VarK4, uoa0VarK3, iMax, 8);
                z12 = z4;
                i10 = i23;
                z22 = false;
            }
            if (z11 || z8) {
                boolean z23 = z12;
                if (i26 >= 2 && z2 && z23) {
                    ofsVar.f(uoa0VarK3, uoa0Var, 0, 8);
                    ewa ewaVar4 = this.O;
                    boolean z24 = z || ewaVar4.f == null;
                    if (!z && (ewaVar3 = ewaVar4.f) != null) {
                        ixa ixaVar2 = ewaVar3.d;
                        if (ixaVar2.Z != 0.0f) {
                            a[] aVarArr = ixaVar2.V;
                            a aVar5 = aVarArr[0];
                            a aVar6 = a.c;
                            if (aVar5 == aVar6 && aVarArr[1] == aVar6) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                        } else {
                            z24 = false;
                        }
                    }
                    if (z24) {
                        ofsVar.f(uoa0Var2, uoa0VarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    ewaVar2 = ewaVar2;
                    uoa0VarK4 = uoa0VarK4;
                    z12 = z12;
                    uoa0Var3 = uoa0VarK6;
                    z17 = z2;
                    i22 = (z2 && (ewaVar.f.d instanceof vx1)) ? 8 : 5;
                } else if (zH || !zH2) {
                    uoa0Var3 = uoa0VarK6;
                    if (zH && zH2) {
                        ixa ixaVar3 = ewaVar.f.d;
                        ixa ixaVar4 = ewaVar2.f.d;
                        z12 = z12;
                        ixa ixaVar5 = this.W;
                        int i32 = 6;
                        if (z22) {
                            if (i27 == 0) {
                                if (i24 != 0 || i10 != 0) {
                                    i20 = 5;
                                    i21 = 5;
                                    z20 = true;
                                    z21 = false;
                                    z14 = true;
                                } else if (uoa0VarK5.f && uoa0Var3.f) {
                                    ofsVar.e(uoa0VarK3, uoa0VarK5, ewaVar.e(), 8);
                                    ofsVar.e(uoa0VarK4, uoa0Var3, -ewaVar2.e(), 8);
                                    return;
                                } else {
                                    i20 = 8;
                                    i21 = 8;
                                    z20 = false;
                                    z21 = true;
                                    z14 = false;
                                }
                                if ((ixaVar3 instanceof vx1) || (ixaVar4 instanceof vx1)) {
                                    i11 = i20;
                                    uoa0VarK5 = uoa0VarK5;
                                    ofsVar = ofsVar;
                                    i27 = i27;
                                    uoa0VarK3 = uoa0VarK3;
                                    uoa0VarK4 = uoa0VarK4;
                                    i32 = 6;
                                    z15 = z21;
                                    uoa0Var2 = uoa0Var2;
                                    z13 = z20;
                                    i12 = 4;
                                } else {
                                    i11 = i20;
                                    uoa0VarK5 = uoa0VarK5;
                                    ofsVar = ofsVar;
                                    uoa0VarK3 = uoa0VarK3;
                                    uoa0VarK4 = uoa0VarK4;
                                    i32 = 6;
                                    z15 = z21;
                                    z13 = z20;
                                    i12 = i21;
                                    i27 = i27;
                                    uoa0Var2 = uoa0Var2;
                                }
                            } else {
                                if (i27 == 2) {
                                    if ((ixaVar3 instanceof vx1) || (ixaVar4 instanceof vx1)) {
                                        i11 = 5;
                                    } else {
                                        ofsVar = ofsVar;
                                        i27 = i27;
                                        uoa0VarK3 = uoa0VarK3;
                                        uoa0VarK4 = uoa0VarK4;
                                        uoa0VarK5 = uoa0VarK5;
                                        i32 = 6;
                                        i11 = 5;
                                        i12 = 5;
                                    }
                                    z13 = true;
                                    z14 = true;
                                    z15 = false;
                                    uoa0Var2 = uoa0Var2;
                                } else if (i27 == 1) {
                                    i11 = 8;
                                } else if (i27 == 3) {
                                    i27 = i27;
                                    if (this.B == -1) {
                                        if (z9) {
                                            ofsVar = ofsVar;
                                            uoa0Var2 = uoa0Var2;
                                            uoa0VarK3 = uoa0VarK3;
                                            uoa0VarK4 = uoa0VarK4;
                                            uoa0VarK5 = uoa0VarK5;
                                            i32 = z2 ? 5 : 4;
                                        } else {
                                            ofsVar = ofsVar;
                                            uoa0Var2 = uoa0Var2;
                                            uoa0VarK3 = uoa0VarK3;
                                            uoa0VarK4 = uoa0VarK4;
                                            uoa0VarK5 = uoa0VarK5;
                                            i32 = 8;
                                        }
                                        i11 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i18 = 5;
                                                i19 = 4;
                                            } else {
                                                i18 = 8;
                                                i19 = 5;
                                            }
                                            i12 = i19;
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                        } else {
                                            if (i24 > 0) {
                                                ofsVar = ofsVar;
                                                uoa0Var2 = uoa0Var2;
                                                uoa0VarK3 = uoa0VarK3;
                                                uoa0VarK4 = uoa0VarK4;
                                                uoa0VarK5 = uoa0VarK5;
                                                i32 = 6;
                                                i11 = 5;
                                            } else if (i24 != 0 || i10 != 0) {
                                                ofsVar = ofsVar;
                                                uoa0Var2 = uoa0Var2;
                                                uoa0VarK3 = uoa0VarK3;
                                                uoa0VarK4 = uoa0VarK4;
                                                uoa0VarK5 = uoa0VarK5;
                                                i32 = 6;
                                                i11 = 5;
                                                i12 = 4;
                                            } else if (z9) {
                                                i18 = (ixaVar3 == ixaVar5 || ixaVar4 == ixaVar5) ? 5 : 4;
                                                i12 = 4;
                                                z13 = true;
                                                z14 = true;
                                                z15 = true;
                                            } else {
                                                ofsVar = ofsVar;
                                                uoa0Var2 = uoa0Var2;
                                                uoa0VarK3 = uoa0VarK3;
                                                uoa0VarK4 = uoa0VarK4;
                                                uoa0VarK5 = uoa0VarK5;
                                                i32 = 6;
                                                i11 = 5;
                                                i12 = 8;
                                            }
                                            z13 = true;
                                            z14 = true;
                                            z15 = true;
                                        }
                                        i11 = i18;
                                        ofsVar = ofsVar;
                                    }
                                    i12 = 5;
                                    z13 = true;
                                    z14 = true;
                                    z15 = true;
                                } else {
                                    i11 = 5;
                                    i12 = 4;
                                    z13 = false;
                                    z14 = false;
                                }
                                i12 = 4;
                                z13 = true;
                                z14 = true;
                                z15 = false;
                                uoa0Var2 = uoa0Var2;
                            }
                            if (z14 || uoa0VarK5 != uoa0Var3 || ixaVar3 == ixaVar5) {
                                z16 = true;
                            } else {
                                z14 = false;
                                z16 = false;
                            }
                            if (z13) {
                                if (z22 && !z7 && !z9 && uoa0VarK5 == uoa0Var && uoa0Var3 == uoa0Var2) {
                                    i17 = 8;
                                    z17 = false;
                                    i16 = 8;
                                    z19 = false;
                                } else {
                                    z17 = z2;
                                    z19 = z16;
                                    i16 = i11;
                                    i17 = i32;
                                }
                                uoa0 uoa0Var4 = uoa0VarK5;
                                ixaVar = ixaVar4;
                                ofsVar.b(uoa0VarK3, uoa0Var4, ewaVar.e(), f, uoa0Var3, uoa0VarK4, ewaVar2.e(), i17);
                                uoa0VarK5 = uoa0Var4;
                                i11 = i16;
                                z16 = z19;
                            } else {
                                ixaVar = ixaVar4;
                                z17 = z2;
                            }
                            if (this.j0 != 8 && ((hashSet = ewaVar2.a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z14) {
                                if (z17 && uoa0VarK5 != uoa0Var3 && !z22 && ((ixaVar3 instanceof vx1) || (ixaVar instanceof vx1))) {
                                    i11 = 6;
                                }
                                ofsVar.f(uoa0VarK3, uoa0VarK5, ewaVar.e(), i11);
                                ofsVar.g(uoa0VarK4, uoa0Var3, -ewaVar2.e(), i11);
                            }
                            if (z17 || !z10 || (ixaVar3 instanceof vx1) || (ixaVar instanceof vx1) || ixaVar == ixaVar5) {
                                iMin2 = i12;
                                z18 = z16;
                            } else {
                                iMin2 = 6;
                                i11 = 6;
                                z18 = true;
                            }
                            if (z18) {
                                if (z15 && (!z9 || z3)) {
                                    if (ixaVar3 != ixaVar5 && ixaVar != ixaVar5) {
                                        i32 = iMin2;
                                    }
                                    if ((ixaVar3 instanceof qal) || (ixaVar instanceof qal)) {
                                        i32 = 5;
                                    }
                                    if ((ixaVar3 instanceof vx1) || (ixaVar instanceof vx1)) {
                                        i32 = 5;
                                    }
                                    if (z9) {
                                        i15 = 5;
                                    } else {
                                        i15 = i32;
                                    }
                                    iMin2 = Math.max(i15, iMin2);
                                }
                                if (z17) {
                                    iMin2 = Math.min(i11, iMin2);
                                    if (z6 || z9 || !(ixaVar3 == ixaVar5 || ixaVar == ixaVar5)) {
                                        i14 = iMin2;
                                    } else {
                                        i14 = 4;
                                    }
                                } else {
                                    i14 = iMin2;
                                }
                                ofsVar.e(uoa0VarK3, uoa0VarK5, ewaVar.e(), i14);
                                ofsVar.e(uoa0VarK4, uoa0Var3, -ewaVar2.e(), i14);
                            }
                            if (z17) {
                                if (uoa0Var == uoa0VarK5) {
                                    iE = ewaVar.e();
                                } else {
                                    iE = 0;
                                }
                                if (uoa0VarK5 != uoa0Var) {
                                    ofsVar.f(uoa0VarK3, uoa0Var, iE, 5);
                                }
                            }
                            if (z17 || !z22 || i3 != 0 || i10 != 0) {
                                i13 = 5;
                            } else if (z22 && i27 == 3) {
                                ofsVar.f(uoa0VarK4, uoa0VarK3, 0, 8);
                                i13 = 5;
                            } else {
                                i13 = 5;
                                ofsVar.f(uoa0VarK4, uoa0VarK3, 0, 5);
                            }
                        } else {
                            if (uoa0VarK5.f && uoa0Var3.f) {
                                ofsVar.b(uoa0VarK3, uoa0VarK5, ewaVar.e(), f, uoa0Var3, uoa0VarK4, ewaVar2.e(), 8);
                                if (z2 && z12) {
                                    int iE2 = ewaVar2.f != null ? ewaVar2.e() : 0;
                                    if (uoa0Var3 != uoa0Var2) {
                                        ofsVar.f(uoa0Var2, uoa0VarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i11 = 5;
                            i12 = 4;
                            z13 = true;
                            z14 = true;
                        }
                        z15 = false;
                        if (z14) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        if (z13) {
                            if (z22) {
                                z17 = z2;
                                z19 = z16;
                                i16 = i11;
                                i17 = i32;
                            } else {
                                z17 = z2;
                                z19 = z16;
                                i16 = i11;
                                i17 = i32;
                            }
                            uoa0 uoa0Var5 = uoa0VarK5;
                            ixaVar = ixaVar4;
                            ofsVar.b(uoa0VarK3, uoa0Var5, ewaVar.e(), f, uoa0Var3, uoa0VarK4, ewaVar2.e(), i17);
                            uoa0VarK5 = uoa0Var5;
                            i11 = i16;
                            z16 = z19;
                        } else {
                            ixaVar = ixaVar4;
                            z17 = z2;
                        }
                        if (this.j0 != 8) {
                        }
                        if (z14) {
                            if (z17) {
                                i11 = 6;
                            }
                            ofsVar.f(uoa0VarK3, uoa0VarK5, ewaVar.e(), i11);
                            ofsVar.g(uoa0VarK4, uoa0Var3, -ewaVar2.e(), i11);
                        }
                        if (z17) {
                            iMin2 = i12;
                            z18 = z16;
                        } else {
                            iMin2 = i12;
                            z18 = z16;
                        }
                        if (z18) {
                            if (z15) {
                                if (ixaVar3 != ixaVar5) {
                                    i32 = iMin2;
                                }
                                if (ixaVar3 instanceof qal) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (ixaVar3 instanceof vx1) {
                                    i32 = 5;
                                } else {
                                    i32 = 5;
                                }
                                if (z9) {
                                    i15 = 5;
                                } else {
                                    i15 = i32;
                                }
                                iMin2 = Math.max(i15, iMin2);
                            }
                            if (z17) {
                                iMin2 = Math.min(i11, iMin2);
                                if (z6) {
                                    i14 = iMin2;
                                } else {
                                    i14 = iMin2;
                                }
                            } else {
                                i14 = iMin2;
                            }
                            ofsVar.e(uoa0VarK3, uoa0VarK5, ewaVar.e(), i14);
                            ofsVar.e(uoa0VarK4, uoa0Var3, -ewaVar2.e(), i14);
                        }
                        if (z17) {
                            if (uoa0Var == uoa0VarK5) {
                                iE = ewaVar.e();
                            } else {
                                iE = 0;
                            }
                            if (uoa0VarK5 != uoa0Var) {
                                ofsVar.f(uoa0VarK3, uoa0Var, iE, 5);
                            }
                        }
                        if (z17) {
                            i13 = 5;
                        } else {
                            i13 = 5;
                        }
                    }
                    i22 = i13;
                } else {
                    uoa0Var3 = uoa0VarK6;
                    ofsVar.e(uoa0VarK4, uoa0Var3, -ewaVar2.e(), 8);
                    if (z2) {
                        ofsVar.f(uoa0VarK3, uoa0Var, 0, 5);
                        ewaVar2 = ewaVar2;
                        i13 = 5;
                        uoa0VarK4 = uoa0VarK4;
                        z12 = z12;
                    }
                    z17 = z2;
                    i22 = i13;
                }
                if (z17 || !z12) {
                    return;
                }
                int iE3 = ewaVar2.f != null ? ewaVar2.e() : 0;
                if (uoa0Var3 != uoa0Var2) {
                    ofsVar.f(uoa0Var2, uoa0VarK4, iE3, i22);
                    return;
                }
                return;
            }
            uoa0Var3 = uoa0VarK6;
            i13 = 5;
            z17 = z2;
            i22 = i13;
            if (z17) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            ofsVar.e(uoa0VarK4, uoa0VarK3, 0, 3);
            if (i3 > 0) {
                ofsVar.f(uoa0VarK4, uoa0VarK3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                ofsVar.g(uoa0VarK4, uoa0VarK3, i4, i9);
            }
        } else {
            ofsVar.e(uoa0VarK4, uoa0VarK3, iMin, i9);
        }
        z12 = z4;
        i10 = i23;
        if (z11) {
        }
        boolean z25 = z12;
        if (i26 >= 2) {
        }
    }

    public final void f(ewa.a aVar, ixa ixaVar, ewa.a aVar2, int i) {
        boolean z;
        ewa.a aVar3 = ewa.a.v;
        ewa.a aVar4 = ewa.a.i;
        ewa.a aVar5 = ewa.a.a;
        ewa.a aVar6 = ewa.a.b;
        ewa.a aVar7 = ewa.a.c;
        ewa.a aVar8 = ewa.a.d;
        ewa.a aVar9 = ewa.a.f;
        if (aVar == aVar9) {
            if (aVar2 != aVar9) {
                if (aVar2 == aVar5 || aVar2 == aVar7) {
                    f(aVar5, ixaVar, aVar2, 0);
                    f(aVar7, ixaVar, aVar2, 0);
                    k(aVar9).a(ixaVar.k(aVar2), 0);
                    return;
                } else {
                    if (aVar2 == aVar6 || aVar2 == aVar8) {
                        f(aVar6, ixaVar, aVar2, 0);
                        f(aVar8, ixaVar, aVar2, 0);
                        k(aVar9).a(ixaVar.k(aVar2), 0);
                        return;
                    }
                    return;
                }
            }
            ewa ewaVarK = k(aVar5);
            ewa ewaVarK2 = k(aVar7);
            ewa ewaVarK3 = k(aVar6);
            ewa ewaVarK4 = k(aVar8);
            boolean z2 = true;
            if ((ewaVarK == null || !ewaVarK.h()) && (ewaVarK2 == null || !ewaVarK2.h())) {
                f(aVar5, ixaVar, aVar5, 0);
                f(aVar7, ixaVar, aVar7, 0);
                z = true;
            } else {
                z = false;
            }
            if ((ewaVarK3 == null || !ewaVarK3.h()) && (ewaVarK4 == null || !ewaVarK4.h())) {
                f(aVar6, ixaVar, aVar6, 0);
                f(aVar8, ixaVar, aVar8, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                k(aVar9).a(ixaVar.k(aVar9), 0);
                return;
            } else if (z) {
                k(aVar4).a(ixaVar.k(aVar4), 0);
                return;
            } else {
                if (z2) {
                    k(aVar3).a(ixaVar.k(aVar3), 0);
                    return;
                }
                return;
            }
        }
        if (aVar == aVar4 && (aVar2 == aVar5 || aVar2 == aVar7)) {
            ewa ewaVarK5 = k(aVar5);
            ewa ewaVarK6 = ixaVar.k(aVar2);
            ewa ewaVarK7 = k(aVar7);
            ewaVarK5.a(ewaVarK6, 0);
            ewaVarK7.a(ewaVarK6, 0);
            k(aVar4).a(ewaVarK6, 0);
            return;
        }
        if (aVar == aVar3 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            ewa ewaVarK8 = ixaVar.k(aVar2);
            k(aVar6).a(ewaVarK8, 0);
            k(aVar8).a(ewaVarK8, 0);
            k(aVar3).a(ewaVarK8, 0);
            return;
        }
        if (aVar == aVar4 && aVar2 == aVar4) {
            k(aVar5).a(ixaVar.k(aVar5), 0);
            k(aVar7).a(ixaVar.k(aVar7), 0);
            k(aVar4).a(ixaVar.k(aVar2), 0);
            return;
        }
        if (aVar == aVar3 && aVar2 == aVar3) {
            k(aVar6).a(ixaVar.k(aVar6), 0);
            k(aVar8).a(ixaVar.k(aVar8), 0);
            k(aVar3).a(ixaVar.k(aVar2), 0);
            return;
        }
        ewa ewaVarK9 = k(aVar);
        ewa ewaVarK10 = ixaVar.k(aVar2);
        if (ewaVarK9.i(ewaVarK10)) {
            ewa.a aVar10 = ewa.a.e;
            if (aVar == aVar10) {
                ewa ewaVarK11 = k(aVar6);
                ewa ewaVarK12 = k(aVar8);
                if (ewaVarK11 != null) {
                    ewaVarK11.j();
                }
                if (ewaVarK12 != null) {
                    ewaVarK12.j();
                }
            } else if (aVar == aVar6 || aVar == aVar8) {
                ewa ewaVarK13 = k(aVar10);
                if (ewaVarK13 != null) {
                    ewaVarK13.j();
                }
                ewa ewaVarK14 = k(aVar9);
                if (ewaVarK14.f != ewaVarK10) {
                    ewaVarK14.j();
                }
                ewa ewaVarF = k(aVar).f();
                ewa ewaVarK15 = k(aVar3);
                if (ewaVarK15.h()) {
                    ewaVarF.j();
                    ewaVarK15.j();
                }
            } else if (aVar == aVar5 || aVar == aVar7) {
                ewa ewaVarK16 = k(aVar9);
                if (ewaVarK16.f != ewaVarK10) {
                    ewaVarK16.j();
                }
                ewa ewaVarF2 = k(aVar).f();
                ewa ewaVarK17 = k(aVar4);
                if (ewaVarK17.h()) {
                    ewaVarF2.j();
                    ewaVarK17.j();
                }
            }
            ewaVarK9.a(ewaVarK10, i);
        }
    }

    public final void g(ewa ewaVar, ewa ewaVar2, int i) {
        if (ewaVar.d == this) {
            f(ewaVar.e, ewaVar2.d, ewaVar2.e, i);
        }
    }

    public void h(ixa ixaVar, HashMap<ixa, ixa> map) {
        this.p = ixaVar.p;
        this.q = ixaVar.q;
        this.s = ixaVar.s;
        this.t = ixaVar.t;
        int[] iArr = ixaVar.u;
        int i = iArr[0];
        int[] iArr2 = this.u;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.v = ixaVar.v;
        this.w = ixaVar.w;
        this.y = ixaVar.y;
        this.z = ixaVar.z;
        this.A = ixaVar.A;
        this.B = ixaVar.B;
        this.C = ixaVar.C;
        int[] iArr3 = ixaVar.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = ixaVar.E;
        this.F = ixaVar.F;
        this.G = ixaVar.G;
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = (a[]) Arrays.copyOf(this.V, 2);
        this.W = this.W == null ? null : map.get(ixaVar.W);
        this.X = ixaVar.X;
        this.Y = ixaVar.Y;
        this.Z = ixaVar.Z;
        this.a0 = ixaVar.a0;
        this.b0 = ixaVar.b0;
        this.c0 = ixaVar.c0;
        this.d0 = ixaVar.d0;
        this.e0 = ixaVar.e0;
        this.f0 = ixaVar.f0;
        this.g0 = ixaVar.g0;
        this.h0 = ixaVar.h0;
        this.i0 = ixaVar.i0;
        this.j0 = ixaVar.j0;
        this.k0 = ixaVar.k0;
        this.l0 = ixaVar.l0;
        this.m0 = ixaVar.m0;
        this.n0 = ixaVar.n0;
        float[] fArr = ixaVar.o0;
        float f = fArr[0];
        float[] fArr2 = this.o0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ixa[] ixaVarArr = ixaVar.p0;
        ixa ixaVar2 = ixaVarArr[0];
        ixa[] ixaVarArr2 = this.p0;
        ixaVarArr2[0] = ixaVar2;
        ixaVarArr2[1] = ixaVarArr[1];
        ixa[] ixaVarArr3 = ixaVar.q0;
        ixa ixaVar3 = ixaVarArr3[0];
        ixa[] ixaVarArr4 = this.q0;
        ixaVarArr4[0] = ixaVar3;
        ixaVarArr4[1] = ixaVarArr3[1];
        ixa ixaVar4 = ixaVar.r0;
        this.r0 = ixaVar4 == null ? null : map.get(ixaVar4);
        ixa ixaVar5 = ixaVar.s0;
        this.s0 = ixaVar5 != null ? map.get(ixaVar5) : null;
    }

    public final void i(ofs ofsVar) {
        ofsVar.k(this.K);
        ofsVar.k(this.L);
        ofsVar.k(this.M);
        ofsVar.k(this.N);
        if (this.d0 > 0) {
            ofsVar.k(this.O);
        }
    }

    public final void j() {
        if (this.d == null) {
            vjm vjmVar = new vjm(this);
            vjmVar.h.e = zmd.a.d;
            vjmVar.i.e = zmd.a.e;
            vjmVar.f = 0;
            this.d = vjmVar;
        }
        if (this.e == null) {
            c3i0 c3i0Var = new c3i0(this);
            zmd zmdVar = new zmd(c3i0Var);
            c3i0Var.k = zmdVar;
            c3i0Var.l = null;
            c3i0Var.h.e = zmd.a.f;
            c3i0Var.i.e = zmd.a.i;
            zmdVar.e = zmd.a.v;
            c3i0Var.f = 1;
            this.e = c3i0Var;
        }
    }

    public ewa k(ewa.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                jb5.a(aVar.name());
                return null;
        }
    }

    public final a l(int i) {
        if (i == 0) {
            return this.V[0];
        }
        if (i == 1) {
            return this.V[1];
        }
        return null;
    }

    public final int m() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final ixa n(int i) {
        ewa ewaVar;
        ewa ewaVar2;
        if (i != 0) {
            if (i == 1 && (ewaVar2 = (ewaVar = this.N).f) != null && ewaVar2.f == ewaVar) {
                return ewaVar2.d;
            }
            return null;
        }
        ewa ewaVar3 = this.M;
        ewa ewaVar4 = ewaVar3.f;
        if (ewaVar4 == null || ewaVar4.f != ewaVar3) {
            return null;
        }
        return ewaVar4.d;
    }

    public final ixa o(int i) {
        ewa ewaVar;
        ewa ewaVar2;
        if (i != 0) {
            if (i == 1 && (ewaVar2 = (ewaVar = this.L).f) != null && ewaVar2.f == ewaVar) {
                return ewaVar2.d;
            }
            return null;
        }
        ewa ewaVar3 = this.K;
        ewa ewaVar4 = ewaVar3.f;
        if (ewaVar4 == null || ewaVar4.f != ewaVar3) {
            return null;
        }
        return ewaVar4.d;
    }

    public void p(StringBuilder sb) {
        sb.append("  " + this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.c0);
        sb.append("\n");
        r(sb, "left", this.K);
        r(sb, "top", this.L);
        r(sb, "right", this.M);
        r(sb, "bottom", this.N);
        r(sb, "baseline", this.O);
        r(sb, "centerX", this.P);
        r(sb, "centerY", this.Q);
        int i = this.X;
        int i2 = this.e0;
        int i3 = this.D[0];
        int i4 = this.v;
        int i5 = this.s;
        float f = this.x;
        a aVar = this.V[0];
        float[] fArr = this.o0;
        float f2 = fArr[0];
        q(sb, "    width", i, i2, i3, i4, i5, f, aVar);
        int i6 = this.Y;
        int i7 = this.f0;
        int i8 = this.D[1];
        int i9 = this.y;
        int i10 = this.t;
        float f3 = this.A;
        a aVar2 = this.V[1];
        float f4 = fArr[1];
        q(sb, "    height", i6, i7, i8, i9, i10, f3, aVar2);
        float f5 = this.Z;
        int i11 = this.a0;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        J(sb, "    horizontalBias", this.g0, 0.5f);
        J(sb, "    verticalBias", this.h0, 0.5f);
        I(this.m0, 0, "    horizontalChainStyle", sb);
        I(this.n0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int s() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int t() {
        ixa ixaVar = this.W;
        return (ixaVar == null || !(ixaVar instanceof jxa)) ? this.b0 : ((jxa) ixaVar).C0 + this.b0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.l0 != null ? uf80.a(new StringBuilder("id: "), this.l0, " ") : "");
        sb.append("(");
        sb.append(this.b0);
        sb.append(", ");
        sb.append(this.c0);
        sb.append(") - (");
        sb.append(this.X);
        sb.append(" x ");
        return zk1.a(this.Y, ")", sb);
    }

    public final int u() {
        ixa ixaVar = this.W;
        return (ixaVar == null || !(ixaVar instanceof jxa)) ? this.c0 : ((jxa) ixaVar).D0 + this.c0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean v(int i) {
        if (i == 0) {
            if ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.L.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) + (this.O.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean w(int i, int i2) {
        ewa ewaVar;
        ewa ewaVar2;
        ewa ewaVar3;
        ewa ewaVar4;
        if (i == 0) {
            ewa ewaVar5 = this.K;
            ewa ewaVar6 = ewaVar5.f;
            if (ewaVar6 == null || !ewaVar6.c || (ewaVar4 = (ewaVar3 = this.M).f) == null || !ewaVar4.c) {
                return false;
            }
            return (ewaVar4.d() - ewaVar3.e()) - (ewaVar5.e() + ewaVar5.f.d()) >= i2;
        }
        ewa ewaVar7 = this.L;
        ewa ewaVar8 = ewaVar7.f;
        if (ewaVar8 == null || !ewaVar8.c || (ewaVar2 = (ewaVar = this.N).f) == null || !ewaVar2.c) {
            return false;
        }
        return (ewaVar2.d() - ewaVar.e()) - (ewaVar7.e() + ewaVar7.f.d()) >= i2;
    }

    public final void x(ewa.a aVar, ixa ixaVar, ewa.a aVar2, int i, int i2) {
        k(aVar).b(ixaVar.k(aVar2), i, i2, true);
    }

    public final boolean y(int i) {
        ewa ewaVar;
        ewa ewaVar2;
        int i2 = i * 2;
        ewa[] ewaVarArr = this.S;
        ewa ewaVar3 = ewaVarArr[i2];
        ewa ewaVar4 = ewaVar3.f;
        return (ewaVar4 == null || ewaVar4.f == ewaVar3 || (ewaVar2 = (ewaVar = ewaVarArr[i2 + 1]).f) == null || ewaVar2.f != ewaVar) ? false : true;
    }

    public final boolean z() {
        ewa ewaVar = this.K;
        ewa ewaVar2 = ewaVar.f;
        if (ewaVar2 != null && ewaVar2.f == ewaVar) {
            return true;
        }
        ewa ewaVar3 = this.M;
        ewa ewaVar4 = ewaVar3.f;
        return ewaVar4 != null && ewaVar4.f == ewaVar3;
    }

    public ixa(int i, int i2) {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new u6j0(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Reader.READ_DONE, Reader.READ_DONE};
        this.E = Float.NaN;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ewa ewaVar = new ewa(this, ewa.a.a);
        this.K = ewaVar;
        ewa ewaVar2 = new ewa(this, ewa.a.b);
        this.L = ewaVar2;
        ewa ewaVar3 = new ewa(this, ewa.a.c);
        this.M = ewaVar3;
        ewa ewaVar4 = new ewa(this, ewa.a.d);
        this.N = ewaVar4;
        ewa ewaVar5 = new ewa(this, ewa.a.e);
        this.O = ewaVar5;
        this.P = new ewa(this, ewa.a.i);
        this.Q = new ewa(this, ewa.a.v);
        ewa ewaVar6 = new ewa(this, ewa.a.f);
        this.R = ewaVar6;
        this.S = new ewa[]{ewaVar, ewaVar3, ewaVar2, ewaVar4, ewaVar5, ewaVar6};
        this.T = new ArrayList<>();
        this.U = new boolean[2];
        a aVar = a.a;
        this.V = new a[]{aVar, aVar};
        this.W = null;
        this.Z = 0.0f;
        this.a0 = -1;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new ixa[]{null, null};
        this.q0 = new ixa[]{null, null};
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.X = i;
        this.Y = i2;
        a();
    }
}
