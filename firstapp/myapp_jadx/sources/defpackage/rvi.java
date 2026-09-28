package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class rvi {
    public static final e a(Fragment fragment) {
        e activity = fragment.getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    public static final boolean b(Fragment fragment) {
        fragment.getClass();
        return fragment.isDetached() || fragment.getActivity() == null;
    }

    public static final void c(Fragment fragment, FragmentManager fragmentManager, m12 m12Var) {
        fragment.getClass();
        fragmentManager.getClass();
        a aVar = new a(fragmentManager);
        aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        aVar.f(android.R.id.content, m12Var, null);
        aVar.c(null);
        aVar.k(true, true);
    }
}
