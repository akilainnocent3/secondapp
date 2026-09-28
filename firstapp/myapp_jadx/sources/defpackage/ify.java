package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", l = {652}, m = "collect")
public final class ify extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jfy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ify(jfy jfyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = jfyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        this.b.a(null, this);
        return y5b.a;
    }
}
