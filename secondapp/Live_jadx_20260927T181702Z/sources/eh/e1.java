package eh;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e1<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f80938e = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f80939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V[] f80940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80942d;

    public e1() {
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
        int i10 = this.f80941c;
        int i11 = this.f80942d;
        V[] vArr = this.f80940b;
        int length = (i10 + i11) % vArr.length;
        this.f80939a[length] = j10;
        vArr[length] = v10;
        this.f80942d = i11 + 1;
    }

    public synchronized void c() {
        this.f80941c = 0;
        this.f80942d = 0;
        Arrays.fill(this.f80940b, (Object) null);
    }

    public final void d(long j10) {
        int i10 = this.f80942d;
        if (i10 > 0) {
            if (j10 <= this.f80939a[((this.f80941c + i10) - 1) % this.f80940b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f80940b.length;
        if (this.f80942d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f80941c;
        int i12 = length - i11;
        System.arraycopy(this.f80939a, i11, jArr, 0, i12);
        System.arraycopy(this.f80940b, this.f80941c, vArr, 0, i12);
        int i13 = this.f80941c;
        if (i13 > 0) {
            System.arraycopy(this.f80939a, 0, jArr, i12, i13);
            System.arraycopy(this.f80940b, 0, vArr, i12, this.f80941c);
        }
        this.f80939a = jArr;
        this.f80940b = vArr;
        this.f80941c = 0;
    }

    @Nullable
    public synchronized V g(long j10) {
        return h(j10, false);
    }

    @Nullable
    public final V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f80942d > 0) {
            long j12 = j10 - this.f80939a[this.f80941c];
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
        return this.f80942d == 0 ? null : k();
    }

    @Nullable
    public synchronized V j(long j10) {
        return h(j10, true);
    }

    @Nullable
    public final V k() {
        a.i(this.f80942d > 0);
        V[] vArr = this.f80940b;
        int i10 = this.f80941c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f80941c = (i10 + 1) % vArr.length;
        this.f80942d--;
        return v10;
    }

    public synchronized int l() {
        return this.f80942d;
    }

    public e1(int i10) {
        this.f80939a = new long[i10];
        this.f80940b = (V[]) f(i10);
    }
}
