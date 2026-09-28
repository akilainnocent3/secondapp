package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class kyk {
    public static final void a(final d dVar, final cyk.b bVar, final UiText uiText, final Function1 function1, final Function0 function0, a aVar, final int i) {
        int i2;
        b bVar2;
        uiText.getClass();
        b bVarI = aVar.i(871155044);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(uiText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? 16384 : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarV = j.v(j.g(dVar, 1.0f), 0.0f, 34.0f, 0.0f, 13);
            boolean z = (57344 & i2) == 16384;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new ro2(function0, 1);
                bVarI.r(objY);
            }
            d dVarA = androidx.compose.ui.focus.a.a(dVarV, (Function1) objY);
            ijf0 ijf0Var = bVar.a;
            UiText uiText2 = bVar.b;
            gop gopVar = new gop(3, 0, 123);
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG = uiText.g((Context) bVarI.O(qyd0Var));
            uiText2.getClass();
            boolean z2 = !StringsKt.U(uiText2.g((Context) bVarI.O(qyd0Var)));
            ycg.b bVar3 = new ycg.b(uiText2.g((Context) bVarI.O(qyd0Var)));
            boolean z3 = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new gyk(function1, 0);
                bVarI.r(objY2);
            }
            bVar2 = bVarI;
            jr7.a(dVarA, ijf0Var, null, z2, bVar3, false, strG, null, null, gopVar, null, 6, null, null, (Function1) objY2, bVar2, 805306368, 0, 13732);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iyk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kyk.a(dVar, bVar, uiText, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
