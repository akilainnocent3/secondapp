package com.sportybet.android.virtual.presentation.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.appsflyer.internal.u;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.widgets.SmoothScrollViewPager;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.MarketAttribute;
import com.sportybet.android.instantwin.newtork.model.response.MarketCategory;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.PlaceBetButtonLayout;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.event.MatchEventDetailInput;
import com.sportybet.android.instantwin.router.footballfamilysettlement.FootballFamilySettlementInput;
import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a33;
import defpackage.a5o;
import defpackage.aqn;
import defpackage.azm;
import defpackage.azu;
import defpackage.b0v;
import defpackage.b33;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.bqe;
import defpackage.bs3;
import defpackage.bz3;
import defpackage.c0v;
import defpackage.cd;
import defpackage.cyb;
import defpackage.cyh;
import defpackage.d0v;
import defpackage.d98;
import defpackage.dj5;
import defpackage.dqu;
import defpackage.e0v;
import defpackage.ebs;
import defpackage.ee;
import defpackage.eg2;
import defpackage.egl;
import defpackage.ei2;
import defpackage.ej5;
import defpackage.f0v;
import defpackage.fqk;
import defpackage.g0v;
import defpackage.gfo;
import defpackage.h0v;
import defpackage.h5e;
import defpackage.h8z;
import defpackage.haj;
import defpackage.hwr;
import defpackage.i0v;
import defpackage.i5s;
import defpackage.ib5;
import defpackage.if30;
import defpackage.ii2;
import defpackage.j0v;
import defpackage.j8o;
import defpackage.jq40;
import defpackage.k00;
import defpackage.k0v;
import defpackage.k9j;
import defpackage.klg;
import defpackage.ku90;
import defpackage.l0v;
import defpackage.lfy;
import defpackage.lmd;
import defpackage.m0v;
import defpackage.m2g;
import defpackage.m3v;
import defpackage.m780;
import defpackage.mpe0;
import defpackage.n4p;
import defpackage.o43;
import defpackage.o4p;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.paj;
import defpackage.pdd0;
import defpackage.png;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qwl;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rjo;
import defpackage.rzu;
import defpackage.s8o;
import defpackage.s9s;
import defpackage.spu;
import defpackage.sqf0;
import defpackage.sqo;
import defpackage.szu;
import defpackage.t340;
import defpackage.tfo;
import defpackage.tmk;
import defpackage.tzu;
import defpackage.u0v;
import defpackage.uhc;
import defpackage.uwd0;
import defpackage.v1v;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vyu;
import defpackage.w4s;
import defpackage.wkq;
import defpackage.wsm;
import defpackage.wwd0;
import defpackage.wyu;
import defpackage.wzu;
import defpackage.x1v;
import defpackage.x4s;
import defpackage.x5a0;
import defpackage.xdp;
import defpackage.xog;
import defpackage.xzu;
import defpackage.yf2;
import defpackage.ytw;
import defpackage.yzu;
import defpackage.z23;
import defpackage.zch0;
import defpackage.zf2;
import defpackage.zi50;
import defpackage.zzu;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/virtual/presentation/activity/MatchEventDetailActivity;", "Lcom/sportybet/android/instantwin/presentation/instantwin/view/a;", "Ldqu$a;", "Lk9j;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchEventDetailActivity extends qwl implements dqu.a, k9j, bb40 {
    public static final /* synthetic */ int U = 0;
    public cd B;
    public xog D;
    public BetBuilderOutcome E;
    public Event F;
    public boolean I;
    public ee<fqk> L;
    public rdd0 M;
    public s8o N;
    public x4s O;
    public wsm P;
    public JsonSerializeService Q;
    public u0v R;
    public j8o S;
    public azm T;
    public final mpe0 C = hwr.b(new Function0() { // from class: qzu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = MatchEventDetailActivity.U;
            return new xzu(this.a);
        }
    });
    public String G = "";
    public String H = "";
    public final ytw<Boolean> J = m.b(Boolean.FALSE);
    public final q8i0 K = new q8i0(jq40.a(m3v.class), new c(), new b(), new d());

    public static final class a implements lfy, paj {
        public final /* synthetic */ a33 a;

        public a(a33 a33Var) {
            this.a = a33Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return MatchEventDetailActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return MatchEventDetailActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return MatchEventDetailActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // dqu.a
    public final void F0(bs3 bs3Var, Event event, ArrayList arrayList) {
        if (getAccountHelper().getAccount() == null) {
            B1();
            i5s.b(getAccountHelper(), this, new k0v(this));
            return;
        }
        if (bs3Var != null) {
            String str = bs3Var.b;
            if (event == null || arrayList == null) {
                return;
            }
            Market marketD = sqo.d(event, str);
            Outcome outcomeH = sqo.h(marketD, bs3Var.c);
            BetSlipData betSlipData = new BetSlipData(event.eventId, bs3Var.b, bs3Var.c, marketD.title, outcomeH.desc, outcomeH.odds, event.homeTeamName, event.awayTeamName, outcomeH.probability, false);
            try {
                zi50.a aVar = zi50.b;
                if (outcomeH.probability == null) {
                    xdp xdpVar = new xdp();
                    xdpVar.i("roundId", ((n4p) C1()).t);
                    String str2 = event.eventId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    xdpVar.i(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, str2);
                    String str3 = marketD.marketId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    xdpVar.i("marketId", str3);
                    JsonSerializeService jsonSerializeService = this.Q;
                    if (jsonSerializeService == null) {
                        Intrinsics.n("jsonSerializeService");
                        throw null;
                    }
                    xdpVar.i("outcome", jsonSerializeService.toJson(outcomeH));
                    wsm wsmVar = this.P;
                    if (wsmVar == null) {
                        Intrinsics.n("crashlyticsHelper");
                        throw null;
                    }
                    wsmVar.g("Null probability for outcome in MatchEventDetailActivity", xdpVar.toString(), new NullPointerException(), null);
                }
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                zi50.a aVar2 = zi50.b;
            }
            String strB = sqo.b(betSlipData.eventId, betSlipData.marketId, betSlipData.outcomeId);
            if (!N1()) {
                ((n4p) C1()).v(strB, betSlipData);
                I1().A();
                str.getClass();
                c2(str, strB, arrayList, true);
                W1(new a5o.l(((n4p) C1()).c()));
                return;
            }
            m3v m3vVarI1 = I1();
            String strC = ((n4p) C1()).c();
            String str4 = outcomeH.mutexLookupKey;
            u0v u0vVar = m3vVarI1.A;
            if (str4 == null) {
                str4 = "";
            }
            u0vVar.e(strC, bs3Var, str4, true, m3vVarI1.L, m3vVarI1.e);
        }
    }

    public final void G1(int i) {
        Intent intent = new Intent();
        intent.putExtra("result_status", i);
        setResult(-1, intent);
        finish();
    }

    public final aqn H1() {
        aqn aqnVar;
        Object value = I1().W.getValue();
        png.c cVar = value instanceof png.c ? (png.c) value : null;
        return (cVar == null || (aqnVar = cVar.c) == null) ? aqn.a : aqnVar;
    }

    public final m3v I1() {
        return (m3v) this.K.getValue();
    }

    public final void J1() {
        if (((n4p) C1()).K == 0) {
            G1(1);
            return;
        }
        int iOrdinal = H1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                I1().G.b();
                O1();
                return;
            } else if (iOrdinal != 2) {
                uhc.a();
                return;
            }
        }
        R1();
    }

    public final void K1() {
        if (getAccountHelper().getAccount() != null) {
            rdd0 rdd0Var = this.M;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(new lmd("MatchEventDetailActivity#handleLoginFailed"), k00.d);
            getAccountHelper().logout();
        }
        Y1();
    }

    public final boolean L1() {
        BetBuilderOutcome betBuilderOutcome = this.E;
        List<BetBuilderRequest> list = betBuilderOutcome != null ? betBuilderOutcome.originalData : null;
        return (betBuilderOutcome == null || list == null || list.isEmpty()) ? false : true;
    }

    public final void M1() {
        cd cdVar = this.B;
        if (cdVar == null) {
            return;
        }
        SmoothScrollViewPager smoothScrollViewPager = cdVar.H;
        final TabLayout tabLayout = cdVar.F;
        tabLayout.n();
        smoothScrollViewPager.removeAllViews();
        smoothScrollViewPager.setSaveFromParentEnabled(false);
        cdVar.d.setVisibility(z1().c() ? 0 : 8);
        for (MarketCategory marketCategory : ((n4p) C1()).z(((n4p) C1()).c())) {
            String name = marketCategory.getName();
            String id = marketCategory.getId();
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.iwqk_market_tab, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(R.id.title)).setText(name);
            final TabLayout.g gVarL = tabLayout.l();
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            gVarL.c(viewInflate);
            gVarL.a = id;
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: fzu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = MatchEventDetailActivity.U;
                    tabLayout.s(gVarL, true);
                }
            });
            tabLayout.d(gVarL, false);
        }
    }

    public final boolean N1() {
        return I1().b.f().getValue().booleanValue();
    }

    public final void O1() {
        if (((Boolean) I1().d.d.a.getValue()).booleanValue()) {
            return;
        }
        if (this.H.length() == 0) {
            sqo.j(this, new DialogInterface.OnClickListener() { // from class: dzu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = MatchEventDetailActivity.U;
                    this.a.finish();
                }
            });
            return;
        }
        I1().x1();
        m3v m3vVarI1 = I1();
        String str = this.H;
        str.getClass();
        m3vVarI1.d.c(o8i0.d(m3vVarI1), str);
    }

    public final void P1(String str) {
        startActivity(A1().j(this, new FootballFamilySettlementInput(((n4p) C1()).c(), str, I1().H.b())));
    }

    public final void Q1(boolean z) {
        if (!z) {
            G1(0);
        } else {
            startActivity(A1().t(this, new InstantWinBetHistoryInput(((n4p) C1()).c())));
        }
    }

    public final void R1() {
        if (this.H.length() == 0) {
            sqo.j(this, new DialogInterface.OnClickListener() { // from class: ozu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = MatchEventDetailActivity.U;
                    this.a.finish();
                }
            });
        } else {
            A1().g(this, new OpenBetInput(this.H, false, InstantWinBetSource.BETSLIP));
        }
    }

    public final void S1() {
        cd cdVar = this.B;
        if (cdVar != null) {
            InstantWinQuickBetView instantWinQuickBetView = cdVar.G;
            if30 if30VarA = ((n4p) C1()).A();
            rjo rjoVar = rjo.a.a;
            if (((n4p) C1()).d.size() == 0) {
                rjoVar.a = 0;
            }
            instantWinQuickBetView.q(if30VarA, rjoVar.a);
        }
    }

    public final void T1() {
        try {
            cd cdVar = this.B;
            if (cdVar != null) {
                int currentItem = cdVar.H.getCurrentItem();
                xog xogVar = this.D;
                Fragment fragmentL = xogVar != null ? xogVar.l(currentItem) : null;
                if (fragmentL instanceof v1v) {
                    ((v1v) fragmentL).p0();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void U1(o4p o4pVar) {
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA;
        if (o4pVar == null) {
            return;
        }
        if30 if30VarA = ((n4p) C1()).A();
        o4p o4pVar2 = if30VarA != null ? if30VarA.c : null;
        if (o4pVar2 == null) {
            I1().b0();
            return;
        }
        String str = o4pVar.a;
        String str2 = o4pVar2.a;
        if (!str.equals(str2)) {
            I1().E(str);
            I1().E(str2);
            return;
        }
        m780 m780VarT0 = I1().v.t0(str2);
        if (m780VarT0 == null || (instantWinGiftApplicabilityContextA = sqf0.a(o4pVar2, ((n4p) C1()).B, ((n4p) C1()).C, z1(), null)) == null || gfo.a(m780VarT0.b, instantWinGiftApplicabilityContextA.a)) {
            return;
        }
        I1().E(str2);
    }

    public final void V1(String str) {
        rdd0 rdd0Var = this.M;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.g0(u.a(AnalyticsParam.CONTENT_TYPE, str), 0), k00.b, k00.a, k00.c);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    public final void W1(pdd0 pdd0Var) {
        rdd0 rdd0Var = this.M;
        if (rdd0Var != null) {
            rdd0Var.a(pdd0Var, k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    public final void X1(boolean z) {
        cd cdVar = this.B;
        if (cdVar == null) {
            return;
        }
        ComposeView composeView = cdVar.e;
        ComposeView composeView2 = cdVar.y;
        FrameLayout frameLayout = cdVar.D;
        SmoothScrollViewPager smoothScrollViewPager = cdVar.H;
        TabLayout tabLayout = cdVar.F;
        I1().g(z);
        if (!z) {
            composeView.setVisibility(8);
            tabLayout.setSelectedTabIndicatorHeight(bqe.a(4.0f));
            frameLayout.setVisibility(8);
            smoothScrollViewPager.setVisibility(0);
            composeView2.setVisibility(I1().w.d0() ? 0 : 8);
            return;
        }
        BetBuilderConfig betBuilderConfig = ((n4p) C1()).i;
        if (betBuilderConfig == null) {
            Y1();
            return;
        }
        u0v u0vVar = this.R;
        if (u0vVar == null) {
            Intrinsics.n("matchEventDetailDataSource");
            throw null;
        }
        String str = betBuilderConfig.marketType;
        str.getClass();
        EventData eventDataF = u0vVar.f(str);
        if (eventDataF != null) {
            List<Event> list = eventDataF.events;
            list.getClass();
            this.F = (Event) CollectionsKt.firstOrNull(list);
        }
        tabLayout.s(null, true);
        tabLayout.setSelectedTabIndicatorHeight(0);
        smoothScrollViewPager.setVisibility(8);
        frameLayout.setVisibility(0);
        composeView2.setVisibility(8);
        composeView.setVisibility(0);
        x4s x4sVar = this.O;
        if (x4sVar == null) {
            Intrinsics.n("legacyBetBuilderUtil");
            throw null;
        }
        if (((Boolean) dj5.a(e.a, new w4s(x4sVar, null))).booleanValue()) {
            return;
        }
        I1().r(2);
    }

    public final void Y1() {
        sqo.j(this, new DialogInterface.OnClickListener() { // from class: kzu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = MatchEventDetailActivity.U;
                this.a.G1(3);
            }
        });
        cd cdVar = this.B;
        if (cdVar != null) {
            cdVar.E.E();
        }
    }

    public final void Z1(DialogInterface.OnClickListener onClickListener) {
        androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(this).setTitle(getCMSString(R.string.page_instant_virtual__discard_selections, new Object[0]));
        title.a.f = getCMSString(R.string.page_instant_virtual__are_you_sure_you_want_to_discard_tip, new Object[0]);
        title.c(getCMSString(R.string.page_instant_virtual__discard, new Object[0]), onClickListener);
        title.b(getCMSString(R.string.page_instant_virtual__stay, new Object[0]), new DialogInterface.OnClickListener() { // from class: czu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = MatchEventDetailActivity.U;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                MatchEventDetailActivity matchEventDetailActivity = this.a;
                if (!matchEventDetailActivity.N1()) {
                    matchEventDetailActivity.X1(true);
                }
                matchEventDetailActivity.I1().y1(x2v.b.C1270b.a);
            }
        });
        androidx.appcompat.app.b bVarCreate = title.create();
        bVarCreate.getClass();
        bVarCreate.show();
        bVarCreate.f(-1).setAllCaps(false);
        Button buttonF = bVarCreate.f(-2);
        buttonF.setAllCaps(false);
        buttonF.setTextColor(getColor(R.color.brand_secondary));
    }

    public final void a2() {
        cd cdVar = this.B;
        if (cdVar != null) {
            cdVar.c.setRightCountBadge(((n4p) C1()).d.size());
        }
    }

    public final void b2(aqn aqnVar) {
        cd cdVar = this.B;
        if (cdVar != null) {
            PlaceBetButtonLayout placeBetButtonLayout = cdVar.c;
            int i = ((n4p) C1()).K;
            aqn aqnVar2 = aqn.b;
            placeBetButtonLayout.setLeftActionShimmerEnabled(aqnVar == aqnVar2 && i > 0);
            if (aqnVar == aqnVar2) {
                placeBetButtonLayout.setSmallOpenBetsButtonBadge(i);
            } else {
                placeBetButtonLayout.setSmallOpenBetsButtonBadge(0);
            }
            if (i == 0) {
                placeBetButtonLayout.setLeftActionBtnText(getCMSString(R.string.page_instant_virtual__next_round, new Object[0]));
                placeBetButtonLayout.setLeftActionBtnBackgroundColor(R.color.background_disable_type2_primary);
                placeBetButtonLayout.setLeftCountBadge(0);
            } else {
                int iOrdinal = aqnVar.ordinal();
                if (iOrdinal == 0) {
                    placeBetButtonLayout.setLeftActionBtnText(getCMSString(R.string.common_functions__open_bets, new Object[0]));
                    placeBetButtonLayout.setLeftActionBtnBackgroundColor(R.color.background_disable_type2_primary);
                    placeBetButtonLayout.setLeftCountBadge(i);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    placeBetButtonLayout.setLeftActionBtnText(getCMSString(R.string.common_functions__open_bets, new Object[0]));
                    placeBetButtonLayout.setLeftActionBtnBackgroundColor(R.color.background_disable_type2_primary);
                    placeBetButtonLayout.setLeftCountBadge(i);
                } else {
                    placeBetButtonLayout.setLeftActionBtnText(getCMSString(R.string.page_instant_virtual__kick_off, new Object[0]));
                    placeBetButtonLayout.setLeftActionBtnBackgroundColor(R.color.bg_brand_sub_tertiary_d_base);
                    placeBetButtonLayout.setLeftCountBadge(0);
                }
            }
        }
        ((x5a0) this.J).setValue(Boolean.valueOf(aqnVar == aqn.c && ((n4p) C1()).K > 0));
        a2();
    }

    public final void c2(String str, String str2, List list, boolean z) {
        spu next;
        BigDecimal bigDecimal = sqo.a;
        if (list == null) {
            next = null;
            break;
        }
        Iterator it = list.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            dqu dquVar = (dqu) it.next();
            spu spuVar = dquVar.d;
            MarketAttribute marketAttribute = spuVar.c;
            if (marketAttribute != null ? marketAttribute.combo : false) {
                Iterator<spu> it2 = dquVar.e.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (TextUtils.equals(next.a, str)) {
                        break loop0;
                    }
                }
            } else if (TextUtils.equals(spuVar.a, str)) {
                next = dquVar.d;
                break;
            }
        }
        h8z h8zVar = next != null ? (h8z) next.f.get(str2) : null;
        if (h8zVar != null) {
            h8zVar.f = z;
            o4p o4pVar = ((n4p) C1()).A().c;
            ((n4p) C1()).x(null);
            S1();
            a2();
            U1(o4pVar);
        }
    }

    /* JADX WARN: Type inference failed for: r3v46, types: [uyu] */
    /* JADX WARN: Type inference failed for: r4v10, types: [xyu] */
    /* JADX WARN: Type inference failed for: r5v1, types: [yyu] */
    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_instant_win_match_event_detail, (ViewGroup) null, false);
        int i2 = R.id.actionbar_match_event_detail;
        ActionBar actionBar = (ActionBar) h5e.a(R.id.actionbar_match_event_detail, viewInflate);
        if (actionBar != null) {
            i2 = R.id.barrier_bottom;
            if (((Barrier) h5e.a(R.id.barrier_bottom, viewInflate)) != null) {
                i2 = R.id.bottom_space;
                if (((Space) h5e.a(R.id.bottom_space, viewInflate)) != null) {
                    i2 = R.id.button_layout;
                    PlaceBetButtonLayout placeBetButtonLayout = (PlaceBetButtonLayout) h5e.a(R.id.button_layout, viewInflate);
                    if (placeBetButtonLayout != null) {
                        i2 = R.id.composeview_bet_builder;
                        ComposeView composeView = (ComposeView) h5e.a(R.id.composeview_bet_builder, viewInflate);
                        if (composeView != null) {
                            i2 = R.id.composeview_bet_builder_container;
                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.composeview_bet_builder_container, viewInflate);
                            if (composeView2 != null) {
                                i2 = R.id.composeview_floating_kickoff_button;
                                ComposeView composeView3 = (ComposeView) h5e.a(R.id.composeview_floating_kickoff_button, viewInflate);
                                if (composeView3 != null) {
                                    i2 = R.id.composeview_match_event_bet_builder_tutorial_bottom_sheet;
                                    ComposeView composeView4 = (ComposeView) h5e.a(R.id.composeview_match_event_bet_builder_tutorial_bottom_sheet, viewInflate);
                                    if (composeView4 != null) {
                                        i2 = R.id.composeview_match_event_detail_event_switcher_bottom_sheet;
                                        ComposeView composeView5 = (ComposeView) h5e.a(R.id.composeview_match_event_detail_event_switcher_bottom_sheet, viewInflate);
                                        if (composeView5 != null) {
                                            i2 = R.id.composeview_match_event_detail_head_to_head_stats_bottom_sheet;
                                            ComposeView composeView6 = (ComposeView) h5e.a(R.id.composeview_match_event_detail_head_to_head_stats_bottom_sheet, viewInflate);
                                            if (composeView6 != null) {
                                                i2 = R.id.composeview_match_event_detail_odds_filter;
                                                ComposeView composeView7 = (ComposeView) h5e.a(R.id.composeview_match_event_detail_odds_filter, viewInflate);
                                                if (composeView7 != null) {
                                                    i2 = R.id.composeview_match_event_detail_skip_to_result_dialog;
                                                    ComposeView composeView8 = (ComposeView) h5e.a(R.id.composeview_match_event_detail_skip_to_result_dialog, viewInflate);
                                                    if (composeView8 != null) {
                                                        i2 = R.id.composeview_match_event_detail_team_info;
                                                        ComposeView composeView9 = (ComposeView) h5e.a(R.id.composeview_match_event_detail_team_info, viewInflate);
                                                        if (composeView9 != null) {
                                                            i2 = R.id.composeview_match_event_details_gift_hint;
                                                            ComposeView composeView10 = (ComposeView) h5e.a(R.id.composeview_match_event_details_gift_hint, viewInflate);
                                                            if (composeView10 != null) {
                                                                i2 = R.id.composeview_match_event_details_market_guide_bottom_sheet;
                                                                ComposeView composeView11 = (ComposeView) h5e.a(R.id.composeview_match_event_details_market_guide_bottom_sheet, viewInflate);
                                                                if (composeView11 != null) {
                                                                    i2 = R.id.fragment_container;
                                                                    FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.fragment_container, viewInflate);
                                                                    if (frameLayout != null) {
                                                                        i2 = R.id.loading;
                                                                        LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, viewInflate);
                                                                        if (loadingView != null) {
                                                                            i2 = R.id.market_category_tab;
                                                                            TabLayout tabLayout = (TabLayout) h5e.a(R.id.market_category_tab, viewInflate);
                                                                            if (tabLayout != null) {
                                                                                i2 = R.id.quick_bet_view_area;
                                                                                InstantWinQuickBetView instantWinQuickBetView = (InstantWinQuickBetView) h5e.a(R.id.quick_bet_view_area, viewInflate);
                                                                                if (instantWinQuickBetView != null) {
                                                                                    i2 = R.id.view_pager;
                                                                                    SmoothScrollViewPager smoothScrollViewPager = (SmoothScrollViewPager) h5e.a(R.id.view_pager, viewInflate);
                                                                                    if (smoothScrollViewPager != null) {
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                        cd cdVar = new cd(constraintLayout, actionBar, placeBetButtonLayout, composeView, composeView2, composeView3, composeView4, composeView5, composeView6, composeView7, composeView8, composeView9, composeView10, composeView11, frameLayout, loadingView, tabLayout, instantWinQuickBetView, smoothScrollViewPager);
                                                                                        setContentView(constraintLayout);
                                                                                        this.B = cdVar;
                                                                                        m3v m3vVarI1 = I1();
                                                                                        m3vVarI1.G.a(o8i0.d(m3vVarI1), m3vVarI1.i.c());
                                                                                        this.L = registerForActivityResult(A1().a(), new zzu(this));
                                                                                        cd cdVar2 = this.B;
                                                                                        int i3 = 1;
                                                                                        if (cdVar2 != null) {
                                                                                            InstantWinQuickBetView instantWinQuickBetView2 = cdVar2.G;
                                                                                            E0(cdVar2.b, i0(), true, true, true, new wzu(this));
                                                                                            MatchEventDetailInput matchEventDetailInput = (MatchEventDetailInput) I1().J.a.getValue();
                                                                                            if (matchEventDetailInput == null) {
                                                                                                ib5.a("MatchEventDetailInput is required.");
                                                                                                return;
                                                                                            }
                                                                                            if (matchEventDetailInput.a.length() == 0) {
                                                                                                finish();
                                                                                            } else {
                                                                                                cdVar2.c.setChangeTeamsVisible(false);
                                                                                                ComposeView composeView12 = cdVar2.A;
                                                                                                final wwd0 wwd0Var = I1().D.e;
                                                                                                final v340 v340Var = I1().N;
                                                                                                final wkq wkqVar = new wkq(this, i3);
                                                                                                final ?? r3 = new Function0() { // from class: uyu
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    public final Object invoke() {
                                                                                                        int i4 = MatchEventDetailActivity.U;
                                                                                                        this.a.I1().y1(x2v.b.d.a);
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                };
                                                                                                final vyu vyuVar = new vyu(this, i);
                                                                                                v340Var.getClass();
                                                                                                composeView12.setContent(new op8(919265582, new Function2() { // from class: f2v
                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                    public final Object invoke(Object obj, Object obj2) {
                                                                                                        a aVar = (a) obj;
                                                                                                        int iIntValue = ((Integer) obj2).intValue();
                                                                                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                            final uwd0 uwd0Var = wwd0Var;
                                                                                                            final uwd0 uwd0Var2 = v340Var;
                                                                                                            final vyu vyuVar2 = vyuVar;
                                                                                                            final wkq wkqVar2 = wkqVar;
                                                                                                            final uyu uyuVar = r3;
                                                                                                            o0z.a(null, null, null, null, null, pp8.b(642892511, new Function2() { // from class: g2v
                                                                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                                public final Object invoke(Object obj3, Object obj4) {
                                                                                                                    a aVar2 = (a) obj3;
                                                                                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                        ytw ytwVarC = wyh.c(uwd0Var, aVar2, 0, 7);
                                                                                                                        ytw ytwVarC2 = wyh.c(uwd0Var2, aVar2, 0, 7);
                                                                                                                        w8i0 w8i0VarA = zdt.a(aVar2);
                                                                                                                        if (w8i0VarA == null) {
                                                                                                                            ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                                                                                            return null;
                                                                                                                        }
                                                                                                                        final sgl sglVar = (sgl) p8i0.a(jq40.a(sgl.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar2);
                                                                                                                        ytw ytwVarC3 = wyh.c(sglVar.b, aVar2, 0, 7);
                                                                                                                        n2v n2vVar = (n2v) ytwVarC.getValue();
                                                                                                                        boolean zBooleanValue = ((Boolean) ytwVarC2.getValue()).booleanValue();
                                                                                                                        boolean zBooleanValue2 = ((Boolean) ytwVarC3.getValue()).booleanValue();
                                                                                                                        final vyu vyuVar3 = vyuVar2;
                                                                                                                        boolean zM = aVar2.M(vyuVar3) | aVar2.A(sglVar);
                                                                                                                        Object objY = aVar2.y();
                                                                                                                        if (zM || objY == a.C0041a.a) {
                                                                                                                            objY = new Function0() { // from class: h2v
                                                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                                                public final Object invoke() {
                                                                                                                                    vyuVar3.invoke();
                                                                                                                                    sgl sglVar2 = sglVar;
                                                                                                                                    if (!((Boolean) sglVar2.b.a.getValue()).booleanValue()) {
                                                                                                                                        ej5.c(o8i0.d(sglVar2), null, null, new rgl(sglVar2, null), 3);
                                                                                                                                    }
                                                                                                                                    return Unit.a;
                                                                                                                                }
                                                                                                                            };
                                                                                                                            aVar2.r(objY);
                                                                                                                        }
                                                                                                                        m2v.a(n2vVar, zBooleanValue, zBooleanValue2, (Function0) objY, wkqVar2, uyuVar, aVar2, 0);
                                                                                                                    } else {
                                                                                                                        aVar2.G();
                                                                                                                    }
                                                                                                                    return Unit.a;
                                                                                                                }
                                                                                                            }, aVar), aVar, 196608);
                                                                                                        } else {
                                                                                                            aVar.G();
                                                                                                        }
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                }, true));
                                                                                                ComposeView composeView13 = cdVar2.w;
                                                                                                ku90 ku90Var = I1().Q;
                                                                                                klg klgVar = new klg(this, i3);
                                                                                                ku90Var.getClass();
                                                                                                composeView13.setContent(new op8(1913921605, new egl(ku90Var, klgVar), true));
                                                                                                ComposeView composeView14 = cdVar2.B;
                                                                                                v340 v340Var2 = I1().O;
                                                                                                h0v h0vVar = new h0v(0, I1(), m3v.class, "onGiftHintDismiss", "onGiftHintDismiss()V", 0);
                                                                                                v340Var2.getClass();
                                                                                                composeView14.setContent(new op8(-924927238, new tmk(v340Var2, h0vVar), true));
                                                                                                tfo.b(cdVar2.C, I1().a.a, new i0v(0, I1(), m3v.class, "hideMarketGuideBottomSheet", "hideMarketGuideBottomSheet()V", 0), new j0v(0, I1(), m3v.class, "hideMarketGuideBottomSheet", "hideMarketGuideBottomSheet()V", 0));
                                                                                                ComposeView composeView15 = cdVar2.v;
                                                                                                final wwd0 wwd0Var2 = I1().C.a;
                                                                                                final wyu wyuVar = new wyu(this, i);
                                                                                                final ?? r4 = new Function1() { // from class: xyu
                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                    public final Object invoke(Object obj) {
                                                                                                        String str = (String) obj;
                                                                                                        int i4 = MatchEventDetailActivity.U;
                                                                                                        str.getClass();
                                                                                                        this.a.I1().y1(new x2v.b.c(str));
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                };
                                                                                                final ?? r5 = new Function1() { // from class: yyu
                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                    public final Object invoke(Object obj) {
                                                                                                        String str = (String) obj;
                                                                                                        int i4 = MatchEventDetailActivity.U;
                                                                                                        str.getClass();
                                                                                                        this.a.I1().y1(new x2v.b.a(str));
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                };
                                                                                                wwd0Var2.getClass();
                                                                                                composeView15.setContent(new op8(1561441680, new Function2() { // from class: v0v
                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                    public final Object invoke(Object obj, Object obj2) {
                                                                                                        a aVar = (a) obj;
                                                                                                        int iIntValue = ((Integer) obj2).intValue();
                                                                                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                            final uwd0 uwd0Var = wwd0Var2;
                                                                                                            final wyu wyuVar2 = wyuVar;
                                                                                                            final xyu xyuVar = r4;
                                                                                                            final yyu yyuVar = r5;
                                                                                                            o0z.a(null, null, null, null, null, pp8.b(-1842801343, new Function2() { // from class: b1v
                                                                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                                                                @Override // kotlin.jvm.functions.Function2
                                                                                                                public final Object invoke(Object obj3, Object obj4) {
                                                                                                                    a aVar2 = (a) obj3;
                                                                                                                    int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                    if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                        ytw ytwVarC = wyh.c(uwd0Var, aVar2, 0, 7);
                                                                                                                        j590 j590VarG = v1w.g(true, null, aVar2, 6, 2);
                                                                                                                        u1v u1vVar = (u1v) ytwVarC.getValue();
                                                                                                                        if (u1vVar == null) {
                                                                                                                            aVar2.N(-622607803);
                                                                                                                            aVar2.H();
                                                                                                                        } else {
                                                                                                                            aVar2.N(-622607802);
                                                                                                                            j1v.f(u1vVar, j590VarG, wyuVar2, xyuVar, yyuVar, aVar2, 0);
                                                                                                                            aVar2.H();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        aVar2.G();
                                                                                                                    }
                                                                                                                    return Unit.a;
                                                                                                                }
                                                                                                            }, aVar), aVar, 196608);
                                                                                                        } else {
                                                                                                            aVar.G();
                                                                                                        }
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                }, true));
                                                                                                ComposeView composeView16 = cdVar2.i;
                                                                                                uwd0<ei2> uwd0VarF1 = I1().c.f1();
                                                                                                Function0 function0 = new Function0() { // from class: zyu
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    public final Object invoke() {
                                                                                                        int i4 = MatchEventDetailActivity.U;
                                                                                                        this.a.I1().n0();
                                                                                                        return Unit.a;
                                                                                                    }
                                                                                                };
                                                                                                uwd0VarF1.getClass();
                                                                                                composeView16.setContent(new op8(-1815462754, new yf2(i, uwd0VarF1, function0), true));
                                                                                                ComposeView composeView17 = cdVar2.f;
                                                                                                azu azuVar = new azu(this, i);
                                                                                                ytw<Boolean> ytwVar = this.J;
                                                                                                ytwVar.getClass();
                                                                                                composeView17.setContent(new op8(140914595, new cyh(ytwVar, azuVar), true));
                                                                                                ComposeView composeView18 = cdVar2.d;
                                                                                                uwd0<Boolean> uwd0VarF = I1().b.f();
                                                                                                StringUiText stringUiText = vch0.a;
                                                                                                int i4 = 2;
                                                                                                eg2.a(composeView18, uwd0VarF, true, new ResourceUiText(R.string.page_instant_virtual__toggle_off_to_return_regular_betting_mode), new z23(this, i4), new rzu(this, i));
                                                                                                ComposeView composeView19 = cdVar2.e;
                                                                                                uwd0<ii2> uwd0VarA = I1().b.a();
                                                                                                g0v g0vVar = new g0v(0, I1(), m3v.class, "toggleBetBuilderExpansion", "toggleBetBuilderExpansion()V", 0);
                                                                                                szu szuVar = new szu(this, i);
                                                                                                o43 o43Var = new o43(this, i4);
                                                                                                tzu tzuVar = new tzu(this, i);
                                                                                                uwd0VarA.getClass();
                                                                                                composeView19.setContent(new op8(1712219910, new zf2(uwd0VarA, g0vVar, szuVar, o43Var, tzuVar, 0), true));
                                                                                                cdVar2.H.setPageMargin(getResources().getDisplayMetrics().widthPixels / 2);
                                                                                                TabLayout tabLayout2 = cdVar2.F;
                                                                                                tabLayout2.setTabGravity(0);
                                                                                                tabLayout2.setTabMode(0);
                                                                                                tabLayout2.setSelectedTabIndicatorHeight(zch0.b(getResources(), 4));
                                                                                                tabLayout2.setSelectedTabIndicatorColor(tabLayout2.getResources().getColor(R.color.brand_secondary));
                                                                                                tabLayout2.a((xzu) this.C.getValue());
                                                                                                M1();
                                                                                                instantWinQuickBetView2.setQuickBetListener(this, new yzu(this));
                                                                                                instantWinQuickBetView2.bringToFront();
                                                                                            }
                                                                                        }
                                                                                        I1().x1();
                                                                                        t340 t340Var = I1().d.f;
                                                                                        s9s.b bVar = s9s.b.a;
                                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new b0v(this, t340Var, null, this), 3);
                                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new c0v(this, I1().W, null, this), 3);
                                                                                        I1().L.f(this, new a(new a33(this, i3)));
                                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new d0v(this, I1().v.p1(), null, this), 3);
                                                                                        m3v m3vVarI2 = I1();
                                                                                        bz3 bz3Var = bz3.SINGLE;
                                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new e0v(this, m3vVarI2.v.G0(SimulateBetConsts.BetslipType.SINGLE), null, this), 3);
                                                                                        if (I1().I.V()) {
                                                                                            ej5.c(ebs.a(getLifecycle()), null, null, new f0v(this, I1().I.s0(), null, this), 3);
                                                                                        }
                                                                                        m3v m3vVarI3 = I1();
                                                                                        m3vVarI3.v.T0(((n4p) C1()).c());
                                                                                        cd cdVar3 = this.B;
                                                                                        if (cdVar3 != null) {
                                                                                            PlaceBetButtonLayout placeBetButtonLayout2 = cdVar3.c;
                                                                                            placeBetButtonLayout2.setLeftBtnClick(new View.OnClickListener() { // from class: tyu
                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i5 = MatchEventDetailActivity.U;
                                                                                                    final MatchEventDetailActivity matchEventDetailActivity = this.a;
                                                                                                    if (!matchEventDetailActivity.L1() || matchEventDetailActivity.H1() == aqn.b) {
                                                                                                        matchEventDetailActivity.J1();
                                                                                                    } else {
                                                                                                        matchEventDetailActivity.Z1(new DialogInterface.OnClickListener() { // from class: jzu
                                                                                                            @Override // android.content.DialogInterface.OnClickListener
                                                                                                            public final void onClick(DialogInterface dialogInterface, int i6) {
                                                                                                                int i7 = MatchEventDetailActivity.U;
                                                                                                                dialogInterface.getClass();
                                                                                                                dialogInterface.dismiss();
                                                                                                                matchEventDetailActivity.J1();
                                                                                                            }
                                                                                                        });
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            placeBetButtonLayout2.setSmallOpenBetsButtonClick(new b33(this, 1));
                                                                                            placeBetButtonLayout2.setRightBtnClick(new d98(this, i3));
                                                                                            b2(H1());
                                                                                        }
                                                                                        getOnBackPressedDispatcher().a(this, new l0v(this));
                                                                                        ej5.c(ebs.a(getLifecycle()), null, null, new m0v(this, I1().X, null, this), 3);
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        I1().A1();
        m3v m3vVarI1 = I1();
        x1v x1vVar = m3vVarI1.M;
        if (x1vVar != null) {
            m3vVarI1.A.f.remove(x1vVar);
            m3vVarI1.M = null;
        }
        u0v u0vVar = this.R;
        if (u0vVar == null) {
            Intrinsics.n("matchEventDetailDataSource");
            throw null;
        }
        u0vVar.a();
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        I1().R(((n4p) C1()).c(), ((n4p) C1()).t, ((n4p) C1()).d.values());
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        b2(H1());
        S1();
    }

    @Override // dqu.a
    public final void z0(bs3 bs3Var, ArrayList arrayList) {
        List list;
        if (bs3Var == null) {
            return;
        }
        String str = bs3Var.c;
        String str2 = bs3Var.b;
        BigDecimal bigDecimal = sqo.a;
        String strB = sqo.b(bs3Var.a, str2, str);
        if (!N1()) {
            ((n4p) C1()).I(strB);
            if (arrayList == null) {
                list = arrayList;
                list = m2g.a;
            }
            list = arrayList;
            str2.getClass();
            c2(str2, strB, list, false);
            return;
        }
        Outcome outcomeH = sqo.h(sqo.d(this.F, str2), str);
        m3v m3vVarI1 = I1();
        String strC = ((n4p) C1()).c();
        String str3 = outcomeH.mutexLookupKey;
        u0v u0vVar = m3vVarI1.A;
        if (str3 == null) {
            str3 = "";
        }
        u0vVar.e(strC, bs3Var, str3, false, m3vVarI1.L, m3vVarI1.e);
    }
}
