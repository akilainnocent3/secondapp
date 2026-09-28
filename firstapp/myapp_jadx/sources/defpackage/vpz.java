package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {612, 619}, m = "animateScrollToPage")
public final class vpz extends x1b {
    public int a;
    public fkd0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zpz d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpz(zpz zpzVar, v1b<? super vpz> v1bVar) {
        super(v1bVar);
        this.d = zpzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(0, null, this);
    }
}
