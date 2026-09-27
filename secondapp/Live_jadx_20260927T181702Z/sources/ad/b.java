package ad;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4799b;

    public b(e eVar) {
        this.f4799b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4799b.f4816m) {
            try {
                Intent intent = new Intent();
                intent.setClassName(this.f4799b.f4812i, "com.digitalturbine.ignite.cl.IgniteRemoteService");
                e eVar = this.f4799b;
                Context context = eVar.f4809f;
                if (context != null) {
                    try {
                        context.bindService(intent, eVar, 1);
                    } catch (Throwable th2) {
                        Object[] objArr = {th2};
                        gd.a aVar = gd.b.f86434b.f86435a;
                        if (aVar != null) {
                            aVar.e("Failed to bind IgniteRemoteService", objArr);
                        }
                        if (th2.getMessage() != null && th2.getMessage().contains("Too many bind requests")) {
                        } else {
                            cd.b.b(cd.d.ONE_DT_GENERAL_ERROR, kd.a.a(th2, cd.c.IGNITE_SERVICE_UNAVAILABLE));
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
