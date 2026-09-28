package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class rwa implements eq40 {
    public Object a;
    public final rwd0 b;
    public float b0;
    public float c0;
    public cqe e0;
    public cqe f0;
    public vhv g0;
    public ixa h0;
    public final HashMap<String, Integer> i0;
    public final HashMap<String, Float> j0;
    public e6h c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public rwa T = null;
    public Object U = null;
    public Object V = null;
    public rwa W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public rwd0.b d0 = null;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rwd0.b.values().length];
            a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[16] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[14] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[19] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[17] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[18] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public rwa(rwd0 rwd0Var) {
        String str = cqe.h;
        cqe cqeVar = new cqe(str);
        String str2 = cqe.i;
        cqeVar.f = str2;
        this.e0 = cqeVar;
        cqe cqeVar2 = new cqe(str);
        cqeVar2.f = str2;
        this.f0 = cqeVar2;
        this.i0 = new HashMap<>();
        this.j0 = new HashMap<>();
        this.b = rwd0Var;
    }

    @Override // defpackage.eq40
    public ixa a() {
        ixa ixaVar = this.h0;
        if (ixaVar != null) {
            return ixaVar;
        }
        ixa ixaVar2 = new ixa(this.e0.d, this.f0.d);
        this.h0 = ixaVar2;
        ixaVar2.i0 = this.g0;
        return ixaVar2;
    }

    @Override // defpackage.eq40, defpackage.e6h
    public void apply() {
        if (this.h0 == null) {
            return;
        }
        e6h e6hVar = this.c;
        if (e6hVar != null) {
            e6hVar.apply();
        }
        this.e0.a(this.h0, 0);
        this.f0.a(this.h0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.h0, this.J, rwd0.b.a);
        d(this.h0, this.K, rwd0.b.b);
        d(this.h0, this.L, rwd0.b.c);
        d(this.h0, this.M, rwd0.b.d);
        d(this.h0, this.N, rwd0.b.e);
        d(this.h0, this.O, rwd0.b.f);
        d(this.h0, this.P, rwd0.b.i);
        d(this.h0, this.Q, rwd0.b.v);
        d(this.h0, this.R, rwd0.b.w);
        d(this.h0, this.S, rwd0.b.y);
        d(this.h0, this.T, rwd0.b.z);
        d(this.h0, this.U, rwd0.b.A);
        d(this.h0, this.V, rwd0.b.B);
        d(this.h0, this.W, rwd0.b.C);
        d(this.h0, this.X, rwd0.b.D);
        d(this.h0, this.Y, rwd0.b.E);
        d(this.h0, this.Z, rwd0.b.F);
        d(this.h0, this.a0, rwd0.b.G);
        int i = this.d;
        if (i != 0) {
            this.h0.m0 = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.h0.n0 = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.h0.o0[0] = f;
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.h0.o0[1] = f2;
        }
        ixa ixaVar = this.h0;
        ixaVar.g0 = this.h;
        ixaVar.h0 = this.i;
        u6j0 u6j0Var = ixaVar.j;
        u6j0Var.d = this.x;
        u6j0Var.e = this.y;
        u6j0Var.f = this.z;
        u6j0Var.g = this.A;
        u6j0Var.h = this.B;
        u6j0Var.i = this.C;
        u6j0Var.j = this.D;
        u6j0Var.k = this.E;
        u6j0Var.l = this.G;
        u6j0Var.m = this.H;
        u6j0Var.n = this.F;
        int i3 = this.I;
        u6j0Var.o = i3;
        ixaVar.j0 = i3;
        HashMap<String, Integer> map = this.i0;
        for (String str : map.keySet()) {
            Integer num = map.get(str);
            u6j0 u6j0Var2 = this.h0.j;
            int iIntValue = num.intValue();
            HashMap<String, gkc> map2 = u6j0Var2.p;
            if (map2.containsKey(str)) {
                map2.get(str).c = iIntValue;
            } else {
                gkc gkcVar = new gkc();
                gkcVar.d = Float.NaN;
                gkcVar.a = str;
                gkcVar.b = 902;
                gkcVar.c = iIntValue;
                map2.put(str, gkcVar);
            }
        }
        HashMap<String, Float> map3 = this.j0;
        for (String str2 : map3.keySet()) {
            float fFloatValue = map3.get(str2).floatValue();
            HashMap<String, gkc> map4 = this.h0.j.p;
            if (map4.containsKey(str2)) {
                map4.get(str2).d = fFloatValue;
            } else {
                gkc gkcVar2 = new gkc();
                gkcVar2.c = Integer.MIN_VALUE;
                gkcVar2.a = str2;
                gkcVar2.b = 901;
                gkcVar2.d = fFloatValue;
                map4.put(str2, gkcVar2);
            }
        }
    }

    @Override // defpackage.eq40
    public final void b(ixa ixaVar) {
        if (ixaVar == null) {
            return;
        }
        this.h0 = ixaVar;
        ixaVar.i0 = this.g0;
    }

    @Override // defpackage.eq40
    public final e6h c() {
        return this.c;
    }

    public final void d(ixa ixaVar, Object obj, rwd0.b bVar) {
        ixa ixaVarA = obj instanceof eq40 ? ((eq40) obj).a() : null;
        if (ixaVarA == null) {
            return;
        }
        int i = a.a[bVar.ordinal()];
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 19) {
            float f = this.b0;
            int i2 = (int) this.c0;
            ewa.a aVar = ewa.a.f;
            ixaVar.x(aVar, ixaVarA, aVar, i2, 0);
            ixaVar.E = f;
            return;
        }
        ewa.a aVar2 = ewa.a.d;
        ewa.a aVar3 = ewa.a.b;
        ewa.a aVar4 = ewa.a.e;
        ewa.a aVar5 = ewa.a.a;
        ewa.a aVar6 = ewa.a.c;
        switch (iOrdinal) {
            case 0:
                ixaVar.k(aVar5).b(ixaVarA.k(aVar5), this.j, this.p, false);
                break;
            case 1:
                ixaVar.k(aVar5).b(ixaVarA.k(aVar6), this.j, this.p, false);
                break;
            case 2:
                ixaVar.k(aVar6).b(ixaVarA.k(aVar5), this.k, this.q, false);
                break;
            case 3:
                ixaVar.k(aVar6).b(ixaVarA.k(aVar6), this.k, this.q, false);
                break;
            case 4:
                ixaVar.k(aVar5).b(ixaVarA.k(aVar5), this.l, this.r, false);
                break;
            case 5:
                ixaVar.k(aVar5).b(ixaVarA.k(aVar6), this.l, this.r, false);
                break;
            case 6:
                ixaVar.k(aVar6).b(ixaVarA.k(aVar5), this.m, this.s, false);
                break;
            case 7:
                ixaVar.k(aVar6).b(ixaVarA.k(aVar6), this.m, this.s, false);
                break;
            case 8:
                ixaVar.k(aVar3).b(ixaVarA.k(aVar3), this.n, this.t, false);
                break;
            case 9:
                ixaVar.k(aVar3).b(ixaVarA.k(aVar2), this.n, this.t, false);
                break;
            case 10:
                ixaVar.x(aVar3, ixaVarA, aVar4, this.n, this.t);
                break;
            case 11:
                ixaVar.k(aVar2).b(ixaVarA.k(aVar3), this.o, this.u, false);
                break;
            case 12:
                ixaVar.k(aVar2).b(ixaVarA.k(aVar2), this.o, this.u, false);
                break;
            case 13:
                ixaVar.x(aVar2, ixaVarA, aVar4, this.o, this.u);
                break;
            case 14:
                ixaVar.x(aVar4, ixaVarA, aVar4, this.v, this.w);
                break;
            case 15:
                ixaVar.x(aVar4, ixaVarA, aVar3, this.v, this.w);
                break;
            case 16:
                ixaVar.x(aVar4, ixaVarA, aVar2, this.v, this.w);
                break;
        }
    }

    public final void e(Object obj) {
        this.d0 = rwd0.b.B;
        this.V = obj;
    }

    public final void f() {
        rwd0.b bVar = this.d0;
        if (bVar == null) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 19) {
            this.a0 = null;
            return;
        }
        switch (iOrdinal) {
            case 0:
            case 1:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 2:
            case 3:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 4:
            case 5:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 6:
            case 7:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 8:
            case 9:
            case 10:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 11:
            case 12:
            case 13:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 14:
                this.X = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.d0 = rwd0.b.e;
        } else {
            this.d0 = rwd0.b.f;
        }
        f();
        if (this.P != null) {
            this.d0 = rwd0.b.i;
        } else {
            this.d0 = rwd0.b.v;
        }
        f();
        if (this.J != null) {
            this.d0 = rwd0.b.a;
        } else {
            this.d0 = rwd0.b.b;
        }
        f();
        if (this.L != null) {
            this.d0 = rwd0.b.c;
        } else {
            this.d0 = rwd0.b.d;
        }
        f();
    }

    @Override // defpackage.eq40
    public final Object getKey() {
        return this.a;
    }

    public final void h() {
        if (this.R != null) {
            this.d0 = rwd0.b.w;
        } else {
            this.d0 = rwd0.b.y;
        }
        f();
        this.d0 = rwd0.b.D;
        f();
        if (this.U != null) {
            this.d0 = rwd0.b.A;
        } else {
            this.d0 = rwd0.b.B;
        }
        f();
    }

    public final void i(Object obj) {
        this.d0 = rwd0.b.v;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof rwa) ? this.b.c.get(obj) : obj;
    }

    public rwa k(int i) {
        rwd0.b bVar = this.d0;
        if (bVar == null) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return this;
        }
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 19) {
            this.c0 = i;
            return this;
        }
        switch (iOrdinal) {
            case 0:
            case 1:
                this.j = i;
                break;
            case 2:
            case 3:
                this.k = i;
                break;
            case 4:
            case 5:
                this.l = i;
                break;
            case 6:
            case 7:
                this.m = i;
                break;
            case 8:
            case 9:
            case 10:
                this.n = i;
                break;
            case 11:
            case 12:
            case 13:
                this.o = i;
                break;
            case 14:
            case 15:
            case 16:
                this.v = i;
                break;
        }
        return this;
    }

    public rwa l(Float f) {
        return k(this.b.c(f));
    }

    public final void m(int i) {
        rwd0.b bVar = this.d0;
        if (bVar == null) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (bVar.ordinal()) {
            case 0:
            case 1:
                this.p = i;
                break;
            case 2:
            case 3:
                this.q = i;
                break;
            case 4:
            case 5:
                this.r = i;
                break;
            case 6:
            case 7:
                this.s = i;
                break;
            case 8:
            case 9:
            case 10:
                this.t = i;
                break;
            case 11:
            case 12:
            case 13:
                this.u = i;
                break;
            case 14:
            case 15:
            case 16:
                this.w = i;
                break;
        }
    }

    public final void n(Float f) {
        m(this.b.c(f));
    }

    public final void o(Object obj) {
        this.d0 = rwd0.b.e;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.d0 = rwd0.b.w;
        this.R = obj;
    }
}
