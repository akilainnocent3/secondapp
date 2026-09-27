package sv;

import jv.x0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @cs.g
    public final Runnable f135588d;

    public j(@oy.l Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f135588d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f135588d.run();
    }

    @oy.l
    public String toString() {
        return "Task[" + x0.a(this.f135588d) + '@' + x0.b(this.f135588d) + ", " + this.f135586b + ", " + k.d(this.f135587c) + fw.b.f85385l;
    }
}
