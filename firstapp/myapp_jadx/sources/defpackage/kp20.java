package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {540}, m = "tryAwaitRelease")
public final class kp20 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lp20 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp20(lp20 lp20Var, x1b x1bVar) {
        super(x1bVar);
        this.b = lp20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.Y(this);
    }
}
