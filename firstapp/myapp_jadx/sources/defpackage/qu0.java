package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.data.AppendStateStrategyKt$appendState$1", f = "AppendStateStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qu0 extends tje0 implements Function2<lk50<Object>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wwd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu0(wwd0 wwd0Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = wwd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qu0 qu0Var = new qu0(this.b, v1bVar);
        qu0Var.a = obj;
        return qu0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<Object> lk50Var, v1b<? super Unit> v1bVar) {
        return ((qu0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        su0.b(this.b, lk50Var);
        return Unit.a;
    }
}
