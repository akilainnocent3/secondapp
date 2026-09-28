package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class jlf extends ilf {
    @Override // defpackage.glf, defpackage.mlf
    public void a(aqe0 aqe0Var, aqe0 aqe0Var2, Window window, View view, boolean z, boolean z2) {
        int i;
        int i2;
        n8j0.g cVar;
        aqe0Var.getClass();
        aqe0Var2.getClass();
        int i3 = aqe0Var2.c;
        window.getClass();
        view.getClass();
        z7j0.a(window, false);
        if (aqe0Var.c == 0) {
            i = 0;
        } else {
            i = z ? aqe0Var.b : aqe0Var.a;
        }
        window.setStatusBarColor(i);
        if (i3 == 0) {
            i2 = 0;
        } else {
            i2 = z2 ? aqe0Var2.b : aqe0Var2.a;
        }
        window.setNavigationBarColor(i2);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(i3 == 0);
        qoa0 qoa0Var = new qoa0(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            cVar = new n8j0.f(window, qoa0Var);
        } else if (i4 >= 30) {
            cVar = new n8j0.d(window, qoa0Var);
        } else {
            cVar = i4 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
        }
        cVar.d(!z);
        cVar.c(!z2);
    }
}
