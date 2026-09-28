package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$onTeamSelected$1", f = "WorldCupTournamentViewModel.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class h7k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f7k0 b;
    public final /* synthetic */ WorldCupTeam c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7k0(f7k0 f7k0Var, WorldCupTeam worldCupTeam, v1b<? super h7k0> v1bVar) {
        super(2, v1bVar);
        this.b = f7k0Var;
        this.c = worldCupTeam;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h7k0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h7k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        WorldCupTeam worldCupTeam = this.c;
        f7k0 f7k0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            d4k0 d4k0Var = f7k0Var.d;
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
            f7k0Var.v.a.a(new dgg0(brg.TOURNAMENT_PAGE), k00.d);
        } else {
            f7k0Var.v.a.a(new cgg0(brg.TOURNAMENT_PAGE), k00.d);
        }
        return Unit.a;
    }
}
