package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.globalpay.customview.PaymentAccountView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.LoadingView;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lnay;", "Llsj0;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nay extends iyl {
    public final i6i0 c0;
    public final String d0;
    public final String e0;
    public final mpe0 f0;
    public final mpe0 g0;
    public final mpe0 h0;
    public final mpe0 i0;
    public static final /* synthetic */ ohp<Object>[] k0 = {new d630(0, nay.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentWithdrawOttPayoutsBinding;")};
    public static final a j0 = new a();

    public static final class a {
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, zyi> {
        public static final b a = new b(1, zyi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentWithdrawOttPayoutsBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final zyi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.alert_hint_view;
            HintView hintView = (HintView) h5e.a(R.id.alert_hint_view, view2);
            if (hintView != null) {
                i = R.id.guideline_begin;
                if (((Guideline) h5e.a(R.id.guideline_begin, view2)) != null) {
                    i = R.id.guideline_end;
                    if (((Guideline) h5e.a(R.id.guideline_end, view2)) != null) {
                        i = R.id.ott_payout_account_view;
                        PaymentAccountView paymentAccountView = (PaymentAccountView) h5e.a(R.id.ott_payout_account_view, view2);
                        if (paymentAccountView != null) {
                            i = R.id.ott_payout_amount;
                            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.ott_payout_amount, view2);
                            if (clearEditText != null) {
                                i = R.id.ott_payout_amount_container;
                                if (((FrameLayout) h5e.a(R.id.ott_payout_amount_container, view2)) != null) {
                                    i = R.id.ott_payout_amount_label;
                                    TextView textView = (TextView) h5e.a(R.id.ott_payout_amount_label, view2);
                                    if (textView != null) {
                                        i = R.id.ott_payout_amount_warning;
                                        TextView textView2 = (TextView) h5e.a(R.id.ott_payout_amount_warning, view2);
                                        if (textView2 != null) {
                                            i = R.id.ott_payout_balance;
                                            TextView textView3 = (TextView) h5e.a(R.id.ott_payout_balance, view2);
                                            if (textView3 != null) {
                                                i = R.id.ott_payout_balance_label;
                                                TextView textView4 = (TextView) h5e.a(R.id.ott_payout_balance_label, view2);
                                                if (textView4 != null) {
                                                    i = R.id.ott_payout_description_container;
                                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.ott_payout_description_container, view2);
                                                    if (linearLayout != null) {
                                                        i = R.id.ott_payout_loading;
                                                        if (((LoadingView) h5e.a(R.id.ott_payout_loading, view2)) != null) {
                                                            i = R.id.ott_payout_logo;
                                                            ImageView imageView = (ImageView) h5e.a(R.id.ott_payout_logo, view2);
                                                            if (imageView != null) {
                                                                i = R.id.ott_payout_mobile_number_title;
                                                                TextView textView5 = (TextView) h5e.a(R.id.ott_payout_mobile_number_title, view2);
                                                                if (textView5 != null) {
                                                                    i = R.id.ott_payout_withdraw_button;
                                                                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.ott_payout_withdraw_button, view2);
                                                                    if (progressButton != null) {
                                                                        i = R.id.ott_payout_withdrawable_balance;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.ott_payout_withdrawable_balance, view2);
                                                                        if (textView6 != null) {
                                                                            i = R.id.ott_payout_withdrawable_balance_hint;
                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.ott_payout_withdrawable_balance_hint, view2);
                                                                            if (appCompatImageView != null) {
                                                                                i = R.id.ott_payout_withdrawable_balance_label;
                                                                                TextView textView7 = (TextView) h5e.a(R.id.ott_payout_withdrawable_balance_label, view2);
                                                                                if (textView7 != null) {
                                                                                    return new zyi((ConstraintLayout) view2, hintView, paymentAccountView, clearEditText, textView, textView2, textView3, textView4, linearLayout, imageView, textView5, progressButton, textView6, appCompatImageView, textView7);
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
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    public nay() {
        super(R.layout.fragment_withdraw_ott_payouts);
        this.a0 = false;
        this.b0 = false;
        this.c0 = g5e.a(b.a);
        this.d0 = String.valueOf(280);
        this.e0 = "28001";
        this.f0 = hwr.b(new hdf(this, 1));
        this.g0 = hwr.b(new ht6(this, 1));
        this.h0 = hwr.b(new Function0() { // from class: may
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                nay.a aVar = nay.j0;
                c100 c100VarH1 = this.a.h1();
                return (c100VarH1 == null || (str = c100VarH1.b) == null) ? "" : str;
            }
        });
        this.i0 = hwr.b(new qtt(this, 1));
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getD0() {
        return this.d0;
    }

    @Override // defpackage.c000
    public final HintView I0() {
        return w1().b;
    }

    @Override // defpackage.c000
    public final View J0() {
        return w1().C;
    }

    @Override // defpackage.c000
    public final TextView K0() {
        return w1().D;
    }

    @Override // defpackage.c000
    public final TextView L0() {
        return w1().B;
    }

    @Override // defpackage.lsj0
    public final boolean a1(String str) {
        double d = Double.parseDouble(str);
        DecimalFormat decimalFormat = b6y.a;
        if (d % 10.0d == 0.0d) {
            return true;
        }
        w1().d.setError(sn5.d(this, R.string.page_withdraw__amount_should_be_multiple_of_10, u0()));
        return false;
    }

    @Override // defpackage.lsj0
    public final void b1() {
        nrj0.x1(m1(), String.valueOf(w1().d.getText()), h1(), (String) this.f0.getValue(), null, 8);
    }

    @Override // defpackage.lsj0
    public final TextView c1() {
        return w1().e;
    }

    @Override // defpackage.lsj0
    public final TextView d1() {
        return w1().f;
    }

    @Override // defpackage.lsj0
    public final TextView e1() {
        return w1().v;
    }

    @Override // defpackage.lsj0
    public final TextView f1() {
        return w1().i;
    }

    @Override // defpackage.lsj0
    public final TextView g1() {
        return w1().z;
    }

    @Override // defpackage.lsj0
    public final c100 h1() {
        return (c100) this.g0.getValue();
    }

    @Override // defpackage.lsj0
    public final String i1() {
        String str = (String) this.f0.getValue();
        c100 c100Var = c100.e;
        if (Intrinsics.g(str, "1-FNB")) {
            return "11";
        }
        if (Intrinsics.g(str, "2-Standard Bank Instant Money")) {
            return "12";
        }
        if (Intrinsics.g(str, "4-Nedbank Cardless")) {
            return "13";
        }
        return Intrinsics.g(str, "67-ABSA CashSend") ? CashoutMetricsPayload.Metric.KeyValueMap.INACTIVE_OUTCOME : "11";
    }

    @Override // defpackage.lsj0
    public final PaymentAccountView k1() {
        return w1().c;
    }

    @Override // defpackage.lsj0
    public final ProgressButton l1() {
        return w1().A;
    }

    @Override // defpackage.lsj0
    public final void n1() {
        super.n1();
        r1();
    }

    @Override // defpackage.lsj0
    public final void o1() {
        s1((String) this.h0.getValue(), t0().M() + G0());
    }

    @Override // defpackage.lsj0
    public final String p1() {
        return (String) this.h0.getValue();
    }

    @Override // defpackage.lsj0
    public final void q1() {
        w1().y.setImageResource(((Number) this.i0.getValue()).intValue());
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return w1().d;
    }

    @Override // defpackage.lsj0
    public final void r1() {
        zyi zyiVarW1 = w1();
        PaymentAccountView paymentAccountView = zyiVarW1.c;
        ProgressButton progressButton = zyiVarW1.A;
        ClearEditText clearEditText = zyiVarW1.d;
        TextView textView = paymentAccountView.getMobileNumber().z;
        boolean z = false;
        if (!(textView == null ? false : textView.isShown())) {
            TextView textView2 = clearEditText.z;
            if (!(textView2 == null ? false : textView2.isShown())) {
                if (zyiVarW1.c.getMobileNumber().length() > 0 && clearEditText.length() > 0) {
                    z = true;
                }
                progressButton.setEnabled(z);
                return;
            }
        }
        progressButton.setEnabled(false);
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getE0() {
        return this.e0;
    }

    @Override // defpackage.lsj0
    public final void u1(String str, String str2) {
        super.u1(str, String.valueOf(w1().c.getMobileNumber().getText()));
    }

    public final zyi w1() {
        return (zyi) this.c0.a(this, k0[0]);
    }

    @Override // defpackage.c000
    public final View y0() {
        return w1().w;
    }
}
