package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingActionRequestHandlerImpl$init$1", f = "WinningPopupDoubleOrNothingActionRequestHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ybj0 extends tje0 implements Function2<j4f, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ccj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybj0(ccj0 ccj0Var, v1b<? super ybj0> v1bVar) {
        super(2, v1bVar);
        this.b = ccj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ybj0 ybj0Var = new ybj0(this.b, v1bVar);
        ybj0Var.a = obj;
        return ybj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(j4f j4fVar, v1b<? super Unit> v1bVar) {
        return ((ybj0) create(j4fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        j4f j4fVar = (j4f) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ccj0 ccj0Var = this.b;
        ccj0Var.g = j4fVar;
        wwd0 wwd0Var = ccj0Var.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cdj0.a));
        wwd0 wwd0Var2 = ccj0Var.e;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, cdj0.a));
        return Unit.a;
    }
}
