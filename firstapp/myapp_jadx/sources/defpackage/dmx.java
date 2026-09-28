package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.data.repository.error.NetworkCallsHandler", f = "NetworkCallsHandler.kt", l = {28, 32}, m = "safeApiCall", v = 1)
public final class dmx<T> extends x1b {
    public fox a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ xlx d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmx(xlx xlxVar, x1b x1bVar) {
        super(x1bVar);
        this.d = xlxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
