package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {199}, m = "dispatchPreFling-QWom1Mo")
public final class ilx extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ glx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilx(glx glxVar, x1b x1bVar) {
        super(x1bVar);
        this.b = glxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0L, this);
    }
}
