package o5;

import java.nio.ByteBuffer;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class n extends c5.j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f118778q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @h1
    public static final int f118779r = 3072000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f118780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f118781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f118782p;

    public n() {
        super(2);
        this.f118782p = 32;
    }

    @Override // c5.j, c5.a
    public void b() {
        super.b();
        this.f118781o = 0;
    }

    public boolean t(c5.j jVar) {
        zi.l0.d(!jVar.o());
        zi.l0.d(!jVar.e());
        zi.l0.d(!jVar.f());
        if (!u(jVar)) {
            return false;
        }
        int i10 = this.f118781o;
        this.f118781o = i10 + 1;
        if (i10 == 0) {
            this.f22414g = jVar.f22414g;
            if (jVar.h()) {
                k(1);
            }
        }
        ByteBuffer byteBuffer = jVar.f22412e;
        if (byteBuffer != null) {
            m(byteBuffer.remaining());
            this.f22412e.put(byteBuffer);
        }
        this.f118780n = jVar.f22414g;
        return true;
    }

    public final boolean u(c5.j jVar) {
        ByteBuffer byteBuffer;
        if (!y()) {
            return true;
        }
        if (this.f118781o >= this.f118782p) {
            return false;
        }
        ByteBuffer byteBuffer2 = jVar.f22412e;
        return byteBuffer2 == null || (byteBuffer = this.f22412e) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long v() {
        return this.f22414g;
    }

    public long w() {
        return this.f118780n;
    }

    public int x() {
        return this.f118781o;
    }

    public boolean y() {
        return this.f118781o > 0;
    }

    public void z(@k.e0(from = 1) int i10) {
        zi.l0.d(i10 > 0);
        this.f118782p = i10;
    }
}
