package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wc2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc2 f157283h = new uc2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile wc2 f157284i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw2 f157286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc2 f157287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sc2 f157288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f157289e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f157290f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rc2 f157291g = rc2.f154877d;

    public wc2(Context context, Executor executor, dw2 dw2Var, tc2 tc2Var, sc2 sc2Var) {
        this.f157285a = context;
        this.f157286b = dw2Var;
        this.f157287c = tc2Var;
        this.f157288d = sc2Var;
        executor.execute(new Runnable() { // from class: yads.gd4
            @Override // java.lang.Runnable
            public final void run() {
                wc2.a(this.f149567b);
            }
        });
    }

    public static final void a(wc2 wc2Var) {
        rc2 rc2VarA = wc2Var.f157287c.a();
        wc2Var.f157291g = rc2VarA;
        Objects.toString(rc2VarA);
        boolean z10 = ad1.f146762a;
        try {
            wc2Var.f157288d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                wc2Var.f157285a.registerReceiver(wc2Var, intentFilter, 2);
            } else {
                wc2Var.f157285a.registerReceiver(wc2Var, intentFilter);
            }
        } catch (Exception unused) {
            boolean z11 = ad1.f146762a;
        }
    }

    public final void b(vc2 vc2Var) {
        synchronized (this.f157290f) {
            this.f157289e.remove(vc2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        rc2 rc2Var;
        rc2 rc2Var2;
        HashSet hashSet;
        synchronized (this.f157290f) {
            try {
                rc2 rc2Var3 = this.f157291g;
                String action = intent.getAction();
                if (kotlin.jvm.internal.m0.g(action, "android.intent.action.SCREEN_OFF")) {
                    rc2Var = rc2.f154876c;
                } else if (kotlin.jvm.internal.m0.g(action, "android.intent.action.USER_PRESENT")) {
                    rc2Var = rc2.f154877d;
                } else {
                    rc2Var = (this.f157291g == rc2.f154877d || !kotlin.jvm.internal.m0.g(action, "android.intent.action.SCREEN_ON")) ? this.f157291g : rc2.f154875b;
                }
                this.f157291g = rc2Var;
                if (rc2Var3 != rc2Var) {
                    Objects.toString(rc2Var);
                    boolean z10 = ad1.f146762a;
                }
                rc2Var2 = this.f157291g;
                hashSet = new HashSet(this.f157289e.keySet());
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((vc2) it.next()).a(rc2Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x000e, B:8:0x0012, B:10:0x0018, B:15:0x001f), top: B:23:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    public final boolean a() {
        boolean z10;
        nt2 nt2VarA = this.f157286b.a(this.f157285a);
        synchronized (this.f157290f) {
            z10 = true;
            if (nt2VarA != null) {
                try {
                    if (nt2VarA.f153162h) {
                        rc2 rc2Var = this.f157291g;
                        if (rc2Var != rc2.f154875b && rc2Var != rc2.f154877d) {
                            z10 = false;
                        }
                    } else if (this.f157291g != rc2.f154877d) {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } else if (this.f157291g != rc2.f154877d) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void a(vc2 vc2Var) {
        synchronized (this.f157290f) {
            this.f157289e.put(vc2Var, null);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
