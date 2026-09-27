package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f157128a;

    public vy() {
        this(0);
    }

    public final synchronized void a() {
        while (!this.f157128a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f157128a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        return this.f157128a;
    }

    public final synchronized boolean d() {
        if (this.f157128a) {
            return false;
        }
        this.f157128a = true;
        notifyAll();
        return true;
    }

    public vy(int i10) {
    }
}
