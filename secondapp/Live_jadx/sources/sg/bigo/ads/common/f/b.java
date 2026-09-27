package sg.bigo.ads.common.f;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f132919a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f132920b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f132921c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Application f132922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<Activity> f132923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<a, Object> f132924f;

    public interface a {
        void a(Activity activity);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.b$b, reason: collision with other inner class name */
    public static class C1344b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f132943a = new b(0);
    }

    private b() {
        this.f132924f = new WeakHashMap();
    }

    public static Application a() {
        return f132922d;
    }

    @Nullable
    public static Activity b() {
        WeakReference<Activity> weakReference = C1344b.f132943a.f132923e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static int c() {
        int i10;
        if (!f132919a || (i10 = f132921c) < 0) {
            return 0;
        }
        return i10 > 0 ? 1 : 2;
    }

    public static boolean d() {
        return f132921c > 0;
    }

    public static boolean e() {
        return f132920b > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull final Activity activity, @Nullable Bundle bundle) {
        f132920b++;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f132924f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull final Activity activity) {
        f132920b--;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f132924f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(activity);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull final Activity activity) {
        this.f132923e = null;
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f132924f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull final Activity activity) {
        this.f132923e = new WeakReference<>(activity);
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = b.this.f132924f.entrySet().iterator();
                while (it.hasNext()) {
                    final a aVar = (a) ((Map.Entry) it.next()).getKey();
                    if (aVar != null) {
                        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        if (f132921c == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            aVarA.b();
            if (aVarA.f132918d != null && aVarA.c()) {
                aVarA.f132918d.a(aVarA.f132916b, aVarA.f132917c);
            }
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter foreground.");
        }
        f132921c++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        int i10 = f132921c - 1;
        f132921c = i10;
        if (i10 == 0) {
            sg.bigo.ads.common.f.a aVarA = sg.bigo.ads.common.f.a.a();
            if (aVarA.f132918d != null && aVarA.c()) {
                sg.bigo.ads.common.f.a.InterfaceC1343a interfaceC1343a = aVarA.f132918d;
                boolean z10 = aVarA.f132915a;
                long j10 = aVarA.f132916b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = aVarA.f132917c;
                System.currentTimeMillis();
                interfaceC1343a.a(z10, j10, jElapsedRealtime, j11);
            }
            aVarA.f132915a = false;
            sg.bigo.ads.common.t.a.a(0, 3, "LAM", "On enter background.");
        }
    }

    public /* synthetic */ b(byte b10) {
        this();
    }

    public static void b(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.2
            @Override // java.lang.Runnable
            public final void run() {
                C1344b.f132943a.f132924f.remove(aVar);
            }
        });
    }

    public static synchronized void a(@NonNull Application application) {
        if (f132919a) {
            return;
        }
        f132919a = true;
        f132920b = 0;
        f132921c = 0;
        f132922d = application;
        application.registerActivityLifecycleCallbacks(C1344b.f132943a);
    }

    public static void a(final a aVar) {
        d.b(new Runnable() { // from class: sg.bigo.ads.common.f.b.1
            @Override // java.lang.Runnable
            public final void run() {
                C1344b.f132943a.f132924f.put(aVar, C1344b.f132943a);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
