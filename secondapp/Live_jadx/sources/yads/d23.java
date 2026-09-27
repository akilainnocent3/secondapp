package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d23 implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f148010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f148011c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f148012d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f148013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zk f148014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zk f148015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk f148016h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f148017i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c23 f148018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f148019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f148020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f148021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f148022n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f148023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f148024p;

    public d23() {
        zk zkVar = zk.f158884e;
        this.f148013e = zkVar;
        this.f148014f = zkVar;
        this.f148015g = zkVar;
        this.f148016h = zkVar;
        ByteBuffer byteBuffer = bl.f147231a;
        this.f148019k = byteBuffer;
        this.f148020l = byteBuffer.asShortBuffer();
        this.f148021m = byteBuffer;
        this.f148010b = -1;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) throws al {
        if (zkVar.f158887c != 2) {
            throw new al(zkVar);
        }
        int i10 = this.f148010b;
        if (i10 == -1) {
            i10 = zkVar.f158885a;
        }
        this.f148013e = zkVar;
        zk zkVar2 = new zk(i10, zkVar.f158886b, 2);
        this.f148014f = zkVar2;
        this.f148017i = true;
        return zkVar2;
    }

    @Override // yads.bl
    public final void b() {
        int i10;
        c23 c23Var = this.f148018j;
        if (c23Var != null) {
            int i11 = c23Var.f147507k;
            float f10 = c23Var.f147499c;
            float f11 = c23Var.f147500d;
            int i12 = c23Var.f147509m + ((int) ((((i11 / (f10 / f11)) + c23Var.f147511o) / (c23Var.f147501e * f11)) + 0.5f));
            c23Var.f147506j = c23Var.b(c23Var.f147506j, i11, (c23Var.f147504h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = c23Var.f147504h * 2;
                int i14 = c23Var.f147498b;
                if (i13 >= i10 * i14) {
                    break;
                }
                c23Var.f147506j[(i14 * i11) + i13] = 0;
                i13++;
            }
            c23Var.f147507k = i10 + c23Var.f147507k;
            c23Var.a();
            if (c23Var.f147509m > i12) {
                c23Var.f147509m = i12;
            }
            c23Var.f147507k = 0;
            c23Var.f147514r = 0;
            c23Var.f147511o = 0;
        }
        this.f148024p = true;
    }

    @Override // yads.bl
    public final void flush() {
        if (isActive()) {
            zk zkVar = this.f148013e;
            this.f148015g = zkVar;
            zk zkVar2 = this.f148014f;
            this.f148016h = zkVar2;
            if (this.f148017i) {
                this.f148018j = new c23(zkVar.f158885a, zkVar.f158886b, this.f148011c, this.f148012d, zkVar2.f158885a);
            } else {
                c23 c23Var = this.f148018j;
                if (c23Var != null) {
                    c23Var.f147507k = 0;
                    c23Var.f147509m = 0;
                    c23Var.f147511o = 0;
                    c23Var.f147512p = 0;
                    c23Var.f147513q = 0;
                    c23Var.f147514r = 0;
                    c23Var.f147515s = 0;
                    c23Var.f147516t = 0;
                    c23Var.f147517u = 0;
                    c23Var.f147518v = 0;
                }
            }
        }
        this.f148021m = bl.f147231a;
        this.f148022n = 0L;
        this.f148023o = 0L;
        this.f148024p = false;
    }

    @Override // yads.bl
    public final boolean isActive() {
        if (this.f148014f.f158885a != -1) {
            return Math.abs(this.f148011c - 1.0f) >= 1.0E-4f || Math.abs(this.f148012d - 1.0f) >= 1.0E-4f || this.f148014f.f158885a != this.f148013e.f158885a;
        }
        return false;
    }

    @Override // yads.bl
    public final boolean isEnded() {
        if (!this.f148024p) {
            return false;
        }
        c23 c23Var = this.f148018j;
        return c23Var == null || (c23Var.f147509m * c23Var.f147498b) * 2 == 0;
    }

    @Override // yads.bl
    public final void reset() {
        this.f148011c = 1.0f;
        this.f148012d = 1.0f;
        zk zkVar = zk.f158884e;
        this.f148013e = zkVar;
        this.f148014f = zkVar;
        this.f148015g = zkVar;
        this.f148016h = zkVar;
        ByteBuffer byteBuffer = bl.f147231a;
        this.f148019k = byteBuffer;
        this.f148020l = byteBuffer.asShortBuffer();
        this.f148021m = byteBuffer;
        this.f148010b = -1;
        this.f148017i = false;
        this.f148018j = null;
        this.f148022n = 0L;
        this.f148023o = 0L;
        this.f148024p = false;
    }

    @Override // yads.bl
    public final ByteBuffer a() {
        int i10;
        c23 c23Var = this.f148018j;
        if (c23Var != null && (i10 = c23Var.f147509m * c23Var.f147498b * 2) > 0) {
            if (this.f148019k.capacity() < i10) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f148019k = byteBufferOrder;
                this.f148020l = byteBufferOrder.asShortBuffer();
            } else {
                this.f148019k.clear();
                this.f148020l.clear();
            }
            ShortBuffer shortBuffer = this.f148020l;
            int iMin = Math.min(shortBuffer.remaining() / c23Var.f147498b, c23Var.f147509m);
            shortBuffer.put(c23Var.f147508l, 0, c23Var.f147498b * iMin);
            int i11 = c23Var.f147509m - iMin;
            c23Var.f147509m = i11;
            short[] sArr = c23Var.f147508l;
            int i12 = c23Var.f147498b;
            System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
            this.f148023o += (long) i10;
            this.f148019k.limit(i10);
            this.f148021m = this.f148019k;
        }
        ByteBuffer byteBuffer = this.f148021m;
        this.f148021m = bl.f147231a;
        return byteBuffer;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            c23 c23Var = this.f148018j;
            c23Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f148022n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = c23Var.f147498b;
            int i11 = iRemaining2 / i10;
            short[] sArrB = c23Var.b(c23Var.f147506j, c23Var.f147507k, i11);
            c23Var.f147506j = sArrB;
            shortBufferAsShortBuffer.get(sArrB, c23Var.f147507k * c23Var.f147498b, ((i10 * i11) * 2) / 2);
            c23Var.f147507k += i11;
            c23Var.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }
}
