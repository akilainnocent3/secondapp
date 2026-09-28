package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.domain.usecase.GetNonFtdCacheDataUseCase", f = "GetNonFtdCacheDataUseCase.kt", l = {30}, m = "parseOrRecover", v = 2)
public final class v9k extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ x9k b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9k(x9k x9kVar, x1b x1bVar) {
        super(x1bVar);
        this.b = x9kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
