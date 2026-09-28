package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646}, m = "currentPagingState")
public final class jnz extends x1b {
    public enz a;
    public onz.a b;
    public tuw c;
    public /* synthetic */ Object d;
    public final /* synthetic */ enz<Object, Object> e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnz(enz enzVar, x1b x1bVar) {
        super(x1bVar);
        this.e = enzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(this);
    }
}
