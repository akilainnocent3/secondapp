package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.sim.SimGiftHandlerImpl$init$1", f = "SimGiftHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ni90 extends tje0 implements Function2<tm90, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ mi90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni90(mi90 mi90Var, v1b<? super ni90> v1bVar) {
        super(2, v1bVar);
        this.b = mi90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ni90 ni90Var = new ni90(this.b, v1bVar);
        ni90Var.a = obj;
        return ni90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tm90 tm90Var, v1b<? super Unit> v1bVar) {
        return ((ni90) create(tm90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        tm90 tm90Var = (tm90) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mi90 mi90Var = this.b;
        wwd0 wwd0Var = mi90Var.h;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(tm90Var.k)));
        wwd0 wwd0Var2 = mi90Var.g;
        do {
            value2 = wwd0Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!wwd0Var2.g(value2, Boolean.valueOf(tm90Var.j)));
        return Unit.a;
    }
}
