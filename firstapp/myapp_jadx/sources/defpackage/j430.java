package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class j430 {
    public static final d a(int i, a aVar, d dVar, List list) {
        List listK;
        if ((i & 1) != 0) {
            long j = j58.f;
            listK = b.k(new j58(j58.c(0.0f, j)), new j58(j58.c(0.45f, j)), new j58(j58.c(0.0f, j)));
        } else {
            listK = list;
        }
        egn.a aVarA = kgn.a(kgn.b("", aVar, 0), 0.0f, 1.0f, yi0.a(yi0.e((i & 2) != 0 ? 1000 : 1500, 0, xkf.d, 2), (i & 4) == 0 ? l850.b : l850.a, 0L, 4), "", aVar, 29112, 0);
        boolean zM = aVar.M(aVarA) | aVar.A(listK);
        Object objY = aVar.y();
        if (zM || objY == a.C0041a.a) {
            objY = new cl2(1, listK, aVarA);
            aVar.r(objY);
        }
        return androidx.compose.ui.draw.a.a(dVar, (Function1) objY);
    }
}
