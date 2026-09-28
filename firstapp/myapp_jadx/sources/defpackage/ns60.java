package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ns60 {
    public final tf a;
    public final nsz b;
    public a c;
    public a d;
    public a e;
    public long f;

    public static final class a {
        public long a;
        public long b;
        public bw c;
        public a d;

        public a(long j) {
            ly0.f(this.c == null);
            this.a = j;
            this.b = j + 65536;
        }
    }

    public ns60(tf tfVar) {
        this.a = tfVar;
        tfVar.getClass();
        this.b = new nsz(32);
        a aVar = new a(0L);
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
    }

    public static a d(a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVar.b - j));
            bw bwVar = aVar.c;
            byteBuffer.put(bwVar.a, ((int) (j - aVar.a)) + bwVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVar.b - j));
            bw bwVar = aVar.c;
            System.arraycopy(bwVar.a, ((int) (j - aVar.a)) + bwVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a f(a aVar, g5d g5dVar, ps60.a aVar2, nsz nszVar) {
        if (g5dVar.i(1073741824)) {
            long j = aVar2.b;
            int iC = 1;
            nszVar.F(1);
            a aVarE = e(aVar, j, nszVar.a, 1);
            long j2 = j + 1;
            byte b = nszVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            v3c v3cVar = g5dVar.c;
            byte[] bArr = v3cVar.a;
            if (bArr == null) {
                v3cVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(aVarE, j2, v3cVar.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                nszVar.F(2);
                aVar = e(aVar, j3, nszVar.a, 2);
                j3 += 2;
                iC = nszVar.C();
            }
            int[] iArr = v3cVar.d;
            if (iArr == null || iArr.length < iC) {
                iArr = new int[iC];
            }
            int[] iArr2 = v3cVar.e;
            if (iArr2 == null || iArr2.length < iC) {
                iArr2 = new int[iC];
            }
            if (z) {
                int i2 = iC * 6;
                nszVar.F(i2);
                aVar = e(aVar, j3, nszVar.a, i2);
                j3 += (long) i2;
                nszVar.I(0);
                for (int i3 = 0; i3 < iC; i3++) {
                    iArr[i3] = nszVar.C();
                    iArr2[i3] = nszVar.A();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.a - ((int) (j3 - aVar2.b));
            }
            njg0.a aVar3 = aVar2.c;
            String str = jrh0.a;
            byte[] bArr2 = aVar3.b;
            byte[] bArr3 = v3cVar.a;
            int i4 = aVar3.a;
            int i5 = aVar3.c;
            int i6 = aVar3.d;
            v3cVar.f = iC;
            v3cVar.d = iArr;
            v3cVar.e = iArr2;
            v3cVar.b = bArr2;
            v3cVar.a = bArr3;
            v3cVar.c = i4;
            v3cVar.g = i5;
            v3cVar.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = v3cVar.i;
            cryptoInfo.numSubSamples = iC;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            v3c.a aVar4 = v3cVar.j;
            MediaCodec.CryptoInfo.Pattern pattern = aVar4.b;
            pattern.set(i5, i6);
            aVar4.a.setPattern(pattern);
            long j4 = aVar2.b;
            int i7 = (int) (j3 - j4);
            aVar2.b = j4 + ((long) i7);
            aVar2.a -= i7;
        }
        if (!g5dVar.i(268435456)) {
            g5dVar.l(aVar2.a);
            return d(aVar, aVar2.b, g5dVar.d, aVar2.a);
        }
        nszVar.F(4);
        a aVarE2 = e(aVar, aVar2.b, nszVar.a, 4);
        int iA = nszVar.A();
        aVar2.b += 4;
        aVar2.a -= 4;
        g5dVar.l(iA);
        a aVarD = d(aVarE2, aVar2.b, g5dVar.d, iA);
        aVar2.b += (long) iA;
        int i8 = aVar2.a - iA;
        aVar2.a = i8;
        ByteBuffer byteBuffer = g5dVar.i;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            g5dVar.i = ByteBuffer.allocate(i8);
        } else {
            g5dVar.i.clear();
        }
        return d(aVarD, aVar2.b, g5dVar.i, aVar2.a);
    }

    public final void a(a aVar) {
        if (aVar.c == null) {
            return;
        }
        tf tfVar = this.a;
        synchronized (tfVar) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                try {
                    bw[] bwVarArr = (bw[]) tfVar.e;
                    int i = tfVar.d;
                    tfVar.d = i + 1;
                    bw bwVar = aVar2.c;
                    bwVar.getClass();
                    bwVarArr[i] = bwVar;
                    tfVar.c--;
                    aVar2 = aVar2.d;
                    if (aVar2 == null || aVar2.c == null) {
                        aVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            tfVar.notifyAll();
        }
        aVar.c = null;
        aVar.d = null;
    }

    public final void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.c;
            if (j < aVar.b) {
                break;
            }
            tf tfVar = this.a;
            bw bwVar = aVar.c;
            synchronized (tfVar) {
                bw[] bwVarArr = (bw[]) tfVar.e;
                int i = tfVar.d;
                tfVar.d = i + 1;
                bwVarArr[i] = bwVar;
                tfVar.c--;
                tfVar.notifyAll();
            }
            a aVar2 = this.c;
            aVar2.c = null;
            a aVar3 = aVar2.d;
            aVar2.d = null;
            this.c = aVar3;
        }
        if (this.d.a < aVar.a) {
            this.d = aVar;
        }
    }

    public final int c(int i) {
        bw bwVar;
        a aVar = this.e;
        if (aVar.c == null) {
            tf tfVar = this.a;
            synchronized (tfVar) {
                try {
                    int i2 = tfVar.c + 1;
                    tfVar.c = i2;
                    int i3 = tfVar.d;
                    if (i3 > 0) {
                        bw[] bwVarArr = (bw[]) tfVar.e;
                        int i4 = i3 - 1;
                        tfVar.d = i4;
                        bwVar = bwVarArr[i4];
                        bwVar.getClass();
                        ((bw[]) tfVar.e)[tfVar.d] = null;
                    } else {
                        bw bwVar2 = new bw(0, new byte[65536]);
                        bw[] bwVarArr2 = (bw[]) tfVar.e;
                        if (i2 > bwVarArr2.length) {
                            tfVar.e = (bw[]) Arrays.copyOf(bwVarArr2, bwVarArr2.length * 2);
                        }
                        bwVar = bwVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar2 = new a(this.e.b);
            aVar.c = bwVar;
            aVar.d = aVar2;
        }
        return Math.min(i, (int) (this.e.b - this.f));
    }
}
