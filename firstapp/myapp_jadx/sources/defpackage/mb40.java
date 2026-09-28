package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.cms.repo.RealtimeCMSRepoImpl", f = "RealtimeCMSRepoImpl.kt", l = {176, 177}, m = "createStringMap", v = 2)
public final class mb40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ rb40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb40(rb40 rb40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = rb40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, this);
    }
}
