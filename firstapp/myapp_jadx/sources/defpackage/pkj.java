package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.game.GameLogicManager", f = "GameLogicManager.kt", l = {216, 220}, m = "collapsePlayedRows", v = 1)
public final class pkj extends x1b {
    public List a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wkj e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkj(wkj wkjVar, x1b x1bVar) {
        super(x1bVar);
        this.e = wkjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.l(this);
    }
}
