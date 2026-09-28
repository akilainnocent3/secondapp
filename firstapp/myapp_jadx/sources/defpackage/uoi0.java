package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class uoi0 {
    public static final void a(final String str, final ijf0 ijf0Var, final z900 z900Var, final d dVar, final Function1 function1, final Function0 function0, a aVar, final int i) {
        ijf0Var.getClass();
        z900Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1693381316);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(ijf0Var) ? 32 : 16) | (bVarI.M(z900Var) ? 2048 : 1024);
        if ((i & 196608) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            boolean z = (458752 & i2) == 131072;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new ox10(function1, i3);
                bVarI.r(objY);
            }
            fa00.a(str, ijf0Var, z900Var, dVar, null, (Function1) objY, function0, null, bVarI, ((i2 >> 3) & 896) | (i2 & WebSocketProtocol.PAYLOAD_SHORT) | 1575936, 144);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: toi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uoi0.a(str, ijf0Var, z900Var, dVar, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
