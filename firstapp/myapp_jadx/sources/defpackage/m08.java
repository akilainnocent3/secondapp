package defpackage;

import com.google.protobuf.Reader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m08 {
    public int a;
    public final int b = 100;
    public final int c = Reader.READ_DONE;
    public o08 d;

    public static final class a extends m08 {
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;
        public int k = Reader.READ_DONE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.e = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = i;
        }

        public final int A() throws f0p {
            int i = this.h;
            if (this.f - i < 4) {
                throw f0p.g();
            }
            this.h = i + 4;
            byte[] bArr = this.e;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long B() throws f0p {
            int i = this.h;
            if (this.f - i < 8) {
                throw f0p.g();
            }
            this.h = i + 8;
            byte[] bArr = this.e;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public final int C() {
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.h = i5;
                    return i;
                }
            }
            return (int) E();
        }

        public final long D() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.h;
            int i2 = this.f;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.e;
                byte b = bArr[i];
                if (b >= 0) {
                    this.h = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.h = i4;
                    return j;
                }
            }
            return E();
        }

        public final long E() throws f0p {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.h;
                if (i2 == this.f) {
                    throw f0p.g();
                }
                this.h = i2 + 1;
                byte b = this.e[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw f0p.d();
        }

        public final void F() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = i - this.i;
            int i3 = this.k;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final void G(int i) throws f0p {
            if (i >= 0) {
                int i2 = this.f;
                int i3 = this.h;
                if (i <= i2 - i3) {
                    this.h = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw f0p.g();
            }
            throw f0p.e();
        }

        @Override // defpackage.m08
        public final void a(int i) {
            if (this.j != i) {
                throw new f0p("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // defpackage.m08
        public final int d() {
            return this.h - this.i;
        }

        @Override // defpackage.m08
        public final boolean e() {
            return this.h == this.f;
        }

        @Override // defpackage.m08
        public final void f(int i) {
            this.k = i;
            F();
        }

        @Override // defpackage.m08
        public final int g(int i) {
            if (i < 0) {
                throw f0p.e();
            }
            int iD = d() + i;
            if (iD < 0) {
                throw f0p.f();
            }
            int i2 = this.k;
            if (iD > i2) {
                throw f0p.g();
            }
            this.k = iD;
            F();
            return i2;
        }

        @Override // defpackage.m08
        public final boolean h() {
            return D() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // defpackage.m08
        public final ql5.f i() throws f0p {
            byte[] bArrCopyOfRange;
            int iC = C();
            byte[] bArr = this.e;
            if (iC > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iC <= i - i2) {
                    ql5.f fVarC = ql5.c(bArr, i2, iC);
                    this.h += iC;
                    return fVarC;
                }
            }
            if (iC == 0) {
                return ql5.b;
            }
            if (iC > 0) {
                int i3 = this.f;
                int i4 = this.h;
                if (iC <= i3 - i4) {
                    int i5 = iC + i4;
                    this.h = i5;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                } else {
                    if (iC <= 0) {
                        throw f0p.g();
                    }
                    if (iC == 0) {
                        throw f0p.e();
                    }
                    bArrCopyOfRange = gyo.b;
                }
            } else {
                if (iC <= 0) {
                    throw f0p.g();
                }
                if (iC == 0) {
                    throw f0p.e();
                }
                bArrCopyOfRange = gyo.b;
            }
            ql5.f fVar = ql5.b;
            return new ql5.f(bArrCopyOfRange);
        }

        @Override // defpackage.m08
        public final double j() {
            return Double.longBitsToDouble(B());
        }

        @Override // defpackage.m08
        public final int k() {
            return C();
        }

        @Override // defpackage.m08
        public final int l() {
            return A();
        }

        @Override // defpackage.m08
        public final long m() {
            return B();
        }

        @Override // defpackage.m08
        public final float n() {
            return Float.intBitsToFloat(A());
        }

        @Override // defpackage.m08
        public final int o() {
            return C();
        }

        @Override // defpackage.m08
        public final long p() {
            return D();
        }

        @Override // defpackage.m08
        public final int q() {
            return A();
        }

        @Override // defpackage.m08
        public final long r() {
            return B();
        }

        @Override // defpackage.m08
        public final int s() {
            return m08.b(C());
        }

        @Override // defpackage.m08
        public final long t() {
            return m08.c(D());
        }

        @Override // defpackage.m08
        public final String u() throws f0p {
            int iC = C();
            if (iC > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iC <= i - i2) {
                    String str = new String(this.e, i2, iC, gyo.a);
                    this.h += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw f0p.e();
            }
            throw f0p.g();
        }

        @Override // defpackage.m08
        public final String v() throws f0p {
            int iC = C();
            if (iC > 0) {
                int i = this.f;
                int i2 = this.h;
                if (iC <= i - i2) {
                    String strA = yqh0.a.a(this.e, i2, iC);
                    this.h += iC;
                    return strA;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw f0p.e();
            }
            throw f0p.g();
        }

        @Override // defpackage.m08
        public final int w() throws f0p {
            if (e()) {
                this.j = 0;
                return 0;
            }
            int iC = C();
            this.j = iC;
            if ((iC >>> 3) != 0) {
                return iC;
            }
            throw f0p.a();
        }

        @Override // defpackage.m08
        public final int x() {
            return C();
        }

        @Override // defpackage.m08
        public final long y() {
            return D();
        }

        @Override // defpackage.m08
        public final boolean z(int i) throws f0p {
            int iW;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.f - this.h;
                byte[] bArr = this.e;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.h;
                        this.h = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw f0p.d();
                }
                while (i3 < 10) {
                    int i6 = this.h;
                    if (i6 == this.f) {
                        throw f0p.g();
                    }
                    this.h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw f0p.d();
                return true;
            }
            if (i2 == 1) {
                G(8);
                return true;
            }
            if (i2 == 2) {
                G(C());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw f0p.c();
                }
                G(4);
                return true;
            }
            do {
                iW = w();
                if (iW == 0) {
                    break;
                }
            } while (z(iW));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    public static final class b extends m08 {
        public final ByteArrayInputStream e;
        public final byte[] f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l = Reader.READ_DONE;

        public b(ByteArrayInputStream byteArrayInputStream) {
            Charset charset = gyo.a;
            this.e = byteArrayInputStream;
            this.f = new byte[4096];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        public final byte[] A(int i) throws IOException {
            byte[] bArrB = B(i);
            if (bArrB != null) {
                return bArrB;
            }
            int i2 = this.i;
            int i3 = this.g;
            int length = i3 - i2;
            this.k += i3;
            this.i = 0;
            this.g = 0;
            ArrayList arrayListC = C(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, length);
            int size = arrayListC.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListC.get(i4);
                i4++;
                byte[] bArr2 = (byte[]) obj;
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] B(int i) throws IOException {
            if (i == 0) {
                return gyo.b;
            }
            if (i < 0) {
                throw f0p.e();
            }
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw new f0p("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.l;
            if (i4 > i5) {
                K((i5 - i2) - i3);
                throw f0p.g();
            }
            int i6 = this.g - i3;
            int i7 = i - i6;
            ByteArrayInputStream byteArrayInputStream = this.e;
            if (i7 >= 4096) {
                try {
                    if (i7 > byteArrayInputStream.available()) {
                        return null;
                    }
                } catch (f0p e) {
                    e.a = true;
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, this.i, bArr, 0, i6);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i6 < i) {
                try {
                    int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw f0p.g();
                    }
                    this.k += i8;
                    i6 += i8;
                } catch (f0p e2) {
                    e2.a = true;
                    throw e2;
                }
            }
            return bArr;
        }

        public final ArrayList C(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.e.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw f0p.g();
                    }
                    this.k += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int D() throws f0p {
            int i = this.i;
            if (this.g - i < 4) {
                J(4);
                i = this.i;
            }
            this.i = i + 4;
            byte[] bArr = this.f;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long E() throws f0p {
            int i = this.i;
            if (this.g - i < 8) {
                J(8);
                i = this.i;
            }
            this.i = i + 8;
            byte[] bArr = this.f;
            return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
        }

        public final int F() {
            int i;
            int i2 = this.i;
            int i3 = this.g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.i = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.i = i5;
                    return i;
                }
            }
            return (int) H();
        }

        public final long G() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.i;
            int i2 = this.g;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f;
                byte b = bArr[i];
                if (b >= 0) {
                    this.i = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i8]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.i = i4;
                    return j;
                }
            }
            return H();
        }

        public final long H() throws f0p {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.i == this.g) {
                    J(1);
                }
                int i2 = this.i;
                this.i = i2 + 1;
                byte b = this.f[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw f0p.d();
        }

        public final void I() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = this.k + i;
            int i3 = this.l;
            if (i2 <= i3) {
                this.h = 0;
                return;
            }
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
        }

        public final void J(int i) throws f0p {
            if (L(i)) {
                return;
            }
            if (i <= (this.c - this.k) - this.i) {
                throw f0p.g();
            }
            throw new f0p("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void K(int i) throws f0p {
            int i2 = this.g;
            int i3 = this.i;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.i = i3 + i;
                return;
            }
            ByteArrayInputStream byteArrayInputStream = this.e;
            if (i < 0) {
                throw f0p.e();
            }
            int i5 = this.k;
            int i6 = i5 + i3;
            int i7 = i6 + i;
            int i8 = this.l;
            if (i7 > i8) {
                K((i8 - i5) - i3);
                throw f0p.g();
            }
            this.k = i6;
            this.g = 0;
            this.i = 0;
            while (i4 < i) {
                long j = i - i4;
                try {
                    try {
                        long jSkip = byteArrayInputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } catch (f0p e) {
                        e.a = true;
                        throw e;
                    }
                } catch (Throwable th) {
                    this.k += i4;
                    I();
                    throw th;
                }
            }
            this.k += i4;
            I();
            if (i4 >= i) {
                return;
            }
            int i9 = this.g;
            int i10 = i9 - this.i;
            this.i = i9;
            J(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.g;
                if (i11 <= i12) {
                    this.i = i11;
                    return;
                } else {
                    i10 += i12;
                    this.i = i12;
                    J(1);
                }
            }
        }

        public final boolean L(int i) throws IOException {
            ByteArrayInputStream byteArrayInputStream = this.e;
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                ib5.a(pe4.b(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i5 = this.k;
            int i6 = this.c;
            if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.l) {
                byte[] bArr = this.f;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    i5 = this.k + i2;
                    this.k = i5;
                    i4 = this.g - i2;
                    this.g = i4;
                    this.i = 0;
                }
                try {
                    int i7 = byteArrayInputStream.read(bArr, i4, Math.min(bArr.length - i4, (i6 - i5) - i4));
                    if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                        l08.a(i7, byteArrayInputStream.getClass());
                        return false;
                    }
                    if (i7 > 0) {
                        this.g += i7;
                        I();
                        if (this.g >= i) {
                            return true;
                        }
                        return L(i);
                    }
                } catch (f0p e) {
                    e.a = true;
                    throw e;
                }
            }
            return false;
        }

        @Override // defpackage.m08
        public final void a(int i) throws f0p {
            if (this.j != i) {
                throw new f0p("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // defpackage.m08
        public final int d() {
            return this.k + this.i;
        }

        @Override // defpackage.m08
        public final boolean e() {
            return this.i == this.g && !L(1);
        }

        @Override // defpackage.m08
        public final void f(int i) {
            this.l = i;
            I();
        }

        @Override // defpackage.m08
        public final int g(int i) throws f0p {
            if (i < 0) {
                throw f0p.e();
            }
            int i2 = this.k + this.i + i;
            int i3 = this.l;
            if (i2 > i3) {
                throw f0p.g();
            }
            this.l = i2;
            I();
            return i3;
        }

        @Override // defpackage.m08
        public final boolean h() {
            return G() != 0;
        }

        @Override // defpackage.m08
        public final ql5.f i() throws IOException {
            int iF = F();
            int i = this.g;
            int i2 = this.i;
            int i3 = i - i2;
            byte[] bArr = this.f;
            if (iF <= i3 && iF > 0) {
                ql5.f fVarC = ql5.c(bArr, i2, iF);
                this.i += iF;
                return fVarC;
            }
            if (iF == 0) {
                return ql5.b;
            }
            byte[] bArrB = B(iF);
            if (bArrB != null) {
                return ql5.c(bArrB, 0, bArrB.length);
            }
            int i4 = this.i;
            int i5 = this.g;
            int length = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            ArrayList arrayListC = C(iF - length);
            byte[] bArr2 = new byte[iF];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            int size = arrayListC.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListC.get(i6);
                i6++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ql5.f fVar = ql5.b;
            return new ql5.f(bArr2);
        }

        @Override // defpackage.m08
        public final double j() {
            return Double.longBitsToDouble(E());
        }

        @Override // defpackage.m08
        public final int k() {
            return F();
        }

        @Override // defpackage.m08
        public final int l() {
            return D();
        }

        @Override // defpackage.m08
        public final long m() {
            return E();
        }

        @Override // defpackage.m08
        public final float n() {
            return Float.intBitsToFloat(D());
        }

        @Override // defpackage.m08
        public final int o() {
            return F();
        }

        @Override // defpackage.m08
        public final long p() {
            return G();
        }

        @Override // defpackage.m08
        public final int q() {
            return D();
        }

        @Override // defpackage.m08
        public final long r() {
            return E();
        }

        @Override // defpackage.m08
        public final int s() {
            return m08.b(F());
        }

        @Override // defpackage.m08
        public final long t() {
            return m08.c(G());
        }

        @Override // defpackage.m08
        public final String u() throws f0p {
            int iF = F();
            byte[] bArr = this.f;
            if (iF > 0) {
                int i = this.g;
                int i2 = this.i;
                if (iF <= i - i2) {
                    String str = new String(bArr, i2, iF, gyo.a);
                    this.i += iF;
                    return str;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF > this.g) {
                return new String(A(iF), gyo.a);
            }
            J(iF);
            String str2 = new String(bArr, this.i, iF, gyo.a);
            this.i += iF;
            return str2;
        }

        @Override // defpackage.m08
        public final String v() throws IOException {
            int iF = F();
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 - i;
            byte[] bArrA = this.f;
            if (iF <= i3 && iF > 0) {
                this.i = i + iF;
            } else {
                if (iF == 0) {
                    return "";
                }
                i = 0;
                if (iF <= i2) {
                    J(iF);
                    this.i = iF;
                } else {
                    bArrA = A(iF);
                }
            }
            return yqh0.a.a(bArrA, i, iF);
        }

        @Override // defpackage.m08
        public final int w() throws f0p {
            if (e()) {
                this.j = 0;
                return 0;
            }
            int iF = F();
            this.j = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw f0p.a();
        }

        @Override // defpackage.m08
        public final int x() {
            return F();
        }

        @Override // defpackage.m08
        public final long y() {
            return G();
        }

        @Override // defpackage.m08
        public final boolean z(int i) throws f0p {
            int iW;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.g - this.i;
                byte[] bArr = this.f;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.i;
                        this.i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw f0p.d();
                }
                while (i3 < 10) {
                    if (this.i == this.g) {
                        J(1);
                    }
                    int i6 = this.i;
                    this.i = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw f0p.d();
                return true;
            }
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(F());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw f0p.c();
                }
                K(4);
                return true;
            }
            do {
                iW = w();
                if (iW == 0) {
                    break;
                }
            } while (z(iW));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void f(int i);

    public abstract int g(int i);

    public abstract boolean h();

    public abstract ql5.f i();

    public abstract double j();

    public abstract int k();

    public abstract int l();

    public abstract long m();

    public abstract float n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract String u();

    public abstract String v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract boolean z(int i);
}
