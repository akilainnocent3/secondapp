package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
public final class vwg0 extends x1b {
    public t120 a;
    public String b;
    public String[] c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ twg0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwg0(twg0 twg0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = twg0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.f(null, 0, this);
    }
}
