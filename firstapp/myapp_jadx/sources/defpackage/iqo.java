package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.topappbar.InstantWinTopAppBarUserStatusHandlerImpl$init$3", f = "InstantWinTopAppBarUserStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iqo extends tje0 implements gaj<myh<? super fqo.c>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ kqo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqo(kqo kqoVar, v1b<? super iqo> v1bVar) {
        super(3, v1bVar);
        this.a = kqoVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super fqo.c> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new iqo(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, fqo.c.a.a));
        return Unit.a;
    }
}
