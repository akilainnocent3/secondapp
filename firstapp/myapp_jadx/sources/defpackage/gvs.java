package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class gvs {
    public static final /* synthetic */ int a = 0;

    public static final void a(final boolean z, final Function2 function2, a aVar, final int i) {
        b bVarI = aVar.i(1818896922);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.A(function2) ? 32 : 16);
        if ((i2 & 19) == 18 && bVarI.j()) {
            bVarI.G();
        } else {
            vm20.a(z, function2, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function2, i) { // from class: tfx
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function2 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gvs.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
