package fw;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final r f85429a;

    public f0(@oy.l InputStream stream) {
        kotlin.jvm.internal.m0.p(stream, "stream");
        this.f85429a = new r(stream, cv.g.f77202b);
    }

    @Override // fw.c0
    public int a(@oy.l char[] buffer, int i10, int i11) {
        kotlin.jvm.internal.m0.p(buffer, "buffer");
        return this.f85429a.d(buffer, i10, i11);
    }

    public final void b() {
        this.f85429a.e();
    }
}
