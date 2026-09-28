package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$setWorldCupTeam$1", f = "CodeHubViewmodel.kt", l = {470}, m = "invokeSuspend", v = 2)
public final class vz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mz7 b;
    public final /* synthetic */ WorldCupTeam c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz7(mz7 mz7Var, WorldCupTeam worldCupTeam, v1b<? super vz7> v1bVar) {
        super(2, v1bVar);
        this.b = mz7Var;
        this.c = worldCupTeam;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vz7(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            d4k0 d4k0Var = this.b.B;
            this.a = 1;
            if (d4k0Var.b(this.c, this) == y5bVar) {
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
