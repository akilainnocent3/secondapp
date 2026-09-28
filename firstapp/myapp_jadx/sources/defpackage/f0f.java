package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingAnimationHandlerImpl$init$2", f = "DoubleOrNothingAnimationHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f0f extends tje0 implements Function2<j0f, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ g0f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0f(g0f g0fVar, v1b<? super f0f> v1bVar) {
        super(2, v1bVar);
        this.b = g0fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f0f f0fVar = new f0f(this.b, v1bVar);
        f0fVar.a = obj;
        return f0fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(j0f j0fVar, v1b<? super Unit> v1bVar) {
        return ((f0f) create(j0fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        j0f j0fVar = (j0f) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, j0fVar));
        return Unit.a;
    }
}
