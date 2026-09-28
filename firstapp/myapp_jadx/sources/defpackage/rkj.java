package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.game.GameLogicManager", f = "GameLogicManager.kt", l = {52, 58, 59, 61}, m = "initialiseGame", v = 1)
public final class rkj extends x1b {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wkj c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkj(wkj wkjVar, x1b x1bVar) {
        super(x1bVar);
        this.c = wkjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, this);
    }
}
