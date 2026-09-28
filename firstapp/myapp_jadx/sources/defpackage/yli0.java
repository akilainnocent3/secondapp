package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyViewModel$onEntranceClicked$1", f = "VirtualLobbyViewModel.kt", l = {534}, m = "invokeSuspend", v = 2)
public final class yli0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hmi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yli0(v1b v1bVar, hmi0 hmi0Var) {
        super(2, v1bVar);
        this.b = hmi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yli0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yli0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<lli0> ku90Var = this.b.z;
            lli0.j jVar = lli0.j.a;
            this.a = 1;
            if (ku90Var.a.emit(jVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
