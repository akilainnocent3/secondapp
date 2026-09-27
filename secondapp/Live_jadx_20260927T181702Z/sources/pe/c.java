package pe;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f120704a;

    public c(long j10) {
        this.f120704a = new AtomicLong(j10);
    }

    @Override // pe.a
    public long a() {
        return this.f120704a.get();
    }

    public void b(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.f120704a.addAndGet(j10);
    }

    public void c() {
        b(1L);
    }
}
