package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class d9q {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final double l;
    public final double m;
    public final int n;
    public final int o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;

    @fae
    public static final /* synthetic */ class a implements o1k<d9q> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.featurematch.presentation.quickbet.LNFeatureMatchQuickBetDestination", aVar, 19);
            kr10Var.j("lotteryId", true);
            kr10Var.j("lotteryName", true);
            kr10Var.j("gameType", true);
            kr10Var.j("drawId", true);
            kr10Var.j("drawTime", true);
            kr10Var.j("drawTimeForElapsedRealtime", true);
            kr10Var.j("refreshAtElapsedRealtime", true);
            kr10Var.j("marketId", true);
            kr10Var.j("marketTitle", true);
            kr10Var.j("specifier", true);
            kr10Var.j("outcomeId", true);
            kr10Var.j("odds", true);
            kr10Var.j("probability", true);
            kr10Var.j("maxMainBallAmount", true);
            kr10Var.j("ballCount", true);
            kr10Var.j("balls", true);
            kr10Var.j("minStake", true);
            kr10Var.j("maxStake", true);
            kr10Var.j("maxPayout", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            php<?> phpVarA = hj5.a(gae0Var);
            php<?> phpVarA2 = hj5.a(gae0Var);
            okt oktVar = okt.a;
            z5f z5fVar = z5f.a;
            hxo hxoVar = hxo.a;
            return new php[]{gae0Var, gae0Var, gae0Var, gae0Var, oktVar, oktVar, oktVar, gae0Var, phpVarA, gae0Var, gae0Var, z5fVar, z5fVar, hxoVar, hxoVar, gae0Var, gae0Var, gae0Var, phpVarA2};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            int i;
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            int i2 = 0;
            int iM = 0;
            int iM2 = 0;
            String strJ = null;
            String strJ2 = null;
            String strJ3 = null;
            String strJ4 = null;
            String strJ5 = null;
            String strJ6 = null;
            String strJ7 = null;
            String strJ8 = null;
            String strJ9 = null;
            String strJ10 = null;
            long jR = 0;
            long jR2 = 0;
            long jR3 = 0;
            double dG = 0.0d;
            double dG2 = 0.0d;
            boolean z = true;
            String str = null;
            String str2 = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                switch (iV) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strJ = dmaVarC.j(pd80Var, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strJ2 = dmaVarC.j(pd80Var, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        strJ3 = dmaVarC.j(pd80Var, 2);
                        i2 |= 4;
                        continue;
                    case 3:
                        strJ4 = dmaVarC.j(pd80Var, 3);
                        i2 |= 8;
                        continue;
                    case 4:
                        jR = dmaVarC.r(pd80Var, 4);
                        i2 |= 16;
                        continue;
                    case 5:
                        jR2 = dmaVarC.r(pd80Var, 5);
                        i2 |= 32;
                        continue;
                    case 6:
                        jR3 = dmaVarC.r(pd80Var, 6);
                        i2 |= 64;
                        continue;
                    case 7:
                        strJ5 = dmaVarC.j(pd80Var, 7);
                        i2 |= 128;
                        continue;
                    case 8:
                        str = (String) dmaVarC.n(pd80Var, 8, gae0.a, str);
                        i2 |= 256;
                        continue;
                    case 9:
                        strJ6 = dmaVarC.j(pd80Var, 9);
                        i2 |= 512;
                        continue;
                    case 10:
                        strJ7 = dmaVarC.j(pd80Var, 10);
                        i2 |= 1024;
                        continue;
                    case 11:
                        dG = dmaVarC.G(pd80Var, 11);
                        i2 |= 2048;
                        continue;
                    case 12:
                        dG2 = dmaVarC.G(pd80Var, 12);
                        i2 |= 4096;
                        continue;
                    case 13:
                        iM = dmaVarC.m(pd80Var, 13);
                        i2 |= 8192;
                        continue;
                    case 14:
                        iM2 = dmaVarC.m(pd80Var, 14);
                        i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                        continue;
                    case 15:
                        strJ8 = dmaVarC.j(pd80Var, 15);
                        i = 32768;
                        break;
                    case 16:
                        strJ9 = dmaVarC.j(pd80Var, 16);
                        i = 65536;
                        break;
                    case 17:
                        strJ10 = dmaVarC.j(pd80Var, 17);
                        i = 131072;
                        break;
                    case 18:
                        str2 = (String) dmaVarC.n(pd80Var, 18, gae0.a, str2);
                        i = 262144;
                        break;
                    default:
                        jtf0.a(iV);
                        return null;
                }
                i2 |= i;
            }
            dmaVarC.b(pd80Var);
            return new d9q(i2, strJ, strJ2, strJ3, strJ4, jR, jR2, jR3, strJ5, str, strJ6, strJ7, dG, dG2, iM, iM2, strJ8, strJ9, strJ10, str2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x017b  */
        /* JADX WARN: Code duplicated, block: B:102:0x0181  */
        /* JADX WARN: Code duplicated, block: B:105:0x018c  */
        /* JADX WARN: Code duplicated, block: B:106:0x018f  */
        /* JADX WARN: Code duplicated, block: B:112:0x01a3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:113:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:65:0x0100  */
        /* JADX WARN: Code duplicated, block: B:66:0x0103  */
        /* JADX WARN: Code duplicated, block: B:72:0x011b  */
        /* JADX WARN: Code duplicated, block: B:74:0x0121  */
        /* JADX WARN: Code duplicated, block: B:78:0x012f  */
        /* JADX WARN: Code duplicated, block: B:80:0x0135  */
        /* JADX WARN: Code duplicated, block: B:84:0x0141 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:85:0x0143  */
        /* JADX WARN: Code duplicated, block: B:89:0x0151 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:90:0x0153  */
        /* JADX WARN: Code duplicated, block: B:93:0x0160  */
        /* JADX WARN: Code duplicated, block: B:94:0x0163  */
        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            d9q d9qVar = (d9q) obj;
            d9qVar.getClass();
            String str5 = d9qVar.s;
            String str6 = d9qVar.r;
            String str7 = d9qVar.q;
            String str8 = d9qVar.p;
            int i = d9qVar.o;
            int i2 = d9qVar.n;
            double d = d9qVar.m;
            double d2 = d9qVar.l;
            String str9 = d9qVar.k;
            String str10 = d9qVar.j;
            String str11 = d9qVar.i;
            String str12 = d9qVar.h;
            long j = d9qVar.g;
            long j2 = d9qVar.f;
            long j3 = d9qVar.e;
            String str13 = d9qVar.d;
            String str14 = d9qVar.c;
            String str15 = d9qVar.b;
            String str16 = d9qVar.a;
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str16, "")) {
                fmaVarC.o(pd80Var, 0, str16);
            }
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str15, "")) {
                fmaVarC.o(pd80Var, 1, str15);
            }
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str14, "")) {
                fmaVarC.o(pd80Var, 2, str14);
            }
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str13, "")) {
                fmaVarC.o(pd80Var, 3, str13);
            }
            if (fmaVarC.a(pd80Var) || j3 != 0) {
                fmaVarC.f(pd80Var, 4, j3);
            }
            if (fmaVarC.a(pd80Var) || j2 != 0) {
                fmaVarC.f(pd80Var, 5, j2);
            }
            if (fmaVarC.a(pd80Var) || j != 0) {
                fmaVarC.f(pd80Var, 6, j);
            }
            if (fmaVarC.a(pd80Var) || !Intrinsics.g(str12, "")) {
                fmaVarC.o(pd80Var, 7, str12);
            }
            if (fmaVarC.a(pd80Var) || str11 != null) {
                fmaVarC.D(pd80Var, 8, gae0.a, str11);
            }
            if (!fmaVarC.a(pd80Var)) {
                str = str10;
                if (!Intrinsics.g(str, "")) {
                }
                if (fmaVarC.a(pd80Var)) {
                    str2 = str9;
                    if (!Intrinsics.g(str2, "")) {
                    }
                    if (fmaVarC.a(pd80Var) || Double.compare(d2, 0.0d) != 0) {
                        fmaVarC.j(pd80Var, 11, d2);
                    }
                    if (fmaVarC.a(pd80Var) || Double.compare(d, 0.0d) != 0) {
                        fmaVarC.j(pd80Var, 12, d);
                    }
                    if (fmaVarC.a(pd80Var) || i2 != 0) {
                        fmaVarC.A(13, i2, pd80Var);
                    }
                    if (fmaVarC.a(pd80Var) || i != 0) {
                        fmaVarC.A(14, i, pd80Var);
                    }
                    if (fmaVarC.a(pd80Var)) {
                        str3 = str8;
                        if (!Intrinsics.g(str3, "")) {
                        }
                        if (fmaVarC.a(pd80Var) || !Intrinsics.g(str7, "0")) {
                            fmaVarC.o(pd80Var, 16, str7);
                        }
                        if (fmaVarC.a(pd80Var)) {
                            str4 = str6;
                            if (!Intrinsics.g(str4, "0")) {
                            }
                            if (fmaVarC.a(pd80Var) || str5 != null) {
                                fmaVarC.D(pd80Var, 18, gae0.a, str5);
                            }
                            fmaVarC.b(pd80Var);
                        }
                        str4 = str6;
                        fmaVarC.o(pd80Var, 17, str4);
                        if (fmaVarC.a(pd80Var)) {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        } else {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        }
                        fmaVarC.b(pd80Var);
                    }
                    str3 = str8;
                    fmaVarC.o(pd80Var, 15, str3);
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.o(pd80Var, 16, str7);
                    } else {
                        fmaVarC.o(pd80Var, 16, str7);
                    }
                    if (fmaVarC.a(pd80Var)) {
                        str4 = str6;
                        if (!Intrinsics.g(str4, "0")) {
                        }
                        if (fmaVarC.a(pd80Var)) {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        } else {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        }
                        fmaVarC.b(pd80Var);
                    }
                    str4 = str6;
                    fmaVarC.o(pd80Var, 17, str4);
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    } else {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    }
                    fmaVarC.b(pd80Var);
                }
                str2 = str9;
                fmaVarC.o(pd80Var, 10, str2);
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.j(pd80Var, 11, d2);
                } else {
                    fmaVarC.j(pd80Var, 11, d2);
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.j(pd80Var, 12, d);
                } else {
                    fmaVarC.j(pd80Var, 12, d);
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.A(13, i2, pd80Var);
                } else {
                    fmaVarC.A(13, i2, pd80Var);
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.A(14, i, pd80Var);
                } else {
                    fmaVarC.A(14, i, pd80Var);
                }
                if (fmaVarC.a(pd80Var)) {
                    str3 = str8;
                    if (!Intrinsics.g(str3, "")) {
                    }
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.o(pd80Var, 16, str7);
                    } else {
                        fmaVarC.o(pd80Var, 16, str7);
                    }
                    if (fmaVarC.a(pd80Var)) {
                        str4 = str6;
                        if (!Intrinsics.g(str4, "0")) {
                        }
                        if (fmaVarC.a(pd80Var)) {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        } else {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        }
                        fmaVarC.b(pd80Var);
                    }
                    str4 = str6;
                    fmaVarC.o(pd80Var, 17, str4);
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    } else {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    }
                    fmaVarC.b(pd80Var);
                }
                str3 = str8;
                fmaVarC.o(pd80Var, 15, str3);
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.o(pd80Var, 16, str7);
                } else {
                    fmaVarC.o(pd80Var, 16, str7);
                }
                if (fmaVarC.a(pd80Var)) {
                    str4 = str6;
                    if (!Intrinsics.g(str4, "0")) {
                    }
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    } else {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    }
                    fmaVarC.b(pd80Var);
                }
                str4 = str6;
                fmaVarC.o(pd80Var, 17, str4);
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                } else {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                }
                fmaVarC.b(pd80Var);
            }
            str = str10;
            fmaVarC.o(pd80Var, 9, str);
            if (fmaVarC.a(pd80Var)) {
                str2 = str9;
                if (!Intrinsics.g(str2, "")) {
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.j(pd80Var, 11, d2);
                } else {
                    fmaVarC.j(pd80Var, 11, d2);
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.j(pd80Var, 12, d);
                } else {
                    fmaVarC.j(pd80Var, 12, d);
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.A(13, i2, pd80Var);
                } else {
                    fmaVarC.A(13, i2, pd80Var);
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.A(14, i, pd80Var);
                } else {
                    fmaVarC.A(14, i, pd80Var);
                }
                if (fmaVarC.a(pd80Var)) {
                    str3 = str8;
                    if (!Intrinsics.g(str3, "")) {
                    }
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.o(pd80Var, 16, str7);
                    } else {
                        fmaVarC.o(pd80Var, 16, str7);
                    }
                    if (fmaVarC.a(pd80Var)) {
                        str4 = str6;
                        if (!Intrinsics.g(str4, "0")) {
                        }
                        if (fmaVarC.a(pd80Var)) {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        } else {
                            fmaVarC.D(pd80Var, 18, gae0.a, str5);
                        }
                        fmaVarC.b(pd80Var);
                    }
                    str4 = str6;
                    fmaVarC.o(pd80Var, 17, str4);
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    } else {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    }
                    fmaVarC.b(pd80Var);
                }
                str3 = str8;
                fmaVarC.o(pd80Var, 15, str3);
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.o(pd80Var, 16, str7);
                } else {
                    fmaVarC.o(pd80Var, 16, str7);
                }
                if (fmaVarC.a(pd80Var)) {
                    str4 = str6;
                    if (!Intrinsics.g(str4, "0")) {
                    }
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    } else {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    }
                    fmaVarC.b(pd80Var);
                }
                str4 = str6;
                fmaVarC.o(pd80Var, 17, str4);
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                } else {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                }
                fmaVarC.b(pd80Var);
            }
            str2 = str9;
            fmaVarC.o(pd80Var, 10, str2);
            if (fmaVarC.a(pd80Var)) {
                fmaVarC.j(pd80Var, 11, d2);
            } else {
                fmaVarC.j(pd80Var, 11, d2);
            }
            if (fmaVarC.a(pd80Var)) {
                fmaVarC.j(pd80Var, 12, d);
            } else {
                fmaVarC.j(pd80Var, 12, d);
            }
            if (fmaVarC.a(pd80Var)) {
                fmaVarC.A(13, i2, pd80Var);
            } else {
                fmaVarC.A(13, i2, pd80Var);
            }
            if (fmaVarC.a(pd80Var)) {
                fmaVarC.A(14, i, pd80Var);
            } else {
                fmaVarC.A(14, i, pd80Var);
            }
            if (fmaVarC.a(pd80Var)) {
                str3 = str8;
                if (!Intrinsics.g(str3, "")) {
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.o(pd80Var, 16, str7);
                } else {
                    fmaVarC.o(pd80Var, 16, str7);
                }
                if (fmaVarC.a(pd80Var)) {
                    str4 = str6;
                    if (!Intrinsics.g(str4, "0")) {
                    }
                    if (fmaVarC.a(pd80Var)) {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    } else {
                        fmaVarC.D(pd80Var, 18, gae0.a, str5);
                    }
                    fmaVarC.b(pd80Var);
                }
                str4 = str6;
                fmaVarC.o(pd80Var, 17, str4);
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                } else {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                }
                fmaVarC.b(pd80Var);
            }
            str3 = str8;
            fmaVarC.o(pd80Var, 15, str3);
            if (fmaVarC.a(pd80Var)) {
                fmaVarC.o(pd80Var, 16, str7);
            } else {
                fmaVarC.o(pd80Var, 16, str7);
            }
            if (fmaVarC.a(pd80Var)) {
                str4 = str6;
                if (!Intrinsics.g(str4, "0")) {
                }
                if (fmaVarC.a(pd80Var)) {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                } else {
                    fmaVarC.D(pd80Var, 18, gae0.a, str5);
                }
                fmaVarC.b(pd80Var);
            }
            str4 = str6;
            fmaVarC.o(pd80Var, 17, str4);
            if (fmaVarC.a(pd80Var)) {
                fmaVarC.D(pd80Var, 18, gae0.a, str5);
            } else {
                fmaVarC.D(pd80Var, 18, gae0.a, str5);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<d9q> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ d9q(int i, String str, String str2, String str3, String str4, long j, long j2, long j3, String str5, String str6, String str7, String str8, double d, double d2, int i2, int i3, String str9, String str10, String str11, String str12) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j3;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str8;
        }
        if ((i & 2048) == 0) {
            this.l = 0.0d;
        } else {
            this.l = d;
        }
        this.m = (i & 4096) != 0 ? d2 : 0.0d;
        if ((i & 8192) == 0) {
            this.n = 0;
        } else {
            this.n = i2;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.o = 0;
        } else {
            this.o = i3;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str9;
        }
        if ((65536 & i) == 0) {
            this.q = "0";
        } else {
            this.q = str10;
        }
        if ((131072 & i) == 0) {
            this.r = "0";
        } else {
            this.r = str11;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = str12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9q)) {
            return false;
        }
        d9q d9qVar = (d9q) obj;
        return Intrinsics.g(this.a, d9qVar.a) && Intrinsics.g(this.b, d9qVar.b) && Intrinsics.g(this.c, d9qVar.c) && Intrinsics.g(this.d, d9qVar.d) && this.e == d9qVar.e && this.f == d9qVar.f && this.g == d9qVar.g && Intrinsics.g(this.h, d9qVar.h) && Intrinsics.g(this.i, d9qVar.i) && Intrinsics.g(this.j, d9qVar.j) && Intrinsics.g(this.k, d9qVar.k) && Double.compare(this.l, d9qVar.l) == 0 && Double.compare(this.m, d9qVar.m) == 0 && this.n == d9qVar.n && this.o == d9qVar.o && Intrinsics.g(this.p, d9qVar.p) && Intrinsics.g(this.q, d9qVar.q) && Intrinsics.g(this.r, d9qVar.r) && Intrinsics.g(this.s, d9qVar.s);
    }

    public final int hashCode() {
        int iA = gmf0.a(f87.a(f87.a(f87.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), this.g, 31), 31, this.h);
        String str = this.i;
        int iA2 = gmf0.a(gmf0.a(gmf0.a(gpp.a(this.o, gpp.a(this.n, nrg0.a(nrg0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31), 31, this.p), 31, this.q), 31, this.r);
        String str2 = this.s;
        return iA2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("LNFeatureMatchQuickBetDestination(lotteryId=", this.a, ", lotteryName=", this.b, ", gameType=");
        hxa.c(sbA, this.c, ", drawId=", this.d, ", drawTime=");
        sbA.append(this.e);
        g41.a(this.f, ", drawTimeForElapsedRealtime=", ", refreshAtElapsedRealtime=", sbA);
        em5.a(this.g, ", marketId=", this.h, sbA);
        hxa.c(sbA, ", marketTitle=", this.i, ", specifier=", this.j);
        u4.a(sbA, ", outcomeId=", this.k, ", odds=");
        sbA.append(this.l);
        hib0.b(this.m, ", probability=", ", maxMainBallAmount=", sbA);
        d5d.a(sbA, this.n, ", ballCount=", this.o, ", balls=");
        hxa.c(sbA, this.p, ", minStake=", this.q, ", maxStake=");
        return kwi.a(sbA, this.r, ", maxPayout=", this.s, ")");
    }

    public d9q(String str, String str2, String str3, String str4, long j, long j2, long j3, String str5, String str6, String str7, String str8, double d, double d2, int i, int i2, String str9, String str10, String str11, String str12) {
        qn4.b(str, str2, str3, str4, str5);
        wd7.a(str7, str8, str10, str11);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = d;
        this.m = d2;
        this.n = i;
        this.o = i2;
        this.p = str9;
        this.q = str10;
        this.r = str11;
        this.s = str12;
    }

    public d9q() {
        this("", "", "", "", 0L, 0L, 0L, "", null, "", "", 0.0d, 0.0d, 0, 0, "", "0", "0", null);
    }
}
