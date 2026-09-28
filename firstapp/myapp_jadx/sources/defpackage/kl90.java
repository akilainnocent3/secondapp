package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class kl90 {
    public static final void a(LayoutWeightElement layoutWeightElement, final ll90 ll90Var, zzr zzrVar, Function0 function0, pf3 pf3Var, a aVar, final int i) {
        int i2;
        LayoutWeightElement layoutWeightElement2;
        final pf3 pf3Var2;
        final Function0 function1;
        final zzr zzrVar2;
        ll90Var.getClass();
        zzrVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(178050204);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(ll90Var) : bVarI.A(ll90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(zzrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(pf3Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (!bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            layoutWeightElement2 = layoutWeightElement;
            pf3Var2 = pf3Var;
            function1 = function0;
            zzrVar2 = zzrVar;
            bVarI.G();
        } else if (ll90Var instanceof pl90) {
            bVarI.N(9329689);
            ol90.a(layoutWeightElement, bVarI, i2 & 14);
            bVarI.X(false);
            layoutWeightElement2 = layoutWeightElement;
            pf3Var2 = pf3Var;
            function1 = function0;
            zzrVar2 = zzrVar;
        } else {
            if (!(ll90Var instanceof om90)) {
                throw igf0.a(bVarI, -692437612, false);
            }
            bVarI.N(9472134);
            layoutWeightElement2 = layoutWeightElement;
            nm90.a(layoutWeightElement2, (om90) ll90Var, zzrVar, function0, pf3Var, bVarI, i2 & 65534);
            zzrVar2 = zzrVar;
            function1 = function0;
            pf3Var2 = pf3Var;
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final LayoutWeightElement layoutWeightElement3 = layoutWeightElement2;
            eVarZ.d = new Function2() { // from class: jl90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kl90.a(layoutWeightElement3, ll90Var, zzrVar2, function1, pf3Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
