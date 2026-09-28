package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class eb10 {
    public static final /* synthetic */ int a = 0;

    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(1135486213);
        if (bVarI.q(i & 1, i != 0)) {
            yle yleVar = new yle(false, false, 4);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new cb10();
                bVarI.r(objY);
            }
            u60.a((Function0) objY, yleVar, jj9.a, bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new db10();
        }
    }
}
