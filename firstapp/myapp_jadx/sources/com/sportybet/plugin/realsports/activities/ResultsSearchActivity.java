package com.sportybet.plugin.realsports.activities;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ResultsSearchActivity;
import com.sportybet.plugin.realsports.results.ResultsClearEditText;
import com.sportybet.plugin.realsports.results.ResultsLoadingView;
import defpackage.a2m;
import defpackage.arr;
import defpackage.bmy;
import defpackage.cq40;
import defpackage.cyb;
import defpackage.egd0;
import defpackage.ej5;
import defpackage.fm50;
import defpackage.g1i;
import defpackage.gms;
import defpackage.gr0;
import defpackage.h5e;
import defpackage.jq40;
import defpackage.lop;
import defpackage.m2g;
import defpackage.o8i0;
import defpackage.om50;
import defpackage.pf;
import defpackage.pm50;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rm50;
import defpackage.s9s;
import defpackage.tm50;
import defpackage.uhc;
import defpackage.um50;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.vm50;
import defpackage.wwd0;
import defpackage.zyf0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/plugin/realsports/activities/ResultsSearchActivity;", "Lpy1;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResultsSearchActivity extends a2m {
    public static final /* synthetic */ int e = 0;
    public egd0 b;
    public fm50 c;
    public final q8i0 d = new q8i0(jq40.a(vm50.class), new c(), new b(), new d());

    public static final /* synthetic */ class a extends pf implements Function2<tm50, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tm50 tm50Var, v1b<? super Unit> v1bVar) {
            tm50 tm50Var2 = tm50Var;
            ResultsSearchActivity resultsSearchActivity = (ResultsSearchActivity) this.a;
            int i = ResultsSearchActivity.e;
            resultsSearchActivity.getClass();
            if (!Intrinsics.g(tm50Var2, tm50.d.a)) {
                if (Intrinsics.g(tm50Var2, tm50.e.a)) {
                    egd0 egd0Var = resultsSearchActivity.b;
                    if (egd0Var == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    egd0Var.f.d();
                } else if (tm50Var2 instanceof tm50.a) {
                    egd0 egd0Var2 = resultsSearchActivity.b;
                    if (egd0Var2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    egd0Var2.f.setVisibility(8);
                    fm50 fm50Var = resultsSearchActivity.c;
                    if (fm50Var != null) {
                        fm50Var.b = ((tm50.a) tm50Var2).a;
                        fm50Var.notifyDataSetChanged();
                    }
                } else if (Intrinsics.g(tm50Var2, tm50.b.a)) {
                    egd0 egd0Var3 = resultsSearchActivity.b;
                    if (egd0Var3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    egd0Var3.f.b();
                    fm50 fm50Var2 = resultsSearchActivity.c;
                    if (fm50Var2 != null) {
                        fm50Var2.b = m2g.a;
                        fm50Var2.notifyDataSetChanged();
                    }
                } else {
                    if (!(tm50Var2 instanceof tm50.c)) {
                        uhc.a();
                        return null;
                    }
                    zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                    egd0 egd0Var4 = resultsSearchActivity.b;
                    if (egd0Var4 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    egd0Var4.f.c();
                }
            }
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ResultsSearchActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ResultsSearchActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ResultsSearchActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1() {
        z1(false);
        egd0 egd0Var = this.b;
        if (egd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        Editable text = egd0Var.c.getText();
        String string = text != null ? text.toString() : null;
        fm50 fm50Var = this.c;
        if (fm50Var != null) {
            fm50Var.b = m2g.a;
            fm50Var.notifyDataSetChanged();
        }
        vm50 vm50Var = (vm50) this.d.getValue();
        rm50.a aVar = rm50.a;
        if (string == null) {
            string = "";
        }
        aVar.getClass();
        rm50 rm50VarA = rm50.a.a(string);
        wwd0 wwd0Var = vm50Var.c;
        if (rm50VarA == null) {
            wwd0Var.setValue(tm50.b.a);
        } else {
            wwd0Var.setValue(tm50.e.a);
            ej5.c(o8i0.d(vm50Var), null, null, new um50(vm50Var, rm50VarA, null), 3);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(32);
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_results_search, (ViewGroup) null, false);
        int i = R.id.results_cancel;
        TextView textView = (TextView) h5e.a(R.id.results_cancel, viewInflate);
        if (textView != null) {
            i = R.id.results_edit_text;
            ResultsClearEditText resultsClearEditText = (ResultsClearEditText) h5e.a(R.id.results_edit_text, viewInflate);
            if (resultsClearEditText != null) {
                i = R.id.results_hint_view;
                TextView textView2 = (TextView) h5e.a(R.id.results_hint_view, viewInflate);
                if (textView2 != null) {
                    i = R.id.results_search_icon;
                    ImageButton imageButton = (ImageButton) h5e.a(R.id.results_search_icon, viewInflate);
                    if (imageButton != null) {
                        i = R.id.results_search_loading_view;
                        ResultsLoadingView resultsLoadingView = (ResultsLoadingView) h5e.a(R.id.results_search_loading_view, viewInflate);
                        if (resultsLoadingView != null) {
                            i = R.id.results_search_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.results_search_recycler_view, viewInflate);
                            if (recyclerView != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                i = R.id.title_bar;
                                if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                    this.b = new egd0(relativeLayout, textView, resultsClearEditText, textView2, imageButton, resultsLoadingView, recyclerView, relativeLayout);
                                    setContentView(relativeLayout);
                                    egd0 egd0Var = this.b;
                                    if (egd0Var == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ResultsClearEditText resultsClearEditText2 = egd0Var.c;
                                    resultsClearEditText2.setClearDrawable(gr0.a(this, R.drawable.spr_close));
                                    resultsClearEditText2.setErrorView(egd0Var.d);
                                    egd0Var.e.setEnabled(false);
                                    egd0 egd0Var2 = this.b;
                                    if (egd0Var2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    RecyclerView recyclerView2 = egd0Var2.i;
                                    recyclerView2.setLayoutManager(new LinearLayoutManager());
                                    fm50 fm50Var = new fm50(this, m2g.a);
                                    this.c = fm50Var;
                                    recyclerView2.setAdapter(fm50Var);
                                    final egd0 egd0Var3 = this.b;
                                    if (egd0Var3 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    ResultsClearEditText resultsClearEditText3 = egd0Var3.c;
                                    egd0Var3.f.setOnClickListener(new View.OnClickListener() { // from class: km50
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = ResultsSearchActivity.e;
                                            this.a.A1();
                                        }
                                    });
                                    resultsClearEditText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: lm50
                                        @Override // android.widget.TextView.OnEditorActionListener
                                        public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                                            int i3 = ResultsSearchActivity.e;
                                            if (i2 != 6) {
                                                return false;
                                            }
                                            this.A1();
                                            lop.b(egd0Var3.c, Boolean.FALSE);
                                            return true;
                                        }
                                    });
                                    resultsClearEditText3.addTextChangedListener(new pm50(egd0Var3, this));
                                    resultsClearEditText3.setOnClickListener(new View.OnClickListener() { // from class: mm50
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = ResultsSearchActivity.e;
                                            this.a.z1(true);
                                        }
                                    });
                                    egd0Var3.e.setOnClickListener(new om50(new cq40(), this, egd0Var3));
                                    egd0Var3.b.setOnClickListener(new View.OnClickListener() { // from class: nm50
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            int i2 = ResultsSearchActivity.e;
                                            lop.b(egd0Var3.c, Boolean.FALSE);
                                            this.getOnBackPressedDispatcher().d();
                                        }
                                    });
                                    egd0Var3.v.setOnClickListener(new gms(1, this, egd0Var3));
                                    g1i g1iVar = new g1i(((vm50) this.d.getValue()).d, new a(2, this, ResultsSearchActivity.class, "handleUiState", "handleUiState(Lcom/sportybet/plugin/realsports/results/search/ResultsSearchUiState;)V", 4));
                                    s9s lifecycle = getLifecycle();
                                    lifecycle.getClass();
                                    arr.a(g1iVar, lifecycle, s9s.b.d);
                                    egd0 egd0Var4 = this.b;
                                    if (egd0Var4 != null) {
                                        lop.d(egd0Var4.c);
                                        return;
                                    } else {
                                        Intrinsics.n("binding");
                                        throw null;
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
        super.onDestroy();
        egd0 egd0Var = this.b;
        if (egd0Var != null) {
            lop.b(egd0Var.c, Boolean.FALSE);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        egd0 egd0Var = this.b;
        if (egd0Var != null) {
            lop.b(egd0Var.c, Boolean.FALSE);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void z1(boolean z) {
        egd0 egd0Var = this.b;
        if (z) {
            if (egd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            egd0Var.c.requestFocus();
            egd0 egd0Var2 = this.b;
            if (egd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            egd0Var2.c.setCursorVisible(true);
            egd0 egd0Var3 = this.b;
            if (egd0Var3 != null) {
                lop.c(egd0Var3.c);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (egd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        egd0Var.c.clearFocus();
        egd0 egd0Var4 = this.b;
        if (egd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        egd0Var4.c.setCursorVisible(false);
        egd0 egd0Var5 = this.b;
        if (egd0Var5 != null) {
            lop.b(egd0Var5.c, Boolean.FALSE);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
