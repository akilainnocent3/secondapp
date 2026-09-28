package androidx.compose.ui.layout;

import defpackage.hlh0;
import defpackage.hlt;
import defpackage.ilt;
import defpackage.klt;
import defpackage.llt;
import defpackage.op8;
import defpackage.u6d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final void a(int i, op8 op8Var, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(441837433);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new r();
                bVarI.r(objY);
            }
            r rVar = (r) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = hlt.a;
                bVarI.r(objY2);
            }
            Function0 function0 = (Function0) objY2;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(function0);
            } else {
                bVarI.p();
            }
            if (bVarI.g()) {
                bVarI.a(Unit.a, new u6d0(ilt.a));
            }
            hlh0.a(bVarI, rVar, klt.a);
            op8Var.invoke(rVar, bVarI, 48);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new llt(i, op8Var);
        }
    }
}
