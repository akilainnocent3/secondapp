package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 130, 148}, m = "execute")
public final class r6g extends x1b {
    public nan a;
    public Object b;
    public rpg c;
    public dq40 d;
    public dq40 e;
    public dq40 f;
    public dq40 i;
    public /* synthetic */ Object v;
    public final /* synthetic */ p6g w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6g(p6g p6gVar, x1b x1bVar) {
        super(x1bVar);
        this.w = p6gVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.c(null, null, null, null, this);
    }
}
