package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsQuickBetHandlerImpl$init$5", f = "SportyLegendsQuickBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class igc0 extends tje0 implements Function2<yc30, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bgc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igc0(v1b v1bVar, bgc0 bgc0Var) {
        super(2, v1bVar);
        this.b = bgc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        igc0 igc0Var = new igc0(v1bVar, this.b);
        igc0Var.a = obj;
        return igc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yc30 yc30Var, v1b<? super Unit> v1bVar) {
        return ((igc0) create(yc30Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        yc30 yc30Var = (yc30) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.g;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, yc30Var));
        return Unit.a;
    }
}
