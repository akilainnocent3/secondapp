package com.sportybet.android.instantwin.presentation.legends;

import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfo;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoBetOddsBetBuilder;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoBetOddsCommon;
import com.sportybet.android.instantwin.model.legends.SportyLegendsSettlementRoundInfoEvent;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderSelection;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.abc0;
import defpackage.akc0;
import defpackage.bdc0;
import defpackage.bgc0;
import defpackage.bkc0;
import defpackage.boc0;
import defpackage.bs3;
import defpackage.bz3;
import defpackage.c0d;
import defpackage.cbc0;
import defpackage.cdc0;
import defpackage.cgc0;
import defpackage.ch2;
import defpackage.cmo;
import defpackage.coc0;
import defpackage.d880;
import defpackage.dbc0;
import defpackage.dgc0;
import defpackage.dj5;
import defpackage.dmc0;
import defpackage.doc0;
import defpackage.e1i;
import defpackage.ebc0;
import defpackage.egc0;
import defpackage.ei2;
import defpackage.ej5;
import defpackage.emc0;
import defpackage.enc0;
import defpackage.eoc0;
import defpackage.et7;
import defpackage.fac0;
import defpackage.fbc0;
import defpackage.ffc0;
import defpackage.fgc0;
import defpackage.fi2;
import defpackage.fmc0;
import defpackage.fnc0;
import defpackage.foc0;
import defpackage.fqk;
import defpackage.fqo;
import defpackage.g1i;
import defpackage.gbc0;
import defpackage.gcc0;
import defpackage.gfc0;
import defpackage.ggc0;
import defpackage.gh2;
import defpackage.gmc0;
import defpackage.goc0;
import defpackage.hbc0;
import defpackage.hcc0;
import defpackage.heo;
import defpackage.hfc0;
import defpackage.hgc0;
import defpackage.hm3;
import defpackage.hmc0;
import defpackage.hn9;
import defpackage.ib5;
import defpackage.ibc0;
import defpackage.icc0;
import defpackage.igc0;
import defpackage.ihy;
import defpackage.ikc;
import defpackage.ikc0;
import defpackage.ink;
import defpackage.j8i0;
import defpackage.j8o;
import defpackage.jbc0;
import defpackage.jkc0;
import defpackage.jpk;
import defpackage.jpu;
import defpackage.jqc;
import defpackage.jqc0;
import defpackage.jvd0;
import defpackage.kjc0;
import defpackage.kk3;
import defpackage.kkc0;
import defpackage.kqc0;
import defpackage.kqo;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.l48;
import defpackage.lcc0;
import defpackage.lfo;
import defpackage.lgc0;
import defpackage.ljc0;
import defpackage.lkc0;
import defpackage.lni0;
import defpackage.lqc0;
import defpackage.lx30;
import defpackage.lyh;
import defpackage.m2g;
import defpackage.m780;
import defpackage.mec0;
import defpackage.mgb0;
import defpackage.mgc0;
import defpackage.mkc0;
import defpackage.mqc0;
import defpackage.mwd0;
import defpackage.n1i;
import defpackage.n4p;
import defpackage.nkc0;
import defpackage.nqc;
import defpackage.nqc0;
import defpackage.o0f;
import defpackage.o2g;
import defpackage.o8i0;
import defpackage.oec0;
import defpackage.ogo;
import defpackage.oqc0;
import defpackage.or60;
import defpackage.ozh;
import defpackage.p48;
import defpackage.pac0;
import defpackage.pbc0;
import defpackage.pec0;
import defpackage.pfd;
import defpackage.pjc0;
import defpackage.pqc0;
import defpackage.psm;
import defpackage.pu0;
import defpackage.qbc0;
import defpackage.qcn;
import defpackage.qec0;
import defpackage.qqc0;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.rbc0;
import defpackage.rec0;
import defpackage.rh2;
import defpackage.rmc0;
import defpackage.rqc0;
import defpackage.sbc0;
import defpackage.sdc0;
import defpackage.sec0;
import defpackage.sjc0;
import defpackage.sk3;
import defpackage.sqc0;
import defpackage.t340;
import defpackage.tec0;
import defpackage.tho;
import defpackage.tje0;
import defpackage.tmc0;
import defpackage.tqc0;
import defpackage.ufo;
import defpackage.uhc;
import defpackage.uhc0;
import defpackage.uj50;
import defpackage.umc0;
import defpackage.uqc0;
import defpackage.uwd0;
import defpackage.uxb;
import defpackage.uy0;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.v9c0;
import defpackage.vch0;
import defpackage.vcj;
import defpackage.vmc0;
import defpackage.vqc0;
import defpackage.vu60;
import defpackage.w4s;
import defpackage.w9c0;
import defpackage.wac0;
import defpackage.wbc0;
import defpackage.wjc0;
import defpackage.wmc0;
import defpackage.wqc0;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.x2f;
import defpackage.x4s;
import defpackage.xac0;
import defpackage.xbc0;
import defpackage.xjc0;
import defpackage.xmc0;
import defpackage.xnc0;
import defpackage.xwd0;
import defpackage.xxb;
import defpackage.y5b;
import defpackage.yac0;
import defpackage.ybc0;
import defpackage.yho;
import defpackage.yy50;
import defpackage.z76;
import defpackage.zac0;
import defpackage.zi50;
import defpackage.zkh;
import defpackage.zrd0;
import defpackage.zs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/legends/d;", "Lj8i0;", "Ljpk;", "Lihy;", "", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d extends j8i0 implements jpk, ihy {
    public final ybc0 A;
    public final oec0 B;
    public final fac0 C;
    public final fi2 D;
    public final goc0 E;
    public final bgc0 F;
    public final ljc0 G;
    public final akc0 H;
    public final hmc0 I;
    public final xmc0 J;
    public final xxb K;
    public final x4s L;
    public final jkc0 M;
    public final sbc0 N;
    public final x2f O;
    public final o0f P;
    public final pfd Q;
    public final SportyLegendsInput R;
    public final wwd0 S;
    public final wwd0 T;
    public final wwd0 U;
    public final wwd0 V;
    public final wwd0 W;
    public final wwd0 X;
    public final wwd0 Y;
    public final wwd0 Z;
    public final cmo a;
    public final wwd0 a0;
    public final mgc0 b;
    public final wwd0 b0;
    public final mgb0 c;
    public final wwd0 c0;
    public final ihy d;
    public final wwd0 d0;
    public final jpk e;
    public jvd0 e0;
    public final j8o f;
    public boolean f0;
    public com.sportybet.android.instantwin.presentation.legends.b g0;
    public final ku90<c> h0;
    public final yho i;
    public final t340 i0;
    public final v340 j0;
    public final w9c0 v;
    public final lfo w;
    public final abc0 y;
    public final jbc0 z;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$completeTutorial$1", f = "SportyLegendsViewModel.kt", l = {1389}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, d dVar) {
            super(2, v1bVar);
            this.b = dVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yho yhoVar = this.b.i;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (yhoVar.a.putBoolean("sporty_legends_tutorial_shown", bool, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel", f = "SportyLegendsViewModel.kt", l = {1018}, m = "createTicket", v = 2)
    public static final class b extends x1b {
        public /* synthetic */ Object a;
        public final /* synthetic */ d b;
        public int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, d dVar) {
            super(v1bVar);
            this.b = dVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return this.b.y1(null, this);
        }
    }

    public d(vu60 vu60Var, kqo kqoVar, cmo cmoVar, mgc0 mgc0Var, n4p n4pVar, mgb0 mgb0Var, ihy ihyVar, jpk jpkVar, j8o j8oVar, yho yhoVar, w9c0 w9c0Var, lfo lfoVar, abc0 abc0Var, jbc0 jbc0Var, ybc0 ybc0Var, oec0 oec0Var, ch2 ch2Var, fac0 fac0Var, fi2 fi2Var, goc0 goc0Var, bgc0 bgc0Var, ljc0 ljc0Var, akc0 akc0Var, hmc0 hmc0Var, xmc0 xmc0Var, xxb xxbVar, x4s x4sVar, jkc0 jkc0Var, sbc0 sbc0Var, qbc0 qbc0Var, x2f x2fVar, o0f o0fVar, @Dispatcher(sportyDispatcher = SportyDispatchers.Default) pfd pfdVar) {
        ResourceUiText resourceUiText;
        wwd0 wwd0Var = goc0Var.b;
        wwd0 wwd0Var2 = goc0Var.a;
        xjc0 xjc0Var = akc0Var.g;
        wwd0 wwd0Var3 = akc0Var.f;
        wwd0 wwd0Var4 = hmc0Var.d;
        vu60Var.getClass();
        mgb0Var.getClass();
        ihyVar.getClass();
        jpkVar.getClass();
        j8oVar.getClass();
        ch2Var.getClass();
        fac0Var.getClass();
        fi2Var.getClass();
        ljc0Var.getClass();
        x4sVar.getClass();
        sbc0Var.getClass();
        qbc0Var.getClass();
        x2fVar.getClass();
        o0fVar.getClass();
        this.a = cmoVar;
        this.b = mgc0Var;
        this.c = mgb0Var;
        this.d = ihyVar;
        this.e = jpkVar;
        this.f = j8oVar;
        this.i = yhoVar;
        this.v = w9c0Var;
        this.w = lfoVar;
        this.y = abc0Var;
        this.z = jbc0Var;
        this.A = ybc0Var;
        this.B = oec0Var;
        this.C = fac0Var;
        this.D = fi2Var;
        this.E = goc0Var;
        this.F = bgc0Var;
        this.G = ljc0Var;
        this.H = akc0Var;
        this.I = hmc0Var;
        this.J = xmc0Var;
        this.K = xxbVar;
        this.L = x4sVar;
        this.M = jkc0Var;
        this.N = sbc0Var;
        this.O = x2fVar;
        this.P = o0fVar;
        this.Q = pfdVar;
        SportyLegendsInput sportyLegendsInput = (SportyLegendsInput) vu60Var.b("ARG_INPUT");
        this.R = sportyLegendsInput;
        wwd0 wwd0VarA = xwd0.a(sportyLegendsInput != null ? sportyLegendsInput.c : null);
        this.S = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new hm3(0));
        this.T = wwd0VarA2;
        lni0 lni0Var = lni0.a;
        wwd0 wwd0VarA3 = xwd0.a(lni0Var);
        this.U = wwd0VarA3;
        zs.a aVar = zs.a.a;
        wwd0 wwd0VarA4 = xwd0.a(aVar);
        this.V = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(aVar);
        this.W = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(aVar);
        this.X = wwd0VarA6;
        wwd0 wwd0VarA7 = xwd0.a(aVar);
        this.Y = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(aVar);
        this.Z = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(aVar);
        this.a0 = wwd0VarA9;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA10 = xwd0.a(bool);
        this.b0 = wwd0VarA10;
        wwd0 wwd0VarA11 = xwd0.a(null);
        this.c0 = wwd0VarA11;
        wwd0 wwd0VarA12 = xwd0.a(bool);
        this.d0 = wwd0VarA12;
        v340 v340VarE = e1i.e(yhoVar.l.a(yhoVar, yho.o[11]).d(bool), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), bool);
        ku90<c> ku90Var = new ku90<>();
        this.h0 = ku90Var;
        this.i0 = e1i.a(ku90Var);
        wqc0 wqc0Var = new wqc0(new lyh[]{kqoVar.d, e1i.b(wwd0Var3), e1i.b(xmc0Var.a), e1i.b(oec0Var.d), e1i.b(oec0Var.e), e1i.b(oec0Var.f), e1i.b(wwd0Var2), e1i.b(goc0Var.c), e1i.b(goc0Var.d), e1i.b(oec0Var.g), wwd0VarA2, e1i.b(bgc0Var.g), e1i.b(abc0Var.c), e1i.b(ybc0Var.e), wwd0VarA3, xxbVar.a, wwd0VarA4, wwd0VarA5, wwd0VarA6, wwd0VarA7, wwd0VarA8, wwd0VarA9, wwd0VarA10, lfoVar.h, e1i.b(wwd0Var), e1i.b(goc0Var.e), e1i.b(oec0Var.h), e1i.b(oec0Var.i), fac0Var.f(), fac0Var.a(), fi2Var.f1(), wwd0VarA11, v340VarE, wwd0VarA12, wwd0VarA}, this);
        et7 et7VarD = o8i0.d(this);
        mwd0 mwd0Var = new mwd0(0L, Long.MAX_VALUE);
        fqo.c.b bVar = fqo.c.b.a;
        fqo.a.C0579a c0579a = fqo.a.C0579a.a;
        Integer numC = cmoVar.c(z1());
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        this.j0 = e1i.e(wqc0Var, et7VarD, mwd0Var, new lqc0(new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText, bVar), gcc0.b.a, null, null, null, lni0Var, aVar, aVar, aVar, aVar, aVar, aVar, aVar, false, ink.b.a, ei2.a.a, null, false));
        x2fVar.a();
        o0fVar.a();
        n4pVar.m = z1();
        jpkVar.t1();
        ihyVar.G();
        kqoVar.a(o8i0.d(this), true);
        xxbVar.d(o8i0.d(this));
        et7 et7VarD2 = o8i0.d(this);
        String strZ1 = z1();
        akc0Var.e = et7VarD2;
        kzh.d(r0i.f(akc0Var.d, new sjc0(null, akc0Var, strZ1)), et7VarD2);
        et7 et7VarD3 = o8i0.d(this);
        if (qbc0Var.c.contains(qbc0Var.b.getCountryCode())) {
            ej5.c(et7VarD3, null, null, new pbc0(qbc0Var, null), 3);
        }
        et7 et7VarD4 = o8i0.d(this);
        kzh.d(new g1i(new or60(new kkc0(jkc0Var, null)), new lkc0(jkc0Var, null)), et7VarD4);
        kzh.d(new n1i(jkc0Var.f, jkc0Var.e, new mkc0(jkc0Var, null)), et7VarD4);
        kzh.d(new g1i(jkc0Var.h, new nkc0(jkc0Var, null)), et7VarD4);
        fac0Var.h(o8i0.d(this), xjc0Var, z1());
        ch2Var.a(o8i0.d(this), xjc0Var, akc0Var.h, fac0Var.l());
        kzh.d(new g1i(new n1i(new umc0(new tmc0(e1i.b(wwd0Var3))), xmc0Var.b, new vmc0(3, xmc0Var, xmc0.class, "createStatsState", "createStatsState(Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSessionData;Lcom/sportybet/android/instantwin/presentation/legends/model/state/stats/SportyLegendsStatsBannerState;)Lcom/sportybet/android/instantwin/presentation/legends/model/state/stats/SportyLegendsStatsState;", 4)), new wmc0(xmc0Var, null)), o8i0.d(this));
        et7 et7VarD5 = o8i0.d(this);
        v340 v340VarB = e1i.b(wwd0Var3);
        v340 v340VarF = ljc0Var.f();
        v340 v340VarF2 = fac0Var.f();
        v340 v340VarB2 = ch2Var.b();
        kzh.d(new g1i(v340VarB, new rec0(2, oec0Var, oec0.class, "syncOddsFilterState", "syncOddsFilterState(Lcom/sportybet/android/instantwin/presentation/legends/model/status/SportyLegendsSessionDataStatus;)V", 4)), et7VarD5);
        kzh.d(r1i.b(r1i.a(new qec0(new pec0(v340VarB)), oec0Var.j, v340VarF, new tec0(4, null)), v340VarF2, v340VarB2, oec0Var.a.Z0(), new sec0(oec0Var, null)), et7VarD5);
        et7 et7VarD6 = o8i0.d(this);
        v340 v340VarB3 = e1i.b(wwd0Var3);
        kzh.d(new g1i(new boc0(v340VarB3), new eoc0(goc0Var, null)), et7VarD6);
        kzh.d(r1i.a(new doc0(new coc0(v340VarB3)), wwd0Var2, wwd0Var, new foc0(4, goc0Var, goc0.class, "updateState", "updateState(Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSessionData;Ljava/lang/String;Lcom/sportybet/android/instantwin/presentation/legends/model/state/SportyLegendsTeamSelectionState;)V", 4)), et7VarD6);
        ljc0Var.a(o8i0.d(this));
        et7 et7VarD7 = o8i0.d(this);
        kzh.d(new g1i(ljc0Var.f(), new emc0(hmc0Var, null)), et7VarD7);
        kzh.d(new g1i(wwd0Var4, new fmc0(hmc0Var, null)), et7VarD7);
        jpk jpkVar2 = hmc0Var.c;
        bz3 bz3Var = bz3.SINGLE;
        kzh.d(new g1i(jpkVar2.G0(SimulateBetConsts.BetslipType.SINGLE), new gmc0(hmc0Var, null)), et7VarD7);
        et7 et7VarD8 = o8i0.d(this);
        v340 v340VarB4 = e1i.b(wwd0Var4);
        v340 v340VarB5 = e1i.b(wwd0Var3);
        v340 v340Var = qbc0Var.e;
        kzh.d(new g1i(v340VarB4, new hgc0(null, bgc0Var)), et7VarD8);
        wwd0 wwd0Var5 = bgc0Var.i;
        wwd0 wwd0Var6 = bgc0Var.h;
        fgc0 fgc0Var = new fgc0(new dgc0(v340VarB5));
        uy0 uy0Var = bgc0Var.a;
        pu0.b bVar2 = pu0.b.a;
        ggc0 ggc0Var = new ggc0(new egc0(uy0Var.h(bVar2)));
        lyh<TaxConfigs> lyhVarP = bgc0Var.b.p();
        jpk jpkVar3 = bgc0Var.f;
        kzh.d(new g1i(new cgc0(new lyh[]{v340VarB4, wwd0Var5, wwd0Var6, fgc0Var, ggc0Var, lyhVarP, jpkVar3.p1(), jpkVar3.G0(SimulateBetConsts.BetslipType.SINGLE), v340Var}, bgc0Var), new igc0(null, bgc0Var)), et7VarD8);
        et7 et7VarD9 = o8i0.d(this);
        v340 v340VarB6 = e1i.b(wwd0Var4);
        v340 v340VarB7 = e1i.b(hmc0Var.e);
        v340 v340VarB8 = e1i.b(wwd0Var3);
        v340 v340VarB9 = e1i.b(jkc0Var.g);
        kzh.d(new g1i(v340VarB6, new hbc0(null, jbc0Var)), et7VarD9);
        wwd0 wwd0Var7 = jbc0Var.h;
        fbc0 fbc0Var = new fbc0(new dbc0(v340VarB8));
        gbc0 gbc0Var = new gbc0(new ebc0(jbc0Var.a.h(bVar2)));
        lyh<TaxConfigs> lyhVarP2 = jbc0Var.b.p();
        jpk jpkVar4 = jbc0Var.f;
        kzh.d(new g1i(new cbc0(new lyh[]{v340VarB6, v340VarB7, wwd0Var7, fbc0Var, gbc0Var, lyhVarP2, jpkVar4.p1(), jpkVar4.G0(SimulateBetConsts.BetslipType.SINGLE), v340VarB9}, jbc0Var), new ibc0(null, jbc0Var)), et7VarD9);
        kzh.d(new g1i(r1i.b(e1i.b(wwd0Var4), abc0Var.d, new xac0(new wac0(abc0Var.a.h(bVar2))), e1i.b(jbc0Var.g), new yac0(5, abc0Var, abc0.class, "createBetslipState", "createBetslipState(Ljava/util/List;Lcom/sportybet/android/instantwin/model/VisibilityState;Lcom/sporty/android/core/model/assetsinfo/AssetsInfo;Lcom/sportybet/android/instantwin/presentation/compose/betslip/model/content/BetslipContentState;)Lcom/sportybet/android/instantwin/presentation/compose/betslip/model/BetslipState;", 4)), new zac0(abc0Var, null)), o8i0.d(this));
        et7 et7VarD10 = o8i0.d(this);
        v340 v340VarB10 = e1i.b(wwd0Var4);
        wwd0 wwd0Var8 = ybc0Var.f;
        lyh<TaxConfigs> lyhVarP3 = ybc0Var.a.p();
        jpk jpkVar5 = ybc0Var.c;
        kzh.d(new g1i(r1i.c(v340VarB10, wwd0Var8, lyhVarP3, jpkVar5.p1(), jpkVar5.G0(SimulateBetConsts.BetslipType.SINGLE), new wbc0(6, ybc0Var, ybc0.class, "createConfirmDialogState", "createConfirmDialogState(Ljava/util/List;Lcom/sportybet/android/instantwin/model/VisibilityState;Lcom/sporty/android/core/model/config/tax/TaxConfigs;Ljava/util/List;Lcom/sportybet/android/instantwin/model/SelectedGiftInfo;)Lcom/sportybet/android/instantwin/presentation/compose/dialog/confirm/ConfirmDialogState;", 4)), new xbc0(ybc0Var, null)), et7VarD10);
        lfoVar.a(o8i0.d(this), z1());
        kzh.d(new g1i(new pqc0(new nqc0(e1i.b(wwd0Var3)), this), new qqc0(null, this)), o8i0.d(this));
        kzh.d(ozh.c(new g1i(new oqc0(e1i.b(wwd0Var3)), new rqc0(null, this)), pfdVar), o8i0.d(this));
        kzh.d(new g1i(fac0Var.a(), new sqc0(null, this)), o8i0.d(this));
        kzh.d(new g1i(ljc0Var.h(), new mqc0(null, this)), o8i0.d(this));
    }

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
    public final void A1(com.sportybet.android.instantwin.presentation.legends.b bVar) {
        String str;
        String str2;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        wwd0 wwd0Var;
        Object value9;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        Object value14;
        Object value15;
        Object value16;
        Object value17;
        Object value18;
        Object value19;
        Object value20;
        Object value21;
        Object value22;
        Object next;
        Object value23;
        xnc0 xnc0Var;
        Object value24;
        Object value25;
        Object value26;
        kqc0 kqc0Var;
        kqc0 kqc0Var2;
        BetBuilderConfig betBuilderConfig;
        pac0 pac0Var;
        BigDecimal bigDecimalG;
        Object value27;
        String str3;
        Object value28;
        Object value29;
        hcc0 hcc0Var;
        List<icc0> list;
        Object value30;
        List list2;
        Object value31;
        Object next2;
        wwd0 wwd0Var2;
        Object value32;
        UiText uiText;
        Integer numA;
        Object value33;
        bVar.getClass();
        boolean z = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.o;
        wwd0 wwd0Var3 = this.b0;
        ku90<c> ku90Var = this.h0;
        hmc0 hmc0Var = this.I;
        fac0 fac0Var = this.C;
        if (z) {
            boolean zIsEmpty = fac0Var.e().isEmpty();
            boolean zIsEmpty2 = ((Collection) e1i.b(hmc0Var.d).a.getValue()).isEmpty();
            if (!zIsEmpty && zIsEmpty2) {
                C1(com.sportybet.android.instantwin.presentation.legends.b.o.a);
                return;
            } else {
                if (this.f.c()) {
                    ku90Var.a(c.b.a.a);
                    return;
                }
                do {
                    value33 = wwd0Var3.getValue();
                    ((Boolean) value33).getClass();
                } while (!wwd0Var3.g(value33, Boolean.TRUE));
                return;
            }
        }
        boolean z2 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.j;
        int i = 0;
        w9c0 w9c0Var = this.v;
        if (z2) {
            com.sportybet.android.instantwin.presentation.legends.b.j jVar = (com.sportybet.android.instantwin.presentation.legends.b.j) bVar;
            if (jVar.equals(com.sportybet.android.instantwin.presentation.legends.b.j.a.a)) {
                ku90Var.a(c.b.a.a);
                return;
            }
            if (jVar.equals(com.sportybet.android.instantwin.presentation.legends.b.j.d.a)) {
                ku90Var.a(c.b.f.a);
                return;
            }
            com.sportybet.android.instantwin.presentation.legends.b.j.C0282b c0282b = com.sportybet.android.instantwin.presentation.legends.b.j.C0282b.a;
            if (jVar.equals(c0282b)) {
                boolean zIsEmpty3 = fac0Var.e().isEmpty();
                boolean zIsEmpty4 = ((Collection) e1i.b(hmc0Var.d).a.getValue()).isEmpty();
                if (!zIsEmpty3 && zIsEmpty4) {
                    C1(c0282b);
                    return;
                } else {
                    w9c0Var.c(v9c0.f.a);
                    ku90Var.a(new c.b.C0288b(z1()));
                    return;
                }
            }
            if (!jVar.equals(com.sportybet.android.instantwin.presentation.legends.b.j.c.a)) {
                if (jVar.equals(com.sportybet.android.instantwin.presentation.legends.b.j.e.a)) {
                    ku90Var.a(c.b.h.a);
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            if (D1() || (numA = vcj.a(z1())) == null) {
                return;
            }
            int iIntValue = numA.intValue();
            List list3 = (List) e1i.b(hmc0Var.d).a.getValue();
            InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContext = new InstantWinGiftApplicabilityContext(new InstantWinGiftApplicabilityContext.BetSlipType.Single(hn9.h(list3), list3.size() > 1 ? InstantWinGiftApplicabilityContext.BetCount.Multiple.a : new InstantWinGiftApplicabilityContext.BetCount.Single(1, 0)));
            bz3 bz3Var = bz3.SINGLE;
            ku90Var.a(new c.b.d(new fqk(iIntValue, instantWinGiftApplicabilityContext, this.e.t0(SimulateBetConsts.BetslipType.SINGLE))));
            return;
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.l) {
            B1();
            return;
        }
        c cVar = null;
        Object obj = null;
        sdc0Var = null;
        sdc0Var = null;
        sdc0 sdc0Var = null;
        cVar = null;
        cVar = null;
        cVar = null;
        cVar = null;
        cVar = null;
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.q) {
            com.sportybet.android.instantwin.presentation.legends.b.q qVar = (com.sportybet.android.instantwin.presentation.legends.b.q) bVar;
            do {
                wwd0Var2 = this.S;
                value32 = wwd0Var2.getValue();
                if (qVar instanceof com.sportybet.android.instantwin.presentation.legends.b.q.C0283b) {
                    uiText = ((com.sportybet.android.instantwin.presentation.legends.b.q.C0283b) qVar).a;
                } else {
                    if (!qVar.equals(com.sportybet.android.instantwin.presentation.legends.b.q.a.a)) {
                        uhc.a();
                        return;
                    }
                    uiText = null;
                }
            } while (!wwd0Var2.g(value32, uiText));
            return;
        }
        boolean z3 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.i;
        akc0 akc0Var = this.H;
        oec0 oec0Var = this.B;
        if (z3) {
            com.sportybet.android.instantwin.presentation.legends.b.i iVar = (com.sportybet.android.instantwin.presentation.legends.b.i) bVar;
            if (iVar instanceof com.sportybet.android.instantwin.presentation.legends.b.i.C0281b) {
                String str4 = ((com.sportybet.android.instantwin.presentation.legends.b.i.C0281b) iVar).a;
                wwd0 wwd0Var4 = oec0Var.d;
                do {
                    value31 = wwd0Var4.getValue();
                } while (!wwd0Var4.g(value31, str4));
                Iterator it = ((Iterable) e1i.b(oec0Var.e).a.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!((mec0) next2).a.equals(str4));
                mec0 mec0Var = (mec0) next2;
                String str5 = mec0Var != null ? mec0Var.b : null;
                w9c0Var.c(new v9c0.k(str5 != null ? str5 : ""));
                return;
            }
            if (iVar instanceof com.sportybet.android.instantwin.presentation.legends.b.i.e) {
                com.sportybet.android.instantwin.presentation.legends.b.i.e eVar = (com.sportybet.android.instantwin.presentation.legends.b.i.e) iVar;
                String str6 = eVar.a;
                String str7 = eVar.b;
                oec0Var.getClass();
                lcc0 lcc0Var = new lcc0(str6, str7);
                wwd0 wwd0Var5 = oec0Var.j;
                do {
                    value30 = wwd0Var5.getValue();
                    list2 = (List) value30;
                } while (!wwd0Var5.g(value30, list2.contains(lcc0Var) ? CollectionsKt.g0(list2, lcc0Var) : CollectionsKt.j0(list2, lcc0Var)));
                return;
            }
            if (iVar instanceof com.sportybet.android.instantwin.presentation.legends.b.i.d) {
                String str8 = ((com.sportybet.android.instantwin.presentation.legends.b.i.d) iVar).a;
                pjc0 pjc0VarA = akc0Var.a();
                if (pjc0VarA != null && (hcc0Var = pjc0VarA.c) != null && (list = hcc0Var.b) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        p48.w(((icc0) it2.next()).d, arrayList);
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (Intrinsics.g(((sdc0) obj2).c, str8)) {
                            obj = obj2;
                            break;
                        }
                    }
                    sdc0Var = (sdc0) obj;
                }
                if (sdc0Var == null) {
                    return;
                }
                String str9 = sdc0Var.d;
                String str10 = sdc0Var.f;
                wwd0 wwd0Var6 = oec0Var.g;
                do {
                    value29 = wwd0Var6.getValue();
                } while (!wwd0Var6.g(value29, new ufo(str9, str10)));
                return;
            }
            if (iVar.equals(com.sportybet.android.instantwin.presentation.legends.b.i.c.a)) {
                wwd0 wwd0Var7 = oec0Var.g;
                do {
                    value28 = wwd0Var7.getValue();
                } while (!wwd0Var7.g(value28, null));
                return;
            }
            if (!(iVar instanceof com.sportybet.android.instantwin.presentation.legends.b.i.f)) {
                if (iVar instanceof com.sportybet.android.instantwin.presentation.legends.b.i.a) {
                    this.d.T(null);
                    throw null;
                }
                uhc.a();
                return;
            }
            hfc0 hfc0Var = ((com.sportybet.android.instantwin.presentation.legends.b.i.f) iVar).a;
            if (D1()) {
                return;
            }
            String str11 = hfc0Var.c;
            String str12 = hfc0Var.b;
            fac0 fac0Var2 = oec0Var.c;
            icc0 icc0Var = oec0Var.m;
            if (icc0Var != null) {
                String str13 = icc0Var.a;
                if (((Boolean) fac0Var2.f().a.getValue()).booleanValue()) {
                    fac0Var2.i(icc0Var);
                    gh2 gh2Var = oec0Var.o.get(str12 + ":" + str11);
                    if (gh2Var != null && (str3 = gh2Var.a) != null) {
                        str12 = str3;
                    }
                    if (gh2Var != null) {
                        str11 = gh2Var.b;
                    }
                    bs3 bs3Var = new bs3(str13, str12, str11);
                    String str14 = gh2Var != null ? gh2Var.c : hfc0Var.d;
                    if (gh2Var != null && gh2Var.g) {
                        pjc0 pjc0Var = oec0Var.l;
                        String str15 = pjc0Var != null ? pjc0Var.a.b : null;
                        fac0Var2.n(str15 != null ? str15 : "", str13, bs3Var, str14);
                    } else if (gh2Var == null || (gh2Var.f && !gh2Var.h)) {
                        pjc0 pjc0Var2 = oec0Var.l;
                        String str16 = pjc0Var2 != null ? pjc0Var2.a.b : null;
                        fac0Var2.k(str16 != null ? str16 : "", str13, bs3Var, str14);
                    }
                } else {
                    oec0Var.b.d(str12, str11, kotlin.collections.a.c(icc0Var));
                }
            }
            w9c0Var.c(v9c0.a.a);
            return;
        }
        boolean z4 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.c;
        wwd0 wwd0Var8 = this.V;
        if (z4) {
            com.sportybet.android.instantwin.presentation.legends.b.c cVar2 = (com.sportybet.android.instantwin.presentation.legends.b.c) bVar;
            boolean z5 = cVar2 instanceof com.sportybet.android.instantwin.presentation.legends.b.c.e;
            fi2 fi2Var = this.D;
            if (z5) {
                boolean z6 = ((com.sportybet.android.instantwin.presentation.legends.b.c.e) cVar2).a;
                if (z6 && D1()) {
                    return;
                }
                fac0Var.g(z6);
                if (z6) {
                    x4s x4sVar = this.L;
                    x4sVar.getClass();
                    if (!((Boolean) dj5.a(e.a, new w4s(x4sVar, null))).booleanValue()) {
                        fi2Var.r(2);
                    }
                }
                w9c0Var.c(new v9c0.e(z6));
                return;
            }
            if (cVar2.equals(com.sportybet.android.instantwin.presentation.legends.b.c.g.a)) {
                fac0Var.d();
                return;
            }
            if (cVar2.equals(com.sportybet.android.instantwin.presentation.legends.b.c.C0277b.a)) {
                fac0Var.c();
                return;
            }
            if (cVar2 instanceof com.sportybet.android.instantwin.presentation.legends.b.c.d) {
                int i2 = ((com.sportybet.android.instantwin.presentation.legends.b.c.d) cVar2).a;
                List<rh2> listE = fac0Var.e();
                if (i2 < 0 || i2 >= listE.size()) {
                    return;
                }
                fac0Var.b(listE.get(i2));
                return;
            }
            if (!cVar2.equals(com.sportybet.android.instantwin.presentation.legends.b.c.a.a)) {
                if (Intrinsics.g(cVar2, com.sportybet.android.instantwin.presentation.legends.b.c.f.a)) {
                    fi2Var.r(2);
                    return;
                } else if (Intrinsics.g(cVar2, com.sportybet.android.instantwin.presentation.legends.b.c.C0278c.a)) {
                    fi2Var.n0();
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            if (D1()) {
                return;
            }
            fac0 fac0Var3 = oec0Var.c;
            icc0 icc0Var2 = oec0Var.m;
            if (icc0Var2 == null || (betBuilderConfig = oec0Var.n) == null) {
                pac0Var = pac0.c;
            } else {
                BetBuilderOutcome betBuilderOutcome = (BetBuilderOutcome) fac0Var3.l().a.getValue();
                List<rh2> listE2 = fac0Var3.e();
                if (listE2.size() < 2 || !betBuilderOutcome.enable) {
                    pac0Var = pac0.c;
                } else {
                    String str17 = betBuilderConfig.marketId;
                    str17.getClass();
                    String str18 = betBuilderConfig.marketType;
                    str18.getClass();
                    sdc0 sdc0Var2 = new sdc0(str17, "", str18, CollectionsKt.a0(listE2, "\n", null, null, new ikc(1), 30), "", "", ffc0.NONE, false, m2g.a);
                    String str19 = betBuilderOutcome.id;
                    String str20 = str19 == null ? "" : str19;
                    String str21 = betBuilderOutcome.odds;
                    if (str21 == null || (bigDecimalG = kotlin.text.b.g(str21)) == null) {
                        bigDecimalG = BigDecimal.ZERO;
                    }
                    BigDecimal bigDecimal = bigDecimalG;
                    bigDecimal.getClass();
                    if (oec0Var.b.c(new kjc0(icc0Var2, sdc0Var2, new gfc0(str20, bigDecimal, "Bet Builder", "", betBuilderOutcome.enable, false)))) {
                        fac0Var3.m();
                        pac0Var = pac0.a;
                    } else {
                        pac0Var = pac0.b;
                    }
                }
            }
            if (pac0Var == pac0.b) {
                do {
                    value27 = wwd0Var8.getValue();
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var8.g(value27, new zs.b(new ResourceUiText(R.string.page_instant_virtual__warning), new ResourceUiText(R.string.page_instant_virtual__you_have_the_duplicate_betslip), vch0.b(R.string.common_functions__ok), 8)));
                fac0Var.m();
            }
            w9c0Var.c(v9c0.d.a);
            return;
        }
        boolean z7 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.v;
        goc0 goc0Var = this.E;
        if (z7) {
            com.sportybet.android.instantwin.presentation.legends.b.v vVar = (com.sportybet.android.instantwin.presentation.legends.b.v) bVar;
            if (Intrinsics.g(vVar, com.sportybet.android.instantwin.presentation.legends.b.v.a.a)) {
                jqc0 jqc0Var = (jqc0) goc0Var.c().getValue();
                int iOrdinal = jqc0Var.b.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    kqc0Var2 = kqc0.a;
                } else if (iOrdinal == 2) {
                    kqc0Var2 = kqc0.b;
                } else {
                    if (iOrdinal != 3) {
                        uhc.a();
                        return;
                    }
                    kqc0Var2 = kqc0.c;
                }
                goc0Var.f(jqc0.a(jqc0Var, kqc0Var2));
                return;
            }
            if (!Intrinsics.g(vVar, com.sportybet.android.instantwin.presentation.legends.b.v.C0287b.a)) {
                if (Intrinsics.g(vVar, com.sportybet.android.instantwin.presentation.legends.b.v.c.a)) {
                    x1();
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            jqc0 jqc0Var2 = (jqc0) goc0Var.c().getValue();
            int iOrdinal2 = jqc0Var2.b.ordinal();
            if (iOrdinal2 == 0) {
                kqc0Var = kqc0.b;
            } else if (iOrdinal2 == 1) {
                kqc0Var = kqc0.c;
            } else {
                if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                    uhc.a();
                    return;
                }
                kqc0Var = kqc0.d;
            }
            if (kqc0Var == kqc0.d) {
                x1();
                return;
            } else {
                goc0Var.f(jqc0.a(jqc0Var2, kqc0Var));
                return;
            }
        }
        boolean z8 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.u;
        xmc0 xmc0Var = this.J;
        wwd0 wwd0Var9 = this.a0;
        abc0 abc0Var = this.y;
        ljc0 ljc0Var = this.G;
        if (z8) {
            com.sportybet.android.instantwin.presentation.legends.b.u uVar = (com.sportybet.android.instantwin.presentation.legends.b.u) bVar;
            com.sportybet.android.instantwin.presentation.legends.b.u.a aVar = com.sportybet.android.instantwin.presentation.legends.b.u.a.a;
            if (Intrinsics.g(uVar, aVar)) {
                boolean z9 = ljc0Var.b() > 0;
                boolean zIsEmpty5 = fac0Var.e().isEmpty();
                if (z9) {
                    do {
                        value26 = wwd0Var9.getValue();
                    } while (!wwd0Var9.g(value26, new zs.b(vch0.b(R.string.page_instant_virtual__discard_selections), vch0.b(R.string.page_instant_virtual__you_have_items_in_your_betslip_discard_them_and_leave_this_page), vch0.b(R.string.page_instant_virtual__discard), vch0.b(R.string.page_instant_virtual__stay))));
                    return;
                }
                if (!zIsEmpty5) {
                    C1(aVar);
                    return;
                }
                wwd0 wwd0Var10 = xmc0Var.b;
                do {
                    value24 = wwd0Var10.getValue();
                } while (!wwd0Var10.g(value24, rmc0.b));
                fac0Var.m();
                abc0Var.a();
                ljc0Var.e();
                wwd0 wwd0Var11 = akc0Var.f;
                Object value34 = wwd0Var11.getValue();
                bkc0.c cVar3 = value34 instanceof bkc0.c ? (bkc0.c) value34 : null;
                if (cVar3 == null) {
                    akc0Var.c();
                    return;
                }
                pjc0 pjc0Var3 = cVar3.a;
                if (pjc0Var3.e != null) {
                    do {
                        value25 = wwd0Var11.getValue();
                    } while (!wwd0Var11.g(value25, new bkc0.c(pjc0Var3, uhc0.a)));
                    return;
                } else {
                    et7 et7Var = akc0Var.e;
                    if (et7Var == null) {
                        akc0Var.c();
                        return;
                    } else {
                        ej5.c(et7Var, null, null, new wjc0(akc0Var, cVar3, null), 3);
                        return;
                    }
                }
            }
            if (Intrinsics.g(uVar, com.sportybet.android.instantwin.presentation.legends.b.u.C0286b.a)) {
                if (D1()) {
                    return;
                }
                qcn qcnVar = (qcn) e1i.b(goc0Var.d).getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator<E> it3 = qcnVar.iterator();
                while (it3.hasNext()) {
                    Iterable iterable = ((bdc0) it3.next()).c;
                    if (iterable == null) {
                        iterable = m2g.a;
                    }
                    p48.w(iterable, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<E> it4 = qcnVar.iterator();
                while (it4.hasNext()) {
                    Iterable iterable2 = ((bdc0) it4.next()).d;
                    if (iterable2 == null) {
                        iterable2 = m2g.a;
                    }
                    p48.w(iterable2, arrayList3);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    if (hashSet.add(((enc0) obj3).a)) {
                        arrayList4.add(obj3);
                    }
                }
                List listD = kotlin.collections.a.d(arrayList4);
                IntRange intRange = new IntRange(1, 100, 1);
                lx30.Companion companion = lx30.INSTANCE;
                if (f.k(intRange, companion) > 10 || arrayList2.isEmpty()) {
                    xnc0Var = new xnc0((enc0) CollectionsKt.V(0, listD), (enc0) CollectionsKt.V(1, listD), 1);
                } else {
                    lgc0 lgc0Var = (lgc0) CollectionsKt.k0(arrayList2, companion);
                    xnc0Var = new xnc0(lgc0Var.a, lgc0Var.b, 1);
                }
                goc0Var.e(xnc0Var);
                w9c0Var.c(v9c0.j.a);
                return;
            }
            if (Intrinsics.g(uVar, com.sportybet.android.instantwin.presentation.legends.b.u.h.a)) {
                if (D1()) {
                    return;
                }
                xnc0 xnc0Var2 = (xnc0) goc0Var.b().getValue();
                if (xnc0Var2.b == null || xnc0Var2.c == null) {
                    return;
                }
                do {
                    value23 = wwd0Var8.getValue();
                } while (!wwd0Var8.g(value23, zs.a.a));
                ljc0Var.e();
                w9c0Var.c(v9c0.g.a);
                wwd0 wwd0Var12 = this.c0;
                wwd0Var12.getClass();
                wwd0Var12.k(null, xnc0Var2);
                Boolean bool = Boolean.FALSE;
                wwd0 wwd0Var13 = this.d0;
                wwd0Var13.getClass();
                wwd0Var13.k(null, bool);
                ej5.c(o8i0.d(this), null, null, new vqc0(this, xnc0Var2, null), 3);
                return;
            }
            if (uVar instanceof com.sportybet.android.instantwin.presentation.legends.b.u.d) {
                String str22 = ((com.sportybet.android.instantwin.presentation.legends.b.u.d) uVar).a;
                if (!Intrinsics.g((String) e1i.b(goc0Var.a).getValue(), str22)) {
                    Iterator it5 = ((Iterable) e1i.b(goc0Var.c).getValue()).iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                    } while (!Intrinsics.g(((cdc0) next).a, str22));
                    cdc0 cdc0Var = (cdc0) next;
                    if (cdc0Var != null) {
                        String str23 = cdc0Var.b;
                        String str24 = StringsKt.U(str23) ? null : str23;
                        if (str24 != null) {
                            w9c0Var.c(new v9c0.h(str24));
                        }
                    }
                }
                goc0Var.d(str22);
                return;
            }
            if (uVar instanceof com.sportybet.android.instantwin.presentation.legends.b.u.f) {
                enc0 enc0Var = ((com.sportybet.android.instantwin.presentation.legends.b.u.f) uVar).a;
                if (D1()) {
                    return;
                }
                xnc0 xnc0VarA = (xnc0) goc0Var.b().getValue();
                fnc0 fnc0Var = xnc0VarA.a;
                enc0 enc0Var2 = xnc0VarA.c;
                enc0 enc0Var3 = xnc0VarA.b;
                fnc0Var.getClass();
                fnc0 fnc0Var2 = fnc0.a;
                if (fnc0Var == fnc0Var2 && enc0Var3 == null) {
                    if (enc0Var2 == null) {
                        fnc0Var = fnc0.b;
                    }
                    xnc0VarA = xnc0.a(xnc0VarA, fnc0Var, enc0Var, null, 4);
                } else if (fnc0Var == fnc0.b && enc0Var2 == null) {
                    if (enc0Var3 == null) {
                        fnc0Var = fnc0Var2;
                    }
                    xnc0VarA = xnc0.a(xnc0VarA, fnc0Var, null, enc0Var, 2);
                }
                goc0Var.e(xnc0VarA);
                return;
            }
            if (uVar instanceof com.sportybet.android.instantwin.presentation.legends.b.u.g) {
                goc0Var.e(xnc0.a((xnc0) goc0Var.b().getValue(), ((com.sportybet.android.instantwin.presentation.legends.b.u.g) uVar).a, null, null, 6));
                return;
            }
            if (uVar instanceof com.sportybet.android.instantwin.presentation.legends.b.u.c) {
                enc0 enc0Var4 = ((com.sportybet.android.instantwin.presentation.legends.b.u.c) uVar).a;
                xnc0 xnc0VarA2 = (xnc0) goc0Var.b().getValue();
                if (Intrinsics.g(enc0Var4, xnc0VarA2.b)) {
                    xnc0VarA2 = xnc0.a(xnc0VarA2, fnc0.a, null, null, 4);
                } else if (Intrinsics.g(enc0Var4, xnc0VarA2.c)) {
                    xnc0VarA2 = xnc0.a(xnc0VarA2, fnc0.b, null, null, 2);
                }
                goc0Var.e(xnc0VarA2);
                return;
            }
            if (!(uVar instanceof com.sportybet.android.instantwin.presentation.legends.b.u.e)) {
                uhc.a();
                return;
            }
            com.sportybet.android.instantwin.presentation.legends.b.u.e eVar2 = (com.sportybet.android.instantwin.presentation.legends.b.u.e) uVar;
            enc0 enc0Var5 = eVar2.a;
            enc0 enc0Var6 = eVar2.b;
            if (D1()) {
                return;
            }
            w9c0Var.c(v9c0.p.a);
            goc0Var.e(new xnc0(enc0Var5, enc0Var6, 1));
            return;
        }
        boolean z10 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.f;
        bgc0 bgc0Var = this.F;
        if (z10) {
            wwd0 wwd0Var14 = bgc0Var.i;
            do {
                value22 = wwd0Var14.getValue();
            } while (!wwd0Var14.g(value22, bgc0.a.c));
            return;
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.d) {
            com.sportybet.android.instantwin.presentation.legends.b.d dVar = (com.sportybet.android.instantwin.presentation.legends.b.d) bVar;
            if (!Intrinsics.g(dVar, com.sportybet.android.instantwin.presentation.legends.b.d.C0279b.a)) {
                if (Intrinsics.g(dVar, com.sportybet.android.instantwin.presentation.legends.b.d.a.a)) {
                    abc0Var.a();
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            if (D1()) {
                return;
            }
            if (ljc0Var.i()) {
                A1(com.sportybet.android.instantwin.presentation.legends.b.a.k.a);
                return;
            }
            wwd0 wwd0Var15 = abc0Var.d;
            do {
                value21 = wwd0Var15.getValue();
            } while (!wwd0Var15.g(value21, lni0.b));
            return;
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.s) {
            com.sportybet.android.instantwin.presentation.legends.b.s sVar = (com.sportybet.android.instantwin.presentation.legends.b.s) bVar;
            if (sVar instanceof com.sportybet.android.instantwin.presentation.legends.b.s.d) {
                zrd0 zrd0Var = ((com.sportybet.android.instantwin.presentation.legends.b.s.d) sVar).a;
                wwd0 wwd0Var16 = bgc0Var.h;
                do {
                    value20 = wwd0Var16.getValue();
                } while (!wwd0Var16.g(value20, zrd0Var));
                return;
            }
            if (Intrinsics.g(sVar, com.sportybet.android.instantwin.presentation.legends.b.s.C0285b.a)) {
                wwd0 wwd0Var17 = bgc0Var.h;
                do {
                    value19 = wwd0Var17.getValue();
                } while (!wwd0Var17.g(value19, null));
                return;
            }
            boolean z11 = sVar instanceof com.sportybet.android.instantwin.presentation.legends.b.s.c;
            jbc0 jbc0Var = this.z;
            if (z11) {
                zrd0 zrd0Var2 = ((com.sportybet.android.instantwin.presentation.legends.b.s.c) sVar).a;
                wwd0 wwd0Var18 = jbc0Var.h;
                do {
                    value18 = wwd0Var18.getValue();
                } while (!wwd0Var18.g(value18, zrd0Var2));
                return;
            }
            if (!Intrinsics.g(sVar, com.sportybet.android.instantwin.presentation.legends.b.s.a.a)) {
                uhc.a();
                return;
            }
            wwd0 wwd0Var19 = jbc0Var.h;
            do {
                value17 = wwd0Var19.getValue();
            } while (!wwd0Var19.g(value17, null));
            return;
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.r) {
            com.sportybet.android.instantwin.presentation.legends.b.r rVar = (com.sportybet.android.instantwin.presentation.legends.b.r) bVar;
            if (rVar instanceof com.sportybet.android.instantwin.presentation.legends.b.r.d) {
                com.sportybet.android.instantwin.presentation.legends.b.r.d dVar2 = (com.sportybet.android.instantwin.presentation.legends.b.r.d) rVar;
                hmc0Var.d(dVar2.a, dVar2.b);
                return;
            }
            if (rVar instanceof com.sportybet.android.instantwin.presentation.legends.b.r.e) {
                com.sportybet.android.instantwin.presentation.legends.b.r.e eVar3 = (com.sportybet.android.instantwin.presentation.legends.b.r.e) rVar;
                hmc0Var.e(eVar3.a, eVar3.b);
                return;
            }
            if (rVar instanceof com.sportybet.android.instantwin.presentation.legends.b.r.C0284b) {
                hmc0Var.c(((com.sportybet.android.instantwin.presentation.legends.b.r.C0284b) rVar).a);
                return;
            }
            if (rVar instanceof com.sportybet.android.instantwin.presentation.legends.b.r.a) {
                hmc0Var.a(((com.sportybet.android.instantwin.presentation.legends.b.r.a) rVar).a);
                return;
            } else if (!(rVar instanceof com.sportybet.android.instantwin.presentation.legends.b.r.c)) {
                uhc.a();
                return;
            } else {
                com.sportybet.android.instantwin.presentation.legends.b.r.c cVar4 = (com.sportybet.android.instantwin.presentation.legends.b.r.c) rVar;
                hmc0Var.b(cVar4.a, cVar4.b);
                return;
            }
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.n) {
            String str25 = ((com.sportybet.android.instantwin.presentation.legends.b.n) bVar).a;
            if (ljc0Var.b() == 1 && abc0Var.b()) {
                A1(com.sportybet.android.instantwin.presentation.legends.b.a.l.a);
                return;
            } else {
                ljc0Var.g(str25);
                return;
            }
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.m) {
            abc0Var.a();
            ljc0Var.e();
            return;
        }
        boolean z12 = bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.g;
        ybc0 ybc0Var = this.A;
        if (z12) {
            com.sportybet.android.instantwin.presentation.legends.b.g gVar = (com.sportybet.android.instantwin.presentation.legends.b.g) bVar;
            if (Intrinsics.g(gVar, com.sportybet.android.instantwin.presentation.legends.b.g.C0280b.a)) {
                wwd0 wwd0Var20 = ybc0Var.f;
                do {
                    value16 = wwd0Var20.getValue();
                } while (!wwd0Var20.g(value16, lni0.b));
                return;
            }
            if (Intrinsics.g(gVar, com.sportybet.android.instantwin.presentation.legends.b.g.a.a)) {
                ybc0Var.a();
                return;
            } else {
                uhc.a();
                return;
            }
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.e) {
            ku90Var.a(c.a.a);
            return;
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.k) {
            ybc0Var.a();
            jvd0 jvd0Var = this.e0;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.e0 = ej5.c(o8i0.d(this), this.Q, null, new uqc0(null, this), 2);
            return;
        }
        if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.h) {
            do {
                value15 = wwd0Var3.getValue();
                ((Boolean) value15).getClass();
            } while (!wwd0Var3.g(value15, Boolean.FALSE));
            return;
        }
        if (!(bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.a)) {
            if (!(bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.InterfaceC0275b)) {
                if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.p) {
                    sk3 sk3Var = ((com.sportybet.android.instantwin.presentation.legends.b.p) bVar).a;
                    jkc0 jkc0Var = this.M;
                    jkc0Var.getClass();
                    jkc0Var.h.a(sk3Var);
                    return;
                }
                if (bVar instanceof com.sportybet.android.instantwin.presentation.legends.b.t) {
                    ej5.c(o8i0.d(this), null, null, new tqc0(null, this), 3);
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            com.sportybet.android.instantwin.presentation.legends.b.InterfaceC0275b interfaceC0275b = (com.sportybet.android.instantwin.presentation.legends.b.InterfaceC0275b) bVar;
            if (!Intrinsics.g(interfaceC0275b, com.sportybet.android.instantwin.presentation.legends.b.InterfaceC0275b.C0276b.a)) {
                if (interfaceC0275b instanceof com.sportybet.android.instantwin.presentation.legends.b.InterfaceC0275b.a) {
                    w9c0Var.c(new v9c0.m(((com.sportybet.android.instantwin.presentation.legends.b.InterfaceC0275b.a) interfaceC0275b).a));
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            w9c0Var.c(v9c0.n.a);
            int i4 = ((d880) ljc0Var.h().getValue()).b;
            sbc0 sbc0Var = this.N;
            Set<CountryCodeName> set = sbc0Var.d;
            v5b v5bVar = sbc0Var.c;
            psm psmVar = sbc0Var.b;
            if (set.contains(psmVar.getCountryCode()) && (str2 = (String) CollectionsKt.firstOrNull(z76.l.b)) != null) {
                ej5.c(v5bVar, null, null, new rbc0(sbc0Var, str2, String.valueOf(i4), null), 3);
            }
            String str26 = (String) e1i.b(hmc0Var.e).getValue();
            str26.getClass();
            if (sbc0Var.d.contains(psmVar.getCountryCode()) && (str = (String) CollectionsKt.d0(z76.l.b)) != null) {
                ej5.c(v5bVar, null, null, new rbc0(sbc0Var, str, str26, null), 3);
                return;
            }
            return;
        }
        com.sportybet.android.instantwin.presentation.legends.b.a aVar2 = (com.sportybet.android.instantwin.presentation.legends.b.a) bVar;
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.e.a)) {
            do {
                value14 = wwd0Var8.getValue();
            } while (!wwd0Var8.g(value14, zs.a.a));
            return;
        }
        boolean zG = Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.k.a);
        wwd0 wwd0Var21 = this.W;
        if (zG) {
            do {
                value13 = wwd0Var21.getValue();
            } while (!wwd0Var21.g(value13, new zs.b((UiText) null, vch0.c(R.string.page_instant_virtual__please_make_at_least_vnum_vselecttext, "1", vch0.b(R.string.common_functions__l_selection)), vch0.b(R.string.common_functions__ok), 9)));
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.f.a)) {
            do {
                value12 = wwd0Var21.getValue();
            } while (!wwd0Var21.g(value12, zs.a.a));
            return;
        }
        boolean zG2 = Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.l.a);
        wwd0 wwd0Var22 = this.X;
        if (zG2) {
            do {
                value11 = wwd0Var22.getValue();
            } while (!wwd0Var22.g(value11, new zs.b(vch0.b(R.string.component_betslip__confirm_remove_all_title), vch0.b(R.string.component_betslip__confirm_remove_all_content), vch0.b(R.string.common_functions__ok), vch0.b(R.string.common_functions__later))));
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.g.a)) {
            do {
                value10 = wwd0Var22.getValue();
            } while (!wwd0Var22.g(value10, zs.a.a));
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.h.a)) {
            do {
                wwd0Var = this.Y;
                value9 = wwd0Var.getValue();
            } while (!wwd0Var.g(value9, zs.a.a));
            return;
        }
        boolean zG3 = Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.j.a);
        xxb xxbVar = this.K;
        if (zG3) {
            uxb uxbVar = (uxb) xxbVar.b().getValue();
            if (uxbVar != null) {
                if (uxbVar instanceof uxb.c) {
                    cVar = c.b.e.a;
                } else if (uxbVar instanceof uxb.e) {
                    cVar = c.b.C0289c.a;
                } else if (uxbVar instanceof uxb.i) {
                    cVar = c.b.a.a;
                } else if (!(uxbVar instanceof uxb.a) && !(uxbVar instanceof uxb.b) && !(uxbVar instanceof uxb.d) && !(uxbVar instanceof uxb.f) && !(uxbVar instanceof uxb.g) && !(uxbVar instanceof uxb.h)) {
                    uhc.a();
                    return;
                }
                if (cVar != null) {
                    ku90Var.a(cVar);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.d.a)) {
            uxb uxbVar2 = (uxb) xxbVar.b().getValue();
            if (uxbVar2 != null) {
                if ((uxbVar2 instanceof uxb.f) || (uxbVar2 instanceof uxb.g)) {
                    B1();
                } else if (uxbVar2 instanceof uxb.d) {
                    H0();
                } else if (!(uxbVar2 instanceof uxb.a) && !(uxbVar2 instanceof uxb.b) && !(uxbVar2 instanceof uxb.c) && !(uxbVar2 instanceof uxb.e) && !(uxbVar2 instanceof uxb.h) && !(uxbVar2 instanceof uxb.i)) {
                    uhc.a();
                    return;
                }
            }
            xxbVar.a();
            return;
        }
        boolean zG4 = Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.i.a);
        wwd0 wwd0Var23 = this.Z;
        if (zG4) {
            do {
                value8 = wwd0Var23.getValue();
            } while (!wwd0Var23.g(value8, zs.a.a));
            this.g0 = null;
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.C0274b.a)) {
            do {
                value7 = wwd0Var23.getValue();
            } while (!wwd0Var23.g(value7, zs.a.a));
            fac0Var.m();
            com.sportybet.android.instantwin.presentation.legends.b bVar2 = this.g0;
            this.g0 = null;
            if (bVar2 != null) {
                A1(bVar2);
                return;
            }
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.m.a)) {
            do {
                value6 = wwd0Var23.getValue();
            } while (!wwd0Var23.g(value6, zs.a.a));
            this.g0 = null;
            fac0Var.g(true);
            return;
        }
        if (Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.c.a)) {
            do {
                value5 = wwd0Var9.getValue();
            } while (!wwd0Var9.g(value5, zs.a.a));
            return;
        }
        if (!Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.C0273a.a)) {
            if (!Intrinsics.g(aVar2, com.sportybet.android.instantwin.presentation.legends.b.a.n.a)) {
                uhc.a();
                return;
            }
            do {
                value = wwd0Var9.getValue();
            } while (!wwd0Var9.g(value, zs.a.a));
            return;
        }
        do {
            value2 = wwd0Var9.getValue();
        } while (!wwd0Var9.g(value2, zs.a.a));
        wwd0 wwd0Var24 = xmc0Var.b;
        do {
            value3 = wwd0Var24.getValue();
        } while (!wwd0Var24.g(value3, rmc0.b));
        fac0Var.m();
        abc0Var.a();
        ljc0Var.e();
        wwd0 wwd0Var25 = akc0Var.f;
        Object value35 = wwd0Var25.getValue();
        bkc0.c cVar5 = value35 instanceof bkc0.c ? (bkc0.c) value35 : null;
        if (cVar5 == null) {
            akc0Var.c();
            return;
        }
        pjc0 pjc0Var4 = cVar5.a;
        if (pjc0Var4.e != null) {
            do {
                value4 = wwd0Var25.getValue();
            } while (!wwd0Var25.g(value4, new bkc0.c(pjc0Var4, uhc0.a)));
        } else {
            et7 et7Var2 = akc0Var.e;
            if (et7Var2 == null) {
                akc0Var.c();
            } else {
                ej5.c(et7Var2, null, null, new wjc0(akc0Var, cVar5, null), 3);
            }
        }
    }

    public final void B1() {
        wwd0 wwd0Var;
        Object value;
        wwd0 wwd0Var2;
        Object value2;
        wwd0 wwd0Var3;
        Object value3;
        wwd0 wwd0Var4;
        Object value4;
        this.e.t1();
        this.C.m();
        this.G.e();
        this.y.a();
        goc0 goc0Var = this.E;
        wwd0 wwd0Var5 = goc0Var.a;
        wwd0Var5.getClass();
        wwd0Var5.k(null, "");
        wwd0 wwd0Var6 = goc0Var.b;
        xnc0 xnc0Var = new xnc0((enc0) null, (enc0) null, 7);
        wwd0Var6.getClass();
        wwd0Var6.k(null, xnc0Var);
        do {
            wwd0Var = this.V;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zs.a.a));
        do {
            wwd0Var2 = this.W;
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, zs.a.a));
        do {
            wwd0Var3 = this.X;
            value3 = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value3, zs.a.a));
        do {
            wwd0Var4 = this.Y;
            value4 = wwd0Var4.getValue();
        } while (!wwd0Var4.g(value4, zs.a.a));
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var7 = this.d0;
        wwd0Var7.getClass();
        wwd0Var7.k(null, bool);
        this.K.a();
        this.H.c();
    }

    public final void C1(com.sportybet.android.instantwin.presentation.legends.b bVar) {
        wwd0 wwd0Var;
        Object value;
        this.g0 = bVar;
        do {
            wwd0Var = this.Z;
            value = wwd0Var.getValue();
            StringUiText stringUiText = vch0.a;
        } while (!wwd0Var.g(value, new zs.b(new ResourceUiText(R.string.page_instant_virtual__discard_selections), new ResourceUiText(R.string.page_instant_virtual__are_you_sure_you_want_to_discard_tip), new ResourceUiText(R.string.page_instant_virtual__discard), new ResourceUiText(R.string.page_instant_virtual__stay))));
    }

    @Override // defpackage.ihy
    public final uwd0<tho> D() {
        return this.d.D();
    }

    public final boolean D1() {
        if (this.c.isLogin()) {
            return false;
        }
        this.h0.a(c.b.f.a);
        return true;
    }

    @Override // defpackage.jpk
    public final void E(String str) {
        this.e.E(str);
    }

    @Override // defpackage.ihy
    public final void G() {
        this.d.G();
    }

    @Override // defpackage.jpk
    public final lyh<m780> G0(String str) {
        return this.e.G0(str);
    }

    @Override // defpackage.jpk
    public final void H0() {
        this.e.H0();
    }

    @Override // defpackage.jpk
    public final void I(String str, String str2, String str3) {
        this.e.I(str, str2, str3);
    }

    @Override // defpackage.ihy
    public final void O0(OddsFilterData oddsFilterData) {
        this.d.O0(oddsFilterData);
    }

    @Override // defpackage.jpk
    public final void R0(boolean z) {
        this.e.R0(z);
    }

    @Override // defpackage.ihy
    public final void T(ogo ogoVar) {
        ogoVar.getClass();
        this.d.T(ogoVar);
    }

    @Override // defpackage.jpk
    public final void T0(String str) {
        str.getClass();
        this.e.T0(str);
    }

    @Override // defpackage.ihy
    public final uwd0<ogo> Z0() {
        return this.d.Z0();
    }

    @Override // defpackage.jpk
    public final boolean a0() {
        return this.e.a0();
    }

    @Override // defpackage.jpk
    public final void b0() {
        this.e.b0();
    }

    @Override // defpackage.ihy
    public final boolean d0() {
        return this.d.d0();
    }

    @Override // defpackage.jpk
    public final void j1(ArrayList arrayList) {
        this.e.j1(arrayList);
    }

    @Override // defpackage.jpk
    public final uwd0<List<GiftDetails>> p1() {
        return this.e.p1();
    }

    @Override // defpackage.jpk
    public final m780 t0(String str) {
        return this.e.t0(str);
    }

    @Override // defpackage.jpk
    public final void t1() {
        this.e.t1();
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null, this), 3);
        this.E.f(new jqc0(false, kqc0.d));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [m2g] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r5v10, types: [m2g] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v31, types: [m2g] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.sporty.android.common_ui.uitext.UiText] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public final Object y1(pjc0 pjc0Var, v1b<? super Unit> v1bVar) {
        b bVar;
        int i;
        String str;
        abc0 abc0Var;
        int kind;
        String str2;
        long jA;
        ?? r1;
        ?? r16;
        Object objC;
        String str3;
        ?? r29;
        Object obj;
        wwd0 wwd0Var;
        sk3 sk3Var;
        SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEvent;
        Map linkedHashMap;
        Map linkedHashMap2;
        Map linkedHashMap3;
        ?? arrayList;
        int i2;
        EventInRound eventInRound;
        String str4;
        LinkedHashSet linkedHashSet;
        Parcelable sportyLegendsSettlementRoundInfoBetOddsCommon;
        Parcelable parcelable;
        ?? arrayList2;
        List<BetBuilderSelection> list;
        Iterator it;
        String str5;
        EventInRound eventInRound2;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i3 = bVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.c = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(v1bVar, this);
            }
        } else {
            bVar = new b(v1bVar, this);
        }
        Object obj2 = bVar.a;
        y5b y5bVar = y5b.a;
        int i4 = bVar.c;
        String str6 = "";
        abc0 abc0Var2 = this.y;
        wwd0 wwd0Var2 = this.U;
        Pair pair = null;
        if (i4 == 0) {
            uj50.b(obj2);
            while (true) {
                Object value = wwd0Var2.getValue();
                if (wwd0Var2.g(value, lni0.b)) {
                    break;
                }
                str6 = str6;
            }
            hmc0 hmc0Var = this.I;
            hmc0Var.getClass();
            pjc0Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterable<dmc0> iterable = (Iterable) e1i.b(hmc0Var.d).a.getValue();
            ArrayList arrayList5 = new ArrayList();
            for (dmc0 dmc0Var : iterable) {
                BigDecimal bigDecimalG = kotlin.text.b.g(dmc0Var.b);
                if (bigDecimalG != null) {
                    pair = new Pair(bigDecimalG, dmc0Var.a);
                }
                if (pair != null) {
                    arrayList5.add(pair);
                }
                pair = pair;
            }
            ?? r210 = pair;
            i = 0;
            int size = arrayList5.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList5.get(i6);
                i6++;
                int i7 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.b.q();
                    throw r210;
                }
                Pair pair2 = (Pair) obj3;
                BigDecimal bigDecimal = (BigDecimal) pair2.a;
                kjc0 kjc0Var = (kjc0) pair2.b;
                arrayList4.add(new TicketParameter.Bet.Single(1, bigDecimal.multiply(heo.a).longValue(), i5));
                arrayList3.add(new TicketParameter.Selection(kjc0Var.a.a, kjc0Var.b.a, kjc0Var.c.a));
                size = size;
                i5 = i7;
                arrayList5 = arrayList5;
                str6 = str6;
                abc0Var2 = abc0Var2;
            }
            str = str6;
            abc0Var = abc0Var2;
            jpk jpkVar = hmc0Var.c;
            bz3 bz3Var = bz3.SINGLE;
            m780 m780VarT0 = jpkVar.t0(SimulateBetConsts.BetslipType.SINGLE);
            if (m780VarT0 != null) {
                GiftDetails giftDetails = m780VarT0.b;
                String giftId = giftDetails.getGiftId();
                kind = giftDetails.getKind();
                str2 = giftId;
                jA = m780VarT0.a();
            } else {
                kind = 0;
                str2 = str;
                jA = 0;
            }
            String str7 = pjc0Var.a.b;
            hcc0 hcc0Var = pjc0Var.c;
            if (hcc0Var != null) {
                str3 = hcc0Var.a.a;
            } else {
                r1 = r210;
            }
            if (r1 == 0) {
                r1 = str3;
                r16 = str;
            } else {
                r1 = str3;
                r16 = r1;
            }
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            bigDecimal2.getClass();
            TicketParameter ticketParameter = new TicketParameter(str7, r16, SimulateBetConsts.BetslipType.SINGLE, arrayList3, arrayList4, 0, null, 0, false, bigDecimal2, str2, kind, jA);
            InstantWinBetSource instantWinBetSource = abc0Var.b() ? InstantWinBetSource.BETSLIP : InstantWinBetSource.QUICK_BET;
            bVar.c = 1;
            objC = this.b.c(ticketParameter, instantWinBetSource, bVar);
            r29 = r210;
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj2);
            objC = ((zi50) obj2).a;
            str = "";
            abc0Var = abc0Var2;
            r29 = 0;
            i = 0;
        }
        zi50.a aVar = zi50.b;
        if (objC instanceof zi50.b) {
            obj = objC;
            wwd0Var = wwd0Var2;
        } else {
            Round round = (Round) objC;
            ?? r211 = r29;
            while (true) {
                Object value2 = wwd0Var2.getValue();
                if (wwd0Var2.g(value2, lni0.a)) {
                    break;
                }
                r211 = 0;
            }
            if (round == null) {
                while (true) {
                    wwd0 wwd0Var3 = this.V;
                    Object value3 = wwd0Var3.getValue();
                    StringUiText stringUiText = vch0.a;
                    if (wwd0Var3.g(value3, new zs.b((UiText) r211, new ResourceUiText(R.string.common_feedback__something_went_wrong), new ResourceUiText(R.string.common_functions__ok), 9))) {
                        break;
                    }
                    r211 = 0;
                }
                obj = objC;
                wwd0Var = wwd0Var2;
            } else {
                yy50.a.j(new nqc(round));
                jkc0 jkc0Var = this.M;
                kk3 kk3Var = (kk3) jkc0Var.g.getValue();
                char c = 2;
                if (kk3Var == null || (sk3Var = kk3Var.b) == null) {
                    List list2 = (List) jkc0Var.f.getValue();
                    if (list2.size() == 1) {
                        ikc0 ikc0Var = (ikc0) CollectionsKt.firstOrNull(list2);
                        int i8 = ikc0Var == null ? -1 : jkc0.a.a[ikc0Var.ordinal()];
                        if (i8 == -1) {
                            sk3Var = null;
                        } else if (i8 == 1) {
                            sk3Var = sk3.LITE;
                        } else {
                            if (i8 != 2) {
                                uhc.a();
                                return null;
                            }
                            sk3Var = sk3.PLAYER;
                        }
                    } else {
                        sk3Var = null;
                    }
                    if (sk3Var == null) {
                        sk3.c.getClass();
                        sk3Var = sk3.d;
                    }
                }
                int iOrdinal = sk3Var.ordinal();
                w9c0 w9c0Var = this.v;
                if (iOrdinal == 0) {
                    w9c0Var.c(v9c0.i.a);
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    w9c0Var.c(v9c0.o.a);
                }
                List<EventInRound> list3 = round.events;
                if (list3 == null || (eventInRound2 = (EventInRound) CollectionsKt.firstOrNull(list3)) == null) {
                    sportyLegendsSettlementRoundInfoEvent = SportyLegendsSettlementRoundInfoEvent.f;
                } else {
                    String str8 = eventInRound2.homeTeamName;
                    String str9 = str8 == null ? str : str8;
                    String str10 = eventInRound2.homeTeamLogo;
                    String str11 = str10 == null ? str : str10;
                    String str12 = eventInRound2.awayTeamName;
                    String str13 = str12 == null ? str : str12;
                    String str14 = eventInRound2.awayTeamLogo;
                    String str15 = str14 == null ? str : str14;
                    String str16 = eventInRound2.resultSequence;
                    sportyLegendsSettlementRoundInfoEvent = new SportyLegendsSettlementRoundInfoEvent(str9, str11, str13, str15, str16 == null ? str : str16);
                }
                SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEvent2 = sportyLegendsSettlementRoundInfoEvent;
                List<MarketInRound> list4 = round.markets;
                if (list4 != null) {
                    int iA = jpu.a(l48.r(list4, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj4 : list4) {
                        linkedHashMap.put(((MarketInRound) obj4).marketId, obj4);
                    }
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = o2g.a;
                    linkedHashMap.getClass();
                }
                List<OutcomeInRound> list5 = round.outcomes;
                if (list5 != null) {
                    int iA2 = jpu.a(l48.r(list5, 10));
                    if (iA2 < 16) {
                        iA2 = 16;
                    }
                    linkedHashMap2 = new LinkedHashMap(iA2);
                    for (Object obj5 : list5) {
                        linkedHashMap2.put(((OutcomeInRound) obj5).outcomeId, obj5);
                        c = c;
                    }
                } else {
                    linkedHashMap2 = null;
                }
                char c2 = c;
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = o2g.a;
                    linkedHashMap2.getClass();
                }
                List<BetBuilderInRound> list6 = round.betBuilders;
                if (list6 != null) {
                    int iA3 = jpu.a(l48.r(list6, 10));
                    linkedHashMap3 = new LinkedHashMap(iA3 >= 16 ? iA3 : 16);
                    for (Object obj6 : list6) {
                        linkedHashMap3.put(((BetBuilderInRound) obj6).id, obj6);
                    }
                } else {
                    linkedHashMap3 = null;
                }
                if (linkedHashMap3 == null) {
                    linkedHashMap3 = o2g.a;
                    linkedHashMap3.getClass();
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                List<TicketInRound> list7 = round.tickets;
                if (list7 != null) {
                    Iterator it2 = list7.iterator();
                    while (it2.hasNext()) {
                        List<Bet> list8 = ((TicketInRound) it2.next()).bets;
                        if (list8 != null) {
                            Iterator it3 = list8.iterator();
                            while (it3.hasNext()) {
                                Object obj7 = objC;
                                List<BetDetail> list9 = ((Bet) it3.next()).betDetails;
                                if (list9 != null) {
                                    Iterator it4 = list9.iterator();
                                    while (it4.hasNext()) {
                                        Iterator it5 = it4;
                                        BetDetail betDetail = (BetDetail) it4.next();
                                        Iterator it6 = it3;
                                        String str17 = betDetail.eventId;
                                        if (str17 == null) {
                                            wwd0Var2 = wwd0Var2;
                                            it = it2;
                                        } else {
                                            it = it2;
                                            String str18 = betDetail.outcomeId;
                                            if (str18 == null || (str5 = betDetail.marketId) == null) {
                                                wwd0Var2 = wwd0Var2;
                                            } else {
                                                Object obj8 = linkedHashMap4.get(str17);
                                                if (obj8 == null) {
                                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                    linkedHashMap4.put(str17, linkedHashSet2);
                                                    obj8 = linkedHashSet2;
                                                }
                                                ((LinkedHashSet) obj8).add(str18);
                                                linkedHashMap5.put(str18, str5);
                                            }
                                        }
                                        it3 = it6;
                                        it4 = it5;
                                        it2 = it;
                                        wwd0Var2 = wwd0Var2;
                                    }
                                }
                                it3 = it3;
                                objC = obj7;
                                it2 = it2;
                                wwd0Var2 = wwd0Var2;
                            }
                        }
                        objC = objC;
                        it2 = it2;
                        wwd0Var2 = wwd0Var2;
                    }
                }
                obj = objC;
                wwd0Var = wwd0Var2;
                List<EventInRound> list10 = round.events;
                if (list10 == null || (eventInRound = (EventInRound) CollectionsKt.firstOrNull(list10)) == null || (str4 = eventInRound.eventId) == null || (linkedHashSet = (LinkedHashSet) linkedHashMap4.get(str4)) == null) {
                    arrayList = m2g.a;
                } else {
                    arrayList = new ArrayList();
                    Iterator it7 = linkedHashSet.iterator();
                    int i9 = i;
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        String str19 = (String) next;
                        String str20 = (String) linkedHashMap5.get(str19);
                        if (str20 == null) {
                            linkedHashMap3 = linkedHashMap3;
                            i10 = i10;
                            parcelable = null;
                        } else {
                            MarketInRound marketInRound = (MarketInRound) linkedHashMap.get(str20);
                            int i11 = marketInRound == null ? 1 : i;
                            StringUiText stringUiText2 = vch0.a;
                            ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__single);
                            StringUiText stringUiTextD = vch0.d(String.valueOf(i10));
                            StringUiText stringUiText3 = new StringUiText(" ");
                            UiText[] uiTextArr = new UiText[3];
                            uiTextArr[i] = resourceUiText;
                            uiTextArr[1] = stringUiText3;
                            uiTextArr[c2] = stringUiTextD;
                            Iterator it8 = kotlin.collections.b.k(uiTextArr).iterator();
                            if (!it8.hasNext()) {
                                zkh.a("Empty collection can't be reduced.");
                                return null;
                            }
                            Object next2 = it8.next();
                            while (it8.hasNext()) {
                                next2 = ((UiText) next2).h((UiText) it8.next());
                                it8 = it8;
                            }
                            UiText uiText = (UiText) next2;
                            if (i11 != 0) {
                                BetBuilderInRound betBuilderInRound = (BetBuilderInRound) linkedHashMap3.get(str19);
                                BetBuilderInRound betBuilderInRound2 = (BetBuilderInRound) linkedHashMap3.get(str19);
                                if (betBuilderInRound2 == null || (list = betBuilderInRound2.selections) == null) {
                                    arrayList2 = 0;
                                } else {
                                    arrayList2 = new ArrayList(l48.r(list, 10));
                                    for (Iterator it9 = list.iterator(); it9.hasNext(); it9 = it9) {
                                        BetBuilderSelection betBuilderSelection = (BetBuilderSelection) it9.next();
                                        MarketInRound marketInRound2 = (MarketInRound) linkedHashMap.get(betBuilderSelection.marketId);
                                        String str21 = marketInRound2 != null ? marketInRound2.title : null;
                                        if (str21 == null) {
                                            str21 = str;
                                        }
                                        OutcomeInRound outcomeInRound = (OutcomeInRound) linkedHashMap2.get(betBuilderSelection.outcomeId);
                                        String str22 = outcomeInRound != null ? outcomeInRound.desc : null;
                                        if (str22 == null) {
                                            str22 = str;
                                        }
                                        arrayList2.add(new SportyLegendsSettlementRoundInfoBetOddsBetBuilder.Selection(str22, str21));
                                    }
                                }
                                ?? r11 = (betBuilderInRound == null || !betBuilderInRound.getHit()) ? i : 1;
                                String str23 = betBuilderInRound != null ? betBuilderInRound.odds : null;
                                if (str23 == null) {
                                    str23 = str;
                                }
                                if (arrayList2 == 0) {
                                    arrayList2 = m2g.a;
                                }
                                sportyLegendsSettlementRoundInfoBetOddsCommon = new SportyLegendsSettlementRoundInfoBetOddsBetBuilder(r11, uiText, str23, arrayList2);
                            } else {
                                linkedHashMap3 = linkedHashMap3;
                                i10 = i10;
                                OutcomeInRound outcomeInRound2 = (OutcomeInRound) linkedHashMap2.get(str19);
                                ?? r34 = (outcomeInRound2 == null || !outcomeInRound2.hit) ? i : 1;
                                String str24 = outcomeInRound2 != null ? outcomeInRound2.odds : null;
                                String str25 = str24 == null ? str : str24;
                                String str26 = marketInRound.title;
                                String str27 = str26 == null ? str : str26;
                                String str28 = outcomeInRound2 != null ? outcomeInRound2.desc : null;
                                sportyLegendsSettlementRoundInfoBetOddsCommon = new SportyLegendsSettlementRoundInfoBetOddsCommon(r34, uiText, str25, str27, str28 == null ? str : str28);
                            }
                            parcelable = sportyLegendsSettlementRoundInfoBetOddsCommon;
                        }
                        if (parcelable != null) {
                            arrayList.add(parcelable);
                        }
                        linkedHashMap3 = linkedHashMap3;
                        i9 = i10;
                        it7 = it7;
                        linkedHashMap5 = linkedHashMap5;
                    }
                }
                ?? r18 = arrayList;
                List<TicketInRound> list11 = round.tickets;
                list11.getClass();
                Iterator it10 = list11.iterator();
                long j = 0;
                while (it10.hasNext()) {
                    j += ((TicketInRound) it10.next()).totalReturn;
                }
                BigDecimal bigDecimal3 = new BigDecimal(j);
                List<TicketInRound> list12 = round.tickets;
                list12.getClass();
                TicketInRound ticketInRound = (TicketInRound) CollectionsKt.firstOrNull(list12);
                String str29 = ticketInRound != null ? ticketInRound.ticketId : null;
                String str30 = round.roundId;
                SportyLegendsSettlementRoundInfo sportyLegendsSettlementRoundInfo = new SportyLegendsSettlementRoundInfo(str29, str30 == null ? str : str30, bigDecimal3, sportyLegendsSettlementRoundInfoEvent2, r18);
                List<TicketInRound> list13 = round.tickets;
                list13.getClass();
                TicketInRound ticketInRound2 = (TicketInRound) CollectionsKt.firstOrNull(list13);
                SportyLegendsSettlementInput sportyLegendsSettlementInput = new SportyLegendsSettlementInput(sportyLegendsSettlementRoundInfo, ticketInRound2 != null ? ticketInRound2.ticketNumber : null, round.donChallengeId);
                sk3 sk3Var2 = sk3.PLAYER;
                ?? r9 = sk3Var == sk3Var2 ? 1 : i;
                wwd0 wwd0Var4 = jkc0Var.f;
                int i12 = (jkc0Var.b.d() && jkc0Var.c.b()) ? 1 : i;
                kk3 kk3Var2 = (kk3) jkc0Var.g.getValue();
                int i13 = (kk3Var2 != null ? kk3Var2.b : null) == sk3Var2 ? 1 : i;
                Iterable iterable2 = (Iterable) wwd0Var4.getValue();
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it11 = iterable2.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            i2 = i;
                            break;
                        }
                        if (((ikc0) it11.next()) == ikc0.b) {
                            i2 = 1;
                            break;
                        }
                    }
                } else {
                    i2 = i;
                    break;
                }
                c.b.g gVar = new c.b.g(sportyLegendsSettlementInput, r9, ((i13 == 0 && ((((List) wwd0Var4.getValue()).size() != 1 || CollectionsKt.firstOrNull((List) wwd0Var4.getValue()) != ikc0.b) ? i : 1) == 0) || i2 == 0 || i12 == 0) ? sk3.LITE : sk3.PLAYER);
                if (r9 != 0) {
                    w9c0Var.c(v9c0.b.a);
                }
                this.h0.a(gVar);
                this.e.b0();
                this.G.e();
                abc0Var.a();
                this.H.c();
            }
        }
        Throwable thA = zi50.a(obj);
        if (thA != null) {
            yy50.a.j(new jqc());
            while (true) {
                Object value4 = wwd0Var.getValue();
                wwd0 wwd0Var5 = wwd0Var;
                if (wwd0Var5.g(value4, lni0.a)) {
                    break;
                }
                wwd0Var = wwd0Var5;
            }
            this.K.c(z1(), thA);
        }
        jvd0 jvd0Var = this.e0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e0 = null;
        return Unit.a;
    }

    @Override // defpackage.ihy
    public final OddsFilterData z0() {
        return this.d.z0();
    }

    public final String z1() {
        SportyLegendsInput sportyLegendsInput = this.R;
        String str = sportyLegendsInput != null ? sportyLegendsInput.a : null;
        return str == null ? "" : str;
    }
}
