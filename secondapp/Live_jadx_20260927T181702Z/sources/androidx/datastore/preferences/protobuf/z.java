package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10367f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10368g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile int f10369h = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f10373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10374e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f10375i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f10376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10378l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f10379m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f10380n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f10381o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10382p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10383q;

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T E(final int fieldNumber, final m3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final v2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T I(final m3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final v2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            int i10 = this.f10379m;
            if (i10 == this.f10377k) {
                throw y1.s();
            }
            byte[] bArr = this.f10375i;
            this.f10379m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int length) throws IOException {
            if (length > 0) {
                int i10 = this.f10377k;
                int i11 = this.f10379m;
                if (length <= i10 - i11) {
                    int i12 = length + i11;
                    this.f10379m = i12;
                    return Arrays.copyOfRange(this.f10375i, i11, i12);
                }
            }
            if (length > 0) {
                throw y1.s();
            }
            if (length == 0) {
                return t1.f10218e;
            }
            throw y1.m();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            int i10 = this.f10379m;
            if (this.f10377k - i10 < 4) {
                throw y1.s();
            }
            byte[] bArr = this.f10375i;
            this.f10379m = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            int i10 = this.f10379m;
            if (this.f10377k - i10 < 8) {
                throw y1.s();
            }
            byte[] bArr = this.f10375i;
            this.f10379m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int O() throws IOException {
            int i10;
            int i11 = this.f10379m;
            int i12 = this.f10377k;
            if (i12 != i11) {
                byte[] bArr = this.f10375i;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f10379m = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << zi.c.f161638p) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << zi.c.f161647y);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
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
                    this.f10379m = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f10379m;
            int i11 = this.f10377k;
            if (i11 != i10) {
                byte[] bArr = this.f10375i;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f10379m = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << zi.c.f161638p) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << zi.c.f161647y);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f10379m = i13;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f10377k;
                int i11 = this.f10379m;
                if (iO <= i10 - i11) {
                    String str = new String(this.f10375i, i11, iO, t1.f10215b);
                    this.f10379m += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f10377k;
                int i11 = this.f10379m;
                if (iO <= i10 - i11) {
                    String strH = c5.h(this.f10375i, i11, iO);
                    this.f10379m += iO;
                    return strH;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f10381o = 0;
                return 0;
            }
            int iO = O();
            this.f10381o = iO;
            if (f5.a(iO) != 0) {
                return this.f10381o;
            }
            throw y1.i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws y1 {
            if (this.f10381o != value) {
                throw y1.h();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final v2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f10380n = this.f10379m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
            this.f10382p = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f10383q;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f10381o;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                o0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(f5.c(f5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return this.f10379m - this.f10380n;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.u1(tag);
                output.v1(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.u1(tag);
                output.Q0(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.u1(tag);
                output.M0(uVarY);
                return true;
            }
            if (iB == 3) {
                output.u1(tag);
                k0(output);
                int iC = f5.c(f5.a(tag), 4);
                a(iC);
                output.u1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            int iM = M();
            output.u1(tag);
            output.P0(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return this.f10379m == this.f10377k;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int length) throws IOException {
            if (length >= 0) {
                int i10 = this.f10377k;
                int i11 = this.f10379m;
                if (length <= i10 - i11) {
                    this.f10379m = i11 + length;
                    return;
                }
            }
            if (length >= 0) {
                throw y1.s();
            }
            throw y1.m();
        }

        public final void n0() {
            int i10 = this.f10377k + this.f10378l;
            this.f10377k = i10;
            int i11 = i10 - this.f10380n;
            int i12 = this.f10383q;
            if (i11 <= i12) {
                this.f10378l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10378l = i13;
            this.f10377k = i10 - i13;
        }

        public final void o0() throws IOException {
            if (this.f10377k - this.f10379m >= 10) {
                p0();
            } else {
                q0();
            }
        }

        public final void p0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f10375i;
                int i11 = this.f10379m;
                this.f10379m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        public final void q0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f10383q = oldLimit;
            n0();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws y1 {
            if (byteLimit < 0) {
                throw y1.m();
            }
            int i10 = byteLimit + i();
            if (i10 < 0) {
                throw y1.n();
            }
            int i11 = this.f10383q;
            if (i10 > i11) {
                throw y1.s();
            }
            this.f10383q = i10;
            n0();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            return L(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f10377k;
                int i11 = this.f10379m;
                if (iO <= i10 - i11) {
                    ByteBuffer byteBufferWrap = (this.f10376j || !this.f10382p) ? ByteBuffer.wrap(Arrays.copyOfRange(this.f10375i, i11, i11 + iO)) : ByteBuffer.wrap(this.f10375i, i11, iO).slice();
                    this.f10379m += iO;
                    return byteBufferWrap;
                }
            }
            if (iO == 0) {
                return t1.f10219f;
            }
            if (iO < 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f10377k;
                int i11 = this.f10379m;
                if (iO <= i10 - i11) {
                    u uVarQ0 = (this.f10376j && this.f10382p) ? u.q0(this.f10375i, i11, iO) : u.t(this.f10375i, i11, iO);
                    this.f10379m += iO;
                    return uVarQ0;
                }
            }
            return iO == 0 ? u.f10242g : u.n0(L(iO));
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        public b(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.f10383q = Integer.MAX_VALUE;
            this.f10375i = buffer;
            this.f10377k = len + offset;
            this.f10379m = offset;
            this.f10380n = offset;
            this.f10376j = immutable;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Iterable<ByteBuffer> f10384i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Iterator<ByteBuffer> f10385j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ByteBuffer f10386k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f10387l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f10388m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f10389n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f10390o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f10391p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10392q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10393r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f10394s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f10395t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public long f10396u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f10397v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f10398w;

        private void q0() {
            int i10 = this.f10389n + this.f10390o;
            this.f10389n = i10;
            int i11 = i10 - this.f10394s;
            int i12 = this.f10391p;
            if (i11 <= i12) {
                this.f10390o = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10390o = i13;
            this.f10389n = i10 - i13;
        }

        private void s0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T E(final int fieldNumber, final m3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final v2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T I(final m3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final v2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            if (n0() == 0) {
                o0();
            }
            long j10 = this.f10395t;
            this.f10395t = 1 + j10;
            return b5.A(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int length) throws IOException {
            if (length >= 0) {
                long j10 = length;
                if (j10 <= n0()) {
                    byte[] bArr = new byte[length];
                    b5.p(this.f10395t, bArr, 0L, j10);
                    this.f10395t += j10;
                    return bArr;
                }
            }
            if (length >= 0 && length <= r0()) {
                byte[] bArr2 = new byte[length];
                p0(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw y1.s();
            }
            if (length == 0) {
                return t1.f10218e;
            }
            throw y1.m();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            if (n0() < 4) {
                return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24);
            }
            long j10 = this.f10395t;
            this.f10395t = 4 + j10;
            return ((b5.A(j10 + 3) & 255) << 24) | (b5.A(j10) & 255) | ((b5.A(1 + j10) & 255) << 8) | ((b5.A(2 + j10) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            char c10;
            long jK;
            byte bK;
            if (n0() >= 8) {
                long j10 = this.f10395t;
                this.f10395t = 8 + j10;
                c10 = '8';
                jK = (((long) b5.A(j10)) & 255) | ((((long) b5.A(1 + j10)) & 255) << 8) | ((((long) b5.A(2 + j10)) & 255) << 16) | ((((long) b5.A(3 + j10)) & 255) << 24) | ((((long) b5.A(4 + j10)) & 255) << 32) | ((((long) b5.A(5 + j10)) & 255) << 40) | ((((long) b5.A(6 + j10)) & 255) << 48);
                bK = b5.A(j10 + 7);
            } else {
                c10 = '8';
                jK = (((long) K()) & 255) | ((((long) K()) & 255) << 8) | ((((long) K()) & 255) << 16) | ((((long) K()) & 255) << 24) | ((((long) K()) & 255) << 32) | ((((long) K()) & 255) << 40) | ((((long) K()) & 255) << 48);
                bK = K();
            }
            return jK | ((((long) bK) & 255) << c10);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int O() throws IOException {
            int i10;
            long j10 = this.f10395t;
            if (this.f10398w != j10) {
                long j11 = j10 + 1;
                byte bA = b5.A(j10);
                if (bA >= 0) {
                    this.f10395t++;
                    return bA;
                }
                if (this.f10398w - this.f10395t >= 10) {
                    long j12 = 2 + j10;
                    int iA = (b5.A(j11) << 7) ^ bA;
                    if (iA < 0) {
                        i10 = iA ^ (-128);
                    } else {
                        long j13 = 3 + j10;
                        int iA2 = (b5.A(j12) << zi.c.f161638p) ^ iA;
                        if (iA2 >= 0) {
                            i10 = iA2 ^ 16256;
                        } else {
                            long j14 = 4 + j10;
                            int iA3 = iA2 ^ (b5.A(j13) << zi.c.f161647y);
                            if (iA3 < 0) {
                                i10 = (-2080896) ^ iA3;
                            } else {
                                j13 = 5 + j10;
                                byte bA2 = b5.A(j14);
                                int i11 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                                if (bA2 < 0) {
                                    j14 = 6 + j10;
                                    if (b5.A(j13) < 0) {
                                        j13 = 7 + j10;
                                        if (b5.A(j14) < 0) {
                                            j14 = 8 + j10;
                                            if (b5.A(j13) < 0) {
                                                j13 = 9 + j10;
                                                if (b5.A(j14) < 0) {
                                                    long j15 = j10 + 10;
                                                    if (b5.A(j13) >= 0) {
                                                        i10 = i11;
                                                        j12 = j15;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i11;
                                }
                                i10 = i11;
                            }
                            j12 = j14;
                        }
                        j12 = j13;
                    }
                    this.f10395t = j12;
                    return i10;
                }
            }
            return (int) S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13 = this.f10395t;
            if (this.f10398w != j13) {
                long j14 = j13 + 1;
                byte bA = b5.A(j13);
                if (bA >= 0) {
                    this.f10395t++;
                    return bA;
                }
                if (this.f10398w - this.f10395t >= 10) {
                    long j15 = 2 + j13;
                    int iA = (b5.A(j14) << 7) ^ bA;
                    if (iA < 0) {
                        j10 = iA ^ (-128);
                    } else {
                        long j16 = 3 + j13;
                        int iA2 = (b5.A(j15) << zi.c.f161638p) ^ iA;
                        if (iA2 >= 0) {
                            j10 = iA2 ^ 16256;
                            j15 = j16;
                        } else {
                            long j17 = 4 + j13;
                            int iA3 = iA2 ^ (b5.A(j16) << zi.c.f161647y);
                            if (iA3 < 0) {
                                j10 = (-2080896) ^ iA3;
                                j15 = j17;
                            } else {
                                long j18 = 5 + j13;
                                long jA = (((long) b5.A(j17)) << 28) ^ ((long) iA3);
                                if (jA >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j19 = 6 + j13;
                                    long jA2 = jA ^ (((long) b5.A(j18)) << 35);
                                    if (jA2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j18 = 7 + j13;
                                        jA = jA2 ^ (((long) b5.A(j19)) << 42);
                                        if (jA >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j19 = 8 + j13;
                                            jA2 = jA ^ (((long) b5.A(j18)) << 49);
                                            if (jA2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j18 = 9 + j13;
                                                long jA3 = (jA2 ^ (((long) b5.A(j19)) << 56)) ^ 71499008037633920L;
                                                if (jA3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (b5.A(j18) >= 0) {
                                                        j15 = j20;
                                                        j10 = jA3;
                                                    }
                                                } else {
                                                    j10 = jA3;
                                                    j15 = j18;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jA2;
                                    j15 = j19;
                                }
                                j10 = j12 ^ jA;
                                j15 = j18;
                            }
                        }
                    }
                    this.f10395t = j15;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                long j11 = this.f10398w;
                long j12 = this.f10395t;
                if (j10 <= j11 - j12) {
                    byte[] bArr = new byte[iO];
                    b5.p(j12, bArr, 0L, j10);
                    String str = new String(bArr, t1.f10215b);
                    this.f10395t += j10;
                    return str;
                }
            }
            if (iO > 0 && iO <= r0()) {
                byte[] bArr2 = new byte[iO];
                p0(bArr2, 0, iO);
                return new String(bArr2, t1.f10215b);
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                long j11 = this.f10398w;
                long j12 = this.f10395t;
                if (j10 <= j11 - j12) {
                    String strG = c5.g(this.f10386k, (int) (j12 - this.f10396u), iO);
                    this.f10395t += j10;
                    return strG;
                }
            }
            if (iO >= 0 && iO <= r0()) {
                byte[] bArr = new byte[iO];
                p0(bArr, 0, iO);
                return c5.h(bArr, 0, iO);
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f10392q = 0;
                return 0;
            }
            int iO = O();
            this.f10392q = iO;
            if (f5.a(iO) != 0) {
                return this.f10392q;
            }
            throw y1.i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws y1 {
            if (this.f10392q != value) {
                throw y1.h();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final v2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f10394s = (int) ((((long) this.f10393r) + this.f10395t) - this.f10396u);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
            this.f10388m = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f10391p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f10392q;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                s0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(f5.c(f5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return (int) ((((long) (this.f10393r - this.f10394s)) + this.f10395t) - this.f10396u);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.u1(tag);
                output.v1(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.u1(tag);
                output.Q0(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.u1(tag);
                output.M0(uVarY);
                return true;
            }
            if (iB == 3) {
                output.u1(tag);
                k0(output);
                int iC = f5.c(f5.a(tag), 4);
                a(iC);
                output.u1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            int iM = M();
            output.u1(tag);
            output.P0(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return (((long) this.f10393r) + this.f10395t) - this.f10396u == ((long) this.f10389n);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int length) throws IOException {
            if (length < 0 || length > (((long) (this.f10389n - this.f10393r)) - this.f10395t) + this.f10396u) {
                if (length >= 0) {
                    throw y1.s();
                }
                throw y1.m();
            }
            while (length > 0) {
                if (n0() == 0) {
                    o0();
                }
                int iMin = Math.min(length, (int) n0());
                length -= iMin;
                this.f10395t += (long) iMin;
            }
        }

        public final long n0() {
            return this.f10398w - this.f10395t;
        }

        public final void o0() throws y1 {
            if (!this.f10385j.hasNext()) {
                throw y1.s();
            }
            u0();
        }

        public final void p0(byte[] bytes, int offset, final int length) throws IOException {
            if (length < 0 || length > r0()) {
                if (length > 0) {
                    throw y1.s();
                }
                if (length != 0) {
                    throw y1.m();
                }
                return;
            }
            int i10 = length;
            while (i10 > 0) {
                if (n0() == 0) {
                    o0();
                }
                int iMin = Math.min(i10, (int) n0());
                long j10 = iMin;
                b5.p(this.f10395t, bytes, (length - i10) + offset, j10);
                i10 -= iMin;
                this.f10395t += j10;
            }
        }

        public final int r0() {
            return (int) ((((long) (this.f10389n - this.f10393r)) - this.f10395t) + this.f10396u);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f10391p = oldLimit;
            q0();
        }

        public final ByteBuffer t0(int begin, int end) throws IOException {
            int iPosition = this.f10386k.position();
            int iLimit = this.f10386k.limit();
            ByteBuffer byteBuffer = this.f10386k;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    ByteBuffer byteBufferSlice = this.f10386k.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw y1.s();
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws y1 {
            if (byteLimit < 0) {
                throw y1.m();
            }
            int i10 = byteLimit + i();
            int i11 = this.f10391p;
            if (i10 > i11) {
                throw y1.s();
            }
            this.f10391p = i10;
            q0();
            return i11;
        }

        public final void u0() {
            ByteBuffer next = this.f10385j.next();
            this.f10386k = next;
            this.f10393r += (int) (this.f10395t - this.f10396u);
            long jPosition = next.position();
            this.f10395t = jPosition;
            this.f10396u = jPosition;
            this.f10398w = this.f10386k.limit();
            long jK = b5.k(this.f10386k);
            this.f10397v = jK;
            this.f10395t += jK;
            this.f10396u += jK;
            this.f10398w += jK;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            return L(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                if (j10 <= n0()) {
                    if (this.f10387l || !this.f10388m) {
                        byte[] bArr = new byte[iO];
                        b5.p(this.f10395t, bArr, 0L, j10);
                        this.f10395t += j10;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j11 = this.f10395t + j10;
                    this.f10395t = j11;
                    long j12 = this.f10397v;
                    return t0((int) ((j11 - j12) - j10), (int) (j11 - j12));
                }
            }
            if (iO > 0 && iO <= r0()) {
                byte[] bArr2 = new byte[iO];
                p0(bArr2, 0, iO);
                return ByteBuffer.wrap(bArr2);
            }
            if (iO == 0) {
                return t1.f10219f;
            }
            if (iO < 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            if (iO > 0) {
                long j10 = iO;
                long j11 = this.f10398w;
                long j12 = this.f10395t;
                if (j10 <= j11 - j12) {
                    if (this.f10387l && this.f10388m) {
                        int i10 = (int) (j12 - this.f10397v);
                        u uVarM0 = u.m0(t0(i10, iO + i10));
                        this.f10395t += j10;
                        return uVarM0;
                    }
                    byte[] bArr = new byte[iO];
                    b5.p(j12, bArr, 0L, j10);
                    this.f10395t += j10;
                    return u.n0(bArr);
                }
            }
            if (iO <= 0 || iO > r0()) {
                if (iO == 0) {
                    return u.f10242g;
                }
                if (iO < 0) {
                    throw y1.m();
                }
                throw y1.s();
            }
            if (!this.f10387l || !this.f10388m) {
                byte[] bArr2 = new byte[iO];
                p0(bArr2, 0, iO);
                return u.n0(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iO > 0) {
                if (n0() == 0) {
                    o0();
                }
                int iMin = Math.min(iO, (int) n0());
                int i11 = (int) (this.f10395t - this.f10397v);
                arrayList.add(u.m0(t0(i11, i11 + iMin)));
                iO -= iMin;
                this.f10395t += (long) iMin;
            }
            return u.n(arrayList);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        public c(Iterable<ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.f10391p = Integer.MAX_VALUE;
            this.f10389n = size;
            this.f10384i = inputBufs;
            this.f10385j = inputBufs.iterator();
            this.f10387l = immutableFlag;
            this.f10393r = 0;
            this.f10394s = 0;
            if (size != 0) {
                u0();
                return;
            }
            this.f10386k = t1.f10219f;
            this.f10395t = 0L;
            this.f10396u = 0L;
            this.f10398w = 0L;
            this.f10397v = 0L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final InputStream f10399i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f10400j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10402l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f10403m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f10404n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f10405o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f10406p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public a f10407q;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public interface a {
            void onRefill();
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10408a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public ByteArrayOutputStream f10409b;

            public b() {
                this.f10408a = d.this.f10403m;
            }

            public ByteBuffer a() {
                ByteArrayOutputStream byteArrayOutputStream = this.f10409b;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(d.this.f10400j, this.f10408a, d.this.f10403m - this.f10408a);
                }
                byteArrayOutputStream.write(d.this.f10400j, this.f10408a, d.this.f10403m);
                return ByteBuffer.wrap(this.f10409b.toByteArray());
            }

            @Override // androidx.datastore.preferences.protobuf.z.d.a
            public void onRefill() {
                if (this.f10409b == null) {
                    this.f10409b = new ByteArrayOutputStream();
                }
                this.f10409b.write(d.this.f10400j, this.f10408a, d.this.f10403m - this.f10408a);
                this.f10408a = 0;
            }
        }

        private void A0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f10400j;
                int i11 = this.f10403m;
                this.f10403m = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        private void B0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        public static int p0(InputStream input) throws IOException {
            try {
                return input.available();
            } catch (y1 e10) {
                e10.p();
                throw e10;
            }
        }

        public static int q0(InputStream input, byte[] data, int offset, int length) throws IOException {
            try {
                return input.read(data, offset, length);
            } catch (y1 e10) {
                e10.p();
                throw e10;
            }
        }

        private void v0() {
            int i10 = this.f10401k + this.f10402l;
            this.f10401k = i10;
            int i11 = this.f10405o + i10;
            int i12 = this.f10406p;
            if (i11 <= i12) {
                this.f10402l = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f10402l = i13;
            this.f10401k = i10 - i13;
        }

        public static long x0(InputStream input, long length) throws IOException {
            try {
                return input.skip(length);
            } catch (y1 e10) {
                e10.p();
                throw e10;
            }
        }

        private void z0() throws IOException {
            if (this.f10401k - this.f10403m >= 10) {
                A0();
            } else {
                B0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        public final boolean C0(int n10) throws IOException {
            int i10 = this.f10403m;
            if (i10 + n10 <= this.f10401k) {
                throw new IllegalStateException("refillBuffer() called when " + n10 + " bytes were already available in buffer");
            }
            int i11 = this.f10372c;
            int i12 = this.f10405o;
            if (n10 > (i11 - i12) - i10 || i12 + i10 + n10 > this.f10406p) {
                return false;
            }
            a aVar = this.f10407q;
            if (aVar != null) {
                aVar.onRefill();
            }
            int i13 = this.f10403m;
            if (i13 > 0) {
                int i14 = this.f10401k;
                if (i14 > i13) {
                    byte[] bArr = this.f10400j;
                    System.arraycopy(bArr, i13, bArr, 0, i14 - i13);
                }
                this.f10405o += i13;
                this.f10401k -= i13;
                this.f10403m = 0;
            }
            InputStream inputStream = this.f10399i;
            byte[] bArr2 = this.f10400j;
            int i15 = this.f10401k;
            int iQ0 = q0(inputStream, bArr2, i15, Math.min(bArr2.length - i15, (this.f10372c - this.f10405o) - i15));
            if (iQ0 == 0 || iQ0 < -1 || iQ0 > this.f10400j.length) {
                throw new IllegalStateException(this.f10399i.getClass() + "#read(byte[]) returned invalid result: " + iQ0 + "\nThe InputStream implementation is buggy.");
            }
            if (iQ0 <= 0) {
                return false;
            }
            this.f10401k += iQ0;
            v0();
            if (this.f10401k >= n10) {
                return true;
            }
            return C0(n10);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T E(final int fieldNumber, final m3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final v2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T I(final m3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final v2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            if (this.f10403m == this.f10401k) {
                w0(1);
            }
            byte[] bArr = this.f10400j;
            int i10 = this.f10403m;
            this.f10403m = i10 + 1;
            return bArr[i10];
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int size) throws IOException {
            int i10 = this.f10403m;
            if (size > this.f10401k - i10 || size <= 0) {
                return s0(size, false);
            }
            int i11 = size + i10;
            this.f10403m = i11;
            return Arrays.copyOfRange(this.f10400j, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            int i10 = this.f10403m;
            if (this.f10401k - i10 < 4) {
                w0(4);
                i10 = this.f10403m;
            }
            byte[] bArr = this.f10400j;
            this.f10403m = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            int i10 = this.f10403m;
            if (this.f10401k - i10 < 8) {
                w0(8);
                i10 = this.f10403m;
            }
            byte[] bArr = this.f10400j;
            this.f10403m = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int O() throws IOException {
            int i10;
            int i11 = this.f10403m;
            int i12 = this.f10401k;
            if (i12 != i11) {
                byte[] bArr = this.f10400j;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f10403m = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << zi.c.f161638p) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << zi.c.f161647y);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
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
                    this.f10403m = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            long j13;
            int i10 = this.f10403m;
            int i11 = this.f10401k;
            if (i11 != i10) {
                byte[] bArr = this.f10400j;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f10403m = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << zi.c.f161638p) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << zi.c.f161647y);
                            if (i18 < 0) {
                                j13 = (-2080896) ^ i18;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    i17 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i17]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i19 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i19;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j13 = j11 ^ j16;
                                }
                                j10 = j12 ^ j15;
                            }
                            i13 = i17;
                            j10 = j13;
                        }
                    }
                    this.f10403m = i13;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO > 0) {
                int i10 = this.f10401k;
                int i11 = this.f10403m;
                if (iO <= i10 - i11) {
                    String str = new String(this.f10400j, i11, iO, t1.f10215b);
                    this.f10403m += iO;
                    return str;
                }
            }
            if (iO == 0) {
                return "";
            }
            if (iO < 0) {
                throw y1.m();
            }
            if (iO > this.f10401k) {
                return new String(s0(iO, false), t1.f10215b);
            }
            w0(iO);
            String str2 = new String(this.f10400j, this.f10403m, iO, t1.f10215b);
            this.f10403m += iO;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            byte[] bArrS0;
            int iO = O();
            int i10 = this.f10403m;
            int i11 = this.f10401k;
            if (iO <= i11 - i10 && iO > 0) {
                bArrS0 = this.f10400j;
                this.f10403m = i10 + iO;
            } else {
                if (iO == 0) {
                    return "";
                }
                if (iO < 0) {
                    throw y1.m();
                }
                i10 = 0;
                if (iO <= i11) {
                    w0(iO);
                    bArrS0 = this.f10400j;
                    this.f10403m = iO;
                } else {
                    bArrS0 = s0(iO, false);
                }
            }
            return c5.h(bArrS0, i10, iO);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f10404n = 0;
                return 0;
            }
            int iO = O();
            this.f10404n = iO;
            if (f5.a(iO) != 0) {
                return this.f10404n;
            }
            throw y1.i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws y1 {
            if (this.f10404n != value) {
                throw y1.h();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final v2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f10405o = -this.f10403m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f10406p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f10405o + this.f10403m);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f10404n;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                z0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(f5.c(f5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return this.f10405o + this.f10403m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.u1(tag);
                output.v1(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.u1(tag);
                output.Q0(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.u1(tag);
                output.M0(uVarY);
                return true;
            }
            if (iB == 3) {
                output.u1(tag);
                k0(output);
                int iC = f5.c(f5.a(tag), 4);
                a(iC);
                output.u1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            int iM = M();
            output.u1(tag);
            output.P0(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return this.f10403m == this.f10401k && !C0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int size) throws IOException {
            int i10 = this.f10401k;
            int i11 = this.f10403m;
            if (size > i10 - i11 || size < 0) {
                y0(size);
            } else {
                this.f10403m = i11 + size;
            }
        }

        public final u r0(final int size) throws IOException {
            byte[] bArrT0 = t0(size);
            if (bArrT0 != null) {
                return u.s(bArrT0);
            }
            int i10 = this.f10403m;
            int i11 = this.f10401k;
            int length = i11 - i10;
            this.f10405o += i11;
            this.f10403m = 0;
            this.f10401k = 0;
            List<byte[]> listU0 = u0(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f10400j, i10, bArr, 0, length);
            for (byte[] bArr2 : listU0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return u.n0(bArr);
        }

        public final byte[] s0(final int size, boolean ensureNoLeakedReferences) throws IOException {
            byte[] bArrT0 = t0(size);
            if (bArrT0 != null) {
                return ensureNoLeakedReferences ? (byte[]) bArrT0.clone() : bArrT0;
            }
            int i10 = this.f10403m;
            int i11 = this.f10401k;
            int length = i11 - i10;
            this.f10405o += i11;
            this.f10403m = 0;
            this.f10401k = 0;
            List<byte[]> listU0 = u0(size - length);
            byte[] bArr = new byte[size];
            System.arraycopy(this.f10400j, i10, bArr, 0, length);
            for (byte[] bArr2 : listU0) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f10406p = oldLimit;
            v0();
        }

        public final byte[] t0(final int size) throws IOException {
            if (size == 0) {
                return t1.f10218e;
            }
            if (size < 0) {
                throw y1.m();
            }
            int i10 = this.f10405o;
            int i11 = this.f10403m;
            int i12 = i10 + i11 + size;
            if (i12 - this.f10372c > 0) {
                throw y1.r();
            }
            int i13 = this.f10406p;
            if (i12 > i13) {
                l0((i13 - i10) - i11);
                throw y1.s();
            }
            int i14 = this.f10401k - i11;
            int i15 = size - i14;
            if (i15 >= 4096 && i15 > p0(this.f10399i)) {
                return null;
            }
            byte[] bArr = new byte[size];
            System.arraycopy(this.f10400j, this.f10403m, bArr, 0, i14);
            this.f10405o += this.f10401k;
            this.f10403m = 0;
            this.f10401k = 0;
            while (i14 < size) {
                int iQ0 = q0(this.f10399i, bArr, i14, size - i14);
                if (iQ0 == -1) {
                    throw y1.s();
                }
                this.f10405o += iQ0;
                i14 += iQ0;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws y1 {
            if (byteLimit < 0) {
                throw y1.m();
            }
            int i10 = byteLimit + this.f10405o + this.f10403m;
            if (i10 < 0) {
                throw y1.n();
            }
            int i11 = this.f10406p;
            if (i10 > i11) {
                throw y1.s();
            }
            this.f10406p = i10;
            v0();
            return i11;
        }

        public final List<byte[]> u0(int sizeLeft) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (sizeLeft > 0) {
                int iMin = Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[iMin];
                int i10 = 0;
                while (i10 < iMin) {
                    int i11 = this.f10399i.read(bArr, i10, iMin - i10);
                    if (i11 == -1) {
                        throw y1.s();
                    }
                    this.f10405o += i11;
                    i10 += i11;
                }
                sizeLeft -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            int iO = O();
            int i10 = this.f10401k;
            int i11 = this.f10403m;
            if (iO > i10 - i11 || iO <= 0) {
                if (iO >= 0) {
                    return s0(iO, false);
                }
                throw y1.m();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f10400j, i11, i11 + iO);
            this.f10403m += iO;
            return bArrCopyOfRange;
        }

        public final void w0(int n10) throws IOException {
            if (C0(n10)) {
                return;
            }
            if (n10 <= (this.f10372c - this.f10405o) - this.f10403m) {
                throw y1.s();
            }
            throw y1.r();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            int i10 = this.f10401k;
            int i11 = this.f10403m;
            if (iO <= i10 - i11 && iO > 0) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.f10400j, i11, i11 + iO));
                this.f10403m += iO;
                return byteBufferWrap;
            }
            if (iO == 0) {
                return t1.f10219f;
            }
            if (iO >= 0) {
                return ByteBuffer.wrap(s0(iO, true));
            }
            throw y1.m();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            int i10 = this.f10401k;
            int i11 = this.f10403m;
            if (iO <= i10 - i11 && iO > 0) {
                u uVarT = u.t(this.f10400j, i11, iO);
                this.f10403m += iO;
                return uVarT;
            }
            if (iO == 0) {
                return u.f10242g;
            }
            if (iO >= 0) {
                return r0(iO);
            }
            throw y1.m();
        }

        public final void y0(final int size) throws IOException {
            if (size < 0) {
                throw y1.m();
            }
            int i10 = this.f10405o;
            int i11 = this.f10403m;
            int i12 = i10 + i11 + size;
            int i13 = this.f10406p;
            if (i12 > i13) {
                l0((i13 - i10) - i11);
                throw y1.s();
            }
            int i14 = 0;
            if (this.f10407q == null) {
                this.f10405o = i10 + i11;
                int i15 = this.f10401k - i11;
                this.f10401k = 0;
                this.f10403m = 0;
                i14 = i15;
                while (i14 < size) {
                    try {
                        long j10 = size - i14;
                        long jX0 = x0(this.f10399i, j10);
                        if (jX0 < 0 || jX0 > j10) {
                            throw new IllegalStateException(this.f10399i.getClass() + "#skip returned invalid result: " + jX0 + "\nThe InputStream implementation is buggy.");
                        }
                        if (jX0 == 0) {
                            break;
                        } else {
                            i14 += (int) jX0;
                        }
                    } catch (Throwable th2) {
                        this.f10405o += i14;
                        v0();
                        throw th2;
                    }
                }
                this.f10405o += i14;
                v0();
            }
            if (i14 >= size) {
                return;
            }
            int i16 = this.f10401k;
            int i17 = i16 - this.f10403m;
            this.f10403m = i16;
            w0(1);
            while (true) {
                int i18 = size - i17;
                int i19 = this.f10401k;
                if (i18 <= i19) {
                    this.f10403m = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f10403m = i19;
                    w0(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        public d(final InputStream input, int bufferSize) {
            super();
            this.f10406p = Integer.MAX_VALUE;
            this.f10407q = null;
            t1.e(input, "input");
            this.f10399i = input;
            this.f10400j = new byte[bufferSize];
            this.f10401k = 0;
            this.f10403m = 0;
            this.f10405o = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends z {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final ByteBuffer f10411i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f10412j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f10413k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f10414l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f10415m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f10416n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f10417o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f10418p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f10419q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10420r;

        public static boolean o0() {
            return b5.V();
        }

        private void p0() {
            long j10 = this.f10414l + ((long) this.f10417o);
            this.f10414l = j10;
            int i10 = (int) (j10 - this.f10416n);
            int i11 = this.f10420r;
            if (i10 <= i11) {
                this.f10417o = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f10417o = i12;
            this.f10414l = j10 - ((long) i12);
        }

        private int q0() {
            return (int) (this.f10414l - this.f10415m);
        }

        private void r0() throws IOException {
            if (q0() >= 10) {
                s0();
            } else {
                t0();
            }
        }

        private void s0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f10415m;
                this.f10415m = 1 + j10;
                if (b5.A(j10) >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        private void t0() throws IOException {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int A() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int B() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long C() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(M());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T E(final int fieldNumber, final m3<T> parser, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void F(final int fieldNumber, final v2.a builder, final v0 extensionRegistry) throws IOException {
            b();
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(f5.c(fieldNumber, 4));
            this.f10370a--;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int G() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long H() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public <T extends v2> T I(final m3<T> parser, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            T tI = parser.i(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
            return tI;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void J(final v2.a builder, final v0 extensionRegistry) throws IOException {
            int iO = O();
            b();
            int iU = u(iO);
            this.f10370a++;
            builder.i5(this, extensionRegistry);
            a(0);
            this.f10370a--;
            if (g() != 0) {
                throw y1.s();
            }
            t(iU);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte K() throws IOException {
            long j10 = this.f10415m;
            if (j10 == this.f10414l) {
                throw y1.s();
            }
            this.f10415m = 1 + j10;
            return b5.A(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] L(final int length) throws IOException {
            if (length < 0 || length > q0()) {
                if (length > 0) {
                    throw y1.s();
                }
                if (length == 0) {
                    return t1.f10218e;
                }
                throw y1.m();
            }
            byte[] bArr = new byte[length];
            long j10 = this.f10415m;
            long j11 = length;
            u0(j10, j10 + j11).get(bArr);
            this.f10415m += j11;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int M() throws IOException {
            long j10 = this.f10415m;
            if (this.f10414l - j10 < 4) {
                throw y1.s();
            }
            this.f10415m = 4 + j10;
            return ((b5.A(j10 + 3) & 255) << 24) | (b5.A(j10) & 255) | ((b5.A(1 + j10) & 255) << 8) | ((b5.A(2 + j10) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long N() throws IOException {
            long j10 = this.f10415m;
            if (this.f10414l - j10 < 8) {
                throw y1.s();
            }
            this.f10415m = 8 + j10;
            return ((((long) b5.A(j10 + 7)) & 255) << 56) | (((long) b5.A(j10)) & 255) | ((((long) b5.A(1 + j10)) & 255) << 8) | ((((long) b5.A(2 + j10)) & 255) << 16) | ((((long) b5.A(3 + j10)) & 255) << 24) | ((((long) b5.A(4 + j10)) & 255) << 32) | ((((long) b5.A(5 + j10)) & 255) << 40) | ((((long) b5.A(6 + j10)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (androidx.datastore.preferences.protobuf.b5.A(r3) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int O() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f10415m
                long r2 = r9.f10414l
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.datastore.preferences.protobuf.b5.A(r0)
                if (r4 < 0) goto L16
                r9.f10415m = r2
                return r4
            L16:
                long r5 = r9.f10414l
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = androidx.datastore.preferences.protobuf.b5.A(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.b5.A(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.b5.A(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.b5.A(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.b5.A(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.b5.A(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.b5.A(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = androidx.datastore.preferences.protobuf.b5.A(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = androidx.datastore.preferences.protobuf.b5.A(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.S()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f10415m = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.z.e.O():int");
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long R() throws IOException {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f10415m;
            if (this.f10414l != j13) {
                long j14 = 1 + j13;
                byte bA = b5.A(j13);
                if (bA >= 0) {
                    this.f10415m = j14;
                    return bA;
                }
                if (this.f10414l - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iA = (b5.A(j14) << 7) ^ bA;
                    if (iA >= 0) {
                        long j16 = 3 + j13;
                        int iA2 = iA ^ (b5.A(j15) << zi.c.f161638p);
                        if (iA2 >= 0) {
                            j10 = iA2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iA3 = iA2 ^ (b5.A(j16) << zi.c.f161647y);
                            if (iA3 < 0) {
                                i10 = (-2080896) ^ iA3;
                            } else {
                                long j17 = 5 + j13;
                                long jA = ((long) iA3) ^ (((long) b5.A(j15)) << 28);
                                if (jA >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jA2 = jA ^ (((long) b5.A(j17)) << 35);
                                    if (jA2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jA = jA2 ^ (((long) b5.A(j18)) << 42);
                                        if (jA >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jA2 = jA ^ (((long) b5.A(j17)) << 49);
                                            if (jA2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = 9 + j13;
                                                long jA3 = (jA2 ^ (((long) b5.A(j18)) << 56)) ^ 71499008037633920L;
                                                if (jA3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (b5.A(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jA3;
                                                    }
                                                } else {
                                                    j10 = jA3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jA2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jA;
                                j15 = j17;
                            }
                        }
                        this.f10415m = j15;
                        return j10;
                    }
                    i10 = iA ^ (-128);
                    j10 = i10;
                    this.f10415m = j15;
                    return j10;
                }
            }
            return S();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long S() throws IOException {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw y1.l();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int T() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long U() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int V() throws IOException {
            return z.c(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long W() throws IOException {
            return z.d(R());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String X() throws IOException {
            int iO = O();
            if (iO <= 0 || iO > q0()) {
                if (iO == 0) {
                    return "";
                }
                if (iO < 0) {
                    throw y1.m();
                }
                throw y1.s();
            }
            byte[] bArr = new byte[iO];
            long j10 = iO;
            b5.p(this.f10415m, bArr, 0L, j10);
            String str = new String(bArr, t1.f10215b);
            this.f10415m += j10;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public String Y() throws IOException {
            int iO = O();
            if (iO > 0 && iO <= q0()) {
                String strG = c5.g(this.f10411i, n0(this.f10415m), iO);
                this.f10415m += (long) iO;
                return strG;
            }
            if (iO == 0) {
                return "";
            }
            if (iO <= 0) {
                throw y1.m();
            }
            throw y1.s();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int Z() throws IOException {
            if (j()) {
                this.f10418p = 0;
                return 0;
            }
            int iO = O();
            this.f10418p = iO;
            if (f5.a(iO) != 0) {
                return this.f10418p;
            }
            throw y1.i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void a(final int value) throws y1 {
            if (this.f10418p != value) {
                throw y1.h();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int a0() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public long b0() throws IOException {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        @Deprecated
        public void c0(final int fieldNumber, final v2.a builder) throws IOException {
            F(fieldNumber, builder, v0.d());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void d0() {
            this.f10416n = this.f10415m;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void f(boolean enabled) {
            this.f10419q = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int g() {
            int i10 = this.f10420r;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - i();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int h() {
            return this.f10418p;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean h0(final int tag) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                r0();
                return true;
            }
            if (iB == 1) {
                l0(8);
                return true;
            }
            if (iB == 2) {
                l0(O());
                return true;
            }
            if (iB == 3) {
                j0();
                a(f5.c(f5.a(tag), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            l0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int i() {
            return (int) (this.f10415m - this.f10416n);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean i0(final int tag, final b0 output) throws IOException {
            int iB = f5.b(tag);
            if (iB == 0) {
                long jH = H();
                output.u1(tag);
                output.v1(jH);
                return true;
            }
            if (iB == 1) {
                long jN = N();
                output.u1(tag);
                output.Q0(jN);
                return true;
            }
            if (iB == 2) {
                u uVarY = y();
                output.u1(tag);
                output.M0(uVarY);
                return true;
            }
            if (iB == 3) {
                output.u1(tag);
                k0(output);
                int iC = f5.c(f5.a(tag), 4);
                a(iC);
                output.u1(iC);
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw y1.k();
            }
            int iM = M();
            output.u1(tag);
            output.P0(iM);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean j() throws IOException {
            return this.f10415m == this.f10414l;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void l0(final int length) throws IOException {
            if (length >= 0 && length <= q0()) {
                this.f10415m += (long) length;
            } else {
                if (length >= 0) {
                    throw y1.s();
                }
                throw y1.m();
            }
        }

        public final int n0(long pos) {
            return (int) (pos - this.f10413k);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public void t(final int oldLimit) {
            this.f10420r = oldLimit;
            p0();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public int u(int byteLimit) throws y1 {
            if (byteLimit < 0) {
                throw y1.m();
            }
            int i10 = byteLimit + i();
            int i11 = this.f10420r;
            if (i10 > i11) {
                throw y1.s();
            }
            this.f10420r = i10;
            p0();
            return i11;
        }

        public final ByteBuffer u0(long begin, long end) throws IOException {
            int iPosition = this.f10411i.position();
            int iLimit = this.f10411i.limit();
            ByteBuffer byteBuffer = this.f10411i;
            try {
                try {
                    byteBuffer.position(n0(begin));
                    byteBuffer.limit(n0(end));
                    ByteBuffer byteBufferSlice = this.f10411i.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e10) {
                    y1 y1VarS = y1.s();
                    y1VarS.initCause(e10);
                    throw y1VarS;
                }
            } catch (Throwable th2) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public boolean v() throws IOException {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public byte[] w() throws IOException {
            return L(O());
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public ByteBuffer x() throws IOException {
            int iO = O();
            if (iO <= 0 || iO > q0()) {
                if (iO == 0) {
                    return t1.f10219f;
                }
                if (iO < 0) {
                    throw y1.m();
                }
                throw y1.s();
            }
            if (this.f10412j || !this.f10419q) {
                byte[] bArr = new byte[iO];
                long j10 = iO;
                b5.p(this.f10415m, bArr, 0L, j10);
                this.f10415m += j10;
                return ByteBuffer.wrap(bArr);
            }
            long j11 = this.f10415m;
            long j12 = iO;
            ByteBuffer byteBufferU0 = u0(j11, j11 + j12);
            this.f10415m += j12;
            return byteBufferU0;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public u y() throws IOException {
            int iO = O();
            if (iO <= 0 || iO > q0()) {
                if (iO == 0) {
                    return u.f10242g;
                }
                if (iO < 0) {
                    throw y1.m();
                }
                throw y1.s();
            }
            if (this.f10412j && this.f10419q) {
                long j10 = this.f10415m;
                long j11 = iO;
                ByteBuffer byteBufferU0 = u0(j10, j10 + j11);
                this.f10415m += j11;
                return u.m0(byteBufferU0);
            }
            byte[] bArr = new byte[iO];
            long j12 = iO;
            b5.p(this.f10415m, bArr, 0L, j12);
            this.f10415m += j12;
            return u.n0(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(N());
        }

        public e(ByteBuffer buffer, boolean immutable) {
            super();
            this.f10420r = Integer.MAX_VALUE;
            this.f10411i = buffer;
            long jK = b5.k(buffer);
            this.f10413k = jK;
            this.f10414l = ((long) buffer.limit()) + jK;
            long jPosition = jK + ((long) buffer.position());
            this.f10415m = jPosition;
            this.f10416n = jPosition;
            this.f10412j = immutable;
        }
    }

    public static int P(final int firstByte, final InputStream input) throws IOException {
        if ((firstByte & 128) == 0) {
            return firstByte;
        }
        int i10 = firstByte & 127;
        int i11 = 7;
        while (i11 < 32) {
            int i12 = input.read();
            if (i12 == -1) {
                throw y1.s();
            }
            i10 |= (i12 & 127) << i11;
            if ((i12 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        while (i11 < 64) {
            int i13 = input.read();
            if (i13 == -1) {
                throw y1.s();
            }
            if ((i13 & 128) == 0) {
                return i10;
            }
            i11 += 7;
        }
        throw y1.l();
    }

    public static int Q(final InputStream input) throws IOException {
        int i10 = input.read();
        if (i10 != -1) {
            return P(i10, input);
        }
        throw y1.s();
    }

    public static int c(final int n10) {
        return (-(n10 & 1)) ^ (n10 >>> 1);
    }

    public static long d(final long n10) {
        return (-(n10 & 1)) ^ (n10 >>> 1);
    }

    public static z k(final InputStream input) {
        return l(input, 4096);
    }

    public static z l(final InputStream input, int bufferSize) {
        if (bufferSize > 0) {
            return input == null ? q(t1.f10218e) : new d(input, bufferSize);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static z m(final Iterable<ByteBuffer> input) {
        return !e.o0() ? k(new z1(input)) : n(input, false);
    }

    public static z n(final Iterable<ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : bufs) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new c(bufs, iRemaining, bufferIsImmutable) : k(new z1(bufs));
    }

    public static z o(ByteBuffer buf) {
        return p(buf, false);
    }

    public static z p(ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return s(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && e.o0()) {
            return new e(buf, bufferIsImmutable);
        }
        int iRemaining = buf.remaining();
        byte[] bArr = new byte[iRemaining];
        buf.duplicate().get(bArr);
        return s(bArr, 0, iRemaining, true);
    }

    public static z q(final byte[] buf) {
        return r(buf, 0, buf.length);
    }

    public static z r(final byte[] buf, final int off, final int len) {
        return s(buf, off, len, false);
    }

    public static z s(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        b bVar = new b(buf, off, len, bufferIsImmutable);
        try {
            bVar.u(len);
            return bVar;
        } catch (y1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int A() throws IOException;

    public abstract int B() throws IOException;

    public abstract long C() throws IOException;

    public abstract float D() throws IOException;

    public abstract <T extends v2> T E(final int fieldNumber, final m3<T> parser, final v0 extensionRegistry) throws IOException;

    public abstract void F(final int fieldNumber, final v2.a builder, final v0 extensionRegistry) throws IOException;

    public abstract int G() throws IOException;

    public abstract long H() throws IOException;

    public abstract <T extends v2> T I(final m3<T> parser, final v0 extensionRegistry) throws IOException;

    public abstract void J(final v2.a builder, final v0 extensionRegistry) throws IOException;

    public abstract byte K() throws IOException;

    public abstract byte[] L(final int size) throws IOException;

    public abstract int M() throws IOException;

    public abstract long N() throws IOException;

    public abstract int O() throws IOException;

    public abstract long R() throws IOException;

    public abstract long S() throws IOException;

    public abstract int T() throws IOException;

    public abstract long U() throws IOException;

    public abstract int V() throws IOException;

    public abstract long W() throws IOException;

    public abstract String X() throws IOException;

    public abstract String Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(final int value) throws y1;

    public abstract int a0() throws IOException;

    public void b() throws y1 {
        if (this.f10370a >= this.f10371b) {
            throw y1.o();
        }
    }

    public abstract long b0() throws IOException;

    @Deprecated
    public abstract void c0(final int fieldNumber, final v2.a builder) throws IOException;

    public abstract void d0();

    public final void e() {
        this.f10374e = true;
    }

    public final int e0(final int limit) {
        if (limit >= 0) {
            int i10 = this.f10371b;
            this.f10371b = limit;
            return i10;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + limit);
    }

    public abstract void f(boolean enabled);

    public final int f0(final int limit) {
        if (limit >= 0) {
            int i10 = this.f10372c;
            this.f10372c = limit;
            return i10;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + limit);
    }

    public abstract int g();

    public final boolean g0() {
        return this.f10374e;
    }

    public abstract int h();

    public abstract boolean h0(final int tag) throws IOException;

    public abstract int i();

    @Deprecated
    public abstract boolean i0(final int tag, final b0 output) throws IOException;

    public abstract boolean j() throws IOException;

    public void j0() throws IOException {
        boolean zH0;
        do {
            int iZ = Z();
            if (iZ == 0) {
                return;
            }
            b();
            this.f10370a++;
            zH0 = h0(iZ);
            this.f10370a--;
        } while (zH0);
    }

    public void k0(b0 output) throws IOException {
        boolean zI0;
        do {
            int iZ = Z();
            if (iZ == 0) {
                return;
            }
            b();
            this.f10370a++;
            zI0 = i0(iZ, output);
            this.f10370a--;
        } while (zI0);
    }

    public abstract void l0(final int size) throws IOException;

    public final void m0() {
        this.f10374e = false;
    }

    public abstract void t(final int oldLimit);

    public abstract int u(int byteLimit) throws y1;

    public abstract boolean v() throws IOException;

    public abstract byte[] w() throws IOException;

    public abstract ByteBuffer x() throws IOException;

    public abstract u y() throws IOException;

    public abstract double z() throws IOException;

    public z() {
        this.f10371b = f10369h;
        this.f10372c = Integer.MAX_VALUE;
        this.f10374e = false;
    }
}
