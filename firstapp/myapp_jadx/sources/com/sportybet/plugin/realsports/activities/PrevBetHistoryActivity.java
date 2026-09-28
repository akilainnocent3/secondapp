package com.sportybet.plugin.realsports.activities;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity;
import com.sportybet.plugin.realsports.data.ROrder;
import com.sportybet.plugin.realsports.widget.NavigationBarLoadingView;
import defpackage.bm50;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.cgd0;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.gsc;
import defpackage.h5e;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.jvd0;
import defpackage.kgb0;
import defpackage.kzh;
import defpackage.lk50;
import defpackage.lq1;
import defpackage.m0m;
import defpackage.m850;
import defpackage.nr30;
import defpackage.o8i0;
import defpackage.pr30;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qp2;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.sp20;
import defpackage.tje0;
import defpackage.tp20;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.up20;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.xjx;
import defpackage.y5b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportybet/plugin/realsports/activities/PrevBetHistoryActivity;", "Lpy1;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PrevBetHistoryActivity extends m0m implements View.OnClickListener {
    public static final /* synthetic */ int i = 0;
    public lq1 b;
    public cgd0 c;
    public int d = 10;
    public final q8i0 e = new q8i0(jq40.a(sp20.class), new c(), new b(), new d());
    public pr30 f;

    @c0d(c = "com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity$loadAllNew$1", f = "PrevBetHistoryActivity.kt", l = {79}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity$loadAllNew$1$1", f = "PrevBetHistoryActivity.kt", l = {80}, m = "invokeSuspend", v = 2)
        public static final class C0421a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ PrevBetHistoryActivity b;
            public final /* synthetic */ String c;

            /* JADX INFO: renamed from: com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.activities.PrevBetHistoryActivity$loadAllNew$1$1$1", f = "PrevBetHistoryActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C0422a extends tje0 implements Function2<Pair<? extends lk50<? extends ROrder>, ? extends String>, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ PrevBetHistoryActivity b;
                public final /* synthetic */ String c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0422a(PrevBetHistoryActivity prevBetHistoryActivity, String str, v1b<? super C0422a> v1bVar) {
                    super(2, v1bVar);
                    this.b = prevBetHistoryActivity;
                    this.c = str;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C0422a c0422a = new C0422a(this.b, this.c, v1bVar);
                    c0422a.a = obj;
                    return c0422a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Pair<? extends lk50<? extends ROrder>, ? extends String> pair, v1b<? super Unit> v1bVar) {
                    return ((C0422a) create(pair, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    Pair pair = (Pair) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    lk50 lk50Var = (lk50) pair.a;
                    String str = (String) pair.b;
                    boolean z = lk50Var instanceof lk50.b;
                    PrevBetHistoryActivity prevBetHistoryActivity = this.b;
                    if (z) {
                        cgd0 cgd0Var = prevBetHistoryActivity.c;
                        if (cgd0Var == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        cgd0Var.c.d();
                    } else if (lk50Var instanceof lk50.c) {
                        cgd0 cgd0Var2 = prevBetHistoryActivity.c;
                        if (cgd0Var2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        NavigationBarLoadingView navigationBarLoadingView = cgd0Var2.c;
                        if (navigationBarLoadingView.getVisibility() == 0) {
                            navigationBarLoadingView.setVisibility(8);
                        }
                        List<RealBetHistoryOrderDto> list = ((ROrder) ((lk50.c) lk50Var).a).entityList;
                        if (list == null || list.isEmpty()) {
                            cgd0 cgd0Var3 = prevBetHistoryActivity.c;
                            if (cgd0Var3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            NavigationBarLoadingView navigationBarLoadingView2 = cgd0Var3.c;
                            String cMSString = prevBetHistoryActivity.getCMSString(R.string.bet_history__no_tickets_available, new Object[0]);
                            navigationBarLoadingView2.setVisibility(0);
                            navigationBarLoadingView2.b.setVisibility(8);
                            navigationBarLoadingView2.a.setVisibility(8);
                            navigationBarLoadingView2.w.setText(cMSString);
                            navigationBarLoadingView2.e.setVisibility(8);
                            navigationBarLoadingView2.w.setVisibility(0);
                            navigationBarLoadingView2.f.setVisibility(0);
                            navigationBarLoadingView2.d.setVisibility(0);
                            xjx xjxVar = new xjx();
                            for (int childCount = navigationBarLoadingView2.d.getChildCount() - 1; childCount >= 0; childCount--) {
                                navigationBarLoadingView2.d.getChildAt(childCount).setOnClickListener(xjxVar);
                            }
                            navigationBarLoadingView2.b();
                            return Unit.a;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new qp2());
                        arrayList.addAll(kgb0.g(0L, list));
                        RealBetHistoryOrderDto realBetHistoryOrderDto = (RealBetHistoryOrderDto) CollectionsKt.b0(list);
                        nr30 nr30Var = new nr30();
                        nr30Var.f = realBetHistoryOrderDto.getOrderId();
                        Long createTime = realBetHistoryOrderDto.getCreateTime();
                        nr30Var.g = createTime != null ? createTime.longValue() : 0L;
                        nr30Var.e = this.c;
                        nr30Var.d = prevBetHistoryActivity.d;
                        nr30Var.a = list.size() == 10;
                        nr30Var.h = arrayList.size() >= 10;
                        arrayList.add(nr30Var);
                        pr30 pr30Var = prevBetHistoryActivity.f;
                        if (pr30Var == null) {
                            pr30 pr30Var2 = new pr30();
                            pr30Var2.b = new SparseArray<>();
                            pr30Var2.c = prevBetHistoryActivity;
                            pr30Var2.a = arrayList;
                            pr30Var2.e = str;
                            pr30Var2.d = true;
                            prevBetHistoryActivity.f = pr30Var2;
                            cgd0 cgd0Var4 = prevBetHistoryActivity.c;
                            if (cgd0Var4 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            cgd0Var4.d.setAdapter(pr30Var2);
                        } else {
                            pr30Var.d = true;
                            pr30Var.a = arrayList;
                            pr30Var.notifyDataSetChanged();
                        }
                    } else {
                        if (!(lk50Var instanceof lk50.a)) {
                            uhc.a();
                            return null;
                        }
                        Throwable th = ((lk50.a) lk50Var).a;
                        if (!(th instanceof SprThrowable)) {
                            th = null;
                        }
                        SprThrowable sprThrowable = (SprThrowable) th;
                        if (sprThrowable != null) {
                            int d = sprThrowable.getD();
                            if (d == 19411 || d == 19413) {
                                cgd0 cgd0Var5 = prevBetHistoryActivity.c;
                                if (cgd0Var5 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                NavigationBarLoadingView navigationBarLoadingView3 = cgd0Var5.c;
                                String e = sprThrowable.getE();
                                navigationBarLoadingView3.setVisibility(0);
                                navigationBarLoadingView3.b.setVisibility(8);
                                navigationBarLoadingView3.a.setVisibility(0);
                                navigationBarLoadingView3.a.a(e, null, "");
                                navigationBarLoadingView3.c.setVisibility(8);
                                navigationBarLoadingView3.i.setVisibility(8);
                                navigationBarLoadingView3.v.setVisibility(8);
                                navigationBarLoadingView3.d.setVisibility(8);
                                navigationBarLoadingView3.e.setVisibility(8);
                            }
                        } else {
                            cgd0 cgd0Var6 = prevBetHistoryActivity.c;
                            if (cgd0Var6 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            cgd0Var6.c.c();
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421a(PrevBetHistoryActivity prevBetHistoryActivity, String str, v1b<? super C0421a> v1bVar) {
                super(2, v1bVar);
                this.b = prevBetHistoryActivity;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0421a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0421a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = PrevBetHistoryActivity.i;
                    PrevBetHistoryActivity prevBetHistoryActivity = this.b;
                    v340 v340Var = ((sp20) prevBetHistoryActivity.e.getValue()).v;
                    C0422a c0422a = new C0422a(prevBetHistoryActivity, this.c, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c0422a, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return PrevBetHistoryActivity.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s.b bVar = s9s.b.d;
                String str = this.c;
                PrevBetHistoryActivity prevBetHistoryActivity = PrevBetHistoryActivity.this;
                C0421a c0421a = new C0421a(prevBetHistoryActivity, str, null);
                this.a = 1;
                if (m850.b(prevBetHistoryActivity, bVar, c0421a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
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
            return PrevBetHistoryActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PrevBetHistoryActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PrevBetHistoryActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        v.getClass();
        if (v.getId() == R.id.back_icon) {
            finish();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_prev_bet_history_acitivity, (ViewGroup) null, false);
        int i2 = R.id.back_icon;
        ImageButton imageButton = (ImageButton) h5e.a(R.id.back_icon, viewInflate);
        if (imageButton != null) {
            i2 = R.id.back_title;
            if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                i2 = R.id.loading_view;
                NavigationBarLoadingView navigationBarLoadingView = (NavigationBarLoadingView) h5e.a(R.id.loading_view, viewInflate);
                if (navigationBarLoadingView != null) {
                    i2 = R.id.recycler;
                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler, viewInflate);
                    if (recyclerView != null) {
                        i2 = R.id.title_bar;
                        if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.c = new cgd0(linearLayout, imageButton, navigationBarLoadingView, recyclerView);
                            setContentView(linearLayout);
                            this.d = getIntent().getIntExtra("SETTLED", 10);
                            cgd0 cgd0Var = this.c;
                            if (cgd0Var == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            cgd0Var.b.setOnClickListener(this);
                            cgd0 cgd0Var2 = this.c;
                            if (cgd0Var2 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            cgd0Var2.c.setOnClickListener(new View.OnClickListener() { // from class: qp20
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i3 = PrevBetHistoryActivity.i;
                                    this.a.z1();
                                }
                            });
                            z1();
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final void z1() {
        jvd0 jvd0Var;
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.get(6) - 180);
        String strValueOf = String.valueOf(gsc.d(new Date(calendar.getTimeInMillis())));
        sp20 sp20Var = (sp20) this.e.getValue();
        Integer numValueOf = Integer.valueOf(this.d);
        jvd0 jvd0Var2 = sp20Var.f;
        if (jvd0Var2 == null || !jvd0Var2.isActive() || (jvd0Var = sp20Var.f) == null || jvd0Var.isCompleted()) {
            sp20Var.f = kzh.d(new g1i(bm50.a(new tp20(sp20Var.d.k(numValueOf, strValueOf))), new up20(sp20Var, null)), o8i0.d(sp20Var));
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new a(strValueOf, null), 3);
    }
}
