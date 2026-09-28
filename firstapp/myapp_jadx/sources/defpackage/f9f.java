package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", l = {575}, m = "processDragStop")
public final class f9f extends x1b {
    public v7f.d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h9f c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9f(h9f h9fVar, x1b x1bVar) {
        super(x1bVar);
        this.c = h9fVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.y2(null, this);
    }
}
