package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {646, 658, 125, 669, 128, 680, 692, 125, 703, 128, 714, 726, 125, 737, 128, 748}, m = "emit")
public final class mnz extends x1b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public enz v;
    public /* synthetic */ Object w;
    public final /* synthetic */ lnz.c.a<Object> y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnz(lnz.c.a<Object> aVar, v1b<? super mnz> v1bVar) {
        super(v1bVar);
        this.y = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(this);
    }
}
