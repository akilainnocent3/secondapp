package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyGameStatusHandlerImpl$init$2", f = "VirtualLobbyGameStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yhi0 extends tje0 implements Function2<thi0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zhi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhi0(v1b v1bVar, zhi0 zhi0Var) {
        super(2, v1bVar);
        this.b = zhi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yhi0 yhi0Var = new yhi0(v1bVar, this.b);
        yhi0Var.a = obj;
        return yhi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(thi0 thi0Var, v1b<? super Unit> v1bVar) {
        return ((yhi0) create(thi0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        thi0 thi0Var = (thi0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, thi0Var));
        return Unit.a;
    }
}
