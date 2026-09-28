package com.sportybet.android.globalpay.mobileMoney;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.deposit.intouch.NonSuccessfulInTouchDeposit;
import com.sportybet.android.globalpay.mobileMoney.MobileMoneyDepositFragment;
import com.sportybet.android.globalpay.mobileMoney.b;
import com.sportybet.android.globalpay.mobileMoney.c;
import com.sportybet.android.globalpay.mobileMoney.g;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.ProgressButton;
import defpackage.a1s;
import defpackage.azm;
import defpackage.ble;
import defpackage.bmy;
import defpackage.c100;
import defpackage.cyb;
import defpackage.d630;
import defpackage.d900;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.f0i0;
import defpackage.g5e;
import defpackage.ga00;
import defpackage.gyv;
import defpackage.h5e;
import defpackage.hwr;
import defpackage.hyv;
import defpackage.i6i0;
import defpackage.iel;
import defpackage.iyv;
import defpackage.jq40;
import defpackage.jsa;
import defpackage.ku90;
import defpackage.kyv;
import defpackage.lk50;
import defpackage.lyv;
import defpackage.mla;
import defpackage.mwi;
import defpackage.myv;
import defpackage.nyv;
import defpackage.ohp;
import defpackage.op8;
import defpackage.oyv;
import defpackage.p900;
import defpackage.q8i0;
import defpackage.q900;
import defpackage.qlr;
import defpackage.r700;
import defpackage.r8i0;
import defpackage.r9e;
import defpackage.s9s;
import defpackage.saj;
import defpackage.ttr;
import defpackage.ud;
import defpackage.v3a0;
import defpackage.v70;
import defpackage.v8i0;
import defpackage.vqd;
import defpackage.w8i0;
import defpackage.x7e;
import defpackage.xwl;
import defpackage.ys00;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/mobileMoney/MobileMoneyDepositFragment;", "Llrd;", "Ljsa$b;", "<init>", "()V", "Lcom/sportybet/android/globalpay/mobileMoney/c$a;", "headerState", "Lcom/sportybet/android/globalpay/mobileMoney/g;", "initialisationState", "Ldnx;", "warningState", "", "Lmox;", "networks", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MobileMoneyDepositFragment extends xwl {
    public static final /* synthetic */ ohp<Object>[] q0 = {new d630(0, MobileMoneyDepositFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentMobileMoneyDepositBinding;")};
    public azm g0;
    public d900 h0;
    public q900 i0;
    public String j0;
    public final ga00 k0;
    public final i6i0 l0;
    public final q8i0 m0;
    public String n0;
    public final v3a0 o0;
    public ee<f0i0> p0;

    public static final /* synthetic */ class a extends saj implements Function1<View, mwi> {
        public static final a a = new a(1, mwi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentMobileMoneyDepositBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final mwi invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.deposit_banner_compose_view;
            ComposeView composeView = (ComposeView) h5e.a(R.id.deposit_banner_compose_view, view2);
            if (composeView != null) {
                i = R.id.dialogs_compose_view;
                ComposeView composeView2 = (ComposeView) h5e.a(R.id.dialogs_compose_view, view2);
                if (composeView2 != null) {
                    i = R.id.guideline_begin;
                    if (((Guideline) h5e.a(R.id.guideline_begin, view2)) != null) {
                        i = R.id.guideline_end;
                        if (((Guideline) h5e.a(R.id.guideline_end, view2)) != null) {
                            i = R.id.mobile_money_deposit_amount;
                            ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.mobile_money_deposit_amount, view2);
                            if (clearEditText != null) {
                                i = R.id.mobile_money_deposit_amount_container;
                                if (((FrameLayout) h5e.a(R.id.mobile_money_deposit_amount_container, view2)) != null) {
                                    i = R.id.mobile_money_deposit_amount_label;
                                    TextView textView = (TextView) h5e.a(R.id.mobile_money_deposit_amount_label, view2);
                                    if (textView != null) {
                                        i = R.id.mobile_money_deposit_amount_warning;
                                        TextView textView2 = (TextView) h5e.a(R.id.mobile_money_deposit_amount_warning, view2);
                                        if (textView2 != null) {
                                            i = R.id.mobile_money_deposit_balance;
                                            TextView textView3 = (TextView) h5e.a(R.id.mobile_money_deposit_balance, view2);
                                            if (textView3 != null) {
                                                i = R.id.mobile_money_deposit_balance_label;
                                                TextView textView4 = (TextView) h5e.a(R.id.mobile_money_deposit_balance_label, view2);
                                                if (textView4 != null) {
                                                    i = R.id.mobile_money_deposit_button;
                                                    ProgressButton progressButton = (ProgressButton) h5e.a(R.id.mobile_money_deposit_button, view2);
                                                    if (progressButton != null) {
                                                        i = R.id.mobile_money_deposit_description_container;
                                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.mobile_money_deposit_description_container, view2);
                                                        if (linearLayout != null) {
                                                            i = R.id.mobile_money_deposit_header;
                                                            ComposeView composeView3 = (ComposeView) h5e.a(R.id.mobile_money_deposit_header, view2);
                                                            if (composeView3 != null) {
                                                                i = R.id.mobile_money_deposit_kyc_hint;
                                                                TextView textView5 = (TextView) h5e.a(R.id.mobile_money_deposit_kyc_hint, view2);
                                                                if (textView5 != null) {
                                                                    i = R.id.mobile_money_deposit_quick_input;
                                                                    ComposeView composeView4 = (ComposeView) h5e.a(R.id.mobile_money_deposit_quick_input, view2);
                                                                    if (composeView4 != null) {
                                                                        i = R.id.mobile_money_top_hint_widget;
                                                                        HintView hintView = (HintView) h5e.a(R.id.mobile_money_top_hint_widget, view2);
                                                                        if (hintView != null) {
                                                                            i = R.id.placeholder_compose_view;
                                                                            ComposeView composeView5 = (ComposeView) h5e.a(R.id.placeholder_compose_view, view2);
                                                                            if (composeView5 != null) {
                                                                                return new mwi((ConstraintLayout) view2, composeView, composeView2, clearEditText, textView, textView2, textView3, textView4, progressButton, linearLayout, composeView3, textView5, composeView4, hintView, composeView5);
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

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return MobileMoneyDepositFragment.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? MobileMoneyDepositFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public MobileMoneyDepositFragment() {
        super(R.layout.fragment_mobile_money_deposit);
        this.e0 = false;
        this.f0 = false;
        c100 c100Var = c100.e;
        this.j0 = String.valueOf(35001);
        this.k0 = ga00.DEPOSIT;
        this.l0 = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.m0 = new q8i0(jq40.a(com.sportybet.android.globalpay.mobileMoney.c.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.n0 = "";
        this.o0 = new v3a0();
    }

    @Override // defpackage.c000
    public final TextView C0() {
        return D1().A;
    }

    public final mwi D1() {
        return (mwi) this.l0.a(this, q0[0]);
    }

    public final com.sportybet.android.globalpay.mobileMoney.c E1() {
        return (com.sportybet.android.globalpay.mobileMoney.c) this.m0.getValue();
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final ga00 getK0() {
        return this.k0;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0 */
    public final String getT() {
        Integer intOrNull = StringsKt.toIntOrNull(this.j0);
        c100 c100Var = c100.e;
        if (intOrNull == null || intOrNull.intValue() != 35001) {
            c100 c100Var2 = c100.e;
            if (intOrNull == null || intOrNull.intValue() != 35002) {
                return String.valueOf(360);
            }
        }
        return String.valueOf(350);
    }

    @Override // defpackage.c000
    public final HintView I0() {
        return D1().C;
    }

    @Override // defpackage.c000, a92.a
    public final void L() {
        String str = this.X;
        if (str != null) {
            h1().f.b(str);
        }
    }

    @Override // defpackage.c000
    public final void N0() {
        if (E1().C.getValue() != null) {
            super.N0();
        }
    }

    @Override // defpackage.lrd
    public final void a1() {
        r9e r9eVarH1 = h1();
        String strValueOf = String.valueOf(D1().d.getText());
        int i = Integer.parseInt(this.j0);
        ys00 ys00Var = ((com.sportybet.android.globalpay.mobileMoney.c.a) E1().O.a.getValue()).b;
        r9e.x1(r9eVarH1, strValueOf, i, null, ys00Var != null ? ys00Var.a.getPhone() : null, 4);
    }

    @Override // defpackage.lrd
    public final TextView b1() {
        return D1().e;
    }

    @Override // defpackage.lrd
    public final TextView c1() {
        return D1().f;
    }

    @Override // defpackage.lrd
    public final TextView d1() {
        return D1().i;
    }

    @Override // defpackage.lrd
    public final TextView e1() {
        return D1().v;
    }

    @Override // defpackage.lrd
    public final ComposeView f1() {
        return D1().b;
    }

    @Override // defpackage.lrd
    public final ProgressButton g1() {
        return D1().w;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: i1 */
    public final String getH0() {
        String str = this.j0;
        ga00 ga00Var = ga00.DEPOSIT;
        return str + 1;
    }

    @Override // defpackage.lrd
    /* JADX INFO: renamed from: j1 */
    public final boolean getA0() {
        return false;
    }

    @Override // defpackage.lrd
    public final ComposeView m1() {
        return D1().B;
    }

    @Override // defpackage.lrd
    public final String n1() {
        String str = this.j0;
        ga00 ga00Var = ga00.DEPOSIT;
        return str + 1;
    }

    @Override // defpackage.lrd, defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q900 q900Var = this.i0;
        if (q900Var == null) {
            Intrinsics.n("paymentSecurityUtil");
            throw null;
        }
        ee<f0i0> eeVarRegisterForActivityResult = registerForActivityResult(q900Var.b(p900.a.b.a), new ud() { // from class: nxv
            @Override // defpackage.ud
            public final void a(Object obj) {
                l800 l800Var = (l800) obj;
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                l800Var.getClass();
                c cVarE1 = this.a.E1();
                if (l800Var instanceof l800.c) {
                    cVarE1.A1(new b.C0228b(((l800.c) l800Var).b));
                } else if (l800Var.equals(l800.b.a)) {
                    cVarE1.A1(new b.f(vch0.b));
                } else {
                    if (l800Var.equals(l800.a.a)) {
                        return;
                    }
                    uhc.a();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.p0 = eeVarRegisterForActivityResult;
    }

    @Override // defpackage.lrd
    public final boolean p1(x7e x7eVar) {
        x7eVar.getClass();
        if (!(x7eVar instanceof x7e.d.o)) {
            return false;
        }
        this.X = ((x7e.d.o) x7eVar).b;
        ble.b(getChildFragmentManager(), this, R.string.page_payment__mobile_money_processing_deposit_popup_content, null, Boolean.FALSE);
        return true;
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return D1().d;
    }

    @Override // defpackage.lrd
    public final void r1() {
        final mwi mwiVarD1 = D1();
        super.r1();
        T0();
        mla.h(this, mwiVarD1.z, new op8(510372130, new Function2() { // from class: oxv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    MobileMoneyDepositFragment mobileMoneyDepositFragment = this.a;
                    ytw ytwVarC = wyh.c(mobileMoneyDepositFragment.E1().O, aVar, 0, 7);
                    ys00 ys00Var = ((c.a) ytwVarC.getValue()).b;
                    String str = ys00Var != null ? ys00Var.b : null;
                    if (str == null) {
                        str = "";
                    }
                    boolean z = ((c.a) ytwVarC.getValue()).c;
                    c cVarE1 = mobileMoneyDepositFragment.E1();
                    boolean zA = aVar.A(cVarE1);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        txv txvVar = new txv(0, cVarE1, c.class, "onPhoneSelectorClicked", "onPhoneSelectorClicked()V", 0);
                        aVar.r(txvVar);
                        objY = txvVar;
                    }
                    chp chpVar = (chp) objY;
                    c cVarE2 = mobileMoneyDepositFragment.E1();
                    boolean zA2 = aVar.A(cVarE2);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new uxv(0, cVarE2, c.class, "onPhoneNumberInfoIconClicked", "onPhoneNumberInfoIconClicked()V", 0);
                        aVar.r(objY2);
                    }
                    chp chpVar2 = (chp) objY2;
                    c cVarE3 = mobileMoneyDepositFragment.E1();
                    boolean zA3 = aVar.A(cVarE3);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new vxv(0, cVarE3, c.class, "onLearnMoreClicked", "onLearnMoreClicked()V", 0);
                        aVar.r(objY3);
                    }
                    chp chpVar3 = (chp) objY3;
                    mox moxVar = ((c.a) ytwVarC.getValue()).e;
                    c cVarE4 = mobileMoneyDepositFragment.E1();
                    boolean zA4 = aVar.A(cVarE4);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        wxv wxvVar = new wxv(0, cVarE4, c.class, "onNetworkSelectorClicked", "onNetworkSelectorClicked()V", 0);
                        aVar.r(wxvVar);
                        objY4 = wxvVar;
                    }
                    izv.b(str, z, moxVar, (Function0) chpVar, (Function0) chpVar2, (Function0) chpVar3, (Function0) ((chp) objY4), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, mwiVarD1.D, new op8(926577163, new Function2() { // from class: pxv
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ComposeView composeView = mwiVarD1.D;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    MobileMoneyDepositFragment mobileMoneyDepositFragment = this.a;
                    g gVar = (g) wyh.c(mobileMoneyDepositFragment.E1().C, aVar, 0, 7).getValue();
                    if (Intrinsics.g(gVar, g.b.a)) {
                        aVar.N(-94345872);
                        composeView.setVisibility(0);
                        mobileMoneyDepositFragment.N0();
                        boolean zA = aVar.A(mobileMoneyDepositFragment);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = new sxv(mobileMoneyDepositFragment, i);
                            aVar.r(objY);
                        }
                        ezv.a((Function0) objY, aVar, 0);
                        aVar.H();
                    } else if (Intrinsics.g(gVar, g.a.a)) {
                        aVar.N(-94087487);
                        composeView.setVisibility(0);
                        mobileMoneyDepositFragment.N0();
                        h88.a(null, aVar, 0);
                        aVar.H();
                    } else {
                        aVar.N(1382444465);
                        aVar.H();
                        composeView.setVisibility(8);
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, mwiVarD1.c, new op8(-1657739286, new Function2() { // from class: qxv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = MobileMoneyDepositFragment.q0;
                int i = 1;
                int i2 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    MobileMoneyDepositFragment mobileMoneyDepositFragment = this.a;
                    ytw ytwVarC = wyh.c(mobileMoneyDepositFragment.E1().E, aVar, 0, 7);
                    ytw ytwVarC2 = wyh.c(mobileMoneyDepositFragment.E1().O, aVar, 0, 7);
                    dnx dnxVar = (dnx) ytwVarC.getValue();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (dnxVar == null) {
                        aVar.N(2118087858);
                        aVar.H();
                    } else {
                        aVar.N(2118087859);
                        String strA = cb40.a(dnxVar.b.a, new Object[0], aVar);
                        boolean zA = aVar.A(mobileMoneyDepositFragment);
                        Object objY = aVar.y();
                        if (zA || objY == c0042a) {
                            objY = new rxv(mobileMoneyDepositFragment, i2);
                            aVar.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar.A(mobileMoneyDepositFragment);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new mhh(mobileMoneyDepositFragment, i);
                            aVar.r(objY2);
                        }
                        bua.a(0, aVar, strA, function0, (Function0) objY2);
                        Unit unit = Unit.a;
                        aVar.H();
                    }
                    ytw ytwVarC3 = wyh.c(mobileMoneyDepositFragment.E1().M, aVar, 0, 7);
                    boolean z = ((c.a) ytwVarC2.getValue()).f;
                    List list = (List) ytwVarC3.getValue();
                    c cVarE1 = mobileMoneyDepositFragment.E1();
                    boolean zA3 = aVar.A(cVarE1);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        yxv yxvVar = new yxv(1, cVarE1, c.class, "onNetworkSelected", "onNetworkSelected(Lcom/sportybet/android/globalpay/mobileMoney/compose/NetworkState;)V", 0);
                        aVar.r(yxvVar);
                        objY3 = yxvVar;
                    }
                    Function1 function1 = (Function1) ((chp) objY3);
                    c cVarE2 = mobileMoneyDepositFragment.E1();
                    boolean zA4 = aVar.A(cVarE2);
                    Object objY4 = aVar.y();
                    if (zA4 || objY4 == c0042a) {
                        zxv zxvVar = new zxv(0, cVarE2, c.class, "onNetworkSelectorDismissed", "onNetworkSelectorDismissed()V", 0);
                        aVar.r(zxvVar);
                        objY4 = zxvVar;
                    }
                    pzv.a(z, list, function1, (Function0) ((chp) objY4), aVar, 0);
                    boolean z2 = ((c.a) ytwVarC2.getValue()).g;
                    ys00 ys00VarB = ((c.a) ytwVarC2.getValue()).b();
                    List<ys00> list2 = ((c.a) ytwVarC2.getValue()).a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (!((ys00) obj3).a.isPrimary()) {
                            arrayList.add(obj3);
                        }
                    }
                    ys00 ys00Var = ((c.a) ytwVarC2.getValue()).b;
                    c.a aVar2 = (c.a) ytwVarC2.getValue();
                    int i3 = aVar2.d;
                    boolean z3 = i3 > 0 && aVar2.a.size() >= i3;
                    c cVarE3 = mobileMoneyDepositFragment.E1();
                    boolean zA5 = aVar.A(cVarE3);
                    Object objY5 = aVar.y();
                    if (zA5 || objY5 == c0042a) {
                        ayv ayvVar = new ayv(1, cVarE3, c.class, "selectPhone", "selectPhone(Lcom/sportybet/android/globalpay/mobileMoney/compose/PhoneState;)V", 0);
                        aVar.r(ayvVar);
                        objY5 = ayvVar;
                    }
                    Function1 function2 = (Function1) ((chp) objY5);
                    c cVarE4 = mobileMoneyDepositFragment.E1();
                    boolean zA6 = aVar.A(cVarE4);
                    Object objY6 = aVar.y();
                    if (zA6 || objY6 == c0042a) {
                        byv byvVar = new byv(0, cVarE4, c.class, "onAddNewNumberClicked", "onAddNewNumberClicked()V", 0);
                        aVar.r(byvVar);
                        objY6 = byvVar;
                    }
                    Function0 function3 = (Function0) ((chp) objY6);
                    c cVarE5 = mobileMoneyDepositFragment.E1();
                    boolean zA7 = aVar.A(cVarE5);
                    Object objY7 = aVar.y();
                    if (zA7 || objY7 == c0042a) {
                        objY7 = new cyv(0, cVarE5, c.class, "onPhoneSheetDismissed", "onPhoneSheetDismissed()V", 0);
                        aVar.r(objY7);
                    }
                    yzv.a(z2, ys00VarB, arrayList, ys00Var, z3, function2, function3, (Function0) ((chp) objY7), aVar, 4160);
                    if (((c.a) ytwVarC2.getValue()).h) {
                        aVar.N(2119431275);
                        String strA2 = cb40.a(R.string.page_payment__mobile_money_multiple_numbers_enabled_dialog_body, new Object[0], aVar);
                        String strA3 = cb40.a(R.string.common_functions__ok, new Object[0], aVar);
                        c cVarE6 = mobileMoneyDepositFragment.E1();
                        boolean zA8 = aVar.A(cVarE6);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            dyv dyvVar = new dyv(0, cVarE6, c.class, "onPhoneNumberInfoDialogDismissed", yFmFZvuWxAYfEj.qZOsYlIcIjLuMQ, 0);
                            aVar.r(dyvVar);
                            objY8 = dyvVar;
                        }
                        Function0 function4 = (Function0) ((chp) objY8);
                        String strA4 = cb40.a(R.string.common_functions__contact_support, new Object[0], aVar);
                        c cVarE7 = mobileMoneyDepositFragment.E1();
                        boolean zA9 = aVar.A(cVarE7);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            eyv eyvVar = new eyv(0, cVarE7, c.class, "onPhoneInfoContactSupportClicked", "onPhoneInfoContactSupportClicked()V", 0);
                            aVar.r(eyvVar);
                            objY9 = eyvVar;
                        }
                        ga2.a(null, strA2, strA3, function4, strA4, (Function0) ((chp) objY9), aVar, 0, 1);
                        aVar.H();
                    } else {
                        aVar.N(2119997304);
                        aVar.H();
                    }
                    if (((c.a) ytwVarC2.getValue()).i) {
                        aVar.N(2120079888);
                        String strA5 = cb40.a(R.string.page_payment__mobile_money_multiple_numbers_disabled_dialog_body, new Object[0], aVar);
                        String strA6 = cb40.a(R.string.common_functions__ok, new Object[0], aVar);
                        c cVarE8 = mobileMoneyDepositFragment.E1();
                        boolean zA10 = aVar.A(cVarE8);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            fyv fyvVar = new fyv(0, cVarE8, c.class, "onLearnMoreDialogDismissed", "onLearnMoreDialogDismissed()V", 0);
                            aVar.r(fyvVar);
                            objY10 = fyvVar;
                        }
                        Function0 function5 = (Function0) ((chp) objY10);
                        String strA7 = cb40.a(R.string.common_functions__contact_support, new Object[0], aVar);
                        c cVarE9 = mobileMoneyDepositFragment.E1();
                        boolean zA11 = aVar.A(cVarE9);
                        Object objY11 = aVar.y();
                        if (zA11 || objY11 == c0042a) {
                            xxv xxvVar = new xxv(0, cVarE9, c.class, "onLearnMoreContactSupportClicked", "onLearnMoreContactSupportClicked()V", 0);
                            aVar.r(xxvVar);
                            objY11 = xxvVar;
                        }
                        ga2.a(null, strA5, strA6, function5, strA7, (Function0) ((chp) objY11), aVar, 0, 1);
                        aVar.H();
                    } else {
                        aVar.N(2120641112);
                        aVar.H();
                    }
                    d.a aVar3 = d.a.b;
                    d dVarE = j.e(aVar3, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d dVarC = androidx.compose.ui.c.c(aVar, dVarE);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar4);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, aivVarC, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    s3a0.b(mobileMoneyDepositFragment.o0, androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h), ze9.a, aVar, 384, 0);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        Class<com.sportybet.android.globalpay.mobileMoney.c> cls = com.sportybet.android.globalpay.mobileMoney.c.class;
        r0().setTextChangedListener(new vqd(this, new gyv(1, E1(), cls, "onAmountValidated", "onAmountValidated(Z)V", 0), new hyv(1, E1(), cls, "onUpdateAmountError", "onUpdateAmountError(Ljava/lang/String;)V", 0)));
        mwiVarD1.d.addTextChangedListener(new iyv(this));
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getJ0() {
        return this.j0;
    }

    @Override // defpackage.lrd
    public final void s1() {
        super.s1();
        com.sportybet.android.globalpay.mobileMoney.c cVarE1 = E1();
        ku90 ku90Var = cVarE1.B;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new kyv(this, ku90Var, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new lyv(this, cVarE1.O, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new myv(this, cVarE1.G, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new nyv(this, cVarE1.I, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new oyv(this, cVarE1.K, null, this), 3);
    }

    @Override // defpackage.lrd
    public final void t1(final lk50<? extends BankTradeData> lk50Var) {
        lk50Var.getClass();
        final com.sportybet.android.globalpay.mobileMoney.c cVarE1 = E1();
        final String strValueOf = String.valueOf(D1().d.getText());
        cVarE1.z1(new Function0() { // from class: tyv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String phoneNumber;
                lk50 lk50Var2 = lk50Var;
                if (lk50Var2 instanceof lk50.c) {
                    int i = ((BankTradeData) ((lk50.c) lk50Var2).a).status;
                    c cVar = cVarE1;
                    String str = strValueOf;
                    if (i == 10) {
                        cVar.y1(str, NonSuccessfulInTouchDeposit.Status.PENDING);
                        cVar.z1(new uyv(cVar, str));
                    } else if (i != 20) {
                        cVar.y1(str, NonSuccessfulInTouchDeposit.Status.FAILED);
                        cVar.z1(new uyv(cVar, str));
                    } else {
                        nen nenVar = cVar.b;
                        String strD1 = cVar.D1();
                        Double dH = kotlin.text.b.h(str);
                        if (dH == null) {
                            return Unit.a;
                        }
                        double dDoubleValue = dH.doubleValue();
                        ys00 ys00Var = ((c.a) cVar.N.getValue()).b;
                        if (ys00Var == null || (phoneNumber = ys00Var.a.getPhone()) == null) {
                            phoneNumber = cVar.d.getPhoneNumber();
                        }
                        phoneNumber.getClass();
                        nenVar.c(dDoubleValue, strD1, phoneNumber);
                    }
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.lrd
    public final void u1() {
        String str = this.n0;
        ys00 ys00Var = ((com.sportybet.android.globalpay.mobileMoney.c.a) E1().O.a.getValue()).b;
        String str2 = ys00Var != null ? ys00Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        str.getClass();
        jsa.a.b(r700.a, str, String.valueOf(D1().d.getText()), str2, null, this, 48).show(getChildFragmentManager(), "ConfirmAmountDialogFragment");
    }

    @Override // defpackage.lrd
    public final void v1(final lk50<? extends x7e> lk50Var) {
        lk50Var.getClass();
        final com.sportybet.android.globalpay.mobileMoney.c cVarE1 = E1();
        final String strValueOf = String.valueOf(D1().d.getText());
        cVarE1.z1(new Function0() { // from class: syv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                lk50 lk50Var2 = lk50Var;
                if (lk50Var2 instanceof lk50.c) {
                    boolean z = ((lk50.c) lk50Var2).a instanceof x7e.d.o;
                    c cVar = cVarE1;
                    String str = strValueOf;
                    if (z) {
                        cVar.y1(str, NonSuccessfulInTouchDeposit.Status.PENDING);
                    } else {
                        cVar.y1(str, NonSuccessfulInTouchDeposit.Status.FAILED);
                        cVar.z1(new uyv(cVar, str));
                    }
                }
                return Unit.a;
            }
        });
    }

    @Override // defpackage.c000
    public final View w0() {
        return D1().w;
    }

    @Override // defpackage.lrd
    public final String w1(BankTradeData bankTradeData) {
        String str = this.n0;
        ys00 ys00Var = ((com.sportybet.android.globalpay.mobileMoney.c.a) E1().O.a.getValue()).b;
        String str2 = ys00Var != null ? ys00Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return v70.b(str, " (", str2, ")");
    }

    @Override // defpackage.lrd
    public final void x1() {
    }

    @Override // defpackage.c000
    public final View y0() {
        return D1().y;
    }
}
