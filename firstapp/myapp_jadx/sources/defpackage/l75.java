package defpackage;

import android.util.Pair;
import androidx.media3.common.DrmInitData;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.twilio.voice.AudioFormat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l75 {
    public static final byte[] a;

    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public static final class b {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final nsz f;
        public final nsz g;
        public int h;
        public int i;

        public b(nsz nszVar, nsz nszVar2, boolean z) throws ssz {
            this.g = nszVar;
            this.f = nszVar2;
            this.e = z;
            nszVar2.I(12);
            this.a = nszVar2.A();
            nszVar.I(12);
            this.i = nszVar.A();
            n4h.a("first_chunk must be 1", nszVar.j() == 1);
            this.b = -1;
        }

        public final boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            boolean z = this.e;
            nsz nszVar = this.f;
            this.d = z ? nszVar.B() : nszVar.y();
            if (this.b == this.h) {
                nsz nszVar2 = this.g;
                this.c = nszVar2.A();
                nszVar2.J(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? nszVar2.A() - 1 : -1;
            }
            return true;
        }
    }

    public static final class c {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public c(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    public static final class d {
        public final f a;

        public d(f fVar) {
            this.a = fVar;
        }
    }

    public interface e {
        int a();

        int b();

        int c();
    }

    public static final class f {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public f(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    public static final class g {
        public final gjg0[] a;
        public androidx.media3.common.a b;
        public int c;
        public int d = 0;

        public g(int i) {
            this.a = new gjg0[i];
        }
    }

    public static final class h implements e {
        public final int a;
        public final int b;
        public final nsz c;

        public h(c8w.b bVar, androidx.media3.common.a aVar) {
            nsz nszVar = bVar.b;
            this.c = nszVar;
            nszVar.I(12);
            int iA = nszVar.A();
            if ("audio/raw".equals(aVar.n)) {
                int iT = jrh0.t(aVar.H) * aVar.F;
                if (iA == 0 || iA % iT != 0) {
                    cft.g("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iT + ", stsz sample size: " + iA);
                    iA = iT;
                }
            }
            this.a = iA == 0 ? -1 : iA;
            this.b = nszVar.A();
        }

        @Override // l75.e
        public final int a() {
            int i = this.a;
            return i == -1 ? this.c.A() : i;
        }

        @Override // l75.e
        public final int b() {
            return this.a;
        }

        @Override // l75.e
        public final int c() {
            return this.b;
        }
    }

    public static final class i implements e {
        public final nsz a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public i(c8w.b bVar) {
            nsz nszVar = bVar.b;
            this.a = nszVar;
            nszVar.I(12);
            this.c = nszVar.A() & 255;
            this.b = nszVar.A();
        }

        @Override // l75.e
        public final int a() {
            nsz nszVar = this.a;
            int i = this.c;
            if (i == 8) {
                return nszVar.w();
            }
            if (i == 16) {
                return nszVar.C();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.e & 15;
            }
            int iW = nszVar.w();
            this.e = iW;
            return (iW & 240) >> 4;
        }

        @Override // l75.e
        public final int b() {
            return -1;
        }

        @Override // l75.e
        public final int c() {
            return this.b;
        }
    }

    public static final class j {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public j(int i, int i2, int i3, int i4, int i5, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static final class k {
        public final d a;

        public k(d dVar) {
            this.a = dVar;
        }
    }

    static {
        String str = jrh0.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(nsz nszVar) {
        int i2 = nszVar.b;
        nszVar.J(4);
        if (nszVar.j() != 1751411826) {
            i2 += 4;
        }
        nszVar.I(i2);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x040c  */
    /* JADX WARN: Code duplicated, block: B:272:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:291:0x05de  */
    /* JADX WARN: Code duplicated, block: B:365:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:488:0x09ec A[LOOP:15: B:488:0x09ec->B:620:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:493:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:496:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:614:? A[LOOP:12: B:476:0x09b3->B:614:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[LOOP:13: B:480:0x09cd->B:616:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[LOOP:14: B:483:0x09d5->B:618:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:? A[LOOP:15: B:488:0x09ec->B:620:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    public static void b(nsz nszVar, int i2, int i3, int i4, int i5, String str, boolean z, DrmInitData drmInitData, g gVar, int i6) throws ssz {
        int iC;
        int i7;
        int iC2;
        int iJ;
        int i8;
        int i9;
        int i10;
        DrmInitData drmInitDataA;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c2;
        nsz nszVar2;
        String strU;
        char c3;
        msz mszVar;
        int iG;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean zF;
        int iG2;
        int iG3;
        int i23;
        int i24;
        boolean z2;
        boolean zF2;
        int i25;
        int iG4;
        String str3;
        nsz nszVar3 = nszVar;
        int iIntValue = i2;
        int i26 = i4;
        nszVar3.I(i3 + 16);
        if (z) {
            iC = nszVar3.C();
            nszVar3.J(6);
        } else {
            nszVar3.J(8);
            iC = 0;
        }
        int i27 = 32;
        if (iC == 0 || iC == 1) {
            i7 = 2;
            iC2 = nszVar3.C();
            nszVar3.J(6);
            int iX = nszVar3.x();
            nszVar3.I(nszVar3.b - 4);
            iJ = nszVar3.j();
            if (iC == 1) {
                nszVar3.J(16);
            }
            i8 = iX;
            i9 = -1;
        } else {
            if (iC != 2) {
                return;
            }
            nszVar3.J(16);
            int iRound = (int) Math.round(Double.longBitsToDouble(nszVar3.q()));
            int iA = nszVar3.A();
            nszVar3.J(4);
            i7 = 2;
            int iA2 = nszVar3.A();
            int iA3 = nszVar3.A();
            boolean z3 = (iA3 & 1) != 0;
            boolean z4 = (iA3 & 2) != 0;
            if (z3) {
                if (iA2 == 32) {
                    i9 = 4;
                } else {
                    i9 = -1;
                }
            } else if (iA2 == 8) {
                i9 = 3;
            } else if (iA2 == 16) {
                i9 = z4 ? 268435456 : 2;
            } else if (iA2 == 24) {
                i9 = z4 ? 1342177280 : 21;
            } else if (iA2 == 32) {
                i9 = z4 ? 1610612736 : 22;
            } else {
                i9 = -1;
            }
            nszVar3.J(8);
            i8 = iRound;
            iC2 = iA;
            iJ = 0;
        }
        if (iIntValue == 1767992678) {
            iC2 = -1;
            i8 = -1;
        } else {
            if (iIntValue == 1935764850) {
                i10 = AudioFormat.AUDIO_SAMPLE_RATE_8000;
            } else if (iIntValue == 1935767394) {
                i10 = AudioFormat.AUDIO_SAMPLE_RATE_16000;
            }
            i8 = i10;
            iC2 = 1;
        }
        int i28 = nszVar3.b;
        if (iIntValue == 1701733217) {
            Pair<Integer, gjg0> pairH = h(nszVar3, i3, i26);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                drmInitDataA = drmInitData == null ? null : drmInitData.a(((gjg0) pairH.second).b);
                gVar.a[i6] = (gjg0) pairH.second;
            } else {
                drmInitDataA = drmInitData;
            }
            nszVar3.I(i28);
        } else {
            drmInitDataA = drmInitData;
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            i11 = i9;
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            i11 = i9;
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            i11 = i9;
            str2 = "audio/ac4";
        } else {
            if (iIntValue == 1685353315) {
                str2 = "audio/vnd.dts";
            } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
                str2 = "audio/vnd.dts.hd";
            } else if (iIntValue == 1685353317) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            } else if (iIntValue == 1685353336) {
                str2 = "audio/vnd.dts.uhd;profile=p2";
            } else if (iIntValue == 1935764850) {
                str2 = "audio/3gpp";
            } else if (iIntValue == 1935767394) {
                str2 = "audio/amr-wb";
            } else if (iIntValue == 1936684916) {
                i11 = i7;
                str2 = "audio/raw";
            } else if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                i11 = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i9 == -1) {
                    i11 = i7;
                } else {
                    i11 = i9;
                }
                str2 = "audio/raw";
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else if (iIntValue == 1767992678) {
                str2 = "audio/iamf";
            } else {
                i11 = i9;
                str2 = null;
            }
            i11 = i9;
        }
        c cVar = null;
        String str5 = null;
        List<byte[]> listN = null;
        a aVar = null;
        while (i28 - i3 < i26) {
            nszVar3.I(i28);
            int iJ2 = nszVar3.j();
            i11 = i11;
            n4h.a("childAtomSize must be positive", iJ2 > 0);
            int iJ3 = nszVar3.j();
            str5 = str5;
            if (iJ3 == 1835557187) {
                nszVar3.I(i28 + 8);
                nszVar3.J(1);
                int iW = nszVar3.w();
                nszVar3.J(1);
                str5 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iW)) : String.format("mha1.%02X", Integer.valueOf(iW));
                int iC3 = nszVar3.C();
                byte[] bArr = new byte[iC3];
                String str6 = str2;
                nszVar3.h(bArr, 0, iC3);
                listN = listN == null ? pcn.n(bArr) : pcn.o(bArr, listN.get(0));
                str2 = str6;
            } else {
                str2 = str2;
                if (iJ3 == 1835557200) {
                    nszVar3.I(i28 + 8);
                    int iW2 = nszVar3.w();
                    if (iW2 > 0) {
                        byte[] bArr2 = new byte[iW2];
                        nszVar3.h(bArr2, 0, iW2);
                        listN = listN == null ? pcn.n(bArr2) : pcn.o(listN.get(0), bArr2);
                    }
                    str2 = str2;
                    str5 = str5;
                } else if (iJ3 == 1702061171 || (z && iJ3 == 2002876005)) {
                    int i29 = iJ2;
                    int i30 = i28;
                    int i31 = iC2;
                    int i32 = i8;
                    str4 = str4;
                    List<byte[]> list = listN;
                    i12 = iIntValue;
                    if (iJ3 == 1702061171) {
                        i15 = i29;
                        i13 = i30;
                        i14 = i13;
                    } else {
                        int i33 = nszVar3.b;
                        i13 = i30;
                        n4h.a(null, i33 >= i13);
                        i14 = i33;
                        while (true) {
                            i15 = i29;
                            if (i14 - i13 < i15) {
                                nszVar3.I(i14);
                                int iJ4 = nszVar3.j();
                                n4h.a("childAtomSize must be positive", iJ4 > 0);
                                if (nszVar3.j() != 1702061171) {
                                    i14 += iJ4;
                                    i29 = i15;
                                }
                            } else {
                                i14 = -1;
                            }
                        }
                    }
                    if (i14 != -1) {
                        c cVarC = c(i14, nszVar3);
                        String str7 = cVarC.a;
                        byte[] bArr3 = cVarC.b;
                        if (bArr3 != null) {
                            if ("audio/vorbis".equals(str7)) {
                                nsz nszVar4 = new nsz(bArr3);
                                nszVar4.J(1);
                                int i34 = 0;
                                while (nszVar4.a() > 0 && (nszVar4.a[nszVar4.b] & 255) == 255) {
                                    i34 += 255;
                                    nszVar4.J(1);
                                }
                                int iW3 = nszVar4.w() + i34;
                                int i35 = 0;
                                while (true) {
                                    if (nszVar4.a() > 0) {
                                        i28 = i13;
                                        if ((nszVar4.a[nszVar4.b] & 255) == 255) {
                                            i35 += 255;
                                            nszVar4.J(1);
                                            i13 = i28;
                                        }
                                    } else {
                                        i28 = i13;
                                    }
                                }
                                int iW4 = nszVar4.w() + i35;
                                byte[] bArr4 = new byte[iW3];
                                int i36 = nszVar4.b;
                                System.arraycopy(bArr3, i36, bArr4, 0, iW3);
                                int i37 = i36 + iW3 + iW4;
                                int length = bArr3.length - i37;
                                byte[] bArr5 = new byte[length];
                                System.arraycopy(bArr3, i37, bArr5, 0, length);
                                listN = pcn.o(bArr4, bArr5);
                            } else {
                                i28 = i13;
                                if ("audio/mp4a-latm".equals(str7)) {
                                    s1.a aVarB = s1.b(new msz(bArr3.length, bArr3), false);
                                    int i38 = aVarB.a;
                                    i31 = aVarB.b;
                                    str5 = aVarB.c;
                                    i32 = i38;
                                }
                                listN = pcn.n(bArr3);
                            }
                            i16 = i31;
                            cVar = cVarC;
                            str2 = str7;
                            i8 = i32;
                            str5 = str5;
                        } else {
                            i28 = i13;
                            i16 = i31;
                            cVar = cVarC;
                            str2 = str7;
                            i8 = i32;
                            str5 = str5;
                            listN = list;
                        }
                    } else {
                        i28 = i13;
                        str2 = str2;
                        i16 = i31;
                        i8 = i32;
                        str5 = str5;
                        listN = list;
                        cVar = cVar;
                    }
                    iC2 = i16;
                    i11 = i11;
                } else if (iJ3 == 1651798644) {
                    nszVar3.I(i28 + 8);
                    nszVar3.J(4);
                    cVar = cVar;
                    aVar = new a(nszVar3.y(), nszVar3.y());
                    i28 = i28;
                    iC2 = iC2;
                    str4 = str4;
                    i11 = i11;
                    str5 = str5;
                    i15 = iJ2;
                    str2 = str2;
                    i12 = iIntValue;
                } else {
                    i15 = iJ2;
                    int[] iArr = p5.d;
                    int[] iArr2 = p5.b;
                    if (iJ3 == 1684103987) {
                        nszVar3.I(i28 + 8);
                        String string = Integer.toString(i5);
                        msz mszVar2 = new msz();
                        mszVar2.l(nszVar3);
                        int i39 = iArr2[mszVar2.g(i7)];
                        mszVar2.o(8);
                        int i40 = iArr[mszVar2.g(3)];
                        if (mszVar2.g(1) != 0) {
                            i40++;
                        }
                        int i41 = p5.e[mszVar2.g(5)] * 1000;
                        mszVar2.c();
                        nszVar3.I(mszVar2.d());
                        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                        c0062a.a = string;
                        c0062a.m = gqv.m("audio/ac3");
                        c0062a.E = i40;
                        c0062a.F = i39;
                        c0062a.q = drmInitDataA;
                        c0062a.d = str;
                        c0062a.h = i41;
                        c0062a.i = i41;
                        gVar.b = new androidx.media3.common.a(c0062a);
                    } else if (iJ3 == 1684366131) {
                        nszVar3.I(i28 + 8);
                        String string2 = Integer.toString(i5);
                        msz mszVar3 = new msz();
                        mszVar3.l(nszVar3);
                        int iG5 = mszVar3.g(13) * 1000;
                        mszVar3.o(3);
                        int i42 = iArr2[mszVar3.g(2)];
                        mszVar3.o(10);
                        int i43 = iArr[mszVar3.g(3)];
                        if (mszVar3.g(1) != 0) {
                            i43++;
                        }
                        mszVar3.o(3);
                        int iG6 = mszVar3.g(4);
                        mszVar3.o(1);
                        int i44 = i43;
                        if (iG6 > 0) {
                            mszVar3.o(6);
                            i43 = mszVar3.g(1) != 0 ? i44 + 2 : i44;
                            mszVar3.o(1);
                        }
                        if (mszVar3.b() > 7) {
                            mszVar3.o(7);
                            if (mszVar3.g(1) != 0) {
                                str3 = "audio/eac3-joc";
                            } else {
                                str3 = "audio/eac3";
                            }
                        } else {
                            str3 = "audio/eac3";
                        }
                        mszVar3.c();
                        nszVar3.I(mszVar3.d());
                        androidx.media3.common.a.C0062a c0062a2 = new androidx.media3.common.a.C0062a();
                        c0062a2.a = string2;
                        c0062a2.m = gqv.m(str3);
                        c0062a2.E = i43;
                        c0062a2.F = i42;
                        c0062a2.q = drmInitDataA;
                        c0062a2.d = str;
                        c0062a2.i = iG5;
                        gVar.b = new androidx.media3.common.a(c0062a2);
                    } else {
                        str4 = str4;
                        listN = listN;
                        if (iJ3 == 1684103988) {
                            nszVar3.I(i28 + 8);
                            String string3 = Integer.toString(i5);
                            msz mszVar4 = new msz();
                            mszVar4.l(nszVar3);
                            int iB = mszVar4.b();
                            int iG7 = mszVar4.g(3);
                            if (iG7 > 1) {
                                throw ssz.c("Unsupported AC-4 DSI version: " + iG7);
                            }
                            int iG8 = mszVar4.g(7);
                            int i45 = mszVar4.f() ? AudioFormat.AUDIO_SAMPLE_RATE_48000 : AudioFormat.AUDIO_SAMPLE_RATE_44100;
                            mszVar4.o(4);
                            int iG9 = mszVar4.g(9);
                            if (iG8 > 1) {
                                if (iG7 == 0) {
                                    throw ssz.c("Invalid AC-4 DSI version: " + iG7);
                                }
                                if (mszVar4.f()) {
                                    mszVar4.o(16);
                                    if (mszVar4.f()) {
                                        mszVar4.o(128);
                                    }
                                }
                            }
                            if (iG7 == 1) {
                                if (mszVar4.b() < 66) {
                                    throw ssz.c("Invalid AC-4 DSI bitrate.");
                                }
                                mszVar4.o(66);
                                mszVar4.c();
                            }
                            t5.a aVar2 = new t5.a();
                            aVar2.a = true;
                            aVar2.b = -1;
                            aVar2.c = -1;
                            aVar2.d = true;
                            i28 = i28;
                            aVar2.e = 2;
                            aVar2.f = 1;
                            aVar2.g = 0;
                            int i46 = 0;
                            while (true) {
                                if (i46 < iG9) {
                                    if (iG7 == 0) {
                                        i18 = i8;
                                        zF = mszVar4.f();
                                        iG2 = mszVar4.g(5);
                                        iG3 = mszVar4.g(5);
                                        i23 = 0;
                                        i24 = 0;
                                        z2 = false;
                                    } else {
                                        int i47 = iG9;
                                        int iG10 = mszVar4.g(8);
                                        i18 = i8;
                                        int iG11 = mszVar4.g(8);
                                        if (iG11 == 255) {
                                            iG11 = mszVar4.g(16) + iG11;
                                        }
                                        if (iG10 > 2) {
                                            mszVar4.o(iG11 * 8);
                                            i46++;
                                            iG9 = i47;
                                            i8 = i18;
                                        } else {
                                            int iB2 = (iB - mszVar4.b()) / 8;
                                            int i48 = iG11;
                                            int iG12 = mszVar4.g(5);
                                            z2 = iG12 == 31;
                                            iG2 = iG12;
                                            i24 = iB2;
                                            i23 = i48;
                                            iG3 = iG10;
                                            zF = false;
                                        }
                                    }
                                    aVar2.f = iG3;
                                    i17 = iC2;
                                    if (zF || z2 || iG2 != 6) {
                                        aVar2.g = mszVar4.g(3);
                                        if (mszVar4.f()) {
                                            mszVar4.o(5);
                                        }
                                        mszVar4.o(2);
                                        if (iG7 == 1 && (iG3 == 1 || iG3 == 2)) {
                                            mszVar4.o(2);
                                        }
                                        mszVar4.o(5);
                                        mszVar4.o(10);
                                        if (iG7 == 1) {
                                            if (iG3 > 0) {
                                                aVar2.a = mszVar4.f();
                                            }
                                            if (aVar2.a) {
                                                if (iG3 != 1) {
                                                    i25 = 2;
                                                    if (iG3 == 2) {
                                                        iG4 = mszVar4.g(5);
                                                        if (iG4 >= 0 && iG4 <= 15) {
                                                            aVar2.b = iG4;
                                                        }
                                                        if (iG4 >= 11 || iG4 > 14) {
                                                            i25 = 2;
                                                        } else {
                                                            aVar2.d = mszVar4.f();
                                                            i25 = 2;
                                                            aVar2.e = mszVar4.g(2);
                                                        }
                                                    }
                                                } else {
                                                    iG4 = mszVar4.g(5);
                                                    if (iG4 >= 0) {
                                                        aVar2.b = iG4;
                                                    }
                                                    if (iG4 >= 11) {
                                                        i25 = 2;
                                                    } else {
                                                        i25 = 2;
                                                    }
                                                }
                                                mszVar4.o(24);
                                            } else {
                                                i25 = 2;
                                            }
                                            if (iG3 == 1 || iG3 == i25) {
                                                if (mszVar4.f() && mszVar4.f()) {
                                                    mszVar4.o(i25);
                                                }
                                                if (mszVar4.f()) {
                                                    mszVar4.n();
                                                    int i49 = 8;
                                                    int iG13 = mszVar4.g(8);
                                                    int i50 = 0;
                                                    while (i50 < iG13) {
                                                        mszVar4.o(i49);
                                                        i50++;
                                                        i49 = 8;
                                                    }
                                                }
                                            }
                                        }
                                        if (!zF && !z2) {
                                            mszVar4.n();
                                            if (iG2 == 0 || iG2 == 1 || iG2 == 2) {
                                                if (iG3 == 0) {
                                                    for (int i51 = 0; i51 < 2; i51++) {
                                                        t5.c(mszVar4, aVar2);
                                                    }
                                                } else {
                                                    for (int i52 = 0; i52 < 2; i52++) {
                                                        t5.d(mszVar4, aVar2);
                                                    }
                                                }
                                            } else if (iG2 == 3 || iG2 == 4) {
                                                if (iG3 == 0) {
                                                    for (int i53 = 0; i53 < 3; i53++) {
                                                        t5.c(mszVar4, aVar2);
                                                    }
                                                } else {
                                                    for (int i54 = 0; i54 < 3; i54++) {
                                                        t5.d(mszVar4, aVar2);
                                                    }
                                                }
                                            } else if (iG2 != 5) {
                                                int iG14 = mszVar4.g(7);
                                                for (int i55 = 0; i55 < iG14; i55++) {
                                                    mszVar4.o(8);
                                                }
                                            } else if (iG3 == 0) {
                                                t5.c(mszVar4, aVar2);
                                            } else {
                                                int iG15 = mszVar4.g(3);
                                                for (int i56 = 0; i56 < iG15 + 2; i56++) {
                                                    t5.d(mszVar4, aVar2);
                                                }
                                            }
                                        } else if (iG3 == 0) {
                                            t5.c(mszVar4, aVar2);
                                        } else {
                                            t5.d(mszVar4, aVar2);
                                        }
                                        mszVar4.n();
                                        zF2 = mszVar4.f();
                                    } else {
                                        iG3 = iG3;
                                        zF2 = true;
                                    }
                                    if (zF2) {
                                        int iG16 = mszVar4.g(7);
                                        for (int i57 = 0; i57 < iG16; i57++) {
                                            mszVar4.o(15);
                                        }
                                    }
                                    if (iG3 <= 0) {
                                        i19 = 8;
                                    } else {
                                        if (mszVar4.f()) {
                                            if (mszVar4.b() < 66) {
                                                throw ssz.c("Can't parse bitrate DSI.");
                                            }
                                            mszVar4.o(66);
                                        }
                                        if (mszVar4.f()) {
                                            mszVar4.c();
                                            mszVar4.p(mszVar4.g(16));
                                            int iG17 = mszVar4.g(5);
                                            for (int i58 = 0; i58 < iG17; i58++) {
                                                mszVar4.o(3);
                                                mszVar4.o(8);
                                            }
                                            i19 = 8;
                                        } else {
                                            i19 = 8;
                                        }
                                    }
                                    mszVar4.c();
                                    if (iG7 == 1) {
                                        int iB3 = ((iB - mszVar4.b()) / i19) - i24;
                                        if (i23 < iB3) {
                                            throw ssz.c("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        mszVar4.p(i23 - iB3);
                                    }
                                    if (aVar2.a && aVar2.b == -1) {
                                        throw ssz.c("Can't determine channel mode of presentation " + i46);
                                    }
                                } else {
                                    iIntValue = iIntValue;
                                    i17 = iC2;
                                    i18 = i8;
                                    i19 = 8;
                                }
                                if (aVar2.a) {
                                    int i59 = aVar2.b;
                                    boolean z5 = aVar2.d;
                                    int i60 = aVar2.e;
                                    switch (i59) {
                                        case 0:
                                            i21 = 11;
                                            i22 = 1;
                                            break;
                                        case 1:
                                            i21 = 11;
                                            i22 = 2;
                                            break;
                                        case 2:
                                            i21 = 11;
                                            i22 = 3;
                                            break;
                                        case 3:
                                            i21 = 11;
                                            i22 = 5;
                                            break;
                                        case 4:
                                            i21 = 11;
                                            i22 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i21 = 11;
                                            i22 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i22 = i19;
                                            i21 = 11;
                                            break;
                                        case 11:
                                            i21 = 11;
                                            i22 = 11;
                                            break;
                                        case 12:
                                            i22 = 12;
                                            i21 = 11;
                                            break;
                                        case 13:
                                            i21 = 11;
                                            i22 = 13;
                                            break;
                                        case 14:
                                            i21 = 11;
                                            i22 = 14;
                                            break;
                                        case 15:
                                            i21 = 11;
                                            i22 = 24;
                                            break;
                                        default:
                                            i21 = 11;
                                            i22 = -1;
                                            break;
                                    }
                                    if (i59 == i21 || i59 == 12 || i59 == 13 || i59 == 14) {
                                        if (!z5) {
                                            i22 -= 2;
                                        }
                                        if (i60 == 0) {
                                            i22 -= 4;
                                        } else if (i60 == 1) {
                                            i22 -= 2;
                                        }
                                    }
                                    i20 = i22;
                                } else {
                                    int i61 = aVar2.c;
                                    int i62 = aVar2.g;
                                    if (i61 > 0) {
                                        i20 = i61 + 1;
                                        if (i62 == 4 && i20 == 17) {
                                            i20 = 21;
                                        }
                                    } else if (i62 == 0) {
                                        i20 = 2;
                                    } else if (i62 == 1) {
                                        i20 = 6;
                                    } else if (i62 == 2) {
                                        i20 = i19;
                                    } else if (i62 == 3) {
                                        i20 = 10;
                                    } else if (i62 != 4) {
                                        cft.g("Ac4Util", "AC-4 level " + aVar2.g + " has not been defined.");
                                        i20 = 2;
                                    } else {
                                        i20 = 12;
                                    }
                                }
                                if (i20 <= 0) {
                                    throw ssz.c("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(iG8), Integer.valueOf(aVar2.f), Integer.valueOf(aVar2.g)};
                                String str8 = jrh0.a;
                                String str9 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                androidx.media3.common.a.C0062a c0062a3 = new androidx.media3.common.a.C0062a();
                                c0062a3.a = string3;
                                c0062a3.m = gqv.m("audio/ac4");
                                c0062a3.E = i20;
                                c0062a3.F = i45;
                                c0062a3.q = drmInitDataA;
                                c0062a3.d = str;
                                c0062a3.j = str9;
                                gVar.b = new androidx.media3.common.a(c0062a3);
                                i8 = i18;
                                iC2 = i17;
                                i12 = iIntValue;
                                c2 = 6;
                            }
                        } else {
                            i12 = iIntValue;
                            i28 = i28;
                            iC2 = iC2;
                            i8 = i8;
                            if (iJ3 == 1684892784) {
                                if (iJ <= 0) {
                                    throw ssz.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iJ);
                                }
                                cVar = cVar;
                                str2 = str2;
                                i8 = iJ;
                                i11 = i11;
                                str5 = str5;
                                i15 = i15;
                                listN = listN;
                                i12 = i12;
                                iC2 = 2;
                            } else if (iJ3 == 1684305011 || iJ3 == 1969517683) {
                                i12 = i12;
                                c2 = 6;
                                androidx.media3.common.a.C0062a c0062a4 = new androidx.media3.common.a.C0062a();
                                c0062a4.a = Integer.toString(i5);
                                c0062a4.m = gqv.m(str2);
                                iC2 = iC2;
                                c0062a4.E = iC2;
                                i8 = i8;
                                c0062a4.F = i8;
                                c0062a4.q = drmInitDataA;
                                c0062a4.d = str;
                                gVar.b = new androidx.media3.common.a(c0062a4);
                            } else if (iJ3 == 1682927731) {
                                int i63 = i15 - 8;
                                byte[] bArr6 = a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i63);
                                nszVar3.I(i28 + 8);
                                nszVar3.h(bArrCopyOf, bArr6.length, i63);
                                listN = xxf.a(bArrCopyOf);
                            } else if (iJ3 == 1684425825) {
                                byte[] bArr7 = new byte[i15 - 8];
                                bArr7[0] = 102;
                                bArr7[1] = 76;
                                bArr7[2] = 97;
                                bArr7[3] = 67;
                                nszVar3.I(i28 + 12);
                                nszVar3.h(bArr7, 4, i15 - 12);
                                listN = pcn.n(bArr7);
                            } else if (iJ3 == 1634492771) {
                                int i64 = i15 - 12;
                                byte[] bArr8 = new byte[i64];
                                nszVar3.I(i28 + 12);
                                nszVar3.h(bArr8, 0, i64);
                                byte[] bArr9 = j08.a;
                                nsz nszVar5 = new nsz(bArr8);
                                nszVar5.I(9);
                                int iW5 = nszVar5.w();
                                nszVar5.I(20);
                                Pair pairCreate = Pair.create(Integer.valueOf(nszVar5.A()), Integer.valueOf(iW5));
                                int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                listN = pcn.n(bArr8);
                                str2 = str2;
                                iC2 = iIntValue3;
                                i8 = iIntValue2;
                                i11 = i11;
                                str5 = str5;
                                i15 = i15;
                                i12 = i12;
                                cVar = cVar;
                            } else if (iJ3 == 1767990114) {
                                nszVar3.I(i28 + 9);
                                long j2 = 0;
                                for (int i65 = 0; i65 < 9; i65++) {
                                    if (nszVar3.b == nszVar3.c) {
                                        ib5.a("Attempting to read a byte over the limit.");
                                        return;
                                    }
                                    long jW = nszVar3.w();
                                    j2 |= (jW & 127) << (i65 * 7);
                                    if ((jW & 128) == 0) {
                                        int iQ = c0p.q(j2);
                                        byte[] bArr10 = new byte[iQ];
                                        nszVar3.h(bArr10, 0, iQ);
                                        byte[] bArr11 = j08.a;
                                        nszVar2 = new nsz(bArr10);
                                        while ((nszVar2.w() & 128) != 0) {
                                        }
                                        nszVar2.J(4);
                                        int iW6 = nszVar2.w();
                                        int iW7 = nszVar2.w();
                                        nszVar2.J(1);
                                        while ((nszVar2.w() & 128) != 0) {
                                        }
                                        while ((nszVar2.w() & 128) != 0) {
                                        }
                                        strU = nszVar2.u(4, StandardCharsets.UTF_8);
                                        if (strU.equals("mp4a")) {
                                            while ((nszVar2.w() & 128) != 0) {
                                            }
                                            nszVar2.J(2);
                                            mszVar = new msz();
                                            mszVar.l(nszVar2);
                                            iG = mszVar.g(5);
                                            if (iG == 31) {
                                                c3 = 6;
                                                iG = mszVar.g(6) + 32;
                                            } else {
                                                c3 = 6;
                                            }
                                            strU = strU + ".40." + iG;
                                        } else {
                                            c3 = 6;
                                        }
                                        Object[] objArr2 = {Integer.valueOf(iW6), Integer.valueOf(iW7), strU};
                                        String str10 = jrh0.a;
                                        str5 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr2);
                                        c150 c150VarN = pcn.n(bArr10);
                                        cVar = cVar;
                                        str2 = str2;
                                        listN = c150VarN;
                                        i11 = i11;
                                        i15 = i15;
                                        i8 = i8;
                                        i12 = i12;
                                    }
                                }
                                int iQ2 = c0p.q(j2);
                                byte[] bArr12 = new byte[iQ2];
                                nszVar3.h(bArr12, 0, iQ2);
                                byte[] bArr13 = j08.a;
                                nszVar2 = new nsz(bArr12);
                                while ((nszVar2.w() & 128) != 0) {
                                }
                                nszVar2.J(4);
                                int iW8 = nszVar2.w();
                                int iW9 = nszVar2.w();
                                nszVar2.J(1);
                                while ((nszVar2.w() & 128) != 0) {
                                }
                                while ((nszVar2.w() & 128) != 0) {
                                }
                                strU = nszVar2.u(4, StandardCharsets.UTF_8);
                                if (strU.equals("mp4a")) {
                                    while ((nszVar2.w() & 128) != 0) {
                                    }
                                    nszVar2.J(2);
                                    mszVar = new msz();
                                    mszVar.l(nszVar2);
                                    iG = mszVar.g(5);
                                    if (iG == 31) {
                                        c3 = 6;
                                        iG = mszVar.g(6) + 32;
                                    } else {
                                        c3 = 6;
                                    }
                                    strU = strU + ".40." + iG;
                                } else {
                                    c3 = 6;
                                }
                                Object[] objArr3 = {Integer.valueOf(iW8), Integer.valueOf(iW9), strU};
                                String str11 = jrh0.a;
                                str5 = String.format(Locale.US, "iamf.%03X.%03X.%s", objArr3);
                                c150 c150VarN2 = pcn.n(bArr12);
                                cVar = cVar;
                                str2 = str2;
                                listN = c150VarN2;
                                i11 = i11;
                                i15 = i15;
                                i8 = i8;
                                i12 = i12;
                            } else {
                                c2 = 6;
                                if (iJ3 == 1885564227) {
                                    nszVar3.I(i28 + 12);
                                    ByteOrder byteOrder = (nszVar3.w() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int iW10 = nszVar3.w();
                                    i12 = i12;
                                    int iA4 = i12 == 1768973165 ? jrh0.A(iW10, byteOrder) : (i12 == 1718641517 && iW10 == i27 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i11;
                                    str2 = iA4 != -1 ? "audio/raw" : str2;
                                    i15 = i15;
                                    listN = listN;
                                    i8 = i8;
                                    i11 = iA4;
                                } else {
                                    i12 = i12;
                                    i8 = i8;
                                    iC2 = iC2;
                                }
                            }
                        }
                        str2 = str2;
                        iC2 = iC2;
                        i8 = i8;
                        i11 = i11;
                        str5 = str5;
                        i15 = i15;
                        listN = listN;
                        cVar = cVar;
                    }
                    c2 = 6;
                    i12 = iIntValue;
                    str2 = str2;
                    iC2 = iC2;
                    i8 = i8;
                    i11 = i11;
                    str5 = str5;
                    i15 = i15;
                    listN = listN;
                    cVar = cVar;
                }
                int i66 = i28 + i15;
                i7 = 2;
                i27 = 32;
                i26 = i4;
                cVar = cVar;
                iIntValue = i12;
                str4 = str4;
                iC2 = iC2;
                i28 = i66;
                nszVar3 = nszVar;
            }
            i12 = iIntValue;
            i15 = iJ2;
            cVar = cVar;
            int i67 = i28 + i15;
            i7 = 2;
            i27 = 32;
            i26 = i4;
            cVar = cVar;
            iIntValue = i12;
            str4 = str4;
            iC2 = iC2;
            i28 = i67;
            nszVar3 = nszVar;
        }
        String str12 = str2;
        int i68 = iC2;
        String str13 = str5;
        int i69 = i11;
        List<byte[]> list2 = listN;
        int i70 = i8;
        if (gVar.b != null || str12 == null) {
            return;
        }
        androidx.media3.common.a.C0062a c0062a5 = new androidx.media3.common.a.C0062a();
        c0062a5.a = Integer.toString(i5);
        c0062a5.m = gqv.m(str12);
        c0062a5.j = str13;
        c0062a5.E = i68;
        c0062a5.F = i70;
        c0062a5.G = i69;
        c0062a5.p = list2;
        c0062a5.q = drmInitDataA;
        c0062a5.d = str;
        if (cVar != null) {
            c cVar2 = cVar;
            c0062a5.h = c0p.s(cVar2.c);
            c0062a5.i = c0p.s(cVar2.d);
        } else {
            a aVar3 = aVar;
            if (aVar3 != null) {
                c0062a5.h = c0p.s(aVar3.a);
                c0062a5.i = c0p.s(aVar3.b);
            }
        }
        gVar.b = new androidx.media3.common.a(c0062a5);
    }

    public static c c(int i2, nsz nszVar) {
        nszVar.I(i2 + 12);
        nszVar.J(1);
        d(nszVar);
        nszVar.J(2);
        int iW = nszVar.w();
        if ((iW & 128) != 0) {
            nszVar.J(2);
        }
        if ((iW & 64) != 0) {
            nszVar.J(nszVar.w());
        }
        if ((iW & 32) != 0) {
            nszVar.J(2);
        }
        nszVar.J(1);
        d(nszVar);
        String strE = gqv.e(nszVar.w());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new c(strE, null, -1L, -1L);
        }
        nszVar.J(4);
        long jY = nszVar.y();
        long jY2 = nszVar.y();
        nszVar.J(1);
        int iD = d(nszVar);
        long j2 = jY2;
        byte[] bArr = new byte[iD];
        nszVar.h(bArr, 0, iD);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new c(strE, bArr, j2, jY > 0 ? jY : -1L);
    }

    public static int d(nsz nszVar) {
        int iW = nszVar.w();
        int i2 = iW & 127;
        while ((iW & 128) == 128) {
            iW = nszVar.w();
            i2 = (i2 << 7) | (iW & 127);
        }
        return i2;
    }

    public static int e(int i2) {
        return (i2 >> 24) & 255;
    }

    public static uov f(c8w.a aVar) {
        odv odvVar;
        c8w.b bVarC = aVar.c(1751411826);
        c8w.b bVarC2 = aVar.c(1801812339);
        c8w.b bVarC3 = aVar.c(1768715124);
        if (bVarC != null && bVarC2 != null && bVarC3 != null) {
            nsz nszVar = bVarC.b;
            nszVar.I(16);
            if (nszVar.j() == 1835299937) {
                nsz nszVar2 = bVarC2.b;
                nszVar2.I(12);
                int iJ = nszVar2.j();
                String[] strArr = new String[iJ];
                for (int i2 = 0; i2 < iJ; i2++) {
                    int iJ2 = nszVar2.j();
                    nszVar2.J(4);
                    strArr[i2] = nszVar2.u(iJ2 - 8, StandardCharsets.UTF_8);
                }
                nsz nszVar3 = bVarC3.b;
                nszVar3.I(8);
                ArrayList arrayList = new ArrayList();
                while (nszVar3.a() > 8) {
                    int i3 = nszVar3.b;
                    int iJ3 = nszVar3.j();
                    int iJ4 = nszVar3.j() - 1;
                    if (iJ4 < 0 || iJ4 >= iJ) {
                        h08.a(iJ4, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[iJ4];
                        int i4 = i3 + iJ3;
                        while (true) {
                            int i5 = nszVar3.b;
                            if (i5 >= i4) {
                                odvVar = null;
                                break;
                            }
                            int iJ5 = nszVar3.j();
                            if (nszVar3.j() == 1684108385) {
                                int iJ6 = nszVar3.j();
                                int iJ7 = nszVar3.j();
                                int i6 = iJ5 - 16;
                                byte[] bArr = new byte[i6];
                                nszVar3.h(bArr, 0, i6);
                                odvVar = new odv(str, bArr, iJ7, iJ6);
                                break;
                            }
                            nszVar3.I(i5 + iJ5);
                        }
                        if (odvVar != null) {
                            arrayList.add(odvVar);
                        }
                    }
                    nszVar3.I(i3 + iJ3);
                }
                if (!arrayList.isEmpty()) {
                    return new uov(arrayList);
                }
            }
        }
        return null;
    }

    public static h8w g(nsz nszVar) {
        long jQ;
        long jQ2;
        nszVar.I(8);
        if (e(nszVar.j()) == 0) {
            jQ = nszVar.y();
            jQ2 = nszVar.y();
        } else {
            jQ = nszVar.q();
            jQ2 = nszVar.q();
        }
        return new h8w(jQ, jQ2, nszVar.y());
    }

    public static Pair<Integer, gjg0> h(nsz nszVar, int i2, int i3) throws ssz {
        gjg0 gjg0Var;
        Pair<Integer, gjg0> pairCreate;
        int i4;
        int i5;
        int i6 = nszVar.b;
        while (i6 - i2 < i3) {
            nszVar.I(i6);
            int iJ = nszVar.j();
            n4h.a("childAtomSize must be positive", iJ > 0);
            if (nszVar.j() == 1936289382) {
                int i7 = i6 + 8;
                int i8 = 0;
                int i9 = -1;
                Integer numValueOf = null;
                String strU = null;
                while (i7 - i6 < iJ) {
                    nszVar.I(i7);
                    int iJ2 = nszVar.j();
                    int iJ3 = nszVar.j();
                    if (iJ3 == 1718775137) {
                        numValueOf = Integer.valueOf(nszVar.j());
                    } else if (iJ3 == 1935894637) {
                        nszVar.J(4);
                        strU = nszVar.u(4, StandardCharsets.UTF_8);
                    } else if (iJ3 == 1935894633) {
                        i9 = i7;
                        i8 = iJ2;
                    }
                    i7 += iJ2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strU) || "cbc1".equals(strU) || "cens".equals(strU) || "cbcs".equals(strU)) {
                    n4h.a("frma atom is mandatory", numValueOf != null);
                    n4h.a("schi atom is mandatory", i9 != -1);
                    int i10 = i9 + 8;
                    while (true) {
                        if (i10 - i9 >= i8) {
                            gjg0Var = null;
                            break;
                        }
                        nszVar.I(i10);
                        int iJ4 = nszVar.j();
                        if (nszVar.j() == 1952804451) {
                            int iE = e(nszVar.j());
                            nszVar.J(1);
                            if (iE == 0) {
                                nszVar.J(1);
                                i5 = 0;
                                i4 = 0;
                            } else {
                                int iW = nszVar.w();
                                i4 = iW & 15;
                                i5 = (iW & 240) >> 4;
                            }
                            boolean z = nszVar.w() == 1;
                            int iW2 = nszVar.w();
                            byte[] bArr2 = new byte[16];
                            nszVar.h(bArr2, 0, 16);
                            if (z && iW2 == 0) {
                                int iW3 = nszVar.w();
                                byte[] bArr3 = new byte[iW3];
                                nszVar.h(bArr3, 0, iW3);
                                bArr = bArr3;
                            }
                            gjg0Var = new gjg0(z, strU, iW2, bArr2, i5, i4, bArr);
                            break;
                        }
                        i10 += iJ4;
                    }
                    n4h.a("tenc atom is mandatory", gjg0Var != null);
                    String str = jrh0.a;
                    pairCreate = Pair.create(numValueOf, gjg0Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i6 += iJ;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:371:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:373:0x081f  */
    /* JADX WARN: Code duplicated, block: B:375:0x0825  */
    /* JADX WARN: Code duplicated, block: B:376:0x0834  */
    /* JADX WARN: Code duplicated, block: B:381:0x0856  */
    /* JADX WARN: Code duplicated, block: B:383:0x0864  */
    /* JADX WARN: Code duplicated, block: B:384:0x0873  */
    /* JADX WARN: Code duplicated, block: B:386:0x0879  */
    /* JADX WARN: Code duplicated, block: B:387:0x0888  */
    /* JADX WARN: Code duplicated, block: B:389:0x088e  */
    /* JADX WARN: Code duplicated, block: B:390:0x089e  */
    /* JADX WARN: Code duplicated, block: B:392:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:394:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:398:0x08da  */
    /* JADX WARN: Code duplicated, block: B:401:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f0  */
    /* JADX WARN: Code duplicated, block: B:405:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:407:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:412:0x0906  */
    /* JADX WARN: Code duplicated, block: B:415:0x0913 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:419:0x091b  */
    /* JADX WARN: Code duplicated, block: B:422:0x0923  */
    /* JADX WARN: Code duplicated, block: B:425:0x092a  */
    /* JADX WARN: Code duplicated, block: B:427:0x093b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:431:0x0943  */
    /* JADX WARN: Code duplicated, block: B:434:0x094f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0952  */
    /* JADX WARN: Code duplicated, block: B:437:0x0961  */
    /* JADX WARN: Code duplicated, block: B:593:0x08b7 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:371:0x07ff, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static g i(nsz nszVar, j jVar, String str, DrmInitData drmInitData, boolean z) throws ssz {
        int i2;
        DrmInitData drmInitData2;
        String str2;
        int i3;
        int i4;
        int i5;
        char c2;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        String str3;
        byte[] bArrCopyOfRange;
        int i9;
        int i10;
        int i11;
        int iG;
        boolean zF;
        int iG2;
        int iG3;
        int i12;
        char c3;
        boolean zF2;
        int i13;
        int iG4;
        boolean z2;
        int i14;
        int iG5;
        n58 n58Var;
        int iG6;
        int i15;
        n58 n58Var2;
        int i16;
        int i17;
        d dVar;
        DrmInitData drmInitDataA;
        int i18;
        int i19;
        String str4;
        c150 c150VarN;
        long j2;
        nsz nszVar2 = nszVar;
        j jVar2 = jVar;
        String str5 = str;
        int i20 = jVar2.a;
        nszVar2.I(12);
        int iJ = nszVar2.j();
        g gVar = new g(iJ);
        int i21 = 0;
        while (i21 < iJ) {
            int i22 = nszVar2.b;
            int iJ2 = nszVar2.j();
            String str6 = "childAtomSize must be positive";
            n4h.a("childAtomSize must be positive", iJ2 > 0);
            int iJ3 = nszVar2.j();
            byte b2 = 3;
            int i23 = 8;
            byte[] bArr2 = null;
            if (iJ3 == 1635148593 || iJ3 == 1635148595 || iJ3 == 1701733238 || iJ3 == 1831958048 || iJ3 == 1836070006 || iJ3 == 1752589105 || iJ3 == 1751479857 || iJ3 == 1932670515 || iJ3 == 1211250227 || iJ3 == 1748121139 || iJ3 == 1987063864 || iJ3 == 1987063865 || iJ3 == 1635135537 || iJ3 == 1685479798 || iJ3 == 1685479729 || iJ3 == 1685481573 || iJ3 == 1685481521 || iJ3 == 1634760241) {
                int i24 = jVar2.c;
                nszVar2.I(i22 + 16);
                nszVar2.J(16);
                int iC = nszVar2.C();
                int iC2 = nszVar2.C();
                nszVar2.J(50);
                int i25 = nszVar2.b;
                i2 = i21;
                if (iJ3 == 1701733238) {
                    Pair<Integer, gjg0> pairH = h(nszVar2, i22, iJ2);
                    if (pairH != null) {
                        iJ3 = ((Integer) pairH.first).intValue();
                        drmInitDataA = drmInitData == null ? null : drmInitData.a(((gjg0) pairH.second).b);
                        gVar.a[i2] = (gjg0) pairH.second;
                    } else {
                        i22 = i22;
                        drmInitDataA = drmInitData;
                    }
                    nszVar2.I(i25);
                    drmInitData2 = drmInitDataA;
                } else {
                    i22 = i22;
                    drmInitData2 = drmInitData;
                }
                if (iJ3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iJ3 == 1211250227 ? "video/3gpp" : null;
                }
                DrmInitData drmInitData3 = drmInitData2;
                i3 = i20;
                i4 = iJ;
                int i26 = 8;
                int i27 = 8;
                List<byte[]> listG = null;
                qbx.k kVar = null;
                ByteBuffer byteBuffer = null;
                byte[] bArr3 = null;
                String str7 = null;
                a aVar = null;
                c cVar = null;
                String str8 = str2;
                float fA = 1.0f;
                int i28 = -1;
                int i29 = -1;
                int i30 = -1;
                boolean z3 = false;
                int i31 = -1;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                int i35 = i25;
                int iG7 = -1;
                while (i35 - i22 < iJ2) {
                    nszVar2.I(i35);
                    int i36 = nszVar2.b;
                    int i37 = i35;
                    int iJ4 = nszVar2.j();
                    if (iJ4 == 0 && nszVar2.b - i22 == iJ2) {
                        break;
                    }
                    n4h.a(str6, iJ4 > 0);
                    int iJ5 = nszVar2.j();
                    int i38 = iJ2;
                    if (iJ5 == 1635148611) {
                        n4h.a(bArr2, str8 == null);
                        nszVar2.I(i36 + 8);
                        cp1 cp1VarA = cp1.a(nszVar2);
                        listG = cp1VarA.a;
                        gVar.c = cp1VarA.b;
                        float f2 = !z3 ? cp1VarA.k : fA;
                        String str9 = cp1VarA.l;
                        int i39 = cp1VarA.j;
                        i30 = cp1VarA.g;
                        int i40 = cp1VarA.h;
                        iG7 = cp1VarA.i;
                        int i41 = cp1VarA.e;
                        i26 = cp1VarA.f;
                        i6 = iJ3;
                        fA = f2;
                        str7 = str9;
                        i8 = i23;
                        str8 = "video/avc";
                        i32 = i39;
                        i29 = i40;
                        i7 = i28;
                        i27 = i41;
                    } else {
                        i6 = iJ3;
                        if (iJ5 == 1752589123) {
                            n4h.a(null, str8 == null);
                            nszVar2.I(i36 + 8);
                            gjl gjlVarA = gjl.a(nszVar2, false, null);
                            listG = gjlVarA.a;
                            gVar.c = gjlVarA.b;
                            float f3 = !z3 ? gjlVarA.l : fA;
                            int i42 = gjlVarA.m;
                            int i43 = gjlVarA.c;
                            String str10 = gjlVarA.n;
                            int i44 = gjlVarA.k;
                            if (i44 != -1) {
                                i28 = i44;
                            }
                            int i45 = gjlVarA.d;
                            int i46 = gjlVarA.e;
                            i30 = gjlVarA.h;
                            int i47 = gjlVarA.i;
                            i31 = i43;
                            int i48 = gjlVarA.j;
                            int i49 = gjlVarA.f;
                            i26 = gjlVarA.g;
                            kVar = gjlVarA.o;
                            str8 = "video/hevc";
                            i7 = i28;
                            str6 = str6;
                            i34 = i45;
                            gVar = gVar;
                            str7 = str10;
                            i33 = i46;
                            i8 = i23;
                            iG7 = i48;
                            bArr = null;
                            i32 = i42;
                            i27 = i49;
                            fA = f3;
                            i29 = i47;
                        } else {
                            int i50 = i28;
                            if (iJ5 == 1818785347) {
                                n4h.a("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                                n4h.a("must have at least two layers", kVar != null && kVar.a.size() >= 2);
                                nszVar2.I(i36 + 8);
                                kVar.getClass();
                                gjl gjlVarA2 = gjl.a(nszVar2, true, kVar);
                                n4h.a("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", gVar.c == gjlVarA2.b);
                                int i51 = gjlVarA2.h;
                                if (i51 != -1) {
                                    n4h.a("colorSpace must be the same for both views", i30 == i51);
                                }
                                int i52 = gjlVarA2.i;
                                if (i52 != -1) {
                                    n4h.a("colorRange must be the same for both views", i29 == i52);
                                }
                                int i53 = gjlVarA2.j;
                                if (i53 != -1) {
                                    n4h.a("colorTransfer must be the same for both views", iG7 == i53);
                                }
                                n4h.a("bitdepthLuma must be the same for both views", i27 == gjlVarA2.f);
                                n4h.a("bitdepthChroma must be the same for both views", i26 == gjlVarA2.g);
                                if (listG != null) {
                                    pcn.b bVar = pcn.b;
                                    pcn.a aVar2 = new pcn.a();
                                    aVar2.e(listG);
                                    aVar2.e(gjlVarA2.a);
                                    listG = aVar2.g();
                                } else {
                                    n4h.a("initializationData must be already set from hvcC atom", false);
                                }
                                str8 = "video/mv-hevc";
                                gVar = gVar;
                                str7 = gjlVarA2.n;
                                kVar = kVar;
                                i8 = i23;
                                i7 = i50;
                                bArr = null;
                                str6 = str6;
                            } else if (iJ5 == 1986361461) {
                                nszVar2.I(i36 + 8);
                                int i54 = nszVar2.b;
                                d dVar2 = null;
                                while (i54 - i36 < iJ4) {
                                    nszVar2.I(i54);
                                    int iJ6 = nszVar2.j();
                                    n4h.a(str6, iJ6 > 0);
                                    int i55 = i26;
                                    if (nszVar2.j() == 1702454643) {
                                        nszVar2.I(i54 + 8);
                                        int i56 = nszVar2.b;
                                        while (true) {
                                            if (i56 - i54 >= iJ6) {
                                                dVar = null;
                                                break;
                                            }
                                            nszVar2.I(i56);
                                            int iJ7 = nszVar2.j();
                                            n4h.a(str6, iJ7 > 0);
                                            int i57 = i56;
                                            if (nszVar2.j() == 1937011305) {
                                                nszVar2.J(4);
                                                int iW = nszVar2.w();
                                                dVar = new d(new f((iW & 1) == 1, (iW & 2) == 2, (iW & 8) == i23));
                                                break;
                                            }
                                            i56 = i57 + iJ7;
                                            i23 = 8;
                                        }
                                        dVar2 = dVar;
                                    } else {
                                        i27 = i27;
                                        i54 = i54;
                                        iJ6 = iJ6;
                                    }
                                    i54 += iJ6;
                                    i26 = i55;
                                    i27 = i27;
                                    i23 = 8;
                                }
                                int i58 = i26;
                                int i59 = i27;
                                k kVar2 = dVar2 == null ? null : new k(dVar2);
                                if (kVar2 != null) {
                                    f fVar = kVar2.a.a;
                                    boolean z4 = fVar.c;
                                    if (kVar == null || kVar.a.size() < 2) {
                                        i16 = i50;
                                        if (i16 == -1) {
                                            i17 = z4 ? 5 : 4;
                                        } else {
                                            i17 = i16;
                                        }
                                    } else {
                                        n4h.a("both eye views must be marked as available", fVar.a && fVar.b);
                                        n4h.a("for MV-HEVC, eye_views_reversed must be set to false", !z4);
                                        i16 = i50;
                                        i17 = i16;
                                    }
                                } else {
                                    i16 = i50;
                                    i17 = i16;
                                }
                                i7 = i17;
                                str6 = str6;
                                str8 = str8;
                                gVar = gVar;
                                kVar = kVar;
                                i26 = i58;
                                i27 = i59;
                                bArr = null;
                                i8 = 8;
                            } else {
                                i26 = i26;
                                i27 = i27;
                                i7 = i50;
                                if (iJ5 == 1685480259 || iJ5 == 1685485123 || iJ5 == 1685485379) {
                                    str6 = str6;
                                    String str11 = str8;
                                    gVar = gVar;
                                    int i60 = i29;
                                    kVar = kVar;
                                    bArr = null;
                                    i8 = 8;
                                    int i61 = iJ4 - 8;
                                    byte[] bArr4 = new byte[i61];
                                    nszVar2.h(bArr4, 0, i61);
                                    if (listG != null) {
                                        pcn.b bVar2 = pcn.b;
                                        pcn.a aVar3 = new pcn.a();
                                        aVar3.e(listG);
                                        aVar3.c(bArr4);
                                        listG = aVar3.g();
                                    } else {
                                        n4h.a("initializationData must already be set from hvcC or avcC atom", false);
                                    }
                                    nszVar2.I(i36 + 8);
                                    mye myeVarA = mye.a(nszVar2);
                                    if (myeVarA != null) {
                                        str3 = "video/dolby-vision";
                                        str7 = (String) myeVarA.a;
                                    } else {
                                        str3 = str11;
                                    }
                                    str8 = str3;
                                    i29 = i60;
                                } else {
                                    int i62 = 6;
                                    if (iJ5 == 1987076931) {
                                        n4h.a(null, str8 == null);
                                        String str12 = i6 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        nszVar2.I(i36 + 12);
                                        byte bW = (byte) nszVar2.w();
                                        byte bW2 = (byte) nszVar2.w();
                                        int iW2 = nszVar2.w();
                                        int i63 = iW2 >> 4;
                                        byte b3 = (byte) ((iW2 >> 1) & 7);
                                        if (str12.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr5 = j08.a;
                                            byte[] bArr6 = new byte[12];
                                            bArr6[0] = 1;
                                            bArr6[1] = 1;
                                            bArr6[2] = bW;
                                            bArr6[b2] = 2;
                                            bArr6[4] = 1;
                                            bArr6[5] = bW2;
                                            bArr6[6] = b2;
                                            bArr6[7] = 1;
                                            bArr6[8] = (byte) i63;
                                            bArr6[9] = 4;
                                            bArr6[10] = 1;
                                            bArr6[11] = b3;
                                            listG = pcn.n(bArr6);
                                        }
                                        boolean z5 = (iW2 & 1) != 0;
                                        int iW3 = nszVar2.w();
                                        int iW4 = nszVar2.w();
                                        int iF = n58.f(iW3);
                                        int i64 = z5 ? 1 : 2;
                                        iG7 = n58.g(iW4);
                                        str6 = str6;
                                        i6 = i6;
                                        gVar = gVar;
                                        i27 = i63;
                                        str8 = str12;
                                        kVar = kVar;
                                        bArr = null;
                                        i8 = 8;
                                        i30 = iF;
                                        i29 = i64;
                                        i7 = i7;
                                        i26 = i27;
                                    } else {
                                        int i65 = 7;
                                        int i66 = 11;
                                        if (iJ5 == 1635135811) {
                                            int i67 = iJ4 - 8;
                                            byte[] bArr7 = new byte[i67];
                                            nszVar2.h(bArr7, 0, i67);
                                            listG = pcn.n(bArr7);
                                            nszVar2.I(i36 + 8);
                                            byte[] bArr8 = nszVar2.a;
                                            msz mszVar = new msz(bArr8.length, bArr8);
                                            mszVar.m(nszVar2.b * 8);
                                            mszVar.p(1);
                                            int iG8 = mszVar.g(b2);
                                            mszVar.o(6);
                                            boolean zF3 = mszVar.f();
                                            boolean zF4 = mszVar.f();
                                            int i68 = -1;
                                            if (iG8 == 2 && zF3) {
                                                int i69 = zF4 ? 12 : 10;
                                                i11 = zF4 ? 12 : 10;
                                                i9 = i69;
                                            } else {
                                                if (iG8 <= 2) {
                                                    int i70 = zF3 ? 10 : 8;
                                                    i11 = zF3 ? 10 : 8;
                                                    i9 = i70;
                                                } else {
                                                    i9 = -1;
                                                    i10 = -1;
                                                }
                                                mszVar.o(13);
                                                mszVar.n();
                                                iG = mszVar.g(4);
                                                if (iG != 1) {
                                                    cft.e("BoxParsers", "Unsupported obu_type: " + iG);
                                                    n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                } else if (mszVar.f()) {
                                                    cft.e("BoxParsers", "Unsupported obu_extension_flag");
                                                    n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                } else {
                                                    zF = mszVar.f();
                                                    mszVar.n();
                                                    if (zF || mszVar.g(8) <= 127) {
                                                        iG2 = mszVar.g(3);
                                                        mszVar.n();
                                                        if (mszVar.f()) {
                                                            cft.e("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                        } else if (mszVar.f()) {
                                                            cft.e("BoxParsers", "Unsupported timing_info_present_flag");
                                                            n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                        } else {
                                                            if (mszVar.f()) {
                                                                cft.e("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                            } else {
                                                                iG3 = mszVar.g(5);
                                                                i12 = 0;
                                                                while (i12 <= iG3) {
                                                                    mszVar.o(12);
                                                                    if (mszVar.g(5) > i65) {
                                                                        mszVar.n();
                                                                    }
                                                                    i12++;
                                                                    i65 = 7;
                                                                }
                                                                c3 = '\f';
                                                                int iG9 = mszVar.g(4);
                                                                int iG10 = mszVar.g(4);
                                                                mszVar.o(iG9 + 1);
                                                                mszVar.o(iG10 + 1);
                                                                if (mszVar.f()) {
                                                                    mszVar.o(7);
                                                                }
                                                                mszVar.o(7);
                                                                zF2 = mszVar.f();
                                                                if (zF2) {
                                                                    mszVar.o(2);
                                                                }
                                                                if (mszVar.f()) {
                                                                    i13 = 1;
                                                                    iG4 = 2;
                                                                } else {
                                                                    i13 = 1;
                                                                    iG4 = mszVar.g(1);
                                                                }
                                                                if (iG4 > 0 && !mszVar.f()) {
                                                                    mszVar.o(i13);
                                                                }
                                                                if (zF2) {
                                                                    mszVar.o(3);
                                                                }
                                                                mszVar.o(3);
                                                                boolean zF5 = mszVar.f();
                                                                if (iG2 == 2 && zF5) {
                                                                    mszVar.n();
                                                                }
                                                                if (iG2 == 1 && mszVar.f()) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                if (mszVar.f()) {
                                                                    int iG11 = mszVar.g(8);
                                                                    int iG12 = mszVar.g(8);
                                                                    int iG13 = mszVar.g(8);
                                                                    if (z2 && iG11 == 1 && iG12 == 13 && iG13 == 0) {
                                                                        iG6 = 1;
                                                                    } else {
                                                                        iG6 = mszVar.g(1);
                                                                    }
                                                                    int iF2 = n58.f(iG11);
                                                                    if (iG6 == 1) {
                                                                        i15 = 1;
                                                                    } else {
                                                                        i15 = 2;
                                                                    }
                                                                    i14 = iF2;
                                                                    iG5 = n58.g(iG12);
                                                                    i68 = i15;
                                                                } else {
                                                                    i14 = -1;
                                                                    iG5 = -1;
                                                                }
                                                                n58Var = new n58(i14, i68, iG5, i9, i10, null);
                                                            }
                                                            int i71 = n58Var.e;
                                                            int i72 = n58Var.f;
                                                            int i73 = n58Var.a;
                                                            i29 = n58Var.b;
                                                            iG7 = n58Var.c;
                                                            str8 = "video/av01";
                                                            i27 = i71;
                                                            i8 = 8;
                                                            i7 = i7;
                                                            i26 = i72;
                                                            i30 = i73;
                                                        }
                                                    } else {
                                                        cft.e("BoxParsers", "Excessive obu_size");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    }
                                                }
                                                n58Var = n58Var2;
                                                c3 = '\f';
                                                int i74 = n58Var.e;
                                                int i75 = n58Var.f;
                                                int i76 = n58Var.a;
                                                i29 = n58Var.b;
                                                iG7 = n58Var.c;
                                                str8 = "video/av01";
                                                i27 = i74;
                                                i8 = 8;
                                                i7 = i7;
                                                i26 = i75;
                                                i30 = i76;
                                            }
                                            i10 = i11;
                                            mszVar.o(13);
                                            mszVar.n();
                                            iG = mszVar.g(4);
                                            if (iG != 1) {
                                                cft.e("BoxParsers", "Unsupported obu_type: " + iG);
                                                n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                            } else if (mszVar.f()) {
                                                cft.e("BoxParsers", "Unsupported obu_extension_flag");
                                                n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                            } else {
                                                zF = mszVar.f();
                                                mszVar.n();
                                                if (zF) {
                                                    iG2 = mszVar.g(3);
                                                    mszVar.n();
                                                    if (mszVar.f()) {
                                                        cft.e("BoxParsers", "Unsupported reduced_still_picture_header");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    } else if (mszVar.f()) {
                                                        cft.e("BoxParsers", "Unsupported timing_info_present_flag");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    } else if (mszVar.f()) {
                                                        cft.e("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    } else {
                                                        iG3 = mszVar.g(5);
                                                        i12 = 0;
                                                        while (i12 <= iG3) {
                                                            mszVar.o(12);
                                                            if (mszVar.g(5) > i65) {
                                                                mszVar.n();
                                                            }
                                                            i12++;
                                                            i65 = 7;
                                                        }
                                                        c3 = '\f';
                                                        int iG14 = mszVar.g(4);
                                                        int iG15 = mszVar.g(4);
                                                        mszVar.o(iG14 + 1);
                                                        mszVar.o(iG15 + 1);
                                                        if (mszVar.f()) {
                                                            mszVar.o(7);
                                                        }
                                                        mszVar.o(7);
                                                        zF2 = mszVar.f();
                                                        if (zF2) {
                                                            mszVar.o(2);
                                                        }
                                                        if (mszVar.f()) {
                                                            i13 = 1;
                                                            iG4 = 2;
                                                        } else {
                                                            i13 = 1;
                                                            iG4 = mszVar.g(1);
                                                        }
                                                        if (iG4 > 0) {
                                                            mszVar.o(i13);
                                                        }
                                                        if (zF2) {
                                                            mszVar.o(3);
                                                        }
                                                        mszVar.o(3);
                                                        boolean zF6 = mszVar.f();
                                                        if (iG2 == 2) {
                                                            mszVar.n();
                                                        }
                                                        if (iG2 == 1) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (mszVar.f()) {
                                                            int iG16 = mszVar.g(8);
                                                            int iG17 = mszVar.g(8);
                                                            int iG18 = mszVar.g(8);
                                                            if (z2) {
                                                                iG6 = mszVar.g(1);
                                                            } else {
                                                                iG6 = mszVar.g(1);
                                                            }
                                                            int iF3 = n58.f(iG16);
                                                            if (iG6 == 1) {
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 2;
                                                            }
                                                            i14 = iF3;
                                                            iG5 = n58.g(iG17);
                                                            i68 = i15;
                                                        } else {
                                                            i14 = -1;
                                                            iG5 = -1;
                                                        }
                                                        n58Var = new n58(i14, i68, iG5, i9, i10, null);
                                                    }
                                                } else {
                                                    iG2 = mszVar.g(3);
                                                    mszVar.n();
                                                    if (mszVar.f()) {
                                                        cft.e("BoxParsers", "Unsupported reduced_still_picture_header");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    } else if (mszVar.f()) {
                                                        cft.e("BoxParsers", "Unsupported timing_info_present_flag");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    } else if (mszVar.f()) {
                                                        cft.e("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        n58Var2 = new n58(-1, -1, -1, i9, i10, null);
                                                    } else {
                                                        iG3 = mszVar.g(5);
                                                        i12 = 0;
                                                        while (i12 <= iG3) {
                                                            mszVar.o(12);
                                                            if (mszVar.g(5) > i65) {
                                                                mszVar.n();
                                                            }
                                                            i12++;
                                                            i65 = 7;
                                                        }
                                                        c3 = '\f';
                                                        int iG19 = mszVar.g(4);
                                                        int iG110 = mszVar.g(4);
                                                        mszVar.o(iG19 + 1);
                                                        mszVar.o(iG110 + 1);
                                                        if (mszVar.f()) {
                                                            mszVar.o(7);
                                                        }
                                                        mszVar.o(7);
                                                        zF2 = mszVar.f();
                                                        if (zF2) {
                                                            mszVar.o(2);
                                                        }
                                                        if (mszVar.f()) {
                                                            i13 = 1;
                                                            iG4 = 2;
                                                        } else {
                                                            i13 = 1;
                                                            iG4 = mszVar.g(1);
                                                        }
                                                        if (iG4 > 0) {
                                                            mszVar.o(i13);
                                                        }
                                                        if (zF2) {
                                                            mszVar.o(3);
                                                        }
                                                        mszVar.o(3);
                                                        boolean zF7 = mszVar.f();
                                                        if (iG2 == 2) {
                                                            mszVar.n();
                                                        }
                                                        if (iG2 == 1) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (mszVar.f()) {
                                                            int iG111 = mszVar.g(8);
                                                            int iG112 = mszVar.g(8);
                                                            int iG113 = mszVar.g(8);
                                                            if (z2) {
                                                                iG6 = mszVar.g(1);
                                                            } else {
                                                                iG6 = mszVar.g(1);
                                                            }
                                                            int iF4 = n58.f(iG111);
                                                            if (iG6 == 1) {
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 2;
                                                            }
                                                            i14 = iF4;
                                                            iG5 = n58.g(iG112);
                                                            i68 = i15;
                                                        } else {
                                                            i14 = -1;
                                                            iG5 = -1;
                                                        }
                                                        n58Var = new n58(i14, i68, iG5, i9, i10, null);
                                                    }
                                                }
                                                int i77 = n58Var.e;
                                                int i78 = n58Var.f;
                                                int i79 = n58Var.a;
                                                i29 = n58Var.b;
                                                iG7 = n58Var.c;
                                                str8 = "video/av01";
                                                i27 = i77;
                                                i8 = 8;
                                                i7 = i7;
                                                i26 = i78;
                                                i30 = i79;
                                            }
                                            n58Var = n58Var2;
                                            c3 = '\f';
                                            int i710 = n58Var.e;
                                            int i711 = n58Var.f;
                                            int i712 = n58Var.a;
                                            i29 = n58Var.b;
                                            iG7 = n58Var.c;
                                            str8 = "video/av01";
                                            i27 = i710;
                                            i8 = 8;
                                            i7 = i7;
                                            i26 = i711;
                                            i30 = i712;
                                        } else {
                                            if (iJ5 == 1668050025) {
                                                ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                byteBufferOrder.position(21);
                                                byteBufferOrder.putShort(nszVar2.t());
                                                byteBufferOrder.putShort(nszVar2.t());
                                                byteBuffer = byteBufferOrder;
                                            } else if (iJ5 == 1835295606) {
                                                ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                short sT = nszVar2.t();
                                                short sT2 = nszVar2.t();
                                                short sT3 = nszVar2.t();
                                                short sT4 = nszVar2.t();
                                                short sT5 = nszVar2.t();
                                                short sT6 = nszVar2.t();
                                                int i80 = i29;
                                                short sT7 = nszVar2.t();
                                                short sT8 = nszVar2.t();
                                                long jY = nszVar2.y();
                                                long jY2 = nszVar2.y();
                                                byteBufferOrder2.position(1);
                                                byteBufferOrder2.putShort(sT5);
                                                byteBufferOrder2.putShort(sT6);
                                                byteBufferOrder2.putShort(sT);
                                                byteBufferOrder2.putShort(sT2);
                                                byteBufferOrder2.putShort(sT3);
                                                byteBufferOrder2.putShort(sT4);
                                                byteBufferOrder2.putShort(sT7);
                                                byteBufferOrder2.putShort(sT8);
                                                byteBufferOrder2.putShort((short) (jY / 10000));
                                                byteBufferOrder2.putShort((short) (jY2 / 10000));
                                                byteBuffer = byteBufferOrder2;
                                                i29 = i80;
                                            } else {
                                                str6 = str6;
                                                str8 = str8;
                                                gVar = gVar;
                                                int i81 = i29;
                                                kVar = kVar;
                                                if (iJ5 == 1681012275) {
                                                    bArr = null;
                                                    n4h.a(null, str8 == null);
                                                    i7 = i7;
                                                    str8 = "video/3gpp";
                                                    i26 = i26;
                                                    i27 = i27;
                                                    i29 = i81;
                                                } else {
                                                    bArr = null;
                                                    if (iJ5 == 1702061171) {
                                                        n4h.a(null, str8 == null);
                                                        c cVarC = c(i36, nszVar2);
                                                        String str13 = cVarC.a;
                                                        byte[] bArr9 = cVarC.b;
                                                        if (bArr9 != null) {
                                                            listG = pcn.n(bArr9);
                                                        }
                                                        cVar = cVarC;
                                                        str8 = str13;
                                                        i29 = i81;
                                                        i8 = 8;
                                                    } else {
                                                        if (iJ5 == 1651798644) {
                                                            nszVar2.I(i36 + 8);
                                                            nszVar2.J(4);
                                                            i7 = i7;
                                                            aVar = new a(nszVar2.y(), nszVar2.y());
                                                        } else if (iJ5 == 1885434736) {
                                                            nszVar2.I(i36 + 8);
                                                            i7 = i7;
                                                            fA = nszVar2.A() / nszVar2.A();
                                                            i26 = i26;
                                                            i27 = i27;
                                                            i29 = i81;
                                                            i8 = 8;
                                                            z3 = true;
                                                        } else if (iJ5 == 1937126244) {
                                                            int i82 = i36 + 8;
                                                            while (true) {
                                                                if (i82 - i36 >= iJ4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                nszVar2.I(i82);
                                                                int iJ8 = nszVar2.j();
                                                                if (nszVar2.j() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(nszVar2.a, i82, iJ8 + i82);
                                                                    break;
                                                                }
                                                                i82 += iJ8;
                                                            }
                                                            i7 = i7;
                                                            bArr3 = bArrCopyOfRange;
                                                        } else if (iJ5 == 1936995172) {
                                                            int iW5 = nszVar2.w();
                                                            nszVar2.J(3);
                                                            if (iW5 == 0) {
                                                                int iW6 = nszVar2.w();
                                                                if (iW6 == 0) {
                                                                    i7 = 0;
                                                                } else if (iW6 == 1) {
                                                                    i7 = 1;
                                                                } else if (iW6 == 2) {
                                                                    i7 = 2;
                                                                } else if (iW6 == 3) {
                                                                    i7 = 3;
                                                                }
                                                            }
                                                            i7 = i7;
                                                        } else if (iJ5 == 1634760259) {
                                                            int i83 = iJ4 - 12;
                                                            byte[] bArr10 = new byte[i83];
                                                            nszVar2.I(i36 + 12);
                                                            nszVar2.h(bArr10, 0, i83);
                                                            listG = pcn.n(bArr10);
                                                            nsz nszVar3 = new nsz(bArr10);
                                                            msz mszVar2 = new msz(i83, bArr10);
                                                            i8 = 8;
                                                            mszVar2.m(nszVar3.b * 8);
                                                            mszVar2.p(1);
                                                            int iG20 = mszVar2.g(8);
                                                            int i84 = -1;
                                                            int i85 = -1;
                                                            int i86 = 0;
                                                            int i87 = -1;
                                                            int i88 = -1;
                                                            int i89 = -1;
                                                            while (i86 < iG20) {
                                                                mszVar2.p(1);
                                                                int iG21 = mszVar2.g(8);
                                                                int iG22 = i89;
                                                                int i90 = i88;
                                                                int i91 = i87;
                                                                int i92 = i85;
                                                                int i93 = 0;
                                                                while (i93 < iG21) {
                                                                    mszVar2.o(i62);
                                                                    boolean zF8 = mszVar2.f();
                                                                    mszVar2.n();
                                                                    int i94 = i66;
                                                                    mszVar2.p(i94);
                                                                    mszVar2.o(4);
                                                                    int iG23 = mszVar2.g(4) + 8;
                                                                    mszVar2.p(1);
                                                                    if (zF8) {
                                                                        int iG24 = mszVar2.g(8);
                                                                        int iG25 = mszVar2.g(8);
                                                                        mszVar2.p(1);
                                                                        boolean zF9 = mszVar2.f();
                                                                        int iF5 = n58.f(iG24);
                                                                        int i95 = zF9 ? 1 : 2;
                                                                        iG22 = n58.g(iG25);
                                                                        i91 = i95;
                                                                        i90 = iF5;
                                                                    }
                                                                    i93++;
                                                                    i66 = i94;
                                                                    i84 = iG23;
                                                                    i92 = i84;
                                                                    i62 = 6;
                                                                }
                                                                i86++;
                                                                i85 = i92;
                                                                i87 = i91;
                                                                i88 = i90;
                                                                i89 = iG22;
                                                                i62 = 6;
                                                            }
                                                            i26 = i84;
                                                            str8 = "video/apv";
                                                            i27 = i85;
                                                            i29 = i87;
                                                            i30 = i88;
                                                            iG7 = i89;
                                                        } else {
                                                            i8 = 8;
                                                            if (iJ5 == 1668246642 && i30 == -1 && iG7 == -1) {
                                                                int iJ9 = nszVar2.j();
                                                                if (iJ9 == 1852009592 || iJ9 == 1852009571) {
                                                                    int iC3 = nszVar2.C();
                                                                    int iC4 = nszVar2.C();
                                                                    nszVar2.J(2);
                                                                    boolean z6 = iJ4 == 19 && (nszVar2.w() & 128) != 0;
                                                                    int iF6 = n58.f(iC3);
                                                                    i29 = z6 ? 1 : 2;
                                                                    iG7 = n58.g(iC4);
                                                                    i30 = iF6;
                                                                    i26 = i26;
                                                                    i27 = i27;
                                                                } else {
                                                                    cft.g("BoxParsers", "Unsupported color type: ".concat(c8w.a(iJ9)));
                                                                    i26 = i26;
                                                                    i27 = i27;
                                                                    i29 = i81;
                                                                }
                                                            } else {
                                                                i26 = i26;
                                                                i27 = i27;
                                                                i29 = i81;
                                                            }
                                                        }
                                                        i26 = i26;
                                                        i27 = i27;
                                                        i29 = i81;
                                                    }
                                                }
                                                i8 = 8;
                                            }
                                            bArr = null;
                                            i8 = 8;
                                        }
                                    }
                                }
                                i7 = i7;
                                i26 = i26;
                            }
                            i35 = i37 + iJ4;
                            i28 = i7;
                            bArr2 = bArr;
                            i23 = i8;
                            iJ2 = i38;
                            iJ3 = i6;
                            str6 = str6;
                            str8 = str8;
                            kVar = kVar;
                            gVar = gVar;
                            b2 = 3;
                        }
                        i35 = i37 + iJ4;
                        i28 = i7;
                        bArr2 = bArr;
                        i23 = i8;
                        iJ2 = i38;
                        iJ3 = i6;
                        str6 = str6;
                        str8 = str8;
                        kVar = kVar;
                        gVar = gVar;
                        b2 = 3;
                    }
                    bArr = null;
                    i35 = i37 + iJ4;
                    i28 = i7;
                    bArr2 = bArr;
                    i23 = i8;
                    iJ2 = i38;
                    iJ3 = i6;
                    str6 = str6;
                    str8 = str8;
                    kVar = kVar;
                    gVar = gVar;
                    b2 = 3;
                }
                int i96 = i26;
                int i97 = i27;
                i5 = iJ2;
                int i98 = i28;
                String str14 = str8;
                g gVar2 = gVar;
                int i99 = i29;
                byte[] bArr11 = bArr2;
                c2 = '\f';
                if (str14 == null) {
                    str5 = str;
                    gVar = gVar2;
                } else {
                    androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                    c0062a.a = Integer.toString(i3);
                    c0062a.m = gqv.m(str14);
                    c0062a.j = str7;
                    c0062a.t = iC;
                    c0062a.u = iC2;
                    c0062a.v = i34;
                    c0062a.w = i33;
                    c0062a.z = fA;
                    c0062a.y = i24;
                    c0062a.A = bArr3;
                    c0062a.B = i98;
                    c0062a.p = listG;
                    c0062a.o = i32;
                    c0062a.D = i31;
                    c0062a.q = drmInitData3;
                    str5 = str;
                    c0062a.d = str5;
                    c0062a.C = new n58(i30, i99, iG7, i97, i96, byteBuffer != null ? byteBuffer.array() : bArr11);
                    a aVar4 = aVar;
                    if (aVar4 != null) {
                        c0062a.h = c0p.s(aVar4.a);
                        c0062a.i = c0p.s(aVar4.b);
                    } else {
                        c cVar2 = cVar;
                        if (cVar2 != null) {
                            c0062a.h = c0p.s(cVar2.c);
                            c0062a.i = c0p.s(cVar2.d);
                        }
                    }
                    gVar = gVar2;
                    gVar.b = new androidx.media3.common.a(c0062a);
                }
            } else {
                if (iJ3 == 1836069985 || iJ3 == 1701733217 || iJ3 == 1633889587 || iJ3 == 1700998451 || iJ3 == 1633889588 || iJ3 == 1835823201 || iJ3 == 1685353315 || iJ3 == 1685353317 || iJ3 == 1685353320 || iJ3 == 1685353324 || iJ3 == 1685353336 || iJ3 == 1935764850 || iJ3 == 1935767394 || iJ3 == 1819304813 || iJ3 == 1936684916 || iJ3 == 1953984371 || iJ3 == 778924082 || iJ3 == 778924083 || iJ3 == 1835557169 || iJ3 == 1835560241 || iJ3 == 1634492771 || iJ3 == 1634492791 || iJ3 == 1970037111 || iJ3 == 1332770163 || iJ3 == 1716281667 || iJ3 == 1767992678 || iJ3 == 1768973165 || iJ3 == 1718641517) {
                    nszVar2 = nszVar;
                    i22 = i22;
                    iJ2 = iJ2;
                    b(nszVar2, iJ3, i22, iJ2, jVar2.a, str5, z, drmInitData, gVar, i21);
                    str5 = str;
                } else if (iJ3 == 1414810956 || iJ3 == 1954034535 || iJ3 == 2004251764 || iJ3 == 1937010800 || iJ3 == 1664495672 || iJ3 == 1836070003) {
                    nszVar2.I(i22 + 16);
                    String str15 = "application/ttml+xml";
                    long j3 = Long.MAX_VALUE;
                    if (iJ3 != 1414810956) {
                        if (iJ3 == 1954034535) {
                            int i100 = iJ2 - 16;
                            byte[] bArr12 = new byte[i100];
                            nszVar2.h(bArr12, 0, i100);
                            c150VarN = pcn.n(bArr12);
                            str15 = "application/x-quicktime-tx3g";
                            i18 = i22;
                            i19 = iJ2;
                        } else {
                            if (iJ3 == 2004251764) {
                                str15 = "application/x-mp4-vtt";
                            } else if (iJ3 == 1937010800) {
                                j3 = 0;
                            } else if (iJ3 == 1664495672) {
                                gVar.d = 1;
                                str15 = "application/x-mp4-cea-608";
                            } else {
                                if (iJ3 != 1836070003) {
                                    fm20.a();
                                    return null;
                                }
                                int i101 = nszVar2.b;
                                nszVar2.J(4);
                                if (nszVar2.j() == 1702061171) {
                                    byte[] bArr13 = c(i101, nszVar2).b;
                                    if (bArr13 == null || bArr13.length != 64) {
                                        i18 = i22;
                                        i19 = iJ2;
                                    } else {
                                        int i102 = jVar2.d;
                                        int i103 = jVar2.e;
                                        ly0.f(bArr13.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i104 = 0;
                                        while (i104 < bArr13.length - 3) {
                                            byte[] bArr14 = bArr13;
                                            int iR = c0p.r(bArr13[i104], bArr13[i104 + 1], bArr13[i104 + 2], bArr14[i104 + 3]);
                                            int i105 = (iR >> 16) & 255;
                                            int i106 = ((iR >> 8) & 255) - 128;
                                            int i107 = (iR & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(jrh0.i(s15.a(i107, 17790, 10000, i105), 0, 255) | (jrh0.i((i105 - ((i107 * 3455) / 10000)) - ((i106 * 7169) / 10000), 0, 255) << 8) | (jrh0.i(s15.a(i106, 14075, 10000, i105), 0, 255) << 16))));
                                            i104 += 4;
                                            bArr13 = bArr14;
                                            i22 = i22;
                                            iJ2 = iJ2;
                                        }
                                        i18 = i22;
                                        i19 = iJ2;
                                        StringBuilder sbA = dy5.a("size: ", i102, i103, "x", "\npalette: ");
                                        sbA.append(new w9p(", ").b(arrayList));
                                        sbA.append("\n");
                                        String string = sbA.toString();
                                        String str16 = jrh0.a;
                                        c150VarN = pcn.n(string.getBytes(StandardCharsets.UTF_8));
                                        str4 = "application/vobsub";
                                    }
                                } else {
                                    i18 = i22;
                                    i19 = iJ2;
                                    str4 = null;
                                    c150VarN = null;
                                }
                                str15 = str4;
                            }
                            i18 = i22;
                            i19 = iJ2;
                            c150VarN = null;
                        }
                        j2 = j3;
                        if (str15 != null) {
                            androidx.media3.common.a.C0062a c0062a2 = new androidx.media3.common.a.C0062a();
                            c0062a2.a = Integer.toString(i20);
                            c0062a2.m = gqv.m(str15);
                            c0062a2.d = str5;
                            c0062a2.r = j2;
                            c0062a2.p = c150VarN;
                            gVar.b = new androidx.media3.common.a(c0062a2);
                        }
                    } else {
                        i18 = i22;
                        i19 = iJ2;
                        c150VarN = null;
                        j2 = j3;
                        if (str15 != null) {
                            androidx.media3.common.a.C0062a c0062a3 = new androidx.media3.common.a.C0062a();
                            c0062a3.a = Integer.toString(i20);
                            c0062a3.m = gqv.m(str15);
                            c0062a3.d = str5;
                            c0062a3.r = j2;
                            c0062a3.p = c150VarN;
                            gVar.b = new androidx.media3.common.a(c0062a3);
                        }
                    }
                    c2 = '\f';
                    nszVar2 = nszVar;
                    i3 = i20;
                    i4 = iJ;
                    i22 = i18;
                    i5 = i19;
                    i2 = i21;
                } else if (iJ3 == 1835365492) {
                    nszVar2.I(i22 + 16);
                    if (iJ3 == 1835365492) {
                        nszVar2.r();
                        String strR = nszVar2.r();
                        if (strR != null) {
                            androidx.media3.common.a.C0062a c0062a4 = new androidx.media3.common.a.C0062a();
                            c0062a4.a = Integer.toString(i20);
                            c0062a4.m = gqv.m(strR);
                            gVar.b = new androidx.media3.common.a(c0062a4);
                        }
                    }
                } else if (iJ3 == 1667329389) {
                    androidx.media3.common.a.C0062a c0062a5 = new androidx.media3.common.a.C0062a();
                    c0062a5.a = Integer.toString(i20);
                    c0062a5.m = gqv.m("application/x-camera-motion");
                    gVar.b = new androidx.media3.common.a(c0062a5);
                }
                i22 = i22;
                i5 = iJ2;
                i2 = i21;
                i3 = i20;
                i4 = iJ;
                c2 = '\f';
            }
            nszVar2.I(i22 + i5);
            i21 = i2 + 1;
            jVar2 = jVar;
            i20 = i3;
            iJ = i4;
        }
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0348  */
    /* JADX WARN: Code duplicated, block: B:199:0x034d A[EDGE_INSN: B:199:0x034d->B:202:0x036b BREAK  A[LOOP:4: B:160:0x02d8->B:200:0x035d]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static uov k(c8w.b bVar) {
        boolean z;
        int i2;
        uov uovVar;
        uov uovVarB;
        uov uovVar2;
        int iX;
        uov uovVar3;
        boolean z2;
        Object objF;
        nsz nszVar = bVar.b;
        int i3 = 8;
        nszVar.I(8);
        boolean z3 = false;
        uov uovVar4 = new uov(new uov.a[0]);
        while (nszVar.a() >= i3) {
            int i4 = nszVar.b;
            int iJ = nszVar.j();
            int iJ2 = nszVar.j();
            String str = null;
            if (iJ2 == 1835365473) {
                nszVar.I(i4);
                int i5 = i4 + iJ;
                nszVar.J(i3);
                a(nszVar);
                while (true) {
                    int i6 = nszVar.b;
                    if (i6 < i5) {
                        int iJ3 = nszVar.j();
                        if (nszVar.j() == 1768715124) {
                            nszVar.I(i6);
                            int i7 = i6 + iJ3;
                            nszVar.J(i3);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i8 = nszVar.b;
                                if (i8 >= i7) {
                                    break;
                                }
                                int iJ4 = nszVar.j() + i8;
                                int iJ5 = nszVar.j();
                                int i9 = (iJ5 >> 24) & 255;
                                if (i9 == 169 || i9 == 253) {
                                    z2 = z3 ? 1 : 0;
                                    int i10 = 16777215 & iJ5;
                                    if (i10 == 6516084) {
                                        int iJ6 = nszVar.j();
                                        if (nszVar.j() == 1684108385) {
                                            nszVar.J(8);
                                            String strS = nszVar.s(iJ6 - 16);
                                            objF = new a98("und", strS, strS);
                                        } else {
                                            cft.g("MetadataUtil", "Failed to parse comment attribute: ".concat(c8w.a(iJ5)));
                                            objF = null;
                                        }
                                    } else if (i10 == 7233901 || i10 == 7631467) {
                                        objF = epv.f(iJ5, nszVar, "TIT2");
                                    } else if (i10 == 6516589 || i10 == 7828084) {
                                        objF = epv.f(iJ5, nszVar, "TCOM");
                                    } else if (i10 == 6578553) {
                                        objF = epv.f(iJ5, nszVar, "TDRC");
                                    } else if (i10 == 4280916) {
                                        objF = epv.f(iJ5, nszVar, "TPE1");
                                    } else if (i10 == 7630703) {
                                        objF = epv.f(iJ5, nszVar, "TSSE");
                                    } else if (i10 == 6384738) {
                                        objF = epv.f(iJ5, nszVar, "TALB");
                                    } else if (i10 == 7108978) {
                                        objF = epv.f(iJ5, nszVar, "USLT");
                                    } else if (i10 == 6776174) {
                                        objF = epv.f(iJ5, nszVar, "TCON");
                                    } else if (i10 == 6779504) {
                                        objF = epv.f(iJ5, nszVar, "TIT1");
                                    } else {
                                        cft.b("MetadataUtil", "Skipped unknown metadata entry: ".concat(c8w.a(iJ5)));
                                        nszVar.I(iJ4);
                                        objF = null;
                                    }
                                    nszVar.I(iJ4);
                                } else {
                                    if (iJ5 == 1735291493) {
                                        try {
                                            String strA = t6n.a(epv.d(nszVar) - 1);
                                            if (strA != null) {
                                                objF = new qjf0("TCON", str, pcn.n(strA));
                                            } else {
                                                cft.g("MetadataUtil", "Failed to parse standard genre code");
                                                objF = str;
                                            }
                                        } catch (Throwable th) {
                                            nszVar.I(iJ4);
                                            throw th;
                                        }
                                    } else if (iJ5 == 1684632427) {
                                        objF = epv.c(iJ5, nszVar, "TPOS");
                                    } else if (iJ5 == 1953655662) {
                                        objF = epv.c(iJ5, nszVar, "TRCK");
                                    } else if (iJ5 == 1953329263) {
                                        objF = epv.e(iJ5, "TBPM", nszVar, true, z3);
                                    } else if (iJ5 == 1668311404) {
                                        objF = epv.e(iJ5, "TCMP", nszVar, true, true);
                                    } else if (iJ5 == 1668249202) {
                                        objF = epv.b(nszVar);
                                    } else if (iJ5 == 1631670868) {
                                        objF = epv.f(iJ5, nszVar, "TPE2");
                                    } else if (iJ5 == 1936682605) {
                                        objF = epv.f(iJ5, nszVar, "TSOT");
                                    } else if (iJ5 == 1936679276) {
                                        objF = epv.f(iJ5, nszVar, "TSOA");
                                    } else if (iJ5 == 1936679282) {
                                        objF = epv.f(iJ5, nszVar, "TSOP");
                                    } else if (iJ5 == 1936679265) {
                                        objF = epv.f(iJ5, nszVar, "TSO2");
                                    } else if (iJ5 == 1936679791) {
                                        objF = epv.f(iJ5, nszVar, "TSOC");
                                    } else if (iJ5 == 1920233063) {
                                        objF = epv.e(iJ5, "ITUNESADVISORY", nszVar, z3, z3);
                                    } else if (iJ5 == 1885823344) {
                                        objF = epv.e(iJ5, "ITUNESGAPLESS", nszVar, z3, true);
                                    } else if (iJ5 == 1936683886) {
                                        objF = epv.f(iJ5, nszVar, "TVSHOWSORT");
                                    } else if (iJ5 == 1953919848) {
                                        objF = epv.f(iJ5, nszVar, "TVSHOW");
                                    } else if (iJ5 == 757935405) {
                                        String strS2 = str;
                                        String strS3 = strS2;
                                        int i11 = -1;
                                        int i12 = -1;
                                        while (true) {
                                            int i13 = nszVar.b;
                                            if (i13 >= iJ4) {
                                                break;
                                            }
                                            int iJ7 = nszVar.j();
                                            int iJ8 = nszVar.j();
                                            boolean z4 = z3;
                                            nszVar.J(4);
                                            if (iJ8 == 1835360622) {
                                                strS2 = nszVar.s(iJ7 - 12);
                                            } else if (iJ8 == 1851878757) {
                                                strS3 = nszVar.s(iJ7 - 12);
                                            } else {
                                                if (iJ8 == 1684108385) {
                                                    i11 = i13;
                                                    i12 = iJ7;
                                                }
                                                nszVar.J(iJ7 - 12);
                                            }
                                            z3 = z4 ? 1 : 0;
                                        }
                                        z2 = z3;
                                        if (strS2 == null || strS3 == null || i11 == -1) {
                                            objF = null;
                                        } else {
                                            nszVar.I(i11);
                                            nszVar.J(16);
                                            objF = new uyo(strS2, strS3, nszVar.s(i12 - 16));
                                        }
                                        nszVar.I(iJ4);
                                    } else {
                                        z2 = z3 ? 1 : 0;
                                        cft.b("MetadataUtil", "Skipped unknown metadata entry: ".concat(c8w.a(iJ5)));
                                        nszVar.I(iJ4);
                                        objF = null;
                                    }
                                    nszVar.I(iJ4);
                                    z2 = z3 ? 1 : 0;
                                }
                                if (objF != null) {
                                    arrayList.add(objF);
                                }
                                z3 = z2;
                                str = null;
                            }
                            z = z3 ? 1 : 0;
                            if (!arrayList.isEmpty()) {
                                uovVar3 = new uov(arrayList);
                                break;
                            }
                            break;
                        }
                        Object[] objArr = z3 ? 1 : 0;
                        nszVar.I(i6 + iJ3);
                        z3 = objArr == true ? 1 : 0;
                        i3 = 8;
                        str = null;
                    } else {
                        z = z3 ? 1 : 0;
                    }
                    uovVar3 = null;
                    break;
                }
                uovVar4 = uovVar4.b(uovVar3);
                i2 = 8;
            } else {
                z = z3 ? 1 : 0;
                if (iJ2 == 1936553057) {
                    nszVar.I(i4);
                    int i14 = i4 + iJ;
                    nszVar.J(12);
                    while (true) {
                        int i15 = nszVar.b;
                        if (i15 < i14) {
                            int iJ9 = nszVar.j();
                            if (nszVar.j() == 1935766900) {
                                if (iJ9 >= 16) {
                                    nszVar.J(4);
                                    int i16 = -1;
                                    int i17 = z ? 1 : 0;
                                    int i18 = i17;
                                    while (i17 < 2) {
                                        int iW = nszVar.w();
                                        int iW2 = nszVar.w();
                                        if (iW == 0) {
                                            i16 = iW2;
                                        } else if (iW == 1) {
                                            i18 = iW2;
                                        }
                                        i17++;
                                    }
                                    if (i16 != 12) {
                                        if (i16 != 13) {
                                            if (i16 != 21) {
                                                iX = -2147483647;
                                            } else {
                                                i2 = 8;
                                                if (nszVar.a() < 8 || nszVar.b + 8 > i14) {
                                                    iX = -2147483647;
                                                } else {
                                                    int iJ10 = nszVar.j();
                                                    int iJ11 = nszVar.j();
                                                    if (iJ10 < 12 || iJ11 != 1936877170) {
                                                        iX = -2147483647;
                                                    } else {
                                                        iX = nszVar.x();
                                                    }
                                                }
                                            }
                                            if (iX == -2147483647) {
                                                f3a0 f3a0Var = new f3a0(i18 == true ? 1 : 0, iX);
                                                uov.a[] aVarArr = new uov.a[1];
                                                aVarArr[z ? 1 : 0] = f3a0Var;
                                                uovVar2 = new uov(aVarArr);
                                                break;
                                            }
                                            break;
                                        }
                                        iX = 120;
                                    } else {
                                        iX = 240;
                                    }
                                    i2 = 8;
                                    if (iX == -2147483647) {
                                        f3a0 f3a0Var2 = new f3a0(i18 == true ? 1 : 0, iX);
                                        uov.a[] aVarArr2 = new uov.a[1];
                                        aVarArr2[z ? 1 : 0] = f3a0Var2;
                                        uovVar2 = new uov(aVarArr2);
                                        break;
                                    }
                                    break;
                                }
                                uovVar2 = null;
                                i2 = 8;
                                break;
                            }
                            nszVar.I(i15 + iJ9);
                        } else {
                            i2 = 8;
                        }
                        uovVar2 = null;
                        break;
                    }
                    uovVarB = uovVar4.b(uovVar2);
                } else {
                    i2 = 8;
                    if (iJ2 == -1451722374) {
                        short sT = nszVar.t();
                        nszVar.J(2);
                        String strU = nszVar.u(sT, StandardCharsets.UTF_8);
                        int iMax = Math.max(strU.lastIndexOf(43), strU.lastIndexOf(45));
                        try {
                            try {
                                g8w g8wVar = new g8w(Float.parseFloat(strU.substring(z ? 1 : 0, iMax)), Float.parseFloat(strU.substring(iMax, strU.length() - 1)));
                                uov.a[] aVarArr3 = new uov.a[1];
                                z = false;
                                z = false;
                                try {
                                    aVarArr3[0] = g8wVar;
                                    uovVar = new uov(aVarArr3);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    uovVar = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z = z ? 1 : 0;
                        }
                        uovVarB = uovVar4.b(uovVar);
                    }
                }
                uovVar4 = uovVarB;
            }
            nszVar.I(i4 + iJ);
            i3 = i2;
            z3 = z;
        }
        return uovVar4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01da  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6 A[EDGE_INSN: B:105:0x01e6->B:104:0x01e3 BREAK  A[LOOP:17: B:95:0x01c6->B:106:0x01f4]] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f4 A[LOOP:17: B:95:0x01c6->B:106:0x01f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0221  */
    /* JADX WARN: Code duplicated, block: B:120:0x0240  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:150:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:157:0x0311  */
    /* JADX WARN: Code duplicated, block: B:161:0x0336  */
    /* JADX WARN: Code duplicated, block: B:162:0x033d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0366  */
    /* JADX WARN: Code duplicated, block: B:165:0x036c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0375  */
    /* JADX WARN: Code duplicated, block: B:170:0x0380  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:178:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:182:0x0404  */
    /* JADX WARN: Code duplicated, block: B:184:0x0409  */
    /* JADX WARN: Code duplicated, block: B:187:0x0415  */
    /* JADX WARN: Code duplicated, block: B:188:0x0418  */
    /* JADX WARN: Code duplicated, block: B:191:0x0436  */
    /* JADX WARN: Code duplicated, block: B:192:0x043e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0442  */
    /* JADX WARN: Code duplicated, block: B:196:0x044b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0456  */
    /* JADX WARN: Code duplicated, block: B:199:0x045d  */
    /* JADX WARN: Code duplicated, block: B:202:0x046e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0528  */
    /* JADX WARN: Code duplicated, block: B:228:0x0554  */
    /* JADX WARN: Code duplicated, block: B:230:0x0558  */
    /* JADX WARN: Code duplicated, block: B:232:0x055e A[LOOP:13: B:229:0x0556->B:232:0x055e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x0598 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x059a  */
    /* JADX WARN: Code duplicated, block: B:240:0x059e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:248:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:249:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:252:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:254:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:257:0x05e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:259:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:264:0x0618 A[DONT_INVERT, LOOP:15: B:264:0x0618->B:268:0x0622, LOOP_START, PHI: r28
      0x0618: PHI (r28v9 int) = (r28v7 int), (r28v10 int) binds: [B:263:0x0616, B:268:0x0622] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:265:0x061a  */
    /* JADX WARN: Code duplicated, block: B:268:0x0622 A[LOOP:15: B:264:0x0618->B:268:0x0622, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x0628 A[EDGE_INSN: B:269:0x0628->B:270:0x0629 BREAK  A[LOOP:15: B:264:0x0618->B:268:0x0622]] */
    /* JADX WARN: Code duplicated, block: B:271:0x062b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x0639  */
    /* JADX WARN: Code duplicated, block: B:280:0x0665  */
    /* JADX WARN: Code duplicated, block: B:281:0x0668  */
    /* JADX WARN: Code duplicated, block: B:286:0x0688  */
    /* JADX WARN: Code duplicated, block: B:288:0x069b  */
    /* JADX WARN: Code duplicated, block: B:293:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:295:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:297:0x06e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:320:0x0785  */
    /* JADX WARN: Code duplicated, block: B:324:0x0790  */
    /* JADX WARN: Code duplicated, block: B:326:0x0796  */
    /* JADX WARN: Code duplicated, block: B:329:0x07a0 A[LOOP:5: B:327:0x079d->B:329:0x07a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:331:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:332:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:334:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:335:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:339:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:341:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:344:0x0820  */
    /* JADX WARN: Code duplicated, block: B:348:0x082e  */
    /* JADX WARN: Code duplicated, block: B:351:0x0836  */
    /* JADX WARN: Code duplicated, block: B:356:0x0846  */
    /* JADX WARN: Code duplicated, block: B:360:0x0855  */
    /* JADX WARN: Code duplicated, block: B:362:0x085d A[LOOP:9: B:358:0x084c->B:362:0x085d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x0869  */
    /* JADX WARN: Code duplicated, block: B:366:0x086b  */
    /* JADX WARN: Code duplicated, block: B:368:0x0873  */
    /* JADX WARN: Code duplicated, block: B:372:0x088a  */
    /* JADX WARN: Code duplicated, block: B:373:0x088c  */
    /* JADX WARN: Code duplicated, block: B:376:0x0892  */
    /* JADX WARN: Code duplicated, block: B:377:0x0895  */
    /* JADX WARN: Code duplicated, block: B:379:0x0898  */
    /* JADX WARN: Code duplicated, block: B:380:0x089b  */
    /* JADX WARN: Code duplicated, block: B:382:0x089e  */
    /* JADX WARN: Code duplicated, block: B:384:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:385:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:389:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:391:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:394:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:396:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:399:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:406:0x092b  */
    /* JADX WARN: Code duplicated, block: B:417:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0958 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x082c A[ADDED_TO_REGION, EDGE_INSN: B:431:0x082c->B:347:0x082c BREAK  A[LOOP:7: B:342:0x081c->B:346:0x0826], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0843 A[ADDED_TO_REGION, EDGE_INSN: B:434:0x0843->B:354:0x0843 BREAK  A[LOOP:8: B:349:0x0830->B:353:0x083e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0860 A[EDGE_INSN: B:435:0x0860->B:363:0x0860 BREAK  A[LOOP:9: B:358:0x084c->B:362:0x085d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0860 A[EDGE_INSN: B:436:0x0860->B:363:0x0860 BREAK  A[LOOP:9: B:358:0x084c->B:362:0x085d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0905 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0606 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x057b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0573 A[EDGE_INSN: B:447:0x0573->B:233:0x0573 BREAK  A[LOOP:13: B:229:0x0556->B:232:0x055e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0628 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x0620 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public static ArrayList j(c8w.a aVar, hyj hyjVar, long j2, DrmInitData drmInitData, boolean z, boolean z2, baj bajVar) {
        int i2;
        long jV;
        long j3;
        int i3;
        int i4;
        j jVar;
        long j4;
        long j5;
        long j6;
        long jV2;
        nsz nszVar;
        int iE;
        long jY;
        int i5;
        int i6;
        int i7;
        long j7;
        char[] cArr;
        int i8;
        String str;
        c8w.b bVarC;
        g gVarI;
        int i9;
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.a aVar2;
        int i10;
        androidx.media3.common.a aVar3;
        fjg0 fjg0Var;
        b8w b8wVar;
        uov uovVar;
        uov uovVar2;
        c8w.a aVarB;
        Pair pairCreate;
        char c2;
        long jB;
        long j8;
        fjg0 fjg0VarA;
        androidx.media3.common.a aVar4;
        c8w.a aVarB2;
        c8w.b bVarC2;
        c8w.b bVarC3;
        e iVar;
        int iC;
        androidx.media3.common.a aVar5;
        c8w.b bVarC4;
        boolean z3;
        c8w.b bVarC5;
        nsz nszVar2;
        ArrayList arrayList;
        c8w.b bVarC6;
        nsz nszVar3;
        b bVar;
        int iA;
        int iA2;
        int iA3;
        int iA4;
        int iA5;
        int iA6;
        int iB;
        int i11;
        long[] jArr3;
        int[] iArr;
        long[] jArr4;
        int[] iArrCopyOf;
        int i12;
        int i13;
        nsz nszVar4;
        int i14;
        int iA7;
        long j9;
        long j10;
        int i15;
        int i16;
        int iJ;
        int i17;
        int i18;
        e eVar;
        int i19;
        int iJ2;
        long j11;
        int i20;
        int i21;
        int[] iArrCopyOf2;
        long[] jArrCopyOf;
        long[] jArr5;
        int i22;
        boolean z4;
        String str2;
        long[] jArr6;
        int i23;
        long j12;
        int[] iArr2;
        long j13;
        long[] jArr7;
        int[] iArr3;
        int i24;
        boolean zA;
        int i25;
        int iA8;
        int i26;
        int iA9;
        long j14;
        fjg0 fjg0VarA2;
        long j15;
        androidx.media3.common.a aVar6;
        int i27;
        long[] jArr8;
        long[] jArr9;
        long jV3;
        int i28;
        int i29;
        boolean z5;
        int[] iArr4;
        int[] iArr5;
        int i30;
        int i31;
        int i32;
        boolean z6;
        int[] iArr6;
        int i33;
        boolean z7;
        boolean z8;
        long[] jArr10;
        int[] iArr7;
        int[] iArr8;
        long[] jArr11;
        int i34;
        boolean z9;
        int i35;
        int i36;
        long j16;
        ojg0 ojg0Var;
        long j17;
        long[] jArr12;
        int i37;
        boolean z10;
        int i38;
        long jV4;
        int[] iArr9;
        long j18;
        int i39;
        long j19;
        int i40;
        int i41;
        int i42;
        boolean z11;
        int i43;
        int i44;
        int i45;
        long j20;
        int i46;
        long jV5;
        long j21;
        c8w.a aVar7 = aVar;
        ArrayList arrayList2 = aVar7.d;
        ArrayList arrayList3 = new ArrayList();
        int i47 = 0;
        while (i47 < arrayList2.size()) {
            c8w.a aVar8 = (c8w.a) arrayList2.get(i47);
            if (aVar8.a != 1953653099) {
                arrayList = arrayList2;
                arrayList3 = arrayList3;
                i11 = i47;
            } else {
                c8w.b bVarC7 = aVar7.c(1836476516);
                bVarC7.getClass();
                c8w.a aVarB3 = aVar8.b(1835297121);
                aVarB3.getClass();
                c8w.b bVarC8 = aVarB3.c(1751411826);
                bVarC8.getClass();
                nsz nszVar5 = bVarC8.b;
                nszVar5.I(16);
                int iJ3 = nszVar5.j();
                if (iJ3 == 1936684398) {
                    i2 = 1;
                } else if (iJ3 == 1986618469) {
                    i2 = 2;
                } else if (iJ3 == 1952807028 || iJ3 == 1935832172 || iJ3 == 1937072756 || iJ3 == 1668047728 || iJ3 == 1937072752) {
                    i2 = 3;
                } else {
                    i2 = iJ3 == 1835365473 ? 5 : -1;
                }
                int i48 = 1;
                if (i2 != -1) {
                    c8w.b bVarC9 = aVar8.c(1953196132);
                    bVarC9.getClass();
                    nsz nszVar6 = bVarC9.b;
                    nszVar6.I(8);
                    int iE2 = e(nszVar6.j());
                    nszVar6.J(iE2 != 0 ? 16 : 8);
                    int iJ4 = nszVar6.j();
                    nszVar6.J(4);
                    int i49 = nszVar6.b;
                    int i50 = iE2 == 0 ? 4 : 8;
                    int i51 = 0;
                    while (true) {
                        jV = -9223372036854775807L;
                        if (i51 >= i50) {
                            nszVar6.J(i50);
                        } else {
                            if (nszVar6.a[i49 + i51] != -1) {
                                long jY2 = iE2 == 0 ? nszVar6.y() : nszVar6.B();
                                if (jY2 != 0) {
                                    j3 = jY2;
                                    break;
                                }
                                break;
                            }
                            i51++;
                        }
                        j3 = -9223372036854775807L;
                        break;
                    }
                    nszVar6.J(10);
                    int iC2 = nszVar6.C();
                    nszVar6.J(4);
                    int iJ5 = nszVar6.j();
                    int iJ6 = nszVar6.j();
                    nszVar6.J(4);
                    int iJ7 = nszVar6.j();
                    int iJ8 = nszVar6.j();
                    if (iJ5 == 0 && iJ6 == 65536 && ((iJ7 == -65536 || iJ7 == 65536) && iJ8 == 0)) {
                        i3 = 90;
                    } else if (iJ5 == 0 && iJ6 == -65536 && ((iJ7 == 65536 || iJ7 == -65536) && iJ8 == 0)) {
                        i3 = 270;
                    } else {
                        if ((iJ5 == -65536 || iJ5 == 65536) && iJ6 == 0 && iJ7 == 0 && iJ8 == -65536) {
                            i3 = 180;
                        } else {
                            i4 = 0;
                        }
                        nszVar6.J(16);
                        short sT = nszVar6.t();
                        nszVar6.J(2);
                        jVar = new j(iJ4, iC2, i4, sT, nszVar6.t(), j3);
                        if (j2 == -9223372036854775807L) {
                            j4 = j3;
                        } else {
                            j4 = j2;
                        }
                        j5 = g(bVarC7.b).c;
                        if (j4 == -9223372036854775807L) {
                            j6 = j5;
                            jV2 = -9223372036854775807L;
                        } else {
                            String str3 = jrh0.a;
                            j6 = j5;
                            jV2 = jrh0.V(j4, 1000000L, j6, RoundingMode.DOWN);
                        }
                        c8w.a aVarB4 = aVarB3.b(1835626086);
                        aVarB4.getClass();
                        c8w.a aVarB5 = aVarB4.b(1937007212);
                        aVarB5.getClass();
                        c8w.b bVarC10 = aVarB3.c(1835296868);
                        bVarC10.getClass();
                        nszVar = bVarC10.b;
                        nszVar.I(8);
                        iE = e(nszVar.j());
                        nszVar.J(iE == 0 ? 8 : 16);
                        jY = nszVar.y();
                        i5 = nszVar.b;
                        if (iE == 0) {
                            i6 = 4;
                        } else {
                            i6 = 8;
                        }
                        i7 = 0;
                        while (true) {
                            if (i7 < i6) {
                                nszVar.J(i6);
                                break;
                            }
                            if (nszVar.a[i5 + i7] != -1) {
                                if (iE == 0) {
                                    jB = nszVar.y();
                                } else {
                                    jB = nszVar.B();
                                }
                                j8 = jB;
                                if (j8 != 0) {
                                    break;
                                }
                                String str4 = jrh0.a;
                                jV = jrh0.V(j8, 1000000L, jY, RoundingMode.DOWN);
                                break;
                            }
                            i7++;
                        }
                        j7 = jV;
                        int iC3 = nszVar.C();
                        cArr = new char[]{(char) (((iC3 >> 10) & 31) + 96), (char) (((iC3 >> 5) & 31) + 96), (char) ((iC3 & 31) + 96)};
                        i8 = 0;
                        while (true) {
                            if (i8 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c2 = cArr[i8];
                            if (c2 >= 'a' || c2 > 'z') {
                                str = null;
                                break;
                            }
                            i8++;
                        }
                        bVarC = aVarB5.c(1937011556);
                        if (bVarC != null) {
                            throw ssz.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                        }
                        gVarI = i(bVarC.b, jVar, str, drmInitData, z2);
                        if (!z || (aVarB = aVar8.b(1701082227)) == null) {
                            i9 = i2;
                        } else {
                            c8w.b bVarC11 = aVarB.c(1701606260);
                            if (bVarC11 == null) {
                                i9 = i2;
                                pairCreate = null;
                            } else {
                                nsz nszVar7 = bVarC11.b;
                                nszVar7.I(8);
                                int iE3 = e(nszVar7.j());
                                int iA10 = nszVar7.A();
                                long[] jArr13 = new long[iA10];
                                long[] jArr14 = new long[iA10];
                                int i52 = 0;
                                while (i52 < iA10) {
                                    int i53 = i52;
                                    int i54 = i48;
                                    jArr13[i53] = iE3 == i54 ? nszVar7.B() : nszVar7.y();
                                    jArr14[i53] = iE3 == i54 ? nszVar7.q() : nszVar7.j();
                                    if (nszVar7.t() != 1) {
                                        hb5.a("Unsupported media rate.");
                                        return null;
                                    }
                                    nszVar7.J(2);
                                    i52 = i53 + 1;
                                    i2 = i2;
                                    i48 = 1;
                                }
                                i9 = i2;
                                pairCreate = Pair.create(jArr13, jArr14);
                            }
                            if (pairCreate != null) {
                                long[] jArr15 = (long[]) pairCreate.first;
                                jArr2 = (long[]) pairCreate.second;
                                jArr = jArr15;
                            }
                            aVar2 = gVarI.b;
                            if (aVar2 != null) {
                                i10 = jVar.b;
                                if (i10 != 0) {
                                    b8wVar = new b8w(i10);
                                    androidx.media3.common.a.C0062a c0062aA = aVar2.a();
                                    uovVar = gVarI.b.l;
                                    if (uovVar != null) {
                                        uovVar2 = uovVar.a(b8wVar);
                                    } else {
                                        uovVar2 = new uov(b8wVar);
                                    }
                                    c0062aA.k = uovVar2;
                                    aVar3 = new androidx.media3.common.a(c0062aA);
                                } else {
                                    aVar3 = aVar2;
                                }
                                fjg0Var = new fjg0(jVar.a, i9, jY, j6, jV2, j7, aVar3, gVarI.d, gVarI.a, gVarI.c, jArr, jArr2);
                            }
                            fjg0VarA = (fjg0) bajVar.apply(fjg0Var);
                            if (fjg0VarA == null) {
                                arrayList = arrayList2;
                                arrayList3 = arrayList3;
                                i11 = i47;
                            } else {
                                aVar4 = fjg0VarA.g;
                                c8w.a aVarB6 = aVar8.b(1835297121);
                                aVarB6.getClass();
                                c8w.a aVarB7 = aVarB6.b(1835626086);
                                aVarB7.getClass();
                                aVarB2 = aVarB7.b(1937007212);
                                aVarB2.getClass();
                                bVarC2 = aVarB2.c(1937011578);
                                if (bVarC2 != null) {
                                    iVar = new h(bVarC2, aVar4);
                                } else {
                                    bVarC3 = aVarB2.c(1937013298);
                                    if (bVarC3 != null) {
                                        throw ssz.a(null, "Track has no sample table size information");
                                    }
                                    iVar = new i(bVarC3);
                                }
                                iC = iVar.c();
                                if (iC == 0) {
                                    i11 = i47;
                                    ojg0Var = new ojg0(fjg0VarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                    arrayList = arrayList2;
                                } else {
                                    if (fjg0VarA.b == 2) {
                                        j21 = fjg0VarA.f;
                                        if (j21 > 0) {
                                            androidx.media3.common.a.C0062a c0062aA2 = aVar4.a();
                                            c0062aA2.x = iC / (j21 / 1000000.0f);
                                            fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA2));
                                        }
                                    }
                                    aVar5 = fjg0VarA.g;
                                    bVarC4 = aVarB2.c(1937007471);
                                    if (bVarC4 == null) {
                                        bVarC4 = aVarB2.c(1668232756);
                                        bVarC4.getClass();
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    nsz nszVar8 = bVarC4.b;
                                    c8w.b bVarC12 = aVarB2.c(1937011555);
                                    bVarC12.getClass();
                                    nsz nszVar9 = bVarC12.b;
                                    c8w.b bVarC13 = aVarB2.c(1937011827);
                                    bVarC13.getClass();
                                    nsz nszVar10 = bVarC13.b;
                                    bVarC5 = aVarB2.c(1937011571);
                                    if (bVarC5 != null) {
                                        nszVar2 = bVarC5.b;
                                    } else {
                                        nszVar2 = null;
                                    }
                                    arrayList = arrayList2;
                                    bVarC6 = aVarB2.c(1668576371);
                                    if (bVarC6 != null) {
                                        nszVar3 = bVarC6.b;
                                    } else {
                                        nszVar3 = null;
                                    }
                                    bVar = new b(nszVar9, nszVar8, z3);
                                    nszVar10.I(12);
                                    iA = nszVar10.A() - 1;
                                    iA2 = nszVar10.A();
                                    iA3 = nszVar10.A();
                                    if (nszVar3 != null) {
                                        nszVar3.I(12);
                                        iA4 = nszVar3.A();
                                    } else {
                                        iA4 = 0;
                                    }
                                    if (nszVar2 != null) {
                                        nszVar2.I(12);
                                        iA5 = nszVar2.A();
                                        if (iA5 > 0) {
                                            iA6 = nszVar2.A() - 1;
                                            nszVar3 = nszVar3;
                                        } else {
                                            nszVar2 = null;
                                        }
                                        iB = iVar.b();
                                        i11 = i47;
                                        String str5 = aVar5.n;
                                        if (iB == -1 && (("audio/raw".equals(str5) || "audio/g711-mlaw".equals(str5) || "audio/g711-alaw".equals(str5)) && iA == 0 && iA4 == 0 && iA5 == 0)) {
                                            int i55 = bVar.a;
                                            long[] jArr16 = new long[i55];
                                            int[] iArr10 = new int[i55];
                                            while (bVar.a()) {
                                                int i56 = bVar.b;
                                                jArr16[i56] = bVar.d;
                                                iArr10[i56] = bVar.c;
                                            }
                                            long j22 = iA3;
                                            int i57 = 8192 / iB;
                                            int iF = 0;
                                            for (int i58 = 0; i58 < i55; i58++) {
                                                iF += jrh0.f(iArr10[i58], i57);
                                            }
                                            long[] jArr17 = new long[iF];
                                            int[] iArr11 = new int[iF];
                                            long[] jArr18 = new long[iF];
                                            int[] iArr12 = new int[iF];
                                            int i59 = 0;
                                            int i60 = 0;
                                            int i61 = 0;
                                            int i62 = 0;
                                            int i63 = 0;
                                            while (i59 < i55) {
                                                int i64 = iArr10[i59];
                                                long j23 = jArr16[i59];
                                                int i65 = i63;
                                                int i66 = i59;
                                                int iMax = i62;
                                                int i67 = i65;
                                                int i68 = i55;
                                                int i69 = i64;
                                                while (i69 > 0) {
                                                    int iMin = Math.min(i57, i69);
                                                    jArr17[i67] = j23;
                                                    int i70 = i57;
                                                    int i71 = iB * iMin;
                                                    iArr11[i67] = i71;
                                                    i61 += i71;
                                                    iMax = Math.max(iMax, i71);
                                                    jArr18[i67] = ((long) i60) * j22;
                                                    iArr12[i67] = 1;
                                                    j23 += (long) iArr11[i67];
                                                    i60 += iMin;
                                                    i69 -= iMin;
                                                    i67++;
                                                    i57 = i70;
                                                }
                                                int i72 = i57;
                                                int i73 = i66 + 1;
                                                i63 = i67;
                                                i55 = i68;
                                                i62 = iMax;
                                                i59 = i73;
                                                i57 = i72;
                                            }
                                            j13 = i61;
                                            i23 = iC;
                                            j12 = j22 * ((long) i60);
                                            iArr2 = iArr11;
                                            jArr6 = jArr18;
                                            jArr7 = jArr17;
                                            iArr3 = iArr12;
                                            i24 = i62;
                                        } else {
                                            jArr3 = new long[iC];
                                            iArr = new int[iC];
                                            jArr4 = new long[iC];
                                            iArrCopyOf = new int[iC];
                                            i12 = iA;
                                            i13 = iA2;
                                            nszVar4 = nszVar2;
                                            i14 = iA4;
                                            iA7 = iA6;
                                            j9 = 0;
                                            j10 = 0;
                                            i15 = 0;
                                            i16 = 0;
                                            iJ = 0;
                                            i17 = 0;
                                            i18 = 0;
                                            eVar = iVar;
                                            i19 = iA5;
                                            iJ2 = iA3;
                                            j11 = 0;
                                            while (true) {
                                                if (i16 >= iC) {
                                                    long[] jArr19 = jArr3;
                                                    i20 = i12;
                                                    i21 = i13;
                                                    iArrCopyOf2 = iArr;
                                                    jArrCopyOf = jArr4;
                                                    jArr5 = jArr19;
                                                    break;
                                                }
                                                zA = true;
                                                while (i17 == 0) {
                                                    zA = bVar.a();
                                                    if (!zA) {
                                                        break;
                                                    }
                                                    int i74 = i12;
                                                    long j24 = bVar.d;
                                                    i17 = bVar.c;
                                                    j10 = j24;
                                                    i12 = i74;
                                                    i13 = i13;
                                                    iC = iC;
                                                }
                                                i25 = iC;
                                                i20 = i12;
                                                i21 = i13;
                                                if (!zA) {
                                                    cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                                    long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i16);
                                                    iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                                    jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                                    jArr5 = jArrCopyOf2;
                                                    iC = i16;
                                                    break;
                                                }
                                                if (nszVar3 != null) {
                                                    iA9 = i18;
                                                    while (iA9 == 0 && i14 > 0) {
                                                        iA9 = nszVar3.A();
                                                        iJ = nszVar3.j();
                                                        i14--;
                                                    }
                                                    i18 = iA9 - 1;
                                                }
                                                jArr3[i16] = j10;
                                                iA8 = eVar.a();
                                                iArr[i16] = iA8;
                                                j11 += (long) iA8;
                                                if (iA8 > i15) {
                                                    i15 = iA8;
                                                }
                                                jArr4[i16] = j9 + ((long) iJ);
                                                if (nszVar4 == null) {
                                                    i26 = 1;
                                                } else {
                                                    i26 = 0;
                                                }
                                                iArrCopyOf[i16] = i26;
                                                if (i16 == iA7) {
                                                    iArrCopyOf[i16] = 1;
                                                    i19--;
                                                    if (i19 > 0) {
                                                        nszVar4.getClass();
                                                        iA7 = nszVar4.A() - 1;
                                                    }
                                                }
                                                j9 += (long) iJ2;
                                                i13 = i21 - 1;
                                                if (i13 == 0 || i20 <= 0) {
                                                    i12 = i20;
                                                } else {
                                                    int iA11 = nszVar10.A();
                                                    iJ2 = nszVar10.j();
                                                    i12 = i20 - 1;
                                                    i13 = iA11;
                                                }
                                                j10 += (long) iArr[i16];
                                                i17--;
                                                i16++;
                                                iA7 = iA7;
                                                jArr3 = jArr3;
                                                iC = i25;
                                            }
                                            int[] iArr13 = iArrCopyOf;
                                            i22 = i17;
                                            long j25 = j9 + ((long) iJ);
                                            if (nszVar3 == null) {
                                                z4 = true;
                                                break;
                                            }
                                            while (true) {
                                                if (i14 <= 0) {
                                                    z4 = true;
                                                    break;
                                                }
                                                if (nszVar3.A() != 0) {
                                                    z4 = false;
                                                    break;
                                                }
                                                nszVar3.j();
                                                i14--;
                                            }
                                            if (i19 == 0 || i21 != 0 || i22 != 0 || i20 != 0 || i18 != 0 || !z4) {
                                                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                                d5d.a(sb, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                                d5d.a(sb, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                                sb.append(i20);
                                                sb.append(", remainingSamplesAtTimestampOffset ");
                                                sb.append(i18);
                                                if (z4) {
                                                    str2 = "";
                                                } else {
                                                    str2 = ", ctts invalid";
                                                }
                                                sb.append(str2);
                                                cft.g("BoxParsers", sb.toString());
                                            }
                                            jArr6 = jArrCopyOf;
                                            i23 = iC;
                                            j12 = j25;
                                            iArr2 = iArrCopyOf2;
                                            j13 = j11;
                                            jArr7 = jArr5;
                                            iArr3 = iArr13;
                                            i24 = i15;
                                        }
                                        j14 = fjg0VarA.f;
                                        if (j14 > 0) {
                                            jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                            if (jV5 > 0 && jV5 < 2147483647L) {
                                                androidx.media3.common.a.C0062a c0062aA3 = aVar5.a();
                                                c0062aA3.h = (int) jV5;
                                                fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA3));
                                            }
                                        }
                                        fjg0VarA2 = fjg0VarA;
                                        j15 = fjg0VarA2.c;
                                        aVar6 = fjg0VarA2.g;
                                        i27 = fjg0VarA2.b;
                                        jArr8 = fjg0VarA2.j;
                                        jArr9 = fjg0VarA2.i;
                                        RoundingMode roundingMode = RoundingMode.DOWN;
                                        jV3 = jrh0.V(j12, 1000000L, j15, roundingMode);
                                        if (jArr9 == null) {
                                            jrh0.U(jArr6, j15);
                                            ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                                        } else {
                                            if (jArr9.length == 1 || i27 != 1 || jArr6.length < 2) {
                                                i28 = i27;
                                            } else {
                                                jArr8.getClass();
                                                long j26 = jArr8[0];
                                                i28 = i27;
                                                long jV6 = j26 + jrh0.V(jArr9[0], fjg0VarA2.c, fjg0VarA2.d, roundingMode);
                                                int length = jArr6.length - 1;
                                                int i75 = jrh0.i(4, 0, length);
                                                int i76 = jrh0.i(jArr6.length - 4, 0, length);
                                                long j27 = jArr6[0];
                                                if (j27 <= j26 && j26 < jArr6[i75] && jArr6[i76] < jV6 && jV6 <= j12) {
                                                    long j28 = j12 - jV6;
                                                    long jV7 = jrh0.V(j26 - j27, aVar6.G, fjg0VarA2.c, roundingMode);
                                                    long jV8 = jrh0.V(j28, aVar6.G, fjg0VarA2.c, roundingMode);
                                                    if ((jV7 != 0 || jV8 != 0) && jV7 <= 2147483647L && jV8 <= 2147483647L) {
                                                        hyjVar.a = (int) jV7;
                                                        hyjVar.b = (int) jV8;
                                                        jrh0.U(jArr6, j15);
                                                        ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(jArr9[0], 1000000L, fjg0VarA2.d, roundingMode));
                                                    }
                                                }
                                                if (jArr9.length != 1) {
                                                    i29 = 1;
                                                } else if (jArr9[0] == 0) {
                                                    jArr8.getClass();
                                                    j20 = jArr8[0];
                                                    for (i46 = 0; i46 < jArr6.length; i46++) {
                                                        jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                                    }
                                                    ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                                } else {
                                                    i29 = 1;
                                                }
                                                if (i28 == i29) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                iArr4 = new int[jArr9.length];
                                                iArr5 = new int[jArr9.length];
                                                jArr8.getClass();
                                                i30 = 0;
                                                i31 = 0;
                                                i32 = 0;
                                                z6 = false;
                                                while (i32 < jArr9.length) {
                                                    iArr9 = iArr5;
                                                    j18 = jArr8[i32];
                                                    if (j18 != -1) {
                                                        i39 = i32;
                                                        boolean z12 = z6;
                                                        long jV9 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                                        iArr4[i39] = jrh0.e(jArr6, j18, true);
                                                        j19 = j18 + jV9;
                                                        iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                                        i40 = iArr4[i39];
                                                        while (true) {
                                                            i41 = iArr4[i39];
                                                            if (i41 >= 0 || (iArr3[i41] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr4[i39] = i41 - 1;
                                                        }
                                                        if (i41 < 0) {
                                                            iArr4[i39] = i40;
                                                            while (true) {
                                                                i45 = iArr4[i39];
                                                                if (i45 < iArr9[i39] || (iArr3[i45] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr4[i39] = i45 + 1;
                                                            }
                                                        }
                                                        if (i28 == 2 && iArr4[i39] != iArr9[i39]) {
                                                            while (true) {
                                                                i43 = iArr9[i39];
                                                                if (i43 >= jArr6.length - 1) {
                                                                    break;
                                                                }
                                                                i44 = i43 + 1;
                                                                if (jArr6[i44] > j19) {
                                                                    break;
                                                                }
                                                                iArr9[i39] = i44;
                                                            }
                                                        }
                                                        int i77 = iArr9[i39];
                                                        i42 = iArr4[i39];
                                                        int i78 = (i77 - i42) + i30;
                                                        if (i31 != i42) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        z6 = z12 | z11;
                                                        i31 = i77;
                                                        i30 = i78;
                                                    } else {
                                                        i39 = i32;
                                                    }
                                                    i32 = i39 + 1;
                                                    iArr5 = iArr9;
                                                    i24 = i24;
                                                }
                                                iArr6 = iArr5;
                                                i33 = i24;
                                                boolean z13 = z6;
                                                if (i30 != i23) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                z8 = z13 | z7;
                                                if (z8) {
                                                    jArr10 = new long[i30];
                                                } else {
                                                    jArr10 = jArr7;
                                                }
                                                if (z8) {
                                                    iArr7 = new int[i30];
                                                } else {
                                                    iArr7 = iArr2;
                                                }
                                                if (z8) {
                                                    i33 = 0;
                                                }
                                                if (z8) {
                                                    iArr8 = new int[i30];
                                                } else {
                                                    iArr8 = iArr3;
                                                }
                                                jArr11 = new long[i30];
                                                i34 = 0;
                                                z9 = false;
                                                i35 = 0;
                                                i36 = i33;
                                                j16 = 0;
                                                while (i34 < jArr9.length) {
                                                    j17 = jArr8[i34];
                                                    jArr12 = jArr11;
                                                    i37 = iArr4[i34];
                                                    z10 = z8;
                                                    i38 = iArr6[i34];
                                                    int i79 = i34;
                                                    if (z10) {
                                                        int i80 = i38 - i37;
                                                        System.arraycopy(jArr7, i37, jArr10, i35, i80);
                                                        System.arraycopy(iArr2, i37, iArr7, i35, i80);
                                                        System.arraycopy(iArr3, i37, iArr8, i35, i80);
                                                    }
                                                    int i81 = i36;
                                                    while (i37 < i38) {
                                                        int i82 = i37;
                                                        int i83 = i38;
                                                        long j29 = fjg0VarA2.d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long jV10 = jrh0.V(j16, 1000000L, j29, roundingMode2);
                                                        jV4 = jrh0.V(jArr6[i82] - j17, 1000000L, fjg0VarA2.c, roundingMode2);
                                                        if (jV4 < 0) {
                                                            z9 = true;
                                                        }
                                                        jArr12[i35] = jV10 + jV4;
                                                        if (!z10 && iArr7[i35] > i81) {
                                                            i81 = iArr2[i82];
                                                        }
                                                        i35++;
                                                        i37 = i82 + 1;
                                                        i38 = i83;
                                                    }
                                                    j16 += jArr9[i79];
                                                    i36 = i81;
                                                    z8 = z10;
                                                    i34 = i79 + 1;
                                                    jArr11 = jArr12;
                                                }
                                                long[] jArr20 = jArr11;
                                                long jV11 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                                if (z9) {
                                                    androidx.media3.common.a.C0062a c0062aA4 = aVar6.a();
                                                    c0062aA4.s = true;
                                                    fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA4));
                                                }
                                                ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr20, iArr8, jV11);
                                            }
                                            if (jArr9.length != 1) {
                                                i29 = 1;
                                            } else if (jArr9[0] == 0) {
                                                jArr8.getClass();
                                                j20 = jArr8[0];
                                                while (i46 < jArr6.length) {
                                                    jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                                }
                                                ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                            } else {
                                                i29 = 1;
                                            }
                                            if (i28 == i29) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            iArr4 = new int[jArr9.length];
                                            iArr5 = new int[jArr9.length];
                                            jArr8.getClass();
                                            i30 = 0;
                                            i31 = 0;
                                            i32 = 0;
                                            z6 = false;
                                            while (i32 < jArr9.length) {
                                                iArr9 = iArr5;
                                                j18 = jArr8[i32];
                                                if (j18 != -1) {
                                                    i39 = i32;
                                                    boolean z14 = z6;
                                                    long jV12 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                                    iArr4[i39] = jrh0.e(jArr6, j18, true);
                                                    j19 = j18 + jV12;
                                                    iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                                    i40 = iArr4[i39];
                                                    while (true) {
                                                        i41 = iArr4[i39];
                                                        if (i41 >= 0) {
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr4[i39] = i41 - 1;
                                                    }
                                                    if (i41 < 0) {
                                                        iArr4[i39] = i40;
                                                        while (true) {
                                                            i45 = iArr4[i39];
                                                            if (i45 < iArr9[i39]) {
                                                                break;
                                                            }
                                                            break;
                                                            break;
                                                            iArr4[i39] = i45 + 1;
                                                        }
                                                    }
                                                    if (i28 == 2) {
                                                        while (true) {
                                                            i43 = iArr9[i39];
                                                            if (i43 >= jArr6.length - 1) {
                                                                break;
                                                                break;
                                                            }
                                                            i44 = i43 + 1;
                                                            if (jArr6[i44] > j19) {
                                                                break;
                                                                break;
                                                            }
                                                            iArr9[i39] = i44;
                                                        }
                                                    }
                                                    int i710 = iArr9[i39];
                                                    i42 = iArr4[i39];
                                                    int i711 = (i710 - i42) + i30;
                                                    if (i31 != i42) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    z6 = z14 | z11;
                                                    i31 = i710;
                                                    i30 = i711;
                                                } else {
                                                    i39 = i32;
                                                }
                                                i32 = i39 + 1;
                                                iArr5 = iArr9;
                                                i24 = i24;
                                            }
                                            iArr6 = iArr5;
                                            i33 = i24;
                                            boolean z15 = z6;
                                            if (i30 != i23) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            z8 = z15 | z7;
                                            if (z8) {
                                                jArr10 = new long[i30];
                                            } else {
                                                jArr10 = jArr7;
                                            }
                                            if (z8) {
                                                iArr7 = new int[i30];
                                            } else {
                                                iArr7 = iArr2;
                                            }
                                            if (z8) {
                                                i33 = 0;
                                            }
                                            if (z8) {
                                                iArr8 = new int[i30];
                                            } else {
                                                iArr8 = iArr3;
                                            }
                                            jArr11 = new long[i30];
                                            i34 = 0;
                                            z9 = false;
                                            i35 = 0;
                                            i36 = i33;
                                            j16 = 0;
                                            while (i34 < jArr9.length) {
                                                j17 = jArr8[i34];
                                                jArr12 = jArr11;
                                                i37 = iArr4[i34];
                                                z10 = z8;
                                                i38 = iArr6[i34];
                                                int i712 = i34;
                                                if (z10) {
                                                    int i84 = i38 - i37;
                                                    System.arraycopy(jArr7, i37, jArr10, i35, i84);
                                                    System.arraycopy(iArr2, i37, iArr7, i35, i84);
                                                    System.arraycopy(iArr3, i37, iArr8, i35, i84);
                                                }
                                                int i85 = i36;
                                                while (i37 < i38) {
                                                    int i86 = i37;
                                                    int i87 = i38;
                                                    long j210 = fjg0VarA2.d;
                                                    RoundingMode roundingMode3 = RoundingMode.DOWN;
                                                    long jV13 = jrh0.V(j16, 1000000L, j210, roundingMode3);
                                                    jV4 = jrh0.V(jArr6[i86] - j17, 1000000L, fjg0VarA2.c, roundingMode3);
                                                    if (jV4 < 0) {
                                                        z9 = true;
                                                    }
                                                    jArr12[i35] = jV13 + jV4;
                                                    if (!z10) {
                                                    }
                                                    i35++;
                                                    i37 = i86 + 1;
                                                    i38 = i87;
                                                }
                                                j16 += jArr9[i712];
                                                i36 = i85;
                                                z8 = z10;
                                                i34 = i712 + 1;
                                                jArr11 = jArr12;
                                            }
                                            long[] jArr21 = jArr11;
                                            long jV14 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                            if (z9) {
                                                androidx.media3.common.a.C0062a c0062aA5 = aVar6.a();
                                                c0062aA5.s = true;
                                                fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA5));
                                            }
                                            ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr21, iArr8, jV14);
                                        }
                                    } else {
                                        iA5 = 0;
                                    }
                                    iA6 = -1;
                                    iB = iVar.b();
                                    i11 = i47;
                                    String str6 = aVar5.n;
                                    if (iB == -1) {
                                        jArr3 = new long[iC];
                                        iArr = new int[iC];
                                        jArr4 = new long[iC];
                                        iArrCopyOf = new int[iC];
                                        i12 = iA;
                                        i13 = iA2;
                                        nszVar4 = nszVar2;
                                        i14 = iA4;
                                        iA7 = iA6;
                                        j9 = 0;
                                        j10 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        iJ = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        eVar = iVar;
                                        i19 = iA5;
                                        iJ2 = iA3;
                                        j11 = 0;
                                        while (true) {
                                            if (i16 >= iC) {
                                                long[] jArr110 = jArr3;
                                                i20 = i12;
                                                i21 = i13;
                                                iArrCopyOf2 = iArr;
                                                jArrCopyOf = jArr4;
                                                jArr5 = jArr110;
                                                break;
                                            }
                                            zA = true;
                                            while (i17 == 0) {
                                                zA = bVar.a();
                                                if (!zA) {
                                                    break;
                                                    break;
                                                }
                                                int i713 = i12;
                                                long j211 = bVar.d;
                                                i17 = bVar.c;
                                                j10 = j211;
                                                i12 = i713;
                                                i13 = i13;
                                                iC = iC;
                                            }
                                            i25 = iC;
                                            i20 = i12;
                                            i21 = i13;
                                            if (!zA) {
                                                cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                                long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i16);
                                                iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                                jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                                jArr5 = jArrCopyOf3;
                                                iC = i16;
                                                break;
                                            }
                                            if (nszVar3 != null) {
                                                iA9 = i18;
                                                while (iA9 == 0) {
                                                    iA9 = nszVar3.A();
                                                    iJ = nszVar3.j();
                                                    i14--;
                                                }
                                                i18 = iA9 - 1;
                                            }
                                            jArr3[i16] = j10;
                                            iA8 = eVar.a();
                                            iArr[i16] = iA8;
                                            j11 += (long) iA8;
                                            if (iA8 > i15) {
                                                i15 = iA8;
                                            }
                                            jArr4[i16] = j9 + ((long) iJ);
                                            if (nszVar4 == null) {
                                                i26 = 1;
                                            } else {
                                                i26 = 0;
                                            }
                                            iArrCopyOf[i16] = i26;
                                            if (i16 == iA7) {
                                                iArrCopyOf[i16] = 1;
                                                i19--;
                                                if (i19 > 0) {
                                                    nszVar4.getClass();
                                                    iA7 = nszVar4.A() - 1;
                                                }
                                            }
                                            j9 += (long) iJ2;
                                            i13 = i21 - 1;
                                            if (i13 == 0) {
                                                i12 = i20;
                                            } else {
                                                i12 = i20;
                                            }
                                            j10 += (long) iArr[i16];
                                            i17--;
                                            i16++;
                                            iA7 = iA7;
                                            jArr3 = jArr3;
                                            iC = i25;
                                        }
                                        int[] iArr14 = iArrCopyOf;
                                        i22 = i17;
                                        long j212 = j9 + ((long) iJ);
                                        if (nszVar3 == null) {
                                            z4 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i14 <= 0) {
                                                z4 = true;
                                                break;
                                            }
                                            if (nszVar3.A() != 0) {
                                                z4 = false;
                                                break;
                                            }
                                            nszVar3.j();
                                            i14--;
                                        }
                                        if (i19 == 0) {
                                            StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb2, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb2, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb2.append(i20);
                                            sb2.append(", remainingSamplesAtTimestampOffset ");
                                            sb2.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            cft.g("BoxParsers", sb2.toString());
                                        } else {
                                            StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb3, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb3, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb3.append(i20);
                                            sb3.append(", remainingSamplesAtTimestampOffset ");
                                            sb3.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb3.append(str2);
                                            cft.g("BoxParsers", sb3.toString());
                                        }
                                        jArr6 = jArrCopyOf;
                                        i23 = iC;
                                        j12 = j212;
                                        iArr2 = iArrCopyOf2;
                                        j13 = j11;
                                        jArr7 = jArr5;
                                        iArr3 = iArr14;
                                        i24 = i15;
                                    } else {
                                        jArr3 = new long[iC];
                                        iArr = new int[iC];
                                        jArr4 = new long[iC];
                                        iArrCopyOf = new int[iC];
                                        i12 = iA;
                                        i13 = iA2;
                                        nszVar4 = nszVar2;
                                        i14 = iA4;
                                        iA7 = iA6;
                                        j9 = 0;
                                        j10 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        iJ = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        eVar = iVar;
                                        i19 = iA5;
                                        iJ2 = iA3;
                                        j11 = 0;
                                        while (true) {
                                            if (i16 >= iC) {
                                                long[] jArr111 = jArr3;
                                                i20 = i12;
                                                i21 = i13;
                                                iArrCopyOf2 = iArr;
                                                jArrCopyOf = jArr4;
                                                jArr5 = jArr111;
                                                break;
                                            }
                                            zA = true;
                                            while (i17 == 0) {
                                                zA = bVar.a();
                                                if (!zA) {
                                                    break;
                                                    break;
                                                }
                                                int i714 = i12;
                                                long j213 = bVar.d;
                                                i17 = bVar.c;
                                                j10 = j213;
                                                i12 = i714;
                                                i13 = i13;
                                                iC = iC;
                                            }
                                            i25 = iC;
                                            i20 = i12;
                                            i21 = i13;
                                            if (!zA) {
                                                cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                                long[] jArrCopyOf4 = Arrays.copyOf(jArr3, i16);
                                                iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                                jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                                jArr5 = jArrCopyOf4;
                                                iC = i16;
                                                break;
                                            }
                                            if (nszVar3 != null) {
                                                iA9 = i18;
                                                while (iA9 == 0) {
                                                    iA9 = nszVar3.A();
                                                    iJ = nszVar3.j();
                                                    i14--;
                                                }
                                                i18 = iA9 - 1;
                                            }
                                            jArr3[i16] = j10;
                                            iA8 = eVar.a();
                                            iArr[i16] = iA8;
                                            j11 += (long) iA8;
                                            if (iA8 > i15) {
                                                i15 = iA8;
                                            }
                                            jArr4[i16] = j9 + ((long) iJ);
                                            if (nszVar4 == null) {
                                                i26 = 1;
                                            } else {
                                                i26 = 0;
                                            }
                                            iArrCopyOf[i16] = i26;
                                            if (i16 == iA7) {
                                                iArrCopyOf[i16] = 1;
                                                i19--;
                                                if (i19 > 0) {
                                                    nszVar4.getClass();
                                                    iA7 = nszVar4.A() - 1;
                                                }
                                            }
                                            j9 += (long) iJ2;
                                            i13 = i21 - 1;
                                            if (i13 == 0) {
                                                i12 = i20;
                                            } else {
                                                i12 = i20;
                                            }
                                            j10 += (long) iArr[i16];
                                            i17--;
                                            i16++;
                                            iA7 = iA7;
                                            jArr3 = jArr3;
                                            iC = i25;
                                        }
                                        int[] iArr15 = iArrCopyOf;
                                        i22 = i17;
                                        long j214 = j9 + ((long) iJ);
                                        if (nszVar3 == null) {
                                            z4 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i14 <= 0) {
                                                z4 = true;
                                                break;
                                            }
                                            if (nszVar3.A() != 0) {
                                                z4 = false;
                                                break;
                                            }
                                            nszVar3.j();
                                            i14--;
                                        }
                                        if (i19 == 0) {
                                            StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb4, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb4, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb4.append(i20);
                                            sb4.append(", remainingSamplesAtTimestampOffset ");
                                            sb4.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb4.append(str2);
                                            cft.g("BoxParsers", sb4.toString());
                                        } else {
                                            StringBuilder sb5 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb5, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb5, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb5.append(i20);
                                            sb5.append(", remainingSamplesAtTimestampOffset ");
                                            sb5.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb5.append(str2);
                                            cft.g("BoxParsers", sb5.toString());
                                        }
                                        jArr6 = jArrCopyOf;
                                        i23 = iC;
                                        j12 = j214;
                                        iArr2 = iArrCopyOf2;
                                        j13 = j11;
                                        jArr7 = jArr5;
                                        iArr3 = iArr15;
                                        i24 = i15;
                                    }
                                    j14 = fjg0VarA.f;
                                    if (j14 > 0) {
                                        jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                        if (jV5 > 0) {
                                            androidx.media3.common.a.C0062a c0062aA6 = aVar5.a();
                                            c0062aA6.h = (int) jV5;
                                            fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA6));
                                        }
                                    }
                                    fjg0VarA2 = fjg0VarA;
                                    j15 = fjg0VarA2.c;
                                    aVar6 = fjg0VarA2.g;
                                    i27 = fjg0VarA2.b;
                                    jArr8 = fjg0VarA2.j;
                                    jArr9 = fjg0VarA2.i;
                                    RoundingMode roundingMode4 = RoundingMode.DOWN;
                                    jV3 = jrh0.V(j12, 1000000L, j15, roundingMode4);
                                    if (jArr9 == null) {
                                        jrh0.U(jArr6, j15);
                                        ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                                    } else {
                                        if (jArr9.length == 1) {
                                            i28 = i27;
                                        } else {
                                            i28 = i27;
                                        }
                                        if (jArr9.length != 1) {
                                            i29 = 1;
                                        } else if (jArr9[0] == 0) {
                                            jArr8.getClass();
                                            j20 = jArr8[0];
                                            while (i46 < jArr6.length) {
                                                jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                            }
                                            ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                        } else {
                                            i29 = 1;
                                        }
                                        if (i28 == i29) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        iArr4 = new int[jArr9.length];
                                        iArr5 = new int[jArr9.length];
                                        jArr8.getClass();
                                        i30 = 0;
                                        i31 = 0;
                                        i32 = 0;
                                        z6 = false;
                                        while (i32 < jArr9.length) {
                                            iArr9 = iArr5;
                                            j18 = jArr8[i32];
                                            if (j18 != -1) {
                                                i39 = i32;
                                                boolean z16 = z6;
                                                long jV15 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                                iArr4[i39] = jrh0.e(jArr6, j18, true);
                                                j19 = j18 + jV15;
                                                iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                                i40 = iArr4[i39];
                                                while (true) {
                                                    i41 = iArr4[i39];
                                                    if (i41 >= 0) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr4[i39] = i41 - 1;
                                                }
                                                if (i41 < 0) {
                                                    iArr4[i39] = i40;
                                                    while (true) {
                                                        i45 = iArr4[i39];
                                                        if (i45 < iArr9[i39]) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr4[i39] = i45 + 1;
                                                    }
                                                }
                                                if (i28 == 2) {
                                                    while (true) {
                                                        i43 = iArr9[i39];
                                                        if (i43 >= jArr6.length - 1) {
                                                            break;
                                                            break;
                                                        }
                                                        i44 = i43 + 1;
                                                        if (jArr6[i44] > j19) {
                                                            break;
                                                            break;
                                                        }
                                                        iArr9[i39] = i44;
                                                    }
                                                }
                                                int i715 = iArr9[i39];
                                                i42 = iArr4[i39];
                                                int i716 = (i715 - i42) + i30;
                                                if (i31 != i42) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                z6 = z16 | z11;
                                                i31 = i715;
                                                i30 = i716;
                                            } else {
                                                i39 = i32;
                                            }
                                            i32 = i39 + 1;
                                            iArr5 = iArr9;
                                            i24 = i24;
                                        }
                                        iArr6 = iArr5;
                                        i33 = i24;
                                        boolean z17 = z6;
                                        if (i30 != i23) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        z8 = z17 | z7;
                                        if (z8) {
                                            jArr10 = new long[i30];
                                        } else {
                                            jArr10 = jArr7;
                                        }
                                        if (z8) {
                                            iArr7 = new int[i30];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        if (z8) {
                                            i33 = 0;
                                        }
                                        if (z8) {
                                            iArr8 = new int[i30];
                                        } else {
                                            iArr8 = iArr3;
                                        }
                                        jArr11 = new long[i30];
                                        i34 = 0;
                                        z9 = false;
                                        i35 = 0;
                                        i36 = i33;
                                        j16 = 0;
                                        while (i34 < jArr9.length) {
                                            j17 = jArr8[i34];
                                            jArr12 = jArr11;
                                            i37 = iArr4[i34];
                                            z10 = z8;
                                            i38 = iArr6[i34];
                                            int i717 = i34;
                                            if (z10) {
                                                int i88 = i38 - i37;
                                                System.arraycopy(jArr7, i37, jArr10, i35, i88);
                                                System.arraycopy(iArr2, i37, iArr7, i35, i88);
                                                System.arraycopy(iArr3, i37, iArr8, i35, i88);
                                            }
                                            int i89 = i36;
                                            while (i37 < i38) {
                                                int i810 = i37;
                                                int i811 = i38;
                                                long j215 = fjg0VarA2.d;
                                                RoundingMode roundingMode5 = RoundingMode.DOWN;
                                                long jV16 = jrh0.V(j16, 1000000L, j215, roundingMode5);
                                                jV4 = jrh0.V(jArr6[i810] - j17, 1000000L, fjg0VarA2.c, roundingMode5);
                                                if (jV4 < 0) {
                                                    z9 = true;
                                                }
                                                jArr12[i35] = jV16 + jV4;
                                                if (!z10) {
                                                }
                                                i35++;
                                                i37 = i810 + 1;
                                                i38 = i811;
                                            }
                                            j16 += jArr9[i717];
                                            i36 = i89;
                                            z8 = z10;
                                            i34 = i717 + 1;
                                            jArr11 = jArr12;
                                        }
                                        long[] jArr22 = jArr11;
                                        long jV17 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                        if (z9) {
                                            androidx.media3.common.a.C0062a c0062aA7 = aVar6.a();
                                            c0062aA7.s = true;
                                            fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA7));
                                        }
                                        ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr22, iArr8, jV17);
                                    }
                                }
                                arrayList3.add(ojg0Var);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        aVar2 = gVarI.b;
                        if (aVar2 != null) {
                            i10 = jVar.b;
                            if (i10 != 0) {
                                b8wVar = new b8w(i10);
                                androidx.media3.common.a.C0062a c0062aA8 = aVar2.a();
                                uovVar = gVarI.b.l;
                                if (uovVar != null) {
                                    uovVar2 = uovVar.a(b8wVar);
                                } else {
                                    uovVar2 = new uov(b8wVar);
                                }
                                c0062aA8.k = uovVar2;
                                aVar3 = new androidx.media3.common.a(c0062aA8);
                            } else {
                                aVar3 = aVar2;
                            }
                            fjg0Var = new fjg0(jVar.a, i9, jY, j6, jV2, j7, aVar3, gVarI.d, gVarI.a, gVarI.c, jArr, jArr2);
                        }
                        fjg0VarA = (fjg0) bajVar.apply(fjg0Var);
                        if (fjg0VarA == null) {
                            arrayList = arrayList2;
                            arrayList3 = arrayList3;
                            i11 = i47;
                        } else {
                            aVar4 = fjg0VarA.g;
                            c8w.a aVarB8 = aVar8.b(1835297121);
                            aVarB8.getClass();
                            c8w.a aVarB9 = aVarB8.b(1835626086);
                            aVarB9.getClass();
                            aVarB2 = aVarB9.b(1937007212);
                            aVarB2.getClass();
                            bVarC2 = aVarB2.c(1937011578);
                            if (bVarC2 != null) {
                                iVar = new h(bVarC2, aVar4);
                            } else {
                                bVarC3 = aVarB2.c(1937013298);
                                if (bVarC3 != null) {
                                    throw ssz.a(null, "Track has no sample table size information");
                                }
                                iVar = new i(bVarC3);
                            }
                            iC = iVar.c();
                            if (iC == 0) {
                                i11 = i47;
                                ojg0Var = new ojg0(fjg0VarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                arrayList = arrayList2;
                            } else {
                                if (fjg0VarA.b == 2) {
                                    j21 = fjg0VarA.f;
                                    if (j21 > 0) {
                                        androidx.media3.common.a.C0062a c0062aA9 = aVar4.a();
                                        c0062aA9.x = iC / (j21 / 1000000.0f);
                                        fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA9));
                                    }
                                }
                                aVar5 = fjg0VarA.g;
                                bVarC4 = aVarB2.c(1937007471);
                                if (bVarC4 == null) {
                                    bVarC4 = aVarB2.c(1668232756);
                                    bVarC4.getClass();
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                nsz nszVar11 = bVarC4.b;
                                c8w.b bVarC14 = aVarB2.c(1937011555);
                                bVarC14.getClass();
                                nsz nszVar12 = bVarC14.b;
                                c8w.b bVarC15 = aVarB2.c(1937011827);
                                bVarC15.getClass();
                                nsz nszVar13 = bVarC15.b;
                                bVarC5 = aVarB2.c(1937011571);
                                if (bVarC5 != null) {
                                    nszVar2 = bVarC5.b;
                                } else {
                                    nszVar2 = null;
                                }
                                arrayList = arrayList2;
                                bVarC6 = aVarB2.c(1668576371);
                                if (bVarC6 != null) {
                                    nszVar3 = bVarC6.b;
                                } else {
                                    nszVar3 = null;
                                }
                                bVar = new b(nszVar12, nszVar11, z3);
                                nszVar13.I(12);
                                iA = nszVar13.A() - 1;
                                iA2 = nszVar13.A();
                                iA3 = nszVar13.A();
                                if (nszVar3 != null) {
                                    nszVar3.I(12);
                                    iA4 = nszVar3.A();
                                } else {
                                    iA4 = 0;
                                }
                                if (nszVar2 != null) {
                                    nszVar2.I(12);
                                    iA5 = nszVar2.A();
                                    if (iA5 > 0) {
                                        iA6 = nszVar2.A() - 1;
                                        nszVar3 = nszVar3;
                                    } else {
                                        nszVar2 = null;
                                    }
                                    iB = iVar.b();
                                    i11 = i47;
                                    String str7 = aVar5.n;
                                    if (iB == -1) {
                                        jArr3 = new long[iC];
                                        iArr = new int[iC];
                                        jArr4 = new long[iC];
                                        iArrCopyOf = new int[iC];
                                        i12 = iA;
                                        i13 = iA2;
                                        nszVar4 = nszVar2;
                                        i14 = iA4;
                                        iA7 = iA6;
                                        j9 = 0;
                                        j10 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        iJ = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        eVar = iVar;
                                        i19 = iA5;
                                        iJ2 = iA3;
                                        j11 = 0;
                                        while (true) {
                                            if (i16 >= iC) {
                                                long[] jArr112 = jArr3;
                                                i20 = i12;
                                                i21 = i13;
                                                iArrCopyOf2 = iArr;
                                                jArrCopyOf = jArr4;
                                                jArr5 = jArr112;
                                                break;
                                            }
                                            zA = true;
                                            while (i17 == 0) {
                                                zA = bVar.a();
                                                if (!zA) {
                                                    break;
                                                    break;
                                                }
                                                int i718 = i12;
                                                long j216 = bVar.d;
                                                i17 = bVar.c;
                                                j10 = j216;
                                                i12 = i718;
                                                i13 = i13;
                                                iC = iC;
                                            }
                                            i25 = iC;
                                            i20 = i12;
                                            i21 = i13;
                                            if (!zA) {
                                                cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                                long[] jArrCopyOf5 = Arrays.copyOf(jArr3, i16);
                                                iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                                jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                                jArr5 = jArrCopyOf5;
                                                iC = i16;
                                                break;
                                            }
                                            if (nszVar3 != null) {
                                                iA9 = i18;
                                                while (iA9 == 0) {
                                                    iA9 = nszVar3.A();
                                                    iJ = nszVar3.j();
                                                    i14--;
                                                }
                                                i18 = iA9 - 1;
                                            }
                                            jArr3[i16] = j10;
                                            iA8 = eVar.a();
                                            iArr[i16] = iA8;
                                            j11 += (long) iA8;
                                            if (iA8 > i15) {
                                                i15 = iA8;
                                            }
                                            jArr4[i16] = j9 + ((long) iJ);
                                            if (nszVar4 == null) {
                                                i26 = 1;
                                            } else {
                                                i26 = 0;
                                            }
                                            iArrCopyOf[i16] = i26;
                                            if (i16 == iA7) {
                                                iArrCopyOf[i16] = 1;
                                                i19--;
                                                if (i19 > 0) {
                                                    nszVar4.getClass();
                                                    iA7 = nszVar4.A() - 1;
                                                }
                                            }
                                            j9 += (long) iJ2;
                                            i13 = i21 - 1;
                                            if (i13 == 0) {
                                                i12 = i20;
                                            } else {
                                                i12 = i20;
                                            }
                                            j10 += (long) iArr[i16];
                                            i17--;
                                            i16++;
                                            iA7 = iA7;
                                            jArr3 = jArr3;
                                            iC = i25;
                                        }
                                        int[] iArr16 = iArrCopyOf;
                                        i22 = i17;
                                        long j217 = j9 + ((long) iJ);
                                        if (nszVar3 == null) {
                                            z4 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i14 <= 0) {
                                                z4 = true;
                                                break;
                                            }
                                            if (nszVar3.A() != 0) {
                                                z4 = false;
                                                break;
                                            }
                                            nszVar3.j();
                                            i14--;
                                        }
                                        if (i19 == 0) {
                                            StringBuilder sb6 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb6, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb6, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb6.append(i20);
                                            sb6.append(", remainingSamplesAtTimestampOffset ");
                                            sb6.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb6.append(str2);
                                            cft.g("BoxParsers", sb6.toString());
                                        } else {
                                            StringBuilder sb7 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb7, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb7, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb7.append(i20);
                                            sb7.append(", remainingSamplesAtTimestampOffset ");
                                            sb7.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb7.append(str2);
                                            cft.g("BoxParsers", sb7.toString());
                                        }
                                        jArr6 = jArrCopyOf;
                                        i23 = iC;
                                        j12 = j217;
                                        iArr2 = iArrCopyOf2;
                                        j13 = j11;
                                        jArr7 = jArr5;
                                        iArr3 = iArr16;
                                        i24 = i15;
                                    } else {
                                        jArr3 = new long[iC];
                                        iArr = new int[iC];
                                        jArr4 = new long[iC];
                                        iArrCopyOf = new int[iC];
                                        i12 = iA;
                                        i13 = iA2;
                                        nszVar4 = nszVar2;
                                        i14 = iA4;
                                        iA7 = iA6;
                                        j9 = 0;
                                        j10 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        iJ = 0;
                                        i17 = 0;
                                        i18 = 0;
                                        eVar = iVar;
                                        i19 = iA5;
                                        iJ2 = iA3;
                                        j11 = 0;
                                        while (true) {
                                            if (i16 >= iC) {
                                                long[] jArr113 = jArr3;
                                                i20 = i12;
                                                i21 = i13;
                                                iArrCopyOf2 = iArr;
                                                jArrCopyOf = jArr4;
                                                jArr5 = jArr113;
                                                break;
                                            }
                                            zA = true;
                                            while (i17 == 0) {
                                                zA = bVar.a();
                                                if (!zA) {
                                                    break;
                                                    break;
                                                }
                                                int i719 = i12;
                                                long j218 = bVar.d;
                                                i17 = bVar.c;
                                                j10 = j218;
                                                i12 = i719;
                                                i13 = i13;
                                                iC = iC;
                                            }
                                            i25 = iC;
                                            i20 = i12;
                                            i21 = i13;
                                            if (!zA) {
                                                cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                                long[] jArrCopyOf6 = Arrays.copyOf(jArr3, i16);
                                                iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                                jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                                jArr5 = jArrCopyOf6;
                                                iC = i16;
                                                break;
                                            }
                                            if (nszVar3 != null) {
                                                iA9 = i18;
                                                while (iA9 == 0) {
                                                    iA9 = nszVar3.A();
                                                    iJ = nszVar3.j();
                                                    i14--;
                                                }
                                                i18 = iA9 - 1;
                                            }
                                            jArr3[i16] = j10;
                                            iA8 = eVar.a();
                                            iArr[i16] = iA8;
                                            j11 += (long) iA8;
                                            if (iA8 > i15) {
                                                i15 = iA8;
                                            }
                                            jArr4[i16] = j9 + ((long) iJ);
                                            if (nszVar4 == null) {
                                                i26 = 1;
                                            } else {
                                                i26 = 0;
                                            }
                                            iArrCopyOf[i16] = i26;
                                            if (i16 == iA7) {
                                                iArrCopyOf[i16] = 1;
                                                i19--;
                                                if (i19 > 0) {
                                                    nszVar4.getClass();
                                                    iA7 = nszVar4.A() - 1;
                                                }
                                            }
                                            j9 += (long) iJ2;
                                            i13 = i21 - 1;
                                            if (i13 == 0) {
                                                i12 = i20;
                                            } else {
                                                i12 = i20;
                                            }
                                            j10 += (long) iArr[i16];
                                            i17--;
                                            i16++;
                                            iA7 = iA7;
                                            jArr3 = jArr3;
                                            iC = i25;
                                        }
                                        int[] iArr17 = iArrCopyOf;
                                        i22 = i17;
                                        long j219 = j9 + ((long) iJ);
                                        if (nszVar3 == null) {
                                            z4 = true;
                                            break;
                                        }
                                        while (true) {
                                            if (i14 <= 0) {
                                                z4 = true;
                                                break;
                                            }
                                            if (nszVar3.A() != 0) {
                                                z4 = false;
                                                break;
                                            }
                                            nszVar3.j();
                                            i14--;
                                        }
                                        if (i19 == 0) {
                                            StringBuilder sb8 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb8, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb8, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb8.append(i20);
                                            sb8.append(", remainingSamplesAtTimestampOffset ");
                                            sb8.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb8.append(str2);
                                            cft.g("BoxParsers", sb8.toString());
                                        } else {
                                            StringBuilder sb9 = new StringBuilder("Inconsistent stbl box for track ");
                                            d5d.a(sb9, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                            d5d.a(sb9, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                            sb9.append(i20);
                                            sb9.append(", remainingSamplesAtTimestampOffset ");
                                            sb9.append(i18);
                                            if (z4) {
                                                str2 = ", ctts invalid";
                                            } else {
                                                str2 = "";
                                            }
                                            sb9.append(str2);
                                            cft.g("BoxParsers", sb9.toString());
                                        }
                                        jArr6 = jArrCopyOf;
                                        i23 = iC;
                                        j12 = j219;
                                        iArr2 = iArrCopyOf2;
                                        j13 = j11;
                                        jArr7 = jArr5;
                                        iArr3 = iArr17;
                                        i24 = i15;
                                    }
                                    j14 = fjg0VarA.f;
                                    if (j14 > 0) {
                                        jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                        if (jV5 > 0) {
                                            androidx.media3.common.a.C0062a c0062aA10 = aVar5.a();
                                            c0062aA10.h = (int) jV5;
                                            fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA10));
                                        }
                                    }
                                    fjg0VarA2 = fjg0VarA;
                                    j15 = fjg0VarA2.c;
                                    aVar6 = fjg0VarA2.g;
                                    i27 = fjg0VarA2.b;
                                    jArr8 = fjg0VarA2.j;
                                    jArr9 = fjg0VarA2.i;
                                    RoundingMode roundingMode6 = RoundingMode.DOWN;
                                    jV3 = jrh0.V(j12, 1000000L, j15, roundingMode6);
                                    if (jArr9 == null) {
                                        jrh0.U(jArr6, j15);
                                        ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                                    } else {
                                        if (jArr9.length == 1) {
                                            i28 = i27;
                                        } else {
                                            i28 = i27;
                                        }
                                        if (jArr9.length != 1) {
                                            i29 = 1;
                                        } else if (jArr9[0] == 0) {
                                            jArr8.getClass();
                                            j20 = jArr8[0];
                                            while (i46 < jArr6.length) {
                                                jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                            }
                                            ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                        } else {
                                            i29 = 1;
                                        }
                                        if (i28 == i29) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        iArr4 = new int[jArr9.length];
                                        iArr5 = new int[jArr9.length];
                                        jArr8.getClass();
                                        i30 = 0;
                                        i31 = 0;
                                        i32 = 0;
                                        z6 = false;
                                        while (i32 < jArr9.length) {
                                            iArr9 = iArr5;
                                            j18 = jArr8[i32];
                                            if (j18 != -1) {
                                                i39 = i32;
                                                boolean z18 = z6;
                                                long jV18 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                                iArr4[i39] = jrh0.e(jArr6, j18, true);
                                                j19 = j18 + jV18;
                                                iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                                i40 = iArr4[i39];
                                                while (true) {
                                                    i41 = iArr4[i39];
                                                    if (i41 >= 0) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr4[i39] = i41 - 1;
                                                }
                                                if (i41 < 0) {
                                                    iArr4[i39] = i40;
                                                    while (true) {
                                                        i45 = iArr4[i39];
                                                        if (i45 < iArr9[i39]) {
                                                            break;
                                                            break;
                                                        }
                                                        break;
                                                        break;
                                                        iArr4[i39] = i45 + 1;
                                                    }
                                                }
                                                if (i28 == 2) {
                                                    while (true) {
                                                        i43 = iArr9[i39];
                                                        if (i43 >= jArr6.length - 1) {
                                                            break;
                                                            break;
                                                        }
                                                        i44 = i43 + 1;
                                                        if (jArr6[i44] > j19) {
                                                            break;
                                                            break;
                                                        }
                                                        iArr9[i39] = i44;
                                                    }
                                                }
                                                int i7110 = iArr9[i39];
                                                i42 = iArr4[i39];
                                                int i7111 = (i7110 - i42) + i30;
                                                if (i31 != i42) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                z6 = z18 | z11;
                                                i31 = i7110;
                                                i30 = i7111;
                                            } else {
                                                i39 = i32;
                                            }
                                            i32 = i39 + 1;
                                            iArr5 = iArr9;
                                            i24 = i24;
                                        }
                                        iArr6 = iArr5;
                                        i33 = i24;
                                        boolean z19 = z6;
                                        if (i30 != i23) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        z8 = z19 | z7;
                                        if (z8) {
                                            jArr10 = new long[i30];
                                        } else {
                                            jArr10 = jArr7;
                                        }
                                        if (z8) {
                                            iArr7 = new int[i30];
                                        } else {
                                            iArr7 = iArr2;
                                        }
                                        if (z8) {
                                            i33 = 0;
                                        }
                                        if (z8) {
                                            iArr8 = new int[i30];
                                        } else {
                                            iArr8 = iArr3;
                                        }
                                        jArr11 = new long[i30];
                                        i34 = 0;
                                        z9 = false;
                                        i35 = 0;
                                        i36 = i33;
                                        j16 = 0;
                                        while (i34 < jArr9.length) {
                                            j17 = jArr8[i34];
                                            jArr12 = jArr11;
                                            i37 = iArr4[i34];
                                            z10 = z8;
                                            i38 = iArr6[i34];
                                            int i7112 = i34;
                                            if (z10) {
                                                int i812 = i38 - i37;
                                                System.arraycopy(jArr7, i37, jArr10, i35, i812);
                                                System.arraycopy(iArr2, i37, iArr7, i35, i812);
                                                System.arraycopy(iArr3, i37, iArr8, i35, i812);
                                            }
                                            int i813 = i36;
                                            while (i37 < i38) {
                                                int i814 = i37;
                                                int i815 = i38;
                                                long j2110 = fjg0VarA2.d;
                                                RoundingMode roundingMode7 = RoundingMode.DOWN;
                                                long jV19 = jrh0.V(j16, 1000000L, j2110, roundingMode7);
                                                jV4 = jrh0.V(jArr6[i814] - j17, 1000000L, fjg0VarA2.c, roundingMode7);
                                                if (jV4 < 0) {
                                                    z9 = true;
                                                }
                                                jArr12[i35] = jV19 + jV4;
                                                if (!z10) {
                                                }
                                                i35++;
                                                i37 = i814 + 1;
                                                i38 = i815;
                                            }
                                            j16 += jArr9[i7112];
                                            i36 = i813;
                                            z8 = z10;
                                            i34 = i7112 + 1;
                                            jArr11 = jArr12;
                                        }
                                        long[] jArr23 = jArr11;
                                        long jV110 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                        if (z9) {
                                            androidx.media3.common.a.C0062a c0062aA11 = aVar6.a();
                                            c0062aA11.s = true;
                                            fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA11));
                                        }
                                        ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr23, iArr8, jV110);
                                    }
                                } else {
                                    iA5 = 0;
                                }
                                iA6 = -1;
                                iB = iVar.b();
                                i11 = i47;
                                String str8 = aVar5.n;
                                if (iB == -1) {
                                    jArr3 = new long[iC];
                                    iArr = new int[iC];
                                    jArr4 = new long[iC];
                                    iArrCopyOf = new int[iC];
                                    i12 = iA;
                                    i13 = iA2;
                                    nszVar4 = nszVar2;
                                    i14 = iA4;
                                    iA7 = iA6;
                                    j9 = 0;
                                    j10 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    iJ = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    eVar = iVar;
                                    i19 = iA5;
                                    iJ2 = iA3;
                                    j11 = 0;
                                    while (true) {
                                        if (i16 >= iC) {
                                            long[] jArr114 = jArr3;
                                            i20 = i12;
                                            i21 = i13;
                                            iArrCopyOf2 = iArr;
                                            jArrCopyOf = jArr4;
                                            jArr5 = jArr114;
                                            break;
                                        }
                                        zA = true;
                                        while (i17 == 0) {
                                            zA = bVar.a();
                                            if (!zA) {
                                                break;
                                                break;
                                            }
                                            int i7113 = i12;
                                            long j2111 = bVar.d;
                                            i17 = bVar.c;
                                            j10 = j2111;
                                            i12 = i7113;
                                            i13 = i13;
                                            iC = iC;
                                        }
                                        i25 = iC;
                                        i20 = i12;
                                        i21 = i13;
                                        if (!zA) {
                                            cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                            long[] jArrCopyOf7 = Arrays.copyOf(jArr3, i16);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                            jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                            jArr5 = jArrCopyOf7;
                                            iC = i16;
                                            break;
                                        }
                                        if (nszVar3 != null) {
                                            iA9 = i18;
                                            while (iA9 == 0) {
                                                iA9 = nszVar3.A();
                                                iJ = nszVar3.j();
                                                i14--;
                                            }
                                            i18 = iA9 - 1;
                                        }
                                        jArr3[i16] = j10;
                                        iA8 = eVar.a();
                                        iArr[i16] = iA8;
                                        j11 += (long) iA8;
                                        if (iA8 > i15) {
                                            i15 = iA8;
                                        }
                                        jArr4[i16] = j9 + ((long) iJ);
                                        if (nszVar4 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArrCopyOf[i16] = i26;
                                        if (i16 == iA7) {
                                            iArrCopyOf[i16] = 1;
                                            i19--;
                                            if (i19 > 0) {
                                                nszVar4.getClass();
                                                iA7 = nszVar4.A() - 1;
                                            }
                                        }
                                        j9 += (long) iJ2;
                                        i13 = i21 - 1;
                                        if (i13 == 0) {
                                            i12 = i20;
                                        } else {
                                            i12 = i20;
                                        }
                                        j10 += (long) iArr[i16];
                                        i17--;
                                        i16++;
                                        iA7 = iA7;
                                        jArr3 = jArr3;
                                        iC = i25;
                                    }
                                    int[] iArr18 = iArrCopyOf;
                                    i22 = i17;
                                    long j2112 = j9 + ((long) iJ);
                                    if (nszVar3 == null) {
                                        z4 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i14 <= 0) {
                                            z4 = true;
                                            break;
                                        }
                                        if (nszVar3.A() != 0) {
                                            z4 = false;
                                            break;
                                        }
                                        nszVar3.j();
                                        i14--;
                                    }
                                    if (i19 == 0) {
                                        StringBuilder sb10 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb10, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb10, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb10.append(i20);
                                        sb10.append(", remainingSamplesAtTimestampOffset ");
                                        sb10.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb10.append(str2);
                                        cft.g("BoxParsers", sb10.toString());
                                    } else {
                                        StringBuilder sb11 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb11, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb11, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb11.append(i20);
                                        sb11.append(", remainingSamplesAtTimestampOffset ");
                                        sb11.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb11.append(str2);
                                        cft.g("BoxParsers", sb11.toString());
                                    }
                                    jArr6 = jArrCopyOf;
                                    i23 = iC;
                                    j12 = j2112;
                                    iArr2 = iArrCopyOf2;
                                    j13 = j11;
                                    jArr7 = jArr5;
                                    iArr3 = iArr18;
                                    i24 = i15;
                                } else {
                                    jArr3 = new long[iC];
                                    iArr = new int[iC];
                                    jArr4 = new long[iC];
                                    iArrCopyOf = new int[iC];
                                    i12 = iA;
                                    i13 = iA2;
                                    nszVar4 = nszVar2;
                                    i14 = iA4;
                                    iA7 = iA6;
                                    j9 = 0;
                                    j10 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    iJ = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    eVar = iVar;
                                    i19 = iA5;
                                    iJ2 = iA3;
                                    j11 = 0;
                                    while (true) {
                                        if (i16 >= iC) {
                                            long[] jArr115 = jArr3;
                                            i20 = i12;
                                            i21 = i13;
                                            iArrCopyOf2 = iArr;
                                            jArrCopyOf = jArr4;
                                            jArr5 = jArr115;
                                            break;
                                        }
                                        zA = true;
                                        while (i17 == 0) {
                                            zA = bVar.a();
                                            if (!zA) {
                                                break;
                                                break;
                                            }
                                            int i7114 = i12;
                                            long j2113 = bVar.d;
                                            i17 = bVar.c;
                                            j10 = j2113;
                                            i12 = i7114;
                                            i13 = i13;
                                            iC = iC;
                                        }
                                        i25 = iC;
                                        i20 = i12;
                                        i21 = i13;
                                        if (!zA) {
                                            cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                            long[] jArrCopyOf8 = Arrays.copyOf(jArr3, i16);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                            jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                            jArr5 = jArrCopyOf8;
                                            iC = i16;
                                            break;
                                        }
                                        if (nszVar3 != null) {
                                            iA9 = i18;
                                            while (iA9 == 0) {
                                                iA9 = nszVar3.A();
                                                iJ = nszVar3.j();
                                                i14--;
                                            }
                                            i18 = iA9 - 1;
                                        }
                                        jArr3[i16] = j10;
                                        iA8 = eVar.a();
                                        iArr[i16] = iA8;
                                        j11 += (long) iA8;
                                        if (iA8 > i15) {
                                            i15 = iA8;
                                        }
                                        jArr4[i16] = j9 + ((long) iJ);
                                        if (nszVar4 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArrCopyOf[i16] = i26;
                                        if (i16 == iA7) {
                                            iArrCopyOf[i16] = 1;
                                            i19--;
                                            if (i19 > 0) {
                                                nszVar4.getClass();
                                                iA7 = nszVar4.A() - 1;
                                            }
                                        }
                                        j9 += (long) iJ2;
                                        i13 = i21 - 1;
                                        if (i13 == 0) {
                                            i12 = i20;
                                        } else {
                                            i12 = i20;
                                        }
                                        j10 += (long) iArr[i16];
                                        i17--;
                                        i16++;
                                        iA7 = iA7;
                                        jArr3 = jArr3;
                                        iC = i25;
                                    }
                                    int[] iArr19 = iArrCopyOf;
                                    i22 = i17;
                                    long j2114 = j9 + ((long) iJ);
                                    if (nszVar3 == null) {
                                        z4 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i14 <= 0) {
                                            z4 = true;
                                            break;
                                        }
                                        if (nszVar3.A() != 0) {
                                            z4 = false;
                                            break;
                                        }
                                        nszVar3.j();
                                        i14--;
                                    }
                                    if (i19 == 0) {
                                        StringBuilder sb12 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb12, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb12, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb12.append(i20);
                                        sb12.append(", remainingSamplesAtTimestampOffset ");
                                        sb12.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb12.append(str2);
                                        cft.g("BoxParsers", sb12.toString());
                                    } else {
                                        StringBuilder sb13 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb13, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb13, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb13.append(i20);
                                        sb13.append(", remainingSamplesAtTimestampOffset ");
                                        sb13.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb13.append(str2);
                                        cft.g("BoxParsers", sb13.toString());
                                    }
                                    jArr6 = jArrCopyOf;
                                    i23 = iC;
                                    j12 = j2114;
                                    iArr2 = iArrCopyOf2;
                                    j13 = j11;
                                    jArr7 = jArr5;
                                    iArr3 = iArr19;
                                    i24 = i15;
                                }
                                j14 = fjg0VarA.f;
                                if (j14 > 0) {
                                    jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                    if (jV5 > 0) {
                                        androidx.media3.common.a.C0062a c0062aA12 = aVar5.a();
                                        c0062aA12.h = (int) jV5;
                                        fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA12));
                                    }
                                }
                                fjg0VarA2 = fjg0VarA;
                                j15 = fjg0VarA2.c;
                                aVar6 = fjg0VarA2.g;
                                i27 = fjg0VarA2.b;
                                jArr8 = fjg0VarA2.j;
                                jArr9 = fjg0VarA2.i;
                                RoundingMode roundingMode8 = RoundingMode.DOWN;
                                jV3 = jrh0.V(j12, 1000000L, j15, roundingMode8);
                                if (jArr9 == null) {
                                    jrh0.U(jArr6, j15);
                                    ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                                } else {
                                    if (jArr9.length == 1) {
                                        i28 = i27;
                                    } else {
                                        i28 = i27;
                                    }
                                    if (jArr9.length != 1) {
                                        i29 = 1;
                                    } else if (jArr9[0] == 0) {
                                        jArr8.getClass();
                                        j20 = jArr8[0];
                                        while (i46 < jArr6.length) {
                                            jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                        }
                                        ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                    } else {
                                        i29 = 1;
                                    }
                                    if (i28 == i29) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    iArr4 = new int[jArr9.length];
                                    iArr5 = new int[jArr9.length];
                                    jArr8.getClass();
                                    i30 = 0;
                                    i31 = 0;
                                    i32 = 0;
                                    z6 = false;
                                    while (i32 < jArr9.length) {
                                        iArr9 = iArr5;
                                        j18 = jArr8[i32];
                                        if (j18 != -1) {
                                            i39 = i32;
                                            boolean z110 = z6;
                                            long jV111 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                            iArr4[i39] = jrh0.e(jArr6, j18, true);
                                            j19 = j18 + jV111;
                                            iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                            i40 = iArr4[i39];
                                            while (true) {
                                                i41 = iArr4[i39];
                                                if (i41 >= 0) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr4[i39] = i41 - 1;
                                            }
                                            if (i41 < 0) {
                                                iArr4[i39] = i40;
                                                while (true) {
                                                    i45 = iArr4[i39];
                                                    if (i45 < iArr9[i39]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr4[i39] = i45 + 1;
                                                }
                                            }
                                            if (i28 == 2) {
                                                while (true) {
                                                    i43 = iArr9[i39];
                                                    if (i43 >= jArr6.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i44 = i43 + 1;
                                                    if (jArr6[i44] > j19) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr9[i39] = i44;
                                                }
                                            }
                                            int i7115 = iArr9[i39];
                                            i42 = iArr4[i39];
                                            int i7116 = (i7115 - i42) + i30;
                                            if (i31 != i42) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z6 = z110 | z11;
                                            i31 = i7115;
                                            i30 = i7116;
                                        } else {
                                            i39 = i32;
                                        }
                                        i32 = i39 + 1;
                                        iArr5 = iArr9;
                                        i24 = i24;
                                    }
                                    iArr6 = iArr5;
                                    i33 = i24;
                                    boolean z111 = z6;
                                    if (i30 != i23) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    z8 = z111 | z7;
                                    if (z8) {
                                        jArr10 = new long[i30];
                                    } else {
                                        jArr10 = jArr7;
                                    }
                                    if (z8) {
                                        iArr7 = new int[i30];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    if (z8) {
                                        i33 = 0;
                                    }
                                    if (z8) {
                                        iArr8 = new int[i30];
                                    } else {
                                        iArr8 = iArr3;
                                    }
                                    jArr11 = new long[i30];
                                    i34 = 0;
                                    z9 = false;
                                    i35 = 0;
                                    i36 = i33;
                                    j16 = 0;
                                    while (i34 < jArr9.length) {
                                        j17 = jArr8[i34];
                                        jArr12 = jArr11;
                                        i37 = iArr4[i34];
                                        z10 = z8;
                                        i38 = iArr6[i34];
                                        int i7117 = i34;
                                        if (z10) {
                                            int i816 = i38 - i37;
                                            System.arraycopy(jArr7, i37, jArr10, i35, i816);
                                            System.arraycopy(iArr2, i37, iArr7, i35, i816);
                                            System.arraycopy(iArr3, i37, iArr8, i35, i816);
                                        }
                                        int i817 = i36;
                                        while (i37 < i38) {
                                            int i818 = i37;
                                            int i819 = i38;
                                            long j2115 = fjg0VarA2.d;
                                            RoundingMode roundingMode9 = RoundingMode.DOWN;
                                            long jV112 = jrh0.V(j16, 1000000L, j2115, roundingMode9);
                                            jV4 = jrh0.V(jArr6[i818] - j17, 1000000L, fjg0VarA2.c, roundingMode9);
                                            if (jV4 < 0) {
                                                z9 = true;
                                            }
                                            jArr12[i35] = jV112 + jV4;
                                            if (!z10) {
                                            }
                                            i35++;
                                            i37 = i818 + 1;
                                            i38 = i819;
                                        }
                                        j16 += jArr9[i7117];
                                        i36 = i817;
                                        z8 = z10;
                                        i34 = i7117 + 1;
                                        jArr11 = jArr12;
                                    }
                                    long[] jArr24 = jArr11;
                                    long jV113 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                    if (z9) {
                                        androidx.media3.common.a.C0062a c0062aA13 = aVar6.a();
                                        c0062aA13.s = true;
                                        fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA13));
                                    }
                                    ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr24, iArr8, jV113);
                                }
                            }
                            arrayList3.add(ojg0Var);
                        }
                    }
                    i4 = i3;
                    nszVar6.J(16);
                    short sT2 = nszVar6.t();
                    nszVar6.J(2);
                    jVar = new j(iJ4, iC2, i4, sT2, nszVar6.t(), j3);
                    if (j2 == -9223372036854775807L) {
                        j4 = j3;
                    } else {
                        j4 = j2;
                    }
                    j5 = g(bVarC7.b).c;
                    if (j4 == -9223372036854775807L) {
                        j6 = j5;
                        jV2 = -9223372036854775807L;
                    } else {
                        String str9 = jrh0.a;
                        j6 = j5;
                        jV2 = jrh0.V(j4, 1000000L, j6, RoundingMode.DOWN);
                    }
                    c8w.a aVarB10 = aVarB3.b(1835626086);
                    aVarB10.getClass();
                    c8w.a aVarB11 = aVarB10.b(1937007212);
                    aVarB11.getClass();
                    c8w.b bVarC16 = aVarB3.c(1835296868);
                    bVarC16.getClass();
                    nszVar = bVarC16.b;
                    nszVar.I(8);
                    iE = e(nszVar.j());
                    nszVar.J(iE == 0 ? 8 : 16);
                    jY = nszVar.y();
                    i5 = nszVar.b;
                    if (iE == 0) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                            nszVar.J(i6);
                            break;
                        }
                        if (nszVar.a[i5 + i7] != -1) {
                            if (iE == 0) {
                                jB = nszVar.y();
                            } else {
                                jB = nszVar.B();
                            }
                            j8 = jB;
                            if (j8 != 0) {
                                break;
                            }
                            String str10 = jrh0.a;
                            jV = jrh0.V(j8, 1000000L, jY, RoundingMode.DOWN);
                            break;
                        }
                        i7++;
                    }
                    j7 = jV;
                    int iC4 = nszVar.C();
                    cArr = new char[]{(char) (((iC4 >> 10) & 31) + 96), (char) (((iC4 >> 5) & 31) + 96), (char) ((iC4 & 31) + 96)};
                    i8 = 0;
                    while (true) {
                        if (i8 < 3) {
                            c2 = cArr[i8];
                            if (c2 >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i8++;
                    }
                    bVarC = aVarB11.c(1937011556);
                    if (bVarC != null) {
                        throw ssz.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                    }
                    gVarI = i(bVarC.b, jVar, str, drmInitData, z2);
                    if (z) {
                        i9 = i2;
                        jArr = null;
                        jArr2 = null;
                    } else {
                        i9 = i2;
                        jArr = null;
                        jArr2 = null;
                    }
                    aVar2 = gVarI.b;
                    if (aVar2 != null) {
                        i10 = jVar.b;
                        if (i10 != 0) {
                            b8wVar = new b8w(i10);
                            androidx.media3.common.a.C0062a c0062aA14 = aVar2.a();
                            uovVar = gVarI.b.l;
                            if (uovVar != null) {
                                uovVar2 = uovVar.a(b8wVar);
                            } else {
                                uovVar2 = new uov(b8wVar);
                            }
                            c0062aA14.k = uovVar2;
                            aVar3 = new androidx.media3.common.a(c0062aA14);
                        } else {
                            aVar3 = aVar2;
                        }
                        fjg0Var = new fjg0(jVar.a, i9, jY, j6, jV2, j7, aVar3, gVarI.d, gVarI.a, gVarI.c, jArr, jArr2);
                    }
                    fjg0VarA = (fjg0) bajVar.apply(fjg0Var);
                    if (fjg0VarA == null) {
                        arrayList = arrayList2;
                        arrayList3 = arrayList3;
                        i11 = i47;
                    } else {
                        aVar4 = fjg0VarA.g;
                        c8w.a aVarB12 = aVar8.b(1835297121);
                        aVarB12.getClass();
                        c8w.a aVarB13 = aVarB12.b(1835626086);
                        aVarB13.getClass();
                        aVarB2 = aVarB13.b(1937007212);
                        aVarB2.getClass();
                        bVarC2 = aVarB2.c(1937011578);
                        if (bVarC2 != null) {
                            iVar = new h(bVarC2, aVar4);
                        } else {
                            bVarC3 = aVarB2.c(1937013298);
                            if (bVarC3 != null) {
                                throw ssz.a(null, "Track has no sample table size information");
                            }
                            iVar = new i(bVarC3);
                        }
                        iC = iVar.c();
                        if (iC == 0) {
                            i11 = i47;
                            ojg0Var = new ojg0(fjg0VarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                            arrayList = arrayList2;
                        } else {
                            if (fjg0VarA.b == 2) {
                                j21 = fjg0VarA.f;
                                if (j21 > 0) {
                                    androidx.media3.common.a.C0062a c0062aA15 = aVar4.a();
                                    c0062aA15.x = iC / (j21 / 1000000.0f);
                                    fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA15));
                                }
                            }
                            aVar5 = fjg0VarA.g;
                            bVarC4 = aVarB2.c(1937007471);
                            if (bVarC4 == null) {
                                bVarC4 = aVarB2.c(1668232756);
                                bVarC4.getClass();
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            nsz nszVar14 = bVarC4.b;
                            c8w.b bVarC17 = aVarB2.c(1937011555);
                            bVarC17.getClass();
                            nsz nszVar15 = bVarC17.b;
                            c8w.b bVarC18 = aVarB2.c(1937011827);
                            bVarC18.getClass();
                            nsz nszVar16 = bVarC18.b;
                            bVarC5 = aVarB2.c(1937011571);
                            if (bVarC5 != null) {
                                nszVar2 = bVarC5.b;
                            } else {
                                nszVar2 = null;
                            }
                            arrayList = arrayList2;
                            bVarC6 = aVarB2.c(1668576371);
                            if (bVarC6 != null) {
                                nszVar3 = bVarC6.b;
                            } else {
                                nszVar3 = null;
                            }
                            bVar = new b(nszVar15, nszVar14, z3);
                            nszVar16.I(12);
                            iA = nszVar16.A() - 1;
                            iA2 = nszVar16.A();
                            iA3 = nszVar16.A();
                            if (nszVar3 != null) {
                                nszVar3.I(12);
                                iA4 = nszVar3.A();
                            } else {
                                iA4 = 0;
                            }
                            if (nszVar2 != null) {
                                nszVar2.I(12);
                                iA5 = nszVar2.A();
                                if (iA5 > 0) {
                                    iA6 = nszVar2.A() - 1;
                                    nszVar3 = nszVar3;
                                } else {
                                    nszVar2 = null;
                                }
                                iB = iVar.b();
                                i11 = i47;
                                String str11 = aVar5.n;
                                if (iB == -1) {
                                    jArr3 = new long[iC];
                                    iArr = new int[iC];
                                    jArr4 = new long[iC];
                                    iArrCopyOf = new int[iC];
                                    i12 = iA;
                                    i13 = iA2;
                                    nszVar4 = nszVar2;
                                    i14 = iA4;
                                    iA7 = iA6;
                                    j9 = 0;
                                    j10 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    iJ = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    eVar = iVar;
                                    i19 = iA5;
                                    iJ2 = iA3;
                                    j11 = 0;
                                    while (true) {
                                        if (i16 >= iC) {
                                            long[] jArr116 = jArr3;
                                            i20 = i12;
                                            i21 = i13;
                                            iArrCopyOf2 = iArr;
                                            jArrCopyOf = jArr4;
                                            jArr5 = jArr116;
                                            break;
                                        }
                                        zA = true;
                                        while (i17 == 0) {
                                            zA = bVar.a();
                                            if (!zA) {
                                                break;
                                                break;
                                            }
                                            int i7118 = i12;
                                            long j2116 = bVar.d;
                                            i17 = bVar.c;
                                            j10 = j2116;
                                            i12 = i7118;
                                            i13 = i13;
                                            iC = iC;
                                        }
                                        i25 = iC;
                                        i20 = i12;
                                        i21 = i13;
                                        if (!zA) {
                                            cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                            long[] jArrCopyOf9 = Arrays.copyOf(jArr3, i16);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                            jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                            jArr5 = jArrCopyOf9;
                                            iC = i16;
                                            break;
                                        }
                                        if (nszVar3 != null) {
                                            iA9 = i18;
                                            while (iA9 == 0) {
                                                iA9 = nszVar3.A();
                                                iJ = nszVar3.j();
                                                i14--;
                                            }
                                            i18 = iA9 - 1;
                                        }
                                        jArr3[i16] = j10;
                                        iA8 = eVar.a();
                                        iArr[i16] = iA8;
                                        j11 += (long) iA8;
                                        if (iA8 > i15) {
                                            i15 = iA8;
                                        }
                                        jArr4[i16] = j9 + ((long) iJ);
                                        if (nszVar4 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArrCopyOf[i16] = i26;
                                        if (i16 == iA7) {
                                            iArrCopyOf[i16] = 1;
                                            i19--;
                                            if (i19 > 0) {
                                                nszVar4.getClass();
                                                iA7 = nszVar4.A() - 1;
                                            }
                                        }
                                        j9 += (long) iJ2;
                                        i13 = i21 - 1;
                                        if (i13 == 0) {
                                            i12 = i20;
                                        } else {
                                            i12 = i20;
                                        }
                                        j10 += (long) iArr[i16];
                                        i17--;
                                        i16++;
                                        iA7 = iA7;
                                        jArr3 = jArr3;
                                        iC = i25;
                                    }
                                    int[] iArr110 = iArrCopyOf;
                                    i22 = i17;
                                    long j2117 = j9 + ((long) iJ);
                                    if (nszVar3 == null) {
                                        z4 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i14 <= 0) {
                                            z4 = true;
                                            break;
                                        }
                                        if (nszVar3.A() != 0) {
                                            z4 = false;
                                            break;
                                        }
                                        nszVar3.j();
                                        i14--;
                                    }
                                    if (i19 == 0) {
                                        StringBuilder sb14 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb14, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb14, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb14.append(i20);
                                        sb14.append(", remainingSamplesAtTimestampOffset ");
                                        sb14.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb14.append(str2);
                                        cft.g("BoxParsers", sb14.toString());
                                    } else {
                                        StringBuilder sb15 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb15, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb15, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb15.append(i20);
                                        sb15.append(", remainingSamplesAtTimestampOffset ");
                                        sb15.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb15.append(str2);
                                        cft.g("BoxParsers", sb15.toString());
                                    }
                                    jArr6 = jArrCopyOf;
                                    i23 = iC;
                                    j12 = j2117;
                                    iArr2 = iArrCopyOf2;
                                    j13 = j11;
                                    jArr7 = jArr5;
                                    iArr3 = iArr110;
                                    i24 = i15;
                                } else {
                                    jArr3 = new long[iC];
                                    iArr = new int[iC];
                                    jArr4 = new long[iC];
                                    iArrCopyOf = new int[iC];
                                    i12 = iA;
                                    i13 = iA2;
                                    nszVar4 = nszVar2;
                                    i14 = iA4;
                                    iA7 = iA6;
                                    j9 = 0;
                                    j10 = 0;
                                    i15 = 0;
                                    i16 = 0;
                                    iJ = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    eVar = iVar;
                                    i19 = iA5;
                                    iJ2 = iA3;
                                    j11 = 0;
                                    while (true) {
                                        if (i16 >= iC) {
                                            long[] jArr117 = jArr3;
                                            i20 = i12;
                                            i21 = i13;
                                            iArrCopyOf2 = iArr;
                                            jArrCopyOf = jArr4;
                                            jArr5 = jArr117;
                                            break;
                                        }
                                        zA = true;
                                        while (i17 == 0) {
                                            zA = bVar.a();
                                            if (!zA) {
                                                break;
                                                break;
                                            }
                                            int i7119 = i12;
                                            long j2118 = bVar.d;
                                            i17 = bVar.c;
                                            j10 = j2118;
                                            i12 = i7119;
                                            i13 = i13;
                                            iC = iC;
                                        }
                                        i25 = iC;
                                        i20 = i12;
                                        i21 = i13;
                                        if (!zA) {
                                            cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                            long[] jArrCopyOf10 = Arrays.copyOf(jArr3, i16);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                            jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                            jArr5 = jArrCopyOf10;
                                            iC = i16;
                                            break;
                                        }
                                        if (nszVar3 != null) {
                                            iA9 = i18;
                                            while (iA9 == 0) {
                                                iA9 = nszVar3.A();
                                                iJ = nszVar3.j();
                                                i14--;
                                            }
                                            i18 = iA9 - 1;
                                        }
                                        jArr3[i16] = j10;
                                        iA8 = eVar.a();
                                        iArr[i16] = iA8;
                                        j11 += (long) iA8;
                                        if (iA8 > i15) {
                                            i15 = iA8;
                                        }
                                        jArr4[i16] = j9 + ((long) iJ);
                                        if (nszVar4 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArrCopyOf[i16] = i26;
                                        if (i16 == iA7) {
                                            iArrCopyOf[i16] = 1;
                                            i19--;
                                            if (i19 > 0) {
                                                nszVar4.getClass();
                                                iA7 = nszVar4.A() - 1;
                                            }
                                        }
                                        j9 += (long) iJ2;
                                        i13 = i21 - 1;
                                        if (i13 == 0) {
                                            i12 = i20;
                                        } else {
                                            i12 = i20;
                                        }
                                        j10 += (long) iArr[i16];
                                        i17--;
                                        i16++;
                                        iA7 = iA7;
                                        jArr3 = jArr3;
                                        iC = i25;
                                    }
                                    int[] iArr111 = iArrCopyOf;
                                    i22 = i17;
                                    long j2119 = j9 + ((long) iJ);
                                    if (nszVar3 == null) {
                                        z4 = true;
                                        break;
                                    }
                                    while (true) {
                                        if (i14 <= 0) {
                                            z4 = true;
                                            break;
                                        }
                                        if (nszVar3.A() != 0) {
                                            z4 = false;
                                            break;
                                        }
                                        nszVar3.j();
                                        i14--;
                                    }
                                    if (i19 == 0) {
                                        StringBuilder sb16 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb16, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb16, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb16.append(i20);
                                        sb16.append(", remainingSamplesAtTimestampOffset ");
                                        sb16.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb16.append(str2);
                                        cft.g("BoxParsers", sb16.toString());
                                    } else {
                                        StringBuilder sb17 = new StringBuilder("Inconsistent stbl box for track ");
                                        d5d.a(sb17, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                        d5d.a(sb17, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                        sb17.append(i20);
                                        sb17.append(", remainingSamplesAtTimestampOffset ");
                                        sb17.append(i18);
                                        if (z4) {
                                            str2 = ", ctts invalid";
                                        } else {
                                            str2 = "";
                                        }
                                        sb17.append(str2);
                                        cft.g("BoxParsers", sb17.toString());
                                    }
                                    jArr6 = jArrCopyOf;
                                    i23 = iC;
                                    j12 = j2119;
                                    iArr2 = iArrCopyOf2;
                                    j13 = j11;
                                    jArr7 = jArr5;
                                    iArr3 = iArr111;
                                    i24 = i15;
                                }
                                j14 = fjg0VarA.f;
                                if (j14 > 0) {
                                    jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                    if (jV5 > 0) {
                                        androidx.media3.common.a.C0062a c0062aA16 = aVar5.a();
                                        c0062aA16.h = (int) jV5;
                                        fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA16));
                                    }
                                }
                                fjg0VarA2 = fjg0VarA;
                                j15 = fjg0VarA2.c;
                                aVar6 = fjg0VarA2.g;
                                i27 = fjg0VarA2.b;
                                jArr8 = fjg0VarA2.j;
                                jArr9 = fjg0VarA2.i;
                                RoundingMode roundingMode10 = RoundingMode.DOWN;
                                jV3 = jrh0.V(j12, 1000000L, j15, roundingMode10);
                                if (jArr9 == null) {
                                    jrh0.U(jArr6, j15);
                                    ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                                } else {
                                    if (jArr9.length == 1) {
                                        i28 = i27;
                                    } else {
                                        i28 = i27;
                                    }
                                    if (jArr9.length != 1) {
                                        i29 = 1;
                                    } else if (jArr9[0] == 0) {
                                        jArr8.getClass();
                                        j20 = jArr8[0];
                                        while (i46 < jArr6.length) {
                                            jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                        }
                                        ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                    } else {
                                        i29 = 1;
                                    }
                                    if (i28 == i29) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    iArr4 = new int[jArr9.length];
                                    iArr5 = new int[jArr9.length];
                                    jArr8.getClass();
                                    i30 = 0;
                                    i31 = 0;
                                    i32 = 0;
                                    z6 = false;
                                    while (i32 < jArr9.length) {
                                        iArr9 = iArr5;
                                        j18 = jArr8[i32];
                                        if (j18 != -1) {
                                            i39 = i32;
                                            boolean z112 = z6;
                                            long jV114 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                            iArr4[i39] = jrh0.e(jArr6, j18, true);
                                            j19 = j18 + jV114;
                                            iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                            i40 = iArr4[i39];
                                            while (true) {
                                                i41 = iArr4[i39];
                                                if (i41 >= 0) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr4[i39] = i41 - 1;
                                            }
                                            if (i41 < 0) {
                                                iArr4[i39] = i40;
                                                while (true) {
                                                    i45 = iArr4[i39];
                                                    if (i45 < iArr9[i39]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr4[i39] = i45 + 1;
                                                }
                                            }
                                            if (i28 == 2) {
                                                while (true) {
                                                    i43 = iArr9[i39];
                                                    if (i43 >= jArr6.length - 1) {
                                                        break;
                                                        break;
                                                    }
                                                    i44 = i43 + 1;
                                                    if (jArr6[i44] > j19) {
                                                        break;
                                                        break;
                                                    }
                                                    iArr9[i39] = i44;
                                                }
                                            }
                                            int i71110 = iArr9[i39];
                                            i42 = iArr4[i39];
                                            int i71111 = (i71110 - i42) + i30;
                                            if (i31 != i42) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            z6 = z112 | z11;
                                            i31 = i71110;
                                            i30 = i71111;
                                        } else {
                                            i39 = i32;
                                        }
                                        i32 = i39 + 1;
                                        iArr5 = iArr9;
                                        i24 = i24;
                                    }
                                    iArr6 = iArr5;
                                    i33 = i24;
                                    boolean z113 = z6;
                                    if (i30 != i23) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    z8 = z113 | z7;
                                    if (z8) {
                                        jArr10 = new long[i30];
                                    } else {
                                        jArr10 = jArr7;
                                    }
                                    if (z8) {
                                        iArr7 = new int[i30];
                                    } else {
                                        iArr7 = iArr2;
                                    }
                                    if (z8) {
                                        i33 = 0;
                                    }
                                    if (z8) {
                                        iArr8 = new int[i30];
                                    } else {
                                        iArr8 = iArr3;
                                    }
                                    jArr11 = new long[i30];
                                    i34 = 0;
                                    z9 = false;
                                    i35 = 0;
                                    i36 = i33;
                                    j16 = 0;
                                    while (i34 < jArr9.length) {
                                        j17 = jArr8[i34];
                                        jArr12 = jArr11;
                                        i37 = iArr4[i34];
                                        z10 = z8;
                                        i38 = iArr6[i34];
                                        int i71112 = i34;
                                        if (z10) {
                                            int i8110 = i38 - i37;
                                            System.arraycopy(jArr7, i37, jArr10, i35, i8110);
                                            System.arraycopy(iArr2, i37, iArr7, i35, i8110);
                                            System.arraycopy(iArr3, i37, iArr8, i35, i8110);
                                        }
                                        int i8111 = i36;
                                        while (i37 < i38) {
                                            int i8112 = i37;
                                            int i8113 = i38;
                                            long j21110 = fjg0VarA2.d;
                                            RoundingMode roundingMode11 = RoundingMode.DOWN;
                                            long jV115 = jrh0.V(j16, 1000000L, j21110, roundingMode11);
                                            jV4 = jrh0.V(jArr6[i8112] - j17, 1000000L, fjg0VarA2.c, roundingMode11);
                                            if (jV4 < 0) {
                                                z9 = true;
                                            }
                                            jArr12[i35] = jV115 + jV4;
                                            if (!z10) {
                                            }
                                            i35++;
                                            i37 = i8112 + 1;
                                            i38 = i8113;
                                        }
                                        j16 += jArr9[i71112];
                                        i36 = i8111;
                                        z8 = z10;
                                        i34 = i71112 + 1;
                                        jArr11 = jArr12;
                                    }
                                    long[] jArr25 = jArr11;
                                    long jV116 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                    if (z9) {
                                        androidx.media3.common.a.C0062a c0062aA17 = aVar6.a();
                                        c0062aA17.s = true;
                                        fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA17));
                                    }
                                    ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr25, iArr8, jV116);
                                }
                            } else {
                                iA5 = 0;
                            }
                            iA6 = -1;
                            iB = iVar.b();
                            i11 = i47;
                            String str12 = aVar5.n;
                            if (iB == -1) {
                                jArr3 = new long[iC];
                                iArr = new int[iC];
                                jArr4 = new long[iC];
                                iArrCopyOf = new int[iC];
                                i12 = iA;
                                i13 = iA2;
                                nszVar4 = nszVar2;
                                i14 = iA4;
                                iA7 = iA6;
                                j9 = 0;
                                j10 = 0;
                                i15 = 0;
                                i16 = 0;
                                iJ = 0;
                                i17 = 0;
                                i18 = 0;
                                eVar = iVar;
                                i19 = iA5;
                                iJ2 = iA3;
                                j11 = 0;
                                while (true) {
                                    if (i16 >= iC) {
                                        long[] jArr118 = jArr3;
                                        i20 = i12;
                                        i21 = i13;
                                        iArrCopyOf2 = iArr;
                                        jArrCopyOf = jArr4;
                                        jArr5 = jArr118;
                                        break;
                                    }
                                    zA = true;
                                    while (i17 == 0) {
                                        zA = bVar.a();
                                        if (!zA) {
                                            break;
                                            break;
                                        }
                                        int i71113 = i12;
                                        long j21111 = bVar.d;
                                        i17 = bVar.c;
                                        j10 = j21111;
                                        i12 = i71113;
                                        i13 = i13;
                                        iC = iC;
                                    }
                                    i25 = iC;
                                    i20 = i12;
                                    i21 = i13;
                                    if (!zA) {
                                        cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                        long[] jArrCopyOf11 = Arrays.copyOf(jArr3, i16);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                        jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                        jArr5 = jArrCopyOf11;
                                        iC = i16;
                                        break;
                                    }
                                    if (nszVar3 != null) {
                                        iA9 = i18;
                                        while (iA9 == 0) {
                                            iA9 = nszVar3.A();
                                            iJ = nszVar3.j();
                                            i14--;
                                        }
                                        i18 = iA9 - 1;
                                    }
                                    jArr3[i16] = j10;
                                    iA8 = eVar.a();
                                    iArr[i16] = iA8;
                                    j11 += (long) iA8;
                                    if (iA8 > i15) {
                                        i15 = iA8;
                                    }
                                    jArr4[i16] = j9 + ((long) iJ);
                                    if (nszVar4 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArrCopyOf[i16] = i26;
                                    if (i16 == iA7) {
                                        iArrCopyOf[i16] = 1;
                                        i19--;
                                        if (i19 > 0) {
                                            nszVar4.getClass();
                                            iA7 = nszVar4.A() - 1;
                                        }
                                    }
                                    j9 += (long) iJ2;
                                    i13 = i21 - 1;
                                    if (i13 == 0) {
                                        i12 = i20;
                                    } else {
                                        i12 = i20;
                                    }
                                    j10 += (long) iArr[i16];
                                    i17--;
                                    i16++;
                                    iA7 = iA7;
                                    jArr3 = jArr3;
                                    iC = i25;
                                }
                                int[] iArr112 = iArrCopyOf;
                                i22 = i17;
                                long j21112 = j9 + ((long) iJ);
                                if (nszVar3 == null) {
                                    z4 = true;
                                    break;
                                }
                                while (true) {
                                    if (i14 <= 0) {
                                        z4 = true;
                                        break;
                                    }
                                    if (nszVar3.A() != 0) {
                                        z4 = false;
                                        break;
                                    }
                                    nszVar3.j();
                                    i14--;
                                }
                                if (i19 == 0) {
                                    StringBuilder sb18 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb18, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb18, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb18.append(i20);
                                    sb18.append(", remainingSamplesAtTimestampOffset ");
                                    sb18.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb18.append(str2);
                                    cft.g("BoxParsers", sb18.toString());
                                } else {
                                    StringBuilder sb19 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb19, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb19, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb19.append(i20);
                                    sb19.append(", remainingSamplesAtTimestampOffset ");
                                    sb19.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb19.append(str2);
                                    cft.g("BoxParsers", sb19.toString());
                                }
                                jArr6 = jArrCopyOf;
                                i23 = iC;
                                j12 = j21112;
                                iArr2 = iArrCopyOf2;
                                j13 = j11;
                                jArr7 = jArr5;
                                iArr3 = iArr112;
                                i24 = i15;
                            } else {
                                jArr3 = new long[iC];
                                iArr = new int[iC];
                                jArr4 = new long[iC];
                                iArrCopyOf = new int[iC];
                                i12 = iA;
                                i13 = iA2;
                                nszVar4 = nszVar2;
                                i14 = iA4;
                                iA7 = iA6;
                                j9 = 0;
                                j10 = 0;
                                i15 = 0;
                                i16 = 0;
                                iJ = 0;
                                i17 = 0;
                                i18 = 0;
                                eVar = iVar;
                                i19 = iA5;
                                iJ2 = iA3;
                                j11 = 0;
                                while (true) {
                                    if (i16 >= iC) {
                                        long[] jArr119 = jArr3;
                                        i20 = i12;
                                        i21 = i13;
                                        iArrCopyOf2 = iArr;
                                        jArrCopyOf = jArr4;
                                        jArr5 = jArr119;
                                        break;
                                    }
                                    zA = true;
                                    while (i17 == 0) {
                                        zA = bVar.a();
                                        if (!zA) {
                                            break;
                                            break;
                                        }
                                        int i71114 = i12;
                                        long j21113 = bVar.d;
                                        i17 = bVar.c;
                                        j10 = j21113;
                                        i12 = i71114;
                                        i13 = i13;
                                        iC = iC;
                                    }
                                    i25 = iC;
                                    i20 = i12;
                                    i21 = i13;
                                    if (!zA) {
                                        cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                        long[] jArrCopyOf12 = Arrays.copyOf(jArr3, i16);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                        jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                        jArr5 = jArrCopyOf12;
                                        iC = i16;
                                        break;
                                    }
                                    if (nszVar3 != null) {
                                        iA9 = i18;
                                        while (iA9 == 0) {
                                            iA9 = nszVar3.A();
                                            iJ = nszVar3.j();
                                            i14--;
                                        }
                                        i18 = iA9 - 1;
                                    }
                                    jArr3[i16] = j10;
                                    iA8 = eVar.a();
                                    iArr[i16] = iA8;
                                    j11 += (long) iA8;
                                    if (iA8 > i15) {
                                        i15 = iA8;
                                    }
                                    jArr4[i16] = j9 + ((long) iJ);
                                    if (nszVar4 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArrCopyOf[i16] = i26;
                                    if (i16 == iA7) {
                                        iArrCopyOf[i16] = 1;
                                        i19--;
                                        if (i19 > 0) {
                                            nszVar4.getClass();
                                            iA7 = nszVar4.A() - 1;
                                        }
                                    }
                                    j9 += (long) iJ2;
                                    i13 = i21 - 1;
                                    if (i13 == 0) {
                                        i12 = i20;
                                    } else {
                                        i12 = i20;
                                    }
                                    j10 += (long) iArr[i16];
                                    i17--;
                                    i16++;
                                    iA7 = iA7;
                                    jArr3 = jArr3;
                                    iC = i25;
                                }
                                int[] iArr113 = iArrCopyOf;
                                i22 = i17;
                                long j21114 = j9 + ((long) iJ);
                                if (nszVar3 == null) {
                                    z4 = true;
                                    break;
                                }
                                while (true) {
                                    if (i14 <= 0) {
                                        z4 = true;
                                        break;
                                    }
                                    if (nszVar3.A() != 0) {
                                        z4 = false;
                                        break;
                                    }
                                    nszVar3.j();
                                    i14--;
                                }
                                if (i19 == 0) {
                                    StringBuilder sb110 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb110, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb110, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb110.append(i20);
                                    sb110.append(", remainingSamplesAtTimestampOffset ");
                                    sb110.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb110.append(str2);
                                    cft.g("BoxParsers", sb110.toString());
                                } else {
                                    StringBuilder sb111 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb111, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb111, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb111.append(i20);
                                    sb111.append(", remainingSamplesAtTimestampOffset ");
                                    sb111.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb111.append(str2);
                                    cft.g("BoxParsers", sb111.toString());
                                }
                                jArr6 = jArrCopyOf;
                                i23 = iC;
                                j12 = j21114;
                                iArr2 = iArrCopyOf2;
                                j13 = j11;
                                jArr7 = jArr5;
                                iArr3 = iArr113;
                                i24 = i15;
                            }
                            j14 = fjg0VarA.f;
                            if (j14 > 0) {
                                jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                if (jV5 > 0) {
                                    androidx.media3.common.a.C0062a c0062aA18 = aVar5.a();
                                    c0062aA18.h = (int) jV5;
                                    fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA18));
                                }
                            }
                            fjg0VarA2 = fjg0VarA;
                            j15 = fjg0VarA2.c;
                            aVar6 = fjg0VarA2.g;
                            i27 = fjg0VarA2.b;
                            jArr8 = fjg0VarA2.j;
                            jArr9 = fjg0VarA2.i;
                            RoundingMode roundingMode12 = RoundingMode.DOWN;
                            jV3 = jrh0.V(j12, 1000000L, j15, roundingMode12);
                            if (jArr9 == null) {
                                jrh0.U(jArr6, j15);
                                ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                            } else {
                                if (jArr9.length == 1) {
                                    i28 = i27;
                                } else {
                                    i28 = i27;
                                }
                                if (jArr9.length != 1) {
                                    i29 = 1;
                                } else if (jArr9[0] == 0) {
                                    jArr8.getClass();
                                    j20 = jArr8[0];
                                    while (i46 < jArr6.length) {
                                        jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                    }
                                    ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                } else {
                                    i29 = 1;
                                }
                                if (i28 == i29) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                iArr4 = new int[jArr9.length];
                                iArr5 = new int[jArr9.length];
                                jArr8.getClass();
                                i30 = 0;
                                i31 = 0;
                                i32 = 0;
                                z6 = false;
                                while (i32 < jArr9.length) {
                                    iArr9 = iArr5;
                                    j18 = jArr8[i32];
                                    if (j18 != -1) {
                                        i39 = i32;
                                        boolean z114 = z6;
                                        long jV117 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                        iArr4[i39] = jrh0.e(jArr6, j18, true);
                                        j19 = j18 + jV117;
                                        iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                        i40 = iArr4[i39];
                                        while (true) {
                                            i41 = iArr4[i39];
                                            if (i41 >= 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr4[i39] = i41 - 1;
                                        }
                                        if (i41 < 0) {
                                            iArr4[i39] = i40;
                                            while (true) {
                                                i45 = iArr4[i39];
                                                if (i45 < iArr9[i39]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr4[i39] = i45 + 1;
                                            }
                                        }
                                        if (i28 == 2) {
                                            while (true) {
                                                i43 = iArr9[i39];
                                                if (i43 >= jArr6.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i44 = i43 + 1;
                                                if (jArr6[i44] > j19) {
                                                    break;
                                                    break;
                                                }
                                                iArr9[i39] = i44;
                                            }
                                        }
                                        int i71115 = iArr9[i39];
                                        i42 = iArr4[i39];
                                        int i71116 = (i71115 - i42) + i30;
                                        if (i31 != i42) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z6 = z114 | z11;
                                        i31 = i71115;
                                        i30 = i71116;
                                    } else {
                                        i39 = i32;
                                    }
                                    i32 = i39 + 1;
                                    iArr5 = iArr9;
                                    i24 = i24;
                                }
                                iArr6 = iArr5;
                                i33 = i24;
                                boolean z115 = z6;
                                if (i30 != i23) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = z115 | z7;
                                if (z8) {
                                    jArr10 = new long[i30];
                                } else {
                                    jArr10 = jArr7;
                                }
                                if (z8) {
                                    iArr7 = new int[i30];
                                } else {
                                    iArr7 = iArr2;
                                }
                                if (z8) {
                                    i33 = 0;
                                }
                                if (z8) {
                                    iArr8 = new int[i30];
                                } else {
                                    iArr8 = iArr3;
                                }
                                jArr11 = new long[i30];
                                i34 = 0;
                                z9 = false;
                                i35 = 0;
                                i36 = i33;
                                j16 = 0;
                                while (i34 < jArr9.length) {
                                    j17 = jArr8[i34];
                                    jArr12 = jArr11;
                                    i37 = iArr4[i34];
                                    z10 = z8;
                                    i38 = iArr6[i34];
                                    int i71117 = i34;
                                    if (z10) {
                                        int i8114 = i38 - i37;
                                        System.arraycopy(jArr7, i37, jArr10, i35, i8114);
                                        System.arraycopy(iArr2, i37, iArr7, i35, i8114);
                                        System.arraycopy(iArr3, i37, iArr8, i35, i8114);
                                    }
                                    int i8115 = i36;
                                    while (i37 < i38) {
                                        int i8116 = i37;
                                        int i8117 = i38;
                                        long j21115 = fjg0VarA2.d;
                                        RoundingMode roundingMode13 = RoundingMode.DOWN;
                                        long jV118 = jrh0.V(j16, 1000000L, j21115, roundingMode13);
                                        jV4 = jrh0.V(jArr6[i8116] - j17, 1000000L, fjg0VarA2.c, roundingMode13);
                                        if (jV4 < 0) {
                                            z9 = true;
                                        }
                                        jArr12[i35] = jV118 + jV4;
                                        if (!z10) {
                                        }
                                        i35++;
                                        i37 = i8116 + 1;
                                        i38 = i8117;
                                    }
                                    j16 += jArr9[i71117];
                                    i36 = i8115;
                                    z8 = z10;
                                    i34 = i71117 + 1;
                                    jArr11 = jArr12;
                                }
                                long[] jArr26 = jArr11;
                                long jV119 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                if (z9) {
                                    androidx.media3.common.a.C0062a c0062aA19 = aVar6.a();
                                    c0062aA19.s = true;
                                    fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA19));
                                }
                                ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr26, iArr8, jV119);
                            }
                        }
                        arrayList3.add(ojg0Var);
                    }
                }
                fjg0Var = null;
                fjg0VarA = (fjg0) bajVar.apply(fjg0Var);
                if (fjg0VarA == null) {
                    arrayList = arrayList2;
                    arrayList3 = arrayList3;
                    i11 = i47;
                } else {
                    aVar4 = fjg0VarA.g;
                    c8w.a aVarB14 = aVar8.b(1835297121);
                    aVarB14.getClass();
                    c8w.a aVarB15 = aVarB14.b(1835626086);
                    aVarB15.getClass();
                    aVarB2 = aVarB15.b(1937007212);
                    aVarB2.getClass();
                    bVarC2 = aVarB2.c(1937011578);
                    if (bVarC2 != null) {
                        iVar = new h(bVarC2, aVar4);
                    } else {
                        bVarC3 = aVarB2.c(1937013298);
                        if (bVarC3 != null) {
                            throw ssz.a(null, "Track has no sample table size information");
                        }
                        iVar = new i(bVarC3);
                    }
                    iC = iVar.c();
                    if (iC == 0) {
                        i11 = i47;
                        ojg0Var = new ojg0(fjg0VarA, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList = arrayList2;
                    } else {
                        if (fjg0VarA.b == 2) {
                            j21 = fjg0VarA.f;
                            if (j21 > 0) {
                                androidx.media3.common.a.C0062a c0062aA110 = aVar4.a();
                                c0062aA110.x = iC / (j21 / 1000000.0f);
                                fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA110));
                            }
                        }
                        aVar5 = fjg0VarA.g;
                        bVarC4 = aVarB2.c(1937007471);
                        if (bVarC4 == null) {
                            bVarC4 = aVarB2.c(1668232756);
                            bVarC4.getClass();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        nsz nszVar17 = bVarC4.b;
                        c8w.b bVarC19 = aVarB2.c(1937011555);
                        bVarC19.getClass();
                        nsz nszVar18 = bVarC19.b;
                        c8w.b bVarC110 = aVarB2.c(1937011827);
                        bVarC110.getClass();
                        nsz nszVar19 = bVarC110.b;
                        bVarC5 = aVarB2.c(1937011571);
                        if (bVarC5 != null) {
                            nszVar2 = bVarC5.b;
                        } else {
                            nszVar2 = null;
                        }
                        arrayList = arrayList2;
                        bVarC6 = aVarB2.c(1668576371);
                        if (bVarC6 != null) {
                            nszVar3 = bVarC6.b;
                        } else {
                            nszVar3 = null;
                        }
                        bVar = new b(nszVar18, nszVar17, z3);
                        nszVar19.I(12);
                        iA = nszVar19.A() - 1;
                        iA2 = nszVar19.A();
                        iA3 = nszVar19.A();
                        if (nszVar3 != null) {
                            nszVar3.I(12);
                            iA4 = nszVar3.A();
                        } else {
                            iA4 = 0;
                        }
                        if (nszVar2 != null) {
                            nszVar2.I(12);
                            iA5 = nszVar2.A();
                            if (iA5 > 0) {
                                iA6 = nszVar2.A() - 1;
                                nszVar3 = nszVar3;
                            } else {
                                nszVar2 = null;
                            }
                            iB = iVar.b();
                            i11 = i47;
                            String str13 = aVar5.n;
                            if (iB == -1) {
                                jArr3 = new long[iC];
                                iArr = new int[iC];
                                jArr4 = new long[iC];
                                iArrCopyOf = new int[iC];
                                i12 = iA;
                                i13 = iA2;
                                nszVar4 = nszVar2;
                                i14 = iA4;
                                iA7 = iA6;
                                j9 = 0;
                                j10 = 0;
                                i15 = 0;
                                i16 = 0;
                                iJ = 0;
                                i17 = 0;
                                i18 = 0;
                                eVar = iVar;
                                i19 = iA5;
                                iJ2 = iA3;
                                j11 = 0;
                                while (true) {
                                    if (i16 >= iC) {
                                        long[] jArr1110 = jArr3;
                                        i20 = i12;
                                        i21 = i13;
                                        iArrCopyOf2 = iArr;
                                        jArrCopyOf = jArr4;
                                        jArr5 = jArr1110;
                                        break;
                                    }
                                    zA = true;
                                    while (i17 == 0) {
                                        zA = bVar.a();
                                        if (!zA) {
                                            break;
                                            break;
                                        }
                                        int i71118 = i12;
                                        long j21116 = bVar.d;
                                        i17 = bVar.c;
                                        j10 = j21116;
                                        i12 = i71118;
                                        i13 = i13;
                                        iC = iC;
                                    }
                                    i25 = iC;
                                    i20 = i12;
                                    i21 = i13;
                                    if (!zA) {
                                        cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                        long[] jArrCopyOf13 = Arrays.copyOf(jArr3, i16);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                        jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                        jArr5 = jArrCopyOf13;
                                        iC = i16;
                                        break;
                                    }
                                    if (nszVar3 != null) {
                                        iA9 = i18;
                                        while (iA9 == 0) {
                                            iA9 = nszVar3.A();
                                            iJ = nszVar3.j();
                                            i14--;
                                        }
                                        i18 = iA9 - 1;
                                    }
                                    jArr3[i16] = j10;
                                    iA8 = eVar.a();
                                    iArr[i16] = iA8;
                                    j11 += (long) iA8;
                                    if (iA8 > i15) {
                                        i15 = iA8;
                                    }
                                    jArr4[i16] = j9 + ((long) iJ);
                                    if (nszVar4 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArrCopyOf[i16] = i26;
                                    if (i16 == iA7) {
                                        iArrCopyOf[i16] = 1;
                                        i19--;
                                        if (i19 > 0) {
                                            nszVar4.getClass();
                                            iA7 = nszVar4.A() - 1;
                                        }
                                    }
                                    j9 += (long) iJ2;
                                    i13 = i21 - 1;
                                    if (i13 == 0) {
                                        i12 = i20;
                                    } else {
                                        i12 = i20;
                                    }
                                    j10 += (long) iArr[i16];
                                    i17--;
                                    i16++;
                                    iA7 = iA7;
                                    jArr3 = jArr3;
                                    iC = i25;
                                }
                                int[] iArr114 = iArrCopyOf;
                                i22 = i17;
                                long j21117 = j9 + ((long) iJ);
                                if (nszVar3 == null) {
                                    z4 = true;
                                    break;
                                }
                                while (true) {
                                    if (i14 <= 0) {
                                        z4 = true;
                                        break;
                                    }
                                    if (nszVar3.A() != 0) {
                                        z4 = false;
                                        break;
                                    }
                                    nszVar3.j();
                                    i14--;
                                }
                                if (i19 == 0) {
                                    StringBuilder sb112 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb112, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb112, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb112.append(i20);
                                    sb112.append(", remainingSamplesAtTimestampOffset ");
                                    sb112.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb112.append(str2);
                                    cft.g("BoxParsers", sb112.toString());
                                } else {
                                    StringBuilder sb113 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb113, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb113, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb113.append(i20);
                                    sb113.append(", remainingSamplesAtTimestampOffset ");
                                    sb113.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb113.append(str2);
                                    cft.g("BoxParsers", sb113.toString());
                                }
                                jArr6 = jArrCopyOf;
                                i23 = iC;
                                j12 = j21117;
                                iArr2 = iArrCopyOf2;
                                j13 = j11;
                                jArr7 = jArr5;
                                iArr3 = iArr114;
                                i24 = i15;
                            } else {
                                jArr3 = new long[iC];
                                iArr = new int[iC];
                                jArr4 = new long[iC];
                                iArrCopyOf = new int[iC];
                                i12 = iA;
                                i13 = iA2;
                                nszVar4 = nszVar2;
                                i14 = iA4;
                                iA7 = iA6;
                                j9 = 0;
                                j10 = 0;
                                i15 = 0;
                                i16 = 0;
                                iJ = 0;
                                i17 = 0;
                                i18 = 0;
                                eVar = iVar;
                                i19 = iA5;
                                iJ2 = iA3;
                                j11 = 0;
                                while (true) {
                                    if (i16 >= iC) {
                                        long[] jArr1111 = jArr3;
                                        i20 = i12;
                                        i21 = i13;
                                        iArrCopyOf2 = iArr;
                                        jArrCopyOf = jArr4;
                                        jArr5 = jArr1111;
                                        break;
                                    }
                                    zA = true;
                                    while (i17 == 0) {
                                        zA = bVar.a();
                                        if (!zA) {
                                            break;
                                            break;
                                        }
                                        int i71119 = i12;
                                        long j21118 = bVar.d;
                                        i17 = bVar.c;
                                        j10 = j21118;
                                        i12 = i71119;
                                        i13 = i13;
                                        iC = iC;
                                    }
                                    i25 = iC;
                                    i20 = i12;
                                    i21 = i13;
                                    if (!zA) {
                                        cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                        long[] jArrCopyOf14 = Arrays.copyOf(jArr3, i16);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                        jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                        jArr5 = jArrCopyOf14;
                                        iC = i16;
                                        break;
                                    }
                                    if (nszVar3 != null) {
                                        iA9 = i18;
                                        while (iA9 == 0) {
                                            iA9 = nszVar3.A();
                                            iJ = nszVar3.j();
                                            i14--;
                                        }
                                        i18 = iA9 - 1;
                                    }
                                    jArr3[i16] = j10;
                                    iA8 = eVar.a();
                                    iArr[i16] = iA8;
                                    j11 += (long) iA8;
                                    if (iA8 > i15) {
                                        i15 = iA8;
                                    }
                                    jArr4[i16] = j9 + ((long) iJ);
                                    if (nszVar4 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArrCopyOf[i16] = i26;
                                    if (i16 == iA7) {
                                        iArrCopyOf[i16] = 1;
                                        i19--;
                                        if (i19 > 0) {
                                            nszVar4.getClass();
                                            iA7 = nszVar4.A() - 1;
                                        }
                                    }
                                    j9 += (long) iJ2;
                                    i13 = i21 - 1;
                                    if (i13 == 0) {
                                        i12 = i20;
                                    } else {
                                        i12 = i20;
                                    }
                                    j10 += (long) iArr[i16];
                                    i17--;
                                    i16++;
                                    iA7 = iA7;
                                    jArr3 = jArr3;
                                    iC = i25;
                                }
                                int[] iArr115 = iArrCopyOf;
                                i22 = i17;
                                long j21119 = j9 + ((long) iJ);
                                if (nszVar3 == null) {
                                    z4 = true;
                                    break;
                                }
                                while (true) {
                                    if (i14 <= 0) {
                                        z4 = true;
                                        break;
                                    }
                                    if (nszVar3.A() != 0) {
                                        z4 = false;
                                        break;
                                    }
                                    nszVar3.j();
                                    i14--;
                                }
                                if (i19 == 0) {
                                    StringBuilder sb114 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb114, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb114, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb114.append(i20);
                                    sb114.append(", remainingSamplesAtTimestampOffset ");
                                    sb114.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb114.append(str2);
                                    cft.g("BoxParsers", sb114.toString());
                                } else {
                                    StringBuilder sb115 = new StringBuilder("Inconsistent stbl box for track ");
                                    d5d.a(sb115, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                    d5d.a(sb115, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                    sb115.append(i20);
                                    sb115.append(", remainingSamplesAtTimestampOffset ");
                                    sb115.append(i18);
                                    if (z4) {
                                        str2 = ", ctts invalid";
                                    } else {
                                        str2 = "";
                                    }
                                    sb115.append(str2);
                                    cft.g("BoxParsers", sb115.toString());
                                }
                                jArr6 = jArrCopyOf;
                                i23 = iC;
                                j12 = j21119;
                                iArr2 = iArrCopyOf2;
                                j13 = j11;
                                jArr7 = jArr5;
                                iArr3 = iArr115;
                                i24 = i15;
                            }
                            j14 = fjg0VarA.f;
                            if (j14 > 0) {
                                jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                if (jV5 > 0) {
                                    androidx.media3.common.a.C0062a c0062aA111 = aVar5.a();
                                    c0062aA111.h = (int) jV5;
                                    fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA111));
                                }
                            }
                            fjg0VarA2 = fjg0VarA;
                            j15 = fjg0VarA2.c;
                            aVar6 = fjg0VarA2.g;
                            i27 = fjg0VarA2.b;
                            jArr8 = fjg0VarA2.j;
                            jArr9 = fjg0VarA2.i;
                            RoundingMode roundingMode14 = RoundingMode.DOWN;
                            jV3 = jrh0.V(j12, 1000000L, j15, roundingMode14);
                            if (jArr9 == null) {
                                jrh0.U(jArr6, j15);
                                ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                            } else {
                                if (jArr9.length == 1) {
                                    i28 = i27;
                                } else {
                                    i28 = i27;
                                }
                                if (jArr9.length != 1) {
                                    i29 = 1;
                                } else if (jArr9[0] == 0) {
                                    jArr8.getClass();
                                    j20 = jArr8[0];
                                    while (i46 < jArr6.length) {
                                        jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                    }
                                    ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                                } else {
                                    i29 = 1;
                                }
                                if (i28 == i29) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                iArr4 = new int[jArr9.length];
                                iArr5 = new int[jArr9.length];
                                jArr8.getClass();
                                i30 = 0;
                                i31 = 0;
                                i32 = 0;
                                z6 = false;
                                while (i32 < jArr9.length) {
                                    iArr9 = iArr5;
                                    j18 = jArr8[i32];
                                    if (j18 != -1) {
                                        i39 = i32;
                                        boolean z116 = z6;
                                        long jV1110 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                        iArr4[i39] = jrh0.e(jArr6, j18, true);
                                        j19 = j18 + jV1110;
                                        iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                        i40 = iArr4[i39];
                                        while (true) {
                                            i41 = iArr4[i39];
                                            if (i41 >= 0) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr4[i39] = i41 - 1;
                                        }
                                        if (i41 < 0) {
                                            iArr4[i39] = i40;
                                            while (true) {
                                                i45 = iArr4[i39];
                                                if (i45 < iArr9[i39]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr4[i39] = i45 + 1;
                                            }
                                        }
                                        if (i28 == 2) {
                                            while (true) {
                                                i43 = iArr9[i39];
                                                if (i43 >= jArr6.length - 1) {
                                                    break;
                                                    break;
                                                }
                                                i44 = i43 + 1;
                                                if (jArr6[i44] > j19) {
                                                    break;
                                                    break;
                                                }
                                                iArr9[i39] = i44;
                                            }
                                        }
                                        int i711110 = iArr9[i39];
                                        i42 = iArr4[i39];
                                        int i711111 = (i711110 - i42) + i30;
                                        if (i31 != i42) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        z6 = z116 | z11;
                                        i31 = i711110;
                                        i30 = i711111;
                                    } else {
                                        i39 = i32;
                                    }
                                    i32 = i39 + 1;
                                    iArr5 = iArr9;
                                    i24 = i24;
                                }
                                iArr6 = iArr5;
                                i33 = i24;
                                boolean z117 = z6;
                                if (i30 != i23) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                z8 = z117 | z7;
                                if (z8) {
                                    jArr10 = new long[i30];
                                } else {
                                    jArr10 = jArr7;
                                }
                                if (z8) {
                                    iArr7 = new int[i30];
                                } else {
                                    iArr7 = iArr2;
                                }
                                if (z8) {
                                    i33 = 0;
                                }
                                if (z8) {
                                    iArr8 = new int[i30];
                                } else {
                                    iArr8 = iArr3;
                                }
                                jArr11 = new long[i30];
                                i34 = 0;
                                z9 = false;
                                i35 = 0;
                                i36 = i33;
                                j16 = 0;
                                while (i34 < jArr9.length) {
                                    j17 = jArr8[i34];
                                    jArr12 = jArr11;
                                    i37 = iArr4[i34];
                                    z10 = z8;
                                    i38 = iArr6[i34];
                                    int i711112 = i34;
                                    if (z10) {
                                        int i8118 = i38 - i37;
                                        System.arraycopy(jArr7, i37, jArr10, i35, i8118);
                                        System.arraycopy(iArr2, i37, iArr7, i35, i8118);
                                        System.arraycopy(iArr3, i37, iArr8, i35, i8118);
                                    }
                                    int i8119 = i36;
                                    while (i37 < i38) {
                                        int i81110 = i37;
                                        int i81111 = i38;
                                        long j211110 = fjg0VarA2.d;
                                        RoundingMode roundingMode15 = RoundingMode.DOWN;
                                        long jV1111 = jrh0.V(j16, 1000000L, j211110, roundingMode15);
                                        jV4 = jrh0.V(jArr6[i81110] - j17, 1000000L, fjg0VarA2.c, roundingMode15);
                                        if (jV4 < 0) {
                                            z9 = true;
                                        }
                                        jArr12[i35] = jV1111 + jV4;
                                        if (!z10) {
                                        }
                                        i35++;
                                        i37 = i81110 + 1;
                                        i38 = i81111;
                                    }
                                    j16 += jArr9[i711112];
                                    i36 = i8119;
                                    z8 = z10;
                                    i34 = i711112 + 1;
                                    jArr11 = jArr12;
                                }
                                long[] jArr27 = jArr11;
                                long jV1112 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                                if (z9) {
                                    androidx.media3.common.a.C0062a c0062aA112 = aVar6.a();
                                    c0062aA112.s = true;
                                    fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA112));
                                }
                                ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr27, iArr8, jV1112);
                            }
                        } else {
                            iA5 = 0;
                        }
                        iA6 = -1;
                        iB = iVar.b();
                        i11 = i47;
                        String str14 = aVar5.n;
                        if (iB == -1) {
                            jArr3 = new long[iC];
                            iArr = new int[iC];
                            jArr4 = new long[iC];
                            iArrCopyOf = new int[iC];
                            i12 = iA;
                            i13 = iA2;
                            nszVar4 = nszVar2;
                            i14 = iA4;
                            iA7 = iA6;
                            j9 = 0;
                            j10 = 0;
                            i15 = 0;
                            i16 = 0;
                            iJ = 0;
                            i17 = 0;
                            i18 = 0;
                            eVar = iVar;
                            i19 = iA5;
                            iJ2 = iA3;
                            j11 = 0;
                            while (true) {
                                if (i16 >= iC) {
                                    long[] jArr1112 = jArr3;
                                    i20 = i12;
                                    i21 = i13;
                                    iArrCopyOf2 = iArr;
                                    jArrCopyOf = jArr4;
                                    jArr5 = jArr1112;
                                    break;
                                }
                                zA = true;
                                while (i17 == 0) {
                                    zA = bVar.a();
                                    if (!zA) {
                                        break;
                                        break;
                                    }
                                    int i711113 = i12;
                                    long j211111 = bVar.d;
                                    i17 = bVar.c;
                                    j10 = j211111;
                                    i12 = i711113;
                                    i13 = i13;
                                    iC = iC;
                                }
                                i25 = iC;
                                i20 = i12;
                                i21 = i13;
                                if (!zA) {
                                    cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                    long[] jArrCopyOf15 = Arrays.copyOf(jArr3, i16);
                                    iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                    jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                    jArr5 = jArrCopyOf15;
                                    iC = i16;
                                    break;
                                }
                                if (nszVar3 != null) {
                                    iA9 = i18;
                                    while (iA9 == 0) {
                                        iA9 = nszVar3.A();
                                        iJ = nszVar3.j();
                                        i14--;
                                    }
                                    i18 = iA9 - 1;
                                }
                                jArr3[i16] = j10;
                                iA8 = eVar.a();
                                iArr[i16] = iA8;
                                j11 += (long) iA8;
                                if (iA8 > i15) {
                                    i15 = iA8;
                                }
                                jArr4[i16] = j9 + ((long) iJ);
                                if (nszVar4 == null) {
                                    i26 = 1;
                                } else {
                                    i26 = 0;
                                }
                                iArrCopyOf[i16] = i26;
                                if (i16 == iA7) {
                                    iArrCopyOf[i16] = 1;
                                    i19--;
                                    if (i19 > 0) {
                                        nszVar4.getClass();
                                        iA7 = nszVar4.A() - 1;
                                    }
                                }
                                j9 += (long) iJ2;
                                i13 = i21 - 1;
                                if (i13 == 0) {
                                    i12 = i20;
                                } else {
                                    i12 = i20;
                                }
                                j10 += (long) iArr[i16];
                                i17--;
                                i16++;
                                iA7 = iA7;
                                jArr3 = jArr3;
                                iC = i25;
                            }
                            int[] iArr116 = iArrCopyOf;
                            i22 = i17;
                            long j211112 = j9 + ((long) iJ);
                            if (nszVar3 == null) {
                                z4 = true;
                                break;
                            }
                            while (true) {
                                if (i14 <= 0) {
                                    z4 = true;
                                    break;
                                }
                                if (nszVar3.A() != 0) {
                                    z4 = false;
                                    break;
                                }
                                nszVar3.j();
                                i14--;
                            }
                            if (i19 == 0) {
                                StringBuilder sb116 = new StringBuilder("Inconsistent stbl box for track ");
                                d5d.a(sb116, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                d5d.a(sb116, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                sb116.append(i20);
                                sb116.append(", remainingSamplesAtTimestampOffset ");
                                sb116.append(i18);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb116.append(str2);
                                cft.g("BoxParsers", sb116.toString());
                            } else {
                                StringBuilder sb117 = new StringBuilder("Inconsistent stbl box for track ");
                                d5d.a(sb117, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                d5d.a(sb117, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                sb117.append(i20);
                                sb117.append(", remainingSamplesAtTimestampOffset ");
                                sb117.append(i18);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb117.append(str2);
                                cft.g("BoxParsers", sb117.toString());
                            }
                            jArr6 = jArrCopyOf;
                            i23 = iC;
                            j12 = j211112;
                            iArr2 = iArrCopyOf2;
                            j13 = j11;
                            jArr7 = jArr5;
                            iArr3 = iArr116;
                            i24 = i15;
                        } else {
                            jArr3 = new long[iC];
                            iArr = new int[iC];
                            jArr4 = new long[iC];
                            iArrCopyOf = new int[iC];
                            i12 = iA;
                            i13 = iA2;
                            nszVar4 = nszVar2;
                            i14 = iA4;
                            iA7 = iA6;
                            j9 = 0;
                            j10 = 0;
                            i15 = 0;
                            i16 = 0;
                            iJ = 0;
                            i17 = 0;
                            i18 = 0;
                            eVar = iVar;
                            i19 = iA5;
                            iJ2 = iA3;
                            j11 = 0;
                            while (true) {
                                if (i16 >= iC) {
                                    long[] jArr1113 = jArr3;
                                    i20 = i12;
                                    i21 = i13;
                                    iArrCopyOf2 = iArr;
                                    jArrCopyOf = jArr4;
                                    jArr5 = jArr1113;
                                    break;
                                }
                                zA = true;
                                while (i17 == 0) {
                                    zA = bVar.a();
                                    if (!zA) {
                                        break;
                                        break;
                                    }
                                    int i711114 = i12;
                                    long j211113 = bVar.d;
                                    i17 = bVar.c;
                                    j10 = j211113;
                                    i12 = i711114;
                                    i13 = i13;
                                    iC = iC;
                                }
                                i25 = iC;
                                i20 = i12;
                                i21 = i13;
                                if (!zA) {
                                    cft.g("BoxParsers", oAudzpbdOhCI.CJgb);
                                    long[] jArrCopyOf16 = Arrays.copyOf(jArr3, i16);
                                    iArrCopyOf2 = Arrays.copyOf(iArr, i16);
                                    jArrCopyOf = Arrays.copyOf(jArr4, i16);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                                    jArr5 = jArrCopyOf16;
                                    iC = i16;
                                    break;
                                }
                                if (nszVar3 != null) {
                                    iA9 = i18;
                                    while (iA9 == 0) {
                                        iA9 = nszVar3.A();
                                        iJ = nszVar3.j();
                                        i14--;
                                    }
                                    i18 = iA9 - 1;
                                }
                                jArr3[i16] = j10;
                                iA8 = eVar.a();
                                iArr[i16] = iA8;
                                j11 += (long) iA8;
                                if (iA8 > i15) {
                                    i15 = iA8;
                                }
                                jArr4[i16] = j9 + ((long) iJ);
                                if (nszVar4 == null) {
                                    i26 = 1;
                                } else {
                                    i26 = 0;
                                }
                                iArrCopyOf[i16] = i26;
                                if (i16 == iA7) {
                                    iArrCopyOf[i16] = 1;
                                    i19--;
                                    if (i19 > 0) {
                                        nszVar4.getClass();
                                        iA7 = nszVar4.A() - 1;
                                    }
                                }
                                j9 += (long) iJ2;
                                i13 = i21 - 1;
                                if (i13 == 0) {
                                    i12 = i20;
                                } else {
                                    i12 = i20;
                                }
                                j10 += (long) iArr[i16];
                                i17--;
                                i16++;
                                iA7 = iA7;
                                jArr3 = jArr3;
                                iC = i25;
                            }
                            int[] iArr117 = iArrCopyOf;
                            i22 = i17;
                            long j211114 = j9 + ((long) iJ);
                            if (nszVar3 == null) {
                                z4 = true;
                                break;
                            }
                            while (true) {
                                if (i14 <= 0) {
                                    z4 = true;
                                    break;
                                }
                                if (nszVar3.A() != 0) {
                                    z4 = false;
                                    break;
                                }
                                nszVar3.j();
                                i14--;
                            }
                            if (i19 == 0) {
                                StringBuilder sb118 = new StringBuilder("Inconsistent stbl box for track ");
                                d5d.a(sb118, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                d5d.a(sb118, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                sb118.append(i20);
                                sb118.append(", remainingSamplesAtTimestampOffset ");
                                sb118.append(i18);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb118.append(str2);
                                cft.g("BoxParsers", sb118.toString());
                            } else {
                                StringBuilder sb119 = new StringBuilder("Inconsistent stbl box for track ");
                                d5d.a(sb119, fjg0VarA.a, ": remainingSynchronizationSamples ", i19, ", remainingSamplesAtTimestampDelta ");
                                d5d.a(sb119, i21, ", remainingSamplesInChunk ", i22, ", remainingTimestampDeltaChanges ");
                                sb119.append(i20);
                                sb119.append(", remainingSamplesAtTimestampOffset ");
                                sb119.append(i18);
                                if (z4) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb119.append(str2);
                                cft.g("BoxParsers", sb119.toString());
                            }
                            jArr6 = jArrCopyOf;
                            i23 = iC;
                            j12 = j211114;
                            iArr2 = iArrCopyOf2;
                            j13 = j11;
                            jArr7 = jArr5;
                            iArr3 = iArr117;
                            i24 = i15;
                        }
                        j14 = fjg0VarA.f;
                        if (j14 > 0) {
                            jV5 = jrh0.V(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                            if (jV5 > 0) {
                                androidx.media3.common.a.C0062a c0062aA113 = aVar5.a();
                                c0062aA113.h = (int) jV5;
                                fjg0VarA = fjg0VarA.a(new androidx.media3.common.a(c0062aA113));
                            }
                        }
                        fjg0VarA2 = fjg0VarA;
                        j15 = fjg0VarA2.c;
                        aVar6 = fjg0VarA2.g;
                        i27 = fjg0VarA2.b;
                        jArr8 = fjg0VarA2.j;
                        jArr9 = fjg0VarA2.i;
                        RoundingMode roundingMode16 = RoundingMode.DOWN;
                        jV3 = jrh0.V(j12, 1000000L, j15, roundingMode16);
                        if (jArr9 == null) {
                            jrh0.U(jArr6, j15);
                            ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jV3);
                        } else {
                            if (jArr9.length == 1) {
                                i28 = i27;
                            } else {
                                i28 = i27;
                            }
                            if (jArr9.length != 1) {
                                i29 = 1;
                            } else if (jArr9[0] == 0) {
                                jArr8.getClass();
                                j20 = jArr8[0];
                                while (i46 < jArr6.length) {
                                    jArr6[i46] = jrh0.V(jArr6[i46] - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN);
                                }
                                ojg0Var = new ojg0(fjg0VarA2, jArr7, iArr2, i24, jArr6, iArr3, jrh0.V(j12 - j20, 1000000L, fjg0VarA2.c, RoundingMode.DOWN));
                            } else {
                                i29 = 1;
                            }
                            if (i28 == i29) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            iArr4 = new int[jArr9.length];
                            iArr5 = new int[jArr9.length];
                            jArr8.getClass();
                            i30 = 0;
                            i31 = 0;
                            i32 = 0;
                            z6 = false;
                            while (i32 < jArr9.length) {
                                iArr9 = iArr5;
                                j18 = jArr8[i32];
                                if (j18 != -1) {
                                    i39 = i32;
                                    boolean z118 = z6;
                                    long jV1113 = jrh0.V(jArr9[i32], fjg0VarA2.c, fjg0VarA2.d, RoundingMode.DOWN);
                                    iArr4[i39] = jrh0.e(jArr6, j18, true);
                                    j19 = j18 + jV1113;
                                    iArr9[i39] = jrh0.a(jArr6, j19, z5);
                                    i40 = iArr4[i39];
                                    while (true) {
                                        i41 = iArr4[i39];
                                        if (i41 >= 0) {
                                            break;
                                            break;
                                        }
                                        break;
                                        break;
                                        iArr4[i39] = i41 - 1;
                                    }
                                    if (i41 < 0) {
                                        iArr4[i39] = i40;
                                        while (true) {
                                            i45 = iArr4[i39];
                                            if (i45 < iArr9[i39]) {
                                                break;
                                                break;
                                            }
                                            break;
                                            break;
                                            iArr4[i39] = i45 + 1;
                                        }
                                    }
                                    if (i28 == 2) {
                                        while (true) {
                                            i43 = iArr9[i39];
                                            if (i43 >= jArr6.length - 1) {
                                                break;
                                                break;
                                            }
                                            i44 = i43 + 1;
                                            if (jArr6[i44] > j19) {
                                                break;
                                                break;
                                            }
                                            iArr9[i39] = i44;
                                        }
                                    }
                                    int i711115 = iArr9[i39];
                                    i42 = iArr4[i39];
                                    int i711116 = (i711115 - i42) + i30;
                                    if (i31 != i42) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z6 = z118 | z11;
                                    i31 = i711115;
                                    i30 = i711116;
                                } else {
                                    i39 = i32;
                                }
                                i32 = i39 + 1;
                                iArr5 = iArr9;
                                i24 = i24;
                            }
                            iArr6 = iArr5;
                            i33 = i24;
                            boolean z119 = z6;
                            if (i30 != i23) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 = z119 | z7;
                            if (z8) {
                                jArr10 = new long[i30];
                            } else {
                                jArr10 = jArr7;
                            }
                            if (z8) {
                                iArr7 = new int[i30];
                            } else {
                                iArr7 = iArr2;
                            }
                            if (z8) {
                                i33 = 0;
                            }
                            if (z8) {
                                iArr8 = new int[i30];
                            } else {
                                iArr8 = iArr3;
                            }
                            jArr11 = new long[i30];
                            i34 = 0;
                            z9 = false;
                            i35 = 0;
                            i36 = i33;
                            j16 = 0;
                            while (i34 < jArr9.length) {
                                j17 = jArr8[i34];
                                jArr12 = jArr11;
                                i37 = iArr4[i34];
                                z10 = z8;
                                i38 = iArr6[i34];
                                int i711117 = i34;
                                if (z10) {
                                    int i81112 = i38 - i37;
                                    System.arraycopy(jArr7, i37, jArr10, i35, i81112);
                                    System.arraycopy(iArr2, i37, iArr7, i35, i81112);
                                    System.arraycopy(iArr3, i37, iArr8, i35, i81112);
                                }
                                int i81113 = i36;
                                while (i37 < i38) {
                                    int i81114 = i37;
                                    int i81115 = i38;
                                    long j211115 = fjg0VarA2.d;
                                    RoundingMode roundingMode17 = RoundingMode.DOWN;
                                    long jV1114 = jrh0.V(j16, 1000000L, j211115, roundingMode17);
                                    jV4 = jrh0.V(jArr6[i81114] - j17, 1000000L, fjg0VarA2.c, roundingMode17);
                                    if (jV4 < 0) {
                                        z9 = true;
                                    }
                                    jArr12[i35] = jV1114 + jV4;
                                    if (!z10) {
                                    }
                                    i35++;
                                    i37 = i81114 + 1;
                                    i38 = i81115;
                                }
                                j16 += jArr9[i711117];
                                i36 = i81113;
                                z8 = z10;
                                i34 = i711117 + 1;
                                jArr11 = jArr12;
                            }
                            long[] jArr28 = jArr11;
                            long jV1115 = jrh0.V(j16, 1000000L, fjg0VarA2.d, RoundingMode.DOWN);
                            if (z9) {
                                androidx.media3.common.a.C0062a c0062aA114 = aVar6.a();
                                c0062aA114.s = true;
                                fjg0VarA2 = fjg0VarA2.a(new androidx.media3.common.a(c0062aA114));
                            }
                            ojg0Var = new ojg0(fjg0VarA2, jArr10, iArr7, i36, jArr28, iArr8, jV1115);
                        }
                    }
                    arrayList3.add(ojg0Var);
                }
            }
            i47 = i11 + 1;
            arrayList3 = arrayList3;
            arrayList2 = arrayList;
            aVar7 = aVar;
        }
        return arrayList3;
    }
}
