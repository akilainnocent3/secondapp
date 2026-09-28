package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingMarketLayoutHandlerImpl$init$5", f = "InstantRacingMarketLayoutHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gyn extends tje0 implements Function2<qcn<? extends yyn>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyn(hyn hynVar, v1b<? super gyn> v1bVar) {
        super(2, v1bVar);
        this.b = hynVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gyn gynVar = new gyn(this.b, v1bVar);
        gynVar.a = obj;
        return gynVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qcn<? extends yyn> qcnVar, v1b<? super Unit> v1bVar) {
        return ((gyn) create(qcnVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        qcn qcnVar = (qcn) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.b;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, qcnVar));
        return Unit.a;
    }
}
