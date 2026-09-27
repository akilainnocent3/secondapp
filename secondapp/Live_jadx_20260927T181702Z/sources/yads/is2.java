package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class is2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe f150787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f150789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2 f150790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hs2 f150791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hs2 f150792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f150793g;

    public is2(qe qeVar) {
        this.f150787a = qeVar;
        int iB = ((ib0) qeVar).b();
        this.f150788b = iB;
        this.f150789c = new jb2(32);
        hs2 hs2Var = new hs2(iB, 0L);
        this.f150790d = hs2Var;
        this.f150791e = hs2Var;
        this.f150792f = hs2Var;
    }

    public final void a(hs2 hs2Var) {
        if (hs2Var.f150269c == null) {
            return;
        }
        ib0 ib0Var = (ib0) this.f150787a;
        synchronized (ib0Var) {
            hs2 hs2Var2 = hs2Var;
            while (hs2Var2 != null) {
                try {
                    pe[] peVarArr = ib0Var.f150510g;
                    int i10 = ib0Var.f150509f;
                    ib0Var.f150509f = i10 + 1;
                    pe peVar = hs2Var2.f150269c;
                    peVar.getClass();
                    peVarArr[i10] = peVar;
                    ib0Var.f150508e--;
                    hs2Var2 = hs2Var2.f150270d;
                    if (hs2Var2 == null || hs2Var2.f150269c == null) {
                        hs2Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ib0Var.notifyAll();
        }
        hs2Var.f150269c = null;
        hs2Var.f150270d = null;
    }

    public final void a(long j10) {
        hs2 hs2Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            hs2Var = this.f150790d;
            if (j10 < hs2Var.f150268b) {
                break;
            }
            qe qeVar = this.f150787a;
            pe peVar = hs2Var.f150269c;
            ib0 ib0Var = (ib0) qeVar;
            synchronized (ib0Var) {
                pe[] peVarArr = ib0Var.f150510g;
                int i10 = ib0Var.f150509f;
                ib0Var.f150509f = i10 + 1;
                peVarArr[i10] = peVar;
                ib0Var.f150508e--;
                ib0Var.notifyAll();
            }
            hs2 hs2Var2 = this.f150790d;
            hs2Var2.f150269c = null;
            hs2 hs2Var3 = hs2Var2.f150270d;
            hs2Var2.f150270d = null;
            this.f150790d = hs2Var3;
        }
        if (this.f150791e.f150267a < hs2Var.f150267a) {
            this.f150791e = hs2Var;
        }
    }

    public static hs2 a(hs2 hs2Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= hs2Var.f150268b) {
            hs2Var = hs2Var.f150270d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (hs2Var.f150268b - j10));
            pe peVar = hs2Var.f150269c;
            byteBuffer.put(peVar.f153899a, ((int) (j10 - hs2Var.f150267a)) + peVar.f153900b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == hs2Var.f150268b) {
                hs2Var = hs2Var.f150270d;
            }
        }
        return hs2Var;
    }

    public static hs2 a(hs2 hs2Var, long j10, byte[] bArr, int i10) {
        while (j10 >= hs2Var.f150268b) {
            hs2Var = hs2Var.f150270d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (hs2Var.f150268b - j10));
            pe peVar = hs2Var.f150269c;
            System.arraycopy(peVar.f153899a, ((int) (j10 - hs2Var.f150267a)) + peVar.f153900b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == hs2Var.f150268b) {
                hs2Var = hs2Var.f150270d;
            }
        }
        return hs2Var;
    }

    public static hs2 a(hs2 hs2Var, sa0 sa0Var, js2 js2Var, jb2 jb2Var) {
        hs2 hs2VarA;
        if (sa0Var.b(1073741824)) {
            long j10 = js2Var.f151235b;
            int iR = 1;
            jb2Var.c(1);
            hs2 hs2VarA2 = a(hs2Var, j10, jb2Var.f151001a, 1);
            long j11 = j10 + 1;
            byte b10 = jb2Var.f151001a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            m20 m20Var = sa0Var.f155331c;
            byte[] bArr = m20Var.f152268a;
            if (bArr == null) {
                m20Var.f152268a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            hs2VarA = a(hs2VarA2, j11, m20Var.f152268a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                jb2Var.c(2);
                hs2VarA = a(hs2VarA, j12, jb2Var.f151001a, 2);
                j12 += 2;
                iR = jb2Var.r();
            }
            int i11 = iR;
            int[] iArr = m20Var.f152271d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = m20Var.f152272e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = i11 * 6;
                jb2Var.c(i12);
                hs2VarA = a(hs2VarA, j12, jb2Var.f151001a, i12);
                j12 += (long) i12;
                jb2Var.e(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = jb2Var.r();
                    iArr4[i13] = jb2Var.p();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = js2Var.f151234a - ((int) (j12 - js2Var.f151235b));
            }
            l73 l73Var = js2Var.f151236c;
            int i14 = ib3.f150516a;
            m20Var.a(i11, iArr2, iArr4, l73Var.f151893b, m20Var.f152268a, l73Var.f151892a, l73Var.f151894c, l73Var.f151895d);
            long j13 = js2Var.f151235b;
            int i15 = (int) (j12 - j13);
            js2Var.f151235b = j13 + ((long) i15);
            js2Var.f151234a -= i15;
        } else {
            hs2VarA = hs2Var;
        }
        if (sa0Var.b(268435456)) {
            jb2Var.c(4);
            hs2 hs2VarA3 = a(hs2VarA, js2Var.f151235b, jb2Var.f151001a, 4);
            int iP = jb2Var.p();
            js2Var.f151235b += 4;
            js2Var.f151234a -= 4;
            sa0Var.c(iP);
            hs2 hs2VarA4 = a(hs2VarA3, js2Var.f151235b, sa0Var.f155332d, iP);
            js2Var.f151235b += (long) iP;
            int i16 = js2Var.f151234a - iP;
            js2Var.f151234a = i16;
            ByteBuffer byteBuffer = sa0Var.f155335g;
            if (byteBuffer != null && byteBuffer.capacity() >= i16) {
                sa0Var.f155335g.clear();
            } else {
                sa0Var.f155335g = ByteBuffer.allocate(i16);
            }
            return a(hs2VarA4, js2Var.f151235b, sa0Var.f155335g, js2Var.f151234a);
        }
        sa0Var.c(js2Var.f151234a);
        return a(hs2VarA, js2Var.f151235b, sa0Var.f155332d, js2Var.f151234a);
    }
}
