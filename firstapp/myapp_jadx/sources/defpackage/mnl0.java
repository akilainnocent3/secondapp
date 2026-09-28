package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class mnl0 implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public spl0 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ zsl0 f;

    public mnl0(zsl0 zsl0Var) {
        this.f = zsl0Var;
        h1l0 h1l0Var = new h1l0(Looper.getMainLooper(), new Handler.Callback() { // from class: ygl0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i);
                }
                mnl0 mnl0Var = this.a;
                synchronized (mnl0Var) {
                    try {
                        csl0 csl0Var = (csl0) mnl0Var.e.get(i);
                        if (csl0Var == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        mnl0Var.e.remove(i);
                        mnl0Var.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            csl0Var.c(new fsl0("Not supported by GmsCore", null));
                            return true;
                        }
                        csl0Var.a(data);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.b = new Messenger(h1l0Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            zua.b().c(this.f.a, this);
            fsl0 fsl0Var = new fsl0(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((csl0) it.next()).c(fsl0Var);
            }
            this.d.clear();
            int i2 = 0;
            while (true) {
                int size = this.e.size();
                SparseArray sparseArray = this.e;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((csl0) sparseArray.valueAt(i2)).c(fsl0Var);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                zua.b().c(this.f.a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(csl0 csl0Var) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(csl0Var);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(csl0Var);
            this.f.b.execute(new nal0(this));
            return true;
        }
        this.d.add(csl0Var);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (zua.b().a(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new Runnable() { // from class: scl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        mnl0 mnl0Var = this.a;
                        synchronized (mnl0Var) {
                            if (mnl0Var.a == 1) {
                                mnl0Var.a("Timed out while binding");
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.b.execute(new Runnable() { // from class: f8l0
            @Override // java.lang.Runnable
            public final void run() {
                mnl0 mnl0Var = this.a;
                IBinder iBinder2 = iBinder;
                synchronized (mnl0Var) {
                    if (iBinder2 == null) {
                        mnl0Var.a("Null service connection");
                        return;
                    }
                    try {
                        mnl0Var.c = new spl0(iBinder2);
                        mnl0Var.a = 2;
                        mnl0Var.f.b.execute(new nal0(mnl0Var));
                    } catch (RemoteException e) {
                        mnl0Var.a(e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.b.execute(new Runnable() { // from class: yel0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a("Service disconnected");
            }
        });
    }
}
