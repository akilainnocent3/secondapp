package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {114}, m = "emitExit")
public final class ykm extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ zkm b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykm(zkm zkmVar, x1b x1bVar) {
        super(x1bVar);
        this.b = zkmVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.q2(this);
    }
}
