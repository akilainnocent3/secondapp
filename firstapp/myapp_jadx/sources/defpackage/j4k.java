package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.stp.domain.GetClabeUseCase", f = "GetClabeUseCase.kt", l = {13}, m = "invoke-IoAF18A", v = 2)
public final class j4k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ k4k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4k(k4k k4kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = k4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
