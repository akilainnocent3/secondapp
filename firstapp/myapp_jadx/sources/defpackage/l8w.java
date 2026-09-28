package defpackage;

import androidx.media3.common.a;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.twilio.voice.AudioFormat;

/* JADX INFO: loaded from: classes.dex */
public final class l8w implements fwf {
    public String e;
    public njg0 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final nsz a = new nsz(2, new byte[15]);
    public final msz b = new msz();
    public final nsz c = new nsz();
    public final m8w.a p = new m8w.a();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // defpackage.fwf
    public final void a(nsz nszVar) throws ssz {
        int i;
        int i2;
        int iG;
        int iG2;
        int i3;
        char c;
        byte[] bArr;
        long j;
        long j2;
        c150 c150VarO;
        int iG3;
        long j3;
        boolean z;
        int i4;
        ly0.g(this.f);
        while (nszVar.a() > 0) {
            int i5 = this.d;
            int i6 = 8;
            int i7 = 3;
            int i8 = 1;
            if (i5 != 0) {
                nsz nszVar2 = this.c;
                m8w.a aVar = this.p;
                if (i5 == 1) {
                    int iA = nszVar.a();
                    nsz nszVar3 = this.a;
                    int iMin = Math.min(iA, nszVar3.a());
                    nszVar.h(nszVar3.a, nszVar3.b, iMin);
                    nszVar3.J(iMin);
                    if (nszVar3.a() == 0) {
                        int i9 = nszVar3.c;
                        byte[] bArr2 = nszVar3.a;
                        msz mszVar = this.b;
                        mszVar.k(i9, bArr2);
                        mszVar.d();
                        int iA2 = m8w.a(mszVar, 3, 8, 8);
                        aVar.a = iA2;
                        if (iA2 != -1) {
                            ly0.b(Math.max(Math.max(2, 8), 32) <= 63);
                            dkt.a(dkt.a(3L, 255L), 4294967296L);
                            if (mszVar.b() < 2) {
                                j3 = -1;
                            } else {
                                long jI = mszVar.i(2);
                                if (jI == 3) {
                                    if (mszVar.b() >= 8) {
                                        long jI2 = mszVar.i(8);
                                        jI += jI2;
                                        if (jI2 == 255) {
                                            if (mszVar.b() >= 32) {
                                                jI = mszVar.i(32) + jI;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jI;
                            }
                            aVar.b = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw ssz.c("Contains sub-stream with an invalid packet label " + aVar.b);
                                }
                                if (j3 == 0) {
                                    int i10 = aVar.a;
                                    if (i10 == 1) {
                                        throw ssz.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i10 == 2) {
                                        throw ssz.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i10 == 17) {
                                        throw ssz.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iA3 = m8w.a(mszVar, 11, 24, 24);
                                aVar.c = iA3;
                                if (iA3 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i4 = 0;
                            this.n = 0;
                            this.o = aVar.c + i9 + this.o;
                        } else {
                            i4 = 0;
                        }
                        if (z) {
                            nszVar3.I(i4);
                            this.f.f(nszVar3.c, nszVar3);
                            nszVar3.F(2);
                            nszVar2.F(aVar.c);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i11 = nszVar3.c;
                            if (i11 < 15) {
                                nszVar3.H(i11 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i5 != 2) {
                        fm20.a();
                        return;
                    }
                    int i12 = aVar.a;
                    if (i12 == 1 || i12 == 17) {
                        int i13 = nszVar.b;
                        int iMin2 = Math.min(nszVar.a(), nszVar2.a());
                        nszVar.h(nszVar2.a, nszVar2.b, iMin2);
                        nszVar2.J(iMin2);
                        nszVar.I(i13);
                    }
                    int iMin3 = Math.min(nszVar.a(), aVar.c - this.n);
                    this.f.f(iMin3, nszVar);
                    int i14 = this.n + iMin3;
                    this.n = i14;
                    if (i14 != aVar.c) {
                        continue;
                    } else {
                        int i15 = aVar.a;
                        if (i15 == 1) {
                            byte[] bArr3 = nszVar2.a;
                            msz mszVar2 = new msz(bArr3.length, bArr3);
                            int iG4 = mszVar2.g(8);
                            int iG5 = mszVar2.g(5);
                            if (iG5 != 31) {
                                switch (iG5) {
                                    case 0:
                                        iG2 = 96000;
                                        break;
                                    case 1:
                                        iG2 = 88200;
                                        break;
                                    case 2:
                                        iG2 = 64000;
                                        break;
                                    case 3:
                                        iG2 = AudioFormat.AUDIO_SAMPLE_RATE_48000;
                                        break;
                                    case 4:
                                        iG2 = AudioFormat.AUDIO_SAMPLE_RATE_44100;
                                        break;
                                    case 5:
                                        iG2 = AudioFormat.AUDIO_SAMPLE_RATE_32000;
                                        break;
                                    case 6:
                                        iG2 = AudioFormat.AUDIO_SAMPLE_RATE_24000;
                                        break;
                                    case 7:
                                        iG2 = 22050;
                                        break;
                                    case 8:
                                        iG2 = AudioFormat.AUDIO_SAMPLE_RATE_16000;
                                        break;
                                    case 9:
                                        iG2 = 12000;
                                        break;
                                    case 10:
                                        iG2 = 11025;
                                        break;
                                    case 11:
                                        iG2 = AudioFormat.AUDIO_SAMPLE_RATE_8000;
                                        break;
                                    case 12:
                                        iG2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ssz.c("Unsupported sampling rate index " + iG5);
                                    case 15:
                                        iG2 = 57600;
                                        break;
                                    case 16:
                                        iG2 = 51200;
                                        break;
                                    case 17:
                                        iG2 = 40000;
                                        break;
                                    case 18:
                                        iG2 = 38400;
                                        break;
                                    case 19:
                                        iG2 = 34150;
                                        break;
                                    case 20:
                                        iG2 = 28800;
                                        break;
                                    case 21:
                                        iG2 = 25600;
                                        break;
                                    case 22:
                                        iG2 = 20000;
                                        break;
                                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                                        iG2 = 19200;
                                        break;
                                    case 24:
                                        iG2 = 17075;
                                        break;
                                    case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                                        iG2 = 14400;
                                        break;
                                    case RuntimeVersion.MINOR /* 26 */:
                                        iG2 = 12800;
                                        break;
                                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                        iG2 = 9600;
                                        break;
                                }
                            } else {
                                iG2 = mszVar2.g(24);
                            }
                            int iG6 = mszVar2.g(3);
                            if (iG6 == 0) {
                                i3 = 768;
                            } else if (iG6 == 1) {
                                i3 = 1024;
                            } else if (iG6 == 2 || iG6 == 3) {
                                i3 = 2048;
                            } else {
                                if (iG6 != 4) {
                                    throw ssz.c("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                i3 = 4096;
                            }
                            int i16 = i3;
                            if (iG6 == 0 || iG6 == 1) {
                                c = 0;
                            } else if (iG6 == 2) {
                                c = 2;
                            } else if (iG6 == 3) {
                                c = 3;
                            } else {
                                if (iG6 != 4) {
                                    throw ssz.c("Unsupported coreSbrFrameLengthIndex " + iG6);
                                }
                                c = 1;
                            }
                            mszVar2.o(2);
                            m8w.c(mszVar2);
                            int iG7 = mszVar2.g(5);
                            int i17 = 0;
                            int iA4 = 0;
                            while (true) {
                                int i18 = i8;
                                int i19 = 16;
                                if (i17 < iG7 + 1) {
                                    int iG8 = mszVar2.g(3);
                                    iA4 = m8w.a(mszVar2, 5, 8, 16) + 1 + iA4;
                                    if ((iG8 == 0 || iG8 == 2) && mszVar2.f()) {
                                        m8w.c(mszVar2);
                                    }
                                    i17++;
                                    i8 = i18;
                                } else {
                                    int iA5 = m8w.a(mszVar2, 4, 8, 16) + 1;
                                    mszVar2.n();
                                    int i20 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i20 < iA5) {
                                            int iG9 = mszVar2.g(2);
                                            if (iG9 == 0) {
                                                mszVar2.o(i7);
                                                if (mszVar2.f()) {
                                                    mszVar2.o(13);
                                                }
                                                if (c > 0) {
                                                    m8w.b(mszVar2);
                                                }
                                            } else if (iG9 == i18) {
                                                mszVar2.o(i7);
                                                boolean zF = mszVar2.f();
                                                if (zF) {
                                                    mszVar2.o(13);
                                                }
                                                if (zF) {
                                                    mszVar2.n();
                                                }
                                                if (c > 0) {
                                                    m8w.b(mszVar2);
                                                    iG3 = mszVar2.g(2);
                                                } else {
                                                    iG3 = 0;
                                                }
                                                if (iG3 > 0) {
                                                    mszVar2.o(6);
                                                    int iG10 = mszVar2.g(2);
                                                    mszVar2.o(4);
                                                    if (mszVar2.f()) {
                                                        mszVar2.o(5);
                                                    }
                                                    if (iG3 == 2 || iG3 == i7) {
                                                        mszVar2.o(6);
                                                    }
                                                    if (iG10 == 2) {
                                                        mszVar2.n();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iA4 - 1) / Math.log(2.0d))) + 1;
                                                int iG11 = mszVar2.g(2);
                                                if (iG11 > 0 && mszVar2.f()) {
                                                    mszVar2.o(iFloor);
                                                }
                                                if (mszVar2.f()) {
                                                    mszVar2.o(iFloor);
                                                }
                                                if (c == 0 && iG11 == 0) {
                                                    mszVar2.n();
                                                }
                                            } else if (iG9 == i7) {
                                                m8w.a(mszVar2, 4, i6, i19);
                                                int iA6 = m8w.a(mszVar2, 4, i6, i19);
                                                if (mszVar2.f()) {
                                                    m8w.a(mszVar2, i6, i19, 0);
                                                }
                                                mszVar2.n();
                                                if (iA6 > 0) {
                                                    mszVar2.o(iA6 * 8);
                                                }
                                            }
                                            i20++;
                                            i6 = 8;
                                            i7 = 3;
                                            i19 = 16;
                                            i18 = 1;
                                        } else {
                                            if (mszVar2.f()) {
                                                int i21 = 8;
                                                int iA7 = m8w.a(mszVar2, 2, 4, 8) + 1;
                                                int i22 = 0;
                                                bArr = null;
                                                while (i22 < iA7) {
                                                    int iA8 = m8w.a(mszVar2, 4, i21, 16);
                                                    int iA9 = m8w.a(mszVar2, 4, i21, 16);
                                                    if (iA8 == 7) {
                                                        int iG12 = mszVar2.g(4) + 1;
                                                        mszVar2.o(4);
                                                        byte[] bArr4 = new byte[iG12];
                                                        for (int i23 = 0; i23 < iG12; i23++) {
                                                            bArr4[i23] = (byte) mszVar2.g(i21);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        mszVar2.o(iA9 * i21);
                                                    }
                                                    i22++;
                                                    i21 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iG2) {
                                                case 14700:
                                                case AudioFormat.AUDIO_SAMPLE_RATE_16000 /* 16000 */:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = iG4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iG4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            c150VarO = null;
                                                        } else {
                                                            c150VarO = pcn.o(jrh0.b, bArr);
                                                        }
                                                        a.C0062a c0062a = new a.C0062a();
                                                        c0062a.a = this.e;
                                                        c0062a.l = gqv.m("video/mp2t");
                                                        c0062a.m = gqv.m("audio/mhm1");
                                                        c0062a.F = this.q;
                                                        c0062a.j = strConcat;
                                                        c0062a.p = c150VarO;
                                                        this.f.d(new a(c0062a));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case AudioFormat.AUDIO_SAMPLE_RATE_24000 /* 24000 */:
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c150VarO = null;
                                                        } else {
                                                            c150VarO = null;
                                                        }
                                                        a.C0062a c0062a2 = new a.C0062a();
                                                        c0062a2.a = this.e;
                                                        c0062a2.l = gqv.m("video/mp2t");
                                                        c0062a2.m = gqv.m("audio/mhm1");
                                                        c0062a2.F = this.q;
                                                        c0062a2.j = strConcat;
                                                        c0062a2.p = c150VarO;
                                                        this.f.d(new a(c0062a2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case AudioFormat.AUDIO_SAMPLE_RATE_32000 /* 32000 */:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c150VarO = null;
                                                        } else {
                                                            c150VarO = null;
                                                        }
                                                        a.C0062a c0062a3 = new a.C0062a();
                                                        c0062a3.a = this.e;
                                                        c0062a3.l = gqv.m("video/mp2t");
                                                        c0062a3.m = gqv.m("audio/mhm1");
                                                        c0062a3.F = this.q;
                                                        c0062a3.j = strConcat;
                                                        c0062a3.p = c150VarO;
                                                        this.f.d(new a(c0062a3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case AudioFormat.AUDIO_SAMPLE_RATE_44100 /* 44100 */:
                                                case AudioFormat.AUDIO_SAMPLE_RATE_48000 /* 48000 */:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) iG2) * d);
                                                    this.r = (int) (((double) i16) * d);
                                                    j = this.t;
                                                    j2 = aVar.b;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (iG4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c150VarO = null;
                                                        } else {
                                                            c150VarO = null;
                                                        }
                                                        a.C0062a c0062a4 = new a.C0062a();
                                                        c0062a4.a = this.e;
                                                        c0062a4.l = gqv.m("video/mp2t");
                                                        c0062a4.m = gqv.m("audio/mhm1");
                                                        c0062a4.F = this.q;
                                                        c0062a4.j = strConcat;
                                                        c0062a4.p = c150VarO;
                                                        this.f.d(new a(c0062a4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw ssz.c("Unsupported sampling rate " + iG2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i15 == 17) {
                                byte[] bArr5 = nszVar2.a;
                                msz mszVar3 = new msz(bArr5.length, bArr5);
                                if (mszVar3.f()) {
                                    mszVar3.o(2);
                                    iG = mszVar3.g(13);
                                } else {
                                    iG = 0;
                                }
                                this.s = iG;
                            } else if (i15 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i24 = this.k;
                if ((i24 & 2) == 0) {
                    nszVar.I(nszVar.c);
                } else {
                    if ((i24 & 4) == 0) {
                        while (true) {
                            if (nszVar.a() > 0) {
                                int i25 = this.l << 8;
                                this.l = i25;
                                int iW = i25 | nszVar.w();
                                this.l = iW;
                                if ((iW & 16777215) == 12583333) {
                                    nszVar.I(nszVar.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.F(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
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
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }
}
