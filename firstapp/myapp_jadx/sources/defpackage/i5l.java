package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GooglePlayIntegrityVerifier", f = "GooglePlayIntegrityVerifier.kt", l = {84, 87, 92, HttpStatusCodesKt.HTTP_PROCESSING, 106}, m = "verify", v = 2)
public final class i5l extends x1b {
    public sxo a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j5l c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5l(j5l j5lVar, x1b x1bVar) {
        super(x1bVar);
        this.c = j5lVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
