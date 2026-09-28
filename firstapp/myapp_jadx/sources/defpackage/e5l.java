package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GooglePlayIntegrityVerifier", f = "GooglePlayIntegrityVerifier.kt", l = {131, 133, 139}, m = "handleSuccessfulIntegrityToken", v = 2)
public final class e5l extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ j5l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5l(j5l j5lVar, x1b x1bVar) {
        super(x1bVar);
        this.b = j5lVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, this);
    }
}
