package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.VirtualLobbyRenamingAnTestHelper$init$2", f = "VirtualLobbyRenamingAnTestHelper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nki0 extends tje0 implements Function2<qki0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jki0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nki0(v1b v1bVar, jki0 jki0Var) {
        super(2, v1bVar);
        this.b = jki0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nki0 nki0Var = new nki0(v1bVar, this.b);
        nki0Var.a = obj;
        return nki0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qki0 qki0Var, v1b<? super Unit> v1bVar) {
        return ((nki0) create(qki0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        qki0 qki0Var = (qki0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, qki0Var));
        return Unit.a;
    }
}
