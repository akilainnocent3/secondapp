package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "getStateAsEvents")
public final class nuh extends x1b {
    public puh a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ puh<Object> d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuh(puh puhVar, x1b x1bVar) {
        super(x1bVar);
        this.d = puhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
