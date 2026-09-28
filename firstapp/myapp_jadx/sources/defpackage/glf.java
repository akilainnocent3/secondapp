package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class glf extends llf {
    @Override // defpackage.mlf
    public void a(aqe0 aqe0Var, aqe0 aqe0Var2, Window window, View view, boolean z, boolean z2) {
        n8j0.g cVar;
        aqe0Var.getClass();
        aqe0Var2.getClass();
        window.getClass();
        view.getClass();
        z7j0.a(window, false);
        window.setStatusBarColor(z ? aqe0Var.b : aqe0Var.a);
        window.setNavigationBarColor(z2 ? aqe0Var2.b : aqe0Var2.a);
        qoa0 qoa0Var = new qoa0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            cVar = new n8j0.f(window, qoa0Var);
        } else if (i >= 30) {
            cVar = new n8j0.d(window, qoa0Var);
        } else {
            cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
        }
        cVar.d(!z);
        cVar.c(!z2);
    }
}
