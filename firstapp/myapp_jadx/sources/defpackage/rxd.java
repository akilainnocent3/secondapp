package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.common_ui.widgets.d;
import com.sporty.android.common_ui.widgets.e;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.android.widget.SimpleDescriptionListView;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lrxd;", "Lg02;", "<init>", "()V", "Llk50;", "Ljava/math/BigDecimal;", "balanceInfo", "Lsch0;", "uiDataState", "Ltch0;", "uiStatus", "Ler1;", "bvnDialogUiState", "", "showBVNVerifyDialog", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rxd extends g02 {
    public kvi b0;
    public final q8i0 c0;
    public final q8i0 d0;
    public zb6<? super Boolean> e0;
    public final hxd f0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositDedicatedAccountFragment$initTradingViewModel$1", f = "DepositDedicatedAccountFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<com.sporty.android.common.uievent.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = rxd.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sporty.android.common.uievent.a aVar, v1b<? super Unit> v1bVar) {
            return ((a) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sporty.android.common.uievent.a aVar = (com.sporty.android.common.uievent.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            rxd rxdVar = rxd.this;
            com.sporty.android.common.uievent.e eVarS0 = rxdVar.s0();
            kvi kviVar = rxdVar.b0;
            if (kviVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            FrameLayout frameLayout = kviVar.a;
            frameLayout.getClass();
            eVarS0.d(aVar, rxdVar, frameLayout, null);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return rxd.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return rxd.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return rxd.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class e extends qlr implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return rxd.this;
        }
    }

    public static final class f extends qlr implements Function0<w8i0> {
        public final /* synthetic */ e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
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

    public static final class i extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? rxd.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hxd] */
    public rxd() {
        super(R.layout.fragment_deposit_dedicated_account);
        this.c0 = new q8i0(jq40.a(yxd.class), new b(), new d(), new c());
        ttr ttrVarA = hwr.a(a1s.c, new f(new e()));
        this.d0 = new q8i0(jq40.a(n5d.class), new g(ttrVarA), new i(ttrVarA), new h(ttrVarA));
        this.f0 = new iaj() { // from class: hxd
            @Override // defpackage.iaj
            public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                ((Integer) obj4).getClass();
                rxd rxdVar = this.a;
                Context contextRequireContext = rxdVar.requireContext();
                contextRequireContext.getClass();
                e eVar = new e(contextRequireContext);
                eVar.c = d.a.C0204a.b;
                eVar.e = sn5.d(rxdVar, R.string.page_payment__to_open_an_account_with_the_bank_you_must_first_successfully_complete_a_withdrawal, new Object[0]);
                View decorView = rxdVar.requireActivity().getWindow().getDecorView();
                decorView.getClass();
                eVar.a(iIntValue, iIntValue2, iIntValue3, decorView);
                return Unit.a;
            }
        };
    }

    @Override // defpackage.s62
    public final HintView D0() {
        return null;
    }

    @Override // defpackage.s62
    public final FrameLayout E0() {
        kvi kviVar = this.b0;
        if (kviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        FrameLayout frameLayout = kviVar.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // defpackage.s62
    public final SwipeRefreshLayout G0() {
        return null;
    }

    @Override // defpackage.g02, defpackage.s62
    public final void K0() {
        super.K0();
        g1i g1iVar = new g1i(((n5d) this.d0.getValue()).d, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
    }

    @Override // defpackage.g02, defpackage.s62
    public final void L0() {
        super.L0();
        kvi kviVar = this.b0;
        if (kviVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        r910.b(kviVar.d);
        kvi kviVar2 = this.b0;
        if (kviVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView = kviVar2.f;
        op8 op8Var = new op8(1265155665, new Function2() { // from class: ixd
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final rxd rxdVar = this.a;
                    or0.a(null, false, false, null, pp8.b(1230692506, new Function2() { // from class: jxd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                j730 j730VarA = gna.a.a(new gxd());
                                j730 j730VarA2 = gna.b.a(new xvd(0));
                                j730 j730VarA3 = gna.c.a(new xxd(0));
                                qyd0 qyd0Var = gna.d;
                                final rxd rxdVar2 = rxdVar;
                                hna.b(new j730[]{j730VarA, j730VarA2, j730VarA3, qyd0Var.a(sn5.d(rxdVar2, R.string.common_functions__balance_label, rxdVar2.J0().d.f()))}, pp8.b(517714906, new Function2() { // from class: kxd
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        a aVar3 = (a) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            final rxd rxdVar3 = rxdVar2;
                                            ytw ytwVarB = wyh.b(rxdVar3.I0().y, lk50.b.a, aVar3, 48, 14);
                                            final ytw ytwVarC = wyh.c(rxdVar3.J0().v0, aVar3, 0, 7);
                                            ytw ytwVarC2 = wyh.c(rxdVar3.J0().x0, aVar3, 0, 7);
                                            final ytw ytwVarC3 = wyh.c(((n5d) rxdVar3.d0.getValue()).i, aVar3, 0, 7);
                                            Object objY = aVar3.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (objY == c0042a) {
                                                objY = m.b(Boolean.FALSE);
                                                aVar3.r(objY);
                                            }
                                            final ytw ytwVar = (ytw) objY;
                                            Unit unit = Unit.a;
                                            boolean zA = aVar3.A(rxdVar3);
                                            Object objY2 = aVar3.y();
                                            if (zA || objY2 == c0042a) {
                                                objY2 = new sxd(rxdVar3, ytwVar, null);
                                                aVar3.r(objY2);
                                            }
                                            xvf.e(aVar3, unit, (Function2) objY2);
                                            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                                aVar3.N(18310451);
                                                boolean zA2 = aVar3.A(rxdVar3) | aVar3.M(ytwVarC3);
                                                Object objY3 = aVar3.y();
                                                if (zA2 || objY3 == c0042a) {
                                                    objY3 = new Function0() { // from class: lxd
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Object value;
                                                            ytwVar.setValue(Boolean.FALSE);
                                                            rxd rxdVar4 = rxdVar3;
                                                            n5d n5dVar = (n5d) rxdVar4.d0.getValue();
                                                            jvd0 jvd0Var = n5dVar.b;
                                                            if (jvd0Var != null) {
                                                                jvd0Var.cancel((CancellationException) null);
                                                            }
                                                            n5dVar.b = null;
                                                            wwd0 wwd0Var = n5dVar.f;
                                                            do {
                                                                value = wwd0Var.getValue();
                                                            } while (!wwd0Var.g(value, new er1(0)));
                                                            zb6<? super Boolean> zb6Var = rxdVar4.e0;
                                                            if (zb6Var != null) {
                                                                Boolean boolValueOf = Boolean.valueOf(((er1) ytwVarC3.getValue()).c);
                                                                if (zb6Var.isActive()) {
                                                                    zi50.a aVar4 = zi50.b;
                                                                    zb6Var.resumeWith(boolValueOf);
                                                                } else {
                                                                    itf0.a aVar5 = itf0.a;
                                                                    aVar5.q(MyLog.TAG_COMMON);
                                                                    aVar5.n("Continuation not active, resume not perform.", new Object[0]);
                                                                }
                                                            }
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY3);
                                                }
                                                Function0 function0 = (Function0) objY3;
                                                boolean zA3 = aVar3.A(rxdVar3) | aVar3.M(ytwVarC);
                                                Object objY4 = aVar3.y();
                                                if (zA3 || objY4 == c0042a) {
                                                    objY4 = new Function0() { // from class: mxd
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            n5d n5dVar = (n5d) rxdVar3.d0.getValue();
                                                            List<Integer> list = ((sch0) ytwVarC.getValue()).e;
                                                            list.getClass();
                                                            n5dVar.b = ej5.c(o8i0.d(n5dVar), null, null, new o5d(list, n5dVar, null), 3);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY4);
                                                }
                                                Function0 function1 = (Function0) objY4;
                                                boolean zA4 = aVar3.A(rxdVar3);
                                                Object objY5 = aVar3.y();
                                                if (zA4 || objY5 == c0042a) {
                                                    objY5 = new Function1() { // from class: nxd
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj7) {
                                                            ijf0 ijf0Var = (ijf0) obj7;
                                                            ijf0Var.getClass();
                                                            n5d n5dVar = (n5d) rxdVar3.d0.getValue();
                                                            nk0 nk0Var = ijf0Var.a;
                                                            if (nk0Var.b.length() <= 11) {
                                                                String str = nk0Var.b;
                                                                for (int i2 = 0; i2 < str.length(); i2++) {
                                                                    if (Character.isDigit(str.charAt(i2))) {
                                                                    }
                                                                }
                                                                wwd0 wwd0Var = n5dVar.e;
                                                                wwd0Var.getClass();
                                                                wwd0Var.k(null, ijf0Var);
                                                            }
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY5);
                                                }
                                                kr1.a(function0, function1, (Function1) objY5, (er1) ytwVarC3.getValue(), aVar3, 0);
                                                aVar3.H();
                                            } else {
                                                aVar3.N(19222440);
                                                aVar3.H();
                                            }
                                            if (Intrinsics.g(((tch0) ytwVarC2.getValue()).b, k8.b.a) || Intrinsics.g(((tch0) ytwVarC2.getValue()).b, k8.d.a)) {
                                                aVar3.N(20173768);
                                                aVar3.H();
                                            } else {
                                                aVar3.N(19436681);
                                                boolean zA5 = aVar3.A(rxdVar3);
                                                Object objY6 = aVar3.y();
                                                if (zA5 || objY6 == c0042a) {
                                                    objY6 = new oxd(rxdVar3, 0);
                                                    aVar3.r(objY6);
                                                }
                                                final Function0 function2 = (Function0) objY6;
                                                k8 k8Var = ((tch0) ytwVarC2.getValue()).b;
                                                boolean zM = aVar3.M(function2) | aVar3.A(rxdVar3);
                                                Object objY7 = aVar3.y();
                                                if (zM || objY7 == c0042a) {
                                                    objY7 = new Function0() { // from class: pxd
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function2.invoke();
                                                            rxd rxdVar4 = rxdVar3;
                                                            d0n d0nVar = rxdVar4.v;
                                                            if (d0nVar == null) {
                                                                Intrinsics.n("utils");
                                                                throw null;
                                                            }
                                                            androidx.fragment.app.e eVarRequireActivity = rxdVar4.requireActivity();
                                                            eVarRequireActivity.getClass();
                                                            d0nVar.b(eVarRequireActivity, snb0.BVN);
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar3.r(objY7);
                                                }
                                                owb.b(function2, function2, (Function0) objY7, k8Var, aVar3, 4096);
                                                aVar3.H();
                                            }
                                            lk50 lk50Var = (lk50) ytwVarB.getValue();
                                            lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
                                            BigDecimal bigDecimal = cVar != null ? (BigDecimal) cVar.a : null;
                                            sch0 sch0Var = (sch0) ytwVarC.getValue();
                                            tch0 tch0Var = (tch0) ytwVarC2.getValue();
                                            yxd yxdVarJ0 = rxdVar3.J0();
                                            boolean zA6 = aVar3.A(yxdVarJ0);
                                            Object objY8 = aVar3.y();
                                            if (zA6 || objY8 == c0042a) {
                                                txd txdVar = new txd(1, yxdVarJ0, yxd.class, "onAction", "onAction(Lcom/sportybet/feature/payment/impl/deposit/presentation/viewmodel/UiAction;)V", 0);
                                                aVar3.r(txdVar);
                                                objY8 = txdVar;
                                            }
                                            chp chpVar = (chp) objY8;
                                            boolean zA7 = aVar3.A(rxdVar3);
                                            Object objY9 = aVar3.y();
                                            if (zA7 || objY9 == c0042a) {
                                                uxd uxdVar = new uxd(0, rxdVar3, rxd.class, "onRefresh", "onRefresh()V", 0);
                                                aVar3.r(uxdVar);
                                                objY9 = uxdVar;
                                            }
                                            chp chpVar2 = (chp) objY9;
                                            boolean zA8 = aVar3.A(rxdVar3);
                                            Object objY10 = aVar3.y();
                                            if (zA8 || objY10 == c0042a) {
                                                objY10 = new vxd(0, rxdVar3, rxd.class, "onTermsAndConditionsClick", "onTermsAndConditionsClick()V", 0);
                                                aVar3.r(objY10);
                                            }
                                            chp chpVar3 = (chp) objY10;
                                            hxd hxdVar = rxdVar3.f0;
                                            Function1 function3 = (Function1) chpVar;
                                            Function0 function4 = (Function0) chpVar2;
                                            boolean zA9 = aVar3.A(rxdVar3);
                                            Object objY11 = aVar3.y();
                                            if (zA9 || objY11 == c0042a) {
                                                objY11 = new Function1() { // from class: qxd
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj7) {
                                                        String str = (String) obj7;
                                                        str.getClass();
                                                        if (rxdVar3.z != null) {
                                                            yrh0.e(str);
                                                            return Unit.a;
                                                        }
                                                        Intrinsics.n("paymentUtils");
                                                        throw null;
                                                    }
                                                };
                                                aVar3.r(objY11);
                                            }
                                            fxd.f(bigDecimal, sch0Var, tch0Var, function3, function4, (Function1) objY11, hxdVar, (Function0) chpVar3, aVar3, 0, 0);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar2), aVar2, 48);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true);
        composeView.setViewCompositionStrategy(u6i0.b.a);
        composeView.setContent(op8Var);
    }

    @Override // defpackage.g02
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final yxd P0() {
        return (yxd) this.c0.getValue();
    }

    @Override // defpackage.s62
    public final List<ClearEditText> m0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> n0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final FrameLayout o0() {
        kvi kviVar = this.b0;
        if (kviVar != null) {
            return kviVar.b;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_deposit_dedicated_account, viewGroup, false);
        int i2 = R.id.anti_interaction_mask;
        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.anti_interaction_mask, viewInflate);
        if (frameLayout != null) {
            i2 = R.id.init_failed_mask;
            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.init_failed_mask, viewInflate);
            if (loadingViewNew != null) {
                i2 = R.id.init_mask;
                ComposeView composeView = (ComposeView) h5e.a(R.id.init_mask, viewInflate);
                if (composeView != null) {
                    i2 = R.id.loading_mask;
                    LoadingViewNew loadingViewNew2 = (LoadingViewNew) h5e.a(R.id.loading_mask, viewInflate);
                    if (loadingViewNew2 != null) {
                        i2 = R.id.main_container;
                        ComposeView composeView2 = (ComposeView) h5e.a(R.id.main_container, viewInflate);
                        if (composeView2 != null) {
                            FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                            this.b0 = new kvi(frameLayout2, frameLayout, loadingViewNew, composeView, loadingViewNew2, composeView2);
                            frameLayout2.getClass();
                            return frameLayout2;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // defpackage.s62
    public final List<TextView> p0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final List<TextView> q0() {
        return m2g.a;
    }

    @Override // defpackage.s62
    public final SimpleDescriptionListView t0() {
        return null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew u0() {
        kvi kviVar = this.b0;
        if (kviVar != null) {
            return kviVar.c;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final ComposeView v0() {
        kvi kviVar = this.b0;
        if (kviVar != null) {
            return kviVar.d;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.s62
    public final LoadingViewNew w0() {
        kvi kviVar = this.b0;
        if (kviVar != null) {
            return kviVar.e;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
