package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingKickPointSelectingCountdownHandlerImpl$init$2", f = "DoubleOrNothingKickPointSelectingCountdownHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z1f extends tje0 implements Function2<q5f, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c2f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1f(c2f c2fVar, v1b<? super z1f> v1bVar) {
        super(2, v1bVar);
        this.b = c2fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z1f z1fVar = new z1f(this.b, v1bVar);
        z1fVar.a = obj;
        return z1fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(q5f q5fVar, v1b<? super Unit> v1bVar) {
        return ((z1f) create(q5fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        q5f q5fVar = (q5f) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, q5fVar));
        return Unit.a;
    }
}
