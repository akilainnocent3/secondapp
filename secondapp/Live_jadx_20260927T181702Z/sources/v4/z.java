package v4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public abstract class z implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.a f140155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x.a f140156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x.a f140157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x.a f140158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f140159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f140160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f140161h;

    public z() {
        ByteBuffer byteBuffer = x.f140146a;
        this.f140159f = byteBuffer;
        this.f140160g = byteBuffer;
        x.a aVar = x.a.f140147e;
        this.f140157d = aVar;
        this.f140158e = aVar;
        this.f140155b = aVar;
        this.f140156c = aVar;
    }

    @Override // v4.x
    public final x.a a(x.a aVar) throws x.c {
        this.f140157d = aVar;
        this.f140158e = e(aVar);
        return isActive() ? this.f140158e : x.a.f140147e;
    }

    @Override // v4.x
    public final void b(x.b bVar) {
        this.f140160g = x.f140146a;
        this.f140161h = false;
        this.f140155b = this.f140157d;
        this.f140156c = this.f140158e;
        g(bVar);
    }

    @Override // v4.x
    public /* synthetic */ long c(long j10) {
        return w.c(this, j10);
    }

    public final boolean d() {
        return this.f140160g.hasRemaining();
    }

    public x.a e(x.a aVar) throws x.c {
        return x.a.f140147e;
    }

    @Override // v4.x
    @Deprecated
    public final void flush() {
        b(x.b.f140152b);
    }

    public void g(x.b bVar) {
        f();
    }

    @Override // v4.x
    @k.i
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f140160g;
        this.f140160g = x.f140146a;
        return byteBuffer;
    }

    @Override // v4.x
    @k.i
    public boolean isActive() {
        return this.f140158e != x.a.f140147e;
    }

    @Override // v4.x
    @k.i
    public boolean isEnded() {
        return this.f140161h && this.f140160g == x.f140146a;
    }

    public final ByteBuffer j(int i10) {
        if (this.f140159f.capacity() < i10) {
            this.f140159f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f140159f.clear();
        }
        ByteBuffer byteBuffer = this.f140159f;
        this.f140160g = byteBuffer;
        return byteBuffer;
    }

    @Override // v4.x
    public final void queueEndOfStream() {
        this.f140161h = true;
        h();
    }

    @Override // v4.x
    public final void reset() {
        ByteBuffer byteBuffer = x.f140146a;
        this.f140160g = byteBuffer;
        this.f140161h = false;
        this.f140159f = byteBuffer;
        x.a aVar = x.a.f140147e;
        this.f140157d = aVar;
        this.f140158e = aVar;
        this.f140155b = aVar;
        this.f140156c = aVar;
        i();
    }

    @Deprecated
    public void f() {
    }

    public void h() {
    }

    public void i() {
    }
}
