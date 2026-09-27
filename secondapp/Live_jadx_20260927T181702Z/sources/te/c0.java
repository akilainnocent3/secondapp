package te;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class c0 implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i.a f136533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i.a f136534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i.a f136535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i.a f136536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f136537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f136538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f136539h;

    public c0() {
        ByteBuffer byteBuffer = i.f136608a;
        this.f136537f = byteBuffer;
        this.f136538g = byteBuffer;
        i.a aVar = i.a.f136609e;
        this.f136535d = aVar;
        this.f136536e = aVar;
        this.f136533b = aVar;
        this.f136534c = aVar;
    }

    @Override // te.i
    @qj.a
    public final i.a a(i.a aVar) throws i.b {
        this.f136535d = aVar;
        this.f136536e = c(aVar);
        return isActive() ? this.f136536e : i.a.f136609e;
    }

    public final boolean b() {
        return this.f136538g.hasRemaining();
    }

    @qj.a
    public i.a c(i.a aVar) throws i.b {
        return i.a.f136609e;
    }

    @Override // te.i
    public final void flush() {
        this.f136538g = i.f136608a;
        this.f136539h = false;
        this.f136533b = this.f136535d;
        this.f136534c = this.f136536e;
        d();
    }

    public final ByteBuffer g(int i10) {
        if (this.f136537f.capacity() < i10) {
            this.f136537f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f136537f.clear();
        }
        ByteBuffer byteBuffer = this.f136537f;
        this.f136538g = byteBuffer;
        return byteBuffer;
    }

    @Override // te.i
    @k.i
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f136538g;
        this.f136538g = i.f136608a;
        return byteBuffer;
    }

    @Override // te.i
    public boolean isActive() {
        return this.f136536e != i.a.f136609e;
    }

    @Override // te.i
    @k.i
    public boolean isEnded() {
        return this.f136539h && this.f136538g == i.f136608a;
    }

    @Override // te.i
    public final void queueEndOfStream() {
        this.f136539h = true;
        e();
    }

    @Override // te.i
    public final void reset() {
        flush();
        this.f136537f = i.f136608a;
        i.a aVar = i.a.f136609e;
        this.f136535d = aVar;
        this.f136536e = aVar;
        this.f136533b = aVar;
        this.f136534c = aVar;
        f();
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }
}
