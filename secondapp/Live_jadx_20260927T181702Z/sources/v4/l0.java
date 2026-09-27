package v4;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class l0 implements x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f140076q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f140077r = 1.0E-4f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f140078s = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f140080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f140081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f140082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x.a f140083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x.a f140084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x.a f140085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x.a f140086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f140087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public k0 f140088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ByteBuffer f140089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f140090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f140091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f140092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f140093p;

    public l0() {
        this(false);
    }

    @Override // v4.x
    public x.a a(x.a aVar) throws x.c {
        int i10 = aVar.f140150c;
        if (i10 != 2 && i10 != 4) {
            throw new x.c(aVar);
        }
        int i11 = this.f140080c;
        if (i11 == -1) {
            i11 = aVar.f140148a;
        }
        this.f140083f = aVar;
        x.a aVar2 = new x.a(i11, aVar.f140149b, aVar.f140150c);
        this.f140084g = aVar2;
        this.f140087j = true;
        return aVar2;
    }

    @Override // v4.x
    public void b(x.b bVar) {
        if (isActive()) {
            x.a aVar = this.f140083f;
            this.f140085h = aVar;
            x.a aVar2 = this.f140084g;
            this.f140086i = aVar2;
            if (this.f140087j) {
                this.f140088k = new k0(aVar.f140148a, aVar.f140149b, this.f140081d, this.f140082e, aVar2.f140148a, aVar.f140150c == 4);
            } else {
                k0 k0Var = this.f140088k;
                if (k0Var != null) {
                    k0Var.o();
                }
            }
        }
        this.f140090m = x.f140146a;
        this.f140091n = 0L;
        this.f140092o = 0L;
        this.f140093p = false;
    }

    @Override // v4.x
    public long c(long j10) {
        return f(j10);
    }

    public final boolean d() {
        return Math.abs(this.f140081d - 1.0f) < 1.0E-4f && Math.abs(this.f140082e - 1.0f) < 1.0E-4f && this.f140084g.f140148a == this.f140083f.f140148a;
    }

    public long e(long j10) {
        if (this.f140092o < 1024) {
            return (long) (((double) this.f140081d) * j10);
        }
        long jU = this.f140091n - ((long) ((k0) zi.l0.E(this.f140088k)).u());
        int i10 = this.f140086i.f140148a;
        int i11 = this.f140085h.f140148a;
        return i10 == i11 ? b2.l2(j10, jU, this.f140092o) : b2.l2(j10, jU * ((long) i10), this.f140092o * ((long) i11));
    }

    public long f(long j10) {
        if (this.f140092o < 1024) {
            return (long) (j10 / ((double) this.f140081d));
        }
        long jU = this.f140091n - ((long) ((k0) zi.l0.E(this.f140088k)).u());
        int i10 = this.f140086i.f140148a;
        int i11 = this.f140085h.f140148a;
        return i10 == i11 ? b2.l2(j10, this.f140092o, jU) : b2.l2(j10, this.f140092o * ((long) i11), jU * ((long) i10));
    }

    @Override // v4.x
    public /* synthetic */ void flush() {
        w.a(this);
    }

    public long g() {
        return this.f140091n - ((long) ((k0) zi.l0.E(this.f140088k)).u());
    }

    @Override // v4.x
    public ByteBuffer getOutput() {
        int iT;
        k0 k0Var = this.f140088k;
        if (k0Var != null && (iT = k0Var.t()) > 0) {
            if (this.f140089l.capacity() < iT) {
                this.f140089l = ByteBuffer.allocateDirect(iT).order(ByteOrder.nativeOrder());
            } else {
                this.f140089l.clear();
            }
            k0Var.s(this.f140089l);
            this.f140089l.flip();
            this.f140092o += (long) iT;
            this.f140090m = this.f140089l;
        }
        ByteBuffer byteBuffer = this.f140090m;
        this.f140090m = x.f140146a;
        return byteBuffer;
    }

    public void h(int i10) {
        zi.l0.d(i10 == -1 || i10 > 0);
        this.f140080c = i10;
    }

    public void i(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        zi.l0.d(f10 > 0.0f);
        if (this.f140082e != f10) {
            this.f140082e = f10;
            this.f140087j = true;
        }
    }

    @Override // v4.x
    public boolean isActive() {
        if (this.f140084g.f140148a != -1) {
            return this.f140079b || !d();
        }
        return false;
    }

    @Override // v4.x
    public boolean isEnded() {
        if (!this.f140093p) {
            return false;
        }
        k0 k0Var = this.f140088k;
        return k0Var == null || k0Var.t() == 0;
    }

    public void j(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        zi.l0.d(f10 > 0.0f);
        if (this.f140081d != f10) {
            this.f140081d = f10;
            this.f140087j = true;
        }
    }

    @Override // v4.x
    public void queueEndOfStream() {
        k0 k0Var = this.f140088k;
        if (k0Var != null) {
            k0Var.y();
        }
        this.f140093p = true;
    }

    @Override // v4.x
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            k0 k0Var = (k0) zi.l0.E(this.f140088k);
            this.f140091n += (long) byteBuffer.remaining();
            k0Var.z(byteBuffer);
        }
    }

    @Override // v4.x
    public void reset() {
        this.f140081d = 1.0f;
        this.f140082e = 1.0f;
        x.a aVar = x.a.f140147e;
        this.f140083f = aVar;
        this.f140084g = aVar;
        this.f140085h = aVar;
        this.f140086i = aVar;
        ByteBuffer byteBuffer = x.f140146a;
        this.f140089l = byteBuffer;
        this.f140090m = byteBuffer;
        this.f140080c = -1;
        this.f140087j = false;
        this.f140088k = null;
        this.f140091n = 0L;
        this.f140092o = 0L;
        this.f140093p = false;
    }

    public l0(boolean z10) {
        this.f140081d = 1.0f;
        this.f140082e = 1.0f;
        x.a aVar = x.a.f140147e;
        this.f140083f = aVar;
        this.f140084g = aVar;
        this.f140085h = aVar;
        this.f140086i = aVar;
        ByteBuffer byteBuffer = x.f140146a;
        this.f140089l = byteBuffer;
        this.f140090m = byteBuffer;
        this.f140080c = -1;
        this.f140079b = z10;
    }
}
