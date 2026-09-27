package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Throwable f100804b;

    public g1(@oy.l Throwable th2, @oy.l n0 n0Var, @oy.l or.j jVar) {
        super("Coroutine dispatcher " + n0Var + " threw an exception, context = " + jVar, th2);
        this.f100804b = th2;
    }

    @Override // java.lang.Throwable
    @oy.l
    public Throwable getCause() {
        return this.f100804b;
    }
}
