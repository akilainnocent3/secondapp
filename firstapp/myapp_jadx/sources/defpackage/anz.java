package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {210}, m = "generateNewPagingSource")
public final class anz extends x1b {
    public ymz a;
    public wqz b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ymz<Object, Object> d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anz(ymz ymzVar, x1b x1bVar) {
        super(x1bVar);
        this.d = ymzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
