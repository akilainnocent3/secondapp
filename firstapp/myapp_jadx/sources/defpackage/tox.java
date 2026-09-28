package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.pairip.VMRunner;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tox {
    public static tox f;
    public final Executor a;
    public final CopyOnWriteArrayList<c> b;
    public final Object c;
    public int d;
    public boolean e;

    public static final class a {

        /* JADX INFO: renamed from: tox$a$a, reason: collision with other inner class name */
        public static final class C1142a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final tox a;

            public C1142a(tox toxVar) {
                this.a = toxVar;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.a.c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, tox toxVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                telephonyManager.getClass();
                C1142a c1142a = new C1142a(toxVar);
                telephonyManager.registerTelephonyCallback(toxVar.a, c1142a);
                telephonyManager.unregisterTelephonyCallback(c1142a);
            } catch (RuntimeException unused) {
                toxVar.c(5);
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public final class c {
        public final WeakReference<b> a;
        public final Executor b;

        public c(yad yadVar, Executor executor) {
            this.a = new WeakReference<>(yadVar);
            this.b = executor;
        }
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("5hN5oPLBy5LGefWc", new Object[]{this, context, intent});
        }
    }

    public tox(Context context) {
        Executor executorA = ls1.a();
        this.a = executorA;
        this.b = new CopyOnWriteArrayList<>();
        this.c = new Object();
        this.d = 0;
        executorA.execute(new lq0(2, this, context));
    }

    public static synchronized tox a(Context context) {
        tox toxVar;
        toxVar = f;
        if (toxVar == null) {
            toxVar = new tox(context);
            f = toxVar;
        }
        return toxVar;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        for (c cVar : copyOnWriteArrayList) {
            if (cVar.a.get() == null) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (c cVar2 : this.b) {
                    cVar2.b.execute(new o26(cVar2, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
