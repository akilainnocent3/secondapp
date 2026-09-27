package x4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class c0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f144231k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final l f144232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f144233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final y f144234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final b<T> f144235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f144236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f144237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<Runnable> f144238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f144239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @k.a0("releasedLock")
    public boolean f144240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f144241j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        void invoke(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(T t10, u4.l0 l0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f144242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u4.l0.b f144243b = new u4.l0.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f144244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f144245d;

        public c(T t10) {
            this.f144242a = t10;
        }

        public void b(int i10, a<T> aVar) {
            if (this.f144245d) {
                return;
            }
            if (i10 != -1) {
                this.f144243b.a(i10);
            }
            this.f144244c = true;
            aVar.invoke(this.f144242a);
        }

        public void c(b<T> bVar) {
            if (this.f144245d || !this.f144244c) {
                return;
            }
            u4.l0 l0VarE = this.f144243b.e();
            this.f144243b = new u4.l0.b();
            this.f144244c = false;
            bVar.a(this.f144242a, l0VarE);
        }

        public final void d(@Nullable b<T> bVar) {
            this.f144245d = true;
            if (bVar == null || !this.f144244c) {
                return;
            }
            this.f144244c = false;
            bVar.a(this.f144242a, this.f144243b.e());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f144242a.equals(((c) obj).f144242a);
        }

        public int hashCode() {
            return this.f144242a.hashCode();
        }
    }

    public c0(Looper looper) {
        this(looper.getThread());
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(i10, aVar);
        }
    }

    public void c(T t10) {
        zi.l0.E(t10);
        synchronized (this.f144239h) {
            try {
                if (this.f144240i) {
                    return;
                }
                this.f144236e.add(new c<>(t10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        t();
        Iterator<c<T>> it = this.f144236e.iterator();
        while (it.hasNext()) {
            it.next().d(this.f144235d);
        }
        this.f144236e.clear();
    }

    @CheckResult
    public c0<T> e(Looper looper) {
        return f(looper, this.f144232a, this.f144235d);
    }

    @CheckResult
    public c0<T> f(Looper looper, @Nullable l lVar, @Nullable b<T> bVar) {
        zi.l0.g0(lVar != null || bVar == null);
        return new c0<>(this.f144236e, looper, looper.getThread(), lVar, bVar, this.f144241j);
    }

    @CheckResult
    public c0<T> g(Looper looper, @Nullable b<T> bVar) {
        return f(looper, this.f144232a, bVar);
    }

    @CheckResult
    public c0<T> h(l lVar) {
        y yVar = this.f144234c;
        return yVar != null ? f(yVar.getLooper(), lVar, this.f144235d) : new c0<>(this.f144236e, null, this.f144233b, lVar, null, this.f144241j);
    }

    public void i() {
        t();
        if (this.f144238g.isEmpty()) {
            return;
        }
        if (this.f144235d != null && !((y) zi.l0.E(this.f144234c)).c(1)) {
            y yVar = this.f144234c;
            yVar.d(yVar.obtainMessage(1));
        }
        boolean zIsEmpty = this.f144237f.isEmpty();
        this.f144237f.addAll(this.f144238g);
        this.f144238g.clear();
        if (zIsEmpty) {
            while (!this.f144237f.isEmpty()) {
                this.f144237f.peekFirst().run();
                this.f144237f.removeFirst();
            }
        }
    }

    public final boolean j(Message message) {
        b<T> bVar = (b) zi.l0.E(this.f144235d);
        Iterator<c<T>> it = this.f144236e.iterator();
        while (it.hasNext()) {
            it.next().c(bVar);
            if (((y) zi.l0.E(this.f144234c)).c(1)) {
                break;
            }
        }
        return true;
    }

    public boolean k() {
        return Thread.currentThread() == this.f144233b;
    }

    public void l(final int i10, final a<T> aVar) {
        t();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f144236e);
        this.f144238g.add(new Runnable() { // from class: x4.b0
            @Override // java.lang.Runnable
            public final void run() {
                c0.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void m(a<T> aVar) {
        l(-1, aVar);
    }

    public void n() {
        t();
        synchronized (this.f144239h) {
            this.f144240i = true;
        }
        Iterator<c<T>> it = this.f144236e.iterator();
        while (it.hasNext()) {
            it.next().d(this.f144235d);
        }
        this.f144236e.clear();
    }

    public void o(T t10) {
        t();
        for (c<T> cVar : this.f144236e) {
            if (cVar.f144242a.equals(t10)) {
                cVar.d(this.f144235d);
                this.f144236e.remove(cVar);
            }
        }
    }

    public void p(int i10, a<T> aVar) {
        l(i10, aVar);
        i();
    }

    public void q(a<T> aVar) {
        p(-1, aVar);
    }

    @Deprecated
    public void r(boolean z10) {
        this.f144241j = z10;
    }

    public int s() {
        t();
        return this.f144236e.size();
    }

    public final void t() {
        if (this.f144241j) {
            zi.l0.g0(k());
        }
    }

    public c0(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public c0(Looper looper, l lVar, @Nullable b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), lVar, bVar, true);
    }

    public c0(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, @Nullable Looper looper, Thread thread, @Nullable l lVar, @Nullable b<T> bVar, boolean z10) {
        this.f144232a = lVar;
        this.f144233b = thread;
        this.f144236e = copyOnWriteArraySet;
        this.f144235d = bVar;
        this.f144239h = new Object();
        this.f144237f = new ArrayDeque<>();
        this.f144238g = new ArrayDeque<>();
        if (looper != null && lVar != null && bVar != null) {
            this.f144234c = lVar.createHandler(looper, new Handler.Callback() { // from class: x4.a0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f144155b.j(message);
                }
            });
        } else {
            this.f144234c = null;
        }
        this.f144241j = z10;
    }
}
