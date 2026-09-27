package eb;

import android.graphics.PointF;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i implements n0<za.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f80673a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.c.a f80674b = fb.c.a.a("t", InneractiveMediationDefs.GENDER_FEMALE, "s", c2.j.f22221a, "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // eb.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public za.b a(fb.c cVar, float f10) throws IOException {
        za.b.a aVar = za.b.a.CENTER;
        cVar.h();
        za.b.a aVar2 = aVar;
        String strR = null;
        String strR2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fO = 0.0f;
        float fO2 = 0.0f;
        float fO3 = 0.0f;
        float fO4 = 0.0f;
        int iP = 0;
        int iD = 0;
        int iD2 = 0;
        boolean zN = true;
        while (cVar.m()) {
            switch (cVar.E(f80674b)) {
                case 0:
                    strR = cVar.r();
                    break;
                case 1:
                    strR2 = cVar.r();
                    break;
                case 2:
                    fO = (float) cVar.o();
                    break;
                case 3:
                    int iP2 = cVar.p();
                    aVar2 = za.b.a.CENTER;
                    if (iP2 <= aVar2.ordinal() && iP2 >= 0) {
                        aVar2 = za.b.a.values()[iP2];
                    }
                    break;
                case 4:
                    iP = cVar.p();
                    break;
                case 5:
                    fO2 = (float) cVar.o();
                    break;
                case 6:
                    fO3 = (float) cVar.o();
                    break;
                case 7:
                    iD = s.d(cVar);
                    break;
                case 8:
                    iD2 = s.d(cVar);
                    break;
                case 9:
                    fO4 = (float) cVar.o();
                    break;
                case 10:
                    zN = cVar.n();
                    break;
                case 11:
                    cVar.d();
                    PointF pointF3 = new PointF(((float) cVar.o()) * f10, ((float) cVar.o()) * f10);
                    cVar.k();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.d();
                    PointF pointF4 = new PointF(((float) cVar.o()) * f10, ((float) cVar.o()) * f10);
                    cVar.k();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.F();
                    cVar.G();
                    break;
            }
        }
        cVar.l();
        return new za.b(strR, strR2, fO, aVar2, iP, fO2, fO3, iD, iD2, fO4, zN, pointF, pointF2);
    }
}
