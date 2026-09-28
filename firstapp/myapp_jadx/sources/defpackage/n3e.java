package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositNewCardDialogFragment$initViewModel$1$4", f = "DepositNewCardDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n3e extends tje0 implements Function2<yyx, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ u3e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3e(u3e u3eVar, v1b<? super n3e> v1bVar) {
        super(2, v1bVar);
        this.b = u3eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n3e n3eVar = new n3e(this.b, v1bVar);
        n3eVar.a = obj;
        return n3eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yyx yyxVar, v1b<? super Unit> v1bVar) {
        return ((n3e) create(yyxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        yyx yyxVar = (yyx) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lke lkeVar = this.b.i;
        if (lkeVar != null) {
            oxo.a(yyxVar, lkeVar.e.z);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
