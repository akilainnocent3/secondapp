package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingConfirmDialogHandlerImpl$init$2", f = "InstantRacingConfirmDialogHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ptn extends tje0 implements Function2<ysa, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ qtn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptn(qtn qtnVar, v1b<? super ptn> v1bVar) {
        super(2, v1bVar);
        this.b = qtnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ptn ptnVar = new ptn(this.b, v1bVar);
        ptnVar.a = obj;
        return ptnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ysa ysaVar, v1b<? super Unit> v1bVar) {
        return ((ptn) create(ysaVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ysa ysaVar = (ysa) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ysaVar));
        return Unit.a;
    }
}
