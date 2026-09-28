package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.error.NetworkCallsHandler", f = "NetworkCallsHandler.kt", l = {49, 51}, m = "safeApiCallForResponse", v = 1)
public final class gmx<T> extends x1b {
    public fox a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xlx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmx(xlx xlxVar, x1b x1bVar) {
        super(x1bVar);
        this.c = xlxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, this);
    }
}
