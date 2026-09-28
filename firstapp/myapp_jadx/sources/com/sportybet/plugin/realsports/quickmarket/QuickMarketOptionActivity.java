package com.sportybet.plugin.realsports.quickmarket;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.quickmarket.data.MarketItemResourceData;
import defpackage.aj30;
import defpackage.bmy;
import defpackage.cj30;
import defpackage.cyb;
import defpackage.di30;
import defpackage.g1i;
import defpackage.gi30;
import defpackage.h5e;
import defpackage.haj;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.kzh;
import defpackage.lfy;
import defpackage.ni30;
import defpackage.o8i0;
import defpackage.od;
import defpackage.oi30;
import defpackage.paj;
import defpackage.pi30;
import defpackage.py1;
import defpackage.q8i0;
import defpackage.qi30;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.ri30;
import defpackage.v8i0;
import defpackage.w28;
import defpackage.xi30;
import defpackage.xzh;
import defpackage.yi30;
import defpackage.yzh;
import defpackage.zch0;
import defpackage.zi30;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/plugin/realsports/quickmarket/QuickMarketOptionActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class QuickMarketOptionActivity extends py1 {
    public static final /* synthetic */ int B = 0;
    public od a;
    public di30 b;
    public GridLayoutManager d;
    public final q8i0 c = new q8i0(jq40.a(cj30.class), new c(), new b(), new d());
    public String e = "sr:sport:1";
    public String f = "1";
    public final int i = R.color.background_type2_primary;
    public final int v = R.color.absolute_type1;
    public final int w = R.drawable.quick_market_menu_line_divider;
    public final int y = R.color.absolute_type1;
    public final String z = "1";
    public final MarketItemResourceData A = new MarketItemResourceData(0, 0, 0, 7, null);

    public static final class a implements lfy, paj {
        public final /* synthetic */ w28 a;

        public a(w28 w28Var) {
            this.a = w28Var;
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

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return QuickMarketOptionActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return QuickMarketOptionActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return QuickMarketOptionActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: A1, reason: from getter */
    public int getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public String getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public MarketItemResourceData getA() {
        return this.A;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public int getV() {
        return this.v;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public int getW() {
        return this.w;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_quick_market, (ViewGroup) null, false);
        int i = R.id.add_quick_market_load_view;
        LoadingView loadingView = (LoadingView) h5e.a(R.id.add_quick_market_load_view, viewInflate);
        if (loadingView != null) {
            i = R.id.close_page;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.close_page, viewInflate);
            if (appCompatImageView != null) {
                i = R.id.market_menu_bg;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.market_menu_bg, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.quick_market_header_title;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.quick_market_header_title, viewInflate);
                    if (appCompatTextView != null) {
                        i = R.id.quick_market_left_guideline;
                        if (((Guideline) h5e.a(R.id.quick_market_left_guideline, viewInflate)) != null) {
                            i = R.id.quick_market_parent_guideline;
                            if (((Guideline) h5e.a(R.id.quick_market_parent_guideline, viewInflate)) != null) {
                                i = R.id.quick_market_recyclerView;
                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.quick_market_recyclerView, viewInflate);
                                if (recyclerView != null) {
                                    i = R.id.quick_market_top_guideline;
                                    if (((Guideline) h5e.a(R.id.quick_market_top_guideline, viewInflate)) != null) {
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                        od odVar = new od(constraintLayout2, loadingView, appCompatImageView, constraintLayout, appCompatTextView, recyclerView);
                                        setContentView(constraintLayout2);
                                        this.a = odVar;
                                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                                        this.e = String.valueOf(getIntent().getStringExtra("SELECT_SPORT_ID"));
                                        this.f = String.valueOf(getIntent().getStringExtra("SELECT_MARKET_ID"));
                                        od odVar2 = this.a;
                                        if (odVar2 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        odVar2.d.setBackgroundColor(getColor(getI()));
                                        od odVar3 = this.a;
                                        if (odVar3 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        odVar3.e.setTextColor(getColor(getV()));
                                        od odVar4 = this.a;
                                        if (odVar4 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        LoadingView loadingView2 = odVar4.b;
                                        ViewGroup.LayoutParams layoutParams = loadingView2.getProgressView().getLayoutParams();
                                        layoutParams.getClass();
                                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                                        layoutParams2.i = 0;
                                        layoutParams2.t = 0;
                                        layoutParams2.v = 0;
                                        layoutParams2.l = 0;
                                        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = zch0.b(getResources(), r.d.DEFAULT_SWIPE_ANIMATION_DURATION);
                                        loadingView2.getProgressView().setLayoutParams(layoutParams2);
                                        loadingView2.getEmptyView().setTextColor(getColor(getY()));
                                        int i2 = 2;
                                        loadingView2.getEmptyView().setMaxLines(2);
                                        loadingView2.getEmptyView().setMaxWidth(zch0.b(getResources(), 300));
                                        ViewGroup.LayoutParams layoutParams3 = loadingView2.getEmptyView().getLayoutParams();
                                        layoutParams3.getClass();
                                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                                        layoutParams4.i = 0;
                                        layoutParams4.t = 0;
                                        layoutParams4.v = 0;
                                        layoutParams4.l = 0;
                                        loadingView2.getEmptyView().setLayoutParams(layoutParams4);
                                        od odVar5 = this.a;
                                        if (odVar5 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        odVar5.c.setOnClickListener(new ni30(this, 0));
                                        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
                                        this.d = gridLayoutManager;
                                        gridLayoutManager.Z = new qi30(this);
                                        od odVar6 = this.a;
                                        if (odVar6 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        odVar6.a.setOnClickListener(new oi30(this, 0));
                                        od odVar7 = this.a;
                                        if (odVar7 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        odVar7.d.setOnClickListener(new pi30());
                                        String str = this.f;
                                        od odVar8 = this.a;
                                        if (odVar8 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        this.b = new di30(new ri30(this), str, getA());
                                        RecyclerView recyclerView2 = odVar8.f;
                                        recyclerView2.setItemAnimator(null);
                                        recyclerView2.setAdapter(this.b);
                                        recyclerView2.setLayoutManager(this.d);
                                        recyclerView2.i(new gi30(this, getW()));
                                        String str2 = this.e;
                                        q8i0 q8i0Var = this.c;
                                        cj30 cj30Var = (cj30) q8i0Var.getValue();
                                        String z = getZ();
                                        str2.getClass();
                                        z.getClass();
                                        jvd0 jvd0Var = cj30Var.d;
                                        if (jvd0Var != null) {
                                            jvd0Var.cancel((CancellationException) null);
                                        }
                                        cj30Var.d = kzh.d(new yzh(new xzh(new g1i(new xi30(cj30Var.a.f(str2, z)), new yi30(cj30Var, null)), new zi30(cj30Var, null)), new aj30(cj30Var, null)), o8i0.d(cj30Var));
                                        ((cj30) q8i0Var.getValue()).c.f(this, new a(new w28(this, i2)));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.b = null;
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        super.onPause();
    }

    /* JADX INFO: renamed from: z1, reason: from getter */
    public int getI() {
        return this.i;
    }
}
