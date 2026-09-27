package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class LevelPlayActivityLifecycleProvider extends ContentProvider {

    @l
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private static WeakReference<Activity> f62282a = new WeakReference<>(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@l Activity activity, @m Bundle bundle) {
            m0.p(activity, "activity");
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f62282a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@l Activity activity) {
            m0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@l Activity activity) {
            m0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@l Activity activity) {
            m0.p(activity, "activity");
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f62282a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@l Activity activity, @l Bundle outState) {
            m0.p(activity, "activity");
            m0.p(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@l Activity activity) {
            m0.p(activity, "activity");
            a aVar = LevelPlayActivityLifecycleProvider.Companion;
            LevelPlayActivityLifecycleProvider.f62282a = new WeakReference(activity);
            ContextProvider.getInstance().updateActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@l Activity activity) {
            m0.p(activity, "activity");
        }
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new b());
    }

    @Override // android.content.ContentProvider
    public int delete(@l Uri uri, @m String str, @m String[] strArr) {
        m0.p(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @m
    public String getType(@l Uri uri) {
        m0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @m
    public Uri insert(@l Uri uri, @m ContentValues contentValues) {
        m0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() == null) {
            IronLog.INTERNAL.verbose("context is null");
            return true;
        }
        if (!(getContext() instanceof Application)) {
            IronLog.INTERNAL.verbose("context is not application");
            return true;
        }
        Context context = getContext();
        m0.n(context, "null cannot be cast to non-null type android.app.Application");
        a((Application) context);
        return true;
    }

    @Override // android.content.ContentProvider
    @m
    public Cursor query(@l Uri uri, @m String[] strArr, @m String str, @m String[] strArr2, @m String str2) {
        m0.p(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@l Uri uri, @m ContentValues contentValues, @m String str, @m String[] strArr) {
        m0.p(uri, "uri");
        return 0;
    }
}
