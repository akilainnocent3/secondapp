package com.sportybet.android.virtual.presentation.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.nfj.CaBJCMnsV;
import androidx.viewpager2.widget.ViewPager2;
import com.appsflyer.internal.u;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.newtork.model.response.CreateEvent;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.instantwin.presentation.event.adapter.MatchEventInfoAdapter;
import com.sportybet.android.instantwin.presentation.widget.ActionBar;
import com.sportybet.android.instantwin.presentation.widget.PlaceBetButtonLayout;
import com.sportybet.android.instantwin.router.event.MatchEventDetailInput;
import com.sportybet.android.instantwin.router.footballfamilysettlement.FootballFamilySettlementInput;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a2v;
import defpackage.a5o;
import defpackage.ajy;
import defpackage.aqn;
import defpackage.avb;
import defpackage.ayu;
import defpackage.azm;
import defpackage.b2v;
import defpackage.b5v;
import defpackage.bb40;
import defpackage.bd;
import defpackage.bmy;
import defpackage.bxu;
import defpackage.bz3;
import defpackage.crg;
import defpackage.ctg;
import defpackage.cxu;
import defpackage.cyb;
import defpackage.cyh;
import defpackage.dj5;
import defpackage.dxu;
import defpackage.ebs;
import defpackage.ee;
import defpackage.egl;
import defpackage.ei2;
import defpackage.ej5;
import defpackage.evb;
import defpackage.exu;
import defpackage.fqk;
import defpackage.fvb;
import defpackage.gfo;
import defpackage.h5e;
import defpackage.hjg;
import defpackage.hwr;
import defpackage.hxu;
import defpackage.i5v;
import defpackage.if30;
import defpackage.ihy;
import defpackage.j8o;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.k00;
import defpackage.k9j;
import defpackage.ku90;
import defpackage.kxu;
import defpackage.lmd;
import defpackage.lnt;
import defpackage.lxu;
import defpackage.lyu;
import defpackage.m2g;
import defpackage.m780;
import defpackage.mpe0;
import defpackage.mpg;
import defpackage.mwu;
import defpackage.n4p;
import defpackage.nwl;
import defpackage.nwu;
import defpackage.nyu;
import defpackage.o4p;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.p3v;
import defpackage.p4v;
import defpackage.pdd0;
import defpackage.pkg;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qub;
import defpackage.qwu;
import defpackage.qxu;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rjo;
import defpackage.rxu;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sqf0;
import defpackage.sqo;
import defpackage.sub;
import defpackage.swu;
import defpackage.sxu;
import defpackage.tfo;
import defpackage.tmk;
import defpackage.txu;
import defpackage.u0v;
import defpackage.ufo;
import defpackage.uwd0;
import defpackage.uxu;
import defpackage.uy0;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vxu;
import defpackage.w4s;
import defpackage.wwd0;
import defpackage.wxu;
import defpackage.x4s;
import defpackage.xxu;
import defpackage.y4v;
import defpackage.yf2;
import defpackage.ytw;
import defpackage.yxu;
import defpackage.z5v;
import defpackage.zxu;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/android/virtual/presentation/activity/MatchEventActivity;", "Lcom/sportybet/android/instantwin/presentation/instantwin/view/a;", "Lk9j;", "Lnyu;", "Lb5v;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchEventActivity extends nwl implements k9j, nyu, b5v, bb40 {
    public static final /* synthetic */ int a0 = 0;
    public bd B;
    public final mpe0 C = hwr.b(new Function0() { // from class: pwu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = MatchEventActivity.a0;
            return new ixu(this.a);
        }
    });
    public lyu D;
    public Parcelable E;
    public boolean F;
    public y4v G;
    public Parcelable H;
    public boolean I;
    public final ytw<Boolean> J;
    public final ytw<Boolean> K;
    public final mpe0 L;
    public final mpe0 M;
    public final p3v N;
    public final mpe0 O;
    public final mpe0 P;
    public LinearLayoutManager.SavedState Q;
    public final q8i0 R;
    public ee<fqk> S;
    public ee<MatchEventDetailInput> T;
    public x4s U;
    public rdd0 V;
    public ihy W;
    public azm X;
    public j8o Y;
    public u0v Z;

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[aqn.values().length];
            try {
                aqn aqnVar = aqn.a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                aqn aqnVar2 = aqn.a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                aqn aqnVar3 = aqn.a;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[a2v.values().length];
            try {
                a2v a2vVar = a2v.a;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a2v a2vVar2 = a2v.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a2v a2vVar3 = a2v.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a2v a2vVar4 = a2v.a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object next;
            z5v z5vVar = (z5v) this.receiver;
            if (z5vVar.z.s()) {
                Object value = z5vVar.T.a.getValue();
                ctg.a aVar = value instanceof ctg.a ? (ctg.a) value : null;
                if (aVar != null) {
                    String str = z5vVar.Z;
                    if (StringsKt.U(str)) {
                        MarketType marketType = (MarketType) CollectionsKt.firstOrNull(aVar.b);
                        String str2 = marketType != null ? marketType.type : null;
                        str = str2 == null ? "" : str2;
                    }
                    if (!StringsKt.U(str)) {
                        Event event = (Event) CollectionsKt.firstOrNull(z5vVar.W);
                        List<Market> list = event != null ? event.markets : null;
                        if (list == null) {
                            list = m2g.a;
                        }
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((Market) next).type, str));
                        Market market = (Market) next;
                        if (market != null) {
                            String str3 = market.guide;
                            String str4 = str3 != null ? str3 : "";
                            if (!StringsKt.U(str4)) {
                                String str5 = market.title;
                                str5.getClass();
                                z5vVar.a.a.k(null, new ufo(str5, str4));
                            }
                        }
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return MatchEventActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return MatchEventActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return MatchEventActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public MatchEventActivity() {
        Boolean bool = Boolean.FALSE;
        this.J = m.b(bool);
        this.K = m.b(bool);
        this.L = hwr.b(new qwu(this));
        this.M = hwr.b(new qub(this, 1));
        this.N = new p3v();
        this.O = hwr.b(new sub(this, 2));
        this.P = hwr.b(new swu(this, 0));
        this.R = new q8i0(jq40.a(z5v.class), new d(), new c(), new e());
    }

    @Override // defpackage.b5v
    public final void C0(int i, int i2) {
        bd bdVar = this.B;
        if (bdVar != null) {
            RecyclerView recyclerView = bdVar.G;
            if (recyclerView.I) {
                this.I = true;
                recyclerView.scrollBy(i, i2);
                this.I = false;
            }
        }
    }

    @Override // defpackage.nyu
    public final void G0(lyu lyuVar) {
        this.D = lyuVar;
        Parcelable parcelable = this.E;
        if (parcelable != null) {
            ((LinearLayoutManager) lyuVar.i.getValue()).v0(parcelable);
            this.E = null;
        }
    }

    public final MatchEventInfoAdapter G1() {
        return (MatchEventInfoAdapter) this.M.getValue();
    }

    public final LinearLayoutManager H1() {
        return (LinearLayoutManager) this.L.getValue();
    }

    public final z5v I1() {
        return (z5v) this.R.getValue();
    }

    @Override // defpackage.b5v
    public final void J(BaseNode baseNode) {
        P1(baseNode, false);
    }

    public final boolean J1() {
        return I1().b.f().getValue().booleanValue();
    }

    public final void K1() {
        CreateEvent createEvent;
        String str;
        if (((Boolean) I1().d.d.a.getValue()).booleanValue()) {
            return;
        }
        Object value = I1().T.a.getValue();
        ctg.a aVar = value instanceof ctg.a ? (ctg.a) value : null;
        if (aVar == null || (createEvent = aVar.a) == null || (str = createEvent.roundId) == null) {
            return;
        }
        if (str.length() == 0) {
            sqo.j(this, new DialogInterface.OnClickListener() { // from class: twu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = MatchEventActivity.a0;
                    this.a.finish();
                }
            });
        } else {
            z5v z5vVarI1 = I1();
            z5vVarI1.d.c(o8i0.d(z5vVarI1), str);
        }
    }

    @Override // defpackage.nyu
    public final void M(int i, int i2) {
        bd bdVar = this.B;
        if (bdVar != null) {
            RecyclerView recyclerView = bdVar.G;
            if (recyclerView.I) {
                this.F = true;
                recyclerView.scrollBy(i, i2);
                this.F = false;
            }
        }
    }

    public final void M1(String str) {
        startActivity(A1().j(this, new FootballFamilySettlementInput(((n4p) C1()).c(), str, I1().L.b())));
    }

    public final void N1() {
        String strC = ((n4p) C1()).c();
        Intent intentL = A1().l(this, new InstantWinInput(strC, null, null, I1().O.B(strC)));
        intentL.addFlags(65536);
        startActivity(intentL);
    }

    public final void O1() {
        ctg ctgVar = (ctg) I1().T.a.getValue();
        if (ctgVar instanceof ctg.a) {
            String str = ((ctg.a) ctgVar).a.roundId;
            if (str.length() == 0) {
                sqo.j(this, new DialogInterface.OnClickListener() { // from class: ywu
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = MatchEventActivity.a0;
                        this.a.finish();
                    }
                });
            } else {
                startActivity(A1().i(this, str));
            }
        }
    }

    public final void P1(BaseNode baseNode, boolean z) {
        String str;
        U1(new a5o.p(((n4p) C1()).c()));
        if (baseNode instanceof mpg) {
            str = ((mpg) baseNode).c;
            str.getClass();
        } else {
            if (!(baseNode instanceof crg)) {
                return;
            }
            str = ((crg) baseNode).a;
            str.getClass();
        }
        ee<MatchEventDetailInput> eeVar = this.T;
        if (eeVar != null) {
            String str2 = ((n4p) C1()).t;
            if (str2 == null) {
                str2 = "";
            }
            MatchEventDetailInput matchEventDetailInput = new MatchEventDetailInput(str, z, str2);
            z5v z5vVarI1 = I1();
            if (str2.length() != 0) {
                z5vVarI1.C.a(str2, new b2v((List) z5vVarI1.X.getValue(), (List) z5vVarI1.Y.getValue()));
            }
            eeVar.b(matchEventDetailInput);
        }
        overridePendingTransition(0, 0);
    }

    public final void Q1() {
        bd bdVar = this.B;
        if (bdVar != null) {
            bdVar.E.setRightCountBadge(((n4p) C1()).d.size());
        }
    }

    public final void R1() {
        bd bdVar = this.B;
        if (bdVar != null) {
            InstantWinQuickBetView instantWinQuickBetView = bdVar.F;
            if30 if30VarA = ((n4p) C1()).A();
            rjo rjoVar = rjo.a.a;
            if (((n4p) C1()).d.size() == 0) {
                rjoVar.a = 0;
            }
            instantWinQuickBetView.q(if30VarA, rjoVar.a);
        }
    }

    public final void S1(String str) {
        rdd0 rdd0Var = this.V;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.g0(u.a(AnalyticsParam.CONTENT_TYPE, str), 0), k00.b, k00.a, k00.c);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    public final void T1(boolean z) {
        if (z) {
            S1("market_tab_" + getCMSString(R.string.page_instant_virtual__bet_builder, new Object[0]));
        }
        U1(new a5o.k(((n4p) C1()).c(), Boolean.valueOf(z)));
        getFullStoryCommonManager().f(AnalyticsEvent.IV__EVENT_LIST__BET_BUILDER_BTN, jpu.b(new Pair(AnalyticsParam.EVENT_STATUS, Boolean.valueOf(z))));
    }

    public final void U1(pdd0 pdd0Var) {
        rdd0 rdd0Var = this.V;
        if (rdd0Var != null) {
            rdd0Var.a(pdd0Var, k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    public final void V1(boolean z) {
        if (z == J1()) {
            return;
        }
        I1().g(z);
        bd bdVar = this.B;
        if (!z) {
            if (bdVar != null) {
                bdVar.H.setSelectedTabIndicatorColor(getColor(R.color.brand_secondary));
                bdVar.C.setVisibility(4);
                bdVar.G.setVisibility(0);
                bdVar.J.setVisibility(0);
                ComposeView composeView = bdVar.A;
                ihy ihyVar = this.W;
                if (ihyVar != null) {
                    composeView.setVisibility(ihyVar.d0() ? 0 : 8);
                    return;
                } else {
                    Intrinsics.n("oddsFilterManager");
                    throw null;
                }
            }
            return;
        }
        if (bdVar != null) {
            bdVar.H.setSelectedTabIndicatorColor(0);
            bdVar.C.setVisibility(0);
            bdVar.G.setVisibility(4);
            bdVar.J.setVisibility(4);
            bdVar.A.setVisibility(8);
        }
        x4s x4sVar = this.U;
        if (x4sVar == null) {
            Intrinsics.n("legacyBetBuilderUtil");
            throw null;
        }
        if (((Boolean) dj5.a(kotlin.coroutines.e.a, new w4s(x4sVar, null))).booleanValue()) {
            return;
        }
        I1().r(1);
    }

    @Override // defpackage.nyu
    public final void Z0(mpg mpgVar) {
        P1(mpgVar, true);
    }

    @Override // defpackage.b5v
    public final void c1(y4v y4vVar) throws Throwable {
        this.G = y4vVar;
        Parcelable parcelable = this.H;
        if (parcelable != null) {
            ((LinearLayoutManager) y4vVar.i.getValue()).v0(parcelable);
            this.H = null;
        }
        R1();
        Q1();
        y4v y4vVar2 = this.G;
        if (y4vVar2 != null) {
            y4vVar2.r0();
        }
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.xzf0
    public final String i0() {
        String cMSString;
        Integer numC = I1().A.c(((n4p) C1()).c());
        return (numC == null || (cMSString = getCMSString(numC.intValue(), new Object[0])) == null) ? super.i0() : cMSString;
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.B = null;
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        lyu lyuVar = this.D;
        this.E = lyuVar != null ? (LinearLayoutManager.SavedState) ((LinearLayoutManager) lyuVar.i.getValue()).w0() : null;
        y4v y4vVar = this.G;
        this.H = y4vVar != null ? y4vVar.s0() : null;
        this.Q = (LinearLayoutManager.SavedState) H1().w0();
        bd bdVar = this.B;
        if (bdVar != null) {
            bdVar.G.k0((kxu) this.O.getValue());
        }
        I1().R(((n4p) C1()).c(), ((n4p) C1()).t, ((n4p) C1()).d.values());
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        uy0 uy0Var = this.w;
        if (uy0Var == null) {
            Intrinsics.n("assetsInfoRepository");
            throw null;
        }
        uy0Var.g();
        I1().E1(null);
        bd bdVar = this.B;
        if (bdVar != null) {
            bdVar.G.k((kxu) this.O.getValue());
        }
    }

    @Override // defpackage.b5v
    public final void u0() {
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA;
        o4p o4pVar = ((n4p) C1()).A().c;
        ((n4p) C1()).x(null);
        R1();
        Q1();
        if (o4pVar == null) {
            return;
        }
        o4p o4pVar2 = ((n4p) C1()).A().c;
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
        m780 m780VarT0 = I1().E.t0(str2);
        if (m780VarT0 == null || (instantWinGiftApplicabilityContextA = sqf0.a(o4pVar2, ((n4p) C1()).B, ((n4p) C1()).C, z1(), null)) == null || gfo.a(m780VarT0.b, instantWinGiftApplicabilityContextA.a)) {
            return;
        }
        I1().E(str2);
    }

    public final void L1(String str) {
        rdd0 rdd0Var = this.V;
        if (rdd0Var != null) {
            rdd0Var.a(new lmd(siPCzPFw.gzcJYaNy.concat(str)), k00.d);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    @Override // com.sportybet.android.instantwin.presentation.instantwin.view.a, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final MatchEventActivity matchEventActivity = this;
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = matchEventActivity.getLayoutInflater().inflate(R.layout.activity_instant_win_match_event, (ViewGroup) null, false);
        int i2 = R.id.actionbar_match_event;
        ActionBar actionBar = (ActionBar) h5e.a(R.id.actionbar_match_event, viewInflate);
        if (actionBar != null) {
            i2 = R.id.barrier_match_event_bottom;
            if (((Barrier) h5e.a(R.id.barrier_match_event_bottom, viewInflate)) != null) {
                i2 = R.id.composeview_bet_builder_container;
                ComposeView composeView = (ComposeView) h5e.a(R.id.composeview_bet_builder_container, viewInflate);
                if (composeView != null) {
                    i2 = R.id.composeview_floating_kickoff_button;
                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.composeview_floating_kickoff_button, viewInflate);
                    if (composeView2 != null) {
                        i2 = R.id.composeview_match_event_bet_builder_tutorial_bottom_sheet;
                        ComposeView composeView3 = (ComposeView) h5e.a(R.id.composeview_match_event_bet_builder_tutorial_bottom_sheet, viewInflate);
                        if (composeView3 != null) {
                            i2 = R.id.composeview_match_event_explore_more_bottom_sheet;
                            ComposeView composeView4 = (ComposeView) h5e.a(R.id.composeview_match_event_explore_more_bottom_sheet, viewInflate);
                            if (composeView4 != null) {
                                i2 = R.id.composeview_match_event_gift_hint;
                                ComposeView composeView5 = (ComposeView) h5e.a(R.id.composeview_match_event_gift_hint, viewInflate);
                                if (composeView5 != null) {
                                    i2 = R.id.composeview_match_event_head_to_head_stats_bottom_sheet;
                                    ComposeView composeView6 = (ComposeView) h5e.a(R.id.composeview_match_event_head_to_head_stats_bottom_sheet, viewInflate);
                                    if (composeView6 != null) {
                                        i2 = R.id.composeview_match_event_league_stats_button;
                                        ComposeView composeView7 = (ComposeView) h5e.a(R.id.composeview_match_event_league_stats_button, viewInflate);
                                        if (composeView7 != null) {
                                            i2 = R.id.composeview_match_event_league_tab;
                                            ComposeView composeView8 = (ComposeView) h5e.a(R.id.composeview_match_event_league_tab, viewInflate);
                                            if (composeView8 != null) {
                                                i2 = R.id.composeview_match_event_market_guide_bottom_sheet;
                                                ComposeView composeView9 = (ComposeView) h5e.a(R.id.composeview_match_event_market_guide_bottom_sheet, viewInflate);
                                                if (composeView9 != null) {
                                                    i2 = R.id.composeview_match_event_odds_filter;
                                                    ComposeView composeView10 = (ComposeView) h5e.a(R.id.composeview_match_event_odds_filter, viewInflate);
                                                    if (composeView10 != null) {
                                                        i2 = R.id.composeview_match_event_skip_to_result_dialog;
                                                        ComposeView composeView11 = (ComposeView) h5e.a(R.id.composeview_match_event_skip_to_result_dialog, viewInflate);
                                                        if (composeView11 != null) {
                                                            i2 = R.id.framelayout_match_event_betbuilder_fragment_container;
                                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.framelayout_match_event_betbuilder_fragment_container, viewInflate);
                                                            if (frameLayout != null) {
                                                                i2 = R.id.loadingview_match_event_loading;
                                                                LoadingView loadingView = (LoadingView) h5e.a(R.id.loadingview_match_event_loading, viewInflate);
                                                                if (loadingView != null) {
                                                                    i2 = R.id.placebetbuttonlayout_match_event;
                                                                    PlaceBetButtonLayout placeBetButtonLayout = (PlaceBetButtonLayout) h5e.a(R.id.placebetbuttonlayout_match_event, viewInflate);
                                                                    if (placeBetButtonLayout != null) {
                                                                        i2 = R.id.quickbetview_match_event;
                                                                        InstantWinQuickBetView instantWinQuickBetView = (InstantWinQuickBetView) h5e.a(R.id.quickbetview_match_event, viewInflate);
                                                                        if (instantWinQuickBetView != null) {
                                                                            i2 = R.id.recyclerview_match_event_info;
                                                                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recyclerview_match_event_info, viewInflate);
                                                                            if (recyclerView != null) {
                                                                                i2 = R.id.space_match_event_bottom_button_gap;
                                                                                if (((Space) h5e.a(R.id.space_match_event_bottom_button_gap, viewInflate)) != null) {
                                                                                    i2 = R.id.tablayout_match_event_market;
                                                                                    TabLayout tabLayout = (TabLayout) h5e.a(R.id.tablayout_match_event_market, viewInflate);
                                                                                    if (tabLayout != null) {
                                                                                        i2 = R.id.view_match_event_market_tab_background;
                                                                                        View viewA = h5e.a(R.id.view_match_event_market_tab_background, viewInflate);
                                                                                        if (viewA != null) {
                                                                                            i2 = R.id.viewpager_match_event_outcome;
                                                                                            ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.viewpager_match_event_outcome, viewInflate);
                                                                                            if (viewPager2 != null) {
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                bd bdVar = new bd(constraintLayout, actionBar, composeView, composeView2, composeView3, composeView4, composeView5, composeView6, composeView7, composeView8, composeView9, composeView10, composeView11, frameLayout, loadingView, placeBetButtonLayout, instantWinQuickBetView, recyclerView, tabLayout, viewA, viewPager2);
                                                                                                matchEventActivity.setContentView(constraintLayout);
                                                                                                matchEventActivity.B = bdVar;
                                                                                                matchEventActivity.S = matchEventActivity.registerForActivityResult(matchEventActivity.A1().a(), new qxu(matchEventActivity));
                                                                                                matchEventActivity.T = matchEventActivity.registerForActivityResult(matchEventActivity.A1().h(), new rxu(matchEventActivity));
                                                                                                bd bdVar2 = matchEventActivity.B;
                                                                                                if (bdVar2 != null) {
                                                                                                    matchEventActivity.E0(bdVar2.b, matchEventActivity.i0(), true, true, true, new hxu(matchEventActivity));
                                                                                                    ComposeView composeView12 = bdVar2.i;
                                                                                                    v340 v340Var = matchEventActivity.I1().a0;
                                                                                                    int i3 = 2;
                                                                                                    avb avbVar = new avb(matchEventActivity, i3);
                                                                                                    v340Var.getClass();
                                                                                                    int i4 = 1;
                                                                                                    composeView12.setContent(new op8(-924927238, new tmk(v340Var, avbVar), true));
                                                                                                    ComposeView composeView13 = bdVar2.y;
                                                                                                    final wwd0 wwd0Var = matchEventActivity.I1().J.d;
                                                                                                    final dxu dxuVar = new dxu(matchEventActivity);
                                                                                                    composeView13.setContent(new op8(-204847543, new Function2() { // from class: g4v
                                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                                                            a aVar = (a) obj;
                                                                                                            int iIntValue = ((Integer) obj2).intValue();
                                                                                                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                                final uwd0 uwd0Var = wwd0Var;
                                                                                                                final dxu dxuVar2 = dxuVar;
                                                                                                                o0z.a(null, null, null, null, null, pp8.b(2142573560, new Function2() { // from class: h4v
                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                                    public final Object invoke(Object obj3, Object obj4) {
                                                                                                                        a aVar2 = (a) obj3;
                                                                                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                        if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                            m4v m4vVar = (m4v) wyh.c(uwd0Var, aVar2, 0, 7).getValue();
                                                                                                                            if (m4vVar == null) {
                                                                                                                                aVar2.N(1900036050);
                                                                                                                            } else {
                                                                                                                                aVar2.N(1900036051);
                                                                                                                                l4v.a(m4vVar, dxuVar2, aVar2, 0);
                                                                                                                            }
                                                                                                                            aVar2.H();
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
                                                                                                    ComposeView composeView14 = bdVar2.w;
                                                                                                    final String strC = ((n4p) matchEventActivity.C1()).c();
                                                                                                    final v340 v340Var2 = matchEventActivity.I1().b0;
                                                                                                    final fvb fvbVar = new fvb(matchEventActivity, i3);
                                                                                                    final exu exuVar = new exu(matchEventActivity, i);
                                                                                                    v340Var2.getClass();
                                                                                                    composeView14.setContent(new op8(-20172581, new Function2() { // from class: r3v
                                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                                                            a aVar = (a) obj;
                                                                                                            int iIntValue = ((Integer) obj2).intValue();
                                                                                                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                                final uwd0 uwd0Var = v340Var2;
                                                                                                                final String str = strC;
                                                                                                                final fvb fvbVar2 = fvbVar;
                                                                                                                final exu exuVar2 = exuVar;
                                                                                                                o0z.a(null, null, null, null, null, pp8.b(807104076, new Function2() { // from class: s3v
                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                                    public final Object invoke(Object obj3, Object obj4) {
                                                                                                                        a aVar2 = (a) obj3;
                                                                                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                        if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                            ytw ytwVarC = wyh.c(uwd0Var, aVar2, 0, 7);
                                                                                                                            w8i0 w8i0VarA = zdt.a(aVar2);
                                                                                                                            if (w8i0VarA == null) {
                                                                                                                                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                                                                                                                return null;
                                                                                                                            }
                                                                                                                            final r3s r3sVar = (r3s) p8i0.a(jq40.a(r3s.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar2);
                                                                                                                            ytw ytwVarC2 = wyh.c(r3sVar.b, aVar2, 0, 7);
                                                                                                                            boolean zBooleanValue = ((Boolean) ytwVarC.getValue()).booleanValue();
                                                                                                                            boolean zBooleanValue2 = ((Boolean) ytwVarC2.getValue()).booleanValue();
                                                                                                                            final fvb fvbVar3 = fvbVar2;
                                                                                                                            boolean zM = aVar2.M(fvbVar3) | aVar2.A(r3sVar);
                                                                                                                            Object objY = aVar2.y();
                                                                                                                            if (zM || objY == a.C0041a.a) {
                                                                                                                                objY = new Function0() { // from class: t3v
                                                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                                                    public final Object invoke() {
                                                                                                                                        fvbVar3.invoke();
                                                                                                                                        r3s r3sVar2 = r3sVar;
                                                                                                                                        if (!((Boolean) r3sVar2.b.a.getValue()).booleanValue()) {
                                                                                                                                            ej5.c(o8i0.d(r3sVar2), null, null, new q3s(r3sVar2, null), 3);
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                };
                                                                                                                                aVar2.r(objY);
                                                                                                                            }
                                                                                                                            z3v.a(str, zBooleanValue, zBooleanValue2, (Function0) objY, exuVar2, aVar2, 0);
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
                                                                                                    ViewPager2 viewPager3 = bdVar2.J;
                                                                                                    viewPager3.setPageTransformer(new androidx.viewpager2.widget.b(viewPager3.getResources().getDisplayMetrics().widthPixels / 2));
                                                                                                    RecyclerView recyclerView2 = bdVar2.G;
                                                                                                    recyclerView2.setLayoutManager(matchEventActivity.H1());
                                                                                                    recyclerView2.setAdapter(matchEventActivity.G1());
                                                                                                    bdVar2.F.setQuickBetListener(matchEventActivity, new lxu(matchEventActivity));
                                                                                                    PlaceBetButtonLayout placeBetButtonLayout2 = bdVar2.E;
                                                                                                    placeBetButtonLayout2.setLeftBtnClick(new View.OnClickListener() { // from class: fxu
                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                        public final void onClick(View view) {
                                                                                                            aqn aqnVar;
                                                                                                            int i5 = MatchEventActivity.a0;
                                                                                                            final MatchEventActivity matchEventActivity2 = this.a;
                                                                                                            Object value = matchEventActivity2.I1().T.a.getValue();
                                                                                                            ctg.a aVar = value instanceof ctg.a ? (ctg.a) value : null;
                                                                                                            if (aVar == null || (aqnVar = aVar.c) == null) {
                                                                                                                aqnVar = aqn.a;
                                                                                                            }
                                                                                                            if (((n4p) matchEventActivity2.C1()).K == 0) {
                                                                                                                a5o.s sVar = new a5o.s(((n4p) matchEventActivity2.C1()).c());
                                                                                                                matchEventActivity2.S1("next_round");
                                                                                                                matchEventActivity2.U1(sVar);
                                                                                                                matchEventActivity2.B1();
                                                                                                                i5s.b(matchEventActivity2.getAccountHelper(), matchEventActivity2, new nxu(matchEventActivity2));
                                                                                                                return;
                                                                                                            }
                                                                                                            int iOrdinal = aqnVar.ordinal();
                                                                                                            if (iOrdinal != 0) {
                                                                                                                if (iOrdinal == 1) {
                                                                                                                    matchEventActivity2.I1().K.b();
                                                                                                                    matchEventActivity2.K1();
                                                                                                                    return;
                                                                                                                } else if (iOrdinal != 2) {
                                                                                                                    uhc.a();
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                            Object value2 = matchEventActivity2.I1().T.a.getValue();
                                                                                                            ctg.a aVar2 = value2 instanceof ctg.a ? (ctg.a) value2 : null;
                                                                                                            if (aVar2 == null) {
                                                                                                                return;
                                                                                                            }
                                                                                                            String str = aVar2.a.roundId;
                                                                                                            if (str.length() == 0) {
                                                                                                                sqo.j(matchEventActivity2, new DialogInterface.OnClickListener() { // from class: uwu
                                                                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                                                                    public final void onClick(DialogInterface dialogInterface, int i6) {
                                                                                                                        int i7 = MatchEventActivity.a0;
                                                                                                                        matchEventActivity2.finish();
                                                                                                                    }
                                                                                                                });
                                                                                                            } else {
                                                                                                                matchEventActivity2.A1().g(matchEventActivity2, new OpenBetInput(str, false, InstantWinBetSource.BETSLIP));
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    placeBetButtonLayout2.setRightBtnClick(new View.OnClickListener() { // from class: kwu
                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                        public final void onClick(View view) {
                                                                                                            int i5 = MatchEventActivity.a0;
                                                                                                            MatchEventActivity matchEventActivity2 = this.a;
                                                                                                            matchEventActivity2.S1(AnalyticsParam.AN_EVENT_PLACE_BET);
                                                                                                            if (((n4p) matchEventActivity2.C1()).s()) {
                                                                                                                matchEventActivity2.O1();
                                                                                                            } else {
                                                                                                                matchEventActivity2.B1();
                                                                                                                i5s.b(matchEventActivity2.getAccountHelper(), matchEventActivity2, new pxu(matchEventActivity2));
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    placeBetButtonLayout2.setSmallOpenBetsButtonClick(new View.OnClickListener() { // from class: lwu
                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                        public final void onClick(View view) {
                                                                                                            int i5 = MatchEventActivity.a0;
                                                                                                            final MatchEventActivity matchEventActivity2 = this.a;
                                                                                                            Object value = matchEventActivity2.I1().T.a.getValue();
                                                                                                            ctg.a aVar = value instanceof ctg.a ? (ctg.a) value : null;
                                                                                                            if (aVar == null) {
                                                                                                                return;
                                                                                                            }
                                                                                                            String str = aVar.a.roundId;
                                                                                                            if (str.length() == 0) {
                                                                                                                sqo.j(matchEventActivity2, new DialogInterface.OnClickListener() { // from class: wwu
                                                                                                                    @Override // android.content.DialogInterface.OnClickListener
                                                                                                                    public final void onClick(DialogInterface dialogInterface, int i6) {
                                                                                                                        int i7 = MatchEventActivity.a0;
                                                                                                                        matchEventActivity2.finish();
                                                                                                                    }
                                                                                                                });
                                                                                                            } else {
                                                                                                                matchEventActivity2.A1().g(matchEventActivity2, new OpenBetInput(str, false, InstantWinBetSource.BETSLIP));
                                                                                                            }
                                                                                                        }
                                                                                                    });
                                                                                                    ComposeView composeView15 = bdVar2.v;
                                                                                                    ku90 ku90Var = matchEventActivity.I1().d0;
                                                                                                    mwu mwuVar = new mwu(matchEventActivity, i);
                                                                                                    ku90Var.getClass();
                                                                                                    composeView15.setContent(new op8(1913921605, new egl(ku90Var, mwuVar), true));
                                                                                                    tfo.b(bdVar2.z, matchEventActivity.I1().a.a, new ayu(0, matchEventActivity.I1(), z5v.class, "hideMarketGuideBottomSheet", "hideMarketGuideBottomSheet()V", 0), new zxu(0, matchEventActivity.I1(), z5v.class, "hideMarketGuideBottomSheet", "hideMarketGuideBottomSheet()V", 0));
                                                                                                    ComposeView composeView16 = bdVar2.A;
                                                                                                    ihy ihyVar = matchEventActivity.W;
                                                                                                    if (ihyVar == null) {
                                                                                                        Intrinsics.n("oddsFilterManager");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    composeView16.setVisibility(ihyVar.d0() ? 0 : 8);
                                                                                                    if (composeView16.getVisibility() == 0) {
                                                                                                        String strC2 = ((n4p) matchEventActivity.C1()).c();
                                                                                                        wwd0 wwd0Var2 = matchEventActivity.I1().f0;
                                                                                                        ihy ihyVar2 = matchEventActivity.W;
                                                                                                        if (ihyVar2 == null) {
                                                                                                            Intrinsics.n("oddsFilterManager");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        ajy.b bVar = ajy.b.a;
                                                                                                        pkg pkgVar = new pkg(1, matchEventActivity, MatchEventActivity.class, "sendSportyTrackingEvent", "sendSportyTrackingEvent(Lcom/sporty/android/common_analytics/sportytracking/model/event/SportyTrackingEvent;)V", 0);
                                                                                                        matchEventActivity = matchEventActivity;
                                                                                                        p4v.a(composeView16, strC2, wwd0Var2, ihyVar2, bVar, pkgVar);
                                                                                                    }
                                                                                                    ComposeView composeView17 = bdVar2.f;
                                                                                                    final nwu nwuVar = new nwu(matchEventActivity, i);
                                                                                                    final hjg hjgVar = new hjg(matchEventActivity, i4);
                                                                                                    final bxu bxuVar = new bxu(matchEventActivity, i);
                                                                                                    final ytw<Boolean> ytwVar = matchEventActivity.J;
                                                                                                    ytwVar.getClass();
                                                                                                    composeView17.setContent(new op8(-1210701498, new Function2() { // from class: g0h
                                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                                                            a aVar = (a) obj;
                                                                                                            int iIntValue = ((Integer) obj2).intValue();
                                                                                                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                                                final ytw ytwVar2 = ytwVar;
                                                                                                                final nwu nwuVar2 = nwuVar;
                                                                                                                final hjg hjgVar2 = hjgVar;
                                                                                                                final bxu bxuVar2 = bxuVar;
                                                                                                                o0z.a(null, null, null, null, null, pp8.b(-452949707, new Function2() { // from class: i0h
                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                                                    public final Object invoke(Object obj3, Object obj4) {
                                                                                                                        a aVar2 = (a) obj3;
                                                                                                                        int iIntValue2 = ((Integer) obj4).intValue();
                                                                                                                        if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                                                            j590 j590VarG = v1w.g(true, null, aVar2, 6, 2);
                                                                                                                            Object objY = aVar2.y();
                                                                                                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                                                                                                            if (objY == c0042a) {
                                                                                                                                objY = xvf.i(e.a, aVar2);
                                                                                                                                aVar2.r(objY);
                                                                                                                            }
                                                                                                                            v5b v5bVar = (v5b) objY;
                                                                                                                            boolean zA = aVar2.A(v5bVar);
                                                                                                                            ytw ytwVar3 = ytwVar2;
                                                                                                                            boolean zM = zA | aVar2.M(ytwVar3) | aVar2.M(j590VarG);
                                                                                                                            Object objY2 = aVar2.y();
                                                                                                                            if (zM || objY2 == c0042a) {
                                                                                                                                objY2 = new j0h(v5bVar, ytwVar3, j590VarG, 0);
                                                                                                                                aVar2.r(objY2);
                                                                                                                            }
                                                                                                                            final Function0 function0 = (Function0) objY2;
                                                                                                                            if (((Boolean) ytwVar3.getValue()).booleanValue()) {
                                                                                                                                aVar2.N(962941824);
                                                                                                                                boolean zM2 = aVar2.M(function0);
                                                                                                                                final nwu nwuVar3 = nwuVar2;
                                                                                                                                boolean zM3 = zM2 | aVar2.M(nwuVar3);
                                                                                                                                Object objY3 = aVar2.y();
                                                                                                                                if (zM3 || objY3 == c0042a) {
                                                                                                                                    objY3 = new Function0() { // from class: k0h
                                                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                                                        public final Object invoke() {
                                                                                                                                            function0.invoke();
                                                                                                                                            nwuVar3.invoke();
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                    aVar2.r(objY3);
                                                                                                                                }
                                                                                                                                Function0 function1 = (Function0) objY3;
                                                                                                                                boolean zM4 = aVar2.M(function0);
                                                                                                                                final hjg hjgVar3 = hjgVar2;
                                                                                                                                boolean zM5 = zM4 | aVar2.M(hjgVar3);
                                                                                                                                Object objY4 = aVar2.y();
                                                                                                                                if (zM5 || objY4 == c0042a) {
                                                                                                                                    objY4 = new Function0() { // from class: l0h
                                                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                                                        public final Object invoke() {
                                                                                                                                            function0.invoke();
                                                                                                                                            hjgVar3.invoke();
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                    aVar2.r(objY4);
                                                                                                                                }
                                                                                                                                Function0 function2 = (Function0) objY4;
                                                                                                                                boolean zM6 = aVar2.M(function0);
                                                                                                                                final bxu bxuVar3 = bxuVar2;
                                                                                                                                boolean zM7 = zM6 | aVar2.M(bxuVar3);
                                                                                                                                Object objY5 = aVar2.y();
                                                                                                                                if (zM7 || objY5 == c0042a) {
                                                                                                                                    objY5 = new Function0() { // from class: m0h
                                                                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                                                                        public final Object invoke() {
                                                                                                                                            function0.invoke();
                                                                                                                                            bxuVar3.invoke();
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                    };
                                                                                                                                    aVar2.r(objY5);
                                                                                                                                }
                                                                                                                                s0h.a(j590VarG, function1, function2, (Function0) objY5, aVar2, 0);
                                                                                                                                aVar2.H();
                                                                                                                            } else {
                                                                                                                                aVar2.N(963477101);
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
                                                                                                    ComposeView composeView18 = bdVar2.e;
                                                                                                    uwd0<ei2> uwd0VarF1 = matchEventActivity.I1().c.f1();
                                                                                                    cxu cxuVar = new cxu(matchEventActivity, i);
                                                                                                    uwd0VarF1.getClass();
                                                                                                    composeView18.setContent(new op8(-1815462754, new yf2(i, uwd0VarF1, cxuVar), true));
                                                                                                    ComposeView composeView19 = bdVar2.d;
                                                                                                    evb evbVar = new evb(matchEventActivity, i4);
                                                                                                    ytw<Boolean> ytwVar2 = matchEventActivity.K;
                                                                                                    ytwVar2.getClass();
                                                                                                    composeView19.setContent(new op8(140914595, new cyh(ytwVar2, evbVar), true));
                                                                                                }
                                                                                                matchEventActivity.I1().d.a();
                                                                                                ku90<i5v> ku90Var2 = matchEventActivity.I1().g0;
                                                                                                s9s.b bVar2 = s9s.b.a;
                                                                                                ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new sxu(matchEventActivity, ku90Var2, null, matchEventActivity), 3);
                                                                                                ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new txu(matchEventActivity, matchEventActivity.I1().d.f, null, matchEventActivity), 3);
                                                                                                ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new uxu(matchEventActivity, matchEventActivity.I1().T, null, matchEventActivity), 3);
                                                                                                ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new vxu(matchEventActivity, matchEventActivity.I1().E.p1(), null, matchEventActivity), 3);
                                                                                                z5v z5vVarI1 = matchEventActivity.I1();
                                                                                                bz3 bz3Var = bz3.SINGLE;
                                                                                                ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new wxu(matchEventActivity, z5vVarI1.E.G0(SimulateBetConsts.BetslipType.SINGLE), null, matchEventActivity), 3);
                                                                                                if (matchEventActivity.I1().N.V()) {
                                                                                                    ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new xxu(matchEventActivity, matchEventActivity.I1().N.s0(), null, matchEventActivity), 3);
                                                                                                }
                                                                                                matchEventActivity.I1().E.T0(((n4p) matchEventActivity.C1()).c());
                                                                                                ej5.c(ebs.a(matchEventActivity.getLifecycle()), null, null, new yxu(matchEventActivity, matchEventActivity.I1().U, null, matchEventActivity), 3);
                                                                                                if (((n4p) matchEventActivity.C1()).F()) {
                                                                                                    Iterator it = kotlin.collections.b.k("https://s.sporty.net/cms/green_attack_2pts_1_fc8a3ebaae.json", "https://s.sporty.net/cms/green_attack_2pts_1_contrast_d5e33179f0.json", "https://s.sporty.net/cms/green_attack_2pts_2_9a180f6c51.json", "https://s.sporty.net/cms/green_attack_2pts_2_contrast_46696f3374.json", "https://s.sporty.net/cms/green_attack_3pts_1_5af109efb9.json", "https://s.sporty.net/cms/green_attack_3pts_1_contrast_45db3a04ef.json", "https://s.sporty.net/cms/green_attack_3pts_2_df5b960ed8.json", "https://s.sporty.net/cms/green_attack_3pts_2_contrast_c6597fe9d0.json", "https://s.sporty.net/cms/ib_openning_3f52f30afe.json", CaBJCMnsV.YxnxVxcmU, "https://s.sporty.net/cms/red_attack_2pts_1_contrast_70505cfb89.json", "https://s.sporty.net/cms/red_attack_2pts_2_dfdf14f302.json", "https://s.sporty.net/cms/red_attack_2pts_2_contrast_f78c784392.json", "https://s.sporty.net/cms/red_attack_3pts_1_81eddea6f0.json", "https://s.sporty.net/cms/red_attack_3pts_1_contrast_5b510a30c8.json", "https://s.sporty.net/cms/red_attack_3pts_2_e435ad939f.json", "https://s.sporty.net/cms/red_attack_3pts_2_contrast_9df6ec9c91.json").iterator();
                                                                                                    while (it.hasNext()) {
                                                                                                        lnt.i(matchEventActivity, (String) it.next());
                                                                                                    }
                                                                                                }
                                                                                                if (!((n4p) matchEventActivity.C1()).H && !((n4p) matchEventActivity.C1()).J) {
                                                                                                    ((n4p) matchEventActivity.C1()).d();
                                                                                                    u0v u0vVar = matchEventActivity.Z;
                                                                                                    if (u0vVar == null) {
                                                                                                        Intrinsics.n("matchEventDetailDataSource");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    u0vVar.a();
                                                                                                }
                                                                                                matchEventActivity.I1().x1(((n4p) matchEventActivity.C1()).h);
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
