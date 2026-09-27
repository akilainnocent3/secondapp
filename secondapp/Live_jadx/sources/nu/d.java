package nu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class d implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Lock f117606b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @oy.l
    public final Lock a() {
        return this.f117606b;
    }

    @Override // nu.k
    public void lock() {
        this.f117606b.lock();
    }

    @Override // nu.k
    public void unlock() {
        this.f117606b.unlock();
    }

    public d(@oy.l Lock lock) {
        m0.p(lock, "lock");
        this.f117606b = lock;
    }

    public /* synthetic */ d(Lock lock, int i10, x xVar) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
