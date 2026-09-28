package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public final class qd implements Runnable {
    public final /* synthetic */ Application a;
    public final /* synthetic */ sd.a b;

    public qd(Application application, sd.a aVar) {
        this.a = application;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
