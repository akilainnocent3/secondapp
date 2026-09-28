package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class odk0 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final afk0 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final hfk0 i;
    public ndk0 m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final cfk0 k = new IBinder.DeathRecipient() { // from class: cfk0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            odk0 odk0Var = this.a;
            afk0 afk0Var = odk0Var.b;
            int i = 0;
            afk0Var.c("reportBinderDeath", new Object[0]);
            gfk0 gfk0Var = (gfk0) odk0Var.j.get();
            if (gfk0Var != null) {
                afk0Var.c("calling onBinderDied", new Object[0]);
                gfk0Var.a();
            } else {
                afk0Var.c("%s : Binder has died.", odk0Var.c);
                ArrayList arrayList = odk0Var.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((bfk0) obj).a(new RemoteException(String.valueOf(odk0Var.c).concat(" : Binder has died.")));
                }
                arrayList.clear();
            }
            synchronized (odk0Var.f) {
                HashSet hashSet = odk0Var.e;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(odk0Var.c).concat(" : Binder has died.")));
                }
                hashSet.clear();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [cfk0] */
    public odk0(Context context, afk0 afk0Var, String str, Intent intent, hfk0 hfk0Var) {
        this.a = context;
        this.b = afk0Var;
        this.c = str;
        this.h = intent;
        this.i = hfk0Var;
    }

    public static void b(odk0 odk0Var, bfk0 bfk0Var) {
        IInterface iInterface = odk0Var.n;
        ArrayList arrayList = odk0Var.d;
        afk0 afk0Var = odk0Var.b;
        int i = 0;
        if (iInterface != null || odk0Var.g) {
            if (!odk0Var.g) {
                bfk0Var.run();
                return;
            } else {
                afk0Var.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(bfk0Var);
                return;
            }
        }
        afk0Var.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(bfk0Var);
        ndk0 ndk0Var = new ndk0(odk0Var);
        odk0Var.m = ndk0Var;
        odk0Var.g = true;
        if (odk0Var.a.bindService(odk0Var.h, ndk0Var, 1)) {
            return;
        }
        afk0Var.c("Failed to bind to the service.", new Object[0]);
        odk0Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bfk0) obj).a(new pdk0("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                String str = this.c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(bfk0 bfk0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new efk0(this, bfk0Var.c(), taskCompletionSource, bfk0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new ffk0(this));
    }
}
