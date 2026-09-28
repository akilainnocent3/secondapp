package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity$initViewModel$1$1", f = "TxFixStatusActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k5h0 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxFixStatusActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5h0(TxFixStatusActivity txFixStatusActivity, v1b<? super k5h0> v1bVar) {
        super(2, v1bVar);
        this.b = txFixStatusActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k5h0 k5h0Var = new k5h0(this.b, v1bVar);
        k5h0Var.a = obj;
        return k5h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((k5h0) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxFixStatusActivity txFixStatusActivity = this.b;
        e eVar = txFixStatusActivity.b;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        cf cfVar = txFixStatusActivity.d;
        if (cfVar != null) {
            eVar.c(aVar, txFixStatusActivity, cfVar.a, null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
