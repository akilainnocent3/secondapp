package eb;

import androidx.appcompat.widget.SearchView;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fb.c.a f80720a = fb.c.a.a(SearchView.F0, "mm", "hd");

    public static bb.j a(fb.c cVar) throws IOException {
        String strR = null;
        boolean zN = false;
        bb.j.a aVarE = null;
        while (cVar.m()) {
            int iE = cVar.E(f80720a);
            if (iE == 0) {
                strR = cVar.r();
            } else if (iE == 1) {
                aVarE = bb.j.a.e(cVar.p());
            } else if (iE != 2) {
                cVar.F();
                cVar.G();
            } else {
                zN = cVar.n();
            }
        }
        return new bb.j(strR, aVarE, zN);
    }
}
