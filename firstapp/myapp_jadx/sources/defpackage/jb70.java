package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOpenBetsCountHandlerImpl$init$2", f = "ScheduledFootballOpenBetsCountHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jb70 extends tje0 implements Function2<t8, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mb70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb70(v1b v1bVar, mb70 mb70Var) {
        super(2, v1bVar);
        this.b = mb70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jb70 jb70Var = new jb70(v1bVar, this.b);
        jb70Var.a = obj;
        return jb70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(t8 t8Var, v1b<? super Unit> v1bVar) {
        return ((jb70) create(t8Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        t8 t8Var = (t8) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = t8Var != null ? t8Var.f : null;
        if (str == null || StringsKt.U(str)) {
            wwd0 wwd0Var = this.b.c;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, nb70.c));
        }
        return Unit.a;
    }
}
