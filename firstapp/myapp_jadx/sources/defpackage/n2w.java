package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n2w implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n2w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Window window;
        n8j0.g cVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                View view = (View) obj;
                ViewParent parent = view.getParent();
                eme emeVar = parent instanceof eme ? (eme) parent : null;
                if (emeVar != null && (window = emeVar.getWindow()) != null) {
                    qoa0 qoa0Var = new qoa0(view);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        cVar = new n8j0.f(window, qoa0Var);
                    } else if (i2 >= 30) {
                        cVar = new n8j0.d(window, qoa0Var);
                    } else {
                        cVar = i2 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
                    }
                    cVar.d(false);
                    cVar.c(false);
                }
                break;
            case 1:
                ((nn40) obj).J = null;
                break;
            default:
                ((Function1) obj).invoke(b.a.n.a);
                break;
        }
        return Unit.a;
    }
}
