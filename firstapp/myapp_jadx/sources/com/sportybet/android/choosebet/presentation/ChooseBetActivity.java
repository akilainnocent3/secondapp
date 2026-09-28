package com.sportybet.android.choosebet.presentation;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.widget.ProgressLoadingView;
import defpackage.arr;
import defpackage.bmy;
import defpackage.bn7;
import defpackage.cyb;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.g98;
import defpackage.h5e;
import defpackage.hm7;
import defpackage.hwr;
import defpackage.jm7;
import defpackage.jol;
import defpackage.jq40;
import defpackage.k00;
import defpackage.kbd0;
import defpackage.km7;
import defpackage.lm7;
import defpackage.mm7;
import defpackage.mpe0;
import defpackage.nm7;
import defpackage.nzm;
import defpackage.o8i0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.xm7;
import defpackage.zfd0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/choosebet/presentation/ChooseBetActivity;", "Lpy1;", "Lvym;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ChooseBetActivity extends jol implements vym, SwipeRefreshLayout.f {
    public static final /* synthetic */ int y = 0;
    public zfd0 b;
    public g98 d;
    public String e;
    public e i;
    public rdd0 v;
    public nzm w;
    public final q8i0 c = new q8i0(jq40.a(bn7.class), new b(), new a(), new c());
    public final mpe0 f = hwr.b(new Function0() { // from class: em7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = ChooseBetActivity.y;
            return Boolean.valueOf(this.a.getIntent().getBooleanExtra("key_show_publish_action", false));
        }
    });

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ChooseBetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChooseBetActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChooseBetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final boolean A1() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        bn7 bn7VarZ1 = z1();
        ej5.c(o8i0.d(bn7VarZ1), null, null, new xm7(bn7VarZ1, A1(), true, null), 3);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_choose, (ViewGroup) null, false);
        int i2 = R.id.btn_share_bet;
        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.btn_share_bet, viewInflate);
        if (progressButton != null) {
            i2 = R.id.choose_cancel;
            TextView textView = (TextView) h5e.a(R.id.choose_cancel, viewInflate);
            if (textView != null) {
                i2 = R.id.loading_view;
                LoadingView loadingView = (LoadingView) h5e.a(R.id.loading_view, viewInflate);
                if (loadingView != null) {
                    i2 = R.id.pg_loading;
                    ProgressLoadingView progressLoadingView = (ProgressLoadingView) h5e.a(R.id.pg_loading, viewInflate);
                    if (progressLoadingView != null) {
                        i2 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                        if (recyclerView != null) {
                            i2 = R.id.swipe_layout;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe_layout, viewInflate);
                            if (swipeRefreshLayout != null) {
                                i2 = R.id.top_layout;
                                if (((RelativeLayout) h5e.a(R.id.top_layout, viewInflate)) != null) {
                                    i2 = R.id.txt_select_hint;
                                    TextView textView2 = (TextView) h5e.a(R.id.txt_select_hint, viewInflate);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.b = new zfd0(constraintLayout, progressButton, textView, loadingView, progressLoadingView, recyclerView, swipeRefreshLayout, textView2);
                                        setContentView(constraintLayout);
                                        if (A1()) {
                                            rdd0 rdd0Var = this.v;
                                            if (rdd0Var == null) {
                                                Intrinsics.n("sportyTrackingUseCase");
                                                throw null;
                                            }
                                            rdd0Var.a(kbd0.a, k00.d);
                                        }
                                        zfd0 zfd0Var = this.b;
                                        if (zfd0Var == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        zfd0Var.i.setOnRefreshListener(this);
                                        zfd0 zfd0Var2 = this.b;
                                        if (zfd0Var2 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        zfd0Var2.d.setOnClickListener(new View.OnClickListener() { // from class: gm7
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i3 = ChooseBetActivity.y;
                                                ChooseBetActivity chooseBetActivity = this.a;
                                                bn7 bn7VarZ1 = chooseBetActivity.z1();
                                                ej5.c(o8i0.d(bn7VarZ1), null, null, new xm7(bn7VarZ1, chooseBetActivity.A1(), false, null), 3);
                                            }
                                        });
                                        zfd0 zfd0Var3 = this.b;
                                        if (zfd0Var3 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        zfd0Var3.b.setOnClickListener(new hm7(this, i));
                                        if (A1()) {
                                            zfd0 zfd0Var4 = this.b;
                                            if (zfd0Var4 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            zfd0Var4.v.setVisibility(8);
                                            zfd0 zfd0Var5 = this.b;
                                            if (zfd0Var5 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            zfd0Var5.b.setVisibility(8);
                                            zfd0 zfd0Var6 = this.b;
                                            if (zfd0Var6 == null) {
                                                Intrinsics.n("binding");
                                                throw null;
                                            }
                                            SwipeRefreshLayout swipeRefreshLayout2 = zfd0Var6.i;
                                            ViewGroup.LayoutParams layoutParams = swipeRefreshLayout2.getLayoutParams();
                                            if (layoutParams == null) {
                                                bmy.a("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                                return;
                                            }
                                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                                            layoutParams2.k = -1;
                                            layoutParams2.l = 0;
                                            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
                                            swipeRefreshLayout2.setLayoutParams(layoutParams2);
                                        }
                                        zfd0 zfd0Var7 = this.b;
                                        if (zfd0Var7 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        RecyclerView recyclerView2 = zfd0Var7.f;
                                        recyclerView2.setLayoutManager(new LinearLayoutManager());
                                        recyclerView2.setItemAnimator(null);
                                        zfd0 zfd0Var8 = this.b;
                                        if (zfd0Var8 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        zfd0Var8.c.setOnClickListener(new View.OnClickListener() { // from class: im7
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i3 = ChooseBetActivity.y;
                                                ChooseBetActivity chooseBetActivity = this.a;
                                                if (chooseBetActivity.A1()) {
                                                    rdd0 rdd0Var2 = chooseBetActivity.v;
                                                    if (rdd0Var2 == null) {
                                                        Intrinsics.n("sportyTrackingUseCase");
                                                        throw null;
                                                    }
                                                    rdd0Var2.a(qbd0.a, k00.d);
                                                }
                                                chooseBetActivity.finish();
                                            }
                                        });
                                        bn7 bn7VarZ1 = z1();
                                        ej5.c(o8i0.d(bn7VarZ1), null, null, new xm7(bn7VarZ1, A1(), false, null), 3);
                                        if (!A1()) {
                                            g1i g1iVar = new g1i(z1().z, new jm7(this, null));
                                            s9s lifecycle = getLifecycle();
                                            lifecycle.getClass();
                                            arr.a(g1iVar, lifecycle, s9s.b.d);
                                        }
                                        g1i g1iVar2 = new g1i(z1().i, new km7(this, null));
                                        s9s lifecycle2 = getLifecycle();
                                        lifecycle2.getClass();
                                        s9s.b bVar = s9s.b.d;
                                        arr.a(g1iVar2, lifecycle2, bVar);
                                        g1i g1iVar3 = new g1i(z1().w, new lm7(this, null));
                                        s9s lifecycle3 = getLifecycle();
                                        lifecycle3.getClass();
                                        arr.a(g1iVar3, lifecycle3, bVar);
                                        g1i g1iVar4 = new g1i(e1i.a(z1().d), new mm7(this, null));
                                        s9s lifecycle4 = getLifecycle();
                                        lifecycle4.getClass();
                                        arr.a(g1iVar4, lifecycle4, bVar);
                                        g1i g1iVar5 = new g1i(e1i.a(z1().e), new nm7(this, null));
                                        s9s lifecycle5 = getLifecycle();
                                        lifecycle5.getClass();
                                        arr.a(g1iVar5, lifecycle5, bVar);
                                        return;
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

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        g98 g98Var = this.d;
        if (g98Var != null) {
            g98Var.i();
        }
        this.d = null;
        super.onDestroy();
    }

    public final bn7 z1() {
        return (bn7) this.c.getValue();
    }
}
