package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpbs;", "Landroid/app/Service;", "Libs;", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class pbs extends Service implements ibs {
    public final af80 a = new af80(this);

    @Override // defpackage.ibs
    public final s9s getLifecycle() {
        return this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        af80 af80Var = this.a;
        af80Var.getClass();
        af80Var.a(s9s.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        af80 af80Var = this.a;
        af80Var.getClass();
        af80Var.a(s9s.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        af80 af80Var = this.a;
        af80Var.getClass();
        af80Var.a(s9s.a.ON_STOP);
        af80Var.a(s9s.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @fae
    public final void onStart(Intent intent, int i) {
        af80 af80Var = this.a;
        af80Var.getClass();
        af80Var.a(s9s.a.ON_START);
        super.onStart(intent, i);
    }
}
