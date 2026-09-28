package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.workers.ConstraintTrackingWorkerKt$awaitConstraintsNotMet$2", f = "ConstraintTrackingWorker.kt", l = {}, m = "invokeSuspend")
public final class exa extends tje0 implements Function2<rxa, v1b<? super Unit>, Object> {
    public final /* synthetic */ owj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exa(owj0 owj0Var, v1b<? super exa> v1bVar) {
        super(2, v1bVar);
        this.a = owj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new exa(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(rxa rxaVar, v1b<? super Unit> v1bVar) {
        return ((exa) create(rxaVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = fxa.a;
        jgt.e().a(str, "Constraints changed for " + this.a);
        return Unit.a;
    }
}
