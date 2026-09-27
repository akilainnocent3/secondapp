package i3;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f90396b;

    public void a() {
        b(0, null);
    }

    public void b(int i10, ByteBuffer byteBuffer) {
        this.f90396b = byteBuffer;
        if (byteBuffer != null) {
            this.f90395a = i10;
        } else {
            this.f90395a = 0;
        }
    }
}
