package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class x9i0 {
    public static final w9i0 a(View view) {
        w9i0 w9i0Var;
        Object tag = view.getTag(R.id.coil3_request_manager);
        w9i0 w9i0Var2 = tag instanceof w9i0 ? (w9i0) tag : null;
        if (w9i0Var2 != null) {
            return w9i0Var2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                w9i0Var = tag2 instanceof w9i0 ? (w9i0) tag2 : null;
                if (w9i0Var == null) {
                    w9i0Var = new w9i0(view);
                    view.addOnAttachStateChangeListener(w9i0Var);
                    view.setTag(R.id.coil3_request_manager, w9i0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w9i0Var;
    }
}
