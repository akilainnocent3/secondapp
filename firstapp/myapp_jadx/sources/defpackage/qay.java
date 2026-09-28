package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqay;", "Llrd;", "Lk9j;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qay extends jyl implements k9j {
    public final String g0;
    public final String h0;
    public final ga00 i0;
    public final i6i0 j0;
    public final wwd0 k0;
    public static final /* synthetic */ ohp<Object>[] m0 = {new d630(0, qay.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentOttVoucherDepositBinding;")};
    public static final a l0 = new a();

    public static final class a {
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, dxi> {
        public static final b a = new b(1, dxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentOttVoucherDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final dxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.alert_hint_view;
            HintView hintView = (HintView) h5e.a(R.id.alert_hint_view, view2);
            if (hintView != null) {
                i = R.id.guideline_begin;
                if (((Guideline) h5e.a(R.id.guideline_begin, view2)) != null) {
                    i = R.id.guideline_end;
                    if (((Guideline) h5e.a(R.id.guideline_end, view2)) != null) {
                        i = R.id.ott_voucher_balance;
                        TextView textView = (TextView) h5e.a(R.id.ott_voucher_balance, view2);
                        if (textView != null) {
                            i = R.id.ott_voucher_balance_label;
                            TextView textView2 = (TextView) h5e.a(R.id.ott_voucher_balance_label, view2);
                            if (textView2 != null) {
                                i = R.id.ott_voucher_deposit_button;
                                ProgressButton progressButton = (ProgressButton) h5e.a(R.id.ott_voucher_deposit_button, view2);
                                if (progressButton != null) {
                                    i = R.id.ott_voucher_description_container;
                                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.ott_voucher_description_container, view2);
                                    if (linearLayout != null) {
                                        i = R.id.ott_voucher_kyc_hint;
                                        TextView textView3 = (TextView) h5e.a(R.id.ott_voucher_kyc_hint, view2);
                                        if (textView3 != null) {
                                            i = R.id.ott_voucher_logo;
                                            if (((ImageView) h5e.a(R.id.ott_voucher_logo, view2)) != null) {
                                                i = R.id.ott_voucher_pin_edit;
                                                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.ott_voucher_pin_edit, view2);
                                                if (clearEditText != null) {
                                                    i = R.id.ott_voucher_pin_label;
                                                    if (((TextView) h5e.a(R.id.ott_voucher_pin_label, view2)) != null) {
                                                        i = R.id.ott_voucher_pin_warning;
                                                        TextView textView4 = (TextView) h5e.a(R.id.ott_voucher_pin_warning, view2);
                                                        if (textView4 != null) {
                                                            return new dxi((ConstraintLayout) view2, hintView, textView, textView2, progressButton, linearLayout, textView3, clearEditText, textView4);
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

    public qay() {
        super(R.layout.fragment_ott_voucher_deposit);
        this.e0 = false;
        this.f0 = false;
        this.g0 = String.valueOf(280);
        c100 c100Var = c100.e;
        this.h0 = String.valueOf(28002);
        this.i0 = ga00.DEPOSIT;
        this.j0 = g5e.a(b.a);
        this.k0 = xwd0.a(Boolean.FALSE);
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return D1().i;
    }

    public final dxi D1() {
        return (dxi) this.j0.a(this, m0[0]);
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: E0 */
    public final boolean getF() {
        return false;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final ga00 getI0() {
        return this.i0;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getG0() {
        return this.g0;
    }

    @Override // defpackage.c000
    public final HintView I0() {
        return D1().b;
    }

    @Override // defpackage.lrd
    public final void a1() {
        r9e.x1(h1(), "1", Integer.parseInt(this.h0), D1().v.getTextValue(), null, 8);
    }

    @Override // defpackage.lrd
    public final TextView d1() {
        return D1().c;
    }

    @Override // defpackage.lrd
    public final TextView e1() {
        return D1().d;
    }

    @Override // defpackage.lrd
    public final ProgressButton g1() {
        return D1().e;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: i1 */
    public final String getH0() {
        return "9";
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: l1 */
    public final boolean getC0() {
        return false;
    }

    @Override // defpackage.lrd
    public final String n1() {
        return "9";
    }

    @Override // defpackage.lrd
    public final boolean p1(x7e x7eVar) {
        x7eVar.getClass();
        if (x7eVar instanceof x7e.d.l) {
            D1().v.setError(sn5.d(this, R.string.page_payment__invalid_ott_voucher_pin_value, new Object[0]));
            return true;
        }
        if (!(x7eVar instanceof x7e.d.o)) {
            return false;
        }
        A1();
        c000.p0(this, sn5.d(this, R.string.page_payment__pending_request, new Object[0]), sn5.d(this, R.string.page_payment__you_deposit_request_has_been_submitted_tip, new Object[0]), null, new pay(), null, null, 116);
        return true;
    }

    @Override // defpackage.lrd
    public final void r1() {
        dxi dxiVarD1 = D1();
        super.r1();
        ClearEditText clearEditText = dxiVarD1.v;
        clearEditText.setErrorView(dxiVarD1.w);
        clearEditText.setFilters(new InputFilter[]{new ype(), new InputFilter.LengthFilter(12)});
        clearEditText.addTextChangedListener(new ray(this, clearEditText));
        ProgressButton progressButton = dxiVarD1.e;
        progressButton.setButtonText(sn5.d(this, R.string.page_payment__enter_the_ott_voucher_pin_number, new Object[0]));
        k1().e(progressButton, "deposit__redeem_voucher__btn");
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd, defpackage.c000
    public final lyh<Boolean> v0() {
        return this.k0;
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().e;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        String strD = sn5.d(this, R.string.za_page_payment__ott_voucher, new Object[0]);
        String textValue = D1().v.getTextValue();
        textValue.getClass();
        return tug.a(strD, " ", sn5.d(this, R.string.app_common__star_number, wae0.L(4, textValue)));
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().f;
    }

    @Override // defpackage.lrd
    public final void x1() {
    }
}
