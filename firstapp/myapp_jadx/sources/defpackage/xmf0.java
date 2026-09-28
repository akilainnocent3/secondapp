package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class xmf0 {
    public static final void a(final op8 op8Var, float f, Function2 function2, Function2 function3, a aVar, final int i, final int i2) {
        int i3;
        b bVarI = aVar.i(1772026357);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 384;
        } else if ((i & 384) == 0) {
            i3 = (bVarI.c(f) ? 256 : 128) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= bVarI.A(function2) ? 2048 : 1024;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9361) != 9360)) {
            if (i4 != 0) {
                f = 10.0f;
            }
            if (i5 != 0) {
                function2 = null;
            }
            if (i6 != 0) {
                function3 = null;
            }
            d.a aVar2 = d.a.b;
            if (function2 != null) {
                bVarI.N(994384493);
                function2.invoke(bVarI, Integer.valueOf((i3 >> 9) & 14));
                ty0.a(bVarI, j.w(aVar2, f));
                bVarI.X(false);
            } else {
                bVarI.N(994445997);
                bVarI.X(false);
            }
            op8Var.invoke(bVarI, 6);
            if (function3 != null) {
                yqg.a(bVarI, 994488684, aVar2, f, bVarI);
                function3.invoke(bVarI, Integer.valueOf((i3 >> 12) & 14));
                bVarI.X(false);
            } else {
                bVarI.N(994551149);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        final float f2 = f;
        final Function2 function4 = function2;
        final Function2 function5 = function3;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wmf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xmf0.a(op8Var, f2, function4, function5, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
