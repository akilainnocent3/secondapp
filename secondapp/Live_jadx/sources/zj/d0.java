package zj;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class d0<T> implements dl.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set<T> f161922b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set<dl.b<T>> f161921a = Collections.newSetFromMap(new ConcurrentHashMap());

    public d0(Collection<dl.b<T>> collection) {
        this.f161921a.addAll(collection);
    }

    public static d0<?> b(Collection<dl.b<?>> collection) {
        return new d0<>((Set) collection);
    }

    public synchronized void a(dl.b<T> bVar) {
        try {
            if (this.f161922b == null) {
                this.f161921a.add(bVar);
            } else {
                this.f161922b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // dl.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f161922b == null) {
            synchronized (this) {
                try {
                    if (this.f161922b == null) {
                        this.f161922b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f161922b);
    }

    public final synchronized void d() {
        try {
            Iterator<dl.b<T>> it = this.f161921a.iterator();
            while (it.hasNext()) {
                this.f161922b.add(it.next().get());
            }
            this.f161921a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
