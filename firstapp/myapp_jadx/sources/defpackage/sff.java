package defpackage;

import androidx.media3.common.a;
import com.twilio.voice.AudioFormat;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class sff implements fwf {
    public final nsz a;
    public final String c;
    public final int d;
    public String e;
    public njg0 f;
    public int h;
    public int i;
    public long j;
    public a k;
    public int l;
    public int m;
    public int g = 0;
    public long p = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int n = -1;
    public int o = -1;

    public sff(String str, int i, int i2) {
        this.a = new nsz(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x047e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0486  */
    /* JADX WARN: Code duplicated, block: B:183:0x0489 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x048b  */
    /* JADX WARN: Code duplicated, block: B:187:0x049b  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b9  */
    @Override // defpackage.fwf
    public final void a(nsz nszVar) throws ssz {
        int i;
        int i2;
        byte b;
        boolean z;
        int i3;
        int i4;
        byte b2;
        int i5;
        byte b3;
        int i6;
        byte b4;
        int i7;
        int i8;
        int iG;
        int iG2;
        int iG3;
        int i9;
        long jV;
        int i10;
        long jV2;
        int i11;
        int i12;
        int i13;
        int i14;
        ly0.g(this.f);
        while (nszVar.a() > 0) {
            int i15 = this.g;
            int i16 = 8;
            nsz nszVar2 = this.a;
            switch (i15) {
                case 0:
                    while (nszVar.a() > 0) {
                        int i17 = this.i << 8;
                        this.i = i17;
                        int iW = i17 | nszVar.w();
                        this.i = iW;
                        if (iW == 2147385345 || iW == -25230976 || iW == 536864768 || iW == -14745368) {
                            i = 1;
                        } else if (iW == 1683496997 || iW == 622876772) {
                            i = 2;
                        } else if (iW == 1078008818 || iW == -233094848) {
                            i = 3;
                        } else {
                            i = (iW == 1908687592 || iW == -398277519) ? 4 : 0;
                        }
                        this.m = i;
                        if (i != 0) {
                            byte[] bArr = nszVar2.a;
                            bArr[0] = (byte) ((iW >> 24) & 255);
                            bArr[1] = (byte) ((iW >> 16) & 255);
                            bArr[2] = (byte) ((iW >> 8) & 255);
                            bArr[3] = (byte) (iW & 255);
                            this.h = 4;
                            this.i = 0;
                            if (i != 3 && i != 4) {
                                if (i == 1) {
                                    this.g = 1;
                                } else {
                                    this.g = 2;
                                }
                            }
                            this.g = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(nszVar, nszVar2.a, 18)) {
                        byte[] bArr2 = nszVar2.a;
                        if (this.k == null) {
                            String str = this.e;
                            msz mszVarA = tff.a(bArr2);
                            mszVarA.o(60);
                            int i18 = tff.a[mszVarA.g(6)];
                            int i19 = tff.b[mszVarA.g(4)];
                            int iG4 = mszVarA.g(5);
                            int i20 = iG4 >= 29 ? -1 : (tff.c[iG4] * 1000) / 2;
                            mszVarA.o(10);
                            int i21 = i18 + (mszVarA.g(2) > 0 ? 1 : 0);
                            a.C0062a c0062a = new a.C0062a();
                            c0062a.a = str;
                            c0062a.l = gqv.m("video/mp2t");
                            c0062a.m = gqv.m("audio/vnd.dts");
                            c0062a.h = i20;
                            c0062a.E = i21;
                            c0062a.F = i19;
                            c0062a.q = null;
                            c0062a.d = this.c;
                            c0062a.f = this.d;
                            a aVar = new a(c0062a);
                            this.k = aVar;
                            this.f.d(aVar);
                        }
                        byte b5 = bArr2[0];
                        if (b5 != -2) {
                            if (b5 == -1) {
                                i6 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b4 = bArr2[9];
                            } else if (b5 != 31) {
                                i2 = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b = bArr2[7];
                            } else {
                                i6 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b4 = bArr2[8];
                            }
                            i3 = (i6 | ((b4 & 60) >> 2)) + 1;
                            z = true;
                            if (z) {
                                i3 = (i3 * 16) / 14;
                            }
                            this.l = i3;
                            if (b5 != -2) {
                                if (b5 != -1) {
                                    i4 = (bArr2[4] & 7) << 4;
                                    b3 = bArr2[7];
                                } else if (b5 != 31) {
                                    i4 = (bArr2[4] & 1) << 6;
                                    b2 = bArr2[5];
                                } else {
                                    i4 = (bArr2[5] & 7) << 4;
                                    b3 = bArr2[6];
                                }
                                i5 = b3 & 60;
                                this.j = c0p.q(jrh0.T(this.k.G, (((i5 >> 2) | i4) + 1) * 32));
                                nszVar2.I(0);
                                this.f.f(18, nszVar2);
                                this.g = 6;
                            } else {
                                i4 = (bArr2[5] & 1) << 6;
                                b2 = bArr2[4];
                            }
                            i5 = b2 & 252;
                            this.j = c0p.q(jrh0.T(this.k.G, (((i5 >> 2) | i4) + 1) * 32));
                            nszVar2.I(0);
                            this.f.f(18, nszVar2);
                            this.g = 6;
                        } else {
                            i2 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b = bArr2[6];
                        }
                        i3 = (i2 | ((b & 240) >> 4)) + 1;
                        z = false;
                        if (z) {
                            i3 = (i3 * 16) / 14;
                        }
                        this.l = i3;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i4 = (bArr2[4] & 7) << 4;
                                b3 = bArr2[7];
                            } else if (b5 != 31) {
                                i4 = (bArr2[4] & 1) << 6;
                                b2 = bArr2[5];
                            } else {
                                i4 = (bArr2[5] & 7) << 4;
                                b3 = bArr2[6];
                            }
                            i5 = b3 & 60;
                            this.j = c0p.q(jrh0.T(this.k.G, (((i5 >> 2) | i4) + 1) * 32));
                            nszVar2.I(0);
                            this.f.f(18, nszVar2);
                            this.g = 6;
                        } else {
                            i4 = (bArr2[5] & 1) << 6;
                            b2 = bArr2[4];
                        }
                        i5 = b2 & 252;
                        this.j = c0p.q(jrh0.T(this.k.G, (((i5 >> 2) | i4) + 1) * 32));
                        nszVar2.I(0);
                        this.f.f(18, nszVar2);
                        this.g = 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(nszVar, nszVar2.a, 7)) {
                        msz mszVarA2 = tff.a(nszVar2.a);
                        mszVarA2.o(42);
                        this.n = mszVarA2.g(mszVarA2.f() ? 12 : 8) + 1;
                        this.g = 3;
                    }
                    break;
                case 3:
                    if (b(nszVar, nszVar2.a, this.n)) {
                        msz mszVarA3 = tff.a(nszVar2.a);
                        mszVarA3.o(40);
                        int iG5 = mszVarA3.g(2);
                        if (mszVarA3.f()) {
                            i7 = 20;
                            i8 = 12;
                        } else {
                            i7 = 16;
                            i8 = 8;
                        }
                        mszVarA3.o(i8);
                        int iG6 = mszVarA3.g(i7) + 1;
                        boolean zF = mszVarA3.f();
                        if (zF) {
                            iG = mszVarA3.g(2);
                            iG2 = (mszVarA3.g(3) + 1) * 512;
                            if (mszVarA3.f()) {
                                mszVarA3.o(36);
                            }
                            int iG7 = mszVarA3.g(3) + 1;
                            int iG8 = mszVarA3.g(3) + 1;
                            if (iG7 != 1 || iG8 != 1) {
                                throw ssz.c("Multiple audio presentations or assets not supported");
                            }
                            int i22 = iG5 + 1;
                            int iG9 = mszVarA3.g(i22);
                            int i23 = 0;
                            while (i23 < i22) {
                                if (((iG9 >> i23) & 1) == 1) {
                                    mszVarA3.o(i16);
                                }
                                i23++;
                                i16 = 8;
                            }
                            if (mszVarA3.f()) {
                                mszVarA3.o(2);
                                int iG10 = (mszVarA3.g(2) + 1) << 2;
                                int iG11 = mszVarA3.g(2) + 1;
                                for (int i24 = 0; i24 < iG11; i24++) {
                                    mszVarA3.o(iG10);
                                }
                            }
                        } else {
                            iG = -1;
                            iG2 = 0;
                        }
                        mszVarA3.o(i7);
                        mszVarA3.o(12);
                        if (zF) {
                            if (mszVarA3.f()) {
                                mszVarA3.o(4);
                            }
                            if (mszVarA3.f()) {
                                mszVarA3.o(24);
                            }
                            if (mszVarA3.f()) {
                                mszVarA3.p(mszVarA3.g(10) + 1);
                            }
                            mszVarA3.o(5);
                            int i25 = tff.d[mszVarA3.g(4)];
                            iG3 = mszVarA3.g(8) + 1;
                            i9 = i25;
                        } else {
                            iG3 = -1;
                            i9 = -2147483647;
                        }
                        if (zF) {
                            if (iG == 0) {
                                i10 = AudioFormat.AUDIO_SAMPLE_RATE_32000;
                            } else if (iG == 1) {
                                i10 = AudioFormat.AUDIO_SAMPLE_RATE_44100;
                            } else {
                                if (iG != 2) {
                                    throw ssz.a(null, "Unsupported reference clock code in DTS HD header: " + iG);
                                }
                                i10 = AudioFormat.AUDIO_SAMPLE_RATE_48000;
                            }
                            String str2 = jrh0.a;
                            jV = jrh0.V(iG2, 1000000L, i10, RoundingMode.DOWN);
                        } else {
                            jV = -9223372036854775807L;
                        }
                        g(new tff.a(iG3, i9, iG6, jV, "audio/vnd.dts.hd;profile=lbr"));
                        this.l = iG6;
                        this.j = jV == -9223372036854775807L ? 0L : jV;
                        nszVar2.I(0);
                        this.f.f(this.n, nszVar2);
                        this.g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (b(nszVar, nszVar2.a, 6)) {
                        msz mszVarA4 = tff.a(nszVar2.a);
                        mszVarA4.o(32);
                        int iB = tff.b(mszVarA4, tff.i) + 1;
                        this.o = iB;
                        int i26 = this.h;
                        if (i26 > iB) {
                            int i27 = i26 - iB;
                            this.h = i26 - i27;
                            nszVar.I(nszVar.b - i27);
                        }
                        this.g = 5;
                    }
                    break;
                case 5:
                    if (b(nszVar, nszVar2.a, this.o)) {
                        byte[] bArr3 = nszVar2.a;
                        msz mszVarA5 = tff.a(bArr3);
                        int i28 = mszVarA5.g(32) == 1078008818 ? 1 : 0;
                        int iB2 = tff.b(mszVarA5, tff.e);
                        int i29 = iB2 + 1;
                        if (i28 == 0) {
                            jV2 = -9223372036854775807L;
                            i11 = -2147483647;
                        } else {
                            if (!mszVarA5.f()) {
                                throw ssz.c("Only supports full channel mask-based audio presentation");
                            }
                            int i30 = iB2 - 1;
                            int i31 = ((bArr3[i30] << 8) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (bArr3[iB2] & 255);
                            String str3 = jrh0.a;
                            int i32 = 65535;
                            for (int i33 = 0; i33 < i30; i33++) {
                                byte b6 = bArr3[i33];
                                int i34 = (((i32 >> 12) & 255) ^ ((b6 & 255) >> 4)) & 255;
                                int i35 = (i32 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                int[] iArr = jrh0.j;
                                int i36 = (iArr[i34] ^ i35) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                i32 = (iArr[((b6 & 15) ^ ((i36 >> 12) & 255)) & 255] ^ ((i36 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            }
                            if (i31 != i32) {
                                throw ssz.a(null, "CRC check failed");
                            }
                            int iG12 = mszVarA5.g(2);
                            if (iG12 != 0) {
                                if (iG12 == 1) {
                                    i13 = 480;
                                } else {
                                    if (iG12 != 2) {
                                        throw ssz.a(null, "Unsupported base duration index in DTS UHD header: " + iG12);
                                    }
                                    i13 = 384;
                                }
                                i12 = 3;
                            } else {
                                i12 = 3;
                                i13 = 512;
                            }
                            int iG13 = (mszVarA5.g(i12) + 1) * i13;
                            int iG14 = mszVarA5.g(2);
                            if (iG14 == 0) {
                                i14 = AudioFormat.AUDIO_SAMPLE_RATE_32000;
                            } else if (iG14 == 1) {
                                i14 = AudioFormat.AUDIO_SAMPLE_RATE_44100;
                            } else {
                                if (iG14 != 2) {
                                    throw ssz.a(null, "Unsupported clock rate index in DTS UHD header: " + iG14);
                                }
                                i14 = AudioFormat.AUDIO_SAMPLE_RATE_48000;
                            }
                            if (mszVarA5.f()) {
                                mszVarA5.o(36);
                            }
                            int iG15 = i14 * (1 << mszVarA5.g(2));
                            jV2 = jrh0.V(iG13, 1000000L, i14, RoundingMode.DOWN);
                            i11 = iG15;
                        }
                        int iB3 = 0;
                        for (int i37 = 0; i37 < i28; i37++) {
                            iB3 += tff.b(mszVarA5, tff.f);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i28 != 0) {
                            atomicInteger.set(tff.b(mszVarA5, tff.g));
                        }
                        int iB4 = iB3 + (atomicInteger.get() != 0 ? tff.b(mszVarA5, tff.h) : 0) + i29;
                        long j = jV2;
                        tff.a aVar2 = new tff.a(2, i11, iB4, j, "audio/vnd.dts.uhd;profile=p2");
                        if (this.m == 3) {
                            g(aVar2);
                        }
                        this.l = iB4;
                        this.j = j == -9223372036854775807L ? 0L : j;
                        nszVar2.I(0);
                        this.f.f(this.o, nszVar2);
                        this.g = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(nszVar.a(), this.l - this.h);
                    this.f.f(iMin, nszVar);
                    int i38 = this.h + iMin;
                    this.h = i38;
                    if (i38 == this.l) {
                        ly0.f(this.p != -9223372036854775807L);
                        this.f.a(this.p, this.m == 4 ? 0 : 1, this.l, 0, null);
                        this.p += this.j;
                        this.g = 0;
                    }
                    break;
                default:
                    fm20.a();
                    return;
            }
        }
    }

    public final boolean b(nsz nszVar, byte[] bArr, int i) {
        int iMin = Math.min(nszVar.a(), i - this.h);
        nszVar.h(bArr, this.h, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    @Override // defpackage.fwf
    public final void c() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.e = cVar.e;
        cVar.b();
        this.f = m4hVar.r(cVar.d, 1);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.p = j;
    }

    public final void g(tff.a aVar) {
        int i = aVar.b;
        String str = aVar.a;
        int i2 = aVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        a aVar2 = this.k;
        if (aVar2 != null && i2 == aVar2.F && i == aVar2.G && str.equals(aVar2.n)) {
            return;
        }
        a aVar3 = this.k;
        a.C0062a c0062a = aVar3 == null ? new a.C0062a() : aVar3.a();
        c0062a.a = this.e;
        c0062a.l = gqv.m("video/mp2t");
        c0062a.m = gqv.m(str);
        c0062a.E = i2;
        c0062a.F = i;
        c0062a.d = this.c;
        c0062a.f = this.d;
        a aVar4 = new a(c0062a);
        this.k = aVar4;
        this.f.d(aVar4);
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }
}
