package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class yot<T> {
    public static final Executor e;
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile wot<T> d;

    public static class a<T> extends FutureTask<wot<T>> {
        public yot<T> a;

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.a.d(get());
                } catch (InterruptedException | ExecutionException e) {
                    this.a.d(new wot<>(e));
                }
            } finally {
                this.a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new liv();
        } else {
            e = Executors.newCachedThreadPool(new apt());
        }
    }

    public yot() {
        throw null;
    }

    public yot(Callable<wot<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                d(callable.call());
                return;
            } catch (Throwable th) {
                d(new wot<>(th));
                return;
            }
        }
        Executor executor = e;
        a aVar = new a(callable);
        aVar.a = this;
        executor.execute(aVar);
    }

    public final synchronized void a(qot qotVar) {
        Throwable th;
        try {
            wot<T> wotVar = this.d;
            if (wotVar != null && (th = wotVar.b) != null) {
                qotVar.onResult(th);
            }
            this.b.add(qotVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(qot qotVar) {
        xmt xmtVar;
        try {
            wot<T> wotVar = this.d;
            if (wotVar != null && (xmtVar = wotVar.a) != null) {
                qotVar.onResult(xmtVar);
            }
            this.a.add(qotVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        wot<T> wotVar = this.d;
        if (wotVar == null) {
            return;
        }
        xmt xmtVar = wotVar.a;
        int i = 0;
        if (xmtVar != null) {
            synchronized (this) {
                ArrayList arrayList = new ArrayList(this.a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((qot) obj).onResult(xmtVar);
                }
            }
            return;
        }
        Throwable th = wotVar.b;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList(this.b);
            if (arrayList2.isEmpty()) {
                lgt.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((qot) obj2).onResult(th);
            }
        }
    }

    public final void d(wot<T> wotVar) {
        if (this.d != null) {
            ib5.a("A task may only be set once.");
            return;
        }
        this.d = wotVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.c.post(new Runnable() { // from class: xot
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        }
    }

    public yot(xmt xmtVar) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        d(new wot<>(xmtVar));
    }
}
