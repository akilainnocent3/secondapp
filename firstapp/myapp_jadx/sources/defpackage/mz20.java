package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mz20 {
    public static final void a(final jz20 jz20Var, final Function1<? super hz20, Unit> function1, a aVar, final int i) {
        b bVar;
        function1.getClass();
        b bVarI = aVar.i(-1252724658);
        int i2 = (bVarI.M(jz20Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = jz20Var instanceof jz20.a;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z) {
                bVarI.N(-949266524);
                jz20.a aVar2 = (jz20.a) jz20Var;
                ResourceUiText resourceUiText = aVar2.a;
                qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                String strG = resourceUiText.g((Context) bVarI.O(qyd0Var));
                UiText uiText = aVar2.b;
                uiText.getClass();
                String strG2 = uiText.g((Context) bVarI.O(qyd0Var));
                boolean z2 = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z2 || objY == c0042a) {
                    objY = new w5z(function1, 1);
                    bVarI.r(objY);
                }
                nzj.b(null, strG, strG2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, bVarI, 0, 0, 12281);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                if (jz20Var instanceof jz20.d) {
                    bVar.N(-948942698);
                    jz20.d dVar = (jz20.d) jz20Var;
                    ResourceUiText resourceUiText2 = dVar.a;
                    qyd0 qyd0Var2 = AndroidCompositionLocals_androidKt.b;
                    String strG3 = resourceUiText2.g((Context) bVar.O(qyd0Var2));
                    UiText uiText2 = dVar.b;
                    uiText2.getClass();
                    String strG4 = uiText2.g((Context) bVar.O(qyd0Var2));
                    String strA = cb40.a(R.string.email_change__resend_email, new Object[0], bVar);
                    int i3 = i2 & 112;
                    boolean z3 = i3 == 32;
                    Object objY2 = bVar.y();
                    if (z3 || objY2 == c0042a) {
                        objY2 = new web(function1, 1);
                        bVar.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean z4 = i3 == 32;
                    Object objY3 = bVar.y();
                    if (z4 || objY3 == c0042a) {
                        objY3 = new y5z(1, function1);
                        bVar.r(objY3);
                    }
                    nzj.d(strG3, strG4, null, null, null, strA, null, null, null, null, null, function0, (Function0) objY3, null, bVar, 0, 0, 20412);
                    bVar = bVar;
                    bVar.X(false);
                } else if (Intrinsics.g(jz20Var, jz20.b.a)) {
                    bVar.N(-948425587);
                    String strA2 = cb40.a(R.string.common_functions__error, new Object[0], bVar);
                    String strA3 = cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], bVar);
                    boolean z5 = (i2 & 112) == 32;
                    Object objY4 = bVar.y();
                    if (z5 || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: kz20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(hz20.b.a);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY4);
                    }
                    nzj.b(null, strA2, strA3, null, null, null, null, null, null, null, null, null, (Function0) objY4, null, bVar, 0, 0, 12281);
                    bVar = bVar;
                    bVar.X(false);
                } else if (Intrinsics.g(jz20Var, jz20.c.a)) {
                    bVar.N(-948007955);
                    cys.a(null, bVar, 0);
                    bVar.X(false);
                } else {
                    bVar.N(-1277505102);
                    bVar.X(false);
                }
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: lz20
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mz20.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
