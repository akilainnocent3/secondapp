package eh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f80999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81000b;

    public k() {
        this(h.f80967a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f81000b) {
            wait();
        }
    }

    public synchronized boolean b(long j10) throws InterruptedException {
        try {
            if (j10 <= 0) {
                return this.f81000b;
            }
            long jElapsedRealtime = this.f80999a.elapsedRealtime();
            long j11 = j10 + jElapsedRealtime;
            if (j11 < jElapsedRealtime) {
                a();
            } else {
                while (!this.f81000b && jElapsedRealtime < j11) {
                    wait(j11 - jElapsedRealtime);
                    jElapsedRealtime = this.f80999a.elapsedRealtime();
                }
            }
            return this.f81000b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        boolean z10 = false;
        while (!this.f81000b) {
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

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f81000b;
        this.f81000b = false;
        return z10;
    }

    public synchronized boolean e() {
        return this.f81000b;
    }

    public synchronized boolean f() {
        if (this.f81000b) {
            return false;
        }
        this.f81000b = true;
        notifyAll();
        return true;
    }

    public k(h hVar) {
        this.f80999a = hVar;
    }
}
