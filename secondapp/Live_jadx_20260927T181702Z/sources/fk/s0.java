package fk;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f84927a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f84928b = new AtomicInteger();

    public int a() {
        return this.f84928b.get();
    }

    public int b() {
        return this.f84927a.get();
    }

    public void c() {
        this.f84928b.getAndIncrement();
    }

    public void d() {
        this.f84927a.getAndIncrement();
    }

    public void e() {
        this.f84928b.set(0);
    }
}
