package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.game.GameLogicManager", f = "GameLogicManager.kt", l = {196, 194}, m = "concludeCurrentRound", v = 1)
public final class qkj extends x1b {
    public wwd0 a;
    public zmd0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wkj d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkj(wkj wkjVar, x1b x1bVar) {
        super(x1bVar);
        this.d = wkjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(this);
    }
}
