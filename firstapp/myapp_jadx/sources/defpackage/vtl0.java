package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class vtl0 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final wgl0 b;
    public boolean g;
    public final Intent h;
    public mtl0 l;
    public a1l0 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final unl0 j = new IBinder.DeathRecipient() { // from class: unl0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            vtl0 vtl0Var = this.a;
            int i = 0;
            vtl0Var.b.a("reportBinderDeath", new Object[0]);
            bsl0 bsl0Var = (bsl0) vtl0Var.i.get();
            wgl0 wgl0Var = vtl0Var.b;
            if (bsl0Var != null) {
                wgl0Var.a("calling onBinderDied", new Object[0]);
                bsl0Var.zza();
            } else {
                wgl0Var.a("%s : Binder has died.", vtl0Var.c);
                ArrayList arrayList = vtl0Var.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(vtl0Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((jjl0) obj).a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                vtl0Var.d.clear();
            }
            synchronized (vtl0Var.f) {
                vtl0Var.d();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [unl0] */
    public vtl0(Context context, wgl0 wgl0Var, Intent intent) {
        this.a = context;
        this.b = wgl0Var;
        this.h = intent;
    }

    public static void b(vtl0 vtl0Var, vgl0 vgl0Var) {
        a1l0 a1l0Var = vtl0Var.m;
        wgl0 wgl0Var = vtl0Var.b;
        ArrayList arrayList = vtl0Var.d;
        int i = 0;
        if (a1l0Var != null || vtl0Var.g) {
            if (!vtl0Var.g) {
                vgl0Var.run();
                return;
            } else {
                wgl0Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(vgl0Var);
                return;
            }
        }
        wgl0Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(vgl0Var);
        mtl0 mtl0Var = new mtl0(vtl0Var);
        vtl0Var.l = mtl0Var;
        vtl0Var.g = true;
        if (vtl0Var.a.bindService(vtl0Var.h, mtl0Var, 1)) {
            return;
        }
        wgl0Var.a("Failed to bind to the service.", new Object[0]);
        vtl0Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            eul0 eul0Var = new eul0("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = ((jjl0) obj).a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(eul0Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new arl0(this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
