package eb;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fb.c.a f80696a = fb.c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static za.c a(fb.c cVar) throws IOException {
        cVar.h();
        String strR = null;
        String strR2 = null;
        float fO = 0.0f;
        String strR3 = null;
        while (cVar.m()) {
            int iE = cVar.E(f80696a);
            if (iE == 0) {
                strR = cVar.r();
            } else if (iE == 1) {
                strR3 = cVar.r();
            } else if (iE == 2) {
                strR2 = cVar.r();
            } else if (iE != 3) {
                cVar.F();
                cVar.G();
            } else {
                fO = (float) cVar.o();
            }
        }
        cVar.l();
        return new za.c(strR, strR3, strR2, fO);
    }
}
