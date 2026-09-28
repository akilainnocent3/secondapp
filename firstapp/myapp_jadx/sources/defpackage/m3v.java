package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.router.event.MatchEventDetailInput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00052\u00020\u00062\u00020\u00072\u00020\u00052\u00020\u00052\u00020\b¨\u0006\t"}, d2 = {"Lm3v;", "Lj8i0;", "Ljpk;", "Lihy;", "Ljdo;", "", "Lnh2;", "Lfi2;", "Les3;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m3v extends j8i0 implements jpk, ihy, jdo, nh2, fi2, es3 {
    public final u0v A;
    public final lfo B;
    public final q1v C;
    public final v2v D;
    public final c2v E;
    public final rdd0 F;
    public final eqn G;
    public final ihi H;
    public final es3 I;
    public final v340 J;
    public final ssw<hqc> K;
    public final ssw<hqc> L;
    public x1v M;
    public final v340 N;
    public final v340 O;
    public final ku90<pgl> P;
    public final ku90 Q;
    public final wwd0 R;
    public final wwd0 S;
    public final wwd0 T;
    public final wwd0 U;
    public final wwd0 V;
    public final wwd0 W;
    public final ku90<y2v> X;
    public final /* synthetic */ bgo a;
    public final /* synthetic */ nh2 b;
    public final /* synthetic */ fi2 c;
    public final /* synthetic */ vpp d;
    public final s8o e;
    public final uqm f;
    public final n4p i;
    public final jpk v;
    public final ihy w;
    public final jdo y;
    public final ymr z;

    public m3v(vu60 vu60Var, s8o s8oVar, uqm uqmVar, n4p n4pVar, jpk jpkVar, ihy ihyVar, jdo jdoVar, ymr ymrVar, u0v u0vVar, lfo lfoVar, bgo bgoVar, nh2 nh2Var, fi2 fi2Var, q1v q1vVar, v2v v2vVar, c2v c2vVar, rdd0 rdd0Var, eqn eqnVar, vpp vppVar, ihi ihiVar, es3 es3Var) {
        vu60Var.getClass();
        s8oVar.getClass();
        uqmVar.getClass();
        jpkVar.getClass();
        ihyVar.getClass();
        jdoVar.getClass();
        u0vVar.getClass();
        nh2Var.getClass();
        fi2Var.getClass();
        c2vVar.getClass();
        rdd0Var.getClass();
        eqnVar.getClass();
        es3Var.getClass();
        this.a = bgoVar;
        this.b = nh2Var;
        this.c = fi2Var;
        this.d = vppVar;
        this.e = s8oVar;
        this.f = uqmVar;
        this.i = n4pVar;
        this.v = jpkVar;
        this.w = ihyVar;
        this.y = jdoVar;
        this.z = ymrVar;
        this.A = u0vVar;
        this.B = lfoVar;
        this.C = q1vVar;
        this.D = v2vVar;
        this.E = c2vVar;
        this.F = rdd0Var;
        this.G = eqnVar;
        this.H = ihiVar;
        this.I = es3Var;
        v340 v340VarD = vu60Var.d(null, "ARG_INPUT");
        this.J = v340VarD;
        ssw<hqc> sswVar = new ssw<>();
        this.K = sswVar;
        ssw<hqc> sswVar2 = new ssw<>();
        this.L = sswVar2;
        this.N = e1i.e(new l3v(new h3v(i2i.a(sswVar)), this), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), Boolean.FALSE);
        this.O = e1i.e(r0i.f(new i3v(i2i.a(sswVar)), new k3v(null, this)), o8i0.d(this), q490.a.b, ink.b.a);
        ku90<pgl> ku90Var = new ku90<>();
        this.P = ku90Var;
        this.Q = ku90Var;
        wwd0 wwd0VarA = xwd0.a(n1a0.c);
        this.R = wwd0VarA;
        this.S = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.T = wwd0VarA2;
        m2g m2gVar = m2g.a;
        wwd0 wwd0VarA3 = xwd0.a(m2gVar);
        this.U = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(m2gVar);
        this.V = wwd0VarA4;
        f1i f1iVar = new f1i(new n1i(new f1i(wwd0VarA2), wwd0VarA3, new g3v(3, null)));
        this.W = xwd0.a(png.d.a);
        this.X = new ku90<>();
        kzh.d(new g1i(new i0i(new f1i(v340VarD)), new z2v(null, this)), o8i0.d(this));
        lyh lyhVarA = ozh.a(new j3v(i2i.a(sswVar)), 64, pb5.b);
        String strC = n4pVar.c();
        yho yhoVar = ymrVar.a;
        kzh.d(new g1i(new f1i(r1i.b(lyhVarA, new tmr(yhoVar.f.a(yhoVar, yho.o[4]).d(""), ymrVar, strC), eqnVar.h, vppVar.d, new a3v(5, this, m3v.class, "createUiState", "createUiState(Lcom/sportybet/android/common/DataState;Ljava/lang/String;Lcom/sportybet/android/instantwin/presentation/event/model/state/InstantFootballKickOffVisibilityAnTestState;Z)Lcom/sportybet/android/instantwin/presentation/event/model/EventDetailUiState;", 4))), new b3v(null, this)), o8i0.d(this));
        lfoVar.a(o8i0.d(this), n4pVar.c());
        nh2Var.h0(o8i0.d(this), n4pVar.c(), sswVar2);
        ihiVar.c(o8i0.d(this), n4pVar.c());
        et7 et7VarD = o8i0.d(this);
        kzh.d(new g1i(r1i.b(q1vVar.d, f1iVar, q1vVar.b, wwd0VarA3, new m1v(5, q1vVar, q1v.class, "createEventSwitcherState", "createEventSwitcherState(ZLcom/sportybet/android/instantwin/model/instantwin/InstantWinEvent;Ljava/util/List;Ljava/util/List;)Lcom/sportybet/android/instantwin/presentation/eventdetails/model/MatchEventDetailEventSwitcherState;", 4)), new n1v(q1vVar, null)), et7VarD);
        kzh.d(new g1i(new n1i(q1vVar.c, wwd0VarA4, new o1v(3, null)), new p1v(q1vVar, null)), et7VarD);
        et7 et7VarD2 = o8i0.d(this);
        kzh.d(new g1i(new n1i(f1iVar, v2vVar.f, new s2v(3, v2vVar, v2v.class, "createTeamInfoHeaderState", "createTeamInfoHeaderState(Lcom/sportybet/android/instantwin/model/instantwin/InstantWinEvent;Z)Lcom/sportybet/android/instantwin/presentation/eventdetails/model/MatchEventDetailTeamInfoHeaderState;", 4)), new t2v(v2vVar, null)), et7VarD2);
        kzh.d(new g1i(new i0i(new q2v(uzh.b(new r2v(v2vVar.e)))), new u2v(v2vVar, null)), et7VarD2);
        kzh.d(new g1i(new f1i(wwd0VarA2), new c3v(null, this)), o8i0.d(this));
    }

    @Override // defpackage.es3
    public final void A() {
        this.I.A();
    }

    public final void A1() {
        u0v u0vVar = this.A;
        u0vVar.getClass();
        BetBuilderOutcome betBuilderOutcomeGenDefaultBetBuilder = BetBuilderOutcome.genDefaultBetBuilder();
        betBuilderOutcomeGenDefaultBetBuilder.getClass();
        u0vVar.h = betBuilderOutcomeGenDefaultBetBuilder;
        ssw<hqc> sswVar = this.L;
        if (sswVar != null) {
            sswVar.m(new nqc(betBuilderOutcomeGenDefaultBetBuilder));
        }
    }

    @Override // defpackage.ihy
    public final uwd0<tho> D() {
        return this.w.D();
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        this.v.E(str);
    }

    @Override // defpackage.jdo
    public final lyh<Integer> F(String str) {
        str.getClass();
        return this.y.F(str);
    }

    @Override // defpackage.ihy
    public final void G() {
        this.w.G();
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return this.v.G0(str);
    }

    @Override // defpackage.jpk
    public final void H0() {
        this.v.H0();
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        this.v.I(str, str2, str3);
    }

    @Override // defpackage.jdo
    public final void I0(String str) {
        str.getClass();
        this.y.I0(str);
    }

    @Override // defpackage.nh2
    public final boolean K() {
        return this.b.K();
    }

    @Override // defpackage.jdo
    public final void O(String str) {
        this.y.O(str);
    }

    @Override // defpackage.ihy
    public final void O0(OddsFilterData oddsFilterData) {
        this.w.O0(oddsFilterData);
    }

    @Override // defpackage.jdo
    public final void R(String str, String str2, Collection<? extends BetSlipData> collection) {
        this.y.R(str, str2, collection);
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.v.R0(z);
    }

    @Override // defpackage.ihy
    public final void T(ogo ogoVar) {
        ogoVar.getClass();
        this.w.T(ogoVar);
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        this.v.T0(str);
    }

    @Override // defpackage.nh2
    public final void U0(String str) {
        str.getClass();
        this.b.U0(str);
    }

    @Override // defpackage.es3
    public final boolean V() {
        return this.I.V();
    }

    @Override // defpackage.ihy
    public final uwd0<ogo> Z0() {
        return this.w.Z0();
    }

    @Override // defpackage.nh2
    public final uwd0<ii2> a() {
        return this.b.a();
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.v.a0();
    }

    @Override // defpackage.nh2
    public final void b(rh2 rh2Var) {
        rh2Var.getClass();
        this.b.b(rh2Var);
    }

    @Override // defpackage.jpk
    public final void b0() {
        this.v.b0();
    }

    @Override // defpackage.nh2
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.nh2
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.ihy
    public final boolean d0() {
        return this.w.d0();
    }

    @Override // defpackage.es3
    public final void d1(String str, String str2) {
        str.getClass();
        this.I.d1(str, str2);
    }

    @Override // defpackage.nh2
    public final List<rh2> e() {
        return this.b.e();
    }

    @Override // defpackage.nh2
    public final uwd0<Boolean> f() {
        return this.b.f();
    }

    @Override // defpackage.fi2
    public final uwd0<ei2> f1() {
        return this.c.f1();
    }

    @Override // defpackage.nh2
    public final void g(boolean z) {
        this.b.g(z);
    }

    @Override // defpackage.nh2
    public final void h0(et7 et7Var, String str, ssw sswVar) {
        str.getClass();
        this.b.h0(et7Var, str, sswVar);
    }

    @Override // defpackage.jdo
    public final void j0(int i, String str) {
        str.getClass();
        this.y.j0(i, str);
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        this.v.j1(arrayList);
    }

    @Override // defpackage.jdo
    public final Object l1(String str, String str2, b6v b6vVar) {
        return this.y.l1(str, str2, b6vVar);
    }

    @Override // defpackage.fi2
    public final void n0() {
        this.c.n0();
    }

    @Override // defpackage.jdo
    public final void o() {
        this.y.o();
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        String str;
        MatchEventDetailInput matchEventDetailInput = (MatchEventDetailInput) this.J.a.getValue();
        if (matchEventDetailInput != null && (str = matchEventDetailInput.c) != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                this.E.remove(str);
            }
        }
        super.onCleared();
    }

    @Override // defpackage.es3
    public final void p0() {
        this.I.p0();
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.v.p1();
    }

    @Override // defpackage.jdo
    public final void q0(String str) {
        this.y.q0(str);
    }

    @Override // defpackage.fi2
    public final void r(int i) {
        this.c.r(i);
    }

    @Override // defpackage.es3
    public final a390<Unit> s0() {
        return this.I.s0();
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        return this.v.t0(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        this.v.t1();
    }

    @Override // defpackage.jdo
    public final a390<Unit> v0() {
        return this.y.v0();
    }

    @Override // defpackage.es3
    public final gs3 w1(String str) {
        return this.I.w1(str);
    }

    @Override // defpackage.jdo
    public final uwd0<Set<String>> x() {
        return this.y.x();
    }

    public final void x1() {
        this.d.a();
    }

    @Override // defpackage.es3
    public final uwd0<lt3> y() {
        return this.I.y();
    }

    @Override // defpackage.es3
    public final void y0(String str, boolean z) {
        str.getClass();
        this.I.y0(str, z);
    }

    public final void y1(x2v x2vVar) {
        wwd0 wwd0Var;
        Object value;
        Object value2;
        Object value3;
        x2vVar.getClass();
        boolean z = x2vVar instanceof x2v.b;
        q1v q1vVar = this.C;
        if (!z) {
            if (!(x2vVar instanceof x2v.a)) {
                uhc.a();
                return;
            }
            do {
                wwd0Var = this.T;
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ((x2v.a) x2vVar).a));
            q1vVar.a();
            return;
        }
        x2v.b bVar = (x2v.b) x2vVar;
        boolean zEquals = bVar.equals(x2v.b.d.a);
        rdd0 rdd0Var = this.F;
        n4p n4pVar = this.i;
        if (zEquals) {
            rdd0Var.a(new a5o.m0(n4pVar.c()), k00.d, k00.c);
            wwd0 wwd0Var2 = q1vVar.d;
            do {
                value3 = wwd0Var2.getValue();
                ((Boolean) value3).getClass();
            } while (!wwd0Var2.g(value3, Boolean.TRUE));
            return;
        }
        if (bVar.equals(x2v.b.C1270b.a)) {
            q1vVar.a();
            return;
        }
        if (bVar.equals(x2v.b.e.a)) {
            v2v v2vVar = this.D;
            jvd0 jvd0Var = v2vVar.d;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                jvd0 jvd0Var2 = v2vVar.c;
                if (jvd0Var2 != null) {
                    jvd0Var2.cancel((CancellationException) null);
                }
                v2vVar.c = null;
                v2vVar.d = ej5.c(v2vVar.b, null, null, new p2v(v2vVar, null), 3);
                return;
            }
            return;
        }
        if (bVar instanceof x2v.b.c) {
            String str = ((x2v.b.c) bVar).a;
            wwd0 wwd0Var3 = q1vVar.c;
            do {
                value2 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value2, str));
            return;
        }
        if (!(bVar instanceof x2v.b.a)) {
            uhc.a();
            return;
        }
        rdd0Var.a(new a5o.l0(n4pVar.c()), k00.d, k00.c);
        this.X.a(new y2v.a(((x2v.b.a) bVar).a));
    }

    @Override // defpackage.ihy
    public final OddsFilterData z0() {
        return this.w.z0();
    }

    public final void z1() {
        this.a.a();
    }
}
