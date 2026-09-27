package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f13221k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f13222l = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v.b<m0<? super T>, LiveData<T>.c> f13224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f13227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f13228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f13232j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class LifecycleBoundObserver extends LiveData<T>.c implements x {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public final b0 f13233f;

        public LifecycleBoundObserver(b0 b0Var, m0<? super T> m0Var) {
            super(m0Var);
            this.f13233f = b0Var;
        }

        @Override // androidx.lifecycle.LiveData.c
        public void d() {
            this.f13233f.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean e(b0 b0Var) {
            return this.f13233f == b0Var;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean f() {
            return this.f13233f.getLifecycle().getCurrentState().e(r.b.STARTED);
        }

        @Override // androidx.lifecycle.x
        public void onStateChanged(@NonNull b0 b0Var, @NonNull r.a aVar) {
            r.b currentState = this.f13233f.getLifecycle().getCurrentState();
            if (currentState == r.b.DESTROYED) {
                LiveData.this.p(this.f13237b);
                return;
            }
            r.b bVar = null;
            while (bVar != currentState) {
                a(f());
                bVar = currentState;
                currentState = this.f13233f.getLifecycle().getCurrentState();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f13223a) {
                obj = LiveData.this.f13228f;
                LiveData.this.f13228f = LiveData.f13222l;
            }
            LiveData.this.r(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends LiveData<T>.c {
        public b(m0<? super T> m0Var) {
            super(m0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean f() {
            return true;
        }
    }

    public LiveData(T t10) {
        this.f13223a = new Object();
        this.f13224b = new v.b<>();
        this.f13225c = 0;
        this.f13228f = f13222l;
        this.f13232j = new a();
        this.f13227e = t10;
        this.f13229g = 0;
    }

    public static void b(String str) {
        if (u.c.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    @k.j0
    public void c(int i10) {
        int i11 = this.f13225c;
        this.f13225c = i10 + i11;
        if (this.f13226d) {
            return;
        }
        this.f13226d = true;
        while (true) {
            try {
                int i12 = this.f13225c;
                if (i11 == i12) {
                    this.f13226d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    m();
                } else if (z11) {
                    n();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f13226d = false;
                throw th2;
            }
        }
    }

    public final void d(LiveData<T>.c cVar) {
        if (cVar.f13238c) {
            if (!cVar.f()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f13239d;
            int i11 = this.f13229g;
            if (i10 >= i11) {
                return;
            }
            cVar.f13239d = i11;
            cVar.f13237b.a((Object) this.f13227e);
        }
    }

    public void e(@Nullable LiveData<T>.c cVar) {
        if (this.f13230h) {
            this.f13231i = true;
            return;
        }
        this.f13230h = true;
        do {
            this.f13231i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                v.b<m0<? super T>, LiveData<T>.c>.d dVarF = this.f13224b.f();
                while (dVarF.hasNext()) {
                    d((c) dVarF.next().getValue());
                    if (this.f13231i) {
                        break;
                    }
                }
            }
        } while (this.f13231i);
        this.f13230h = false;
    }

    @Nullable
    public T f() {
        T t10 = (T) this.f13227e;
        if (t10 != f13222l) {
            return t10;
        }
        return null;
    }

    public int g() {
        return this.f13229g;
    }

    public boolean h() {
        return this.f13225c > 0;
    }

    public boolean i() {
        return this.f13224b.size() > 0;
    }

    public boolean j() {
        return this.f13227e != f13222l;
    }

    @k.j0
    public void k(@NonNull b0 b0Var, @NonNull m0<? super T> m0Var) {
        b("observe");
        if (b0Var.getLifecycle().getCurrentState() == r.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(b0Var, m0Var);
        LiveData<T>.c cVarI = this.f13224b.i(m0Var, lifecycleBoundObserver);
        if (cVarI != null && !cVarI.e(b0Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarI != null) {
            return;
        }
        b0Var.getLifecycle().addObserver(lifecycleBoundObserver);
    }

    @k.j0
    public void l(@NonNull m0<? super T> m0Var) {
        b("observeForever");
        b bVar = new b(m0Var);
        LiveData<T>.c cVarI = this.f13224b.i(m0Var, bVar);
        if (cVarI instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarI != null) {
            return;
        }
        bVar.a(true);
    }

    public void o(T t10) {
        boolean z10;
        synchronized (this.f13223a) {
            z10 = this.f13228f == f13222l;
            this.f13228f = t10;
        }
        if (z10) {
            u.c.h().d(this.f13232j);
        }
    }

    @k.j0
    public void p(@NonNull m0<? super T> m0Var) {
        b("removeObserver");
        LiveData<T>.c cVarJ = this.f13224b.j(m0Var);
        if (cVarJ == null) {
            return;
        }
        cVarJ.d();
        cVarJ.a(false);
    }

    @k.j0
    public void q(@NonNull b0 b0Var) {
        b("removeObservers");
        for (Map.Entry<m0<? super T>, LiveData<T>.c> entry : this.f13224b) {
            if (entry.getValue().e(b0Var)) {
                p(entry.getKey());
            }
        }
    }

    @k.j0
    public void r(T t10) {
        b("setValue");
        this.f13229g++;
        this.f13227e = t10;
        e(null);
    }

    public LiveData() {
        this.f13223a = new Object();
        this.f13224b = new v.b<>();
        this.f13225c = 0;
        Object obj = f13222l;
        this.f13228f = obj;
        this.f13232j = new a();
        this.f13227e = obj;
        this.f13229g = -1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m0<? super T> f13237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f13238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13239d = -1;

        public c(m0<? super T> m0Var) {
            this.f13237b = m0Var;
        }

        public void a(boolean z10) {
            if (z10 == this.f13238c) {
                return;
            }
            this.f13238c = z10;
            LiveData.this.c(z10 ? 1 : -1);
            if (this.f13238c) {
                LiveData.this.e(this);
            }
        }

        public boolean e(b0 b0Var) {
            return false;
        }

        public abstract boolean f();

        public void d() {
        }
    }

    public void m() {
    }

    public void n() {
    }
}
