package ye;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class o extends j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f159249p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f159250q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f159251r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f159252s = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f159254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ByteBuffer f159255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f159256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f159257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public n2 f159258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f159259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public int[] f159260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f159261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ByteBuffer f159262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j.a<o> f159263o;

    public o(j.a<o> aVar) {
        this.f159263o = aVar;
    }

    public static boolean q(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            return false;
        }
        return i11 <= 0 || i10 < Integer.MAX_VALUE / i11;
    }

    @Override // ye.j
    public void l() {
        this.f159263o.a(this);
    }

    public void m(long j10, int i10, @Nullable ByteBuffer byteBuffer) {
        this.f159206c = j10;
        this.f159254f = i10;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            this.f159262n = null;
            return;
        }
        a(268435456);
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.f159262n;
        if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
            this.f159262n = ByteBuffer.allocate(iLimit);
        } else {
            this.f159262n.clear();
        }
        this.f159262n.put(byteBuffer);
        this.f159262n.flip();
        byteBuffer.position(0);
    }

    public void n(int i10, int i11) {
        this.f159256h = i10;
        this.f159257i = i11;
    }

    public boolean o(int i10, int i11, int i12, int i13, int i14) {
        this.f159256h = i10;
        this.f159257i = i11;
        this.f159261m = i14;
        int i15 = (int) ((((long) i11) + 1) / 2);
        if (q(i12, i11) && q(i13, i15)) {
            int i16 = i11 * i12;
            int i17 = i15 * i13;
            int i18 = (i17 * 2) + i16;
            if (q(i17, 2) && i18 >= i16) {
                ByteBuffer byteBuffer = this.f159255g;
                if (byteBuffer == null || byteBuffer.capacity() < i18) {
                    this.f159255g = ByteBuffer.allocateDirect(i18);
                } else {
                    this.f159255g.position(0);
                    this.f159255g.limit(i18);
                }
                if (this.f159259k == null) {
                    this.f159259k = new ByteBuffer[3];
                }
                ByteBuffer byteBuffer2 = this.f159255g;
                ByteBuffer[] byteBufferArr = this.f159259k;
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
                if (this.f159260l == null) {
                    this.f159260l = new int[3];
                }
                int[] iArr = this.f159260l;
                iArr[0] = i12;
                iArr[1] = i13;
                iArr[2] = i13;
                return true;
            }
        }
        return false;
    }
}
