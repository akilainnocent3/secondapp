package com.sports.live.football.tv.adsData;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.r0;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.sports.live.football.tv.MyApp;
import cv.k0;
import java.util.Date;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;
import wn.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nAppOpenManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppOpenManager.kt\ncom/sports/live/football/tv/adsData/AppOpenManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class AppOpenManager implements Application.ActivityLifecycleCallbacks, i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m
    public MyApp f73542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public a f73543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m
    public Activity f73544d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a();
    }

    public AppOpenManager(@m MyApp myApp) {
        this.f73542b = myApp;
        if (myApp != null) {
            myApp.registerActivityLifecycleCallbacks(this);
        }
        this.f73543c = new a();
        r0.f13421j.a().getLifecycle().addObserver(this);
    }

    public final void a() {
        Activity activity;
        Activity activity2 = this.f73544d;
        if (k0.c2(activity2 != null ? activity2.getLocalClassName() : null, "ui.app.activities.HomeScreen", true) || c.f143444a || (activity = this.f73544d) == null) {
            return;
        }
        this.f73543c.h(activity);
    }

    @Override // androidx.lifecycle.i
    public void b(@l b0 b0Var) {
        h.c(this, b0Var);
    }

    @Override // androidx.lifecycle.i
    public void c(@l b0 b0Var) {
        h.a(this, b0Var);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@l Activity p10, @m Bundle bundle) {
        m0.p(p10, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@l Activity p10) {
        m0.p(p10, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@l Activity p10) {
        m0.p(p10, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@l Activity p10) {
        m0.p(p10, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l Activity p10, @l Bundle p11) {
        m0.p(p10, "p0");
        m0.p(p11, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@l Activity p10) {
        m0.p(p10, "p0");
        if (this.f73543c.e()) {
            return;
        }
        this.f73544d = p10;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@l Activity p10) {
        m0.p(p10, "p0");
    }

    @Override // androidx.lifecycle.i
    public void onDestroy(@l b0 b0Var) {
        h.b(this, b0Var);
    }

    @Override // androidx.lifecycle.i
    public void onResume(@l b0 owner) {
        m0.p(owner, "owner");
        a();
    }

    @Override // androidx.lifecycle.i
    public void onStart(@l b0 b0Var) {
        h.e(this, b0Var);
    }

    @Override // androidx.lifecycle.i
    public void onStop(@l b0 b0Var) {
        h.f(this, b0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @m
        public AppOpenAd f73545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f73546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f73547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f73548d;

        /* JADX INFO: renamed from: com.sports.live.football.tv.adsData.AppOpenManager$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0724a extends AppOpenAd.AppOpenAdLoadCallback {
            public C0724a() {
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(AppOpenAd ad2) {
                m0.p(ad2, "ad");
                a.this.f73545a = ad2;
                a.this.f73546b = false;
                a.this.f73548d = new Date().getTime();
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                m0.p(loadAdError, "loadAdError");
                a.this.f73546b = false;
            }
        }

        public a() {
        }

        public final boolean d() {
            return this.f73545a != null && j();
        }

        public final boolean e() {
            return this.f73547c;
        }

        public final void f(@l Context context) {
            m0.p(context, "context");
            if (this.f73546b || d()) {
                return;
            }
            this.f73546b = true;
            AdRequest adRequestBuild = new AdRequest.Builder().build();
            m0.o(adRequestBuild, "build(...)");
            AppOpenAd.load(context, "ca-app-pub-6644875304680514/4716405714", adRequestBuild, new C0724a());
        }

        public final void g(boolean z10) {
            this.f73547c = z10;
        }

        public final void h(@l Activity activity) {
            m0.p(activity, "activity");
            i(activity, new b());
        }

        public final void i(@l Activity activity, @l b onShowAdCompleteListener) {
            m0.p(activity, "activity");
            m0.p(onShowAdCompleteListener, "onShowAdCompleteListener");
            if (this.f73547c) {
                return;
            }
            if (!d()) {
                onShowAdCompleteListener.a();
                f(activity);
                return;
            }
            AppOpenAd appOpenAd = this.f73545a;
            m0.m(appOpenAd);
            appOpenAd.setFullScreenContentCallback(new c(onShowAdCompleteListener, activity));
            this.f73547c = true;
            AppOpenAd appOpenAd2 = this.f73545a;
            m0.m(appOpenAd2);
            appOpenAd2.show(activity);
        }

        public final boolean j() {
            return new Date().getTime() - this.f73548d < ((long) 4) * 3600000;
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class b implements b {
            @Override // com.sports.live.football.tv.adsData.AppOpenManager.b
            public void a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends FullScreenContentCallback {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f73552c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Activity f73553d;

            public c(b bVar, Activity activity) {
                this.f73552c = bVar;
                this.f73553d = activity;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                a.this.f73545a = null;
                a.this.g(false);
                this.f73552c.a();
                a.this.f(this.f73553d);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                m0.p(adError, "adError");
                a.this.f73545a = null;
                a.this.g(false);
                this.f73552c.a();
                a.this.f(this.f73553d);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
            }
        }
    }
}
