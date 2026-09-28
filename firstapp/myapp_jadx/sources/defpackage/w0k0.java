package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.presentation.WorldCupPanelViewModel$loadTeamEvents$1", f = "WorldCupPanelViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
public final class w0k0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public t0k0 a;
    public t0k0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t0k0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0k0(t0k0 t0k0Var, v1b<? super w0k0> v1bVar) {
        super(2, v1bVar);
        this.e = t0k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w0k0 w0k0Var = new w0k0(this.e, v1bVar);
        w0k0Var.d = obj;
        return w0k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w0k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        String id;
        t0k0 t0k0Var;
        t0k0 t0k0Var2;
        y5b y5bVar = y5b.a;
        int i = this.c;
        t0k0 t0k0Var3 = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                bhk bhkVar = t0k0Var3.b;
                WorldCupTournamentConfig worldCupTournamentConfig = t0k0Var3.D;
                if (worldCupTournamentConfig == null) {
                    Intrinsics.n("config");
                    throw null;
                }
                String tournamentId = worldCupTournamentConfig.getTournamentId();
                WorldCupTeam worldCupTeamA1 = t0k0Var3.A1();
                if (worldCupTeamA1 != null && (id = worldCupTeamA1.getId()) != null) {
                    String str = t0k0Var3.z1().a;
                    str.getClass();
                    this.d = null;
                    this.a = t0k0Var3;
                    this.b = t0k0Var3;
                    this.c = 1;
                    obj = bhkVar.a.a(tournamentId, str, id, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                    t0k0Var = t0k0Var3;
                    t0k0Var2 = t0k0Var;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t0k0Var2 = this.b;
            t0k0Var = this.a;
            uj50.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new dtg((Event) it.next()));
            }
            t0k0Var2.H = new ArrayList(arrayList);
            t0k0Var.L1();
            t0k0Var.x1();
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            t0k0Var3.K1(f1k0.a);
        }
        return Unit.a;
    }
}
