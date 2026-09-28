package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class sm {
    public static final Object h = new Object();
    public static volatile sm i;
    public zf4 a;
    public g1l0 b;
    public boolean c;
    public final Object d = new Object();
    public dsk0 e;
    public final Context f;
    public final long g;

    public static final class a {
        public final String a;
        public final boolean b;

        @Deprecated
        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String toString() {
            return "{" + this.a + "}" + this.b;
        }
    }

    public sm(Context context) {
        hm20.h(context);
        this.f = context.getApplicationContext();
        this.c = false;
        this.g = 30000L;
    }

    public static a a(Context context) {
        int i2;
        sm smVar = i;
        if (smVar == null) {
            synchronized (h) {
                try {
                    smVar = i;
                    if (smVar == null) {
                        Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                        smVar = new sm(context);
                        i = smVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if (xwk0.c == null) {
            synchronized (xwk0.d) {
                try {
                    if (xwk0.c == null) {
                        xwk0.c = new xwk0(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xwk0 xwk0Var = xwk0.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            a aVarF = smVar.f();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            e(aVarF, jElapsedRealtime2, null);
            xwk0Var.a(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jElapsedRealtime, System.currentTimeMillis());
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + jElapsedRealtime2 + "ms");
            return aVarF;
        } catch (Throwable th3) {
            e(null, -1L, th3);
            if (th3 instanceof IOException) {
                i2 = 1;
            } else if (th3 instanceof k5l) {
                i2 = 9;
            } else {
                i2 = th3 instanceof IllegalStateException ? 8 : -1;
            }
            xwk0Var.a(i2, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jElapsedRealtime, System.currentTimeMillis());
            throw th3;
        }
    }

    public static void e(a aVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (aVar != null) {
                map.put("limit_ad_tracking", true != aVar.b ? "0" : "1");
                String str = aVar.a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put(AnalyticsEvent.BI_TRACKING_KIND_ERROR, th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new mmk0(map).start();
        }
    }

    public final void b() {
        hm20.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        zua.b().c(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        hm20.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = w4l.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    zf4 zf4Var = new zf4();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!zua.b().a(context, intent, zf4Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = zf4Var;
                        try {
                            IBinder iBinderA = zf4Var.a();
                            int i2 = izk0.a;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof g1l0 ? (g1l0) iInterfaceQueryLocalInterface : new vwk0(iBinderA);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new k5l();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized void d() {
        try {
            if (!this.c) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    c();
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final a f() {
        a aVar;
        hm20.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            d();
            hm20.h(this.a);
            hm20.h(this.b);
            try {
                aVar = new a(this.b.zzc(), this.b.zze());
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        synchronized (this.d) {
            dsk0 dsk0Var = this.e;
            if (dsk0Var != null) {
                dsk0Var.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new dsk0(this, j);
            }
        }
        return aVar;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
