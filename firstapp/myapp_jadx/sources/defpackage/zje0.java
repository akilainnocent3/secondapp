package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {890}, m = "withTimeout")
public final class zje0<T> extends x1b {
    public jvd0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cke0.a<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zje0(cke0.a aVar, pz1 pz1Var) {
        super(pz1Var);
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.E0(0L, null, this);
    }
}
