package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Livy;", "Llrd;", "Lk9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ivy extends pyl implements k9j {
    public static final /* synthetic */ ohp<Object>[] m0 = {new d630(0, ivy.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentOneVoucherByFlashDepositBinding;")};
    public final String g0;
    public final String h0;
    public final ga00 i0;
    public final i6i0 j0;
    public final wwd0 k0;
    public final wwd0 l0;

    public static final /* synthetic */ class a extends saj implements Function1<View, bxi> {
        public static final a a = new a(1, bxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentOneVoucherByFlashDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final bxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.alert_hint_view;
            HintView hintView = (HintView) h5e.a(R.id.alert_hint_view, view2);
            if (hintView != null) {
                i = R.id.balance;
                TextView textView = (TextView) h5e.a(R.id.balance, view2);
                if (textView != null) {
                    i = R.id.balance_label;
                    TextView textView2 = (TextView) h5e.a(R.id.balance_label, view2);
                    if (textView2 != null) {
                        i = R.id.deposit_button;
                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.deposit_button, view2);
                        if (progressButton != null) {
                            i = R.id.description_container;
                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.description_container, view2);
                            if (linearLayout != null) {
                                i = R.id.logo;
                                if (((ImageView) h5e.a(R.id.logo, view2)) != null) {
                                    i = R.id.voucher_pin_edit;
                                    ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.voucher_pin_edit, view2);
                                    if (clearEditText != null) {
                                        i = R.id.voucher_pin_label;
                                        if (((TextView) h5e.a(R.id.voucher_pin_label, view2)) != null) {
                                            i = R.id.voucher_pin_warning;
                                            TextView textView3 = (TextView) h5e.a(R.id.voucher_pin_warning, view2);
                                            if (textView3 != null) {
                                                return new bxi((ScrollView) view2, hintView, textView, textView2, progressButton, linearLayout, clearEditText, textView3);
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

    public ivy() {
        super(R.layout.fragment_one_voucher_by_flash_deposit);
        this.e0 = false;
        this.f0 = false;
        this.g0 = String.valueOf(330);
        c100 c100Var = c100.e;
        this.h0 = String.valueOf(33001);
        this.i0 = ga00.DEPOSIT;
        this.j0 = g5e.a(a.a);
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.k0 = wwd0VarA;
        this.l0 = wwd0VarA;
    }

    public final bxi D1() {
        return (bxi) this.j0.a(this, m0[0]);
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
        r9e.x1(h1(), "1", Integer.parseInt(this.h0), D1().i.getTextValue(), null, 8);
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
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd
    public final String n1() {
        return this.h0;
    }

    @Override // defpackage.lrd
    public final boolean p1(x7e x7eVar) {
        x7eVar.getClass();
        if (x7eVar instanceof x7e.d.g) {
            D1().i.setError(sn5.d(this, R.string.page_payment__invalid_1voucher_pin_value, new Object[0]));
            return true;
        }
        if (!(x7eVar instanceof x7e.d.o)) {
            return false;
        }
        A1();
        c000.p0(this, sn5.d(this, R.string.page_payment__pending_request, new Object[0]), sn5.d(this, R.string.page_payment__you_deposit_request_has_been_submitted_tip, new Object[0]), null, new b82(1), null, null, 116);
        return true;
    }

    @Override // defpackage.lrd
    public final void r1() {
        bxi bxiVarD1 = D1();
        super.r1();
        ClearEditText clearEditText = bxiVarD1.i;
        clearEditText.setErrorView(bxiVarD1.v);
        clearEditText.setFilters(new InputFilter[]{new ype(), new InputFilter.LengthFilter(16)});
        clearEditText.addTextChangedListener(new jvy(this, clearEditText));
        ProgressButton progressButton = bxiVarD1.e;
        progressButton.setButtonText(sn5.d(this, R.string.page_payment__redeem_voucher, new Object[0]));
        k1().e(progressButton, "deposit__redeem_voucher__btn");
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0 */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd, defpackage.c000
    public final lyh<Boolean> v0() {
        return this.l0;
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().e;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        return tug.a(sn5.d(this, R.string.za_page_payment__one_voucher, new Object[0]), " ", sn5.d(this, R.string.app_common__star_number, wae0.L(4, String.valueOf(D1().i.getText()))));
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().f;
    }

    @Override // defpackage.lrd
    public final void x1() {
    }
}
