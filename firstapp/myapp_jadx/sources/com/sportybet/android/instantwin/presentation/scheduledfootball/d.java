package com.sportybet.android.instantwin.presentation.scheduledfootball;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.router.scheduledfootball.ScheduledFootballInput;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a170;
import defpackage.a270;
import defpackage.a370;
import defpackage.a4h;
import defpackage.a570;
import defpackage.aa70;
import defpackage.ad70;
import defpackage.ae70;
import defpackage.af70;
import defpackage.aj70;
import defpackage.ak70;
import defpackage.al70;
import defpackage.am70;
import defpackage.b170;
import defpackage.b270;
import defpackage.b370;
import defpackage.b570;
import defpackage.be70;
import defpackage.bf70;
import defpackage.bi70;
import defpackage.bj70;
import defpackage.bk70;
import defpackage.bl70;
import defpackage.bm70;
import defpackage.bz3;
import defpackage.c0d;
import defpackage.c170;
import defpackage.c270;
import defpackage.c570;
import defpackage.c970;
import defpackage.ce70;
import defpackage.cf70;
import defpackage.cj70;
import defpackage.ck70;
import defpackage.cm70;
import defpackage.cmo;
import defpackage.cz2;
import defpackage.d170;
import defpackage.d270;
import defpackage.d570;
import defpackage.de70;
import defpackage.di70;
import defpackage.dm70;
import defpackage.e170;
import defpackage.e1i;
import defpackage.e270;
import defpackage.e570;
import defpackage.e670;
import defpackage.e970;
import defpackage.ee70;
import defpackage.ei70;
import defpackage.ej5;
import defpackage.em70;
import defpackage.et7;
import defpackage.et90;
import defpackage.f170;
import defpackage.f1i;
import defpackage.f270;
import defpackage.f570;
import defpackage.f670;
import defpackage.ff70;
import defpackage.fi70;
import defpackage.fj70;
import defpackage.fm70;
import defpackage.fqk;
import defpackage.fqo;
import defpackage.ft90;
import defpackage.g170;
import defpackage.g1i;
import defpackage.g270;
import defpackage.g570;
import defpackage.g870;
import defpackage.gb70;
import defpackage.gf70;
import defpackage.gfh0;
import defpackage.gi70;
import defpackage.gj70;
import defpackage.h070;
import defpackage.h170;
import defpackage.h270;
import defpackage.h670;
import defpackage.h870;
import defpackage.hb70;
import defpackage.hf70;
import defpackage.hi70;
import defpackage.hj70;
import defpackage.hm3;
import defpackage.i070;
import defpackage.i170;
import defpackage.i270;
import defpackage.i370;
import defpackage.i670;
import defpackage.i870;
import defpackage.ib5;
import defpackage.ib70;
import defpackage.if70;
import defpackage.ii70;
import defpackage.im70;
import defpackage.j070;
import defpackage.j170;
import defpackage.j270;
import defpackage.j570;
import defpackage.j670;
import defpackage.j870;
import defpackage.j8i0;
import defpackage.jb70;
import defpackage.jf70;
import defpackage.ji70;
import defpackage.jj70;
import defpackage.jm70;
import defpackage.jpk;
import defpackage.jvd0;
import defpackage.k00;
import defpackage.k070;
import defpackage.k170;
import defpackage.k270;
import defpackage.k670;
import defpackage.k870;
import defpackage.kb70;
import defpackage.kf70;
import defpackage.kj70;
import defpackage.km70;
import defpackage.kqo;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l070;
import defpackage.l270;
import defpackage.l48;
import defpackage.l770;
import defpackage.l870;
import defpackage.lb70;
import defpackage.lf70;
import defpackage.li70;
import defpackage.lj70;
import defpackage.lmw;
import defpackage.lni0;
import defpackage.lyh;
import defpackage.m070;
import defpackage.m270;
import defpackage.m2g;
import defpackage.m670;
import defpackage.m770;
import defpackage.m780;
import defpackage.m870;
import defpackage.mb70;
import defpackage.mf70;
import defpackage.mg70;
import defpackage.mgb0;
import defpackage.mj70;
import defpackage.mm70;
import defpackage.mwd0;
import defpackage.n070;
import defpackage.n1i;
import defpackage.n270;
import defpackage.n770;
import defpackage.n870;
import defpackage.n970;
import defpackage.nf70;
import defpackage.ni70;
import defpackage.nmw;
import defpackage.o070;
import defpackage.o270;
import defpackage.o770;
import defpackage.o870;
import defpackage.o8i0;
import defpackage.o970;
import defpackage.p070;
import defpackage.p270;
import defpackage.p48;
import defpackage.p54;
import defpackage.p770;
import defpackage.p870;
import defpackage.p970;
import defpackage.pi70;
import defpackage.pj70;
import defpackage.pu0;
import defpackage.q070;
import defpackage.q3;
import defpackage.q370;
import defpackage.q570;
import defpackage.q870;
import defpackage.q970;
import defpackage.r070;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.r370;
import defpackage.r870;
import defpackage.r970;
import defpackage.r9i;
import defpackage.rdd0;
import defpackage.s070;
import defpackage.s370;
import defpackage.s870;
import defpackage.s970;
import defpackage.sfh0;
import defpackage.t070;
import defpackage.t370;
import defpackage.t870;
import defpackage.t970;
import defpackage.td70;
import defpackage.tj70;
import defpackage.tz60;
import defpackage.tzh;
import defpackage.u070;
import defpackage.u370;
import defpackage.u870;
import defpackage.u970;
import defpackage.uag;
import defpackage.ufo;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uj70;
import defpackage.uwd0;
import defpackage.uy0;
import defpackage.uzh;
import defpackage.v070;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v870;
import defpackage.v970;
import defpackage.vch0;
import defpackage.vcj;
import defpackage.ve70;
import defpackage.vj70;
import defpackage.vu60;
import defpackage.w070;
import defpackage.w470;
import defpackage.w870;
import defpackage.w970;
import defpackage.wd70;
import defpackage.we70;
import defpackage.wi70;
import defpackage.wj70;
import defpackage.wr4;
import defpackage.wwd0;
import defpackage.x070;
import defpackage.x1b;
import defpackage.x270;
import defpackage.x370;
import defpackage.x470;
import defpackage.x970;
import defpackage.xd70;
import defpackage.xi70;
import defpackage.xj70;
import defpackage.xwd0;
import defpackage.y070;
import defpackage.y470;
import defpackage.y5b;
import defpackage.y970;
import defpackage.yd70;
import defpackage.ye70;
import defpackage.yi70;
import defpackage.yj70;
import defpackage.z070;
import defpackage.z170;
import defpackage.z270;
import defpackage.z370;
import defpackage.z470;
import defpackage.z970;
import defpackage.zd70;
import defpackage.ze70;
import defpackage.zi50;
import defpackage.zi70;
import defpackage.zj70;
import defpackage.zk70;
import defpackage.zl70;
import defpackage.zm7;
import defpackage.zrd0;
import defpackage.zs;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/scheduledfootball/d;", "Lj8i0;", "Ljpk;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d extends j8i0 implements jpk {
    public final p770 A;
    public final i870 B;
    public final aa70 C;
    public final td70 D;
    public final ff70 E;
    public final li70 F;
    public final pj70 G;
    public final bk70 H;
    public final mm70 I;
    public final jpk J;
    public final mgb0 K;
    public final rdd0 L;
    public final x370 M;
    public final ScheduledFootballInput N;
    public final wwd0 O;
    public final wwd0 P;
    public jvd0 Q;
    public final wwd0 R;
    public final wwd0 S;
    public final wwd0 T;
    public final wwd0 U;
    public final ku90<c> V;
    public final v340 W;
    public final uy0 a;
    public final cmo b;
    public final mg70 c;
    public final q070 d;
    public final a170 e;
    public final k170 f;
    public final a270 i;
    public final z270 v;
    public final t370 w;
    public final j570 y;
    public final f670 z;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballViewModel", f = "ScheduledFootballViewModel.kt", l = {953}, m = "createTicket", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ d b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, d dVar) {
            super(v1bVar);
            this.b = dVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.x1(null, this);
        }
    }

    public d(vu60 vu60Var, uy0 uy0Var, cmo cmoVar, mg70 mg70Var, kqo kqoVar, q070 q070Var, a170 a170Var, k170 k170Var, a270 a270Var, z270 z270Var, t370 t370Var, j570 j570Var, f670 f670Var, p770 p770Var, i870 i870Var, aa70 aa70Var, mb70 mb70Var, td70 td70Var, we70 we70Var, ff70 ff70Var, li70 li70Var, pj70 pj70Var, bk70 bk70Var, mm70 mm70Var, jpk jpkVar, mgb0 mgb0Var, rdd0 rdd0Var, x370 x370Var) {
        ResourceUiText resourceUiText;
        wwd0 wwd0Var = j570Var.d;
        wwd0 wwd0Var2 = f670Var.g;
        wwd0 wwd0Var3 = i870Var.d;
        wwd0 wwd0Var4 = aa70Var.g;
        wwd0 wwd0Var5 = aa70Var.f;
        wwd0 wwd0Var6 = li70Var.d;
        wwd0 wwd0Var7 = li70Var.c;
        wwd0 wwd0Var8 = li70Var.b;
        wwd0 wwd0Var9 = pj70Var.l;
        wwd0 wwd0Var10 = pj70Var.i;
        wwd0 wwd0Var11 = bk70Var.f;
        wwd0 wwd0Var12 = bk70Var.e;
        vu60Var.getClass();
        uy0Var.getClass();
        jpkVar.getClass();
        mgb0Var.getClass();
        rdd0Var.getClass();
        x370Var.getClass();
        this.a = uy0Var;
        this.b = cmoVar;
        this.c = mg70Var;
        this.d = q070Var;
        this.e = a170Var;
        this.f = k170Var;
        this.i = a270Var;
        this.v = z270Var;
        this.w = t370Var;
        this.y = j570Var;
        this.z = f670Var;
        this.A = p770Var;
        this.B = i870Var;
        this.C = aa70Var;
        this.D = td70Var;
        this.E = ff70Var;
        this.F = li70Var;
        this.G = pj70Var;
        this.H = bk70Var;
        this.I = mm70Var;
        this.J = jpkVar;
        this.K = mgb0Var;
        this.L = rdd0Var;
        this.M = x370Var;
        this.N = (ScheduledFootballInput) vu60Var.b("ARG_INPUT");
        wwd0 wwd0VarA = xwd0.a(Boolean.TRUE);
        this.O = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new hm3(0));
        this.P = wwd0VarA2;
        lni0 lni0Var = lni0.a;
        wwd0 wwd0VarA3 = xwd0.a(lni0Var);
        this.R = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(lni0Var);
        this.S = wwd0VarA4;
        zs.a aVar = zs.a.a;
        wwd0 wwd0VarA5 = xwd0.a(aVar);
        this.T = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(aVar);
        this.U = wwd0VarA6;
        this.V = new ku90<>();
        wwd0 wwd0Var13 = kqoVar.d;
        wwd0 wwd0Var14 = pj70Var.h;
        wwd0 wwd0Var15 = pj70Var.m;
        wwd0 wwd0Var16 = pj70Var.n;
        v340 v340VarB = e1i.b(p770Var.a);
        wwd0 wwd0Var17 = p770Var.b;
        v340 v340VarB2 = e1i.b(wwd0Var17);
        wwd0 wwd0Var18 = td70Var.j;
        v340 v340VarB3 = e1i.b(wwd0Var18);
        wwd0 wwd0Var19 = a270Var.g;
        v340 v340VarB4 = e1i.b(i870Var.c);
        wwd0 wwd0Var20 = i870Var.e;
        fm70 fm70Var = new fm70(new lyh[]{wwd0Var13, wwd0Var14, wwd0Var15, wwd0Var16, v340VarB, v340VarB2, v340VarB3, wwd0Var19, v340VarB4, e1i.b(wwd0Var20), mb70Var.d, wwd0VarA2, ff70Var.g, z270Var.d, q070Var.c, wwd0VarA5, wwd0VarA6, wwd0VarA3, wwd0VarA4, e1i.b(t370Var.b), e1i.b(mm70Var.e)}, this);
        et7 et7VarD = o8i0.d(this);
        mwd0 mwd0Var = new mwd0(0L, Long.MAX_VALUE);
        fqo.c.b bVar = fqo.c.b.a;
        fqo.a.C0579a c0579a = fqo.a.C0579a.a;
        Integer numC = cmoVar.c(y1());
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        this.W = e1i.e(fm70Var, et7VarD, mwd0Var, new zk70(new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText, bVar), i370.b.a, aVar, null, null, null, null, lni0Var, aVar, aVar, aVar, null));
        jpkVar.t1();
        uy0Var.g();
        kqoVar.a(o8i0.d(this), true);
        et7 et7VarD2 = o8i0.d(this);
        String strY1 = y1();
        kzh.d(r0i.f(pj70Var.f, new zi70(null, pj70Var, strY1)), et7VarD2);
        zm7 zm7Var = new zm7(3);
        tzh tzhVar = uzh.b;
        kzh.d(new g1i(r0i.f(uzh.c(wwd0Var14, zm7Var, tzhVar), new aj70(null, pj70Var)), new jj70(null, pj70Var)), et7VarD2);
        kzh.d(new g1i(r0i.f(uzh.c(wwd0Var14, new pi70(), tzhVar), new bj70(null, pj70Var)), new kj70(null, pj70Var)), et7VarD2);
        kzh.d(new g1i(wwd0Var10, new lj70(pj70Var, et7VarD2, strY1, null)), et7VarD2);
        kzh.d(new g1i(pj70Var.j, new mj70(null, pj70Var, strY1)), et7VarD2);
        kzh.d(new g1i(wwd0Var9, new fj70(null, pj70Var)), et7VarD2);
        kzh.d(new g1i(new cj70(new xi70(wwd0Var14), pj70Var, strY1), new gj70(null, pj70Var)), et7VarD2);
        kzh.d(new g1i(new wi70(new yi70(wwd0Var14)), new hj70(null, pj70Var)), et7VarD2);
        kzh.d(new g1i(new n770(new m770(wwd0Var14)), new o770(p770Var, null)), o8i0.d(this));
        et7 et7VarD3 = o8i0.d(this);
        String strY2 = y1();
        v340 v340VarB5 = e1i.b(wwd0Var17);
        wwd0 wwd0Var21 = td70Var.i;
        kzh.d(new g1i(r1i.a(wwd0Var21, td70Var.d, td70Var.g, new xd70(4, td70Var, td70.class, "createOverviewStatsBottomSheetState", "createOverviewStatsBottomSheetState(Lcom/sportybet/android/instantwin/presentation/scheduledfootball/model/ScheduledFootballOverviewStatsType;Lcom/sportybet/android/instantwin/presentation/scheduledfootball/model/status/ScheduledFootballOverviewStatsLeagueStandingsDataStatus;Lcom/sportybet/android/instantwin/presentation/scheduledfootball/model/status/ScheduledFootballOverviewStatsMatchResultsDataStatus;)Lcom/sportybet/android/instantwin/presentation/scheduledfootball/model/state/bottomsheet/overviewstats/ScheduledFootballOverviewStatsBottomSheetState;", 4)), new yd70(td70Var, null)), et7VarD3);
        kzh.d(new g1i(wwd0Var21, new zd70(td70Var, null)), et7VarD3);
        kzh.d(new g1i(new n1i(v340VarB5, td70Var.c, ae70.v), new be70(td70Var, et7VarD3, strY2, null)), et7VarD3);
        kzh.d(new g1i(new n1i(v340VarB5, td70Var.f, ce70.v), new de70(td70Var, et7VarD3, strY2, null)), et7VarD3);
        kzh.d(new g1i(new wd70(new f1i(e1i.b(wwd0Var18))), new ee70(td70Var, null)), et7VarD3);
        et7 et7VarD4 = o8i0.d(this);
        kzh.d(new g1i(new n870(new k870(wwd0Var14)), new q870(i870Var, null)), et7VarD4);
        kzh.d(new g1i(new n1i(new o870(new l870(wwd0Var14)), e1i.b(wwd0Var3), r870.v), new s870(i870Var, null)), et7VarD4);
        kzh.d(new g1i(new n1i(new p870(new m870(wwd0Var14)), new j870(wwd0Var10), t870.v), new u870(i870Var, null)), et7VarD4);
        et7 et7VarD5 = o8i0.d(this);
        String strY3 = y1();
        kzh.d(new g1i(new n1i(f670Var.f, f670Var.e, new h670(3, f670Var, f670.class, "createHeadToHeadStatsState", "createHeadToHeadStatsState(Lcom/sportybet/android/instantwin/presentation/scheduledfootball/model/ScheduledFootballHeadToHeadStatsInfoType;Lkotlin/Pair;)Lcom/sportybet/android/instantwin/presentation/scheduledfootball/model/state/ScheduledFootballHeadToHeadStatsState;", 4)), new i670(f670Var, null)), et7VarD5);
        kzh.d(new g1i(f670Var.c, new j670(f670Var, et7VarD5, strY3, null)), et7VarD5);
        kzh.d(new g1i(uzh.c(new f1i(e1i.b(wwd0Var2)), new e670(), tzhVar), new k670(f670Var, null)), et7VarD5);
        et7 et7VarD6 = o8i0.d(this);
        kzh.d(new g1i(r1i.c(new a570(new y470(wwd0Var14)), new w470(wwd0Var10), wwd0Var9, e1i.b(wwd0Var17), e1i.b(wwd0Var), new c570(6, j570Var, j570.class, "createEventScoreStatesByMatchdayId", "createEventScoreStatesByMatchdayId(Lcom/sportybet/android/instantwin/model/scheduledfootball/ScheduledFootballSessionData;JLjava/util/Map;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;", 4)), new d570(j570Var, null)), et7VarD6);
        kzh.d(new g1i(new n1i(new b570(new z470(wwd0Var14)), new x470(wwd0Var10), e570.v), new f570(j570Var, null)), et7VarD6);
        kzh.d(new g1i(j570Var.b, new g570(j570Var, null)), et7VarD6);
        kzh.d(new g1i(r1i.c(new af70(new ze70(wwd0Var14)), new ye70(wwd0Var10), wwd0Var9, e1i.b(wwd0Var17), e1i.b(wwd0Var), new bf70(6, we70Var, we70.class, "createLottiePlaybackStates", "createLottiePlaybackStates(Lcom/sportybet/android/instantwin/model/scheduledfootball/ScheduledFootballSessionData;JLjava/util/Map;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 4)), new cf70(we70Var, null)), o8i0.d(this));
        et7 et7VarD7 = o8i0.d(this);
        v340 v340VarB6 = e1i.b(wwd0Var17);
        v340 v340VarB7 = e1i.b(i870Var.a);
        v340 v340VarB8 = e1i.b(i870Var.b);
        v340 v340VarB9 = e1i.b(wwd0Var3);
        v340 v340VarB10 = e1i.b(wwd0Var20);
        v340 v340VarB11 = e1i.b(i870Var.f);
        v340 v340VarB12 = e1i.b(i870Var.g);
        v340 v340VarB13 = e1i.b(wwd0Var2);
        v340 v340VarB14 = e1i.b(we70Var.a);
        kzh.d(new g1i(new b270(new lyh[]{new h270(new e270(wwd0Var14)), new c270(wwd0Var10), v340VarB6, a270Var.b, v340VarB7, v340VarB8, v340VarB9, v340VarB10, v340VarB11, v340VarB12, v340VarB13, wwd0Var8, wwd0Var9, a270Var.e, e1i.b(j570Var.c), e1i.b(wwd0Var), v340VarB14}, a270Var), new o270(null, a270Var)), et7VarD7);
        kzh.d(new g1i(new i270(new f270(uzh.c(wwd0Var14, new z170(), tzhVar))), new p270(null, a270Var)), et7VarD7);
        kzh.d(new g1i(new n1i(new j270(new g270(wwd0Var14)), new d270(wwd0Var10), k270.v), new l270(null, a270Var)), et7VarD7);
        kzh.d(new g1i(a270Var.c, new m270(null, a270Var)), et7VarD7);
        kzh.d(new g1i(a270Var.f, new n270(null, a270Var)), et7VarD7);
        et7 et7VarD8 = o8i0.d(this);
        kzh.d(new g1i(wwd0Var8, new gi70(li70Var, null)), et7VarD8);
        kzh.d(new g1i(new di70(wwd0Var7), new hi70(li70Var, null)), et7VarD8);
        kzh.d(new g1i(new fi70(uzh.b(new n1i(wwd0Var8, new ei70(wwd0Var10), new ii70(3, null)))), new ji70(li70Var, null)), et7VarD8);
        et7 et7VarD9 = o8i0.d(this);
        kzh.d(new g1i(wwd0Var6, new vj70(bk70Var, null)), et7VarD9);
        kzh.d(new g1i(wwd0Var12, new wj70(bk70Var, null)), et7VarD9);
        kzh.d(new g1i(r0i.d(new n1i(new uj70(new tj70(wwd0Var14)), wwd0Var12, xj70.v), new yj70(bk70Var, null)), new zj70(bk70Var, null)), et7VarD9);
        kzh.d(new g1i(bk70Var.c.G0(bk70Var.d), new ak70(bk70Var, null)), et7VarD9);
        et7 et7VarD10 = o8i0.d(this);
        kzh.d(new g1i(wwd0Var6, new t970(aa70Var, null)), et7VarD10);
        kzh.d(new g1i(wwd0Var5, new u970(aa70Var, null)), et7VarD10);
        lyh lyhVarB = uzh.b(new p970(new o970(wwd0Var14)));
        kzh.d(new g1i(new s970(r1i.a(lyhVarB, uzh.b(new r970(wwd0Var5)), r0i.d(new n1i(uzh.b(new q970(lyhVarB)), uzh.c(wwd0Var5, new n970(0), tzhVar), y970.v), new z970(aa70Var, null)), v970.v), aa70Var), new w970(aa70Var, null)), et7VarD10);
        kzh.d(new g1i(aa70Var.c.G0(aa70Var.e), new x970(aa70Var, null)), et7VarD10);
        et7 et7VarD11 = o8i0.d(this);
        wwd0Var12.getClass();
        wwd0Var11.getClass();
        wwd0Var5.getClass();
        wwd0Var4.getClass();
        kzh.d(new g1i(wwd0Var8, new mf70(null, ff70Var)), et7VarD11);
        wwd0 wwd0Var22 = ff70Var.i;
        wwd0 wwd0Var23 = ff70Var.h;
        kf70 kf70Var = new kf70(new if70(wwd0Var14));
        hf70 hf70Var = new hf70(wwd0Var10);
        uy0 uy0Var2 = ff70Var.a;
        pu0.b bVar2 = pu0.b.a;
        lf70 lf70Var = new lf70(new jf70(uy0Var2.h(bVar2)));
        lyh<TaxConfigs> lyhVarP = ff70Var.b.p();
        jpk jpkVar2 = ff70Var.f;
        uwd0<List<GiftDetails>> uwd0VarP1 = jpkVar2.p1();
        bz3 bz3Var = bz3.SINGLE;
        kzh.d(new g1i(new gf70(new lyh[]{wwd0Var8, wwd0Var12, wwd0Var11, wwd0Var5, wwd0Var4, wwd0Var22, wwd0Var23, kf70Var, hf70Var, lf70Var, lyhVarP, uwd0VarP1, jpkVar2.G0(SimulateBetConsts.BetslipType.SINGLE)}, ff70Var), new nf70(null, ff70Var)), et7VarD11);
        et7 et7VarD12 = o8i0.d(this);
        wwd0 wwd0Var24 = bk70Var.g;
        wwd0Var12.getClass();
        wwd0Var11.getClass();
        wwd0Var24.getClass();
        kzh.d(new g1i(new f170(wwd0Var12), new i170(null, k170Var)), et7VarD12);
        wwd0 wwd0Var25 = k170Var.h;
        g170 g170Var = new g170(new d170(wwd0Var14));
        c170 c170Var = new c170(wwd0Var10);
        h170 h170Var = new h170(new e170(k170Var.a.h(bVar2)));
        lyh<TaxConfigs> lyhVarP2 = k170Var.b.p();
        jpk jpkVar3 = k170Var.f;
        kzh.d(new g1i(new b170(new lyh[]{wwd0Var8, wwd0Var12, wwd0Var11, wwd0Var24, wwd0Var25, g170Var, c170Var, h170Var, lyhVarP2, jpkVar3.p1(), jpkVar3.G0(SimulateBetConsts.BetslipType.SINGLE)}, k170Var), new j170(null, k170Var)), et7VarD12);
        et7 et7VarD13 = o8i0.d(this);
        wwd0 wwd0Var26 = aa70Var.h;
        wwd0Var5.getClass();
        wwd0Var4.getClass();
        wwd0Var26.getClass();
        kzh.d(new g1i(new v070(wwd0Var5), new y070(null, a170Var)), et7VarD13);
        wwd0 wwd0Var27 = a170Var.h;
        w070 w070Var = new w070(new t070(wwd0Var14));
        s070 s070Var = new s070(wwd0Var10);
        x070 x070Var = new x070(new u070(a170Var.a.h(bVar2)));
        lyh<TaxConfigs> lyhVarP3 = a170Var.b.p();
        jpk jpkVar4 = a170Var.f;
        kzh.d(new g1i(new r070(new lyh[]{wwd0Var8, wwd0Var5, wwd0Var4, wwd0Var26, wwd0Var27, w070Var, s070Var, x070Var, lyhVarP3, jpkVar4.p1(), jpkVar4.G0(SimulateBetConsts.BetslipType.MULTIPLE)}, a170Var), new z070(null, a170Var)), et7VarD13);
        et7 et7VarD14 = o8i0.d(this);
        wwd0 wwd0Var28 = k170Var.g;
        wwd0 wwd0Var29 = a170Var.g;
        wwd0Var12.getClass();
        wwd0Var5.getClass();
        kzh.d(new g1i(new i070(new n1i(wwd0Var12, wwd0Var5, l070.v)), new m070(null, q070Var)), et7VarD14);
        kzh.d(new g1i(r1i.a(q070Var.f, wwd0Var12, wwd0Var5, n070.v), new o070(null, q070Var)), et7VarD14);
        kzh.d(new g1i(new h070(new lyh[]{q070Var.d, new k070(new j070(q070Var.a.h(bVar2))), wwd0Var8, wwd0Var12, wwd0Var5, q070Var.e, wwd0Var28, wwd0Var29}, q070Var), new p070(null, q070Var)), et7VarD14);
        et7 et7VarD15 = o8i0.d(this);
        wwd0Var11.getClass();
        wwd0Var4.getClass();
        wwd0 wwd0Var30 = z270Var.e;
        lyh<TaxConfigs> lyhVarP4 = z270Var.a.p();
        jpk jpkVar5 = z270Var.c;
        kzh.d(new g1i(new a370(new lyh[]{wwd0Var11, wwd0Var4, wwd0Var30, lyhVarP4, jpkVar5.p1(), jpkVar5.G0(SimulateBetConsts.BetslipType.SINGLE), jpkVar5.G0(SimulateBetConsts.BetslipType.MULTIPLE)}, z270Var), new b370(null, z270Var)), et7VarD15);
        kzh.d(new g1i(new r370(t370Var.c, t370Var, y1()), new s370(t370Var, null)), o8i0.d(this));
        kzh.d(new g1i(new jm70(r0i.f(wwd0VarA, new im70(null, mm70Var)), mm70Var), new km70(null, mm70Var)), o8i0.d(this));
        et7 et7VarD16 = o8i0.d(this);
        String strY4 = y1();
        mgb0 mgb0Var2 = mb70Var.b;
        kzh.d(new g1i(mgb0Var2.isLoginFlow(), new ib70(mb70Var, strY4, null)), et7VarD16);
        kzh.d(new g1i(new f1i(r0i.f(new g1i(mgb0Var2.getAccountHolderFlow(), new jb70(null, mb70Var)), new gb70(null, mb70Var))), new kb70(2, mb70Var, mb70.class, "updateOpenBetsCountInfo", "updateOpenBetsCountInfo(Lcom/sportybet/android/instantwin/model/scheduledfootball/ScheduledFootballOpenBetsCountInfo;)V", 4)), et7VarD16);
        kzh.d(new g1i(new hb70(mb70Var.c), new lb70(null, mb70Var)), et7VarD16);
        kzh.d(new g1i(new cm70(new bm70(uzh.c(wwd0Var14, new zl70(0), tzhVar))), new dm70(null, this)), o8i0.d(this));
        kzh.d(new g1i(wwd0Var7, new am70(null, this)), o8i0.d(this));
    }

    public final void A1(tz60 tz60Var) {
        this.L.a(tz60Var, k00.d, k00.c);
    }

    public final boolean B1() {
        if (this.K.isLogin()) {
            return false;
        }
        this.V.a(c.b.e.a);
        return true;
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        this.J.E(str);
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return this.J.G0(str);
    }

    @Override // defpackage.jpk
    public final void H0() {
        this.J.H0();
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        this.J.I(str, str2, str3);
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.J.R0(z);
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        this.J.T0(str);
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.J.a0();
    }

    @Override // defpackage.jpk
    public final void b0() {
        this.J.b0();
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        this.J.j1(arrayList);
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.J.p1();
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        return this.J.t0(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        this.J.t1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.concurrent.CancellationException, jvd0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object x1(ni70 ni70Var, v1b<? super Unit> v1bVar) {
        a aVar;
        List list;
        String giftId;
        int kind;
        long jA;
        TicketParameter ticketParameter;
        Object value;
        Object objA;
        String str;
        int kind2;
        long jA2;
        Object value2;
        Object value3;
        Object obj;
        Object value4;
        wwd0 wwd0Var;
        Object value5;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar, this);
            }
        } else {
            aVar = new a(v1bVar, this);
        }
        Object obj2 = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        wwd0 wwd0Var2 = this.R;
        q070 q070Var = this.d;
        List list2 = null;
        if (i2 == 0) {
            uj50.b(obj2);
            int iOrdinal = q070Var.b().ordinal();
            String str2 = "";
            if (iOrdinal == 0) {
                list = null;
                bk70 bk70Var = this.H;
                bk70Var.getClass();
                ni70Var.getClass();
                ft90 ft90Var = (ft90) bk70Var.e.getValue();
                List<cz2> list3 = ft90Var.a;
                Map<String, String> map = ft90Var.b;
                ArrayList arrayList = new ArrayList(l48.r(list3, 10));
                for (cz2 cz2Var : list3) {
                    arrayList.add(new TicketParameter.Selection(cz2Var.a, cz2Var.b, cz2Var.c));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    String str3 = map.get(((cz2) it.next()).c);
                    BigDecimal bigDecimalG = str3 != null ? kotlin.text.b.g(str3) : null;
                    if (bigDecimalG != null) {
                        arrayList2.add(bigDecimalG);
                    }
                }
                ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                int i3 = 0;
                int i4 = 0;
                for (int size = arrayList2.size(); i4 < size; size = size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    arrayList3.add(new TicketParameter.Bet.Single(1, p54.c((BigDecimal) obj3).longValue(), i3));
                    i3 = i5;
                    str2 = str2;
                    arrayList2 = arrayList2;
                }
                String str4 = str2;
                m780 m780VarT0 = bk70Var.c.t0(bk70Var.d);
                if (m780VarT0 != null) {
                    GiftDetails giftDetails = m780VarT0.b;
                    giftId = giftDetails.getGiftId();
                    kind = giftDetails.getKind();
                    jA = m780VarT0.a();
                } else {
                    giftId = str4;
                    kind = 0;
                    jA = 0;
                }
                x270 x270Var = ni70Var.a;
                String str5 = x270Var.c;
                String str6 = bk70Var.d;
                int i6 = x270Var.e.a().a;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                bigDecimal.getClass();
                ticketParameter = new TicketParameter(str5, "", str6, arrayList, arrayList3, 0, null, i6, false, bigDecimal, giftId, kind, jA);
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        return Unit.a;
                    }
                    uhc.a();
                    return null;
                }
                aa70 aa70Var = this.C;
                aa70Var.getClass();
                ni70Var.getClass();
                x270 x270Var2 = ni70Var.a;
                nmw nmwVar = (nmw) aa70Var.f.getValue();
                List<cz2> list4 = nmwVar.a;
                BigDecimal bigDecimalG2 = kotlin.text.b.g(nmwVar.b);
                ArrayList arrayList4 = new ArrayList(l48.r(list4, 10));
                for (cz2 cz2Var2 : list4) {
                    arrayList4.add(new TicketParameter.Selection(cz2Var2.a, cz2Var2.b, cz2Var2.c));
                    list2 = list2;
                }
                list = list2;
                List listC = bigDecimalG2 != null ? kotlin.collections.a.c(new TicketParameter.Bet.NonSingle(nmwVar.c.size(), p54.c(bigDecimalG2).longValue())) : list;
                if (listC == null) {
                    listC = m2g.a;
                }
                List list5 = listC;
                m780 m780VarT1 = aa70Var.c.t0(aa70Var.e);
                if (m780VarT1 != null) {
                    GiftDetails giftDetails2 = m780VarT1.b;
                    String giftId2 = giftDetails2.getGiftId();
                    kind2 = giftDetails2.getKind();
                    str = giftId2;
                    jA2 = m780VarT1.a();
                } else {
                    str = "";
                    kind2 = 0;
                    jA2 = 0;
                }
                wr4 wr4Var = x270Var2.e;
                BigDecimal scale = p54.c(((lmw) aa70Var.g.getValue()).i).setScale(0, RoundingMode.FLOOR);
                String str7 = x270Var2.c;
                String str8 = aa70Var.e;
                int i7 = wr4Var.a().a;
                scale.getClass();
                ticketParameter = new TicketParameter(str7, "", str8, arrayList4, list5, 0, null, i7, false, scale, str, kind2, jA2);
            }
            TicketParameter ticketParameter2 = ticketParameter;
            InstantWinBetSource instantWinBetSource = q070Var.c() ? InstantWinBetSource.BETSLIP : InstantWinBetSource.QUICK_BET;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, lni0.b));
            aVar.c = 1;
            objA = this.c.a(ticketParameter2, instantWinBetSource, aVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj2);
            objA = ((zi50) obj2).a;
            list = null;
        }
        zi50.a aVar2 = zi50.b;
        if (!(objA instanceof zi50.b)) {
            do {
                value4 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value4, lni0.a));
            do {
                wwd0Var = this.S;
                value5 = wwd0Var.getValue();
            } while (!wwd0Var.g(value5, lni0.b));
            q070Var.a();
            this.E.a();
            this.F.a();
            this.a.g();
            jpk jpkVar = this.J;
            jpkVar.b0();
            jpkVar.T0(y1());
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            do {
                value2 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value2, lni0.a));
            wwd0 wwd0Var3 = this.w.c;
            do {
                value3 = wwd0Var3.getValue();
                if (thA instanceof SprThrowable) {
                    int d = ((SprThrowable) thA).getD();
                    if (d != 10017) {
                        switch (d) {
                            case 10003:
                                obj = q370.b.a;
                                break;
                            case 10004:
                                obj = q370.g.a;
                                break;
                            case 10005:
                                obj = q370.c.a;
                                break;
                            case 10006:
                                obj = q370.a.a;
                                break;
                            case 10007:
                                obj = q370.f.a;
                                break;
                            default:
                                obj = q370.e.a;
                                break;
                        }
                    } else {
                        obj = q370.d.a;
                    }
                } else {
                    obj = q370.e.a;
                }
            } while (!wwd0Var3.g(value3, obj));
        }
        jvd0 jvd0Var = this.Q;
        ?? r5 = list;
        if (jvd0Var != 0) {
            jvd0Var.cancel((CancellationException) r5);
        }
        this.Q = r5;
        return Unit.a;
    }

    public final String y1() {
        ScheduledFootballInput scheduledFootballInput = this.N;
        String str = scheduledFootballInput != null ? scheduledFootballInput.a : null;
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:204:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:371:0x0695  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v32, types: [m2g] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v19, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList] */
    public final void z1(b bVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        wwd0 wwd0Var;
        Object value5;
        Object value6;
        Object value7;
        Object next;
        Object next2;
        Object next3;
        z370 z370Var;
        Pair pair;
        List<g870> list;
        Object obj;
        List<z370> list2;
        Object next4;
        String str;
        List<z370> list3;
        Object value8;
        m670 m670Var;
        Object value9;
        m670 m670Var2;
        Object value10;
        m670 m670Var3;
        Object value11;
        ArrayList arrayList;
        Object value12;
        Object value13;
        ArrayList arrayList2;
        Object value14;
        ArrayList arrayList3;
        ?? arrayList4;
        h870 h870Var;
        v870 v870Var;
        w870 w870Var;
        List<z370> list4;
        z370 z370Var2;
        ?? arrayList5;
        Object next5;
        UiText resourceUiText;
        List<e970> list5;
        Object next6;
        List<z370> list6;
        z370 z370Var3;
        List<g870> list7;
        Object value15;
        Object value16;
        List<e970> list8;
        Object value17;
        ArrayList arrayList6;
        Object value18;
        Object value19;
        Object value20;
        Object value21;
        Object value22;
        c gVar;
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext;
        c fVar;
        bVar.getClass();
        boolean z = bVar instanceof b.q;
        int i = 0;
        jpk jpkVar = this.J;
        bk70 bk70Var = this.H;
        aa70 aa70Var = this.C;
        Pair pair2 = null;
        Object obj2 = null;
        g870Var = null;
        g870 g870Var = null;
        Object obj3 = null;
        Object obj4 = null;
        ku90<c> ku90Var = this.V;
        int i2 = 2;
        q070 q070Var = this.d;
        pj70 pj70Var = this.G;
        if (z) {
            b.q qVar = (b.q) bVar;
            if (qVar instanceof b.q.a) {
                gVar = c.b.a.a;
            } else if (qVar instanceof b.q.d) {
                gVar = c.b.e.a;
            } else {
                if (qVar instanceof b.q.C0329b) {
                    fVar = new c.b.C0335b(y1());
                } else if (qVar instanceof b.q.e) {
                    if (B1()) {
                        return;
                    }
                    ni70 ni70VarC = pj70Var.c();
                    ScheduledFootballServerTime scheduledFootballServerTime = ni70VarC != null ? ni70VarC.b : null;
                    if (scheduledFootballServerTime == null) {
                        return;
                    } else {
                        fVar = new c.b.f(y1(), scheduledFootballServerTime);
                    }
                } else if (qVar instanceof b.q.c) {
                    Integer numA = vcj.a(y1());
                    if (numA == null) {
                        return;
                    }
                    int iIntValue = numA.intValue();
                    bz3 bz3VarB = q070Var.b();
                    int iOrdinal = bz3VarB.ordinal();
                    if (iOrdinal == 0) {
                        instantWinGiftApplicabilityContext = new InstantWinGiftApplicabilityContext(new InstantWinGiftApplicabilityContext.BetSlipType.Single(((et90) bk70Var.f.getValue()).e, ((ft90) bk70Var.e.getValue()).d ? InstantWinGiftApplicabilityContext.BetCount.Multiple.a : new InstantWinGiftApplicabilityContext.BetCount.Single(1, 0)));
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return;
                        }
                        uhc.a();
                        return;
                    } else {
                        nmw nmwVar = (nmw) aa70Var.f.getValue();
                        BigDecimal bigDecimalG = kotlin.text.b.g(nmwVar.b);
                        if (bigDecimalG == null) {
                            bigDecimalG = BigDecimal.ZERO;
                        }
                        bigDecimalG.getClass();
                        instantWinGiftApplicabilityContext = new InstantWinGiftApplicabilityContext(new InstantWinGiftApplicabilityContext.BetSlipType.Multiple(bigDecimalG, nmwVar.f ? new InstantWinGiftApplicabilityContext.BetCount.Single(nmwVar.c.size(), 0) : InstantWinGiftApplicabilityContext.BetCount.Multiple.a, false, false));
                    }
                    int iOrdinal2 = bz3VarB.ordinal();
                    if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            return;
                        }
                        uhc.a();
                        return;
                    }
                    gVar = new c.b.d(new fqk(iIntValue, instantWinGiftApplicabilityContext, jpkVar.t0(bz3VarB.a)));
                } else {
                    if (!(qVar instanceof b.q.f)) {
                        uhc.a();
                        return;
                    }
                    gVar = new c.b.g(y1(), ((b.q.f) qVar).a);
                }
                gVar = fVar;
            }
            ku90Var.a(gVar);
            return;
        }
        if (bVar instanceof b.u) {
            jpkVar.t1();
            this.a.g();
            wwd0 wwd0Var2 = pj70Var.f;
            do {
                value22 = wwd0Var2.getValue();
                ((Number) value22).longValue();
            } while (!wwd0Var2.g(value22, Long.valueOf(System.currentTimeMillis())));
            return;
        }
        boolean z2 = bVar instanceof b.f;
        p770 p770Var = this.A;
        if (z2) {
            String str2 = ((b.f) bVar).a;
            wwd0 wwd0Var3 = p770Var.b;
            do {
                value21 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value21, str2));
            return;
        }
        if (bVar instanceof b.r) {
            b.r rVar = (b.r) bVar;
            boolean z3 = rVar instanceof b.r.d;
            td70 td70Var = this.D;
            if (z3) {
                wwd0 wwd0Var4 = td70Var.i;
                do {
                    value20 = wwd0Var4.getValue();
                } while (!wwd0Var4.g(value20, ve70.a));
                return;
            }
            if (rVar instanceof b.r.a) {
                wwd0 wwd0Var5 = td70Var.i;
                do {
                    value19 = wwd0Var5.getValue();
                } while (!wwd0Var5.g(value19, null));
                return;
            }
            if (rVar instanceof b.r.c) {
                ve70 ve70Var = ((b.r.c) rVar).a;
                wwd0 wwd0Var6 = td70Var.i;
                do {
                    value18 = wwd0Var6.getValue();
                } while (!wwd0Var6.g(value18, ve70Var));
                return;
            }
            if (!(rVar instanceof b.r.C0330b)) {
                uhc.a();
                return;
            }
            ve70 ve70Var2 = ((b.r.C0330b) rVar).a;
            td70Var.getClass();
            int iOrdinal3 = ve70Var2.ordinal();
            if (iOrdinal3 == 0) {
                td70Var.c.a(td70.a.b);
                return;
            } else if (iOrdinal3 == 1) {
                td70Var.f.a(td70.a.b);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        boolean z4 = bVar instanceof b.b0;
        a270 a270Var = this.i;
        if (z4) {
            a270Var.c.a(((b.b0) bVar).a);
            return;
        }
        boolean z5 = bVar instanceof b.g;
        i870 i870Var = this.B;
        if (z5) {
            b.g gVar2 = (b.g) bVar;
            String str3 = gVar2.a;
            String str4 = gVar2.b;
            wwd0 wwd0Var7 = i870Var.b;
            do {
                value17 = wwd0Var7.getValue();
                List<c970> list9 = (List) value17;
                arrayList6 = new ArrayList(l48.r(list9, 10));
                for (c970 c970Var : list9) {
                    if (c970Var.a.equals(str3)) {
                        c970Var = new c970(c970Var.a, str4);
                    }
                    arrayList6.add(c970Var);
                }
            } while (!wwd0Var7.g(value17, arrayList6));
            return;
        }
        if (bVar instanceof b.p) {
            b.p pVar = (b.p) bVar;
            if (!(pVar instanceof b.p.C0328b)) {
                if (!(pVar instanceof b.p.a)) {
                    uhc.a();
                    return;
                }
                wwd0 wwd0Var8 = i870Var.c;
                do {
                    value15 = wwd0Var8.getValue();
                } while (!wwd0Var8.g(value15, null));
                return;
            }
            String strA = p770Var.a();
            String str5 = ((b.p.C0328b) pVar).a;
            pj70Var.getClass();
            strA.getClass();
            l770 l770VarF = pj70Var.f(strA);
            if (l770VarF != null && (list8 = l770VarF.d) != null) {
                ArrayList arrayList7 = new ArrayList();
                Iterator it = list8.iterator();
                while (it.hasNext()) {
                    p48.w(((e970) it.next()).i, arrayList7);
                }
                ArrayList arrayList8 = new ArrayList();
                int size = arrayList7.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj5 = arrayList7.get(i3);
                    i3++;
                    p48.w(((z370) obj5).i, arrayList8);
                }
                int size2 = arrayList8.size();
                while (i < size2) {
                    Object obj6 = arrayList8.get(i);
                    i++;
                    if (((g870) obj6).e.equals(str5)) {
                        obj2 = obj6;
                        break;
                    }
                }
                g870Var = (g870) obj2;
            }
            if (g870Var == null) {
                return;
            }
            String str6 = g870Var.c;
            String str7 = g870Var.f;
            wwd0 wwd0Var9 = i870Var.c;
            do {
                value16 = wwd0Var9.getValue();
            } while (!wwd0Var9.g(value16, new ufo(str6, str7)));
            return;
        }
        if (bVar instanceof b.c0) {
            b.c0 c0Var = (b.c0) bVar;
            if (!(c0Var instanceof b.c0.C0325b)) {
                if (c0Var instanceof b.c0.a) {
                    i870Var.d();
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            b.c0.C0325b c0325b = (b.c0.C0325b) c0Var;
            String str8 = c0325b.a;
            String str9 = c0325b.b;
            String strA2 = p770Var.a();
            pj70Var.getClass();
            strA2.getClass();
            uag uagVar = sfh0.d;
            ArrayList arrayList9 = new ArrayList(l48.r(uagVar, 10));
            q3.b bVar2 = new q3.b();
            while (bVar2.hasNext()) {
                arrayList9.add(((sfh0) bVar2.next()).a);
            }
            l770 l770VarF2 = pj70Var.f(strA2);
            if (l770VarF2 == null || (list5 = l770VarF2.d) == null) {
                arrayList5 = 0;
            } else {
                Iterator it2 = list5.iterator();
                do {
                    if (!it2.hasNext()) {
                        next6 = null;
                        break;
                    }
                    next6 = it2.next();
                } while (!((e970) next6).a.equals(str8));
                e970 e970Var = (e970) next6;
                if (e970Var == null || (list6 = e970Var.i) == null || (z370Var3 = (z370) CollectionsKt.firstOrNull(list6)) == null || (list7 = z370Var3.i) == null) {
                    arrayList5 = 0;
                } else {
                    ?? linkedHashMap = new LinkedHashMap();
                    for (Object obj7 : list7) {
                        String str10 = ((g870) obj7).e;
                        ?? A = linkedHashMap.get(str10);
                        if (A == null) {
                            A = r9i.a(str10, linkedHashMap);
                        }
                        ((List) A).add(obj7);
                    }
                    List list10 = (List) linkedHashMap.get(str9);
                    if (list10 != null) {
                        arrayList5 = new ArrayList(l48.r(list10, 10));
                        Iterator it3 = list10.iterator();
                        while (it3.hasNext()) {
                            String str11 = (String) CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default(((g870) it3.next()).d, new String[]{";"}, false, 0, 6, null));
                            if (str11 == null) {
                                str11 = "";
                            }
                            arrayList5.add(str11);
                        }
                    } else {
                        arrayList5 = 0;
                    }
                }
            }
            if (arrayList5 == 0) {
                arrayList5 = m2g.a;
            }
            ArrayList arrayListI0 = CollectionsKt.i0(arrayList5, arrayList9);
            i870Var.getClass();
            Iterator it4 = ((List) e1i.b(i870Var.d).a.getValue()).iterator();
            do {
                if (!it4.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it4.next();
            } while (!Intrinsics.g(((bl70) next5).a, str9));
            bl70 bl70Var = (bl70) next5;
            String str12 = bl70Var != null ? bl70Var.b : null;
            String str13 = str12 != null ? str12 : "";
            wwd0 wwd0Var10 = i870Var.e;
            while (true) {
                Object value23 = wwd0Var10.getValue();
                ArrayList arrayList10 = new ArrayList(l48.r(arrayListI0, 10));
                int size3 = arrayListI0.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj8 = arrayListI0.get(i4);
                    i4++;
                    String str14 = (String) obj8;
                    sfh0.b.getClass();
                    sfh0 sfh0VarA = sfh0.a.a(str14);
                    int i5 = sfh0VarA == null ? -1 : i870.a.a[sfh0VarA.ordinal()];
                    if (i5 == 1) {
                        StringUiText stringUiText = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.common_functions__near_odds);
                    } else if (i5 != i2) {
                        resourceUiText = vch0.d(str14);
                    } else {
                        StringUiText stringUiText2 = vch0.a;
                        resourceUiText = new ResourceUiText(R.string.common_functions__far_odds);
                    }
                    arrayList10.add(new gfh0(resourceUiText, str14, Intrinsics.g(str14, str13)));
                    i2 = 2;
                }
                if (wwd0Var10.g(value23, new al70(a4h.b(arrayList10), str8, str9))) {
                    return;
                } else {
                    i2 = 2;
                }
            }
        } else {
            if (bVar instanceof b.i) {
                b.i iVar = (b.i) bVar;
                l770 l770VarF3 = pj70Var.f(p770Var.a());
                if (l770VarF3 == null) {
                    return;
                }
                String str15 = iVar.b;
                String str16 = iVar.c;
                wwd0 wwd0Var11 = i870Var.d;
                do {
                    value13 = wwd0Var11.getValue();
                    List<bl70> list11 = (List) value13;
                    arrayList2 = new ArrayList(l48.r(list11, 10));
                    for (bl70 bl70Var2 : list11) {
                        if (Intrinsics.g(bl70Var2.a, str15)) {
                            i = !bl70Var2.b.equals(str16) ? 1 : 0;
                            String str17 = bl70Var2.a;
                            str17.getClass();
                            bl70Var2 = new bl70(str17, str16);
                        }
                        arrayList2.add(bl70Var2);
                    }
                } while (!wwd0Var11.g(value13, arrayList2));
                if (i == 0) {
                    return;
                }
                e970 e970Var2 = (e970) CollectionsKt.firstOrNull(l770VarF3.d);
                List<g870> list12 = (e970Var2 == null || (list4 = e970Var2.i) == null || (z370Var2 = (z370) CollectionsKt.firstOrNull(list4)) == null) ? null : z370Var2.i;
                wwd0 wwd0Var12 = i870Var.f;
                do {
                    value14 = wwd0Var12.getValue();
                    List<ck70> list13 = (List) value14;
                    arrayList3 = new ArrayList(l48.r(list13, 10));
                    for (ck70 ck70VarA : list13) {
                        if (Intrinsics.g(ck70VarA.c, str15)) {
                            if (list12 != null) {
                                arrayList4 = new ArrayList();
                                for (Object obj9 : list12) {
                                    g870 g870Var2 = (g870) obj9;
                                    if (g870Var2.e.equals(str15) && (h870Var = g870Var2.g) != null && (v870Var = h870Var.d) != null && (w870Var = v870Var.a) != null && w870Var == w870.COMBO) {
                                        arrayList4.add(obj9);
                                    }
                                }
                            } else {
                                arrayList4 = 0;
                            }
                            if (arrayList4 == 0) {
                                arrayList4 = m2g.a;
                            }
                            ck70VarA = ck70.a(ck70VarA, i870.a(str16, arrayList4));
                        }
                        arrayList3.add(ck70VarA);
                    }
                } while (!wwd0Var12.g(value14, arrayList3));
                return;
            }
            if (bVar instanceof b.x) {
                b.x xVar = (b.x) bVar;
                if (!(xVar instanceof b.x.C0332b)) {
                    if (xVar instanceof b.x.a) {
                        i870Var.c();
                        return;
                    } else {
                        uhc.a();
                        return;
                    }
                }
                b.x.C0332b c0332b = (b.x.C0332b) xVar;
                String str18 = c0332b.a;
                String str19 = c0332b.b;
                for (Object obj10 : (Iterable) e1i.b(i870Var.f).a.getValue()) {
                    ck70 ck70Var = (ck70) obj10;
                    if (ck70Var.b.equals(str18) && Intrinsics.g(ck70Var.c, str19)) {
                        obj3 = obj10;
                        break;
                    }
                }
                ck70 ck70Var2 = (ck70) obj3;
                if (ck70Var2 == null) {
                    return;
                }
                wwd0 wwd0Var13 = i870Var.g;
                do {
                    value12 = wwd0Var13.getValue();
                } while (!wwd0Var13.g(value12, ck70Var2));
                return;
            }
            if (bVar instanceof b.h) {
                b.h hVar = (b.h) bVar;
                String str20 = hVar.a;
                String str21 = hVar.b;
                String str22 = hVar.c;
                wwd0 wwd0Var14 = i870Var.f;
                do {
                    value11 = wwd0Var14.getValue();
                    List<ck70> list14 = (List) value11;
                    arrayList = new ArrayList(l48.r(list14, 10));
                    for (ck70 ck70VarA2 : list14) {
                        if (ck70VarA2.b.equals(str20) && Intrinsics.g(ck70VarA2.c, str21)) {
                            ck70VarA2 = ck70.a(ck70VarA2, str22);
                        }
                        arrayList.add(ck70VarA2);
                    }
                } while (!wwd0Var14.g(value11, arrayList));
                return;
            }
            if (bVar instanceof b.o) {
                b.o oVar = (b.o) bVar;
                boolean z6 = oVar instanceof b.o.f;
                f670 f670Var = this.z;
                if (z6) {
                    b.o.f fVar2 = (b.o.f) oVar;
                    String str23 = fVar2.a;
                    String str24 = fVar2.b;
                    Pair pair3 = (Pair) f670Var.e.getValue();
                    if (Intrinsics.g(pair3 != null ? (String) pair3.a : null, str23)) {
                        f670Var.a();
                        return;
                    }
                    f670Var.c.a(str23);
                    wwd0 wwd0Var15 = f670Var.f;
                    do {
                        value10 = wwd0Var15.getValue();
                        int iHashCode = str24.hashCode();
                        if (iHashCode != 1569) {
                            if (iHashCode != 3199) {
                                if (iHashCode == 3303 ? str24.equals("gn") : iHashCode == 3558 && str24.equals("ou")) {
                                    m670Var3 = m670.b;
                                }
                            } else if (str24.equals("dc")) {
                                m670Var3 = m670.a;
                            }
                            m670Var3 = m670.a;
                        } else if (str24.equals("12")) {
                            m670Var3 = m670.a;
                        } else {
                            m670Var3 = m670.a;
                        }
                    } while (!wwd0Var15.g(value10, m670Var3));
                    return;
                }
                if (oVar instanceof b.o.d) {
                    wwd0 wwd0Var16 = f670Var.f;
                    do {
                        value9 = wwd0Var16.getValue();
                        m670Var2 = (m670) value9;
                    } while (!wwd0Var16.g(value9, m670Var2 != null ? (m670) m670.d.get(Math.max(m670Var2.ordinal() - 1, 0)) : null));
                    return;
                }
                if (oVar instanceof b.o.c) {
                    wwd0 wwd0Var17 = f670Var.f;
                    do {
                        value8 = wwd0Var17.getValue();
                        m670 m670Var4 = (m670) value8;
                        if (m670Var4 != null) {
                            uag uagVar2 = m670.d;
                            m670Var = (m670) uagVar2.get(Math.min(m670Var4.ordinal() + 1, kotlin.collections.b.j(uagVar2)));
                        } else {
                            m670Var = null;
                        }
                    } while (!wwd0Var17.g(value8, m670Var));
                    return;
                }
                if (oVar instanceof b.o.a) {
                    f670Var.a();
                    return;
                }
                if (!(oVar instanceof b.o.C0327b)) {
                    if (oVar instanceof b.o.e) {
                        f670Var.c.a(((b.o.e) oVar).a);
                        return;
                    } else {
                        uhc.a();
                        return;
                    }
                }
                l770 l770VarF4 = pj70Var.f(p770Var.a());
                if (l770VarF4 == null) {
                    return;
                }
                String str25 = ((b.o.C0327b) oVar).a;
                Pair pair4 = (Pair) f670Var.e.getValue();
                if (pair4 == null || (str = (String) pair4.a) == null) {
                    return;
                }
                for (Object obj11 : l770VarF4.d) {
                    if (((e970) obj11).a.equals(str25)) {
                        obj4 = obj11;
                        break;
                    }
                }
                e970 e970Var3 = (e970) obj4;
                if (e970Var3 == null || (list3 = e970Var3.i) == null || list3.isEmpty()) {
                    return;
                }
                Iterator it5 = list3.iterator();
                while (it5.hasNext()) {
                    if (((z370) it5.next()).a.equals(str)) {
                        f670Var.a();
                        return;
                    }
                }
                return;
            }
            boolean z7 = bVar instanceof b.d0;
            li70 li70Var = this.F;
            if (!z7) {
                if (bVar instanceof b.e) {
                    b.e eVar = (b.e) bVar;
                    String str26 = eVar.a;
                    String str27 = eVar.b;
                    j570 j570Var = this.y;
                    j570Var.getClass();
                    j570Var.b.a(new q570(str26, str27));
                    return;
                }
                if (bVar instanceof b.a0) {
                    a270Var.f.a(((b.a0) bVar).a);
                    return;
                }
                if (bVar instanceof b.t) {
                    String str28 = ((b.t) bVar).a;
                    ni70 ni70VarC2 = pj70Var.c();
                    if (ni70VarC2 == null) {
                        return;
                    }
                    for (l770 l770Var : ni70VarC2.c) {
                        Iterator it6 = l770Var.d.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it6.next();
                        } while (!((e970) next).a.equals(str28));
                        e970 e970Var4 = (e970) next;
                        Pair pair5 = e970Var4 != null ? new Pair(l770Var, e970Var4) : null;
                        if (pair5 != null) {
                            pair2 = pair5;
                            break;
                        }
                    }
                    if (pair2 != null) {
                        pj70Var.j.a(pair2);
                        return;
                    }
                    return;
                }
                boolean z8 = bVar instanceof b.k;
                ff70 ff70Var = this.E;
                if (z8) {
                    ff70Var.a();
                    return;
                }
                if (bVar instanceof b.c) {
                    b.c cVar = (b.c) bVar;
                    if (!(cVar instanceof b.c.C0324b)) {
                        if (cVar instanceof b.c.a) {
                            q070Var.a();
                            return;
                        } else {
                            uhc.a();
                            return;
                        }
                    }
                    if (B1()) {
                        return;
                    }
                    if (((List) li70Var.b.getValue()).isEmpty()) {
                        z1(b.a.f.a);
                        return;
                    }
                    wwd0 wwd0Var18 = q070Var.d;
                    do {
                        value7 = wwd0Var18.getValue();
                    } while (!wwd0Var18.g(value7, lni0.b));
                    return;
                }
                if (bVar instanceof b.z) {
                    b.z zVar = (b.z) bVar;
                    if (zVar instanceof b.z.d) {
                        zrd0 zrd0Var = ((b.z.d) zVar).a;
                        wwd0 wwd0Var19 = ff70Var.h;
                        do {
                            value6 = wwd0Var19.getValue();
                        } while (!wwd0Var19.g(value6, zrd0Var));
                        return;
                    }
                    if (zVar instanceof b.z.C0334b) {
                        ff70Var.b();
                        return;
                    }
                    boolean z9 = zVar instanceof b.z.c;
                    k170 k170Var = this.f;
                    a170 a170Var = this.e;
                    if (z9) {
                        int iOrdinal4 = q070Var.b().ordinal();
                        if (iOrdinal4 == 0) {
                            k170Var.b(((b.z.c) zVar).a);
                            return;
                        } else if (iOrdinal4 == 1) {
                            a170Var.b(((b.z.c) zVar).a);
                            return;
                        } else {
                            if (iOrdinal4 == 2) {
                                return;
                            }
                            uhc.a();
                            return;
                        }
                    }
                    if (!(zVar instanceof b.z.a)) {
                        uhc.a();
                        return;
                    }
                    int iOrdinal5 = q070Var.b().ordinal();
                    if (iOrdinal5 == 0) {
                        k170Var.a();
                        return;
                    } else if (iOrdinal5 == 1) {
                        a170Var.a();
                        return;
                    } else {
                        if (iOrdinal5 == 2) {
                            return;
                        }
                        uhc.a();
                        return;
                    }
                }
                if (bVar instanceof b.y) {
                    b.y yVar = (b.y) bVar;
                    bz3 bz3VarB2 = q070Var.b();
                    if (yVar instanceof b.y.d) {
                        int iOrdinal6 = bz3VarB2.ordinal();
                        if (iOrdinal6 == 0) {
                            b.y.d dVar = (b.y.d) yVar;
                            bk70Var.d(dVar.a, dVar.b);
                            return;
                        } else if (iOrdinal6 == 1) {
                            b.y.d dVar2 = (b.y.d) yVar;
                            aa70Var.d(dVar2.a, dVar2.b);
                            return;
                        } else {
                            if (iOrdinal6 == 2) {
                                return;
                            }
                            uhc.a();
                            return;
                        }
                    }
                    if (yVar instanceof b.y.e) {
                        int iOrdinal7 = bz3VarB2.ordinal();
                        if (iOrdinal7 == 0) {
                            b.y.e eVar2 = (b.y.e) yVar;
                            bk70Var.e(eVar2.a, eVar2.b);
                            return;
                        } else if (iOrdinal7 == 1) {
                            b.y.e eVar3 = (b.y.e) yVar;
                            aa70Var.e(eVar3.a, eVar3.b);
                            return;
                        } else {
                            if (iOrdinal7 == 2) {
                                return;
                            }
                            uhc.a();
                            return;
                        }
                    }
                    if (yVar instanceof b.y.C0333b) {
                        int iOrdinal8 = bz3VarB2.ordinal();
                        if (iOrdinal8 == 0) {
                            bk70Var.c(((b.y.C0333b) yVar).a);
                            return;
                        } else if (iOrdinal8 == 1) {
                            aa70Var.c(((b.y.C0333b) yVar).a);
                            return;
                        } else {
                            if (iOrdinal8 == 2) {
                                return;
                            }
                            uhc.a();
                            return;
                        }
                    }
                    if (yVar instanceof b.y.a) {
                        int iOrdinal9 = bz3VarB2.ordinal();
                        if (iOrdinal9 == 0) {
                            bk70Var.a(((b.y.a) yVar).a);
                            return;
                        } else if (iOrdinal9 == 1) {
                            aa70Var.a(((b.y.a) yVar).a);
                            return;
                        } else {
                            if (iOrdinal9 == 2) {
                                return;
                            }
                            uhc.a();
                            return;
                        }
                    }
                    if (!(yVar instanceof b.y.c)) {
                        uhc.a();
                        return;
                    }
                    int iOrdinal10 = bz3VarB2.ordinal();
                    if (iOrdinal10 == 0) {
                        b.y.c cVar2 = (b.y.c) yVar;
                        bk70Var.b(cVar2.a, cVar2.b);
                        return;
                    } else if (iOrdinal10 == 1) {
                        b.y.c cVar3 = (b.y.c) yVar;
                        aa70Var.b(cVar3.a, cVar3.b);
                        return;
                    } else {
                        if (iOrdinal10 == 2) {
                            return;
                        }
                        uhc.a();
                        return;
                    }
                }
                if (bVar instanceof b.v) {
                    b.v vVar = (b.v) bVar;
                    if (vVar instanceof b.v.c) {
                        if (li70Var.d() == 1 && q070Var.c()) {
                            z1(b.a.g.a);
                            return;
                        } else {
                            li70Var.c(((b.v.c) vVar).a);
                            return;
                        }
                    }
                    if (vVar instanceof b.v.C0331b) {
                        li70Var.b(pj70Var.d());
                        return;
                    } else if (!(vVar instanceof b.v.a)) {
                        uhc.a();
                        return;
                    } else {
                        q070Var.a();
                        li70Var.a();
                        return;
                    }
                }
                if (bVar instanceof b.d) {
                    q070Var.d(((b.d) bVar).a);
                    return;
                }
                boolean z10 = bVar instanceof b.l;
                z270 z270Var = this.v;
                if (z10) {
                    b.l lVar = (b.l) bVar;
                    if (lVar instanceof b.l.C0326b) {
                        z270Var.b(q070Var.b());
                        return;
                    } else if (lVar instanceof b.l.a) {
                        z270Var.a();
                        return;
                    } else {
                        uhc.a();
                        return;
                    }
                }
                if (bVar instanceof b.j) {
                    ku90Var.a(c.a.a);
                    return;
                }
                if (bVar instanceof b.s) {
                    z270Var.a();
                    jvd0 jvd0Var = this.Q;
                    if (jvd0Var != null) {
                        jvd0Var.cancel((CancellationException) null);
                    }
                    this.Q = ej5.c(o8i0.d(this), null, null, new em70(null, this), 3);
                    return;
                }
                if (bVar instanceof b.m) {
                    do {
                        wwd0Var = this.S;
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, lni0.a));
                    return;
                }
                if (!(bVar instanceof b.a)) {
                    if (bVar instanceof b.n) {
                        this.I.a();
                        return;
                    }
                    if (!(bVar instanceof b.InterfaceC0322b)) {
                        if (!(bVar instanceof b.w)) {
                            uhc.a();
                            return;
                        }
                        et7 et7VarD = o8i0.d(this);
                        int iD = li70Var.d();
                        x370 x370Var = this.M;
                        x370Var.getClass();
                        jvd0 jvd0Var2 = x370Var.c;
                        if (jvd0Var2 != null) {
                            jvd0Var2.cancel((CancellationException) null);
                        }
                        x370Var.c = ej5.c(et7VarD, null, null, new u370(x370Var, iD, null), 3);
                        return;
                    }
                    b.InterfaceC0322b interfaceC0322b = (b.InterfaceC0322b) bVar;
                    if (interfaceC0322b instanceof b.InterfaceC0322b.a) {
                        b.InterfaceC0322b.a aVar = (b.InterfaceC0322b.a) interfaceC0322b;
                        int i6 = aVar.a;
                        int i7 = aVar.b;
                        if (i7 <= 0) {
                            return;
                        }
                        A1(new tz60.b(i6, i7));
                        return;
                    }
                    if (interfaceC0322b instanceof b.InterfaceC0322b.C0323b) {
                        A1(new tz60.c(tz60.c.a.BETSLIP));
                        return;
                    }
                    if (interfaceC0322b instanceof b.InterfaceC0322b.c) {
                        A1(new tz60.c(tz60.c.a.QUICKBET));
                        return;
                    }
                    if (interfaceC0322b instanceof b.InterfaceC0322b.d) {
                        A1(new tz60.e(0));
                        return;
                    }
                    if (interfaceC0322b instanceof b.InterfaceC0322b.e) {
                        A1(new tz60.k(0));
                        return;
                    } else if (interfaceC0322b instanceof b.InterfaceC0322b.f) {
                        A1(new tz60.l(0));
                        return;
                    } else {
                        uhc.a();
                        return;
                    }
                }
                b.a aVar2 = (b.a) bVar;
                if (aVar2 instanceof b.a.d) {
                    pj70Var.b();
                    return;
                }
                boolean z11 = aVar2 instanceof b.a.f;
                wwd0 wwd0Var20 = this.T;
                if (z11) {
                    do {
                        value4 = wwd0Var20.getValue();
                    } while (!wwd0Var20.g(value4, new zs.b((UiText) null, vch0.c(R.string.page_instant_virtual__please_make_at_least_vnum_vselecttext, "1", vch0.b(R.string.common_functions__l_selection)), vch0.b(R.string.common_functions__ok), 9)));
                    return;
                }
                if (aVar2 instanceof b.a.C0321b) {
                    do {
                        value3 = wwd0Var20.getValue();
                    } while (!wwd0Var20.g(value3, zs.a.a));
                    return;
                }
                boolean z12 = aVar2 instanceof b.a.g;
                wwd0 wwd0Var21 = this.U;
                if (z12) {
                    do {
                        value2 = wwd0Var21.getValue();
                    } while (!wwd0Var21.g(value2, new zs.b(vch0.b(R.string.component_betslip__confirm_remove_all_title), vch0.b(R.string.component_betslip__confirm_remove_all_content), vch0.b(R.string.common_functions__ok), vch0.b(R.string.common_functions__later))));
                    return;
                }
                if (aVar2 instanceof b.a.c) {
                    do {
                        value = wwd0Var21.getValue();
                    } while (!wwd0Var21.g(value, zs.a.a));
                    return;
                }
                boolean z13 = aVar2 instanceof b.a.e;
                t370 t370Var = this.w;
                if (z13) {
                    q370 q370VarB = t370Var.b();
                    if (Intrinsics.g(q370VarB, q370.d.a)) {
                        ku90Var.a(c.b.C0336c.a);
                        return;
                    }
                    if (Intrinsics.g(q370VarB, q370.a.a) || Intrinsics.g(q370VarB, q370.b.a) || Intrinsics.g(q370VarB, q370.c.a) || Intrinsics.g(q370VarB, q370.e.a) || Intrinsics.g(q370VarB, q370.f.a) || Intrinsics.g(q370VarB, q370.g.a) || q370VarB == null) {
                        return;
                    }
                    uhc.a();
                    return;
                }
                if (!(aVar2 instanceof b.a.C0320a)) {
                    uhc.a();
                    return;
                }
                q370 q370VarB2 = t370Var.b();
                if (Intrinsics.g(q370VarB2, q370.b.a)) {
                    ku90Var.a(c.b.a.a);
                } else if (Intrinsics.g(q370VarB2, q370.c.a)) {
                    H0();
                } else if (!Intrinsics.g(q370VarB2, q370.a.a) && !Intrinsics.g(q370VarB2, q370.d.a) && !Intrinsics.g(q370VarB2, q370.e.a) && !Intrinsics.g(q370VarB2, q370.f.a) && !Intrinsics.g(q370VarB2, q370.g.a) && q370VarB2 != null) {
                    uhc.a();
                    return;
                }
                t370Var.a();
                return;
            }
            b.d0 d0Var = (b.d0) bVar;
            if (B1()) {
                return;
            }
            String str29 = d0Var.a;
            String str30 = d0Var.b;
            String str31 = d0Var.c;
            l770 l770VarF5 = pj70Var.f(p770Var.a());
            if (l770VarF5 == null) {
                return;
            }
            wwd0 wwd0Var22 = li70Var.b;
            while (true) {
                Object value24 = wwd0Var22.getValue();
                ?? J0 = (List) value24;
                Iterator it7 = J0.iterator();
                do {
                    if (!it7.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it7.next();
                } while (!((bi70) next2).f.a.equals(str31));
                bi70 bi70Var = (bi70) next2;
                if (bi70Var != null) {
                    J0 = CollectionsKt.g0(J0, bi70Var);
                } else {
                    Iterator it8 = l770VarF5.d.iterator();
                    do {
                        if (!it8.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it8.next();
                    } while (!((e970) next3).a.equals(str29));
                    e970 e970Var5 = (e970) next3;
                    if (e970Var5 == null || (list2 = e970Var5.i) == null) {
                        z370Var = null;
                    } else {
                        Iterator it9 = list2.iterator();
                        do {
                            if (!it9.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it9.next();
                        } while (!((z370) next4).a.equals(str30));
                        z370Var = (z370) next4;
                    }
                    if (z370Var == null || (list = z370Var.i) == null) {
                        pair = null;
                        break;
                    }
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            pair = null;
                            break;
                        }
                        g870 g870Var3 = (g870) it10.next();
                        ArrayList arrayList11 = g870Var3.i;
                        int size4 = arrayList11.size();
                        int i8 = i;
                        do {
                            if (i8 >= size4) {
                                obj = null;
                                break;
                            } else {
                                obj = arrayList11.get(i8);
                                i8++;
                            }
                        } while (!((ad70) obj).a.equals(str31));
                        ad70 ad70Var = (ad70) obj;
                        pair = ad70Var == null ? null : new Pair(g870Var3, ad70Var);
                        if (pair != null) {
                            break;
                        } else {
                            i = 0;
                        }
                    }
                    if (e970Var5 != null && z370Var != null && pair != null) {
                        J0 = CollectionsKt.j0(J0, new bi70(str29, l770VarF5, e970Var5, z370Var, (g870) pair.a, (ad70) pair.b));
                    }
                }
                if (wwd0Var22.g(value24, J0)) {
                    return;
                } else {
                    i = 0;
                }
            }
        }
    }
}
