package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {174}, m = "tryApproach")
public final class s4a0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ t4a0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4a0(t4a0 t4a0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = t4a0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.d(null, 0.0f, 0.0f, null, this);
    }
}
