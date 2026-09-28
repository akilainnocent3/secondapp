package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingBetslipHandlerImpl$init$3", f = "InstantRacingBetslipHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zsn extends tje0 implements Function2<cw3, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ atn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsn(atn atnVar, v1b<? super zsn> v1bVar) {
        super(2, v1bVar);
        this.b = atnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zsn zsnVar = new zsn(this.b, v1bVar);
        zsnVar.a = obj;
        return zsnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cw3 cw3Var, v1b<? super Unit> v1bVar) {
        return ((zsn) create(cw3Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        cw3 cw3Var = (cw3) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cw3Var));
        return Unit.a;
    }
}
