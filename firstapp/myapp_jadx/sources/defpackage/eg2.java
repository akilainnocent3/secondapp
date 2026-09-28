package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eg2 {
    public static final void a(ComposeView composeView, final uwd0 uwd0Var, final boolean z, final ResourceUiText resourceUiText, final Function1 function1, final Function0 function0) {
        uwd0Var.getClass();
        composeView.setContent(new op8(-781922293, new Function2() { // from class: ag2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final uwd0 uwd0Var2 = uwd0Var;
                    final boolean z2 = z;
                    final ResourceUiText resourceUiText2 = resourceUiText;
                    final Function1 function2 = function1;
                    final Function0 function3 = function0;
                    o0z.a(null, null, null, null, null, pp8.b(-23120964, new Function2() { // from class: dg2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ytw ytwVarC = wyh.c(uwd0Var2, aVar2, 0, 7);
                                boolean zB = aVar2.b(((Boolean) ytwVarC.getValue()).booleanValue());
                                boolean z3 = z2;
                                boolean zB2 = zB | aVar2.b(z3);
                                ResourceUiText resourceUiText3 = resourceUiText2;
                                boolean zM = zB2 | aVar2.M(resourceUiText3);
                                Object objY = aVar2.y();
                                if (zM || objY == a.C0041a.a) {
                                    bh2 bh2Var = new bh2(((Boolean) ytwVarC.getValue()).booleanValue(), z3, resourceUiText3, (z3 && ((Boolean) ytwVarC.getValue()).booleanValue()) ? R.color.background_type2_secondary : R.color.bg_primary_d_base, z3 ? R.color.text_inverse_secondary : R.color.text_type1_tertiary);
                                    aVar2.r(bh2Var);
                                    objY = bh2Var;
                                }
                                ah2.a(null, (bh2) objY, function2, function3, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
