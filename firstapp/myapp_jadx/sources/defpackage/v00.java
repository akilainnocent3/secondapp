package defpackage;

import androidx.compose.runtime.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v00 {
    public static final gzg0 a = yi0.e(0, 0, null, 7);
    public static final u00 b = new u00(0);
    public static final i4d c = j4d.b(3, 0.0f);
    public static final int d = 8;

    public static l5f0 a(i20 i20Var, Function1 function1, fkd0 fkd0Var, a aVar, int i) {
        mmd mmdVar = (mmd) aVar.O(kna.h);
        int i2 = 0;
        boolean z = true;
        boolean zM = aVar.M(mmdVar) | ((((i & 14) ^ 6) > 4 && aVar.M(i20Var)) || (i & 6) == 4);
        if ((((i & 112) ^ 48) <= 32 || !aVar.M(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean zM2 = zM | z | aVar.M(fkd0Var);
        Object objY = aVar.y();
        if (zM2 || objY == a.C0041a.a) {
            objY = new t4a0(new a10(i20Var, function1, new z00(mmdVar, i2)), androidx.compose.foundation.gestures.a.b, fkd0Var);
            aVar.r(objY);
        }
        return (l5f0) objY;
    }
}
