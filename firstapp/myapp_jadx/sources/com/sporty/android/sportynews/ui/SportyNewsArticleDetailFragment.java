package com.sporty.android.sportynews.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.sportynews.data.TagItem;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.alv;
import defpackage.asc0;
import defpackage.azm;
import defpackage.bfb0;
import defpackage.bmy;
import defpackage.bw00;
import defpackage.c1d;
import defpackage.c4m;
import defpackage.cfx;
import defpackage.csc0;
import defpackage.cyb;
import defpackage.d630;
import defpackage.ebs;
import defpackage.ey0;
import defpackage.g1i;
import defpackage.g5e;
import defpackage.gzi0;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.ibs;
import defpackage.iel;
import defpackage.ij90;
import defpackage.iym;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.keb0;
import defpackage.kpu;
import defpackage.kzh;
import defpackage.lx5;
import defpackage.mpe0;
import defpackage.mr7;
import defpackage.ohp;
import defpackage.orc0;
import defpackage.psm;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sn5;
import defpackage.str;
import defpackage.tsc0;
import defpackage.ttr;
import defpackage.urc0;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.vrc0;
import defpackage.w8i0;
import defpackage.wrc0;
import defpackage.x7l;
import defpackage.zeb0;
import defpackage.zyh;
import im.delight.android.webview.AdvancedWebView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/sportynews/ui/SportyNewsArticleDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyNewsArticleDetailFragment extends c4m {
    public static final /* synthetic */ ohp<Object>[] N = {new d630(0, SportyNewsArticleDetailFragment.class, "binding", "getBinding()Lcom/sporty/android/sportyfm/databinding/SpmFragmentNewsDetailBinding;")};
    public final mpe0 A;
    public final mpe0 B;
    public jvd0 C;
    public jvd0 D;
    public str<String> E;
    public psm F;
    public iym G;
    public azm H;
    public gzi0 I;
    public String J;
    public boolean K;
    public boolean L;
    public final b M;
    public final i6i0 f;
    public final q8i0 i;
    public final q8i0 v;
    public final q8i0 w;
    public final cfx y;
    public final mpe0 z;

    public static final /* synthetic */ class a extends saj implements Function1<View, keb0> {
        public static final a a = new a(1, keb0.class, "bind", "bind(Landroid/view/View;)Lcom/sporty/android/sportyfm/databinding/SpmFragmentNewsDetailBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final keb0 invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.action_bar_container;
            View viewA = h5e.a(R.id.action_bar_container, view2);
            if (viewA != null) {
                ij90 ij90VarA = ij90.a(viewA);
                i = R.id.app_bar_layout;
                AppBarLayout appBarLayout = (AppBarLayout) h5e.a(R.id.app_bar_layout, view2);
                if (appBarLayout != null) {
                    i = R.id.article_bottom_container;
                    if (((ConstraintLayout) h5e.a(R.id.article_bottom_container, view2)) != null) {
                        i = R.id.article_image;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.article_image, view2);
                        if (appCompatImageView != null) {
                            i = R.id.article_info;
                            TextView textView = (TextView) h5e.a(R.id.article_info, view2);
                            if (textView != null) {
                                i = R.id.article_share;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.article_share, view2);
                                if (appCompatImageView2 != null) {
                                    i = R.id.article_title;
                                    TextView textView2 = (TextView) h5e.a(R.id.article_title, view2);
                                    if (textView2 != null) {
                                        i = R.id.bottom_spacer;
                                        View viewA2 = h5e.a(R.id.bottom_spacer, view2);
                                        if (viewA2 != null) {
                                            i = R.id.category_tab_layout;
                                            TabLayout tabLayout = (TabLayout) h5e.a(R.id.category_tab_layout, view2);
                                            if (tabLayout != null) {
                                                i = R.id.collapsing_toolbar_layout;
                                                if (((CollapsingToolbarLayout) h5e.a(R.id.collapsing_toolbar_layout, view2)) != null) {
                                                    i = R.id.detail_error_view;
                                                    View viewA3 = h5e.a(R.id.detail_error_view, view2);
                                                    if (viewA3 != null) {
                                                        zeb0 zeb0VarA = zeb0.a(viewA3);
                                                        i = R.id.detail_loading_view;
                                                        View viewA4 = h5e.a(R.id.detail_loading_view, view2);
                                                        if (viewA4 != null) {
                                                            bfb0 bfb0VarA = bfb0.a(viewA4);
                                                            i = R.id.nested_scroll_view;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) h5e.a(R.id.nested_scroll_view, view2);
                                                            if (nestedScrollView != null) {
                                                                i = R.id.overlay_image;
                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.overlay_image, view2);
                                                                if (appCompatImageView3 != null) {
                                                                    i = R.id.rv_recommend_articles;
                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rv_recommend_articles, view2);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.tag_list;
                                                                        TextView textView3 = (TextView) h5e.a(R.id.tag_list, view2);
                                                                        if (textView3 != null) {
                                                                            i = R.id.webview_article;
                                                                            AdvancedWebView advancedWebView = (AdvancedWebView) h5e.a(R.id.webview_article, view2);
                                                                            if (advancedWebView != null) {
                                                                                return new keb0((ConstraintLayout) view2, ij90VarA, appBarLayout, appCompatImageView, textView, appCompatImageView2, textView2, viewA2, tabLayout, zeb0VarA, bfb0VarA, nestedScrollView, appCompatImageView3, recyclerView, textView3, advancedWebView);
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

    public static final class b implements mr7 {
        public b() {
        }

        @Override // defpackage.mr7
        public final void a(TagItem tagItem) {
            tagItem.getClass();
            ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
            SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = SportyNewsArticleDetailFragment.this;
            ((tsc0) sportyNewsArticleDetailFragment.v.getValue()).A.a(tagItem);
            Fragment fragmentG = sportyNewsArticleDetailFragment.requireActivity().getSupportFragmentManager().G(R.id.nav_host_fragment);
            if (fragmentG != null) {
                int iL = fragmentG.getChildFragmentManager().L();
                for (int i = 0; i < iL; i++) {
                    NavHostFragment.a.a(sportyNewsArticleDetailFragment).k();
                }
            }
        }

        @Override // defpackage.mr7
        public final void b(String str, String str2, boolean z) {
            str.getClass();
            ey0[] ey0VarArr = ey0.a;
            int i = Intrinsics.g(str2, "Article") ? R.id.article_detail_to_article_detail_fragment : R.id.article_detail_to_video_detail_fragment;
            SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = SportyNewsArticleDetailFragment.this;
            iym iymVar = sportyNewsArticleDetailFragment.G;
            if (iymVar == null) {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
            iymVar.e(AnalyticsEvent.SOCIAL_NEWS_CARD_CLICK, kpu.f(new Pair("type", z ? AnalyticsParam.SOCIAL_NEWS_CARD_TYPE_HERO : AnalyticsParam.SOCIAL_NEWS_CARD_TYPE_REGULAR), new Pair("source", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_ARTICLE)));
            NavHostFragment.a.a(sportyNewsArticleDetailFragment).f(i, vj5.a(new Pair("articleId", str), new Pair("type", str2), new Pair("tabIndex", Integer.valueOf(((Number) sportyNewsArticleDetailFragment.A.getValue()).intValue()))));
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyNewsArticleDetailFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyNewsArticleDetailFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyNewsArticleDetailFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyNewsArticleDetailFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyNewsArticleDetailFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyNewsArticleDetailFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class i implements Function0<Bundle> {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = SportyNewsArticleDetailFragment.this;
            Bundle arguments = sportyNewsArticleDetailFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(sportyNewsArticleDetailFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class j extends qlr implements Function0<Fragment> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SportyNewsArticleDetailFragment.this;
        }
    }

    public static final class k extends qlr implements Function0<w8i0> {
        public final /* synthetic */ j a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.a = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class l extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class m extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
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

    public static final class n extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SportyNewsArticleDetailFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public SportyNewsArticleDetailFragment() {
        super(R.layout.spm_fragment_news_detail);
        this.f = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new k(new j()));
        this.i = new q8i0(jq40.a(csc0.class), new l(ttrVarA), new n(ttrVarA), new m(ttrVarA));
        this.v = new q8i0(jq40.a(tsc0.class), new c(), new e(), new d());
        this.w = new q8i0(jq40.a(alv.class), new f(), new h(), new g());
        this.y = new cfx(jq40.a(asc0.class), new i());
        int i2 = 1;
        this.z = hwr.b(new c1d(this, i2));
        this.A = hwr.b(new bw00(this, i2));
        this.B = hwr.b(new orc0());
        this.J = "";
        this.L = true;
        this.M = new b();
    }

    public final keb0 m0() {
        return (keb0) this.f.a(this, N[0]);
    }

    public final void n0(String str, boolean z) {
        zeb0 zeb0Var = m0().y;
        ConstraintLayout constraintLayout = zeb0Var.a;
        if (!z) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            zeb0Var.b.setText(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.K = true;
        jvd0 jvd0Var = this.C;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        jvd0 jvd0Var2 = this.D;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.K = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        view.getClass();
        super.onViewCreated(view, bundle);
        keb0 keb0VarM0 = m0();
        ij90 ij90Var = keb0VarM0.b;
        ImageButton imageButton = ij90Var.e;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: prc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
                NavHostFragment.a.a(this.a).j();
            }
        });
        imageButton.setVisibility(0);
        ImageButton imageButton2 = ij90Var.c;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: qrc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
                this.a.requireActivity().finish();
            }
        });
        imageButton2.setVisibility(0);
        TextView textView = ij90Var.f;
        if (((alv) this.w.getValue()).v) {
            i2 = R.string.sporty_news__media_header_title;
        } else {
            psm psmVar = this.F;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            i2 = psmVar.O() ? R.string.sporty_news__sporty_blog : R.string.sporty_news__tab_title;
        }
        textView.setText(sn5.c(textView, i2, new Object[0]));
        textView.setVisibility(0);
        ij90Var.b.setVisibility(0);
        keb0VarM0.C.setAdapter((x7l) this.B.getValue());
        v340 v340Var = ((tsc0) this.v.getValue()).c;
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        g1i g1iVar = new g1i(zyh.a(v340Var, lifecycle, s9s.b.d), new urc0(this, null));
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        kzh.d(g1iVar, ebs.a(viewLifecycleOwner.getLifecycle()));
        q8i0 q8i0Var = this.i;
        kzh.d(new g1i(((csc0) q8i0Var.getValue()).c, new vrc0(this, null)), ebs.a(getLifecycle()));
        kzh.d(new g1i(((csc0) q8i0Var.getValue()).e, new wrc0(this, null)), ebs.a(getLifecycle()));
        ((csc0) q8i0Var.getValue()).x1((String) this.z.getValue());
    }
}
