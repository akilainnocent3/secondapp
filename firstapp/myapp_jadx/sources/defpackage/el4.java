package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.domain.manager.BonusCupGameManager", f = "BonusCupGameManager.kt", l = {80, 83}, m = "setCupHeldDirection", v = 1)
public final class el4 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ zk4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el4(zk4 zk4Var, x1b x1bVar) {
        super(x1bVar);
        this.b = zk4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(null, this);
    }
}
