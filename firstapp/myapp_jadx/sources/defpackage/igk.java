package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.GetUnreadUseCase", f = "GetUnreadUseCase.kt", l = {81, 82}, m = "getUnreadMessages", v = 2)
public final class igk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jgk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igk(jgk jgkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = jgkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
