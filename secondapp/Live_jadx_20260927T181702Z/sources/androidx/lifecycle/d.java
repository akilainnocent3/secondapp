package androidx.lifecycle;

import java.io.Closeable;
import jv.t2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable, jv.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final or.j f13327b;

    public d(@oy.l or.j context) {
        kotlin.jvm.internal.m0.p(context, "context");
        this.f13327b = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t2.j(getCoroutineContext(), null, 1, null);
    }

    @Override // jv.s0
    @oy.l
    public or.j getCoroutineContext() {
        return this.f13327b;
    }
}
