package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.common.network.crashRetrofit.BaseRepository", f = "BaseRepository.kt", l = {109}, m = "safeApiCall", v = 1)
public final class f52<T> extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ k52 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f52(k52 k52Var, x1b x1bVar) {
        super(x1bVar);
        this.b = k52Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
