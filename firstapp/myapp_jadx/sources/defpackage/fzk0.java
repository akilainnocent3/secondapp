package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class fzk0 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ r12 b;

    public fzk0(r12 r12Var, int i) {
        this.b = r12Var;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        r12 r12Var = this.b;
        if (iBinder == null) {
            synchronized (r12Var.g) {
                i = r12Var.n;
            }
            if (i == 3) {
                r12Var.u = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            ask0 ask0Var = r12Var.f;
            ask0Var.sendMessage(ask0Var.obtainMessage(i2, r12Var.w.get(), 16));
            return;
        }
        synchronized (r12Var.h) {
            try {
                r12 r12Var2 = this.b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                r12Var2.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof cum)) ? new ink0(iBinder) : (cum) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        r12 r12Var3 = this.b;
        int i3 = this.a;
        d3l0 d3l0Var = new d3l0(r12Var3, 0, null);
        ask0 ask0Var2 = r12Var3.f;
        ask0Var2.sendMessage(ask0Var2.obtainMessage(7, i3, -1, d3l0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r12 r12Var;
        synchronized (this.b.h) {
            r12Var = this.b;
            r12Var.i = null;
        }
        int i = this.a;
        ask0 ask0Var = r12Var.f;
        ask0Var.sendMessage(ask0Var.obtainMessage(6, i, 1));
    }
}
