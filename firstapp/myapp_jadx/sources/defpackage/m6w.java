package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {244, 295}, m = "dispatchMouseWheelScroll")
public final class m6w extends x1b {
    public wr70 a;
    public aq40 b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ k6w e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6w(k6w k6wVar, x1b x1bVar) {
        super(x1bVar);
        this.e = k6wVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, 0.0f, 0.0f, this);
    }
}
