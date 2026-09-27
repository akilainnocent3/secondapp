package x4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f144403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144404b;

    public o() {
        this(l.f144348a);
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f144404b) {
            this.f144403a.a();
            wait();
        }
    }

    public synchronized boolean b(long j10) throws InterruptedException {
        try {
            if (j10 <= 0) {
                return this.f144404b;
            }
            long jElapsedRealtime = this.f144403a.elapsedRealtime();
            long j11 = j10 + jElapsedRealtime;
            if (j11 < jElapsedRealtime) {
                a();
            } else {
                while (!this.f144404b && jElapsedRealtime < j11) {
                    this.f144403a.a();
                    wait(j11 - jElapsedRealtime);
                    jElapsedRealtime = this.f144403a.elapsedRealtime();
                }
            }
            return this.f144404b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c() {
        boolean z10 = false;
        while (!this.f144404b) {
            try {
                this.f144403a.a();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d(long j10) {
        try {
            if (j10 <= 0) {
                return this.f144404b;
            }
            long jElapsedRealtime = this.f144403a.elapsedRealtime();
            long j11 = j10 + jElapsedRealtime;
            if (j11 < jElapsedRealtime) {
                c();
            } else {
                boolean z10 = false;
                while (!this.f144404b && jElapsedRealtime < j11) {
                    try {
                        this.f144403a.a();
                        wait(j11 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                    jElapsedRealtime = this.f144403a.elapsedRealtime();
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f144404b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean e() {
        boolean z10;
        z10 = this.f144404b;
        this.f144404b = false;
        return z10;
    }

    public synchronized boolean f() {
        return this.f144404b;
    }

    public synchronized boolean g() {
        if (this.f144404b) {
            return false;
        }
        this.f144404b = true;
        notifyAll();
        return true;
    }

    public o(l lVar) {
        this.f144403a = lVar;
    }
}
