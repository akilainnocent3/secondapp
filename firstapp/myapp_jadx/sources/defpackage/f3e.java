package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initTradingSharedViewModel$1$1", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f3e extends tje0 implements Function2<lk50<? extends BigDecimal>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3e(u3e u3eVar, v1b<? super f3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f3e f3eVar = new f3e(this.b, v1bVar);
        f3eVar.a = obj;
        return f3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BigDecimal> lk50Var, v1b<? super Unit> v1bVar) {
        return ((f3e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lke lkeVar = this.b.i;
        if (lkeVar != null) {
            lkeVar.e.f.setText(lk50Var instanceof lk50.c ? n4d.a((BigDecimal) ((lk50.c) lk50Var).a) : "--");
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
