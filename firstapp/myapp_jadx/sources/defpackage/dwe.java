package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dwe implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ dwe(gwe gweVar, Function1 function1, int i) {
        this.b = gweVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fwe.a((gwe) obj3, (Function1) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                String str = (String) obj3;
                Function0 function0 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ViewParent parent = ((View) aVar.O(AndroidCompositionLocals_androidKt.f)).getParent();
                    final Window window = null;
                    if (parent != null) {
                        eme emeVar = parent instanceof eme ? (eme) parent : null;
                        if (emeVar != null) {
                            window = emeVar.getWindow();
                        }
                    }
                    boolean zA = aVar.A(window);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: oe60
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Window window2 = window;
                                if (window2 != null) {
                                    window2.setGravity(17);
                                }
                                if (window2 != null) {
                                    window2.setWindowAnimations(R.style.AnimBottom);
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    use useVar = xvf.a;
                    aVar.t((Function0) objY);
                    pe60.c(0, aVar, str, function0);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ dwe(String str, Function0 function0) {
        this.b = str;
        this.c = function0;
    }
}
