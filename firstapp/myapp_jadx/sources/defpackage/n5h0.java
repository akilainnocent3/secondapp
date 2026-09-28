package defpackage;

import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity$initViewModel$1$4", f = "TxFixStatusActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n5h0 extends tje0 implements Function2<c330, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxFixStatusActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5h0(TxFixStatusActivity txFixStatusActivity, v1b<? super n5h0> v1bVar) {
        super(2, v1bVar);
        this.b = txFixStatusActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n5h0 n5h0Var = new n5h0(this.b, v1bVar);
        n5h0Var.a = obj;
        return n5h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c330 c330Var, v1b<? super Unit> v1bVar) {
        return ((n5h0) create(c330Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        c330 c330Var = (c330) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxFixStatusActivity txFixStatusActivity = this.b;
        cf cfVar = txFixStatusActivity.d;
        if (cfVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        b330.a(cfVar.c, c330Var);
        cf cfVar2 = txFixStatusActivity.d;
        if (cfVar2 != null) {
            cfVar2.e.setEnabled(!c330Var.equals(c330.b.a));
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
