package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode", f = "AnchoredDraggable.kt", l = {456, 459}, m = "fling")
public final class o10 extends x1b {
    public aq40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q10<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(q10 q10Var, x1b x1bVar) {
        super(x1bVar);
        this.c = q10Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.B2(0.0f, this);
    }
}
