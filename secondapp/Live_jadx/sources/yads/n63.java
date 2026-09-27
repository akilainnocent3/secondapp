package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f152900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f152901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152903d;

    public n63() {
        this(0);
    }

    public static Object[] b() {
        return new Object[10];
    }

    public final synchronized void a(Object obj, long j10) {
        try {
            int i10 = this.f152903d;
            if (i10 > 0) {
                if (j10 <= this.f152900a[((this.f152902c + i10) - 1) % this.f152901b.length]) {
                    a();
                }
            }
            int length = this.f152901b.length;
            if (this.f152903d >= length) {
                int i11 = length * 2;
                long[] jArr = new long[i11];
                Object[] objArr = new Object[i11];
                int i12 = this.f152902c;
                int i13 = length - i12;
                System.arraycopy(this.f152900a, i12, jArr, 0, i13);
                System.arraycopy(this.f152901b, this.f152902c, objArr, 0, i13);
                int i14 = this.f152902c;
                if (i14 > 0) {
                    System.arraycopy(this.f152900a, 0, jArr, i13, i14);
                    System.arraycopy(this.f152901b, 0, objArr, i13, this.f152902c);
                }
                this.f152900a = jArr;
                this.f152901b = objArr;
                this.f152902c = 0;
            }
            int i15 = this.f152902c;
            int i16 = this.f152903d;
            Object[] objArr2 = this.f152901b;
            int length2 = (i15 + i16) % objArr2.length;
            this.f152900a[length2] = j10;
            objArr2[length2] = obj;
            this.f152903d = i16 + 1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Object c() {
        Object obj;
        int i10 = this.f152903d;
        obj = null;
        if (i10 != 0) {
            if (i10 <= 0) {
                throw new IllegalStateException();
            }
            Object[] objArr = this.f152901b;
            int i11 = this.f152902c;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            this.f152902c = (i11 + 1) % objArr.length;
            this.f152903d = i10 - 1;
            obj = obj2;
        }
        return obj;
    }

    public n63(int i10) {
        this.f152900a = new long[10];
        this.f152901b = b();
    }

    public final synchronized void a() {
        this.f152902c = 0;
        this.f152903d = 0;
        Arrays.fill(this.f152901b, (Object) null);
    }

    public final Object a(long j10, boolean z10) {
        long j11 = Long.MAX_VALUE;
        Object obj = null;
        while (true) {
            int i10 = this.f152903d;
            if (i10 <= 0) {
                break;
            }
            long[] jArr = this.f152900a;
            int i11 = this.f152902c;
            long j12 = j10 - jArr[i11];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            if (i10 > 0) {
                Object[] objArr = this.f152901b;
                obj = objArr[i11];
                objArr[i11] = null;
                this.f152902c = (i11 + 1) % objArr.length;
                this.f152903d = i10 - 1;
                j11 = j12;
            } else {
                throw new IllegalStateException();
            }
        }
        return obj;
    }

    public final synchronized Object a(long j10) {
        return a(j10, true);
    }
}
