package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupHandlerImpl$initWinningPopupHandler$3", f = "WinningPopupHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vej0 extends tje0 implements Function2<vbj0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ afj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vej0(v1b v1bVar, afj0 afj0Var) {
        super(2, v1bVar);
        this.b = afj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vej0 vej0Var = new vej0(v1bVar, this.b);
        vej0Var.a = obj;
        return vej0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vbj0 vbj0Var, v1b<? super Unit> v1bVar) {
        return ((vej0) create(vbj0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        vbj0 vbj0Var = (vbj0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = vbj0Var instanceof vbj0.a;
        v7k v7kVar = this.b.a;
        if (z) {
            wwd0 wwd0Var = (wwd0) v7kVar.b;
            do {
                value2 = wwd0Var.getValue();
                ((Boolean) value2).getClass();
            } while (!wwd0Var.g(value2, Boolean.FALSE));
        } else {
            wwd0 wwd0Var2 = (wwd0) v7kVar.b;
            do {
                value = wwd0Var2.getValue();
                ((Boolean) value).getClass();
            } while (!wwd0Var2.g(value, Boolean.TRUE));
        }
        return Unit.a;
    }
}
