package defpackage;

import android.graphics.Rect;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mnt {
    public static final hep.a a = hep.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final hep.a b = hep.a.a(AnalyticsParam.EVENT_PARAM_ID, "layers", "w", "h", "p", "u");
    public static final hep.a c = hep.a.a(AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS);
    public static final hep.a d = hep.a.a("cm", "tm", "dr");

    public static xmt a(hfp hfpVar) throws hdp, EOFException {
        float f;
        float f2;
        float f3;
        float f4;
        float fC = srh0.c();
        qkt<drr> qktVar = new qkt<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        esa0<d8i> esa0Var = new esa0<>();
        xmt xmtVar = new xmt();
        hfpVar.f();
        float F = 0.0f;
        int iF = 0;
        int iF2 = 0;
        float F2 = 0.0f;
        float F3 = 0.0f;
        while (hfpVar.o()) {
            fC = fC;
            switch (hfpVar.V(a)) {
                case 0:
                    iF = (int) hfpVar.F();
                    F = F;
                    break;
                case 1:
                    iF2 = (int) hfpVar.F();
                    F = F;
                    break;
                case 2:
                    F2 = (float) hfpVar.F();
                    F = F;
                    break;
                case 3:
                    F3 = ((float) hfpVar.F()) - 0.01f;
                    F = F;
                    break;
                case 4:
                    F = (float) hfpVar.F();
                    fC = fC;
                    break;
                case 5:
                    F = F;
                    f = F2;
                    f2 = F3;
                    String[] strArrSplit = hfpVar.H().split("\\.");
                    int i = Integer.parseInt(strArrSplit[0]);
                    int i2 = Integer.parseInt(strArrSplit[1]);
                    int i3 = Integer.parseInt(strArrSplit[2]);
                    if (i < 4 || (i <= 4 && (i2 < 4 || (i2 <= 4 && i3 < 0)))) {
                        xmtVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
                case 6:
                    F = F;
                    f = F2;
                    f2 = F3;
                    hfpVar.d();
                    int i4 = 0;
                    while (hfpVar.o()) {
                        drr drrVarA = err.a(hfpVar, xmtVar);
                        if (drrVarA.e == drr.a.b) {
                            i4++;
                        }
                        arrayList.add(drrVarA);
                        qktVar.f(drrVarA, drrVarA.d);
                        if (i4 > 4) {
                            lgt.b("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    hfpVar.g();
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
                case 7:
                    F = F;
                    f = F2;
                    f2 = F3;
                    hfpVar.d();
                    while (hfpVar.o()) {
                        ArrayList arrayList3 = new ArrayList();
                        qkt qktVar2 = new qkt();
                        hfpVar.f();
                        String strH = null;
                        String strH2 = null;
                        String strH3 = null;
                        int iG = 0;
                        int iG2 = 0;
                        while (hfpVar.o()) {
                            int iV = hfpVar.V(b);
                            if (iV == 0) {
                                strH = hfpVar.H();
                            } else if (iV == 1) {
                                hfpVar.d();
                                while (hfpVar.o()) {
                                    drr drrVarA2 = err.a(hfpVar, xmtVar);
                                    qktVar2.f(drrVarA2, drrVarA2.d);
                                    arrayList3.add(drrVarA2);
                                }
                                hfpVar.g();
                            } else if (iV == 2) {
                                iG = hfpVar.G();
                            } else if (iV == 3) {
                                iG2 = hfpVar.G();
                            } else if (iV == 4) {
                                strH2 = hfpVar.H();
                            } else if (iV != 5) {
                                hfpVar.Y();
                                hfpVar.Z();
                            } else {
                                strH3 = hfpVar.H();
                            }
                        }
                        hfpVar.l();
                        if (strH2 != null) {
                            map2.put(strH, new pot(strH, iG, iG2, strH2, strH3));
                        } else {
                            map.put(strH, arrayList3);
                        }
                    }
                    hfpVar.g();
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
                case 8:
                    F = F;
                    f = F2;
                    float f5 = F3;
                    hfpVar.f();
                    while (hfpVar.o()) {
                        if (hfpVar.V(c) != 0) {
                            hfpVar.Y();
                            hfpVar.Z();
                        } else {
                            hfpVar.d();
                            while (hfpVar.o()) {
                                hep.a aVar = s8i.a;
                                hfpVar.f();
                                String strH4 = null;
                                String strH5 = null;
                                String strH6 = null;
                                while (hfpVar.o()) {
                                    int iV2 = hfpVar.V(s8i.a);
                                    if (iV2 != 0) {
                                        float f6 = f5;
                                        if (iV2 == 1) {
                                            strH5 = hfpVar.H();
                                        } else if (iV2 == 2) {
                                            strH6 = hfpVar.H();
                                        } else if (iV2 != 3) {
                                            hfpVar.Y();
                                            hfpVar.Z();
                                        } else {
                                            hfpVar.F();
                                        }
                                        f5 = f6;
                                    } else {
                                        strH4 = hfpVar.H();
                                    }
                                }
                                hfpVar.l();
                                map3.put(strH5, new a8i(strH4, strH5, strH6));
                                f5 = f5;
                            }
                            hfpVar.g();
                        }
                    }
                    f2 = f5;
                    hfpVar.l();
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
                case 9:
                    F = F;
                    f = F2;
                    f3 = F3;
                    hfpVar.d();
                    while (hfpVar.o()) {
                        hep.a aVar2 = e8i.a;
                        ArrayList arrayList4 = new ArrayList();
                        hfpVar.f();
                        double dF = 0.0d;
                        String strH7 = null;
                        String strH8 = null;
                        char cCharAt = 0;
                        while (hfpVar.o()) {
                            int iV3 = hfpVar.V(e8i.a);
                            if (iV3 == 0) {
                                cCharAt = hfpVar.H().charAt(0);
                            } else if (iV3 == 1) {
                                hfpVar.F();
                            } else if (iV3 == 2) {
                                dF = hfpVar.F();
                            } else if (iV3 == 3) {
                                strH7 = hfpVar.H();
                            } else if (iV3 == 4) {
                                strH8 = hfpVar.H();
                            } else if (iV3 != 5) {
                                hfpVar.Y();
                                hfpVar.Z();
                            } else {
                                hfpVar.f();
                                while (hfpVar.o()) {
                                    if (hfpVar.V(e8i.b) != 0) {
                                        hfpVar.Y();
                                        hfpVar.Z();
                                    } else {
                                        hfpVar.d();
                                        while (hfpVar.o()) {
                                            arrayList4.add((ay80) b0b.a(hfpVar, xmtVar));
                                        }
                                        hfpVar.g();
                                    }
                                }
                                hfpVar.l();
                            }
                        }
                        hfpVar.l();
                        d8i d8iVar = new d8i(arrayList4, cCharAt, dF, strH7, strH8);
                        esa0Var.d(d8iVar.hashCode(), d8iVar);
                    }
                    hfpVar.g();
                    f2 = f3;
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
                case 10:
                    hfpVar.d();
                    while (hfpVar.o()) {
                        hfpVar.f();
                        String strH9 = null;
                        float F4 = 0.0f;
                        float F5 = 0.0f;
                        while (hfpVar.o()) {
                            int iV4 = hfpVar.V(d);
                            if (iV4 != 0) {
                                f4 = F;
                                if (iV4 == 1) {
                                    F3 = F3;
                                    F4 = (float) hfpVar.F();
                                } else if (iV4 != 2) {
                                    hfpVar.Y();
                                    hfpVar.Z();
                                } else {
                                    F3 = F3;
                                    F5 = (float) hfpVar.F();
                                }
                                F = f4;
                                F2 = F2;
                            } else {
                                f4 = F;
                                strH9 = hfpVar.H();
                            }
                            F = f4;
                        }
                        hfpVar.l();
                        arrayList2.add(new opu(strH9, F4, F5));
                        F3 = F3;
                        F2 = F2;
                        F = F;
                    }
                    F = F;
                    f = F2;
                    f3 = F3;
                    hfpVar.g();
                    f2 = f3;
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
                default:
                    hfpVar.Y();
                    hfpVar.Z();
                    F = F;
                    f = F2;
                    f2 = F3;
                    F2 = f;
                    F3 = f2;
                    F = F;
                    break;
            }
        }
        float f7 = fC;
        float f8 = F;
        Rect rect = new Rect(0, 0, (int) (iF * f7), (int) (iF2 * f7));
        float fC2 = srh0.c();
        xmtVar.k = rect;
        xmtVar.l = F2;
        xmtVar.m = F3;
        xmtVar.n = f8;
        xmtVar.j = arrayList;
        xmtVar.i = qktVar;
        xmtVar.c = map;
        xmtVar.d = map2;
        xmtVar.e = fC2;
        xmtVar.h = esa0Var;
        xmtVar.f = map3;
        xmtVar.g = arrayList2;
        return xmtVar;
    }
}
