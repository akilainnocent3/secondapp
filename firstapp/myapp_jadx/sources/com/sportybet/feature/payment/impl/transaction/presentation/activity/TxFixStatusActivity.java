package com.sportybet.feature.payment.impl.transaction.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.adapter.TxFixStatusTipAdapter;
import defpackage.a6h0;
import defpackage.arr;
import defpackage.bb40;
import defpackage.bm50;
import defpackage.bmy;
import defpackage.cf;
import defpackage.cyb;
import defpackage.d900;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.h5e;
import defpackage.i6m;
import defpackage.jq40;
import defpackage.k5h0;
import defpackage.kzh;
import defpackage.l5h0;
import defpackage.m5h0;
import defpackage.n5h0;
import defpackage.o8i0;
import defpackage.p5h0;
import defpackage.pu0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.wo5;
import defpackage.x5h0;
import defpackage.xym;
import defpackage.y5h0;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/activity/TxFixStatusActivity;", "Lpy1;", "Lbb40;", "Lxym;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxFixStatusActivity extends i6m implements bb40, xym {
    public static final a i = new a();
    public e b;
    public d900 c;
    public cf d;
    public final TxFixStatusTipAdapter e = new TxFixStatusTipAdapter();
    public final q8i0 f = new q8i0(jq40.a(x5h0.class), new c(), new b(), new d());

    public static final class a extends vd {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            return new Intent(context, (Class<?>) TxFixStatusActivity.class);
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            if (i == 1) {
                return new p5h0.b(intent != null ? intent.getStringExtra("EXTRA_TRADE_ID") : null, intent != null ? Integer.valueOf(intent.getIntExtra("EXTRA_FINAL_STATUS", 0)) : null);
            }
            return p5h0.a.a;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxFixStatusActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxFixStatusActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxFixStatusActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_tx_fix_status, (ViewGroup) null, false);
        int i2 = R.id.app_bar;
        if (((RelativeLayout) h5e.a(R.id.app_bar, viewInflate)) != null) {
            i2 = R.id.back;
            ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
            if (imageButton != null) {
                i2 = R.id.confirm_button;
                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.confirm_button, viewInflate);
                if (progressButton != null) {
                    i2 = R.id.content_root;
                    if (((ConstraintLayout) h5e.a(R.id.content_root, viewInflate)) != null) {
                        i2 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view, viewInflate);
                        if (recyclerView != null) {
                            i2 = R.id.title_text_view;
                            if (((TextView) h5e.a(R.id.title_text_view, viewInflate)) != null) {
                                i2 = R.id.transaction_no_edit_text;
                                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.transaction_no_edit_text, viewInflate);
                                if (clearEditText != null) {
                                    i2 = R.id.update_ussd_group;
                                    Group group = (Group) h5e.a(R.id.update_ussd_group, viewInflate);
                                    if (group != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        this.d = new cf(linearLayout, imageButton, progressButton, recyclerView, clearEditText, group);
                                        setContentView(linearLayout);
                                        final cf cfVar = this.d;
                                        if (cfVar == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        cfVar.b.setOnClickListener(new View.OnClickListener() { // from class: h5h0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                TxFixStatusActivity.a aVar = TxFixStatusActivity.i;
                                                this.a.finish();
                                            }
                                        });
                                        Group group2 = cfVar.f;
                                        q8i0 q8i0Var = this.f;
                                        group2.setVisibility(kotlin.collections.b.k(CountryCodeName.NIGERIA, CountryCodeName.GHANA, CountryCodeName.KENYA).contains(((x5h0) q8i0Var.getValue()).e.getCountryCode()) ? 0 : 8);
                                        cfVar.d.setAdapter(this.e);
                                        cfVar.e.setTextChangedListener(new ClearEditText.b() { // from class: i5h0
                                            @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                                            public final void l(CharSequence charSequence) {
                                                TxFixStatusActivity.a aVar = TxFixStatusActivity.i;
                                                x5h0 x5h0Var = (x5h0) this.a.f.getValue();
                                                String string = charSequence.toString();
                                                string.getClass();
                                                wwd0 wwd0Var = x5h0Var.F;
                                                wwd0Var.getClass();
                                                wwd0Var.k(null, string);
                                            }
                                        });
                                        cfVar.c.setOnClickListener(new View.OnClickListener() { // from class: j5h0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                TxFixStatusActivity.a aVar = TxFixStatusActivity.i;
                                                lop.b(cfVar.e, Boolean.FALSE);
                                                x5h0 x5h0Var = (x5h0) this.f.getValue();
                                                ej5.c(o8i0.d(x5h0Var), null, null, new w5h0(x5h0Var, null), 3);
                                            }
                                        });
                                        x5h0 x5h0Var = (x5h0) q8i0Var.getValue();
                                        g1i g1iVar = new g1i(x5h0Var.i, new k5h0(this, null));
                                        s9s lifecycle = getLifecycle();
                                        lifecycle.getClass();
                                        s9s.b bVar = s9s.b.d;
                                        arr.a(g1iVar, lifecycle, bVar);
                                        g1i g1iVar2 = new g1i(x5h0Var.w, new l5h0(this, null));
                                        s9s lifecycle2 = getLifecycle();
                                        lifecycle2.getClass();
                                        arr.a(g1iVar2, lifecycle2, bVar);
                                        g1i g1iVar3 = new g1i(x5h0Var.B, new m5h0(this, null));
                                        s9s lifecycle3 = getLifecycle();
                                        lifecycle3.getClass();
                                        arr.a(g1iVar3, lifecycle3, bVar);
                                        g1i g1iVar4 = new g1i(x5h0Var.H, new n5h0(this, null));
                                        s9s lifecycle4 = getLifecycle();
                                        lifecycle4.getClass();
                                        arr.a(g1iVar4, lifecycle4, bVar);
                                        kzh.d(new g1i(bm50.f(wo5.b(x5h0Var.c, "page_transaction", null, 6)), new y5h0(x5h0Var, null)), o8i0.d(x5h0Var));
                                        kzh.d(x5h0Var.b.a(pu0.c.a), o8i0.d(x5h0Var));
                                        ej5.c(o8i0.d(x5h0Var), null, null, new z5h0(x5h0Var, null), 3);
                                        kzh.d(new g1i(x5h0Var.d.k(), new a6h0(x5h0Var, null)), o8i0.d(x5h0Var));
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
        e eVar = this.b;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        eVar.a();
        super.onDestroy();
    }
}
