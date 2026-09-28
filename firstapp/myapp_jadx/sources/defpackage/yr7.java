package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class yr7 {
    public static final void a(final String str, final String str2, a aVar, final int i) {
        int i2;
        str2.getClass();
        b bVarI = aVar.i(1418031899);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str2) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.N(1224026315);
            nk0.b bVar = new nk0.b((Object) null);
            int length = str.length();
            bVar.g(str);
            bVar.d(imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.brand_quaternary, bVarI), 0L, null, null, null, 0L, yef0.c, null, null, 0, 0L, null, null, 16773118).a, 0, length);
            bVar.c(0, length, "url", str2);
            final nk0 nk0VarM = bVar.m();
            bVarI.X(false);
            final lmh0 lmh0Var = (lmh0) bVarI.O(kna.r);
            boolean zM = bVarI.M(nk0VarM) | bVarI.A(lmh0Var);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = new Function1() { // from class: wr7
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iIntValue = ((Integer) obj).intValue();
                        nk0.d dVar = (nk0.d) CollectionsKt.firstOrNull(nk0VarM.b(iIntValue, iIntValue, "url"));
                        if (dVar != null) {
                            lmh0Var.a((String) dVar.a);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            vr7.a(nk0VarM, null, null, false, 0, 0, null, (Function1) objY, bVarI, 0, WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xr7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    yr7.a(str, str2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
