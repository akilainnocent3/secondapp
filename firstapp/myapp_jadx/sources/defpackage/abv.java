package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.matchmaking.MatchmakingUseCase", f = "MatchmakingUseCase.kt", l = {59, 61, 69}, m = "connect", v = 1)
public final class abv extends x1b {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zav d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abv(zav zavVar, x1b x1bVar) {
        super(x1bVar);
        this.d = zavVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
