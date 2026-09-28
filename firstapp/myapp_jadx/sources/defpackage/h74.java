package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h74 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h74(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                aa aaVar = (aa) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(aaVar.D, aVar, 0, 7);
                    if (((q74) ytwVarC.getValue()).e) {
                        aVar.N(1555945457);
                        cys.a(null, aVar, 0);
                        aVar.H();
                    } else {
                        aVar.N(1555982936);
                        aVar.H();
                    }
                    UiText uiText = ((q74) ytwVarC.getValue()).g;
                    uiText.getClass();
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    if (uiText.g((Context) aVar.O(qyd0Var)).length() > 0) {
                        aVar.N(1556045928);
                        UiText uiText2 = ((q74) ytwVarC.getValue()).f;
                        uiText2.getClass();
                        String strG = uiText2.g((Context) aVar.O(qyd0Var));
                        UiText uiText3 = ((q74) ytwVarC.getValue()).g;
                        uiText3.getClass();
                        String strG2 = uiText3.g((Context) aVar.O(qyd0Var));
                        boolean zA = aVar.A(aaVar);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            o74 o74Var = new o74(0, aaVar, aa.class, "consumeState", "consumeState()V", 0);
                            aVar.r(o74Var);
                            objY = o74Var;
                        }
                        nzj.b(null, strG, strG2, null, null, null, null, null, null, null, null, null, (Function0) ((chp) objY), null, aVar, 0, 0, 12281);
                        aVar.H();
                    } else {
                        aVar.N(1556276568);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                break;
            default:
                UiText uiText4 = (UiText) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uiText4.getClass();
                    lkf0.d(uiText4.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), g3w.h(d.a.b, "ib_commentary_text"), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar2), aVar2, 48, 0, 131064);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
