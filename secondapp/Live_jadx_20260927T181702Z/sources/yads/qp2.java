package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f154547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final op2 f154548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mp2 f154549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f154550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f154551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp2 f154552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f154553g;

    public qp2(Context context, op2 op2Var) {
        mp2 mp2Var = mj0.f152464h;
        this.f154547a = context.getApplicationContext();
        this.f154548b = op2Var;
        this.f154549c = mp2Var;
        this.f154550d = ib3.b();
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RequirementsWatcherBackground");
        handlerThread.start();
        this.f154553g = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        this.f154553g.post(new Runnable() { // from class: yads.f94
            @Override // java.lang.Runnable
            public final void run() {
                this.f149026b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        final int iA = this.f154549c.a(this.f154547a);
        if (this.f154551e != iA) {
            this.f154551e = iA;
            this.f154550d.post(new Runnable() { // from class: yads.g94
                @Override // java.lang.Runnable
                public final void run() {
                    this.f149490b.a(iA);
                }
            });
        }
    }

    public final int c() {
        a();
        IntentFilter intentFilter = new IntentFilter();
        if ((this.f154549c.f152599b & 1) != 0) {
            if (ib3.f150516a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f154547a.getSystemService("connectivity");
                connectivityManager.getClass();
                pp2 pp2Var = new pp2(this);
                this.f154552f = pp2Var;
                connectivityManager.registerDefaultNetworkCallback(pp2Var);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((this.f154549c.f152599b & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((this.f154549c.f152599b & 4) != 0) {
            if (ib3.f150516a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((this.f154549c.f152599b & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f154547a.registerReceiver(new np2(this), intentFilter, null, this.f154550d);
        return this.f154551e;
    }

    public final /* synthetic */ void a(int i10) {
        this.f154548b.a(this, i10);
    }
}
