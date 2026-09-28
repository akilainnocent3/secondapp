package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.worldcuptournament.WorldCupTournamentPageGroup;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.config.domain.usecase.WorldCupTournamentConfigUseCase", f = "WorldCupTournamentConfigUseCase.kt", l = {47}, m = "getGroups", v = 2)
public final class q6k0 extends x1b {
    public BOConfigParam a;
    public WorldCupTournamentPageGroup[] b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s6k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6k0(s6k0 s6k0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = s6k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
