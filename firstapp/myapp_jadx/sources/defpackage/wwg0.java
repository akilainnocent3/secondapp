package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {306}, m = "syncTriggers$room_runtime")
public final class wwg0 extends x1b {
    public ys7 a;
    public hfy b;
    public hfy.b c;
    public /* synthetic */ Object d;
    public final /* synthetic */ twg0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwg0(twg0 twg0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = twg0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(this);
    }
}
