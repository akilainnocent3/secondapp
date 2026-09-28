package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class esl0 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final v7l0 b;
    public boolean g;
    public final Intent h;
    public brl0 l;
    public c1l0 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final rcl0 j = new IBinder.DeathRecipient() { // from class: rcl0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            esl0 esl0Var = this.a;
            int i = 0;
            esl0Var.b.a("reportBinderDeath", new Object[0]);
            qll0 qll0Var = (qll0) esl0Var.i.get();
            v7l0 v7l0Var = esl0Var.b;
            if (qll0Var != null) {
                v7l0Var.a("calling onBinderDied", new Object[0]);
                qll0Var.zza();
            } else {
                v7l0Var.a("%s : Binder has died.", esl0Var.c);
                ArrayList arrayList = esl0Var.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(esl0Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ((dal0) obj).a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                esl0Var.d.clear();
            }
            synchronized (esl0Var.f) {
                esl0Var.c();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [rcl0] */
    public esl0(Context context, v7l0 v7l0Var, Intent intent) {
        this.a = context;
        this.b = v7l0Var;
        this.h = intent;
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

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }

    public static void b(esl0 esl0Var, b1l0 b1l0Var) {
        c1l0 c1l0Var = esl0Var.m;
        v7l0 v7l0Var = esl0Var.b;
        ArrayList arrayList = esl0Var.d;
        int i = 0;
        if (c1l0Var != null || esl0Var.g) {
            if (!esl0Var.g) {
                b1l0Var.run();
                return;
            } else {
                v7l0Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(b1l0Var);
                return;
            }
        }
        v7l0Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(b1l0Var);
        brl0 brl0Var = new brl0(esl0Var);
        esl0Var.l = brl0Var;
        esl0Var.g = true;
        if (esl0Var.a.bindService(esl0Var.h, brl0Var, 1)) {
            return;
        }
        String str = QQWMbKFOuTf.MFJeZ;
        v7l0Var.a(str, new Object[0]);
        esl0Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xsl0 xsl0Var = new xsl0(str);
            TaskCompletionSource taskCompletionSource = ((dal0) obj).a;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(xsl0Var);
            }
        }
        arrayList.clear();
    }
}
