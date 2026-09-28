package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {90, 100}, m = "initialiseFromReadyToClaim", v = 1)
public final class bl4 extends x1b {
    public oh4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zk4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl4(zk4 zk4Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zk4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e(null, this);
    }
}
