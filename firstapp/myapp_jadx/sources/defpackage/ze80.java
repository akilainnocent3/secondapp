package defpackage;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes5.dex */
public final class ze80 implements i1k<Object> {
    public final Service a;
    public kmc b;

    public interface a {
        jmc h();
    }

    public ze80(Service service) {
        this.a = service;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        kmc kmcVar = this.b;
        if (kmcVar != null) {
            return kmcVar;
        }
        Application application = this.a.getApplication();
        z7b.c(application instanceof i1k, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        kmc kmcVar2 = new kmc(((a) jm2.a(application, a.class)).h().a);
        this.b = kmcVar2;
        return kmcVar2;
    }
}
