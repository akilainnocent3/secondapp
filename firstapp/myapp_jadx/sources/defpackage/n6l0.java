package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class n6l0 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ o6l0 b;

    public n6l0(o6l0 o6l0Var, String str) {
        Objects.requireNonNull(o6l0Var);
        this.b = o6l0Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        y4l0 y4l0Var = this.b.a.f;
        k8l0.m(y4l0Var);
        y4l0Var.n.a("Install Referrer Service disconnected");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o6l0 o6l0Var = this.b;
        if (iBinder == null) {
            y4l0 y4l0Var = o6l0Var.a.f;
            k8l0.m(y4l0Var);
            y4l0Var.i.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = stk0.a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            vtk0 rtk0Var = iInterfaceQueryLocalInterface instanceof vtk0 ? (vtk0) iInterfaceQueryLocalInterface : new rtk0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            k8l0 k8l0Var = o6l0Var.a;
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.n.a(rarBonoqWB.dUMkG);
            p7l0 p7l0Var = k8l0Var.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(new l6l0(this, rtk0Var, this));
        } catch (RuntimeException e) {
            y4l0 y4l0Var3 = o6l0Var.a.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.i.b(e, "Exception occurred while calling Install Referrer API");
        }
    }
}
