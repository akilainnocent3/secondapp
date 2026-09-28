package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingFlowHandlerImpl$init$3", f = "DoubleOrNothingFlowHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o1f extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ q1f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1f(q1f q1fVar, v1b<? super o1f> v1bVar) {
        super(2, v1bVar);
        this.a = q1fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o1f(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((o1f) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.k((d2f) CollectionsKt.k0(d2f.c, lx30.INSTANCE));
        return Unit.a;
    }
}
