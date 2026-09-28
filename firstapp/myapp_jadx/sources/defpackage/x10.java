package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {517}, m = "anchoredDrag")
public final class x10 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c20<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(c20 c20Var, x1b x1bVar) {
        super(x1bVar);
        this.b = c20Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
