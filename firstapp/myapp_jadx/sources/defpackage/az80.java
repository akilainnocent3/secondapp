package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.event.comment.ShareBetViewEntity", f = "ShareBetViewEntity.kt", l = {341}, m = "bindUserInfo", v = 2)
public final class az80 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ zy80 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az80(zy80 zy80Var, x1b x1bVar) {
        super(x1bVar);
        this.b = zy80Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
