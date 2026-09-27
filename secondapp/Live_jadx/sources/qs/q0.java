package qs;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final WeakReference<ClassLoader> f122741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f122742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public ClassLoader f122743c;

    public q0(@oy.l ClassLoader classLoader) {
        kotlin.jvm.internal.m0.p(classLoader, "classLoader");
        this.f122741a = new WeakReference<>(classLoader);
        this.f122742b = System.identityHashCode(classLoader);
        this.f122743c = classLoader;
    }

    public final void a(@oy.m ClassLoader classLoader) {
        this.f122743c = classLoader;
    }

    public boolean equals(@oy.m Object obj) {
        return (obj instanceof q0) && this.f122741a.get() == ((q0) obj).f122741a.get();
    }

    public int hashCode() {
        return this.f122742b;
    }

    @oy.l
    public String toString() {
        String string;
        ClassLoader classLoader = this.f122741a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
