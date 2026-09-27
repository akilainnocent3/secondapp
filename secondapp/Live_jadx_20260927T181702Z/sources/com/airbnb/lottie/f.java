package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f24987a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24988b = "LOTTIE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f24989c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f24990d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f24991e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static db.f f24993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static db.e f24994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile db.h f24995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile db.g f24996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static ThreadLocal<gb.i> f24997k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f24992f = a.AUTOMATIC;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static xa.c f24998l = new xa.d();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f24989c) {
            g().a(str);
        }
    }

    public static float c(String str) {
        if (f24989c) {
            return g().b(str);
        }
        return 0.0f;
    }

    public static a d() {
        return f24992f;
    }

    public static boolean e() {
        return f24991e;
    }

    public static xa.c f() {
        return f24998l;
    }

    public static gb.i g() {
        gb.i iVar = f24997k.get();
        if (iVar != null) {
            return iVar;
        }
        gb.i iVar2 = new gb.i();
        f24997k.set(iVar2);
        return iVar2;
    }

    public static boolean h() {
        return f24989c;
    }

    @Nullable
    public static db.g i(@NonNull Context context) {
        db.g gVar;
        if (!f24990d) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        db.g gVar2 = f24996j;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (db.g.class) {
            try {
                gVar = f24996j;
                if (gVar == null) {
                    db.e eVar = f24994h;
                    if (eVar == null) {
                        eVar = new db.e() { // from class: com.airbnb.lottie.e
                            @Override // db.e
                            public final File a() {
                                return f.a(applicationContext);
                            }
                        };
                    }
                    gVar = new db.g(eVar);
                    f24996j = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    public static db.h j(@NonNull Context context) {
        db.h hVar;
        db.h hVar2 = f24995i;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (db.h.class) {
            try {
                hVar = f24995i;
                if (hVar == null) {
                    db.g gVarI = i(context);
                    db.f bVar = f24993g;
                    if (bVar == null) {
                        bVar = new db.b();
                    }
                    hVar = new db.h(gVarI, bVar);
                    f24995i = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static void k(db.e eVar) {
        db.e eVar2 = f24994h;
        if (eVar2 == null && eVar == null) {
            return;
        }
        if (eVar2 == null || !eVar2.equals(eVar)) {
            f24994h = eVar;
            f24996j = null;
        }
    }

    public static void l(a aVar) {
        f24992f = aVar;
    }

    public static void m(boolean z10) {
        f24991e = z10;
    }

    public static void n(db.f fVar) {
        db.f fVar2 = f24993g;
        if (fVar2 == null && fVar == null) {
            return;
        }
        if (fVar2 == null || !fVar2.equals(fVar)) {
            f24993g = fVar;
            f24995i = null;
        }
    }

    public static void o(boolean z10) {
        f24990d = z10;
    }

    public static void p(xa.c cVar) {
        f24998l = cVar;
    }

    public static void q(boolean z10) {
        if (f24989c == z10) {
            return;
        }
        f24989c = z10;
        if (z10 && f24997k == null) {
            f24997k = new ThreadLocal<>();
        }
    }
}
