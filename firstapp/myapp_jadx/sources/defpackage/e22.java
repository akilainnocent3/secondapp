package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import com.sportybet.android.limits.base.limitBase.LimitsActivity;
import com.sportybet.android.limits.edit.EditLimitsActivity;
import com.sportybet.android.limits.reached.ReachedLimitsActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le22;", "Lpy1;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class e22 extends dml implements bb40 {
    public static final /* synthetic */ int e = 0;
    public qcl b;
    public final mpe0 c = hwr.b(new c22(this, 0));
    public final mpe0 d = hwr.b(new Function0() { // from class: d22
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = e22.e;
            e22 e22Var = this.a;
            return b.k(new ComponentName(e22Var, (Class<?>) LimitsActivity.class), new ComponentName(e22Var, (Class<?>) EditLimitsActivity.class), new ComponentName(e22Var, (Class<?>) ReachedLimitsActivity.class));
        }
    });

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            activity.getClass();
            int i = e22.e;
            e22 e22Var = e22.this;
            List list = (List) e22Var.d.getValue();
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.g(((ComponentName) it.next()).getClassName(), activity.getComponentName().getClassName())) {
                        return;
                    }
                }
            }
            qcl qclVar = e22Var.b;
            if (qclVar != null) {
                ej5.c(qclVar.c, null, null, new pcl(qclVar, null), 3);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        getApplication().registerActivityLifecycleCallbacks((a) this.c.getValue());
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        super.onStop();
        getApplication().unregisterActivityLifecycleCallbacks((a) this.c.getValue());
    }
}
