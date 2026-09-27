package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k.a0;
import k.h1;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile r f31509d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f31510e = "ConnectivityMonitor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f31511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @a0("this")
    public final Set<com.bumptech.glide.manager.b.a> f31512b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @a0("this")
    public boolean f31513c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements pc.h.b<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31514a;

        public a(Context context) {
            this.f31514a = context;
        }

        @Override // pc.h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f31514a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements com.bumptech.glide.manager.b.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            pc.o.b();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f31512b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.manager.b.a) it.next()).a(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f31517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.manager.b.a f31518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final pc.h.b<ConnectivityManager> f31519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ConnectivityManager.NetworkCallback f31520d = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: com.bumptech.glide.manager.r$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public class RunnableC0287a implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f31522b;

                public RunnableC0287a(boolean z10) {
                    this.f31522b = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f31522b);
                }
            }

            public a() {
            }

            public void a(boolean z10) {
                pc.o.b();
                d dVar = d.this;
                boolean z11 = dVar.f31517a;
                dVar.f31517a = z10;
                if (z11 != z10) {
                    dVar.f31518b.a(z10);
                }
            }

            public final void b(boolean z10) {
                pc.o.y(new RunnableC0287a(z10));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                b(false);
            }
        }

        public d(pc.h.b<ConnectivityManager> bVar, com.bumptech.glide.manager.b.a aVar) {
            this.f31519c = bVar;
            this.f31518b = aVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        public void a() {
            this.f31519c.get().unregisterNetworkCallback(this.f31520d);
        }

        @Override // com.bumptech.glide.manager.r.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f31517a = this.f31519c.get().getActiveNetwork() != null;
            try {
                this.f31519c.get().registerDefaultNetworkCallback(this.f31520d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e implements c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Executor f31524g = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f31525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.manager.b.a f31526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final pc.h.b<ConnectivityManager> f31527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f31528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f31529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final BroadcastReceiver f31530f = new a();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@NonNull Context context, Intent intent) {
                e.this.e();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f31528d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f31525a.registerReceiver(eVar2.f31530f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f31529e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    e.this.f31529e = false;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f31529e) {
                    e.this.f31529e = false;
                    e eVar = e.this;
                    eVar.f31525a.unregisterReceiver(eVar.f31530f);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = e.this.f31528d;
                e eVar = e.this;
                eVar.f31528d = eVar.c();
                if (z10 != e.this.f31528d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f31528d);
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.f31528d);
                }
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.r$e$e, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC0288e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f31535b;

            public RunnableC0288e(boolean z10) {
                this.f31535b = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f31526b.a(this.f31535b);
            }
        }

        public e(Context context, pc.h.b<ConnectivityManager> bVar, com.bumptech.glide.manager.b.a aVar) {
            this.f31525a = context.getApplicationContext();
            this.f31527c = bVar;
            this.f31526b = aVar;
        }

        @Override // com.bumptech.glide.manager.r.c
        public void a() {
            f31524g.execute(new c());
        }

        @Override // com.bumptech.glide.manager.r.c
        public boolean b() {
            f31524g.execute(new b());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        public boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.f31527c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
                }
                return true;
            }
        }

        public void d(boolean z10) {
            pc.o.y(new RunnableC0288e(z10));
        }

        public void e() {
            f31524g.execute(new d());
        }
    }

    public r(@NonNull Context context) {
        pc.h.b bVarA = pc.h.a(new a(context));
        b bVar = new b();
        this.f31511a = Build.VERSION.SDK_INT >= 24 ? new d(bVarA, bVar) : new e(context, bVarA, bVar);
    }

    public static r a(@NonNull Context context) {
        if (f31509d == null) {
            synchronized (r.class) {
                try {
                    if (f31509d == null) {
                        f31509d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f31509d;
    }

    @h1
    public static void e() {
        f31509d = null;
    }

    @a0("this")
    public final void b() {
        if (this.f31513c || this.f31512b.isEmpty()) {
            return;
        }
        this.f31513c = this.f31511a.b();
    }

    @a0("this")
    public final void c() {
        if (this.f31513c && this.f31512b.isEmpty()) {
            this.f31511a.a();
            this.f31513c = false;
        }
    }

    public synchronized void d(com.bumptech.glide.manager.b.a aVar) {
        this.f31512b.add(aVar);
        b();
    }

    public synchronized void f(com.bumptech.glide.manager.b.a aVar) {
        this.f31512b.remove(aVar);
        c();
    }
}
