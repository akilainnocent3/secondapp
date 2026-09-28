package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {114}, m = "fling")
public final class o4a0 extends x1b {
    public Function1 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ t4a0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4a0(t4a0 t4a0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = t4a0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, 0.0f, null, this);
    }
}
