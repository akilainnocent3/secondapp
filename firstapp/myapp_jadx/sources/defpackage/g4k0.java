package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.config.data.repository.WorldCupSelectedTeamRepositoryImpl", f = "WorldCupSelectedTeamRepositoryImpl.kt", l = {62}, m = "getTeams", v = 2)
public final class g4k0 extends x1b {
    public BOConfigParam a;
    public WorldCupTeam[] b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e4k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4k0(e4k0 e4k0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = e4k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        int i = e4k0.g;
        return this.d.d(this);
    }
}
