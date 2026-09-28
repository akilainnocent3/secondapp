package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e650 implements njd.a, zoe0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ e650(Object obj) {
        this.a = obj;
    }

    @Override // njd.a
    public void a(n730 n730Var) {
        ((nrh) n730Var.get()).a((jtb) this.a);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
        }
    }

    @Override // zoe0.a
    public Object execute() {
        ((bmh0) this.a).i.d();
        return null;
    }
}
