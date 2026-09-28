package defpackage;

import android.graphics.PointF;
import androidx.transition.nfj.CaBJCMnsV;

/* JADX INFO: loaded from: classes.dex */
public final class lye implements cvh0<kye> {
    public static final lye a = new lye();
    public static final hep.a b = hep.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", CaBJCMnsV.MGpOAOJqvhh, "ps", "sz");

    @Override // defpackage.cvh0
    public final kye a(hep hepVar, float f) {
        kye.a aVar;
        PointF pointF;
        hepVar.f();
        String strH = null;
        kye.a aVar2 = kye.a.a;
        float F = 0.0f;
        float F2 = 0.0f;
        float F3 = 0.0f;
        float F4 = 0.0f;
        kye.a aVar3 = aVar2;
        int iG = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zU = true;
        String strH2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        while (hepVar.o()) {
            switch (hepVar.V(b)) {
                case 0:
                    strH = hepVar.H();
                    break;
                case 1:
                    strH2 = hepVar.H();
                    break;
                case 2:
                    aVar = aVar2;
                    pointF = pointF2;
                    F = (float) hepVar.F();
                    aVar2 = aVar;
                    pointF2 = pointF;
                    break;
                case 3:
                    aVar = aVar2;
                    pointF = pointF2;
                    int iG2 = hepVar.G();
                    if (iG2 > 2 || iG2 < 0) {
                        aVar2 = aVar;
                        aVar3 = aVar2;
                    } else {
                        aVar3 = kye.a.values()[iG2];
                        aVar2 = aVar;
                    }
                    pointF2 = pointF;
                    break;
                case 4:
                    iG = hepVar.G();
                    break;
                case 5:
                    aVar = aVar2;
                    pointF = pointF2;
                    F2 = (float) hepVar.F();
                    aVar2 = aVar;
                    pointF2 = pointF;
                    break;
                case 6:
                    aVar = aVar2;
                    pointF = pointF2;
                    F3 = (float) hepVar.F();
                    aVar2 = aVar;
                    pointF2 = pointF;
                    break;
                case 7:
                    iA = lfp.a(hepVar);
                    break;
                case 8:
                    iA2 = lfp.a(hepVar);
                    break;
                case 9:
                    aVar = aVar2;
                    pointF = pointF2;
                    F4 = (float) hepVar.F();
                    aVar2 = aVar;
                    pointF2 = pointF;
                    break;
                case 10:
                    zU = hepVar.u();
                    break;
                case 11:
                    hepVar.d();
                    pointF2 = new PointF(((float) hepVar.F()) * f, ((float) hepVar.F()) * f);
                    hepVar.g();
                    aVar2 = aVar2;
                    break;
                case 12:
                    hepVar.d();
                    aVar = aVar2;
                    pointF = pointF2;
                    pointF3 = new PointF(((float) hepVar.F()) * f, ((float) hepVar.F()) * f);
                    hepVar.g();
                    aVar2 = aVar;
                    pointF2 = pointF;
                    break;
                default:
                    hepVar.Y();
                    hepVar.Z();
                    break;
            }
        }
        hepVar.l();
        kye kyeVar = new kye();
        kyeVar.a = strH;
        kyeVar.b = strH2;
        kyeVar.c = F;
        kyeVar.d = aVar3;
        kyeVar.e = iG;
        kyeVar.f = F2;
        kyeVar.g = F3;
        kyeVar.h = iA;
        kyeVar.i = iA2;
        kyeVar.j = F4;
        kyeVar.k = zU;
        kyeVar.l = pointF2;
        kyeVar.m = pointF3;
        return kyeVar;
    }
}
