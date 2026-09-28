package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class tf {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public tf(tf tfVar) {
        this.a = 0;
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        uf ufVar = (uf) tfVar.e;
        uf ufVar2 = new uf();
        uf.a aVar = ufVar.e;
        ufVar2.e = aVar;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            byte[] bArr = ufVar.a;
            ufVar2.a = Arrays.copyOf(bArr, bArr.length);
        } else if (iOrdinal == 1) {
            short[] sArr = ufVar.b;
            ufVar2.b = Arrays.copyOf(sArr, sArr.length);
        } else if (iOrdinal == 2) {
            int[] iArr = ufVar.c;
            ufVar2.c = Arrays.copyOf(iArr, iArr.length);
        } else if (iOrdinal == 3) {
            long[] jArr = ufVar.d;
            ufVar2.d = Arrays.copyOf(jArr, jArr.length);
        }
        this.e = ufVar2;
        this.c = tfVar.c;
        this.b = tfVar.b;
        this.d = tfVar.d;
    }

    public long a(int i) {
        int i2;
        if (i < this.c || i > this.b) {
            return 0L;
        }
        uf ufVar = (uf) this.e;
        int iB = i - this.d;
        if (iB >= ufVar.b()) {
            iB -= ufVar.b();
        } else if (iB < 0) {
            iB += ufVar.b();
        }
        int iOrdinal = ufVar.e.ordinal();
        if (iOrdinal == 0) {
            i2 = ufVar.a[iB];
        } else if (iOrdinal == 1) {
            i2 = ufVar.b[iB];
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return 0L;
                }
                return ufVar.d[iB];
            }
            i2 = ufVar.c[iB];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public boolean b(int i, long j) {
        int iB;
        uf ufVar = (uf) this.e;
        if (this.d == Integer.MIN_VALUE) {
            this.c = i;
            this.b = i;
            this.d = i;
            ufVar.a(0, j);
            return true;
        }
        int i2 = this.b;
        int i3 = this.c;
        if (i > i2) {
            if ((((long) i) - ((long) i3)) + 1 <= ufVar.b()) {
                this.b = i;
                iB = i - this.d;
                if (iB >= ufVar.b()) {
                    iB -= ufVar.b();
                } else if (iB < 0) {
                    iB += ufVar.b();
                }
                ufVar.a(iB, j);
                return true;
            }
            return false;
        }
        if (i < i3) {
            if ((((long) i2) - ((long) i)) + 1 <= ufVar.b()) {
                this.c = i;
            }
            return false;
        }
        iB = i - this.d;
        if (iB >= ufVar.b()) {
            iB -= ufVar.b();
        } else if (iB < 0) {
            iB += ufVar.b();
        }
        ufVar.a(iB, j);
        return true;
    }

    public synchronized void c(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            d();
        }
    }

    public synchronized void d() {
        int iMax = Math.max(0, jrh0.f(this.b, 65536) - this.c);
        int i = this.d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((bw[]) this.e, iMax, i, (Object) null);
        this.d = iMax;
    }

    public String toString() {
        int i;
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("{");
                for (int i2 = this.c; i2 <= this.b && (i = this.c) != Integer.MIN_VALUE; i2++) {
                    if (i2 != i) {
                        sb.append(',');
                    }
                    sb.append(i2);
                    sb.append('=');
                    sb.append(a(i2));
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public tf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = 0;
                this.e = new bw[100];
                break;
            default:
                this.b = Integer.MIN_VALUE;
                this.c = Integer.MIN_VALUE;
                this.d = Integer.MIN_VALUE;
                uf ufVar = new uf();
                ufVar.e = uf.a.a;
                ufVar.a = new byte[160];
                this.e = ufVar;
                break;
        }
    }
}
