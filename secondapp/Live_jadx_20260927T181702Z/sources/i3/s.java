package i3;

import dr.r2;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b {
    public s f(int i10, ByteBuffer byteBuffer) {
        b(i10, 2, byteBuffer);
        return this;
    }

    public short g(int i10) {
        return this.f90298d.getShort(a(i10));
    }

    public int h(int i10) {
        return g(i10) & r2.f79504e;
    }
}
