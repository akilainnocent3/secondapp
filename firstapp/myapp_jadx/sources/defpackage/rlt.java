package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rlt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ult ultVar, final Function0 function0, a aVar, final int i) {
        function0.getClass();
        b bVarI = aVar.i(395318158);
        int i2 = i | 2 | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                ultVar = (ult) p8i0.a(jq40.a(ult.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
            }
            int i3 = i2 & (-15);
            bVarI.Y();
            slt sltVar = (slt) wyh.c(ultVar.b, bVarI, 0, 7).getValue();
            if (sltVar instanceof slt.b) {
                bVarI.N(1943635907);
                qcs.a(0, bVarI);
                bVarI.X(false);
            } else if (sltVar instanceof slt.a) {
                bVarI.N(1943637792);
                cdg.a(0, 1, bVarI, null);
                bVarI.X(false);
            } else {
                if (!(sltVar instanceof slt.c)) {
                    throw igf0.a(bVarI, 1943634018, false);
                }
                bVarI.N(1943639747);
                b((slt.c) sltVar, function0, bVarI, (i3 & 112) | 8);
                bVarI.X(false);
            }
            xfa.a(ultVar, bVarI, 8);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, i) { // from class: plt
                public final /* synthetic */ Function0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rlt.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final slt.c cVar, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1809139398);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(cVar) : bVarI.A(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            LinkedHashMap linkedHashMap = cVar.a;
            StringUiText stringUiText = vch0.a;
            z990.d(linkedHashMap, a4h.a(new ResourceUiText(R.string.page_limits__loss_limits_are_calculated_tip), new ResourceUiText(R.string.page_limits__if_you_reach_any_real_sports_virtuals_casino_limit_tip)), function0, bVarI, (i2 << 3) & 896);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qlt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    rlt.b(cVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
