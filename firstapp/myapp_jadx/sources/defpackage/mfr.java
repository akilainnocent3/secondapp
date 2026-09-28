package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lmfr;", "Layq;", "d", "c", "e", "b", "a", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mfr extends ayq {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final wwd0 D;
    public final wwd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final wwd0 K;
    public final wwd0 L;
    public final wwd0 M;
    public final wwd0 N;
    public int O;
    public jvd0 P;
    public jvd0 Q;
    public int R;
    public String S;
    public String T;
    public final wwd0 U;
    public final v340 V;
    public final pfr W;
    public final v340 X;
    public final lyh<b5q> Y;
    public final v340 Z;
    public final v340 a0;
    public final v340 b0;
    public final Context v;
    public final wek w;
    public final q3k y;
    public final rdd0 z;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final UiText d;
        public final khr e;

        public a(boolean z, boolean z2, boolean z3, UiText uiText, khr khrVar) {
            uiText.getClass();
            khrVar.getClass();
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = uiText;
            this.e = khrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + yvf.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = cwz.a("PlayerDisplayState(isFullScreen=", ", isMuted=", ", isExpend=", this.a, this.b);
            sbA.append(this.c);
            sbA.append(", title=");
            sbA.append(this.d);
            sbA.append(LxHElgWAiSeM.YNLtqNGU);
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class d {
        public final String a;
        public final lk50<ser> b;

        public d(lk50 lk50Var, String str) {
            str.getClass();
            lk50Var.getClass();
            this.a = str;
            this.b = lk50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StreamInfoResult(streamId=" + this.a + ", result=" + this.b + ")";
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$scheduleAutoRetry$1", f = "LNStreamPlayerViewModel.kt", l = {572}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.c = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mfr.this.new f(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            mfr mfrVar = mfr.this;
            if (((Boolean) mfrVar.I.getValue()).booleanValue() && mfrVar.V.a.getValue() != null) {
                this.c.invoke();
                return Unit.a;
            }
            wwd0 wwd0Var = mfrVar.J;
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfr(vu60 vu60Var, Context context, i6u i6uVar, wek wekVar, q3k q3kVar, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        super(vu60Var, oddVar);
        vu60Var.getClass();
        i6uVar.getClass();
        rdd0Var.getClass();
        this.v = context;
        this.w = wekVar;
        this.y = q3kVar;
        this.z = rdd0Var;
        wwd0 wwd0VarA = xwd0.a(null);
        this.A = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.B = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(0);
        this.C = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.D = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(new b(15));
        this.E = wwd0VarA5;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA6 = xwd0.a(bool);
        this.F = wwd0VarA6;
        Boolean bool2 = Boolean.TRUE;
        wwd0 wwd0VarA7 = xwd0.a(bool2);
        this.G = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(bool2);
        this.H = wwd0VarA8;
        this.I = xwd0.a(bool);
        wwd0 wwd0VarA9 = xwd0.a(bool);
        this.J = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(bool);
        this.K = wwd0VarA10;
        wwd0 wwd0VarA11 = xwd0.a(bool);
        this.L = wwd0VarA11;
        wwd0 wwd0VarA12 = xwd0.a(0);
        this.M = wwd0VarA12;
        wwd0 wwd0VarA13 = xwd0.a(igr.a);
        this.N = wwd0VarA13;
        this.U = xwd0.a(bool);
        uwd0 uwd0VarX1 = x1(uzh.b(new vfr(wwd0VarA)), null);
        this.V = (v340) uwd0VarX1;
        this.W = new pfr(this);
        uwd0 uwd0VarX2 = x1(r0i.f(new n1i(uwd0VarX1, wwd0VarA3, new zfr(3, null)), new rfr(null, this)), null);
        this.X = (v340) uwd0VarX2;
        lyh<b5q> lyhVarB = uzh.b(new wfr(i6uVar.k.d, this));
        this.Y = lyhVarB;
        lyh lyhVarB2 = uzh.b(r0i.f(new h1i(new c(null, null), lyhVarB, new xfr(3, null)), new sfr(null, this)));
        lk50.b bVar = lk50.b.a;
        uwd0 uwd0VarX3 = x1(lyhVarB2, bVar);
        this.Z = (v340) uwd0VarX3;
        b77 b77VarF = r0i.f(wwd0VarA, new tfr(null, this));
        uwd0 uwd0VarX4 = x1(r0i.f(uwd0VarX3, new ufr(null, this)), bVar);
        this.a0 = (v340) uwd0VarX4;
        m1i m1iVarC = r1i.c(uwd0VarX4, wwd0VarA12, wwd0VarA13, wwd0VarA10, wwd0VarA11, new dgr(null, this));
        khr.d dVar = khr.d.a;
        m1i m1iVarC2 = r1i.c(wwd0VarA6, wwd0VarA7, wwd0VarA8, b77VarF, x1(m1iVarC, dVar), new nfr(null));
        StringUiText stringUiText = vch0.a;
        this.b0 = (v340) x1(r1i.c(new n1i(wwd0VarA, wwd0VarA2, new bgr(3, null)), wwd0VarA4, uwd0VarX2, wwd0VarA5, new n1i(x1(m1iVarC2, new a(false, false, true, new ResourceUiText(R.string.page_lucky_numbers__streaming_hint_current_draw, ay0.S(new Object[]{""})), dVar)), wwd0VarA9, new ofr(3, null)), new egr(null, this)), null);
        ej5.c(o8i0.d(this), null, null, new ifr(null, this), 3);
        ej5.c(o8i0.d(this), null, null, new jfr(null, this), 3);
        ej5.c(o8i0.d(this), null, null, new kfr(null, this), 3);
        ej5.c(o8i0.d(this), null, null, new lfr(null, this), 3);
    }

    public final boolean A1() {
        return !(((fgr) this.A.getValue()) instanceof fgr.b) || Intrinsics.g(this.B.getValue(), Boolean.TRUE);
    }

    public final void B1() {
        M1();
        this.S = null;
        ier ierVar = (ier) this.D.getValue();
        if (ierVar != null) {
            androidx.media3.exoplayer.d dVar = ierVar.a;
            dVar.n(false);
            dVar.M0();
            dVar.i();
        }
        b bVar = new b(15);
        wwd0 wwd0Var = this.E;
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
    }

    public final ser C1() {
        d dVar;
        lk50<ser> lk50Var;
        String str = (String) this.V.a.getValue();
        if (str != null && (dVar = (d) this.X.a.getValue()) != null) {
            if (!Intrinsics.g(dVar.a, str)) {
                dVar = null;
            }
            if (dVar != null && (lk50Var = dVar.b) != null) {
                return (ser) bm50.i(lk50Var);
            }
        }
        return null;
    }

    public final ExoPlayer D1() {
        wwd0 wwd0Var = this.D;
        ier ierVar = (ier) wwd0Var.getValue();
        if (ierVar != null) {
            return ierVar.a;
        }
        androidx.media3.exoplayer.d dVarA = new ExoPlayer.b(this.v).a();
        dVarA.D(this.W);
        dVarA.n(z1());
        dVarA.L(((Boolean) this.G.getValue()).booleanValue() ? 0.0f : 1.0f);
        ier ierVar2 = new ier(dVarA);
        wwd0Var.getClass();
        wwd0Var.k(null, ierVar2);
        b bVar = new b(14);
        wwd0 wwd0Var2 = this.E;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bVar);
        return dVarA;
    }

    public final void E1(ler lerVar) {
        Object value;
        wwd0 wwd0Var;
        Object value2;
        wwd0 wwd0Var2;
        Object value3;
        wwd0 wwd0Var3;
        Object value4;
        if (lerVar instanceof ler.i) {
            fgr fgrVar = ((ler.i) lerVar).a;
            wwd0 wwd0Var4 = this.B;
            if (wwd0Var4.getValue() == null && !(fgrVar instanceof fgr.a)) {
                boolean z = fgrVar instanceof fgr.c;
                wwd0Var4.k(null, Boolean.valueOf(z));
                if (!z) {
                    O1(false);
                }
            }
            this.A.setValue(fgrVar);
            if (fgrVar instanceof fgr.b) {
                B1();
                return;
            } else if (Intrinsics.g(fgrVar, fgr.a.a)) {
                L1();
                return;
            } else {
                if (fgrVar instanceof fgr.c) {
                    return;
                }
                uhc.a();
                return;
            }
        }
        if (lerVar.equals(ler.d.a)) {
            I1();
            return;
        }
        boolean zEquals = lerVar.equals(ler.c.a);
        wwd0 wwd0Var5 = this.I;
        if (zEquals) {
            Boolean bool = Boolean.FALSE;
            wwd0Var5.getClass();
            wwd0Var5.k(null, bool);
            H1();
            return;
        }
        if (lerVar.equals(ler.f.a)) {
            if (this.V.a.getValue() == null) {
                return;
            }
            M1();
            Boolean bool2 = Boolean.TRUE;
            wwd0Var5.getClass();
            wwd0Var5.k(null, bool2);
            if (!z1()) {
                H1();
                return;
            }
            do {
                wwd0Var2 = this.E;
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, b.a((b) value3, 2, false, false, null, 8)));
            String str = this.S;
            if (str != null) {
                K1(str, true);
            }
            do {
                wwd0Var3 = this.C;
                value4 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value4, Integer.valueOf(((Number) value4).intValue() + 1)));
            return;
        }
        if (lerVar.equals(ler.n.a)) {
            do {
                wwd0Var = this.G;
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, Boolean.valueOf(!((Boolean) value2).booleanValue())));
            return;
        }
        if (lerVar.equals(ler.l.a)) {
            if (A1()) {
                O1(!((Boolean) this.H.getValue()).booleanValue());
                return;
            }
            return;
        }
        if (lerVar instanceof ler.g) {
            O1(true);
            return;
        }
        if (lerVar instanceof ler.j) {
            boolean z2 = ((ler.j) lerVar).a;
            int i = this.R;
            if (!z2) {
                int i2 = i - 1;
                int i3 = i2 >= 0 ? i2 : 0;
                this.R = i3;
                if (i3 == 0) {
                    jvd0 jvd0Var = this.Q;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    this.Q = ej5.c(o8i0.d(this), null, null, new qfr(null, this), 3);
                    return;
                }
                return;
            }
            this.R = i + 1;
            Boolean bool3 = Boolean.TRUE;
            wwd0 wwd0Var6 = this.U;
            wwd0Var6.getClass();
            wwd0Var6.k(null, bool3);
            jvd0 jvd0Var2 = this.Q;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
            this.Q = null;
            J1();
            return;
        }
        boolean zEquals2 = lerVar.equals(ler.m.a);
        wwd0 wwd0Var7 = this.F;
        if (zEquals2) {
            do {
                value = wwd0Var7.getValue();
            } while (!wwd0Var7.g(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
            return;
        }
        if (lerVar.equals(ler.e.a)) {
            G1(-1);
            return;
        }
        if (lerVar.equals(ler.b.a)) {
            G1(1);
            return;
        }
        boolean zEquals3 = lerVar.equals(ler.a.a);
        wwd0 wwd0Var8 = this.K;
        if (zEquals3) {
            Boolean bool4 = Boolean.FALSE;
            wwd0Var8.getClass();
            wwd0Var8.k(null, bool4);
        } else {
            if (lerVar.equals(ler.k.a)) {
                djr.a(this.z, cjr.p.a);
                Boolean bool5 = Boolean.TRUE;
                wwd0Var8.getClass();
                wwd0Var8.k(null, bool5);
                return;
            }
            if (!(lerVar instanceof ler.h)) {
                uhc.a();
                return;
            }
            Boolean bool6 = Boolean.FALSE;
            wwd0Var7.getClass();
            wwd0Var7.k(null, bool6);
        }
    }

    public final void F1() {
        wwd0 wwd0Var;
        Object value;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var2 = this.J;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
        do {
            wwd0Var = this.E;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, b.a((b) value, 1, false, true, null, 8)));
    }

    public final void G1(int i) {
        List list = (List) bm50.i((lk50) this.a0.a.getValue());
        if (list == null) {
            list = m2g.a;
        }
        int iJ = kotlin.collections.b.j(list);
        if (iJ < 0) {
            return;
        }
        wwd0 wwd0Var = this.M;
        int iE = kotlin.ranges.f.e(((Number) wwd0Var.getValue()).intValue(), 0, iJ);
        int iE2 = kotlin.ranges.f.e(iE + i, 0, iJ);
        if (iE2 == iE) {
            return;
        }
        igr igrVar = i > 0 ? igr.c : igr.b;
        wwd0 wwd0Var2 = this.N;
        wwd0Var2.getClass();
        wwd0Var2.k(null, igrVar);
        Integer numValueOf = Integer.valueOf(iE2);
        wwd0Var.getClass();
        wwd0Var.k(null, numValueOf);
    }

    public final void H1() {
        wwd0 wwd0Var;
        Object value;
        M1();
        ier ierVar = (ier) this.D.getValue();
        if (ierVar != null) {
            ierVar.a.a();
        }
        do {
            wwd0Var = this.E;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, b.a((b) value, 0, false, false, null, 13)));
    }

    public final void I1() {
        wwd0 wwd0Var;
        Object value;
        Boolean bool = Boolean.TRUE;
        wwd0 wwd0Var2 = this.I;
        wwd0Var2.getClass();
        String str = null;
        wwd0Var2.k(null, bool);
        ier ierVar = (ier) this.D.getValue();
        if (ierVar != null) {
            androidx.media3.exoplayer.d dVar = ierVar.a;
            String str2 = this.S;
            if (str2 == null) {
                ser serVarC1 = C1();
                if (serVarC1 != null) {
                    str = serVarC1.a;
                }
            } else {
                str = str2;
            }
            do {
                wwd0Var = this.E;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.a((b) value, 0, false, false, null, 11)));
            if (!z1()) {
                dVar.n(false);
                return;
            }
            if (dVar.P() != 1 && dVar.P() != 4) {
                dVar.j();
                dVar.T();
            } else if (str != null) {
                K1(str, true);
            }
        }
    }

    public final void J1() {
        String str = this.T;
        if (str != null && str.equals(this.V.a.getValue()) && ((Boolean) this.U.getValue()).booleanValue() && y1()) {
            this.T = null;
            I1();
        }
    }

    public final void K1(String str, boolean z) {
        wwd0 wwd0Var;
        Object value;
        Object objD1 = D1();
        if (z || !Intrinsics.g(this.S, str) || ((i42) objD1).g0() == null) {
            this.S = str;
            androidx.media3.exoplayer.d dVar = (androidx.media3.exoplayer.d) objD1;
            dVar.n(z1());
            do {
                wwd0Var = this.E;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, b.a((b) value, 2, false, false, null, 8)));
            ((i42) objD1).p0(njv.b(str));
            dVar.d();
        }
    }

    public final void L1() {
        M1();
        wwd0 wwd0Var = this.D;
        ier ierVar = (ier) wwd0Var.getValue();
        if (ierVar != null) {
            androidx.media3.exoplayer.d dVar = ierVar.a;
            dVar.W(this.W);
            dVar.release();
        }
        wwd0Var.setValue(null);
        this.S = null;
        b bVar = new b(15);
        wwd0 wwd0Var2 = this.E;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bVar);
    }

    public final void M1() {
        jvd0 jvd0Var = this.P;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.P = null;
        this.O = 0;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var = this.J;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    public final boolean N1(Function0<Unit> function0) {
        int i;
        if (!z1() || this.V.a.getValue() == null || (i = this.O) >= 5) {
            return false;
        }
        this.O = i + 1;
        Boolean bool = Boolean.TRUE;
        wwd0 wwd0Var = this.J;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        jvd0 jvd0Var = this.P;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.P = ej5.c(o8i0.d(this), null, null, new f(function0, null), 3);
        return true;
    }

    public final void O1(boolean z) {
        if (A1()) {
            osa0.a(z, this.H, null);
            if (!z) {
                Boolean bool = Boolean.FALSE;
                wwd0 wwd0Var = this.I;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                H1();
                return;
            }
            boolean z2 = this.T != null;
            J1();
            if (!z2 && this.V.a.getValue() != null && z1()) {
                I1();
            } else if (this.A.getValue() instanceof fgr.b) {
                D1();
                B1();
            }
        }
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        L1();
        super.onCleared();
    }

    public final boolean y1() {
        return ((Boolean) this.H.getValue()).booleanValue() || ((Boolean) this.F.getValue()).booleanValue();
    }

    public final boolean z1() {
        return ((Boolean) this.I.getValue()).booleanValue() && ((Boolean) this.U.getValue()).booleanValue() && y1();
    }

    public static final class c {
        public final b5q a;
        public final b5q b;

        public c(b5q b5qVar, b5q b5qVar2) {
            this.a = b5qVar;
            this.b = b5qVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            b5q b5qVar = this.a;
            int iHashCode = (b5qVar == null ? 0 : b5qVar.hashCode()) * 31;
            b5q b5qVar2 = this.b;
            return iHashCode + (b5qVar2 != null ? b5qVar2.hashCode() : 0);
        }

        public final String toString() {
            return "StreamDetailAccumulator(previous=" + this.a + ", current=" + this.b + ")";
        }

        public c() {
            this(null, null);
        }
    }

    public static final class e {
        public final fgr a;
        public final Boolean b;

        public e(fgr fgrVar, Boolean bool) {
            this.a = fgrVar;
            this.b = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            fgr fgrVar = this.a;
            int iHashCode = (fgrVar == null ? 0 : fgrVar.hashCode()) * 31;
            Boolean bool = this.b;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "StreamScheduleState(schedule=" + this.a + ", initialStreamWasOnline=" + this.b + ")";
        }

        public e() {
            this(null, null);
        }
    }

    public static final class b {
        public final int a;
        public final boolean b;
        public final boolean c;
        public final Float d;

        public b(int i, boolean z, boolean z2, Float f) {
            this.a = i;
            this.b = z;
            this.c = z2;
            this.d = f;
        }

        public static b a(b bVar, int i, boolean z, boolean z2, Float f, int i2) {
            if ((i2 & 1) != 0) {
                i = bVar.a;
            }
            if ((i2 & 2) != 0) {
                z = bVar.b;
            }
            if ((i2 & 4) != 0) {
                z2 = bVar.c;
            }
            if ((i2 & 8) != 0) {
                f = bVar.d;
            }
            bVar.getClass();
            return new b(i, z, z2, f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            int iA = mtg0.a(mtg0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            Float f = this.d;
            return iA + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            return "PlayerSnapshot(playbackState=" + this.a + ", isPlaying=" + this.b + ", hasError=" + this.c + ", videoAspectRatio=" + this.d + ")";
        }

        public /* synthetic */ b(int i) {
            this(1, false, false, null);
        }

        public b() {
            this(15);
        }
    }
}
