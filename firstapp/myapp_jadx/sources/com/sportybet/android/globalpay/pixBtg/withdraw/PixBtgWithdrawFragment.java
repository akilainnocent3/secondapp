package com.sportybet.android.globalpay.pixBtg.withdraw;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawFragment;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import com.sportybet.android.globalpay.pixBtg.withdraw.j;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import defpackage.a1s;
import defpackage.app;
import defpackage.azm;
import defpackage.bag;
import defpackage.bhj0;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.cyb;
import defpackage.d630;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.g5e;
import defpackage.ga00;
import defpackage.gc10;
import defpackage.gym;
import defpackage.h5e;
import defpackage.hc10;
import defpackage.hhp;
import defpackage.hwr;
import defpackage.i6i0;
import defpackage.ic10;
import defpackage.iel;
import defpackage.iri;
import defpackage.jq40;
import defpackage.kxi;
import defpackage.lyh;
import defpackage.mla;
import defpackage.mw;
import defpackage.o8i0;
import defpackage.ob10;
import defpackage.oc10;
import defpackage.ohp;
import defpackage.op8;
import defpackage.pc10;
import defpackage.q6h;
import defpackage.q8i0;
import defpackage.qc10;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s1i0;
import defpackage.s8d0;
import defpackage.s9s;
import defpackage.saj;
import defpackage.szl;
import defpackage.tj5;
import defpackage.ttr;
import defpackage.u6h;
import defpackage.ud;
import defpackage.uqd;
import defpackage.uzh;
import defpackage.v4c;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.wb10;
import defpackage.wyh;
import defpackage.xqd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/withdraw/PixBtgWithdrawFragment;", "Lc000;", "<init>", "()V", "Lcom/sportybet/android/globalpay/pixBtg/withdraw/e;", "uiState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PixBtgWithdrawFragment extends szl {
    public static final /* synthetic */ ohp<Object>[] c0 = {new d630(0, PixBtgWithdrawFragment.class, "binding", "getBinding()Lcom/sportybet/android/databinding/FragmentPixBtgWithdrawBinding;")};
    public azm T;
    public v4c U;
    public bnh0 V;
    public final String W;
    public final ga00 X;
    public final i6i0 Y;
    public final q8i0 Z;
    public final ee<s8d0> a0;
    public final ee<u6h> b0;

    public static final /* synthetic */ class a extends saj implements Function1<View, kxi> {
        public static final a a = new a(1, kxi.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/FragmentPixBtgWithdrawBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final kxi invoke(View view) {
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
                            i = R.id.balance_info_compose_view;
                            ComposeView composeView = (ComposeView) h5e.a(R.id.balance_info_compose_view, view2);
                            if (composeView != null) {
                                i = R.id.dialogs_compose_view;
                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.dialogs_compose_view, view2);
                                if (composeView2 != null) {
                                    i = R.id.header_and_banks_compose_view;
                                    ComposeView composeView3 = (ComposeView) h5e.a(R.id.header_and_banks_compose_view, view2);
                                    if (composeView3 != null) {
                                        i = R.id.inline_footer_compose_view;
                                        ComposeView composeView4 = (ComposeView) h5e.a(R.id.inline_footer_compose_view, view2);
                                        if (composeView4 != null) {
                                            i = R.id.loaded_content_container;
                                            LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.loaded_content_container, view2);
                                            if (linearLayout != null) {
                                                i = R.id.placeholder_compose_view;
                                                ComposeView composeView5 = (ComposeView) h5e.a(R.id.placeholder_compose_view, view2);
                                                if (composeView5 != null) {
                                                    i = R.id.scrollable_content;
                                                    if (((ScrollView) h5e.a(R.id.scrollable_content, view2)) != null) {
                                                        i = R.id.sticky_footer_compose_view;
                                                        ComposeView composeView6 = (ComposeView) h5e.a(R.id.sticky_footer_compose_view, view2);
                                                        if (composeView6 != null) {
                                                            i = R.id.top_bar_compose_view;
                                                            ComposeView composeView7 = (ComposeView) h5e.a(R.id.top_bar_compose_view, view2);
                                                            if (composeView7 != null) {
                                                                return new kxi(linearLayout, textView, textView2, composeView, composeView2, composeView3, composeView4, composeView5, composeView6, composeView7, (ConstraintLayout) view2, clearEditText);
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
            return PixBtgWithdrawFragment.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? PixBtgWithdrawFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PixBtgWithdrawFragment() {
        super(R.layout.fragment_pix_btg_withdraw);
        this.R = false;
        this.S = false;
        this.W = String.valueOf(320);
        this.X = ga00.WITHDRAW;
        this.Y = g5e.a(a.a);
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.Z = new q8i0(jq40.a(h.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        ee<s8d0> eeVarRegisterForActivityResult = registerForActivityResult(new s1i0(), new ud() { // from class: ac10
            @Override // defpackage.ud
            public final void a(Object obj) {
                v1i0 v1i0Var = (v1i0) obj;
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                v1i0Var.getClass();
                h hVarD1 = this.a.d1();
                if (v1i0Var instanceof v1i0.c) {
                    bmj0 bmj0Var = hVarD1.A;
                    v1i0.c cVar = (v1i0.c) v1i0Var;
                    String str = cVar.a;
                    String str2 = cVar.b;
                    bmj0Var.c = str;
                    bmj0Var.d = str2;
                    hVarD1.z1();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.a0 = eeVarRegisterForActivityResult;
        ee<u6h> eeVarRegisterForActivityResult2 = registerForActivityResult(new q6h(), new ud() { // from class: bc10
            @Override // defpackage.ud
            public final void a(Object obj) {
                FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                facialRecognitionResult.getClass();
                h hVarD1 = this.a.d1();
                switch (facialRecognitionResult.a.ordinal()) {
                    case 0:
                        ej5.c(o8i0.d(hVarD1), null, null, new j(hVarD1, null), 3);
                        break;
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        hVarD1.D1(new czn(1));
                        break;
                    case 2:
                        break;
                    default:
                        uhc.a();
                        break;
                }
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.b0 = eeVarRegisterForActivityResult2;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final ga00 getX() {
        return this.X;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final String getW() {
        return this.W;
    }

    @Override // defpackage.c000
    public final void N0() {
        super.N0();
        Editable text = c1().b.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() > 0) {
            h hVarD1 = d1();
            int i = 1;
            hVarD1.H = Z0(c1().b) && q0();
            g.a(hVarD1.D, o8i0.d(hVarD1), new iri(hVarD1, i));
        }
    }

    public final void b1(final int i, final op8 op8Var, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1651534866);
        int i2 = (bVarI.A(this) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            com.sportybet.android.globalpay.pixBtg.withdraw.e eVar = (com.sportybet.android.globalpay.pixBtg.withdraw.e) wyh.c(d1().D, bVarI, 0, 7).getValue();
            com.sportybet.android.globalpay.pixBtg.withdraw.e.c cVar = eVar instanceof com.sportybet.android.globalpay.pixBtg.withdraw.e.c ? (com.sportybet.android.globalpay.pixBtg.withdraw.e.c) eVar : null;
            if (cVar == null) {
                bVarI.N(-2024626303);
            } else {
                bVarI.N(-2024626302);
                op8Var.invoke(cVar, bVarI, 56);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, i) { // from class: pb10
                public final /* synthetic */ op8 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                    int iA = qj40.a(7);
                    this.a.b1(iA, this.b, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final kxi c1() {
        return (kxi) this.Y.a(this, c0[0]);
    }

    public final h d1() {
        return (h) this.Z.getValue();
    }

    public final <T> void e1(Function1<? super com.sportybet.android.globalpay.pixBtg.withdraw.e.c, ? extends T> function1, Function1<? super T, Unit> function2) {
        lyh lyhVarB = uzh.b(new qc10(new pc10(d1().D), function1));
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new oc10(this, lyhVarB, null, function2), 3);
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h hVarD1 = d1();
        bag bagVarB = tj5.b(this);
        gym.a(hVarD1.B, new bhj0(bagVarB, null, 5));
        hVarD1.A.e = bagVarB;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        h hVarD1 = d1();
        if (hVarD1.D.getValue() instanceof com.sportybet.android.globalpay.pixBtg.withdraw.e.c) {
            hVarD1.B1();
        }
    }

    @Override // defpackage.c000, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        final kxi kxiVarC1 = c1();
        e1(new ob10(0), new Function1() { // from class: vb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = (String) obj;
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                str.getClass();
                kxiVarC1.c.setText(sn5.d(this, R.string.common_functions__amount_label, str));
                return Unit.a;
            }
        });
        e1(new wb10(0), new hc10(1, new gc10(this, PixBtgWithdrawFragment.class, "balanceValue", "getBalanceValue()D", 0), hhp.class, "set", "set(Ljava/lang/Object;)V", 0));
        ClearEditText clearEditText = kxiVarC1.b;
        clearEditText.clearFocus();
        clearEditText.setErrorView(c1().d);
        clearEditText.setTextChangedListener(new ic10(this));
        v4c v4cVar = this.U;
        if (v4cVar == null) {
            Intrinsics.n("currencyUtils");
            throw null;
        }
        clearEditText.setKeyListener(DigitsKeyListener.getInstance(v4cVar.a() + "0123456789"));
        clearEditText.setRawInputType(8194);
        clearEditText.setFilters(new mw[]{new mw()});
        int i = 1;
        mla.h(this, kxiVarC1.f, new op8(1464524990, new uqd(this, i), true));
        mla.h(this, kxiVarC1.A, new op8(471966375, new Function2() { // from class: xb10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strE = pwo.e(R.string.common_functions__withdraw, aVar);
                    PixBtgWithdrawFragment pixBtgWithdrawFragment = this.a;
                    h hVarD1 = pixBtgWithdrawFragment.d1();
                    boolean zA = aVar.A(hVarD1);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        kc10 kc10Var = new kc10(0, hVarD1, h.class, "onBackClicked", "onBackClicked()V", 0);
                        aVar.r(kc10Var);
                        objY = kc10Var;
                    }
                    Function0 function0 = (Function0) ((chp) objY);
                    h hVarD2 = pixBtgWithdrawFragment.d1();
                    boolean zA2 = aVar.A(hVarD2);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        lc10 lc10Var = new lc10(0, hVarD2, h.class, "onHelpClicked", "onHelpClicked()V", 0);
                        aVar.r(lc10Var);
                        objY2 = lc10Var;
                    }
                    Function0 function1 = (Function0) ((chp) objY2);
                    h hVarD3 = pixBtgWithdrawFragment.d1();
                    boolean zA3 = aVar.A(hVarD3);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        mc10 mc10Var = new mc10(0, hVarD3, h.class, "onTransactionsClicked", "onTransactionsClicked()V", 0);
                        aVar.r(mc10Var);
                        objY3 = mc10Var;
                    }
                    bb10.a(strE, null, function0, function1, (Function0) ((chp) objY3), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, kxiVarC1.i, new op8(-1568708730, new Function2() { // from class: yb10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgWithdrawFragment pixBtgWithdrawFragment = this.a;
                    pixBtgWithdrawFragment.b1(6, pp8.b(-993826980, new gaj() { // from class: sb10
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            e.c cVar = (e.c) obj3;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgWithdrawFragment.c0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                shl shlVar = cVar.c;
                                String strA = cb40.a(R.string.page_withdraw__withdraw_to_any_last_account, new Object[0], aVar2);
                                h hVarD1 = pixBtgWithdrawFragment.d1();
                                boolean zA = aVar2.A(hVarD1);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    nc10 nc10Var = new nc10(1, hVarD1, h.class, "onBankAccountItemSelected", "onBankAccountItemSelected(Ljava/lang/String;)V", 0);
                                    aVar2.r(nc10Var);
                                    objY = nc10Var;
                                }
                                me10.c(shlVar, false, strA, (Function1) ((chp) objY), null, aVar2, 48, 16);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, kxiVarC1.e, new op8(685583461, new xqd(this, i), true));
        final kxi kxiVarC2 = c1();
        mla.h(this, kxiVarC2.z, new op8(-1022648736, new Function2() { // from class: tb10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgWithdrawFragment pixBtgWithdrawFragment = this.a;
                    pixBtgWithdrawFragment.b1(6, pp8.b(556175818, new gaj() { // from class: ub10
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            e.c cVar = (e.c) obj3;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgWithdrawFragment.c0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                uxs uxsVar = cVar.e;
                                h hVarD1 = pixBtgWithdrawFragment.d1();
                                boolean zA = aVar2.A(hVarD1);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    cc10 cc10Var = new cc10(0, hVarD1, h.class, "onWithdrawClicked", "onWithdrawClicked()V", 0);
                                    aVar2.r(cc10Var);
                                    objY = cc10Var;
                                }
                                kg10.a(uxsVar, (Function0) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        mla.h(this, kxiVarC2.v, new op8(-1022648736, new Function2() { // from class: tb10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final PixBtgWithdrawFragment pixBtgWithdrawFragment = this.a;
                    pixBtgWithdrawFragment.b1(6, pp8.b(556175818, new gaj() { // from class: ub10
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            e.c cVar = (e.c) obj3;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ohp<Object>[] ohpVarArr2 = PixBtgWithdrawFragment.c0;
                            cVar.getClass();
                            if ((iIntValue2 & 6) == 0) {
                                iIntValue2 |= (iIntValue2 & 8) == 0 ? aVar2.M(cVar) : aVar2.A(cVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                uxs uxsVar = cVar.e;
                                h hVarD1 = pixBtgWithdrawFragment.d1();
                                boolean zA = aVar2.A(hVarD1);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    cc10 cc10Var = new cc10(0, hVarD1, h.class, "onWithdrawClicked", "onWithdrawClicked()V", 0);
                                    aVar2.r(cc10Var);
                                    objY = cc10Var;
                                }
                                kg10.a(uxsVar, (Function0) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        new app(lifecycle, c1().a, new Function1() { // from class: qb10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                kxi kxiVar = kxiVarC2;
                kxiVar.z.setVisibility(!zBooleanValue ? 0 : 8);
                kxiVar.v.setVisibility(zBooleanValue ? 0 : 8);
                return Unit.a;
            }
        });
        mla.h(this, kxiVarC1.y, new op8(-1355091644, new Function2() { // from class: zb10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                kxi kxiVar = kxiVarC1;
                LinearLayout linearLayout = kxiVar.w;
                ComposeView composeView = kxiVar.y;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ohp<Object>[] ohpVarArr = PixBtgWithdrawFragment.c0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PixBtgWithdrawFragment pixBtgWithdrawFragment = this;
                    e eVar = (e) wyh.c(pixBtgWithdrawFragment.d1().D, aVar, 0, 7).getValue();
                    if (Intrinsics.g(eVar, e.d.a)) {
                        aVar.N(-1137375838);
                        aVar.H();
                        composeView.setVisibility(0);
                        linearLayout.setVisibility(8);
                        pixBtgWithdrawFragment.T0();
                    } else {
                        boolean zG = Intrinsics.g(eVar, e.b.a);
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zG) {
                            aVar.N(-1137186180);
                            composeView.setVisibility(0);
                            linearLayout.setVisibility(8);
                            pixBtgWithdrawFragment.N0();
                            h hVarD1 = pixBtgWithdrawFragment.d1();
                            boolean zA = aVar.A(hVarD1);
                            Object objY = aVar.y();
                            if (zA || objY == c0042a) {
                                dc10 dc10Var = new dc10(0, hVarD1, h.class, "onDismissFatalErrorDialog", "onDismissFatalErrorDialog()V", 0);
                                aVar.r(dc10Var);
                                objY = dc10Var;
                            }
                            ip9.a((Function0) ((chp) objY), aVar, 0);
                            aVar.H();
                        } else if (Intrinsics.g(eVar, e.a.a)) {
                            aVar.N(-1136884426);
                            composeView.setVisibility(0);
                            linearLayout.setVisibility(8);
                            pixBtgWithdrawFragment.N0();
                            h88.a(null, aVar, 0);
                            aVar.H();
                        } else if (Intrinsics.g(eVar, e.C0241e.a)) {
                            aVar.N(-1136620182);
                            composeView.setVisibility(0);
                            linearLayout.setVisibility(8);
                            pixBtgWithdrawFragment.N0();
                            h hVarD2 = pixBtgWithdrawFragment.d1();
                            boolean zA2 = aVar.A(hVarD2);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                ec10 ec10Var = new ec10(0, hVarD2, h.class, "onMakeDepositClicked", "onMakeDepositClicked()V", 0);
                                aVar.r(ec10Var);
                                objY2 = ec10Var;
                            }
                            we10.a(R.string.page_payment__complete_a_deposit_to_withdraw, R.string.page_payment__bank_accounts_added_to_your_sportybet_account_tip, R.string.page_payment__start_your_first_pix_deposit, (Function0) ((chp) objY2), aVar, 0);
                            aVar.H();
                        } else if (Intrinsics.g(eVar, e.f.a)) {
                            aVar.N(-1135973677);
                            composeView.setVisibility(0);
                            linearLayout.setVisibility(8);
                            pixBtgWithdrawFragment.N0();
                            h hVarD3 = pixBtgWithdrawFragment.d1();
                            boolean zA3 = aVar.A(hVarD3);
                            Object objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a) {
                                fc10 fc10Var = new fc10(0, hVarD3, h.class, "onGotItClicked", "onGotItClicked()V", 0);
                                aVar.r(fc10Var);
                                objY3 = fc10Var;
                            }
                            we10.a(R.string.page_payment__deposit_pending, R.string.page_payment__your_deposit_is_still_being_pcocessed_tip_try_again, R.string.page_payment__got_it, (Function0) ((chp) objY3), aVar, 0);
                            aVar.H();
                        } else {
                            if (!(eVar instanceof e.c)) {
                                throw rg.a(-867973421, aVar);
                            }
                            aVar.N(-1135399774);
                            aVar.H();
                            composeView.setVisibility(8);
                            linearLayout.setVisibility(0);
                            pixBtgWithdrawFragment.N0();
                        }
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.c000
    public final ClearEditText r0() {
        return c1().b;
    }

    @Override // defpackage.c000
    /* JADX INFO: renamed from: s0 */
    public final String getJ0() {
        return String.valueOf(d1().F.a);
    }
}
