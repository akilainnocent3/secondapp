package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.createticketerror.CreateTicketErrorHandlerImpl$initCreateTicketErrorHandler$2", f = "CreateTicketErrorHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wxb extends tje0 implements Function2<zs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ xxb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxb(xxb xxbVar, v1b<? super wxb> v1bVar) {
        super(2, v1bVar);
        this.b = xxbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wxb wxbVar = new wxb(this.b, v1bVar);
        wxbVar.a = obj;
        return wxbVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zs zsVar, v1b<? super Unit> v1bVar) {
        return ((wxb) create(zsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        zs zsVar = (zs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.a;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, zsVar));
        return Unit.a;
    }
}
