package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.game.helper.GameLogicHelper", f = "GameLogicHelper.kt", l = {150, 157}, m = "concludeRound", v = 1)
public final class mkj extends x1b {
    public int a;
    public List b;
    public List c;
    public /* synthetic */ Object d;
    public final /* synthetic */ okj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkj(okj okjVar, x1b x1bVar) {
        super(x1bVar);
        this.e = okjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(0, this, null);
    }
}
