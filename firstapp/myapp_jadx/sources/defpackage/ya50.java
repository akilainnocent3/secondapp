package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ya50 implements Handler.Callback {
    public static final a e = new a();
    public volatile xa50 a;
    public final lzi c;
    public final ox0<View, Fragment> b = new ox0<>();
    public final nbs d = new nbs(e);

    public class a implements b {
    }

    public interface b {
    }

    public ya50() {
        this.c = (cel.f && cel.e) ? new kth() : new p11();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, ox0 ox0Var) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                ox0Var.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().c.f(), ox0Var);
            }
        }
    }

    public final xa50 c(Context context) {
        if (context == null) {
            hb5.a("You cannot start a load on a null Context");
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof e) {
                return e((e) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(context.getApplicationContext());
                        this.a = new xa50(aVarA, new yu0(), new x2g(), new kb50(), aVarA.f, context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    public final xa50 d(Fragment fragment) {
        gm20.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.c.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.d.a(context, com.bumptech.glide.a.a(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    public final xa50 e(e eVar) {
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(eVar.getApplicationContext());
        }
        if (eVar.isDestroyed()) {
            hb5.a("You cannot start a load for a destroyed activity");
            return null;
        }
        this.c.a(eVar);
        Activity activityA = a(eVar);
        return this.d.a(eVar, com.bumptech.glide.a.a(eVar.getApplicationContext()), eVar.getLifecycle(), eVar.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
