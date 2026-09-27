package te;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.vungle.ads.internal.protos.Sdk;
import eh.o1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f136494a = 80000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f136495b = 768000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136496c = 3062500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136497d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136498e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136499f = 256;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f136500g = 1536;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f136501h = {1, 2, 3, 6};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f136502i = {48000, 44100, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f136503j = {24000, 22050, 16000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f136504k = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f136505l = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f136506m = {69, 87, 104, 121, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: te.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1405b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f136507h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f136508i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f136509j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f136510k = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f136511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f136512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f136513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f136514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f136515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f136516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f136517g;

        /* JADX INFO: renamed from: te.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C1405b(@Nullable String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f136511a = str;
            this.f136512b = i10;
            this.f136514d = i11;
            this.f136513c = i12;
            this.f136515e = i13;
            this.f136516f = i14;
            this.f136517g = i15;
        }
    }

    public static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((o1.V(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f136502i;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f136506m;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f136505l[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static n2 d(eh.t0 t0Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        eh.s0 s0Var = new eh.s0();
        s0Var.n(t0Var);
        int i10 = f136502i[s0Var.h(2)];
        s0Var.s(8);
        int i11 = f136504k[s0Var.h(3)];
        if (s0Var.h(1) != 0) {
            i11++;
        }
        int i12 = f136505l[s0Var.h(5)] * 1000;
        s0Var.c();
        t0Var.Y(s0Var.d());
        return new n2.b().U(str).g0("audio/ac3").J(i11).h0(i10).O(drmInitData).X(str2).I(i12).b0(i12).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f136501h[((byteBuffer.get(byteBuffer.position() + 4) & l3.a.f103436o7) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C1405b f(eh.s0 s0Var) {
        int iC;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iE = s0Var.e();
        s0Var.s(40);
        boolean z10 = s0Var.h(5) > 10;
        s0Var.q(iE);
        int i19 = -1;
        if (z10) {
            s0Var.s(16);
            int iH = s0Var.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            s0Var.s(3);
            iC = (s0Var.h(11) + 1) * 2;
            int iH2 = s0Var.h(2);
            if (iH2 == 3) {
                i10 = f136503j[s0Var.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = s0Var.h(2);
                int i20 = f136501h[iH3];
                i14 = iH3;
                i10 = f136502i[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = s0Var.h(3);
            boolean zG = s0Var.g();
            i11 = f136504k[iH4] + (zG ? 1 : 0);
            s0Var.s(10);
            if (s0Var.g()) {
                s0Var.s(8);
            }
            if (iH4 == 0) {
                s0Var.s(5);
                if (s0Var.g()) {
                    s0Var.s(8);
                }
            }
            if (i19 == 1 && s0Var.g()) {
                s0Var.s(16);
            }
            if (s0Var.g()) {
                if (iH4 > 2) {
                    s0Var.s(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    s0Var.s(6);
                }
                if ((iH4 & 4) != 0) {
                    s0Var.s(i17);
                }
                if (zG && s0Var.g()) {
                    s0Var.s(5);
                }
                if (i19 == 0) {
                    if (s0Var.g()) {
                        i18 = 6;
                        s0Var.s(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && s0Var.g()) {
                        s0Var.s(i18);
                    }
                    if (s0Var.g()) {
                        s0Var.s(i18);
                    }
                    int iH5 = s0Var.h(2);
                    if (iH5 == 1) {
                        s0Var.s(5);
                    } else if (iH5 == 2) {
                        s0Var.s(12);
                    } else if (iH5 == 3) {
                        int iH6 = s0Var.h(5);
                        if (s0Var.g()) {
                            s0Var.s(5);
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                s0Var.s(4);
                            }
                            if (s0Var.g()) {
                                if (s0Var.g()) {
                                    s0Var.s(4);
                                }
                                if (s0Var.g()) {
                                    s0Var.s(4);
                                }
                            }
                        }
                        if (s0Var.g()) {
                            s0Var.s(5);
                            if (s0Var.g()) {
                                s0Var.s(7);
                                if (s0Var.g()) {
                                    s0Var.s(8);
                                }
                            }
                        }
                        s0Var.s((iH6 + 2) * 8);
                        s0Var.c();
                    }
                    if (iH4 < 2) {
                        if (s0Var.g()) {
                            s0Var.s(14);
                        }
                        if (iH4 == 0 && s0Var.g()) {
                            s0Var.s(14);
                        }
                    }
                    if (s0Var.g()) {
                        if (i14 == 0) {
                            s0Var.s(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (s0Var.g()) {
                                    s0Var.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (s0Var.g()) {
                s0Var.s(5);
                if (iH4 == 2) {
                    s0Var.s(4);
                }
                if (iH4 >= 6) {
                    s0Var.s(2);
                }
                if (s0Var.g()) {
                    s0Var.s(8);
                }
                if (iH4 == 0 && s0Var.g()) {
                    s0Var.s(8);
                }
                if (iH2 < 3) {
                    s0Var.r();
                }
            }
            if (i19 == 0 && i14 != 3) {
                s0Var.r();
            }
            if (i19 == 2 && (i14 == 3 || s0Var.g())) {
                i16 = 6;
                s0Var.s(6);
            } else {
                i16 = 6;
            }
            str = (s0Var.g() && s0Var.h(i16) == 1 && s0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            s0Var.s(32);
            int iH7 = s0Var.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = s0Var.h(6);
            int i22 = f136505l[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            s0Var.s(8);
            int iH9 = s0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                s0Var.s(2);
            }
            if ((iH9 & 4) != 0) {
                s0Var.s(2);
            }
            if (iH9 == 2) {
                s0Var.s(2);
            }
            int[] iArr = f136502i;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f136504k[iH9] + (s0Var.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C1405b(str, i19, i11, i10, iC, i12, i13);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & l3.a.f103436o7) >> 6, b10 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static n2 h(eh.t0 t0Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        String str3;
        eh.s0 s0Var = new eh.s0();
        s0Var.n(t0Var);
        int iH = s0Var.h(13) * 1000;
        s0Var.s(3);
        int i10 = f136502i[s0Var.h(2)];
        s0Var.s(10);
        int i11 = f136504k[s0Var.h(3)];
        if (s0Var.h(1) != 0) {
            i11++;
        }
        s0Var.s(3);
        int iH2 = s0Var.h(4);
        s0Var.s(1);
        if (iH2 > 0) {
            s0Var.s(6);
            if (s0Var.h(1) != 0) {
                i11 += 2;
            }
            s0Var.s(1);
        }
        if (s0Var.b() > 7) {
            s0Var.s(7);
            if (s0Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        s0Var.c();
        t0Var.Y(s0Var.d());
        return new n2.b().U(str).g0(str3).J(i11).h0(i10).O(drmInitData).X(str2).b0(iH).G();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
