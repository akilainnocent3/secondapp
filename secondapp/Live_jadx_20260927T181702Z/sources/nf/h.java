package nf;

import java.nio.ByteBuffer;
import k.e0;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h extends ye.i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f116592q = 32;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @h1
    public static final int f116593r = 3072000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f116594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f116595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f116596p;

    public h() {
        super(2);
        this.f116596p = 32;
    }

    @Override // ye.i, ye.a
    public void b() {
        super.b();
        this.f116595o = 0;
    }

    public boolean t(ye.i iVar) {
        eh.a.a(!iVar.o());
        eh.a.a(!iVar.e());
        eh.a.a(!iVar.g());
        if (!u(iVar)) {
            return false;
        }
        int i10 = this.f116595o;
        this.f116595o = i10 + 1;
        if (i10 == 0) {
            this.f159200g = iVar.f159200g;
            if (iVar.i()) {
                k(1);
            }
        }
        if (iVar.f()) {
            k(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = iVar.f159198e;
        if (byteBuffer != null) {
            m(byteBuffer.remaining());
            this.f159198e.put(byteBuffer);
        }
        this.f116594n = iVar.f159200g;
        return true;
    }

    public final boolean u(ye.i iVar) {
        ByteBuffer byteBuffer;
        if (!y()) {
            return true;
        }
        if (this.f116595o >= this.f116596p || iVar.f() != f()) {
            return false;
        }
        ByteBuffer byteBuffer2 = iVar.f159198e;
        return byteBuffer2 == null || (byteBuffer = this.f159198e) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long v() {
        return this.f159200g;
    }

    public long w() {
        return this.f116594n;
    }

    public int x() {
        return this.f116595o;
    }

    public boolean y() {
        return this.f116595o > 0;
    }

    public void z(@e0(from = 1) int i10) {
        eh.a.a(i10 > 0);
        this.f116596p = i10;
    }
}
