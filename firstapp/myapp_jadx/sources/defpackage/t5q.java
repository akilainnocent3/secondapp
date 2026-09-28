package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class t5q {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-734019041);
        if (bVarI.q(i & 1, i != 0)) {
            final View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            final boolean zA = doc.a(bVarI);
            boolean zA2 = bVarI.A(view) | bVarI.b(zA);
            Object objY = bVarI.y();
            if (zA2 || objY == a.C0041a.a) {
                objY = new Function0() { // from class: r5q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        n8j0.g cVar;
                        View view2 = view;
                        ViewParent parent = view2.getParent();
                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                        Window window = emeVar != null ? emeVar.getWindow() : null;
                        if (window != null) {
                            qoa0 qoa0Var = new qoa0(view2);
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 35) {
                                cVar = new n8j0.f(window, qoa0Var);
                            } else if (i2 >= 30) {
                                cVar = new n8j0.d(window, qoa0Var);
                            } else {
                                cVar = i2 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                            }
                            cVar.d(false);
                            cVar.c(!zA);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            use useVar = xvf.a;
            bVarI.t((Function0) objY);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new s5q(i);
        }
    }
}
