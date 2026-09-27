package c5;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class o extends k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f22440s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f22441t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f22442u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f22443v = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ByteBuffer f22446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public androidx.media3.common.a f22449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f22450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public int[] f22451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public ByteBuffer f22455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k.a<o> f22456r;

    public o(k.a<o> aVar) {
        this.f22456r = aVar;
    }

    public static boolean s(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < Integer.MAX_VALUE / i11;
    }

    @Override // c5.k
    public void l() {
        this.f22456r.a(this);
    }

    public void m(long j10, int i10, @Nullable ByteBuffer byteBuffer) {
        this.f22420c = j10;
        this.f22445g = i10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f22455q = null;
            return;
        }
        a(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f22455q;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f22455q = ByteBuffer.allocate(iLimit);
        } else {
            this.f22455q.clear();
        }
        this.f22455q.put(byteBuffer);
        this.f22455q.flip();
        byteBuffer.position(0);
    }

    public boolean n(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (this.f22450l == null) {
            this.f22450l = new ByteBuffer[3];
        }
        ByteBuffer byteBuffer = this.f22446h;
        if (byteBuffer == null) {
            return false;
        }
        this.f22447i = i11;
        this.f22448j = i12;
        this.f22452n = i15;
        ByteBuffer[] byteBufferArr = this.f22450l;
        int i17 = i13 * i12;
        int i18 = (i12 >> 1) * i14;
        int i19 = i13 * i16;
        byteBuffer.position(i10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferArr[0] = byteBufferSlice;
        byteBufferSlice.limit(i17);
        byteBuffer.position(i19 + i10);
        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
        byteBufferArr[1] = byteBufferSlice2;
        byteBufferSlice2.limit(i18);
        byteBuffer.position(i19 + ((i16 >> 1) * i14) + i10);
        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
        byteBufferArr[2] = byteBufferSlice3;
        byteBufferSlice3.limit(i18);
        if (this.f22451m == null) {
            this.f22451m = new int[3];
        }
        int[] iArr = this.f22451m;
        iArr[0] = i13;
        iArr[1] = i14;
        iArr[2] = i14;
        return true;
    }

    public void o(int i10, int i11) {
        this.f22447i = i10;
        this.f22448j = i11;
    }

    public boolean q(int i10, int i11, int i12, int i13, int i14) {
        this.f22447i = i10;
        this.f22448j = i11;
        this.f22452n = i14;
        this.f22453o = i12;
        this.f22454p = i13;
        int i15 = (int) ((((long) i11) + 1) / 2);
        if (s(i12, i11) && s(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (s(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f22446h;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f22446h = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f22446h.position(0);
                    this.f22446h.limit(i18);
                }
                if (this.f22450l == null) {
                    this.f22450l = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f22446h;
                ByteBuffer[] byteBufferArr = this.f22450l;
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferArr[0] = byteBufferSlice;
                byteBufferSlice.limit(i16);
                byteBuffer2.position(i16);
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                byteBufferArr[1] = byteBufferSlice2;
                byteBufferSlice2.limit(i17);
                byteBuffer2.position(i16 + i17);
                ByteBuffer byteBufferSlice3 = byteBuffer2.slice();
                byteBufferArr[2] = byteBufferSlice3;
                byteBufferSlice3.limit(i17);
                if (this.f22451m == null) {
                    this.f22451m = new int[3];
                }
                int[] iArr = this.f22451m;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }
}
