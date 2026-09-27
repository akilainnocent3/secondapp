package v4;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o0 implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f140126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f140127c;

    public o0(Object obj, boolean z10) {
        this.f140126b = obj;
        this.f140127c = new l0(z10);
    }

    @Override // v4.x
    public final x.a a(x.a aVar) throws x.c {
        x.a aVarA;
        synchronized (this.f140126b) {
            aVarA = this.f140127c.a(aVar);
        }
        return aVarA;
    }

    @Override // v4.x
    public final void b(x.b bVar) {
        synchronized (this.f140126b) {
            this.f140127c.b(bVar);
        }
    }

    @Override // v4.x
    public long c(long j10) {
        return e(j10);
    }

    public final long d(long j10) {
        long jE;
        synchronized (this.f140126b) {
            jE = this.f140127c.e(j10);
        }
        return jE;
    }

    public final long e(long j10) {
        long jF;
        synchronized (this.f140126b) {
            jF = this.f140127c.f(j10);
        }
        return jF;
    }

    public final long f() {
        long jG;
        synchronized (this.f140126b) {
            jG = this.f140127c.g();
        }
        return jG;
    }

    @Override // v4.x
    public /* synthetic */ void flush() {
        w.a(this);
    }

    public final void g(int i10) {
        synchronized (this.f140126b) {
            this.f140127c.h(i10);
        }
    }

    @Override // v4.x
    public final ByteBuffer getOutput() {
        ByteBuffer output;
        synchronized (this.f140126b) {
            output = this.f140127c.getOutput();
        }
        return output;
    }

    public final void h(float f10) {
        synchronized (this.f140126b) {
            this.f140127c.i(f10);
        }
    }

    public final void i(float f10) {
        synchronized (this.f140126b) {
            this.f140127c.j(f10);
        }
    }

    @Override // v4.x
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.f140126b) {
            zIsActive = this.f140127c.isActive();
        }
        return zIsActive;
    }

    @Override // v4.x
    public final boolean isEnded() {
        boolean zIsEnded;
        synchronized (this.f140126b) {
            zIsEnded = this.f140127c.isEnded();
        }
        return zIsEnded;
    }

    @Override // v4.x
    public final void queueEndOfStream() {
        synchronized (this.f140126b) {
            this.f140127c.queueEndOfStream();
        }
    }

    @Override // v4.x
    public final void queueInput(ByteBuffer byteBuffer) {
        synchronized (this.f140126b) {
            this.f140127c.queueInput(byteBuffer);
        }
    }

    @Override // v4.x
    public final void reset() {
        synchronized (this.f140126b) {
            this.f140127c.reset();
        }
    }
}
