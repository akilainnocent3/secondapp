package defpackage;

import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.config.data.repository.WorldCupSelectedTeamRepositoryImpl", f = "WorldCupSelectedTeamRepositoryImpl.kt", l = {38, 40}, m = "setSelectedTeam", v = 2)
public final class h4k0 extends x1b {
    public WorldCupTeam a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e4k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4k0(e4k0 e4k0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = e4k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
