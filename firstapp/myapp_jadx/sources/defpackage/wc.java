package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class wc {
    public static final <A extends Activity> void a(A a) {
        if (a.isFinishing() || a.isDestroyed()) {
            return;
        }
        a.finish();
    }

    public static final Activity b(Context context) {
        context.getClass();
        do {
            Activity activity = (Activity) (!(context instanceof Activity) ? null : context);
            if (activity != null) {
                return activity;
            }
            if (!(context instanceof ContextWrapper)) {
                context = null;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        } while (context != null);
        return null;
    }

    public static final int c(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public static final <A extends Activity> boolean d(A a) {
        return (a.isFinishing() || a.isDestroyed()) ? false : true;
    }

    public static final void e(e eVar, Fragment fragment, String str) {
        eVar.getClass();
        FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        aVar.f(android.R.id.content, fragment, str);
        aVar.c(str);
        aVar.k(true, true);
    }
}
