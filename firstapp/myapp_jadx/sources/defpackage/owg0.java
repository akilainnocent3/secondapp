package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {445, 453}, m = "checkInvalidatedTables")
public final class owg0 extends x1b {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ twg0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owg0(twg0 twg0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = twg0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
