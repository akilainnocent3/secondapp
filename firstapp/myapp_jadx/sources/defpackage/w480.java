package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {354, 357}, m = "runAnimations")
public final class w480 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u480<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w480(u480 u480Var, x1b x1bVar) {
        super(x1bVar);
        this.b = u480Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        ij0 ij0Var = u480.r;
        return this.b.r0(this);
    }
}
