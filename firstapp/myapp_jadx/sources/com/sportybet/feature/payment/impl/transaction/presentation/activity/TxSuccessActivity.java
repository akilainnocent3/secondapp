package com.sportybet.feature.payment.impl.transaction.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.appsflyer.internal.y;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import defpackage.aqg0;
import defpackage.arr;
import defpackage.azm;
import defpackage.bb40;
import defpackage.bf;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.cyb;
import defpackage.d900;
import defpackage.f00;
import defpackage.f8h0;
import defpackage.fag;
import defpackage.g1i;
import defpackage.gbn;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.irj0;
import defpackage.jq40;
import defpackage.k8h0;
import defpackage.log0;
import defpackage.m010;
import defpackage.m6m;
import defpackage.m8h0;
import defpackage.mie0;
import defpackage.mla;
import defpackage.mpe0;
import defpackage.n010;
import defpackage.n4d;
import defpackage.n8h0;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.uhc;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.vtu;
import defpackage.wae;
import defpackage.yie0;
import defpackage.yrh0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/activity/TxSuccessActivity;", "Lpy1;", "Landroid/view/View$OnClickListener;", "Lbb40;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClick", "(Landroid/view/View;)V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxSuccessActivity extends m6m implements View.OnClickListener, bb40 {
    public static final /* synthetic */ int A = 0;
    public gbn b;
    public azm c;
    public bnh0 d;
    public d900 e;
    public bf i;
    public TxSuccessParams v;
    public final mpe0 f = hwr.b(new f8h0());
    public final mpe0 w = hwr.b(new Function0() { // from class: g8h0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = TxSuccessActivity.A;
            return Boolean.valueOf(this.a.getIntent().getBooleanExtra("EXTRA_FROM_GAME", false));
        }
    });
    public final q8i0 y = new q8i0(jq40.a(n8h0.class), new c(), new b(), new d());
    public final q8i0 z = new q8i0(jq40.a(irj0.class), new f(), new e(), new g());

    public static final class a {
        public static void a(Context context, TxSuccessParams txSuccessParams, boolean z) {
            Intent intent = new Intent(context, (Class<?>) TxSuccessActivity.class);
            intent.putExtra("EXTRA_KEY_TX_SUCCESS_PARAMS", txSuccessParams);
            if (z) {
                intent.putExtra("EXTRA_FROM_GAME", true);
            }
            context.startActivity(intent);
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxSuccessActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxSuccessActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxSuccessActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxSuccessActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxSuccessActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxSuccessActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        aqg0 aqg0Var;
        fag fagVar;
        view.getClass();
        int id = view.getId();
        if (id == R.id.check_status) {
            TxSuccessParams txSuccessParams = this.v;
            if (txSuccessParams == null) {
                Intrinsics.n("params");
                throw null;
            }
            int iOrdinal = txSuccessParams.getA().ordinal();
            if (iOrdinal == 0) {
                aqg0Var = aqg0.e.c;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                aqg0Var = aqg0.j.c;
            }
            d900 d900Var = this.e;
            if (d900Var == null) {
                Intrinsics.n("paymentRouter");
                throw null;
            }
            int i = aqg0Var.a;
            TxSuccessParams txSuccessParams2 = this.v;
            if (txSuccessParams2 == null) {
                Intrinsics.n("params");
                throw null;
            }
            int iOrdinal2 = txSuccessParams2.getA().ordinal();
            if (iOrdinal2 == 0) {
                fagVar = fag.D_SUCCESS_POPUP;
            } else {
                if (iOrdinal2 != 1) {
                    uhc.a();
                    return;
                }
                fagVar = fag.W_SUCCESS_POPUP;
            }
            d900Var.f(this, i, fagVar);
            finish();
            return;
        }
        if (id == R.id.done_btn) {
            if (((Boolean) this.w.getValue()).booleanValue()) {
                finish();
                return;
            }
            if (!getCountryManager().r()) {
                TxSuccessParams txSuccessParams3 = this.v;
                if (txSuccessParams3 == null) {
                    Intrinsics.n("params");
                    throw null;
                }
                if (txSuccessParams3.getB() != m8h0.b) {
                    z1().d(wae.ME);
                    return;
                }
            }
            z1().d(wae.HOME);
            return;
        }
        if (id == R.id.wh_tax_help) {
            d900 d900Var2 = this.e;
            if (d900Var2 != null) {
                d900Var2.a();
                return;
            } else {
                Intrinsics.n("paymentRouter");
                throw null;
            }
        }
        if (id == R.id.bvn_gift) {
            d900 d900Var3 = this.e;
            if (d900Var3 == null) {
                Intrinsics.n("paymentRouter");
                throw null;
            }
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.setFlags(268468224);
            intent.putExtra("tab", 4);
            yrh0.s(this, intent, true);
            d900Var3.b.d(wae.ME_GIFTS);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        String str;
        int i;
        String cMSString;
        String cMSString2;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_transaction_success, (ViewGroup) null, false);
        int i2 = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i2 = R.id.amount_group;
            Group group = (Group) h5e.a(R.id.amount_group, viewInflate);
            if (group != null) {
                i2 = R.id.amount_label;
                TextView textView2 = (TextView) h5e.a(R.id.amount_label, viewInflate);
                if (textView2 != null) {
                    i2 = R.id.bvn_gift;
                    ImageView imageView = (ImageView) h5e.a(R.id.bvn_gift, viewInflate);
                    if (imageView != null) {
                        i2 = R.id.check_status;
                        TextView textView3 = (TextView) h5e.a(R.id.check_status, viewInflate);
                        if (textView3 != null) {
                            i2 = R.id.diver_line;
                            View viewA = h5e.a(R.id.diver_line, viewInflate);
                            if (viewA != null) {
                                i2 = R.id.diver_line_2;
                                View viewA2 = h5e.a(R.id.diver_line_2, viewInflate);
                                if (viewA2 != null) {
                                    i2 = R.id.done_btn;
                                    CommonButton commonButton = (CommonButton) h5e.a(R.id.done_btn, viewInflate);
                                    if (commonButton != null) {
                                        i2 = R.id.fee;
                                        if (((TextView) h5e.a(R.id.fee, viewInflate)) != null) {
                                            i2 = R.id.fee_label;
                                            if (((TextView) h5e.a(R.id.fee_label, viewInflate)) != null) {
                                                i2 = R.id.guideline_begin;
                                                if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                                                    i2 = R.id.guideline_end;
                                                    if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                                        i2 = R.id.imageView;
                                                        ImageView imageView2 = (ImageView) h5e.a(R.id.imageView, viewInflate);
                                                        if (imageView2 != null) {
                                                            i2 = R.id.info1;
                                                            TextView textView4 = (TextView) h5e.a(R.id.info1, viewInflate);
                                                            if (textView4 != null) {
                                                                i2 = R.id.info2;
                                                                TextView textView5 = (TextView) h5e.a(R.id.info2, viewInflate);
                                                                if (textView5 != null) {
                                                                    i2 = R.id.info_label1;
                                                                    TextView textView6 = (TextView) h5e.a(R.id.info_label1, viewInflate);
                                                                    if (textView6 != null) {
                                                                        i2 = R.id.info_label2;
                                                                        TextView textView7 = (TextView) h5e.a(R.id.info_label2, viewInflate);
                                                                        if (textView7 != null) {
                                                                            i2 = R.id.net_payout;
                                                                            TextView textView8 = (TextView) h5e.a(R.id.net_payout, viewInflate);
                                                                            if (textView8 != null) {
                                                                                i2 = R.id.net_payout_label;
                                                                                if (((TextView) h5e.a(R.id.net_payout_label, viewInflate)) != null) {
                                                                                    i2 = R.id.payment_to;
                                                                                    TextView textView9 = (TextView) h5e.a(R.id.payment_to, viewInflate);
                                                                                    if (textView9 != null) {
                                                                                        i2 = R.id.payment_to_container;
                                                                                        if (((LinearLayout) h5e.a(R.id.payment_to_container, viewInflate)) != null) {
                                                                                            i2 = R.id.payment_to_icon;
                                                                                            ImageView imageView3 = (ImageView) h5e.a(R.id.payment_to_icon, viewInflate);
                                                                                            if (imageView3 != null) {
                                                                                                i2 = R.id.payment_to_label;
                                                                                                TextView textView10 = (TextView) h5e.a(R.id.payment_to_label, viewInflate);
                                                                                                if (textView10 != null) {
                                                                                                    i2 = R.id.submission_tip;
                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.submission_tip, viewInflate);
                                                                                                    if (textView11 != null) {
                                                                                                        i2 = R.id.title;
                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.title, viewInflate);
                                                                                                        if (textView12 != null) {
                                                                                                            i2 = R.id.title_bar;
                                                                                                            if (((TextView) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                                                                                i2 = R.id.tradeNo;
                                                                                                                TextView textView13 = (TextView) h5e.a(R.id.tradeNo, viewInflate);
                                                                                                                if (textView13 != null) {
                                                                                                                    i2 = R.id.tradeNo_label;
                                                                                                                    if (((TextView) h5e.a(R.id.tradeNo_label, viewInflate)) != null) {
                                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                        i2 = R.id.wh_tax;
                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.wh_tax, viewInflate);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i2 = R.id.wh_tax_description;
                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.wh_tax_description, viewInflate);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i2 = R.id.wh_tax_group;
                                                                                                                                Group group2 = (Group) h5e.a(R.id.wh_tax_group, viewInflate);
                                                                                                                                if (group2 != null) {
                                                                                                                                    i2 = R.id.wh_tax_help;
                                                                                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.wh_tax_help, viewInflate);
                                                                                                                                    if (appCompatImageView != null) {
                                                                                                                                        i2 = R.id.wh_tax_label;
                                                                                                                                        if (((TextView) h5e.a(R.id.wh_tax_label, viewInflate)) != null) {
                                                                                                                                            i2 = R.id.withdraw_verify_nin_btn_compose_view;
                                                                                                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.withdraw_verify_nin_btn_compose_view, viewInflate);
                                                                                                                                            if (composeView != null) {
                                                                                                                                                i2 = R.id.withdraw_verify_nin_dialog_compose_view;
                                                                                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.withdraw_verify_nin_dialog_compose_view, viewInflate);
                                                                                                                                                if (composeView2 != null) {
                                                                                                                                                    this.i = new bf(constraintLayout, textView, group, textView2, imageView, textView3, viewA, viewA2, commonButton, imageView2, textView4, textView5, textView6, textView7, textView8, textView9, imageView3, textView10, textView11, textView12, textView13, textView14, textView15, group2, appCompatImageView, composeView, composeView2);
                                                                                                                                                    setContentView(constraintLayout);
                                                                                                                                                    TxSuccessParams txSuccessParams = Build.VERSION.SDK_INT >= 33 ? (TxSuccessParams) getIntent().getParcelableExtra("EXTRA_KEY_TX_SUCCESS_PARAMS", TxSuccessParams.class) : (TxSuccessParams) getIntent().getParcelableExtra("EXTRA_KEY_TX_SUCCESS_PARAMS");
                                                                                                                                                    if (txSuccessParams == null) {
                                                                                                                                                        y.a("Extra with key: `EXTRA_KEY_TX_SUCCESS_PARAMS` not acquired.");
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    this.v = txSuccessParams;
                                                                                                                                                    bf bfVar = this.i;
                                                                                                                                                    if (bfVar == null) {
                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    TextView textView16 = bfVar.C;
                                                                                                                                                    TextView textView17 = bfVar.G;
                                                                                                                                                    CommonButton commonButton2 = bfVar.w;
                                                                                                                                                    TextView textView18 = bfVar.I;
                                                                                                                                                    TextView textView19 = bfVar.A;
                                                                                                                                                    ImageView imageView4 = bfVar.F;
                                                                                                                                                    ImageView imageView5 = bfVar.e;
                                                                                                                                                    TextView textView20 = bfVar.z;
                                                                                                                                                    TextView textView21 = bfVar.B;
                                                                                                                                                    TextView textView22 = bfVar.E;
                                                                                                                                                    TextView textView23 = bfVar.H;
                                                                                                                                                    m8h0 m8h0VarE1 = txSuccessParams.getB();
                                                                                                                                                    m8h0 m8h0Var = m8h0.b;
                                                                                                                                                    textView23.setVisibility(m8h0VarE1 == m8h0Var ? 0 : 8);
                                                                                                                                                    TxSuccessParams txSuccessParams2 = this.v;
                                                                                                                                                    if (txSuccessParams2 == null) {
                                                                                                                                                        Intrinsics.n("params");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (txSuccessParams2.getB() == m8h0Var) {
                                                                                                                                                        str = "params";
                                                                                                                                                        i = 0;
                                                                                                                                                        cMSString = getCMSString(R.string.page_withdraw__withdrawal_under_review, new Object[0]);
                                                                                                                                                    } else {
                                                                                                                                                        str = "params";
                                                                                                                                                        i = 0;
                                                                                                                                                        TxSuccessParams txSuccessParams3 = this.v;
                                                                                                                                                        if (txSuccessParams3 == null) {
                                                                                                                                                            Intrinsics.n(str);
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        int iOrdinal = txSuccessParams3.getA().ordinal();
                                                                                                                                                        if (iOrdinal == 0) {
                                                                                                                                                            cMSString = getCMSString(R.string.page_payment__deposit_succeeded, new Object[0]);
                                                                                                                                                        } else {
                                                                                                                                                            if (iOrdinal != 1) {
                                                                                                                                                                uhc.a();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            cMSString = getCMSString(R.string.page_withdraw__withdrawal_succeeded, new Object[0]);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    textView18.setText(cMSString);
                                                                                                                                                    TxSuccessParams txSuccessParams4 = this.v;
                                                                                                                                                    if (txSuccessParams4 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (txSuccessParams4.getB() == m8h0Var) {
                                                                                                                                                        commonButton2.setText(getCMSString(R.string.page_payment__continue_betting, new Object[i]));
                                                                                                                                                        bfVar.y.setImageResource(R.drawable.ic_under_review);
                                                                                                                                                    }
                                                                                                                                                    TxSuccessParams txSuccessParams5 = this.v;
                                                                                                                                                    if (txSuccessParams5 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    int iOrdinal2 = txSuccessParams5.getA().ordinal();
                                                                                                                                                    if (iOrdinal2 == 0) {
                                                                                                                                                        cMSString2 = getCMSString(R.string.page_payment__deposit_from, new Object[0]);
                                                                                                                                                    } else {
                                                                                                                                                        if (iOrdinal2 != 1) {
                                                                                                                                                            uhc.a();
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        cMSString2 = getCMSString(R.string.page_withdraw__withdraw_to, new Object[0]);
                                                                                                                                                    }
                                                                                                                                                    textView17.setText(cMSString2);
                                                                                                                                                    TextView textView24 = bfVar.d;
                                                                                                                                                    TxSuccessParams txSuccessParams6 = this.v;
                                                                                                                                                    if (txSuccessParams6 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    textView24.setText(getCMSString(R.string.common_functions__amount_label, txSuccessParams6.getD()));
                                                                                                                                                    TextView textView25 = bfVar.b;
                                                                                                                                                    TxSuccessParams txSuccessParams7 = this.v;
                                                                                                                                                    if (txSuccessParams7 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    textView25.setText(n4d.a(txSuccessParams7.getE()));
                                                                                                                                                    TextView textView26 = bfVar.J;
                                                                                                                                                    TxSuccessParams txSuccessParams8 = this.v;
                                                                                                                                                    if (txSuccessParams8 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    String strM = txSuccessParams8.getC();
                                                                                                                                                    if (strM == null) {
                                                                                                                                                        strM = "--";
                                                                                                                                                    }
                                                                                                                                                    textView26.setText(strM);
                                                                                                                                                    bf bfVar2 = this.i;
                                                                                                                                                    if (bfVar2 == null) {
                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    TxSuccessParams txSuccessParams9 = this.v;
                                                                                                                                                    if (txSuccessParams9 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (txSuccessParams9.getF().compareTo(BigDecimal.ZERO) > 0) {
                                                                                                                                                        bfVar2.c.setVisibility(8);
                                                                                                                                                        bfVar2.M.setVisibility(0);
                                                                                                                                                        TxSuccessParams txSuccessParams10 = this.v;
                                                                                                                                                        if (txSuccessParams10 == null) {
                                                                                                                                                            Intrinsics.n(str);
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        BigDecimal bigDecimalD = txSuccessParams10.getE();
                                                                                                                                                        TxSuccessParams txSuccessParams11 = this.v;
                                                                                                                                                        if (txSuccessParams11 == null) {
                                                                                                                                                            Intrinsics.n(str);
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        bfVar2.D.setText(n4d.a(bigDecimalD.subtract(txSuccessParams11.getF())));
                                                                                                                                                        TextView textView27 = bfVar2.K;
                                                                                                                                                        TxSuccessParams txSuccessParams12 = this.v;
                                                                                                                                                        if (txSuccessParams12 == null) {
                                                                                                                                                            Intrinsics.n(str);
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        textView27.setText(n4d.a(txSuccessParams12.getF()));
                                                                                                                                                    }
                                                                                                                                                    bfVar.f.setOnClickListener(this);
                                                                                                                                                    commonButton2.setOnClickListener(this);
                                                                                                                                                    imageView5.setOnClickListener(this);
                                                                                                                                                    bfVar.N.setOnClickListener(this);
                                                                                                                                                    TxSuccessParams txSuccessParams13 = this.v;
                                                                                                                                                    if (txSuccessParams13 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (txSuccessParams13.getI()) {
                                                                                                                                                        imageView5.setVisibility(0);
                                                                                                                                                        gbn gbnVar = this.b;
                                                                                                                                                        if (gbnVar == null) {
                                                                                                                                                            Intrinsics.n("imageService");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        gbnVar.a("https://s.sporty.net/ke/main/res/a7d750eb00870e2c328a096d78ffd884.png", imageView5);
                                                                                                                                                    }
                                                                                                                                                    TxSuccessParams txSuccessParams14 = this.v;
                                                                                                                                                    if (txSuccessParams14 == null) {
                                                                                                                                                        Intrinsics.n(str);
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    if (txSuccessParams14 instanceof TxSuccessParams.Bank) {
                                                                                                                                                        TxSuccessParams.Bank bank = (TxSuccessParams.Bank) txSuccessParams14;
                                                                                                                                                        String str2 = bank.v;
                                                                                                                                                        if (str2 == null) {
                                                                                                                                                            str2 = "--";
                                                                                                                                                        }
                                                                                                                                                        textView22.setText(str2);
                                                                                                                                                        String str3 = bank.w;
                                                                                                                                                        if (str3 != null) {
                                                                                                                                                            gbn gbnVar2 = this.b;
                                                                                                                                                            if (gbnVar2 == null) {
                                                                                                                                                                Intrinsics.n("imageService");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            gbnVar2.a(str3, imageView4);
                                                                                                                                                        }
                                                                                                                                                        textView21.setText(getCMSString(R.string.page_payment__account_number, new Object[0]));
                                                                                                                                                        String str4 = bank.y;
                                                                                                                                                        if (str4 == null) {
                                                                                                                                                            str4 = "--";
                                                                                                                                                        }
                                                                                                                                                        textView20.setText(str4);
                                                                                                                                                        textView21.setVisibility(0);
                                                                                                                                                        textView20.setVisibility(0);
                                                                                                                                                        if (bank.B) {
                                                                                                                                                            textView16.setText(getCMSString(R.string.page_withdraw__account_name, new Object[0]));
                                                                                                                                                            String str5 = bank.z;
                                                                                                                                                            textView19.setText(str5 != null ? str5 : "--");
                                                                                                                                                            textView16.setVisibility(0);
                                                                                                                                                            textView19.setVisibility(0);
                                                                                                                                                        } else {
                                                                                                                                                            textView16.setVisibility(8);
                                                                                                                                                            textView19.setVisibility(8);
                                                                                                                                                        }
                                                                                                                                                        bf bfVar3 = this.i;
                                                                                                                                                        if (bfVar3 == null) {
                                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                                            throw null;
                                                                                                                                                        }
                                                                                                                                                        ComposeView composeView3 = bfVar3.P;
                                                                                                                                                        ComposeView composeView4 = bfVar3.O;
                                                                                                                                                        Integer num = bank.A;
                                                                                                                                                        if (num != null && num.intValue() == 91) {
                                                                                                                                                            bfVar3.H.setText(getCMSString(R.string.page_withdraw__withdrawal_under_review_result, new Object[0]));
                                                                                                                                                            composeView4.setVisibility(0);
                                                                                                                                                            composeView3.setVisibility(0);
                                                                                                                                                            f00 f00Var = vgb0.a;
                                                                                                                                                            vgb0.b(AnalyticsEvent.WITHDRAWAL_REVIEW_VERIFY_NIN_VIEWED, (Bundle) this.f.getValue());
                                                                                                                                                        } else {
                                                                                                                                                            composeView4.setVisibility(8);
                                                                                                                                                            composeView3.setVisibility(8);
                                                                                                                                                        }
                                                                                                                                                    } else if (txSuccessParams14 instanceof TxSuccessParams.Momo) {
                                                                                                                                                        TxSuccessParams.Momo momo = (TxSuccessParams.Momo) txSuccessParams14;
                                                                                                                                                        textView22.setText(momo.v);
                                                                                                                                                        String str6 = momo.w;
                                                                                                                                                        if (str6 != null) {
                                                                                                                                                            gbn gbnVar3 = this.b;
                                                                                                                                                            if (gbnVar3 == null) {
                                                                                                                                                                Intrinsics.n("imageService");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            gbnVar3.a(str6, imageView4);
                                                                                                                                                        } else {
                                                                                                                                                            Integer num2 = momo.y;
                                                                                                                                                            if (num2 != null) {
                                                                                                                                                                imageView4.setImageResource(num2.intValue());
                                                                                                                                                            } else {
                                                                                                                                                                imageView4.setImageResource(R.drawable.icon_default);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        textView21.setText(getCMSString(R.string.my_account__mobile_number, new Object[0]));
                                                                                                                                                        textView20.setText(vtu.a(momo.z));
                                                                                                                                                        textView21.setVisibility(0);
                                                                                                                                                        textView20.setVisibility(0);
                                                                                                                                                    } else if (txSuccessParams14 instanceof TxSuccessParams.Card) {
                                                                                                                                                        TxSuccessParams.Card card = (TxSuccessParams.Card) txSuccessParams14;
                                                                                                                                                        String str7 = card.v;
                                                                                                                                                        if (str7 == null) {
                                                                                                                                                            str7 = "";
                                                                                                                                                        }
                                                                                                                                                        textView22.setText(getCMSString(R.string.common_payment_providers__payinfo, str7, card.w));
                                                                                                                                                    } else if (!(txSuccessParams14 instanceof TxSuccessParams.Transfer)) {
                                                                                                                                                        uhc.a();
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        textView18.setText(getCMSString(R.string.component_supporter__transfer_succceeded, new Object[0]));
                                                                                                                                                        textView17.setText(getCMSString(R.string.component_supporter__transfer_to, new Object[0]));
                                                                                                                                                        textView22.setText(((TxSuccessParams.Transfer) txSuccessParams14).v);
                                                                                                                                                    }
                                                                                                                                                    bf bfVar4 = this.i;
                                                                                                                                                    if (bfVar4 == null) {
                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    int i3 = 1;
                                                                                                                                                    mla.i(bfVar4.O, new op8(296160951, new n010(this, i3), true));
                                                                                                                                                    bf bfVar5 = this.i;
                                                                                                                                                    if (bfVar5 == null) {
                                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    mla.i(bfVar5.P, new op8(1832204358, new m010(this, i3), true));
                                                                                                                                                    g1i g1iVar = new g1i(((n8h0) this.y.getValue()).a, new k8h0(this, null));
                                                                                                                                                    s9s lifecycle = getLifecycle();
                                                                                                                                                    lifecycle.getClass();
                                                                                                                                                    arr.a(g1iVar, lifecycle, s9s.b.d);
                                                                                                                                                    TxSuccessParams txSuccessParams15 = this.v;
                                                                                                                                                    if (txSuccessParams15 != null) {
                                                                                                                                                        yie0.a(this, txSuccessParams15.getA() == log0.a ? mie0.f : mie0.i);
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        Intrinsics.n(str);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    public final azm z1() {
        azm azmVar = this.c;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }
}
