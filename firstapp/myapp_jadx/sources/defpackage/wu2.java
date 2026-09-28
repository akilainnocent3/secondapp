package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl", f = "BetItemImpl.kt", l = {537}, m = "restoreSelectionsFromStore", v = 2)
public final class wu2 extends x1b {
    public pu2 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pu2 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu2(pu2 pu2Var, x1b x1bVar) {
        super(x1bVar);
        this.c = pu2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c2(this);
    }
}
