package com.sportybet.android.ugpay.withdraw.momo;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.IconTextSelectorButton;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import defpackage.ahj0;
import defpackage.am;
import defpackage.arr;
import defpackage.bb40;
import defpackage.bhj0;
import defpackage.bm;
import defpackage.bmy;
import defpackage.bpl;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.eg8;
import defpackage.ej5;
import defpackage.fu5;
import defpackage.g1i;
import defpackage.gag;
import defpackage.h5e;
import defpackage.haj;
import defpackage.ig8;
import defpackage.jq40;
import defpackage.k00;
import defpackage.lfy;
import defpackage.mg8;
import defpackage.mla;
import defpackage.nf8;
import defpackage.ng8;
import defpackage.nqy;
import defpackage.o8i0;
import defpackage.og8;
import defpackage.op8;
import defpackage.paj;
import defpackage.pg8;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qc;
import defpackage.qg8;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.r910;
import defpackage.rdd0;
import defpackage.s9s;
import defpackage.sn5;
import defpackage.ssw;
import defpackage.tf8;
import defpackage.uc3;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.xf8;
import defpackage.xym;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/ugpay/withdraw/momo/CommonMobileMoneyWithdrawActivity;", "Lpy1;", "Lpwx;", "Lvym;", "Lxym;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Lbb40;", "<init>", "()V", "Lcom/sportybet/feature/payment/impl/withdraw/domain/model/WithdrawAlertHintStatus;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommonMobileMoneyWithdrawActivity extends bpl implements pwx, vym, xym, SwipeRefreshLayout.f, bb40 {
    public static final /* synthetic */ int z = 0;
    public d0n b;
    public rdd0 c;
    public qc d;
    public String e;
    public String f;
    public boolean i;
    public final q8i0 v = new q8i0(jq40.a(qg8.class), new c(), new b(), new d());
    public final q8i0 w = new q8i0(jq40.a(bm.class), new f(), new e(), new g());
    public final uc3 y = new uc3(this, 1);

    public static final class a implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
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

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CommonMobileMoneyWithdrawActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CommonMobileMoneyWithdrawActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CommonMobileMoneyWithdrawActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return CommonMobileMoneyWithdrawActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return CommonMobileMoneyWithdrawActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return CommonMobileMoneyWithdrawActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        z1().y1();
        if (!this.i) {
            bm bmVar = (bm) this.w.getValue();
            ej5.c(o8i0.d(bmVar), null, null, new am(bmVar, null), 3);
        }
        qc qcVar = this.d;
        if (qcVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        qcVar.b.setText("");
        qc qcVar2 = this.d;
        if (qcVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int i = 0;
        qcVar2.J.setRefreshing(false);
        if (z1().A.d() != 0) {
            qg8 qg8VarZ1 = z1();
            ej5.c(o8i0.d(qg8VarZ1), null, null, new og8(qg8VarZ1, null), 3);
            ej5.c(o8i0.d(qg8VarZ1), null, null, new pg8(qg8VarZ1, null), 3);
            qg8VarZ1.f.b(o8i0.d(qg8VarZ1), new ig8(qg8VarZ1, i));
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = 0;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("phoneNumber");
            stringExtra.getClass();
            this.e = stringExtra;
            String stringExtra2 = intent.getStringExtra("methodId");
            stringExtra2.getClass();
            this.f = stringExtra2;
            this.i = intent.getBooleanExtra("supportAd", false);
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_common_withdraw, (ViewGroup) null, false);
        int i2 = R.id.amount;
        ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, viewInflate);
        if (clearEditText != null) {
            i2 = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                i2 = R.id.amount_label;
                TextView textView = (TextView) h5e.a(R.id.amount_label, viewInflate);
                if (textView != null) {
                    i2 = R.id.amount_warning;
                    TextView textView2 = (TextView) h5e.a(R.id.amount_warning, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.back;
                        ImageButton imageButton = (ImageButton) h5e.a(R.id.back, viewInflate);
                        if (imageButton != null) {
                            i2 = R.id.back_title;
                            if (((TextView) h5e.a(R.id.back_title, viewInflate)) != null) {
                                i2 = R.id.balance;
                                TextView textView3 = (TextView) h5e.a(R.id.balance, viewInflate);
                                if (textView3 != null) {
                                    i2 = R.id.balance_label;
                                    TextView textView4 = (TextView) h5e.a(R.id.balance_label, viewInflate);
                                    if (textView4 != null) {
                                        i2 = R.id.channel;
                                        IconTextSelectorButton iconTextSelectorButton = (IconTextSelectorButton) h5e.a(R.id.channel, viewInflate);
                                        if (iconTextSelectorButton != null) {
                                            i2 = R.id.description_list_view;
                                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.description_list_view, viewInflate);
                                            if (linearLayout != null) {
                                                i2 = R.id.draw_grey_container;
                                                RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.draw_grey_container, viewInflate);
                                                if (relativeLayout != null) {
                                                    i2 = R.id.draw_grey_details;
                                                    TextView textView5 = (TextView) h5e.a(R.id.draw_grey_details, viewInflate);
                                                    if (textView5 != null) {
                                                        i2 = R.id.draw_grey_title;
                                                        TextView textView6 = (TextView) h5e.a(R.id.draw_grey_title, viewInflate);
                                                        if (textView6 != null) {
                                                            i2 = R.id.draw_verify_btn;
                                                            TextView textView7 = (TextView) h5e.a(R.id.draw_verify_btn, viewInflate);
                                                            if (textView7 != null) {
                                                                i2 = R.id.draw_warn;
                                                                if (((AppCompatImageView) h5e.a(R.id.draw_warn, viewInflate)) != null) {
                                                                    i2 = R.id.help_btn;
                                                                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.help_btn, viewInflate);
                                                                    if (imageButton2 != null) {
                                                                        i2 = R.id.hint_view;
                                                                        TextView textView8 = (TextView) h5e.a(R.id.hint_view, viewInflate);
                                                                        if (textView8 != null) {
                                                                            i2 = R.id.home;
                                                                            ImageButton imageButton3 = (ImageButton) h5e.a(R.id.home, viewInflate);
                                                                            if (imageButton3 != null) {
                                                                                i2 = R.id.init_failed_mask;
                                                                                LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
                                                                                if (loadingViewNew != null) {
                                                                                    i2 = R.id.init_mask;
                                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                                                                                    if (composeView != null) {
                                                                                        i2 = R.id.mobile_selector;
                                                                                        IconTextSelectorButton iconTextSelectorButton2 = (IconTextSelectorButton) h5e.a(R.id.mobile_selector, viewInflate);
                                                                                        if (iconTextSelectorButton2 != null) {
                                                                                            i2 = R.id.next;
                                                                                            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.next, viewInflate);
                                                                                            if (progressButton != null) {
                                                                                                i2 = R.id.swipe;
                                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                                                if (swipeRefreshLayout != null) {
                                                                                                    i2 = R.id.title_bar;
                                                                                                    if (((RelativeLayout) h5e.a(R.id.title_bar, viewInflate)) != null) {
                                                                                                        i2 = R.id.top_container;
                                                                                                        LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.top_container, viewInflate);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            i2 = R.id.withdraw_banner;
                                                                                                            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) h5e.a(R.id.withdraw_banner, viewInflate);
                                                                                                            if (aspectRatioImageView != null) {
                                                                                                                i2 = R.id.withdraw_drop_alert_hint;
                                                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.withdraw_drop_alert_hint, viewInflate);
                                                                                                                if (composeView2 != null) {
                                                                                                                    i2 = R.id.withdrawable_balance;
                                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.withdrawable_balance, viewInflate);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i2 = R.id.withdrawable_balance_hint;
                                                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.withdrawable_balance_hint, viewInflate);
                                                                                                                        if (appCompatImageView != null) {
                                                                                                                            i2 = R.id.withdrawable_balance_label;
                                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.withdrawable_balance_label, viewInflate);
                                                                                                                            if (textView10 != null) {
                                                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                                this.d = new qc(constraintLayout, clearEditText, textView, textView2, imageButton, textView3, textView4, iconTextSelectorButton, linearLayout, relativeLayout, textView5, textView6, textView7, imageButton2, textView8, imageButton3, loadingViewNew, composeView, iconTextSelectorButton2, progressButton, swipeRefreshLayout, linearLayout2, aspectRatioImageView, composeView2, textView9, appCompatImageView, textView10);
                                                                                                                                setContentView(constraintLayout);
                                                                                                                                rdd0 rdd0Var = this.c;
                                                                                                                                if (rdd0Var == null) {
                                                                                                                                    Intrinsics.n("sportyTrackingUseCase");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                bhj0 bhj0Var = new bhj0(gag.ME, null, 5);
                                                                                                                                k00 k00Var = k00.d;
                                                                                                                                rdd0Var.a(bhj0Var, k00Var);
                                                                                                                                rdd0 rdd0Var2 = this.c;
                                                                                                                                if (rdd0Var2 == null) {
                                                                                                                                    Intrinsics.n("sportyTrackingUseCase");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                rdd0Var2.a(new ahj0("mobilemoney"), k00Var);
                                                                                                                                qc qcVar = this.d;
                                                                                                                                if (qcVar == null) {
                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                qcVar.H.setEnabled(false);
                                                                                                                                qc qcVar2 = this.d;
                                                                                                                                if (qcVar2 == null) {
                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                qcVar2.v.setEnabled(false);
                                                                                                                                qc qcVar3 = this.d;
                                                                                                                                if (qcVar3 == null) {
                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                ClearEditText clearEditText2 = qcVar3.b;
                                                                                                                                clearEditText2.setErrorView(qcVar3.d);
                                                                                                                                clearEditText2.setTextChangedListener(new ClearEditText.b() { // from class: if8
                                                                                                                                    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
                                                                                                                                    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
                                                                                                                                    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
                                                                                                                                    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
                                                                                                                                    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
                                                                                                                                    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
                                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                                    @Override // com.sporty.android.common_ui.widgets.ClearEditText.b
                                                                                                                                    public final void l(CharSequence charSequence) {
                                                                                                                                        BigDecimal bigDecimalDivide;
                                                                                                                                        BigDecimal bigDecimalSubtract;
                                                                                                                                        BigDecimal bigDecimal;
                                                                                                                                        BigDecimal bigDecimal2;
                                                                                                                                        kmj0 kmj0VarD;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        String string = StringsKt.t0(charSequence.toString()).toString();
                                                                                                                                        qg8 qg8VarZ1 = this.a.z1();
                                                                                                                                        ssw<cx> sswVar = qg8VarZ1.D;
                                                                                                                                        ssw<kmj0> sswVar2 = qg8VarZ1.N;
                                                                                                                                        string.getClass();
                                                                                                                                        int length = string.length();
                                                                                                                                        int length2 = string.length();
                                                                                                                                        kcg dVar = kcg.a.b;
                                                                                                                                        if (length2 == 0 || string.equals("0")) {
                                                                                                                                            BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                                                                                                                            bigDecimal3.getClass();
                                                                                                                                            qg8VarZ1.e0 = bigDecimal3;
                                                                                                                                            sswVar.m(new cx("", 0, dVar));
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        if (StringsKt.h0('.', string)) {
                                                                                                                                            string = "0".concat(string);
                                                                                                                                            length = 2;
                                                                                                                                        }
                                                                                                                                        int iS = StringsKt.S(string, '.', 0, 6);
                                                                                                                                        if (iS != -1) {
                                                                                                                                            if ((string.length() - 1) - iS > 2) {
                                                                                                                                                string = string.substring(0, iS + 3);
                                                                                                                                                length = string.length();
                                                                                                                                            }
                                                                                                                                            if (string.charAt(string.length() - 1) == '.' && iS != StringsKt.W(string, '.', 0, 6)) {
                                                                                                                                                length = string.substring(0, string.length() - 1).length();
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        qg8VarZ1.e0 = new BigDecimal(string);
                                                                                                                                        PaymentChannel paymentChannel = (PaymentChannel) qg8VarZ1.Z.getValue();
                                                                                                                                        if (paymentChannel != null) {
                                                                                                                                            BigDecimal bigDecimal4 = new BigDecimal(flc.c(paymentChannel.getPayChId(), qg8VarZ1.e0.longValue() * 10000, qg8VarZ1.c0.longValue(), qg8VarZ1.b0.longValue(), qg8VarZ1.d0));
                                                                                                                                            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(10000L);
                                                                                                                                            bigDecimalValueOf.getClass();
                                                                                                                                            bigDecimalDivide = bigDecimal4.divide(bigDecimalValueOf, 2, RoundingMode.HALF_UP);
                                                                                                                                            if (bigDecimalDivide == null) {
                                                                                                                                                bigDecimalDivide = BigDecimal.ZERO;
                                                                                                                                                bigDecimalDivide.getClass();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            bigDecimalDivide = BigDecimal.ZERO;
                                                                                                                                            bigDecimalDivide.getClass();
                                                                                                                                        }
                                                                                                                                        BigDecimal bigDecimal5 = qg8VarZ1.M;
                                                                                                                                        if (bigDecimal5 == null || (kmj0VarD = sswVar2.d()) == null) {
                                                                                                                                            bigDecimalSubtract = null;
                                                                                                                                        } else {
                                                                                                                                            bigDecimalSubtract = bigDecimal5.subtract(bigDecimalDivide);
                                                                                                                                            bigDecimalSubtract.getClass();
                                                                                                                                            BigDecimal bigDecimal6 = BigDecimal.ZERO;
                                                                                                                                            bigDecimal6.getClass();
                                                                                                                                            if (bigDecimalSubtract.compareTo(bigDecimal6) >= 0) {
                                                                                                                                                bigDecimal6 = bigDecimalSubtract;
                                                                                                                                            }
                                                                                                                                            String strY = bjb0.Y(bigDecimal6);
                                                                                                                                            String str = kmj0VarD.b;
                                                                                                                                            str.getClass();
                                                                                                                                            sswVar2.m(new kmj0(strY, str));
                                                                                                                                        }
                                                                                                                                        vw vwVar = (vw) qg8VarZ1.g0.a.getValue();
                                                                                                                                        BigDecimal bigDecimal7 = qg8VarZ1.e0;
                                                                                                                                        T t = vwVar.b;
                                                                                                                                        T t2 = vwVar.a;
                                                                                                                                        if (bigDecimal7.compareTo((BigDecimal) t) > 0) {
                                                                                                                                            String strC = s5y.c((BigDecimal) vwVar.b);
                                                                                                                                            strC.getClass();
                                                                                                                                            dVar = new kcg.c(strC);
                                                                                                                                        } else {
                                                                                                                                            BigDecimal bigDecimal8 = (BigDecimal) t2;
                                                                                                                                            if (qg8VarZ1.e0.compareTo(bigDecimal8) < 0) {
                                                                                                                                                dVar = new kcg.g(s5y.c(bigDecimal8));
                                                                                                                                            } else {
                                                                                                                                                xu1 xu1VarD = qg8VarZ1.P.d();
                                                                                                                                                xu1 xu1Var = xu1VarD;
                                                                                                                                                if (xu1Var == null || xu1Var.equals(xu1.c)) {
                                                                                                                                                    xu1VarD = null;
                                                                                                                                                }
                                                                                                                                                xu1 xu1Var2 = xu1VarD;
                                                                                                                                                BigDecimal bigDecimal9 = xu1Var2 != null ? xu1Var2.b : null;
                                                                                                                                                if (bigDecimal9 != null) {
                                                                                                                                                    if (qg8VarZ1.e0.compareTo(bigDecimal9) <= 0) {
                                                                                                                                                        bigDecimal9 = null;
                                                                                                                                                    }
                                                                                                                                                    if (bigDecimal9 != null) {
                                                                                                                                                        dVar = kcg.e.b;
                                                                                                                                                    } else if (bigDecimalSubtract != null) {
                                                                                                                                                        if (qg8VarZ1.e0.compareTo(bigDecimalSubtract) > 0) {
                                                                                                                                                        }
                                                                                                                                                        if (bigDecimal != null) {
                                                                                                                                                            bigDecimal2 = BigDecimal.ZERO;
                                                                                                                                                            bigDecimal2.getClass();
                                                                                                                                                            if (bigDecimal.compareTo(bigDecimal2) < 0) {
                                                                                                                                                                bigDecimal = bigDecimal2;
                                                                                                                                                            }
                                                                                                                                                            String strC2 = s5y.c(bigDecimal);
                                                                                                                                                            strC2.getClass();
                                                                                                                                                            dVar = new kcg.d(strC2);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } else if (bigDecimalSubtract != null) {
                                                                                                                                                    bigDecimal = qg8VarZ1.e0.compareTo(bigDecimalSubtract) > 0 ? bigDecimalSubtract : null;
                                                                                                                                                    if (bigDecimal != null) {
                                                                                                                                                        bigDecimal2 = BigDecimal.ZERO;
                                                                                                                                                        bigDecimal2.getClass();
                                                                                                                                                        if (bigDecimal.compareTo(bigDecimal2) < 0) {
                                                                                                                                                            bigDecimal = bigDecimal2;
                                                                                                                                                        }
                                                                                                                                                        String strC3 = s5y.c(bigDecimal);
                                                                                                                                                        strC3.getClass();
                                                                                                                                                        dVar = new kcg.d(strC3);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        sswVar.m(new cx(string, length, dVar));
                                                                                                                                    }
                                                                                                                                });
                                                                                                                                clearEditText2.setFilters(new InputFilter[]{new nqy()});
                                                                                                                                qc qcVar4 = this.d;
                                                                                                                                if (qcVar4 == null) {
                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                ProgressButton progressButton2 = qcVar4.I;
                                                                                                                                progressButton2.setButtonText(sn5.c(progressButton2, R.string.common_functions__withdraw, new Object[0]));
                                                                                                                                uc3 uc3Var = this.y;
                                                                                                                                progressButton2.setOnClickListener(uc3Var);
                                                                                                                                qc qcVar5 = this.d;
                                                                                                                                if (qcVar5 == null) {
                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                qcVar5.J.setOnRefreshListener(this);
                                                                                                                                qcVar5.L.setAspectRatio(0.17777778f);
                                                                                                                                r910.b(qcVar5.G);
                                                                                                                                qcVar5.F.setOnClickListener(new tf8(this, i));
                                                                                                                                qcVar5.e.setOnClickListener(uc3Var);
                                                                                                                                qcVar5.C.setOnClickListener(uc3Var);
                                                                                                                                qcVar5.E.setOnClickListener(uc3Var);
                                                                                                                                qcVar5.i.setText(getCMSString(R.string.common_functions__balance_label, getCountryManager().f()));
                                                                                                                                qcVar5.P.setText(getCMSString(R.string.common_functions__withdrawable_balance_label, getCountryManager().f()));
                                                                                                                                qcVar5.c.setText(getCMSString(R.string.common_functions__amount_label, getCountryManager().f()));
                                                                                                                                mla.i(qcVar5.M, new op8(534628065, new xf8(this, i), true));
                                                                                                                                final qg8 qg8VarZ1 = z1();
                                                                                                                                String strA = this.e;
                                                                                                                                if (strA == null) {
                                                                                                                                    Intrinsics.n("phoneNumber");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                String str = this.f;
                                                                                                                                if (str == null) {
                                                                                                                                    Intrinsics.n("methodId");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                qg8VarZ1.y = str;
                                                                                                                                qg8VarZ1.w = strA;
                                                                                                                                ssw<String> sswVar = qg8VarZ1.F;
                                                                                                                                if (TextUtils.isDigitsOnly(strA) && strA.length() > 5) {
                                                                                                                                    strA = fu5.a("(?<=\\d{2})\\d(?=\\d{3})", strA, "*");
                                                                                                                                }
                                                                                                                                sswVar.m(strA);
                                                                                                                                qg8VarZ1.y1();
                                                                                                                                ej5.c(o8i0.d(qg8VarZ1), null, null, new pg8(qg8VarZ1, null), 3);
                                                                                                                                ej5.c(o8i0.d(qg8VarZ1), null, null, new ng8(qg8VarZ1, null), 3);
                                                                                                                                ej5.c(o8i0.d(qg8VarZ1), null, null, new mg8(qg8VarZ1, null), 3);
                                                                                                                                qg8VarZ1.f.b(o8i0.d(qg8VarZ1), new ig8(qg8VarZ1, i));
                                                                                                                                qg8VarZ1.G.f(this, new a(new Function1() { // from class: yf8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        String str2 = (String) obj;
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        qcVar6.H.setText(commonMobileMoneyWithdrawActivity.getCountryManager().M() + "   " + str2);
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.A.f(this, new a(new Function1() { // from class: bg8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        o77 o77Var = (o77) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        o77Var.getClass();
                                                                                                                                        String str2 = o77Var.a;
                                                                                                                                        int i4 = o77Var.b;
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        qcVar6.v.setText(str2);
                                                                                                                                        qc qcVar7 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar7 != null) {
                                                                                                                                            qcVar7.v.setIconResId(i4);
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.L.f(this, new a(new Function1() { // from class: cg8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        List<String> list = (List) obj;
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        qcVar6.w.removeAllViews();
                                                                                                                                        list.getClass();
                                                                                                                                        for (String str2 : list) {
                                                                                                                                            qc qcVar7 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar7 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            TextView textView11 = new TextView(qcVar7.w.getContext());
                                                                                                                                            textView11.setText(str2);
                                                                                                                                            textView11.setTextSize(1, 12.0f);
                                                                                                                                            textView11.setLineSpacing(0.0f, 1.2f);
                                                                                                                                            textView11.setPadding(0, 0, 0, zch0.b(commonMobileMoneyWithdrawActivity.getResources(), 2));
                                                                                                                                            textView11.setTextColor(Color.parseColor("#9ca0ab"));
                                                                                                                                            qc qcVar8 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar8 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar8.w.addView(textView11);
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.O.f(this, new a(new Function1() { // from class: dg8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        kmj0 kmj0Var = (kmj0) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        kmj0Var.getClass();
                                                                                                                                        boolean zEquals = kmj0Var.equals(kmj0.c);
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (zEquals) {
                                                                                                                                            if (qcVar6 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar6.N.setVisibility(8);
                                                                                                                                            qc qcVar7 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar7 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar7.O.setVisibility(8);
                                                                                                                                            qc qcVar8 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar8 != null) {
                                                                                                                                                qcVar8.P.setVisibility(8);
                                                                                                                                                return Unit.a;
                                                                                                                                            }
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        TextView textView11 = qcVar6.N;
                                                                                                                                        int i4 = 0;
                                                                                                                                        textView11.setVisibility(0);
                                                                                                                                        qc qcVar9 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar9 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        qcVar9.O.setVisibility(0);
                                                                                                                                        qc qcVar10 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar10 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        qcVar10.P.setVisibility(0);
                                                                                                                                        qc qcVar11 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar11 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        qcVar11.N.setText(kmj0Var.a);
                                                                                                                                        qc qcVar12 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar12 != null) {
                                                                                                                                            qcVar12.O.setOnClickListener(new pf8(i4, commonMobileMoneyWithdrawActivity, kmj0Var));
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.Q.f(this, new a(new Function1() { // from class: jf8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        xu1 xu1Var = (xu1) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        xu1Var.getClass();
                                                                                                                                        qc qcVar6 = this.a.d;
                                                                                                                                        if (qcVar6 != null) {
                                                                                                                                            qcVar6.f.setText(xu1Var.a);
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                        Intrinsics.n("binding");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                z1().Y.f(this, new a(new Function1() { // from class: rf8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        CharSequence charSequenceE;
                                                                                                                                        ct ctVar = (ct) obj;
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        if (ctVar == null) {
                                                                                                                                            qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar6 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar6.y.setVisibility(8);
                                                                                                                                            qc qcVar7 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar7 != null) {
                                                                                                                                                qcVar7.K.setVisibility(8);
                                                                                                                                                return Unit.a;
                                                                                                                                            }
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        if (ctVar instanceof ct.b) {
                                                                                                                                            qc qcVar8 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar8 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar8.y.setVisibility(8);
                                                                                                                                            qc qcVar9 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar9 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar9.K.setVisibility(0);
                                                                                                                                            qc qcVar10 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar10 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar10.D.setText(((ct.b) ctVar).a);
                                                                                                                                        } else {
                                                                                                                                            int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                            if (!(ctVar instanceof ct.a)) {
                                                                                                                                                uhc.a();
                                                                                                                                                return null;
                                                                                                                                            }
                                                                                                                                            m7l m7lVar = ((ct.a) ctVar).a;
                                                                                                                                            qc qcVar11 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar11 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar11.K.setVisibility(8);
                                                                                                                                            qc qcVar12 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar12 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar12.y.setVisibility(0);
                                                                                                                                            CharSequence charSequenceE2 = m7lVar.getTitle().e(commonMobileMoneyWithdrawActivity);
                                                                                                                                            CharSequence charSequenceE3 = m7lVar.b().getText().e(commonMobileMoneyWithdrawActivity);
                                                                                                                                            i7l i7lVarA = m7lVar.a();
                                                                                                                                            if (!(i7lVarA instanceof i7l.a)) {
                                                                                                                                                i7lVarA = null;
                                                                                                                                            }
                                                                                                                                            i7l.a aVar = (i7l.a) i7lVarA;
                                                                                                                                            if (aVar == null || (charSequenceE = aVar.a.e(commonMobileMoneyWithdrawActivity)) == null) {
                                                                                                                                                charSequenceE = "";
                                                                                                                                            }
                                                                                                                                            if (m7lVar.equals(m7l.a.a)) {
                                                                                                                                                qc qcVar13 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar13 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar13.B.setOnClickListener(new wf8());
                                                                                                                                                qc qcVar14 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar14 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar14.B.setVisibility(0);
                                                                                                                                            } else if (m7lVar.equals(m7l.i.a)) {
                                                                                                                                                qc qcVar15 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar15 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar15.B.setOnClickListener(null);
                                                                                                                                                qc qcVar16 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar16 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar16.B.setVisibility(8);
                                                                                                                                            } else if (m7lVar.equals(m7l.h.a)) {
                                                                                                                                                qc qcVar17 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar17 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar17.B.setOnClickListener(new sc3(commonMobileMoneyWithdrawActivity, 1));
                                                                                                                                                qc qcVar18 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar18 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar18.B.setVisibility(0);
                                                                                                                                            }
                                                                                                                                            qc qcVar19 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar19 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar19.A.setText(charSequenceE2);
                                                                                                                                            qc qcVar20 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar20 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar20.z.setText(charSequenceE3);
                                                                                                                                            qc qcVar21 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar21 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar21.B.setText(charSequenceE);
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.V.f(this, new a(new Function1() { // from class: kf8
                                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        Object obj2;
                                                                                                                                        vhg vhgVar = (vhg) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        String strB = null;
                                                                                                                                        if (vhgVar.b) {
                                                                                                                                            obj2 = null;
                                                                                                                                        } else {
                                                                                                                                            vhgVar.b = true;
                                                                                                                                            obj2 = vhgVar.a;
                                                                                                                                        }
                                                                                                                                        if (((wqe) obj2) != null) {
                                                                                                                                            o77 o77Var = (o77) qg8VarZ1.A.d();
                                                                                                                                            String str2 = o77Var != null ? o77Var.a : null;
                                                                                                                                            final CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: vf8
                                                                                                                                                @Override // android.content.DialogInterface.OnClickListener
                                                                                                                                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                                                                                                                                    int i5 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                                    commonMobileMoneyWithdrawActivity.finish();
                                                                                                                                                }
                                                                                                                                            };
                                                                                                                                            String strB2 = TextUtils.isEmpty(null) ? sn5.b(commonMobileMoneyWithdrawActivity, R.string.page_instant_virtual__coming_soon, new Object[0]) : null;
                                                                                                                                            if (TextUtils.isEmpty(null) && str2 != null) {
                                                                                                                                                strB = sn5.b(commonMobileMoneyWithdrawActivity, R.string.page_payment__deposits_and_withdrawals_should_be_available_before, str2);
                                                                                                                                            }
                                                                                                                                            b.a title = new b.a(commonMobileMoneyWithdrawActivity).setTitle(strB2);
                                                                                                                                            AlertController.b bVar = title.a;
                                                                                                                                            bVar.f = strB;
                                                                                                                                            bVar.k = false;
                                                                                                                                            title.c(sn5.b(commonMobileMoneyWithdrawActivity, R.string.common_functions__ok, new Object[0]), onClickListener);
                                                                                                                                            title.create().show();
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.E.f(this, new a(new Function1() { // from class: lf8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        cx cxVar = (cx) obj;
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n(CaxEybC.SfsFvwcUxdepLsa);
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        ClearEditText clearEditText3 = qcVar6.b;
                                                                                                                                        String str2 = cxVar.a;
                                                                                                                                        kcg kcgVar = cxVar.c;
                                                                                                                                        if (!Intrinsics.g(str2, String.valueOf(clearEditText3.getText()))) {
                                                                                                                                            clearEditText3.setText(cxVar.a);
                                                                                                                                            clearEditText3.setSelection(cxVar.b);
                                                                                                                                        }
                                                                                                                                        if (Intrinsics.g(kcgVar, kcg.a.b)) {
                                                                                                                                            clearEditText3.setError((String) null);
                                                                                                                                        } else if (kcgVar instanceof kcg.c) {
                                                                                                                                            clearEditText3.setError(sn5.c(clearEditText3, R.string.page_withdraw__the_maximum_withdrawal_amount_is_vcurrency_vnum, commonMobileMoneyWithdrawActivity.getCountryManager().f(), kcgVar.a));
                                                                                                                                        } else if (kcgVar instanceof kcg.g) {
                                                                                                                                            clearEditText3.setError(sn5.c(clearEditText3, R.string.page_withdraw__the_minimum_withdrawal_amount_is_vcurrency_vnum, commonMobileMoneyWithdrawActivity.getCountryManager().f(), kcgVar.a));
                                                                                                                                        } else if (Intrinsics.g(kcgVar, kcg.e.b)) {
                                                                                                                                            clearEditText3.setError(sn5.c(clearEditText3, R.string.common_feedback__your_balance_is_insufficient, new Object[0]));
                                                                                                                                        } else if (kcgVar instanceof kcg.d) {
                                                                                                                                            clearEditText3.setError(sn5.c(clearEditText3, R.string.page_withdraw__amount_exceeds_your_withdrawable_balance_vcurrency_vbalance, commonMobileMoneyWithdrawActivity.getCountryManager().f(), kcgVar.a));
                                                                                                                                        } else if (Intrinsics.g(kcgVar, kcg.h.b)) {
                                                                                                                                            clearEditText3.setError(sn5.c(clearEditText3, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.C.f(this, new a(new Function1() { // from class: mf8
                                                                                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        Object obj2;
                                                                                                                                        String cMSString;
                                                                                                                                        String cMSString2;
                                                                                                                                        DialogInterface.OnClickListener sf8Var;
                                                                                                                                        ssw sswVar2 = qg8VarZ1.A;
                                                                                                                                        vhg vhgVar = (vhg) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        if (vhgVar.b) {
                                                                                                                                            obj2 = null;
                                                                                                                                        } else {
                                                                                                                                            vhgVar.b = true;
                                                                                                                                            obj2 = vhgVar.a;
                                                                                                                                        }
                                                                                                                                        emj0 emj0Var = (emj0) obj2;
                                                                                                                                        if (emj0Var != null) {
                                                                                                                                            boolean z2 = emj0Var instanceof emj0.a;
                                                                                                                                            final CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                            if (z2) {
                                                                                                                                                qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                                if (qcVar6 == null) {
                                                                                                                                                    Intrinsics.n("binding");
                                                                                                                                                    throw null;
                                                                                                                                                }
                                                                                                                                                qcVar6.I.setLoading(false);
                                                                                                                                                emj0.a aVar = (emj0.a) emj0Var;
                                                                                                                                                String str2 = aVar.a;
                                                                                                                                                String str3 = aVar.b;
                                                                                                                                                String str4 = aVar.d;
                                                                                                                                                String str5 = aVar.c;
                                                                                                                                                int i4 = aVar.e;
                                                                                                                                                o77 o77Var = (o77) sswVar2.d();
                                                                                                                                                Integer numValueOf = o77Var != null ? Integer.valueOf(o77Var.b) : null;
                                                                                                                                                o77 o77Var2 = (o77) sswVar2.d();
                                                                                                                                                String str6 = o77Var2 != null ? o77Var2.c : null;
                                                                                                                                                WithdrawAlertHintStatus withdrawAlertHintStatus = (WithdrawAlertHintStatus) commonMobileMoneyWithdrawActivity.z1().a0.a.getValue();
                                                                                                                                                str2.getClass();
                                                                                                                                                str3.getClass();
                                                                                                                                                str4.getClass();
                                                                                                                                                str5.getClass();
                                                                                                                                                withdrawAlertHintStatus.getClass();
                                                                                                                                                zk8 zk8Var = new zk8();
                                                                                                                                                zk8Var.setArguments(vj5.a(new Pair("ARG_AMOUNT", str2), new Pair("ARG_REMAIN_AMOUNT", str3), new Pair("ARG_WITHDRAW_TO", str4), new Pair("ARG_MOBILE_NUMBER", str5), new Pair("ARG_PAY_CH_ID", Integer.valueOf(i4)), new Pair(yFmFZvuWxAYfEj.GUiggoXBcPU, numValueOf), new Pair("ARG_CHANNEL_ICON_URL", str6), new Pair("ARG_DROP_ALERT", withdrawAlertHintStatus)));
                                                                                                                                                zk8Var.show(commonMobileMoneyWithdrawActivity.getSupportFragmentManager(), "WithdrawConfirmFragment");
                                                                                                                                            } else {
                                                                                                                                                if (!(emj0Var instanceof emj0.b)) {
                                                                                                                                                    uhc.a();
                                                                                                                                                    return null;
                                                                                                                                                }
                                                                                                                                                i41 i41Var = ((emj0.b) emj0Var).a;
                                                                                                                                                String cMSString3 = commonMobileMoneyWithdrawActivity.getCMSString(R.string.common_functions__cancel, new Object[0]);
                                                                                                                                                if (Intrinsics.g(i41Var, i41.a.a)) {
                                                                                                                                                    cMSString = commonMobileMoneyWithdrawActivity.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_tip, new Object[0]);
                                                                                                                                                    cMSString2 = commonMobileMoneyWithdrawActivity.getCMSString(R.string.identity_verification__verify, new Object[0]);
                                                                                                                                                    sf8Var = new sf8();
                                                                                                                                                } else if (Intrinsics.g(i41Var, i41.c.a)) {
                                                                                                                                                    cMSString = commonMobileMoneyWithdrawActivity.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_pending_verification_tip, new Object[0]);
                                                                                                                                                    cMSString2 = commonMobileMoneyWithdrawActivity.getCMSString(R.string.common_functions__ok, new Object[0]);
                                                                                                                                                    cMSString3 = null;
                                                                                                                                                    sf8Var = null;
                                                                                                                                                } else if (Intrinsics.g(i41Var, i41.b.a)) {
                                                                                                                                                    cMSString = commonMobileMoneyWithdrawActivity.getCMSString(R.string.component_withdraw_block_tip__withdrawals_blocked_verification_failed_tip, new Object[0]);
                                                                                                                                                    cMSString2 = commonMobileMoneyWithdrawActivity.getCMSString(R.string.common_functions__contact_us, new Object[0]);
                                                                                                                                                    sf8Var = new DialogInterface.OnClickListener() { // from class: uf8
                                                                                                                                                        @Override // android.content.DialogInterface.OnClickListener
                                                                                                                                                        public final void onClick(DialogInterface dialogInterface, int i5) {
                                                                                                                                                            int i6 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                                            CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity2 = commonMobileMoneyWithdrawActivity;
                                                                                                                                                            d0n d0nVar = commonMobileMoneyWithdrawActivity2.b;
                                                                                                                                                            if (d0nVar != null) {
                                                                                                                                                                d0nVar.b(commonMobileMoneyWithdrawActivity2, snb0.WITHDRAW);
                                                                                                                                                            } else {
                                                                                                                                                                Intrinsics.n("utils");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    };
                                                                                                                                                } else if (!Intrinsics.g(i41Var, i41.d.a)) {
                                                                                                                                                    cMSString = null;
                                                                                                                                                    cMSString2 = null;
                                                                                                                                                    sf8Var = null;
                                                                                                                                                }
                                                                                                                                                b.a title = new b.a(commonMobileMoneyWithdrawActivity).setTitle(commonMobileMoneyWithdrawActivity.getCMSString(R.string.page_withdraw__withdrawals_blocked, new Object[0]));
                                                                                                                                                title.a.f = cMSString;
                                                                                                                                                if (cMSString != null && cMSString.length() != 0) {
                                                                                                                                                    title.c(cMSString2, sf8Var);
                                                                                                                                                }
                                                                                                                                                if (cMSString3 != null && cMSString3.length() != 0) {
                                                                                                                                                    title.b(cMSString3, null);
                                                                                                                                                }
                                                                                                                                                title.f();
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.I.f(this, new a(new nf8(this, i)));
                                                                                                                                qg8VarZ1.J.f(this, new a(new Function1() { // from class: of8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        Boolean bool = (Boolean) obj;
                                                                                                                                        qc qcVar6 = this.a.d;
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        ProgressButton progressButton3 = qcVar6.I;
                                                                                                                                        bool.getClass();
                                                                                                                                        progressButton3.setEnabled(bool.booleanValue());
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                qg8VarZ1.S.f(this, new a(new Function1() { // from class: zf8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        c0w c0wVar = (c0w) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        boolean zG = Intrinsics.g(c0wVar, c0w.b.a);
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        if (zG) {
                                                                                                                                            qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar6 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar6.F.a();
                                                                                                                                            qc qcVar7 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar7 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar7.G.setVisibility(0);
                                                                                                                                        } else if (Intrinsics.g(c0wVar, c0w.c.a)) {
                                                                                                                                            qc qcVar8 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar8 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar8.F.a();
                                                                                                                                            qc qcVar9 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar9 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar9.G.setVisibility(8);
                                                                                                                                        } else {
                                                                                                                                            if (!(c0wVar instanceof c0w.a)) {
                                                                                                                                                uhc.a();
                                                                                                                                                return null;
                                                                                                                                            }
                                                                                                                                            String cMSString = commonMobileMoneyWithdrawActivity.getCMSString(((c0w.a) c0wVar).a, new Object[0]);
                                                                                                                                            qc qcVar10 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar10 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar10.F.c(cMSString);
                                                                                                                                            qc qcVar11 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                            if (qcVar11 == null) {
                                                                                                                                                Intrinsics.n("binding");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                            qcVar11.G.setVisibility(8);
                                                                                                                                        }
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                g1i g1iVar = new g1i(qg8VarZ1.h0, new eg8(this, null));
                                                                                                                                s9s lifecycle = getLifecycle();
                                                                                                                                lifecycle.getClass();
                                                                                                                                arr.a(g1iVar, lifecycle, s9s.b.d);
                                                                                                                                q8i0 q8i0Var = this.w;
                                                                                                                                ((bm) q8i0Var.getValue()).c.f(this, new a(new Function1() { // from class: ag8
                                                                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                                                                    public final Object invoke(Object obj) {
                                                                                                                                        String imgUrl;
                                                                                                                                        final Ads ads = (Ads) obj;
                                                                                                                                        int i3 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                        ads.getClass();
                                                                                                                                        String linkUrl = ads.getLinkUrl();
                                                                                                                                        if (linkUrl == null || linkUrl.length() == 0 || (imgUrl = ads.getImgUrl()) == null || imgUrl.length() == 0) {
                                                                                                                                            return Unit.a;
                                                                                                                                        }
                                                                                                                                        CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = this.a;
                                                                                                                                        qc qcVar6 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar6 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        AspectRatioImageView aspectRatioImageView2 = qcVar6.L;
                                                                                                                                        aspectRatioImageView2.setVisibility(0);
                                                                                                                                        gbn gbnVarA = sh8.a();
                                                                                                                                        String imgUrl2 = ads.getImgUrl();
                                                                                                                                        qc qcVar7 = commonMobileMoneyWithdrawActivity.d;
                                                                                                                                        if (qcVar7 == null) {
                                                                                                                                            Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        gbnVarA.a(imgUrl2, qcVar7.L);
                                                                                                                                        aspectRatioImageView2.setOnClickListener(new View.OnClickListener() { // from class: qf8
                                                                                                                                            @Override // android.view.View.OnClickListener
                                                                                                                                            public final void onClick(View view) {
                                                                                                                                                int i4 = CommonMobileMoneyWithdrawActivity.z;
                                                                                                                                                sh8.c().e(ads.getLinkUrl());
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        return Unit.a;
                                                                                                                                    }
                                                                                                                                }));
                                                                                                                                if (this.i) {
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                bm bmVar = (bm) q8i0Var.getValue();
                                                                                                                                ej5.c(o8i0.d(bmVar), null, null, new am(bmVar, null), 3);
                                                                                                                                return;
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

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
        qg8 qg8VarZ1 = z1();
        ej5.c(o8i0.d(qg8VarZ1), null, null, new pg8(qg8VarZ1, null), 3);
        qg8VarZ1.f.b(o8i0.d(qg8VarZ1), new ig8(qg8VarZ1, 0));
    }

    public final qg8 z1() {
        return (qg8) this.v.getValue();
    }
}
