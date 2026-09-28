package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ulf {
    public static void a(Window window, int i, int i2, int i3, final boolean z, final View view) {
        n8j0.g cVar;
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        z7j0.a(window, false);
        qoa0 qoa0Var = new qoa0(decorView);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            cVar = new n8j0.f(window, qoa0Var);
        } else if (i4 >= 30) {
            cVar = new n8j0.d(window, qoa0Var);
        } else {
            cVar = i4 >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
        }
        cVar.d(c(i));
        cVar.c(c(i3));
        final mpf0 mpf0Var = new mpf0(i, i2, i3);
        window.setBackgroundDrawable(mpf0Var);
        zmy zmyVar = new zmy() { // from class: slf
            @Override // defpackage.zmy
            public final l8j0 b(View view2, l8j0 l8j0Var) {
                View view3;
                view2.getClass();
                l8j0.l lVar = l8j0Var.a;
                ymn ymnVarG = lVar.g(519);
                ymnVarG.getClass();
                int i5 = ymnVarG.b;
                int i6 = ymnVarG.d;
                ymn ymnVarG2 = lVar.g(8);
                ymnVarG2.getClass();
                int i7 = ymnVarG2.d;
                if (i7 <= 0) {
                    i7 = i6;
                }
                mpf0 mpf0Var2 = mpf0Var;
                mpf0Var2.d = i5;
                mpf0Var2.e = i6;
                mpf0Var2.invalidateSelf();
                if (z && (view3 = view) != null) {
                    view3.setPadding(ymnVarG.a, i5, ymnVarG.c, i7);
                }
                return l8j0Var;
            }
        };
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(decorView, zmyVar);
    }

    public static void b(Activity activity, int i, int i2, int i3, ViewGroup viewGroup, int i4) {
        boolean z = (i4 & 16) != 0;
        if ((i4 & 32) != 0) {
            viewGroup = null;
        }
        Window window = activity.getWindow();
        window.getClass();
        a(window, i, i2, i3, z, viewGroup);
    }

    public static boolean c(int i) {
        return 1.0d - (((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d))) / 255.0d) < 0.5d;
    }
}
