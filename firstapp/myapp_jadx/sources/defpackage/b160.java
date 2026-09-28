package defpackage;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b160 {
    public static final d160 a = new d160(kw0.a, ht.a.j);

    public static final d160 a(kw0.e eVar, ht.c cVar, a aVar, int i) {
        if (Intrinsics.g(eVar, kw0.a) && Intrinsics.g(cVar, ht.a.j)) {
            aVar.N(-1073795767);
            aVar.H();
            return a;
        }
        aVar.N(-1073744896);
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.M(eVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.M(cVar)) || (i & 48) == 32);
        Object objY = aVar.y();
        if (z || objY == a.C0041a.a) {
            objY = new d160(eVar, cVar);
            aVar.r(objY);
        }
        d160 d160Var = (d160) objY;
        aVar.H();
        return d160Var;
    }
}
