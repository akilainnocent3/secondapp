package defpackage;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g78 {
    public static final i78 a = new i78(kw0.c, ht.a.m);

    public static final i78 a(kw0.l lVar, ht.b bVar, a aVar, int i) {
        if (Intrinsics.g(lVar, kw0.c) && Intrinsics.g(bVar, ht.a.m)) {
            aVar.N(-1446569784);
            aVar.H();
            return a;
        }
        aVar.N(-1446515937);
        boolean z = ((((i & 14) ^ 6) > 4 && aVar.M(lVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.M(bVar)) || (i & 48) == 32);
        Object objY = aVar.y();
        if (z || objY == a.C0041a.a) {
            objY = new i78(lVar, bVar);
            aVar.r(objY);
        }
        i78 i78Var = (i78) objY;
        aVar.H();
        return i78Var;
    }
}
