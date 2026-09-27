package zj;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a0 implements yk.d, yk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k.a0("this")
    public final Map<Class<?>, ConcurrentHashMap<yk.b<Object>, Executor>> f161912a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.a0("this")
    public Queue<yk.a<?>> f161913b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f161914c;

    public a0(Executor executor) {
        this.f161914c = executor;
    }

    @Override // yk.d
    public synchronized <T> void a(Class<T> cls, yk.b<? super T> bVar) {
        j0.b(cls);
        j0.b(bVar);
        if (this.f161912a.containsKey(cls)) {
            ConcurrentHashMap<yk.b<Object>, Executor> concurrentHashMap = this.f161912a.get(cls);
            concurrentHashMap.remove(bVar);
            if (concurrentHashMap.isEmpty()) {
                this.f161912a.remove(cls);
            }
        }
    }

    @Override // yk.d
    public <T> void b(Class<T> cls, yk.b<? super T> bVar) {
        d(cls, this.f161914c, bVar);
    }

    @Override // yk.c
    public void c(final yk.a<?> aVar) {
        j0.b(aVar);
        synchronized (this) {
            try {
                Queue<yk.a<?>> queue = this.f161913b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry<yk.b<Object>, Executor> entry : g(aVar)) {
                    entry.getValue().execute(new Runnable() { // from class: zj.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((yk.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // yk.d
    public synchronized <T> void d(Class<T> cls, Executor executor, yk.b<? super T> bVar) {
        try {
            j0.b(cls);
            j0.b(bVar);
            j0.b(executor);
            if (!this.f161912a.containsKey(cls)) {
                this.f161912a.put(cls, new ConcurrentHashMap<>());
            }
            this.f161912a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void f() {
        Queue<yk.a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f161913b;
                if (queue != null) {
                    this.f161913b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator<yk.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }
    }

    public final synchronized Set<Map.Entry<yk.b<Object>, Executor>> g(yk.a<?> aVar) {
        ConcurrentHashMap<yk.b<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.f161912a.get(aVar.b());
        } catch (Throwable th2) {
            throw th2;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }
}
