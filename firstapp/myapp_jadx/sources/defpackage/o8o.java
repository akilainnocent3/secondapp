package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes5.dex */
public final class o8o extends jj90 {
    public final /* synthetic */ l8o a;

    public o8o(l8o l8oVar) {
        this.a = l8oVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        ((ConcurrentLinkedDeque) this.a.a.getValue()).push(new l8o.a(System.identityHashCode(activity), activity.getClass().getName()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        int iIdentityHashCode = System.identityHashCode(activity);
        ConcurrentLinkedDeque concurrentLinkedDeque = (ConcurrentLinkedDeque) this.a.a.getValue();
        final m8o m8oVar = new m8o(iIdentityHashCode);
        concurrentLinkedDeque.removeIf(new Predicate() { // from class: n8o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) m8oVar.invoke(obj)).booleanValue();
            }
        });
    }
}
