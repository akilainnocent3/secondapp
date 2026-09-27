package yt;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f159870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f159872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f159873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InputStream f159875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f159876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f159877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f159878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f159879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f159880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f159881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f159882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f159883n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void onRefill();
    }

    public e(InputStream inputStream) {
        this.f159877h = false;
        this.f159879j = Integer.MAX_VALUE;
        this.f159881l = 64;
        this.f159882m = 67108864;
        this.f159883n = null;
        this.f159870a = new byte[4096];
        this.f159872c = 0;
        this.f159874e = 0;
        this.f159878i = 0;
        this.f159875f = inputStream;
        this.f159871b = false;
    }

    public static int B(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw k.p();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw k.p();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw k.k();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    public static e h(p pVar) {
        e eVar = new e(pVar);
        try {
            eVar.j(pVar.size());
            return eVar;
        } catch (k e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public int A() throws IOException {
        int i10;
        int i11 = this.f159874e;
        int i12 = this.f159872c;
        if (i12 != i11) {
            byte[] bArr = this.f159870a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f159874e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << zi.c.f161638p) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << zi.c.f161647y);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f159874e = i14;
                return i10;
            }
        }
        return (int) D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r2[r7] < 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long C() throws java.io.IOException {
        /*
            r10 = this;
            int r0 = r10.f159874e
            int r1 = r10.f159872c
            if (r1 != r0) goto L8
            goto Lb6
        L8:
            byte[] r2 = r10.f159870a
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L14
            r10.f159874e = r3
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb6
        L1b:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2e
            r5 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r3 = r3 ^ r5
            goto Lbb
        L2e:
            int r7 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L40
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r3 = r3 ^ r0
        L3d:
            r1 = r7
            goto Lbb
        L40:
            int r1 = r0 + 4
            r7 = r2[r7]
            int r7 = r7 << 21
            long r7 = (long) r7
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L50
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L50:
            int r7 = r0 + 5
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L61
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L61:
            int r1 = r0 + 6
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 35
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L74
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L74:
            int r7 = r0 + 7
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L87
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L87:
            int r1 = r0 + 8
            r7 = r2[r7]
            long r7 = (long) r7
            r9 = 49
            long r7 = r7 << r9
            long r3 = r3 ^ r7
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L9a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9a:
            int r7 = r0 + 9
            r1 = r2[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r3 = r3 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r8
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L3d
            int r1 = r0 + 10
            r0 = r2[r7]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbb
        Lb6:
            long r0 = r10.D()
            return r0
        Lbb:
            r10.f159874e = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.e.C():long");
    }

    public long D() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bW = w();
            j10 |= ((long) (bW & 127)) << i10;
            if ((bW & 128) == 0) {
                return j10;
            }
        }
        throw k.k();
    }

    public int E() throws IOException {
        return y();
    }

    public long F() throws IOException {
        return z();
    }

    public int G() throws IOException {
        return b(A());
    }

    public long H() throws IOException {
        return c(C());
    }

    public String I() throws IOException {
        int iA = A();
        int i10 = this.f159872c;
        int i11 = this.f159874e;
        if (iA > i10 - i11 || iA <= 0) {
            return iA == 0 ? "" : new String(x(iA), "UTF-8");
        }
        String str = new String(this.f159870a, i11, iA, "UTF-8");
        this.f159874e += iA;
        return str;
    }

    public String J() throws IOException {
        byte[] bArrX;
        int iA = A();
        int i10 = this.f159874e;
        if (iA <= this.f159872c - i10 && iA > 0) {
            bArrX = this.f159870a;
            this.f159874e = i10 + iA;
        } else {
            if (iA == 0) {
                return "";
            }
            bArrX = x(iA);
            i10 = 0;
        }
        if (y.f(bArrX, i10, i10 + iA)) {
            return new String(bArrX, i10, iA, "UTF-8");
        }
        throw k.i();
    }

    public int K() throws IOException {
        if (f()) {
            this.f159876g = 0;
            return 0;
        }
        int iA = A();
        this.f159876g = iA;
        if (z.a(iA) != 0) {
            return this.f159876g;
        }
        throw k.h();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public final void N() {
        int i10 = this.f159872c + this.f159873d;
        this.f159872c = i10;
        int i11 = this.f159878i + i10;
        int i12 = this.f159879j;
        if (i11 <= i12) {
            this.f159873d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f159873d = i13;
        this.f159872c = i10 - i13;
    }

    public final void O(int i10) throws IOException {
        if (!T(i10)) {
            throw k.p();
        }
    }

    public boolean P(int i10, f fVar) throws IOException {
        int iB = z.b(i10);
        if (iB == 0) {
            long jT = t();
            fVar.o0(i10);
            fVar.z0(jT);
            return true;
        }
        if (iB == 1) {
            long jZ = z();
            fVar.o0(i10);
            fVar.V(jZ);
            return true;
        }
        if (iB == 2) {
            d dVarL = l();
            fVar.o0(i10);
            fVar.P(dVarL);
            return true;
        }
        if (iB == 3) {
            fVar.o0(i10);
            Q(fVar);
            int iC = z.c(z.a(i10), 4);
            a(iC);
            fVar.o0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw k.j();
        }
        int iY = y();
        fVar.o0(i10);
        fVar.U(iY);
        return true;
    }

    public void Q(f fVar) throws IOException {
        int iK;
        do {
            iK = K();
            if (iK == 0) {
                return;
            }
        } while (P(iK, fVar));
    }

    public void R(int i10) throws IOException {
        int i11 = this.f159872c;
        int i12 = this.f159874e;
        if (i10 > i11 - i12 || i10 < 0) {
            S(i10);
        } else {
            this.f159874e = i12 + i10;
        }
    }

    public final void S(int i10) throws IOException {
        if (i10 < 0) {
            throw k.l();
        }
        int i11 = this.f159878i;
        int i12 = this.f159874e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f159879j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw k.p();
        }
        int i15 = this.f159872c;
        int i16 = i15 - i12;
        this.f159874e = i15;
        O(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f159872c;
            if (i17 <= i18) {
                this.f159874e = i17;
                return;
            } else {
                i16 += i18;
                this.f159874e = i18;
                O(1);
            }
        }
    }

    public final boolean T(int i10) throws IOException {
        int i11 = this.f159874e;
        if (i11 + i10 <= this.f159872c) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f159878i + i11 + i10 > this.f159879j) {
            return false;
        }
        a aVar = this.f159883n;
        if (aVar != null) {
            aVar.onRefill();
        }
        if (this.f159875f != null) {
            int i12 = this.f159874e;
            if (i12 > 0) {
                int i13 = this.f159872c;
                if (i13 > i12) {
                    byte[] bArr = this.f159870a;
                    System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                }
                this.f159878i += i12;
                this.f159872c -= i12;
                this.f159874e = 0;
            }
            InputStream inputStream = this.f159875f;
            byte[] bArr2 = this.f159870a;
            int i14 = this.f159872c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f159870a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f159872c += i15;
                if ((this.f159878i + i10) - this.f159882m > 0) {
                    throw k.o();
                }
                N();
                if (this.f159872c >= i10) {
                    return true;
                }
                return T(i10);
            }
        }
        return false;
    }

    public void a(int i10) throws k {
        if (this.f159876g != i10) {
            throw k.g();
        }
    }

    public final void d(int i10) throws IOException {
        if (this.f159872c - this.f159874e < i10) {
            O(i10);
        }
    }

    public int e() {
        int i10 = this.f159879j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f159878i + this.f159874e);
    }

    public boolean f() throws IOException {
        return this.f159874e == this.f159872c && !T(1);
    }

    public void i(int i10) {
        this.f159879j = i10;
        N();
    }

    public int j(int i10) throws k {
        if (i10 < 0) {
            throw k.l();
        }
        int i11 = i10 + this.f159878i + this.f159874e;
        int i12 = this.f159879j;
        if (i11 > i12) {
            throw k.p();
        }
        this.f159879j = i11;
        N();
        return i12;
    }

    public boolean k() throws IOException {
        return C() != 0;
    }

    public d l() throws IOException {
        int iA = A();
        int i10 = this.f159872c;
        int i11 = this.f159874e;
        if (iA > i10 - i11 || iA <= 0) {
            return iA == 0 ? d.f159862b : new p(x(iA));
        }
        d cVar = (this.f159871b && this.f159877h) ? new c(this.f159870a, this.f159874e, iA) : d.f(this.f159870a, i11, iA);
        this.f159874e += iA;
        return cVar;
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(z());
    }

    public int n() throws IOException {
        return A();
    }

    public int o() throws IOException {
        return y();
    }

    public long p() throws IOException {
        return z();
    }

    public float q() throws IOException {
        return Float.intBitsToFloat(y());
    }

    public void r(int i10, q.a aVar, g gVar) throws IOException {
        int i11 = this.f159880k;
        if (i11 >= this.f159881l) {
            throw k.m();
        }
        this.f159880k = i11 + 1;
        aVar.c(this, gVar);
        a(z.c(i10, 4));
        this.f159880k--;
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends q> T u(s<T> sVar, g gVar) throws IOException {
        int iA = A();
        if (this.f159880k >= this.f159881l) {
            throw k.m();
        }
        int iJ = j(iA);
        this.f159880k++;
        T tC = sVar.c(this, gVar);
        a(0);
        this.f159880k--;
        i(iJ);
        return tC;
    }

    public void v(q.a aVar, g gVar) throws IOException {
        int iA = A();
        if (this.f159880k >= this.f159881l) {
            throw k.m();
        }
        int iJ = j(iA);
        this.f159880k++;
        aVar.c(this, gVar);
        a(0);
        this.f159880k--;
        i(iJ);
    }

    public byte w() throws IOException {
        if (this.f159874e == this.f159872c) {
            O(1);
        }
        byte[] bArr = this.f159870a;
        int i10 = this.f159874e;
        this.f159874e = i10 + 1;
        return bArr[i10];
    }

    public final byte[] x(int i10) throws IOException {
        if (i10 <= 0) {
            if (i10 == 0) {
                return j.f159920a;
            }
            throw k.l();
        }
        int i11 = this.f159878i;
        int i12 = this.f159874e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f159879j;
        if (i13 > i14) {
            R((i14 - i11) - i12);
            throw k.p();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f159872c - i12;
            System.arraycopy(this.f159870a, i12, bArr, 0, i15);
            this.f159874e = this.f159872c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f159870a, 0, bArr, i15, i16);
            this.f159874e = i16;
            return bArr;
        }
        int i17 = this.f159872c;
        this.f159878i = i11 + i17;
        this.f159874e = 0;
        this.f159872c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f159875f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw k.p();
                }
                this.f159878i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f159870a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public int y() throws IOException {
        int i10 = this.f159874e;
        if (this.f159872c - i10 < 4) {
            O(4);
            i10 = this.f159874e;
        }
        byte[] bArr = this.f159870a;
        this.f159874e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public long z() throws IOException {
        int i10 = this.f159874e;
        if (this.f159872c - i10 < 8) {
            O(8);
            i10 = this.f159874e;
        }
        byte[] bArr = this.f159870a;
        this.f159874e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public e(p pVar) {
        this.f159877h = false;
        this.f159879j = Integer.MAX_VALUE;
        this.f159881l = 64;
        this.f159882m = 67108864;
        this.f159883n = null;
        this.f159870a = pVar.f159932d;
        int iA = pVar.A();
        this.f159874e = iA;
        this.f159872c = iA + pVar.size();
        this.f159878i = -this.f159874e;
        this.f159875f = null;
        this.f159871b = true;
    }
}
