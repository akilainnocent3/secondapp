package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.winning.data.SoundFileDownloaderImpl", f = "SoundFileDownloaderImpl.kt", l = {21}, m = "download-0E7RQCE", v = 2)
public final class jpa0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lpa0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpa0(lpa0 lpa0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = lpa0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
