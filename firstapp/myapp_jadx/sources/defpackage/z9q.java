package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z9q implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ z9q(hlf0 hlf0Var, int i) {
        this.b = hlf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ViewParent parent = ((View) aVar.O(AndroidCompositionLocals_androidKt.f)).getParent();
                    eme emeVar = parent instanceof eme ? (eme) parent : null;
                    Window window = emeVar != null ? emeVar.getWindow() : null;
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (objY == c0042a) {
                        objY = m.b(Boolean.FALSE);
                        aVar.r(objY);
                    }
                    ytw ytwVar = (ytw) objY;
                    if (window != null) {
                        window.clearFlags(2);
                    }
                    Unit unit = Unit.a;
                    Object objY2 = aVar.y();
                    if (objY2 == c0042a) {
                        objY2 = new jaq.b(ytwVar, null);
                        aVar.r(objY2);
                    }
                    xvf.e(aVar, unit, (Function2) objY2);
                    nyp.a(((Boolean) ytwVar.getValue()).booleanValue(), function0, j58.l, aVar, 384, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((hlf0) obj3).a(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ z9q(Function0 function0) {
        this.b = function0;
    }
}
