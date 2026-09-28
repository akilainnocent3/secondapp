package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSessionDataHandlerImpl", f = "InstantRacingSessionDataHandlerImpl.kt", l = {69, 85, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "getSessionData", v = 2)
public final class n3o extends x1b {
    public String a;
    public d4o b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s3o d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3o(s3o s3oVar, x1b x1bVar) {
        super(x1bVar);
        this.d = s3oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
