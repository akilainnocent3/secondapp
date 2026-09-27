package f6;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83329a = 80000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83330b = 768000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83331c = 3062500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83332d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83333e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83334f = 256;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83335g = 1536;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f83336h = {1, 2, 3, 6};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f83337i = {48000, 44100, 32000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f83338j = {24000, 22050, 16000};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f83339k = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f83340l = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f83341m = {69, 87, 104, 121, 139, 174, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: f6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0821b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f83342h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f83343i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f83344j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f83345k = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f83346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f83348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f83349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f83350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f83351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f83352g;

        /* JADX INFO: renamed from: f6.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public C0821b(@Nullable String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f83346a = str;
            this.f83347b = i10;
            this.f83349d = i11;
            this.f83348c = i12;
            this.f83350e = i13;
            this.f83351f = i14;
            this.f83352g = i15;
        }
    }

    public static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((b2.h0(byteBuffer, i10 + 4) & (-2)) == -126718022) {
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
        int[] iArr = f83337i;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f83341m;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f83340l[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static androidx.media3.common.a d(x4.v0 v0Var, String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        x4.u0 u0Var = new x4.u0();
        u0Var.n(v0Var);
        int i10 = f83337i[u0Var.h(2)];
        u0Var.s(8);
        int i11 = f83339k[u0Var.h(3)];
        if (u0Var.h(1) != 0) {
            i11++;
        }
        int i12 = f83340l[u0Var.h(5)] * 1000;
        u0Var.c();
        v0Var.j0(u0Var.d());
        return new androidx.media3.common.a.b().k0(str).A0("audio/ac3").U(i11).B0(i10).d0(drmInitData).o0(str2).T(i12).u0(i12).Q();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f83336h[((byteBuffer.get(byteBuffer.position() + 4) & l3.a.f103436o7) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0821b f(x4.u0 u0Var) {
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
        int iE = u0Var.e();
        u0Var.s(40);
        boolean z10 = u0Var.h(5) > 10;
        u0Var.q(iE);
        int i19 = -1;
        if (z10) {
            u0Var.s(16);
            int iH = u0Var.h(2);
            if (iH == 0) {
                i19 = 0;
            } else if (iH == 1) {
                i19 = 1;
            } else if (iH == 2) {
                i19 = 2;
            }
            u0Var.s(3);
            iC = (u0Var.h(11) + 1) * 2;
            int iH2 = u0Var.h(2);
            if (iH2 == 3) {
                i10 = f83338j[u0Var.h(2)];
                i14 = 3;
                i15 = 6;
            } else {
                int iH3 = u0Var.h(2);
                int i20 = f83336h[iH3];
                i14 = iH3;
                i10 = f83337i[iH2];
                i15 = i20;
            }
            i12 = i15 * 256;
            int iA = a(iC, i10, i15);
            int iH4 = u0Var.h(3);
            boolean zG = u0Var.g();
            i11 = f83339k[iH4] + (zG ? 1 : 0);
            u0Var.s(10);
            if (u0Var.g()) {
                u0Var.s(8);
            }
            if (iH4 == 0) {
                u0Var.s(5);
                if (u0Var.g()) {
                    u0Var.s(8);
                }
            }
            if (i19 == 1 && u0Var.g()) {
                u0Var.s(16);
            }
            if (u0Var.g()) {
                if (iH4 > 2) {
                    u0Var.s(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i17 = 6;
                } else {
                    i17 = 6;
                    u0Var.s(6);
                }
                if ((iH4 & 4) != 0) {
                    u0Var.s(i17);
                }
                if (zG && u0Var.g()) {
                    u0Var.s(5);
                }
                if (i19 == 0) {
                    if (u0Var.g()) {
                        i18 = 6;
                        u0Var.s(6);
                    } else {
                        i18 = 6;
                    }
                    if (iH4 == 0 && u0Var.g()) {
                        u0Var.s(i18);
                    }
                    if (u0Var.g()) {
                        u0Var.s(i18);
                    }
                    int iH5 = u0Var.h(2);
                    if (iH5 == 1) {
                        u0Var.s(5);
                    } else if (iH5 == 2) {
                        u0Var.s(12);
                    } else if (iH5 == 3) {
                        int iH6 = u0Var.h(5);
                        if (u0Var.g()) {
                            u0Var.s(5);
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                u0Var.s(4);
                            }
                            if (u0Var.g()) {
                                if (u0Var.g()) {
                                    u0Var.s(4);
                                }
                                if (u0Var.g()) {
                                    u0Var.s(4);
                                }
                            }
                        }
                        if (u0Var.g()) {
                            u0Var.s(5);
                            if (u0Var.g()) {
                                u0Var.s(7);
                                if (u0Var.g()) {
                                    u0Var.s(8);
                                }
                            }
                        }
                        u0Var.s((iH6 + 2) * 8);
                        u0Var.c();
                    }
                    if (iH4 < 2) {
                        if (u0Var.g()) {
                            u0Var.s(14);
                        }
                        if (iH4 == 0 && u0Var.g()) {
                            u0Var.s(14);
                        }
                    }
                    if (u0Var.g()) {
                        if (i14 == 0) {
                            u0Var.s(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (u0Var.g()) {
                                    u0Var.s(5);
                                }
                            }
                        }
                    }
                }
            }
            if (u0Var.g()) {
                u0Var.s(5);
                if (iH4 == 2) {
                    u0Var.s(4);
                }
                if (iH4 >= 6) {
                    u0Var.s(2);
                }
                if (u0Var.g()) {
                    u0Var.s(8);
                }
                if (iH4 == 0 && u0Var.g()) {
                    u0Var.s(8);
                }
                if (iH2 < 3) {
                    u0Var.r();
                }
            }
            if (i19 == 0 && i14 != 3) {
                u0Var.r();
            }
            if (i19 == 2 && (i14 == 3 || u0Var.g())) {
                i16 = 6;
                u0Var.s(6);
            } else {
                i16 = 6;
            }
            str = (u0Var.g() && u0Var.h(i16) == 1 && u0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = iA;
        } else {
            u0Var.s(32);
            int iH7 = u0Var.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = u0Var.h(6);
            int i22 = f83340l[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            u0Var.s(8);
            int iH9 = u0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                u0Var.s(2);
            }
            if ((iH9 & 4) != 0) {
                u0Var.s(2);
            }
            if (iH9 == 2) {
                u0Var.s(2);
            }
            int[] iArr = f83337i;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = f83339k[iH9] + (u0Var.g() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i22;
        }
        return new C0821b(str, i19, i11, i10, iC, i12, i13);
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
    public static androidx.media3.common.a h(x4.v0 v0Var, String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        String str3;
        x4.u0 u0Var = new x4.u0();
        u0Var.n(v0Var);
        int iH = u0Var.h(13) * 1000;
        u0Var.s(3);
        int i10 = f83337i[u0Var.h(2)];
        u0Var.s(10);
        int i11 = f83339k[u0Var.h(3)];
        if (u0Var.h(1) != 0) {
            i11++;
        }
        u0Var.s(3);
        int iH2 = u0Var.h(4);
        u0Var.s(1);
        if (iH2 > 0) {
            u0Var.s(6);
            if (u0Var.h(1) != 0) {
                i11 += 2;
            }
            u0Var.s(1);
        }
        if (u0Var.b() > 7) {
            u0Var.s(7);
            if (u0Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        u0Var.c();
        v0Var.j0(u0Var.d());
        return new androidx.media3.common.a.b().k0(str).A0(str3).U(i11).B0(i10).d0(drmInitData).o0(str2).u0(iH).Q();
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
