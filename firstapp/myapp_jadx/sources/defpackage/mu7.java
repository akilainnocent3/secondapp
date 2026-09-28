package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.cms.CmsPageMapRepositoryImpl", f = "CmsPageMapRepositoryImpl.kt", l = {21}, m = "getMap", v = 2)
public final class mu7 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ou7 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu7(ou7 ou7Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ou7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
