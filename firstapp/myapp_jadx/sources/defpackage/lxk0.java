package defpackage;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lxk0 extends jet {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ wyk0 b;

    public lxk0(wyk0 wyk0Var, TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
        this.b = wyk0Var;
    }

    @Override // defpackage.jet
    public final void a(LocationResult locationResult) {
        List list = locationResult.a;
        int size = list.size();
        this.a.trySetResult(size == 0 ? null : (Location) list.get(size - 1));
        try {
            wyk0 wyk0Var = this.b;
            hm20.f("GetCurrentLocation", "Listener type must not be empty");
            wyk0Var.F(new yis.a(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
