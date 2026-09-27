package g9;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements m9.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<Object> f86163b = new ArrayList();

    @Override // m9.g
    public void c0(int i10, @oy.l String value) {
        m0.p(value, "value");
        h(i10, value);
    }

    @oy.l
    public final List<Object> d() {
        return this.f86163b;
    }

    @Override // m9.g
    public void e(int i10, long j10) {
        h(i10, Long.valueOf(j10));
    }

    @Override // m9.g
    public void f(int i10, @oy.l byte[] value) {
        m0.p(value, "value");
        h(i10, value);
    }

    @Override // m9.g
    public void g(int i10) {
        h(i10, null);
    }

    public final void h(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        if (i11 >= this.f86163b.size() && (size = this.f86163b.size()) <= i11) {
            while (true) {
                this.f86163b.add(null);
                if (size == i11) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.f86163b.set(i11, obj);
    }

    @Override // m9.g
    public void j(int i10, double d10) {
        h(i10, Double.valueOf(d10));
    }

    @Override // m9.g
    public void x() {
        this.f86163b.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
