package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.domain.manager.MaintenanceTimerManagerImpl$maintenanceTimerReducer$2", f = "MaintenanceTimerManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class slu extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ tlu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slu(tlu tluVar, v1b<? super slu> v1bVar) {
        super(2, v1bVar);
        this.b = tluVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        slu sluVar = new slu(this.b, v1bVar);
        sluVar.a = ((Boolean) obj).booleanValue();
        return sluVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((slu) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.f.k(null, Boolean.valueOf(z));
        return Unit.a;
    }
}
