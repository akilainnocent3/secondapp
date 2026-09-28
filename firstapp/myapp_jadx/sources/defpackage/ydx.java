package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class ydx {
    public static final /* synthetic */ int a = 0;

    public static final nv60 a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            nv60 nv60Var = tag instanceof nv60 ? (nv60) tag : null;
            if (nv60Var != null) {
                return nv60Var;
            }
            Object objA = abo.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }
}
