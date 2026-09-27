package i3;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b {
    public m f(int i10, ByteBuffer byteBuffer) {
        b(i10, 4, byteBuffer);
        return this;
    }

    public int g(int i10) {
        return this.f90298d.getInt(a(i10));
    }

    public long h(int i10) {
        return ((long) g(i10)) & 4294967295L;
    }
}
