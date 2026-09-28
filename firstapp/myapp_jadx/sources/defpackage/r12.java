package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r12<T extends IInterface> {
    public static final Feature[] x = new Feature[0];
    public atl0 b;
    public final Context c;
    public final y3l d;
    public final w4l e;
    public final ask0 f;
    public cum i;
    public c j;
    public IInterface k;
    public fzk0 m;
    public final a o;
    public final b p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public ConnectionResult t = null;
    public boolean u = false;
    public volatile zzk v = null;
    public final AtomicInteger w = new AtomicInteger(0);

    public interface a {
        void a();

        void b(int i);
    }

    public interface b {
        void d(ConnectionResult connectionResult);
    }

    public interface c {
        void a(ConnectionResult connectionResult);
    }

    public class d implements c {
        public d() {
        }

        @Override // r12.c
        public final void a(ConnectionResult connectionResult) {
            boolean z = connectionResult.b == 0;
            r12 r12Var = r12.this;
            if (z) {
                r12Var.i(null, r12Var.u());
                return;
            }
            b bVar = r12Var.p;
            if (bVar != null) {
                bVar.d(connectionResult);
            }
        }
    }

    public r12(Context context, Looper looper, wrl0 wrl0Var, w4l w4lVar, int i, a aVar, b bVar, String str) {
        hm20.i(context, "Context must not be null");
        this.c = context;
        hm20.i(looper, "Looper must not be null");
        hm20.i(wrl0Var, "Supervisor must not be null");
        this.d = wrl0Var;
        hm20.i(w4lVar, "API availability must not be null");
        this.e = w4lVar;
        this.f = new ask0(this, looper);
        this.q = i;
        this.o = aVar;
        this.p = bVar;
        this.r = str;
    }

    public static /* bridge */ /* synthetic */ boolean B(r12 r12Var, int i, int i2, IInterface iInterface) {
        synchronized (r12Var.g) {
            try {
                if (r12Var.n != i) {
                    return false;
                }
                r12Var.C(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean A() {
        return this instanceof itl0;
    }

    public final void a() {
        this.w.incrementAndGet();
        synchronized (this.l) {
            try {
                int size = this.l.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.l;
                    if (i < size) {
                        bvk0 bvk0Var = (bvk0) arrayList.get(i);
                        synchronized (bvk0Var) {
                            bvk0Var.a = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        C(1, null);
    }

    public final void b(String str) {
        this.a = str;
        a();
    }

    public final boolean c() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String d() {
        if (isConnected() && this.b != null) {
            return "com.google.android.gms";
        }
        b9p.a("Failed to connect when checking package");
        return null;
    }

    public final boolean e() {
        return true;
    }

    public boolean f() {
        return false;
    }

    public final void i(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
        Bundle bundleT = t();
        String str = this.s;
        int i = this.q;
        int i2 = w4l.a;
        Scope[] scopeArr = GetServiceRequest.D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.E;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.c.getPackageName();
        getServiceRequest.i = bundleT;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            Account accountR = r();
            if (accountR == null) {
                accountR = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.v = accountR;
            if (bVar != null) {
                getServiceRequest.e = bVar.asBinder();
            }
        }
        getServiceRequest.w = x;
        getServiceRequest.y = s();
        if (A()) {
            getServiceRequest.B = true;
        }
        try {
            synchronized (this.h) {
                try {
                    cum cumVar = this.i;
                    if (cumVar != null) {
                        cumVar.z(new rwk0(this, this.w.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.w.get();
            ask0 ask0Var = this.f;
            ask0Var.sendMessage(ask0Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.w.get();
            f1l0 f1l0Var = new f1l0(this, 8, null, null);
            ask0 ask0Var2 = this.f;
            ask0Var2.sendMessage(ask0Var2.obtainMessage(1, i4, -1, f1l0Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.w.get();
            f1l0 f1l0Var2 = new f1l0(this, 8, null, null);
            ask0 ask0Var3 = this.f;
            ask0Var3.sendMessage(ask0Var3.obtainMessage(1, i5, -1, f1l0Var2));
        }
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final void j(c cVar) {
        this.j = cVar;
        C(2, null);
    }

    public final void k(jgk0 jgk0Var) {
        jgk0Var.a.q.C.post(new igk0(jgk0Var));
    }

    public int l() {
        return w4l.a;
    }

    public final Feature[] m() {
        zzk zzkVar = this.v;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.b;
    }

    public final String n() {
        return this.a;
    }

    public final void p() {
        int iC = this.e.c(this.c, l());
        if (iC == 0) {
            j(new d());
            return;
        }
        C(1, null);
        this.j = new d();
        int i = this.w.get();
        ask0 ask0Var = this.f;
        ask0Var.sendMessage(ask0Var.obtainMessage(3, i, iC, null));
    }

    public abstract T q(IBinder iBinder);

    public Account r() {
        return null;
    }

    public Feature[] s() {
        return x;
    }

    public Bundle t() {
        return new Bundle();
    }

    public Set<Scope> u() {
        return Collections.EMPTY_SET;
    }

    public final T v() {
        T t;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface = this.k;
                hm20.i(iInterface, "Client is connected but service is null");
                t = (T) iInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public abstract String w();

    public abstract String x();

    public boolean y() {
        return l() >= 211700000;
    }

    public void z() {
        System.currentTimeMillis();
    }

    public final void C(int i, IInterface iInterface) {
        atl0 atl0Var;
        String str = QWvyvNzGsBpRT.EJyHYdKT;
        hm20.b((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    fzk0 fzk0Var = this.m;
                    if (fzk0Var != null) {
                        y3l y3lVar = this.d;
                        String str2 = this.b.a;
                        hm20.h(str2);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        boolean z = this.b.b;
                        y3lVar.getClass();
                        y3lVar.v(new rll0(str2, z), fzk0Var);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    fzk0 fzk0Var2 = this.m;
                    if (fzk0Var2 != null && (atl0Var = this.b) != null) {
                        Log.e("GmsClient", str + atl0Var.a + " on com.google.android.gms");
                        y3l y3lVar2 = this.d;
                        String str3 = this.b.a;
                        hm20.h(str3);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        boolean z2 = this.b.b;
                        y3lVar2.getClass();
                        y3lVar2.v(new rll0(str3, z2), fzk0Var2);
                        this.w.incrementAndGet();
                    }
                    fzk0 fzk0Var3 = new fzk0(this, this.w.get());
                    this.m = fzk0Var3;
                    String strX = x();
                    boolean zY = y();
                    this.b = new atl0(strX, zY);
                    if (zY && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
                    }
                    y3l y3lVar3 = this.d;
                    String str4 = this.b.a;
                    hm20.h(str4);
                    this.b.getClass();
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    ConnectionResult connectionResultU = y3lVar3.u(new rll0(str4, this.b.b), fzk0Var3, name, null);
                    if (!(connectionResultU.b == 0)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.b.a + " on com.google.android.gms");
                        int i2 = connectionResultU.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultU.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultU.c);
                        }
                        int i3 = this.w.get();
                        d3l0 d3l0Var = new d3l0(this, i2, bundle);
                        ask0 ask0Var = this.f;
                        ask0Var.sendMessage(ask0Var.obtainMessage(7, i3, -1, d3l0Var));
                    }
                } else if (i == 4) {
                    hm20.h(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
