package com.sportybet.plugin.realsports.home.featuredsection;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.game.agent.FeaturedGamesRouter;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.FeaturedInstantVirtualView;
import com.sportybet.android.instantwin.router.bethistory.BuildAndGoHistoryInput;
import com.sportybet.android.router.Sender;
import com.sportybet.android.widget.ErrorView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.feature.luckynumber.featurematch.presentation.LuckyNumberFeatureMatchView;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedDisplayData;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.FeaturedMatchData;
import com.sportybet.plugin.realsports.data.FeaturedTab;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import defpackage.a6d;
import defpackage.a8z;
import defpackage.apg;
import defpackage.b6d;
import defpackage.b9i0;
import defpackage.bmy;
import defpackage.brg;
import defpackage.c0d;
import defpackage.cdh;
import defpackage.e8z;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.fbh0;
import defpackage.fjt;
import defpackage.fse;
import defpackage.fz4;
import defpackage.g8z;
import defpackage.gku;
import defpackage.gz4;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.idh;
import defpackage.iym;
import defpackage.jdh;
import defpackage.jlo;
import defpackage.k00;
import defpackage.kdh;
import defpackage.kw5;
import defpackage.ky7;
import defpackage.l48;
import defpackage.ldh;
import defpackage.lfy;
import defpackage.lgb0;
import defpackage.lit;
import defpackage.lk50;
import defpackage.m2l;
import defpackage.mgb0;
import defpackage.mpe0;
import defpackage.muh;
import defpackage.mwo;
import defpackage.nas;
import defpackage.ndh;
import defpackage.ogh;
import defpackage.paj;
import defpackage.pfd;
import defpackage.psm;
import defpackage.q7q;
import defpackage.rdd0;
import defpackage.saj;
import defpackage.sdh;
import defpackage.sn5;
import defpackage.t25;
import defpackage.tdh;
import defpackage.thm;
import defpackage.tje0;
import defpackage.u5y;
import defpackage.ueh;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vgh;
import defpackage.weh;
import defpackage.x1f0;
import defpackage.xeh;
import defpackage.y5b;
import defpackage.ydh;
import defpackage.yrh0;
import defpackage.yy4;
import defpackage.z7z;
import defpackage.zvo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u009a\u0001\u009b\u0001J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 ¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b*\u0010+R\u0017\u00100\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u001b\u0010<\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00105R*\u0010A\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/\"\u0004\b@\u0010\u0007R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010y\u001a\u00020r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010\u0081\u0001\u001a\u00020z8\u0006@\u0006X\u0087.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u0091\u0001\u001a\u00030\u008a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001¨\u0006\u009c\u0001"}, d2 = {"Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedContainer;", "Lcom/sportybet/android/portal/FeaturedView;", "Lxeh;", "", "enabled", "", "setGamesForYouEnabled", "(Z)V", "Libs;", "owner", "setScope", "(Libs;)V", "Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedContainer$b;", "listener", "setActionListener", "(Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedContainer$b;)V", "Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedContainer$c;", "setFeaturedTabSelectionListener", "(Lcom/sportybet/plugin/realsports/home/featuredsection/FeaturedContainer$c;)V", "Lg8z;", "setOutcomeChangeListener", "(Lg8z;)V", "Lfz4;", "actionListener", "setFeaturedCodeActionListener", "(Lfz4;)V", "Lky7;", "setCodeHubImgClickListener", "(Lky7;)V", "Lcom/sportybet/android/widget/ErrorView$a;", "setFeaturedCodeRetryListener", "(Lcom/sportybet/android/widget/ErrorView$a;)V", "Llk50;", "", "Lgz4;", "uiState", "setFeaturedCodesUiState", "(Llk50;)V", "Logh;", "getTabAdapter", "()Logh;", "Lweh;", "getMatchAdapter", "()Lweh;", "H", "Z", "getMatchesOnlyMode", "()Z", "matchesOnlyMode", "", "J", "Lttr;", "getRvPaddingStart", "()I", "rvPaddingStart", "K", "getRvPaddingStartSmall", "rvPaddingStartSmall", "L", "getRvPaddingEnd", "rvPaddingEnd", "value", "b0", "getSwitchToGamesTabWhenReady", "setSwitchToGamesTabWhenReady", "switchToGamesTabWhenReady", "Lmgb0;", "c0", "Lmgb0;", "getAccountStorage", "()Lmgb0;", "setAccountStorage", "(Lmgb0;)V", "accountStorage", "Luqm;", "d0", "Luqm;", "getAccountHelper", "()Luqm;", "setAccountHelper", "(Luqm;)V", "accountHelper", "Lfbh0;", "e0", "Lfbh0;", "getUiRouterManager", "()Lfbh0;", "setUiRouterManager", "(Lfbh0;)V", "uiRouterManager", "Ljlo;", "f0", "Ljlo;", "getInstantWinRouter", "()Ljlo;", "setInstantWinRouter", "(Ljlo;)V", "instantWinRouter", "Lm2l;", "g0", "Lm2l;", "getPreferenceDataStore", "()Lm2l;", "setPreferenceDataStore", "(Lm2l;)V", "preferenceDataStore", "Lpsm;", "h0", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "La8z;", "i0", "La8z;", "getOutcomeBoostResolver", "()La8z;", "setOutcomeBoostResolver", "(La8z;)V", "outcomeBoostResolver", "Lmuh;", "j0", "Lmuh;", "getFlashBoostViewTracker", "()Lmuh;", "setFlashBoostViewTracker", "(Lmuh;)V", "flashBoostViewTracker", "Liym;", "k0", "Liym;", "getOpenTelemetryLogger", "()Liym;", "setOpenTelemetryLogger", "(Liym;)V", "openTelemetryLogger", "Lrdd0;", "l0", "Lrdd0;", "getTrackingUseCase", "()Lrdd0;", "setTrackingUseCase", "(Lrdd0;)V", "trackingUseCase", "La6d;", "m0", "La6d;", "getDedicatedTeamPageLauncher", "()La6d;", "setDedicatedTeamPageLauncher", "(La6d;)V", "dedicatedTeamPageLauncher", "b", "c", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeaturedContainer extends Hilt_FeaturedContainer implements xeh {
    public static final /* synthetic */ int u0 = 0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final boolean matchesOnlyMode;
    public final ydh I;
    public final mpe0 J;
    public final mpe0 K;
    public final mpe0 L;
    public nas M;
    public b N;
    public g8z O;
    public ky7 P;
    public c Q;
    public boolean R;
    public int S;
    public BoostInfo T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean a0;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public boolean switchToGamesTabWhenReady;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public mgb0 accountStorage;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public uqm accountHelper;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public fbh0 uiRouterManager;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public jlo instantWinRouter;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public m2l preferenceDataStore;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public psm countryManager;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public a8z outcomeBoostResolver;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public muh flashBoostViewTracker;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public iym openTelemetryLogger;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public rdd0 trackingUseCase;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public a6d dedicatedTeamPageLauncher;
    public final yy4 n0;
    public com.sportybet.android.instantwin.presentation.buildandgo.f o0;
    public Long p0;
    public Long q0;
    public boolean r0;
    public final kdh s0;
    public final ldh t0;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TabLayout.g gVarK;
            FeaturedContainer featuredContainer = (FeaturedContainer) this.receiver;
            int i = FeaturedContainer.u0;
            ydh ydhVar = featuredContainer.I;
            featuredContainer.q0 = featuredContainer.p0;
            TabLayout tabLayout = ydhVar.e;
            TabLayout.g gVarJ = FeaturedContainer.J(tabLayout, 4);
            if (gVarJ != null) {
                boolean z = gVarJ.e == tabLayout.getSelectedTabPosition();
                tabLayout.p(gVarJ);
                if (z && (gVarK = tabLayout.k(0)) != null) {
                    tabLayout.s(gVarK, true);
                    ViewFlipper viewFlipper = ydhVar.z;
                    Object obj = gVarK.a;
                    if (!(obj instanceof Integer)) {
                        obj = null;
                    }
                    Integer num = (Integer) obj;
                    viewFlipper.setDisplayedChild(num != null ? num.intValue() : 0);
                }
            }
            return Unit.a;
        }
    }

    public interface b {
        void a(Event event);

        void c(Event event);

        default void s(Event event, String str, String str2) {
            event.getClass();
            str2.getClass();
        }
    }

    public interface c {
    }

    public static final class d implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public d(Function1 function1) {
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

    @c0d(c = "com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer$selectGamesTab$1$1", f = "FeaturedContainer.kt", l = {779}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FeaturedContainer b;
        public final /* synthetic */ ydh c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, ydh ydhVar, FeaturedContainer featuredContainer) {
            super(2, v1bVar);
            this.b = featuredContainer;
            this.c = ydhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(v1bVar, this.c, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            final FeaturedContainer featuredContainer = this.b;
            if (i == 0) {
                uj50.b(obj);
                m2l preferenceDataStore = featuredContainer.getPreferenceDataStore();
                Integer num = new Integer(1);
                this.a = 1;
                if (preferenceDataStore.a.putInt("featured_container_selected_tab", num, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            final ydh ydhVar = this.c;
            ydhVar.e.post(new Runnable() { // from class: wdh
                @Override // java.lang.Runnable
                public final void run() {
                    ydh ydhVar2 = ydhVar;
                    TabLayout.g gVarJ = FeaturedContainer.J(ydhVar2.e, 1);
                    if (gVarJ != null) {
                        ydhVar2.e.s(gVarJ, true);
                        Object obj2 = gVarJ.a;
                        ViewFlipper viewFlipper = ydhVar2.z;
                        if (!(obj2 instanceof Integer)) {
                            obj2 = null;
                        }
                        Integer num2 = (Integer) obj2;
                        viewFlipper.setDisplayedChild(num2 != null ? num2.intValue() : 0);
                    }
                    featuredContainer.setSwitchToGamesTabWhenReady(false);
                }
            });
            return Unit.a;
        }
    }

    public static final class f implements ErrorView.a {
        public final /* synthetic */ ErrorView.a a;

        public f(ErrorView.a aVar) {
            this.a = aVar;
        }

        @Override // com.sportybet.android.widget.ErrorView.a
        public final void a() {
            ErrorView.a aVar = this.a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer$updateData$1$8$1", f = "FeaturedContainer.kt", l = {747}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ FeaturedContainer c;
        public final /* synthetic */ ydh d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ Object f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, FeaturedContainer featuredContainer, ydh ydhVar, boolean z2, Object obj, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = featuredContainer;
            this.d = ydhVar;
            this.e = z2;
            this.f = obj;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (this.b) {
                    iIntValue = 3;
                } else {
                    m2l preferenceDataStore = this.c.getPreferenceDataStore();
                    this.a = 1;
                    obj = preferenceDataStore.a.getInt("featured_container_selected_tab", 0, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
                final int i2 = iIntValue;
                final ydh ydhVar = this.d;
                TabLayout tabLayout = ydhVar.e;
                final boolean z = this.e;
                final FeaturedContainer featuredContainer = this.c;
                final Object obj2 = this.f;
                tabLayout.post(new Runnable() { // from class: xdh
                    @Override // java.lang.Runnable
                    public final void run() {
                        TabLayout.g gVarJ;
                        boolean z2 = z;
                        ydh ydhVar2 = ydhVar;
                        FeaturedContainer featuredContainer2 = featuredContainer;
                        if (z2) {
                            gVarJ = ydhVar2.e.k(0);
                        } else {
                            TabLayout tabLayout2 = ydhVar2.e;
                            Integer numValueOf = Integer.valueOf(i2);
                            int i3 = FeaturedContainer.u0;
                            featuredContainer2.getClass();
                            TabLayout.g gVarJ2 = FeaturedContainer.J(tabLayout2, numValueOf);
                            if (gVarJ2 == null) {
                                gVarJ = FeaturedContainer.J(tabLayout2, obj2);
                                if (gVarJ == null) {
                                    gVarJ = tabLayout2.k(0);
                                }
                            } else {
                                gVarJ = gVarJ2;
                            }
                        }
                        featuredContainer2.R = true;
                        if (gVarJ != null) {
                            try {
                                ydhVar2.e.s(gVarJ, true);
                            } catch (Throwable th) {
                                featuredContainer2.R = false;
                                throw th;
                            }
                        }
                        featuredContainer2.R = false;
                        Object obj3 = gVarJ != null ? gVarJ.a : null;
                        Integer num = (Integer) (obj3 instanceof Integer ? obj3 : null);
                        ydhVar2.z.setDisplayedChild(num != null ? num.intValue() : 0);
                    }
                });
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            iIntValue = ((Number) obj).intValue();
            final int i3 = iIntValue;
            final ydh ydhVar2 = this.d;
            TabLayout tabLayout2 = ydhVar2.e;
            final boolean z2 = this.e;
            final FeaturedContainer featuredContainer2 = this.c;
            final Object obj3 = this.f;
            tabLayout2.post(new Runnable() { // from class: xdh
                @Override // java.lang.Runnable
                public final void run() {
                    TabLayout.g gVarJ;
                    boolean z3 = z2;
                    ydh ydhVar3 = ydhVar2;
                    FeaturedContainer featuredContainer3 = featuredContainer2;
                    if (z3) {
                        gVarJ = ydhVar3.e.k(0);
                    } else {
                        TabLayout tabLayout3 = ydhVar3.e;
                        Integer numValueOf = Integer.valueOf(i3);
                        int i4 = FeaturedContainer.u0;
                        featuredContainer3.getClass();
                        TabLayout.g gVarJ2 = FeaturedContainer.J(tabLayout3, numValueOf);
                        if (gVarJ2 == null) {
                            gVarJ = FeaturedContainer.J(tabLayout3, obj3);
                            if (gVarJ == null) {
                                gVarJ = tabLayout3.k(0);
                            }
                        } else {
                            gVarJ = gVarJ2;
                        }
                    }
                    featuredContainer3.R = true;
                    if (gVarJ != null) {
                        try {
                            ydhVar3.e.s(gVarJ, true);
                        } catch (Throwable th) {
                            featuredContainer3.R = false;
                            throw th;
                        }
                    }
                    featuredContainer3.R = false;
                    Object obj4 = gVarJ != null ? gVarJ.a : null;
                    Integer num = (Integer) (obj4 instanceof Integer ? obj4 : null);
                    ydhVar3.z.setDisplayedChild(num != null ? num.intValue() : 0);
                }
            });
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:36:0x01e7 A[PHI: r0
      0x01e7: PHI (r0v2 int) = 
      (r0v1 int)
      (r0v6 int)
      (r0v7 int)
      (r0v8 int)
      (r0v9 int)
      (r0v10 int)
      (r0v11 int)
      (r0v12 int)
      (r0v13 int)
      (r0v14 int)
     binds: [B:3:0x0022, B:5:0x002d, B:7:0x0038, B:9:0x0043, B:11:0x004e, B:13:0x0059, B:15:0x0064, B:17:0x006f, B:19:0x007a, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kdh] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ldh] */
    public FeaturedContainer(Context context, AttributeSet attributeSet, int i, boolean z) throws Throwable {
        Throwable th;
        super(context, attributeSet, i);
        context.getClass();
        this.matchesOnlyMode = z;
        LayoutInflater.from(context).inflate(R.layout.featured_container, this);
        int i2 = R.id.btn_entry;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.btn_entry, this);
        if (appCompatImageView != null) {
            i2 = R.id.featured_code;
            ViewPager2 viewPager2 = (ViewPager2) h5e.a(R.id.featured_code, this);
            if (viewPager2 != null) {
                i2 = R.id.featured_games;
                FeaturedGamesRouter featuredGamesRouter = (FeaturedGamesRouter) h5e.a(R.id.featured_games, this);
                if (featuredGamesRouter != null) {
                    i2 = R.id.featured_lucky_number;
                    LuckyNumberFeatureMatchView luckyNumberFeatureMatchView = (LuckyNumberFeatureMatchView) h5e.a(R.id.featured_lucky_number, this);
                    if (luckyNumberFeatureMatchView != null) {
                        i2 = R.id.featured_tab;
                        TabLayout tabLayout = (TabLayout) h5e.a(R.id.featured_tab, this);
                        if (tabLayout != null) {
                            i2 = R.id.featured_virtual;
                            FeaturedInstantVirtualView featuredInstantVirtualView = (FeaturedInstantVirtualView) h5e.a(R.id.featured_virtual, this);
                            if (featuredInstantVirtualView != null) {
                                i2 = R.id.loading;
                                LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, this);
                                if (loadingView != null) {
                                    i2 = R.id.pager;
                                    ViewPager2 viewPager3 = (ViewPager2) h5e.a(R.id.pager, this);
                                    if (viewPager3 != null) {
                                        i2 = R.id.tabs;
                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.tabs, this);
                                        if (recyclerView != null) {
                                            i2 = R.id.txt_featured_label;
                                            TextView textView = (TextView) h5e.a(R.id.txt_featured_label, this);
                                            if (textView != null) {
                                                i2 = R.id.view_divider;
                                                View viewA = h5e.a(R.id.view_divider, this);
                                                if (viewA != null) {
                                                    i2 = R.id.viewFlipper;
                                                    ViewFlipper viewFlipper = (ViewFlipper) h5e.a(R.id.viewFlipper, this);
                                                    if (viewFlipper != null) {
                                                        final ydh ydhVar = new ydh(this, appCompatImageView, viewPager2, featuredGamesRouter, luckyNumberFeatureMatchView, tabLayout, featuredInstantVirtualView, loadingView, viewPager3, recyclerView, textView, viewA, viewFlipper);
                                                        this.I = ydhVar;
                                                        this.J = hwr.b(new cdh(context, 0));
                                                        this.K = hwr.b(new idh(context, 0));
                                                        this.L = hwr.b(new jdh(context, 0));
                                                        this.S = -1;
                                                        this.a0 = true;
                                                        luckyNumberFeatureMatchView.setOnConfigDisabled(new a(0, this, FeaturedContainer.class, "hideLuckyNumberTab", "hideLuckyNumberTab()V", 0));
                                                        recyclerView.setItemAnimator(null);
                                                        ogh oghVar = new ogh(new ogh.a());
                                                        oghVar.b = new ndh(ydhVar, this);
                                                        recyclerView.setAdapter(oghVar);
                                                        viewPager3.setOffscreenPageLimit(1);
                                                        viewPager3.setAdapter(new weh(this, z));
                                                        viewPager3.c(new sdh(ydhVar, this));
                                                        if (z) {
                                                            tabLayout.setVisibility(8);
                                                            viewA.setVisibility(8);
                                                            textView.setText(sn5.c(this, R.string.wap_setting__hidefeaturedmatches, new Object[0]));
                                                            int iN = N(tabLayout, 1);
                                                            if (iN != -1) {
                                                                tabLayout.q(iN);
                                                            }
                                                            getTrackingUseCase().a(new thm.d(S(z)), k00.d, k00.c);
                                                        } else {
                                                            tabLayout.setVisibility(0);
                                                            tabLayout.setTabMode(0);
                                                            tabLayout.a(new com.sportybet.plugin.realsports.home.featuredsection.b(ydhVar, this));
                                                            featuredGamesRouter.setFeaturedGames(getCountryManager().getCountryCode(), getAccountStorage().getLanguageCode(), this.r0);
                                                            featuredGamesRouter.setGameObserver();
                                                            featuredGamesRouter.getOpenGame().g(new d(new Function1() { // from class: edh
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    String str = (String) obj;
                                                                    int i3 = FeaturedContainer.u0;
                                                                    str.getClass();
                                                                    Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                                                                    builderBuildUpon.appendQueryParameter("source", "featured_games");
                                                                    this.a.getUiRouterManager().d(builderBuildUpon.build(), null, Sender.HOMEPAGE_FEATUREDGAMES_SECTION);
                                                                    return Unit.a;
                                                                }
                                                            }));
                                                            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: odh
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i3 = FeaturedContainer.u0;
                                                                    ydh ydhVar2 = ydhVar;
                                                                    TabLayout tabLayout2 = ydhVar2.e;
                                                                    TabLayout.g gVarK = tabLayout2.k(tabLayout2.getSelectedTabPosition());
                                                                    boolean zG = gVarK != null ? Intrinsics.g(gVarK.a, 2) : false;
                                                                    FeaturedContainer featuredContainer = this;
                                                                    if (!zG) {
                                                                        TabLayout tabLayout3 = ydhVar2.e;
                                                                        TabLayout.g gVarK2 = tabLayout3.k(tabLayout3.getSelectedTabPosition());
                                                                        if (gVarK2 != null ? Intrinsics.g(gVarK2.a, 3) : false) {
                                                                            BuildAndGoHistoryInput buildAndGoHistoryInput = new BuildAndGoHistoryInput(null);
                                                                            jlo instantWinRouter = featuredContainer.getInstantWinRouter();
                                                                            Context context2 = featuredContainer.getContext();
                                                                            context2.getClass();
                                                                            yrh0.s(featuredContainer.getContext(), instantWinRouter.k(context2, buildAndGoHistoryInput), true);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    Bundle bundleA = vj5.a(new Pair("action_load_booking_code_from", "CODEHUB_RECOMMENDED_CODES"));
                                                                    featuredContainer.getOpenTelemetryLogger().d(AnalyticsEvent.CODE_HUB_FEATURED_CODE_CLICKED);
                                                                    ky7 ky7Var = featuredContainer.P;
                                                                    if (ky7Var != null) {
                                                                        wae waeVar = wae.CODE_HUB;
                                                                        dfm dfmVar = (dfm) ((yfc) ky7Var).a;
                                                                        List<String> list = dfm.v2;
                                                                        if (dfmVar.O0()) {
                                                                            return;
                                                                        }
                                                                        dfmVar.N.e(waeVar, bundleA);
                                                                    }
                                                                }
                                                            });
                                                            viewPager2.setOffscreenPageLimit(1);
                                                            yy4 yy4Var = new yy4(null);
                                                            this.n0 = yy4Var;
                                                            viewPager2.setAdapter(yy4Var);
                                                            viewPager2.c(new tdh(ydhVar, this));
                                                            featuredGamesRouter.a.g(new d(new Function1() { // from class: pdh
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj) {
                                                                    int i3;
                                                                    Boolean bool = (Boolean) obj;
                                                                    int i4 = FeaturedContainer.u0;
                                                                    ydh ydhVar2 = ydhVar;
                                                                    TabLayout tabLayout2 = ydhVar2.e;
                                                                    int iN2 = FeaturedContainer.N(tabLayout2, 1);
                                                                    if (iN2 != -1) {
                                                                        tabLayout2.q(iN2);
                                                                    }
                                                                    boolean zBooleanValue = bool.booleanValue();
                                                                    FeaturedContainer featuredContainer = this;
                                                                    if (zBooleanValue) {
                                                                        int tabCount = tabLayout2.getTabCount();
                                                                        int i5 = 0;
                                                                        while (true) {
                                                                            if (i5 >= tabCount) {
                                                                                TabLayout.g gVarL = tabLayout2.l();
                                                                                gVarL.a = 1;
                                                                                gVarL.c(featuredContainer.P(sn5.c(featuredContainer, R.string.common_functions__games, new Object[0]), false, false));
                                                                                int iN3 = FeaturedContainer.N(tabLayout2, 3);
                                                                                int iN4 = FeaturedContainer.N(tabLayout2, 0);
                                                                                if (iN3 == 0 && iN4 >= 0) {
                                                                                    i3 = 2;
                                                                                } else if ((iN3 == 0 && iN4 == -1) || iN4 == 0) {
                                                                                    i3 = 1;
                                                                                } else {
                                                                                    i3 = iN4 == -1 ? 0 : iN4 + 1;
                                                                                }
                                                                                tabLayout2.c(gVarL, f.e(i3, 0, tabLayout2.getTabCount()), false);
                                                                                featuredContainer.V = true;
                                                                                featuredContainer.setVisibility(0);
                                                                                featuredContainer.W = true;
                                                                                if (!featuredContainer.switchToGamesTabWhenReady) {
                                                                                    break;
                                                                                }
                                                                                featuredContainer.R();
                                                                                break;
                                                                            }
                                                                            TabLayout.g gVarK = tabLayout2.k(i5);
                                                                            if (Intrinsics.g(gVarK != null ? gVarK.a : null, 1)) {
                                                                                break;
                                                                            }
                                                                            i5++;
                                                                        }
                                                                    }
                                                                    nas nasVar = featuredContainer.M;
                                                                    if (nasVar != null) {
                                                                        pfd pfdVar = fse.a;
                                                                        ej5.c(nasVar, gku.a, null, new vdh(null, ydhVar2, featuredContainer), 2);
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }));
                                                        }
                                                        this.s0 = new lit() { // from class: kdh
                                                            @Override // defpackage.lit
                                                            public final void onLogin() {
                                                                final FeaturedContainer featuredContainer = this.a;
                                                                featuredContainer.I.a.post(new Runnable() { // from class: qdh
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        FeaturedContainer featuredContainer2 = featuredContainer;
                                                                        featuredContainer2.I.d.setFeaturedGames(featuredContainer2.getCountryManager().getCountryCode(), featuredContainer2.getAccountStorage().getLanguageCode(), featuredContainer2.r0);
                                                                    }
                                                                });
                                                            }
                                                        };
                                                        this.t0 = new fjt() { // from class: ldh
                                                            @Override // defpackage.fjt
                                                            public final void p() {
                                                                final FeaturedContainer featuredContainer = this.a;
                                                                featuredContainer.I.a.post(new Runnable() { // from class: mdh
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        FeaturedContainer featuredContainer2 = featuredContainer;
                                                                        featuredContainer2.I.d.setFeaturedGames(featuredContainer2.getCountryManager().getCountryCode(), featuredContainer2.getAccountStorage().getLanguageCode(), featuredContainer2.r0);
                                                                    }
                                                                });
                                                            }
                                                        };
                                                        return;
                                                    }
                                                }
                                                th = null;
                                            } else {
                                                th = null;
                                            }
                                        } else {
                                            th = null;
                                        }
                                    } else {
                                        th = null;
                                    }
                                } else {
                                    th = null;
                                }
                            } else {
                                th = null;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
            } else {
                th = null;
            }
        } else {
            th = null;
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw th;
    }

    public static TabLayout.g J(TabLayout tabLayout, Object obj) {
        Object obj2;
        int i = 0;
        IntRange intRangeN = kotlin.ranges.f.n(0, tabLayout.getTabCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeN.iterator();
        while (((mwo) it).c) {
            TabLayout.g gVarK = tabLayout.k(((zvo) it).nextInt());
            if (gVarK != null) {
                arrayList.add(gVarK);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            obj2 = arrayList.get(i);
            i++;
            if (Intrinsics.g(((TabLayout.g) obj2).a, obj)) {
                return (TabLayout.g) obj2;
            }
        }
        obj2 = null;
        return (TabLayout.g) obj2;
    }

    public static int N(TabLayout tabLayout, Integer num) {
        Object obj;
        Iterator<Integer> it = kotlin.ranges.f.n(0, tabLayout.getTabCount()).iterator();
        while (true) {
            obj = null;
            if (!((mwo) it).c) {
                break;
            }
            Object next = ((zvo) it).next();
            TabLayout.g gVarK = tabLayout.k(((Number) next).intValue());
            if (Intrinsics.g(gVarK != null ? gVarK.a : null, num)) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            return num2.intValue();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    public static final void O(FeaturedContainer featuredContainer, ydh ydhVar, String str) {
        String name;
        Collection collection;
        Collection collection2;
        Object next;
        rdd0 trackingUseCase = featuredContainer.getTrackingUseCase();
        thm.k kVarS = S(featuredContainer.matchesOnlyMode);
        ogh tabAdapter = featuredContainer.getTabAdapter();
        if (tabAdapter == null || (collection2 = tabAdapter.a.f) == null) {
            name = null;
        } else {
            Iterator it = collection2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((FeaturedTab) next).getId(), str));
            FeaturedTab featuredTab = (FeaturedTab) next;
            if (featuredTab != null) {
                name = featuredTab.getName();
            } else {
                name = null;
            }
        }
        if (name == null) {
            name = "";
        }
        trackingUseCase.a(new thm.c(kVarS, str, name), k00.d, k00.c);
        featuredContainer.U(str);
        weh matchAdapter = featuredContainer.getMatchAdapter();
        int iIntValue = 0;
        if (matchAdapter != null && (collection = matchAdapter.a.f) != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                Integer numValueOf = Intrinsics.g(((FeaturedMatch) obj).getId(), str) ? Integer.valueOf(i) : null;
                if (numValueOf != null) {
                    arrayList.add(numValueOf);
                }
                i = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                if (((Number) obj2).intValue() != 0) {
                    arrayList2.add(obj2);
                }
            }
            Integer num = (Integer) CollectionsKt.firstOrNull(arrayList2);
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        featuredContainer.S = iIntValue;
        ydhVar.v.setCurrentItem(iIntValue, true);
    }

    public static thm.k S(boolean z) {
        if (z) {
            return thm.k.CASINO;
        }
        if (!z) {
            return thm.k.SPORT;
        }
        uhc.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final weh getMatchAdapter() {
        RecyclerView.f adapter = this.I.v.getAdapter();
        if (!(adapter instanceof weh)) {
            adapter = null;
        }
        return (weh) adapter;
    }

    private final int getRvPaddingEnd() {
        return ((Number) this.L.getValue()).intValue();
    }

    private final int getRvPaddingStart() {
        return ((Number) this.J.getValue()).intValue();
    }

    private final int getRvPaddingStartSmall() {
        return ((Number) this.K.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ogh getTabAdapter() {
        RecyclerView.f adapter = this.I.w.getAdapter();
        if (!(adapter instanceof ogh)) {
            adapter = null;
        }
        return (ogh) adapter;
    }

    public final int G() {
        int i = this.U;
        if (i < 1) {
            i = 1;
        }
        if (i == 1) {
            return 1;
        }
        int currentItem = (this.I.v.getCurrentItem() - 1) % i;
        return currentItem + (i & (((currentItem ^ i) & ((-currentItem) | currentItem)) >> 31)) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2 A[SYNTHETIC] */
    public final void H(ArrayList arrayList) {
        ArrayList arrayList2;
        int size;
        int i;
        int i2;
        Object obj;
        int i3;
        boolean z;
        ogh tabAdapter = getTabAdapter();
        if (tabAdapter != null) {
            ArrayList arrayList3 = new ArrayList(l48.r(arrayList, 10));
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                arrayList3.add(((FeaturedMatch) obj2).getId());
            }
            List<T> list = tabAdapter.a.f;
            ArrayList arrayListA = kw5.a(list);
            for (Object obj3 : list) {
                if (arrayList3.contains(((FeaturedTab) obj3).getId())) {
                    arrayListA.add(obj3);
                }
            }
            if (arrayListA.isEmpty()) {
                arrayList2 = new ArrayList(l48.r(arrayListA, 10));
                size = arrayListA.size();
                i = 0;
                i2 = 0;
                while (i2 < size) {
                    obj = arrayListA.get(i2);
                    i2++;
                    i3 = i + 1;
                    if (i >= 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    FeaturedTab featuredTab = (FeaturedTab) obj;
                    featuredTab.getClass();
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(FeaturedTab.copy$default(featuredTab, null, null, null, z, 7, null));
                    i = i3;
                }
                arrayListA = arrayList2;
            } else {
                int size3 = arrayListA.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj4 = arrayListA.get(i5);
                    i5++;
                    if (((FeaturedTab) obj4).isSelected()) {
                    }
                }
                arrayList2 = new ArrayList(l48.r(arrayListA, 10));
                size = arrayListA.size();
                i = 0;
                i2 = 0;
                while (i2 < size) {
                    obj = arrayListA.get(i2);
                    i2++;
                    i3 = i + 1;
                    if (i >= 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    FeaturedTab featuredTab2 = (FeaturedTab) obj;
                    featuredTab2.getClass();
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(FeaturedTab.copy$default(featuredTab2, null, null, null, z, 7, null));
                    i = i3;
                }
                arrayListA = arrayList2;
            }
            tabAdapter.i(arrayListA);
        }
    }

    public final FeaturedMatch I(String str) {
        Collection collection;
        weh matchAdapter = getMatchAdapter();
        Object obj = null;
        if (matchAdapter == null || (collection = matchAdapter.a.f) == null) {
            return null;
        }
        for (Object obj2 : collection) {
            if (Intrinsics.g(((FeaturedMatch) obj2).getEvent().eventId, str)) {
                obj = obj2;
                break;
            }
        }
        return (FeaturedMatch) obj;
    }

    public final void K(FeaturedMatch featuredMatch) {
        Category category;
        Tournament tournament;
        rdd0 trackingUseCase = getTrackingUseCase();
        thm.k kVarS = S(this.matchesOnlyMode);
        Sport sport = featuredMatch.getEvent().sport;
        String str = (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.name;
        if (str == null) {
            str = "";
        }
        Market market = featuredMatch.getMarket();
        market.getClass();
        trackingUseCase.a(new thm.e(kVarS, str, u5y.d(market) ? "PCBB" : featuredMatch.getMarketDescMain(), G(), this.U), k00.d, k00.c);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L(SocketEventMessage socketEventMessage) {
        Object next;
        Market market;
        List list;
        String strO0;
        List listSplit$default;
        weh matchAdapter = getMatchAdapter();
        if (matchAdapter == null) {
            return;
        }
        androidx.recyclerview.widget.d<T> dVar = matchAdapter.a;
        if (socketEventMessage.eventStatus == 3) {
            Q(socketEventMessage.eventId);
            return;
        }
        Collection collection = dVar.f;
        collection.getClass();
        Iterator it = collection.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((FeaturedMatch) next).getEvent().eventId, socketEventMessage.eventId));
        FeaturedMatch featuredMatch = (FeaturedMatch) next;
        int i = 0;
        if (featuredMatch == null || (market = featuredMatch.getMarket()) == null || !u5y.d(market) || socketEventMessage.eventStatus == 0) {
            BoostInfo boostInfo = this.T;
            BoostResult boostResultA = boostInfo != null ? t25.a(boostInfo) : null;
            List<T> list2 = dVar.f;
            ArrayList arrayListA = kw5.a(list2);
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                Integer numValueOf = Integer.valueOf(i2);
                if (!Intrinsics.g(((FeaturedMatch) obj).getEvent().eventId, socketEventMessage.eventId)) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    arrayListA.add(numValueOf);
                }
                i2 = i3;
            }
            int size = arrayListA.size();
            while (i < size) {
                Object obj2 = arrayListA.get(i);
                i++;
                int iIntValue = ((Number) obj2).intValue();
                FeaturedMatch featuredMatch2 = (FeaturedMatch) dVar.f.get(iIntValue);
                featuredMatch2.getEvent().update(socketEventMessage.jsonObject);
                if (boostResultA != null) {
                    featuredMatch2.setShowBoost(t25.b(featuredMatch2.getEvent(), boostResultA));
                }
                matchAdapter.notifyItemChanged(iIntValue);
            }
            return;
        }
        Market pcbbReplacementMarket = featuredMatch.getPcbbReplacementMarket();
        if (pcbbReplacementMarket == null) {
            Q(socketEventMessage.eventId);
            return;
        }
        weh matchAdapter2 = getMatchAdapter();
        if (matchAdapter2 == null) {
            return;
        }
        String str = featuredMatch.getMarket().id;
        String str2 = pcbbReplacementMarket.title;
        if (str2 == null) {
            str2 = "";
        }
        if (StringsKt.U(str2)) {
            str2 = null;
        }
        if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{","}, false, 0, 6, null)) == null) {
            List<Outcome> list3 = pcbbReplacementMarket.outcomes;
            ArrayList arrayListA2 = kw5.a(list3);
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                String str3 = ((Outcome) it2.next()).desc;
                if (str3 != null) {
                    strO0 = StringsKt.o0(str3, " ");
                    if (StringsKt.U(strO0)) {
                        strO0 = null;
                    }
                } else {
                    strO0 = null;
                }
                if (strO0 != null) {
                    arrayListA2.add(strO0);
                }
            }
            list = arrayListA2;
        } else {
            list = listSplit$default;
        }
        String str4 = pcbbReplacementMarket.desc;
        Pair pairA = ueh.a(str4 != null ? str4 : "", pcbbReplacementMarket.specifier);
        FeaturedMatch featuredMatchCopy$default = FeaturedMatch.copy$default(featuredMatch, null, null, pcbbReplacementMarket, list, (String) pairA.a, (String) pairA.b, false, false, false, null, 451, null);
        final ydh ydhVar = this.I;
        final int currentItem = ydhVar.v.getCurrentItem();
        List list4 = matchAdapter2.a.f;
        int size2 = list4.size();
        List<FeaturedMatch> listP = list4;
        if (size2 > 1) {
            listP = CollectionsKt.P(CollectionsKt.O(list4, 1));
        }
        final ArrayList arrayList = new ArrayList(l48.r(listP, 10));
        for (FeaturedMatch featuredMatch3 : listP) {
            if (Intrinsics.g(featuredMatch3.getEvent().eventId, featuredMatch.getEvent().eventId)) {
                featuredMatch3 = featuredMatchCopy$default;
            }
            arrayList.add(featuredMatch3);
        }
        if (arrayList.size() > 1) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            FeaturedMatch featuredMatch4 = (FeaturedMatch) CollectionsKt.T(arrayList2);
            FeaturedMatch featuredMatch5 = (FeaturedMatch) CollectionsKt.b0(arrayList2);
            arrayList2.add(featuredMatch4);
            arrayList2.add(0, featuredMatch5);
            arrayList = arrayList2;
        }
        matchAdapter2.j(arrayList, new Runnable() { // from class: fdh
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = FeaturedContainer.u0;
                final ydh ydhVar2 = ydhVar;
                ViewPager2 viewPager2 = ydhVar2.v;
                final int i5 = currentItem;
                final ArrayList arrayList3 = arrayList;
                viewPager2.post(new Runnable() { // from class: hdh
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = FeaturedContainer.u0;
                        int i7 = i5;
                        if (i7 < 0 || i7 >= arrayList3.size()) {
                            return;
                        }
                        ydh ydhVar3 = ydhVar2;
                        if (ydhVar3.v.getCurrentItem() != i7) {
                            ydhVar3.v.setCurrentItem(i7, false);
                        }
                    }
                });
            }
        });
        b bVar = this.N;
        if (bVar != null) {
            Event event = featuredMatch.getEvent();
            str.getClass();
            String str5 = pcbbReplacementMarket.id;
            str5.getClass();
            bVar.s(event, str, str5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(SocketMarketMessage socketMarketMessage) {
        Object next;
        Object next2;
        Object next3;
        int i;
        weh matchAdapter = getMatchAdapter();
        if (matchAdapter == null) {
            return;
        }
        androidx.recyclerview.widget.d<T> dVar = matchAdapter.a;
        List<T> list = dVar.f;
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                int size = arrayListA.size();
                while (i2 < size) {
                    Object obj = arrayListA.get(i2);
                    i2++;
                    int iIntValue = ((Number) obj).intValue();
                    FeaturedMatch featuredMatch = (FeaturedMatch) dVar.f.get(iIntValue);
                    if (Intrinsics.g(socketMarketMessage.marketSpecifier, "~")) {
                        featuredMatch.getMarket().update(socketMarketMessage.jsonArray);
                    } else {
                        List<Market> list2 = featuredMatch.getEvent().markets;
                        list2.getClass();
                        Iterator<T> it2 = list2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!Intrinsics.g(((Market) next).specifier, socketMarketMessage.marketSpecifier));
                        Market market = (Market) next;
                        if (market != null) {
                            market.update(socketMarketMessage.jsonArray);
                        }
                        List<Market> list3 = featuredMatch.getEvent().markets;
                        list3.getClass();
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            Market market2 = (Market) next2;
                            if (market2.isFavorite() && ((i = market2.status) == 0 || i == 1)) {
                                List<Outcome> list4 = market2.outcomes;
                                list4.getClass();
                                if (!list4.isEmpty()) {
                                    break;
                                }
                            }
                        }
                        Market market3 = (Market) next2;
                        if (market3 == null) {
                            List<Market> list5 = featuredMatch.getEvent().markets;
                            list5.getClass();
                            Iterator<T> it4 = list5.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it4.next();
                                Market market4 = (Market) next3;
                                int i4 = market4.status;
                                if (i4 == 0 || i4 == 1) {
                                    List<Outcome> list6 = market4.outcomes;
                                    list6.getClass();
                                    if (!list6.isEmpty()) {
                                        break;
                                    }
                                }
                            }
                            market3 = (Market) next3;
                            if (market3 == null) {
                                List<Market> list7 = featuredMatch.getEvent().markets;
                                list7.getClass();
                                market3 = (Market) CollectionsKt.firstOrNull(list7);
                                if (market3 == null) {
                                    market3 = new Market();
                                }
                            }
                        }
                        featuredMatch.setMarket(market3);
                        String str = featuredMatch.getMarket().desc;
                        if (str != null) {
                            Pair pairA = ueh.a(str, featuredMatch.getMarket().specifier);
                            String str2 = (String) pairA.a;
                            String str3 = (String) pairA.b;
                            featuredMatch.setMarketDescMain(str2);
                            featuredMatch.setMarketDescSub(str3);
                        }
                    }
                    matchAdapter.notifyItemChanged(iIntValue);
                }
                return;
            }
            Object next4 = it.next();
            int i5 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            FeaturedMatch featuredMatch2 = (FeaturedMatch) next4;
            Integer numValueOf = Integer.valueOf(i3);
            if (Intrinsics.g(featuredMatch2.getEvent().eventId, socketMarketMessage.eventId) && Intrinsics.g(featuredMatch2.getMarket().id, socketMarketMessage.marketId)) {
                num = numValueOf;
            }
            if (num != null) {
                arrayListA.add(num);
            }
            i3 = i5;
        }
    }

    public final View P(String str, boolean z, boolean z2) {
        int i;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.iwqk_virtual_feature_tab_item, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.feature_title);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.new_feature_flag);
        textView.setText(str);
        if (z && isSelected()) {
            i = R.color.virtual_build_and_go;
        } else {
            i = (z || !isSelected()) ? R.color.text_type1_primary : R.color.brand_quinary;
        }
        textView.setTextColor(getContext().getColor(i));
        textView.setTextAppearance(getContext(), isSelected() ? R.style.B1_B : R.style.B1_R);
        textView.setTypeface(isSelected() ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        imageView.getClass();
        imageView.setVisibility(z2 ? 0 : 8);
        return viewInflate;
    }

    public final void Q(String str) {
        ogh tabAdapter;
        List listP;
        weh matchAdapter = getMatchAdapter();
        if (matchAdapter == null || (tabAdapter = getTabAdapter()) == null) {
            return;
        }
        List list = matchAdapter.a.f;
        if (list.size() > 1) {
            listP = list;
            listP = CollectionsKt.P(CollectionsKt.O(list, 1));
        }
        listP = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (!Intrinsics.g(((FeaturedMatch) obj).getEvent().eventId, str)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        ydh ydhVar = this.I;
        if (size != 0) {
            if (size == 1) {
                H(arrayList);
                matchAdapter.i(arrayList);
                b9i0.a(ydhVar.v, false, getRvPaddingStart(), getRvPaddingStartSmall(), getRvPaddingEnd());
                return;
            }
            H(arrayList);
            ArrayList arrayList2 = new ArrayList(arrayList);
            FeaturedMatch featuredMatch = (FeaturedMatch) CollectionsKt.T(arrayList2);
            FeaturedMatch featuredMatch2 = (FeaturedMatch) CollectionsKt.b0(arrayList2);
            arrayList2.add(featuredMatch);
            arrayList2.add(0, featuredMatch2);
            matchAdapter.i(arrayList2);
            return;
        }
        Object obj2 = null;
        tabAdapter.i(null);
        matchAdapter.i(null);
        ArrayList arrayListA = x1f0.a(ydhVar.e);
        int size2 = arrayListA.size();
        int i = 0;
        while (i < size2) {
            Object obj3 = arrayListA.get(i);
            i++;
            if (Intrinsics.g(((TabLayout.g) obj3).a, 0)) {
                obj2 = obj3;
                break;
            }
        }
        TabLayout.g gVar = (TabLayout.g) obj2;
        if (gVar != null) {
            ydhVar.e.p(gVar);
        }
    }

    public final void R() {
        nas nasVar = this.M;
        if (nasVar != null) {
            ej5.c(nasVar, null, null, new e(null, this.I, this), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0210  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final void T(FeaturedDisplayData featuredDisplayData, com.sportybet.android.instantwin.presentation.buildandgo.f fVar, boolean z) {
        int i;
        int i2;
        TabLayout.g gVarL;
        int i3;
        TabLayout.g gVarK;
        q7q.b luckyNumberData = featuredDisplayData.getLuckyNumberData();
        Long lValueOf = luckyNumberData != null ? Long.valueOf(luckyNumberData.a) : null;
        if (!Intrinsics.g(this.p0, lValueOf)) {
            this.q0 = null;
        }
        this.p0 = lValueOf;
        Object[] objArr = (featuredDisplayData.getLuckyNumberData() == null || Intrinsics.g(this.q0, lValueOf)) ? false : true;
        final ydh ydhVar = this.I;
        TabLayout tabLayout = ydhVar.e;
        FeaturedInstantVirtualView featuredInstantVirtualView = ydhVar.f;
        ViewFlipper viewFlipper = ydhVar.z;
        TabLayout.g gVarK2 = tabLayout.k(tabLayout.getSelectedTabPosition());
        Object obj = gVarK2 != null ? gVarK2.a : null;
        boolean z2 = Intrinsics.g(obj, 4) && !objArr == true;
        if (z2) {
            viewFlipper.setDisplayedChild(0);
        }
        this.a0 = !z;
        tabLayout.n();
        this.W = false;
        ydhVar.d.setFeaturedGames(getCountryManager().getCountryCode(), getAccountStorage().getLanguageCode(), this.r0);
        ArrayList arrayList = new ArrayList();
        lk50<FeaturedMatchData> featuredMatches = featuredDisplayData.getFeaturedMatches();
        Object[] objArr2 = (featuredDisplayData.getFeaturedCodeConfig() instanceof lk50.c) && ((Boolean) ((lk50.c) featuredDisplayData.getFeaturedCodeConfig()).a).booleanValue();
        vgh featuredVirtual = featuredDisplayData.getFeaturedVirtual();
        if (featuredMatches instanceof lk50.c) {
            FeaturedMatchData featuredMatchData = (FeaturedMatchData) ((lk50.c) featuredMatches).a;
            if (featuredMatchData.getShowFeatured()) {
                i = 2;
                this.S = -1;
                List<FeaturedTab> featuredTabs = featuredMatchData.getFeaturedTabs();
                ogh tabAdapter = getTabAdapter();
                if (tabAdapter != null) {
                    tabAdapter.i(featuredTabs);
                }
                final List<FeaturedMatch> featuredMatches2 = featuredMatchData.getFeaturedMatches();
                this.U = featuredMatches2.size() > 1 ? featuredMatches2.size() - 2 : featuredMatches2.size();
                weh matchAdapter = getMatchAdapter();
                if (matchAdapter != null) {
                    matchAdapter.j(featuredMatches2, new Runnable() { // from class: gdh
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = FeaturedContainer.u0;
                            List list = featuredMatches2;
                            if (list.size() > 1) {
                                ydhVar.v.setCurrentItem(1, false);
                                this.U(((FeaturedMatch) list.get(1)).getId());
                            }
                        }
                    });
                    Unit unit = Unit.a;
                }
                b9i0.a(ydhVar.v, featuredMatchData.getFeaturedMatches().size() > 1, getRvPaddingStart(), getRvPaddingStartSmall(), getRvPaddingEnd());
                this.T = featuredMatchData.getBoostInfo();
                TabLayout.g gVarL2 = tabLayout.l();
                gVarL2.a = 0;
                gVarL2.c(P(sn5.c(this, R.string.common_functions__matches, new Object[0]), false, false));
                arrayList.add(gVarL2);
                setVisibility(0);
            } else {
                i = 2;
                setVisibility(8);
            }
        } else {
            i = 2;
            setVisibility(8);
        }
        boolean z3 = this.V;
        boolean z4 = this.matchesOnlyMode;
        if (!z3 || z4) {
            i2 = 0;
        } else {
            TabLayout.g gVarL3 = tabLayout.l();
            gVarL3.a = 1;
            i2 = 0;
            i2 = 0;
            gVarL3.c(P(sn5.c(this, R.string.common_functions__games, new Object[0]), false, false));
            arrayList.add(gVarL3);
            if (getVisibility() != 0) {
                setVisibility(0);
            }
        }
        if (objArr2 != false && !z4) {
            TabLayout.g gVarL4 = tabLayout.l();
            gVarL4.a = Integer.valueOf(i);
            gVarL4.c(P(sn5.c(this, R.string.common_functions__codes, new Object[i2]), i2, i2));
            arrayList.add(gVarL4);
            if (getVisibility() != 0) {
                setVisibility(i2);
            }
        }
        if (z4 || featuredVirtual == null) {
            gVarL = null;
        } else {
            lk50<Round> lk50Var = featuredVirtual.b;
            lk50<Sports> lk50Var2 = featuredVirtual.a;
            if ((lk50Var2 instanceof lk50.c) && (lk50Var instanceof lk50.c)) {
                Sports sports = (Sports) ((lk50.c) lk50Var2).a;
                Round round = (Round) ((lk50.c) lk50Var).a;
                if (sports == null || !sports.getActive()) {
                    gVarL = null;
                } else {
                    gVarL = tabLayout.l();
                    gVarL.a = 3;
                    gVarL.c(P(sn5.c(this, R.string.common_functions__virtuals, new Object[0]), true, fVar != null ? fVar.z1() : false));
                    this.o0 = fVar;
                    featuredInstantVirtualView.setBuildAndGoViewModel(fVar);
                    featuredInstantVirtualView.setData(sports, round);
                    if (getVisibility() != 0) {
                        setVisibility(0);
                    }
                }
            } else {
                gVarL = null;
            }
        }
        if (gVarL == null) {
            i3 = 0;
        } else if (featuredDisplayData.getUpdateBngTabPosition()) {
            i3 = 0;
            arrayList.add(0, gVarL);
        } else {
            i3 = 0;
            arrayList.add(gVarL);
        }
        if (objArr != false && !z4) {
            TabLayout.g gVarL5 = tabLayout.l();
            gVarL5.a = 4;
            gVarL5.c(P(sn5.c(this, R.string.page_lucky_numbers__lucky_numbers, new Object[i3]), i3, i3));
            arrayList.add(gVarL5);
            if (getVisibility() != 0) {
                setVisibility(i3);
            }
        }
        if (z4) {
            return;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            TabLayout.g gVar = (TabLayout.g) obj2;
            tabLayout.d(gVar, false);
            if (Intrinsics.g(gVar.a, 1)) {
                this.W = true;
                if (this.switchToGamesTabWhenReady) {
                    R();
                }
            }
        }
        if (z2 && (gVarK = tabLayout.k(0)) != null) {
            tabLayout.s(gVarK, true);
            Object obj3 = gVarK.a;
            if (!(obj3 instanceof Integer)) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            viewFlipper.setDisplayedChild(num != null ? num.intValue() : 0);
        }
        nas nasVar = this.M;
        if (nasVar != null) {
            pfd pfdVar = fse.a;
            ej5.c(nasVar, gku.a, null, new g(z, this, ydhVar, z2, obj, null), i);
        }
    }

    public final void U(final String str) {
        final ogh tabAdapter = getTabAdapter();
        if (tabAdapter != null) {
            Collection<FeaturedTab> collection = tabAdapter.a.f;
            collection.getClass();
            ArrayList arrayList = new ArrayList(l48.r(collection, 10));
            for (FeaturedTab featuredTab : collection) {
                featuredTab.getClass();
                arrayList.add(FeaturedTab.copy$default(featuredTab, null, null, null, Intrinsics.g(featuredTab.getId(), str), 7, null));
            }
            tabAdapter.j(arrayList, new Runnable() { // from class: ddh
                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerView.o layoutManager;
                    ydh ydhVar = this.I;
                    int i = FeaturedContainer.u0;
                    List<T> list = tabAdapter.a.f;
                    list.getClass();
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (Intrinsics.g(((FeaturedTab) it.next()).getId(), str)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 == -1 || (layoutManager = ydhVar.w.getLayoutManager()) == null) {
                        return;
                    }
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        layoutManager = null;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.w1(i2, ydhVar.w.getWidth() / 2);
                    }
                }
            });
        }
    }

    public final void V(TabLayout.g gVar, boolean z) {
        View view;
        int i;
        com.sportybet.android.instantwin.presentation.buildandgo.f fVar;
        if (gVar == null || (view = gVar.f) == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.feature_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.new_feature_flag);
        boolean zG = Intrinsics.g(gVar.a, 3);
        if (zG && z) {
            i = R.color.virtual_build_and_go;
        } else {
            i = (zG || !z) ? R.color.text_type1_primary : R.color.brand_quinary;
        }
        textView.setTextColor(view.getContext().getColor(i));
        textView.setTextAppearance(view.getContext(), z ? R.style.B1_B : R.style.B1_R);
        textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
        imageView.getClass();
        imageView.setVisibility((!z && zG && (fVar = this.o0) != null && fVar.z1()) ? 0 : 8);
    }

    @Override // defpackage.xeh
    public final void a(Event event) {
        getTrackingUseCase().a(new thm.g(S(this.matchesOnlyMode)), k00.d, k00.c);
        b bVar = this.N;
        if (bVar != null) {
            bVar.a(event);
        }
    }

    @Override // defpackage.xeh
    public final void c(Event event) {
        b bVar = this.N;
        if (bVar != null) {
            bVar.c(event);
        }
    }

    @Override // defpackage.xeh
    public final void d(Selection selection, boolean z) {
        FeaturedMatch featuredMatchI;
        g8z g8zVar = this.O;
        if (g8zVar != null) {
            g8zVar.a(selection, z, e8z.d);
        }
        if (!z || (featuredMatchI = I(selection.a.eventId)) == null) {
            return;
        }
        K(featuredMatchI);
    }

    @Override // defpackage.xeh
    public final void f(Event event, Market market, z7z z7zVar) {
        z7zVar.getClass();
        if (z7zVar instanceof z7z.b) {
            getFlashBoostViewTracker().a(apg.b(event, market), brg.FEATURED_MATCH);
        }
    }

    @Override // defpackage.xeh
    public final z7z g(Event event, Market market, Outcome outcome) {
        return getOutcomeBoostResolver().a(event, market, outcome);
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.accountHelper;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    public final mgb0 getAccountStorage() {
        mgb0 mgb0Var = this.accountStorage;
        if (mgb0Var != null) {
            return mgb0Var;
        }
        Intrinsics.n("accountStorage");
        throw null;
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    public final a6d getDedicatedTeamPageLauncher() {
        a6d a6dVar = this.dedicatedTeamPageLauncher;
        if (a6dVar != null) {
            return a6dVar;
        }
        Intrinsics.n("dedicatedTeamPageLauncher");
        throw null;
    }

    public final muh getFlashBoostViewTracker() {
        muh muhVar = this.flashBoostViewTracker;
        if (muhVar != null) {
            return muhVar;
        }
        Intrinsics.n("flashBoostViewTracker");
        throw null;
    }

    public final jlo getInstantWinRouter() {
        jlo jloVar = this.instantWinRouter;
        if (jloVar != null) {
            return jloVar;
        }
        Intrinsics.n("instantWinRouter");
        throw null;
    }

    public final boolean getMatchesOnlyMode() {
        return this.matchesOnlyMode;
    }

    public final iym getOpenTelemetryLogger() {
        iym iymVar = this.openTelemetryLogger;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final a8z getOutcomeBoostResolver() {
        a8z a8zVar = this.outcomeBoostResolver;
        if (a8zVar != null) {
            return a8zVar;
        }
        Intrinsics.n("outcomeBoostResolver");
        throw null;
    }

    public final m2l getPreferenceDataStore() {
        m2l m2lVar = this.preferenceDataStore;
        if (m2lVar != null) {
            return m2lVar;
        }
        Intrinsics.n("preferenceDataStore");
        throw null;
    }

    public final boolean getSwitchToGamesTabWhenReady() {
        return this.switchToGamesTabWhenReady;
    }

    public final rdd0 getTrackingUseCase() {
        rdd0 rdd0Var = this.trackingUseCase;
        if (rdd0Var != null) {
            return rdd0Var;
        }
        Intrinsics.n("trackingUseCase");
        throw null;
    }

    public final fbh0 getUiRouterManager() {
        fbh0 fbh0Var = this.uiRouterManager;
        if (fbh0Var != null) {
            return fbh0Var;
        }
        Intrinsics.n("uiRouterManager");
        throw null;
    }

    @Override // defpackage.xeh
    public final void i(FeaturedMatch featuredMatch) {
        K(featuredMatch);
    }

    @Override // defpackage.xeh
    public final void l(Event event) {
        getTrackingUseCase().a(new thm.f(S(this.matchesOnlyMode)), k00.d, k00.c);
        Context context = getContext();
        Intent intent = new Intent(getContext(), (Class<?>) PreMatchSportActivity.class);
        intent.putStringArrayListExtra("key_tournament_ids", kotlin.collections.b.f(event.sport.category.tournament.id));
        intent.putExtra("key_tournament_name", event.sport.category.tournament.name);
        intent.putExtra("key_sport_id", event.sport.id);
        intent.putExtra("key_sport_time", 0L);
        yrh0.s(context, intent, true);
    }

    @Override // defpackage.xeh
    public final void m(Event event, com.sportybet.plugin.realsports.home.featuredsection.a aVar) {
        Category category;
        Tournament tournament;
        Intent intent = new Intent();
        if (event.status == 0) {
            Context context = getContext();
            intent.putExtra("EXTRA_EVENT", apg.f(event));
            lgb0[] lgb0VarArr = lgb0.a;
            intent.putExtra("EXTRA_AI_SOURCE", 1);
            intent.setClass(getContext(), PreMatchEventActivity.class);
            yrh0.s(context, intent, true);
        } else {
            int i = EventActivity.U0;
            Context context2 = getContext();
            context2.getClass();
            intent.putExtra("EXTRA_EVENT", apg.f(event));
            intent.putExtra("EXTRA_SOURCE", 5);
            lgb0[] lgb0VarArr2 = lgb0.a;
            intent.putExtra("EXTRA_AI_SOURCE", 1);
            intent.setClass(getContext(), EventActivity.class);
            Unit unit = Unit.a;
            EventActivity.a.a(context2, intent);
        }
        boolean zEquals = aVar.equals(com.sportybet.plugin.realsports.home.featuredsection.a.C0430a.a);
        boolean z = this.matchesOnlyMode;
        if (!zEquals) {
            if (aVar.equals(com.sportybet.plugin.realsports.home.featuredsection.a.b.a)) {
                getTrackingUseCase().a(new thm.b(S(z), event.eventId, event.gameId), k00.d);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        FeaturedMatch featuredMatchI = I(event.eventId);
        rdd0 trackingUseCase = getTrackingUseCase();
        thm.k kVarS = S(z);
        String str = event.eventId;
        String str2 = event.gameId;
        Sport sport = event.sport;
        String marketDescMain = null;
        String str3 = (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.name;
        String str4 = str3 == null ? "" : str3;
        if (featuredMatchI != null) {
            Market market = featuredMatchI.getMarket();
            market.getClass();
            marketDescMain = u5y.d(market) ? "PCBB" : featuredMatchI.getMarketDescMain();
        }
        trackingUseCase.a(new thm.a(kVarS, str, str2, str4, marketDescMain == null ? "" : marketDescMain, G()), k00.d, k00.c);
    }

    @Override // defpackage.xeh
    public final void r(String str, Function2<? super String, ? super v5b, Unit> function2) {
        str.getClass();
        nas nasVar = this.M;
        if (nasVar != null) {
            function2.invoke(str, nasVar);
        }
    }

    public final void setAccountHelper(uqm uqmVar) {
        uqmVar.getClass();
        this.accountHelper = uqmVar;
    }

    public final void setAccountStorage(mgb0 mgb0Var) {
        mgb0Var.getClass();
        this.accountStorage = mgb0Var;
    }

    public final void setActionListener(b listener) {
        listener.getClass();
        this.N = listener;
    }

    public final void setCodeHubImgClickListener(ky7 listener) {
        listener.getClass();
        this.P = listener;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }

    public final void setDedicatedTeamPageLauncher(a6d a6dVar) {
        a6dVar.getClass();
        this.dedicatedTeamPageLauncher = a6dVar;
    }

    public final void setFeaturedCodeActionListener(fz4 actionListener) {
        yy4 yy4Var = this.n0;
        if (yy4Var != null) {
            yy4Var.b = actionListener;
        } else {
            Intrinsics.n("featuredCodesAdapter");
            throw null;
        }
    }

    public final void setFeaturedCodeRetryListener(ErrorView.a listener) {
        this.I.i.getErrorView().setOnActionListener(new f(listener));
    }

    public final void setFeaturedCodesUiState(lk50<? extends List<gz4>> uiState) {
        uiState.getClass();
        boolean zEquals = uiState.equals(lk50.b.a);
        ydh ydhVar = this.I;
        if (zEquals) {
            ydhVar.i.setVisibility(0);
            return;
        }
        if (!(uiState instanceof lk50.c)) {
            if (!(uiState instanceof lk50.a)) {
                uhc.a();
                return;
            }
            Throwable th = ((lk50.a) uiState).a;
            if (th instanceof SprThrowable) {
                ydhVar.i.J(((SprThrowable) th).getE());
                return;
            } else {
                ydhVar.i.J(sn5.c(this, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                return;
            }
        }
        List list = (List) ((lk50.c) uiState).a;
        if (list.isEmpty()) {
            b9i0.a(ydhVar.c, false, getRvPaddingStart(), getRvPaddingStartSmall(), getRvPaddingEnd());
            ydhVar.i.J(sn5.c(this, R.string.page_code_hub__no_results, new Object[0]));
            return;
        }
        b9i0.a(ydhVar.c, true, getRvPaddingStart(), getRvPaddingStartSmall(), getRvPaddingEnd());
        ydhVar.i.E();
        yy4 yy4Var = this.n0;
        if (yy4Var != null) {
            yy4Var.i(list);
        } else {
            Intrinsics.n("featuredCodesAdapter");
            throw null;
        }
    }

    public final void setFeaturedTabSelectionListener(c listener) {
        this.Q = listener;
    }

    public final void setFlashBoostViewTracker(muh muhVar) {
        muhVar.getClass();
        this.flashBoostViewTracker = muhVar;
    }

    public final void setGamesForYouEnabled(boolean enabled) {
        this.r0 = enabled;
    }

    public final void setInstantWinRouter(jlo jloVar) {
        jloVar.getClass();
        this.instantWinRouter = jloVar;
    }

    public final void setOpenTelemetryLogger(iym iymVar) {
        iymVar.getClass();
        this.openTelemetryLogger = iymVar;
    }

    public final void setOutcomeBoostResolver(a8z a8zVar) {
        a8zVar.getClass();
        this.outcomeBoostResolver = a8zVar;
    }

    public final void setOutcomeChangeListener(g8z listener) {
        listener.getClass();
        this.O = listener;
    }

    public final void setPreferenceDataStore(m2l m2lVar) {
        m2lVar.getClass();
        this.preferenceDataStore = m2lVar;
    }

    public final void setScope(ibs owner) {
        owner.getClass();
        if (this.M != null) {
            this.M = ebs.a(owner.getLifecycle());
            return;
        }
        this.M = ebs.a(owner.getLifecycle());
        getAccountHelper().addLoginEventListener(this.s0);
        getAccountHelper().addLogoutEventListener(this.t0);
    }

    public final void setSwitchToGamesTabWhenReady(boolean z) {
        this.switchToGamesTabWhenReady = z;
        if (z && this.W) {
            R();
        }
    }

    public final void setTrackingUseCase(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.trackingUseCase = rdd0Var;
    }

    public final void setUiRouterManager(fbh0 fbh0Var) {
        fbh0Var.getClass();
        this.uiRouterManager = fbh0Var;
    }

    @Override // defpackage.xeh
    public final void t(String str, String str2, String str3) {
        a6d dedicatedTeamPageLauncher = getDedicatedTeamPageLauncher();
        Context context = getContext();
        context.getClass();
        ((b6d) dedicatedTeamPageLauncher).a(context, str, str2, str3, "featured_match");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedContainer(Context context) {
        this(context, (AttributeSet) null, 0, 14);
        context.getClass();
    }

    public /* synthetic */ FeaturedContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, false);
    }
}
