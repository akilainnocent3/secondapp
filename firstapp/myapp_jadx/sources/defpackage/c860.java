package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBBallPoolMapper$waitForAllBallsSend$2", f = "SBBallPoolMapper.kt", l = {}, m = "invokeSuspend", v = 1)
public final class c860 extends tje0 implements Function2<qcn<? extends Integer>, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c860 c860Var = new c860(2, v1bVar);
        c860Var.a = obj;
        return c860Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qcn<? extends Integer> qcnVar, v1b<? super Boolean> v1bVar) {
        return ((c860) create(qcnVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = (qcn) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf(qcnVar.size() == 60);
    }
}
