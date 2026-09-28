package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcfu;", "Lnkj0;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cfu extends gwl {
    public final q8i0 H;
    public final mpe0 I;

    public static final /* synthetic */ class a extends saj implements Function1<h000, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(h000 h000Var) {
            h000 h000Var2 = h000Var;
            h000Var2.getClass();
            ((cfu) this.receiver).n0(h000Var2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<okj0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(okj0 okj0Var) {
            okj0 okj0Var2 = okj0Var;
            okj0Var2.getClass();
            cfu cfuVar = (cfu) this.receiver;
            cfuVar.getClass();
            if (okj0Var2.equals(okj0.a.a)) {
                cfuVar.D.b(s8d0.b.a);
                return Unit.a;
            }
            uhc.a();
            return null;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return cfu.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? cfu.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public cfu() {
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.H = new q8i0(jq40.a(rgu.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.I = hwr.b(new fsk(this, 1));
    }

    @Override // defpackage.nkj0
    public final xkj0 o0() {
        return (xkj0) this.I.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(1180881585, new Function2() { // from class: bfu
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    cfu cfuVar = this.a;
                    rgu rguVar = (rgu) cfuVar.H.getValue();
                    boolean zA = aVar.A(cfuVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new cfu.a(1, cfuVar, cfu.class, "processSideEffect", "processSideEffect(Lcom/sportybet/android/globalpay/base/PayBaseSideEffect;)V", 0);
                        aVar.r(objY);
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    boolean zA2 = aVar.A(cfuVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        cfu.b bVar = new cfu.b(1, cfuVar, cfu.class, "processSideEffect", "processSideEffect(Lcom/sportybet/android/globalpay/base/withdraw/WithdrawBaseSideEffect;)V", 0);
                        aVar.r(bVar);
                        objY2 = bVar;
                    }
                    ofu.b(rguVar, function1, (Function1) ((chp) objY2), aVar, 8);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
