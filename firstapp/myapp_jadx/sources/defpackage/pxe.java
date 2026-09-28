package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import com.sportygames.wheelanddeal.model.WDUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pxe implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ haj d;

    public /* synthetic */ pxe(DobVerificationReminderData dobVerificationReminderData, Function0 function0, Function0 function1, int i) {
        this.b = dobVerificationReminderData;
        this.c = function0;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                sxe.a((DobVerificationReminderData) obj4, (Function0) obj3, (Function0) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                WDUserInfoModel wDUserInfoModel = (WDUserInfoModel) obj4;
                sg90 sg90Var = (sg90) obj3;
                Function1 function1 = (Function1) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ViewParent parent = ((View) aVar.O(AndroidCompositionLocals_androidKt.f)).getParent();
                    Window window = null;
                    if (parent != null) {
                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                        if (emeVar != null) {
                            window = emeVar.getWindow();
                        }
                    }
                    boolean zA = aVar.A(window);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new n51(window, i2);
                        aVar.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar.t((Function0) objY);
                    jui0.e(wDUserInfoModel, sg90Var, function1, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pxe(WDUserInfoModel wDUserInfoModel, sg90 sg90Var, Function1 function1) {
        this.b = wDUserInfoModel;
        this.c = sg90Var;
        this.d = function1;
    }
}
