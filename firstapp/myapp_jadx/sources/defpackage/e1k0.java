package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$onTeamSelected$1", f = "WorldCupPanelViewModel.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend", v = 2)
public final class e1k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ t0k0 b;
    public final /* synthetic */ WorldCupTeam c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1k0(t0k0 t0k0Var, WorldCupTeam worldCupTeam, v1b<? super e1k0> v1bVar) {
        super(2, v1bVar);
        this.b = t0k0Var;
        this.c = worldCupTeam;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e1k0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e1k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        WorldCupTeam worldCupTeam = this.c;
        t0k0 t0k0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            d4k0 d4k0Var = t0k0Var.e;
            this.a = 1;
            if (d4k0Var.b(worldCupTeam, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (worldCupTeam != null) {
            t0k0Var.z.a.a(new dgg0(brg.TOURNAMENT_HOME_PANEL), k00.d);
        } else {
            t0k0Var.z.a.a(new cgg0(brg.TOURNAMENT_HOME_PANEL), k00.d);
        }
        return Unit.a;
    }
}
