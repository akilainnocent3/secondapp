package yads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bb {
    public static String a(ab abVar) {
        ArrayList arrayList = new ArrayList();
        if (!cv.p0.O3(abVar.a())) {
            arrayList.add(abVar.a());
        }
        if (!cv.p0.O3(abVar.b())) {
            arrayList.add("erid: " + abVar.b());
        }
        return fr.r0.r3(arrayList, " · ", null, null, 0, null, null, 62, null);
    }
}
