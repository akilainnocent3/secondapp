package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes6.dex */
public final class a9j0 {
    public static final void a(Window window) {
        n8j0.g cVar;
        Activity activityB;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.show(WindowInsets.Type.systemBars());
            }
        } else {
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.f(519);
        }
        Context context = window.getContext();
        if (context == null || (activityB = wc.b(context)) == null) {
            return;
        }
        activityB.setRequestedOrientation(1);
    }

    public static final void b(Window window) {
        n8j0.g cVar;
        Activity activityB;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets.Type.systemBars());
                insetsController.setSystemBarsBehavior(2);
            }
        } else {
            qoa0 qoa0Var = new qoa0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                cVar = new n8j0.f(window, qoa0Var);
            } else if (i >= 30) {
                cVar = new n8j0.d(window, qoa0Var);
            } else {
                cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
            }
            cVar.a(519);
            cVar.e();
            window.getDecorView().setSystemUiVisibility(4102);
        }
        Context context = window.getContext();
        if (context == null || (activityB = wc.b(context)) == null) {
            return;
        }
        activityB.setRequestedOrientation(0);
    }
}
