package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xa50 implements ComponentCallbacks2, gbs {
    public static final hb50 A;
    public static final hb50 z;
    public final com.bumptech.glide.a a;
    public final Context b;
    public final t9s c;
    public final kb50 d;
    public final za50 e;
    public final k5f0 f = new k5f0();
    public final a i;
    public final fva v;
    public final CopyOnWriteArrayList<wa50<Object>> w;
    public final hb50 y;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xa50 xa50Var = xa50.this;
            xa50Var.c.a(xa50Var);
        }
    }

    public class c implements fva.a {
        public final kb50 a;

        public c(kb50 kb50Var) {
            this.a = kb50Var;
        }

        @Override // fva.a
        public final void a(boolean z) {
            if (z) {
                synchronized (xa50.this) {
                    kb50 kb50Var = this.a;
                    ArrayList arrayListE = erh0.e(kb50Var.a);
                    int size = arrayListE.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListE.get(i);
                        i++;
                        ca50 ca50Var = (ca50) obj;
                        if (!ca50Var.c() && !ca50Var.e()) {
                            ca50Var.clear();
                            if (kb50Var.c) {
                                kb50Var.b.add(ca50Var);
                            } else {
                                ca50Var.k();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        hb50 hb50VarD = new hb50().d(Bitmap.class);
        hb50VarD.G = true;
        z = hb50VarD;
        hb50 hb50VarD2 = new hb50().d(thk.class);
        hb50VarD2.G = true;
        A = hb50VarD2;
        new hb50().e(hre.c).q(lw20.d).x(true);
    }

    public xa50(com.bumptech.glide.a aVar, t9s t9sVar, za50 za50Var, kb50 kb50Var, hva hvaVar, Context context) {
        hb50 hb50Var;
        a aVar2 = new a();
        this.i = aVar2;
        this.a = aVar;
        this.c = t9sVar;
        this.e = za50Var;
        this.d = kb50Var;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        c cVar = new c(kb50Var);
        ((lbd) hvaVar).getClass();
        boolean z2 = o0b.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z2 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        fva kbdVar = z2 ? new kbd(applicationContext, cVar) : new f5y();
        this.v = kbdVar;
        synchronized (aVar.i) {
            if (aVar.i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.i.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t9sVar.a(this);
        } else {
            erh0.f().post(aVar2);
        }
        t9sVar.a(kbdVar);
        this.w = new CopyOnWriteArrayList<>(aVar.c.d);
        wzk wzkVar = aVar.c;
        synchronized (wzkVar) {
            hb50Var = wzkVar.h;
            if (hb50Var == null) {
                hb50Var = new hb50();
                hb50Var.G = true;
                wzkVar.h = hb50Var;
            }
        }
        synchronized (this) {
            hb50 hb50VarC = hb50Var.clone();
            hb50VarC.b();
            this.y = hb50VarC;
        }
    }

    @Override // defpackage.gbs
    public final synchronized void b() {
        r();
        this.f.b();
    }

    @Override // defpackage.gbs
    public final synchronized void c() {
        this.f.c();
        q();
    }

    public final <ResourceType> ea50<ResourceType> f(Class<ResourceType> cls) {
        return new ea50<>(this.a, this, cls, this.b);
    }

    public final ea50<Bitmap> k() {
        return f(Bitmap.class).a(z);
    }

    public final ea50<File> l() {
        ea50 ea50VarF = f(File.class);
        hb50 hb50VarX = hb50.L;
        if (hb50VarX == null) {
            hb50VarX = new hb50().x(true);
            hb50VarX.b();
            hb50.L = hb50VarX;
        }
        return ea50VarF.a(hb50VarX);
    }

    public final void n(d5f0<?> d5f0Var) {
        if (d5f0Var == null) {
            return;
        }
        boolean zS = s(d5f0Var);
        ca50 ca50VarA = d5f0Var.a();
        if (zS) {
            return;
        }
        com.bumptech.glide.a aVar = this.a;
        synchronized (aVar.i) {
            try {
                ArrayList arrayList = aVar.i;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((xa50) obj).s(d5f0Var)) {
                        return;
                    }
                }
                if (ca50VarA != null) {
                    d5f0Var.j(null);
                    ca50VarA.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ea50<Drawable> o(Integer num) {
        return f(Drawable.class).O(num);
    }

    @Override // defpackage.gbs
    public final synchronized void onDestroy() {
        int i;
        this.f.onDestroy();
        synchronized (this) {
            try {
                ArrayList arrayListE = erh0.e(this.f.a);
                int size = arrayListE.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListE.get(i2);
                    i2++;
                    n((d5f0) obj);
                }
                this.f.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        kb50 kb50Var = this.d;
        ArrayList arrayListE2 = erh0.e(kb50Var.a);
        int size2 = arrayListE2.size();
        while (i < size2) {
            Object obj2 = arrayListE2.get(i);
            i++;
            kb50Var.a((ca50) obj2);
        }
        kb50Var.b.clear();
        this.c.b(this);
        this.c.b(this.v);
        erh0.f().removeCallbacks(this.i);
        com.bumptech.glide.a aVar = this.a;
        synchronized (aVar.i) {
            if (!aVar.i.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.i.remove(this);
        }
    }

    public final ea50<Drawable> p(String str) {
        return f(Drawable.class).P(str);
    }

    public final synchronized void q() {
        kb50 kb50Var = this.d;
        kb50Var.c = true;
        ArrayList arrayListE = erh0.e(kb50Var.a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ca50 ca50Var = (ca50) obj;
            if (ca50Var.isRunning()) {
                ca50Var.a();
                kb50Var.b.add(ca50Var);
            }
        }
    }

    public final synchronized void r() {
        kb50 kb50Var = this.d;
        int i = 0;
        kb50Var.c = false;
        ArrayList arrayListE = erh0.e(kb50Var.a);
        int size = arrayListE.size();
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ca50 ca50Var = (ca50) obj;
            if (!ca50Var.c() && !ca50Var.isRunning()) {
                ca50Var.k();
            }
        }
        kb50Var.b.clear();
    }

    public final synchronized boolean s(d5f0<?> d5f0Var) {
        ca50 ca50VarA = d5f0Var.a();
        if (ca50VarA == null) {
            return true;
        }
        if (!this.d.a(ca50VarA)) {
            return false;
        }
        this.f.a.remove(d5f0Var);
        d5f0Var.j(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static class b extends blc<View, Object> {
        @Override // defpackage.d5f0
        public final void e(Object obj) {
        }

        @Override // defpackage.d5f0
        public final void m(Drawable drawable) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
