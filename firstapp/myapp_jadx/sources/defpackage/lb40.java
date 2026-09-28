package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.repo.RealtimeCMSRepoImpl", f = "RealtimeCMSRepoImpl.kt", l = {288}, m = "createIdMap", v = 2)
public final class lb40 extends x1b {
    public xnu a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rb40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb40(rb40 rb40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = rb40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
