package defpackage;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.util.Arrays;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class zxi0 implements k4h {
    public m4h a;
    public njg0 b;
    public b e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    public static final class a implements b {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        public final m4h a;
        public final njg0 b;
        public final ayi0 c;
        public final int d;
        public final byte[] e;
        public final nsz f;
        public final int g;
        public final androidx.media3.common.a h;
        public int i;
        public long j;
        public int k;
        public long l;

        public a(m4h m4hVar, njg0 njg0Var, ayi0 ayi0Var) throws ssz {
            this.a = m4hVar;
            this.b = njg0Var;
            this.c = ayi0Var;
            int i = ayi0Var.b;
            int iMax = Math.max(1, i / 10);
            this.g = iMax;
            nsz nszVar = new nsz(ayi0Var.e);
            nszVar.p();
            int iP = nszVar.p();
            this.d = iP;
            int i2 = ayi0Var.a;
            int i3 = ayi0Var.c;
            int i4 = (((i3 - (i2 * 4)) * 8) / (ayi0Var.d * i2)) + 1;
            if (iP != i4) {
                throw ssz.a(null, "Expected frames per block: " + i4 + "; got: " + iP);
            }
            int iF = jrh0.f(iMax, iP);
            this.e = new byte[iF * i3];
            this.f = new nsz(iP * 2 * i2 * iF);
            int i5 = ((i3 * i) * 8) / iP;
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.m = gqv.m("audio/raw");
            c0062a.h = i5;
            c0062a.i = i5;
            c0062a.n = iMax * 2 * i2;
            c0062a.E = i2;
            c0062a.F = i;
            c0062a.G = 2;
            this.h = new androidx.media3.common.a(c0062a);
        }

        @Override // zxi0.b
        public final void a(int i, long j) {
            this.a.k(new cyi0(this.c, this.d, i, j));
            this.b.d(this.h);
        }

        @Override // zxi0.b
        public final void b(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004a  */
        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0054  */
        /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:37:0x0135  */
        /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // zxi0.b
        public final boolean c(l4h l4hVar, long j) {
            byte[] bArr;
            int i;
            int i2;
            int i3;
            nsz nszVar;
            int i4;
            int i5;
            int i6;
            byte[] bArr2;
            int i7;
            int i8;
            int i9;
            int iMin;
            int[] iArr;
            int i10;
            int i11;
            int i12;
            byte b;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19 = this.k;
            ayi0 ayi0Var = this.c;
            int i20 = i19 / (ayi0Var.a * 2);
            int i21 = this.g;
            int i22 = this.d;
            int iF = jrh0.f(i21 - i20, i22);
            int i23 = ayi0Var.c;
            int i24 = iF * i23;
            boolean z = j == 0;
            while (true) {
                bArr = this.e;
                if (z && (i17 = this.i) < i24) {
                    i18 = l4hVar.read(bArr, this.i, (int) Math.min(i24 - i17, j));
                    if (i18 == -1) {
                        break;
                    }
                    this.i += i18;
                    bArr = this.e;
                    if (z) {
                    }
                }
                i = this.i / i23;
                if (i > 0) {
                    i3 = 0;
                    while (true) {
                        nszVar = this.f;
                        if (i3 < i) {
                            break;
                        }
                        i5 = 0;
                        while (true) {
                            i6 = ayi0Var.a;
                            if (i5 < i6) {
                                bArr2 = nszVar.a;
                                int i25 = (i5 * 4) + (i3 * i23);
                                i7 = (i6 * 4) + i25;
                                i8 = (i23 / i6) - 4;
                                i9 = (short) ((bArr[i25] & 255) | ((bArr[i25 + 1] & 255) << 8));
                                int i26 = i;
                                iMin = Math.min(bArr[i25 + 2] & 255, 88);
                                iArr = n;
                                i10 = iArr[iMin];
                                i11 = ((i3 * i22 * i6) + i5) * 2;
                                bArr2[i11] = (byte) (i9 & 255);
                                bArr2[i11 + 1] = (byte) (i9 >> 8);
                                int i27 = i3;
                                i12 = 0;
                                while (i12 < i8 * 2) {
                                    b = bArr[((i12 / 8) * i6 * 4) + i7 + ((i12 / 2) % 4)];
                                    i13 = i12;
                                    i14 = b & 255;
                                    if (i13 % 2 == 0) {
                                        i15 = b & 15;
                                    } else {
                                        i15 = i14 >> 4;
                                    }
                                    i16 = ((((i15 & 7) * 2) + 1) * i10) >> 3;
                                    if ((i15 & 8) != 0) {
                                        i16 = -i16;
                                    }
                                    i9 = jrh0.i(i9 + i16, -32768, 32767);
                                    i11 = (i6 * 2) + i11;
                                    bArr2[i11] = (byte) (i9 & 255);
                                    bArr2[i11 + 1] = (byte) (i9 >> 8);
                                    iMin = jrh0.i(iMin + m[i15], 0, 88);
                                    i10 = iArr[iMin];
                                    i12 = i13 + 1;
                                }
                                i5++;
                                i = i26;
                                i3 = i27;
                            }
                        }
                        i3++;
                    }
                    int i28 = i;
                    int i29 = i22 * i28 * 2 * ayi0Var.a;
                    nszVar.I(0);
                    nszVar.H(i29);
                    this.i -= i28 * i23;
                    int i30 = nszVar.c;
                    this.b.f(i30, nszVar);
                    i4 = this.k + i30;
                    this.k = i4;
                    if (i4 / (ayi0Var.a * 2) >= i21) {
                        d(i21);
                    }
                }
                if (z && (i2 = this.k / (ayi0Var.a * 2)) > 0) {
                    d(i2);
                }
                return z;
            }
            while (true) {
                bArr = this.e;
                if (z) {
                }
                i = this.i / i23;
                if (i > 0) {
                    i3 = 0;
                    while (true) {
                        nszVar = this.f;
                        if (i3 < i) {
                            break;
                            break;
                        }
                        i5 = 0;
                        while (true) {
                            i6 = ayi0Var.a;
                            if (i5 < i6) {
                                bArr2 = nszVar.a;
                                int i210 = (i5 * 4) + (i3 * i23);
                                i7 = (i6 * 4) + i210;
                                i8 = (i23 / i6) - 4;
                                i9 = (short) ((bArr[i210] & 255) | ((bArr[i210 + 1] & 255) << 8));
                                int i211 = i;
                                iMin = Math.min(bArr[i210 + 2] & 255, 88);
                                iArr = n;
                                i10 = iArr[iMin];
                                i11 = ((i3 * i22 * i6) + i5) * 2;
                                bArr2[i11] = (byte) (i9 & 255);
                                bArr2[i11 + 1] = (byte) (i9 >> 8);
                                int i212 = i3;
                                i12 = 0;
                                while (i12 < i8 * 2) {
                                    b = bArr[((i12 / 8) * i6 * 4) + i7 + ((i12 / 2) % 4)];
                                    i13 = i12;
                                    i14 = b & 255;
                                    if (i13 % 2 == 0) {
                                        i15 = b & 15;
                                    } else {
                                        i15 = i14 >> 4;
                                    }
                                    i16 = ((((i15 & 7) * 2) + 1) * i10) >> 3;
                                    if ((i15 & 8) != 0) {
                                        i16 = -i16;
                                    }
                                    i9 = jrh0.i(i9 + i16, -32768, 32767);
                                    i11 = (i6 * 2) + i11;
                                    bArr2[i11] = (byte) (i9 & 255);
                                    bArr2[i11 + 1] = (byte) (i9 >> 8);
                                    iMin = jrh0.i(iMin + m[i15], 0, 88);
                                    i10 = iArr[iMin];
                                    i12 = i13 + 1;
                                }
                                i5++;
                                i = i211;
                                i3 = i212;
                            }
                        }
                        i3++;
                    }
                    int i213 = i;
                    int i214 = i22 * i213 * 2 * ayi0Var.a;
                    nszVar.I(0);
                    nszVar.H(i214);
                    this.i -= i213 * i23;
                    int i31 = nszVar.c;
                    this.b.f(i31, nszVar);
                    i4 = this.k + i31;
                    this.k = i4;
                    if (i4 / (ayi0Var.a * 2) >= i21) {
                        d(i21);
                    }
                }
                if (z) {
                    d(i2);
                }
                return z;
                this.i += i18;
            }
        }

        public final void d(int i) {
            long j = this.j;
            long j2 = this.l;
            ayi0 ayi0Var = this.c;
            long j3 = ayi0Var.b;
            String str = jrh0.a;
            long jV = j + jrh0.V(j2, 1000000L, j3, RoundingMode.DOWN);
            int i2 = i * 2 * ayi0Var.a;
            this.b.a(jV, 1, i2, this.k - i2, null);
            this.l += (long) i;
            this.k -= i2;
        }
    }

    public interface b {
        void a(int i, long j);

        void b(long j);

        boolean c(l4h l4hVar, long j);
    }

    public static final class c implements b {
        public final m4h a;
        public final njg0 b;
        public final ayi0 c;
        public final androidx.media3.common.a d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public c(m4h m4hVar, njg0 njg0Var, ayi0 ayi0Var, String str, int i) throws ssz {
            this.a = m4hVar;
            this.b = njg0Var;
            this.c = ayi0Var;
            int i2 = ayi0Var.a;
            int i3 = ayi0Var.b;
            int i4 = (ayi0Var.d * i2) / 8;
            int i5 = ayi0Var.c;
            if (i5 != i4) {
                throw ssz.a(null, "Expected block size: " + i4 + "; got: " + i5);
            }
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int iMax = Math.max(i4, i6 / 10);
            this.e = iMax;
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.l = gqv.m("audio/wav");
            c0062a.m = gqv.m(str);
            c0062a.h = i7;
            c0062a.i = i7;
            c0062a.n = iMax;
            c0062a.E = i2;
            c0062a.F = i3;
            c0062a.G = i;
            this.d = new androidx.media3.common.a(c0062a);
        }

        @Override // zxi0.b
        public final void a(int i, long j) {
            this.a.k(new cyi0(this.c, 1, i, j));
            this.b.d(this.d);
        }

        @Override // zxi0.b
        public final void b(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }

        @Override // zxi0.b
        public final boolean c(l4h l4hVar, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iC = this.b.c(l4hVar, (int) Math.min(i2 - i, j2), true);
                if (iC == -1) {
                    j2 = 0;
                } else {
                    this.g += iC;
                    j2 -= (long) iC;
                }
            }
            ayi0 ayi0Var = this.c;
            int i3 = ayi0Var.c;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long j3 = this.f;
                long j4 = this.h;
                long j5 = ayi0Var.b;
                String str = jrh0.a;
                long jV = j3 + jrh0.V(j4, 1000000L, j5, RoundingMode.DOWN);
                int i5 = i4 * i3;
                int i6 = this.g - i5;
                this.b.a(jV, 1, i5, i6, null);
                this.h += (long) i4;
                this.g = i6;
            }
            return j2 <= 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0226  */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        byte[] bArr;
        int i;
        ly0.g(this.b);
        String str = jrh0.a;
        int i2 = this.c;
        int iA = 4;
        if (i2 == 0) {
            ly0.f(l4hVar.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                l4hVar.l(i3);
                this.c = 4;
                return 0;
            }
            if (!byi0.a(l4hVar)) {
                throw ssz.a(null, "Unsupported or unrecognized wav file type.");
            }
            l4hVar.l((int) (l4hVar.h() - l4hVar.getPosition()));
            this.c = 1;
            return 0;
        }
        long jM = -1;
        if (i2 == 1) {
            nsz nszVar = new nsz(8);
            byi0.a aVarA = byi0.a.a(l4hVar, nszVar);
            if (aVarA.a != 1685272116) {
                l4hVar.e();
            } else {
                l4hVar.i(8);
                nszVar.I(0);
                l4hVar.m(nszVar.a, 0, 8);
                jM = nszVar.m();
                l4hVar.l(((int) aVarA.b) + 8);
            }
            this.d = jM;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    fm20.a();
                    return 0;
                }
                ly0.f(this.g != -1);
                long position = this.g - l4hVar.getPosition();
                b bVar = this.e;
                bVar.getClass();
                return bVar.c(l4hVar, position) ? -1 : 0;
            }
            l4hVar.e();
            byi0.a aVarB = byi0.b(1684108385, l4hVar, new nsz(8));
            l4hVar.l(8);
            Pair pairCreate = Pair.create(Long.valueOf(l4hVar.getPosition()), Long.valueOf(aVarB.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = l4hVar.getLength();
            if (length != -1 && this.g > length) {
                cft.g("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            b bVar2 = this.e;
            bVar2.getClass();
            bVar2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        nsz nszVar2 = new nsz(16);
        long j2 = byi0.b(1718449184, l4hVar, nszVar2).b;
        ly0.f(j2 >= 16);
        l4hVar.m(nszVar2.a, 0, 16);
        nszVar2.I(0);
        int iP = nszVar2.p();
        int iP2 = nszVar2.p();
        int iO = nszVar2.o();
        nszVar2.o();
        int iP3 = nszVar2.p();
        int iP4 = nszVar2.p();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            l4hVar.m(bArr, 0, i4);
            if (iP == 65534 && i4 == 24) {
                nsz nszVar3 = new nsz(bArr);
                nszVar3.p();
                int iP5 = nszVar3.p();
                if (iP5 != 0 && iP5 != iP4) {
                    throw ssz.c("validBits ( " + iP5 + ")  != bitsPerSample( " + iP4 + ") are not supported");
                }
                int iO2 = nszVar3.o();
                if ((iO2 >> 18) != 0) {
                    throw ssz.c("invalid channel mask " + iO2);
                }
                if (iO2 != 0 && Integer.bitCount(iO2) != iP2) {
                    throw ssz.c("invalid number of channels (" + Integer.bitCount(iO2) + ") in channel mask " + iO2);
                }
                iP = nszVar3.p();
                byte[] bArr2 = new byte[14];
                nszVar3.h(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, byi0.a) && !Arrays.equals(bArr2, byi0.b)) {
                    throw ssz.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = jrh0.b;
        }
        byte[] bArr3 = bArr;
        int i5 = iP;
        l4hVar.l((int) (l4hVar.h() - l4hVar.getPosition()));
        ayi0 ayi0Var = new ayi0(i5, iP2, iO, iP3, iP4, bArr3);
        if (i5 == 17) {
            this.e = new a(this.a, this.b, ayi0Var);
        } else if (i5 == 6) {
            this.e = new c(this.a, this.b, ayi0Var, "audio/g711-alaw", -1);
        } else if (i5 == 7) {
            this.e = new c(this.a, this.b, ayi0Var, "audio/g711-mlaw", -1);
        } else {
            if (i5 == 1) {
                iA = jrh0.A(iP4, ByteOrder.LITTLE_ENDIAN);
                i = iA;
            } else {
                if (i5 != 3) {
                    if (i5 == 65534) {
                        iA = jrh0.A(iP4, ByteOrder.LITTLE_ENDIAN);
                        i = iA;
                    }
                } else if (iP4 == 32) {
                    i = iA;
                }
                i = 0;
            }
            if (i == 0) {
                throw ssz.c("Unsupported WAV format type: " + i5);
            }
            this.e = new c(this.a, this.b, ayi0Var, "audio/raw", i);
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        return byi0.a(l4hVar);
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(j2);
        }
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.a = m4hVar;
        this.b = m4hVar.r(0, 1);
        m4hVar.n();
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
