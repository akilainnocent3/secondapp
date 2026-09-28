package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.PendingRequestFragment$initViewModel$2", f = "PendingRequestFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yc00 extends tje0 implements Function2<cd00, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zc00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc00(zc00 zc00Var, v1b<? super yc00> v1bVar) {
        super(2, v1bVar);
        this.b = zc00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yc00 yc00Var = new yc00(this.b, v1bVar);
        yc00Var.a = obj;
        return yc00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cd00 cd00Var, v1b<? super Unit> v1bVar) {
        return ((yc00) create(cd00Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        cd00 cd00Var = (cd00) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = cd00Var instanceof cd00.b;
        zc00 zc00Var = this.b;
        if (z) {
            String str = ((cd00.b) cd00Var).a;
            Context contextRequireContext = zc00Var.requireContext();
            contextRequireContext.getClass();
            d900 d900Var = zc00Var.w;
            if (d900Var == null) {
                Intrinsics.n("paymentRouter");
                throw null;
            }
            d900Var.f(contextRequireContext, aqg0.e.c.a, fag.D_PENDING_POPUP);
            if (str != null) {
                if (zc00Var.w == null) {
                    Intrinsics.n("paymentRouter");
                    throw null;
                }
                zc00Var.startActivity(c1h0.a(0, contextRequireContext, str));
            }
            Bundle bundle = Bundle.EMPTY;
            bundle.getClass();
            zc00Var.getParentFragmentManager().m0("pending_request_viewed_transaction", bundle);
            zc00Var.dismissAllowingStateLoss();
        } else {
            if (!Intrinsics.g(cd00Var, cd00.a.a)) {
                uhc.a();
                return null;
            }
            azm azmVar = zc00Var.v;
            if (azmVar == null) {
                Intrinsics.n("router");
                throw null;
            }
            azmVar.d(wae.NOTIFICATION_SETTINGS);
        }
        return Unit.a;
    }
}
