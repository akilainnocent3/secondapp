package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.basepay.TransactionSuccessActivity;
import com.sportybet.android.globalpay.customview.PaymentAccountView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@fae
public abstract class lsj0 extends c000 implements jsa.b {
    public final q8i0 Q;
    public azm R;
    public final mpe0 S;
    public final ga00 T;
    public final boolean U;
    public final wwd0 V;
    public final wwd0 W;
    public String X;
    public final ee<s8d0> Y;

    public static final class a extends qlr implements Function0<Fragment> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return lsj0.this;
        }
    }

    public static final class b extends qlr implements Function0<w8i0> {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? lsj0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public lsj0(int i) {
        super(i);
        ttr ttrVarA = hwr.a(a1s.c, new b(new a()));
        this.Q = new q8i0(jq40.a(nrj0.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
        this.S = hwr.b(new deb(this, 2));
        this.T = ga00.WITHDRAW;
        this.U = true;
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.V = wwd0VarA;
        this.W = wwd0VarA;
        ee<s8d0> eeVarRegisterForActivityResult = registerForActivityResult(new s1i0(), new ud() { // from class: srj0
            @Override // defpackage.ud
            public final void a(Object obj) {
                v1i0 v1i0Var = (v1i0) obj;
                v1i0Var.getClass();
                if (v1i0Var instanceof v1i0.c) {
                    lsj0 lsj0Var = this.a;
                    nrj0 nrj0VarM1 = lsj0Var.m1();
                    v1i0.c cVar = (v1i0.c) v1i0Var;
                    String str = cVar.a;
                    String str2 = cVar.b;
                    nrj0VarM1.F = str;
                    nrj0VarM1.G = str2;
                    lsj0Var.b1();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.Y = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0 */
    public final ga00 getK0() {
        return this.T;
    }

    @Override // defpackage.c000
    public final boolean Z0(ClearEditText clearEditText) {
        TextView errorView;
        String strValueOf = String.valueOf(clearEditText.getText());
        TextView errorView2 = clearEditText.getErrorView();
        if (errorView2 != null) {
            errorView2.setOnClickListener(null);
        }
        if (this.F) {
            X0(strValueOf, ga00.WITHDRAW);
        }
        f0l f0lVar = this.O;
        g0l g0lVarF = f0lVar != null ? f0lVar.f(strValueOf) : null;
        if (Intrinsics.g(g0lVarF, g0l.a.a)) {
            clearEditText.setError((String) null);
            return false;
        }
        if (!(g0lVarF instanceof g0l.b)) {
            if (Intrinsics.g(g0lVarF, g0l.c.a)) {
                clearEditText.setError((String) null);
                return a1(strValueOf);
            }
            clearEditText.setError((String) null);
            return true;
        }
        UiText uiText = ((g0l.b) g0lVarF).a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        uiText.getClass();
        clearEditText.setError(uiText.e(contextRequireContext).toString());
        final wae waeVar = ((g0l.b) g0lVarF).b;
        if (waeVar != null && (errorView = clearEditText.getErrorView()) != null) {
            errorView.setOnClickListener(new View.OnClickListener() { // from class: urj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.j1().d(waeVar);
                }
            });
        }
        return false;
    }

    public boolean a1(String str) {
        return true;
    }

    public void b1() {
        nrj0 nrj0VarM1 = m1();
        ClearEditText clearEditTextR0 = r0();
        nrj0.x1(nrj0VarM1, String.valueOf(clearEditTextR0 != null ? clearEditTextR0.getText() : null), h1(), null, this.i.getPhoneNumber(), 4);
    }

    public abstract TextView c1();

    public abstract TextView d1();

    public abstract TextView e1();

    public abstract TextView f1();

    public abstract TextView g1();

    @Override // jsa.b
    public final void h() {
        if (q8d0.b) {
            this.Y.b(s8d0.b.a);
        } else {
            b1();
        }
    }

    public c100 h1() {
        return (c100) this.S.getValue();
    }

    public abstract String i1();

    public final azm j1() {
        azm azmVar = this.R;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    public abstract PaymentAccountView k1();

    public abstract ProgressButton l1();

    public final nrj0 m1() {
        return (nrj0) this.Q.getValue();
    }

    public void n1() {
        q1();
        ClearEditText clearEditTextR0 = r0();
        if (clearEditTextR0 != null) {
            clearEditTextR0.clearFocus();
            f0l f0lVar = this.O;
            clearEditTextR0.setHint(sn5.c(clearEditTextR0, R.string.page_payment__min_vnum, f0lVar != null ? f0lVar.c() : null));
            clearEditTextR0.setKeyListener(DigitsKeyListener.getInstance(v4c.a.a() + "0123456789"));
            clearEditTextR0.setFilters(new mw[]{new mw()});
            clearEditTextR0.setErrorView(d1());
            clearEditTextR0.setRawInputType(8194);
            clearEditTextR0.setTextChangedListener(new lay(clearEditTextR0, new trj0(this, clearEditTextR0), new feb(this, 3)));
        }
        TextView textViewC1 = c1();
        if (textViewC1 != null) {
            textViewC1.setText(sn5.d(this, R.string.common_functions__amount_label, u0()));
        }
        TextView textViewE1 = e1();
        if (textViewE1 != null) {
            textViewE1.setText(sn5.d(this, R.string.common_functions__balance_label, u0()));
        }
        TextView textViewK0 = K0();
        if (textViewK0 != null) {
            textViewK0.setText(sn5.d(this, R.string.common_functions__withdrawable_balance_label, u0()));
        }
        PaymentAccountView paymentAccountViewK1 = k1();
        if (paymentAccountViewK1 != null) {
            paymentAccountViewK1.getPrefixNumber().setText(t0().M());
            paymentAccountViewK1.getMobileNumber().setText(G0());
            paymentAccountViewK1.setViewEnable(false);
        }
        TextView textViewG1 = g1();
        if (textViewG1 != null) {
            textViewG1.setOnClickListener(new vrj0(new cq40(), this));
        }
        ProgressButton progressButtonL1 = l1();
        if (progressButtonL1 != null) {
            progressButtonL1.setButtonText(sn5.c(progressButtonL1, R.string.common_functions__withdraw, new Object[0]));
            progressButtonL1.setLoading(false);
            progressButtonL1.setOnClickListener(new yrj0(new cq40(), this));
        }
        X0("0", ga00.WITHDRAW);
    }

    public abstract void o1();

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().H = tj5.b(this);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.U) {
            V0();
            nrj0 nrj0VarM1 = m1();
            nrj0VarM1.c.b(o8i0.d(nrj0VarM1), new flb0(nrj0VarM1, 1));
        }
    }

    @Override // defpackage.c000, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        n1();
        nrj0 nrj0VarM1 = m1();
        String strS0 = getJ0();
        String strI1 = i1();
        strS0.getClass();
        ej5.c(o8i0.d(nrj0VarM1), null, null, new mrj0(nrj0VarM1, strS0, strI1, null), 3);
        wwd0 wwd0Var = nrj0VarM1.z;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new zrj0(this, wwd0Var, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new asj0(this, nrj0VarM1.f.l, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new bsj0(this, nrj0VarM1.B, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new csj0(this, m1().f.d.h(pu0.b.a), null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new esj0(this, m1().D, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new dsj0(this, m1().f.h, null, this), 3);
    }

    public abstract String p1();

    public abstract void q1();

    public final void s1(String str, String str2) {
        str.getClass();
        ClearEditText clearEditTextR0 = r0();
        jsa.a.b(r700.b, str, String.valueOf(clearEditTextR0 != null ? clearEditTextR0.getText() : null), str2, null, this, 48).show(getChildFragmentManager(), "ConfirmAmountDialogFragment");
    }

    public final void t1() {
        c000.p0(this, sn5.d(this, R.string.page_payment__pending_request, new Object[0]), sn5.d(this, R.string.common_feedback__something_went_wrong_please_try_again, new Object[0]), null, new se7(1), null, null, 116);
    }

    public void u1(String str, String str2) {
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        ClearEditText clearEditTextR0 = r0();
        TransactionSuccessActivity.z1(eVarRequireActivity, bjb0.U(new BigDecimal(String.valueOf(clearEditTextR0 != null ? clearEditTextR0.getText() : null)).multiply(BigDecimal.valueOf(10000L)).longValue(), Locale.US), p1(), str2, str, 2, null, false);
    }

    @Override // defpackage.c000
    public final lyh<Boolean> v0() {
        return this.W;
    }

    public void r1() {
    }
}
