package defpackage;

import com.sporty.android.common.uievent.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$initPhoneChannelCheckingDialog$1", f = "WithdrawMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zmj0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ dnj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmj0(v1b v1bVar, dnj0 dnj0Var) {
        super(2, v1bVar);
        this.b = dnj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zmj0 zmj0Var = new zmj0(v1bVar, this.b);
        zmj0Var.a = ((Boolean) obj).booleanValue();
        return zmj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((zmj0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        xb00 xb00Var;
        dnj0 dnj0Var = this.b;
        wwd0 wwd0Var = dnj0Var.v0;
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z && (xb00Var = (xb00) wwd0Var.getValue()) != null) {
            b.e(dnj0Var.f, null, null, vch0.d(xb00Var.a), null, null, null, null, 507);
            wwd0Var.setValue(null);
        }
        return Unit.a;
    }
}
