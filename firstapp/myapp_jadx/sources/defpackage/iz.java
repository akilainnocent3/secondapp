package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl", f = "AnTestRepositoryImpl.kt", l = {264}, m = "addVisitor", v = 2)
public final class iz extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(tz tzVar, x1b x1bVar) {
        super(x1bVar);
        this.b = tzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.n(false, 0, 0, this);
    }
}
