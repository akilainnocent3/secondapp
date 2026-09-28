package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mx90 {
    public final tx90 a;
    public final mw0<lh4> b;
    public final mw0<g1a0> c;
    public final mw0<g1a0> d;
    public final mw0<p7n> e;
    public final mw0<dsg0> f;
    public final mw0<hxz> g;
    public final mw0<et00> h;
    public ly90 j;
    public final i58 k;
    public float l;
    public float m;
    public float p;
    public final mw0<gjh0> i = new mw0<>();
    public float n = 1.0f;
    public float o = 1.0f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("none", 0);
            a = aVar;
            a aVar2 = new a("reset", 1);
            a aVar3 = new a("update", 2);
            b = aVar3;
            a aVar4 = new a("pose", 3);
            c = aVar4;
            d = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public mx90(tx90 tx90Var) {
        lh4 lh4Var;
        if (tx90Var == null) {
            hb5.a("data cannot be null.");
            throw null;
        }
        mw0<ft00> mw0Var = tx90Var.k;
        mw0<ixz> mw0Var2 = tx90Var.j;
        mw0<esg0> mw0Var3 = tx90Var.i;
        mw0<q7n> mw0Var4 = tx90Var.h;
        mw0<mh4> mw0Var5 = tx90Var.b;
        mw0<h1a0> mw0Var6 = tx90Var.c;
        this.a = tx90Var;
        mw0<lh4> mw0Var7 = new mw0<>(mw0Var5.b, true);
        this.b = mw0Var7;
        lh4[] lh4VarArr = mw0Var7.a;
        mw0.b<mh4> it = mw0Var5.iterator();
        while (it.hasNext()) {
            mh4 next = it.next();
            mh4 mh4Var = next.c;
            if (mh4Var == null) {
                lh4Var = new lh4(next, this, null);
            } else {
                lh4 lh4Var2 = lh4VarArr[mh4Var.a];
                lh4 lh4Var3 = new lh4(next, this, lh4Var2);
                lh4Var2.d.a(lh4Var3);
                lh4Var = lh4Var3;
            }
            this.b.a(lh4Var);
        }
        this.c = new mw0<>(mw0Var6.b, true);
        this.d = new mw0<>(mw0Var6.b, true);
        mw0.b<h1a0> it2 = mw0Var6.iterator();
        while (it2.hasNext()) {
            h1a0 next2 = it2.next();
            g1a0 g1a0Var = new g1a0(next2, lh4VarArr[next2.c.a]);
            this.c.a(g1a0Var);
            this.d.a(g1a0Var);
        }
        this.e = new mw0<>(mw0Var4.b, true);
        mw0.b<q7n> it3 = mw0Var4.iterator();
        while (it3.hasNext()) {
            this.e.a(new p7n(it3.next(), this));
        }
        this.f = new mw0<>(mw0Var3.b, true);
        mw0.b<esg0> it4 = mw0Var3.iterator();
        while (it4.hasNext()) {
            this.f.a(new dsg0(it4.next(), this));
        }
        this.g = new mw0<>(mw0Var2.b, true);
        mw0.b<ixz> it5 = mw0Var2.iterator();
        while (it5.hasNext()) {
            this.g.a(new hxz(it5.next(), this));
        }
        this.h = new mw0<>(mw0Var.b, true);
        mw0.b<ft00> it6 = mw0Var.iterator();
        while (it6.hasNext()) {
            this.h.a(new et00(it6.next(), this));
        }
        this.k = new i58(1.0f, 1.0f, 1.0f, 1.0f);
        j();
    }

    public static void i(mw0 mw0Var) {
        Object[] objArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            lh4 lh4Var = (lh4) objArr[i2];
            if (lh4Var.A) {
                if (lh4Var.z) {
                    i(lh4Var.d);
                }
                lh4Var.z = false;
            }
        }
    }

    public final b21 a(int i, String str) {
        b21 b21VarA;
        if (str == null) {
            hb5.a("attachmentName cannot be null.");
            return null;
        }
        ly90 ly90Var = this.j;
        if (ly90Var != null && (b21VarA = ly90Var.a(i, str)) != null) {
            return b21VarA;
        }
        ly90 ly90Var2 = this.a.e;
        if (ly90Var2 != null) {
            return ly90Var2.a(i, str);
        }
        return null;
    }

    public final void b(ly90 ly90Var) {
        b21 b21VarA;
        b21 b21VarA2;
        ly90 ly90Var2 = this.j;
        if (ly90Var == ly90Var2) {
            return;
        }
        if (ly90Var != null) {
            mw0<g1a0> mw0Var = this.c;
            if (ly90Var2 != null) {
                g1a0[] g1a0VarArr = mw0Var.a;
                mw0.b<ly90.a> it = ly90Var2.b.w.iterator();
                while (it.hasNext()) {
                    ly90.a next = it.next();
                    int i = next.a;
                    g1a0 g1a0Var = g1a0VarArr[i];
                    if (g1a0Var.e == next.c && (b21VarA2 = ly90Var.a(i, next.b)) != null) {
                        g1a0Var.a(b21VarA2);
                    }
                }
            } else {
                g1a0[] g1a0VarArr2 = mw0Var.a;
                int i2 = mw0Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    g1a0 g1a0Var2 = g1a0VarArr2[i3];
                    String str = g1a0Var2.a.f;
                    if (str != null && (b21VarA = ly90Var.a(i3, str)) != null) {
                        g1a0Var2.a(b21VarA);
                    }
                }
            }
        }
        this.j = ly90Var;
        j();
    }

    public final void c(String str) {
        ly90 ly90VarF = this.a.f(str);
        if (ly90VarF != null) {
            b(ly90VarF);
        } else {
            hb5.a("Skin not found: ".concat(str));
        }
    }

    public final void d() {
        mw0<g1a0> mw0Var = this.c;
        g1a0[] g1a0VarArr = mw0Var.a;
        int i = mw0Var.b;
        tpf.a(g1a0VarArr, 0, i, this.d.a);
        for (int i2 = 0; i2 < i; i2++) {
            g1a0VarArr[i2].b();
        }
    }

    public final void e() {
        mw0<lh4> mw0Var = this.b;
        lh4[] lh4VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            lh4VarArr[i2].c();
        }
        mw0<p7n> mw0Var2 = this.e;
        p7n[] p7nVarArr = mw0Var2.a;
        int i3 = mw0Var2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            p7n p7nVar = p7nVarArr[i4];
            q7n q7nVar = p7nVar.a;
            p7nVar.g = q7nVar.j;
            p7nVar.h = q7nVar.k;
            p7nVar.d = q7nVar.f;
            p7nVar.e = q7nVar.g;
            p7nVar.f = q7nVar.h;
        }
        mw0<dsg0> mw0Var3 = this.f;
        dsg0[] dsg0VarArr = mw0Var3.a;
        int i5 = mw0Var3.b;
        for (int i6 = 0; i6 < i5; i6++) {
            dsg0 dsg0Var = dsg0VarArr[i6];
            esg0 esg0Var = dsg0Var.a;
            dsg0Var.d = esg0Var.f;
            dsg0Var.e = esg0Var.g;
            dsg0Var.f = esg0Var.h;
            dsg0Var.g = esg0Var.i;
            dsg0Var.h = esg0Var.j;
            dsg0Var.i = esg0Var.k;
        }
        mw0<hxz> mw0Var4 = this.g;
        hxz[] hxzVarArr = mw0Var4.a;
        int i7 = mw0Var4.b;
        for (int i8 = 0; i8 < i7; i8++) {
            hxz hxzVar = hxzVarArr[i8];
            ixz ixzVar = hxzVar.a;
            hxzVar.d = ixzVar.j;
            hxzVar.e = ixzVar.k;
            hxzVar.f = ixzVar.l;
            hxzVar.g = ixzVar.m;
            hxzVar.h = ixzVar.n;
        }
        mw0<et00> mw0Var5 = this.h;
        et00[] et00VarArr = mw0Var5.a;
        int i9 = mw0Var5.b;
        for (int i10 = 0; i10 < i9; i10++) {
            et00 et00Var = et00VarArr[i10];
            ft00 ft00Var = et00Var.a;
            et00Var.c = ft00Var.l;
            et00Var.d = ft00Var.m;
            et00Var.e = ft00Var.n;
            et00Var.f = ft00Var.o;
            et00Var.g = ft00Var.p;
            et00Var.h = ft00Var.q;
            et00Var.i = ft00Var.r;
        }
        d();
    }

    public final void f(lh4 lh4Var) {
        if (lh4Var.z) {
            return;
        }
        lh4 lh4Var2 = lh4Var.c;
        if (lh4Var2 != null) {
            f(lh4Var2);
        }
        lh4Var.z = true;
        this.i.a(lh4Var);
    }

    public final void g(b21 b21Var, lh4 lh4Var) {
        if (b21Var instanceof exz) {
            int[] iArr = ((exz) b21Var).e;
            if (iArr == null) {
                f(lh4Var);
                return;
            }
            lh4[] lh4VarArr = this.b.a;
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                int i3 = iArr[i] + i2;
                while (i2 < i3) {
                    f(lh4VarArr[iArr[i2]]);
                    i2++;
                }
                i = i2;
            }
        }
    }

    public final void h(ly90 ly90Var, int i, lh4 lh4Var) {
        c3z<ly90.a> c3zVar = ly90Var.b;
        ly90.a[] aVarArr = c3zVar.w.a;
        int i2 = c3zVar.a;
        for (int i3 = 0; i3 < i2; i3++) {
            ly90.a aVar = aVarArr[i3];
            if (aVar.a == i) {
                g(aVar.c, lh4Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        lh4[] lh4VarArr;
        p7n[] p7nVarArr;
        int i;
        dsg0[] dsg0VarArr;
        ly90 ly90Var;
        ly90 ly90Var2;
        lh4[] lh4VarArr2;
        ly90 ly90Var3;
        ly90 ly90Var4;
        mw0<gjh0> mw0Var = this.i;
        mw0Var.clear();
        mw0<lh4> mw0Var2 = this.b;
        int i2 = mw0Var2.b;
        lh4[] lh4VarArr3 = mw0Var2.a;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            lh4 lh4Var = lh4VarArr3[i4];
            boolean z = lh4Var.a.m;
            lh4Var.z = z;
            lh4Var.A = true ^ z;
        }
        ly90 ly90Var5 = this.j;
        if (ly90Var5 != null) {
            mw0<mh4> mw0Var3 = ly90Var5.c;
            mh4[] mh4VarArr = mw0Var3.a;
            int i5 = mw0Var3.b;
            for (int i6 = 0; i6 < i5; i6++) {
                lh4 lh4Var2 = lh4VarArr3[mh4VarArr[i6].a];
                do {
                    lh4Var2.z = false;
                    lh4Var2.A = true;
                    lh4Var2 = lh4Var2.c;
                } while (lh4Var2 != null);
            }
        }
        mw0<p7n> mw0Var4 = this.e;
        int i7 = mw0Var4.b;
        mw0<dsg0> mw0Var5 = this.f;
        int i8 = mw0Var5.b;
        mw0<hxz> mw0Var6 = this.g;
        int i9 = mw0Var6.b;
        mw0<et00> mw0Var7 = this.h;
        int i10 = mw0Var7.b;
        p7n[] p7nVarArr2 = mw0Var4.a;
        dsg0[] dsg0VarArr2 = mw0Var5.a;
        hxz[] hxzVarArr = mw0Var6.a;
        et00[] et00VarArr = mw0Var7.a;
        int i11 = i7 + i8 + i9 + i10;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i3;
            while (true) {
                if (i3 < i7) {
                    p7n p7nVar = p7nVarArr2[i3];
                    lh4VarArr = lh4VarArr3;
                    q7n q7nVar = p7nVar.a;
                    int i14 = i3;
                    lh4 lh4Var3 = p7nVar.c;
                    p7nVarArr = p7nVarArr2;
                    if (q7nVar.b == i12) {
                        boolean z2 = (!lh4Var3.A || (q7nVar.c && ((ly90Var4 = this.j) == null || !ly90Var4.d.contains(q7nVar)))) ? i13 : 1;
                        p7nVar.i = z2;
                        if (z2 != 0) {
                            f(lh4Var3);
                            mw0<lh4> mw0Var8 = p7nVar.b;
                            if (mw0Var8.b == 0) {
                                ib5.a("Array is empty.");
                                return;
                            }
                            lh4 lh4Var4 = mw0Var8.a[i13];
                            f(lh4Var4);
                            mw0<lh4> mw0Var9 = lh4Var4.d;
                            if (mw0Var8.b == 1) {
                                mw0Var.a(p7nVar);
                                i(mw0Var9);
                            } else {
                                lh4 lh4VarPeek = mw0Var8.peek();
                                f(lh4VarPeek);
                                mw0Var.a(p7nVar);
                                i(mw0Var9);
                                lh4VarPeek.z = true;
                            }
                        }
                    } else {
                        i3 = i14 + 1;
                        lh4VarArr3 = lh4VarArr;
                        p7nVarArr2 = p7nVarArr;
                    }
                } else {
                    lh4VarArr = lh4VarArr3;
                    p7nVarArr = p7nVarArr2;
                    int i15 = i13;
                    while (true) {
                        if (i15 < i8) {
                            dsg0 dsg0Var = dsg0VarArr2[i15];
                            esg0 esg0Var = dsg0Var.a;
                            lh4 lh4Var5 = dsg0Var.c;
                            int i16 = i15;
                            if (esg0Var.b == i12) {
                                boolean z3 = (!lh4Var5.A || (esg0Var.c && ((ly90Var3 = this.j) == null || !ly90Var3.d.contains(esg0Var)))) ? i13 : 1;
                                dsg0Var.j = z3;
                                if (z3 != 0) {
                                    f(lh4Var5);
                                    mw0<lh4> mw0Var10 = dsg0Var.b;
                                    lh4[] lh4VarArr4 = mw0Var10.a;
                                    int i17 = mw0Var10.b;
                                    if (esg0Var.s) {
                                        int i18 = i13;
                                        while (i18 < i17) {
                                            int i19 = i18;
                                            lh4 lh4Var6 = lh4VarArr4[i18];
                                            f(lh4Var6.c);
                                            f(lh4Var6);
                                            i18 = i19 + 1;
                                            lh4VarArr4 = lh4VarArr4;
                                        }
                                        lh4VarArr2 = lh4VarArr4;
                                    } else {
                                        lh4VarArr2 = lh4VarArr4;
                                        for (int i20 = i13; i20 < i17; i20++) {
                                            f(lh4VarArr2[i20]);
                                        }
                                    }
                                    mw0Var.a(dsg0Var);
                                    for (int i21 = i13; i21 < i17; i21++) {
                                        i(lh4VarArr2[i21].d);
                                    }
                                    for (int i22 = i13; i22 < i17; i22++) {
                                        lh4VarArr2[i22].z = true;
                                    }
                                }
                            } else {
                                i15 = i16 + 1;
                            }
                        } else {
                            int i23 = i13;
                            while (true) {
                                if (i23 < i9) {
                                    hxz hxzVar = hxzVarArr[i23];
                                    ixz ixzVar = hxzVar.a;
                                    g1a0 g1a0Var = hxzVar.c;
                                    int i24 = i23;
                                    if (ixzVar.b == i12) {
                                        boolean z4 = (!g1a0Var.b.A || (ixzVar.c && ((ly90Var2 = this.j) == null || !ly90Var2.d.contains(ixzVar)))) ? i13 : 1;
                                        hxzVar.i = z4;
                                        if (z4 != 0) {
                                            int i25 = g1a0Var.a.a;
                                            lh4 lh4Var7 = g1a0Var.b;
                                            i = i7;
                                            ly90 ly90Var6 = this.j;
                                            if (ly90Var6 != null) {
                                                h(ly90Var6, i25, lh4Var7);
                                            }
                                            ly90 ly90Var7 = this.a.e;
                                            dsg0VarArr = dsg0VarArr2;
                                            if (ly90Var7 != null && ly90Var7 != this.j) {
                                                h(ly90Var7, i25, lh4Var7);
                                            }
                                            b21 b21Var = g1a0Var.e;
                                            if (b21Var instanceof exz) {
                                                g(b21Var, lh4Var7);
                                            }
                                            mw0<lh4> mw0Var11 = hxzVar.b;
                                            lh4[] lh4VarArr5 = mw0Var11.a;
                                            int i26 = mw0Var11.b;
                                            for (int i27 = i13; i27 < i26; i27++) {
                                                f(lh4VarArr5[i27]);
                                            }
                                            mw0Var.a(hxzVar);
                                            for (int i28 = i13; i28 < i26; i28++) {
                                                i(lh4VarArr5[i28].d);
                                            }
                                            for (int i29 = i13; i29 < i26; i29++) {
                                                lh4VarArr5[i29].z = true;
                                            }
                                        }
                                    } else {
                                        i23 = i24 + 1;
                                    }
                                } else {
                                    i = i7;
                                    dsg0VarArr = dsg0VarArr2;
                                    int i30 = i13;
                                    while (true) {
                                        if (i30 < i10) {
                                            et00 et00Var = et00VarArr[i30];
                                            ft00 ft00Var = et00Var.a;
                                            if (ft00Var.b == i12) {
                                                lh4 lh4Var8 = et00Var.b;
                                                boolean z5 = (!lh4Var8.A || (ft00Var.c && ((ly90Var = this.j) == null || !ly90Var.d.contains(ft00Var)))) ? i13 : 1;
                                                et00Var.y = z5;
                                                if (z5 != 0) {
                                                    f(lh4Var8);
                                                    mw0Var.a(et00Var);
                                                    i(lh4Var8.d);
                                                    lh4Var8.z = true;
                                                    break;
                                                }
                                            } else {
                                                i30++;
                                            }
                                        }
                                    }
                                    i12++;
                                    i3 = i13;
                                    lh4VarArr3 = lh4VarArr;
                                    p7nVarArr2 = p7nVarArr;
                                    i7 = i;
                                    dsg0VarArr2 = dsg0VarArr;
                                }
                                i12++;
                                i3 = i13;
                                lh4VarArr3 = lh4VarArr;
                                p7nVarArr2 = p7nVarArr;
                                i7 = i;
                                dsg0VarArr2 = dsg0VarArr;
                            }
                        }
                    }
                }
                i = i7;
                dsg0VarArr = dsg0VarArr2;
                i12++;
                i3 = i13;
                lh4VarArr3 = lh4VarArr;
                p7nVarArr2 = p7nVarArr;
                i7 = i;
                dsg0VarArr2 = dsg0VarArr;
            }
        }
        lh4[] lh4VarArr6 = lh4VarArr3;
        while (i3 < i2) {
            f(lh4VarArr6[i3]);
            i3++;
        }
    }

    public final void k(a aVar) {
        mw0<lh4> mw0Var = this.b;
        lh4[] lh4VarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            lh4 lh4Var = lh4VarArr[i2];
            lh4Var.l = lh4Var.e;
            lh4Var.m = lh4Var.f;
            lh4Var.n = lh4Var.g;
            lh4Var.o = lh4Var.h;
            lh4Var.p = lh4Var.i;
            lh4Var.q = lh4Var.j;
            lh4Var.r = lh4Var.k;
        }
        mw0<gjh0> mw0Var2 = this.i;
        gjh0[] gjh0VarArr = mw0Var2.a;
        int i3 = mw0Var2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            gjh0VarArr[i4].a(aVar);
        }
    }

    public final String toString() {
        String str = this.a.a;
        return str != null ? str : super.toString();
    }
}
