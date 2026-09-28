package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;

/* JADX INFO: loaded from: classes.dex */
public final class zi0 {
    public final bj0 a;
    public boolean g;
    public int i;
    public final mw0<e> b = new mw0<>();
    public final mw0<whg> c = new mw0<>();
    public final f5a0<b> d = new f5a0<>();
    public final c e = new c();
    public final ncy<String> f = new ncy<>();
    public float h = 1.0f;
    public final a j = new a();

    public class a extends q120 {
        @Override // defpackage.q120
        public final Object c() {
            return new e();
        }
    }

    public interface b {
        void a(e eVar, whg whgVar);

        void b(e eVar);

        void c(e eVar);
    }

    public class c {
        public final mw0 a = new mw0();
        public boolean b;

        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [T[]] */
        /* JADX WARN: Type inference failed for: r6v6, types: [T[]] */
        public final void a() {
            if (this.b) {
                return;
            }
            this.b = true;
            zi0 zi0Var = zi0.this;
            f5a0<b> f5a0Var = zi0Var.d;
            int i = 0;
            while (true) {
                mw0 mw0Var = this.a;
                if (i >= mw0Var.b) {
                    mw0Var.clear();
                    this.b = false;
                    return;
                }
                d dVar = (d) mw0Var.get(i);
                int i2 = i + 1;
                e eVar = (e) mw0Var.get(i2);
                int i3 = f5a0Var.b;
                f5a0Var.k();
                ?? r10 = f5a0Var.a;
                f5a0Var.e = r10;
                f5a0Var.i++;
                int iOrdinal = dVar.ordinal();
                if (iOrdinal == 0) {
                    eVar.getClass();
                    for (int i4 = 0; i4 < i3; i4++) {
                        ((b) r10[i4]).getClass();
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        eVar.getClass();
                        for (int i5 = 0; i5 < i3; i5++) {
                            ((b) r10[i5]).c(eVar);
                        }
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            eVar.getClass();
                            for (int i6 = 0; i6 < i3; i6++) {
                                ((b) r10[i6]).b(eVar);
                            }
                        } else if (iOrdinal == 5) {
                            whg whgVar = (whg) mw0Var.get(i + 2);
                            eVar.getClass();
                            for (int i7 = 0; i7 < i3; i7++) {
                                ((b) r10[i7]).a(eVar, whgVar);
                            }
                            i = i2;
                        }
                    }
                    eVar.getClass();
                    for (int i8 = 0; i8 < i3; i8++) {
                        ((b) r10[i8]).getClass();
                    }
                    zi0Var.j.a(eVar);
                } else {
                    eVar.getClass();
                    for (int i9 = 0; i9 < i3; i9++) {
                        ((b) r10[i9]).getClass();
                    }
                }
                int iMax = Math.max(0, f5a0Var.i - 1);
                f5a0Var.i = iMax;
                ?? r6 = f5a0Var.e;
                if (r6 != 0) {
                    if (r6 != f5a0Var.a && iMax == 0) {
                        f5a0Var.f = r6;
                        int length = r6.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            f5a0Var.f[i10] = null;
                        }
                    }
                    f5a0Var.e = null;
                }
                i += 2;
            }
        }

        public final void b(e eVar) {
            d dVar = d.c;
            mw0 mw0Var = this.a;
            mw0Var.a(dVar);
            mw0Var.a(eVar);
            zi0.this.g = true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final /* synthetic */ d[] i;

        static {
            d dVar = new d("start", 0);
            a = dVar;
            d dVar2 = new d("interrupt", 1);
            b = dVar2;
            d dVar3 = new d("end", 2);
            c = dVar3;
            d dVar4 = new d("dispose", 3);
            d = dVar4;
            d dVar5 = new d("complete", 4);
            e = dVar5;
            d dVar6 = new d(AnalyticsEvent.BI_TRACKING_KIND_EVENT, 5);
            f = dVar6;
            i = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) i.clone();
        }
    }

    public static class e implements q120.a {
        public lh0 a;
        public e b;
        public e c;
        public e d;
        public int e;
        public boolean f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
        public float m;
        public float n;
        public float o;
        public float p;
        public float q;
        public float r;
        public float s;
        public float t;
        public final pvo u = new pvo(16, 0);
        public final mw0<e> v = new mw0<>();
        public final owh w = new owh();

        public final float a() {
            if (!this.f) {
                float f = this.k + 0.0f;
                float f2 = this.g;
                return f2 >= this.a.d ? f : Math.min(f, f2);
            }
            float f3 = this.g - 0.0f;
            if (f3 == 0.0f) {
                return 0.0f;
            }
            return (this.k % f3) + 0.0f;
        }

        @Override // q120.a
        public final void reset() {
            this.b = null;
            this.c = null;
            this.d = null;
            this.a = null;
            this.u.b = 0;
            this.v.clear();
            this.w.b = 0;
        }

        public final String toString() {
            lh0 lh0Var = this.a;
            return lh0Var == null ? "<none>" : lh0Var.a;
        }
    }

    static {
        new ncy(0).b(0);
    }

    public zi0(bj0 bj0Var) {
        this.a = bj0Var;
    }

    public static void e(lh0.d0 d0Var, mx90 mx90Var, float f, float f2, lh0.k kVar, float[] fArr, int i, boolean z) {
        float fL;
        float f3;
        float f4;
        float f5;
        float fSignum;
        if (z) {
            fArr[i] = 0.0f;
        }
        if (f2 == 1.0f) {
            d0Var.b(mx90Var, 0.0f, f, null, 1.0f, kVar, lh0.l.a);
            return;
        }
        lh4 lh4Var = mx90Var.b.get(d0Var.d);
        boolean z2 = lh4Var.A;
        mh4 mh4Var = lh4Var.a;
        if (z2) {
            if (f < d0Var.b[0]) {
                int iOrdinal = kVar.ordinal();
                if (iOrdinal == 0) {
                    lh4Var.g = mh4Var.g;
                    return;
                } else {
                    if (iOrdinal != 1) {
                        return;
                    }
                    f3 = lh4Var.g;
                    fL = mh4Var.g;
                }
            } else {
                float f6 = kVar == lh0.k.a ? mh4Var.g : lh4Var.g;
                fL = d0Var.l(f) + mh4Var.g;
                f3 = f6;
            }
            float f7 = fL - f3;
            float fCeil = f7 - (((float) Math.ceil((f7 / 360.0f) - 0.5f)) * 360.0f);
            if (fCeil == 0.0f) {
                fSignum = fArr[i];
            } else {
                if (z) {
                    f4 = 0.0f;
                    f5 = fCeil;
                } else {
                    f4 = fArr[i];
                    f5 = fArr[i + 1];
                }
                float f8 = f4 - (f4 % 360.0f);
                float fSignum2 = fCeil + f8;
                boolean z3 = fCeil >= 0.0f;
                boolean z4 = f4 >= 0.0f;
                if (Math.abs(f5) <= 90.0f && Math.signum(f5) != Math.signum(fCeil)) {
                    if (Math.abs(f4 - f8) > 180.0f) {
                        fSignum2 += Math.signum(f4) * 360.0f;
                    } else if (f8 != 0.0f) {
                        fSignum2 -= Math.signum(f4) * 360.0f;
                    }
                    z4 = z3;
                }
                fSignum = z4 != z3 ? (Math.signum(f4) * 360.0f) + fSignum2 : fSignum2;
                fArr[i] = fSignum;
            }
            fArr[i + 1] = fCeil;
            lh4Var.g = (fSignum * f2) + f3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final e a(int i, String str, boolean z) {
        lh0 lh0VarA = this.a.a.a(str);
        if (lh0VarA == null) {
            hb5.a("Animation not found: ".concat(str));
            return null;
        }
        if (i < 0) {
            hb5.a("trackIndex must be >= 0.");
            return null;
        }
        e eVarI = i(i);
        if (eVarI != null) {
            while (true) {
                e eVar = eVarI.b;
                if (eVar == null) {
                    break;
                }
                eVarI = eVar;
            }
        }
        e eVarO = o(i, lh0VarA, z, eVarI);
        float fMax = 0.0f;
        if (eVarI == null) {
            n(i, eVarO, true);
            this.e.a();
        } else {
            eVarI.b = eVarO;
            float f = eVarI.g - 0.0f;
            if (f != 0.0f) {
                boolean z2 = eVarI.f;
                float f2 = eVarI.k;
                if (z2) {
                    f *= ((int) (f2 / f)) + 1;
                } else if (f2 >= f) {
                    f = eVarI.k;
                }
            } else {
                f = eVarI.k;
            }
            fMax = Math.max((f + 0.0f) - eVarO.r, 0.0f);
        }
        eVarO.j = fMax;
        return eVarO;
    }

    public final void b(b bVar) {
        this.d.a(bVar);
    }

    public final void c(lh0.b bVar, mx90 mx90Var, float f, lh0.k kVar, boolean z) {
        g1a0 g1a0Var = mx90Var.c.get(bVar.c);
        lh4 lh4Var = g1a0Var.b;
        h1a0 h1a0Var = g1a0Var.a;
        if (lh4Var.A) {
            float[] fArr = bVar.b;
            if (f >= fArr[0]) {
                String str = bVar.d[lh0.m0.f(f, fArr)];
                g1a0Var.a(str != null ? mx90Var.a(h1a0Var.a, str) : null);
                if (z) {
                    g1a0Var.h = this.i + 2;
                }
            } else if (kVar == lh0.k.a || kVar == lh0.k.b) {
                String str2 = h1a0Var.f;
                g1a0Var.a(str2 != null ? mx90Var.a(h1a0Var.a, str2) : null);
                if (z) {
                    g1a0Var.h = this.i + 2;
                }
            }
            int i = g1a0Var.h;
            int i2 = this.i;
            if (i <= i2) {
                g1a0Var.h = i2 + 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:71:0x0186  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b8  */
    public final float d(e eVar, mx90 mx90Var, lh0.k kVar) {
        lh0.k kVar2;
        float f;
        float fMax;
        float f2;
        e[] eVarArr;
        lh0.k kVar3;
        float[] fArr;
        boolean z;
        float f3;
        mw0<whg> mw0Var;
        lh0.k kVar4;
        lh0.k kVar5;
        lh0.k kVar6;
        float f4;
        lh0.l lVar;
        boolean z2;
        lh0.k kVar7 = kVar;
        e eVar2 = eVar.c;
        e eVar3 = eVar2.c;
        owh owhVar = eVar2.w;
        mx90 mx90Var2 = mx90Var;
        if (eVar3 != null) {
            d(eVar2, mx90Var2, kVar7);
        }
        float f5 = eVar.r;
        float f6 = 0.0f;
        lh0.k kVar8 = lh0.k.b;
        lh0.k kVar9 = lh0.k.a;
        if (f5 == 0.0f) {
            kVar2 = kVar7 == kVar8 ? kVar9 : kVar7;
            f = 1.0f;
        } else {
            float f7 = eVar.q / f5;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (kVar7 != kVar8) {
                kVar7 = lh0.k.c;
            }
            kVar2 = kVar7;
            f = f7;
        }
        boolean z3 = f < 0.0f;
        boolean z4 = f < 0.0f;
        mw0<lh0.m0> mw0Var2 = eVar2.a.b;
        int i = mw0Var2.b;
        lh0.m0[] m0VarArr = mw0Var2.a;
        float f8 = eVar2.p * eVar.s;
        float f9 = (1.0f - f) * f8;
        float f10 = eVar2.h;
        lh0.k kVar10 = kVar9;
        float fA = eVar2.a();
        mw0<whg> mw0Var3 = this.c;
        mw0<whg> mw0Var4 = f < 0.0f ? mw0Var3 : null;
        lh0.k kVar11 = lh0.k.d;
        lh0.l lVar2 = lh0.l.b;
        if (kVar2 == kVar11) {
            int i2 = 0;
            while (i2 < i) {
                mw0<whg> mw0Var5 = mw0Var4;
                m0VarArr[i2].b(mx90Var2, f10, fA, mw0Var5, f9, kVar2, lVar2);
                i2++;
                mx90Var2 = mx90Var;
                i = i;
                mw0Var4 = mw0Var5;
            }
        } else {
            mw0<whg> mw0Var6 = mw0Var4;
            int i3 = i;
            float f11 = f10;
            lh0.k kVar12 = kVar2;
            int[] iArr = eVar2.u.a;
            e[] eVarArr2 = eVar2.v.a;
            int i4 = i3 << 1;
            boolean z5 = owhVar.b != i4;
            if (z5) {
                owhVar.d(i4);
            }
            float[] fArr2 = owhVar.a;
            eVar2.t = 0.0f;
            int i5 = 0;
            while (i5 < i3) {
                lh0.m0 m0Var = m0VarArr[i5];
                int i6 = iArr[i5];
                if (i6 != 0) {
                    if (i6 == 1) {
                        f6 = f6;
                        fA = fA;
                        kVar4 = kVar10;
                        fMax = f9;
                    } else if (i6 == 2) {
                        fMax = f8;
                    } else if (i6 != 3) {
                        e eVar4 = eVarArr2[i5];
                        float f12 = fA;
                        fMax = Math.max(f6, 1.0f - (eVar4.q / eVar4.r)) * f8;
                        fA = f12;
                        f6 = f6;
                        kVar4 = kVar10;
                    } else {
                        f6 = f6;
                        fA = fA;
                        kVar4 = kVar10;
                        fMax = f8;
                    }
                    eVar2.t += fMax;
                    if (m0Var instanceof lh0.d0) {
                        kVar3 = kVar10;
                        eVarArr = eVarArr2;
                        e((lh0.d0) m0Var, mx90Var, fA, fMax, kVar4, fArr2, i5 << 1, z5);
                        fArr = fArr2;
                        z = z5;
                        fA = fA;
                        f3 = f11;
                        mw0Var = mw0Var6;
                        f2 = f6;
                        m0VarArr = m0VarArr;
                    } else {
                        eVarArr = eVarArr2;
                        kVar5 = kVar10;
                        fArr = fArr2;
                        kVar6 = kVar4;
                        z = z5;
                        f4 = fMax;
                        fA = fA;
                        if (m0Var instanceof lh0.b) {
                            lh0.b bVar = (lh0.b) m0Var;
                            if (z3 || f4 < f6) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            f2 = f6;
                            c(bVar, mx90Var, fA, kVar6, z2);
                            fA = fA;
                            kVar3 = kVar5;
                            f3 = f11;
                            mw0Var = mw0Var6;
                        } else {
                            f2 = f6;
                            m0VarArr = m0VarArr;
                            if (!z4 && (m0Var instanceof lh0.g) && kVar6 == kVar5) {
                                lVar = lh0.l.a;
                            } else {
                                lVar = lVar2;
                            }
                            kVar3 = kVar5;
                            f3 = f11;
                            mw0Var = mw0Var6;
                            m0Var.b(mx90Var, f3, fA, mw0Var, f4, kVar6, lVar);
                        }
                    }
                    i5++;
                    f11 = f3;
                    mw0Var6 = mw0Var;
                    i3 = i3;
                    eVarArr2 = eVarArr;
                    m0VarArr = m0VarArr;
                    z5 = z;
                    fArr2 = fArr;
                    iArr = iArr;
                    kVar10 = kVar3;
                    f6 = f2;
                } else {
                    if (z4 || !(m0Var instanceof lh0.g)) {
                        fMax = f9;
                    } else {
                        f2 = f6;
                        m0VarArr = m0VarArr;
                        eVarArr = eVarArr2;
                        kVar3 = kVar10;
                        fArr = fArr2;
                        z = z5;
                        f3 = f11;
                        mw0Var = mw0Var6;
                    }
                    i5++;
                    f11 = f3;
                    mw0Var6 = mw0Var;
                    i3 = i3;
                    eVarArr2 = eVarArr;
                    m0VarArr = m0VarArr;
                    z5 = z;
                    fArr2 = fArr;
                    iArr = iArr;
                    kVar10 = kVar3;
                    f6 = f2;
                }
                kVar4 = kVar12;
                eVar2.t += fMax;
                if (m0Var instanceof lh0.d0) {
                    kVar3 = kVar10;
                    eVarArr = eVarArr2;
                    e((lh0.d0) m0Var, mx90Var, fA, fMax, kVar4, fArr2, i5 << 1, z5);
                    fArr = fArr2;
                    z = z5;
                    fA = fA;
                    f3 = f11;
                    mw0Var = mw0Var6;
                    f2 = f6;
                    m0VarArr = m0VarArr;
                } else {
                    eVarArr = eVarArr2;
                    kVar5 = kVar10;
                    fArr = fArr2;
                    kVar6 = kVar4;
                    z = z5;
                    f4 = fMax;
                    fA = fA;
                    if (m0Var instanceof lh0.b) {
                        lh0.b bVar2 = (lh0.b) m0Var;
                        if (z3) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        f2 = f6;
                        c(bVar2, mx90Var, fA, kVar6, z2);
                        fA = fA;
                        kVar3 = kVar5;
                        f3 = f11;
                        mw0Var = mw0Var6;
                    } else {
                        f2 = f6;
                        m0VarArr = m0VarArr;
                        if (!z4) {
                            lVar = lVar2;
                        } else {
                            lVar = lVar2;
                        }
                        kVar3 = kVar5;
                        f3 = f11;
                        mw0Var = mw0Var6;
                        m0Var.b(mx90Var, f3, fA, mw0Var, f4, kVar6, lVar);
                    }
                }
                i5++;
                f11 = f3;
                mw0Var6 = mw0Var;
                i3 = i3;
                eVarArr2 = eVarArr;
                m0VarArr = m0VarArr;
                z5 = z;
                fArr2 = fArr;
                iArr = iArr;
                kVar10 = kVar3;
                f6 = f2;
            }
        }
        if (eVar.r > f6) {
            k(eVar2, fA);
        }
        mw0Var3.clear();
        eVar2.i = fA;
        eVar2.m = eVar2.k;
        return f;
    }

    public final void f(e eVar) {
        for (e eVar2 = eVar.b; eVar2 != null; eVar2 = eVar2.b) {
            mw0 mw0Var = this.e.a;
            mw0Var.a(d.d);
            mw0Var.a(eVar2);
        }
        eVar.b = null;
    }

    public final void g(int i) {
        e eVar;
        if (i < 0) {
            hb5.a("trackIndex must be >= 0.");
            return;
        }
        mw0<e> mw0Var = this.b;
        if (i >= mw0Var.b || (eVar = mw0Var.get(i)) == null) {
            return;
        }
        c cVar = this.e;
        cVar.b(eVar);
        f(eVar);
        e eVar2 = eVar;
        while (true) {
            e eVar3 = eVar2.c;
            if (eVar3 == null) {
                mw0Var.f(eVar.e, null);
                cVar.a();
                return;
            } else {
                cVar.b(eVar3);
                eVar2.c = null;
                eVar2.d = null;
                eVar2 = eVar3;
            }
        }
    }

    public final void h() {
        c cVar = this.e;
        boolean z = cVar.b;
        cVar.b = true;
        mw0<e> mw0Var = this.b;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            g(i2);
        }
        mw0Var.clear();
        cVar.b = z;
        cVar.a();
    }

    public final e i(int i) {
        mw0<e> mw0Var = this.b;
        int i2 = mw0Var.b;
        if (i < i2) {
            return mw0Var.get(i);
        }
        mw0Var.b((i - i2) + 1);
        mw0Var.b = i + 1;
        return null;
    }

    public final e j() {
        mw0<e> mw0Var = this.b;
        if (mw0Var.b <= 0) {
            return null;
        }
        return mw0Var.get(0);
    }

    public final void k(e eVar, float f) {
        d dVar;
        c cVar;
        int i;
        eVar.getClass();
        float f2 = eVar.g;
        float f3 = f2 - 0.0f;
        float f4 = eVar.l % f3;
        mw0<whg> mw0Var = this.c;
        whg[] whgVarArr = mw0Var.a;
        int i2 = mw0Var.b;
        int i3 = 0;
        while (true) {
            dVar = d.f;
            cVar = this.e;
            if (i3 >= i2) {
                break;
            }
            whg whgVar = whgVarArr[i3];
            float f5 = whgVar.b;
            if (f5 < f4) {
                break;
            }
            if (f5 <= f2) {
                mw0 mw0Var2 = cVar.a;
                mw0Var2.a(dVar);
                mw0Var2.a(eVar);
                mw0Var2.a(whgVar);
            }
            i3++;
        }
        if (!eVar.f ? !(f < f2 || eVar.h >= f2) : !(f3 != 0.0f && ((i = (int) (eVar.k / f3)) <= 0 || i <= ((int) (eVar.l / f3))))) {
            mw0 mw0Var3 = cVar.a;
            mw0Var3.a(d.e);
            mw0Var3.a(eVar);
        }
        while (i3 < i2) {
            whg whgVar2 = whgVarArr[i3];
            if (whgVar2.b >= 0.0f) {
                mw0 mw0Var4 = cVar.a;
                mw0Var4.a(dVar);
                mw0Var4.a(eVar);
                mw0Var4.a(whgVar2);
            }
            i3++;
        }
    }

    public final e l(int i, lh0 lh0Var, boolean z) {
        boolean z2;
        if (i < 0) {
            hb5.a("trackIndex must be >= 0.");
            return null;
        }
        if (lh0Var == null) {
            hb5.a("animation cannot be null.");
            return null;
        }
        e eVarI = i(i);
        c cVar = this.e;
        if (eVarI == null) {
            z2 = true;
        } else if (eVarI.m == -1.0f) {
            this.b.f(i, eVarI.c);
            mw0 mw0Var = cVar.a;
            mw0Var.a(d.b);
            mw0Var.a(eVarI);
            cVar.b(eVarI);
            f(eVarI);
            eVarI = eVarI.c;
            z2 = false;
        } else {
            f(eVarI);
            z2 = true;
        }
        e eVarO = o(i, lh0Var, z, eVarI);
        n(i, eVarO, z2);
        cVar.a();
        return eVarO;
    }

    public final e m(int i, String str, boolean z) {
        lh0 lh0VarA = this.a.a.a(str);
        if (lh0VarA != null) {
            return l(i, lh0VarA, z);
        }
        hb5.a("Animation not found: ".concat(str));
        return null;
    }

    public final void n(int i, e eVar, boolean z) {
        e eVarI = i(i);
        this.b.f(i, eVar);
        eVar.getClass();
        c cVar = this.e;
        if (eVarI != null) {
            if (z) {
                mw0 mw0Var = cVar.a;
                mw0Var.a(d.b);
                mw0Var.a(eVarI);
            }
            eVar.c = eVarI;
            eVarI.d = eVar;
            eVar.q = 0.0f;
            if (eVarI.c != null) {
                float f = eVarI.r;
                if (f > 0.0f) {
                    eVar.s = Math.min(1.0f, eVarI.q / f) * eVar.s;
                }
            }
            eVarI.w.b = 0;
        }
        mw0 mw0Var2 = cVar.a;
        mw0Var2.a(d.a);
        mw0Var2.a(eVar);
        zi0.this.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0030  */
    public final e o(int i, lh0 lh0Var, boolean z, e eVar) {
        float f;
        e eVar2 = (e) this.j.d();
        eVar2.e = i;
        eVar2.a = lh0Var;
        eVar2.f = z;
        eVar2.g = lh0Var.d;
        eVar2.h = -1.0f;
        eVar2.i = -1.0f;
        eVar2.j = 0.0f;
        eVar2.k = 0.0f;
        eVar2.l = -1.0f;
        eVar2.m = -1.0f;
        eVar2.n = Float.MAX_VALUE;
        eVar2.o = 1.0f;
        eVar2.p = 1.0f;
        eVar2.q = 0.0f;
        if (eVar == null) {
            f = 0.0f;
        } else {
            lh0 lh0Var2 = eVar.a;
            bj0 bj0Var = this.a;
            bj0Var.getClass();
            if (lh0Var2 == null) {
                hb5.a("from cannot be null.");
                return null;
            }
            bj0.a aVar = bj0Var.c;
            aVar.a = lh0Var2;
            aVar.b = lh0Var;
            wby<bj0.a> wbyVar = bj0Var.b;
            int iA = wbyVar.a(aVar);
            if (iA < 0) {
                f = 0.0f;
            } else {
                f = wbyVar.c[iA];
            }
        }
        eVar2.r = f;
        eVar2.s = 1.0f;
        eVar2.t = 0.0f;
        return eVar2;
    }

    public final boolean p(e eVar, float f) {
        e eVar2 = eVar.c;
        if (eVar2 == null) {
            return true;
        }
        boolean zP = p(eVar2, f);
        eVar2.h = eVar2.i;
        eVar2.l = eVar2.m;
        if (eVar.m != -1.0f) {
            float f2 = eVar.q;
            float f3 = eVar.r;
            if (f2 >= f3) {
                if (eVar2.t != 0.0f && f3 != 0.0f) {
                    return zP;
                }
                eVar.c = eVar2.c;
                e eVar3 = eVar2.c;
                if (eVar3 != null) {
                    eVar3.d = eVar;
                }
                eVar.s = eVar2.s;
                this.e.b(eVar2);
                return zP;
            }
        }
        eVar2.k = (eVar2.o * f) + eVar2.k;
        eVar.q += f;
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        mw0<e> mw0Var = this.b;
        e[] eVarArr = mw0Var.a;
        int i = mw0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = eVarArr[i2];
            if (eVar != null) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(eVar.toString());
            }
        }
        return sb.length() == 0 ? "<none>" : sb.toString();
    }
}
