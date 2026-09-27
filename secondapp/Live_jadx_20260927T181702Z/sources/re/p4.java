package re;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f126328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f126329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.h f126330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y7 f126331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f126332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Object f126333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Looper f126334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f126335h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f126336i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f126337j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f126338k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f126339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f126340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f126341n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void c(p4 p4Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void handleMessage(int i10, @Nullable Object obj) throws s;
    }

    public p4(a aVar, b bVar, y7 y7Var, int i10, eh.h hVar, Looper looper) {
        this.f126329b = aVar;
        this.f126328a = bVar;
        this.f126331d = y7Var;
        this.f126334g = looper;
        this.f126330c = hVar;
        this.f126335h = i10;
    }

    public synchronized boolean a() throws InterruptedException {
        try {
            eh.a.i(this.f126338k);
            eh.a.i(this.f126334g.getThread() != Thread.currentThread());
            while (!this.f126340m) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f126339l;
    }

    public synchronized boolean b(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            eh.a.i(this.f126338k);
            eh.a.i(this.f126334g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f126330c.elapsedRealtime() + j10;
            while (true) {
                z10 = this.f126340m;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f126330c.a();
                wait(j10);
                j10 = jElapsedRealtime - this.f126330c.elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f126339l;
    }

    @qj.a
    public synchronized p4 c() {
        eh.a.i(this.f126338k);
        this.f126341n = true;
        m(false);
        return this;
    }

    public boolean d() {
        return this.f126337j;
    }

    public Looper e() {
        return this.f126334g;
    }

    public int f() {
        return this.f126335h;
    }

    @Nullable
    public Object g() {
        return this.f126333f;
    }

    public long h() {
        return this.f126336i;
    }

    public b i() {
        return this.f126328a;
    }

    public y7 j() {
        return this.f126331d;
    }

    public int k() {
        return this.f126332e;
    }

    public synchronized boolean l() {
        return this.f126341n;
    }

    public synchronized void m(boolean z10) {
        this.f126339l = z10 | this.f126339l;
        this.f126340m = true;
        notifyAll();
    }

    @qj.a
    public p4 n() {
        eh.a.i(!this.f126338k);
        if (this.f126336i == -9223372036854775807L) {
            eh.a.a(this.f126337j);
        }
        this.f126338k = true;
        this.f126329b.c(this);
        return this;
    }

    @qj.a
    public p4 o(boolean z10) {
        eh.a.i(!this.f126338k);
        this.f126337j = z10;
        return this;
    }

    @qj.a
    @Deprecated
    public p4 p(Handler handler) {
        return q(handler.getLooper());
    }

    @qj.a
    public p4 q(Looper looper) {
        eh.a.i(!this.f126338k);
        this.f126334g = looper;
        return this;
    }

    @qj.a
    public p4 r(@Nullable Object obj) {
        eh.a.i(!this.f126338k);
        this.f126333f = obj;
        return this;
    }

    @qj.a
    public p4 s(int i10, long j10) {
        eh.a.i(!this.f126338k);
        eh.a.a(j10 != -9223372036854775807L);
        if (i10 < 0 || (!this.f126331d.w() && i10 >= this.f126331d.v())) {
            throw new s2(this.f126331d, i10, j10);
        }
        this.f126335h = i10;
        this.f126336i = j10;
        return this;
    }

    @qj.a
    public p4 t(long j10) {
        eh.a.i(!this.f126338k);
        this.f126336i = j10;
        return this;
    }

    @qj.a
    public p4 u(int i10) {
        eh.a.i(!this.f126338k);
        this.f126332e = i10;
        return this;
    }
}
