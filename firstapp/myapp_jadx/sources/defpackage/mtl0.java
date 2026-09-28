package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public final class mtl0 implements ServiceConnection {
    public final /* synthetic */ vtl0 a;

    public /* synthetic */ mtl0(vtl0 vtl0Var) {
        this.a = vtl0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        vtl0 vtl0Var = this.a;
        vtl0Var.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        vtl0Var.a().post(new nsl0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        vtl0 vtl0Var = this.a;
        vtl0Var.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        vtl0Var.a().post(new wsl0(this));
    }
}
