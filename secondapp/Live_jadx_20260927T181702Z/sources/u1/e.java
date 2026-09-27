package u1;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f137534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f137535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f137536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f137537d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f137534a) {
                    return;
                }
                this.f137534a = true;
                this.f137537d = true;
                a aVar = this.f137535b;
                Object obj = this.f137536c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f137537d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f137537d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Nullable
    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f137536c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f137536c = cancellationSignal;
                    if (this.f137534a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f137536c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public boolean c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f137534a;
        }
        return z10;
    }

    public void d(@Nullable a aVar) {
        synchronized (this) {
            try {
                f();
                if (this.f137535b == aVar) {
                    return;
                }
                this.f137535b = aVar;
                if (this.f137534a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        if (c()) {
            throw new y();
        }
    }

    public final void f() {
        while (this.f137537d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
