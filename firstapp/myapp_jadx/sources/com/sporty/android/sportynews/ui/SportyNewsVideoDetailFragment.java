package com.sporty.android.sportynews.ui;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.media3.ui.PlayerView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sporty.android.sportynews.data.TagItem;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.alv;
import defpackage.azm;
import defpackage.bfb0;
import defpackage.bmy;
import defpackage.bo10;
import defpackage.c8i0;
import defpackage.cfx;
import defpackage.csc0;
import defpackage.cyb;
import defpackage.d630;
import defpackage.d7n;
import defpackage.e4m;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ey0;
import defpackage.few;
import defpackage.g1i;
import defpackage.g5e;
import defpackage.gew;
import defpackage.gfb0;
import defpackage.gzi0;
import defpackage.h5e;
import defpackage.huc0;
import defpackage.hwr;
import defpackage.i5d;
import defpackage.i6i0;
import defpackage.ibs;
import defpackage.iel;
import defpackage.ij90;
import defpackage.itf0;
import defpackage.iuc0;
import defpackage.iym;
import defpackage.j00;
import defpackage.jq40;
import defpackage.juc0;
import defpackage.jvd0;
import defpackage.k2d;
import defpackage.kpu;
import defpackage.kzh;
import defpackage.luc0;
import defpackage.lx5;
import defpackage.meb0;
import defpackage.mpe0;
import defpackage.mr7;
import defpackage.muc0;
import defpackage.ohp;
import defpackage.osa0;
import defpackage.psm;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sn5;
import defpackage.so10;
import defpackage.str;
import defpackage.su40;
import defpackage.tsc0;
import defpackage.ttr;
import defpackage.v340;
import defpackage.v8i0;
import defpackage.vj5;
import defpackage.w8i0;
import defpackage.x7l;
import defpackage.zeb0;
import defpackage.zyh;
import im.delight.android.webview.AdvancedWebView;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/sportynews/ui/SportyNewsVideoDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyNewsVideoDetailFragment extends e4m {
    public static final /* synthetic */ ohp<Object>[] X = {new d630(0, SportyNewsVideoDetailFragment.class, "binding", "getBinding()Lcom/sporty/android/sportyfm/databinding/SpmFragmentNewsVideoDetailBinding;")};
    public final mpe0 A;
    public androidx.media3.exoplayer.d B;
    public ImageView C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public str<String> G;
    public psm H;
    public iym I;
    public azm J;
    public gzi0 K;
    public String L;
    public boolean M;
    public boolean N;
    public int O;
    public float P;
    public boolean Q;
    public boolean R;
    public final mpe0 S;
    public final b T;
    public jvd0 U;
    public final c V;
    public final p W;
    public final i6i0 f;
    public final q8i0 i;
    public final q8i0 v;
    public final q8i0 w;
    public final cfx y;
    public final mpe0 z;

    /* JADX INFO: loaded from: classes2.dex */
    public static final /* synthetic */ class a extends saj implements Function1<View, meb0> {
        public static final a a = new a(1, meb0.class, "bind", "bind(Landroid/view/View;)Lcom/sporty/android/sportyfm/databinding/SpmFragmentNewsVideoDetailBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final meb0 invoke(View view) {
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
                        i = R.id.article_info;
                        TextView textView = (TextView) h5e.a(R.id.article_info, view2);
                        if (textView != null) {
                            i = R.id.article_share;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.article_share, view2);
                            if (appCompatImageView != null) {
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
                                                i = R.id.debug_text_view;
                                                TextView textView3 = (TextView) h5e.a(R.id.debug_text_view, view2);
                                                if (textView3 != null) {
                                                    i = R.id.detail_error_view;
                                                    View viewA3 = h5e.a(R.id.detail_error_view, view2);
                                                    if (viewA3 != null) {
                                                        zeb0 zeb0VarA = zeb0.a(viewA3);
                                                        i = R.id.detail_loading_view;
                                                        View viewA4 = h5e.a(R.id.detail_loading_view, view2);
                                                        if (viewA4 != null) {
                                                            bfb0 bfb0VarA = bfb0.a(viewA4);
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                                            i = R.id.nested_scroll_view;
                                                            NestedScrollView nestedScrollView = (NestedScrollView) h5e.a(R.id.nested_scroll_view, view2);
                                                            if (nestedScrollView != null) {
                                                                i = R.id.player_view;
                                                                PlayerView playerView = (PlayerView) h5e.a(R.id.player_view, view2);
                                                                if (playerView != null) {
                                                                    i = R.id.rv_recommend_articles;
                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rv_recommend_articles, view2);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.tag_list;
                                                                        TextView textView4 = (TextView) h5e.a(R.id.tag_list, view2);
                                                                        if (textView4 != null) {
                                                                            i = R.id.video_error_view;
                                                                            View viewA5 = h5e.a(R.id.video_error_view, view2);
                                                                            if (viewA5 != null) {
                                                                                gfb0 gfb0VarA = gfb0.a(viewA5);
                                                                                i = R.id.webview_article;
                                                                                AdvancedWebView advancedWebView = (AdvancedWebView) h5e.a(R.id.webview_article, view2);
                                                                                if (advancedWebView != null) {
                                                                                    return new meb0(constraintLayout, ij90VarA, appBarLayout, textView, appCompatImageView, textView2, viewA2, tabLayout, textView3, zeb0VarA, bfb0VarA, nestedScrollView, playerView, recyclerView, textView4, gfb0VarA, advancedWebView);
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
            bmy.a(qUnCRF.lRtMMYrcuEqVA.concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b implements mr7 {
        public b() {
        }

        @Override // defpackage.mr7
        public final void a(TagItem tagItem) {
            tagItem.getClass();
            ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = SportyNewsVideoDetailFragment.this;
            ((tsc0) sportyNewsVideoDetailFragment.v.getValue()).A.a(tagItem);
            Fragment fragmentG = sportyNewsVideoDetailFragment.requireActivity().getSupportFragmentManager().G(R.id.nav_host_fragment);
            if (fragmentG != null) {
                int iL = fragmentG.getChildFragmentManager().L();
                for (int i = 0; i < iL; i++) {
                    NavHostFragment.a.a(sportyNewsVideoDetailFragment).k();
                }
            }
        }

        @Override // defpackage.mr7
        public final void b(String str, String str2, boolean z) {
            str.getClass();
            ey0[] ey0VarArr = ey0.a;
            int i = Intrinsics.g(str2, "Article") ? R.id.video_detail_to_article_detail_fragment : R.id.video_detail_to_video_detail_fragment;
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = SportyNewsVideoDetailFragment.this;
            iym iymVar = sportyNewsVideoDetailFragment.I;
            if (iymVar == null) {
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
            iymVar.e(AnalyticsEvent.SOCIAL_NEWS_CARD_CLICK, kpu.f(new Pair("type", z ? AnalyticsParam.SOCIAL_NEWS_CARD_TYPE_HERO : AnalyticsParam.SOCIAL_NEWS_CARD_TYPE_REGULAR), new Pair("source", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_VIDEO)));
            NavHostFragment.a.a(sportyNewsVideoDetailFragment).f(i, vj5.a(new Pair("articleId", str), new Pair("type", str2), new Pair("tabIndex", Integer.valueOf(((Number) sportyNewsVideoDetailFragment.A.getValue()).intValue()))));
        }
    }

    public static final class c implements so10.c {
        public c() {
        }

        @Override // so10.c
        public final void I(androidx.media3.exoplayer.d dVar, so10.b bVar) {
            dVar.getClass();
            if (bVar.a.a.get(7)) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SPORTY_TV);
                aVar.a("onEvents: " + bVar, new Object[0]);
            }
        }

        @Override // so10.c
        public final void d0(int i, boolean z) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SPORTY_TV);
            aVar.d("onPlayerStateChanged: " + i, new Object[0]);
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = SportyNewsVideoDetailFragment.this;
            if (i == 3) {
                if (z) {
                    ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
                    sportyNewsVideoDetailFragment.n0().A.setControllerHideOnTouch(true);
                    sportyNewsVideoDetailFragment.n0().A.setControllerShowTimeoutMs(1000);
                }
                ohp<Object>[] ohpVarArr2 = SportyNewsVideoDetailFragment.X;
                if (sportyNewsVideoDetailFragment.getLifecycle().b().compareTo(s9s.b.d) >= 0) {
                    ibs viewLifecycleOwner = sportyNewsVideoDetailFragment.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    sportyNewsVideoDetailFragment.U = ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new luc0(sportyNewsVideoDetailFragment, null), 3);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            androidx.media3.exoplayer.d dVar = sportyNewsVideoDetailFragment.B;
            if (dVar == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            dVar.n0(5, 0L);
            androidx.media3.exoplayer.d dVar2 = sportyNewsVideoDetailFragment.B;
            if (dVar2 == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            dVar2.a();
            PlayerView playerView = sportyNewsVideoDetailFragment.n0().A;
            playerView.h(playerView.g());
        }

        @Override // so10.c
        public final void i(bo10 bo10Var) {
            bo10Var.getClass();
            ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = SportyNewsVideoDetailFragment.this;
            gfb0 gfb0Var = sportyNewsVideoDetailFragment.n0().D;
            gfb0Var.a.setVisibility(0);
            gfb0Var.b.setText(sn5.d(sportyNewsVideoDetailFragment, R.string.sporty_tv__live_streaming_is_unavailable, new Object[0]));
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SPORTY_TV);
            aVar.f(bo10Var, "onPlayerError", new Object[0]);
        }

        @Override // so10.c
        public final void q(int i) {
            ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = SportyNewsVideoDetailFragment.this;
            boolean z = false;
            sportyNewsVideoDetailFragment.n0().A.setUseController(i != 2);
            PlayerView playerView = sportyNewsVideoDetailFragment.n0().A;
            if (i != 1 && i != 4) {
                z = true;
            }
            playerView.setKeepScreenOn(z);
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyNewsVideoDetailFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyNewsVideoDetailFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyNewsVideoDetailFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyNewsVideoDetailFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyNewsVideoDetailFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyNewsVideoDetailFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class j implements Function0<Bundle> {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = SportyNewsVideoDetailFragment.this;
            Bundle arguments = sportyNewsVideoDetailFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(sportyNewsVideoDetailFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class k extends qlr implements Function0<Fragment> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SportyNewsVideoDetailFragment.this;
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

    public static final class o extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SportyNewsVideoDetailFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class p implements j00 {
        @Override // defpackage.j00
        public final void l(j00.a aVar, androidx.media3.common.a aVar2, i5d i5dVar) {
            aVar2.getClass();
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_SPORTY_TV);
            aVar3.a("onVideoInputFormatChanged, format:" + aVar2 + ", decoderReuseEvaluation:" + i5dVar, new Object[0]);
        }

        @Override // defpackage.j00
        public final void o(j00.a aVar, int i, long j) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SPORTY_TV);
            aVar2.a("onDroppedVideoFrames, droppedFrames:" + i + ", elapsedMs:" + j, new Object[0]);
        }
    }

    public SportyNewsVideoDetailFragment() {
        super(R.layout.spm_fragment_news_video_detail);
        this.f = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new l(new k()));
        this.i = new q8i0(jq40.a(csc0.class), new m(ttrVarA), new o(ttrVarA), new n(ttrVarA));
        this.v = new q8i0(jq40.a(tsc0.class), new d(), new f(), new e());
        this.w = new q8i0(jq40.a(alv.class), new g(), new i(), new h());
        this.y = new cfx(jq40.a(muc0.class), new j());
        this.z = hwr.b(new su40(this, 1));
        this.A = hwr.b(new d7n(this, 2));
        this.L = "";
        this.M = true;
        this.R = true;
        this.S = hwr.b(new k2d(1));
        this.T = new b();
        this.V = new c();
        this.W = new p();
    }

    public static String m0(long j2) {
        long j3 = j2 / 1000;
        long j4 = j3 % 60;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 / 3600;
        return j6 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)}, 3)) : String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j4)}, 2));
    }

    public final meb0 n0() {
        return (meb0) this.f.a(this, X[0]);
    }

    public final void o0(String str, boolean z) {
        zeb0 zeb0Var = n0().w;
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
        this.Q = true;
        androidx.media3.exoplayer.d dVar = this.B;
        if (dVar != null) {
            dVar.W(this.V);
            androidx.media3.exoplayer.d dVar2 = this.B;
            if (dVar2 == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            dVar2.J(this.W);
            androidx.media3.exoplayer.d dVar3 = this.B;
            if (dVar3 == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            dVar3.release();
        }
        jvd0 jvd0Var = this.U;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.Q = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        view.getClass();
        super.onViewCreated(view, bundle);
        meb0 meb0VarN0 = n0();
        ij90 ij90Var = meb0VarN0.b;
        ImageButton imageButton = ij90Var.e;
        int i3 = 1;
        imageButton.setOnClickListener(new few(this, i3));
        imageButton.setVisibility(0);
        ImageButton imageButton2 = ij90Var.c;
        imageButton2.setOnClickListener(new gew(this, i3));
        imageButton2.setVisibility(0);
        TextView textView = ij90Var.f;
        if (((alv) this.w.getValue()).v) {
            i2 = R.string.sporty_news__media_header_title;
        } else {
            psm psmVar = this.H;
            if (psmVar == null) {
                Intrinsics.n("countryManager");
                throw null;
            }
            i2 = psmVar.O() ? R.string.sporty_news__sporty_blog : R.string.sporty_news__tab_title;
        }
        textView.setText(sn5.c(textView, i2, new Object[0]));
        textView.setVisibility(0);
        ij90Var.b.setVisibility(0);
        meb0VarN0.B.setAdapter((x7l) this.S.getValue());
        v340 v340Var = ((tsc0) this.v.getValue()).c;
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        g1i g1iVar = new g1i(zyh.a(v340Var, lifecycle, s9s.b.d), new huc0(this, null));
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        kzh.d(g1iVar, ebs.a(viewLifecycleOwner.getLifecycle()));
        q8i0 q8i0Var = this.i;
        kzh.d(new g1i(((csc0) q8i0Var.getValue()).c, new iuc0(this, null)), ebs.a(getLifecycle()));
        kzh.d(new g1i(((csc0) q8i0Var.getValue()).e, new juc0(this, null)), ebs.a(getLifecycle()));
        ((csc0) q8i0Var.getValue()).x1((String) this.z.getValue());
    }

    public final void p0() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        meb0 meb0VarN0 = n0();
        if (this.N) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(0);
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
            }
            c8i0.k(this.O, meb0VarN0.A);
            c8i0.k(this.O, n0().D.a);
            ImageView imageView = this.C;
            if (imageView == null) {
                Intrinsics.n("fullScreenIcon");
                throw null;
            }
            imageView.setImageResource(R.drawable.spm_ic_enter_full_screen);
        } else {
            androidx.fragment.app.e activity3 = getActivity();
            if (activity3 != null && (window = activity3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(4102);
            }
            androidx.fragment.app.e activity4 = getActivity();
            if (activity4 != null) {
                activity4.setRequestedOrientation(0);
            }
            c8i0.h(meb0VarN0.A);
            c8i0.h(meb0VarN0.D.a);
            ImageView imageView2 = this.C;
            if (imageView2 == null) {
                Intrinsics.n("fullScreenIcon");
                throw null;
            }
            imageView2.setImageResource(R.drawable.spm_ic_exit_full_screen);
        }
        this.N = !this.N;
        osa0.a(this.N, ((alv) this.w.getValue()).d, null);
    }
}
