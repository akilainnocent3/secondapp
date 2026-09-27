package yads;

import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ht extends pt {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f150276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f150277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f150278j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f150282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f150283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f150284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f150285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f150286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f150287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f150288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f150289u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f150291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f150292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f150273y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f150274z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, p1.a.f120313c, -256, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, SignalKey.EVENT_ID, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, x6.f.f144638w2, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {r1.o.f123455u, 201, 211, 218, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 217, qb.d.f122118j, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f150275g = new jb2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f150280l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gt f150281m = new gt(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f150290v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f150279k = 16000000;

    public ht(String str, int i10) {
        this.f150276h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f150278j = 0;
            this.f150277i = 0;
        } else if (i10 == 2) {
            this.f150278j = 1;
            this.f150277i = 0;
        } else if (i10 == 3) {
            this.f150278j = 0;
            this.f150277i = 1;
        } else if (i10 != 4) {
            ih1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f150278j = 0;
            this.f150277i = 0;
        } else {
            this.f150278j = 1;
            this.f150277i = 1;
        }
        a(0);
        h();
        this.f150291w = true;
        this.f150292x = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x01eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:149:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0202  */
    /* JADX WARN: Code duplicated, block: B:152:0x0207  */
    /* JADX WARN: Code duplicated, block: B:153:0x0212  */
    /* JADX WARN: Code duplicated, block: B:154:0x0217 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0219  */
    /* JADX WARN: Code duplicated, block: B:157:0x0223  */
    /* JADX WARN: Code duplicated, block: B:162:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x025a A[LOOP:1: B:163:0x0252->B:165:0x025a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0260  */
    /* JADX WARN: Code duplicated, block: B:168:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268  */
    /* JADX WARN: Code duplicated, block: B:170:0x026d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0274  */
    /* JADX WARN: Code duplicated, block: B:172:0x027f  */
    /* JADX WARN: Code duplicated, block: B:173:0x028a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0295  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:176:0x029f  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:201:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0154  */
    @Override // yads.pt
    public final void a(nt ntVar) {
        boolean z10;
        int i10;
        gt gtVar;
        int[] iArr;
        char c10;
        gt gtVar2;
        char c11;
        int i11;
        int i12;
        int i13;
        gt gtVar3;
        gt gtVar4;
        int iMin;
        ByteBuffer byteBuffer = ntVar.f155332d;
        byteBuffer.getClass();
        jb2 jb2Var = this.f150275g;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        jb2Var.f151001a = bArrArray;
        jb2Var.f151003c = iLimit;
        jb2Var.f151002b = 0;
        boolean z11 = false;
        while (true) {
            jb2 jb2Var2 = this.f150275g;
            int i14 = jb2Var2.f151003c - jb2Var2.f151002b;
            int i15 = this.f150276h;
            if (i14 < i15) {
                if (z11) {
                    int i16 = this.f150284p;
                    if (i16 == 1 || i16 == 3) {
                        this.f150282n = g();
                        this.f150292x = this.f154121e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte bM = i15 == 2 ? (byte) -4 : (byte) jb2Var2.m();
            int iM = this.f150275g.m();
            int iM2 = this.f150275g.m();
            if ((bM & 2) == 0 && (bM & 1) == this.f150277i) {
                byte b10 = (byte) (iM & 127);
                byte b11 = (byte) (iM2 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f150286r;
                    if ((bM & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iM] && zArr[iM2]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f150286r = z10;
                    if (!z10 || (b10 & 240) != 16) {
                        this.f150287s = false;
                        if (!z10) {
                            if (1 > b10 && b10 <= 15) {
                                this.f150291w = false;
                            } else if ((b10 & 247) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case 43:
                                                    this.f150291w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f150291w = true;
                                            break;
                                    }
                                } else {
                                    this.f150291w = true;
                                }
                            }
                            if (this.f150291w) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f150290v = (b10 >> 3) & 1;
                                }
                                if (this.f150290v != this.f150278j) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17 || (b11 & 240) != 48) {
                                            i12 = b10 & 246;
                                            if (i12 != 18 && (b11 & 224) == 32) {
                                                this.f150281m.a();
                                                gt gtVar5 = this.f150281m;
                                                char c12 = (char) ((b10 & 1) == 0 ? D[b11 & 31] : E[b11 & 31]);
                                                if (gtVar5.f149768c.length() < 32) {
                                                    gtVar5.f149768c.append(c12);
                                                }
                                            } else if (i11 != 17 && (b11 & 240) == 32) {
                                                gt gtVar6 = this.f150281m;
                                                if (gtVar6.f149768c.length() < 32) {
                                                    gtVar6.f149768c.append(' ');
                                                }
                                                boolean z13 = (b11 & 1) == 1;
                                                gt gtVar7 = this.f150281m;
                                                gtVar7.f149766a.add(new ft((b11 >> 1) & 7, gtVar7.f149768c.length(), z13));
                                            } else if ((b10 & 240) != 16 && (b11 & l3.a.f103436o7) == 64) {
                                                int i17 = f150273y[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i17++;
                                                }
                                                gt gtVar8 = this.f150281m;
                                                if (i17 != gtVar8.f149769d) {
                                                    if (this.f150284p != 1 && (!gtVar8.f149766a.isEmpty() || !gtVar8.f149767b.isEmpty() || gtVar8.f149768c.length() != 0)) {
                                                        gt gtVar9 = new gt(this.f150284p, this.f150285q);
                                                        this.f150281m = gtVar9;
                                                        this.f150280l.add(gtVar9);
                                                    }
                                                    this.f150281m.f149769d = i17;
                                                }
                                                boolean z14 = (b11 & zi.c.f161640r) == 16;
                                                boolean z15 = (b11 & 1) == 1;
                                                int i18 = (b11 >> 1) & 7;
                                                gt gtVar10 = this.f150281m;
                                                gtVar10.f149766a.add(new ft(z14 ? 8 : i18, gtVar10.f149768c.length(), z15));
                                                if (z14) {
                                                    this.f150281m.f149770e = f150274z[i18];
                                                }
                                            } else if (i11 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f150281m.f149771f = b11 - 32;
                                            } else if (i12 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f150285q = 2;
                                                            this.f150281m.f149773h = 2;
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f150285q = 3;
                                                            this.f150281m.f149773h = 3;
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f150285q = 4;
                                                            this.f150281m.f149773h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f150284p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f150282n = Collections.EMPTY_LIST;
                                                                            if (i13 != 1 || i13 == 3) {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                gtVar3 = this.f150281m;
                                                                                if (gtVar3.f149766a.isEmpty() || !gtVar3.f149767b.isEmpty() || gtVar3.f149768c.length() != 0) {
                                                                                    gtVar4 = this.f150281m;
                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                    gtVar4.f149768c.setLength(0);
                                                                                    gtVar4.f149766a.clear();
                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                        gtVar4.f149767b.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            h();
                                                                            break;
                                                                        case 47:
                                                                            this.f150282n = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f150281m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        } else {
                                            gt gtVar11 = this.f150281m;
                                            char c13 = (char) C[b11 & zi.c.f161639q];
                                            if (gtVar11.f149768c.length() < 32) {
                                                gtVar11.f149768c.append(c13);
                                            }
                                        }
                                    } else {
                                        gtVar = this.f150281m;
                                        iArr = B;
                                        c10 = (char) iArr[(b10 & 127) - 32];
                                        if (gtVar.f149768c.length() < 32) {
                                            gtVar.f149768c.append(c10);
                                        }
                                        if ((b11 & 224) != 0) {
                                            gtVar2 = this.f150281m;
                                            c11 = (char) iArr[(b11 & 127) - 32];
                                            if (gtVar2.f149768c.length() < 32) {
                                                gtVar2.f149768c.append(c11);
                                            }
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            h();
                            z11 = true;
                        }
                    } else if (this.f150287s && this.f150288t == b10 && this.f150289u == b11) {
                        this.f150287s = false;
                    } else {
                        this.f150287s = true;
                        this.f150288t = b10;
                        this.f150289u = b11;
                        if (!z10) {
                            if (1 > b10) {
                                if ((b10 & 247) == 20) {
                                    if (b11 == 32) {
                                        this.f150291w = true;
                                    } else {
                                        this.f150291w = true;
                                    }
                                }
                            } else if ((b10 & 247) == 20) {
                                if (b11 == 32) {
                                    this.f150291w = true;
                                } else {
                                    this.f150291w = true;
                                }
                            }
                            if (this.f150291w) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f150290v = (b10 >> 3) & 1;
                                }
                                if (this.f150290v != this.f150278j) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17) {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    a(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            a(1);
                                                                            this.f150285q = 2;
                                                                            this.f150281m.f149773h = 2;
                                                                            break;
                                                                        case 38:
                                                                            a(1);
                                                                            this.f150285q = 3;
                                                                            this.f150281m.f149773h = 3;
                                                                            break;
                                                                        case 39:
                                                                            a(1);
                                                                            this.f150285q = 4;
                                                                            this.f150281m.f149773h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f150284p;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f150282n = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                h();
                                                                                            } else {
                                                                                                h();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                gtVar3 = this.f150281m;
                                                                                                if (gtVar3.f149766a.isEmpty()) {
                                                                                                    gtVar4 = this.f150281m;
                                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                                    gtVar4.f149768c.setLength(0);
                                                                                                    gtVar4.f149766a.clear();
                                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                                        gtVar4.f149767b.remove(0);
                                                                                                    }
                                                                                                } else {
                                                                                                    gtVar4 = this.f150281m;
                                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                                    gtVar4.f149768c.setLength(0);
                                                                                                    gtVar4.f149766a.clear();
                                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                                        gtVar4.f149767b.remove(0);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            h();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f150282n = g();
                                                                                            h();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f150281m.a();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    a(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f150285q = 2;
                                                            this.f150281m.f149773h = 2;
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f150285q = 3;
                                                            this.f150281m.f149773h = 3;
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f150285q = 4;
                                                            this.f150281m.f149773h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f150284p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f150282n = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                h();
                                                                            } else {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                gtVar3 = this.f150281m;
                                                                                if (gtVar3.f149766a.isEmpty()) {
                                                                                    gtVar4 = this.f150281m;
                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                    gtVar4.f149768c.setLength(0);
                                                                                    gtVar4.f149766a.clear();
                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                        gtVar4.f149767b.remove(0);
                                                                                    }
                                                                                } else {
                                                                                    gtVar4 = this.f150281m;
                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                    gtVar4.f149768c.setLength(0);
                                                                                    gtVar4.f149766a.clear();
                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                        gtVar4.f149767b.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            h();
                                                                            break;
                                                                        case 47:
                                                                            this.f150282n = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f150281m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        } else {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    a(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            a(1);
                                                                            this.f150285q = 2;
                                                                            this.f150281m.f149773h = 2;
                                                                            break;
                                                                        case 38:
                                                                            a(1);
                                                                            this.f150285q = 3;
                                                                            this.f150281m.f149773h = 3;
                                                                            break;
                                                                        case 39:
                                                                            a(1);
                                                                            this.f150285q = 4;
                                                                            this.f150281m.f149773h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f150284p;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f150282n = Collections.EMPTY_LIST;
                                                                                            if (i13 != 1) {
                                                                                                h();
                                                                                            } else {
                                                                                                h();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                gtVar3 = this.f150281m;
                                                                                                if (gtVar3.f149766a.isEmpty()) {
                                                                                                    gtVar4 = this.f150281m;
                                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                                    gtVar4.f149768c.setLength(0);
                                                                                                    gtVar4.f149766a.clear();
                                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                                        gtVar4.f149767b.remove(0);
                                                                                                    }
                                                                                                } else {
                                                                                                    gtVar4 = this.f150281m;
                                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                                    gtVar4.f149768c.setLength(0);
                                                                                                    gtVar4.f149766a.clear();
                                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                                        gtVar4.f149767b.remove(0);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            h();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f150282n = g();
                                                                                            h();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f150281m.a();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    a(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f150285q = 2;
                                                                        this.f150281m.f149773h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f150285q = 3;
                                                                        this.f150281m.f149773h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f150285q = 4;
                                                                        this.f150281m.f149773h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f150284p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f150282n = Collections.EMPTY_LIST;
                                                                                        if (i13 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f150281m;
                                                                                            if (gtVar3.f149766a.isEmpty()) {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f150281m;
                                                                                                gtVar4.f149767b.add(gtVar4.b());
                                                                                                gtVar4.f149768c.setLength(0);
                                                                                                gtVar4.f149766a.clear();
                                                                                                iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                                while (gtVar4.f149767b.size() >= iMin) {
                                                                                                    gtVar4.f149767b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f150282n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f150281m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f150285q = 2;
                                                                    this.f150281m.f149773h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f150285q = 3;
                                                                    this.f150281m.f149773h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f150285q = 4;
                                                                    this.f150281m.f149773h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f150284p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f150282n = Collections.EMPTY_LIST;
                                                                                    if (i13 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f150281m;
                                                                                        if (gtVar3.f149766a.isEmpty()) {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f150281m;
                                                                                            gtVar4.f149767b.add(gtVar4.b());
                                                                                            gtVar4.f149768c.setLength(0);
                                                                                            gtVar4.f149766a.clear();
                                                                                            iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                            while (gtVar4.f149767b.size() >= iMin) {
                                                                                                gtVar4.f149767b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f150282n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f150281m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f150285q = 2;
                                                                this.f150281m.f149773h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f150285q = 3;
                                                                this.f150281m.f149773h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f150285q = 4;
                                                                this.f150281m.f149773h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f150284p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f150282n = Collections.EMPTY_LIST;
                                                                                if (i13 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f150281m;
                                                                                    if (gtVar3.f149766a.isEmpty()) {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f150281m;
                                                                                        gtVar4.f149767b.add(gtVar4.b());
                                                                                        gtVar4.f149768c.setLength(0);
                                                                                        gtVar4.f149766a.clear();
                                                                                        iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                        while (gtVar4.f149767b.size() >= iMin) {
                                                                                            gtVar4.f149767b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f150282n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f150281m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f150285q = 2;
                                                            this.f150281m.f149773h = 2;
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f150285q = 3;
                                                            this.f150281m.f149773h = 3;
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f150285q = 4;
                                                            this.f150281m.f149773h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f150284p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f150282n = Collections.EMPTY_LIST;
                                                                            if (i13 != 1) {
                                                                                h();
                                                                            } else {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                gtVar3 = this.f150281m;
                                                                                if (gtVar3.f149766a.isEmpty()) {
                                                                                    gtVar4 = this.f150281m;
                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                    gtVar4.f149768c.setLength(0);
                                                                                    gtVar4.f149766a.clear();
                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                        gtVar4.f149767b.remove(0);
                                                                                    }
                                                                                } else {
                                                                                    gtVar4 = this.f150281m;
                                                                                    gtVar4.f149767b.add(gtVar4.b());
                                                                                    gtVar4.f149768c.setLength(0);
                                                                                    gtVar4.f149766a.clear();
                                                                                    iMin = Math.min(gtVar4.f149773h, gtVar4.f149769d);
                                                                                    while (gtVar4.f149767b.size() >= iMin) {
                                                                                        gtVar4.f149767b.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            h();
                                                                            break;
                                                                        case 47:
                                                                            this.f150282n = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f150281m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        }
                                    } else {
                                        gtVar = this.f150281m;
                                        iArr = B;
                                        c10 = (char) iArr[(b10 & 127) - 32];
                                        if (gtVar.f149768c.length() < 32) {
                                            gtVar.f149768c.append(c10);
                                        }
                                        if ((b11 & 224) != 0) {
                                            gtVar2 = this.f150281m;
                                            c11 = (char) iArr[(b11 & 127) - 32];
                                            if (gtVar2.f149768c.length() < 32) {
                                                gtVar2.f149768c.append(c11);
                                            }
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            h();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f150282n;
        this.f150283o = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt, yads.oa0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final x43 a() {
        x43 x43VarE;
        x43 x43VarA = super.a();
        if (x43VarA != null) {
            return x43VarA;
        }
        long j10 = this.f150279k;
        if (j10 == -9223372036854775807L) {
            return null;
        }
        long j11 = this.f150292x;
        if (j11 == -9223372036854775807L || this.f154121e - j11 < j10 || (x43VarE = e()) == null) {
            return null;
        }
        this.f150282n = Collections.EMPTY_LIST;
        this.f150292x = -9223372036854775807L;
        qt qtVarC = c();
        long j12 = this.f154121e;
        x43VarE.f156329c = j12;
        x43VarE.f157677d = qtVarC;
        x43VarE.f157678e = j12;
        return x43VarE;
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f150282n != this.f150283o;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f150282n = null;
        this.f150283o = null;
        a(0);
        this.f150285q = 4;
        this.f150281m.f149773h = 4;
        h();
        this.f150286r = false;
        this.f150287s = false;
        this.f150288t = (byte) 0;
        this.f150289u = (byte) 0;
        this.f150290v = 0;
        this.f150291w = true;
        this.f150292x = -9223372036854775807L;
    }

    public final ArrayList g() {
        int size = this.f150280l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            o20 o20VarA = ((gt) this.f150280l.get(i10)).a(Integer.MIN_VALUE);
            arrayList.add(o20VarA);
            if (o20VarA != null) {
                iMin = Math.min(iMin, o20VarA.f153326j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            o20 o20VarA2 = (o20) arrayList.get(i11);
            if (o20VarA2 != null) {
                if (o20VarA2.f153326j != iMin) {
                    o20VarA2 = ((gt) this.f150280l.get(i11)).a(iMin);
                    o20VarA2.getClass();
                }
                arrayList2.add(o20VarA2);
            }
        }
        return arrayList2;
    }

    public final void h() {
        this.f150281m.b(this.f150284p);
        this.f150280l.clear();
        this.f150280l.add(this.f150281m);
    }

    @Override // yads.pt, yads.oa0
    public final void release() {
    }

    public final void a(int i10) {
        int i11 = this.f150284p;
        if (i11 == i10) {
            return;
        }
        this.f150284p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f150280l.size(); i12++) {
                ((gt) this.f150280l.get(i12)).f149772g = i10;
            }
            return;
        }
        h();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f150282n = Collections.EMPTY_LIST;
        }
    }
}
