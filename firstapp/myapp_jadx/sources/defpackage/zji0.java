package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$initMissionContentStatus$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zji0 extends tje0 implements Function2<vji0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gki0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zji0(v1b v1bVar, gki0 gki0Var) {
        super(2, v1bVar);
        this.b = gki0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zji0 zji0Var = new zji0(v1bVar, this.b);
        zji0Var.a = obj;
        return zji0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vji0 vji0Var, v1b<? super Unit> v1bVar) {
        return ((zji0) create(vji0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vji0 vji0Var = (vji0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.k.setValue(vji0Var);
        return Unit.a;
    }
}
