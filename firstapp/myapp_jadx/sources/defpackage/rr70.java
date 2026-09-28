package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {800}, m = "doFlingAnimation-QWom1Mo")
public final class rr70 extends x1b {
    public cq40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ wr70 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr70(wr70 wr70Var, x1b x1bVar) {
        super(x1bVar);
        this.c = wr70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
