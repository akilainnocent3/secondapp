package com.sporty.android.sportynews.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.sportynews.data.ArticleItem;
import com.sporty.android.sportynews.data.SubArticleList;
import com.sporty.android.sportynews.data.TagItem;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.a380;
import defpackage.a9l;
import defpackage.alv;
import defpackage.axs;
import defpackage.bfb0;
import defpackage.bmy;
import defpackage.cyb;
import defpackage.d4m;
import defpackage.d630;
import defpackage.dkv;
import defpackage.ebs;
import defpackage.esc0;
import defpackage.et7;
import defpackage.etc0;
import defpackage.ey0;
import defpackage.fce0;
import defpackage.fsc0;
import defpackage.ftc0;
import defpackage.g1i;
import defpackage.g5e;
import defpackage.gbn;
import defpackage.gs60;
import defpackage.h5e;
import defpackage.hsc0;
import defpackage.htc0;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.ibs;
import defpackage.iel;
import defpackage.isc0;
import defpackage.itc0;
import defpackage.iym;
import defpackage.j8l;
import defpackage.jq40;
import defpackage.jsc0;
import defpackage.jvd0;
import defpackage.kpu;
import defpackage.ksc0;
import defpackage.ku90;
import defpackage.kzh;
import defpackage.leb0;
import defpackage.lsc0;
import defpackage.mpe0;
import defpackage.mr7;
import defpackage.msc0;
import defpackage.nsc0;
import defpackage.o8i0;
import defpackage.ohp;
import defpackage.osc0;
import defpackage.ot6;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s6j0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.tsc0;
import defpackage.ttr;
import defpackage.u78;
import defpackage.uqm;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.w7l;
import defpackage.w8i0;
import defpackage.wb90;
import defpackage.wwd0;
import defpackage.x7l;
import defpackage.xtc0;
import defpackage.xzh;
import defpackage.yzh;
import defpackage.zeb0;
import defpackage.zyh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/sportynews/ui/SportyNewsListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyNewsListFragment extends d4m {
    public static final /* synthetic */ ohp<Object>[] R = {new d630(0, SportyNewsListFragment.class, "binding", "getBinding()Lcom/sporty/android/sportyfm/databinding/SpmFragmentNewsListBinding;")};
    public String A;
    public TagItem B;
    public String C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public Integer H;
    public ConstraintLayout I;
    public boolean J;
    public final HashSet<String> K;
    public gbn L;
    public uqm M;
    public iym N;
    public gs60 O;
    public final b P;
    public final fsc0 Q;
    public final i6i0 f;
    public final q8i0 i;
    public final q8i0 v;
    public final q8i0 w;
    public final mpe0 y;
    public final a380 z;

    /* JADX INFO: loaded from: classes2.dex */
    public static final /* synthetic */ class a extends saj implements Function1<View, leb0> {
        public static final a a = new a(1, leb0.class, "bind", "bind(Landroid/view/View;)Lcom/sporty/android/sportyfm/databinding/SpmFragmentNewsListBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final leb0 invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.app_bar_layout;
            AppBarLayout appBarLayout = (AppBarLayout) h5e.a(R.id.app_bar_layout, view2);
            if (appBarLayout != null) {
                i = R.id.category_tab_layout;
                TabLayout tabLayout = (TabLayout) h5e.a(R.id.category_tab_layout, view2);
                if (tabLayout != null) {
                    i = R.id.collapsing_toolbar_layout;
                    if (((CollapsingToolbarLayout) h5e.a(R.id.collapsing_toolbar_layout, view2)) != null) {
                        i = R.id.list_error_view;
                        View viewA = h5e.a(R.id.list_error_view, view2);
                        if (viewA != null) {
                            zeb0 zeb0VarA = zeb0.a(viewA);
                            i = R.id.list_loading_view;
                            View viewA2 = h5e.a(R.id.list_loading_view, view2);
                            if (viewA2 != null) {
                                bfb0 bfb0VarA = bfb0.a(viewA2);
                                i = R.id.program_layout;
                                if (((FrameLayout) h5e.a(R.id.program_layout, view2)) != null) {
                                    i = R.id.recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, view2);
                                    if (recyclerView != null) {
                                        i = R.id.swipe_to_refresh;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_to_refresh, view2);
                                        if (swipeRefreshLayout != null) {
                                            i = R.id.webview_livescore;
                                            WebView webView = (WebView) h5e.a(R.id.webview_livescore, view2);
                                            if (webView != null) {
                                                return new leb0((CoordinatorLayout) view2, appBarLayout, tabLayout, zeb0VarA, bfb0VarA, recyclerView, swipeRefreshLayout, webView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a(TEFcJcMqR.NYxfwxNPWodtcH.concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b implements mr7 {
        public b() {
        }

        @Override // defpackage.mr7
        public final void a(TagItem tagItem) {
            tagItem.getClass();
            SportyNewsListFragment sportyNewsListFragment = SportyNewsListFragment.this;
            if (Intrinsics.g(sportyNewsListFragment.B, tagItem)) {
                return;
            }
            sportyNewsListFragment.q0().A.a(tagItem);
        }

        @Override // defpackage.mr7
        public final void b(String str, String str2, boolean z) {
            str.getClass();
            ey0[] ey0VarArr = ey0.a;
            int i = Intrinsics.g(str2, "Article") ? R.id.news_to_article_detail_fragment : R.id.news_to_video_detail_fragment;
            SportyNewsListFragment sportyNewsListFragment = SportyNewsListFragment.this;
            iym iymVar = sportyNewsListFragment.N;
            if (iymVar == null) {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
            iymVar.e(AnalyticsEvent.SOCIAL_NEWS_CARD_CLICK, kpu.f(new Pair("type", z ? AnalyticsParam.SOCIAL_NEWS_CARD_TYPE_HERO : AnalyticsParam.SOCIAL_NEWS_CARD_TYPE_REGULAR), new Pair("source", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS)));
            NavHostFragment.a.a(sportyNewsListFragment).f(i, vj5.a(new Pair("articleId", str), new Pair("type", str2), new Pair("tabIndex", sportyNewsListFragment.H)));
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyNewsListFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyNewsListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyNewsListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyNewsListFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyNewsListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyNewsListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class i extends qlr implements Function0<Fragment> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SportyNewsListFragment.this;
        }
    }

    public static final class j extends qlr implements Function0<w8i0> {
        public final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.a = iVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class k extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class l extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
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

    public static final class m extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SportyNewsListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [fsc0] */
    public SportyNewsListFragment() {
        super(R.layout.spm_fragment_news_list);
        this.f = g5e.a(a.a);
        this.i = new q8i0(jq40.a(tsc0.class), new c(), new e(), new d());
        this.v = new q8i0(jq40.a(alv.class), new f(), new h(), new g());
        ttr ttrVarA = hwr.a(a1s.c, new j(new i()));
        this.w = new q8i0(jq40.a(dkv.class), new k(ttrVarA), new m(ttrVarA), new l(ttrVarA));
        this.y = hwr.b(new esc0());
        this.z = new a380();
        this.A = "";
        this.C = "";
        this.E = true;
        this.K = new HashSet<>();
        this.P = new b();
        this.Q = new Runnable() { // from class: fsc0
            @Override // java.lang.Runnable
            public final void run() {
                SportyNewsListFragment sportyNewsListFragment = this.a;
                if (sportyNewsListFragment.F || sportyNewsListFragment.C.length() <= 0) {
                    return;
                }
                sportyNewsListFragment.F = true;
                if (sportyNewsListFragment.B == null) {
                    sportyNewsListFragment.q0().x1(sportyNewsListFragment.A, sportyNewsListFragment.C);
                    return;
                }
                tsc0 tsc0VarQ0 = sportyNewsListFragment.q0();
                TagItem tagItem = sportyNewsListFragment.B;
                tsc0VarQ0.y1(String.valueOf(tagItem != null ? tagItem.getId() : null), sportyNewsListFragment.C);
            }
        };
    }

    public static void u0(TabLayout.g gVar) {
        View view;
        TextView textView = (gVar == null || (view = gVar.f) == null) ? null : (TextView) view.findViewById(R.id.tab_title);
        if (textView != null) {
            textView.setTypeface((gVar == null || !gVar.a()) ? Typeface.DEFAULT : Typeface.DEFAULT_BOLD);
        }
    }

    public final void m0() {
        p0().k();
        this.z.o();
        this.K.clear();
        this.C = "";
        this.D = 0;
        this.G = 0;
        this.E = false;
        this.F = false;
    }

    public final void n0() {
        Object value;
        wwd0 wwd0Var = q0().d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, u78.a.a));
        m0();
    }

    public final leb0 o0() {
        return (leb0) this.f.a(this, R[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        n0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.clear();
        }
        q8i0 q8i0Var = this.w;
        dkv dkvVar = (dkv) q8i0Var.getValue();
        dkvVar.a.m(this.H);
        dkv dkvVar2 = (dkv) q8i0Var.getValue();
        dkvVar2.b.m(this.B);
        this.J = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        iym iymVar = this.N;
        if (iymVar == null) {
            Intrinsics.n("openTelemetryLogger");
            throw null;
        }
        iymVar.d(AnalyticsEvent.SOCIAL_NEWS_VIEW);
        this.J = false;
        this.E = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        leb0 leb0VarO0 = o0();
        final SwipeRefreshLayout swipeRefreshLayout = leb0VarO0.i;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: gsc0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void i() {
                ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
                swipeRefreshLayout.setRefreshing(false);
                SportyNewsListFragment sportyNewsListFragment = this;
                sportyNewsListFragment.n0();
                if (sportyNewsListFragment.B == null) {
                    sportyNewsListFragment.q0().x1(sportyNewsListFragment.A, sportyNewsListFragment.C);
                    return;
                }
                tsc0 tsc0VarQ0 = sportyNewsListFragment.q0();
                TagItem tagItem = sportyNewsListFragment.B;
                tsc0VarQ0.y1(String.valueOf(tagItem != null ? tagItem.getId() : null), sportyNewsListFragment.C);
            }
        });
        RecyclerView recyclerView = leb0VarO0.f;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(p0());
        this.I = leb0VarO0.e.a;
        recyclerView.k(new hsc0(leb0VarO0, this));
        WebView webView = leb0VarO0.v;
        WebSettings settings = webView.getSettings();
        int i2 = 1;
        settings.setSupportZoom(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(true);
        settings.setSavePassword(false);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        gs60 gs60Var = this.O;
        if (gs60Var == null) {
            Intrinsics.n("safeWebViewClientFactory");
            throw null;
        }
        webView.setWebViewClient(gs60Var.a(q0().C, new isc0(this)));
        v340 v340Var = q0().c;
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        g1i g1iVar = new g1i(zyh.a(v340Var, lifecycle, bVar), new jsc0(this, null));
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        kzh.d(g1iVar, ebs.a(viewLifecycleOwner.getLifecycle()));
        v340 v340Var2 = q0().e;
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        g1i g1iVar2 = new g1i(zyh.a(v340Var2, lifecycle2, bVar), new ksc0(this, null));
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        kzh.d(g1iVar2, ebs.a(viewLifecycleOwner2.getLifecycle()));
        v340 v340Var3 = q0().i;
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        g1i g1iVar3 = new g1i(zyh.a(v340Var3, lifecycle3, bVar), new lsc0(this, null));
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        kzh.d(g1iVar3, ebs.a(viewLifecycleOwner3.getLifecycle()));
        ku90 ku90Var = q0().E;
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        g1i g1iVar4 = new g1i(zyh.a(ku90Var, lifecycle4, bVar), new msc0(this, null));
        ibs viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        kzh.d(g1iVar4, ebs.a(viewLifecycleOwner4.getLifecycle()));
        ku90 ku90Var2 = q0().B;
        s9s lifecycle5 = getLifecycle();
        lifecycle5.getClass();
        g1i g1iVar5 = new g1i(zyh.a(ku90Var2, lifecycle5, bVar), new nsc0(this, null));
        ibs viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        kzh.d(g1iVar5, ebs.a(viewLifecycleOwner5.getLifecycle()));
        v340 v340Var4 = q0().w;
        s9s lifecycle6 = getLifecycle();
        lifecycle6.getClass();
        g1i g1iVar6 = new g1i(zyh.a(v340Var4, lifecycle6, bVar), new osc0(this, null));
        ibs viewLifecycleOwner6 = getViewLifecycleOwner();
        viewLifecycleOwner6.getClass();
        kzh.d(g1iVar6, ebs.a(viewLifecycleOwner6.getLifecycle()));
        q8i0 q8i0Var = this.w;
        this.H = (Integer) ((dkv) q8i0Var.getValue()).a.d();
        this.B = (TagItem) ((dkv) q8i0Var.getValue()).b.d();
        if (this.H == null && Intrinsics.g(q0().c.a.getValue(), ot6.a.a)) {
            tsc0 tsc0VarQ0 = q0();
            xtc0 xtc0Var = tsc0VarQ0.a;
            et7 et7VarD = o8i0.d(tsc0VarQ0);
            wb90 wb90Var = new wb90(tsc0VarQ0, i2);
            xtc0Var.getClass();
            jvd0 jvd0Var = xtc0Var.b;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            xtc0Var.b = kzh.d(new g1i(new yzh(new xzh(new etc0(xtc0Var.a.c()), new ftc0(2, null)), new htc0(3, null)), new itc0(wb90Var, null)), et7VarD);
        }
    }

    public final x7l<a9l> p0() {
        return (x7l) this.y.getValue();
    }

    public final tsc0 q0() {
        return (tsc0) this.i.getValue();
    }

    public final void r0(boolean z) {
        leb0 leb0VarO0 = o0();
        leb0VarO0.i.setEnabled(!z);
        leb0VarO0.f.setVisibility(!z ? 0 : 8);
        leb0VarO0.v.setVisibility(z ? 0 : 8);
    }

    public final void s0(String str, boolean z, boolean z2) {
        leb0 leb0VarO0 = o0();
        TabLayout tabLayout = leb0VarO0.c;
        if (z && z2) {
            tabLayout.setVisibility(8);
        } else {
            tabLayout.setVisibility(0);
        }
        RecyclerView recyclerView = leb0VarO0.f;
        if (z) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
        }
        zeb0 zeb0Var = leb0VarO0.d;
        ConstraintLayout constraintLayout = zeb0Var.a;
        if (!z) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            zeb0Var.b.setText(str);
        }
    }

    public final void t0(SubArticleList subArticleList) {
        List<ArticleItem> articleList;
        a380 a380Var = this.z;
        if (subArticleList != null && (articleList = subArticleList.getArticleList()) != null) {
            for (ArticleItem articleItem : articleList) {
                if (!this.K.contains(articleItem.getId())) {
                    a380Var.m(new fce0(articleItem, this, this.P));
                }
            }
        }
        if (subArticleList == null || !subArticleList.getHasNextPage()) {
            a380Var.m(new s6j0());
            return;
        }
        axs axsVar = new axs();
        int iP = a380Var.p();
        a380Var.b = axsVar;
        ArrayList<w7l> arrayList = a380Var.c;
        int iP2 = a380Var.p();
        if (iP > 0) {
            a380Var.l(j8l.a(arrayList), iP);
        }
        if (iP2 > 0) {
            a380Var.k(j8l.a(arrayList), iP2);
        }
    }
}
