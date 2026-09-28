package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
public final class uwg0 extends x1b {
    public t120 a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ twg0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwg0(twg0 twg0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = twg0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.e(null, 0, this);
    }
}
