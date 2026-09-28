package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {372}, m = "refreshInvalidation$room_runtime")
public final class swg0 extends x1b {
    public Function0 a;
    public int[] b;
    public /* synthetic */ Object c;
    public final /* synthetic */ twg0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swg0(twg0 twg0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = twg0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, null, this);
    }
}
