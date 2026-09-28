package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {565, 568}, m = "processDragStart")
public final class e9f extends x1b {
    public v7f.c a;
    public i9f.b b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h9f d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9f(h9f h9fVar, x1b x1bVar) {
        super(x1bVar);
        this.d = h9fVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.x2(null, this);
    }
}
