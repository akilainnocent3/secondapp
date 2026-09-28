package com.sportybet.plugin.realsports.prematch;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.BetMarketOptionType;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.footer.BottomPinnedLayoutManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchFilterType;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSortType;
import com.sportybet.plugin.realsports.prematch.data.UpcomingEventTypes;
import com.sportybet.plugin.realsports.prematch.widget.InterceptConsecutiveScrollerLayout;
import com.sportybet.plugin.realsports.prematch.widget.LiveEventsRecyclerView;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import com.sportybet.plugin.realsports.prematch.widget.PreMatchFiltersContainer;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.a8z;
import defpackage.a9l;
import defpackage.apg;
import defpackage.auy;
import defpackage.avy;
import defpackage.azm;
import defpackage.azy;
import defpackage.b12;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.br3;
import defpackage.brg;
import defpackage.bsy;
import defpackage.buy;
import defpackage.chk;
import defpackage.ckg;
import defpackage.cyb;
import defpackage.d7b;
import defpackage.dty;
import defpackage.e02;
import defpackage.ebs;
import defpackage.ej20;
import defpackage.ej5;
import defpackage.g12;
import defpackage.g1f0;
import defpackage.g1i;
import defpackage.gby;
import defpackage.gid0;
import defpackage.gty;
import defpackage.gym;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hih0;
import defpackage.hjd0;
import defpackage.hp0;
import defpackage.hus;
import defpackage.hwr;
import defpackage.i17;
import defpackage.ij90;
import defpackage.ijf;
import defpackage.il20;
import defpackage.its;
import defpackage.ity;
import defpackage.iu2;
import defpackage.iuy;
import defpackage.iym;
import defpackage.jk20;
import defpackage.joi;
import defpackage.jq40;
import defpackage.jqu;
import defpackage.jty;
import defpackage.jvd0;
import defpackage.k0e0;
import defpackage.k0m;
import defpackage.k48;
import defpackage.k53;
import defpackage.k9j;
import defpackage.kl20;
import defpackage.kzh;
import defpackage.l48;
import defpackage.lfy;
import defpackage.lkf;
import defpackage.ll20;
import defpackage.lqu;
import defpackage.mjf;
import defpackage.mk20;
import defpackage.ml20;
import defpackage.mmc;
import defpackage.mpe0;
import defpackage.msu;
import defpackage.muh;
import defpackage.njs;
import defpackage.nl20;
import defpackage.npg;
import defpackage.nt3;
import defpackage.nty;
import defpackage.o8i0;
import defpackage.obz;
import defpackage.of20;
import defpackage.ol20;
import defpackage.ots;
import defpackage.paj;
import defpackage.pk20;
import defpackage.pkf;
import defpackage.pl20;
import defpackage.pts;
import defpackage.q8i0;
import defpackage.qfb0;
import defpackage.ql20;
import defpackage.qlr;
import defpackage.qwf0;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rs40;
import defpackage.ruy;
import defpackage.s1p;
import defpackage.s9s;
import defpackage.sl20;
import defpackage.sn20;
import defpackage.sn5;
import defpackage.sty;
import defpackage.tf20;
import defpackage.tk20;
import defpackage.uhc;
import defpackage.ul20;
import defpackage.uqm;
import defpackage.uuy;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vk20;
import defpackage.vl20;
import defpackage.vuy;
import defpackage.w6b;
import defpackage.whh0;
import defpackage.wl20;
import defpackage.wlc;
import defpackage.wnf;
import defpackage.wq3;
import defpackage.wuy;
import defpackage.wym;
import defpackage.x7l;
import defpackage.xhh0;
import defpackage.xl20;
import defpackage.xlc;
import defpackage.xvf0;
import defpackage.xyd0;
import defpackage.y1k0;
import defpackage.y7z;
import defpackage.yay;
import defpackage.yec;
import defpackage.yi20;
import defpackage.yk20;
import defpackage.ymh;
import defpackage.ynf;
import defpackage.yp40;
import defpackage.ypi;
import defpackage.yrh0;
import defpackage.yty;
import defpackage.zhh0;
import defpackage.zi20;
import defpackage.zi50;
import defpackage.zjf;
import defpackage.zyh;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/PreMatchSportActivity;", "Lpy1;", "Lwym;", "Liu2$b;", "Lk9j;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PreMatchSportActivity extends k0m implements wym, iu2.b, k9j, bb40 {
    public static final LinkedHashSet c0 = new LinkedHashSet();
    public static final LinkedHashSet d0 = new LinkedHashSet();
    public static final LinkedHashSet e0 = new LinkedHashSet();
    public iuy D;
    public mjf E;
    public xhh0 F;
    public zhh0 G;
    public sty H;
    public jty I;
    public npg J;
    public azm K;
    public y1k0 L;
    public chk M;
    public boolean P;
    public ArrayList<String> S;
    public boolean T;
    public final mpe0 V;
    public final mpe0 W;
    public final mpe0 Y;
    public iym Z;
    public azy a0;
    public hjd0 b;
    public rdd0 b0;
    public a8z c;
    public muh d;
    public s1p e;
    public final q8i0 f = new q8i0(jq40.a(pts.class), new a0(), new r(), new b0());
    public final q8i0 i = new q8i0(jq40.a(jk20.class), new d0(), new c0(), new e0());
    public final q8i0 v = new q8i0(jq40.a(of20.class), new g0(), new f0(), new h0());
    public final q8i0 w = new q8i0(jq40.a(obz.class), new i(), new h(), new j());
    public final q8i0 y = new q8i0(jq40.a(sn20.class), new l(), new k(), new m());
    public final q8i0 z = new q8i0(jq40.a(ruy.class), new o(), new n(), new p());
    public final q8i0 A = new q8i0(jq40.a(bsy.class), new s(), new q(), new t());
    public final q8i0 B = new q8i0(jq40.a(ijf.class), new v(), new u(), new w());
    public final q8i0 C = new q8i0(jq40.a(xlc.class), new y(), new x(), new z());
    public final k0e0 N = new k0e0();
    public final mpe0 O = hwr.b(new Function0() { // from class: fl20
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            final PreMatchSportActivity preMatchSportActivity = this.a;
            jty jtyVar = preMatchSportActivity.I;
            if (jtyVar != null) {
                return jtyVar.a(gty.c, new ety() { // from class: el20
                    @Override // defpackage.ety
                    public final void a() {
                        avy avyVar = avy.a;
                        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                        hjd0 hjd0Var = preMatchSportActivity.b;
                        if (hjd0Var != null) {
                            hih0.c(hjd0Var.G, avyVar, true, false);
                        } else {
                            Intrinsics.n("binding");
                            throw null;
                        }
                    }
                }, new rty() { // from class: gl20
                    @Override // defpackage.rty
                    public final void a() {
                        hjd0 hjd0Var = preMatchSportActivity.b;
                        if (hjd0Var != null) {
                            fty.a(hjd0Var.N);
                        } else {
                            Intrinsics.n("binding");
                            throw null;
                        }
                    }
                });
            }
            Intrinsics.n("oneUpPromoSurfacePresenterFactory");
            throw null;
        }
    });
    public x7l<a9l> Q = new x7l<>();
    public boolean R = true;
    public String U = "";
    public final mpe0 X = hwr.b(new ynf(this, 2));

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[jqu.values().length];
            try {
                jqu jquVar = jqu.a;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                jqu jquVar2 = jqu.a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class a0 extends qlr implements Function0<v8i0> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class b {
        public final /* synthetic */ PreMatchSportActivity a;
        public final /* synthetic */ hjd0 b;

        public b(hjd0 hjd0Var, PreMatchSportActivity preMatchSportActivity) {
            this.a = preMatchSportActivity;
            this.b = hjd0Var;
        }

        public final void a(String str, String str2) {
            Object bVar;
            Object bVar2;
            str.getClass();
            str2.getClass();
            PreMatchSportActivity preMatchSportActivity = this.a;
            preMatchSportActivity.P = true;
            this.b.c.b(str, str2);
            if (str2.equals(preMatchSportActivity.getCMSString(R.string.component_odds_filters__max, new Object[0]))) {
                str2 = "2147483647";
            }
            jk20 jk20VarI1 = preMatchSportActivity.I1();
            try {
                zi50.a aVar = zi50.b;
                bVar = new BigDecimal(str);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj = BigDecimal.ZERO;
            if (bVar instanceof zi50.b) {
                bVar = obj;
            }
            jk20VarI1.A = (BigDecimal) bVar;
            try {
                bVar2 = new BigDecimal(str2);
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            Object obj2 = BigDecimal.ZERO;
            if (bVar2 instanceof zi50.b) {
                bVar2 = obj2;
            }
            jk20VarI1.B = (BigDecimal) bVar2;
            jk20VarI1.x1();
        }
    }

    public static final class b0 extends qlr implements Function0<cyb> {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class c {

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[BetMarketOptionType.values().length];
                try {
                    iArr[BetMarketOptionType.UP_MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BetMarketOptionType.OVER_UNDER_EARLY_GOALS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public c() {
        }

        public final void a(BetMarketOptionType betMarketOptionType, RegularMarketRule regularMarketRule) {
            betMarketOptionType.getClass();
            int i = a.a[betMarketOptionType.ordinal()];
            PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
            if (i == 1) {
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var != null) {
                    preMatchSportActivity.O1(regularMarketRule, true, hih0.g(hjd0Var.y.getB()));
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
            if (i != 2) {
                uhc.a();
                return;
            }
            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
            ijf ijfVar = (ijf) preMatchSportActivity.B.getValue();
            lkf lkfVar = lkf.c;
            zjf zjfVar = zjf.a;
            hjd0 hjd0Var2 = preMatchSportActivity.b;
            if (hjd0Var2 != null) {
                ijfVar.C1(lkfVar, zjfVar, hjd0Var2.z.c() ? pkf.a : pkf.b);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }

        public final void b(RegularMarketRule regularMarketRule) {
            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
            PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
            pts ptsVarE1 = preMatchSportActivity.E1();
            jvd0 jvd0Var = ptsVarE1.v;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            ptsVarE1.v = ej5.c(o8i0.d(ptsVarE1), null, null, new ots(ptsVarE1, regularMarketRule, null), 3);
            hjd0 hjd0Var = preMatchSportActivity.b;
            if (hjd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            RegularMarketRule selectedMarket = hjd0Var.F.getSelectedMarket();
            if (selectedMarket != null) {
                preMatchSportActivity.H1().d(selectedMarket, !preMatchSportActivity.K1(UpcomingEventTypes.PRE_MATCH.getValue()));
            }
        }
    }

    public static final class c0 extends qlr implements Function0<r8i0.c> {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d implements wq3.b {
        public d() {
        }

        @Override // wq3.b
        public final boolean a() {
            return !PreMatchSportActivity.this.isFinishing();
        }

        @Override // wq3.b
        public final void b(int i) {
            hjd0 hjd0Var = PreMatchSportActivity.this.b;
            if (hjd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            View view = hjd0Var.K;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i - 75;
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }

        @Override // wq3.b
        public final void c(boolean z) {
            hjd0 hjd0Var = PreMatchSportActivity.this.b;
            if (hjd0Var != null) {
                hjd0Var.K.setVisibility(8);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public static final class d0 extends qlr implements Function0<v8i0> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class e {
        public e() {
        }
    }

    public static final class e0 extends qlr implements Function0<cyb> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class f {

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[BetMarketOptionType.values().length];
                try {
                    iArr[BetMarketOptionType.UP_MARKET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BetMarketOptionType.OVER_UNDER_EARLY_GOALS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public f() {
        }

        public final void a(BetMarketOptionType betMarketOptionType, RegularMarketRule regularMarketRule) {
            betMarketOptionType.getClass();
            int i = a.a[betMarketOptionType.ordinal()];
            PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
            if (i == 1) {
                hjd0 hjd0Var = preMatchSportActivity.b;
                if (hjd0Var != null) {
                    preMatchSportActivity.O1(regularMarketRule, false, hih0.g(hjd0Var.G.getB()));
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
            if (i != 2) {
                uhc.a();
                return;
            }
            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
            ijf ijfVar = (ijf) preMatchSportActivity.B.getValue();
            lkf lkfVar = lkf.c;
            zjf zjfVar = zjf.b;
            hjd0 hjd0Var2 = preMatchSportActivity.b;
            if (hjd0Var2 != null) {
                ijfVar.C1(lkfVar, zjfVar, hjd0Var2.H.c() ? pkf.a : pkf.b);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }

        public final void b(Event event) {
            event.getClass();
            LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
            PreMatchSportActivity.this.R1(event);
        }

        public final void c() {
            PreMatchSportActivity.this.N.d(true);
        }
    }

    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class g implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public g(Function1 function1) {
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

    public static final class g0 extends qlr implements Function0<v8i0> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class h0 extends qlr implements Function0<cyb> {
        public h0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class l extends qlr implements Function0<v8i0> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class m extends qlr implements Function0<cyb> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class n extends qlr implements Function0<r8i0.c> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class o extends qlr implements Function0<v8i0> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class p extends qlr implements Function0<cyb> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class q extends qlr implements Function0<r8i0.c> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class r extends qlr implements Function0<r8i0.c> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class s extends qlr implements Function0<v8i0> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class t extends qlr implements Function0<cyb> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class u extends qlr implements Function0<r8i0.c> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class v extends qlr implements Function0<v8i0> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class w extends qlr implements Function0<cyb> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class x extends qlr implements Function0<r8i0.c> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class y extends qlr implements Function0<v8i0> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PreMatchSportActivity.this.getViewModelStore();
        }
    }

    public static final class z extends qlr implements Function0<cyb> {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PreMatchSportActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public PreMatchSportActivity() {
        int i2 = 1;
        this.V = hwr.b(new wnf(this, i2));
        this.W = hwr.b(new w6b(this, i2));
        this.Y = hwr.b(new g12(this, i2));
    }

    public final void A1(Selection selection, boolean z2, auy auyVar, boolean z3) {
        gty gtyVarA = buy.a(auyVar);
        hjd0 hjd0Var = this.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RegularMarketRule selectedMarket = hjd0Var.F.getSelectedMarket();
        sty styVar = this.H;
        if (styVar == null) {
            Intrinsics.n("oneUpSelectionAttributionDispatcher");
            throw null;
        }
        ity ityVar = (ity) this.O.getValue();
        Event event = selection.a;
        ityVar.getClass();
        nty ntyVarA = ityVar.b.a(gtyVarA, event, selectedMarket);
        ntyVarA.getClass();
        styVar.b(new sty.b.C1102b(new yty(selection, z2, gtyVarA, z3, ntyVarA, styVar.c.b()), true));
    }

    public final boolean B1() {
        String stringExtra;
        k53 k53Var;
        xvf0 xvf0VarA;
        xvf0 xvf0VarA2;
        Object obj;
        String upperCase;
        hjd0 hjd0Var = this.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (getIntent() == null || (stringExtra = getIntent().getStringExtra("key_sport_id")) == null) {
            return false;
        }
        TimePickerItem timePickerItemA = (TimePickerItem) getIntent().getParcelableExtra("key_sport_time_picker_item");
        long j2 = 0;
        if (timePickerItemA == null) {
            TimePickerItem.Companion aVar = TimePickerItem.INSTANCE;
            long longExtra = getIntent().getLongExtra("key_sport_time", 0L);
            aVar.getClass();
            timePickerItemA = TimePickerItem.Companion.a(longExtra);
        }
        k53.a aVar2 = k53.b;
        String stringExtra2 = getIntent().getStringExtra("key_bet_slip_mode");
        aVar2.getClass();
        k53[] k53VarArrValues = k53.values();
        int length = k53VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                k53Var = null;
                break;
            }
            k53Var = k53VarArrValues[i2];
            if (stringExtra2 != null) {
                upperCase = stringExtra2.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (Intrinsics.g(upperCase, k53Var.name())) {
                break;
            }
            i2++;
        }
        jk20 jk20VarI1 = I1();
        ymh ymhVarC1 = C1();
        ArrayList arrayList = ymhVarC1.k;
        ArrayList arrayListA = com.sporty.android.book.presentation.sportsmenu.time.a.a(ymhVarC1.a, true);
        int size = arrayListA.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayListA.get(i3);
            i3++;
            long j3 = j2;
            TimePickerItem timePickerItem = (TimePickerItem) obj2;
            arrayList.add(qwf0.a(timePickerItem, timePickerItem.isSameAs(timePickerItemA)));
            j2 = j3;
        }
        long j4 = j2;
        if (timePickerItemA.isDateRange()) {
            xvf0VarA = qwf0.a(timePickerItemA, true);
        } else {
            TimePickerItem.Companion aVar3 = TimePickerItem.INSTANCE;
            Calendar calendar = Calendar.getInstance();
            calendar.getClass();
            aVar3.getClass();
            xvf0VarA = qwf0.a(TimePickerItem.Companion.b(calendar, calendar), false);
        }
        arrayList.add(xvf0VarA);
        if (timePickerItemA.isTimeRange()) {
            xvf0VarA2 = qwf0.a(timePickerItemA, true);
        } else {
            TimePickerItem.INSTANCE.getClass();
            xvf0VarA2 = qwf0.a(TimePickerItem.Companion.a(j4), false);
        }
        arrayList.add(xvf0VarA2);
        int size2 = arrayList.size();
        int i4 = 0;
        do {
            if (i4 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
        } while (!((xvf0) obj).c);
        xvf0 xvf0VarA3 = (xvf0) obj;
        if (xvf0VarA3 == null) {
            xvf0VarA3 = xvf0.a();
        }
        String str = xvf0VarA3.a;
        str.getClass();
        ymh.d(str, arrayList);
        b bVar = ymhVarC1.b;
        if (bVar != null) {
            bVar.b.c.d(xvf0VarA3);
        }
        jk20VarI1.y = xvf0VarA3;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_tournament_ids");
        if (stringArrayListExtra != null) {
            if (stringArrayListExtra.isEmpty()) {
                stringArrayListExtra = null;
            }
            if (stringArrayListExtra != null) {
                rs40.b().a();
                rs40 rs40VarB = rs40.b();
                int size3 = stringArrayListExtra.size();
                int i5 = 0;
                while (i5 < size3) {
                    String str2 = stringArrayListExtra.get(i5);
                    i5++;
                    String str3 = str2;
                    rs40VarB.a.put(str3, str3);
                }
                jk20 jk20VarI2 = I1();
                PreMatchSortType preMatchSortType = PreMatchSortType.LEAGUE;
                jk20VarI2.D = preMatchSortType.getValue();
                ArrayList arrayList2 = jk20VarI2.z;
                k48.a(arrayList2, rs40.b().c());
                arrayList2.remove("sr_select_item_id");
                ymh.d(String.valueOf(preMatchSortType.getValue()), C1().l);
                hjd0Var.c.setLeagueTitleSelected();
                hjd0Var.c.c(preMatchSortType.getValue());
                this.S = stringArrayListExtra;
            }
        }
        if (k53Var != null && k53Var != iu2.c()) {
            iu2.a.j().r0(k53Var);
            if (k53Var == k53.SIM) {
                ((br3) mmc.a(hp0.A, br3.class)).U().w(false);
            }
        }
        String stringExtra3 = getIntent().getStringExtra("key_market_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.U = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("key_live_list_mode");
        boolean z2 = !TextUtils.isEmpty(stringExtra4) && Intrinsics.g(stringExtra4, "live_list");
        this.T = z2;
        hjd0 hjd0Var2 = this.b;
        if (hjd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        hjd0Var2.B.setLiveBettingChecked(z2);
        T1(stringExtra, false);
        P1();
        return true;
    }

    @Override // iu2.a
    public final void C() {
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            ((OutcomeButton) it.next()).d();
        }
        Iterator it2 = d0.iterator();
        while (it2.hasNext()) {
            ((OutcomeButton) it2.next()).d();
        }
        Iterator it3 = e0.iterator();
        while (it3.hasNext()) {
            ((OutcomeButton) it3.next()).d();
        }
    }

    public final ymh C1() {
        return (ymh) this.X.getValue();
    }

    public final its D1() {
        return (its) this.W.getValue();
    }

    public final pts E1() {
        return (pts) this.f.getValue();
    }

    public final iym F1() {
        iym iymVar = this.Z;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final obz G1() {
        return (obz) this.w.getValue();
    }

    public final ej20 H1() {
        return (ej20) this.Y.getValue();
    }

    public final jk20 I1() {
        return (jk20) this.i.getValue();
    }

    public final void J1() {
        hjd0 hjd0Var = this.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        View view = hjd0Var.d;
        PreMatchFiltersContainer preMatchFiltersContainer = hjd0Var.c;
        MarketsTabs marketsTabs = hjd0Var.F;
        int selectedTabPosition = hjd0Var.b.getSelectedTabPosition();
        if (selectedTabPosition == UpcomingEventTypes.PRE_MATCH.getValue()) {
            preMatchFiltersContainer.setVisibility(0);
            view.setVisibility(0);
            marketsTabs.setVisibility(0);
            H1().d(marketsTabs.getSelectedMarket(), false);
            return;
        }
        if (selectedTabPosition == UpcomingEventTypes.OUTRIGHT.getValue()) {
            this.N.b();
            preMatchFiltersContainer.setVisibility(8);
            view.setVisibility(8);
            marketsTabs.setVisibility(8);
            H1().d(marketsTabs.getSelectedMarket(), true);
        }
    }

    public final boolean K1(int i2) {
        hjd0 hjd0Var = this.b;
        if (hjd0Var != null) {
            return hjd0Var.b.getSelectedTabPosition() == i2;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final boolean L1() {
        xhh0 xhh0Var = this.F;
        if (xhh0Var == null) {
            Intrinsics.n("upMarketTabUseCase");
            throw null;
        }
        String str = I1().e;
        hjd0 hjd0Var = this.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        whh0 whh0VarC = xhh0Var.c(hjd0Var.F.getSelectedMarket(), str, false);
        if (this.G != null) {
            return zhh0.a(whh0VarC).b == avy.a;
        }
        Intrinsics.n("upPageToggleStateUseCase");
        throw null;
    }

    public final void M1() {
        String str;
        hjd0 hjd0Var = this.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        BubbleView bubbleView = hjd0Var.E;
        BubbleView bubbleView2 = hjd0Var.i;
        jqu jquVarB = lqu.b(bubbleView2);
        if (jquVarB == null) {
            jquVarB = lqu.b(bubbleView);
        }
        sn20 sn20Var = (sn20) this.y.getValue();
        int i2 = jquVarB == null ? -1 : a.a[jquVarB.ordinal()];
        if (i2 == -1) {
            str = "market_early_goals_switch_hint_displayed";
        } else if (i2 != 1) {
            if (i2 != 2) {
                uhc.a();
                return;
            }
            str = "market_early_goals_switch_hint_displayed";
        } else {
            str = "dc_one_up_switch_hint_displayed";
        }
        sn20Var.a.b(str);
        bubbleView2.setVisibility(8);
        bubbleView.setVisibility(8);
    }

    public final void N1(RegularMarketRule regularMarketRule, boolean z2, avy avyVar) {
        xhh0 xhh0Var = this.F;
        if (xhh0Var == null) {
            Intrinsics.n("upMarketTabUseCase");
            throw null;
        }
        if (!wlc.a(xhh0Var.d(I1().e, regularMarketRule != null ? regularMarketRule.a : null, z2))) {
            ((bsy) this.A.getValue()).C1(wuy.c, z2 ? uuy.a : uuy.b, vuy.b(avyVar));
            return;
        }
        xlc xlcVar = (xlc) this.C.getValue();
        lkf lkfVar = lkf.c;
        zjf zjfVar = zjf.a;
        xlcVar.x1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
    }

    public final void O1(RegularMarketRule regularMarketRule, boolean z2, avy avyVar) {
        xhh0 xhh0Var = this.F;
        if (xhh0Var == null) {
            Intrinsics.n("upMarketTabUseCase");
            throw null;
        }
        if (!wlc.a(xhh0Var.d(I1().e, regularMarketRule != null ? regularMarketRule.a : null, z2))) {
            ((bsy) this.A.getValue()).D1(wuy.c, z2 ? uuy.a : uuy.b);
            return;
        }
        xlc xlcVar = (xlc) this.C.getValue();
        lkf lkfVar = lkf.c;
        zjf zjfVar = zjf.a;
        xlcVar.y1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
    }

    public final void P1() {
        hjd0 hjd0Var = this.b;
        Object obj = null;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveTogglesContainer liveTogglesContainer = hjd0Var.B;
        boolean z2 = false;
        if (I1().D != PreMatchSortType.LEAGUE.getValue() && rs40.b().c().isEmpty()) {
            ArrayList arrayList = C1().k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((xvf0) obj2).c) {
                    obj = obj2;
                    break;
                }
            }
            xvf0 xvf0Var = (xvf0) obj;
            if (xvf0Var != null ? xvf0Var.b() : false) {
                z2 = true;
            }
        }
        liveTogglesContainer.setLiveBettingVisible(z2);
    }

    public final void Q1(Event event) {
        String stringExtra;
        Intent intent = new Intent(this, (Class<?>) EventActivity.class);
        intent.putExtra("EXTRA_EVENT", apg.f(event));
        Unit unit = Unit.a;
        Event event2 = (Event) intent.getParcelableExtra("EXTRA_EVENT");
        if (event2 == null || (stringExtra = event2.eventId) == null) {
            stringExtra = intent.getStringExtra("EXTRA_EVENT_ID");
        }
        if (stringExtra == null || stringExtra.length() == 0) {
            new b12().showDialog(this, sn5.b(this, R.string.common_feedback__failed_to_load_data_please_refresh_the_page, new Object[0]), new ckg(0));
        } else {
            yrh0.s(this, intent, true);
        }
    }

    public final void R1(Event event) {
        String str = event.eventId;
        str.getClass();
        String str2 = event.sport.id;
        str2.getClass();
        xyd0.a.a(str, str2, event.isLiveOrFinished(), event.eventSource).show(getSupportFragmentManager(), "statisticsDialogFragment");
    }

    public final void S1(Selection selection, boolean z2, brg brgVar) {
        if (z2) {
            iym iymVarF1 = F1();
            PageMeta.INSTANCE.getClass();
            iymVarF1.f(AnalyticsEvent.SPORT_PAGE_ADD_TO_BETSLIP, new PageMeta("sport", null));
        }
        if (iu2.m()) {
            Event event = selection.a;
            Market market = selection.b;
            if (event.isVirtualSoccer()) {
                return;
            }
            if (!z2) {
                iym iymVarF2 = F1();
                event.getClass();
                market.getClass();
                gym.a(iymVarF2, new nt3(apg.b(event, market)));
                return;
            }
            s1p s1pVar = this.e;
            if (s1pVar == null) {
                Intrinsics.n("isLfbBoostEligibleUseCase");
                throw null;
            }
            gym.a(F1(), new y7z(brgVar, apg.b(event, market), s1pVar.a(event.eventId, market.status, selection.c)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    public final void T1(final String str, boolean z2) {
        pts ptsVarE1 = E1();
        ptsVarE1.i = str;
        ptsVarE1.x1();
        its itsVarD1 = D1();
        String str2 = this.T ? this.U : null;
        itsVarD1.getClass();
        itsVarD1.t = str;
        MarketsTabs marketsTabs = itsVarD1.c;
        QuickMarketSpotEnum quickMarketSpotEnum = QuickMarketSpotEnum.MAIN_PAGE_LIVE_EVENTS;
        int i2 = MarketsTabs.r0;
        marketsTabs.x(quickMarketSpotEnum, str, str2, new msu());
        OneUpTwoUpSwitch oneUpTwoUpSwitch = itsVarD1.g;
        avy avyVar = avy.c;
        hih0.c(oneUpTwoUpSwitch, avyVar, false, true);
        int i3 = 0;
        itsVarD1.h.setState(false, false, true);
        jk20 jk20VarI1 = I1();
        if (!Intrinsics.g(jk20VarI1.e, str)) {
            jk20VarI1.N.a(Boolean.FALSE);
        }
        jk20VarI1.e = str;
        jk20VarI1.f = null;
        if (z2) {
            rs40.b().a();
            jk20VarI1.z.clear();
            jk20VarI1.D = PreMatchSortType.DEFAULT.getValue();
        }
        final ej20 ej20VarH1 = H1();
        final String strA = !this.T ? this.U : null;
        ej20VarH1.getClass();
        ej20VarH1.t = str;
        ej20VarH1.u = null;
        tf20 tf20Var = ej20VarH1.r;
        if (tf20Var != null) {
            tf20Var.B = null;
        }
        final String str3 = (strA == null || StringsKt.U(strA)) ? null : strA;
        xhh0 xhh0Var = ej20VarH1.h.a;
        if (strA == null) {
            strA = null;
        } else {
            if (StringsKt.U(strA)) {
                strA = null;
            }
            if (strA == null) {
                strA = null;
            } else if (xhh0Var.f(str, strA, false)) {
                String strA2 = xhh0Var.a(str, strA, avyVar, false);
                if (strA2 != null) {
                    strA = strA2;
                }
            } else if (yay.h(strA)) {
                strA = yay.a(strA, false);
            }
        }
        ej20VarH1.v = (strA == null || str3 == null || str3.equals(strA)) ? null : strA;
        hih0.c(ej20VarH1.b, avyVar, false, true);
        ej20VarH1.c.setState(false, false, true);
        ej20VarH1.a.x(QuickMarketSpotEnum.SPORTS_PAGE_PRE_MATCH, str, strA, new Function1() { // from class: xi20
            /* JADX WARN: Code duplicated, block: B:19:0x0035  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                yhh0 yhh0VarA;
                RegularMarketRule regularMarketRule;
                RegularMarketRule regularMarketRuleB;
                RegularMarketRule regularMarketRule2 = (RegularMarketRule) obj;
                ej20 ej20Var = ej20VarH1;
                npg npgVar = ej20Var.h;
                if (regularMarketRule2 == null) {
                    ej20Var.v = null;
                } else {
                    String str4 = regularMarketRule2.a;
                    String str5 = str3;
                    if (str5 == null) {
                        ej20Var.v = null;
                    } else {
                        String str6 = strA;
                        if (!Intrinsics.g(str4, str6) || str5.equals(str4)) {
                            ej20Var.v = null;
                        } else {
                            xhh0 xhh0Var2 = npgVar.a;
                            String str7 = !StringsKt.U(str5) ? str5 : null;
                            if (str7 == null) {
                                yhh0VarA = null;
                            } else {
                                String str8 = str;
                                if (xhh0Var2.f(str8, str7, false)) {
                                    String strA3 = xhh0Var2.a(str8, str7, avy.c, false);
                                    if (strA3 == null) {
                                        strA3 = str7;
                                    }
                                    if (strA3.equals(str6)) {
                                        yhh0VarA = zhh0.a(xhh0Var2.d(str8, str7, false));
                                    } else {
                                        yhh0VarA = null;
                                    }
                                } else {
                                    yhh0VarA = null;
                                }
                            }
                            avy avyVar2 = yhh0VarA != null ? yhh0VarA.b : null;
                            if (avyVar2 == null || avyVar2 == avy.c) {
                                if (StringsKt.U(str5)) {
                                    str5 = null;
                                }
                                if (Intrinsics.g((str5 != null && yay.h(str5) && Intrinsics.g(yay.a(str5, false), str6)) ? Boolean.valueOf(yay.g(str5)) : null, Boolean.TRUE)) {
                                    ej20Var.v = null;
                                    ej20Var.c(true);
                                }
                                ej20Var.v = null;
                            } else {
                                ej20Var.v = null;
                                String str9 = ej20Var.t;
                                if (str9 != null && (regularMarketRule = ej20Var.u) != null && (regularMarketRuleB = ej20Var.i.b(avyVar2, regularMarketRule, str9, false)) != null) {
                                    ej20Var.f(regularMarketRule, regularMarketRuleB);
                                }
                            }
                        }
                    }
                }
                return Unit.a;
            }
        });
        G1().x1(str);
        ymh ymhVarC1 = C1();
        ymhVarC1.getClass();
        ArrayList arrayList = ymhVarC1.j;
        if (arrayList.isEmpty()) {
            List<OrderedSportItem> fromStorage = OrderedSportItemHelper.getFromStorage(3);
            fromStorage.getClass();
            ArrayList arrayList2 = new ArrayList(l48.r(fromStorage, 10));
            for (OrderedSportItem orderedSportItem : fromStorage) {
                qfb0 qfb0Var = new qfb0();
                UiText uiText = orderedSportItem.nameUiText;
                Context context = ymhVarC1.a;
                uiText.getClass();
                qfb0Var.b = uiText.e(context).toString();
                String str4 = orderedSportItem.id;
                qfb0Var.d = str4;
                qfb0Var.c = Intrinsics.g(str4, str);
                arrayList2.add(qfb0Var);
            }
            arrayList.addAll(arrayList2);
        } else {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                g1f0 g1f0Var = (g1f0) obj;
                if (!(g1f0Var instanceof qfb0)) {
                    g1f0Var = null;
                }
                qfb0 qfb0Var2 = (qfb0) g1f0Var;
                if (qfb0Var2 != null) {
                    qfb0Var2.c = Intrinsics.g(qfb0Var2.d, str);
                }
            }
        }
        ruy.x1((ruy) this.z.getValue());
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        RecyclerView.f fVar;
        TabLayout.g gVarK;
        super.onCreate(bundle);
        int i2 = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_pre_match_sport_activity, (ViewGroup) null, false);
        int i3 = R.id.event_type_tabs;
        TabLayout tabLayout = (TabLayout) h5e.a(R.id.event_type_tabs, viewInflate);
        if (tabLayout != null) {
            i3 = R.id.filter_container;
            PreMatchFiltersContainer preMatchFiltersContainer = (PreMatchFiltersContainer) h5e.a(R.id.filter_container, viewInflate);
            if (preMatchFiltersContainer != null) {
                i3 = R.id.filter_divider;
                View viewA = h5e.a(R.id.filter_divider, viewInflate);
                if (viewA != null) {
                    i3 = R.id.live_loading;
                    LoadingView loadingView = (LoadingView) h5e.a(R.id.live_loading, viewInflate);
                    if (loadingView != null) {
                        i3 = R.id.live_market_option_divider;
                        View viewA2 = h5e.a(R.id.live_market_option_divider, viewInflate);
                        if (viewA2 != null) {
                            i3 = R.id.live_market_option_feature_alert;
                            BubbleView bubbleView = (BubbleView) h5e.a(R.id.live_market_option_feature_alert, viewInflate);
                            if (bubbleView != null) {
                                i3 = R.id.live_market_tabs;
                                MarketsTabs marketsTabs = (MarketsTabs) h5e.a(R.id.live_market_tabs, viewInflate);
                                if (marketsTabs != null) {
                                    i3 = R.id.live_market_title;
                                    View viewA3 = h5e.a(R.id.live_market_title, viewInflate);
                                    if (viewA3 != null) {
                                        gid0 gid0VarA = gid0.a(viewA3);
                                        i3 = R.id.live_one_two_up_switch;
                                        OneUpTwoUpSwitch oneUpTwoUpSwitch = (OneUpTwoUpSwitch) h5e.a(R.id.live_one_two_up_switch, viewInflate);
                                        if (oneUpTwoUpSwitch != null) {
                                            i3 = R.id.live_ou_early_goals_switch;
                                            OUEarlyGoalsSwitch oUEarlyGoalsSwitch = (OUEarlyGoalsSwitch) h5e.a(R.id.live_ou_early_goals_switch, viewInflate);
                                            if (oUEarlyGoalsSwitch != null) {
                                                i3 = R.id.live_recycler;
                                                LiveEventsRecyclerView liveEventsRecyclerView = (LiveEventsRecyclerView) h5e.a(R.id.live_recycler, viewInflate);
                                                if (liveEventsRecyclerView != null) {
                                                    i3 = R.id.live_toggles_container;
                                                    LiveTogglesContainer liveTogglesContainer = (LiveTogglesContainer) h5e.a(R.id.live_toggles_container, viewInflate);
                                                    if (liveTogglesContainer != null) {
                                                        i3 = R.id.pre_match_market_divider;
                                                        View viewA4 = h5e.a(R.id.pre_match_market_divider, viewInflate);
                                                        if (viewA4 != null) {
                                                            i3 = R.id.pre_match_market_option_divider;
                                                            View viewA5 = h5e.a(R.id.pre_match_market_option_divider, viewInflate);
                                                            if (viewA5 != null) {
                                                                i3 = R.id.pre_match_market_option_feature_alert;
                                                                BubbleView bubbleView2 = (BubbleView) h5e.a(R.id.pre_match_market_option_feature_alert, viewInflate);
                                                                if (bubbleView2 != null) {
                                                                    i3 = R.id.pre_match_market_tabs;
                                                                    MarketsTabs marketsTabs2 = (MarketsTabs) h5e.a(R.id.pre_match_market_tabs, viewInflate);
                                                                    if (marketsTabs2 != null) {
                                                                        i3 = R.id.pre_match_one_two_up_switch;
                                                                        OneUpTwoUpSwitch oneUpTwoUpSwitch2 = (OneUpTwoUpSwitch) h5e.a(R.id.pre_match_one_two_up_switch, viewInflate);
                                                                        if (oneUpTwoUpSwitch2 != null) {
                                                                            i3 = R.id.pre_match_ou_early_goals_switch;
                                                                            OUEarlyGoalsSwitch oUEarlyGoalsSwitch2 = (OUEarlyGoalsSwitch) h5e.a(R.id.pre_match_ou_early_goals_switch, viewInflate);
                                                                            if (oUEarlyGoalsSwitch2 != null) {
                                                                                i3 = R.id.refresh_container;
                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.refresh_container, viewInflate);
                                                                                if (swipeRefreshLayout != null) {
                                                                                    i3 = R.id.scroll_container;
                                                                                    InterceptConsecutiveScrollerLayout interceptConsecutiveScrollerLayout = (InterceptConsecutiveScrollerLayout) h5e.a(R.id.scroll_container, viewInflate);
                                                                                    if (interceptConsecutiveScrollerLayout != null) {
                                                                                        i3 = R.id.stub;
                                                                                        View viewA6 = h5e.a(R.id.stub, viewInflate);
                                                                                        if (viewA6 != null) {
                                                                                            i3 = R.id.title_bar;
                                                                                            View viewA7 = h5e.a(R.id.title_bar, viewInflate);
                                                                                            if (viewA7 != null) {
                                                                                                ij90 ij90VarA = ij90.a(viewA7);
                                                                                                i3 = R.id.upcoming_loading;
                                                                                                LoadingView loadingView2 = (LoadingView) h5e.a(R.id.upcoming_loading, viewInflate);
                                                                                                if (loadingView2 != null) {
                                                                                                    i3 = R.id.upcoming_recycler;
                                                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.upcoming_recycler, viewInflate);
                                                                                                    if (recyclerView != null) {
                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                        hjd0 hjd0Var = new hjd0(constraintLayout, tabLayout, preMatchFiltersContainer, viewA, loadingView, viewA2, bubbleView, marketsTabs, gid0VarA, oneUpTwoUpSwitch, oUEarlyGoalsSwitch, liveEventsRecyclerView, liveTogglesContainer, viewA4, viewA5, bubbleView2, marketsTabs2, oneUpTwoUpSwitch2, oUEarlyGoalsSwitch2, swipeRefreshLayout, interceptConsecutiveScrollerLayout, viewA6, ij90VarA, loadingView2, recyclerView);
                                                                                                        setContentView(constraintLayout);
                                                                                                        this.b = hjd0Var;
                                                                                                        int i4 = 1;
                                                                                                        setRequireBetslipBtnLater(true);
                                                                                                        if (!B1()) {
                                                                                                            finish();
                                                                                                            return;
                                                                                                        }
                                                                                                        iu2.a(this);
                                                                                                        final hjd0 hjd0Var2 = this.b;
                                                                                                        if (hjd0Var2 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        hjd0Var2.I.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: jl20
                                                                                                            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                                                                            public final void i() {
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                int value = UpcomingEventTypes.PRE_MATCH.getValue();
                                                                                                                PreMatchSportActivity preMatchSportActivity = this.a;
                                                                                                                if (preMatchSportActivity.K1(value)) {
                                                                                                                    preMatchSportActivity.I1().x1();
                                                                                                                    preMatchSportActivity.R = true;
                                                                                                                } else {
                                                                                                                    preMatchSportActivity.G1().x1(preMatchSportActivity.I1().e);
                                                                                                                }
                                                                                                                pts ptsVarE1 = preMatchSportActivity.E1();
                                                                                                                ptsVarE1.b.b(false);
                                                                                                                ptsVarE1.x1();
                                                                                                            }
                                                                                                        });
                                                                                                        hjd0Var2.c.setListener(new vl20(hjd0Var2, this));
                                                                                                        hjd0Var2.N.setItemAnimator(null);
                                                                                                        hjd0Var2.M.setOnClickListener(new View.OnClickListener() { // from class: nk20
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                int value = UpcomingEventTypes.PRE_MATCH.getValue();
                                                                                                                PreMatchSportActivity preMatchSportActivity = this.a;
                                                                                                                if (preMatchSportActivity.K1(value)) {
                                                                                                                    preMatchSportActivity.I1().x1();
                                                                                                                } else {
                                                                                                                    preMatchSportActivity.G1().x1(preMatchSportActivity.I1().e);
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        hjd0Var2.y.setOnStateChangedListener(new wl20(hjd0Var2, this));
                                                                                                        hjd0Var2.z.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: ok20
                                                                                                            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
                                                                                                            public final void onStateChanged(boolean z2) {
                                                                                                                RegularMarketRule regularMarketRule;
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                PreMatchSportActivity preMatchSportActivity = this;
                                                                                                                its itsVarD1 = preMatchSportActivity.D1();
                                                                                                                String str = itsVarD1.t;
                                                                                                                if (str != null && (regularMarketRule = itsVarD1.u) != null) {
                                                                                                                    String str2 = regularMarketRule.a;
                                                                                                                    RegularMarketRule regularMarketRuleA = itsVarD1.l.b(ckf.c, str, str2, true) ? RegularMarketRule.a(yay.a(str2, z2), null) : regularMarketRule;
                                                                                                                    if (regularMarketRuleA != null) {
                                                                                                                        itsVarD1.d(regularMarketRule, regularMarketRuleA);
                                                                                                                    }
                                                                                                                }
                                                                                                                hjd0Var2.H.setState(z2, false, false);
                                                                                                                ((ijf) preMatchSportActivity.B.getValue()).B1(lkf.c, zjf.a, z2 ? pkf.a : pkf.b);
                                                                                                            }
                                                                                                        });
                                                                                                        hjd0Var2.i.setOnClickedClose(new pk20(this, i2));
                                                                                                        hjd0Var2.G.setOnStateChangedListener(new xl20(hjd0Var2, this));
                                                                                                        hjd0Var2.H.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: qk20
                                                                                                            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
                                                                                                            public final void onStateChanged(boolean z2) {
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                PreMatchSportActivity preMatchSportActivity = this;
                                                                                                                preMatchSportActivity.H1().c(z2);
                                                                                                                hjd0Var2.z.setState(z2, false, false);
                                                                                                                ((ijf) preMatchSportActivity.B.getValue()).B1(lkf.c, zjf.b, z2 ? pkf.a : pkf.b);
                                                                                                            }
                                                                                                        });
                                                                                                        hjd0Var2.E.setOnClickedClose(new i17(this, i4));
                                                                                                        hjd0 hjd0Var3 = this.b;
                                                                                                        if (hjd0Var3 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        gby.a(hjd0Var3.i.getDescriptionView(), new e02(hjd0Var3, 3));
                                                                                                        gby.a(hjd0Var3.E.getDescriptionView(), new yk20(hjd0Var3, i2));
                                                                                                        hjd0 hjd0Var4 = this.b;
                                                                                                        if (hjd0Var4 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        final SimpleActionBar simpleActionBar = hjd0Var4.L.a;
                                                                                                        simpleActionBar.setSearchActionButton(new View.OnClickListener() { // from class: rk20
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                yrh0.k(simpleActionBar.getContext());
                                                                                                            }
                                                                                                        });
                                                                                                        simpleActionBar.setBackButton(new View.OnClickListener() { // from class: sk20
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                this.a.onBackPressed();
                                                                                                            }
                                                                                                        });
                                                                                                        simpleActionBar.setHomeButton(new tk20());
                                                                                                        ArrayList arrayList = C1().j;
                                                                                                        int size = arrayList.size();
                                                                                                        int i5 = 0;
                                                                                                        do {
                                                                                                            if (i5 >= size) {
                                                                                                                obj = null;
                                                                                                                break;
                                                                                                            } else {
                                                                                                                obj = arrayList.get(i5);
                                                                                                                i5++;
                                                                                                            }
                                                                                                        } while (!((g1f0) obj).c);
                                                                                                        g1f0 g1f0Var = (g1f0) obj;
                                                                                                        String str = g1f0Var != null ? g1f0Var.b : null;
                                                                                                        if (str == null) {
                                                                                                            str = "";
                                                                                                        }
                                                                                                        simpleActionBar.setTitle(str);
                                                                                                        TextView titleView = simpleActionBar.getTitleView();
                                                                                                        titleView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) this.V.getValue(), (Drawable) null);
                                                                                                        titleView.setOnClickListener(new View.OnClickListener() { // from class: uk20
                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                            public final void onClick(View view) {
                                                                                                                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                                                                                                                PreMatchSportActivity preMatchSportActivity = this.a;
                                                                                                                ymh ymhVarC1 = preMatchSportActivity.C1();
                                                                                                                yec yecVar = ymhVarC1.c;
                                                                                                                if (!Intrinsics.g(yecVar != null ? yecVar.getContentView() : null, ymhVarC1.c()) || !ymhVarC1.c().i) {
                                                                                                                    preMatchSportActivity.C1().a(PreMatchFilterType.SPORT, simpleActionBar);
                                                                                                                    return;
                                                                                                                }
                                                                                                                yec yecVar2 = preMatchSportActivity.C1().c;
                                                                                                                if (yecVar2 != null) {
                                                                                                                    yecVar2.dismiss();
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        hjd0 hjd0Var5 = this.b;
                                                                                                        if (hjd0Var5 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        TabLayout tabLayout2 = hjd0Var5.b;
                                                                                                        Iterator it = kotlin.collections.b.k(Integer.valueOf(R.string.common_functions__matches), Integer.valueOf(R.string.common_functions__outrights)).iterator();
                                                                                                        while (it.hasNext()) {
                                                                                                            int iIntValue = ((Number) it.next()).intValue();
                                                                                                            TabLayout.g gVarL = tabLayout2.l();
                                                                                                            View viewInflate2 = getLayoutInflater().inflate(R.layout.spr_pre_match_event_type_tab, (ViewGroup) null, false);
                                                                                                            if (viewInflate2 == null) {
                                                                                                                bmy.a("rootView");
                                                                                                                return;
                                                                                                            }
                                                                                                            TextView textView = (TextView) viewInflate2;
                                                                                                            textView.setText(getCMSString(iIntValue, new Object[0]));
                                                                                                            gVarL.c(textView);
                                                                                                            tabLayout2.b(gVarL);
                                                                                                        }
                                                                                                        tabLayout2.a(new ul20(this));
                                                                                                        if (getIntent().getBooleanExtra("key_is_outright", false) && (gVarK = tabLayout2.k(UpcomingEventTypes.OUTRIGHT.getValue())) != null) {
                                                                                                            gVarK.b();
                                                                                                        }
                                                                                                        ej20 ej20VarH1 = H1();
                                                                                                        uqm accountHelper = getAccountHelper();
                                                                                                        hjd0 hjd0Var6 = this.b;
                                                                                                        if (hjd0Var6 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        RegularMarketRule selectedMarket = hjd0Var6.F.getSelectedMarket();
                                                                                                        joi joiVar = new joi(ypi.b(new mk20(this, i2)));
                                                                                                        azy azyVar = this.a0;
                                                                                                        if (azyVar == null) {
                                                                                                            Intrinsics.n("openBetFifaManager");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        List<String> listA = azyVar.a();
                                                                                                        ej20VarH1.getClass();
                                                                                                        accountHelper.getClass();
                                                                                                        listA.getClass();
                                                                                                        tf20 tf20Var = new tf20(this, accountHelper, ej20VarH1.i, new yi20(ej20VarH1), new zi20(ej20VarH1), ej20VarH1.j, ej20VarH1.k, ej20VarH1.p, listA, ej20VarH1.q);
                                                                                                        tf20Var.setStateRestorationPolicy(RecyclerView.f.a.b);
                                                                                                        if (selectedMarket != null) {
                                                                                                            tf20Var.o(selectedMarket);
                                                                                                        }
                                                                                                        ej20VarH1.r = tf20Var;
                                                                                                        ej20VarH1.s = new androidx.recyclerview.widget.f(tf20Var, joiVar);
                                                                                                        this.Q = new x7l<>();
                                                                                                        hjd0 hjd0Var7 = this.b;
                                                                                                        if (hjd0Var7 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        hjd0Var7.N.setLayoutManager(new BottomPinnedLayoutManager(this, new vk20()));
                                                                                                        hjd0 hjd0Var8 = this.b;
                                                                                                        if (hjd0Var8 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        RecyclerView recyclerView2 = hjd0Var8.N;
                                                                                                        if (K1(UpcomingEventTypes.PRE_MATCH.getValue())) {
                                                                                                            RecyclerView.f<?> fVar2 = H1().r;
                                                                                                            fVar2.getClass();
                                                                                                            z1(fVar2);
                                                                                                            fVar = H1().s;
                                                                                                            fVar.getClass();
                                                                                                        } else {
                                                                                                            fVar = this.Q;
                                                                                                        }
                                                                                                        recyclerView2.setAdapter(fVar);
                                                                                                        ((ity) this.O.getValue()).c(this);
                                                                                                        hjd0 hjd0Var9 = this.b;
                                                                                                        if (hjd0Var9 == null) {
                                                                                                            Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        SwipeRefreshLayout swipeRefreshLayout2 = hjd0Var9.I;
                                                                                                        v340 v340Var = E1().d;
                                                                                                        s9s lifecycle = getLifecycle();
                                                                                                        s9s.b bVar = s9s.b.d;
                                                                                                        kzh.d(new g1i(zyh.a(v340Var, lifecycle, bVar), new kl20(this, swipeRefreshLayout2, null)), ebs.a(getLifecycle()));
                                                                                                        kzh.d(new g1i(zyh.a(E1().f, getLifecycle(), bVar), new ll20(this, null)), ebs.a(getLifecycle()));
                                                                                                        kzh.d(new g1i(zyh.a(I1().G, getLifecycle(), bVar), new ml20(this, null)), ebs.a(getLifecycle()));
                                                                                                        kzh.d(new g1i(zyh.a(I1().I, getLifecycle(), bVar), new nl20(this, null)), ebs.a(getLifecycle()));
                                                                                                        kzh.d(new g1i(zyh.a(I1().M, getLifecycle(), bVar), new ol20(this, null)), ebs.a(getLifecycle()));
                                                                                                        kzh.d(new g1i(zyh.a(I1().K, getLifecycle(), bVar), new pl20(this, null)), ebs.a(getLifecycle()));
                                                                                                        ((of20) this.v.getValue()).D.f(this, new g(new d7b(this, i4)));
                                                                                                        kzh.d(new g1i(zyh.a(G1().c, getLifecycle(), bVar), new ql20(this, null)), ebs.a(getLifecycle()));
                                                                                                        yp40 yp40Var = new yp40();
                                                                                                        y1k0 y1k0Var = this.L;
                                                                                                        if (y1k0Var == null) {
                                                                                                            Intrinsics.n("worldCupPassBannerStateProvider");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        kzh.d(new g1i(zyh.a(y1k0Var.getState(), getLifecycle(), bVar), new sl20(yp40Var, this, null)), ebs.a(getLifecycle()));
                                                                                                        ((njs) ((ruy) this.z.getValue()).d.getValue()).f(this, new g(new il20(this, i2)));
                                                                                                        iym iymVarF1 = F1();
                                                                                                        PageMeta.INSTANCE.getClass();
                                                                                                        iymVarF1.f(AnalyticsEvent.SPORT_PAGE_VIEW, new PageMeta("sport", null));
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.N.b();
        iu2.q(this);
        QuickMarketHelper.disposeAll();
        rs40.b().a();
        c0.clear();
        d0.clear();
        e0.clear();
        ymh ymhVarC1 = C1();
        yec yecVar = ymhVarC1.c;
        if (yecVar != null) {
            yecVar.dismiss();
        }
        ymhVarC1.c = null;
        if (H1().r != null) {
            tf20.E.clear();
            tf20.F.clear();
        }
        hus husVar = E1().b;
        husVar.b(false);
        husVar.getClass();
        SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic(TopicInfoKt.generateTopicString$default(TopicType.LIVE_SPORTS, null, 2, null)), husVar.c);
        I1().b.b(true);
        super.onDestroy();
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        B1();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
        wq3VarU.a(this, false);
        wq3VarU.K = null;
        jk20 jk20VarI1 = I1();
        hjd0 hjd0Var = this.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RecyclerView.o layoutManager = hjd0Var.N.getLayoutManager();
        jk20VarI1.w = layoutManager != null ? layoutManager.w0() : null;
        super.onPause();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
        wq3VarU.K = new d();
        wq3VarU.a(this, true);
        Parcelable parcelable = I1().w;
        if (parcelable != null) {
            hjd0 hjd0Var = this.b;
            if (hjd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            RecyclerView.o layoutManager = hjd0Var.N.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.v0(parcelable);
            }
        }
        I1().w = null;
        I1().H1();
        ruy.x1((ruy) this.z.getValue());
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        dty dtyVar = ((ity) this.O.getValue()).g;
        dtyVar.a.clear();
        dtyVar.b = false;
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(RecyclerView.f<?> fVar) {
        k0e0 k0e0Var = this.N;
        k0e0Var.b();
        hjd0 hjd0Var = this.b;
        if (hjd0Var != null) {
            k0e0Var.a(hjd0Var.N, fVar, (k0e0.a) fVar);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
