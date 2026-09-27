package i3;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {
    public f f(int i10, ByteBuffer byteBuffer) {
        b(i10, 1, byteBuffer);
        return this;
    }

    public byte g(int i10) {
        return this.f90298d.get(a(i10));
    }

    public int h(int i10) {
        return g(i10) & 255;
    }
}
