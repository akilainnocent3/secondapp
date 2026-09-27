package mv;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class q<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @cs.g
    public final int f115380a;

    public q(T t10, @oy.m ReferenceQueue<T> referenceQueue) {
        super(t10, referenceQueue);
        this.f115380a = t10 != null ? t10.hashCode() : 0;
    }
}
