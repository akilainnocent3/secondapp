package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class nrv {
    public static final void a(final uxs uxsVar, final Function0<Unit> function0, Function0<Unit> function1, a aVar, final int i) {
        final Function0<Unit> function2;
        uxsVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1417144509);
        int i2 = i | (bVarI.d(uxsVar.ordinal()) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__mission_cancel_sheet_title);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_loyalty__mission_cancel_sheet_body);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).o;
            long j2 = ((lib0) bVarI.O(qyd0Var)).b1;
            long j3 = ((lib0) bVarI.O(qyd0Var)).o;
            qyd0 qyd0Var2 = ejb0.a;
            m65 m65VarA = m65.a.a(0.0f, ((cjb0) bVarI.O(qyd0Var2)).e, ((cjb0) bVarI.O(qyd0Var2)).h, ((cjb0) bVarI.O(qyd0Var2)).f, bVarI, 9);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__confirm);
            m2g m2gVar = m2g.a;
            m2gVar.getClass();
            function2 = function1;
            jib0.f(null, resourceUiText, null, resourceUiText2, null, function2, j2, j3, j, null, null, m65VarA, new z45.c(new w45.c("bottom_sheet_primary_button", resourceUiText3, uxsVar, m2gVar, function0)), null, null, null, bVarI, (i2 << 12) & 3670016, 0, 117813);
            bVarI = bVarI;
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function2, i) { // from class: mrv
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    nrv.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
