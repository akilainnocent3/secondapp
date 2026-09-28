package com.sportybet.plugin.realsports.live.livepage;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.cruxlab.sectionedrecyclerview.lib.SectionHeaderLayout;
import com.cruxlab.sectionedrecyclerview.lib.d.C0186d;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.Reader;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import defpackage.a8z;
import defpackage.a9l;
import defpackage.aqs;
import defpackage.auy;
import defpackage.avy;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.bqs;
import defpackage.bsy;
import defpackage.buy;
import defpackage.c0d;
import defpackage.ce;
import defpackage.cqs;
import defpackage.cyb;
import defpackage.djh0;
import defpackage.dty;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.eqs;
import defpackage.fps;
import defpackage.g1i;
import defpackage.gqs;
import defpackage.gty;
import defpackage.h1e;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hkf;
import defpackage.hwr;
import defpackage.hzh;
import defpackage.ijf;
import defpackage.iqs;
import defpackage.itf0;
import defpackage.ity;
import defpackage.iu2;
import defpackage.iym;
import defpackage.j1e;
import defpackage.joi;
import defpackage.jps;
import defpackage.jq40;
import defpackage.jqs;
import defpackage.jqu;
import defpackage.jty;
import defpackage.jvd0;
import defpackage.k650;
import defpackage.k9j;
import defpackage.kqs;
import defpackage.kzh;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.lkf;
import defpackage.lq1;
import defpackage.lqs;
import defpackage.me1;
import defpackage.mfb0;
import defpackage.mjf;
import defpackage.mpe0;
import defpackage.mqs;
import defpackage.muh;
import defpackage.njs;
import defpackage.nps;
import defpackage.nqs;
import defpackage.nty;
import defpackage.o0b;
import defpackage.o8i0;
import defpackage.of20;
import defpackage.ops;
import defpackage.paj;
import defpackage.pkf;
import defpackage.pps;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qps;
import defpackage.r0j;
import defpackage.r8i0;
import defpackage.ruy;
import defpackage.s1p;
import defpackage.sih0;
import defpackage.sn20;
import defpackage.sty;
import defpackage.szh;
import defpackage.ta0;
import defpackage.tje0;
import defpackage.u22;
import defpackage.ud;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.uqs;
import defpackage.uuy;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vqs;
import defpackage.vuy;
import defpackage.whh0;
import defpackage.wlc;
import defpackage.wqs;
import defpackage.wul;
import defpackage.wuy;
import defpackage.x0j;
import defpackage.x2e;
import defpackage.x7l;
import defpackage.xhh0;
import defpackage.xlc;
import defpackage.xps;
import defpackage.xqs;
import defpackage.xss;
import defpackage.xyd0;
import defpackage.xzh;
import defpackage.y5b;
import defpackage.yec;
import defpackage.ypi;
import defpackage.yqs;
import defpackage.yty;
import defpackage.yzh;
import defpackage.zhh0;
import defpackage.zi50;
import defpackage.zjf;
import defpackage.zps;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/live/livepage/LivePageActivity;", "Ll22;", "Lk9j;", "Liu2$b;", "", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LivePageActivity extends wul implements k9j, iu2.b, bb40 {
    public static final /* synthetic */ int b0 = 0;
    public zhh0 A;
    public sty B;
    public jty C;
    public a8z D;
    public muh E;
    public s1p F;
    public final mpe0 I;
    public com.cruxlab.sectionedrecyclerview.lib.d P;
    public xss Q;
    public djh0 R;
    public jvd0 T;
    public final mpe0 V;
    public yec W;
    public OddsFilterSettingView X;
    public xyd0 Y;
    public Event Z;
    public lq1 f;
    public k650 i;
    public iym v;
    public mjf w;
    public hkf y;
    public xhh0 z;
    public final q8i0 G = new q8i0(jq40.a(uqs.class), new p(), new m(), new q());
    public final q8i0 H = new q8i0(jq40.a(of20.class), new s(), new r(), new t());
    public final q8i0 J = new q8i0(jq40.a(sn20.class), new v(), new u(), new w());
    public final q8i0 K = new q8i0(jq40.a(ruy.class), new d(), new c(), new e());
    public final q8i0 L = new q8i0(jq40.a(bsy.class), new g(), new f(), new h());
    public final q8i0 M = new q8i0(jq40.a(ijf.class), new j(), new i(), new k());
    public final q8i0 N = new q8i0(jq40.a(xlc.class), new n(), new l(), new o());
    public final ArrayList O = new ArrayList();
    public final x7l<a9l> S = new x7l<>();
    public boolean U = true;
    public final ee<Intent> a0 = registerForActivityResult(new ce(), new ud() { // from class: yps
        @Override // defpackage.ud
        public final void a(Object obj) {
            String id;
            ActivityResult activityResult = (ActivityResult) obj;
            int i2 = LivePageActivity.b0;
            activityResult.getClass();
            if (activityResult.a == -1) {
                LivePageActivity livePageActivity = this.a;
                String strA1 = livePageActivity.A1();
                lq1 lq1Var = livePageActivity.f;
                if (lq1Var == null) {
                    Intrinsics.n("boConfigSource");
                    throw null;
                }
                if (QuickMarketHelper.supportMarketMenu(strA1, Float.valueOf(qq1.d(lq1Var, BOConfigParam.QuickMarketMenuToggle)))) {
                    Intent intent = activityResult.b;
                    RegularMarketRule regularMarketRule = intent != null ? (RegularMarketRule) intent.getParcelableExtra("SELECT_MARKET_DATA") : null;
                    if (regularMarketRule != null) {
                        uqs uqsVarG1 = livePageActivity.G1();
                        String strA2 = livePageActivity.A1();
                        String str = regularMarketRule.a;
                        str.getClass();
                        ui30 ui30Var = uqsVarG1.H;
                        et7 et7VarD = o8i0.d(uqsVarG1);
                        h1j h1jVar = new h1j(uqsVarG1, 1);
                        ui30Var.getClass();
                        jvd0 jvd0Var = ui30Var.b;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                        ui30Var.b = kzh.d(new g1i(new si30(ui30Var.a.s(strA2, str)), new ti30(h1jVar, null)), et7VarD);
                        uqs uqsVarG2 = livePageActivity.G1();
                        mfb0 mfb0Var = uqsVarG2.B;
                        if (mfb0Var != null && (id = mfb0Var.getId()) != null) {
                            uqsVarG2.f0 = regularMarketRule;
                            uqsVarG2.j0.put(id, regularMarketRule);
                        }
                    }
                    mfb0 mfb0Var2 = livePageActivity.G1().B;
                    if (mfb0Var2 != null) {
                        livePageActivity.M1(mfb0Var2, true);
                    }
                    if (livePageActivity.Q != null) {
                        xss.n();
                    }
                }
            }
        }
    });

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b extends RecyclerView.s {
        public final int[] a = new int[2];
        public final int[] b = new int[2];
        public int c;
        public Integer d;
        public boolean e;
        public final /* synthetic */ nqs f;
        public final /* synthetic */ LivePageActivity g;

        public b(nqs nqsVar, LivePageActivity livePageActivity) {
            this.f = nqsVar;
            this.g = livePageActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
            Integer numValueOf;
            TabLayout tabLayout = this.f.i;
            int[] iArr = this.b;
            tabLayout.getLocationOnScreen(iArr);
            int i3 = iArr[1];
            int i4 = LivePageActivity.b0;
            LivePageActivity livePageActivity = this.g;
            this.c = ((Number) livePageActivity.I.getValue()).intValue() + i3;
            djh0 djh0Var = livePageActivity.R;
            if (djh0Var != null) {
                int[] iArr2 = this.a;
                iArr2.getClass();
                sih0 sih0Var = djh0Var.u;
                if (sih0Var != null) {
                    sih0Var.A.getLocationOnScreen(iArr2);
                }
                numValueOf = Integer.valueOf(iArr2[1]);
            } else {
                numValueOf = null;
            }
            this.d = numValueOf;
            int i5 = this.c;
            if (numValueOf != null && numValueOf.intValue() == i5) {
                this.e = true;
            }
            Integer num = this.d;
            int i6 = this.c;
            if ((num == null || num.intValue() != i6) && this.e) {
                this.e = false;
                djh0 djh0Var2 = livePageActivity.R;
                if (djh0Var2 != null) {
                    djh0Var2.h();
                }
            }
            livePageActivity.L1(false);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l extends qlr implements Function0<r8i0.c> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m extends qlr implements Function0<r8i0.c> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n extends qlr implements Function0<v8i0> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o extends qlr implements Function0<cyb> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p extends qlr implements Function0<v8i0> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q extends qlr implements Function0<cyb> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r extends qlr implements Function0<r8i0.c> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s extends qlr implements Function0<v8i0> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t extends qlr implements Function0<cyb> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u extends qlr implements Function0<r8i0.c> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LivePageActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v extends qlr implements Function0<v8i0> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LivePageActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w extends qlr implements Function0<cyb> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LivePageActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$updateLiveSubscribers$1", f = "LivePageActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public x(v1b<? super x> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LivePageActivity.this.new x(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            int i = LivePageActivity.b0;
            LivePageActivity.this.G1().C1();
            return Unit.a;
        }
    }

    public LivePageActivity() {
        int i2 = 1;
        this.I = hwr.b(new ta0(this, i2));
        this.V = hwr.b(new x0j(this, i2));
    }

    @Override // defpackage.l22
    public final String A1() {
        mfb0 mfb0Var = G1().B;
        String id = mfb0Var != null ? mfb0Var.getId() : null;
        return id == null ? "" : id;
    }

    @Override // iu2.a
    public final void C() {
        Iterator it = xss.M.iterator();
        while (it.hasNext()) {
            ((OutcomeButton) it.next()).d();
        }
        djh0 djh0Var = this.R;
        if (djh0Var != null) {
            djh0Var.c();
        }
    }

    @Override // defpackage.l22
    public final void C1() {
        uqs uqsVarG1 = G1();
        uqsVarG1.K1();
        uqsVarG1.G1();
    }

    public final void D1(jqu jquVar) {
        String str;
        sn20 sn20Var = (sn20) this.J.getValue();
        int iOrdinal = jquVar.ordinal();
        if (iOrdinal == 0) {
            str = "market_early_goals_switch_hint_displayed";
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            str = "dc_one_up_switch_hint_displayed";
        }
        sn20Var.a.b(str);
    }

    public final void E1(Selection selection, boolean z, auy auyVar, boolean z2) {
        gty gtyVarA = buy.a(auyVar);
        sty styVar = this.B;
        if (styVar == null) {
            Intrinsics.n("oneUpSelectionAttributionDispatcher");
            throw null;
        }
        ity ityVar = (ity) this.V.getValue();
        Event event = selection.a;
        RegularMarketRule regularMarketRule = G1().i0;
        ityVar.getClass();
        nty ntyVarA = ityVar.b.a(gtyVarA, event, regularMarketRule);
        ntyVarA.getClass();
        styVar.b(new sty.b.C1102b(new yty(selection, z, gtyVarA, z2, ntyVarA, styVar.c.b()), true));
    }

    public final hkf F1() {
        hkf hkfVar = this.y;
        if (hkfVar != null) {
            return hkfVar;
        }
        Intrinsics.n("earlyPayoutMarketResolver");
        throw null;
    }

    public final uqs G1() {
        return (uqs) this.G.getValue();
    }

    public final xhh0 H1() {
        xhh0 xhh0Var = this.z;
        if (xhh0Var != null) {
            return xhh0Var;
        }
        Intrinsics.n("upMarketTabUseCase");
        throw null;
    }

    public final boolean I1() {
        xhh0 xhh0VarH1 = H1();
        mfb0 mfb0Var = G1().B;
        whh0 whh0VarC = xhh0VarH1.c(G1().i0, mfb0Var != null ? mfb0Var.getId() : null, false);
        if (this.A != null) {
            return zhh0.a(whh0VarC).b == avy.a;
        }
        Intrinsics.n("upPageToggleStateUseCase");
        throw null;
    }

    public final void J1() {
        mfb0 mfb0Var = G1().B;
        if (mfb0Var == null) {
            uqs uqsVarG1 = G1();
            uqsVarG1.K1();
            uqsVarG1.G1();
            return;
        }
        if (this.Q != null) {
            xss.n();
        }
        if (!z1().w.c) {
            M1(mfb0Var, false);
            final uqs uqsVarG2 = G1();
            final ops opsVar = new ops(this);
            QuickMarketSpotEnum quickMarketSpotEnum = QuickMarketSpotEnum.LIVE_PAGE_UPCOMING_EVENTS;
            mfb0 mfb0Var2 = uqsVarG2.B;
            QuickMarketHelper.fetch(quickMarketSpotEnum, mfb0Var2 != null ? mfb0Var2.getId() : null, new QuickMarketHelper.FetchCallback() { // from class: qqs
                @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                public final void onResult(List list) {
                    String str;
                    uqs uqsVar = uqsVarG2;
                    RegularMarketRule regularMarketRule = uqsVar.i0;
                    Object obj = null;
                    if (regularMarketRule != null) {
                        uqsVar.L.getClass();
                        str = hkf.d(regularMarketRule).a;
                    } else {
                        str = null;
                    }
                    list.getClass();
                    for (Object obj2 : list) {
                        if (Intrinsics.g(((RegularMarketRule) obj2).a, str)) {
                            obj = obj2;
                            break;
                        }
                    }
                    RegularMarketRule regularMarketRule2 = (RegularMarketRule) obj;
                    if (regularMarketRule2 == null) {
                        regularMarketRule2 = (RegularMarketRule) CollectionsKt.firstOrNull(list);
                    }
                    uqsVar.i0 = regularMarketRule2;
                    opsVar.invoke(list);
                }
            });
        }
        uqs uqsVarG3 = G1();
        String id = mfb0Var.getId();
        id.getClass();
        u22.z1(uqsVarG3, id);
        uqs uqsVarG4 = G1();
        String id2 = mfb0Var.getId();
        id2.getClass();
        jvd0 jvd0Var = uqsVarG4.h0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        uqsVarG4.h0 = kzh.d(new yzh(new g1i(new xzh(new vqs(uqsVarG4.G.i(id2), uqsVarG4), new wqs(uqsVarG4, null)), new xqs(uqsVarG4, null)), new yqs(uqsVarG4, null)), o8i0.d(uqsVarG4));
    }

    public final void K1() {
        mfb0 mfb0Var;
        TabLayout tabLayout = z1().i;
        tabLayout.setVisibility(!G1().e0.isEmpty() ? 0 : 8);
        if (G1().e0.isEmpty() || (mfb0Var = G1().B) == null) {
            return;
        }
        ArrayList arrayList = this.O;
        arrayList.clear();
        tabLayout.n();
        ArrayList arrayList2 = G1().e0;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            mfb0 mfb0VarE = lfb0.d().e(((OrderedSportItem) obj).id);
            if (mfb0VarE != null) {
                final TabLayout.g gVarL = tabLayout.l();
                gVarL.a = mfb0VarE;
                Drawable drawable = null;
                View viewInflate = LayoutInflater.from(this).inflate(R.layout.spr_live_tab_view, (ViewGroup) null, false);
                int i3 = R.id.tab_event_size;
                TextView textView = (TextView) h5e.a(R.id.tab_event_size, viewInflate);
                if (textView != null) {
                    i3 = R.id.tab_icon;
                    ImageView imageView = (ImageView) h5e.a(R.id.tab_icon, viewInflate);
                    if (imageView != null) {
                        i3 = R.id.tab_name;
                        TextView textView2 = (TextView) h5e.a(R.id.tab_name, viewInflate);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            UiText uiTextC = mfb0VarE.c();
                            uiTextC.getClass();
                            textView2.setText(uiTextC.e(this).toString());
                            arrayList.add(textView);
                            imageView.getContext();
                            Drawable drawableD = mfb0VarE.d();
                            ColorStateList colorStateListB = o0b.b(imageView.getContext(), R.color.spr_live_tab_selector);
                            if (drawableD != null) {
                                try {
                                    drawableD.mutate();
                                    drawableD.setTintList(colorStateListB);
                                    drawable = drawableD;
                                } catch (Exception unused) {
                                }
                            }
                            imageView.setImageDrawable(drawable);
                            constraintLayout.getClass();
                            gVarL.f = constraintLayout;
                            gVarL.f();
                            tabLayout.b(gVarL);
                            if (Intrinsics.g(mfb0Var.getId(), mfb0VarE.getId())) {
                                tabLayout.post(new Runnable() { // from class: mps
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i4 = LivePageActivity.b0;
                                        TabLayout.g gVar = gVarL;
                                        if (gVar.g != null) {
                                            gVar.b();
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                return;
            }
        }
        O1();
    }

    public final void L1(boolean z) {
        int iB;
        djh0 djh0Var;
        nqs nqsVarZ1 = z1();
        if (z && (djh0Var = this.R) != null) {
            djh0Var.t = -1;
            djh0Var.h();
        }
        RecyclerView.o layoutManager = nqsVarZ1.e.getLayoutManager();
        layoutManager.getClass();
        int iF1 = ((LinearLayoutManager) layoutManager).f1();
        com.cruxlab.sectionedrecyclerview.lib.d dVar = this.P;
        if (dVar == null) {
            Intrinsics.n("sectionDataManager");
            throw null;
        }
        if (dVar.c(iF1) < 1) {
            iB = 0;
        } else {
            com.cruxlab.sectionedrecyclerview.lib.d dVar2 = this.P;
            if (dVar2 == null) {
                Intrinsics.n("sectionDataManager");
                throw null;
            }
            iB = dVar2.b(iF1) + 1;
        }
        while (iB >= 0) {
            djh0 djh0Var2 = this.R;
            if (djh0Var2 != null && djh0Var2.b(iB) == 8) {
                djh0 djh0Var3 = this.R;
                if (djh0Var3 == null || iB == djh0Var3.t) {
                    return;
                }
                djh0Var3.t = iB;
                djh0Var3.h();
                return;
            }
            iB--;
        }
    }

    public final void M1(mfb0 mfb0Var, boolean z) {
        final uqs uqsVarG1 = G1();
        final fps fpsVar = new fps(z, this, mfb0Var);
        QuickMarketSpotEnum quickMarketSpotEnum = QuickMarketSpotEnum.LIVE_PAGE_LIVE_EVENTS;
        mfb0 mfb0Var2 = uqsVarG1.B;
        QuickMarketHelper.fetch(quickMarketSpotEnum, mfb0Var2 != null ? mfb0Var2.getId() : null, new QuickMarketHelper.FetchCallback() { // from class: pqs
            /* JADX WARN: Code duplicated, block: B:37:0x008b  */
            /* JADX WARN: Code duplicated, block: B:38:0x0090  */
            /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
            @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
            public final void onResult(List list) {
                String str;
                Object next;
                mfb0 mfb0Var3;
                String id;
                uqs uqsVar = uqsVarG1;
                RegularMarketRule regularMarketRule = uqsVar.C;
                uqm uqmVar = uqsVar.I;
                lq1 lq1Var = uqsVar.J;
                if (regularMarketRule != null) {
                    uqsVar.L.getClass();
                    str = hkf.d(regularMarketRule).a;
                } else {
                    str = null;
                }
                list.getClass();
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((RegularMarketRule) next).a, str));
                RegularMarketRule regularMarketRule2 = (RegularMarketRule) next;
                if (regularMarketRule2 == null) {
                    regularMarketRule2 = (RegularMarketRule) CollectionsKt.firstOrNull(list);
                }
                uqsVar.C = regularMarketRule2;
                boolean zIsEmpty = list.isEmpty();
                fps fpsVar2 = fpsVar;
                if (zIsEmpty) {
                    fpsVar2.invoke(m2g.a);
                    return;
                }
                LinkedHashMap linkedHashMap = uqsVar.j0;
                mfb0 mfb0Var4 = uqsVar.B;
                RegularMarketRule regularMarketRule3 = (RegularMarketRule) linkedHashMap.get(mfb0Var4 != null ? mfb0Var4.getId() : null);
                if (regularMarketRule3 != null) {
                    if (list.isEmpty()) {
                        mfb0Var3 = uqsVar.B;
                        if (mfb0Var3 != null) {
                            id = mfb0Var3.getId();
                        } else {
                            id = null;
                        }
                        if (QuickMarketHelper.supportMarketMenu(id, Float.valueOf(qq1.d(lq1Var, BOConfigParam.QuickMarketMenuToggle)))) {
                            list.add(list.size(), regularMarketRule3);
                        }
                    } else {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.g(regularMarketRule3.a, ((RegularMarketRule) it2.next()).a)) {
                                }
                            } else {
                                mfb0Var3 = uqsVar.B;
                                if (mfb0Var3 != null) {
                                    id = mfb0Var3.getId();
                                } else {
                                    id = null;
                                }
                                if (QuickMarketHelper.supportMarketMenu(id, Float.valueOf(qq1.d(lq1Var, BOConfigParam.QuickMarketMenuToggle)))) {
                                    list.add(list.size(), regularMarketRule3);
                                }
                            }
                        }
                    }
                }
                if (uqmVar.isLogin()) {
                    mfb0 mfb0Var5 = uqsVar.B;
                    if (QuickMarketHelper.supportMarketMenu(mfb0Var5 != null ? mfb0Var5.getId() : null, Float.valueOf(qq1.d(lq1Var, BOConfigParam.QuickMarketMenuToggle)))) {
                        QuickMarketSpotEnum quickMarketSpotEnum2 = QuickMarketSpotEnum.LIVE_PAGE_LIVE_EVENTS;
                        mfb0 mfb0Var6 = uqsVar.B;
                        RegularMarketRule quickMarketFromStorage = QuickMarketHelper.getQuickMarketFromStorage(quickMarketSpotEnum2, mfb0Var6 != null ? mfb0Var6.getId() : null, uqmVar.getUserId());
                        if (quickMarketFromStorage != null) {
                            if (list.isEmpty()) {
                                list.add(list.size(), quickMarketFromStorage);
                            } else {
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (Intrinsics.g(quickMarketFromStorage.a, ((RegularMarketRule) it3.next()).a)) {
                                    }
                                }
                                list.add(list.size(), quickMarketFromStorage);
                            }
                        }
                    }
                }
                fpsVar2.invoke(list);
            }
        });
    }

    public final void N1(avy avyVar, RegularMarketRule regularMarketRule, String str, boolean z) {
        if (!wlc.a(H1().c(regularMarketRule, str, z))) {
            ((bsy) this.L.getValue()).C1(wuy.b, z ? uuy.a : uuy.b, vuy.b(avyVar));
            return;
        }
        xlc xlcVar = (xlc) this.N.getValue();
        lkf lkfVar = lkf.b;
        zjf zjfVar = zjf.a;
        xlcVar.x1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
    }

    public final void O1() {
        TabLayout tabLayout = z1().i;
        int tabCount = tabLayout.getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            TabLayout.g gVarK = tabLayout.k(i2);
            Object obj = gVarK != null ? gVarK.a : null;
            mfb0 mfb0Var = (mfb0) (obj instanceof mfb0 ? obj : null);
            if (mfb0Var != null) {
                Integer num = (Integer) G1().b0.get(mfb0Var.getId());
                ((TextView) this.O.get(i2)).setText(String.valueOf(num != null ? num.intValue() : 0));
            }
        }
    }

    public final void P1() {
        jvd0 jvd0Var = this.T;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.T = ebs.a(getLifecycle()).b(new x(null));
    }

    public final void Q1(int i2) {
        String id;
        mfb0 mfb0Var = G1().B;
        if (mfb0Var == null || (id = mfb0Var.getId()) == null) {
            return;
        }
        G1().b0.put(id, Integer.valueOf(i2));
        int selectedTabPosition = z1().i.getSelectedTabPosition();
        if (selectedTabPosition >= 0) {
            ArrayList arrayList = this.O;
            if (selectedTabPosition <= kotlin.collections.b.j(arrayList)) {
                ((TextView) arrayList.get(selectedTabPosition)).setText(String.valueOf(i2));
            }
        }
    }

    @Override // defpackage.l22, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iu2.a(this);
        final OddsFilterSettingView oddsFilterSettingView = new OddsFilterSettingView(this);
        oddsFilterSettingView.setOnApplyClickListener(new OddsFilterSettingView.a() { // from class: gps
            @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.a
            public final void a(String str, String str2) {
                LivePageActivity livePageActivity = this.a;
                yec yecVar = livePageActivity.W;
                if (yecVar != null) {
                    yecVar.dismiss();
                }
                uqs uqsVarG1 = livePageActivity.G1();
                BigDecimal bigDecimal = new BigDecimal(str);
                BigDecimal bigDecimal2 = Intrinsics.g(str2, sn5.c(oddsFilterSettingView, R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(str2);
                wwd0 wwd0Var = uqsVarG1.O;
                wwd0Var.getClass();
                wwd0Var.k(null, bigDecimal);
                wwd0 wwd0Var2 = uqsVarG1.Q;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bigDecimal2);
                djh0 djh0Var = livePageActivity.R;
                if (djh0Var != null) {
                    djh0Var.l(livePageActivity.G1().E1());
                }
                livePageActivity.L1(true);
            }
        });
        oddsFilterSettingView.setOnClearClickListener(new OddsFilterSettingView.b() { // from class: hps
            @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.b
            public final void a() {
                LivePageActivity livePageActivity = this.a;
                yec yecVar = livePageActivity.W;
                if (yecVar != null) {
                    yecVar.dismiss();
                }
                uqs uqsVarG1 = livePageActivity.G1();
                BigDecimal bigDecimal = BigDecimal.ZERO;
                bigDecimal.getClass();
                wwd0 wwd0Var = uqsVarG1.O;
                wwd0Var.getClass();
                wwd0Var.k(null, bigDecimal);
                wwd0 wwd0Var2 = uqsVarG1.Q;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bigDecimal);
                djh0 djh0Var = livePageActivity.R;
                if (djh0Var != null) {
                    djh0Var.l(livePageActivity.G1().E1());
                }
                livePageActivity.L1(true);
            }
        });
        oddsFilterSettingView.setOnCloseFilterListener(new OddsFilterSettingView.c() { // from class: ips
            @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.c
            public final void a() {
                yec yecVar = this.a.W;
                if (yecVar != null) {
                    yecVar.dismiss();
                }
            }
        });
        int i2 = 1;
        oddsFilterSettingView.setDismissListener(new h1e(this, i2));
        this.X = oddsFilterSettingView;
        uqs uqsVarG1 = G1();
        int i3 = 0;
        List<OrderedSportItem> fromStorage = OrderedSportItemHelper.getFromStorage(1);
        fromStorage.getClass();
        Iterator<T> it = fromStorage.iterator();
        while (it.hasNext()) {
            mfb0 mfb0VarE = lfb0.d().e(((OrderedSportItem) it.next()).id);
            if (mfb0VarE != null) {
                uqsVarG1.d0.add(mfb0VarE);
                uqsVarG1.b0.put(mfb0VarE.getId(), 0);
                uqsVarG1.c0.put(mfb0VarE.getId(), 0);
            }
        }
        q8i0 q8i0Var = this.K;
        ruy.x1((ruy) q8i0Var.getValue());
        kzh.d(new g1i(szh.a(hzh.a(new lqs(z1().i, this, null)), 250L), new mqs(this, null)), ebs.a(getLifecycle()));
        ((ity) this.V.getValue()).c(this);
        ej5.c(ebs.a(getLifecycle()), null, null, new kqs(this, null), 3);
        G1().X.f(this, new a(new r0j(this, i2)));
        G1().A.f(this, new a(new Function1() { // from class: vps
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                xss xssVar;
                xss xssVar2;
                lk50 lk50Var = (lk50) obj;
                int i4 = LivePageActivity.b0;
                lk50Var.getClass();
                boolean z = lk50Var instanceof lk50.c;
                LivePageActivity livePageActivity = this.a;
                if (z) {
                    bxg0 bxg0Var = (bxg0) ((lk50.c) lk50Var).a;
                    nqs nqsVarZ1 = livePageActivity.z1();
                    SwipeRefreshLayout swipeRefreshLayout = nqsVarZ1.w;
                    mfb0 mfb0Var = livePageActivity.G1().B;
                    if (mfb0Var == null) {
                        return Unit.a;
                    }
                    RegularMarketRule regularMarketRule = livePageActivity.G1().C;
                    if (regularMarketRule == null) {
                        return Unit.a;
                    }
                    List<? extends Tournament> list = (List) bxg0Var.a;
                    List<LiveBoostMatchItem> list2 = (List) bxg0Var.b;
                    boolean zBooleanValue = ((Boolean) bxg0Var.c).booleanValue();
                    livePageActivity.G1().J1();
                    livePageActivity.P1();
                    if (list.isEmpty()) {
                        livePageActivity.Q1(0);
                        xss xssVar3 = livePageActivity.Q;
                        if (xssVar3 != null) {
                            xssVar3.E = mfb0Var;
                            xssVar3.F = regularMarketRule;
                            xssVar3.y();
                        }
                        swipeRefreshLayout.setRefreshing(false);
                        return Unit.a;
                    }
                    if (swipeRefreshLayout.c && (xssVar2 = livePageActivity.Q) != null) {
                        xssVar2.k(true);
                    }
                    xss xssVar4 = livePageActivity.Q;
                    if (xssVar4 != null) {
                        xssVar4.E = mfb0Var;
                        xssVar4.E(regularMarketRule, list, list2, zBooleanValue);
                    }
                    swipeRefreshLayout.setRefreshing(false);
                    if (livePageActivity.U) {
                        nqsVarZ1.e.o0(0);
                        livePageActivity.U = false;
                    }
                } else if (lk50Var instanceof lk50.a) {
                    livePageActivity.z1().w.setRefreshing(false);
                    xss xssVar5 = livePageActivity.Q;
                    if (xssVar5 != null) {
                        xssVar5.z();
                    }
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_LIVE_PAGE);
                    aVar.b(((lk50.a) lk50Var).a);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    if (!livePageActivity.z1().w.c && (xssVar = livePageActivity.Q) != null) {
                        xssVar.A();
                    }
                }
                return Unit.a;
            }
        }));
        G1().Z.f(this, new a(new x2e(this, 2)));
        G1().a0.f(this, new a(new Function1() { // from class: wps
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    LivePageActivity livePageActivity = this.a;
                    djh0 djh0Var = livePageActivity.R;
                    x7l<a9l> x7lVar = livePageActivity.S;
                    if (djh0Var != null) {
                        djh0Var.k(false);
                        djh0Var.m.clear();
                        djh0Var.c();
                    }
                    x7lVar.k();
                    x7lVar.j((Collection) ((lk50.c) lk50Var).a);
                } else {
                    int i4 = LivePageActivity.b0;
                }
                return Unit.a;
            }
        }));
        ((njs) ((ruy) q8i0Var.getValue()).d.getValue()).f(this, new a(new xps(this, i3)));
        ebs.a(getLifecycle()).b(new zps(this, null));
        ebs.a(getLifecycle()).b(new aqs(this, null));
        ebs.a(getLifecycle()).b(new bqs(this, null));
        ((of20) this.H.getValue()).D.f(this, new a(new jps(this, i3)));
        uqs uqsVarG2 = G1();
        uqsVarG2.K1();
        uqsVarG2.G1();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.O.clear();
        if (this.Q != null) {
            xss.n();
        }
        this.Q = null;
        this.R = null;
        try {
            zi50.a aVar = zi50.b;
            z1().f.a();
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        iu2.q(this);
        super.onDestroy();
    }

    @Override // defpackage.l22, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        uqs uqsVarG1 = G1();
        uqsVarG1.k0 = Long.valueOf(System.currentTimeMillis());
        uqsVarG1.K1();
        uqsVarG1.B1(false);
    }

    @Override // defpackage.l22, defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        uqs uqsVarG1 = G1();
        uqsVarG1.J1();
        Long l2 = uqsVarG1.k0;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            boolean zA = uqsVarG1.K.a(me1.a);
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            if (!zA || jCurrentTimeMillis < uqsVarG1.l0) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_LIVE_SPORT_LIST);
                aVar.a("Resuming view, no need to refresh data, elapsed time: " + jCurrentTimeMillis + " ms, isAutoRefreshEnabled: " + zA, new Object[0]);
            } else {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_LIVE_SPORT_LIST);
                aVar2.a("Resuming view, refreshing data after " + jCurrentTimeMillis + " ms", new Object[0]);
                uqsVarG1.G1();
            }
        }
        P1();
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        dty dtyVar = ((ity) this.V.getValue()).g;
        dtyVar.a.clear();
        dtyVar.b = false;
    }

    @Override // defpackage.l22
    public final void B1() {
        nqs nqsVarZ1 = z1();
        RecyclerView recyclerView = nqsVarZ1.e;
        com.cruxlab.sectionedrecyclerview.lib.d dVar = new com.cruxlab.sectionedrecyclerview.lib.d();
        lq1 lq1Var = this.f;
        if (lq1Var == null) {
            Intrinsics.n("boConfigSource");
            throw null;
        }
        k650 k650Var = this.i;
        if (k650Var == null) {
            Intrinsics.n("remoteConfigRepository");
            throw null;
        }
        mjf mjfVar = this.w;
        if (mjfVar == null) {
            Intrinsics.n("earlyPayoutConfigManager");
            throw null;
        }
        hkf hkfVarF1 = F1();
        xhh0 xhh0VarH1 = H1();
        zhh0 zhh0Var = this.A;
        String str = dLRYz.UEqnwtdEBXoqRuh;
        if (zhh0Var == null) {
            Intrinsics.n(str);
            throw null;
        }
        a8z a8zVar = this.D;
        if (a8zVar == null) {
            Intrinsics.n("outcomeBoostResolver");
            throw null;
        }
        muh muhVar = this.E;
        if (muhVar == null) {
            Intrinsics.n("flashBoostViewTracker");
            throw null;
        }
        xss xssVar = new xss(this, lq1Var, k650Var, mjfVar, hkfVarF1, xhh0VarH1, zhh0Var, a8zVar, muhVar);
        xssVar.z = new cqs(this, xssVar);
        xssVar.y = new pps(this, xssVar);
        xssVar.A = new qps(this);
        xssVar.B = new eqs(this, xssVar);
        this.Q = xssVar;
        dVar.a(xssVar, (short) 1);
        uqm accountHelper = getAccountHelper();
        mjf mjfVar2 = this.w;
        if (mjfVar2 == null) {
            Intrinsics.n("earlyPayoutConfigManager");
            throw null;
        }
        hkf hkfVarF2 = F1();
        xhh0 xhh0VarH2 = H1();
        zhh0 zhh0Var2 = this.A;
        if (zhh0Var2 == null) {
            Intrinsics.n(str);
            throw null;
        }
        a8z a8zVar2 = this.D;
        if (a8zVar2 == null) {
            Intrinsics.n("outcomeBoostResolver");
            throw null;
        }
        muh muhVar2 = this.E;
        if (muhVar2 == null) {
            Intrinsics.n("flashBoostViewTracker");
            throw null;
        }
        djh0 djh0Var = new djh0(this, accountHelper, mjfVar2, hkfVarF2, xhh0VarH2, zhh0Var2, a8zVar2, muhVar2, (ity) this.V.getValue());
        djh0Var.p = new nps(this, djh0Var);
        djh0Var.q = new gqs(this, djh0Var);
        djh0Var.n = new iqs(this, djh0Var);
        djh0Var.o = new jqs(this, djh0Var);
        this.R = djh0Var;
        int i2 = 2;
        dVar.a(djh0Var, (short) 2);
        this.P = dVar;
        recyclerView.setItemAnimator(null);
        com.cruxlab.sectionedrecyclerview.lib.d dVar2 = this.P;
        if (dVar2 == null) {
            Intrinsics.n("sectionDataManager");
            throw null;
        }
        recyclerView.setAdapter(new androidx.recyclerview.widget.f(dVar2.h, this.S, new joi(ypi.b(new j1e(nqsVarZ1, i2)))));
        recyclerView.k(new b(nqsVarZ1, this));
        SectionHeaderLayout sectionHeaderLayout = nqsVarZ1.f;
        com.cruxlab.sectionedrecyclerview.lib.d dVar3 = this.P;
        if (dVar3 == null) {
            Intrinsics.n("sectionDataManager");
            throw null;
        }
        sectionHeaderLayout.a = recyclerView;
        com.cruxlab.sectionedrecyclerview.lib.d.C0186d c0186d = dVar3.new C0186d(sectionHeaderLayout.c);
        dVar3.g = c0186d;
        sectionHeaderLayout.b = c0186d;
        recyclerView.k(sectionHeaderLayout.d);
        sectionHeaderLayout.b.b();
    }
}
