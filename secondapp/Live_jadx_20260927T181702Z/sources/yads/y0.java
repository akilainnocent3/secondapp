package yads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class y0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f158070a;

    public y0(z0 z0Var) {
        this.f158070a = z0Var;
    }

    public final HashSet a(WeakHashMap weakHashMap) {
        HashSet hashSet;
        synchronized (this.f158070a.f158544a) {
            Set setKeySet = weakHashMap.keySet();
            hashSet = new HashSet(setKeySet.size());
            for (Object obj : setKeySet) {
                if (obj != null) {
                    hashSet.add(obj);
                }
            }
        }
        return hashSet;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = a(this.f158070a.f158546c).iterator();
        while (it.hasNext()) {
            ((d1) ((hq2) it.next())).a(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = a(this.f158070a.f158545b).iterator();
        while (it.hasNext()) {
            ((l1) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = a(this.f158070a.f158545b).iterator();
        while (it.hasNext()) {
            ((l1) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = a(this.f158070a.f158546c).iterator();
        while (it.hasNext()) {
            ((d1) ((hq2) it.next())).b(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f158070a.b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }
}
