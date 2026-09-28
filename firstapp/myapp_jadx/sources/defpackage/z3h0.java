package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity$initViewmodel$1$1", f = "TxDetailsV2Activity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z3h0 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxDetailsV2Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3h0(TxDetailsV2Activity txDetailsV2Activity, v1b<? super z3h0> v1bVar) {
        super(2, v1bVar);
        this.b = txDetailsV2Activity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z3h0 z3h0Var = new z3h0(this.b, v1bVar);
        z3h0Var.a = obj;
        return z3h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((z3h0) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxDetailsV2Activity txDetailsV2Activity = this.b;
        e eVar = txDetailsV2Activity.e;
        if (eVar != null) {
            eVar.c(aVar, txDetailsV2Activity, txDetailsV2Activity.findViewById(R.id.root), null);
            return Unit.a;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }
}
