package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class qlf {
    public static final void a(ConstraintLayout constraintLayout) {
        plf plfVar = new plf();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(constraintLayout, plfVar);
    }

    public static void b(View view) {
        view.getClass();
        olf olfVar = new olf();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(view, olfVar);
    }

    public static final void c(final Window window, final int i) {
        window.getClass();
        View decorView = window.getDecorView();
        final ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        zmy zmyVar = new zmy() { // from class: nlf
            @Override // defpackage.zmy
            public final l8j0 b(View view, l8j0 l8j0Var) {
                view.getClass();
                int i2 = l8j0Var.a.g(1).b;
                if (i2 > 0) {
                    ViewGroup viewGroup2 = viewGroup;
                    View viewFindViewWithTag = viewGroup2.findViewWithTag("status_bar_background");
                    if (viewFindViewWithTag == null) {
                        viewFindViewWithTag = new View(window.getContext());
                        viewFindViewWithTag.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
                        viewFindViewWithTag.setTag("status_bar_background");
                        viewGroup2.addView(viewFindViewWithTag);
                    }
                    viewFindViewWithTag.setBackgroundColor(i);
                    WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                    r6i0.d.n(viewGroup2, null);
                }
                return l8j0Var;
            }
        };
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(viewGroup, zmyVar);
        r6i0.c.c(viewGroup);
    }

    public static void d(Activity activity) {
        n8j0.g cVar;
        activity.getClass();
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT < 35) {
            z7j0.a(window, false);
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
        }
        qoa0 qoa0Var = new qoa0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            cVar = new n8j0.f(window, qoa0Var);
        } else if (i >= 30) {
            cVar = new n8j0.d(window, qoa0Var);
        } else {
            cVar = i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
        }
        cVar.d(false);
        cVar.c(true);
    }
}
