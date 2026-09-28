package com.sportybet.plugin.realsports.search;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FirstSearchResult;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.SearchHistoryPreference;
import com.sportybet.plugin.realsports.data.SearchRequestData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportsEventNum;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.SearchResultLoadingView;
import com.sportybet.plugin.realsports.search.SearchResultsErrorView;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ClearEditText;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.a1s;
import defpackage.apg;
import defpackage.auy;
import defpackage.avy;
import defpackage.aw70;
import defpackage.b280;
import defpackage.b390;
import defpackage.bmy;
import defpackage.br3;
import defpackage.bsy;
import defpackage.buy;
import defpackage.c280;
import defpackage.c8i0;
import defpackage.ckf;
import defpackage.cw70;
import defpackage.cwu;
import defpackage.cyb;
import defpackage.d280;
import defpackage.d630;
import defpackage.dty;
import defpackage.e8z;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ety;
import defpackage.f00;
import defpackage.fse;
import defpackage.fuu;
import defpackage.g1i;
import defpackage.g5e;
import defpackage.gby;
import defpackage.gid0;
import defpackage.gty;
import defpackage.gy2;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hih0;
import defpackage.hp0;
import defpackage.hwr;
import defpackage.hzh;
import defpackage.i2i;
import defpackage.i2m;
import defpackage.i6i0;
import defpackage.ibs;
import defpackage.iel;
import defpackage.ijf;
import defpackage.ilk;
import defpackage.itf0;
import defpackage.ity;
import defpackage.iu2;
import defpackage.iym;
import defpackage.jq40;
import defpackage.jqu;
import defpackage.jrm;
import defpackage.jty;
import defpackage.jvd0;
import defpackage.k650;
import defpackage.kni0;
import defpackage.kv70;
import defpackage.kzh;
import defpackage.lfy;
import defpackage.lkf;
import defpackage.lqu;
import defpackage.lv70;
import defpackage.mfb0;
import defpackage.mjd0;
import defpackage.mjf;
import defpackage.mlk;
import defpackage.mmc;
import defpackage.mpe0;
import defpackage.mv70;
import defpackage.n280;
import defpackage.njs;
import defpackage.nty;
import defpackage.nv70;
import defpackage.o8i0;
import defpackage.odd;
import defpackage.of20;
import defpackage.ohp;
import defpackage.ou70;
import defpackage.ov70;
import defpackage.oy2;
import defpackage.ozh;
import defpackage.paj;
import defpackage.pfd;
import defpackage.phh0;
import defpackage.pkf;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qv70;
import defpackage.qz3;
import defpackage.r5b;
import defpackage.r8i0;
import defpackage.rhh0;
import defpackage.rty;
import defpackage.ruy;
import defpackage.rw70;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sn20;
import defpackage.sty;
import defpackage.sv70;
import defpackage.szh;
import defpackage.ttr;
import defpackage.tv70;
import defpackage.u180;
import defpackage.uhc;
import defpackage.uhd0;
import defpackage.uqm;
import defpackage.uuy;
import defpackage.uv70;
import defpackage.uy2;
import defpackage.v180;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vfq;
import defpackage.vgb0;
import defpackage.vuy;
import defpackage.vy2;
import defpackage.w180;
import defpackage.w8i0;
import defpackage.whh0;
import defpackage.wig;
import defpackage.wlc;
import defpackage.wuy;
import defpackage.wv70;
import defpackage.xhh0;
import defpackage.xiz;
import defpackage.xlc;
import defpackage.xyd0;
import defpackage.yhh0;
import defpackage.yrh0;
import defpackage.yty;
import defpackage.yw70;
import defpackage.yzh;
import defpackage.zh20;
import defpackage.zhh0;
import defpackage.zjf;
import defpackage.zyh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/plugin/realsports/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Liu2$b;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchFragment extends i2m implements iu2.b {
    public static final /* synthetic */ ohp<Object>[] V = {new d630(0, SearchFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/SprFragmentSearchBinding;")};
    public final q8i0 A;
    public final q8i0 B;
    public final q8i0 C;
    public final mpe0 D;
    public jvd0 E;
    public uqm F;
    public iym G;
    public k650 H;
    public mjf I;
    public xhh0 J;
    public zhh0 K;
    public sty L;
    public jty M;
    public jrm N;
    public boolean O;
    public mfb0 P;
    public RegularMarketRule Q;
    public mfb0 R;
    public RegularMarketRule S;
    public ity T;
    public final c U;
    public final i6i0 f;
    public final q8i0 i;
    public final q8i0 v;
    public final q8i0 w;
    public final q8i0 y;
    public final q8i0 z;

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

    public static final class a0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, uhd0> {
        public static final b a = new b(1, uhd0.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/SprFragmentSearchBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final uhd0 invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.clear;
            TextView textView = (TextView) h5e.a(R.id.clear, view2);
            if (textView != null) {
                i = R.id.go_back;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.go_back, view2);
                if (imageButton != null) {
                    i = R.id.hot_searches_label;
                    TextView textView2 = (TextView) h5e.a(R.id.hot_searches_label, view2);
                    if (textView2 != null) {
                        i = R.id.hot_searches_tags;
                        ChipGroup chipGroup = (ChipGroup) h5e.a(R.id.hot_searches_tags, view2);
                        if (chipGroup != null) {
                            i = R.id.live_barrier_switch_start;
                            if (((Barrier) h5e.a(R.id.live_barrier_switch_start, view2)) != null) {
                                i = R.id.live_guideline_end;
                                if (((Guideline) h5e.a(R.id.live_guideline_end, view2)) != null) {
                                    i = R.id.live_market_option_divider;
                                    View viewA = h5e.a(R.id.live_market_option_divider, view2);
                                    if (viewA != null) {
                                        i = R.id.live_market_option_feature_alert;
                                        BubbleView bubbleView = (BubbleView) h5e.a(R.id.live_market_option_feature_alert, view2);
                                        if (bubbleView != null) {
                                            i = R.id.live_one_two_up_switch;
                                            OneUpTwoUpSwitch oneUpTwoUpSwitch = (OneUpTwoUpSwitch) h5e.a(R.id.live_one_two_up_switch, view2);
                                            if (oneUpTwoUpSwitch != null) {
                                                i = R.id.live_ou_early_goals_switch;
                                                OUEarlyGoalsSwitch oUEarlyGoalsSwitch = (OUEarlyGoalsSwitch) h5e.a(R.id.live_ou_early_goals_switch, view2);
                                                if (oUEarlyGoalsSwitch != null) {
                                                    i = R.id.pre_match_barrier_switch_start;
                                                    if (((Barrier) h5e.a(R.id.pre_match_barrier_switch_start, view2)) != null) {
                                                        i = R.id.pre_match_guideline_end;
                                                        if (((Guideline) h5e.a(R.id.pre_match_guideline_end, view2)) != null) {
                                                            i = R.id.pre_match_market_option_divider;
                                                            View viewA2 = h5e.a(R.id.pre_match_market_option_divider, view2);
                                                            if (viewA2 != null) {
                                                                i = R.id.pre_match_market_option_feature_alert;
                                                                BubbleView bubbleView2 = (BubbleView) h5e.a(R.id.pre_match_market_option_feature_alert, view2);
                                                                if (bubbleView2 != null) {
                                                                    i = R.id.pre_match_one_two_up_switch;
                                                                    OneUpTwoUpSwitch oneUpTwoUpSwitch2 = (OneUpTwoUpSwitch) h5e.a(R.id.pre_match_one_two_up_switch, view2);
                                                                    if (oneUpTwoUpSwitch2 != null) {
                                                                        i = R.id.pre_match_ou_early_goals_switch;
                                                                        OUEarlyGoalsSwitch oUEarlyGoalsSwitch2 = (OUEarlyGoalsSwitch) h5e.a(R.id.pre_match_ou_early_goals_switch, view2);
                                                                        if (oUEarlyGoalsSwitch2 != null) {
                                                                            i = R.id.recycler_search_history;
                                                                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_search_history, view2);
                                                                            if (recyclerView != null) {
                                                                                i = R.id.search_container;
                                                                                if (((FrameLayout) h5e.a(R.id.search_container, view2)) != null) {
                                                                                    i = R.id.search_content;
                                                                                    if (((ConsecutiveScrollerLayout) h5e.a(R.id.search_content, view2)) != null) {
                                                                                        i = R.id.search_history_label;
                                                                                        TextView textView3 = (TextView) h5e.a(R.id.search_history_label, view2);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.search_history_section;
                                                                                            if (((ConstraintLayout) h5e.a(R.id.search_history_section, view2)) != null) {
                                                                                                i = R.id.search_keyword;
                                                                                                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.search_keyword, view2);
                                                                                                if (clearEditText != null) {
                                                                                                    i = R.id.search_live_market_tab;
                                                                                                    TabLayout tabLayout = (TabLayout) h5e.a(R.id.search_live_market_tab, view2);
                                                                                                    if (tabLayout != null) {
                                                                                                        i = R.id.search_live_market_title;
                                                                                                        View viewA3 = h5e.a(R.id.search_live_market_title, view2);
                                                                                                        if (viewA3 != null) {
                                                                                                            gid0 gid0VarA = gid0.a(viewA3);
                                                                                                            i = R.id.search_live_panel;
                                                                                                            SearchLivePanel searchLivePanel = (SearchLivePanel) h5e.a(R.id.search_live_panel, view2);
                                                                                                            if (searchLivePanel != null) {
                                                                                                                i = R.id.search_live_sport_tab;
                                                                                                                TabLayout tabLayout2 = (TabLayout) h5e.a(R.id.search_live_sport_tab, view2);
                                                                                                                if (tabLayout2 != null) {
                                                                                                                    i = R.id.search_live_tab_container;
                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.search_live_tab_container, view2);
                                                                                                                    if (constraintLayout != null) {
                                                                                                                        i = R.id.search_live_title;
                                                                                                                        if (((TextView) h5e.a(R.id.search_live_title, view2)) != null) {
                                                                                                                            i = R.id.search_live_view;
                                                                                                                            View viewA4 = h5e.a(R.id.search_live_view, view2);
                                                                                                                            if (viewA4 != null) {
                                                                                                                                i = R.id.search_loading_view;
                                                                                                                                SearchResultLoadingView searchResultLoadingView = (SearchResultLoadingView) h5e.a(R.id.search_loading_view, view2);
                                                                                                                                if (searchResultLoadingView != null) {
                                                                                                                                    i = R.id.search_pre_match_view;
                                                                                                                                    View viewA5 = h5e.a(R.id.search_pre_match_view, view2);
                                                                                                                                    if (viewA5 != null) {
                                                                                                                                        i = R.id.search_prematch_market_tab;
                                                                                                                                        TabLayout tabLayout3 = (TabLayout) h5e.a(R.id.search_prematch_market_tab, view2);
                                                                                                                                        if (tabLayout3 != null) {
                                                                                                                                            i = R.id.search_prematch_panel;
                                                                                                                                            SearchPreMatchPanel searchPreMatchPanel = (SearchPreMatchPanel) h5e.a(R.id.search_prematch_panel, view2);
                                                                                                                                            if (searchPreMatchPanel != null) {
                                                                                                                                                i = R.id.search_prematch_sport_tab;
                                                                                                                                                TabLayout tabLayout4 = (TabLayout) h5e.a(R.id.search_prematch_sport_tab, view2);
                                                                                                                                                if (tabLayout4 != null) {
                                                                                                                                                    i = R.id.search_prematch_tab_container;
                                                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.search_prematch_tab_container, view2);
                                                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                                                        i = R.id.search_prematch_title;
                                                                                                                                                        if (((TextView) h5e.a(R.id.search_prematch_title, view2)) != null) {
                                                                                                                                                            i = R.id.title_bar_bg;
                                                                                                                                                            View viewA6 = h5e.a(R.id.title_bar_bg, view2);
                                                                                                                                                            if (viewA6 != null) {
                                                                                                                                                                return new uhd0((ConstraintLayout) view2, textView, imageButton, textView2, chipGroup, viewA, bubbleView, oneUpTwoUpSwitch, oUEarlyGoalsSwitch, viewA2, bubbleView2, oneUpTwoUpSwitch2, oUEarlyGoalsSwitch2, recyclerView, textView3, clearEditText, tabLayout, gid0VarA, searchLivePanel, tabLayout2, constraintLayout, viewA4, searchResultLoadingView, viewA5, tabLayout3, searchPreMatchPanel, tabLayout4, constraintLayout2, viewA6);
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
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b0 extends qlr implements Function0<Fragment> {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class c implements zh20 {
        public c() {
        }

        @Override // defpackage.zh20
        public final void a(Event event) {
            androidx.fragment.app.e activity = SearchFragment.this.getActivity();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            String str = event.eventId;
            str.getClass();
            String str2 = event.sport.id;
            str2.getClass();
            xyd0.a.a(str, str2, event.isLiveOrFinished(), event.eventSource).show(activity.getSupportFragmentManager(), "statisticsDialogFragment");
            Unit unit = Unit.a;
        }

        @Override // defpackage.zh20
        public final void b(mfb0 mfb0Var) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.g("Search onSportTabClicked", new Object[0]);
            ohp<Object>[] ohpVarArr = SearchFragment.V;
            SearchFragment searchFragment = SearchFragment.this;
            mjd0 mjd0Var = searchFragment.p0().O.e;
            mjd0Var.b.setVisibility(4);
            mjd0Var.c.K();
            n280 n280VarS0 = searchFragment.s0();
            n280 n280VarS1 = searchFragment.s0();
            String strValueOf = String.valueOf(searchFragment.p0().E.getText());
            String id = mfb0Var.getId();
            SearchRequestData searchRequestData = (SearchRequestData) n280VarS1.w.getValue();
            searchRequestData.setKeyword(strValueOf);
            searchRequestData.setSport(id);
            searchRequestData.setProdId(3);
            jvd0 jvd0Var = n280VarS0.D;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            n280VarS0.D = ej5.c(o8i0.d(n280VarS0), null, null, new b280(n280VarS0, searchRequestData, null), 3);
        }

        @Override // defpackage.zh20
        public final void c(Event event) {
            FragmentManager childFragmentManager = SearchFragment.this.getChildFragmentManager();
            childFragmentManager.getClass();
            ilk ilkVar = new ilk();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            aVar.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
            aVar.c("GiftGrabPromotionDialogFragment");
            aVar.d();
            LinkedHashSet linkedHashSet = mlk.a;
            String str = event.eventId;
            str.getClass();
            if (mlk.a(str)) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
            }
        }

        @Override // defpackage.zh20
        public final void d(Selection selection, boolean z, boolean z2) {
            androidx.fragment.app.e activity;
            Event event = selection.a;
            auy auyVar = auy.e;
            gty gtyVarA = buy.a(auyVar);
            SearchFragment searchFragment = SearchFragment.this;
            sty styVar = searchFragment.L;
            if (styVar == null) {
                Intrinsics.n("oneUpSelectionAttributionDispatcher");
                throw null;
            }
            boolean zT0 = searchFragment.t0();
            ity ityVar = searchFragment.T;
            if (ityVar == null) {
                Intrinsics.n("oneUpPromoSurfacePresenter");
                throw null;
            }
            nty ntyVarA = ityVar.b.a(gtyVarA, event, searchFragment.S);
            ntyVarA.getClass();
            styVar.b(new sty.b.C1102b(new yty(selection, z && z2, buy.a(auyVar), zT0, ntyVarA, styVar.c.b()), true));
            ((bsy) searchFragment.A.getValue()).G1(selection, z, e8z.f);
            q8i0 q8i0Var = searchFragment.v;
            if (z) {
                ((of20) q8i0Var.getValue()).z1(selection);
                iym iymVar = searchFragment.G;
                if (iymVar == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                PageMeta.INSTANCE.getClass();
                iymVar.f(AnalyticsEvent.SEARCH_ADD_TO_BETSLIP, new PageMeta(AnalyticsParam.SEARCH_KEYWORD, null));
            } else {
                ((of20) q8i0Var.getValue()).C.a(selection);
            }
            if (z2) {
                return;
            }
            if (kni0.m()) {
                androidx.fragment.app.e activity2 = searchFragment.getActivity();
                if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                searchFragment.o0().c(activity2);
                Unit unit = Unit.a;
                return;
            }
            if (searchFragment.o0().R() && (activity = searchFragment.getActivity()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                qz3.p(activity);
                Unit unit2 = Unit.a;
            }
            if (!searchFragment.o0().e0(selection)) {
                jrm jrmVarO0 = searchFragment.o0();
                event.getClass();
                if (!jrmVarO0.y1(event)) {
                    return;
                }
            }
            androidx.fragment.app.e activity3 = searchFragment.getActivity();
            if (activity3 == null || activity3.isFinishing() || activity3.isDestroyed()) {
                return;
            }
            qz3.m(activity3);
            Unit unit3 = Unit.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // defpackage.zh20
        public final void e(mfb0 mfb0Var, RegularMarketRule regularMarketRule) {
            SearchFragment searchFragment = SearchFragment.this;
            q8i0 q8i0Var = searchFragment.w;
            if (!searchFragment.isAdded() || searchFragment.getView() == null || searchFragment.getViewLifecycleOwner().getLifecycle().b().compareTo(s9s.b.d) < 0) {
                return;
            }
            final uhd0 uhd0VarP0 = searchFragment.p0();
            searchFragment.R = mfb0Var;
            searchFragment.S = regularMarketRule;
            boolean zF = searchFragment.r0().f(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule != null ? regularMarketRule.a : null, false);
            mjf mjfVar = searchFragment.I;
            if (mjfVar == null) {
                Intrinsics.n("earlyPayoutConfigManager");
                throw null;
            }
            boolean zB = mjfVar.b(ckf.c, mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule != null ? regularMarketRule.a : null, false);
            if (!zF) {
                if (!zB) {
                    uhd0VarP0.y.setVisibility(8);
                    uhd0VarP0.A.setVisibility(8);
                    uhd0VarP0.B.setVisibility(8);
                    uhd0VarP0.z.setVisibility(8);
                    return;
                }
                View view = uhd0VarP0.y;
                BubbleView bubbleView = uhd0VarP0.z;
                OUEarlyGoalsSwitch oUEarlyGoalsSwitch = uhd0VarP0.B;
                view.setVisibility(0);
                uhd0VarP0.A.setVisibility(8);
                oUEarlyGoalsSwitch.setVisibility(0);
                jqu jquVar = ((sn20) q8i0Var.getValue()).a.a("market_early_goals_switch_hint_displayed") ? null : jqu.a;
                if (jquVar != null) {
                    lqu.c(bubbleView, jquVar, new Function0() { // from class: qu70
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ohp<Object>[] ohpVarArr = SearchFragment.V;
                            Context context = uhd0VarP0.a.getContext();
                            context.getClass();
                            gby.c(context);
                            return Unit.a;
                        }
                    });
                }
                c8i0.o(bubbleView, jquVar != null);
                ((ijf) searchFragment.B.getValue()).C1(lkf.d, zjf.b, oUEarlyGoalsSwitch.c() ? pkf.a : pkf.b);
                return;
            }
            whh0 whh0VarD = searchFragment.r0().d(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule != null ? regularMarketRule.a : null, false);
            if (searchFragment.K == null) {
                Intrinsics.n("upPageToggleStateUseCase");
                throw null;
            }
            yhh0 yhh0VarA = zhh0.a(whh0VarD);
            avy avyVar = yhh0VarA.b;
            OneUpTwoUpSwitch oneUpTwoUpSwitch = uhd0VarP0.A;
            BubbleView bubbleView2 = uhd0VarP0.z;
            hih0.a(oneUpTwoUpSwitch, yhh0VarA.a);
            hih0.c(oneUpTwoUpSwitch, avyVar, false, true);
            uhd0VarP0.y.setVisibility(0);
            oneUpTwoUpSwitch.setVisibility(0);
            uhd0VarP0.B.setVisibility(8);
            jqu jquVar2 = (((sn20) q8i0Var.getValue()).a.a("dc_one_up_switch_hint_displayed") || !((whh0VarD != null ? whh0VarD.a : null) == rhh0.b && whh0VarD.c.contains(phh0.a)) == true) ? null : jqu.b;
            if (jquVar2 != null) {
                lqu.c(bubbleView2, jquVar2, null);
            }
            c8i0.o(bubbleView2, jquVar2 != null);
            searchFragment.w0(avyVar, regularMarketRule, mfb0Var != null ? mfb0Var.getId() : null, false);
        }

        @Override // defpackage.zh20
        public final void f(Event event) {
            event.getClass();
            androidx.fragment.app.e activity = SearchFragment.this.getActivity();
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) PreMatchEventActivity.class);
            intent.putExtra("EXTRA_EVENT", apg.f(event));
            yrh0.s(activity, intent, true);
            Unit unit = Unit.a;
        }

        @Override // defpackage.zh20
        public final String getLanguageCode() {
            uqm uqmVar = SearchFragment.this.F;
            if (uqmVar == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            String languageCode = uqmVar.getLanguageCode();
            languageCode.getClass();
            return languageCode;
        }
    }

    public static final class c0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(b0 b0Var) {
            super(0);
            this.a = b0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
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

    public static final class d0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class e0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class f extends qlr implements Function0<Fragment> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class g extends qlr implements Function0<w8i0> {
        public final /* synthetic */ f a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class g0 extends qlr implements Function0<Fragment> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class h0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(g0 g0Var) {
            super(0);
            this.a = g0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class i0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class j0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class k extends qlr implements Function0<Fragment> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class k0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<w8i0> {
        public final /* synthetic */ k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class l0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class m extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class m0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class n extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class n0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class o extends qlr implements Function0<Fragment> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class o0 extends qlr implements Function0<Fragment> {
        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class p extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class p0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ o0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(o0 o0Var) {
            super(0);
            this.a = o0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class q extends qlr implements Function0<Fragment> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class q0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class r extends qlr implements Function0<w8i0> {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(q qVar) {
            super(0);
            this.a = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class r0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class s extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class t extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class u extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class v extends qlr implements Function0<Fragment> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SearchFragment.this;
        }
    }

    public static final class w extends qlr implements Function0<w8i0> {
        public final /* synthetic */ v a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(v vVar) {
            super(0);
            this.a = vVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class x extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class y extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class z extends qlr implements Function0<w8i0> {
        public final /* synthetic */ o a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(o oVar) {
            super(0);
            this.a = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public SearchFragment() {
        super(R.layout.spr_fragment_search);
        this.f = g5e.a(b.a);
        o oVar = new o();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new z(oVar));
        this.i = new q8i0(jq40.a(n280.class), new k0(ttrVarA), new n0(ttrVarA), new m0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new p0(new o0()));
        this.v = new q8i0(jq40.a(of20.class), new q0(ttrVarA2), new e(ttrVarA2), new r0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new g(new f()));
        this.w = new q8i0(jq40.a(sn20.class), new h(ttrVarA3), new j(ttrVarA3), new i(ttrVarA3));
        ttr ttrVarA4 = hwr.a(a1sVar, new l(new k()));
        this.y = new q8i0(jq40.a(ruy.class), new m(ttrVarA4), new p(ttrVarA4), new n(ttrVarA4));
        ttr ttrVarA5 = hwr.a(a1sVar, new r(new q()));
        this.z = new q8i0(jq40.a(rw70.class), new s(ttrVarA5), new u(ttrVarA5), new t(ttrVarA5));
        ttr ttrVarA6 = hwr.a(a1sVar, new w(new v()));
        this.A = new q8i0(jq40.a(bsy.class), new x(ttrVarA6), new a0(ttrVarA6), new y(ttrVarA6));
        ttr ttrVarA7 = hwr.a(a1sVar, new c0(new b0()));
        this.B = new q8i0(jq40.a(ijf.class), new d0(ttrVarA7), new f0(ttrVarA7), new e0(ttrVarA7));
        ttr ttrVarA8 = hwr.a(a1sVar, new h0(new g0()));
        this.C = new q8i0(jq40.a(xlc.class), new i0(ttrVarA8), new l0(ttrVarA8), new j0(ttrVarA8));
        this.D = hwr.b(new Function0() { // from class: wu70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                return gr0.a(this.a.requireContext(), R.drawable.spr_close);
            }
        });
        this.U = new c();
    }

    @Override // iu2.a
    public final void C() {
        Iterator it = cw70.i.iterator();
        while (it.hasNext()) {
            ((OutcomeButton) it.next()).d();
        }
        yw70 yw70Var = p0().O.A;
        if (yw70Var != null) {
            yw70Var.notifyDataSetChanged();
        } else {
            Intrinsics.n("adapter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0(mfb0 mfb0Var, RegularMarketRule regularMarketRule) {
        String str = regularMarketRule.a;
        final uhd0 uhd0VarP0 = p0();
        this.P = mfb0Var;
        this.Q = regularMarketRule;
        boolean zF = r0().f(mfb0Var != null ? mfb0Var.getId() : null, str, true);
        mjf mjfVar = this.I;
        if (mjfVar == null) {
            Intrinsics.n("earlyPayoutConfigManager");
            throw null;
        }
        boolean zB = mjfVar.b(ckf.c, mfb0Var != null ? mfb0Var.getId() : null, str, true);
        q8i0 q8i0Var = this.w;
        if (!zF) {
            if (!zB) {
                uhd0VarP0.f.setVisibility(8);
                uhd0VarP0.v.setVisibility(8);
                uhd0VarP0.w.setVisibility(8);
                uhd0VarP0.i.setVisibility(8);
                return;
            }
            View view = uhd0VarP0.f;
            BubbleView bubbleView = uhd0VarP0.i;
            OUEarlyGoalsSwitch oUEarlyGoalsSwitch = uhd0VarP0.w;
            view.setVisibility(0);
            uhd0VarP0.v.setVisibility(8);
            oUEarlyGoalsSwitch.setVisibility(0);
            jqu jquVar = ((sn20) q8i0Var.getValue()).a.a("market_early_goals_switch_hint_displayed") ? null : jqu.a;
            if (jquVar != null) {
                lqu.c(bubbleView, jquVar, new Function0() { // from class: ru70
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ohp<Object>[] ohpVarArr = SearchFragment.V;
                        Context context = uhd0VarP0.a.getContext();
                        context.getClass();
                        gby.c(context);
                        return Unit.a;
                    }
                });
            }
            c8i0.o(bubbleView, jquVar != null);
            ((ijf) this.B.getValue()).C1(lkf.d, zjf.a, oUEarlyGoalsSwitch.c() ? pkf.a : pkf.b);
            return;
        }
        whh0 whh0VarD = r0().d(mfb0Var != null ? mfb0Var.getId() : null, str, true);
        if (this.K == null) {
            Intrinsics.n("upPageToggleStateUseCase");
            throw null;
        }
        yhh0 yhh0VarA = zhh0.a(whh0VarD);
        avy avyVar = yhh0VarA.b;
        OneUpTwoUpSwitch oneUpTwoUpSwitch = uhd0VarP0.v;
        OneUpTwoUpSwitch oneUpTwoUpSwitch2 = uhd0VarP0.v;
        BubbleView bubbleView2 = uhd0VarP0.i;
        hih0.a(oneUpTwoUpSwitch, yhh0VarA.a);
        hih0.c(oneUpTwoUpSwitch2, avyVar, false, true);
        uhd0VarP0.f.setVisibility(0);
        oneUpTwoUpSwitch2.setVisibility(0);
        uhd0VarP0.w.setVisibility(8);
        jqu jquVar2 = (((sn20) q8i0Var.getValue()).a.a("dc_one_up_switch_hint_displayed") || !((whh0VarD != null ? whh0VarD.a : null) == rhh0.b && whh0VarD.c.contains(phh0.a)) == true) ? null : jqu.b;
        if (jquVar2 != null) {
            lqu.c(bubbleView2, jquVar2, null);
        }
        c8i0.o(bubbleView2, jquVar2 != null);
        w0(avyVar, regularMarketRule, mfb0Var != null ? mfb0Var.getId() : null, true);
    }

    public final void m0(List list, boolean z2) {
        SearchLivePanel searchLivePanel = p0().H;
        p0().J.setVisibility(0);
        searchLivePanel.setVisibility(0);
        if (z2) {
            p0().G.a.setVisibility(8);
            c8i0.f(searchLivePanel.getRecycler());
            searchLivePanel.getLoading().K();
            c8i0.n(searchLivePanel.getLoading());
            return;
        }
        q0().A = list;
        final rw70 rw70VarQ0 = q0();
        final mfb0 sportRule = searchLivePanel.getSportRule();
        rw70VarQ0.y = sportRule;
        QuickMarketHelper.fetch(QuickMarketSpotEnum.LIVE_PAGE_LIVE_EVENTS, sportRule != null ? sportRule.getId() : null, new QuickMarketHelper.FetchCallback() { // from class: nw70
            @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
            public final void onResult(List list2) {
                String str;
                Object next;
                rw70 rw70Var = rw70VarQ0;
                wwd0 wwd0Var = rw70Var.e;
                mfb0 mfb0Var = sportRule;
                if (mfb0Var == null || list2.isEmpty()) {
                    list2.getClass();
                    wwd0Var.getClass();
                    wwd0Var.k(null, list2);
                    return;
                }
                RegularMarketRule regularMarketRule = rw70Var.z;
                if (regularMarketRule != null) {
                    rw70Var.b.getClass();
                    str = hkf.d(regularMarketRule).a;
                } else {
                    str = null;
                }
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((RegularMarketRule) next).a, str));
                RegularMarketRule regularMarketRule2 = (RegularMarketRule) next;
                if (regularMarketRule2 == null) {
                    regularMarketRule2 = (RegularMarketRule) CollectionsKt.T(list2);
                }
                String id = mfb0Var.getId();
                id.getClass();
                regularMarketRule2.getClass();
                RegularMarketRule regularMarketRuleY1 = rw70Var.y1(id, regularMarketRule2);
                ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    RegularMarketRule regularMarketRule3 = (RegularMarketRule) it2.next();
                    if (Intrinsics.g(regularMarketRule3.a, regularMarketRule2.a)) {
                        regularMarketRule3 = regularMarketRuleY1;
                    }
                    arrayList.add(regularMarketRule3);
                }
                wwd0Var.getClass();
                wwd0Var.k(null, arrayList);
            }
        });
    }

    public final void n0(String str) {
        this.O = true;
        s0().y1(str);
        n280 n280VarS0 = s0();
        str.getClass();
        jvd0 jvd0Var = n280VarS0.B;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        n280VarS0.B = ej5.c(o8i0.d(n280VarS0), null, null, new u180(n280VarS0, str, null), 3);
        iym iymVar = this.G;
        if (iymVar == null) {
            Intrinsics.n("openTelemetryLogger");
            throw null;
        }
        Map<String, ? extends Object> mapA = com.appsflyer.internal.u.a(AnalyticsParam.SEARCH_KEYWORD, str);
        PageMeta.INSTANCE.getClass();
        iymVar.c(AnalyticsEvent.SEARCH_SEARCH, mapA, new PageMeta(AnalyticsParam.SEARCH_KEYWORD, null));
    }

    public final jrm o0() {
        jrm jrmVar = this.N;
        if (jrmVar != null) {
            return jrmVar;
        }
        Intrinsics.n("betItem");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f00 f00Var = vgb0.a;
        vgb0.a("Search_Page");
        iym iymVar = this.G;
        if (iymVar == null) {
            Intrinsics.n("openTelemetryLogger");
            throw null;
        }
        PageMeta.INSTANCE.getClass();
        iymVar.f(AnalyticsEvent.SEARCH_VIEW, new PageMeta(AnalyticsParam.SEARCH_KEYWORD, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        p0().O.z.b();
        o0().j1(this);
        q0().A1();
        cw70.i.clear();
        QuickMarketHelper.disposeAll();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ((br3) mmc.a(hp0.A, br3.class)).U().a(requireActivity(), false);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        uhd0 uhd0VarP0 = p0();
        super.onResume();
        ((br3) mmc.a(hp0.A, br3.class)).U().a(requireActivity(), uhd0VarP0.H.getVisibility() == 0 || uhd0VarP0.O.getVisibility() == 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ity ityVar = this.T;
        if (ityVar == null) {
            Intrinsics.n("oneUpPromoSurfacePresenter");
            throw null;
        }
        dty dtyVar = ityVar.g;
        dtyVar.a.clear();
        dtyVar.b = false;
        ruy.x1((ruy) this.y.getValue());
        q0().z1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (!qz3.a()) {
            q0().A1();
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.a("[Socket] skip unSubscribe in Search", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [dv70] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        jty jtyVar = this.M;
        if (jtyVar == null) {
            Intrinsics.n("oneUpPromoSurfacePresenterFactory");
            throw null;
        }
        ity ityVarA = jtyVar.a(gty.e, new ety() { // from class: hu70
            @Override // defpackage.ety
            public final void a() {
                avy avyVar = avy.a;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                hih0.c(this.a.p0().A, avyVar, true, false);
            }
        }, new rty() { // from class: nu70
            @Override // defpackage.rty
            public final void a() {
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                fty.a(this.a.p0().O.e.b);
            }
        });
        this.T = ityVarA;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ityVarA.c(viewLifecycleOwner);
        final uhd0 uhd0VarP0 = p0();
        final View viewRequireView = requireView();
        viewRequireView.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        uhd0VarP0.c.setOnClickListener(new View.OnClickListener() { // from class: zu70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e eVar = eVarRequireActivity;
                View view3 = viewRequireView;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                ((br3) mmc.a(hp0.A, br3.class)).U().a(eVar, false);
                lop.a(view3);
                eVar.finish();
            }
        });
        int i2 = 1;
        uhd0VarP0.b.setOnClickListener(new cwu(this, i2));
        RecyclerView recyclerView = uhd0VarP0.C;
        recyclerView.setItemAnimator(null);
        aw70 aw70Var = new aw70(new aw70.a());
        aw70Var.b = new View.OnClickListener() { // from class: dv70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                Object tag = view2.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                String str = (String) tag;
                if (str != null) {
                    this.a.z0(str);
                }
            }
        };
        recyclerView.setAdapter(aw70Var);
        uhd0VarP0.L.setOnClickListener(new View.OnClickListener() { // from class: fv70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                uhd0 uhd0Var = uhd0VarP0;
                String string = StringsKt.t0(String.valueOf(uhd0Var.E.getText())).toString();
                if (StringsKt.U(string)) {
                    return;
                }
                uhd0Var.L.b();
                this.n0(string);
            }
        });
        final ClearEditText clearEditText = uhd0VarP0.E;
        clearEditText.setClearDrawable((Drawable) this.D.getValue());
        clearEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: gv70
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                CharSequence charSequenceT0;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                ClearEditText clearEditText2 = clearEditText;
                Editable text = clearEditText2.getText();
                if (text != null && (charSequenceT0 = StringsKt.t0(text)) != null && charSequenceT0.length() < 3) {
                    zyf0.b(R.string.wap_search__tips_enter_3_char, 0);
                }
                clearEditText2.clearFocus();
                lop.a(viewRequireView);
                f00 f00Var = vgb0.a;
                vgb0.a("Search_Page2");
                return false;
            }
        });
        SearchLivePanel searchLivePanel = uhd0VarP0.H;
        searchLivePanel.setSportTabLayout(p0().I);
        searchLivePanel.setMarketTabLayout(p0().F);
        searchLivePanel.setMarketTitle(p0().G);
        searchLivePanel.setCallBack(new sv70(searchLivePanel, this));
        searchLivePanel.setTabClickListener(new tv70(this, uhd0VarP0, searchLivePanel));
        RecyclerView recycler = searchLivePanel.getRecycler();
        Context context = searchLivePanel.getContext();
        context.getClass();
        k650 k650Var = this.H;
        if (k650Var == null) {
            Intrinsics.n("remoteConfigRepository");
            throw null;
        }
        cw70 cw70Var = new cw70(context, k650Var);
        cw70Var.e = new com.sportybet.plugin.realsports.search.a(contextRequireContext, this);
        recycler.setAdapter(cw70Var);
        uhd0VarP0.v.setOnStateChangedListener(new uv70(uhd0VarP0, this));
        uhd0VarP0.w.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: iu70
            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
            public final void onStateChanged(boolean z2) {
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                SearchFragment searchFragment = this;
                rw70 rw70VarQ0 = searchFragment.q0();
                osa0.a(z2, rw70VarQ0.C, null);
                mfb0 mfb0Var = rw70VarQ0.y;
                RegularMarketRule regularMarketRule = rw70VarQ0.z;
                if (mfb0Var != null && regularMarketRule != null) {
                    String id = mfb0Var.getId();
                    id.getClass();
                    rw70VarQ0.B1(rw70VarQ0.y1(id, regularMarketRule));
                }
                uhd0VarP0.B.setState(z2, false, false);
                ((ijf) searchFragment.B.getValue()).B1(lkf.d, zjf.a, z2 ? pkf.a : pkf.b);
            }
        });
        uhd0VarP0.i.setOnClickedClose(new gy2(this, 1));
        SearchPreMatchPanel searchPreMatchPanel = uhd0VarP0.O;
        ity ityVar = this.T;
        if (ityVar == null) {
            Intrinsics.n("oneUpPromoSurfacePresenter");
            throw null;
        }
        searchPreMatchPanel.setOneUpPromoPresenter(ityVar);
        searchPreMatchPanel.setSportTabLayout(p0().P);
        searchPreMatchPanel.setMarketTabLayout(p0().N);
        searchPreMatchPanel.setOneTwoUpSwitchStatusGetter(new Function0() { // from class: ju70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                return hih0.g(this.a.p0().A.getB());
            }
        });
        searchPreMatchPanel.setOUEarlyGoalsSwitchStatusGetter(new fuu(this, i2));
        searchPreMatchPanel.h();
        uhd0VarP0.A.setOnStateChangedListener(new qv70(uhd0VarP0, this));
        uhd0VarP0.B.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: ku70
            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
            public final void onStateChanged(boolean z2) {
                RegularMarketRule regularMarketRule;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                uhd0 uhd0Var = uhd0VarP0;
                SearchPreMatchPanel searchPreMatchPanel2 = uhd0Var.O;
                mfb0 mfb0Var = searchPreMatchPanel2.B;
                if (mfb0Var != null && (regularMarketRule = searchPreMatchPanel2.C) != null) {
                    hkf earlyPayoutMarketResolver = searchPreMatchPanel2.getEarlyPayoutMarketResolver();
                    ckf ckfVar = ckf.a;
                    RegularMarketRule regularMarketRuleA = earlyPayoutMarketResolver.a(mfb0Var.getId(), regularMarketRule, z2, false);
                    if (regularMarketRuleA != null) {
                        TabLayout tabLayout = searchPreMatchPanel2.y;
                        if (tabLayout == null) {
                            Intrinsics.n("marketTabLayout");
                            throw null;
                        }
                        int tabCount = tabLayout.getTabCount();
                        for (int i3 = 0; i3 < tabCount; i3++) {
                            TabLayout tabLayout2 = searchPreMatchPanel2.y;
                            if (tabLayout2 == null) {
                                Intrinsics.n("marketTabLayout");
                                throw null;
                            }
                            TabLayout.g gVarK = tabLayout2.k(i3);
                            Object obj = gVarK != null ? gVarK.a : null;
                            RegularMarketRule regularMarketRule2 = obj instanceof RegularMarketRule ? (RegularMarketRule) obj : null;
                            if (Intrinsics.g(regularMarketRule2 != null ? regularMarketRule2.a : null, regularMarketRule.a)) {
                                gVarK.a = regularMarketRuleA;
                                searchPreMatchPanel2.C = regularMarketRuleA;
                                searchPreMatchPanel2.m(regularMarketRuleA);
                                break;
                            }
                        }
                    }
                }
                uhd0Var.w.setState(z2, false, false);
                ((ijf) this.B.getValue()).B1(lkf.d, zjf.b, z2 ? pkf.a : pkf.b);
            }
        });
        uhd0VarP0.z.setOnClickedClose(new wig(this, i2));
        uhd0 uhd0VarP1 = p0();
        gby.a(uhd0VarP1.i.getDescriptionView(), new uy2(uhd0VarP1, 2));
        gby.a(uhd0VarP1.z.getDescriptionView(), new vy2(uhd0VarP1, 1));
        final uhd0 uhd0VarP2 = p0();
        uhd0VarP2.L.b();
        v340 v340Var = q0().f;
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        g1i g1iVar = new g1i(zyh.a(v340Var, lifecycle, bVar), new lv70(uhd0VarP2, this, null));
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        kzh.d(g1iVar, ebs.a(viewLifecycleOwner2.getLifecycle()));
        v340 v340Var2 = q0().v;
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        g1i g1iVar2 = new g1i(zyh.a(v340Var2, lifecycle2, bVar), new mv70(this, null));
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        kzh.d(g1iVar2, ebs.a(viewLifecycleOwner3.getLifecycle()));
        n280 n280VarS0 = s0();
        r5b r5bVarC = n280VarS0.z;
        if (r5bVarC == null) {
            r5bVarC = i2i.c(new yzh(new v180(n280VarS0.a.C()), new w180(3, null)), o8i0.d(n280VarS0).a, 2);
            n280VarS0.z = r5bVarC;
        }
        r5bVarC.f(getViewLifecycleOwner(), new d(new vfq(i2, this, uhd0VarP2)));
        n280 n280VarS1 = s0();
        r5b r5bVarC2 = n280VarS1.A;
        if (r5bVarC2 == null) {
            yzh yzhVar = new yzh(new c280(n280VarS1.b.b(), n280VarS1), new d280(3, null));
            pfd pfdVar = fse.a;
            r5bVarC2 = i2i.c(ozh.c(yzhVar, odd.b), o8i0.d(n280VarS1).a, 2);
            n280VarS1.A = r5bVarC2;
        }
        r5bVarC2.f(getViewLifecycleOwner(), new d(new Function1() { // from class: mu70
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lk50 lk50Var = (lk50) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                boolean z2 = lk50Var instanceof lk50.c;
                SearchFragment searchFragment = this;
                boolean z3 = false;
                if (z2) {
                    uhd0 uhd0Var = uhd0VarP2;
                    RecyclerView.f adapter = uhd0Var.C.getAdapter();
                    if (adapter != null) {
                        if (!(adapter instanceof aw70)) {
                            adapter = null;
                        }
                        aw70 aw70Var2 = (aw70) adapter;
                        if (aw70Var2 != null) {
                            aw70Var2.i(CollectionsKt.A0(((SearchHistoryPreference) ((lk50.c) lk50Var).a).getSearchList()));
                        }
                    }
                    if (!((SearchHistoryPreference) ((lk50.c) lk50Var).a).getSearchList().isEmpty() && uhd0Var.d.getVisibility() == 0 && uhd0Var.e.getVisibility() == 0) {
                        z3 = true;
                    }
                    searchFragment.y0(z3);
                } else if (lk50Var instanceof lk50.a) {
                    searchFragment.y0(false);
                    itf0.a.b(((lk50.a) lk50Var).a);
                }
                return Unit.a;
            }
        }));
        g1i g1iVar3 = new g1i(new ov70(szh.a(hzh.a(new wv70(uhd0VarP2.E, this, null)), 500L)), new nv70(this, null));
        ibs viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        kzh.d(g1iVar3, ebs.a(viewLifecycleOwner4.getLifecycle()));
        ((njs) ((ruy) this.y.getValue()).d.getValue()).f(getViewLifecycleOwner(), new d(new oy2(this, 1)));
        s0().f.f(getViewLifecycleOwner(), new d(new xiz(i2, p0().H, this)));
        final uhd0 uhd0VarP3 = p0();
        s0().c.f(getViewLifecycleOwner(), new d(new Function1() { // from class: yu70
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Sport sport;
                SearchFragment searchFragment = this;
                uhd0 uhd0Var = uhd0VarP3;
                lk50 lk50Var = (lk50) obj;
                searchFragment.O = false;
                if (lk50Var instanceof lk50.c) {
                    FirstSearchResult firstSearchResult = (FirstSearchResult) ((lk50.c) lk50Var).a;
                    uhd0 uhd0VarP4 = searchFragment.p0();
                    if (searchFragment.isAdded()) {
                        if ((firstSearchResult.getLive().isEmpty() || firstSearchResult.getSportsLiveEventNum().isEmpty()) && (firstSearchResult.getPreMatch().isEmpty() || firstSearchResult.getSportsPreEventNum().isEmpty())) {
                            uhd0VarP4.J.setVisibility(8);
                            uhd0VarP4.H.setVisibility(8);
                            uhd0VarP4.Q.setVisibility(8);
                            uhd0VarP4.O.setVisibility(8);
                            SearchResultLoadingView searchResultLoadingView = uhd0VarP4.L;
                            searchResultLoadingView.setVisibility(0);
                            searchResultLoadingView.b.setVisibility(8);
                            searchResultLoadingView.a.setVisibility(8);
                            searchResultLoadingView.c.setVisibility(0);
                            searchResultLoadingView.c.setText(sn5.c(searchResultLoadingView, R.string.wap_search__search_no_result, new Object[0]));
                            searchResultLoadingView.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, gr0.a(searchResultLoadingView.getContext(), R.drawable.spr_search_no_results), (Drawable) null, (Drawable) null);
                        } else {
                            uhd0VarP4.L.setVisibility(8);
                            if (!firstSearchResult.getLive().isEmpty() && !firstSearchResult.getSportsLiveEventNum().isEmpty()) {
                                SearchLivePanel searchLivePanel2 = uhd0VarP4.H;
                                List<SportsEventNum> sportsLiveEventNum = firstSearchResult.getSportsLiveEventNum();
                                sportsLiveEventNum.getClass();
                                TabLayout tabLayout = searchLivePanel2.K;
                                if (tabLayout == null) {
                                    Intrinsics.n("sportTabLayout");
                                    throw null;
                                }
                                tabLayout.n();
                                ArrayList arrayList = new ArrayList(l48.r(sportsLiveEventNum, 10));
                                Iterator<T> it = sportsLiveEventNum.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((SportsEventNum) it.next()).getSportId());
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int size = arrayList.size();
                                int i3 = 0;
                                while (i3 < size) {
                                    Object obj2 = arrayList.get(i3);
                                    i3++;
                                    mfb0 mfb0VarE = lfb0.d().e((String) obj2);
                                    if (mfb0VarE != null) {
                                        arrayList2.add(mfb0VarE);
                                    }
                                }
                                int size2 = arrayList2.size();
                                int i4 = 0;
                                while (i4 < size2) {
                                    Object obj3 = arrayList2.get(i4);
                                    i4++;
                                    mfb0 mfb0Var = (mfb0) obj3;
                                    TabLayout.g gVarL = tabLayout.l();
                                    UiText uiTextC = mfb0Var.c();
                                    Context context2 = tabLayout.getContext();
                                    context2.getClass();
                                    gVarL.e(uiTextC.e(context2));
                                    gVarL.a = mfb0Var;
                                    tabLayout.b(gVarL);
                                }
                                SearchLivePanel searchLivePanel3 = uhd0VarP4.H;
                                Event event = (Event) CollectionsKt.firstOrNull(firstSearchResult.getLive());
                                String str = (event == null || (sport = event.sport) == null) ? null : sport.id;
                                TabLayout tabLayout2 = searchLivePanel3.K;
                                if (tabLayout2 == null) {
                                    Intrinsics.n("sportTabLayout");
                                    throw null;
                                }
                                if (str != null && !StringsKt.U(str)) {
                                    int childCount = tabLayout2.getChildCount();
                                    for (int i5 = 0; i5 < childCount; i5++) {
                                        TabLayout.g gVarK = tabLayout2.k(i5);
                                        if (gVarK != null) {
                                            Object obj4 = gVarK.a;
                                            mfb0 mfb0Var2 = obj4 instanceof mfb0 ? (mfb0) obj4 : null;
                                            if (!Intrinsics.g(mfb0Var2 != null ? mfb0Var2.getId() : null, str)) {
                                                gVarK = null;
                                            }
                                            if (gVarK != null) {
                                                tabLayout2.s(gVarK, true);
                                                break;
                                            }
                                        }
                                    }
                                }
                                searchFragment.m0(firstSearchResult.getLive(), false);
                            }
                            if (!firstSearchResult.getPreMatch().isEmpty() && !firstSearchResult.getSportsPreEventNum().isEmpty()) {
                                uhd0VarP4.Q.setVisibility(0);
                                uhd0VarP4.O.setVisibility(0);
                                uhd0VarP4.O.i(firstSearchResult.getSportsPreEventNum(), firstSearchResult.getPreMatch(), searchFragment.U);
                            }
                            ((br3) mmc.a(hp0.A, br3.class)).U().a(searchFragment.requireActivity(), true);
                        }
                    }
                } else if (lk50Var instanceof lk50.a) {
                    SearchResultLoadingView searchResultLoadingView2 = uhd0Var.L;
                    searchResultLoadingView2.setVisibility(0);
                    searchResultLoadingView2.b.setVisibility(8);
                    searchResultLoadingView2.c.setVisibility(8);
                    searchResultLoadingView2.a.setVisibility(0);
                    SearchResultsErrorView searchResultsErrorView = searchResultLoadingView2.a;
                    searchResultsErrorView.a.setVisibility(0);
                    TextView textView = searchResultsErrorView.b;
                    textView.setVisibility(0);
                    textView.setText(sn5.c(searchResultsErrorView, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                    searchResultsErrorView.c.setVisibility(0);
                    itf0.a.b(((lk50.a) lk50Var).a);
                }
                return Unit.a;
            }
        }));
        s0().d.f(getViewLifecycleOwner(), new d(new Function1() { // from class: lu70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lk50 lk50Var = (lk50) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                boolean z2 = lk50Var instanceof lk50.c;
                SearchFragment searchFragment = this.a;
                if (z2) {
                    searchFragment.m0((List) ((lk50.c) lk50Var).a, false);
                } else if (lk50Var instanceof lk50.a) {
                    searchFragment.m0(null, false);
                    itf0.a.b(((lk50.a) lk50Var).a);
                }
                return Unit.a;
            }
        }));
        final SearchPreMatchPanel searchPreMatchPanel2 = p0().O;
        s0().e.f(getViewLifecycleOwner(), new d(new ou70(searchPreMatchPanel2, 0)));
        ((of20) this.v.getValue()).D.f(getViewLifecycleOwner(), new d(new Function1() { // from class: pu70
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Market market;
                Market market2;
                Event event;
                e880 e880Var = (e880) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                if (e880Var != null) {
                    Selection selection = e880Var.a;
                    String str = (selection == null || (event = selection.a) == null) ? null : event.eventId;
                    String str2 = (selection == null || (market2 = selection.b) == null) ? null : market2.id;
                    SearchPreMatchPanel searchPreMatchPanel3 = searchPreMatchPanel2;
                    yw70 yw70Var = searchPreMatchPanel3.A;
                    if (yw70Var == null) {
                        Intrinsics.n("adapter");
                        throw null;
                    }
                    Iterator it = yw70Var.a.f.iterator();
                    while (it.hasNext()) {
                        jpc jpcVar = ((zf20) it.next()).b;
                        if (jpcVar instanceof ing) {
                            Event event2 = ((ing) jpcVar).a;
                            if (Intrinsics.g(str, event2.eventId)) {
                                for (Market market3 : event2.markets) {
                                    Selection selection2 = e880Var.a;
                                    boolean zG = Intrinsics.g((selection2 == null || (market = selection2.b) == null) ? null : market.specifier, market3.specifier);
                                    if (Intrinsics.g(market3.id, str2) && zG) {
                                        market3.update(e880Var.b);
                                        yw70 yw70Var2 = searchPreMatchPanel3.A;
                                        if (yw70Var2 == null) {
                                            Intrinsics.n("adapter");
                                            throw null;
                                        }
                                        yw70Var2.notifyDataSetChanged();
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                return Unit.a;
            }
        }));
        SearchLivePanel searchLivePanel2 = p0().H;
        b390 b390Var = q0().d;
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        g1i g1iVar4 = new g1i(zyh.a(b390Var, lifecycle3, bVar), new kv70(searchLivePanel2, null));
        ibs viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        kzh.d(g1iVar4, ebs.a(viewLifecycleOwner5.getLifecycle()));
        o0().m1(this);
        String stringExtra = requireActivity().getIntent().getStringExtra("key");
        if (stringExtra != null) {
            z0(stringExtra);
        }
    }

    public final uhd0 p0() {
        return (uhd0) this.f.a(this, V[0]);
    }

    public final rw70 q0() {
        return (rw70) this.z.getValue();
    }

    public final xhh0 r0() {
        xhh0 xhh0Var = this.J;
        if (xhh0Var != null) {
            return xhh0Var;
        }
        Intrinsics.n("upMarketTabUseCase");
        throw null;
    }

    public final n280 s0() {
        return (n280) this.i.getValue();
    }

    public final boolean t0() {
        xhh0 xhh0VarR0 = r0();
        mfb0 mfb0Var = this.R;
        whh0 whh0VarC = xhh0VarR0.c(this.S, mfb0Var != null ? mfb0Var.getId() : null, false);
        if (this.K != null) {
            return zhh0.a(whh0VarC).b == avy.a;
        }
        Intrinsics.n("upPageToggleStateUseCase");
        throw null;
    }

    public final void u0() {
        String str;
        uhd0 uhd0VarP0 = p0();
        BubbleView bubbleView = uhd0VarP0.i;
        BubbleView bubbleView2 = uhd0VarP0.z;
        jqu jquVarB = lqu.b(bubbleView);
        if (jquVarB == null) {
            jquVarB = lqu.b(bubbleView2);
        }
        sn20 sn20Var = (sn20) this.w.getValue();
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
        uhd0VarP0.i.setVisibility(8);
        bubbleView2.setVisibility(8);
    }

    public final void v0(avy avyVar, RegularMarketRule regularMarketRule, String str, boolean z2) {
        if (!wlc.a(r0().d(str, regularMarketRule != null ? regularMarketRule.a : null, z2))) {
            ((bsy) this.A.getValue()).C1(wuy.d, z2 ? uuy.a : uuy.b, vuy.b(avyVar));
            return;
        }
        xlc xlcVar = (xlc) this.C.getValue();
        lkf lkfVar = lkf.d;
        zjf zjfVar = zjf.a;
        xlcVar.x1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
    }

    public final void w0(avy avyVar, RegularMarketRule regularMarketRule, String str, boolean z2) {
        if (!wlc.a(r0().d(str, regularMarketRule != null ? regularMarketRule.a : null, z2))) {
            ((bsy) this.A.getValue()).D1(wuy.d, z2 ? uuy.a : uuy.b);
            return;
        }
        xlc xlcVar = (xlc) this.C.getValue();
        lkf lkfVar = lkf.d;
        zjf zjfVar = zjf.a;
        xlcVar.y1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
    }

    public final void y0(boolean z2) {
        uhd0 uhd0VarP0 = p0();
        uhd0VarP0.D.setVisibility(z2 ? 0 : 8);
        uhd0VarP0.b.setVisibility(z2 ? 0 : 8);
        uhd0VarP0.C.setVisibility(z2 ? 0 : 8);
    }

    public final void z0(String str) {
        ClearEditText clearEditText = p0().E;
        clearEditText.i = true;
        clearEditText.setText(str);
        clearEditText.setSelection(str.length());
    }
}
