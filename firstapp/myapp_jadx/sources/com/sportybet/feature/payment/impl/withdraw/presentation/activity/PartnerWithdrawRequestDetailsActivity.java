package com.sportybet.feature.payment.impl.withdraw.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.internal.y;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.withdraw.presentation.activity.PartnerWithdrawRequestDetailsActivity;
import defpackage.arr;
import defpackage.azm;
import defpackage.b93;
import defpackage.bmy;
import defpackage.buz;
import defpackage.c93;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.d93;
import defpackage.duz;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.h5e;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.md;
import defpackage.ntz;
import defpackage.o8i0;
import defpackage.ptz;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qtz;
import defpackage.r8i0;
import defpackage.r910;
import defpackage.rtz;
import defpackage.s9s;
import defpackage.stz;
import defpackage.ttz;
import defpackage.v8i0;
import defpackage.wtz;
import defpackage.za8;
import defpackage.zyl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sportybet/feature/payment/impl/withdraw/presentation/activity/PartnerWithdrawRequestDetailsActivity;", "Lpy1;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PartnerWithdrawRequestDetailsActivity extends zyl {
    public static final /* synthetic */ int w = 0;
    public d0n b;
    public azm c;
    public e d;
    public md e;
    public String f;
    public duz i;
    public final q8i0 v = new q8i0(jq40.a(buz.class), new c(), new b(), new d());

    public static final class a {
        public static void a(Context context, String str, Integer num) {
            if (str == null) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_TRANSACTION);
                aVar.n("Extra with key: `EXTRA_KEY_TRADE_ID` not acquired.", new Object[0]);
            } else {
                Intent intent = new Intent(context, (Class<?>) PartnerWithdrawRequestDetailsActivity.class);
                intent.putExtra("EXTRA_KEY_TRADE_ID", str);
                if (num != null) {
                    intent.setFlags(num.intValue());
                }
                context.startActivity(intent);
            }
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return PartnerWithdrawRequestDetailsActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return PartnerWithdrawRequestDetailsActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return PartnerWithdrawRequestDetailsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final void z1(Context context, String str) {
        a.a(context, str, 268435456);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_partner_withdraw_request_details, (ViewGroup) null, false);
        int i = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i = R.id.back;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
            if (imageButton != null) {
                i = R.id.back_title;
                if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                    i = R.id.cancel_fee;
                    TextView textView2 = (TextView) h5e.a(R.id.cancel_fee, viewInflate);
                    if (textView2 != null) {
                        i = R.id.cancel_fee_label;
                        TextView textView3 = (TextView) h5e.a(R.id.cancel_fee_label, viewInflate);
                        if (textView3 != null) {
                            i = R.id.fee;
                            TextView textView4 = (TextView) h5e.a(R.id.fee, viewInflate);
                            if (textView4 != null) {
                                i = R.id.fee_label;
                                if (((TextView) h5e.a(R.id.fee_label, viewInflate)) != null) {
                                    i = R.id.home;
                                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                                    if (imageButton2 != null) {
                                        i = R.id.init_failed_mask;
                                        LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                        if (loadingViewNew != null) {
                                            i = R.id.init_mask;
                                            ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                            if (composeView != null) {
                                                i = R.id.loading_mask;
                                                LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                                                if (loadingViewNew2 != null) {
                                                    i = R.id.offline_cancel;
                                                    TextView textView5 = (TextView) h5e.a(R.id.offline_cancel, viewInflate);
                                                    if (textView5 != null) {
                                                        i = R.id.partner_code;
                                                        TextView textView6 = (TextView) h5e.a(R.id.partner_code, viewInflate);
                                                        if (textView6 != null) {
                                                            i = R.id.partner_code_label;
                                                            if (((TextView) h5e.a(R.id.partner_code_label, viewInflate)) != null) {
                                                                i = R.id.partner_info;
                                                                TextView textView7 = (TextView) h5e.a(R.id.partner_info, viewInflate);
                                                                if (textView7 != null) {
                                                                    i = R.id.partner_info_text;
                                                                    TextView textView8 = (TextView) h5e.a(R.id.partner_info_text, viewInflate);
                                                                    if (textView8 != null) {
                                                                        i = R.id.request_time_line_recycler_view;
                                                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.request_time_line_recycler_view, viewInflate);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.swipe;
                                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                            if (swipeRefreshLayout != null) {
                                                                                i = R.id.title_bar;
                                                                                if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                                                    i = R.id.total_info;
                                                                                    if (((ConstraintLayout) h5e.a(R.id.total_info, viewInflate)) != null) {
                                                                                        i = R.id.tradeNo;
                                                                                        TextView textView9 = (TextView) h5e.a(R.id.tradeNo, viewInflate);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.tradeNo_label;
                                                                                            if (((TextView) h5e.a(R.id.tradeNo_label, viewInflate)) != null) {
                                                                                                i = R.id.withdraw_amount_label;
                                                                                                TextView textView10 = (TextView) h5e.a(R.id.withdraw_amount_label, viewInflate);
                                                                                                if (textView10 != null) {
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                    this.e = new md(constraintLayout, textView, imageButton, textView2, textView3, textView4, imageButton2, loadingViewNew, composeView, loadingViewNew2, textView5, textView6, textView7, textView8, recyclerView, swipeRefreshLayout, textView9, textView10);
                                                                                                    setContentView(constraintLayout);
                                                                                                    String stringExtra = getIntent().getStringExtra("EXTRA_KEY_TRADE_ID");
                                                                                                    if (stringExtra == null) {
                                                                                                        y.a("Extra with key: `EXTRA_KEY_TRADE_ID` not acquired.");
                                                                                                        return;
                                                                                                    }
                                                                                                    this.f = stringExtra;
                                                                                                    md mdVar = this.e;
                                                                                                    if (mdVar == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar.G.setText(getCMSString(R.string.page_withdraw__amount_label, getCountryManager().f()));
                                                                                                    duz duzVar = new duz(duz.b);
                                                                                                    this.i = duzVar;
                                                                                                    md mdVar2 = this.e;
                                                                                                    if (mdVar2 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar2.D.setAdapter(duzVar);
                                                                                                    md mdVar3 = this.e;
                                                                                                    if (mdVar3 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    r910.b(mdVar3.w);
                                                                                                    md mdVar4 = this.e;
                                                                                                    if (mdVar4 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar4.w.setOnClickListener(new ntz());
                                                                                                    md mdVar5 = this.e;
                                                                                                    if (mdVar5 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    int i2 = 2;
                                                                                                    mdVar5.v.setOnClickListener(new za8(this, i2));
                                                                                                    md mdVar6 = this.e;
                                                                                                    if (mdVar6 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar6.E.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: otz
                                                                                                        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                                                                        public final void i() {
                                                                                                            int i3 = PartnerWithdrawRequestDetailsActivity.w;
                                                                                                            buz buzVar = (buz) this.a.v.getValue();
                                                                                                            ej5.c(o8i0.d(buzVar), null, null, new auz(buzVar, null), 3);
                                                                                                        }
                                                                                                    });
                                                                                                    md mdVar7 = this.e;
                                                                                                    if (mdVar7 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar7.y.setOnClickListener(new ntz());
                                                                                                    md mdVar8 = this.e;
                                                                                                    if (mdVar8 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar8.c.setOnClickListener(new b93(this, i2));
                                                                                                    md mdVar9 = this.e;
                                                                                                    if (mdVar9 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    int i3 = 1;
                                                                                                    mdVar9.i.setOnClickListener(new c93(this, i3));
                                                                                                    md mdVar10 = this.e;
                                                                                                    if (mdVar10 == null) {
                                                                                                        Intrinsics.n("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    mdVar10.z.setOnClickListener(new d93(this, i3));
                                                                                                    buz buzVar = (buz) this.v.getValue();
                                                                                                    g1i g1iVar = new g1i(buzVar.B, new ptz(this, null));
                                                                                                    s9s lifecycle = getLifecycle();
                                                                                                    lifecycle.getClass();
                                                                                                    s9s.b bVar = s9s.b.d;
                                                                                                    arr.a(g1iVar, lifecycle, bVar);
                                                                                                    g1i g1iVar2 = new g1i(buzVar.w, new qtz(this, null));
                                                                                                    s9s lifecycle2 = getLifecycle();
                                                                                                    lifecycle2.getClass();
                                                                                                    arr.a(g1iVar2, lifecycle2, bVar);
                                                                                                    g1i g1iVar3 = new g1i(buzVar.i, new rtz(this, null));
                                                                                                    s9s lifecycle3 = getLifecycle();
                                                                                                    lifecycle3.getClass();
                                                                                                    arr.a(g1iVar3, lifecycle3, bVar);
                                                                                                    g1i g1iVar4 = new g1i(buzVar.z, new stz(this, null));
                                                                                                    s9s lifecycle4 = getLifecycle();
                                                                                                    lifecycle4.getClass();
                                                                                                    arr.a(g1iVar4, lifecycle4, bVar);
                                                                                                    g1i g1iVar5 = new g1i(buzVar.e, new ttz(this, null));
                                                                                                    s9s lifecycle5 = getLifecycle();
                                                                                                    lifecycle5.getClass();
                                                                                                    arr.a(g1iVar5, lifecycle5, bVar);
                                                                                                    String str = this.f;
                                                                                                    if (str != null) {
                                                                                                        ej5.c(o8i0.d(buzVar), null, null, new wtz(buzVar, str, null), 3);
                                                                                                        return;
                                                                                                    } else {
                                                                                                        Intrinsics.n("tradeId");
                                                                                                        throw null;
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        e eVar = this.d;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }
}
