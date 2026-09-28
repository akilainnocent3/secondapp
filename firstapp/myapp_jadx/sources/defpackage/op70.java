package defpackage;

import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class op70 {
    public static final zp70 a(a aVar) {
        Object[] objArr = new Object[0];
        boolean zD = aVar.d(0);
        Object objY = aVar.y();
        if (zD || objY == a.C0041a.a) {
            objY = new np70();
            aVar.r(objY);
        }
        return (zp70) o350.c(objArr, zp70.i, (Function0) objY, aVar, 0);
    }

    public static d b(d dVar, zp70 zp70Var, boolean z, boolean z2, boolean z3) {
        return h.a(dVar, zp70Var, z3 ? i3z.a : i3z.b, z2, z, null, zp70Var.c, true, null, null).n(new ScrollingLayoutElement(zp70Var, z, z3));
    }

    public static d c(d dVar, zp70 zp70Var, int i) {
        return b(dVar, zp70Var, (i & 8) == 0, true, true);
    }
}
