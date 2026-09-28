package defpackage;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class err {
    public static final hep.a a = hep.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", tYcQsJyaojE.JBFuCCqRVUd, "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final hep.a b = hep.a.a("d", "a");
    public static final hep.a c = hep.a.a("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static drr a(hfp hfpVar, xmt xmtVar) {
        byte b2;
        boolean z;
        long j;
        boolean z2;
        be0 be0Var;
        be0 be0Var2;
        be0 be0Var3;
        be0 be0Var4;
        Float f;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        hfpVar.f();
        float F = 0.0f;
        float F2 = 0.0f;
        float F3 = 0.0f;
        float F4 = 0.0f;
        drr.b bVar = drr.b.a;
        zup zupVar = zup.a;
        qe0 qe0VarC = null;
        drr.a aVar = null;
        String strH = null;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zU = false;
        gg4 gg4Var = null;
        tef tefVar = null;
        le0 le0Var = null;
        me0 me0Var = null;
        be0 be0VarB = null;
        float F5 = 1.0f;
        float F6 = 0.0f;
        String strH2 = null;
        String strH3 = "UNSET";
        boolean z3 = false;
        long jG = 0;
        long jG2 = -1;
        while (hfpVar.o()) {
            int i = 1;
            switch (hfpVar.V(a)) {
                case 0:
                    jG2 = jG2;
                    strH3 = hfpVar.H();
                    jG2 = jG2;
                    break;
                case 1:
                    jG = hfpVar.G();
                    fValueOf = fValueOf;
                    jG2 = jG2;
                    break;
                case 2:
                    jG2 = jG2;
                    strH = hfpVar.H();
                    jG2 = jG2;
                    break;
                case 3:
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    int iG = hfpVar.G();
                    aVar = iG < 6 ? drr.a.values()[iG] : drr.a.c;
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    break;
                case 4:
                    jG2 = hfpVar.G();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    break;
                case 5:
                    iC = (int) (srh0.c() * hfpVar.G());
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    jG2 = jG2;
                    break;
                case 6:
                    iC2 = (int) (srh0.c() * hfpVar.G());
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    jG2 = jG2;
                    break;
                case 7:
                    color = Color.parseColor(hfpVar.H());
                    fValueOf = fValueOf;
                    jG2 = jG2;
                    break;
                case 8:
                    jG2 = jG2;
                    qe0VarC = re0.c(hfpVar, xmtVar);
                    jG2 = jG2;
                    break;
                case 9:
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    int iG2 = hfpVar.G();
                    if (iG2 >= drr.b.values().length) {
                        xmtVar.a("Unsupported matte type: " + iG2);
                    } else {
                        bVar = drr.b.values()[iG2];
                        int iOrdinal = bVar.ordinal();
                        if (iOrdinal == 3) {
                            xmtVar.a("Unsupported matte type: Luma");
                        } else if (iOrdinal == 4) {
                            xmtVar.a("Unsupported matte type: Luma Inverted");
                        }
                        xmtVar.p++;
                    }
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    break;
                case 10:
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    hfpVar.d();
                    while (hfpVar.o()) {
                        hfpVar.f();
                        boolean zU2 = false;
                        stu.a aVar2 = null;
                        je0 je0Var = null;
                        de0 de0VarD = null;
                        while (hfpVar.o()) {
                            String strF0 = hfpVar.f0();
                            strF0.getClass();
                            switch (strF0) {
                                case "o":
                                    de0VarD = te0.d(hfpVar, xmtVar);
                                    break;
                                case "pt":
                                    je0Var = new je0(fpp.a(hfpVar, xmtVar, srh0.c(), wx80.a, false));
                                    break;
                                case "inv":
                                    zU2 = hfpVar.u();
                                    break;
                                case "mode":
                                    String strH4 = hfpVar.H();
                                    strH4.getClass();
                                    switch (strH4) {
                                        case "a":
                                            b2 = 0;
                                            break;
                                        case "i":
                                            b2 = 1;
                                            break;
                                        case "n":
                                            b2 = 2;
                                            break;
                                        case "s":
                                            b2 = 3;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    stu.a aVar3 = stu.a.a;
                                    switch (b2) {
                                        case 0:
                                            aVar2 = aVar3;
                                            break;
                                        case 1:
                                            xmtVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            aVar2 = stu.a.c;
                                            break;
                                        case 2:
                                            aVar2 = stu.a.d;
                                            break;
                                        case 3:
                                            aVar2 = stu.a.b;
                                            break;
                                        default:
                                            lgt.b("Unknown mask mode " + strF0 + ". Defaulting to Add.");
                                            aVar2 = aVar3;
                                            break;
                                    }
                                    break;
                                default:
                                    hfpVar.Z();
                                    break;
                            }
                        }
                        hfpVar.l();
                        arrayList.add(new stu(aVar2, je0Var, de0VarD, zU2));
                    }
                    xmtVar.p += arrayList.size();
                    hfpVar.g();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    break;
                case 11:
                    hfpVar.d();
                    while (hfpVar.o()) {
                        a0b a0bVarA = b0b.a(hfpVar, xmtVar);
                        if (a0bVarA != null) {
                            arrayList2.add(a0bVarA);
                        }
                    }
                    hfpVar.g();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    break;
                case 12:
                    z = z3;
                    hfpVar.f();
                    while (hfpVar.o()) {
                        int iV = hfpVar.V(b);
                        if (iV == 0) {
                            le0Var = new le0(fpp.a(hfpVar, xmtVar, srh0.c(), lye.a, false));
                        } else if (iV != 1) {
                            hfpVar.Y();
                            hfpVar.Z();
                        } else {
                            hfpVar.d();
                            if (hfpVar.o()) {
                                hep.a aVar4 = ne0.a;
                                hfpVar.f();
                                pe0 pe0Var = null;
                                oe0 oe0Var = null;
                                while (hfpVar.o()) {
                                    int iV2 = hfpVar.V(ne0.a);
                                    if (iV2 != 0) {
                                        boolean z4 = true;
                                        if (iV2 != 1) {
                                            hfpVar.Y();
                                            hfpVar.Z();
                                        } else {
                                            hfpVar.f();
                                            ae0 ae0VarA = null;
                                            ae0 ae0VarA2 = null;
                                            be0 be0VarB2 = null;
                                            be0 be0VarB3 = null;
                                            de0 de0VarD2 = null;
                                            while (hfpVar.o()) {
                                                int iV3 = hfpVar.V(ne0.c);
                                                if (iV3 == 0) {
                                                    ae0VarA = te0.a(hfpVar, xmtVar);
                                                } else if (iV3 == z4) {
                                                    ae0VarA2 = te0.a(hfpVar, xmtVar);
                                                } else if (iV3 == 2) {
                                                    be0VarB2 = te0.b(hfpVar, xmtVar, z4);
                                                } else if (iV3 == 3) {
                                                    be0VarB3 = te0.b(hfpVar, xmtVar, z4);
                                                } else if (iV3 != 4) {
                                                    hfpVar.Y();
                                                    hfpVar.Z();
                                                } else {
                                                    de0VarD2 = te0.d(hfpVar, xmtVar);
                                                }
                                                z4 = true;
                                            }
                                            hfpVar.l();
                                            pe0Var = new pe0(ae0VarA, ae0VarA2, be0VarB2, be0VarB3, de0VarD2);
                                        }
                                    } else {
                                        hfpVar.f();
                                        de0 de0VarD3 = null;
                                        de0 de0VarD4 = null;
                                        de0 de0VarD5 = null;
                                        ylf0 ylf0Var = null;
                                        while (hfpVar.o()) {
                                            de0 de0Var = de0VarD3;
                                            int iV4 = hfpVar.V(ne0.b);
                                            if (iV4 != 0) {
                                                long j2 = jG2;
                                                if (iV4 == 1) {
                                                    de0VarD4 = te0.d(hfpVar, xmtVar);
                                                } else if (iV4 == 2) {
                                                    de0VarD5 = te0.d(hfpVar, xmtVar);
                                                } else if (iV4 != 3) {
                                                    hfpVar.Y();
                                                    hfpVar.Z();
                                                } else {
                                                    int iG3 = hfpVar.G();
                                                    ylf0Var = ylf0.b;
                                                    if (iG3 != 1 && iG3 != 2) {
                                                        xmtVar.a("Unsupported text range units: " + iG3);
                                                    } else if (iG3 == 1) {
                                                        ylf0Var = ylf0.a;
                                                    }
                                                }
                                                de0VarD3 = de0Var;
                                                jG2 = j2;
                                            } else {
                                                de0VarD3 = te0.d(hfpVar, xmtVar);
                                            }
                                        }
                                        de0 de0Var2 = de0VarD3;
                                        long j3 = jG2;
                                        hfpVar.l();
                                        oe0Var = new oe0((de0Var2 != null || de0VarD4 == null) ? de0Var2 : new de0(Collections.singletonList(new cpp(0))), de0VarD4, de0VarD5, ylf0Var);
                                        jG2 = j3;
                                    }
                                }
                                j = jG2;
                                hfpVar.l();
                                me0Var = new me0(pe0Var, oe0Var);
                            } else {
                                j = jG2;
                            }
                            while (hfpVar.o()) {
                                hfpVar.Z();
                            }
                            hfpVar.g();
                            jG2 = j;
                        }
                    }
                    hfpVar.l();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z;
                    break;
                case 13:
                    hfpVar.d();
                    ArrayList arrayList3 = new ArrayList();
                    while (hfpVar.o()) {
                        hfpVar.f();
                        while (hfpVar.o()) {
                            int iV5 = hfpVar.V(c);
                            if (iV5 == 0) {
                                int iG4 = hfpVar.G();
                                if (iG4 == 29) {
                                    hep.a aVar5 = ig4.a;
                                    gg4Var = null;
                                    while (hfpVar.o()) {
                                        if (hfpVar.V(ig4.a) != 0) {
                                            hfpVar.Y();
                                            hfpVar.Z();
                                        } else {
                                            hfpVar.d();
                                            while (hfpVar.o()) {
                                                hfpVar.f();
                                                boolean z5 = false;
                                                gg4 gg4Var2 = null;
                                                while (hfpVar.o()) {
                                                    int iV6 = hfpVar.V(ig4.b);
                                                    if (iV6 != 0) {
                                                        boolean z6 = z5;
                                                        if (iV6 != 1) {
                                                            hfpVar.Y();
                                                            hfpVar.Z();
                                                        } else if (z6) {
                                                            gg4Var2 = new gg4(te0.b(hfpVar, xmtVar, true));
                                                        } else {
                                                            hfpVar.Z();
                                                        }
                                                        z5 = z6;
                                                    } else {
                                                        z5 = hfpVar.G() == 0;
                                                    }
                                                }
                                                hfpVar.l();
                                                if (gg4Var2 != null) {
                                                    gg4Var = gg4Var2;
                                                }
                                            }
                                            hfpVar.g();
                                            i = 1;
                                        }
                                    }
                                } else {
                                    if (iG4 == 25) {
                                        uef uefVar = new uef();
                                        while (hfpVar.o()) {
                                            if (hfpVar.V(uef.f) != 0) {
                                                hfpVar.Y();
                                                hfpVar.Z();
                                            } else {
                                                hfpVar.d();
                                                while (hfpVar.o()) {
                                                    hfpVar.f();
                                                    String strH5 = "";
                                                    while (hfpVar.o()) {
                                                        int iV7 = hfpVar.V(uef.g);
                                                        if (iV7 != 0) {
                                                            boolean z7 = z3;
                                                            if (iV7 == 1) {
                                                                strH5.getClass();
                                                                switch (strH5) {
                                                                    case "Distance":
                                                                        uefVar.d = te0.b(hfpVar, xmtVar, true);
                                                                        break;
                                                                    case "Opacity":
                                                                        uefVar.b = te0.b(hfpVar, xmtVar, false);
                                                                        break;
                                                                    case "Direction":
                                                                        uefVar.c = te0.b(hfpVar, xmtVar, false);
                                                                        break;
                                                                    case "Shadow Color":
                                                                        uefVar.a = te0.a(hfpVar, xmtVar);
                                                                        break;
                                                                    case "Softness":
                                                                        uefVar.e = te0.b(hfpVar, xmtVar, true);
                                                                        break;
                                                                    default:
                                                                        hfpVar.Z();
                                                                        break;
                                                                }
                                                            } else {
                                                                hfpVar.Y();
                                                                hfpVar.Z();
                                                            }
                                                            z3 = z7;
                                                        } else {
                                                            strH5 = hfpVar.H();
                                                        }
                                                    }
                                                    hfpVar.l();
                                                }
                                                hfpVar.g();
                                            }
                                        }
                                        z2 = z3;
                                        ae0 ae0Var = uefVar.a;
                                        tefVar = (ae0Var == null || (be0Var = uefVar.b) == null || (be0Var2 = uefVar.c) == null || (be0Var3 = uefVar.d) == null || (be0Var4 = uefVar.e) == null) ? null : new tef(ae0Var, be0Var, be0Var2, be0Var3, be0Var4);
                                    }
                                    z3 = z2;
                                    i = 1;
                                }
                            } else if (iV5 != i) {
                                hfpVar.Y();
                                hfpVar.Z();
                            } else {
                                arrayList3.add(hfpVar.H());
                            }
                            z2 = z3;
                            z3 = z2;
                            i = 1;
                        }
                        hfpVar.l();
                        i = 1;
                    }
                    z = z3;
                    hfpVar.g();
                    xmtVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z;
                    break;
                case 14:
                    F5 = (float) hfpVar.F();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    break;
                case 15:
                    F6 = (float) hfpVar.F();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    break;
                case 16:
                    F3 = (float) (hfpVar.F() * ((double) srh0.c()));
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    break;
                case 17:
                    F4 = (float) (hfpVar.F() * ((double) srh0.c()));
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    break;
                case 18:
                    f = fValueOf;
                    F = (float) hfpVar.F();
                    fValueOf = f;
                    break;
                case 19:
                    f = fValueOf;
                    F2 = (float) hfpVar.F();
                    fValueOf = f;
                    break;
                case 20:
                    f = fValueOf;
                    be0VarB = te0.b(hfpVar, xmtVar, false);
                    fValueOf = f;
                    break;
                case 21:
                    strH2 = hfpVar.H();
                    break;
                case 22:
                    zU = hfpVar.u();
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    f = fValueOf;
                    z3 = hfpVar.G() == 1;
                    fValueOf = f;
                    break;
                case 24:
                    int iG5 = hfpVar.G();
                    if (iG5 >= zup.values().length) {
                        f = fValueOf;
                        xmtVar.a("Unsupported Blend Mode: " + iG5);
                        zupVar = zupVar;
                    } else {
                        f = fValueOf;
                        zupVar = zup.values()[iG5];
                    }
                    fValueOf = f;
                    break;
                default:
                    hfpVar.Y();
                    hfpVar.Z();
                    fValueOf = fValueOf;
                    strH2 = strH2;
                    z3 = z3;
                    jG2 = jG2;
                    break;
            }
        }
        Float f2 = fValueOf;
        String str = strH2;
        boolean z8 = z3;
        long j4 = jG2;
        hfpVar.l();
        ArrayList arrayList4 = new ArrayList();
        if (F > 0.0f) {
            arrayList4.add(new cpp(xmtVar, f2, f2, (Interpolator) null, 0.0f, Float.valueOf(F)));
        }
        if (F2 <= 0.0f) {
            F2 = xmtVar.m;
        }
        arrayList4.add(new cpp(xmtVar, fValueOf2, fValueOf2, (Interpolator) null, F, Float.valueOf(F2)));
        arrayList4.add(new cpp(xmtVar, f2, f2, (Interpolator) null, F2, Float.valueOf(Float.MAX_VALUE)));
        if (strH3.endsWith(".ai") || "ai".equals(str)) {
            xmtVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z8 != 0) {
            qe0 qe0Var = qe0VarC == null ? new qe0() : qe0VarC;
            qe0Var.m = z8;
            qe0VarC = qe0Var;
        }
        return new drr(arrayList2, xmtVar, strH3, jG, aVar, j4, strH, arrayList, qe0VarC, iC, iC2, color, F5, F6, F3, F4, le0Var, me0Var, arrayList4, bVar, be0VarB, zU, gg4Var, tefVar, zupVar);
    }
}
