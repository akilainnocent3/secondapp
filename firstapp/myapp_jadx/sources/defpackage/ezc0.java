package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltyOddsFilterHandlerImpl$init$5", f = "SportyPenaltyOddsFilterHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ezc0 extends tje0 implements Function2<wyc0, v1b<? super Unit>, Object> {
    public final /* synthetic */ gzc0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezc0(gzc0 gzc0Var, v1b<? super ezc0> v1bVar) {
        super(2, v1bVar);
        this.a = gzc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ezc0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wyc0 wyc0Var, v1b<? super Unit> v1bVar) {
        return ((ezc0) create(wyc0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        Object value2;
        Object obj2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        gzc0 gzc0Var = this.a;
        wwd0 wwd0Var = gzc0Var.b;
        do {
            value = wwd0Var.getValue();
            str = (String) value;
            if (str == null) {
                str = "all";
            }
        } while (!wwd0Var.g(value, str));
        wwd0 wwd0Var2 = gzc0Var.c;
        do {
            value2 = wwd0Var2.getValue();
            obj2 = (ht7) value2;
            if (obj2 == null) {
                obj2 = gzc0Var.a;
            }
        } while (!wwd0Var2.g(value2, obj2));
        return Unit.a;
    }
}
