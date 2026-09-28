package defpackage;

import android.os.SystemClock;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lf2r;", "Layq;", "b", "a", "d", "c", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f2r extends ayq {
    public final ai10 A;
    public final psm B;
    public final fjr C;
    public final icq D;
    public final rdd0 E;
    public final vdq F;
    public final j5u G;
    public final j7q H;
    public final drq I;
    public final odd J;
    public final v340 K;
    public final wwd0 L;
    public final wwd0 M;
    public final v340 N;
    public final wwd0 O;
    public final v340 P;
    public final wwd0 Q;
    public final ku90<Unit> R;
    public final ku90<Unit> S;
    public final wwd0 T;
    public final v340 U;
    public final wwd0 V;
    public final z2q W;
    public final ku90<String> X;
    public final wwd0 Y;
    public final v340 Z;
    public final b390 a0;
    public final wwd0 b0;
    public final v340 c0;
    public final wwd0 d0;
    public final v340 e0;
    public final wwd0 f0;
    public final v340 g0;
    public final wwd0 h0;
    public final t340 i0;
    public final wwd0 j0;
    public final wwd0 k0;
    public final v340 l0;
    public final ku90<r0r> m0;
    public jvd0 n0;
    public jvd0 o0;
    public final m9k v;
    public final th80 w;
    public final oh y;
    public final Map<atq, xsq> z;

    public static final class a {
        public final String a;
        public final qrd0 b;
        public final BigDecimal c;
        public final s2q d;
        public final s2q e;

        public a(String str, qrd0 qrd0Var, BigDecimal bigDecimal, s2q s2qVar, s2q s2qVar2) {
            str.getClass();
            bigDecimal.getClass();
            s2qVar.getClass();
            s2qVar2.getClass();
            this.a = str;
            this.b = qrd0Var;
            this.c = bigDecimal;
            this.d = s2qVar;
            this.e = s2qVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.g(this.a, aVar.a) || !Intrinsics.g(this.b, aVar.b)) {
                return false;
            }
            BigDecimal bigDecimal = aVar.c;
            rkd0.a aVar2 = rkd0.Companion;
            return Intrinsics.g(this.c, bigDecimal) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            qrd0 qrd0Var = this.b;
            int iHashCode2 = (iHashCode + (qrd0Var == null ? 0 : qrd0Var.hashCode())) * 31;
            rkd0.a aVar = rkd0.Companion;
            return this.e.hashCode() + ((this.d.hashCode() + dd3.a(this.c, iHashCode2, 31)) * 31);
        }

        public final String toString() {
            return "BetAmountInput(amountText=" + this.a + ", betError=" + this.b + ", aboutToPay=" + rkd0.a(this.c) + ", betPanelStakeWarningHint=" + this.d + ", betPanelTopWarningHint=" + this.e + ")";
        }
    }

    public static final class b {
        public final boolean a;
        public final BigDecimal b;
        public final hsq c;
        public final qxp d;
        public final boolean e;

        public b(boolean z, BigDecimal bigDecimal, hsq hsqVar, qxp qxpVar, boolean z2) {
            bigDecimal.getClass();
            hsqVar.getClass();
            qxpVar.getClass();
            this.a = z;
            this.b = bigDecimal;
            this.c = hsqVar;
            this.d = qxpVar;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a) {
                return false;
            }
            BigDecimal bigDecimal = bVar.b;
            rkd0.a aVar = rkd0.Companion;
            return Intrinsics.g(this.b, bigDecimal) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.a) * 31;
            rkd0.a aVar = rkd0.Companion;
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + dd3.a(this.b, iHashCode, 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = t160.a("BetPanelFlowInput(displayBetPanel=", ", balance=", rkd0.a(this.b), ", lottery=", this.a);
            sbA.append(this.c);
            sbA.append(", config=");
            sbA.append(this.d);
            sbA.append(", marketAllowBet=");
            return mq0.a(sbA, this.e, ")");
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$handleAction$7", f = "LNPlaceBetViewModel.kt", l = {994}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zxq c;

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$handleAction$7$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
            public final /* synthetic */ f2r a;
            public final /* synthetic */ zxq b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f2r f2rVar, zxq zxqVar, v1b<? super a> v1bVar) {
                super(1, v1bVar);
                this.a = f2rVar;
                this.b = zxqVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(v1b<?> v1bVar) {
                return new a(this.a, this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(v1b<? super Unit> v1bVar) {
                return ((a) create(v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                f2r f2rVar = this.a;
                j7q j7qVar = f2rVar.H;
                String str = f2rVar.b;
                boolean z = ((zxq.g0) this.b).a;
                j7qVar.getClass();
                str.getClass();
                j7qVar.f.a(new j7q.b(str, z));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(zxq zxqVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = zxqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return f2r.this.new e(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                f2r f2rVar = f2r.this;
                drq drqVar = f2rVar.I;
                a aVar = new a(f2rVar, this.c, null);
                this.a = 1;
                if (drqVar.a(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2r(vu60 vu60Var, n37 n37Var, m9k m9kVar, bfk bfkVar, th80 th80Var, oh ohVar, d150 d150Var, ai10 ai10Var, i6u i6uVar, iey ieyVar, psm psmVar, fjr fjrVar, icq icqVar, rdd0 rdd0Var, vdq vdqVar, j5u j5uVar, j7q j7qVar, drq drqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        super(vu60Var, oddVar);
        vu60Var.getClass();
        d150Var.getClass();
        i6uVar.getClass();
        psmVar.getClass();
        fjrVar.getClass();
        rdd0Var.getClass();
        vdqVar.getClass();
        j7qVar.getClass();
        drqVar.getClass();
        this.v = m9kVar;
        this.w = th80Var;
        this.y = ohVar;
        this.z = d150Var;
        this.A = ai10Var;
        this.B = psmVar;
        this.C = fjrVar;
        this.D = icqVar;
        this.E = rdd0Var;
        this.F = vdqVar;
        this.G = j5uVar;
        this.H = j7qVar;
        this.I = drqVar;
        this.J = oddVar;
        uwd0 uwd0VarX1 = x1(m9kVar.b(), new cvq());
        this.K = (v340) uwd0VarX1;
        uwd0 uwd0VarX2 = x1(new o3r(i6uVar.f.d), 0);
        wwd0 wwd0VarA = xwd0.a("");
        this.L = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(3);
        this.M = wwd0VarA2;
        String str = this.b;
        str.getClass();
        b8k b8kVar = (b8k) n37Var.a;
        uwd0 uwd0VarX3 = x1(new f1i(new ack(b8kVar.a(), str)), new erq(8191, 0L, 0L, null, null, null));
        this.N = (v340) uwd0VarX3;
        String str2 = this.b;
        str2.getClass();
        uwd0 uwd0VarX4 = x1(new s3r(new ack(b8kVar.a(), str2), this), new hsq(0));
        wwd0 wwd0VarA3 = xwd0.a(lk50.b.a);
        this.O = wwd0VarA3;
        uwd0 uwd0VarX5 = x1(new t3r(wwd0VarA3), new qxp());
        this.P = (v340) uwd0VarX5;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA4 = xwd0.a(bool);
        this.Q = wwd0VarA4;
        this.R = new ku90<>();
        this.S = new ku90<>();
        uwd0 uwd0VarX6 = x1(r0i.f(wwd0VarA4, new h3r(null, this)), v4r.a.a);
        wwd0 wwd0VarA5 = xwd0.a(null);
        this.T = wwd0VarA5;
        hey heyVar = new hey(bm50.f(ieyVar.a.h(pu0.b.a)));
        rkd0.Companion.getClass();
        BigDecimal bigDecimal = rkd0.b;
        uwd0 uwd0VarX7 = x1(heyVar, new rkd0(bigDecimal));
        k1i k1iVar = vdqVar.g;
        uwd0 uwd0VarX8 = x1(new p3r(new f1i(k1iVar)), new rkd0(bigDecimal));
        uwd0 uwd0VarX9 = x1(r1i.a(wwd0VarA, uwd0VarX8, k1iVar, new g2r(4, null)), new rkd0(bigDecimal));
        this.U = (v340) uwd0VarX9;
        uwd0 uwd0VarX10 = x1(r1i.a(k1iVar, wwd0VarA, uwd0VarX8, new n2r(4, null)), null);
        wwd0 wwd0VarA6 = xwd0.a(t2q.c.a);
        this.V = wwd0VarA6;
        this.W = new z2q();
        ku90<String> ku90Var = new ku90<>();
        this.X = ku90Var;
        lyh lyhVarC = ozh.c(new f1i(new n1i(uwd0VarX5, ku90Var, new f3r(3, null))), this.a);
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        t340 t340VarD = e1i.d(lyhVarC, et7VarD, kwd0Var, 1);
        wwd0 wwd0VarA7 = xwd0.a("");
        this.Y = wwd0VarA7;
        uwd0 uwd0VarX11 = x1(new n1i(t340VarD, wwd0VarA7, new g3r(3, null)), null);
        this.Z = (v340) uwd0VarX11;
        this.a0 = d390.a(1, 1, pb5.b);
        zq8 zq8Var = new zq8(1);
        y8h0.d(2, zq8Var);
        tv60 tv60Var = uzh.a;
        jte jteVarC = uzh.c(t340VarD, tv60Var, zq8Var);
        v1r v1rVar = new v1r();
        y8h0.d(2, v1rVar);
        uwd0 uwd0VarX12 = x1(new q3r(r0i.f(new f1i(r1i.a(uwd0VarX5, jteVarC, uzh.c(uwd0VarX11, tv60Var, v1rVar), new b3r(4, null))), new i3r(null, this))), new xsq.a(0));
        wwd0 wwd0VarA8 = xwd0.a(null);
        this.b0 = wwd0VarA8;
        uwd0 uwd0VarX13 = x1(r0i.f(uwd0VarX12, new j3r(null, this)), bool);
        uwd0 uwd0VarX14 = x1(r0i.f(uwd0VarX12, new k3r(3, null)), bool);
        uwd0 uwd0VarX15 = x1(r0i.f(uwd0VarX12, new l3r(3, null)), new dqh0.c(0));
        this.c0 = (v340) uwd0VarX15;
        wwd0 wwd0VarA9 = xwd0.a(new lk50.c(Unit.a));
        this.d0 = wwd0VarA9;
        uwd0 uwd0VarX16 = x1(r1i.c(ku90Var, uwd0VarX5, uwd0VarX11, wwd0VarA9, x1(new n1i(uwd0VarX2, wwd0VarA5, new x2r(3, null)), bool), new i2r(null)), ovp.c);
        b77 b77VarF = r0i.f(new r3r(uzh.b(t340VarD), this), new m3r(3, null));
        n1a0 n1a0Var = n1a0.c;
        uwd0 uwd0VarX17 = x1(b77VarF, n1a0Var);
        uwd0 uwd0VarX18 = x1(new n1i(wwd0VarA8, uwd0VarX17, new z2r(3, null)), e0q.b.a);
        uwd0 uwd0VarX19 = x1(r1i.b(uwd0VarX5, wwd0VarA, uwd0VarX7, uwd0VarX9, new l2r(null, this)), null);
        this.e0 = (v340) uwd0VarX19;
        wwd0 wwd0VarA10 = xwd0.a(bool);
        this.f0 = wwd0VarA10;
        uwd0 uwd0VarX20 = x1(r0i.f(wwd0VarA10, new n3r(null, this)), y5q.a.a);
        uwd0 uwd0VarX21 = x1(r1i.a(uwd0VarX1, wwd0VarA2, uwd0VarX19, new y2r(4, null)), new tsd0(0));
        uwd0 uwd0VarX22 = x1(r1i.c(uwd0VarX13, uwd0VarX7, uwd0VarX4, uwd0VarX5, uwd0VarX14, new m2r(null)), new b(false, bigDecimal, new hsq(0), new qxp(), false));
        n1i n1iVar = new n1i(uwd0VarX19, uwd0VarX5, new o2r(3, null));
        s2q.a aVar = s2q.a.a;
        uwd0 uwd0VarX23 = x1(n1iVar, aVar);
        uwd0 uwd0VarX24 = x1(new n1i(uwd0VarX11, uwd0VarX15, new s2r(3, null)), null);
        this.g0 = (v340) uwd0VarX24;
        uwd0 uwd0VarX25 = x1(r1i.c(uwd0VarX22, wwd0VarA6, uwd0VarX21, x1(r1i.c(uwd0VarX15, uwd0VarX11, uwd0VarX24, uwd0VarX10, uwd0VarX16, new t2r(null)), new c(0)), x1(r1i.c(uwd0VarX9, wwd0VarA, uwd0VarX19, uwd0VarX23, x1(r1i.b(wwd0VarA, uwd0VarX23, uwd0VarX5, uwd0VarX24, new q2r(null, this)), aVar), new k2r(null)), new a("", null, bigDecimal, aVar, aVar)), new p2r(null, this)), new m2q(0));
        wwd0 wwd0VarA11 = xwd0.a(bool);
        this.h0 = wwd0VarA11;
        uwd0 uwd0VarX26 = x1(r1i.b(wwd0VarA3, uwd0VarX4, x1(new n1i(uwd0VarX5, t340VarD, new w2r(3, null)), n1a0Var), uwd0VarX17, new r2r(5, null)), k0r.b.a);
        uwd0 uwd0VarX27 = x1(r1i.a(uwd0VarX6, uwd0VarX20, uwd0VarX18, new c3r(4, null)), new d(0));
        String str3 = this.b;
        str3.getClass();
        t340 t340VarD2 = e1i.d(ozh.c(r0i.f(bfkVar.a.f.d, new yek(null, bfkVar, str3)), this.a), o8i0.d(this), kwd0Var, 1);
        this.i0 = t340VarD2;
        wwd0 wwd0VarA12 = xwd0.a(bool);
        this.j0 = wwd0VarA12;
        this.k0 = xwd0.a(bool);
        this.l0 = (v340) x1(new n1i(r1i.c(uwd0VarX3, uwd0VarX26, uwd0VarX25, uwd0VarX27, wwd0VarA11, new u3r(null)), wwd0VarA12, new v3r(3, null)), new t1r((String) null, (k0r) null, (m2q) null, false, (v4r) null, (y5q) null, (e0q) null, 255));
        this.m0 = new ku90<>();
        djr.a(rdd0Var, new cjr.z(this.c, this.d, this.e));
        ej5.c(o8i0.d(this), oddVar, null, new w1r(null, this), 2);
        ej5.c(o8i0.d(this), null, null, new x1r(null, this), 3);
        ej5.c(o8i0.d(this), null, null, new y1r(null, this), 3);
        ej5.c(o8i0.d(this), null, null, new a2r(null, this), 3);
        ej5.c(o8i0.d(this), null, null, new b2r(null, this), 3);
        kzh.d(ozh.c(new g1i(t340VarD2, new c2r(null, this)), oddVar), o8i0.d(this));
        ej5.c(o8i0.d(this), oddVar, null, new d2r(null, this), 2);
        ej5.c(o8i0.d(this), oddVar, null, new e2r(null, this), 2);
    }

    public static BigDecimal y1(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = new rkd0(new BigDecimal(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        rkd0 rkd0Var = (rkd0) bVar;
        BigDecimal bigDecimal = rkd0Var != null ? rkd0Var.a : null;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        rkd0.Companion.getClass();
        return rkd0.b;
    }

    public final void z1(zxq zxqVar) {
        Object bVar;
        tsq next;
        qcn<ssq> qcnVar;
        Object value;
        t2q t2qVar;
        Object value2;
        String str;
        Object bVar2;
        Object value3;
        String str2;
        Object value4;
        String strE;
        if (zxqVar instanceof zxq.f) {
            boolean z = ((zxq.f) zxqVar).a;
            z2q z2qVar = this.W;
            if (z) {
                z2qVar.a.a(Boolean.TRUE);
                return;
            } else {
                z2qVar.a.a(Boolean.FALSE);
                return;
            }
        }
        boolean zEquals = zxqVar.equals(zxq.k.a);
        wwd0 wwd0Var = this.L;
        ssq ssqVar = null;
        if (zEquals) {
            wwd0Var.getClass();
            wwd0Var.k(null, "");
            return;
        }
        if (zxqVar.equals(zxq.o.a)) {
            do {
                value4 = wwd0Var.getValue();
                strE = (String) value4;
                if (strE.length() > 0) {
                    strE = wae0.E(strE);
                }
            } while (!wwd0Var.g(value4, strE));
            return;
        }
        boolean z2 = zxqVar instanceof zxq.q;
        odd oddVar = this.J;
        if (z2) {
            int i = ((zxq.q) zxqVar).a;
            wwd0 wwd0Var2 = this.M;
            if (i != 2) {
                kd2.a(i, wwd0Var2, null);
                return;
            }
            jvd0 jvd0Var = this.o0;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            BigDecimal bigDecimalY1 = y1((String) wwd0Var.getValue());
            th80 th80Var = this.w;
            th80Var.getClass();
            bigDecimalY1.getClass();
            this.o0 = kzh.d(bm50.a(ozh.c(new or60(new sh80(th80Var, bigDecimalY1, null)), oddVar)), o8i0.d(this));
            kd2.a(3, wwd0Var2, null);
            return;
        }
        boolean z3 = zxqVar instanceof zxq.r;
        v340 v340Var = this.e0;
        if (z3) {
            do {
                value3 = wwd0Var.getValue();
                str2 = (String) value3;
                String strA = srd0.a(str2, ((zxq.r) zxqVar).a);
                if (!(((qrd0) v340Var.a.getValue()) instanceof qrd0.c)) {
                    str2 = strA;
                }
            } while (!wwd0Var.g(value3, str2));
            return;
        }
        if (zxqVar instanceof zxq.s) {
            do {
                value2 = wwd0Var.getValue();
                str = (String) value2;
                try {
                    zi50.a aVar = zi50.b;
                    bVar2 = new rkd0(new BigDecimal(str));
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar2 = new zi50.b(th);
                }
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                rkd0 rkd0Var = (rkd0) bVar2;
                BigDecimal bigDecimal = rkd0Var != null ? rkd0Var.a : null;
                if (bigDecimal == null) {
                    rkd0.Companion.getClass();
                    bigDecimal = rkd0.b;
                }
                BigDecimal bigDecimalAdd = bigDecimal.add(((zxq.s) zxqVar).a);
                bigDecimalAdd.getClass();
                rkd0.a aVar3 = rkd0.Companion;
                String strA2 = ukd0.a(2, bigDecimalAdd, false, false);
                if (!(((qrd0) v340Var.a.getValue()) instanceof qrd0.c)) {
                    str = strA2;
                }
            } while (!wwd0Var.g(value2, str));
            return;
        }
        boolean z4 = zxqVar instanceof zxq.e;
        ku90<r0r> ku90Var = this.m0;
        if (z4) {
            ku90Var.a(new r0r.b(((zxq.e) zxqVar).a));
            return;
        }
        boolean zEquals2 = zxqVar.equals(zxq.a0.a);
        psm psmVar = this.B;
        wwd0 wwd0Var3 = this.V;
        if (zEquals2) {
            t2q.a aVar4 = new t2q.a(oxc.a(psmVar.B(), " ", ukd0.a(2, ((rkd0) this.U.a.getValue()).a, true, true)));
            wwd0Var3.getClass();
            wwd0Var3.k(null, aVar4);
            return;
        }
        if (zxqVar.equals(zxq.p.a)) {
            do {
                value = wwd0Var3.getValue();
                t2qVar = (t2q) value;
                if (!Intrinsics.g(t2qVar, t2q.e.a)) {
                    t2q.c cVar = t2q.c.a;
                    if (!Intrinsics.g(t2qVar, cVar) && !(t2qVar instanceof t2q.a) && !(t2qVar instanceof t2q.d)) {
                        uhc.a();
                        return;
                    }
                    t2qVar = cVar;
                }
            } while (!wwd0Var3.g(value, t2qVar));
            return;
        }
        boolean zEquals3 = zxqVar.equals(zxq.n.a);
        v340 v340Var2 = this.N;
        wwd0 wwd0Var4 = this.Y;
        v340 v340Var3 = this.c0;
        rdd0 rdd0Var = this.E;
        if (zEquals3) {
            jvd0 jvd0Var2 = this.n0;
            if (jvd0Var2 == null || !jvd0Var2.isActive()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String str3 = (String) wwd0Var4.getValue();
                ssq ssqVar2 = (ssq) this.Z.a.getValue();
                this.n0 = kzh.d(ozh.c(new g1i(this.A.a(str3, ssqVar2 != null ? ssqVar2.f : null, (erq) v340Var2.a.getValue(), (yxq) this.g0.a.getValue(), (dqh0) v340Var3.a.getValue(), (String) wwd0Var.getValue(), psmVar.B()), new j2r(this, jElapsedRealtime, null)), oddVar), o8i0.d(this));
            }
            djr.a(rdd0Var, cjr.b.a);
            return;
        }
        if (zxqVar.equals(zxq.t.a)) {
            ku90Var.a(r0r.a.a);
            return;
        }
        if (zxqVar.equals(zxq.c.a)) {
            ku90Var.a(new r0r.b(new nvp.f(3, (uf00) null)));
            return;
        }
        if (zxqVar instanceof zxq.u) {
            wwd0Var3.setValue(t2q.c.a);
            ku90Var.a(new r0r.b(new nvp.c(new h8r(((zxq.u) zxqVar).a, true))));
            return;
        }
        if (zxqVar.equals(zxq.y.a)) {
            ku90Var.a(new r0r.b(new nvp.c(g8r.INSTANCE)));
            return;
        }
        if (zxqVar.equals(zxq.d0.a)) {
            ku90Var.a(new r0r.b(new nvp.g(jq40.a(i8r.class))));
            return;
        }
        if (zxqVar instanceof zxq.w) {
            boolean z5 = ((zxq.w) zxqVar).a;
            osa0.a(z5, this.Q, null);
            if (z5) {
                djr.a(rdd0Var, cjr.a0.a);
                return;
            }
            return;
        }
        boolean z6 = zxqVar instanceof zxq.e0;
        b390 b390Var = this.a0;
        if (z6) {
            b390Var.h();
            this.X.a(((zxq.e0) zxqVar).a);
            return;
        }
        boolean z7 = zxqVar instanceof zxq.z;
        wwd0 wwd0Var5 = this.b0;
        if (z7) {
            wwd0Var5.setValue(((zxq.z) zxqVar).a);
            djr.a(rdd0Var, cjr.d.a);
            return;
        }
        if (zxqVar.equals(zxq.d.a)) {
            wwd0Var5.setValue(null);
            return;
        }
        if (zxqVar.equals(zxq.b0.a)) {
            this.S.a(Unit.a);
            return;
        }
        if (zxqVar.equals(zxq.c0.a)) {
            this.R.a(Unit.a);
            return;
        }
        if (zxqVar instanceof zxq.v) {
            osa0.a(((zxq.v) zxqVar).a, this.f0, null);
            return;
        }
        boolean zEquals4 = zxqVar.equals(zxq.g.a);
        wwd0 wwd0Var6 = this.j0;
        if (zEquals4) {
            Boolean bool = Boolean.FALSE;
            wwd0Var6.getClass();
            wwd0Var6.k(null, bool);
            return;
        }
        if (zxqVar instanceof zxq.j0) {
            boolean z8 = ((zxq.j0) zxqVar).a;
            osa0.a(z8, this.k0, null);
            if (z8) {
                Boolean bool2 = Boolean.FALSE;
                wwd0Var6.getClass();
                wwd0Var6.k(null, bool2);
                return;
            }
            return;
        }
        if (zxqVar instanceof zxq.h) {
            zxq.h hVar = (zxq.h) zxqVar;
            if (hVar instanceof zxq.i) {
                wwd0Var4.setValue(((zxq.i) zxqVar).getMarketId());
            } else if (!(hVar instanceof zxq.j)) {
                uhc.a();
                return;
            }
            b390Var.a(zxqVar);
            return;
        }
        if (zxqVar instanceof zxq.h0) {
            this.F.d.k(null, Boolean.valueOf(((zxq.h0) zxqVar).a));
            return;
        }
        if (zxqVar.equals(zxq.x.a)) {
            ku90Var.a(new r0r.b(new nvp.c(new y0r((String) wwd0Var.getValue()))));
            return;
        }
        if (zxqVar instanceof zxq.l) {
            djr.a(rdd0Var, cjr.l.a);
            zxq.l lVar = (zxq.l) zxqVar;
            ku90Var.a(new r0r.b(new nvp.c(new com.sportybet.feature.luckynumber.placebet.presentation.a(lVar.a, lVar.b))));
            return;
        }
        if (zxqVar instanceof zxq.f0) {
            this.O.setValue(((zxq.f0) zxqVar).a);
            return;
        }
        boolean z9 = zxqVar instanceof zxq.m;
        String str4 = this.b;
        if (z9) {
            djr.a(rdd0Var, cjr.x.a);
            ku90Var.a(new r0r.b(new nvp.c(new g1r(str4, !u1r.a((dqh0) v340Var3.a.getValue())))));
            return;
        }
        boolean z10 = zxqVar instanceof zxq.b;
        v340 v340Var4 = this.P;
        if (!z10) {
            if (zxqVar instanceof zxq.g0) {
                ej5.c(o8i0.d(this), oddVar, null, new e(zxqVar, null), 2);
                return;
            }
            boolean z11 = zxqVar instanceof zxq.i0;
            wwd0 wwd0Var7 = this.T;
            if (z11) {
                dvq dvqVar = ((zxq.i0) zxqVar).a;
                wwd0Var7.getClass();
                wwd0Var7.k(null, dvqVar);
                return;
            } else {
                if (!(zxqVar instanceof zxq.a)) {
                    uhc.a();
                    return;
                }
                djr.a(rdd0Var, cjr.w.a);
                String strA3 = fvq.a((dvq) wwd0Var7.getValue(), ((erq) v340Var2.a.getValue()).b);
                qcn<kxq.e> qcnVarB = ((dqh0) v340Var3.a.getValue()).b();
                ArrayList arrayList = new ArrayList(l48.r(qcnVarB, 10));
                Iterator<kxq.e> it = qcnVarB.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(it.next().a));
                }
                kzh.d(ozh.c(new g1i(this.y.a(str4, strA3, a4h.f(arrayList), ((qxp) v340Var4.a.getValue()).a), new h2r(null, this)), oddVar), o8i0.d(this));
                return;
            }
        }
        try {
            zi50.a aVar5 = zi50.b;
            List listSplit$default = StringsKt__StringsKt.split$default(((zxq.b) zxqVar).a, new String[]{","}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(l48.r(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
            }
            bVar = a4h.f(arrayList2);
        } catch (Throwable th2) {
            zi50.a aVar6 = zi50.b;
            bVar = new zi50.b(th2);
        }
        zi50.a aVar7 = zi50.b;
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        uf00 uf00Var = (uf00) bVar;
        if (uf00Var != null) {
            qcn<tsq> qcnVar2 = ((qxp) v340Var4.a.getValue()).a;
            qcnVar2.getClass();
            Iterator<tsq> it3 = qcnVar2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!"standard".equals(next.a));
            tsq tsqVar = next;
            if (tsqVar != null && (qcnVar = tsqVar.c) != null) {
                for (ssq ssqVar3 : qcnVar) {
                    if (ssqVar3.d == atq.SNM) {
                        ssqVar = ssqVar3;
                        break;
                    }
                }
                ssqVar = ssqVar;
            }
            if (ssqVar == null) {
                return;
            }
            z1(new zxq.e0("standard"));
            z1(new ip60.b(ssqVar.a, uf00Var));
        }
    }

    public static final class d {
        public final v4r a;
        public final y5q b;
        public final e0q c;

        public d(v4r v4rVar, y5q y5qVar, e0q e0qVar) {
            v4rVar.getClass();
            y5qVar.getClass();
            e0qVar.getClass();
            this.a = v4rVar;
            this.b = y5qVar;
            this.c = e0qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "OverlayState(recentDraw=" + this.a + ", drawInfoState=" + this.b + ", mainDrawDialogState=" + this.c + ")";
        }

        public d() {
            this(0);
        }

        public /* synthetic */ d(int i) {
            this(v4r.a.a, y5q.a.a, e0q.b.a);
        }
    }

    public static final class c {
        public final yxq a;
        public final ssq b;
        public final dqh0 c;
        public final g0q d;
        public final ovp e;

        public c(yxq yxqVar, ssq ssqVar, dqh0 dqh0Var, g0q g0qVar, ovp ovpVar) {
            dqh0Var.getClass();
            ovpVar.getClass();
            this.a = yxqVar;
            this.b = ssqVar;
            this.c = dqh0Var;
            this.d = g0qVar;
            this.e = ovpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            yxq yxqVar = this.a;
            int iHashCode = (yxqVar == null ? 0 : yxqVar.hashCode()) * 31;
            ssq ssqVar = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (ssqVar == null ? 0 : ssqVar.hashCode())) * 31)) * 31;
            g0q g0qVar = this.d;
            return this.e.hashCode() + ((iHashCode2 + (g0qVar != null ? g0qVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "CurrentState(currentOutcome=" + this.a + ", currentMarket=" + this.b + ", userSelectState=" + this.c + ", gift=" + this.d + ", myNumberState=" + this.e + ")";
        }

        public c() {
            this(0);
        }

        public /* synthetic */ c(int i) {
            this(null, null, new dqh0.c(0), null, ovp.c);
        }
    }
}
