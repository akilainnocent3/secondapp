package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdf;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Objects;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class lel0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ nfl0 a;

    public lel0(nfl0 nfl0Var) {
        this.a = nfl0Var;
    }

    public final void a(zzdf zzdfVar, Bundle bundle) {
        Uri uri;
        k8l0 k8l0Var = this.a.a;
        try {
            try {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.n.a("onActivityCreated");
                Intent intent = zzdfVar.c;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        k8l0.k(k8l0Var.i);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : StompClient.DEFAULT_ACK;
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        p7l0 p7l0Var = k8l0Var.g;
                        k8l0.m(p7l0Var);
                        p7l0Var.p(new jel0(this, z, uri, str, queryParameter));
                    }
                }
            } catch (RuntimeException e) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.b(e, "Throwable caught in onActivityCreated");
            }
        } finally {
            khl0 khl0Var = k8l0Var.l;
            k8l0.l(khl0Var);
            khl0Var.o(zzdfVar, bundle);
        }
    }

    public final void b(zzdf zzdfVar) {
        khl0 khl0Var = this.a.a.l;
        k8l0.l(khl0Var);
        synchronized (khl0Var.l) {
            try {
                if (Objects.equals(khl0Var.g, zzdfVar)) {
                    khl0Var.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (khl0Var.a.d.u()) {
            khl0Var.f.remove(Integer.valueOf(zzdfVar.a));
        }
    }

    public final void c(zzdf zzdfVar) {
        k8l0 k8l0Var = this.a.a;
        khl0 khl0Var = k8l0Var.l;
        k8l0.l(khl0Var);
        synchronized (khl0Var.l) {
            khl0Var.k = false;
            khl0Var.h = true;
        }
        k8l0 k8l0Var2 = khl0Var.a;
        k8l0Var2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k8l0Var2.d.u()) {
            igl0 igl0VarL = khl0Var.l(zzdfVar);
            khl0Var.d = khl0Var.c;
            khl0Var.c = null;
            p7l0 p7l0Var = k8l0Var2.g;
            k8l0.m(p7l0Var);
            p7l0Var.p(new sgl0(khl0Var, igl0VarL, jElapsedRealtime));
        } else {
            khl0Var.c = null;
            p7l0 p7l0Var2 = k8l0Var2.g;
            k8l0.m(p7l0Var2);
            p7l0Var2.p(new qgl0(khl0Var, jElapsedRealtime));
        }
        wll0 wll0Var = k8l0Var.h;
        k8l0.l(wll0Var);
        k8l0 k8l0Var3 = wll0Var.a;
        k8l0Var3.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p7l0 p7l0Var3 = k8l0Var3.g;
        k8l0.m(p7l0Var3);
        p7l0Var3.p(new dll0(wll0Var, jElapsedRealtime2));
    }

    public final void d(zzdf zzdfVar) {
        k8l0 k8l0Var = this.a.a;
        wll0 wll0Var = k8l0Var.h;
        k8l0.l(wll0Var);
        k8l0 k8l0Var2 = wll0Var.a;
        k8l0Var2.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p7l0 p7l0Var = k8l0Var2.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new bll0(wll0Var, jElapsedRealtime));
        khl0 khl0Var = k8l0Var.l;
        k8l0.l(khl0Var);
        Object obj = khl0Var.l;
        synchronized (obj) {
            khl0Var.k = true;
            if (!Objects.equals(zzdfVar, khl0Var.g)) {
                synchronized (obj) {
                    khl0Var.g = zzdfVar;
                    khl0Var.h = false;
                    k8l0 k8l0Var3 = khl0Var.a;
                    if (k8l0Var3.d.u()) {
                        khl0Var.i = null;
                        p7l0 p7l0Var2 = k8l0Var3.g;
                        k8l0.m(p7l0Var2);
                        p7l0Var2.p(new ihl0(khl0Var));
                    }
                }
            }
        }
        k8l0 k8l0Var4 = khl0Var.a;
        if (!k8l0Var4.d.u()) {
            khl0Var.c = khl0Var.i;
            p7l0 p7l0Var3 = k8l0Var4.g;
            k8l0.m(p7l0Var3);
            p7l0Var3.p(new ogl0(khl0Var));
            return;
        }
        khl0Var.p(zzdfVar.b, khl0Var.l(zzdfVar), false);
        hwk0 hwk0Var = khl0Var.a.n;
        k8l0.j(hwk0Var);
        k8l0 k8l0Var5 = hwk0Var.a;
        k8l0Var5.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p7l0 p7l0Var4 = k8l0Var5.g;
        k8l0.m(p7l0Var4);
        p7l0Var4.p(new quk0(hwk0Var, jElapsedRealtime2));
    }

    public final void e(zzdf zzdfVar, Bundle bundle) {
        igl0 igl0Var;
        khl0 khl0Var = this.a.a.l;
        k8l0.l(khl0Var);
        if (!khl0Var.a.d.u() || bundle == null || (igl0Var = (igl0) khl0Var.f.get(Integer.valueOf(zzdfVar.a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(AnalyticsParam.EVENT_PARAM_ID, igl0Var.c);
        bundle2.putString("name", igl0Var.a);
        bundle2.putString("referrer_name", igl0Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(zzdf.G0(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(zzdf.G0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(zzdf.G0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(zzdf.G0(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(zzdf.G0(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
