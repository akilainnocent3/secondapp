package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingFlowHandlerImpl$init$2", f = "DoubleOrNothingFlowHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n1f extends tje0 implements Function2<y5f, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q1f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1f(q1f q1fVar, v1b<? super n1f> v1bVar) {
        super(2, v1bVar);
        this.b = q1fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n1f n1fVar = new n1f(this.b, v1bVar);
        n1fVar.a = obj;
        return n1fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(y5f y5fVar, v1b<? super Unit> v1bVar) {
        return ((n1f) create(y5fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5f y5fVar = (y5f) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.p;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, y5fVar));
        return Unit.a;
    }
}
