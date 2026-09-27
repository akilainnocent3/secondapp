package eh;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g0<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f80953j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f80954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f80955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<T> f80956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f80957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f80958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f80959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f80960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @k.a0("releasedLock")
    public boolean f80961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f80962i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        void invoke(T t10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(T t10, w wVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f80963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w.b f80964b = new w.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f80965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f80966d;

        public c(T t10) {
            this.f80963a = t10;
        }

        public void a(int i10, a<T> aVar) {
            if (this.f80966d) {
                return;
            }
            if (i10 != -1) {
                this.f80964b.a(i10);
            }
            this.f80965c = true;
            aVar.invoke(this.f80963a);
        }

        public void b(b<T> bVar) {
            if (this.f80966d || !this.f80965c) {
                return;
            }
            w wVarE = this.f80964b.e();
            this.f80964b = new w.b();
            this.f80965c = false;
            bVar.a(this.f80963a, wVarE);
        }

        public void c(b<T> bVar) {
            this.f80966d = true;
            if (this.f80965c) {
                this.f80965c = false;
                bVar.a(this.f80963a, this.f80964b.e());
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f80963a.equals(((c) obj).f80963a);
        }

        public int hashCode() {
            return this.f80963a.hashCode();
        }
    }

    public g0(Looper looper, h hVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, hVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    public void c(T t10) {
        eh.a.g(t10);
        synchronized (this.f80960g) {
            try {
                if (this.f80961h) {
                    return;
                }
                this.f80957d.add(new c<>(t10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        o();
        this.f80957d.clear();
    }

    @CheckResult
    public g0<T> e(Looper looper, h hVar, b<T> bVar) {
        return new g0<>(this.f80957d, looper, hVar, bVar, this.f80962i);
    }

    @CheckResult
    public g0<T> f(Looper looper, b<T> bVar) {
        return e(looper, this.f80954a, bVar);
    }

    public void g() {
        o();
        if (this.f80959f.isEmpty()) {
            return;
        }
        if (!this.f80955b.c(0)) {
            c0 c0Var = this.f80955b;
            c0Var.d(c0Var.obtainMessage(0));
        }
        boolean zIsEmpty = this.f80958e.isEmpty();
        this.f80958e.addAll(this.f80959f);
        this.f80959f.clear();
        if (zIsEmpty) {
            while (!this.f80958e.isEmpty()) {
                this.f80958e.peekFirst().run();
                this.f80958e.removeFirst();
            }
        }
    }

    public final boolean h(Message message) {
        Iterator<c<T>> it = this.f80957d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f80956c);
            if (this.f80955b.c(0)) {
                return true;
            }
        }
        return true;
    }

    public void i(final int i10, final a<T> aVar) {
        o();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f80957d);
        this.f80959f.add(new Runnable() { // from class: eh.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0.a(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    public void j() {
        o();
        synchronized (this.f80960g) {
            this.f80961h = true;
        }
        Iterator<c<T>> it = this.f80957d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f80956c);
        }
        this.f80957d.clear();
    }

    public void k(T t10) {
        o();
        for (c<T> cVar : this.f80957d) {
            if (cVar.f80963a.equals(t10)) {
                cVar.c(this.f80956c);
                this.f80957d.remove(cVar);
            }
        }
    }

    public void l(int i10, a<T> aVar) {
        i(i10, aVar);
        g();
    }

    @Deprecated
    public void m(boolean z10) {
        this.f80962i = z10;
    }

    public int n() {
        o();
        return this.f80957d.size();
    }

    public final void o() {
        if (this.f80962i) {
            eh.a.i(Thread.currentThread() == this.f80955b.getLooper().getThread());
        }
    }

    public g0(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, h hVar, b<T> bVar, boolean z10) {
        this.f80954a = hVar;
        this.f80957d = copyOnWriteArraySet;
        this.f80956c = bVar;
        this.f80960g = new Object();
        this.f80958e = new ArrayDeque<>();
        this.f80959f = new ArrayDeque<>();
        this.f80955b = hVar.createHandler(looper, new Handler.Callback() { // from class: eh.e0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f80937b.h(message);
            }
        });
        this.f80962i = z10;
    }
}
