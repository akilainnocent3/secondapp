package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.InstantVirtualResponse;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.presentation.promotiondialog.model.InstantWinPromotionDialogInput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00062\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00062\u00020\u00062\u00020\t2\u00020\n¨\u0006\u000b"}, d2 = {"Lz5v;", "Lj8i0;", "Ljpk;", "Lihy;", "Ljdo;", "Lhio;", "", "Lnh2;", "Lfi2;", "Les3;", "Ljh2;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z5v extends j8i0 implements jpk, ihy, jdo, hio, nh2, fi2, es3, jh2 {
    public final cmo A;
    public final ymr B;
    public final c2v C;
    public final rdd0 D;
    public final jpk E;
    public final ihy F;
    public final jdo G;
    public final hio H;
    public final lfo I;
    public final e4v J;
    public final eqn K;
    public final ihi L;
    public final wsm M;
    public final es3 N;
    public final jh2 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final wwd0 R;
    public final wwd0 S;
    public final v340 T;
    public final v340 U;
    public List<League> V;
    public List<? extends Event> W;
    public final wwd0 X;
    public final wwd0 Y;
    public String Z;
    public final /* synthetic */ bgo a;
    public final v340 a0;
    public final /* synthetic */ nh2 b;
    public final v340 b0;
    public final /* synthetic */ fi2 c;
    public final ku90<pgl> c0;
    public final /* synthetic */ vpp d;
    public final ku90 d0;
    public final b4p e;
    public final wwd0 e0;
    public final l4p f;
    public final wwd0 f0;
    public final ku90<i5v> g0;
    public final m4p i;
    public final eko v;
    public final uqm w;
    public final ji2 y;
    public final n4p z;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"z5v$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/instantwin/newtork/model/response/Event;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends Event>> {
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.event.viewmodel.MatchEventViewModel$recordLastFocusedMarketType$1", f = "MatchEventViewModel.kt", l = {546}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return z5v.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                z5v z5vVar = z5v.this;
                ymr ymrVar = z5vVar.B;
                String strC = z5vVar.z.c();
                this.a = 1;
                if (ymrVar.d(strC, this.c, this) == y5bVar) {
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

    public z5v(b4p b4pVar, l4p l4pVar, m4p m4pVar, eko ekoVar, uqm uqmVar, ji2 ji2Var, n4p n4pVar, cmo cmoVar, ymr ymrVar, c2v c2vVar, rdd0 rdd0Var, jpk jpkVar, ihy ihyVar, jdo jdoVar, hio hioVar, lfo lfoVar, e4v e4vVar, bgo bgoVar, nh2 nh2Var, fi2 fi2Var, eqn eqnVar, vpp vppVar, ihi ihiVar, wsm wsmVar, es3 es3Var, jh2 jh2Var) {
        ekoVar.getClass();
        uqmVar.getClass();
        ji2Var.getClass();
        c2vVar.getClass();
        rdd0Var.getClass();
        jpkVar.getClass();
        ihyVar.getClass();
        jdoVar.getClass();
        hioVar.getClass();
        nh2Var.getClass();
        fi2Var.getClass();
        eqnVar.getClass();
        wsmVar.getClass();
        es3Var.getClass();
        jh2Var.getClass();
        this.a = bgoVar;
        this.b = nh2Var;
        this.c = fi2Var;
        this.d = vppVar;
        this.e = b4pVar;
        this.f = l4pVar;
        this.i = m4pVar;
        this.v = ekoVar;
        this.w = uqmVar;
        this.y = ji2Var;
        this.z = n4pVar;
        this.A = cmoVar;
        this.B = ymrVar;
        this.C = c2vVar;
        this.D = rdd0Var;
        this.E = jpkVar;
        this.F = ihyVar;
        this.G = jdoVar;
        this.H = hioVar;
        this.I = lfoVar;
        this.J = e4vVar;
        this.K = eqnVar;
        this.L = ihiVar;
        this.M = wsmVar;
        this.N = es3Var;
        this.O = jh2Var;
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA = xwd0.a(bVar);
        this.P = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(bVar);
        this.Q = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(bVar);
        this.R = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(bVar);
        this.S = wwd0VarA4;
        b77 b77VarF = r0i.f(uzh.b(new j6v(new l6v(wwd0VarA), this)), new h6v(null, this));
        et7 et7VarD = o8i0.d(this);
        lwd0 lwd0Var = q490.a.b;
        v340 v340VarE = e1i.e(b77VarF, et7VarD, lwd0Var, bVar);
        String strC = n4pVar.c();
        yho yhoVar = ymrVar.a;
        v340 v340VarE2 = e1i.e(new yzh(new g1i(new d6v(new lyh[]{wwd0VarA, wwd0VarA2, wwd0VarA3, wwd0VarA4, new i0i(new umr(yhoVar.g.a(yhoVar, yho.o[5]).d(""), ymrVar, strC)), v340VarE, eqnVar.h, vppVar.d}, this), new m5v(null, this)), new n5v(3, null)), o8i0.d(this), lwd0Var, ctg.c.a);
        this.T = v340VarE2;
        this.U = e1i.e(r0i.f(new e6v(v340VarE2), new i6v(null, this)), o8i0.d(this), lwd0Var, null);
        m2g m2gVar = m2g.a;
        this.V = m2gVar;
        this.W = m2gVar;
        this.X = xwd0.a(m2gVar);
        this.Y = xwd0.a(m2gVar);
        this.Z = "";
        this.a0 = e1i.e(new n1i(new f6v(v340VarE2), lfoVar.h, new w5v(3, null)), o8i0.d(this), lwd0Var, ink.b.a);
        this.b0 = e1i.e(new k6v(wwd0VarA2, this), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), Boolean.FALSE);
        ku90<pgl> ku90Var = new ku90<>();
        this.c0 = ku90Var;
        this.d0 = ku90Var;
        wwd0 wwd0VarA5 = xwd0.a(n1a0.c);
        this.e0 = wwd0VarA5;
        this.f0 = wwd0VarA5;
        this.g0 = new ku90<>();
        lfoVar.a(o8i0.d(this), n4pVar.c());
        et7 et7VarD2 = o8i0.d(this);
        String strC2 = n4pVar.c();
        strC2.getClass();
        e4v e4vVar2 = this.J;
        e4vVar2.getClass();
        kzh.d(new g1i(new n1i(v340VarE2, e4vVar2.c, new a4v(3, e4vVar2, e4v.class, "createLeagueTabState", "createLeagueTabState(Lcom/sportybet/android/instantwin/presentation/state/EventViewState;Ljava/lang/String;)Lcom/sportybet/android/instantwin/presentation/event/model/state/MatchEventLeagueTabState;", 4)), new b4v(e4vVar2, null)), et7VarD2);
        ymr ymrVar2 = e4vVar2.a;
        yho yhoVar2 = ymrVar2.a;
        kzh.d(new g1i(new smr(yhoVar2.e.a(yhoVar2, yho.o[3]).d(""), ymrVar2, strC2), new c4v(e4vVar2, null)), et7VarD2);
        kzh.d(new g1i(uzh.b(e4vVar2.b), new d4v(e4vVar2, strC2, null)), et7VarD2);
        nh2Var.h0(o8i0.d(this), n4pVar.c(), null);
        String str = n4pVar.n;
        str = (str == null || StringsKt.U(str)) ? null : str;
        if (str != null) {
            e4vVar.b.a(str);
        }
        n4pVar.n = "";
        String str2 = n4pVar.o;
        str2 = (str2 == null || StringsKt.U(str2)) ? null : str2;
        if (str2 != null) {
            C1(str2);
        }
        n4pVar.o = "";
        kzh.d(new g1i(new g6v(v340VarE2), new l5v(null, this)), o8i0.d(this));
        eqnVar.a(o8i0.d(this), n4pVar.c());
        es3Var.y0(n4pVar.c(), false);
        ihiVar.c(o8i0.d(this), n4pVar.c());
    }

    public static List B1(InstantVirtualResponse instantVirtualResponse) {
        eal ealVar = new eal();
        bcp bcpVarA = p5p.a(instantVirtualResponse.getWrapEventList().getKeys(), instantVirtualResponse.getWrapEventList().getValue());
        Object objC = ealVar.c(new yep(bcpVarA), TypeToken.get(new a().getType()));
        objC.getClass();
        return (List) objC;
    }

    public static int z1(float f) {
        if (0.0f <= f && f <= 20.0f) {
            return 1;
        }
        if (20.0f <= f && f <= 40.0f) {
            return 2;
        }
        if (40.0f <= f && f <= 60.0f) {
            return 3;
        }
        if (60.0f > f || f > 80.0f) {
            return (80.0f > f || f > 100.0f) ? 0 : 5;
        }
        return 4;
    }

    @Override // defpackage.es3
    public final void A() {
        this.N.A();
    }

    public final void A1() {
        this.a.a();
    }

    @Override // defpackage.jh2
    public final boolean B(String str) {
        str.getClass();
        return this.O.B(str);
    }

    public final void C1(String str) {
        if (str == null) {
            return;
        }
        this.Z = str;
        ej5.c(o8i0.d(this), null, null, new b(str, null), 3);
    }

    @Override // defpackage.ihy
    public final uwd0<tho> D() {
        return this.F.D();
    }

    public final void D1(String str, String str2, String str3, String str4, String str5, String str6) {
        n4p n4pVar = this.z;
        try {
            zi50.a aVar = zi50.b;
            xdp xdpVar = new xdp();
            String str7 = n4pVar.t;
            String str8 = "";
            if (str7 == null) {
                str7 = "";
            }
            xdpVar.i("roundId", str7);
            xdpVar.i(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, str2 == null ? "" : str2);
            xdpVar.i("marketId", str3 == null ? "" : str3);
            xdpVar.i("outcomeId", str4 == null ? "" : str4);
            xdpVar.i("odds", str5 == null ? "" : str5);
            if (str6 != null) {
                str8 = str6;
            }
            xdpVar.i("probability", str8);
            this.M.g("Null probability for outcome in MatchEventViewModel::".concat(str), xdpVar.toString(), new NullPointerException(), null);
            this.D.a(new a5o.x(n4pVar.c(), n4pVar.t, str2, str3, str4, str5, str6), k00.d);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        this.E.E(str);
    }

    public final void E1(ctg ctgVar) {
        if (ctgVar == null) {
            ctgVar = (ctg) this.T.a.getValue();
        }
        if (ctgVar instanceof ctg.a) {
            this.D.a(new a5o.u(this.z.c()), k00.d);
        }
    }

    @Override // defpackage.jdo
    public final lyh<Integer> F(String str) {
        str.getClass();
        return this.G.F(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F1(InstantVirtualResponse instantVirtualResponse) {
        ruh.a aVar = new ruh.a(ld80.f(new u48(B1(instantVirtualResponse)), new j5v()));
        while (aVar.hasNext()) {
            bxg0 bxg0Var = (bxg0) aVar.next();
            Event event = (Event) bxg0Var.a;
            Market market = (Market) bxg0Var.b;
            Outcome outcome = (Outcome) bxg0Var.c;
            D1("fetchListEventData", event.eventId, market.marketId, outcome.outcomeId, outcome.odds, outcome.probability);
        }
    }

    @Override // defpackage.ihy
    public final void G() {
        this.F.G();
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return this.E.G0(str);
    }

    @Override // defpackage.jpk
    public final void H0() {
        this.E.H0();
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        this.E.I(str, str2, str3);
    }

    @Override // defpackage.jdo
    public final void I0(String str) {
        str.getClass();
        this.G.I0(str);
    }

    @Override // defpackage.nh2
    public final boolean K() {
        return this.b.K();
    }

    @Override // defpackage.jdo
    public final void O(String str) {
        this.G.O(str);
    }

    @Override // defpackage.ihy
    public final void O0(OddsFilterData oddsFilterData) {
        this.F.O0(oddsFilterData);
    }

    @Override // defpackage.jdo
    public final void R(String str, String str2, Collection<? extends BetSlipData> collection) {
        this.G.R(str, str2, collection);
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.E.R0(z);
    }

    @Override // defpackage.ihy
    public final void T(ogo ogoVar) {
        ogoVar.getClass();
        this.F.T(ogoVar);
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        this.E.T0(str);
    }

    @Override // defpackage.nh2
    public final void U0(String str) {
        str.getClass();
        this.b.U0(str);
    }

    @Override // defpackage.es3
    public final boolean V() {
        return this.N.V();
    }

    @Override // defpackage.jh2
    public final void W0(String str, boolean z) {
        str.getClass();
        this.O.W0(str, z);
    }

    @Override // defpackage.hio
    public final void X(String str) {
        str.getClass();
        this.H.X(str);
    }

    @Override // defpackage.ihy
    public final uwd0<ogo> Z0() {
        return this.F.Z0();
    }

    @Override // defpackage.nh2
    public final uwd0<ii2> a() {
        return this.b.a();
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.E.a0();
    }

    @Override // defpackage.nh2
    public final void b(rh2 rh2Var) {
        rh2Var.getClass();
        this.b.b(rh2Var);
    }

    @Override // defpackage.jpk
    public final void b0() {
        this.E.b0();
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
        return this.F.d0();
    }

    @Override // defpackage.es3
    public final void d1(String str, String str2) {
        str.getClass();
        this.N.d1(str, str2);
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
        this.G.j0(i, str);
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        this.E.j1(arrayList);
    }

    @Override // defpackage.jdo
    public final Object l1(String str, String str2, b6v b6vVar) {
        return this.G.l1(str, str2, b6vVar);
    }

    @Override // defpackage.fi2
    public final void n0() {
        this.c.n0();
    }

    @Override // defpackage.jdo
    public final void o() {
        this.G.o();
    }

    @Override // defpackage.es3
    public final void p0() {
        this.N.p0();
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.E.p1();
    }

    @Override // defpackage.jdo
    public final void q0(String str) {
        this.G.q0(str);
    }

    @Override // defpackage.fi2
    public final void r(int i) {
        this.c.r(i);
    }

    @Override // defpackage.hio
    public final void r1() {
        this.H.r1();
    }

    @Override // defpackage.es3
    public final a390<Unit> s0() {
        return this.N.s0();
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        return this.E.t0(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        this.E.t1();
    }

    @Override // defpackage.jdo
    public final a390<Unit> v0() {
        return this.G.v0();
    }

    @Override // defpackage.hio
    public final lyh<InstantWinPromotionDialogInput> v1() {
        return this.H.v1();
    }

    @Override // defpackage.es3
    public final gs3 w1(String str) {
        return this.N.w1(str);
    }

    @Override // defpackage.jdo
    public final uwd0<Set<String>> x() {
        return this.G.x();
    }

    public final void x1(boolean z) {
        n4p n4pVar = this.z;
        String strC = n4pVar.c();
        boolean z2 = n4pVar.I;
        n4pVar.I = true;
        this.N.y0(strC, z2);
        kzh.d(new yzh(new g1i(bm50.a(this.e.a.n(Boolean.valueOf(z), strC)), new q5v(this, strC, z, null)), new r5v(null, this)), o8i0.d(this));
        kzh.d(new yzh(new g1i(bm50.a(this.v.f(strC)), new o5v(null, this)), new p5v(null, this)), o8i0.d(this));
        kzh.d(new yzh(new g1i(bm50.a(this.i.a.r(strC)), new u5v(null, this)), new v5v(null, this)), o8i0.d(this));
    }

    @Override // defpackage.es3
    public final uwd0<lt3> y() {
        return this.N.y();
    }

    @Override // defpackage.es3
    public final void y0(String str, boolean z) {
        str.getClass();
        this.N.y0(str, z);
    }

    public final ArrayList y1(String str) {
        ArrayList arrayList;
        List<? extends Event> list = this.W;
        ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
        for (Event event : list) {
            String str2 = event.eventId;
            String str3 = event.leagueId;
            String str4 = event.homeTeamName;
            String str5 = event.homeTeamLogo;
            String str6 = event.awayTeamName;
            String str7 = event.awayTeamLogo;
            int i = event.marketCount;
            List<Market> list2 = event.markets;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (Intrinsics.g(((Market) obj).type, str)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new Event(str2, str3, str4, str5, str6, str7, i, arrayList, event.teamStrengthPercentage));
        }
        return arrayList2;
    }

    @Override // defpackage.ihy
    public final OddsFilterData z0() {
        return this.F.z0();
    }
}
