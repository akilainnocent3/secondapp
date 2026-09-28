package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {222, 224}, m = "dispatchPostFling-RZ2iAVY")
public final class hlx extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ glx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlx(glx glxVar, x1b x1bVar) {
        super(x1bVar);
        this.b = glxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0L, 0L, this);
    }
}
