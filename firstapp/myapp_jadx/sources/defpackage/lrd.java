package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.basepay.TransactionSuccessActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llrd;", "Lc000;", "Ljsa$b;", "", "layout", "<init>", "(I)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public abstract class lrd extends c000 implements jsa.b {
    public v4c Q;
    public fbh0 R;
    public y8j S;
    public final q8i0 T;
    public final q8i0 U;
    public final wwd0 V;
    public final wwd0 W;
    public String X;
    public final mpe0 Y;
    public final boolean Z;
    public final boolean a0;
    public jvd0 b0;
    public final boolean c0;

    public static final class a extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? lrd.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return lrd.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? lrd.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class g extends qlr implements Function0<Fragment> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return lrd.this;
        }
    }

    public static final class h extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.a = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class i extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class j extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
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

    public lrd(int i2) {
        super(i2);
        b bVar = new b();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new c(bVar));
        this.T = new q8i0(jq40.a(r9e.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new h(new g()));
        this.U = new q8i0(jq40.a(jh30.class), new i(ttrVarA2), new a(ttrVarA2), new j(ttrVarA2));
        wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
        this.V = wwd0VarA;
        this.W = wwd0VarA;
        this.X = "";
        this.Y = hwr.b(new Function0() { // from class: tqd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String j0 = this.a.getJ0();
                j0.getClass();
                return sg8.a(Integer.parseInt(j0));
            }
        });
        this.Z = true;
        this.a0 = true;
        this.c0 = true;
    }

    public static void z1(lrd lrdVar, String str, BankTradeData bankTradeData, String str2, int i2) {
        String strU;
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            bankTradeData = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if (str != null) {
            strU = bjb0.U(Long.parseLong(str), Locale.US);
        } else if (bankTradeData != null) {
            strU = bjb0.U(bankTradeData.payAmount, Locale.US);
        } else {
            ClearEditText clearEditTextR0 = lrdVar.r0();
            strU = bjb0.U(new BigDecimal(String.valueOf(clearEditTextR0 != null ? clearEditTextR0.getText() : null)).multiply(BigDecimal.valueOf(10000L)).longValue(), Locale.US);
        }
        String str3 = strU;
        androidx.fragment.app.e eVarRequireActivity = lrdVar.requireActivity();
        String strW1 = lrdVar.w1(bankTradeData);
        if (str2 == null) {
            str2 = lrdVar.X;
        }
        String str4 = str2;
        Intent intent = lrdVar.requireActivity().getIntent();
        TransactionSuccessActivity.z1(eVarRequireActivity, str3, strW1, null, str4, 1, "0.00", intent != null && intent.getBooleanExtra("EXTRA_FROM_GAME", false));
    }

    public final void A1() {
        h1().B.a(new snd(0), k00.c, k00.d);
    }

    public final boolean B1(Function1<? super String, Unit> function1) {
        ClearEditText clearEditTextR0;
        TextView errorView;
        ClearEditText clearEditTextR1 = r0();
        String strValueOf = String.valueOf(clearEditTextR1 != null ? clearEditTextR1.getText() : null);
        if (getF()) {
            X0(strValueOf, ga00.DEPOSIT);
        }
        f0l f0lVar = this.O;
        g0l g0lVarE = f0lVar != null ? f0lVar.e(strValueOf) : null;
        if (Intrinsics.g(g0lVarE, g0l.a.a)) {
            function1.invoke(null);
            return false;
        }
        if (!(g0lVarE instanceof g0l.b)) {
            function1.invoke(null);
            return true;
        }
        g0l.b bVar = (g0l.b) g0lVarE;
        UiText uiText = bVar.a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        uiText.getClass();
        function1.invoke(uiText.e(contextRequireContext).toString());
        final wae waeVar = bVar.b;
        if (waeVar != null && (clearEditTextR0 = r0()) != null && (errorView = clearEditTextR0.getErrorView()) != null) {
            errorView.setOnClickListener(new View.OnClickListener() { // from class: wqd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fbh0 fbh0Var = this.a.R;
                    if (fbh0Var != null) {
                        fbh0Var.e(o7d.a(waeVar));
                    } else {
                        Intrinsics.n("uiRouterManager");
                        throw null;
                    }
                }
            });
        }
        return false;
    }

    public void a1() {
        r9e r9eVarH1 = h1();
        ClearEditText clearEditTextR0 = r0();
        r9e.x1(r9eVarH1, String.valueOf(clearEditTextR0 != null ? clearEditTextR0.getText() : null), Integer.parseInt(getJ0()), null, null, 12);
    }

    public TextView b1() {
        return null;
    }

    public TextView c1() {
        return null;
    }

    public TextView d1() {
        return null;
    }

    public TextView e1() {
        return null;
    }

    public ComposeView f1() {
        return null;
    }

    public ProgressButton g1() {
        return null;
    }

    @Override // jsa.b
    public final void h() {
        a1();
    }

    public final r9e h1() {
        return (r9e) this.T.getValue();
    }

    /* JADX INFO: renamed from: i1 */
    public abstract String getH0();

    /* JADX INFO: renamed from: j1, reason: from getter */
    public boolean getA0() {
        return this.a0;
    }

    public final y8j k1() {
        y8j y8jVar = this.S;
        if (y8jVar != null) {
            return y8jVar;
        }
        Intrinsics.n("fullStoryCommonManager");
        throw null;
    }

    /* JADX INFO: renamed from: l1, reason: from getter */
    public boolean getC0() {
        return this.c0;
    }

    public ComposeView m1() {
        return null;
    }

    public abstract String n1();

    /* JADX INFO: renamed from: o1, reason: from getter */
    public boolean getZ() {
        return this.Z;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h1().J = tj5.b(this);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        c0e c0eVar = h1().v;
        if (!c0eVar.a()) {
            c0eVar.b();
        }
        if (getC0()) {
            V0();
        }
    }

    @Override // defpackage.c000, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        r1();
        if (getZ()) {
            s1();
            f1i f1iVar = h1().G;
            s9s.b bVar = s9s.b.a;
            ej5.c(ebs.a(getLifecycle()), null, null, new drd(this, f1iVar, null, this), 3);
            ej5.c(ebs.a(getLifecycle()), null, null, new brd(this, h1().f.d.h(pu0.b.a), null, this), 3);
            ej5.c(ebs.a(getLifecycle()), null, null, new crd(this, h1().f.h, null, this), 3);
        }
    }

    public boolean p1(x7e x7eVar) {
        x7eVar.getClass();
        return false;
    }

    public void r1() {
        ClearEditText clearEditTextR0 = r0();
        if (clearEditTextR0 != null) {
            clearEditTextR0.clearFocus();
            clearEditTextR0.setErrorView(c1());
            clearEditTextR0.setFilters(new mw[]{new mw()});
            v4c v4cVar = this.Q;
            if (v4cVar == null) {
                Intrinsics.n("currencyUtils");
                throw null;
            }
            clearEditTextR0.setKeyListener(DigitsKeyListener.getInstance(v4cVar.a() + "0123456789"));
            clearEditTextR0.setRawInputType(8194);
        }
        int i2 = 0;
        sqd sqdVar = new sqd(this, i2);
        grd grdVar = new grd(1, this, lrd.class, "setAmountError", "setAmountError(Ljava/lang/String;)V", 0);
        ClearEditText clearEditTextR1 = r0();
        if (clearEditTextR1 != null) {
            clearEditTextR1.setTextChangedListener(new vqd(this, sqdVar, grdVar));
        }
        TextView textViewE1 = e1();
        if (textViewE1 != null) {
            textViewE1.setText(sn5.d(this, R.string.common_functions__balance_label, h1().f.m));
        }
        TextView textViewB1 = b1();
        if (textViewB1 != null) {
            textViewB1.setText(sn5.d(this, R.string.common_functions__amount_label, h1().f.m));
        }
        x1();
        ProgressButton progressButtonG1 = g1();
        if (progressButtonG1 != null) {
            progressButtonG1.setButtonText(sn5.c(progressButtonG1, R.string.common_functions__top_up_now, new Object[0]));
            progressButtonG1.setOnClickListener(new yqd(new cq40(), this));
        }
        ComposeView composeViewM1 = m1();
        if (composeViewM1 != null) {
            composeViewM1.setContent(new op8(-1519479649, new uqd(this, i2), true));
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new krd(this, null), 3);
            jh30 jh30Var = (jh30) this.U.getValue();
            fg30 fg30Var = new fg30();
            String u = getJ0();
            u.getClass();
            fg30Var.d = u;
            y1(fg30Var);
            if (fg30Var.a.isEmpty()) {
                jh30Var.y1(new gh30(jh30Var, fg30Var.d, fg30Var.c, null));
            } else {
                ch30 ch30Var = jh30Var.f;
                eh30 eh30Var = new eh30(1, jh30Var, jh30.class, "onItemSelected", "onItemSelected(Lcom/sporty/android/compose/ui/component/quick_input/QuickInputUI;)Lkotlinx/coroutines/Job;", 8);
                ch30Var.getClass();
                jh30Var.z1(ch30.a(fg30Var, eh30Var));
            }
            Unit unit = Unit.a;
        }
        X0("0", ga00.DEPOSIT);
        ComposeView composeViewF1 = f1();
        if (composeViewF1 != null) {
            uwd0<String> uwd0VarX0 = h1().a.x0();
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            s9s.b bVar = s9s.b.a;
            ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new ird(viewLifecycleOwner2, uwd0VarX0, null, composeViewF1), 3);
        }
    }

    public void s1() {
        r9e r9eVarH1 = h1();
        if (getA0()) {
            String strN1 = n1();
            String strI1 = getH0();
            String u = getJ0();
            strI1.getClass();
            u.getClass();
            ej5.c(o8i0.d(r9eVarH1), null, null, new p9e(r9eVarH1, u, strI1, strN1, null), 3);
        }
        wwd0 wwd0Var = r9eVarH1.E;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new zqd(this, wwd0Var, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new ard(this, r9eVarH1.f.l, null, this), 3);
    }

    public void t1(lk50<? extends BankTradeData> lk50Var) {
        lk50Var.getClass();
    }

    public abstract void u1();

    @Override // defpackage.c000
    public lyh<Boolean> v0() {
        return this.W;
    }

    public void v1(lk50<? extends x7e> lk50Var) {
        lk50Var.getClass();
    }

    public abstract String w1(BankTradeData bankTradeData);

    public abstract void x1();

    public void q1(x7e.b.d dVar) {
    }

    public void y1(fg30 fg30Var) {
    }
}
