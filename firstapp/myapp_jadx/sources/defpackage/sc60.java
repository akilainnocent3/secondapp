package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBErrorMapper", f = "SBErrorMapper.kt", l = {53, WebSocketProtocol.B0_FLAG_RSV1, 73, 91}, m = "getErrorDialog$suspendImpl", v = 1)
public final class sc60 extends x1b {
    public Throwable a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uua0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc60(uua0 uua0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = uua0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return tc60.D0(this.c, null, null, this);
    }
}
