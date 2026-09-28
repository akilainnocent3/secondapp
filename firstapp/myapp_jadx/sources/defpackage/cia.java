package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cia implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cia(int i, String str, Function0 function0) {
        this.c = str;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Function0 function0 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                mz1 mz1Var = (mz1) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
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
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new eia(window, 0);
                        aVar.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar.t((Function0) objY);
                    boolean zM = aVar.M(function0);
                    Object objY2 = aVar.y();
                    if (zM || objY2 == c0042a) {
                        objY2 = new fia(function0, 0);
                        aVar.r(objY2);
                    }
                    lia.d((Function0) objY2, mz1Var, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                pe60.d(qj40.a(1), (a) obj, (String) obj3, function0);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cia(Function0 function0, mz1 mz1Var) {
        this.b = function0;
        this.c = mz1Var;
    }
}
