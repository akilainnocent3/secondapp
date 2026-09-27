package k4;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // k4.a
    @m
    public <T> T a(@l a.b<T> key) {
        m0.p(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@l a.b<T> key, T t10) {
        m0.p(key, "key");
        b().put(key, t10);
    }

    public e(@l a initialExtras) {
        m0.p(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ e(a aVar, int i10, x xVar) {
        this((i10 & 1) != 0 ? a.C0960a.f101783b : aVar);
    }
}
