package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import com.google.protobuf.Reader;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tsr implements uga, y250, xgz, fsr, ua80, yka, wgz.a {
    public static final c g0 = new c("Undefined intrinsics block and it is required");
    public static final a h0 = a.a;
    public static final b i0 = new b();
    public static final ssr j0 = new ssr();
    public boolean A;
    public tsr B;
    public wgz C;
    public ViewFactoryHolder D;
    public int E;
    public boolean F;
    public boolean G;
    public sa80 H;
    public boolean I;
    public final duw<tsr> J;
    public boolean K;
    public aiv L;
    public zzo M;
    public mmd N;
    public asr O;
    public z6i0 P;
    public ina Q;
    public f R;
    public f S;
    public boolean T;
    public final wwx U;
    public final ysr V;
    public k W;
    public ywx X;
    public boolean Y;
    public androidx.compose.ui.d Z;
    public final boolean a;
    public androidx.compose.ui.d a0;
    public int b;
    public AndroidViewHolder.e b0;
    public long c;
    public AndroidViewHolder.f c0;
    public long d;
    public boolean d0;
    public long e;
    public int e0;
    public boolean f;
    public boolean f0;
    public boolean i;
    public tsr v;
    public int w;
    public final fuw<tsr> y;
    public duw<tsr> z;

    public static final class a extends qlr implements Function0<tsr> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final tsr invoke() {
            return new tsr(3);
        }
    }

    public static final class b implements z6i0 {
        @Override // defpackage.z6i0
        public final long a() {
            return 300L;
        }

        @Override // defpackage.z6i0
        public final long b() {
            return 40L;
        }

        @Override // defpackage.z6i0
        public final long c() {
            return 400L;
        }

        @Override // defpackage.z6i0
        public final long f() {
            return 0L;
        }

        @Override // defpackage.z6i0
        public final float h() {
            return 16.0f;
        }
    }

    public static final class c extends e {
        @Override // defpackage.aiv
        public final biv c(t tVar, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
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
        public static final /* synthetic */ d[] f;

        static {
            d dVar = new d("Measuring", 0);
            a = dVar;
            d dVar2 = new d("LookaheadMeasuring", 1);
            b = dVar2;
            d dVar3 = new d("LayingOut", 2);
            c = dVar3;
            d dVar4 = new d("LookaheadLayingOut", 3);
            d = dVar4;
            d dVar5 = new d("Idle", 4);
            e = dVar5;
            f = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f.clone();
        }
    }

    public static abstract class e implements aiv {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        @Override // defpackage.aiv
        public final int a(nzo nzoVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.aiv
        public final int e(nzo nzoVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.aiv
        public final int g(nzo nzoVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.aiv
        public final int i(nzo nzoVar, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final /* synthetic */ f[] d;

        static {
            f fVar = new f("InMeasureBlock", 0);
            a = fVar;
            f fVar2 = new f("InLayoutBlock", 1);
            b = fVar2;
            f fVar3 = new f("NotUsed", 2);
            c = fVar3;
            d = new f[]{fVar, fVar2, fVar3};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) d.clone();
        }
    }

    public /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                d dVar = d.a;
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final class h extends qlr implements Function0<Unit> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ysr ysrVar = tsr.this.V;
            ysrVar.p.P = true;
            blt bltVar = ysrVar.q;
            if (bltVar != null) {
                bltVar.J = true;
            }
            return Unit.a;
        }
    }

    public tsr(int i, boolean z) {
        this.a = z;
        this.b = i;
        this.c = 9223372034707292159L;
        this.d = 0L;
        this.e = 9223372034707292159L;
        this.f = true;
        this.y = new fuw<>(new duw(new tsr[16]), new h());
        this.J = new duw<>(new tsr[16]);
        this.K = true;
        this.L = g0;
        this.N = xsr.a;
        this.O = asr.a;
        this.P = i0;
        ina.l.getClass();
        this.Q = ina.a.b;
        f fVar = f.c;
        this.R = fVar;
        this.S = fVar;
        this.U = new wwx(this);
        this.V = new ysr(this);
        this.Y = true;
        this.Z = androidx.compose.ui.d.a.b;
    }

    public static boolean a0(tsr tsrVar) {
        zhv zhvVar = tsrVar.V.p;
        return tsrVar.Z(zhvVar.y ? new kxa(zhvVar.d) : null);
    }

    public static void f0(tsr tsrVar, boolean z, int i) {
        tsr tsrVarH;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (tsrVar.v == null) {
            wkn.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        wgz wgzVar = tsrVar.C;
        if (wgzVar == null || tsrVar.F || tsrVar.a) {
            return;
        }
        wgzVar.B(tsrVar, true, z, z2);
        if (z3) {
            blt bltVar = tsrVar.V.q;
            bltVar.getClass();
            ysr ysrVar = bltVar.f;
            tsr tsrVarH2 = ysrVar.a.H();
            f fVar = ysrVar.a.R;
            if (tsrVarH2 == null || fVar == f.c) {
                return;
            }
            while (tsrVarH2.R == fVar && (tsrVarH = tsrVarH2.H()) != null) {
                tsrVarH2 = tsrVarH;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                if (tsrVarH2.v != null) {
                    f0(tsrVarH2, z, 6);
                    return;
                } else {
                    h0(tsrVarH2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                ib5.a("Intrinsics isn't used by the parent");
            } else if (tsrVarH2.v != null) {
                tsrVarH2.e0(z);
            } else {
                tsrVarH2.g0(z);
            }
        }
    }

    public static void h0(tsr tsrVar, boolean z, int i) {
        wgz wgzVar;
        tsr tsrVarH;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (tsrVar.F || tsrVar.a || (wgzVar = tsrVar.C) == null) {
            return;
        }
        wgzVar.B(tsrVar, false, z, z2);
        if (z3) {
            ysr ysrVar = tsrVar.V.p.f;
            tsr tsrVarH2 = ysrVar.a.H();
            f fVar = ysrVar.a.R;
            if (tsrVarH2 == null || fVar == f.c) {
                return;
            }
            while (tsrVarH2.R == fVar && (tsrVarH = tsrVarH2.H()) != null) {
                tsrVarH2 = tsrVarH;
            }
            int iOrdinal = fVar.ordinal();
            if (iOrdinal == 0) {
                h0(tsrVarH2, z, 6);
            } else if (iOrdinal == 1) {
                tsrVarH2.g0(z);
            } else {
                ib5.a("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void i0(tsr tsrVar) {
        ysr ysrVar = tsrVar.V;
        if (g.a[ysrVar.d.ordinal()] != 1) {
            uj5.a(ysrVar.d, "Unexpected state ");
            return;
        }
        if (ysrVar.e) {
            f0(tsrVar, true, 6);
            return;
        }
        if (ysrVar.f) {
            tsrVar.e0(true);
        }
        if (tsrVar.D()) {
            h0(tsrVar, true, 6);
        } else if (tsrVar.C()) {
            tsrVar.g0(true);
        }
    }

    private final String x(tsr tsrVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(tsrVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(u(0));
        sb.append(" Other tree: ");
        tsr tsrVar2 = tsrVar.B;
        sb.append(tsrVar2 != null ? tsrVar2.u(0) : null);
        return sb.toString();
    }

    public final List<tsr> A() {
        return K().f();
    }

    public final List<tsr> B() {
        return this.y.a.f();
    }

    public final boolean C() {
        return this.V.p.L;
    }

    public final boolean D() {
        return this.V.p.K;
    }

    public final f E() {
        return this.V.p.A;
    }

    public final f F() {
        f fVar;
        blt bltVar = this.V.q;
        return (bltVar == null || (fVar = bltVar.y) == null) ? f.c : fVar;
    }

    public final zzo G() {
        zzo zzoVar = this.M;
        if (zzoVar != null) {
            return zzoVar;
        }
        zzo zzoVar2 = new zzo(this, this.L);
        this.M = zzoVar2;
        return zzoVar2;
    }

    public final tsr H() {
        tsr tsrVar = this.B;
        while (tsrVar != null && tsrVar.a) {
            tsrVar = tsrVar.B;
        }
        return tsrVar;
    }

    public final int I() {
        return this.V.p.w;
    }

    public final duw<tsr> J() {
        boolean z = this.K;
        duw<tsr> duwVar = this.J;
        if (z) {
            duwVar.g();
            duwVar.c(duwVar.c, K());
            Arrays.sort(duwVar.a, 0, duwVar.c, j0);
            this.K = false;
        }
        return duwVar;
    }

    public final duw<tsr> K() {
        p0();
        if (this.w == 0) {
            return this.y.a;
        }
        duw<tsr> duwVar = this.z;
        duwVar.getClass();
        return duwVar;
    }

    public final void L(long j, iam iamVar, int i, boolean z) {
        wwx wwxVar = this.U;
        ywx ywxVar = wwxVar.d;
        ywx.d dVar = ywx.c0;
        wwxVar.d.W1(ywx.h0, ywxVar.t1(j, true), iamVar, i, z);
    }

    public final void M(int i, tsr tsrVar) {
        if (tsrVar.B != null && tsrVar.C != null) {
            wkn.c(x(tsrVar));
        }
        tsrVar.B = this;
        fuw<tsr> fuwVar = this.y;
        fuwVar.a.a(i, tsrVar);
        fuwVar.b.invoke();
        Y();
        if (tsrVar.a) {
            this.w++;
        }
        S();
        wgz wgzVar = this.C;
        if (wgzVar != null) {
            tsrVar.r(wgzVar);
        }
        if (tsrVar.V.l > 0) {
            ysr ysrVar = this.V;
            ysrVar.d(ysrVar.l + 1);
        }
        if (tsrVar.e0 > 0) {
            m0(this.e0 + 1);
        }
    }

    public final void N() {
        if (this.Y) {
            wwx wwxVar = this.U;
            ywx ywxVar = wwxVar.c;
            ywx ywxVar2 = wwxVar.d.I;
            this.X = null;
            while (!Intrinsics.g(ywxVar, ywxVar2)) {
                if ((ywxVar != null ? ywxVar.a0 : null) != null) {
                    this.X = ywxVar;
                    break;
                }
                ywxVar = ywxVar != null ? ywxVar.I : null;
            }
        }
        ywx ywxVar3 = this.X;
        if (ywxVar3 != null && ywxVar3.a0 == null) {
            throw w20.a("layer was not set");
        }
        if (ywxVar3 != null) {
            ywxVar3.Y1();
            return;
        }
        tsr tsrVarH = H();
        if (tsrVarH != null) {
            tsrVarH.N();
        }
    }

    public final void O() {
        wwx wwxVar = this.U;
        ywx ywxVar = wwxVar.d;
        iln ilnVar = wwxVar.c;
        while (ywxVar != ilnVar) {
            ywxVar.getClass();
            qsr qsrVar = (qsr) ywxVar;
            vgz vgzVar = qsrVar.a0;
            if (vgzVar != null) {
                vgzVar.invalidate();
            }
            ywxVar = qsrVar.H;
        }
        vgz vgzVar2 = ilnVar.a0;
        if (vgzVar2 != null) {
            vgzVar2.invalidate();
        }
    }

    public final void P() {
        if (this.a) {
            tsr tsrVarH = H();
            if (tsrVarH != null) {
                tsrVarH.P();
                return;
            }
            return;
        }
        if (this.v != null) {
            f0(this, false, 7);
        } else {
            h0(this, false, 7);
        }
    }

    public final void Q() {
        if (iwo.b(this.c, 9223372034707292159L)) {
            return;
        }
        this.c = 9223372034707292159L;
        duw<tsr> duwVarK = K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsrVarArr[i2].Q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, sa80] */
    public final void R() {
        if (this.I) {
            return;
        }
        if (this.U.b.f != null || this.a0 != null) {
            this.G = true;
            return;
        }
        sa80 sa80Var = this.H;
        this.I = true;
        dq40 dq40Var = new dq40();
        dq40Var.a = new sa80();
        ghz snapshotObserver = xsr.a(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new usr(this, dq40Var));
        this.I = false;
        this.H = (sa80) dq40Var.a;
        this.G = false;
        wgz wgzVarA = xsr.a(this);
        etw<va80> etwVar = wgzVarA.getSemanticsOwner().d;
        Object[] objArr = etwVar.a;
        int i = etwVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((va80) objArr[i2]).b(this, sa80Var);
        }
        wgzVarA.A();
    }

    public final void S() {
        tsr tsrVar;
        if (this.w > 0) {
            this.A = true;
        }
        if (!this.a || (tsrVar = this.B) == null) {
            return;
        }
        tsrVar.S();
    }

    public final Boolean T() {
        blt bltVar = this.V.q;
        if (bltVar != null) {
            return Boolean.valueOf(bltVar.i());
        }
        return null;
    }

    public final void U() {
        tsr tsrVarH;
        if (this.R == f.c) {
            t();
        }
        blt bltVar = this.V.q;
        bltVar.getClass();
        try {
            bltVar.i = true;
            if (!bltVar.A) {
                wkn.c("replace() called on item that was not placed");
            }
            bltVar.N = false;
            boolean zI = bltVar.i();
            bltVar.N0(bltVar.D, bltVar.F, bltVar.E);
            if (zI && !bltVar.N && (tsrVarH = bltVar.f.a.H()) != null) {
                tsrVarH.e0(false);
            }
        } finally {
            bltVar.i = false;
        }
    }

    public final void V(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            fuw<tsr> fuwVar = this.y;
            duw<tsr> duwVar = fuwVar.a;
            h hVar = fuwVar.b;
            tsr tsrVarK = duwVar.k(i5);
            hVar.invoke();
            fuwVar.a.a(i6, tsrVarK);
            hVar.invoke();
        }
        Y();
        S();
        P();
    }

    public final void W(tsr tsrVar) {
        if (tsrVar.V.l > 0) {
            ysr ysrVar = this.V;
            ysrVar.d(ysrVar.l - 1);
        }
        if (this.C != null) {
            tsrVar.v();
        }
        tsrVar.B = null;
        if (tsrVar.e0 > 0) {
            m0(this.e0 - 1);
        }
        tsrVar.U.d.I = null;
        if (tsrVar.a) {
            this.w--;
            duw<tsr> duwVar = tsrVar.y.a;
            tsr[] tsrVarArr = duwVar.a;
            int i = duwVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                tsrVarArr[i2].U.d.I = null;
            }
        }
        S();
        Y();
    }

    public final void X() {
        this.f = true;
        duw<tsr> duwVarK = K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsrVarArr[i2].Q();
        }
    }

    public final void Y() {
        if (!this.a) {
            this.K = true;
            return;
        }
        tsr tsrVarH = H();
        if (tsrVarH != null) {
            tsrVarH.Y();
        }
    }

    public final boolean Z(kxa kxaVar) {
        if (kxaVar == null) {
            return false;
        }
        if (this.R == f.c) {
            s();
        }
        return this.V.p.S0(kxaVar.a);
    }

    @Override // defpackage.xgz
    public final boolean Z0() {
        return e();
    }

    @Override // defpackage.uga
    public final void a() {
        ViewFactoryHolder viewFactoryHolder = this.D;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.a();
        }
        k kVar = this.W;
        if (kVar != null) {
            kVar.a();
        }
        wwx wwxVar = this.U;
        ywx ywxVar = wwxVar.c.H;
        for (ywx ywxVar2 = wwxVar.d; !Intrinsics.g(ywxVar2, ywxVar) && ywxVar2 != null; ywxVar2 = ywxVar2.H) {
            ywxVar2.g2();
        }
    }

    @Override // defpackage.fsr
    public final int b() {
        return this.b;
    }

    public final void b0() {
        fuw<tsr> fuwVar = this.y;
        int i = fuwVar.a.c;
        while (true) {
            i--;
            duw<tsr> duwVar = fuwVar.a;
            if (-1 >= i) {
                duwVar.g();
                fuwVar.b.invoke();
                return;
            }
            W(duwVar.a[i]);
        }
    }

    @Override // defpackage.uga
    public final void c() {
        ViewFactoryHolder viewFactoryHolder = this.D;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.c();
        }
        k kVar = this.W;
        if (kVar != null) {
            kVar.f(true);
        }
        this.f0 = true;
        androidx.compose.ui.d.c cVar = this.U.e;
        for (androidx.compose.ui.d.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.e) {
            if (cVar2.C) {
                cVar2.k2();
            }
        }
        for (androidx.compose.ui.d.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.e) {
            if (cVar3.C) {
                cVar3.m2();
            }
        }
        while (cVar != null) {
            if (cVar.C) {
                cVar.g2();
            }
            cVar = cVar.e;
        }
        if (e()) {
            this.H = null;
            this.G = false;
        }
        wgz wgzVar = this.C;
        if (wgzVar != null) {
            wgzVar.h(this);
        }
    }

    public final void c0(int i, int i2) {
        if (i2 < 0) {
            wkn.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            fuw<tsr> fuwVar = this.y;
            W(fuwVar.a.a[i3]);
            fuwVar.a.k(i3);
            fuwVar.b.invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    @Override // defpackage.y250
    public final void d() {
        if (this.v != null) {
            f0(this, false, 5);
        } else {
            h0(this, false, 5);
        }
        zhv zhvVar = this.V.p;
        kxa kxaVar = zhvVar.y ? new kxa(zhvVar.d) : null;
        wgz wgzVar = this.C;
        if (kxaVar != null) {
            if (wgzVar != null) {
                wgzVar.s(this, kxaVar.a);
            }
        } else if (wgzVar != null) {
            wgzVar.a(true);
        }
    }

    public final void d0() {
        tsr tsrVarH;
        if (this.R == f.c) {
            t();
        }
        zhv zhvVar = this.V.p;
        ysr ysrVar = zhvVar.f;
        try {
            zhvVar.i = true;
            if (!zhvVar.z) {
                wkn.c("replace called on unplaced item");
            }
            boolean z = zhvVar.I;
            zhvVar.Q0(zhvVar.C, zhvVar.F, zhvVar.D, zhvVar.E);
            if (z && !zhvVar.V && (tsrVarH = ysrVar.a.H()) != null) {
                tsrVarH.g0(false);
            }
            zhvVar.i = false;
        } catch (Throwable th) {
            try {
                ysrVar.a.k0(th);
                throw null;
            } catch (Throwable th2) {
                zhvVar.i = false;
                throw th2;
            }
        }
    }

    @Override // defpackage.fsr
    public final boolean e() {
        return this.C != null;
    }

    public final void e0(boolean z) {
        wgz wgzVar;
        if (this.a || (wgzVar = this.C) == null) {
            return;
        }
        wgzVar.r(this, true, z);
    }

    @Override // defpackage.ua80
    public final sa80 f() {
        if (e() && !this.f0 && this.U.c(8)) {
            return this.H;
        }
        return null;
    }

    @Override // defpackage.ua80
    public final tsr g() {
        return H();
    }

    public final void g0(boolean z) {
        wgz wgzVar;
        if (this.a || (wgzVar = this.C) == null) {
            return;
        }
        wgzVar.r(this, false, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // wgz.a
    public final void h() {
        wwx wwxVar = this.U;
        iln ilnVar = wwxVar.c;
        boolean zG = dxx.g(128);
        androidx.compose.ui.d.c cVar = ilnVar.j0;
        if (!zG && (cVar = cVar.e) == null) {
            return;
        }
        ywx.d dVar = ywx.c0;
        for (androidx.compose.ui.d.c cVarL1 = ilnVar.L1(zG); cVarL1 != null && (cVarL1.d & 128) != 0; cVarL1 = cVarL1.f) {
            if ((cVarL1.c & 128) != 0) {
                ?? C = cVarL1;
                ?? duwVar = 0;
                while (C != 0) {
                    if (C instanceof mrr) {
                        ((mrr) C).T0(wwxVar.c);
                    } else if ((C.c & 128) != 0 && (C instanceof tkd)) {
                        androidx.compose.ui.d.c cVar2 = ((tkd) C).E;
                        int i = 0;
                        C = C;
                        duwVar = duwVar;
                        while (cVar2 != null) {
                            if ((cVar2.c & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    duwVar = duwVar;
                                    C = cVar2;
                                } else {
                                    if (duwVar == 0) {
                                        duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                    }
                                    if (C != 0) {
                                        duwVar.b(C);
                                        C = 0;
                                    }
                                    duwVar.b(cVar2);
                                }
                            }
                            cVar2 = cVar2.f;
                            C = C;
                            duwVar = duwVar;
                        }
                        if (i == 1) {
                        }
                    }
                    C = pkd.c(duwVar);
                }
            }
            if (cVarL1 == cVar) {
                return;
            }
        }
    }

    @Override // defpackage.fsr
    public final boolean i() {
        return this.V.p.I;
    }

    @Override // defpackage.yka
    public final void j(aiv aivVar) {
        if (Intrinsics.g(this.L, aivVar)) {
            return;
        }
        this.L = aivVar;
        zzo zzoVar = this.M;
        if (zzoVar != null) {
            ((x5a0) zzoVar.b).setValue(aivVar);
        }
        P();
    }

    public final void j0() {
        duw<tsr> duwVarK = K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar = tsrVarArr[i2];
            f fVar = tsrVar.S;
            tsrVar.R = fVar;
            if (fVar != f.c) {
                tsrVar.j0();
            }
        }
    }

    @Override // defpackage.yka
    public final void k(androidx.compose.ui.d dVar) {
        if (this.a && this.Z != androidx.compose.ui.d.a.b) {
            wkn.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f0) {
            wkn.a("modifier is updated when deactivated");
        }
        if (!e()) {
            this.a0 = dVar;
            return;
        }
        q(dVar);
        if (this.G) {
            R();
        }
    }

    public final void k0(Throwable th) throws Throwable {
        qma qmaVar = (qma) this.Q.b(tma.a);
        if (qmaVar == null) {
            throw th;
        }
        qmaVar.a(th, this);
        throw th;
    }

    @Override // defpackage.uga
    public final void l() {
        if (!e()) {
            wkn.a("onReuse is only expected on attached node");
        }
        ViewFactoryHolder viewFactoryHolder = this.D;
        if (viewFactoryHolder != null) {
            viewFactoryHolder.l();
        }
        k kVar = this.W;
        if (kVar != null) {
            kVar.f(false);
        }
        this.I = false;
        boolean z = this.f0;
        wwx wwxVar = this.U;
        if (z) {
            this.f0 = false;
        } else {
            androidx.compose.ui.d.c cVar = wwxVar.e;
            for (androidx.compose.ui.d.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.e) {
                if (cVar2.C) {
                    cVar2.k2();
                }
            }
            for (androidx.compose.ui.d.c cVar3 = cVar; cVar3 != null; cVar3 = cVar3.e) {
                if (cVar3.C) {
                    cVar3.m2();
                }
            }
            while (cVar != null) {
                if (cVar.C) {
                    cVar.g2();
                }
                cVar = cVar.e;
            }
        }
        int i = this.b;
        this.b = xa80.a.addAndGet(1);
        wgz wgzVar = this.C;
        if (wgzVar != null) {
            wgzVar.y(i, this);
        }
        for (androidx.compose.ui.d.c cVar4 = wwxVar.f; cVar4 != null; cVar4 = cVar4.f) {
            cVar4.f2();
        }
        wwxVar.e();
        if (wwxVar.c(8)) {
            R();
        }
        i0(this);
        wgz wgzVar2 = this.C;
        if (wgzVar2 != null) {
            wgzVar2.g(i, this);
        }
    }

    public final void l0(mmd mmdVar) {
        if (Intrinsics.g(this.N, mmdVar)) {
            return;
        }
        this.N = mmdVar;
        P();
        tsr tsrVarH = H();
        if (tsrVarH != null) {
            tsrVarH.N();
        }
        O();
        for (androidx.compose.ui.d.c cVar = this.U.f; cVar != null; cVar = cVar.f) {
            cVar.x();
        }
    }

    @Override // defpackage.ua80
    public final List<ua80> m() {
        return A();
    }

    public final void m0(int i) {
        tsr tsrVarH;
        tsr tsrVarH2;
        int i2 = this.e0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (tsrVarH2 = H()) != null) {
                tsrVarH2.m0(tsrVarH2.e0 + 1);
            }
            if (i == 0 && this.e0 > 0 && (tsrVarH = H()) != null) {
                tsrVarH.m0(tsrVarH.e0 - 1);
            }
            this.e0 = i;
        }
    }

    @Override // defpackage.fsr
    public final boolean n() {
        return this.f0;
    }

    public final void n0(tsr tsrVar) {
        if (Intrinsics.g(tsrVar, this.v)) {
            return;
        }
        this.v = tsrVar;
        ysr ysrVar = this.V;
        if (tsrVar != null) {
            if (ysrVar.q == null) {
                ysrVar.q = new blt(ysrVar);
            }
            wwx wwxVar = this.U;
            ywx ywxVar = wwxVar.c.H;
            for (ywx ywxVar2 = wwxVar.d; !Intrinsics.g(ywxVar2, ywxVar) && ywxVar2 != null; ywxVar2 = ywxVar2.H) {
                ywxVar2.o1();
            }
        } else {
            ysrVar.q = null;
            ysrVar.f = false;
            ysrVar.e = false;
        }
        P();
    }

    @Override // defpackage.ua80
    public final boolean o() {
        return this.U.d.c2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void o0(z6i0 z6i0Var) {
        if (Intrinsics.g(this.P, z6i0Var)) {
            return;
        }
        this.P = z6i0Var;
        androidx.compose.ui.d.c cVar = this.U.f;
        if ((cVar.d & 16) != 0) {
            while (cVar != null) {
                if ((cVar.c & 16) != 0) {
                    ?? C = cVar;
                    ?? duwVar = 0;
                    while (C != 0) {
                        if (C instanceof s020) {
                            ((s020) C).W1();
                        } else if ((C.c & 16) != 0 && (C instanceof tkd)) {
                            androidx.compose.ui.d.c cVar2 = ((tkd) C).E;
                            int i = 0;
                            C = C;
                            duwVar = duwVar;
                            while (cVar2 != null) {
                                if ((cVar2.c & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        duwVar = duwVar;
                                        C = cVar2;
                                    } else {
                                        if (duwVar == 0) {
                                            duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                        }
                                        if (C != 0) {
                                            duwVar.b(C);
                                            C = 0;
                                        }
                                        duwVar.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.f;
                                C = C;
                                duwVar = duwVar;
                            }
                            if (i == 1) {
                            }
                        }
                        C = pkd.c(duwVar);
                    }
                }
                if ((cVar.d & 16) == 0) {
                    return;
                } else {
                    cVar = cVar.f;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [duw] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [duw] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.yka
    public final void p(ina inaVar) {
        this.Q = inaVar;
        l0((mmd) inaVar.b(kna.h));
        asr asrVar = (asr) inaVar.b(kna.n);
        asr asrVar2 = this.O;
        wwx wwxVar = this.U;
        if (asrVar2 != asrVar) {
            this.O = asrVar;
            P();
            tsr tsrVarH = H();
            if (tsrVarH != null) {
                tsrVarH.N();
            }
            O();
            for (androidx.compose.ui.d.c cVar = wwxVar.f; cVar != null; cVar = cVar.f) {
                cVar.l0();
            }
        }
        o0((z6i0) inaVar.b(kna.s));
        androidx.compose.ui.d.c cVar2 = wwxVar.f;
        if ((cVar2.d & 32768) != 0) {
            while (cVar2 != null) {
                if ((cVar2.c & 32768) != 0) {
                    ?? C = cVar2;
                    ?? duwVar = 0;
                    while (C != 0) {
                        if (C instanceof yma) {
                            androidx.compose.ui.d.c cVarI = ((yma) C).i();
                            if (cVarI.C) {
                                dxx.c(cVarI);
                            } else {
                                cVarI.y = true;
                            }
                        } else if ((C.c & 32768) != 0 && (C instanceof tkd)) {
                            androidx.compose.ui.d.c cVar3 = ((tkd) C).E;
                            int i = 0;
                            while (cVar3 != null) {
                                if ((cVar3.c & 32768) != 0) {
                                    i++;
                                    if (i == 1) {
                                        C = C;
                                        duwVar = duwVar;
                                        duwVar = duwVar;
                                        C = cVar3;
                                    } else {
                                        if (duwVar == 0) {
                                            duwVar = new duw(new androidx.compose.ui.d.c[16]);
                                        }
                                        if (C != 0) {
                                            duwVar.b(C);
                                            C = 0;
                                        }
                                        duwVar.b(cVar3);
                                    }
                                } else {
                                    C = C;
                                    duwVar = duwVar;
                                }
                                cVar3 = cVar3.f;
                                C = C;
                                duwVar = duwVar;
                            }
                            if (i == 1) {
                                C = C;
                                duwVar = duwVar;
                            } else {
                                C = C;
                                duwVar = duwVar;
                            }
                        }
                        C = pkd.c(duwVar);
                    }
                }
                if ((cVar2.d & 32768) == 0) {
                    return;
                } else {
                    cVar2 = cVar2.f;
                }
            }
        }
    }

    public final void p0() {
        if (this.w <= 0 || !this.A) {
            return;
        }
        this.A = false;
        duw<tsr> duwVar = this.z;
        if (duwVar == null) {
            duwVar = new duw<>(new tsr[16]);
            this.z = duwVar;
        }
        duwVar.g();
        duw<tsr> duwVar2 = this.y.a;
        tsr[] tsrVarArr = duwVar2.a;
        int i = duwVar2.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar = tsrVarArr[i2];
            if (tsrVar.a) {
                duwVar.c(duwVar.c, tsrVar.K());
            } else {
                duwVar.b(tsrVar);
            }
        }
        ysr ysrVar = this.V;
        ysrVar.p.P = true;
        blt bltVar = ysrVar.q;
        if (bltVar != null) {
            bltVar.J = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.ui.d$c, ywx] */
    public final void q(androidx.compose.ui.d dVar) {
        ?? r7;
        duw<androidx.compose.ui.d.b> duwVar;
        boolean z;
        wwx wwxVar;
        boolean z2;
        duw<androidx.compose.ui.d.b> duwVar2;
        wwx wwxVar2;
        duw<androidx.compose.ui.d.b> duwVar3;
        duw<androidx.compose.ui.d.b> duwVar4;
        boolean z3;
        duw<androidx.compose.ui.d.b> duwVar5;
        duw<androidx.compose.ui.d.b> duwVar6;
        duw<androidx.compose.ui.d.b> duwVar7;
        duw<androidx.compose.ui.d.b> duwVar8;
        char c2;
        duw<androidx.compose.ui.d.b> duwVar9;
        xwx xwxVar;
        wwx wwxVar3 = this.U;
        boolean zC = wwxVar3.c(16);
        androidx.compose.ui.d.c cVar = wwxVar3.e;
        boolean zC2 = wwxVar3.c(1024);
        this.Z = dVar;
        iln ilnVar = wwxVar3.c;
        tsr tsrVar = wwxVar3.a;
        androidx.compose.ui.d.c cVar2 = wwxVar3.f;
        wwx.b bVar = wwxVar3.b;
        if (cVar2 == bVar) {
            wkn.c("padChain called on already padded chain");
        }
        androidx.compose.ui.d.c cVar3 = wwxVar3.f;
        cVar3.e = bVar;
        bVar.f = cVar3;
        duw<androidx.compose.ui.d.b> duwVar10 = wwxVar3.g;
        int i = duwVar10 != null ? duwVar10.c : 0;
        duw<androidx.compose.ui.d.b> duwVar11 = wwxVar3.h;
        if (duwVar11 == null) {
            duwVar11 = new duw<>(new androidx.compose.ui.d.b[16]);
        }
        duw<androidx.compose.ui.d> duwVar12 = wwxVar3.i;
        duwVar12.b(dVar);
        xwx xwxVar2 = null;
        while (true) {
            int i2 = duwVar12.c;
            if (i2 == 0) {
                break;
            }
            androidx.compose.ui.d dVarK = duwVar12.k(i2 - 1);
            if (dVarK instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) dVarK;
                duwVar12.b(aVar.c);
                duwVar12.b(aVar.b);
            } else if (dVarK instanceof androidx.compose.ui.d.b) {
                duwVar11.b(dVarK);
            } else {
                if (xwxVar2 == null) {
                    xwxVar = new xwx(duwVar11);
                    xwxVar2 = xwxVar;
                } else {
                    xwxVar = xwxVar2;
                }
                dVarK.c(xwxVar);
            }
        }
        int i3 = duwVar11.c;
        if (i3 == i) {
            androidx.compose.ui.d.c cVar4 = bVar.f;
            int i4 = 0;
            while (true) {
                if (cVar4 == null) {
                    duwVar6 = duwVar10;
                } else if (i4 < i) {
                    if (duwVar6 == null) {
                        throw w20.a("expected prior modifier list to be non-empty");
                    }
                    androidx.compose.ui.d.b bVar2 = duwVar6.a[i4];
                    androidx.compose.ui.d.b bVar3 = duwVar11.a[i4];
                    if (Intrinsics.g(bVar2, bVar3)) {
                        duwVar9 = duwVar6;
                        c2 = 2;
                    } else {
                        duwVar8 = duwVar6;
                        c2 = bVar2.getClass() == bVar3.getClass() ? (char) 1 : (char) 0;
                    }
                    if (c2 == 0) {
                        duwVar9 = duwVar8;
                        duwVar9 = duwVar8;
                        cVar4 = cVar4.e;
                        duwVar7 = duwVar9;
                        break;
                    }
                    duwVar9 = duwVar8;
                    duwVar9 = duwVar8;
                    if (c2 == 1) {
                        wwx.h(bVar2, bVar3, cVar4);
                    }
                    cVar4 = cVar4.f;
                    i4++;
                    duwVar6 = duwVar9;
                }
                duwVar7 = duwVar6;
                break;
            }
            if (i4 >= i) {
                wwxVar3 = wwxVar3;
                duwVar2 = duwVar7;
                z2 = false;
                wwxVar2 = wwxVar3;
                bVar = bVar;
                duwVar = duwVar11;
                z = false;
                duwVar3 = duwVar2;
                r7 = z2;
            } else {
                if (duwVar7 == null) {
                    throw w20.a("expected prior modifier list to be non-empty");
                }
                if (cVar4 == null) {
                    throw w20.a("structuralUpdate requires a non-null tail");
                }
                boolean z4 = tsrVar.a0 != null;
                androidx.compose.ui.d.c cVar5 = cVar4;
                wwx wwxVar4 = wwxVar3;
                duwVar = duwVar11;
                duw<androidx.compose.ui.d.b> duwVar13 = duwVar7;
                z3 = false;
                wwxVar4.f(i4, duwVar13, duwVar, cVar5, !z4);
                wwxVar = wwxVar4;
                duwVar5 = duwVar13;
                z = true;
                wwxVar2 = wwxVar;
                duwVar3 = duwVar5;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z3 = false;
            z2 = false;
            androidx.compose.ui.d dVar2 = tsrVar.a0;
            if (dVar2 != null && i == 0) {
                androidx.compose.ui.d.c cVarA = bVar;
                for (int i5 = 0; i5 < duwVar11.c; i5++) {
                    cVarA = wwx.a(duwVar11.a[i5], cVarA);
                }
                int i6 = 0;
                for (androidx.compose.ui.d.c cVar6 = cVar.e; cVar6 != null && cVar6 != bVar; cVar6 = cVar6.e) {
                    i6 |= cVar6.c;
                    cVar6.d = i6;
                }
                wwxVar = wwxVar3;
                duwVar = duwVar11;
                duwVar5 = duwVar10;
                z = true;
                wwxVar2 = wwxVar;
                duwVar3 = duwVar5;
                r7 = z3;
            } else if (i3 != 0) {
                if (duwVar10 == null) {
                    duwVar10 = new duw<>(new androidx.compose.ui.d.b[16]);
                }
                wwx wwxVar5 = wwxVar3;
                bVar = bVar;
                duwVar = duwVar11;
                wwxVar5.f(0, duwVar10, duwVar, bVar, !(dVar2 != null));
                z = true;
                wwxVar2 = wwxVar5;
                duwVar3 = duwVar10;
            } else {
                if (duwVar10 == null) {
                    throw w20.a("expected prior modifier list to be non-empty");
                }
                androidx.compose.ui.d.c cVar7 = bVar.f;
                for (int i7 = 0; cVar7 != null && i7 < duwVar10.c; i7++) {
                    cVar7 = wwx.b(cVar7).f;
                }
                tsr tsrVarH = tsrVar.H();
                ilnVar.I = tsrVarH != null ? tsrVarH.U.c : null;
                wwxVar3.d = ilnVar;
                duwVar2 = duwVar10;
                wwxVar2 = wwxVar3;
                bVar = bVar;
                duwVar = duwVar11;
                z = false;
                duwVar3 = duwVar2;
                r7 = z2;
            }
        }
        wwxVar2.g = duwVar;
        if (duwVar3 != null) {
            duwVar3.g();
            duwVar4 = duwVar3;
        } else {
            duwVar4 = r7;
        }
        wwxVar2.h = duwVar4;
        androidx.compose.ui.d.c cVar8 = bVar.f;
        if (cVar8 != null) {
            cVar = cVar8;
        }
        cVar.e = r7;
        bVar.f = r7;
        bVar.d = -1;
        bVar.v = r7;
        if (cVar == bVar) {
            wkn.c("trimChain did not update the head");
        }
        wwxVar2.f = cVar;
        if (z) {
            wwxVar2.g();
        }
        boolean zC3 = wwxVar2.c(16);
        boolean zC4 = wwxVar2.c(1024);
        this.V.j();
        if (this.v == null && wwxVar2.c(512)) {
            n0(this);
        }
        if (zC == zC3 && zC2 == zC4) {
            return;
        }
        rk40 rectManager = xsr.a(this).getRectManager();
        rectManager.getClass();
        if (e()) {
            qk40 qk40Var = rectManager.a;
            int i8 = this.b & 67108863;
            long[] jArr = qk40Var.a;
            int i9 = qk40Var.c;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                int i11 = i10 + 2;
                long j = jArr[i11];
                if ((((int) j) & 67108863) == i8) {
                    jArr[i11] = (4611686018427387903L & j) | ((zC4 ? 1L : 0L) * 4611686018427387904L) | ((zC3 ? 1L : 0L) * Long.MIN_VALUE);
                    return;
                }
            }
        }
    }

    public final void r(wgz wgzVar) {
        tsr tsrVar;
        if (this.C != null) {
            wkn.c("Cannot attach " + this + " as it already is attached.  Tree: " + u(0));
        }
        tsr tsrVar2 = this.B;
        if (tsrVar2 != null && !Intrinsics.g(tsrVar2.C, wgzVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(wgzVar);
            sb.append(") than the parent's owner(");
            tsr tsrVarH = H();
            sb.append(tsrVarH != null ? tsrVarH.C : null);
            sb.append("). This tree: ");
            sb.append(u(0));
            sb.append(" Parent tree: ");
            tsr tsrVar3 = this.B;
            sb.append(tsrVar3 != null ? tsrVar3.u(0) : null);
            wkn.c(sb.toString());
        }
        tsr tsrVarH2 = H();
        ysr ysrVar = this.V;
        if (tsrVarH2 == null) {
            ysrVar.p.I = true;
            blt bltVar = ysrVar.q;
            if (bltVar != null) {
                bltVar.G = blt.a.a;
            }
        }
        wwx wwxVar = this.U;
        wwxVar.d.I = tsrVarH2 != null ? tsrVarH2.U.c : null;
        this.C = wgzVar;
        this.E = (tsrVarH2 != null ? tsrVarH2.E : -1) + 1;
        androidx.compose.ui.d dVar = this.a0;
        if (dVar != null) {
            q(dVar);
        }
        this.a0 = null;
        wgzVar.f(this);
        if (this.i) {
            n0(this);
        } else {
            tsr tsrVar4 = this.B;
            if (tsrVar4 == null || (tsrVar = tsrVar4.v) == null) {
                tsrVar = this.v;
            }
            n0(tsrVar);
            if (this.v == null && wwxVar.c(512)) {
                n0(this);
            }
        }
        if (!this.f0) {
            for (androidx.compose.ui.d.c cVar = wwxVar.f; cVar != null; cVar = cVar.f) {
                cVar.f2();
            }
        }
        duw<tsr> duwVar = this.y.a;
        tsr[] tsrVarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsrVarArr[i2].r(wgzVar);
        }
        if (!this.f0) {
            wwxVar.e();
        }
        P();
        if (tsrVarH2 != null) {
            tsrVarH2.P();
        }
        AndroidViewHolder.e eVar = this.b0;
        if (eVar != null) {
            eVar.invoke(wgzVar);
        }
        ysrVar.j();
        if (!this.f0 && wwxVar.c(8)) {
            R();
        }
        wgzVar.l(this);
    }

    public final void s() {
        this.S = this.R;
        this.R = f.c;
        duw<tsr> duwVarK = K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar = tsrVarArr[i2];
            if (tsrVar.R != f.c) {
                tsrVar.s();
            }
        }
    }

    public final void t() {
        this.S = this.R;
        this.R = f.c;
        duw<tsr> duwVarK = K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar = tsrVarArr[i2];
            if (tsrVar.R == f.b) {
                tsrVar.t();
            }
        }
    }

    public final String toString() {
        return sgp.b(this) + " children: " + ((duw.a) A()).a.c + " measurePolicy: " + this.L + " deactivated: " + this.f0;
    }

    public final String u(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        duw<tsr> duwVarK = K();
        tsr[] tsrVarArr = duwVarK.a;
        int i3 = duwVarK.c;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(tsrVarArr[i4].u(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void v() {
        wkt wktVar;
        wgz wgzVar = this.C;
        if (wgzVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            tsr tsrVarH = H();
            sb.append(tsrVarH != null ? tsrVarH.u(0) : null);
            wkn.d(sb.toString());
            fkd.a();
            return;
        }
        tsr tsrVarH2 = H();
        ysr ysrVar = this.V;
        if (tsrVarH2 != null) {
            tsrVarH2.N();
            tsrVarH2.P();
            zhv zhvVar = ysrVar.p;
            f fVar = f.c;
            zhvVar.A = fVar;
            blt bltVar = ysrVar.q;
            if (bltVar != null) {
                bltVar.y = fVar;
            }
        }
        vsr vsrVar = ysrVar.p.N;
        vsrVar.b = true;
        vsrVar.c = false;
        vsrVar.e = false;
        vsrVar.d = false;
        vsrVar.f = false;
        vsrVar.g = false;
        vsrVar.h = null;
        blt bltVar2 = ysrVar.q;
        if (bltVar2 != null && (wktVar = bltVar2.H) != null) {
            wktVar.b = true;
            wktVar.c = false;
            wktVar.e = false;
            wktVar.d = false;
            wktVar.f = false;
            wktVar.g = false;
            wktVar.h = null;
        }
        wwx wwxVar = this.U;
        androidx.compose.ui.d.c cVar = wwxVar.e;
        ywx ywxVar = wwxVar.c.H;
        for (ywx ywxVar2 = wwxVar.d; !Intrinsics.g(ywxVar2, ywxVar) && ywxVar2 != null; ywxVar2 = ywxVar2.H) {
            ywxVar2.l2();
        }
        AndroidViewHolder.f fVar2 = this.c0;
        if (fVar2 != null) {
            fVar2.invoke(wgzVar);
        }
        for (androidx.compose.ui.d.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.e) {
            if (cVar2.C) {
                cVar2.m2();
            }
        }
        this.F = true;
        duw<tsr> duwVar = this.y.a;
        tsr[] tsrVarArr = duwVar.a;
        int i = duwVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsrVarArr[i2].v();
        }
        Unit unit = Unit.a;
        this.F = false;
        while (cVar != null) {
            if (cVar.C) {
                cVar.g2();
            }
            cVar = cVar.e;
        }
        wgzVar.p(this);
        this.C = null;
        this.c = 9223372034707292159L;
        n0(null);
        this.E = 0;
        zhv zhvVar2 = ysrVar.p;
        zhvVar2.w = Reader.READ_DONE;
        zhvVar2.v = Reader.READ_DONE;
        zhvVar2.I = false;
        blt bltVar3 = ysrVar.q;
        if (bltVar3 != null) {
            bltVar3.w = Reader.READ_DONE;
            bltVar3.v = Reader.READ_DONE;
            bltVar3.G = blt.a.c;
        }
        if (wwxVar.c(8)) {
            sa80 sa80Var = this.H;
            this.H = null;
            this.G = false;
            etw<va80> etwVar = wgzVar.getSemanticsOwner().d;
            Object[] objArr = etwVar.a;
            int i3 = etwVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                ((va80) objArr[i4]).b(this, sa80Var);
            }
            wgzVar.A();
        }
    }

    public final void w(lc6 lc6Var, v6l v6lVar) throws Throwable {
        try {
            this.U.d.m1(lc6Var, v6lVar);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            k0(th);
            throw null;
        }
    }

    public final List<vhv> y() {
        blt bltVar = this.V.q;
        bltVar.getClass();
        duw<blt> duwVar = bltVar.I;
        ysr ysrVar = bltVar.f;
        ysrVar.a.A();
        if (!bltVar.J) {
            return duwVar.f();
        }
        tsr tsrVar = ysrVar.a;
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            if (duwVar.c <= i2) {
                blt bltVar2 = tsrVar2.V.q;
                bltVar2.getClass();
                duwVar.b(bltVar2);
            } else {
                blt bltVar3 = tsrVar2.V.q;
                bltVar3.getClass();
                blt[] bltVarArr = duwVar.a;
                blt bltVar4 = bltVarArr[i2];
                bltVarArr[i2] = bltVar3;
            }
        }
        duwVar.l(((duw.a) tsrVar.A()).a.c, duwVar.c);
        bltVar.J = false;
        return duwVar.f();
    }

    public final List<vhv> z() {
        return this.V.p.A0();
    }

    public tsr(int i) {
        this(xa80.a.addAndGet(1), (i & 1) == 0);
    }

    public tsr() {
        this(3);
    }
}
