package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.globalpay.jumpbank.JumpBankActivity;
import com.sportybet.feature.payment.impl.deposit.presentation.model.PendingRequestParam;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g02 extends s62 {
    public final q8i0 T;
    public bc6 U;
    public ee<sfp> V;
    public ee<u9e> W;
    public n8e X;
    public bc6 Y;
    public bc6 Z;
    public bc6 a0;

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.BaseDepositFragment$initTradingViewModel$1$1", f = "BaseDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<z7e, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = g02.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z7e z7eVar, v1b<? super Unit> v1bVar) {
            return ((a) create(z7eVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            g02 g02Var = g02.this;
            q8i0 q8i0Var = g02Var.T;
            z7e z7eVar = (z7e) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String string = null;
            if (z7eVar instanceof z7e.b) {
                z7e.b bVar = (z7e.b) z7eVar;
                g02Var.Y = bVar.b;
                ee<sfp> eeVar = g02Var.V;
                if (eeVar == null) {
                    Intrinsics.n("jumpBankLauncher");
                    throw null;
                }
                eeVar.b(bVar.a);
            } else if (z7eVar instanceof z7e.c) {
                z7e.c cVar = (z7e.c) z7eVar;
                g02Var.Z = cVar.c;
                ee<u9e> eeVar2 = g02Var.W;
                if (eeVar2 == null) {
                    Intrinsics.n("openWebViewForResultLauncher");
                    throw null;
                }
                String str = cVar.a;
                UiText uiText = cVar.b;
                if (uiText != null) {
                    Context contextRequireContext = g02Var.requireContext();
                    contextRequireContext.getClass();
                    CharSequence charSequenceE = uiText.e(contextRequireContext);
                    if (charSequenceE != null) {
                        string = charSequenceE.toString();
                    }
                }
                eeVar2.b(new u9e(str, string));
            } else if (z7eVar instanceof z7e.f) {
                z7e.f fVar = (z7e.f) z7eVar;
                g02Var.a0 = fVar.b;
                jvd jvdVar = (jvd) q8i0Var.getValue();
                ld00 ld00Var = fVar.a;
                wwd0 wwd0Var = jvdVar.D;
                wwd0Var.getClass();
                wwd0Var.k(null, ld00Var);
                new gvd().show(g02Var.getChildFragmentManager(), gvd.class.getSimpleName());
            } else if (Intrinsics.g(z7eVar, z7e.a.a)) {
                jvd jvdVar2 = (jvd) q8i0Var.getValue();
                jvdVar2.D.setValue(null);
                jvdVar2.e.a(Unit.a);
            } else if (z7eVar instanceof z7e.d) {
                jvd jvdVar3 = (jvd) q8i0Var.getValue();
                tzs tzsVar = ((z7e.d) z7eVar).a;
                tzsVar.getClass();
                wwd0 wwd0Var2 = jvdVar3.B;
                wwd0Var2.getClass();
                wwd0Var2.k(null, tzsVar);
            } else if (z7eVar instanceof z7e.j) {
                FragmentManager childFragmentManager = g02Var.getChildFragmentManager();
                childFragmentManager.getClass();
                PendingRequestParam pendingRequestParam = ((z7e.j) z7eVar).a;
                zc00 zc00Var = new zc00();
                zc00Var.setArguments(vj5.a(new Pair("ARGS_PENDING_REQUEST", pendingRequestParam)));
                zc00Var.show(childFragmentManager, "PendingRequestFragment");
            } else if (z7eVar instanceof z7e.k) {
                g02Var.U = ((z7e.k) z7eVar).d;
            } else {
                if (!(z7eVar instanceof z7e.e) && !(z7eVar instanceof z7e.g) && !(z7eVar instanceof z7e.i) && !(z7eVar instanceof z7e.h)) {
                    uhc.a();
                    return null;
                }
                if (g02Var.X == null) {
                    Intrinsics.n("depositUiEventProcessor");
                    throw null;
                }
                n8e.a(z7eVar, g02Var);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.BaseDepositFragment$initTradingViewModel$1$2", f = "BaseDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<lod, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ m02 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m02 m02Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = m02Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = g02.this.new b(this.c, v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lod lodVar, v1b<? super Unit> v1bVar) {
            return ((b) create(lodVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lod lodVar = (lod) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Iterator<T> it = g02.this.m0().iterator();
            while (it.hasNext()) {
                ow.a((ClearEditText) it.next(), lodVar, this.c.d.f());
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.BaseDepositFragment$initTradingViewModel$1$3", f = "BaseDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<uw, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = g02.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(uw uwVar, v1b<? super Unit> v1bVar) {
            return ((c) create(uwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uw uwVar = (uw) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            AmountQuickAddingButtonGroup amountQuickAddingButtonGroupM0 = g02.this.M0();
            if (amountQuickAddingButtonGroupM0 != null) {
                amountQuickAddingButtonGroupM0.E(uwVar.a);
                amountQuickAddingButtonGroupM0.setVisibility(uwVar.b ? 0 : 8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.BaseDepositFragment$initTradingViewModel$2$1", f = "BaseDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<ivd, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = g02.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ivd ivdVar, v1b<? super Unit> v1bVar) {
            return ((d) create(ivdVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ivd ivdVar = (ivd) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bc6 bc6Var = g02.this.a0;
            if (bc6Var != null) {
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(ivdVar);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
            }
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return g02.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? g02.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public g02(int i2) {
        super(i2);
        ttr ttrVarA = hwr.a(a1s.c, new f(new e()));
        this.T = new q8i0(jq40.a(jvd.class), new g(ttrVarA), new i(ttrVarA), new h(ttrVarA));
    }

    @Override // defpackage.s62
    public void K0() {
        super.K0();
        m02 m02VarP0 = P0();
        g1i g1iVar = new g1i(m02VarP0.i0, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(m02VarP0.H1(), new b(m02VarP0, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        g1i g1iVar3 = new g1i(m02VarP0.k0, new c(null));
        s9s lifecycle3 = getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(((jvd) this.T.getValue()).d, new d(null));
        s9s lifecycle4 = getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
    }

    @Override // defpackage.s62
    public void L0() {
        super.L0();
        AmountQuickAddingButtonGroup amountQuickAddingButtonGroupM0 = M0();
        if (amountQuickAddingButtonGroupM0 != null) {
            amountQuickAddingButtonGroupM0.setupOnClickListener(new Function1() { // from class: c02
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    BigDecimal bigDecimal = (BigDecimal) obj;
                    bigDecimal.getClass();
                    g02 g02Var = this.a;
                    m02 m02VarP0 = g02Var.P0();
                    e02 e02Var = new e02(g02Var, 0);
                    m02VarP0.getClass();
                    ej5.c(o8i0.d(m02VarP0), null, null, new n02(m02VarP0, bigDecimal, e02Var, null), 3);
                    return Unit.a;
                }
            });
        }
        ComposeView composeViewN0 = N0();
        if (composeViewN0 != null) {
            mla.i(composeViewN0, new op8(-1451937753, new d02(this), true));
        }
        ComposeView composeViewO0 = O0();
        if (composeViewO0 != null) {
            uwd0<String> uwd0VarX0 = P0().x0();
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            s9s.b bVar = s9s.b.a;
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new i02(viewLifecycleOwner, uwd0VarX0, null, composeViewO0), 3);
        }
    }

    public AmountQuickAddingButtonGroup M0() {
        return null;
    }

    public ComposeView N0() {
        return null;
    }

    public ComposeView O0() {
        return null;
    }

    public abstract m02 P0();

    @Override // defpackage.s62, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z0();
        JumpBankActivity.a aVar = JumpBankActivity.d;
        aVar.getClass();
        ee<sfp> eeVarRegisterForActivityResult = registerForActivityResult(aVar, new ud() { // from class: zz1
            @Override // defpackage.ud
            public final void a(Object obj) {
                tfp tfpVar = (tfp) obj;
                tfpVar.getClass();
                bc6 bc6Var = this.a.Y;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(tfpVar);
                    } else {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_COMMON);
                        aVar3.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.V = eeVarRegisterForActivityResult;
        z0();
        ee<u9e> eeVarRegisterForActivityResult2 = registerForActivityResult(new c900(), new ud() { // from class: a02
            @Override // defpackage.ud
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                bc6 bc6Var = this.a.Z;
                if (bc6Var != null) {
                    if (bc6Var.p() instanceof bzx) {
                        zi50.a aVar2 = zi50.b;
                        bc6Var.resumeWith(bool);
                    } else {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_COMMON);
                        aVar3.n("Continuation not active, resume not perform.", new Object[0]);
                    }
                }
            }
        });
        eeVarRegisterForActivityResult2.getClass();
        this.W = eeVarRegisterForActivityResult2;
        getChildFragmentManager().n0("pending_request_viewed_transaction", this, new qxi() { // from class: b02
            @Override // defpackage.qxi
            public final void a(String str, Bundle bundle2) {
                bundle2.getClass();
                e activity = this.a.getActivity();
                if (activity != null) {
                    if (activity.isFinishing()) {
                        activity = null;
                    }
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
        });
    }
}
