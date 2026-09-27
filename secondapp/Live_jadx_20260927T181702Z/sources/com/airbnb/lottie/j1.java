package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j1<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25061e = "lottie.testing.directExecutor";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Executor f25062f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<d1<T>> f25063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<d1<Throwable>> f25064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f25065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile h1<T> f25066d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a<T> extends FutureTask<h1<T>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j1<T> f25067b;

        public a(j1<T> j1Var, Callable<h1<T>> callable) {
            super(callable);
            this.f25067b = j1Var;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f25067b.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f25067b.l(new h1(e10));
                }
            } finally {
                this.f25067b = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty(f25061e))) {
            f25062f = new i5.b();
        } else {
            f25062f = Executors.newCachedThreadPool(new gb.h());
        }
    }

    @k.y0({k.y0.a.LIBRARY})
    public j1(Callable<h1<T>> callable) {
        this(callable, false);
    }

    public synchronized j1<T> c(d1<Throwable> d1Var) {
        try {
            h1<T> h1Var = this.f25066d;
            if (h1Var != null && h1Var.a() != null) {
                d1Var.onResult(h1Var.a());
            }
            this.f25064b.add(d1Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized j1<T> d(d1<T> d1Var) {
        try {
            h1<T> h1Var = this.f25066d;
            if (h1Var != null && h1Var.b() != null) {
                d1Var.onResult(h1Var.b());
            }
            this.f25063a.add(d1Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Nullable
    public h1<T> e() {
        return this.f25066d;
    }

    public final synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f25064b);
        if (arrayList.isEmpty()) {
            gb.g.f("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d1) it.next()).onResult(th2);
        }
    }

    public final void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f25065c.post(new Runnable() { // from class: com.airbnb.lottie.i1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25055b.h();
                }
            });
        }
    }

    public final void h() {
        h1<T> h1Var = this.f25066d;
        if (h1Var == null) {
            return;
        }
        if (h1Var.b() != null) {
            i(h1Var.b());
        } else {
            f(h1Var.a());
        }
    }

    public final synchronized void i(T t10) {
        Iterator it = new ArrayList(this.f25063a).iterator();
        while (it.hasNext()) {
            ((d1) it.next()).onResult(t10);
        }
    }

    public synchronized j1<T> j(d1<Throwable> d1Var) {
        this.f25064b.remove(d1Var);
        return this;
    }

    public synchronized j1<T> k(d1<T> d1Var) {
        this.f25063a.remove(d1Var);
        return this;
    }

    public final void l(@Nullable h1<T> h1Var) {
        if (this.f25066d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f25066d = h1Var;
        g();
    }

    public j1(T t10) {
        this.f25063a = new LinkedHashSet(1);
        this.f25064b = new LinkedHashSet(1);
        this.f25065c = new Handler(Looper.getMainLooper());
        this.f25066d = null;
        l(new h1<>(t10));
    }

    @k.y0({k.y0.a.LIBRARY})
    public j1(Callable<h1<T>> callable, boolean z10) {
        this.f25063a = new LinkedHashSet(1);
        this.f25064b = new LinkedHashSet(1);
        this.f25065c = new Handler(Looper.getMainLooper());
        this.f25066d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new h1<>(th2));
                return;
            }
        }
        f25062f.execute(new a(this, callable));
    }
}
