package com.sporty.android.sportytv.ui;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.ui.PlayerView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.sportytv.data.Program;
import com.sporty.android.sportytv.data.TvConfig;
import com.sporty.android.sportytv.ui.SportyTvFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.a55;
import defpackage.a9l;
import defpackage.afb0;
import defpackage.alv;
import defpackage.bmy;
import defpackage.bo10;
import defpackage.bqe;
import defpackage.bwf0;
import defpackage.c0x;
import defpackage.c230;
import defpackage.c8i0;
import defpackage.cyb;
import defpackage.d40;
import defpackage.e230;
import defpackage.f00;
import defpackage.g230;
import defpackage.gaj;
import defpackage.ged0;
import defpackage.gfb0;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hce0;
import defpackage.hed0;
import defpackage.hwr;
import defpackage.i5d;
import defpackage.ibs;
import defpackage.ied0;
import defpackage.iel;
import defpackage.iny;
import defpackage.itf0;
import defpackage.iym;
import defpackage.j00;
import defpackage.j8l;
import defpackage.jed0;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.knb0;
import defpackage.kpu;
import defpackage.lfy;
import defpackage.mpe0;
import defpackage.o4m;
import defpackage.oeb0;
import defpackage.osa0;
import defpackage.paj;
import defpackage.pid;
import defpackage.pxn;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.red0;
import defpackage.saj;
import defpackage.sn5;
import defpackage.so10;
import defpackage.ted0;
import defpackage.tf;
import defpackage.th50;
import defpackage.tit;
import defpackage.ttr;
import defpackage.ued0;
import defpackage.uqm;
import defpackage.uu30;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vyg;
import defpackage.w8i0;
import defpackage.x7l;
import defpackage.yeb0;
import defpackage.yxi0;
import defpackage.zad;
import defpackage.zf;
import defpackage.zi50;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/sportytv/ui/SportyTvFragment;", "Lwfd0;", "Loeb0;", "Ltit;", "<init>", "()V", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyTvFragment extends o4m<oeb0> implements tit {
    public final mpe0 A;
    public final q8i0 B;
    public final q8i0 C;
    public final q8i0 D;
    public androidx.media3.exoplayer.d E;
    public PlayerView F;
    public ConstraintLayout G;
    public ImageView H;
    public ImageView I;
    public TextView J;
    public ImageView K;
    public ConstraintLayout L;
    public ConstraintLayout M;
    public TabLayout N;
    public long O;
    public boolean P;
    public boolean Q;
    public int R;
    public List<String> S;
    public float T;
    public ued0 U;
    public yxi0 V;
    public final c W;
    public final r X;
    public final b Y;
    public final ged0 Z;
    public final hed0 a0;
    public final ied0 b0;
    public final jed0 c0;
    public uqm y;
    public iym z;

    public static final /* synthetic */ class a extends saj implements gaj<LayoutInflater, ViewGroup, Boolean, oeb0> {
        public static final a a = new a(3, oeb0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/sporty/android/sportyfm/databinding/SpmFragmentSportyTvBinding;", 0);

        @Override // defpackage.gaj
        public final oeb0 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            layoutInflater2.getClass();
            View viewInflate = layoutInflater2.inflate(R.layout.spm_fragment_sporty_tv, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.casting_program;
            TextView textView = (TextView) h5e.a(R.id.casting_program, viewInflate);
            if (textView != null) {
                i = R.id.date_tab_bottom_divider;
                View viewA = h5e.a(R.id.date_tab_bottom_divider, viewInflate);
                if (viewA != null) {
                    i = R.id.date_tab_layout;
                    TabLayout tabLayout = (TabLayout) h5e.a(R.id.date_tab_layout, viewInflate);
                    if (tabLayout != null) {
                        i = R.id.debug_text_view;
                        TextView textView2 = (TextView) h5e.a(R.id.debug_text_view, viewInflate);
                        if (textView2 != null) {
                            i = R.id.diver_line;
                            View viewA2 = h5e.a(R.id.diver_line, viewInflate);
                            if (viewA2 != null) {
                                i = R.id.fullscreen_loading;
                                View viewA3 = h5e.a(R.id.fullscreen_loading, viewInflate);
                                if (viewA3 != null) {
                                    afb0 afb0VarA = afb0.a(viewA3);
                                    i = R.id.guide;
                                    if (((TextView) h5e.a(R.id.guide, viewInflate)) != null) {
                                        i = R.id.list_error_view;
                                        View viewA4 = h5e.a(R.id.list_error_view, viewInflate);
                                        if (viewA4 != null) {
                                            int i2 = R.id.icon;
                                            if (((AppCompatImageView) h5e.a(R.id.icon, viewA4)) != null) {
                                                i2 = R.id.text;
                                                if (((TextView) h5e.a(R.id.text, viewA4)) != null) {
                                                    yeb0 yeb0Var = new yeb0((ConstraintLayout) viewA4);
                                                    i = R.id.list_loading_view;
                                                    View viewA5 = h5e.a(R.id.list_loading_view, viewInflate);
                                                    if (viewA5 != null) {
                                                        afb0 afb0VarA2 = afb0.a(viewA5);
                                                        i = R.id.on_now;
                                                        TextView textView3 = (TextView) h5e.a(R.id.on_now, viewInflate);
                                                        if (textView3 != null) {
                                                            i = R.id.player_view;
                                                            PlayerView playerView = (PlayerView) h5e.a(R.id.player_view, viewInflate);
                                                            if (playerView != null) {
                                                                i = R.id.program_layout;
                                                                if (((FrameLayout) h5e.a(R.id.program_layout, viewInflate)) != null) {
                                                                    i = R.id.program_title_bar;
                                                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.program_title_bar, viewInflate);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.share;
                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.share, viewInflate);
                                                                            if (appCompatImageView != null) {
                                                                                i = R.id.sporty_logo;
                                                                                if (((AppCompatImageView) h5e.a(R.id.sporty_logo, viewInflate)) != null) {
                                                                                    i = R.id.sporty_tv_logo;
                                                                                    if (((AppCompatImageView) h5e.a(R.id.sporty_tv_logo, viewInflate)) != null) {
                                                                                        i = R.id.swipe_to_refresh;
                                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_to_refresh, viewInflate);
                                                                                        if (swipeRefreshLayout != null) {
                                                                                            i = R.id.tv_guide_bar;
                                                                                            if (((ConstraintLayout) h5e.a(R.id.tv_guide_bar, viewInflate)) != null) {
                                                                                                i = R.id.tv_my_list;
                                                                                                TextView textView4 = (TextView) h5e.a(R.id.tv_my_list, viewInflate);
                                                                                                if (textView4 != null) {
                                                                                                    i = R.id.video_error_view;
                                                                                                    View viewA6 = h5e.a(R.id.video_error_view, viewInflate);
                                                                                                    if (viewA6 != null) {
                                                                                                        return new oeb0((ConstraintLayout) viewInflate, textView, viewA, tabLayout, textView2, viewA2, afb0VarA, yeb0Var, afb0VarA2, textView3, playerView, linearLayout, recyclerView, appCompatImageView, swipeRefreshLayout, textView4, gfb0.a(viewA6));
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
                                            bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i2)));
                                            return null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return null;
        }
    }

    public static final class b implements e230.a {
        public b() {
        }

        @Override // e230.a
        public final void a(String str) {
            str.getClass();
            ((c0x) SportyTvFragment.this.D.getValue()).z1(str);
        }

        @Override // e230.a
        public final void b(String str) {
            str.getClass();
            ((c0x) SportyTvFragment.this.D.getValue()).A1(str);
        }

        @Override // e230.a
        public final void c(View view) {
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
        public final void i(bo10 bo10Var) {
            bo10Var.getClass();
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SPORTY_TV);
            int i = bo10Var.a;
            aVar.f(bo10Var, hce0.a(i, "onPlayerError: "), new Object[0]);
            SportyTvFragment sportyTvFragment = SportyTvFragment.this;
            if (i == 1002) {
                androidx.media3.exoplayer.d dVar = sportyTvFragment.E;
                if (dVar == null) {
                    Intrinsics.n("exoPlayer");
                    throw null;
                }
                dVar.j();
                androidx.media3.exoplayer.d dVar2 = sportyTvFragment.E;
                if (dVar2 == null) {
                    Intrinsics.n("exoPlayer");
                    throw null;
                }
                dVar2.d();
                VB vb = sportyTvFragment.b;
                vb.getClass();
                ((oeb0) vb).E.a.setVisibility(8);
            } else {
                sportyTvFragment.v0(R.string.sporty_tv__live_streaming_is_unavailable);
            }
            try {
                zi50.a aVar2 = zi50.b;
                double dCurrentTimeMillis = System.currentTimeMillis() / 1000.0d;
                String strA = bo10Var.a();
                f00 f00Var = vgb0.a;
                vgb0.c("streaming_error", kpu.f(new Pair("error_code", strA), new Pair(AnalyticsParam.EVENT_PARAM_WATCH_TIME, Double.valueOf(dCurrentTimeMillis))), false);
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
        }

        @Override // so10.c
        public final void q(int i) {
            SportyTvFragment sportyTvFragment = SportyTvFragment.this;
            PlayerView playerView = sportyTvFragment.F;
            if (playerView == null) {
                Intrinsics.n("playerView");
                throw null;
            }
            boolean z = false;
            playerView.setUseController(i != 2);
            PlayerView playerView2 = sportyTvFragment.F;
            if (playerView2 == null) {
                Intrinsics.n("playerView");
                throw null;
            }
            if (i != 1 && i != 4) {
                z = true;
            }
            playerView2.setKeepScreenOn(z);
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

    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportyTvFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportyTvFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportyTvFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class h extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SportyTvFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class i extends qlr implements Function0<Fragment> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SportyTvFragment.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SportyTvFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class n extends qlr implements Function0<Fragment> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SportyTvFragment.this;
        }
    }

    public static final class o extends qlr implements Function0<w8i0> {
        public final /* synthetic */ n a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.a = nVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class p extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class q extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
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

    public static final class r implements j00 {
        @Override // defpackage.j00
        public final void l(j00.a aVar, androidx.media3.common.a aVar2, i5d i5dVar) {
            aVar2.getClass();
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_SPORTY_TV);
            aVar3.a("onVideoInputFormatChanged, format:" + aVar2 + ", decoderReuseEvaluation:" + i5dVar, new Object[0]);
            String strA = d40.a(aVar2.u, aVar2.v, "*");
            f00 f00Var = vgb0.a;
            vgb0.c("sporty_tv_resolution", jpu.b(new Pair(AnalyticsParam.EVENT_PARAM_RESOLUTION, strA)), false);
        }

        @Override // defpackage.j00
        public final void o(j00.a aVar, int i, long j) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SPORTY_TV);
            aVar2.a("onDroppedVideoFrames, droppedFrames:" + i + ", elapsedMs:" + j, new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [ged0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [hed0] */
    public SportyTvFragment() {
        super(a.a);
        this.A = hwr.b(new red0());
        i iVar = new i();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new j(iVar));
        this.B = new q8i0(jq40.a(g230.class), new k(ttrVarA), new m(ttrVarA), new l(ttrVarA));
        this.C = new q8i0(jq40.a(alv.class), new e(), new g(), new f());
        ttr ttrVarA2 = hwr.a(a1sVar, new o(new n()));
        this.D = new q8i0(jq40.a(c0x.class), new p(ttrVarA2), new h(ttrVarA2), new q(ttrVarA2));
        this.P = true;
        this.W = new c();
        this.X = new r();
        this.Y = new b();
        this.Z = new lfy() { // from class: ged0
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                SportyTvFragment sportyTvFragment = this.a;
                ConstraintLayout constraintLayout = sportyTvFragment.M;
                if (constraintLayout == null) {
                    Intrinsics.n("programListLoading");
                    throw null;
                }
                constraintLayout.setVisibility(lk50Var.equals(lk50.b.a) ? 0 : 8);
                if (lk50Var instanceof lk50.b) {
                    return;
                }
                if (lk50Var instanceof lk50.a) {
                    sportyTvFragment.z0(m2g.a);
                    return;
                }
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterable iterable = (Iterable) ((lk50.c) lk50Var).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    Program program = (Program) obj2;
                    if (program.getStartTime() <= jCurrentTimeMillis) {
                        if (program.getStartTime() < jCurrentTimeMillis) {
                            if (program.getDuration() + program.getStartTime() > jCurrentTimeMillis) {
                            }
                        }
                    }
                    arrayList.add(obj2);
                }
                sportyTvFragment.z0(arrayList);
            }
        };
        this.a0 = new lfy() { // from class: hed0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r16v10 */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r16v7, types: [java.lang.Throwable] */
            /* JADX WARN: Type inference failed for: r16v9 */
            @Override // defpackage.lfy
            public final void u1(Object obj) throws ParseException {
                ?? r16;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                SportyTvFragment sportyTvFragment = this.a;
                ConstraintLayout constraintLayout = sportyTvFragment.L;
                ViewGroup viewGroup = null;
                if (constraintLayout == null) {
                    Intrinsics.n("fullScreenLoading");
                    throw null;
                }
                boolean z = false;
                constraintLayout.setVisibility(lk50Var.equals(lk50.b.a) ? 0 : 8);
                if (lk50Var instanceof lk50.b) {
                    return;
                }
                if (lk50Var instanceof lk50.a) {
                    sportyTvFragment.v0(R.string.sporty_tv__live_streaming_is_unavailable);
                    sportyTvFragment.t0(false);
                    return;
                }
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return;
                }
                TvConfig tvConfig = (TvConfig) ((lk50.c) lk50Var).a;
                List<String> dates = tvConfig.getDates();
                boolean z2 = true;
                if (dates != null) {
                    sportyTvFragment.S = dates;
                    sportyTvFragment.t0(true);
                    TabLayout tabLayout = sportyTvFragment.N;
                    if (tabLayout == null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    tabLayout.a(new sed0(sportyTvFragment));
                    TabLayout tabLayout2 = sportyTvFragment.N;
                    if (tabLayout2 == null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    tabLayout2.n();
                    int i2 = 0;
                    for (Object obj2 : dates) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            ?? r17 = viewGroup;
                            b.q();
                            throw r17;
                        }
                        String str = (String) obj2;
                        boolean z3 = i2 == 0 ? z2 : z;
                        View viewInflate = LayoutInflater.from(sportyTvFragment.requireContext()).inflate(R.layout.spm_tab_date, viewGroup, z);
                        int i4 = R.id.date;
                        TextView textView = (TextView) h5e.a(R.id.date, viewInflate);
                        if (textView != null) {
                            i4 = R.id.week_day;
                            TextView textView2 = (TextView) h5e.a(R.id.week_day, viewInflate);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                ViewGroup viewGroup2 = viewGroup;
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE", Locale.getDefault());
                                SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("d MMM", Locale.getDefault());
                                Date date = simpleDateFormat.parse(str);
                                if (date != null) {
                                    if (z3) {
                                        textView2.setText(sn5.d(sportyTvFragment, R.string.common_dates__today, new Object[0]));
                                    } else {
                                        textView2.setText(simpleDateFormat2.format(date));
                                    }
                                    textView.setText(simpleDateFormat3.format(date));
                                }
                                TabLayout.g gVarL = tabLayout.l();
                                gVarL.c(constraintLayout2);
                                gVarL.a = str;
                                tabLayout.b(gVarL);
                                i2 = i3;
                                z2 = true;
                                z = false;
                                viewGroup = viewGroup2;
                            }
                        }
                        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return;
                    }
                    ViewGroup viewGroup3 = viewGroup;
                    r16 = viewGroup3;
                    if (!dates.isEmpty()) {
                        tabLayout.s(tabLayout.k(0), true);
                        r16 = viewGroup3;
                    }
                } else {
                    r16 = 0;
                }
                String streamUrl = tvConfig.getStreamUrl();
                if (streamUrl == null || StringsKt.U(streamUrl)) {
                    sportyTvFragment.v0(R.string.sporty_tv__unavailable_in_your_region);
                    return;
                }
                String streamUrl2 = tvConfig.getStreamUrl();
                if (streamUrl2 == null) {
                    sportyTvFragment.v0(R.string.sporty_tv__unavailable_in_your_region);
                    return;
                }
                yxi0 yxi0Var = sportyTvFragment.V;
                if (yxi0Var != null) {
                    yxi0Var.b();
                }
                HlsMediaSource.Factory factory = new HlsMediaSource.Factory(new idd.a());
                factory.j = true;
                factory.i = new gec();
                HlsMediaSource hlsMediaSourceB = factory.b(njv.b(streamUrl2));
                d dVar = sportyTvFragment.E;
                if (dVar == null) {
                    Intrinsics.n("exoPlayer");
                    throw r16;
                }
                dVar.I0(hlsMediaSourceB);
                d dVar2 = sportyTvFragment.E;
                if (dVar2 == null) {
                    Intrinsics.n("exoPlayer");
                    throw r16;
                }
                dVar2.d();
            }
        };
        this.b0 = new ied0();
        this.c0 = new jed0();
    }

    public static String q0() {
        String str = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(new Date());
        str.getClass();
        return str;
    }

    public final void C0(TabLayout.g gVar, boolean z) {
        int i2 = z ? R.color.brand_secondary : R.color.white_70;
        Resources resources = getResources();
        ThreadLocal<TypedValue> threadLocal = th50.a;
        int color = resources.getColor(i2, null);
        View view = gVar.f;
        if (view != null) {
            ((TextView) view.findViewById(R.id.week_day)).setTextColor(color);
            ((TextView) view.findViewById(R.id.date)).setTextColor(color);
        }
    }

    @Override // defpackage.wfd0
    public final void j0() {
        ((c0x) this.D.getValue()).C1(false);
    }

    @Override // defpackage.wfd0
    public final void m0() {
        ((c0x) this.D.getValue()).C1(true);
    }

    @Override // defpackage.wfd0, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        p0();
        androidx.media3.exoplayer.d dVar = this.E;
        if (dVar != null) {
            dVar.W(this.W);
            androidx.media3.exoplayer.d dVar2 = this.E;
            if (dVar2 == null) {
                Intrinsics.n("exoPlayer");
                throw null;
            }
            dVar2.J(this.X);
            yxi0 yxi0Var = this.V;
            if (yxi0Var != null) {
                yxi0Var.a();
            }
            this.V = null;
            androidx.media3.exoplayer.d dVar3 = this.E;
            if (dVar3 != null) {
                dVar3.release();
            } else {
                Intrinsics.n("exoPlayer");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        androidx.media3.exoplayer.d dVar = this.E;
        if (dVar != null) {
            dVar.n(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        iym iymVar = this.z;
        if (iymVar == null) {
            Intrinsics.n("openTelemetryLogger");
            throw null;
        }
        iymVar.d(AnalyticsEvent.SOCIAL_SPORTY_247_VIEW);
        androidx.media3.exoplayer.d dVar = this.E;
        if (dVar != null) {
            dVar.n(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        uqm uqmVar = this.y;
        if (uqmVar == null) {
            Intrinsics.n("accountHelper");
            throw null;
        }
        if (uqmVar.isLogin()) {
            u0();
            return;
        }
        uqm uqmVar2 = this.y;
        if (uqmVar2 != null) {
            uqmVar2.demandAccount(requireActivity(), this);
        } else {
            Intrinsics.n("accountHelper");
            throw null;
        }
    }

    public final void p0() {
        itf0.a aVar = itf0.a;
        aVar.q("tag_timer");
        aVar.a("refreshTimer is cancelled", new Object[0]);
        ued0 ued0Var = this.U;
        if (ued0Var != null) {
            synchronized (ued0Var) {
                ued0Var.d = true;
                ued0Var.e.removeMessages(1);
            }
        }
    }

    public final x7l<a9l> r0() {
        return (x7l) this.A.getValue();
    }

    public final g230 s0() {
        return (g230) this.B.getValue();
    }

    public final void t0(boolean z) {
        TabLayout tabLayout = this.N;
        if (tabLayout == null) {
            Intrinsics.n("tabLayout");
            throw null;
        }
        tabLayout.setVisibility(z ? 0 : 8);
        VB vb = this.b;
        vb.getClass();
        ((oeb0) vb).c.setVisibility(z ? 0 : 8);
    }

    public final void u0() {
        pid.d dVar;
        iny onBackPressedDispatcher;
        VB vb = this.b;
        vb.getClass();
        oeb0 oeb0Var = (oeb0) vb;
        this.L = oeb0Var.f.a;
        this.M = oeb0Var.v.a;
        this.G = oeb0Var.E.a;
        this.F = oeb0Var.y;
        this.N = oeb0Var.d;
        final SwipeRefreshLayout swipeRefreshLayout = oeb0Var.C;
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(R.color.black_80);
        swipeRefreshLayout.setColorSchemeResources(R.color.white_70);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: ked0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void i() {
                boolean z = false;
                swipeRefreshLayout.setRefreshing(false);
                SportyTvFragment sportyTvFragment = this;
                TabLayout tabLayout = sportyTvFragment.N;
                if (tabLayout == null) {
                    Intrinsics.n("tabLayout");
                    throw null;
                }
                if (tabLayout.getTabCount() != 0) {
                    TabLayout tabLayout2 = sportyTvFragment.N;
                    if (tabLayout2 == null) {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                    TabLayout.g gVarK = tabLayout2.k(0);
                    Object obj = gVarK != null ? gVarK.a : null;
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        Date date = new Date();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        z = !str.equals(bwf0.l(date, "yyyy-MM-dd", locale, 0, 0));
                    }
                    if (!z) {
                        TabLayout.g gVarK2 = tabLayout.k(tabLayout.getSelectedTabPosition());
                        Object obj2 = gVarK2 != null ? gVarK2.a : null;
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 != null) {
                            sportyTvFragment.s0().A1(SportyTvFragment.q0(), str2);
                            return;
                        }
                        return;
                    }
                }
                sportyTvFragment.s0().z1(SportyTvFragment.q0());
            }
        });
        oeb0Var.B.setOnClickListener(new View.OnClickListener() { // from class: fed0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context = this.a.getContext();
                if (context != null) {
                    q090.a(context, "");
                }
            }
        });
        oeb0Var.z.setOnClickListener(new View.OnClickListener() { // from class: led0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportyTvFragment sportyTvFragment = this.a;
                TabLayout tabLayout = sportyTvFragment.N;
                if (tabLayout == null) {
                    Intrinsics.n("tabLayout");
                    throw null;
                }
                if (tabLayout.getTabCount() == 0) {
                    return;
                }
                TabLayout tabLayout2 = sportyTvFragment.N;
                if (tabLayout2 == null) {
                    Intrinsics.n("tabLayout");
                    throw null;
                }
                int selectedTabPosition = tabLayout2.getSelectedTabPosition();
                TabLayout tabLayout3 = sportyTvFragment.N;
                if (selectedTabPosition > 0) {
                    if (tabLayout3 != null) {
                        tabLayout3.s(tabLayout3.k(0), true);
                        return;
                    } else {
                        Intrinsics.n("tabLayout");
                        throw null;
                    }
                }
                if (tabLayout3 == null) {
                    Intrinsics.n("tabLayout");
                    throw null;
                }
                TabLayout.g gVarK = tabLayout3.k(0);
                Object obj = gVarK != null ? gVarK.a : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    sportyTvFragment.s0().A1(SportyTvFragment.q0(), str);
                }
            }
        });
        RecyclerView recyclerView = oeb0Var.A;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(r0());
        r0().registerAdapterDataObserver(new uu30(recyclerView, oeb0Var.i.a));
        PlayerView playerView = this.F;
        if (playerView == null) {
            Intrinsics.n("playerView");
            throw null;
        }
        playerView.setShowBuffering(2);
        ProgressBar progressBar = (ProgressBar) playerView.findViewById(R.id.exo_buffering);
        if (progressBar != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(c8i0.c(R.color.white_70, progressBar)));
        }
        View viewFindViewById = playerView.findViewById(R.id.exo_fullscreen_icon);
        viewFindViewById.getClass();
        this.H = (ImageView) viewFindViewById;
        View viewFindViewById2 = playerView.findViewById(R.id.exo_volume_icon);
        viewFindViewById2.getClass();
        this.K = (ImageView) viewFindViewById2;
        View viewFindViewById3 = playerView.findViewById(R.id.live_casting);
        viewFindViewById3.getClass();
        this.I = (ImageView) viewFindViewById3;
        View viewFindViewById4 = playerView.findViewById(R.id.live_label);
        viewFindViewById4.getClass();
        this.J = (TextView) viewFindViewById4;
        oeb0Var.D.setOnClickListener(new View.OnClickListener() { // from class: med0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavHostFragment.a.a(this.a).f(R.id.to_my_sporty_list_fragment, null);
            }
        });
        g230 g230VarS0 = s0();
        g230VarS0.z.f(getViewLifecycleOwner(), this.Z);
        g230VarS0.w.f(getViewLifecycleOwner(), this.a0);
        g230VarS0.A.f(getViewLifecycleOwner(), this.b0);
        g230VarS0.B.f(getViewLifecycleOwner(), this.c0);
        c0x c0xVar = (c0x) this.D.getValue();
        int i2 = 1;
        c0xVar.A.f(getViewLifecycleOwner(), new d(new a55(this, i2)));
        c0xVar.C.f(getViewLifecycleOwner(), new d(new pxn(this, i2)));
        Context contextRequireContext = requireContext();
        Context applicationContext = contextRequireContext == null ? null : contextRequireContext.getApplicationContext();
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
        zad zadVar = new zad(applicationContext, map);
        pid pidVar = new pid(requireContext(), new zf.b(5000));
        synchronized (pidVar.c) {
            dVar = pidVar.f;
        }
        dVar.getClass();
        pid.d.a aVar = new pid.d.a(dVar);
        aVar.l();
        aVar.l = 2;
        pidVar.g(new pid.d(aVar));
        androidx.media3.exoplayer.c.k(1000, 0, "bufferForPlaybackMs", "0");
        androidx.media3.exoplayer.c.k(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        androidx.media3.exoplayer.c.k(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        androidx.media3.exoplayer.c.k(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        androidx.media3.exoplayer.c.k(50000, 50000, "maxBufferMs", "minBufferMs");
        androidx.media3.exoplayer.c cVar = new androidx.media3.exoplayer.c(new tf(1));
        ExoPlayer.b bVar = new ExoPlayer.b(requireContext());
        bVar.c(cVar);
        bVar.d(pidVar);
        bVar.b(zadVar);
        androidx.media3.exoplayer.d dVarA = bVar.a();
        this.E = dVarA;
        dVarA.D(this.W);
        androidx.media3.exoplayer.d dVar2 = this.E;
        if (dVar2 == null) {
            Intrinsics.n("exoPlayer");
            throw null;
        }
        dVar2.M(this.X);
        androidx.media3.exoplayer.d dVar3 = this.E;
        if (dVar3 == null) {
            Intrinsics.n("exoPlayer");
            throw null;
        }
        yxi0 yxi0Var = new yxi0(dVar3, new Function1() { // from class: ned0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer num = (Integer) obj;
                num.getClass();
                iym iymVar = this.a.z;
                if (iymVar != null) {
                    iymVar.e(AnalyticsEvent.SOCIAL_SPORTY_247_WATCH_TIME, jpu.b(new Pair(AnalyticsParam.EVENT_PARAM_WATCH_TIME, num)));
                    return Unit.a;
                }
                Intrinsics.n("openTelemetryLogger");
                throw null;
            }
        });
        yxi0Var.b();
        this.V = yxi0Var;
        this.R = (int) ((bqe.d() * 9) / 16.0f);
        PlayerView playerView2 = this.F;
        if (playerView2 == null) {
            Intrinsics.n("playerView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = playerView2.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = this.R;
        PlayerView playerView3 = this.F;
        if (playerView3 == null) {
            Intrinsics.n("playerView");
            throw null;
        }
        playerView3.setLayoutParams(layoutParams);
        PlayerView playerView4 = this.F;
        if (playerView4 == null) {
            Intrinsics.n("playerView");
            throw null;
        }
        playerView4.findViewById(R.id.exo_fullscreen_button).setOnClickListener(new View.OnClickListener() { // from class: oed0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w0();
            }
        });
        playerView4.findViewById(R.id.exo_volume_button).setOnClickListener(new View.OnClickListener() { // from class: ped0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportyTvFragment sportyTvFragment = this.a;
                boolean z = sportyTvFragment.P;
                d dVar4 = sportyTvFragment.E;
                if (z) {
                    if (dVar4 == null) {
                        Intrinsics.n("exoPlayer");
                        throw null;
                    }
                    dVar4.S0();
                    sportyTvFragment.T = dVar4.c0;
                    d dVar5 = sportyTvFragment.E;
                    if (dVar5 == null) {
                        Intrinsics.n("exoPlayer");
                        throw null;
                    }
                    dVar5.L(0.0f);
                    ImageView imageView = sportyTvFragment.K;
                    if (imageView == null) {
                        Intrinsics.n("volumeIcon");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.spm_ic_volume_off);
                } else {
                    if (dVar4 == null) {
                        Intrinsics.n("exoPlayer");
                        throw null;
                    }
                    dVar4.L(sportyTvFragment.T);
                    ImageView imageView2 = sportyTvFragment.K;
                    if (imageView2 == null) {
                        Intrinsics.n("volumeIcon");
                        throw null;
                    }
                    imageView2.setImageResource(R.drawable.spm_ic_volume_on);
                }
                sportyTvFragment.P = !sportyTvFragment.P;
            }
        });
        playerView4.findViewById(R.id.exo_play_pause).setOnClickListener(new View.OnClickListener() { // from class: qed0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d dVar4 = this.a.E;
                if (dVar4 != null) {
                    dVar4.n(!dVar4.Q());
                } else {
                    Intrinsics.n("exoPlayer");
                    throw null;
                }
            }
        });
        androidx.media3.exoplayer.d dVar4 = this.E;
        if (dVar4 == null) {
            Intrinsics.n("exoPlayer");
            throw null;
        }
        playerView4.setPlayer(dVar4);
        playerView4.setResizeMode(2);
        ImageView imageView = this.H;
        if (imageView == null) {
            Intrinsics.n("fullScreenIcon");
            throw null;
        }
        imageView.setImageResource(R.drawable.spm_ic_enter_full_screen);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            onBackPressedDispatcher.a(viewLifecycleOwner, new ted0(this));
        }
        s0().z1(q0());
    }

    public final void v0(int i2) {
        VB vb = this.b;
        vb.getClass();
        gfb0 gfb0Var = ((oeb0) vb).E;
        gfb0Var.a.setVisibility(0);
        gfb0Var.b.setText(sn5.d(this, i2, new Object[0]));
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        if (account != null) {
            u0();
        } else {
            requireActivity().finish();
        }
    }

    public final void w0() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        if (this.Q) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(0);
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.setRequestedOrientation(1);
            }
            PlayerView playerView = this.F;
            if (playerView == null) {
                Intrinsics.n("playerView");
                throw null;
            }
            c8i0.k(this.R, playerView);
            ConstraintLayout constraintLayout = this.G;
            if (constraintLayout == null) {
                Intrinsics.n("videoErrorView");
                throw null;
            }
            c8i0.k(this.R, constraintLayout);
            ImageView imageView = this.H;
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
            PlayerView playerView2 = this.F;
            if (playerView2 == null) {
                Intrinsics.n("playerView");
                throw null;
            }
            c8i0.h(playerView2);
            ConstraintLayout constraintLayout2 = this.G;
            if (constraintLayout2 == null) {
                Intrinsics.n("videoErrorView");
                throw null;
            }
            c8i0.h(constraintLayout2);
            ImageView imageView2 = this.H;
            if (imageView2 == null) {
                Intrinsics.n("fullScreenIcon");
                throw null;
            }
            imageView2.setImageResource(R.drawable.spm_ic_exit_full_screen);
        }
        boolean z = this.Q;
        this.Q = !z;
        ImageView imageView3 = this.I;
        if (imageView3 == null) {
            Intrinsics.n("liveCastingIcon");
            throw null;
        }
        imageView3.setVisibility(!z ? 0 : 8);
        TextView textView = this.J;
        if (textView == null) {
            Intrinsics.n("liveLabel");
            throw null;
        }
        textView.setVisibility((!this.Q || System.currentTimeMillis() >= this.O) ? 8 : 0);
        osa0.a(this.Q, ((alv) this.C.getValue()).d, null);
    }

    public final void y0(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(AnalyticsParam.EVENT_PARAM_RESULT, z);
        bundle.putString(AnalyticsParam.EVENT_PARAM_ID, str);
        r0().notifyItemRangeChanged(0, j8l.a(r0().a), bundle);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    public final void z0(List<Program> list) {
        boolean z;
        r0().k();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            Program program = (Program) obj;
            List<String> list2 = this.S;
            boolean z2 = true;
            if (list2 != null) {
                Date date = new Date(program.getStartTime());
                Locale locale = Locale.getDefault();
                locale.getClass();
                if (bwf0.l(date, "yyyy-MM-dd", locale, 0, 0).equals(CollectionsKt.T(list2)) && i2 == 0) {
                    String title = program.getTitle();
                    VB vb = this.b;
                    vb.getClass();
                    oeb0 oeb0Var = (oeb0) vb;
                    oeb0Var.w.setVisibility(0);
                    TextView textView = oeb0Var.b;
                    textView.setVisibility(0);
                    textView.setText(title);
                    if (program.isLive()) {
                        this.O = program.getDuration() + program.getStartTime();
                    }
                    long startTime = list.size() >= 2 ? list.get(1).getStartTime() - System.currentTimeMillis() : list.size() == 1 ? list.get(0).getDuration() : 0L;
                    if (startTime > 0) {
                        ued0 ued0Var = new ued0(startTime, this);
                        this.U = ued0Var;
                        synchronized (ued0Var) {
                            ued0Var.d = false;
                            if (ued0Var.a <= 0) {
                                ued0Var.a();
                            } else {
                                ued0Var.c = SystemClock.elapsedRealtime() + ued0Var.a;
                                knb0.a aVar = ued0Var.e;
                                aVar.sendMessage(aVar.obtainMessage(1));
                            }
                        }
                        itf0.a aVar2 = itf0.a;
                        aVar2.q("tag_timer");
                        aVar2.a("refreshTimer is starting", new Object[0]);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            e230 e230Var = new e230(program, z, this.Y);
            if (i2 != 0) {
                z2 = false;
            }
            vyg vygVar = new vyg(e230Var, z2);
            vygVar.m(new c230(program, z));
            arrayList.add(vygVar);
            i2 = i3;
        }
        r0().j(arrayList);
        VB vb2 = this.b;
        vb2.getClass();
        ((oeb0) vb2).A.o0(0);
    }
}
