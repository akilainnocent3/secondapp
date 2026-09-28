package com.sportybet.android.globalpay.stp.clabe;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.r;
import com.sportybet.android.basepay.TransactionSuccessActivity;
import com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment;
import com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment.a;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.ble;
import defpackage.c0d;
import defpackage.cfx;
import defpackage.cp7;
import defpackage.cyb;
import defpackage.ej5;
import defpackage.fbh0;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.iel;
import defpackage.jq40;
import defpackage.js;
import defpackage.kol;
import defpackage.lx5;
import defpackage.lyh;
import defpackage.myh;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.ro7;
import defpackage.sn5;
import defpackage.t340;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.w8i0;
import defpackage.wae;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xsm;
import defpackage.y5b;
import defpackage.y8j;
import defpackage.zyf0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/globalpay/stp/clabe/ClabeDepositFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ClabeDepositFragment extends kol {
    public final cfx f = new cfx(jq40.a(ro7.class), new b());
    public fbh0 i;
    public y8j v;
    public final q8i0 w;

    @c0d(c = "com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$onCreateView$1$1$2$1", f = "ClabeDepositFragment.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ComposeView c;

        /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$a$a, reason: collision with other inner class name */
        public static final class C0244a<T> implements myh {
            public final /* synthetic */ ComposeView a;
            public final /* synthetic */ ClabeDepositFragment b;

            public C0244a(ComposeView composeView, ClabeDepositFragment clabeDepositFragment) {
                this.a = composeView;
                this.b = clabeDepositFragment;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                com.sportybet.android.globalpay.stp.clabe.c cVar = (com.sportybet.android.globalpay.stp.clabe.c) obj;
                boolean z = cVar instanceof com.sportybet.android.globalpay.stp.clabe.c.C0248c;
                ComposeView composeView = this.a;
                ClabeDepositFragment clabeDepositFragment = this.b;
                if (z) {
                    ble.d(composeView.getContext(), clabeDepositFragment.getChildFragmentManager(), String.valueOf(((com.sportybet.android.globalpay.stp.clabe.c.C0248c) cVar).b));
                } else if (Intrinsics.g(cVar, com.sportybet.android.globalpay.stp.clabe.c.d.a)) {
                    Context contextRequireContext = clabeDepositFragment.requireContext();
                    contextRequireContext.getClass();
                    androidx.appcompat.app.b bVarA = js.a(contextRequireContext, sn5.c(composeView, R.string.page_payment__pending_request, new Object[0]), sn5.c(composeView, R.string.page_payment__deposit_pending_nuvei, new Object[0]), false, sn5.c(composeView, R.string.common_functions__home, new Object[0]), sn5.c(composeView, R.string.common_functions__transactions, new Object[0]), new com.sportybet.android.globalpay.stp.clabe.a(0, clabeDepositFragment.m0(), com.sportybet.android.globalpay.stp.clabe.f.class, "onHomeClicked", "onHomeClicked()V", 0), new com.sportybet.android.globalpay.stp.clabe.b(0, clabeDepositFragment.m0(), com.sportybet.android.globalpay.stp.clabe.f.class, "onTransactionsClicked", "onTransactionsClicked()V", 0));
                    y8j y8jVar = clabeDepositFragment.v;
                    if (y8jVar == null) {
                        Intrinsics.n("fullStoryCommonManager");
                        throw null;
                    }
                    Window window = bVarA.getWindow();
                    window.getClass();
                    View decorView = window.getDecorView();
                    decorView.getClass();
                    y8jVar.e(decorView, "deposit__confirmation_popup");
                    y8j y8jVar2 = clabeDepositFragment.v;
                    if (y8jVar2 == null) {
                        Intrinsics.n("fullStoryCommonManager");
                        throw null;
                    }
                    Button buttonF = bVarA.f(-2);
                    buttonF.getClass();
                    y8jVar2.e(buttonF, "deposit__check_transaction_btn");
                    y8j y8jVar3 = clabeDepositFragment.v;
                    if (y8jVar3 == null) {
                        Intrinsics.n("fullStoryCommonManager");
                        throw null;
                    }
                    Button buttonF2 = bVarA.f(-1);
                    buttonF2.getClass();
                    y8jVar3.e(buttonF2, "deposit__done_btn");
                } else if (cVar instanceof com.sportybet.android.globalpay.stp.clabe.c.f) {
                    com.sportybet.android.globalpay.stp.clabe.c.f fVar = (com.sportybet.android.globalpay.stp.clabe.c.f) cVar;
                    TransactionSuccessActivity.z1(clabeDepositFragment.requireActivity(), fVar.b, sn5.c(composeView, R.string.int_spei_by_stp, new Object[0]), null, fVar.a, 1, null, false);
                    clabeDepositFragment.requireActivity().finish();
                } else if (Intrinsics.g(cVar, com.sportybet.android.globalpay.stp.clabe.c.e.a)) {
                    fbh0 fbh0Var = clabeDepositFragment.i;
                    if (fbh0Var == null) {
                        Intrinsics.n("uiRouterManager");
                        throw null;
                    }
                    fbh0Var.e(o7d.a(wae.HOME));
                } else if (Intrinsics.g(cVar, com.sportybet.android.globalpay.stp.clabe.c.g.a)) {
                    fbh0 fbh0Var2 = clabeDepositFragment.i;
                    if (fbh0Var2 == null) {
                        Intrinsics.n("uiRouterManager");
                        throw null;
                    }
                    fbh0Var2.e(o7d.a(wae.ME_TRANSACTIONS));
                } else if (cVar instanceof com.sportybet.android.globalpay.stp.clabe.c.a) {
                    Context contextRequireContext2 = clabeDepositFragment.requireContext();
                    contextRequireContext2.getClass();
                    String strC = sn5.c(composeView, R.string.page_payment__deposit_failed, new Object[0]);
                    String strC2 = ((com.sportybet.android.globalpay.stp.clabe.c.a) cVar).a;
                    if (strC2 == null) {
                        strC2 = sn5.c(composeView, R.string.common_feedback__something_went_wrong_tip, new Object[0]);
                    }
                    js.b(contextRequireContext2, strC, strC2, sn5.c(composeView, R.string.common_functions__ok, new Object[0]), null, null, null, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                } else {
                    if (!Intrinsics.g(cVar, com.sportybet.android.globalpay.stp.clabe.c.b.a)) {
                        uhc.a();
                        return null;
                    }
                    zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
                }
                return Unit.a;
            }
        }

        public static final class b implements lyh<Object> {
            public final /* synthetic */ lyh a;

            /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$onCreateView$1$1$2$1$invokeSuspend$$inlined$filterIsInstance$1", f = "ClabeDepositFragment.kt", l = {109}, m = "collect", v = 2)
            public static final class C0245a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0245a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.collect(null, this);
                }
            }

            /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$a$b$b, reason: collision with other inner class name */
            public static final class C0246b<T> implements myh {
                public final /* synthetic */ myh a;

                /* JADX INFO: renamed from: com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$a$b$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.android.globalpay.stp.clabe.ClabeDepositFragment$onCreateView$1$1$2$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ClabeDepositFragment.kt", l = {50}, m = "emit", v = 2)
                public static final class C0247a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0247a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0246b.this.emit(null, this);
                    }
                }

                public C0246b(myh myhVar) {
                    this.a = myhVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0247a c0247a;
                    if (v1bVar instanceof C0247a) {
                        c0247a = (C0247a) v1bVar;
                        int i = c0247a.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0247a.b = i - Integer.MIN_VALUE;
                        } else {
                            c0247a = new C0247a(v1bVar);
                        }
                    } else {
                        c0247a = new C0247a(v1bVar);
                    }
                    Object obj2 = c0247a.a;
                    y5b y5bVar = y5b.a;
                    int i2 = c0247a.b;
                    if (i2 == 0) {
                        uj50.b(obj2);
                        if (obj instanceof com.sportybet.android.globalpay.stp.clabe.c) {
                            c0247a.b = 1;
                            if (this.a.emit(obj, c0247a) == y5bVar) {
                                return y5bVar;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public b(t340 t340Var) {
                this.a = t340Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
                C0245a c0245a;
                if (v1bVar instanceof C0245a) {
                    c0245a = (C0245a) v1bVar;
                    int i = c0245a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0245a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0245a = new C0245a(v1bVar);
                    }
                } else {
                    c0245a = new C0245a(v1bVar);
                }
                Object obj = c0245a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0245a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    C0246b c0246b = new C0246b(myhVar);
                    c0245a.b = 1;
                    if (this.a.collect(c0246b, c0245a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComposeView composeView, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = composeView;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ClabeDepositFragment.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ClabeDepositFragment clabeDepositFragment = ClabeDepositFragment.this;
                b bVar = new b(clabeDepositFragment.m0().d);
                C0244a c0244a = new C0244a(this.c, clabeDepositFragment);
                this.a = 1;
                if (bVar.collect(c0244a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final class b implements Function0<Bundle> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            ClabeDepositFragment clabeDepositFragment = ClabeDepositFragment.this;
            Bundle arguments = clabeDepositFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(clabeDepositFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ClabeDepositFragment.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ClabeDepositFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ClabeDepositFragment() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.w = new q8i0(jq40.a(com.sportybet.android.globalpay.stp.clabe.f.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
    }

    public final com.sportybet.android.globalpay.stp.clabe.f m0() {
        return (com.sportybet.android.globalpay.stp.clabe.f) this.w.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object value;
        String strF;
        String strB;
        String str;
        super.onCreate(bundle);
        com.sportybet.android.globalpay.stp.clabe.f fVarM0 = m0();
        ro7 ro7Var = (ro7) this.f.getValue();
        xsm xsmVar = fVarM0.v;
        fVarM0.y = ro7Var.c;
        fVarM0.z = ro7Var.b;
        wwd0 wwd0Var = fVarM0.a;
        do {
            value = wwd0Var.getValue();
            strF = fVarM0.f.f();
            String str2 = fVarM0.z;
            if (str2 == null) {
                Intrinsics.n("amount");
                throw null;
            }
            strB = xsmVar.b(str2, true);
            str = fVarM0.z;
            if (str == null) {
                Intrinsics.n("amount");
                throw null;
            }
        } while (!wwd0Var.g(value, new cp7(strF, strB, xsmVar.d(str, true), ro7Var.a, 33)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-1887815223, new Function2() { // from class: po7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ClabeDepositFragment clabeDepositFragment = this;
                    or0.a(null, false, false, null, pp8.b(26880082, new qo7(clabeDepositFragment), aVar), aVar, 24576);
                    Unit unit = Unit.a;
                    boolean zA = aVar.A(clabeDepositFragment);
                    ComposeView composeView2 = composeView;
                    boolean zA2 = zA | aVar.A(composeView2);
                    Object objY = aVar.y();
                    if (zA2 || objY == a.C0041a.a) {
                        objY = clabeDepositFragment.new a(composeView2, null);
                        aVar.r(objY);
                    }
                    xvf.e(aVar, unit, (Function2) objY);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.sportybet.android.globalpay.stp.clabe.f fVarM0 = m0();
        ej5.c(o8i0.d(fVarM0), null, null, new com.sportybet.android.globalpay.stp.clabe.e(fVarM0, null), 3);
    }
}
