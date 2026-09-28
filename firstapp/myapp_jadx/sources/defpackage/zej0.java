package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$8", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zej0 extends tje0 implements Function2<k4f.c, v1b<? super Unit>, Object> {
    public final /* synthetic */ afj0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zej0(v1b v1bVar, afj0 afj0Var) {
        super(2, v1bVar);
        this.a = afj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zej0(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k4f.c cVar, v1b<? super Unit> v1bVar) {
        return ((zej0) create(cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        afj0 afj0Var = this.a;
        x2f x2fVar = afj0Var.g;
        x2fVar.c();
        wwd0 wwd0Var = afj0Var.l;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, Boolean.valueOf(x2fVar.b())));
        return Unit.a;
    }
}
