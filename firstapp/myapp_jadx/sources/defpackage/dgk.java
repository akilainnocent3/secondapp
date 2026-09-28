package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.GetUnreadUseCase", f = "GetUnreadUseCase.kt", l = {70, 73, 74, 75}, m = "checkAnyUnread", v = 2)
public final class dgk extends x1b {
    public jgk a;
    public long b;
    public long c;
    public /* synthetic */ Object d;
    public final /* synthetic */ jgk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgk(jgk jgkVar, x1b x1bVar) {
        super(x1bVar);
        this.e = jgkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
