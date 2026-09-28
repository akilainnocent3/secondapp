package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class b0b {
    public static final hep.a a = hep.a.a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:437:0x0751 A[LOOP:1: B:435:0x074b->B:437:0x0751, LOOP_END] */
    public static a0b a(hfp hfpVar, xmt xmtVar) {
        String strH;
        byte b;
        a0b zn7Var;
        a0b yx80Var;
        a0b j6lVar;
        a0b ay80Var;
        int i;
        oy80.a aVar;
        hfpVar.f();
        int iG = 2;
        while (true) {
            if (!hfpVar.o()) {
                strH = null;
                break;
            }
            int iV = hfpVar.V(a);
            if (iV == 0) {
                strH = hfpVar.H();
                break;
            }
            if (iV != 1) {
                hfpVar.Y();
                hfpVar.Z();
            } else {
                iG = hfpVar.G();
            }
        }
        if (strH == null) {
            return null;
        }
        boolean zU = false;
        switch (strH) {
            case "el":
                b = 0;
                break;
            case "fl":
                b = 1;
                break;
            case "gf":
                b = 2;
                break;
            case "gr":
                b = 3;
                break;
            case "gs":
                b = 4;
                break;
            case "mm":
                b = 5;
                break;
            case "rc":
                b = 6;
                break;
            case "rd":
                b = 7;
                break;
            case "rp":
                b = 8;
                break;
            case "sh":
                b = 9;
                break;
            case "sr":
                b = 10;
                break;
            case "st":
                b = 11;
                break;
            case "tm":
                b = 12;
                break;
            case "tr":
                b = 13;
                break;
            default:
                b = -1;
                break;
        }
        p6l p6lVar = p6l.b;
        p6l p6lVar2 = p6l.a;
        switch (b) {
            case 0:
                hep.a aVar2 = bo7.a;
                boolean z = iG == 3;
                boolean zU2 = false;
                String strH2 = null;
                se0 se0VarB = null;
                he0 he0VarE = null;
                while (hfpVar.o()) {
                    int iV2 = hfpVar.V(bo7.a);
                    if (iV2 == 0) {
                        strH2 = hfpVar.H();
                    } else if (iV2 == 1) {
                        se0VarB = ge0.b(hfpVar, xmtVar);
                    } else if (iV2 == 2) {
                        he0VarE = te0.e(hfpVar, xmtVar);
                    } else if (iV2 == 3) {
                        zU2 = hfpVar.u();
                    } else if (iV2 != 4) {
                        hfpVar.Y();
                        hfpVar.Z();
                    } else {
                        z = hfpVar.G() == 3;
                    }
                }
                zn7Var = new zn7(strH2, se0VarB, he0VarE, z, zU2);
                yx80Var = zn7Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 1:
                hep.a aVar3 = zx80.a;
                int iG2 = 1;
                boolean zU3 = false;
                de0 de0Var = null;
                String strH3 = null;
                ae0 ae0VarA = null;
                boolean zU4 = false;
                while (hfpVar.o()) {
                    int iV3 = hfpVar.V(zx80.a);
                    if (iV3 == 0) {
                        strH3 = hfpVar.H();
                    } else if (iV3 == 1) {
                        ae0VarA = te0.a(hfpVar, xmtVar);
                    } else if (iV3 == 2) {
                        de0Var = te0.d(hfpVar, xmtVar);
                    } else if (iV3 == 3) {
                        zU4 = hfpVar.u();
                    } else if (iV3 == 4) {
                        iG2 = hfpVar.G();
                    } else if (iV3 != 5) {
                        hfpVar.Y();
                        hfpVar.Z();
                    } else {
                        zU3 = hfpVar.u();
                    }
                }
                if (de0Var == null) {
                    de0Var = new de0(Collections.singletonList(new cpp(100)));
                }
                yx80Var = new yx80(strH3, zU4, iG2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, ae0VarA, de0Var, zU3);
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 2:
                hep.a aVar4 = l6l.a;
                Path.FillType fillType = Path.FillType.WINDING;
                boolean zU5 = false;
                de0 de0Var2 = null;
                String strH4 = null;
                p6l p6lVar3 = null;
                ce0 ce0VarC = null;
                he0 he0VarE2 = null;
                he0 he0VarE3 = null;
                while (hfpVar.o()) {
                    switch (hfpVar.V(l6l.a)) {
                        case 0:
                            strH4 = hfpVar.H();
                            break;
                        case 1:
                            hfpVar.f();
                            int iG3 = -1;
                            while (hfpVar.o()) {
                                int iV4 = hfpVar.V(l6l.b);
                                if (iV4 == 0) {
                                    iG3 = hfpVar.G();
                                } else if (iV4 != 1) {
                                    hfpVar.Y();
                                    hfpVar.Z();
                                } else {
                                    ce0VarC = te0.c(hfpVar, xmtVar, iG3);
                                }
                            }
                            hfpVar.l();
                            break;
                        case 2:
                            de0Var2 = te0.d(hfpVar, xmtVar);
                            break;
                        case 3:
                            p6lVar3 = hfpVar.G() != 1 ? p6lVar : p6lVar2;
                            break;
                        case 4:
                            he0VarE2 = te0.e(hfpVar, xmtVar);
                            break;
                        case 5:
                            he0VarE3 = te0.e(hfpVar, xmtVar);
                            break;
                        case 6:
                            fillType = hfpVar.G() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zU5 = hfpVar.u();
                            break;
                        default:
                            hfpVar.Y();
                            hfpVar.Z();
                            break;
                    }
                }
                if (de0Var2 == null) {
                    de0Var2 = new de0(Collections.singletonList(new cpp(100)));
                }
                j6lVar = new j6l(strH4, p6lVar3, fillType, ce0VarC, de0Var2, he0VarE2, he0VarE3, zU5);
                yx80Var = j6lVar;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 3:
                hep.a aVar5 = by80.a;
                ArrayList arrayList = new ArrayList();
                String strH5 = null;
                while (hfpVar.o()) {
                    int iV5 = hfpVar.V(by80.a);
                    if (iV5 == 0) {
                        strH5 = hfpVar.H();
                    } else if (iV5 == 1) {
                        zU = hfpVar.u();
                    } else if (iV5 != 2) {
                        hfpVar.Z();
                    } else {
                        hfpVar.d();
                        while (hfpVar.o()) {
                            a0b a0bVarA = a(hfpVar, xmtVar);
                            if (a0bVarA != null) {
                                arrayList.add(a0bVarA);
                            }
                        }
                        hfpVar.g();
                    }
                }
                ay80Var = new ay80(strH5, zU, arrayList);
                yx80Var = ay80Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 4:
                hep.a aVar6 = o6l.a;
                ArrayList arrayList2 = new ArrayList();
                boolean zU6 = false;
                de0 de0Var3 = null;
                String strH6 = null;
                p6l p6lVar4 = null;
                ce0 ce0VarC2 = null;
                he0 he0VarE4 = null;
                he0 he0VarE5 = null;
                be0 be0VarB = null;
                ly80.a aVar7 = null;
                ly80.b bVar = null;
                be0 be0Var = null;
                float F = 0.0f;
                while (hfpVar.o()) {
                    switch (hfpVar.V(o6l.a)) {
                        case 0:
                            strH6 = hfpVar.H();
                            break;
                        case 1:
                            hfpVar.f();
                            int iG4 = -1;
                            while (hfpVar.o()) {
                                int iV6 = hfpVar.V(o6l.b);
                                if (iV6 == 0) {
                                    iG4 = hfpVar.G();
                                } else if (iV6 != 1) {
                                    hfpVar.Y();
                                    hfpVar.Z();
                                } else {
                                    ce0VarC2 = te0.c(hfpVar, xmtVar, iG4);
                                }
                            }
                            hfpVar.l();
                            break;
                        case 2:
                            de0Var3 = te0.d(hfpVar, xmtVar);
                            break;
                        case 3:
                            p6lVar4 = hfpVar.G() != 1 ? p6lVar : p6lVar2;
                            break;
                        case 4:
                            he0VarE4 = te0.e(hfpVar, xmtVar);
                            break;
                        case 5:
                            he0VarE5 = te0.e(hfpVar, xmtVar);
                            break;
                        case 6:
                            be0VarB = te0.b(hfpVar, xmtVar, true);
                            break;
                        case 7:
                            aVar7 = ly80.a.values()[hfpVar.G() - 1];
                            break;
                        case 8:
                            bVar = ly80.b.values()[hfpVar.G() - 1];
                            break;
                        case 9:
                            F = (float) hfpVar.F();
                            break;
                        case 10:
                            zU6 = hfpVar.u();
                            break;
                        case 11:
                            hfpVar.d();
                            while (hfpVar.o()) {
                                hfpVar.f();
                                String strH7 = null;
                                be0 be0VarB2 = null;
                                while (hfpVar.o()) {
                                    int iV7 = hfpVar.V(o6l.c);
                                    if (iV7 == 0) {
                                        strH7 = hfpVar.H();
                                    } else if (iV7 != 1) {
                                        hfpVar.Y();
                                        hfpVar.Z();
                                    } else {
                                        be0VarB2 = te0.b(hfpVar, xmtVar, true);
                                    }
                                }
                                hfpVar.l();
                                if (strH7.equals("o")) {
                                    be0Var = be0VarB2;
                                } else if (strH7.equals("d") || strH7.equals("g")) {
                                    xmtVar.o = true;
                                    arrayList2.add(be0VarB2);
                                }
                            }
                            hfpVar.g();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((be0) arrayList2.get(0));
                            }
                            break;
                        default:
                            hfpVar.Y();
                            hfpVar.Z();
                            break;
                    }
                }
                if (de0Var3 == null) {
                    de0Var3 = new de0(Collections.singletonList(new cpp(100)));
                }
                j6lVar = new m6l(strH6, p6lVar4, ce0VarC2, de0Var3, he0VarE4, he0VarE5, be0VarB, aVar7, bVar, F, arrayList2, be0Var, zU6);
                yx80Var = j6lVar;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 5:
                hep.a aVar8 = jnv.a;
                hnv.a aVar9 = null;
                String strH8 = null;
                while (hfpVar.o()) {
                    int iV8 = hfpVar.V(jnv.a);
                    if (iV8 == 0) {
                        strH8 = hfpVar.H();
                    } else if (iV8 == 1) {
                        int iG5 = hfpVar.G();
                        hnv.a aVar10 = hnv.a.a;
                        if (iG5 != 1) {
                            if (iG5 == 2) {
                                aVar9 = hnv.a.b;
                            } else if (iG5 == 3) {
                                aVar9 = hnv.a.c;
                            } else if (iG5 == 4) {
                                aVar9 = hnv.a.d;
                            } else if (iG5 == 5) {
                                aVar9 = hnv.a.e;
                            }
                        }
                        aVar9 = aVar10;
                    } else if (iV8 != 2) {
                        hfpVar.Y();
                        hfpVar.Z();
                    } else {
                        zU = hfpVar.u();
                    }
                }
                hnv hnvVar = new hnv(strH8, aVar9, zU);
                xmtVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                yx80Var = hnvVar;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 6:
                hep.a aVar11 = al40.a;
                boolean zU7 = false;
                String strH9 = null;
                se0 se0VarB2 = null;
                he0 he0VarE6 = null;
                be0 be0VarB3 = null;
                while (hfpVar.o()) {
                    int iV9 = hfpVar.V(al40.a);
                    if (iV9 == 0) {
                        strH9 = hfpVar.H();
                    } else if (iV9 == 1) {
                        se0VarB2 = ge0.b(hfpVar, xmtVar);
                    } else if (iV9 == 2) {
                        he0VarE6 = te0.e(hfpVar, xmtVar);
                    } else if (iV9 == 3) {
                        be0VarB3 = te0.b(hfpVar, xmtVar, true);
                    } else if (iV9 != 4) {
                        hfpVar.Z();
                    } else {
                        zU7 = hfpVar.u();
                    }
                }
                zn7Var = new yk40(strH9, se0VarB2, he0VarE6, be0VarB3, zU7);
                yx80Var = zn7Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 7:
                hep.a aVar12 = o060.a;
                String strH10 = null;
                be0 be0VarB4 = null;
                while (hfpVar.o()) {
                    int iV10 = hfpVar.V(o060.a);
                    if (iV10 == 0) {
                        strH10 = hfpVar.H();
                    } else if (iV10 == 1) {
                        be0VarB4 = te0.b(hfpVar, xmtVar, true);
                    } else if (iV10 != 2) {
                        hfpVar.Z();
                    } else {
                        zU = hfpVar.u();
                    }
                }
                yx80Var = zU ? null : new m060(strH10, be0VarB4);
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 8:
                hep.a aVar13 = q850.a;
                boolean zU8 = false;
                String strH11 = null;
                be0 be0VarB5 = null;
                be0 be0VarB6 = null;
                qe0 qe0VarC = null;
                while (hfpVar.o()) {
                    int iV11 = hfpVar.V(q850.a);
                    if (iV11 == 0) {
                        strH11 = hfpVar.H();
                    } else if (iV11 == 1) {
                        be0VarB5 = te0.b(hfpVar, xmtVar, false);
                    } else if (iV11 == 2) {
                        be0VarB6 = te0.b(hfpVar, xmtVar, false);
                    } else if (iV11 == 3) {
                        qe0VarC = re0.c(hfpVar, xmtVar);
                    } else if (iV11 != 4) {
                        hfpVar.Z();
                    } else {
                        zU8 = hfpVar.u();
                    }
                }
                zn7Var = new o850(strH11, be0VarB5, be0VarB6, qe0VarC, zU8);
                yx80Var = zn7Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 9:
                hep.a aVar14 = jy80.a;
                int iG6 = 0;
                boolean zU9 = false;
                je0 je0Var = null;
                String strH12 = null;
                while (hfpVar.o()) {
                    int iV12 = hfpVar.V(jy80.a);
                    if (iV12 == 0) {
                        strH12 = hfpVar.H();
                    } else if (iV12 == 1) {
                        iG6 = hfpVar.G();
                    } else if (iV12 == 2) {
                        je0Var = new je0(fpp.a(hfpVar, xmtVar, srh0.c(), wx80.a, false));
                    } else if (iV12 != 3) {
                        hfpVar.Z();
                    } else {
                        zU9 = hfpVar.u();
                    }
                }
                ay80Var = new iy80(strH12, iG6, je0Var, zU9);
                yx80Var = ay80Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 10:
                hep.a aVar15 = m120.a;
                boolean z2 = iG == 3;
                int i2 = 0;
                boolean zU10 = false;
                String strH13 = null;
                be0 be0VarB7 = null;
                se0 se0VarB3 = null;
                be0 be0VarB8 = null;
                be0 be0VarB9 = null;
                be0 be0VarB10 = null;
                be0 be0VarB11 = null;
                be0 be0VarB12 = null;
                while (hfpVar.o()) {
                    switch (hfpVar.V(m120.a)) {
                        case 0:
                            strH13 = hfpVar.H();
                            break;
                        case 1:
                            int iG7 = hfpVar.G();
                            int[] iArrC = pjh.c(2);
                            int length = iArrC.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    i2 = 0;
                                }
                                int i4 = iArrC[i3];
                                if (i4 == 1) {
                                    i = 1;
                                } else {
                                    if (i4 != 2) {
                                        throw null;
                                    }
                                    i = 2;
                                }
                                if (i == iG7) {
                                    i2 = i4;
                                }
                                i3++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            be0VarB7 = te0.b(hfpVar, xmtVar, false);
                            break;
                        case 3:
                            se0VarB3 = ge0.b(hfpVar, xmtVar);
                            break;
                        case 4:
                            be0VarB8 = te0.b(hfpVar, xmtVar, false);
                            break;
                        case 5:
                            be0VarB10 = te0.b(hfpVar, xmtVar, true);
                            break;
                        case 6:
                            be0VarB12 = te0.b(hfpVar, xmtVar, false);
                            break;
                        case 7:
                            be0VarB9 = te0.b(hfpVar, xmtVar, true);
                            break;
                        case 8:
                            be0VarB11 = te0.b(hfpVar, xmtVar, false);
                            break;
                        case 9:
                            zU10 = hfpVar.u();
                            break;
                        case 10:
                            z2 = hfpVar.G() == 3;
                            break;
                        default:
                            hfpVar.Y();
                            hfpVar.Z();
                            break;
                    }
                }
                zn7Var = new l120(strH13, i2, be0VarB7, se0VarB3, be0VarB8, be0VarB9, be0VarB10, be0VarB11, be0VarB12, zU10, z2);
                yx80Var = zn7Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 11:
                hep.a aVar16 = my80.a;
                ArrayList arrayList3 = new ArrayList();
                boolean zU11 = false;
                de0 de0Var4 = null;
                ly80.a aVar17 = null;
                ly80.b bVar2 = null;
                String strH14 = null;
                be0 be0Var2 = null;
                ae0 ae0VarA2 = null;
                be0 be0VarB13 = null;
                float F2 = 0.0f;
                while (hfpVar.o()) {
                    switch (hfpVar.V(my80.a)) {
                        case 0:
                            strH14 = hfpVar.H();
                            break;
                        case 1:
                            ae0VarA2 = te0.a(hfpVar, xmtVar);
                            break;
                        case 2:
                            be0VarB13 = te0.b(hfpVar, xmtVar, true);
                            break;
                        case 3:
                            de0Var4 = te0.d(hfpVar, xmtVar);
                            break;
                        case 4:
                            aVar17 = ly80.a.values()[hfpVar.G() - 1];
                            break;
                        case 5:
                            bVar2 = ly80.b.values()[hfpVar.G() - 1];
                            break;
                        case 6:
                            F2 = (float) hfpVar.F();
                            break;
                        case 7:
                            zU11 = hfpVar.u();
                            break;
                        case 8:
                            hfpVar.d();
                            while (hfpVar.o()) {
                                hfpVar.f();
                                String strH15 = null;
                                be0 be0VarB14 = null;
                                while (hfpVar.o()) {
                                    int iV13 = hfpVar.V(my80.b);
                                    if (iV13 == 0) {
                                        strH15 = hfpVar.H();
                                    } else if (iV13 != 1) {
                                        hfpVar.Y();
                                        hfpVar.Z();
                                    } else {
                                        be0VarB14 = te0.b(hfpVar, xmtVar, true);
                                    }
                                }
                                hfpVar.l();
                                strH15.getClass();
                                switch (strH15) {
                                    case "d":
                                    case "g":
                                        xmtVar.o = true;
                                        arrayList3.add(be0VarB14);
                                        break;
                                    case "o":
                                        be0Var2 = be0VarB14;
                                        break;
                                }
                            }
                            hfpVar.g();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((be0) arrayList3.get(0));
                            }
                            break;
                        default:
                            hfpVar.Z();
                            break;
                    }
                }
                if (de0Var4 == null) {
                    de0Var4 = new de0(Collections.singletonList(new cpp(100)));
                }
                de0 de0Var5 = de0Var4;
                if (aVar17 == null) {
                    aVar17 = ly80.a.a;
                }
                ly80.a aVar18 = aVar17;
                if (bVar2 == null) {
                    bVar2 = ly80.b.a;
                }
                yx80Var = new ly80(strH14, be0Var2, arrayList3, ae0VarA2, de0Var5, be0VarB13, aVar18, bVar2, F2, zU11);
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 12:
                hep.a aVar19 = py80.a;
                boolean zU12 = false;
                String strH16 = null;
                oy80.a aVar20 = null;
                be0 be0VarB15 = null;
                be0 be0VarB16 = null;
                be0 be0VarB17 = null;
                while (hfpVar.o()) {
                    int iV14 = hfpVar.V(py80.a);
                    if (iV14 == 0) {
                        be0VarB15 = te0.b(hfpVar, xmtVar, false);
                    } else if (iV14 == 1) {
                        be0VarB16 = te0.b(hfpVar, xmtVar, false);
                    } else if (iV14 == 2) {
                        be0VarB17 = te0.b(hfpVar, xmtVar, false);
                    } else if (iV14 == 3) {
                        strH16 = hfpVar.H();
                    } else if (iV14 == 4) {
                        int iG8 = hfpVar.G();
                        if (iG8 == 1) {
                            aVar = oy80.a.a;
                        } else {
                            if (iG8 != 2) {
                                hb5.a(hce0.a(iG8, "Unknown trim path type "));
                                return null;
                            }
                            aVar = oy80.a.b;
                        }
                        aVar20 = aVar;
                    } else if (iV14 != 5) {
                        hfpVar.Z();
                    } else {
                        zU12 = hfpVar.u();
                    }
                }
                zn7Var = new oy80(strH16, aVar20, be0VarB15, be0VarB16, be0VarB17, zU12);
                yx80Var = zn7Var;
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            case 13:
                yx80Var = re0.c(hfpVar, xmtVar);
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
            default:
                lgt.b("Unknown shape type ".concat(strH));
                while (hfpVar.o()) {
                    hfpVar.Z();
                }
                hfpVar.l();
                return yx80Var;
        }
    }
}
