package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", f = "PlatformSelectionBehaviors.android.kt", l = {351, 361}, m = "classifyText-M8tDOmk")
public final class yj10 extends x1b {
    public CharSequence a;
    public Object b;
    public tuw c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ gk10 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj10(gk10 gk10Var, x1b x1bVar) {
        super(x1bVar);
        this.f = gk10Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.d(null, 0L, null, this);
    }
}
