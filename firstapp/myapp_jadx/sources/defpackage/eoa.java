package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eoa {
    public final vs7 a;
    public boolean b;

    public eoa() {
        this(vs7.a);
    }

    public final synchronized void a() {
        boolean z = false;
        while (!this.b) {
            try {
                this.a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j) {
        try {
            if (j <= 0) {
                return this.b;
            }
            long jD = this.a.d();
            long j2 = j + jD;
            if (j2 < jD) {
                a();
            } else {
                boolean z = false;
                while (!this.b && jD < j2) {
                    try {
                        this.a.getClass();
                        wait(j2 - jD);
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                    jD = this.a.d();
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public eoa(vs7 vs7Var) {
        this.a = vs7Var;
    }
}
