package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.gift.gift.presentation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ujk {
    public static final void a(d dVar, Function0<Unit> function0, Function0<Unit> function1, a aVar, final int i) {
        final d dVar2;
        final Function0<Unit> function2;
        final Function0<Unit> function3 = function0;
        dVar.getClass();
        function3.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1543061716);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(function3) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (!bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            dVar2 = dVar;
            function2 = function1;
            bVarI.G();
        } else if (dVar.equals(d.b.a)) {
            bVarI.N(-316465233);
            cys.a(null, bVarI, 0);
            bVarI.X(false);
            dVar2 = dVar;
            function2 = function1;
        } else if (dVar instanceof d.a) {
            bVarI.N(-316376604);
            String strA = cb40.a(R.string.common_functions__error, new Object[0], bVarI);
            UiText uiText = ((d.a) dVar).a;
            uiText.getClass();
            nzj.b(null, strA, uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, null, null, null, null, null, null, null, null, function0, null, bVarI, 0, (i2 << 3) & 896, 12281);
            bVarI.X(false);
            dVar2 = dVar;
            function3 = function0;
            function2 = function1;
        } else if (dVar instanceof d.C0363d) {
            bVarI.N(-316081112);
            d.C0363d c0363d = (d.C0363d) dVar;
            ResourceUiText resourceUiText = c0363d.b;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            function3 = function0;
            function2 = function1;
            nzj.d(resourceUiText.g((Context) bVarI.O(qyd0Var)), c0363d.c.g((Context) bVarI.O(qyd0Var)), null, null, cb40.a(R.string.common_functions__confirm, new Object[0], bVarI), null, null, null, null, null, null, function3, function2, null, bVarI, 0, (i2 << 3) & 8064, 20444);
            bVarI.X(false);
            dVar2 = dVar;
        } else {
            function3 = function0;
            function2 = function1;
            dVar2 = dVar;
            if (!dVar2.equals(d.c.a)) {
                throw igf0.a(bVarI, -1118588199, false);
            }
            bVarI.N(-315691628);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function3, function2, i) { // from class: tjk
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ujk.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
