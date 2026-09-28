package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class f4i {
    public static final ytw a(psw pswVar, a aVar, int i) {
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = m.b(Boolean.FALSE);
            aVar.r(objY);
        }
        ytw ytwVar = (ytw) objY;
        boolean z = (((i & 14) ^ 6) > 4 && aVar.M(pswVar)) || (i & 6) == 4;
        Object objY2 = aVar.y();
        if (z || objY2 == c0042a) {
            objY2 = new e4i(pswVar, ytwVar, null);
            aVar.r(objY2);
        }
        xvf.e(aVar, pswVar, (Function2) objY2);
        return ytwVar;
    }
}
