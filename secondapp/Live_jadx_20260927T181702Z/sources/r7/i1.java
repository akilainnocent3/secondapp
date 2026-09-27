package r7;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.session.fe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f123840c = "MediaRouter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f123841d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f123842e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f123843f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f123844g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f123845h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static d f123846i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f123847j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f123848k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f123849l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f123850m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f123851n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f123852o = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f123854b = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a {
        @Deprecated
        public void onRouteSelected(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        @Deprecated
        public void onRouteUnselected(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        public void onRouteSelected(@NonNull i1 i1Var, @NonNull h hVar, int i10) {
            onRouteSelected(i1Var, hVar);
        }

        public void onRouteUnselected(@NonNull i1 i1Var, @NonNull h hVar, int i10) {
            onRouteUnselected(i1Var, hVar);
        }

        public void onRouteSelected(@NonNull i1 i1Var, @NonNull h hVar, int i10, @NonNull h hVar2) {
            onRouteSelected(i1Var, hVar, i10);
        }

        public void onProviderAdded(@NonNull i1 i1Var, @NonNull g gVar) {
        }

        public void onProviderChanged(@NonNull i1 i1Var, @NonNull g gVar) {
        }

        public void onProviderRemoved(@NonNull i1 i1Var, @NonNull g gVar) {
        }

        public void onRouteAdded(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        public void onRouteChanged(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        public void onRoutePresentationDisplayChanged(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        public void onRouteRemoved(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        public void onRouteVolumeChanged(@NonNull i1 i1Var, @NonNull h hVar) {
        }

        @k.y0({k.y0.a.LIBRARY})
        public void onRouterParamsChanged(@NonNull i1 i1Var, @Nullable k2 k2Var) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i1 f123855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f123856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h1 f123857c = h1.f123799d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f123858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f123859e;

        public b(i1 i1Var, a aVar) {
            this.f123855a = i1Var;
            this.f123856b = aVar;
        }

        public boolean a(h hVar, int i10, h hVar2, int i11) {
            if ((this.f123858d & 2) != 0 || hVar.K(this.f123857c)) {
                return true;
            }
            if (i1.u() && hVar.B() && i10 == 262 && i11 == 3 && hVar2 != null) {
                return !hVar2.B();
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements u2.f, p2.d {
        public z0 A;
        public int B;
        public e C;
        public f D;
        public h E;
        public a1.e F;
        public e G;
        public MediaSessionCompat H;
        public MediaSessionCompat I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f123860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f123861b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u2 f123862c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @k.h1
        public p2 f123863d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f123864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r f123865f;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public m1.a f123874o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f123875p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public h2 f123876q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public k2 f123877r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public h f123878s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public h f123879t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public h f123880u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public a1.e f123881v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public h f123882w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public a1.e f123883x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public z0 f123885z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList<WeakReference<i1>> f123866g = new ArrayList<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList<h> f123867h = new ArrayList<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Map<e2.t<String, String>, String> f123868i = new HashMap();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList<g> f123869j = new ArrayList<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<h> f123870k = new ArrayList<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final r2.c f123871l = new r2.c();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final g f123872m = new g();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final HandlerC1208d f123873n = new HandlerC1208d();

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Map<String, a1.e> f123884y = new HashMap();
        public final MediaSessionCompat.k J = new a();
        public a1.b.e K = new c();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements MediaSessionCompat.k {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.k
            public void a() {
                MediaSessionCompat mediaSessionCompat = d.this.H;
                if (mediaSessionCompat != null) {
                    if (mediaSessionCompat.k()) {
                        d dVar = d.this;
                        dVar.g(dVar.H.h());
                    } else {
                        d dVar2 = d.this;
                        dVar2.L(dVar2.H.h());
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.Z();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements a1.b.e {
            public c() {
            }

            @Override // r7.a1.b.e
            public void a(@NonNull a1.b bVar, @Nullable y0 y0Var, @NonNull Collection<a1.b.d> collection) {
                d dVar = d.this;
                if (bVar != dVar.f123883x || y0Var == null) {
                    if (bVar == dVar.f123881v) {
                        if (y0Var != null) {
                            dVar.e0(dVar.f123880u, y0Var);
                        }
                        d.this.f123880u.U(collection);
                        return;
                    }
                    return;
                }
                g gVarS = dVar.f123882w.s();
                String strM = y0Var.m();
                h hVar = new h(gVarS, strM, d.this.h(gVarS, strM));
                hVar.L(y0Var);
                d dVar2 = d.this;
                if (dVar2.f123880u == hVar) {
                    return;
                }
                dVar2.J(dVar2, hVar, dVar2.f123883x, 3, dVar2.f123882w, collection);
                d dVar3 = d.this;
                dVar3.f123882w = null;
                dVar3.f123883x = null;
            }
        }

        /* JADX INFO: renamed from: r7.i1$d$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final class HandlerC1208d extends Handler {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f123889d = 65280;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f123890e = 256;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f123891f = 512;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f123892g = 768;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f123893h = 257;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f123894i = 258;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static final int f123895j = 259;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static final int f123896k = 260;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f123897l = 261;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f123898m = 262;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f123899n = 263;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f123900o = 264;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f123901p = 513;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final int f123902q = 514;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final int f123903r = 515;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final int f123904s = 769;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList<b> f123905a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<h> f123906b = new ArrayList();

            public HandlerC1208d() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(b bVar, int i10, Object obj, int i11) {
                i1 i1Var = bVar.f123855a;
                a aVar = bVar.f123856b;
                int i12 = 65280 & i10;
                if (i12 != 256) {
                    if (i12 != 512) {
                        if (i12 == 768 && i10 == 769) {
                            aVar.onRouterParamsChanged(i1Var, (k2) obj);
                        }
                        return;
                    }
                    g gVar = (g) obj;
                    switch (i10) {
                        case 513:
                            aVar.onProviderAdded(i1Var, gVar);
                            break;
                        case f123902q /* 514 */:
                            aVar.onProviderRemoved(i1Var, gVar);
                            break;
                        case f123903r /* 515 */:
                            aVar.onProviderChanged(i1Var, gVar);
                            break;
                    }
                }
                h hVar = (i10 == 264 || i10 == 262) ? (h) ((e2.t) obj).f79832b : (h) obj;
                h hVar2 = (i10 == 264 || i10 == 262) ? (h) ((e2.t) obj).f79831a : null;
                if (hVar == null || !bVar.a(hVar, i10, hVar2, i11)) {
                    return;
                }
                switch (i10) {
                    case 257:
                        aVar.onRouteAdded(i1Var, hVar);
                        break;
                    case f123894i /* 258 */:
                        aVar.onRouteRemoved(i1Var, hVar);
                        break;
                    case f123895j /* 259 */:
                        aVar.onRouteChanged(i1Var, hVar);
                        break;
                    case f123896k /* 260 */:
                        aVar.onRouteVolumeChanged(i1Var, hVar);
                        break;
                    case f123897l /* 261 */:
                        aVar.onRoutePresentationDisplayChanged(i1Var, hVar);
                        break;
                    case f123898m /* 262 */:
                        aVar.onRouteSelected(i1Var, hVar, i11, hVar);
                        break;
                    case f123899n /* 263 */:
                        aVar.onRouteUnselected(i1Var, hVar, i11);
                        break;
                    case f123900o /* 264 */:
                        aVar.onRouteSelected(i1Var, hVar, i11, hVar2);
                        break;
                }
            }

            public void b(int i10, Object obj) {
                obtainMessage(i10, obj).sendToTarget();
            }

            public void c(int i10, Object obj, int i11) {
                Message messageObtainMessage = obtainMessage(i10, obj);
                messageObtainMessage.arg1 = i11;
                messageObtainMessage.sendToTarget();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void d(int i10, Object obj) {
                if (i10 == 262) {
                    h hVar = (h) ((e2.t) obj).f79832b;
                    d.this.f123862c.H(hVar);
                    if (d.this.f123878s == null || !hVar.B()) {
                        return;
                    }
                    Iterator<h> it = this.f123906b.iterator();
                    while (it.hasNext()) {
                        d.this.f123862c.G(it.next());
                    }
                    this.f123906b.clear();
                    return;
                }
                if (i10 == 264) {
                    h hVar2 = (h) ((e2.t) obj).f79832b;
                    this.f123906b.add(hVar2);
                    d.this.f123862c.E(hVar2);
                    d.this.f123862c.H(hVar2);
                    return;
                }
                switch (i10) {
                    case 257:
                        d.this.f123862c.E((h) obj);
                        break;
                    case f123894i /* 258 */:
                        d.this.f123862c.G((h) obj);
                        break;
                    case f123895j /* 259 */:
                        d.this.f123862c.F((h) obj);
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                Object obj = message.obj;
                int i11 = message.arg1;
                if (i10 == 259 && d.this.A().l().equals(((h) obj).l())) {
                    d.this.f0(true);
                }
                d(i10, obj);
                try {
                    int size = d.this.f123866g.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        i1 i1Var = d.this.f123866g.get(size).get();
                        if (i1Var == null) {
                            d.this.f123866g.remove(size);
                        } else {
                            this.f123905a.addAll(i1Var.f123854b);
                        }
                    }
                    int size2 = this.f123905a.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        a(this.f123905a.get(i12), i10, obj, i11);
                    }
                } finally {
                    this.f123905a.clear();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MediaSessionCompat f123908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f123909b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f123910c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public q4.s f123911d;

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public class a extends q4.s {

                /* JADX INFO: renamed from: r7.i1$d$e$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public class RunnableC1209a implements Runnable {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f123914b;

                    public RunnableC1209a(int i10) {
                        this.f123914b = i10;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = d.this.f123880u;
                        if (hVar != null) {
                            hVar.M(this.f123914b);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
                public class b implements Runnable {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f123916b;

                    public b(int i10) {
                        this.f123916b = i10;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = d.this.f123880u;
                        if (hVar != null) {
                            hVar.N(this.f123916b);
                        }
                    }
                }

                public a(int i10, int i11, int i12, String str) {
                    super(i10, i11, i12, str);
                }

                @Override // q4.s
                public void f(int i10) {
                    d.this.f123873n.post(new b(i10));
                }

                @Override // q4.s
                public void g(int i10) {
                    d.this.f123873n.post(new RunnableC1209a(i10));
                }
            }

            public e(d dVar, Object obj) {
                this(MediaSessionCompat.c(dVar.f123860a, obj));
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.f123908a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.x(d.this.f123871l.f124103d);
                    this.f123911d = null;
                }
            }

            public void b(int i10, int i11, int i12, @Nullable String str) {
                if (this.f123908a != null) {
                    q4.s sVar = this.f123911d;
                    if (sVar != null && i10 == this.f123909b && i11 == this.f123910c) {
                        sVar.i(i12);
                        return;
                    }
                    a aVar = new a(i10, i11, i12, str);
                    this.f123911d = aVar;
                    this.f123908a.y(aVar);
                }
            }

            public MediaSessionCompat.Token c() {
                MediaSessionCompat mediaSessionCompat = this.f123908a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.i();
                }
                return null;
            }

            public e(MediaSessionCompat mediaSessionCompat) {
                this.f123908a = mediaSessionCompat;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final class f extends r.c {
            public f() {
            }

            @Override // r7.r.c
            public void a(@NonNull a1.e eVar) {
                if (eVar == d.this.f123881v) {
                    d(2);
                } else if (i1.f123841d) {
                    Log.d(i1.f123840c, "A RouteController unrelated to the selected route is released. controller=" + eVar);
                }
            }

            @Override // r7.r.c
            public void b(int i10) {
                d(i10);
            }

            @Override // r7.r.c
            public void c(@NonNull String str, int i10) {
                h next;
                Iterator<h> it = d.this.z().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next.t() == d.this.f123865f && TextUtils.equals(str, next.f())) {
                        break;
                    }
                }
                if (next != null) {
                    d.this.Q(next, i10);
                    return;
                }
                Log.w(i1.f123840c, "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
            }

            public void d(int i10) {
                h hVarI = d.this.i();
                if (d.this.A() != hVarI) {
                    d.this.Q(hVarI, i10);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final class g extends a1.a {
            public g() {
            }

            @Override // r7.a1.a
            public void a(@NonNull a1 a1Var, b1 b1Var) {
                d.this.d0(a1Var, b1Var);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final class h implements r2.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final r2 f123920a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f123921b;

            public h(Object obj) {
                r2 r2VarB = r2.b(d.this.f123860a, obj);
                this.f123920a = r2VarB;
                r2VarB.d(this);
                e();
            }

            @Override // r7.r2.d
            public void a(int i10) {
                h hVar;
                if (this.f123921b || (hVar = d.this.f123880u) == null) {
                    return;
                }
                hVar.M(i10);
            }

            @Override // r7.r2.d
            public void b(int i10) {
                h hVar;
                if (this.f123921b || (hVar = d.this.f123880u) == null) {
                    return;
                }
                hVar.N(i10);
            }

            public void c() {
                this.f123921b = true;
                this.f123920a.d(null);
            }

            public Object d() {
                return this.f123920a.a();
            }

            public void e() {
                this.f123920a.c(d.this.f123871l);
            }
        }

        public d(Context context) {
            this.f123860a = context;
            this.f123875p = d1.d.a((ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f6970r));
        }

        @NonNull
        public h A() {
            h hVar = this.f123880u;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public String B(g gVar, String str) {
            return this.f123868i.get(new e2.t(gVar.c().flattenToShortString(), str));
        }

        @k.y0({k.y0.a.LIBRARY})
        public boolean C() {
            Bundle bundle;
            k2 k2Var = this.f123877r;
            return k2Var == null || (bundle = k2Var.f123993e) == null || bundle.getBoolean(k2.f123987h, true);
        }

        public boolean D() {
            if (!this.f123864e) {
                return false;
            }
            k2 k2Var = this.f123877r;
            return k2Var == null || k2Var.c();
        }

        public boolean E(h1 h1Var, int i10) {
            if (h1Var.g()) {
                return false;
            }
            if ((i10 & 2) == 0 && this.f123875p) {
                return true;
            }
            k2 k2Var = this.f123877r;
            boolean z10 = k2Var != null && k2Var.d() && D();
            int size = this.f123867h.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f123867h.get(i11);
                if (((i10 & 1) == 0 || !hVar.B()) && ((!z10 || hVar.B() || hVar.t() == this.f123865f) && hVar.K(h1Var))) {
                    return true;
                }
            }
            return false;
        }

        public final boolean F(h hVar) {
            return hVar.t() == this.f123862c && hVar.f123943b.equals(u2.f124168m);
        }

        public final boolean G(h hVar) {
            return hVar.t() == this.f123862c && hVar.R(r7.a.f123600a) && !hVar.R(r7.a.f123601b);
        }

        public boolean H() {
            k2 k2Var = this.f123877r;
            if (k2Var == null) {
                return false;
            }
            return k2Var.e();
        }

        public void I() {
            if (this.f123880u.E()) {
                List<h> listM = this.f123880u.m();
                HashSet hashSet = new HashSet();
                Iterator<h> it = listM.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().f123944c);
                }
                Iterator<Map.Entry<String, a1.e>> it2 = this.f123884y.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, a1.e> next = it2.next();
                    if (!hashSet.contains(next.getKey())) {
                        a1.e value = next.getValue();
                        value.i(0);
                        value.e();
                        it2.remove();
                    }
                }
                for (h hVar : listM) {
                    if (!this.f123884y.containsKey(hVar.f123944c)) {
                        a1.e eVarX = hVar.t().x(hVar.f123943b, this.f123880u.f123943b);
                        eVarX.f();
                        this.f123884y.put(hVar.f123944c, eVarX);
                    }
                }
            }
        }

        public void J(d dVar, h hVar, @Nullable a1.e eVar, int i10, @Nullable h hVar2, @Nullable Collection<a1.b.d> collection) {
            e eVar2;
            f fVar = this.D;
            if (fVar != null) {
                fVar.a();
                this.D = null;
            }
            f fVar2 = new f(dVar, hVar, eVar, i10, hVar2, collection);
            this.D = fVar2;
            if (fVar2.f123925b != 3 || (eVar2 = this.C) == null) {
                fVar2.b();
                return;
            }
            nj.t1<Void> t1VarOnPrepareTransfer = eVar2.onPrepareTransfer(this.f123880u, fVar2.f123927d);
            if (t1VarOnPrepareTransfer == null) {
                this.D.b();
            } else {
                this.D.d(t1VarOnPrepareTransfer);
            }
        }

        public void K(@NonNull h hVar) {
            if (!(this.f123881v instanceof a1.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.b bVarS = s(hVar);
            if (this.f123880u.m().contains(hVar) && bVarS != null && bVarS.d()) {
                if (this.f123880u.m().size() <= 1) {
                    Log.w(i1.f123840c, "Ignoring attempt to remove the last member route.");
                    return;
                } else {
                    ((a1.b) this.f123881v).p(hVar.f());
                    return;
                }
            }
            Log.w(i1.f123840c, "Ignoring attempt to remove a non-unselectable member route : " + hVar);
        }

        public void L(Object obj) {
            int iL = l(obj);
            if (iL >= 0) {
                this.f123870k.remove(iL).c();
            }
        }

        public void M(h hVar, int i10) {
            a1.e eVar;
            a1.e eVar2;
            if (hVar == this.f123880u && (eVar2 = this.f123881v) != null) {
                eVar2.g(i10);
            } else {
                if (this.f123884y.isEmpty() || (eVar = this.f123884y.get(hVar.f123944c)) == null) {
                    return;
                }
                eVar.g(i10);
            }
        }

        public void N(h hVar, int i10) {
            a1.e eVar;
            a1.e eVar2;
            if (hVar == this.f123880u && (eVar2 = this.f123881v) != null) {
                eVar2.j(i10);
            } else {
                if (this.f123884y.isEmpty() || (eVar = this.f123884y.get(hVar.f123944c)) == null) {
                    return;
                }
                eVar.j(i10);
            }
        }

        public void O() {
            if (this.f123861b) {
                this.f123863d.h();
                this.f123876q.c();
                V(null);
                T(null);
                Iterator<h> it = this.f123870k.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                Iterator it2 = new ArrayList(this.f123869j).iterator();
                while (it2.hasNext()) {
                    b(((g) it2.next()).f123934a);
                }
                this.f123873n.removeCallbacksAndMessages(null);
            }
        }

        public void P(@NonNull h hVar, int i10) {
            if (!this.f123867h.contains(hVar)) {
                Log.w(i1.f123840c, "Ignoring attempt to select removed route: " + hVar);
                return;
            }
            if (!hVar.f123948g) {
                Log.w(i1.f123840c, "Ignoring attempt to select disabled route: " + hVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                a1 a1VarT = hVar.t();
                r rVar = this.f123865f;
                if (a1VarT == rVar && this.f123880u != hVar) {
                    rVar.J(hVar.f());
                    return;
                }
            }
            Q(hVar, i10);
        }

        public void Q(@NonNull h hVar, int i10) {
            if (i1.f123846i == null || (this.f123879t != null && hVar.A())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 3; i11 < stackTrace.length; i11++) {
                    StackTraceElement stackTraceElement = stackTrace[i11];
                    sb2.append(stackTraceElement.getClassName());
                    sb2.append(fe.F);
                    sb2.append(stackTraceElement.getMethodName());
                    sb2.append(":");
                    sb2.append(stackTraceElement.getLineNumber());
                    sb2.append(vb.q.a.f140822e);
                }
                if (i1.f123846i == null) {
                    Log.w(i1.f123840c, "setSelectedRouteInternal is called while sGlobal is null: pkgName=" + this.f123860a.getPackageName() + ", callers=" + ((Object) sb2));
                } else {
                    Log.w(i1.f123840c, "Default route is selected while a BT route is available: pkgName=" + this.f123860a.getPackageName() + ", callers=" + ((Object) sb2));
                }
            }
            if (this.f123880u == hVar) {
                return;
            }
            if (this.f123882w != null) {
                this.f123882w = null;
                a1.e eVar = this.f123883x;
                if (eVar != null) {
                    eVar.i(3);
                    this.f123883x.e();
                    this.f123883x = null;
                }
            }
            if (D() && hVar.s().g()) {
                a1.b bVarV = hVar.t().v(hVar.f123943b);
                if (bVarV != null) {
                    bVarV.r(f1.d.getMainExecutor(this.f123860a), this.K);
                    this.f123882w = hVar;
                    this.f123883x = bVarV;
                    bVarV.f();
                    return;
                }
                Log.w(i1.f123840c, "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + hVar);
            }
            a1.e eVarW = hVar.t().w(hVar.f123943b);
            if (eVarW != null) {
                eVarW.f();
            }
            if (i1.f123841d) {
                Log.d(i1.f123840c, "Route selected: " + hVar);
            }
            if (this.f123880u != null) {
                J(this, hVar, eVarW, i10, null, null);
                return;
            }
            this.f123880u = hVar;
            this.f123881v = eVarW;
            this.f123873n.c(HandlerC1208d.f123898m, new e2.t(null, hVar), i10);
        }

        public void R(h hVar, Intent intent, c cVar) {
            a1.e eVar;
            a1.e eVar2;
            if (hVar == this.f123880u && (eVar2 = this.f123881v) != null && eVar2.d(intent, cVar)) {
                return;
            }
            f fVar = this.D;
            if ((fVar == null || hVar != fVar.f123927d || (eVar = fVar.f123924a) == null || !eVar.d(intent, cVar)) && cVar != null) {
                cVar.a(null, null);
            }
        }

        public void S(Object obj) {
            U(obj != null ? new e(this, obj) : null);
        }

        public void T(MediaSessionCompat mediaSessionCompat) {
            this.I = mediaSessionCompat;
            U(mediaSessionCompat != null ? new e(mediaSessionCompat) : null);
        }

        public final void U(e eVar) {
            e eVar2 = this.G;
            if (eVar2 != null) {
                eVar2.a();
            }
            this.G = eVar;
            if (eVar != null) {
                b0();
            }
        }

        public void V(@Nullable t2 t2Var) {
            r rVar = this.f123865f;
            if (rVar == null || Build.VERSION.SDK_INT < 34) {
                return;
            }
            rVar.I(t2Var);
        }

        @SuppressLint({"NewApi"})
        public void W(@Nullable k2 k2Var) {
            k2 k2Var2 = this.f123877r;
            this.f123877r = k2Var;
            if (D()) {
                if (this.f123865f == null) {
                    r rVar = new r(this.f123860a, new f());
                    this.f123865f = rVar;
                    f(rVar, true);
                    Z();
                    this.f123863d.e();
                }
                if ((k2Var2 != null && k2Var2.e()) != (k2Var != null && k2Var.e())) {
                    this.f123865f.C(this.A);
                }
            } else {
                a1 a1Var = this.f123865f;
                if (a1Var != null) {
                    b(a1Var);
                    this.f123865f = null;
                    this.f123863d.e();
                }
            }
            this.f123873n.b(HandlerC1208d.f123904s, k2Var);
        }

        public final void X() {
            this.f123876q = new h2(new b());
            f(this.f123862c, true);
            r rVar = this.f123865f;
            if (rVar != null) {
                f(rVar, true);
            }
            p2 p2Var = new p2(this.f123860a, this);
            this.f123863d = p2Var;
            p2Var.g();
        }

        public void Y(@NonNull h hVar) {
            if (!(this.f123881v instanceof a1.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.b bVarS = s(hVar);
            if (bVarS == null || !bVarS.c()) {
                Log.w(i1.f123840c, "Ignoring attempt to transfer to a non-transferable route.");
            } else {
                ((a1.b) this.f123881v).q(Collections.singletonList(hVar.f()));
            }
        }

        public void Z() {
            h1.a aVar = new h1.a();
            this.f123876q.c();
            int size = this.f123866g.size();
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                i1 i1Var = this.f123866g.get(size).get();
                if (i1Var == null) {
                    this.f123866g.remove(size);
                } else {
                    int size2 = i1Var.f123854b.size();
                    i10 += size2;
                    for (int i11 = 0; i11 < size2; i11++) {
                        b bVar = i1Var.f123854b.get(i11);
                        aVar.c(bVar.f123857c);
                        boolean z11 = (bVar.f123858d & 1) != 0;
                        this.f123876q.b(z11, bVar.f123859e);
                        if (z11) {
                            z10 = true;
                        }
                        int i12 = bVar.f123858d;
                        if ((i12 & 4) != 0 && !this.f123875p) {
                            z10 = true;
                        }
                        if ((i12 & 8) != 0) {
                            z10 = true;
                        }
                    }
                }
            }
            boolean zA = this.f123876q.a();
            this.B = i10;
            h1 h1VarD = z10 ? aVar.d() : h1.f123799d;
            a0(aVar.d(), zA);
            z0 z0Var = this.f123885z;
            if (z0Var != null && z0Var.d().equals(h1VarD) && this.f123885z.e() == zA) {
                return;
            }
            if (!h1VarD.g() || zA) {
                this.f123885z = new z0(h1VarD, zA);
            } else if (this.f123885z == null) {
                return;
            } else {
                this.f123885z = null;
            }
            if (i1.f123841d) {
                Log.d(i1.f123840c, "Updated discovery request: " + this.f123885z);
            }
            if (z10 && !zA && this.f123875p) {
                Log.i(i1.f123840c, "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f123869j.size();
            for (int i13 = 0; i13 < size3; i13++) {
                a1 a1Var = this.f123869j.get(i13).f123934a;
                if (a1Var != this.f123865f) {
                    a1Var.B(this.f123885z);
                }
            }
        }

        @Override // r7.p2.d
        public void a(@NonNull n2 n2Var, @NonNull a1.e eVar) {
            if (this.f123881v == eVar) {
                P(i(), 2);
            }
        }

        public final void a0(@NonNull h1 h1Var, boolean z10) {
            if (D()) {
                z0 z0Var = this.A;
                if (z0Var != null && z0Var.d().equals(h1Var) && this.A.e() == z10) {
                    return;
                }
                if (!h1Var.g() || z10) {
                    this.A = new z0(h1Var, z10);
                } else if (this.A == null) {
                    return;
                } else {
                    this.A = null;
                }
                if (i1.f123841d) {
                    Log.d(i1.f123840c, "Updated MediaRoute2Provider's discovery request: " + this.A);
                }
                this.f123865f.B(this.A);
            }
        }

        @Override // r7.p2.d
        public void b(@NonNull a1 a1Var) {
            g gVarK = k(a1Var);
            if (gVarK != null) {
                a1Var.z(null);
                a1Var.B(null);
                c0(gVarK, null);
                if (i1.f123841d) {
                    Log.d(i1.f123840c, "Provider removed: " + gVarK);
                }
                this.f123873n.b(HandlerC1208d.f123902q, gVarK);
                this.f123869j.remove(gVarK);
            }
        }

        @SuppressLint({"NewApi"})
        public void b0() {
            h hVar = this.f123880u;
            if (hVar == null) {
                e eVar = this.G;
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            }
            this.f123871l.f124100a = hVar.v();
            this.f123871l.f124101b = this.f123880u.x();
            this.f123871l.f124102c = this.f123880u.w();
            this.f123871l.f124103d = this.f123880u.o();
            this.f123871l.f124104e = this.f123880u.p();
            if (D() && this.f123880u.t() == this.f123865f) {
                this.f123871l.f124105f = r.F(this.f123881v);
            } else {
                this.f123871l.f124105f = null;
            }
            int size = this.f123870k.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f123870k.get(i10).e();
            }
            if (this.G != null) {
                if (this.f123880u == q() || this.f123880u == n()) {
                    this.G.a();
                } else {
                    r2.c cVar = this.f123871l;
                    this.G.b(cVar.f124102c == 1 ? 2 : 0, cVar.f124101b, cVar.f124100a, cVar.f124105f);
                }
            }
        }

        @Override // r7.p2.d
        public void c(@NonNull a1 a1Var) {
            f(a1Var, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c0(g gVar, b1 b1Var) {
            boolean z10;
            if (gVar.h(b1Var)) {
                int i10 = 0;
                if (b1Var == null || !(b1Var.d() || b1Var == this.f123862c.r())) {
                    Log.w(i1.f123840c, "Ignoring invalid provider descriptor: " + b1Var);
                    z10 = false;
                } else {
                    List<y0> listC = b1Var.c();
                    ArrayList<e2.t> arrayList = new ArrayList();
                    ArrayList<e2.t> arrayList2 = new ArrayList();
                    z10 = false;
                    for (y0 y0Var : listC) {
                        if (y0Var == null || !y0Var.A()) {
                            Log.w(i1.f123840c, "Ignoring invalid system route descriptor: " + y0Var);
                        } else {
                            String strM = y0Var.m();
                            int iB = gVar.b(strM);
                            if (iB < 0) {
                                h hVar = new h(gVar, strM, h(gVar, strM));
                                int i11 = i10 + 1;
                                gVar.f123935b.add(i10, hVar);
                                this.f123867h.add(hVar);
                                if (y0Var.k().size() > 0) {
                                    arrayList.add(new e2.t(hVar, y0Var));
                                } else {
                                    hVar.L(y0Var);
                                    if (i1.f123841d) {
                                        Log.d(i1.f123840c, "Route added: " + hVar);
                                    }
                                    this.f123873n.b(257, hVar);
                                }
                                i10 = i11;
                            } else if (iB < i10) {
                                Log.w(i1.f123840c, "Ignoring route descriptor with duplicate id: " + y0Var);
                            } else {
                                h hVar2 = gVar.f123935b.get(iB);
                                int i12 = i10 + 1;
                                Collections.swap(gVar.f123935b, iB, i10);
                                if (y0Var.k().size() > 0) {
                                    arrayList2.add(new e2.t(hVar2, y0Var));
                                } else if (e0(hVar2, y0Var) != 0 && hVar2 == this.f123880u) {
                                    z10 = true;
                                }
                                i10 = i12;
                            }
                        }
                    }
                    for (e2.t tVar : arrayList) {
                        h hVar3 = (h) tVar.f79831a;
                        hVar3.L((y0) tVar.f79832b);
                        if (i1.f123841d) {
                            Log.d(i1.f123840c, "Route added: " + hVar3);
                        }
                        this.f123873n.b(257, hVar3);
                    }
                    for (e2.t tVar2 : arrayList2) {
                        h hVar4 = (h) tVar2.f79831a;
                        if (e0(hVar4, (y0) tVar2.f79832b) != 0 && hVar4 == this.f123880u) {
                            z10 = true;
                        }
                    }
                }
                for (int size = gVar.f123935b.size() - 1; size >= i10; size--) {
                    h hVar5 = gVar.f123935b.get(size);
                    hVar5.L(null);
                    this.f123867h.remove(hVar5);
                }
                f0(z10);
                for (int size2 = gVar.f123935b.size() - 1; size2 >= i10; size2--) {
                    h hVarRemove = gVar.f123935b.remove(size2);
                    if (i1.f123841d) {
                        Log.d(i1.f123840c, "Route removed: " + hVarRemove);
                    }
                    this.f123873n.b(HandlerC1208d.f123894i, hVarRemove);
                }
                if (i1.f123841d) {
                    Log.d(i1.f123840c, "Provider changed: " + gVar);
                }
                this.f123873n.b(HandlerC1208d.f123903r, gVar);
            }
        }

        @Override // r7.u2.f
        public void d(@NonNull String str) {
            h hVarA;
            this.f123873n.removeMessages(HandlerC1208d.f123898m);
            g gVarK = k(this.f123862c);
            if (gVarK == null || (hVarA = gVarK.a(str)) == null) {
                return;
            }
            hVarA.O();
        }

        public void d0(a1 a1Var, b1 b1Var) {
            g gVarK = k(a1Var);
            if (gVarK != null) {
                c0(gVarK, b1Var);
            }
        }

        public void e(@NonNull h hVar) {
            if (!(this.f123881v instanceof a1.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.b bVarS = s(hVar);
            if (!this.f123880u.m().contains(hVar) && bVarS != null && bVarS.b()) {
                ((a1.b) this.f123881v).o(hVar.f());
                return;
            }
            Log.w(i1.f123840c, "Ignoring attempt to add a non-groupable route to dynamic group : " + hVar);
        }

        public int e0(h hVar, y0 y0Var) {
            int iL = hVar.L(y0Var);
            if (iL != 0) {
                if ((iL & 1) != 0) {
                    if (i1.f123841d) {
                        Log.d(i1.f123840c, "Route changed: " + hVar);
                    }
                    this.f123873n.b(HandlerC1208d.f123895j, hVar);
                }
                if ((iL & 2) != 0) {
                    if (i1.f123841d) {
                        Log.d(i1.f123840c, "Route volume changed: " + hVar);
                    }
                    this.f123873n.b(HandlerC1208d.f123896k, hVar);
                }
                if ((iL & 4) != 0) {
                    if (i1.f123841d) {
                        Log.d(i1.f123840c, "Route presentation display changed: " + hVar);
                    }
                    this.f123873n.b(HandlerC1208d.f123897l, hVar);
                }
            }
            return iL;
        }

        public final void f(@NonNull a1 a1Var, boolean z10) {
            if (k(a1Var) == null) {
                g gVar = new g(a1Var, z10);
                this.f123869j.add(gVar);
                if (i1.f123841d) {
                    Log.d(i1.f123840c, "Provider added: " + gVar);
                }
                this.f123873n.b(513, gVar);
                c0(gVar, a1Var.r());
                a1Var.z(this.f123872m);
                a1Var.B(this.f123885z);
            }
        }

        public void f0(boolean z10) {
            h hVar = this.f123878s;
            if (hVar != null && !hVar.H()) {
                Log.i(i1.f123840c, "Clearing the default route because it is no longer selectable: " + this.f123878s);
                this.f123878s = null;
            }
            if (this.f123878s == null && !this.f123867h.isEmpty()) {
                for (h hVar2 : this.f123867h) {
                    if (F(hVar2) && hVar2.H()) {
                        this.f123878s = hVar2;
                        Log.i(i1.f123840c, "Found default route: " + this.f123878s);
                        break;
                    }
                }
            }
            h hVar3 = this.f123879t;
            if (hVar3 != null && !hVar3.H()) {
                Log.i(i1.f123840c, "Clearing the bluetooth route because it is no longer selectable: " + this.f123879t);
                this.f123879t = null;
            }
            if (this.f123879t == null && !this.f123867h.isEmpty()) {
                for (h hVar4 : this.f123867h) {
                    if (G(hVar4) && hVar4.H()) {
                        this.f123879t = hVar4;
                        Log.i(i1.f123840c, "Found bluetooth route: " + this.f123879t);
                        break;
                    }
                }
            }
            h hVar5 = this.f123880u;
            if (hVar5 != null && hVar5.D()) {
                if (z10) {
                    I();
                    b0();
                    return;
                }
                return;
            }
            Log.i(i1.f123840c, "Unselecting the current route because it is no longer selectable: " + this.f123880u);
            Q(i(), 0);
        }

        public void g(Object obj) {
            if (l(obj) < 0) {
                this.f123870k.add(new h(obj));
            }
        }

        public String h(g gVar, String str) {
            String str2;
            String strFlattenToShortString = gVar.c().flattenToShortString();
            if (gVar.f123936c) {
                str2 = str;
            } else {
                str2 = strFlattenToShortString + ":" + str;
            }
            if (gVar.f123936c || m(str2) < 0) {
                this.f123868i.put(new e2.t<>(strFlattenToShortString, str), str2);
                return str2;
            }
            Log.w(i1.f123840c, "Either " + str + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i10 = 2;
            while (true) {
                String str3 = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i10));
                if (m(str3) < 0) {
                    this.f123868i.put(new e2.t<>(strFlattenToShortString, str), str3);
                    return str3;
                }
                i10++;
            }
        }

        public h i() {
            for (h hVar : this.f123867h) {
                if (hVar != this.f123878s && G(hVar) && hVar.H()) {
                    return hVar;
                }
            }
            return this.f123878s;
        }

        @SuppressLint({"NewApi", "SyntheticAccessor"})
        public void j() {
            if (this.f123861b) {
                return;
            }
            this.f123861b = true;
            if (Build.VERSION.SDK_INT >= 30) {
                this.f123864e = m2.a(this.f123860a);
            } else {
                this.f123864e = false;
            }
            if (this.f123864e) {
                this.f123865f = new r(this.f123860a, new f());
            } else {
                this.f123865f = null;
            }
            this.f123862c = u2.D(this.f123860a, this);
            X();
        }

        public final g k(a1 a1Var) {
            int size = this.f123869j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123869j.get(i10).f123934a == a1Var) {
                    return this.f123869j.get(i10);
                }
            }
            return null;
        }

        public final int l(Object obj) {
            int size = this.f123870k.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123870k.get(i10).d() == obj) {
                    return i10;
                }
            }
            return -1;
        }

        public final int m(String str) {
            int size = this.f123867h.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123867h.get(i10).f123944c.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        public h n() {
            return this.f123879t;
        }

        public int o() {
            return this.B;
        }

        public ContentResolver p() {
            return this.f123860a.getContentResolver();
        }

        @NonNull
        public h q() {
            h hVar = this.f123878s;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public Display r(int i10) {
            if (this.f123874o == null) {
                this.f123874o = m1.a.d(this.f123860a);
            }
            return this.f123874o.a(i10);
        }

        @Nullable
        public h.b s(h hVar) {
            return this.f123880u.i(hVar);
        }

        public MediaSessionCompat.Token t() {
            e eVar = this.G;
            if (eVar != null) {
                return eVar.c();
            }
            MediaSessionCompat mediaSessionCompat = this.I;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.i();
            }
            return null;
        }

        public Context u(String str) {
            if (str.equals("android")) {
                return this.f123860a;
            }
            try {
                return this.f123860a.createPackageContext(str, 4);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Nullable
        public List<g> v() {
            return this.f123869j;
        }

        public h w(String str) {
            for (h hVar : this.f123867h) {
                if (hVar.f123944c.equals(str)) {
                    return hVar;
                }
            }
            return null;
        }

        public i1 x(Context context) {
            int size = this.f123866g.size();
            while (true) {
                size--;
                if (size < 0) {
                    i1 i1Var = new i1(context);
                    this.f123866g.add(new WeakReference<>(i1Var));
                    return i1Var;
                }
                i1 i1Var2 = this.f123866g.get(size).get();
                if (i1Var2 == null) {
                    this.f123866g.remove(size);
                } else if (i1Var2.f123853a == context) {
                    return i1Var2;
                }
            }
        }

        @Nullable
        public k2 y() {
            return this.f123877r;
        }

        public List<h> z() {
            return this.f123867h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        @Nullable
        @k.j0
        nj.t1<Void> onPrepareTransfer(@NonNull h hVar, @NonNull h hVar2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final long f123923k = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1.e f123924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f123925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f123926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h f123927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h f123928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final List<a1.b.d> f123929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WeakReference<d> f123930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public nj.t1<Void> f123931h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f123932i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f123933j = false;

        public f(d dVar, h hVar, @Nullable a1.e eVar, int i10, @Nullable h hVar2, @Nullable Collection<a1.b.d> collection) {
            this.f123930g = new WeakReference<>(dVar);
            this.f123927d = hVar;
            this.f123924a = eVar;
            this.f123925b = i10;
            this.f123926c = dVar.f123880u;
            this.f123928e = hVar2;
            this.f123929f = collection != null ? new ArrayList(collection) : null;
            dVar.f123873n.postDelayed(new j1(this), 15000L);
        }

        public void a() {
            if (this.f123932i || this.f123933j) {
                return;
            }
            this.f123933j = true;
            a1.e eVar = this.f123924a;
            if (eVar != null) {
                eVar.i(0);
                this.f123924a.e();
            }
        }

        @k.j0
        public void b() {
            nj.t1<Void> t1Var;
            i1.f();
            if (this.f123932i || this.f123933j) {
                return;
            }
            d dVar = this.f123930g.get();
            if (dVar == null || dVar.D != this || ((t1Var = this.f123931h) != null && t1Var.isCancelled())) {
                a();
                return;
            }
            this.f123932i = true;
            dVar.D = null;
            e();
            c();
        }

        public final void c() {
            d dVar = this.f123930g.get();
            if (dVar == null) {
                return;
            }
            h hVar = this.f123927d;
            dVar.f123880u = hVar;
            dVar.f123881v = this.f123924a;
            h hVar2 = this.f123928e;
            if (hVar2 == null) {
                dVar.f123873n.c(d.HandlerC1208d.f123898m, new e2.t(this.f123926c, hVar), this.f123925b);
            } else {
                dVar.f123873n.c(d.HandlerC1208d.f123900o, new e2.t(hVar2, hVar), this.f123925b);
            }
            dVar.f123884y.clear();
            dVar.I();
            dVar.b0();
            List<a1.b.d> list = this.f123929f;
            if (list != null) {
                dVar.f123880u.U(list);
            }
        }

        public void d(nj.t1<Void> t1Var) {
            d dVar = this.f123930g.get();
            if (dVar == null || dVar.D != this) {
                Log.w(i1.f123840c, "Router is released. Cancel transfer");
                a();
            } else {
                if (this.f123931h != null) {
                    throw new IllegalStateException("future is already set");
                }
                this.f123931h = t1Var;
                j1 j1Var = new j1(this);
                final d.HandlerC1208d handlerC1208d = dVar.f123873n;
                Objects.requireNonNull(handlerC1208d);
                t1Var.addListener(j1Var, new Executor() { // from class: r7.k1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handlerC1208d.post(runnable);
                    }
                });
            }
        }

        public final void e() {
            d dVar = this.f123930g.get();
            if (dVar != null) {
                h hVar = dVar.f123880u;
                h hVar2 = this.f123926c;
                if (hVar != hVar2) {
                    return;
                }
                dVar.f123873n.c(d.HandlerC1208d.f123899n, hVar2, this.f123925b);
                a1.e eVar = dVar.f123881v;
                if (eVar != null) {
                    eVar.i(this.f123925b);
                    dVar.f123881v.e();
                }
                if (!dVar.f123884y.isEmpty()) {
                    for (a1.e eVar2 : dVar.f123884y.values()) {
                        eVar2.i(this.f123925b);
                        eVar2.e();
                    }
                    dVar.f123884y.clear();
                }
                dVar.f123881v = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1 f123934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<h> f123935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f123936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a1.d f123937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b1 f123938e;

        public g(a1 a1Var) {
            this(a1Var, false);
        }

        public h a(String str) {
            int size = this.f123935b.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123935b.get(i10).f123943b.equals(str)) {
                    return this.f123935b.get(i10);
                }
            }
            return null;
        }

        public int b(String str) {
            int size = this.f123935b.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123935b.get(i10).f123943b.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        @NonNull
        public ComponentName c() {
            return this.f123937d.a();
        }

        @NonNull
        public String d() {
            return this.f123937d.b();
        }

        @NonNull
        @k.j0
        public a1 e() {
            i1.f();
            return this.f123934a;
        }

        @NonNull
        @k.j0
        public List<h> f() {
            i1.f();
            return Collections.unmodifiableList(this.f123935b);
        }

        public boolean g() {
            b1 b1Var = this.f123938e;
            return b1Var != null && b1Var.e();
        }

        public boolean h(b1 b1Var) {
            if (this.f123938e == b1Var) {
                return false;
            }
            this.f123938e = b1Var;
            return true;
        }

        @NonNull
        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + d() + " }";
        }

        public g(a1 a1Var, boolean z10) {
            this.f123935b = new ArrayList();
            this.f123934a = a1Var;
            this.f123937d = a1Var.u();
            this.f123936c = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h {
        public static final int A = 0;
        public static final int B = 1;

        @k.y0({k.y0.a.LIBRARY})
        public static final int C = 0;
        public static final int D = 1;
        public static final int E = 2;

        @k.y0({k.y0.a.LIBRARY})
        public static final int F = 3;
        public static final int G = 4;
        public static final int H = 5;
        public static final int I = 6;
        public static final int J = 7;
        public static final int K = 8;
        public static final int L = 9;
        public static final int M = 10;
        public static final int N = 1000;
        public static final int O = 0;
        public static final int P = 1;

        @k.y0({k.y0.a.LIBRARY})
        public static final int Q = -1;
        public static final int R = 1;
        public static final int S = 2;
        public static final int T = 4;
        public static final String U = "android";

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f123939x = 0;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f123940y = 1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f123941z = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f123942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f123943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f123944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f123945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f123946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f123947f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f123948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f123949h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f123950i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f123952k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f123953l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f123954m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f123955n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f123956o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f123957p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Display f123958q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Bundle f123960s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public IntentSender f123961t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public y0 f123962u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Map<String, a1.b.d> f123964w;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList<IntentFilter> f123951j = new ArrayList<>();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f123959r = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public List<h> f123963v = new ArrayList();

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Retention(RetentionPolicy.SOURCE)
        @k.y0({k.y0.a.LIBRARY})
        public @interface a {
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @k.y0({k.y0.a.LIBRARY})
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a1.b.d f123965a;

            public b(a1.b.d dVar) {
                this.f123965a = dVar;
            }

            @k.y0({k.y0.a.LIBRARY})
            public int a() {
                a1.b.d dVar = this.f123965a;
                if (dVar != null) {
                    return dVar.c();
                }
                return 1;
            }

            @k.y0({k.y0.a.LIBRARY})
            public boolean b() {
                a1.b.d dVar = this.f123965a;
                return dVar != null && dVar.d();
            }

            @k.y0({k.y0.a.LIBRARY})
            public boolean c() {
                a1.b.d dVar = this.f123965a;
                return dVar != null && dVar.e();
            }

            @k.y0({k.y0.a.LIBRARY})
            public boolean d() {
                a1.b.d dVar = this.f123965a;
                return dVar == null || dVar.f();
            }
        }

        public h(g gVar, String str, String str2) {
            this.f123942a = gVar;
            this.f123943b = str;
            this.f123944c = str2;
        }

        public static boolean J(h hVar) {
            return TextUtils.equals(hVar.t().u().b(), "android");
        }

        @k.j0
        public boolean A() {
            i1.f();
            return i1.k().q() == this;
        }

        @k.y0({k.y0.a.LIBRARY})
        public boolean B() {
            if (A() || this.f123954m == 3) {
                return true;
            }
            return J(this) && R(r7.a.f123600a) && !R(r7.a.f123601b);
        }

        public boolean C() {
            return A() && TextUtils.equals(Resources.getSystem().getText(Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android")), this.f123945d);
        }

        public boolean D() {
            return this.f123948g;
        }

        @k.y0({k.y0.a.LIBRARY})
        public boolean E() {
            return m().size() >= 1;
        }

        public final boolean F(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int iCountActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (iCountActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i10 = 0; i10 < iCountActions; i10++) {
                if (!intentFilter.getAction(i10).equals(intentFilter2.getAction(i10))) {
                    return false;
                }
            }
            int iCountCategories = intentFilter.countCategories();
            if (iCountCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i11 = 0; i11 < iCountCategories; i11++) {
                if (!intentFilter.getCategory(i11).equals(intentFilter2.getCategory(i11))) {
                    return false;
                }
            }
            return true;
        }

        public final boolean G(List<IntentFilter> list, List<IntentFilter> list2) {
            if (list == list2) {
                return true;
            }
            if (list != null && list2 != null) {
                ListIterator<IntentFilter> listIterator = list.listIterator();
                ListIterator<IntentFilter> listIterator2 = list2.listIterator();
                while (listIterator.hasNext() && listIterator2.hasNext()) {
                    if (!F(listIterator.next(), listIterator2.next())) {
                        return false;
                    }
                }
                if (!listIterator.hasNext() && !listIterator2.hasNext()) {
                    return true;
                }
            }
            return false;
        }

        public boolean H() {
            return this.f123962u != null && this.f123948g;
        }

        @k.j0
        public boolean I() {
            i1.f();
            return i1.k().A() == this;
        }

        @k.j0
        public boolean K(@NonNull h1 h1Var) {
            if (h1Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            i1.f();
            return h1Var.i(this.f123951j);
        }

        public int L(y0 y0Var) {
            if (this.f123962u != y0Var) {
                return T(y0Var);
            }
            return 0;
        }

        @k.j0
        public void M(int i10) {
            i1.f();
            i1.k().M(this, Math.min(this.f123957p, Math.max(0, i10)));
        }

        @k.j0
        public void N(int i10) {
            i1.f();
            if (i10 != 0) {
                i1.k().N(this, i10);
            }
        }

        @k.j0
        public void O() {
            i1.f();
            i1.k().P(this, 3);
        }

        @k.j0
        public void P(@NonNull Intent intent, @Nullable c cVar) {
            if (intent == null) {
                throw new IllegalArgumentException("intent must not be null");
            }
            i1.f();
            i1.k().R(this, intent, cVar);
        }

        @k.j0
        public boolean Q(@NonNull String str, @NonNull String str2) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("action must not be null");
            }
            i1.f();
            int size = this.f123951j.size();
            for (int i10 = 0; i10 < size; i10++) {
                IntentFilter intentFilter = this.f123951j.get(i10);
                if (intentFilter.hasCategory(str) && intentFilter.hasAction(str2)) {
                    return true;
                }
            }
            return false;
        }

        @k.j0
        public boolean R(@NonNull String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            i1.f();
            int size = this.f123951j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123951j.get(i10).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        @k.j0
        public boolean S(@NonNull Intent intent) {
            if (intent == null) {
                throw new IllegalArgumentException("intent must not be null");
            }
            i1.f();
            ContentResolver contentResolverP = i1.k().p();
            int size = this.f123951j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f123951j.get(i10).match(contentResolverP, intent, true, i1.f123840c) >= 0) {
                    return true;
                }
            }
            return false;
        }

        public int T(y0 y0Var) {
            int i10;
            this.f123962u = y0Var;
            if (y0Var == null) {
                return 0;
            }
            if (e2.s.a(this.f123945d, y0Var.p())) {
                i10 = 0;
            } else {
                this.f123945d = y0Var.p();
                i10 = 1;
            }
            if (!e2.s.a(this.f123946e, y0Var.h())) {
                this.f123946e = y0Var.h();
                i10 = 1;
            }
            if (!e2.s.a(this.f123947f, y0Var.l())) {
                this.f123947f = y0Var.l();
                i10 = 1;
            }
            if (this.f123948g != y0Var.z()) {
                this.f123948g = y0Var.z();
                i10 = 1;
            }
            if (this.f123949h != y0Var.e()) {
                this.f123949h = y0Var.e();
                i10 = 1;
            }
            if (!G(this.f123951j, y0Var.f())) {
                this.f123951j.clear();
                this.f123951j.addAll(y0Var.f());
                i10 = 1;
            }
            if (this.f123952k != y0Var.r()) {
                this.f123952k = y0Var.r();
                i10 = 1;
            }
            if (this.f123953l != y0Var.q()) {
                this.f123953l = y0Var.q();
                i10 = 1;
            }
            if (this.f123954m != y0Var.i()) {
                this.f123954m = y0Var.i();
                i10 = 1;
            }
            int i11 = 3;
            if (this.f123955n != y0Var.v()) {
                this.f123955n = y0Var.v();
                i10 = 3;
            }
            if (this.f123956o != y0Var.u()) {
                this.f123956o = y0Var.u();
                i10 = 3;
            }
            if (this.f123957p != y0Var.w()) {
                this.f123957p = y0Var.w();
            } else {
                i11 = i10;
            }
            if (this.f123959r != y0Var.s()) {
                this.f123959r = y0Var.s();
                this.f123958q = null;
                i11 |= 5;
            }
            if (!e2.s.a(this.f123960s, y0Var.j())) {
                this.f123960s = y0Var.j();
                i11 |= 1;
            }
            if (!e2.s.a(this.f123961t, y0Var.t())) {
                this.f123961t = y0Var.t();
                i11 |= 1;
            }
            if (this.f123950i != y0Var.b()) {
                this.f123950i = y0Var.b();
                i11 |= 5;
            }
            List<String> listK = y0Var.k();
            ArrayList arrayList = new ArrayList();
            boolean z10 = listK.size() != this.f123963v.size();
            if (!listK.isEmpty()) {
                d dVarK = i1.k();
                Iterator<String> it = listK.iterator();
                while (it.hasNext()) {
                    h hVarW = dVarK.w(dVarK.B(s(), it.next()));
                    if (hVarW != null) {
                        arrayList.add(hVarW);
                        if (!z10 && !this.f123963v.contains(hVarW)) {
                            z10 = true;
                        }
                    }
                }
            }
            if (!z10) {
                return i11;
            }
            this.f123963v = arrayList;
            return i11 | 1;
        }

        public void U(Collection<a1.b.d> collection) {
            this.f123963v.clear();
            if (this.f123964w == null) {
                this.f123964w = new f0.a();
            }
            this.f123964w.clear();
            for (a1.b.d dVar : collection) {
                h hVarB = b(dVar);
                if (hVarB != null) {
                    this.f123964w.put(hVarB.f123944c, dVar);
                    if (dVar.c() == 2 || dVar.c() == 3) {
                        this.f123963v.add(hVarB);
                    }
                }
            }
            i1.k().f123873n.b(d.HandlerC1208d.f123895j, this);
        }

        public boolean a() {
            return this.f123950i;
        }

        public h b(a1.b.d dVar) {
            return s().a(dVar.b().m());
        }

        public int c() {
            return this.f123949h;
        }

        @NonNull
        public List<IntentFilter> d() {
            return this.f123951j;
        }

        @Nullable
        public String e() {
            return this.f123946e;
        }

        public String f() {
            return this.f123943b;
        }

        public int g() {
            return this.f123954m;
        }

        @Nullable
        @k.j0
        @k.y0({k.y0.a.LIBRARY})
        public a1.b h() {
            i1.f();
            a1.e eVar = i1.k().f123881v;
            if (eVar instanceof a1.b) {
                return (a1.b) eVar;
            }
            return null;
        }

        @Nullable
        @k.y0({k.y0.a.LIBRARY})
        public b i(@NonNull h hVar) {
            if (hVar == null) {
                throw new NullPointerException("route must not be null");
            }
            Map<String, a1.b.d> map = this.f123964w;
            if (map == null || !map.containsKey(hVar.f123944c)) {
                return null;
            }
            return new b(this.f123964w.get(hVar.f123944c));
        }

        @Nullable
        public Bundle j() {
            return this.f123960s;
        }

        @Nullable
        public Uri k() {
            return this.f123947f;
        }

        @NonNull
        public String l() {
            return this.f123944c;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public List<h> m() {
            return Collections.unmodifiableList(this.f123963v);
        }

        @NonNull
        public String n() {
            return this.f123945d;
        }

        public int o() {
            return this.f123953l;
        }

        public int p() {
            return this.f123952k;
        }

        @Nullable
        @k.j0
        public Display q() {
            i1.f();
            if (this.f123959r >= 0 && this.f123958q == null) {
                this.f123958q = i1.k().r(this.f123959r);
            }
            return this.f123958q;
        }

        @k.y0({k.y0.a.LIBRARY})
        public int r() {
            return this.f123959r;
        }

        @NonNull
        public g s() {
            return this.f123942a;
        }

        @NonNull
        @k.y0({k.y0.a.LIBRARY})
        public a1 t() {
            return this.f123942a.e();
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaRouter.RouteInfo{ uniqueId=");
            sb2.append(this.f123944c);
            sb2.append(", name=");
            sb2.append(this.f123945d);
            sb2.append(", description=");
            sb2.append(this.f123946e);
            sb2.append(", iconUri=");
            sb2.append(this.f123947f);
            sb2.append(", enabled=");
            sb2.append(this.f123948g);
            sb2.append(", connectionState=");
            sb2.append(this.f123949h);
            sb2.append(", canDisconnect=");
            sb2.append(this.f123950i);
            sb2.append(", playbackType=");
            sb2.append(this.f123952k);
            sb2.append(", playbackStream=");
            sb2.append(this.f123953l);
            sb2.append(", deviceType=");
            sb2.append(this.f123954m);
            sb2.append(", volumeHandling=");
            sb2.append(this.f123955n);
            sb2.append(", volume=");
            sb2.append(this.f123956o);
            sb2.append(", volumeMax=");
            sb2.append(this.f123957p);
            sb2.append(", presentationDisplayId=");
            sb2.append(this.f123959r);
            sb2.append(", extras=");
            sb2.append(this.f123960s);
            sb2.append(", settingsIntent=");
            sb2.append(this.f123961t);
            sb2.append(", providerPackageName=");
            sb2.append(this.f123942a.d());
            if (E()) {
                sb2.append(", members=[");
                int size = this.f123963v.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    if (this.f123963v.get(i10) != this) {
                        sb2.append(this.f123963v.get(i10).l());
                    }
                }
                sb2.append(fw.b.f85385l);
            }
            sb2.append(" }");
            return sb2.toString();
        }

        @Nullable
        public IntentSender u() {
            return this.f123961t;
        }

        public int v() {
            return this.f123956o;
        }

        public int w() {
            if (!E() || i1.r()) {
                return this.f123955n;
            }
            return 0;
        }

        public int x() {
            return this.f123957p;
        }

        @k.j0
        public boolean y() {
            i1.f();
            return i1.k().n() == this;
        }

        @Deprecated
        public boolean z() {
            return this.f123949h == 1;
        }
    }

    static {
        Log.isLoggable(f123840c, 3);
    }

    public i1(Context context) {
        this.f123853a = context;
    }

    public static void f() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static int j() {
        if (f123846i == null) {
            return 0;
        }
        return k().o();
    }

    public static d k() {
        d dVar = f123846i;
        if (dVar == null) {
            return null;
        }
        dVar.j();
        return f123846i;
    }

    @NonNull
    @k.j0
    public static i1 l(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        f();
        if (f123846i == null) {
            f123846i = new d(context.getApplicationContext());
        }
        return f123846i.x(context);
    }

    @k.y0({k.y0.a.LIBRARY})
    public static boolean r() {
        if (f123846i == null) {
            return false;
        }
        return k().C();
    }

    @k.y0({k.y0.a.LIBRARY})
    public static boolean s() {
        if (f123846i == null) {
            return false;
        }
        return k().D();
    }

    public static boolean u() {
        d dVarK = k();
        return dVarK != null && dVarK.H();
    }

    @k.y0({k.y0.a.LIBRARY_GROUP})
    public static void z() {
        d dVar = f123846i;
        if (dVar == null) {
            return;
        }
        dVar.O();
        f123846i = null;
    }

    @k.j0
    public void A(@NonNull h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        f();
        k().P(hVar, 3);
    }

    @k.j0
    public void B(@Nullable Object obj) {
        f();
        k().S(obj);
    }

    @k.j0
    public void C(@Nullable MediaSessionCompat mediaSessionCompat) {
        f();
        k().T(mediaSessionCompat);
    }

    @k.j0
    public void D(@Nullable e eVar) {
        f();
        k().C = eVar;
    }

    @k.j0
    public void E(@Nullable t2 t2Var) {
        f();
        k().V(t2Var);
    }

    @k.j0
    public void F(@Nullable k2 k2Var) {
        f();
        k().W(k2Var);
    }

    @k.j0
    @k.y0({k.y0.a.LIBRARY})
    public void G(@NonNull h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        f();
        k().Y(hVar);
    }

    @k.j0
    public void H(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        f();
        d dVarK = k();
        h hVarI = dVarK.i();
        if (dVarK.A() != hVarI) {
            dVarK.P(hVarI, i10);
        }
    }

    @NonNull
    @k.j0
    public h I(@NonNull h1 h1Var) {
        if (h1Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        f();
        d dVarK = k();
        h hVarA = dVarK.A();
        if (hVarA.B() || hVarA.K(h1Var)) {
            return hVarA;
        }
        h hVarI = dVarK.i();
        dVarK.P(hVarI, 3);
        return hVarI;
    }

    @k.j0
    public void a(@NonNull h1 h1Var, @NonNull a aVar) {
        b(h1Var, aVar, 0);
    }

    @k.j0
    public void b(@NonNull h1 h1Var, @NonNull a aVar, int i10) {
        b bVar;
        boolean z10;
        if (h1Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        f();
        int iG = g(aVar);
        if (iG < 0) {
            bVar = new b(this, aVar);
            this.f123854b.add(bVar);
        } else {
            bVar = this.f123854b.get(iG);
        }
        boolean z11 = true;
        if (i10 != bVar.f123858d) {
            bVar.f123858d = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        bVar.f123859e = jElapsedRealtime;
        if (bVar.f123857c.b(h1Var)) {
            z11 = z10;
        } else {
            bVar.f123857c = new h1.a(bVar.f123857c).c(h1Var).d();
        }
        if (z11) {
            k().Z();
        }
    }

    @k.j0
    @k.y0({k.y0.a.LIBRARY})
    public void c(@NonNull h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        f();
        k().e(hVar);
    }

    @k.j0
    public void d(@NonNull a1 a1Var) {
        if (a1Var == null) {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        f();
        k().c(a1Var);
    }

    @k.j0
    @Deprecated
    public void e(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        f();
        k().g(obj);
    }

    public final int g(a aVar) {
        int size = this.f123854b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f123854b.get(i10).f123856b == aVar) {
                return i10;
            }
        }
        return -1;
    }

    @Nullable
    @k.j0
    public h h() {
        f();
        d dVarK = k();
        if (dVarK == null) {
            return null;
        }
        return dVarK.n();
    }

    @NonNull
    @k.j0
    public h i() {
        f();
        return k().q();
    }

    @Nullable
    public MediaSessionCompat.Token m() {
        d dVar = f123846i;
        if (dVar == null) {
            return null;
        }
        return dVar.t();
    }

    @NonNull
    @k.j0
    public List<g> n() {
        f();
        d dVarK = k();
        return dVarK == null ? Collections.EMPTY_LIST : dVarK.v();
    }

    @Nullable
    @k.j0
    public k2 o() {
        f();
        d dVarK = k();
        if (dVarK == null) {
            return null;
        }
        return dVarK.y();
    }

    @NonNull
    @k.j0
    public List<h> p() {
        f();
        d dVarK = k();
        return dVarK == null ? Collections.EMPTY_LIST : dVarK.z();
    }

    @NonNull
    @k.j0
    public h q() {
        f();
        return k().A();
    }

    @k.j0
    public boolean t(@NonNull h1 h1Var, int i10) {
        if (h1Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        f();
        return k().E(h1Var, i10);
    }

    @k.j0
    public void v(@NonNull a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        f();
        int iG = g(aVar);
        if (iG >= 0) {
            this.f123854b.remove(iG);
            k().Z();
        }
    }

    @k.j0
    @k.y0({k.y0.a.LIBRARY})
    public void w(@NonNull h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        f();
        k().K(hVar);
    }

    @k.j0
    public void x(@NonNull a1 a1Var) {
        if (a1Var == null) {
            throw new IllegalArgumentException("providerInstance must not be null");
        }
        f();
        k().b(a1Var);
    }

    @k.j0
    public void y(@NonNull Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("remoteControlClient must not be null");
        }
        f();
        k().L(obj);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c {
        public void b(@Nullable Bundle bundle) {
        }

        public void a(@Nullable String str, @Nullable Bundle bundle) {
        }
    }
}
