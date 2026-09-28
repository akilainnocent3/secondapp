package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$observeTeamChanges$2", f = "WorldCupPanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y0k0 extends tje0 implements Function2<WorldCupTeam, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ t0k0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0k0(t0k0 t0k0Var, v1b<? super y0k0> v1bVar) {
        super(2, v1bVar);
        this.b = t0k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y0k0 y0k0Var = new y0k0(this.b, v1bVar);
        y0k0Var.a = obj;
        return y0k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WorldCupTeam worldCupTeam, v1b<? super Unit> v1bVar) {
        return ((y0k0) create(worldCupTeam, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WorldCupTeam worldCupTeam = (WorldCupTeam) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        t0k0 t0k0Var = this.b;
        t0k0Var.I = null;
        if (worldCupTeam != null) {
            t0k0Var.F = l0k0.TEAM;
            t0k0Var.J1();
            t0k0Var.F1();
        } else {
            t0k0Var.H = null;
            if (t0k0Var.G == null) {
                t0k0Var.F = l0k0.LIVE;
                t0k0Var.J1();
                t0k0Var.D1(true);
            } else {
                l0k0 l0k0Var = t0k0Var.F;
                if (l0k0Var == l0k0.TEAM) {
                    l0k0Var = !t0k0Var.y1().isEmpty() ? l0k0.LIVE : l0k0.PRE_MATCH;
                    t0k0Var.F = l0k0Var;
                }
                if (l0k0Var == l0k0.SPECIALS) {
                    t0k0Var.J1();
                    t0k0Var.E1();
                } else {
                    t0k0Var.L1();
                    Unit unit = Unit.a;
                }
            }
        }
        return Unit.a;
    }
}
