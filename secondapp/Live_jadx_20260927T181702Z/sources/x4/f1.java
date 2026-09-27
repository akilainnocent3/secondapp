package x4;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class f1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144286e = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f144287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f144288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144290d;

    public f1() {
        this(10);
    }

    public static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public final void b(long j10, V v10) {
        int i10 = this.f144289c;
        int i11 = this.f144290d;
        V[] vArr = this.f144288b;
        int length = (i10 + i11) % vArr.length;
        this.f144287a[length] = j10;
        vArr[length] = v10;
        this.f144290d = i11 + 1;
    }

    public synchronized void c() {
        this.f144289c = 0;
        this.f144290d = 0;
        Arrays.fill(this.f144288b, (Object) null);
    }

    public final void d(long j10) {
        int i10 = this.f144290d;
        if (i10 > 0) {
            if (j10 <= this.f144287a[((this.f144289c + i10) - 1) % this.f144288b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f144288b.length;
        if (this.f144290d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f144289c;
        int i12 = length - i11;
        System.arraycopy(this.f144287a, i11, jArr, 0, i12);
        System.arraycopy(this.f144288b, this.f144289c, vArr, 0, i12);
        int i13 = this.f144289c;
        if (i13 > 0) {
            System.arraycopy(this.f144287a, 0, jArr, i12, i13);
            System.arraycopy(this.f144288b, 0, vArr, i12, this.f144289c);
        }
        this.f144287a = jArr;
        this.f144288b = vArr;
        this.f144289c = 0;
    }

    @Nullable
    public synchronized V g(long j10) {
        return h(j10, false);
    }

    @Nullable
    public final V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f144290d > 0) {
            long j12 = j10 - this.f144287a[this.f144289c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    @Nullable
    public synchronized V i() {
        return this.f144290d == 0 ? null : k();
    }

    @Nullable
    public synchronized V j(long j10) {
        return h(j10, true);
    }

    @Nullable
    public final V k() {
        zi.l0.g0(this.f144290d > 0);
        V[] vArr = this.f144288b;
        int i10 = this.f144289c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f144289c = (i10 + 1) % vArr.length;
        this.f144290d--;
        return v10;
    }

    public synchronized int l() {
        return this.f144290d;
    }

    public f1(int i10) {
        this.f144287a = new long[i10];
        this.f144288b = (V[]) f(i10);
    }
}
