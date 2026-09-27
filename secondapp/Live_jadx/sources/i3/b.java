package i3;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f90298d;

    public int a(int i10) {
        return this.f90295a + (i10 * this.f90297c);
    }

    public void b(int i10, int i11, ByteBuffer byteBuffer) {
        this.f90298d = byteBuffer;
        if (byteBuffer != null) {
            this.f90295a = i10;
            this.f90296b = byteBuffer.getInt(i10 - 4);
            this.f90297c = i11;
        } else {
            this.f90295a = 0;
            this.f90296b = 0;
            this.f90297c = 0;
        }
    }

    public int c() {
        return this.f90295a;
    }

    public int d() {
        return this.f90296b;
    }

    public void e() {
        b(0, 0, null);
    }
}
