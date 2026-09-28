package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646, 284, 290, 667, 688, 326, 709, 730, 354}, m = "doInitialLoad")
public final class knz extends x1b {
    public Object a;
    public Object b;
    public Object c;
    public tuw d;
    public /* synthetic */ Object e;
    public final /* synthetic */ enz<Object, Object> f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knz(enz enzVar, x1b x1bVar) {
        super(x1bVar);
        this.f = enzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(this);
    }
}
