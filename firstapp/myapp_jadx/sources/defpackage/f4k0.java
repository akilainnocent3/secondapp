package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.config.data.repository.WorldCupSelectedTeamRepositoryImpl", f = "WorldCupSelectedTeamRepositoryImpl.kt", l = {53, 54}, m = "getSelectedTeam", v = 2)
public final class f4k0 extends x1b {
    public ArrayList a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e4k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4k0(e4k0 e4k0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = e4k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        int i = e4k0.g;
        return this.c.c(this);
    }
}
