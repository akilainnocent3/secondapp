package k4;

import androidx.lifecycle.e1;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class h<T extends e1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public final Class<T> f101787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final ds.l<a, T> f101788b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@l Class<T> clazz, @l ds.l<? super a, ? extends T> initializer) {
        m0.p(clazz, "clazz");
        m0.p(initializer, "initializer");
        this.f101787a = clazz;
        this.f101788b = initializer;
    }

    @l
    public final Class<T> a() {
        return this.f101787a;
    }

    @l
    public final ds.l<a, T> b() {
        return this.f101788b;
    }
}
