package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {106}, m = "emitEnter")
public final class xkm extends x1b {
    public vkm a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zkm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkm(zkm zkmVar, x1b x1bVar) {
        super(x1bVar);
        this.c = zkmVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.p2(this);
    }
}
