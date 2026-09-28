package defpackage;

import androidx.media3.common.a;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class pgs implements kp1 {
    public final pcn<kp1> a;
    public final int b;

    public pgs(int i, c150 c150Var) {
        this.b = i;
        this.a = c150Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static pgs b(int i, nsz nszVar) {
        String str;
        kp1 z7e0Var;
        String str2;
        pcn.a aVar = new pcn.a();
        int i2 = nszVar.c;
        int iA = -2;
        while (nszVar.a() > 8) {
            int iL = nszVar.l();
            int iL2 = nszVar.b + nszVar.l();
            nszVar.H(iL2);
            if (iL != 1414744396) {
                np1 np1Var = null;
                switch (iL) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iP = nszVar.p();
                                if (iP == 1) {
                                    str = "audio/raw";
                                } else if (iP == 85) {
                                    str = "audio/mpeg";
                                } else if (iP == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iP != 8192) {
                                    str = iP != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iP2 = nszVar.p();
                                    int iL3 = nszVar.l();
                                    nszVar.J(6);
                                    int iP3 = nszVar.p();
                                    String str3 = jrh0.a;
                                    int iA2 = jrh0.A(iP3, ByteOrder.LITTLE_ENDIAN);
                                    int iP4 = nszVar.a() > 0 ? nszVar.p() : 0;
                                    a.C0062a c0062a = new a.C0062a();
                                    c0062a.m = gqv.m(str);
                                    c0062a.E = iP2;
                                    c0062a.F = iL3;
                                    if (str.equals("audio/raw") && iA2 != 0) {
                                        c0062a.G = iA2;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iP4 > 0) {
                                        byte[] bArr = new byte[iP4];
                                        nszVar.h(bArr, 0, iP4);
                                        c0062a.p = pcn.n(bArr);
                                    }
                                    z7e0Var = new z7e0(new a(c0062a));
                                } else {
                                    h08.a(iP, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                cft.g("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(jrh0.E(iA)));
                            }
                            z7e0Var = np1Var;
                            break;
                        } else {
                            nszVar.J(4);
                            int iL4 = nszVar.l();
                            int iL5 = nszVar.l();
                            nszVar.J(4);
                            int iL6 = nszVar.l();
                            switch (iL6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                a.C0062a c0062a2 = new a.C0062a();
                                c0062a2.t = iL4;
                                c0062a2.u = iL5;
                                c0062a2.m = gqv.m(str2);
                                z7e0Var = new z7e0(new a(c0062a2));
                            } else {
                                h08.a(iL6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                z7e0Var = np1Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iL7 = nszVar.l();
                        nszVar.J(8);
                        int iL8 = nszVar.l();
                        int iL9 = nszVar.l();
                        nszVar.J(4);
                        nszVar.l();
                        nszVar.J(12);
                        z7e0Var = new mp1(iL7, iL8, iL9);
                        break;
                    case 1752331379:
                        int iL10 = nszVar.l();
                        nszVar.J(12);
                        nszVar.l();
                        int iL11 = nszVar.l();
                        int iL12 = nszVar.l();
                        nszVar.J(4);
                        int iL13 = nszVar.l();
                        int iL14 = nszVar.l();
                        nszVar.J(4);
                        np1Var = new np1(iL10, iL11, iL12, iL13, iL14, nszVar.l());
                        z7e0Var = np1Var;
                        break;
                    case 1852994675:
                        z7e0Var = new c8e0(nszVar.u(nszVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        z7e0Var = np1Var;
                        break;
                }
            } else {
                z7e0Var = b(nszVar.l(), nszVar);
            }
            if (z7e0Var != null) {
                if (z7e0Var.getType() == 1752331379) {
                    iA = ((np1) z7e0Var).a();
                }
                aVar.c(z7e0Var);
            }
            nszVar.I(iL2);
            nszVar.H(i2);
        }
        return new pgs(i, aVar.g());
    }

    public final <T extends kp1> T a(Class<T> cls) {
        pcn.b bVarListIterator = this.a.listIterator(0);
        while (bVarListIterator.hasNext()) {
            T t = (T) bVarListIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // defpackage.kp1
    public final int getType() {
        return this.b;
    }
}
