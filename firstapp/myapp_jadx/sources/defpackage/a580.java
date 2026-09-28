package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {520, 2169}, m = "waitForCompositionAfterTargetStateChange")
public final class a580 extends x1b {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u480<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a580(u480 u480Var, x1b x1bVar) {
        super(x1bVar);
        this.c = u480Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        ij0 ij0Var = u480.r;
        return this.c.w0(this);
    }
}
