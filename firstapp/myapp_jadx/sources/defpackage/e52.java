package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.chat.data.repository.BaseRepository", f = "BaseRepository.kt", l = {112}, m = "safeApiCall", v = 1)
public final class e52<T> extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ j52 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e52(j52 j52Var, x1b x1bVar) {
        super(x1bVar);
        this.b = j52Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
