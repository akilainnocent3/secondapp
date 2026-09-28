package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingFlowHandlerImpl$init$5", f = "DoubleOrNothingFlowHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p1f extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ q1f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1f(q1f q1fVar, v1b<? super p1f> v1bVar) {
        super(2, v1bVar);
        this.b = q1fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p1f p1fVar = new p1f(this.b, v1bVar);
        p1fVar.a = ((Boolean) obj).booleanValue();
        return p1fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((p1f) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.l;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(z)));
        return Unit.a;
    }
}
