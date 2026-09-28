package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class trk0 implements Callable {
    public final /* synthetic */ FirebaseAnalytics a;

    public trk0(FirebaseAnalytics firebaseAnalytics) {
        this.a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        p1l0 p1l0Var = this.a.a;
        p1l0Var.getClass();
        qvk0 qvk0Var = new qvk0();
        p1l0Var.c(new xzk0(p1l0Var, qvk0Var));
        return qvk0Var.b(120000L);
    }
}
