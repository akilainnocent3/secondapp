package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class onl0 implements ServiceConnection, hsl0 {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final rll0 e;
    public ComponentName f;
    public final /* synthetic */ wrl0 i;

    public onl0(wrl0 wrl0Var, rll0 rll0Var) {
        this.i = wrl0Var;
        this.e = rll0Var;
    }

    public static ConnectionResult a(onl0 onl0Var, String str, Executor executor) {
        try {
            Intent intentA = onl0Var.e.a(onl0Var.i.e);
            onl0Var.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(bsk0.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                wrl0 wrl0Var = onl0Var.i;
                boolean zD = wrl0Var.g.d(wrl0Var.e, str, intentA, onl0Var, 4225, executor);
                onl0Var.c = zD;
                if (zD) {
                    onl0Var.i.f.sendMessageDelayed(onl0Var.i.f.obtainMessage(1, onl0Var.e), onl0Var.i.i);
                    return ConnectionResult.e;
                }
                onl0Var.b = 2;
                try {
                    wrl0 wrl0Var2 = onl0Var.i;
                    wrl0Var2.g.c(wrl0Var2.e, onl0Var);
                } catch (IllegalArgumentException unused) {
                }
                return new ConnectionResult(16);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (ook0 e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.i.d) {
            try {
                this.i.f.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.i.d) {
            try {
                this.i.f.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
