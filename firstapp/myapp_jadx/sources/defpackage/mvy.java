package defpackage;

import android.text.InputFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmvy;", "Llrd;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mvy extends qyl {
    public static final /* synthetic */ ohp<Object>[] m0 = {new d630(0, mvy.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentOneVoucherDepositBinding;")};
    public final String g0;
    public final String h0;
    public final ga00 i0;
    public final i6i0 j0;
    public final wwd0 k0;
    public final n1i l0;

    /* JADX INFO: loaded from: classes2.dex */
    public static final /* synthetic */ class a extends saj implements Function1<View, cxi> {
        public static final a a = new a(1, cxi.class, "bind", iKBWavCysVP.gCU, 0);

        @Override // kotlin.jvm.functions.Function1
        public final cxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.alert_hint_view;
            HintView hintView = (HintView) h5e.a(R.id.alert_hint_view, view2);
            if (hintView != null) {
                i = R.id.amount;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount, view2);
                if (clearEditText != null) {
                    i = R.id.amount_container;
                    if (((FrameLayout) h5e.a(R.id.amount_container, view2)) != null) {
                        i = R.id.amount_label;
                        TextView textView = (TextView) h5e.a(R.id.amount_label, view2);
                        if (textView != null) {
                            i = R.id.amount_warning;
                            TextView textView2 = (TextView) h5e.a(R.id.amount_warning, view2);
                            if (textView2 != null) {
                                i = R.id.balance;
                                TextView textView3 = (TextView) h5e.a(R.id.balance, view2);
                                if (textView3 != null) {
                                    i = R.id.balance_label;
                                    TextView textView4 = (TextView) h5e.a(R.id.balance_label, view2);
                                    if (textView4 != null) {
                                        i = R.id.deposit_button;
                                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.deposit_button, view2);
                                        if (progressButton != null) {
                                            i = R.id.description_container;
                                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.description_container, view2);
                                            if (linearLayout != null) {
                                                i = R.id.kyc_hint;
                                                TextView textView5 = (TextView) h5e.a(R.id.kyc_hint, view2);
                                                if (textView5 != null) {
                                                    i = R.id.logo;
                                                    if (((ImageView) h5e.a(R.id.logo, view2)) != null) {
                                                        i = R.id.voucher_pin_edit;
                                                        ClearEditText clearEditText2 = (ClearEditText) h5e.a(R.id.voucher_pin_edit, view2);
                                                        if (clearEditText2 != null) {
                                                            i = R.id.voucher_pin_label;
                                                            if (((TextView) h5e.a(R.id.voucher_pin_label, view2)) != null) {
                                                                i = R.id.voucher_pin_warning;
                                                                TextView textView6 = (TextView) h5e.a(R.id.voucher_pin_warning, view2);
                                                                if (textView6 != null) {
                                                                    return new cxi((ScrollView) view2, hintView, clearEditText, textView, textView2, textView3, textView4, progressButton, linearLayout, textView5, clearEditText2, textView6);
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

    @c0d(c = "com.sportybet.android.globalpay.oneVoucher.OneVoucherDepositFragment$enableState$1", f = "OneVoucherDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<Boolean, Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ boolean b;

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, Boolean bool2, v1b<? super Boolean> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = bool2.booleanValue();
            b bVar = new b(3, v1bVar);
            bVar.a = zBooleanValue;
            bVar.b = zBooleanValue2;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            boolean z2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z && z2);
        }
    }

    public mvy() {
        super(R.layout.fragment_one_voucher_deposit);
        this.e0 = false;
        this.f0 = false;
        this.g0 = String.valueOf(270);
        c100 c100Var = c100.e;
        this.h0 = String.valueOf(27002);
        this.i0 = ga00.DEPOSIT;
        this.j0 = g5e.a(a.a);
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.k0 = wwd0VarA;
        this.l0 = new n1i(this.V, wwd0VarA, new b(3, null));
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return D1().y;
    }

    public final cxi D1() {
        return (cxi) this.j0.a(this, m0[0]);
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
        r9e r9eVarH1 = h1();
        String textValue = D1().c.getTextValue();
        textValue.getClass();
        r9e.x1(r9eVarH1, textValue, Integer.parseInt(this.h0), D1().z.getTextValue(), null, 8);
    }

    @Override // defpackage.lrd
    public final TextView b1() {
        return D1().d;
    }

    @Override // defpackage.lrd
    public final TextView c1() {
        return D1().e;
    }

    @Override // defpackage.lrd
    public final TextView d1() {
        return D1().f;
    }

    @Override // defpackage.lrd
    public final TextView e1() {
        return D1().i;
    }

    @Override // defpackage.lrd
    public final ProgressButton g1() {
        return D1().v;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: i1 */
    public final String getH0() {
        return "7";
    }

    @Override // defpackage.lrd
    public final String n1() {
        return "7";
    }

    @Override // defpackage.lrd
    public final boolean p1(x7e x7eVar) {
        x7eVar.getClass();
        if (x7eVar instanceof x7e.d.m) {
            D1().z.setError(sn5.d(this, R.string.page_payment__invalid_1voucher_pin_value, new Object[0]));
            return true;
        }
        if (!(x7eVar instanceof x7e.d.o)) {
            return false;
        }
        A1();
        c000.p0(this, sn5.d(this, R.string.page_payment__pending_request, new Object[0]), sn5.d(this, R.string.page_payment__you_deposit_request_has_been_submitted_tip, new Object[0]), null, new lvy(), null, null, 116);
        return true;
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return D1().c;
    }

    @Override // defpackage.lrd
    public final void r1() {
        cxi cxiVarD1 = D1();
        super.r1();
        cxiVarD1.d.setText(sn5.d(this, R.string.page_payment__voucher_amount, new Object[0]) + " (" + u0() + ")");
        ClearEditText clearEditText = cxiVarD1.z;
        clearEditText.setErrorView(cxiVarD1.A);
        clearEditText.setFilters(new InputFilter[]{new ype(), new InputFilter.LengthFilter(16)});
        clearEditText.addTextChangedListener(new nvy(this, clearEditText));
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd, defpackage.c000
    public final lyh<Boolean> v0() {
        return this.l0;
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().v;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        return tug.a(sn5.d(this, R.string.za_page_payment__one_voucher, new Object[0]), " ", sn5.d(this, R.string.app_common__star_number, wae0.L(4, String.valueOf(D1().z.getText()))));
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().w;
    }

    @Override // defpackage.lrd
    public final void x1() {
    }
}
