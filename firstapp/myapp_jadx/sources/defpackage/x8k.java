package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.domain.GetMinMaxTimeLimitsUseCase", f = "GetMinMaxTimeLimitsUseCase.kt", l = {12}, m = "invoke", v = 2)
public final class x8k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ w8k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8k(w8k w8kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = w8kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
