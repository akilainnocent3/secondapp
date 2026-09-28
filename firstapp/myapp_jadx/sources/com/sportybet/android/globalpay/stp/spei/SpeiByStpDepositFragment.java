package com.sportybet.android.globalpay.stp.spei;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.globalpay.stp.spei.SpeiByStpDepositFragment;
import com.sportybet.android.globalpay.stp.spei.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a1s;
import defpackage.bmy;
import defpackage.c100;
import defpackage.cyb;
import defpackage.d630;
import defpackage.d900;
import defpackage.dva0;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.fg30;
import defpackage.g5e;
import defpackage.ga00;
import defpackage.h5e;
import defpackage.hva0;
import defpackage.hwr;
import defpackage.i3m;
import defpackage.i6i0;
import defpackage.iel;
import defpackage.iva0;
import defpackage.jq40;
import defpackage.jva0;
import defpackage.k9j;
import defpackage.ku90;
import defpackage.mla;
import defpackage.mnd;
import defpackage.o8i0;
import defpackage.ohp;
import defpackage.op8;
import defpackage.ova0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.tj5;
import defpackage.ttr;
import defpackage.und;
import defpackage.uxi;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.z8j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/stp/spei/SpeiByStpDepositFragment;", "Llrd;", "Lk9j;", "<init>", "()V", "Lsb00;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SpeiByStpDepositFragment extends i3m implements k9j {
    public static final /* synthetic */ ohp<Object>[] m0 = {new d630(0, SpeiByStpDepositFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentSpeiByStpDepositBinding;")};
    public final String g0;
    public final String h0;
    public final ga00 i0;
    public final i6i0 j0;
    public final q8i0 k0;
    public d900 l0;

    public static final /* synthetic */ class a extends saj implements Function1<View, uxi> {
        public static final a a = new a(1, uxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentSpeiByStpDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final uxi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.amount;
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
                                            i = R.id.dialogs_compose_view;
                                            ComposeView composeView = (ComposeView) h5e.a(R.id.dialogs_compose_view, view2);
                                            if (composeView != null) {
                                                i = R.id.kyc_hint;
                                                TextView textView5 = (TextView) h5e.a(R.id.kyc_hint, view2);
                                                if (textView5 != null) {
                                                    i = R.id.logo;
                                                    if (((ImageView) h5e.a(R.id.logo, view2)) != null) {
                                                        i = R.id.quick_input;
                                                        ComposeView composeView2 = (ComposeView) h5e.a(R.id.quick_input, view2);
                                                        if (composeView2 != null) {
                                                            i = R.id.top_hint_widget;
                                                            HintView hintView = (HintView) h5e.a(R.id.top_hint_widget, view2);
                                                            if (hintView != null) {
                                                                return new uxi(linearLayout, textView, textView2, textView3, textView4, textView5, composeView, composeView2, (ConstraintLayout) view2, clearEditText, hintView, progressButton);
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

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return SpeiByStpDepositFragment.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? SpeiByStpDepositFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public SpeiByStpDepositFragment() {
        super(R.layout.fragment_spei_by_stp_deposit);
        this.g0 = String.valueOf(340);
        c100 c100Var = c100.e;
        this.h0 = String.valueOf(34001);
        this.i0 = ga00.DEPOSIT;
        this.j0 = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.k0 = new q8i0(jq40.a(com.sportybet.android.globalpay.stp.spei.b.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return D1().y;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: D0 */
    public final Integer getW() {
        return (Integer) E1().y.a.getValue();
    }

    public final uxi D1() {
        return (uxi) this.j0.a(this, m0[0]);
    }

    public final com.sportybet.android.globalpay.stp.spei.b E1() {
        return (com.sportybet.android.globalpay.stp.spei.b) this.k0.getValue();
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
        return D1().A;
    }

    @Override // defpackage.c000
    public final void O0() {
        E1().B1();
    }

    @Override // defpackage.lrd
    public final TextView b1() {
        return D1().c;
    }

    @Override // defpackage.lrd
    public final TextView c1() {
        return D1().d;
    }

    @Override // defpackage.lrd
    public final TextView d1() {
        return D1().e;
    }

    @Override // defpackage.lrd
    public final TextView e1() {
        return D1().f;
    }

    @Override // defpackage.lrd
    public final ProgressButton g1() {
        return D1().i;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: l1 */
    public final boolean getC0() {
        return false;
    }

    @Override // defpackage.lrd
    public final ComposeView m1() {
        return D1().z;
    }

    @Override // defpackage.lrd
    public final String n1() {
        return this.h0;
    }

    @Override // defpackage.lrd, defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E1().O = tj5.b(this);
    }

    @Override // defpackage.lrd, defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.sportybet.android.globalpay.stp.spei.b bVarE1 = E1();
        ej5.c(o8i0.d(bVarE1), null, null, new com.sportybet.android.globalpay.stp.spei.e(bVarE1, null), 3);
    }

    @Override // defpackage.lrd, defpackage.c000, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ku90 ku90Var = E1().H;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new dva0(this, ku90Var, null, this), 3);
        r1();
        ej5.c(ebs.a(getLifecycle()), null, null, new hva0(this, E1().A, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new iva0(this, E1().B, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new jva0(this, E1().D, null, this), 3);
        z8j.a(k1(), new und(0));
        z8j.a(k1(), new mnd("stp"));
        k1().e(D1().i, "deposit-button");
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return D1().b;
    }

    @Override // defpackage.lrd
    public final void r1() {
        super.r1();
        uxi uxiVarD1 = D1();
        uxiVarD1.b.addTextChangedListener(new ova0(this));
        mla.h(this, uxiVarD1.w, new op8(-1239409117, new Function2() { // from class: cva0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = SpeiByStpDepositFragment.m0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = new v3a0();
                        aVar.r(objY);
                    }
                    v3a0 v3a0Var = (v3a0) objY;
                    SpeiByStpDepositFragment speiByStpDepositFragment = this.a;
                    sb00 sb00Var = (sb00) wyh.c(speiByStpDepositFragment.E1().F, aVar, 0, 7).getValue();
                    b bVarE1 = speiByStpDepositFragment.E1();
                    boolean zA = aVar.A(bVarE1);
                    Object objY2 = aVar.y();
                    if (zA || objY2 == c0042a) {
                        kva0 kva0Var = new kva0(1, bVarE1, b.class, "onPendingDepositClicked", "onPendingDepositClicked(Ljava/lang/String;)V", 0);
                        aVar.r(kva0Var);
                        objY2 = kva0Var;
                    }
                    Function1 function1 = (Function1) ((chp) objY2);
                    b bVarE2 = speiByStpDepositFragment.E1();
                    boolean zA2 = aVar.A(bVarE2);
                    Object objY3 = aVar.y();
                    if (zA2 || objY3 == c0042a) {
                        lva0 lva0Var = new lva0(0, bVarE2, b.class, "onDismissPendingDepositsDialog", "onDismissPendingDepositsDialog()V", 0);
                        aVar.r(lva0Var);
                        objY3 = lva0Var;
                    }
                    Function0 function0 = (Function0) ((chp) objY3);
                    b bVarE3 = speiByStpDepositFragment.E1();
                    boolean zA3 = aVar.A(bVarE3);
                    Object objY4 = aVar.y();
                    if (zA3 || objY4 == c0042a) {
                        mva0 mva0Var = new mva0(0, bVarE3, b.class, "onContinueWithNewDepositClicked", "onContinueWithNewDepositClicked()V", 0);
                        aVar.r(mva0Var);
                        objY4 = mva0Var;
                    }
                    rb00.b(sb00Var, v3a0Var, function1, function0, (Function0) ((chp) objY4), aVar, 56);
                    Unit unit = Unit.a;
                    boolean zA4 = aVar.A(speiByStpDepositFragment);
                    Object objY5 = aVar.y();
                    if (zA4 || objY5 == c0042a) {
                        objY5 = new nva0(speiByStpDepositFragment, v3a0Var, null);
                        aVar.r(objY5);
                    }
                    xvf.e(aVar, unit, (Function2) objY5);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0 */
    public final String getH0() {
        return this.h0;
    }

    @Override // defpackage.lrd
    public final void u1() {
        E1().B1();
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().i;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        return "";
    }

    @Override // defpackage.lrd
    public final void x1() {
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().v;
    }

    @Override // defpackage.lrd
    public final void y1(fg30 fg30Var) {
        if (h1().z.l) {
            fg30Var.c = true;
        }
    }
}
