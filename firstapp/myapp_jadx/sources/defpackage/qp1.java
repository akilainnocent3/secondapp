package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {56}, m = "waitForFirstLayout")
public final class qp1 extends x1b {
    public dq40 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rp1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp1(rp1 rp1Var, x1b x1bVar) {
        super(x1bVar);
        this.c = rp1Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
