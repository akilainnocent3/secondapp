package defpackage;

import com.sporty.android.common.uievent.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$initPhoneChannelCheckingDialog$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f2e extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ r2e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2e(v1b v1bVar, r2e r2eVar) {
        super(2, v1bVar);
        this.b = r2eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f2e f2eVar = new f2e(v1bVar, this.b);
        f2eVar.a = ((Boolean) obj).booleanValue();
        return f2eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((f2e) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        xb00 xb00Var;
        r2e r2eVar = this.b;
        wwd0 wwd0Var = r2eVar.H0;
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z && (xb00Var = (xb00) wwd0Var.getValue()) != null) {
            b.e(r2eVar.f, null, null, vch0.d(xb00Var.a), null, null, null, null, 507);
            wwd0Var.setValue(null);
        }
        return Unit.a;
    }
}
