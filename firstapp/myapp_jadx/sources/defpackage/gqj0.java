package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$withdrawableStateFlow$2", f = "WithdrawTransferViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gqj0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ hqj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqj0(hqj0 hqj0Var, v1b<? super gqj0> v1bVar) {
        super(2, v1bVar);
        this.b = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gqj0 gqj0Var = new gqj0(this.b, v1bVar);
        gqj0Var.a = ((Boolean) obj).booleanValue();
        return gqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((gqj0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.l0;
        if (wwd0Var.getValue() instanceof c330.a) {
            bkj0.a(z, null, wwd0Var, null);
        }
        return Unit.a;
    }
}
