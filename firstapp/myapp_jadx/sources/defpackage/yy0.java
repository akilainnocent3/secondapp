package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.assets.AssetsInfoRepositoryImpl", f = "AssetsInfoRepositoryImpl.kt", l = {107}, m = "suspendRefreshAssetsInfo", v = 2)
public final class yy0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ wy0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(wy0 wy0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = wy0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
