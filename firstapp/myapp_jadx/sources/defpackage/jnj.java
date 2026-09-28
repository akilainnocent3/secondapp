package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class jnj {
    public static final /* synthetic */ int a = 0;

    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(2081030709);
        if (bVarI.q(i & 1, i != 0)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new yce0();
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pv9.a, bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new zce0();
        }
    }

    public static final inj b(double d) {
        if (d <= 1.5d) {
            return inj.a;
        }
        if (d <= 4.9d) {
            return inj.b;
        }
        if (d <= 9.9d) {
            return inj.c;
        }
        return d <= 18.9d ? inj.d : inj.e;
    }
}
