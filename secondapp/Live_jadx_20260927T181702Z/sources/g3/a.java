package g3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import f0.k3;
import java.util.ArrayList;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f85955g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f85956h = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f85960d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3<b, Long> f85957a = new k3<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f85958b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0840a f85959c = new C0840a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85961e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85962f = false;

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0840a {
        public C0840a() {
        }

        public void a() {
            a.this.f85961e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f85961e);
            if (a.this.f85958b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        boolean a(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0840a f85964a;

        public c(C0840a c0840a) {
            this.f85964a = c0840a;
        }

        public abstract void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f85965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f85966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f85967d;

        /* JADX INFO: renamed from: g3.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0841a implements Runnable {
            public RunnableC0841a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f85967d = SystemClock.uptimeMillis();
                d.this.f85964a.a();
            }
        }

        public d(C0840a c0840a) {
            super(c0840a);
            this.f85967d = -1L;
            this.f85965b = new RunnableC0841a();
            this.f85966c = new Handler(Looper.myLooper());
        }

        @Override // g3.a.c
        public void a() {
            this.f85966c.postDelayed(this.f85965b, Math.max(10 - (SystemClock.uptimeMillis() - this.f85967d), 0L));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(16)
    public static class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Choreographer f85969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f85970c;

        /* JADX INFO: renamed from: g3.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class ChoreographerFrameCallbackC0842a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0842a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                e.this.f85964a.a();
            }
        }

        public e(C0840a c0840a) {
            super(c0840a);
            this.f85969b = Choreographer.getInstance();
            this.f85970c = new ChoreographerFrameCallbackC0842a();
        }

        @Override // g3.a.c
        public void a() {
            this.f85969b.postFrameCallback(this.f85970c);
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f85956h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f85961e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f85956h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j10) {
        if (this.f85958b.size() == 0) {
            f().a();
        }
        if (!this.f85958b.contains(bVar)) {
            this.f85958b.add(bVar);
        }
        if (j10 > 0) {
            this.f85957a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f85962f) {
            for (int size = this.f85958b.size() - 1; size >= 0; size--) {
                if (this.f85958b.get(size) == null) {
                    this.f85958b.remove(size);
                }
            }
            this.f85962f = false;
        }
    }

    public void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f85958b.size(); i10++) {
            b bVar = this.f85958b.get(i10);
            if (bVar != null && g(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    public c f() {
        if (this.f85960d == null) {
            this.f85960d = new e(this.f85959c);
        }
        return this.f85960d;
    }

    public final boolean g(b bVar, long j10) {
        Long l10 = this.f85957a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f85957a.remove(bVar);
        return true;
    }

    public void h(b bVar) {
        this.f85957a.remove(bVar);
        int iIndexOf = this.f85958b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f85958b.set(iIndexOf, null);
            this.f85962f = true;
        }
    }

    public void i(c cVar) {
        this.f85960d = cVar;
    }
}
