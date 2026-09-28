package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 151}, m = "animateToZero")
public final class jjh0 extends x1b {
    public haj a;
    public Function0 b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kjh0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjh0(kjh0 kjh0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = kjh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
