package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.domain.betitem.BetItemImpl", f = "BetItemImpl.kt", l = {503}, m = "updateSelectionToCache", v = 2)
public final class dv2 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ pu2 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv2(pu2 pu2Var, x1b x1bVar) {
        super(x1bVar);
        this.b = pu2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k2(null, this);
    }
}
