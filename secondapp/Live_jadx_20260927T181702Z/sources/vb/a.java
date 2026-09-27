package vb;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f140634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @h1
    public final Map<tb.f, d> f140635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReferenceQueue<p<?>> f140636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p.a f140637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f140638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public volatile c f140639g;

    /* JADX INFO: renamed from: vb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class ThreadFactoryC1477a implements ThreadFactory {

        /* JADX INFO: renamed from: vb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC1478a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Runnable f140640b;

            public RunnableC1478a(Runnable runnable) {
                this.f140640b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f140640b.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(new RunnableC1478a(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public interface c {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static final class d extends WeakReference<p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tb.f f140643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f140644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public v<?> f140645c;

        public d(@NonNull tb.f fVar, @NonNull p<?> pVar, @NonNull ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f140643a = (tb.f) pc.m.e(fVar);
            this.f140645c = (pVar.e() && z10) ? (v) pc.m.e(pVar.d()) : null;
            this.f140644b = pVar.e();
        }

        public void a() {
            this.f140645c = null;
            clear();
        }
    }

    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC1477a()));
    }

    public synchronized void a(tb.f fVar, p<?> pVar) {
        d dVarPut = this.f140635c.put(fVar, new d(fVar, pVar, this.f140636d, this.f140633a));
        if (dVarPut != null) {
            dVarPut.a();
        }
    }

    public void b() {
        while (!this.f140638f) {
            try {
                c((d) this.f140636d.remove());
                c cVar = this.f140639g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@NonNull d dVar) {
        v<?> vVar;
        synchronized (this) {
            this.f140635c.remove(dVar.f140643a);
            if (dVar.f140644b && (vVar = dVar.f140645c) != null) {
                this.f140637e.c(dVar.f140643a, new p<>(vVar, true, false, dVar.f140643a, this.f140637e));
            }
        }
    }

    public synchronized void d(tb.f fVar) {
        d dVarRemove = this.f140635c.remove(fVar);
        if (dVarRemove != null) {
            dVarRemove.a();
        }
    }

    @Nullable
    public synchronized p<?> e(tb.f fVar) {
        d dVar = this.f140635c.get(fVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    @h1
    public void f(c cVar) {
        this.f140639g = cVar;
    }

    public void g(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f140637e = aVar;
            }
        }
    }

    @h1
    public void h() {
        this.f140638f = true;
        Executor executor = this.f140634b;
        if (executor instanceof ExecutorService) {
            pc.f.c((ExecutorService) executor);
        }
    }

    @h1
    public a(boolean z10, Executor executor) {
        this.f140635c = new HashMap();
        this.f140636d = new ReferenceQueue<>();
        this.f140633a = z10;
        this.f140634b = executor;
        executor.execute(new b());
    }
}
