package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class wjl0 implements ServiceConnection, r12.a, r12.b {
    public volatile boolean a;
    public volatile m4l0 b;
    public final /* synthetic */ ikl0 c;

    public wjl0(ikl0 ikl0Var) {
        this.c = ikl0Var;
    }

    @Override // r12.a
    public final void a() {
        p7l0 p7l0Var = this.c.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.l();
        synchronized (this) {
            try {
                hm20.h(this.b);
                o3l0 o3l0Var = (o3l0) this.b.v();
                p7l0 p7l0Var2 = this.c.a.g;
                k8l0.m(p7l0Var2);
                p7l0Var2.p(new mjl0(this, o3l0Var));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // r12.a
    public final void b(int i) {
        k8l0 k8l0Var = this.c.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.l();
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.m.a("Service connection suspended");
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.p(new ojl0(this));
    }

    @Override // r12.b
    public final void d(ConnectionResult connectionResult) {
        ikl0 ikl0Var = this.c;
        p7l0 p7l0Var = ikl0Var.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.l();
        y4l0 y4l0Var = ikl0Var.a.f;
        if (y4l0Var == null || !y4l0Var.b) {
            y4l0Var = null;
        }
        if (y4l0Var != null) {
            y4l0Var.n.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        p7l0 p7l0Var2 = this.c.a.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.p(new ujl0(this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p7l0 p7l0Var = this.c.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.l();
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                y4l0 y4l0Var = this.c.a.f;
                k8l0.m(y4l0Var);
                y4l0Var.f.a("Service connected with null binder");
                return;
            }
            o3l0 w2l0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    w2l0Var = iInterfaceQueryLocalInterface instanceof o3l0 ? (o3l0) iInterfaceQueryLocalInterface : new w2l0(iBinder);
                    y4l0 y4l0Var2 = this.c.a.f;
                    k8l0.m(y4l0Var2);
                    y4l0Var2.n.a("Bound to IMeasurementService interface");
                } else {
                    y4l0 y4l0Var3 = this.c.a.f;
                    k8l0.m(y4l0Var3);
                    y4l0Var3.f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                y4l0 y4l0Var4 = this.c.a.f;
                k8l0.m(y4l0Var4);
                y4l0Var4.f.a("Service connect failed to get IMeasurementService");
            }
            if (w2l0Var == null) {
                this.a = false;
                try {
                    zua zuaVarB = zua.b();
                    ikl0 ikl0Var = this.c;
                    zuaVarB.c(ikl0Var.a.a, ikl0Var.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                p7l0 p7l0Var2 = this.c.a.g;
                k8l0.m(p7l0Var2);
                p7l0Var2.p(new ajl0(this, w2l0Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k8l0 k8l0Var = this.c.a;
        p7l0 p7l0Var = k8l0Var.g;
        k8l0.m(p7l0Var);
        p7l0Var.l();
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.m.a("Service disconnected");
        p7l0 p7l0Var2 = k8l0Var.g;
        k8l0.m(p7l0Var2);
        p7l0Var2.p(new bjl0(this, componentName));
    }
}
