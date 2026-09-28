package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.config.domain.usecase.WorldCupTournamentConfigUseCase", f = "WorldCupTournamentConfigUseCase.kt", l = {47}, m = "getConfig", v = 2)
public final class p6k0 extends x1b {
    public BOConfigParam a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s6k0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6k0(s6k0 s6k0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = s6k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
