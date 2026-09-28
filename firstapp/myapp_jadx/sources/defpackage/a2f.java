package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.DoubleOrNothingKickPointSelectingCountdownHandlerImpl$init$3", f = "DoubleOrNothingKickPointSelectingCountdownHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a2f extends tje0 implements Function2<m4f, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c2f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2f(c2f c2fVar, v1b<? super a2f> v1bVar) {
        super(2, v1bVar);
        this.b = c2fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a2f a2fVar = new a2f(this.b, v1bVar);
        a2fVar.a = obj;
        return a2fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m4f m4fVar, v1b<? super Unit> v1bVar) {
        return ((a2f) create(m4fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m4f m4fVar = (m4f) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!Intrinsics.g(m4fVar, m4f.d.a)) {
            this.b.a();
        }
        return Unit.a;
    }
}
