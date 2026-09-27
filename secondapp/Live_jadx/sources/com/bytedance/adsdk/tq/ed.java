package com.bytedance.adsdk.tq;

import android.os.Handler;
import android.os.Looper;
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
public class ed<T> {
    public static Executor hww = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private volatile ny<T> f31924hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Set<vhb<Throwable>> f31925sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final Set<vhb<T>> f31926tq;
    private final Handler vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww extends FutureTask<ny<T>> {
        public hww(Callable<ny<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                ed.this.hww((ny) get());
            } catch (InterruptedException | ExecutionException e10) {
                ed.this.hww(new ny(e10));
            }
        }
    }

    public ed(Callable<ny<T>> callable) {
        this(callable, false);
    }

    public synchronized ed<T> sd(vhb<Throwable> vhbVar) {
        try {
            ny<T> nyVar = this.f31924hv;
            if (nyVar != null && nyVar.tq() != null) {
                vhbVar.hww(nyVar.tq());
            }
            this.f31925sd.add(vhbVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized ed<T> tq(vhb<T> vhbVar) {
        this.f31926tq.remove(vhbVar);
        return this;
    }

    public synchronized ed<T> vy(vhb<Throwable> vhbVar) {
        this.f31925sd.remove(vhbVar);
        return this;
    }

    public ed(Callable<ny<T>> callable, boolean z10) {
        this.f31926tq = new LinkedHashSet(1);
        this.f31925sd = new LinkedHashSet(1);
        this.vy = new Handler(Looper.getMainLooper());
        this.f31924hv = null;
        if (!z10) {
            hww.execute(new hww(callable));
            return;
        }
        try {
            hww((ny) callable.call());
        } catch (Throwable th2) {
            hww((ny) new ny<>(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(ny<T> nyVar) {
        if (this.f31924hv == null) {
            this.f31924hv = nyVar;
            hww();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized ed<T> hww(vhb<T> vhbVar) {
        try {
            ny<T> nyVar = this.f31924hv;
            if (nyVar != null && nyVar.hww() != null) {
                vhbVar.hww(nyVar.hww());
            }
            this.f31926tq.add(vhbVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    private void hww() {
        this.vy.post(new Runnable() { // from class: com.bytedance.adsdk.tq.ed.1
            @Override // java.lang.Runnable
            public void run() {
                ny nyVar = ed.this.f31924hv;
                if (nyVar == null) {
                    return;
                }
                if (nyVar.hww() != null) {
                    ed.this.hww(nyVar.hww());
                } else {
                    ed.this.hww(nyVar.tq());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hww(T t10) {
        Iterator it = new ArrayList(this.f31926tq).iterator();
        while (it.hasNext()) {
            ((vhb) it.next()).hww(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hww(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f31925sd);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((vhb) it.next()).hww(th2);
        }
    }
}
