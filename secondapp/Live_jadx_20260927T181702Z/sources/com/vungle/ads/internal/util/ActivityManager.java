package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import dr.i1;
import dr.j1;
import dr.w2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import k.h1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {

    @l
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;

    @m
    private volatile TargetActivityInfo targetActivityInfo;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final ActivityManager instance = new ActivityManager();

    @l
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @l
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public final void addLifecycleListener(@l LifeCycleCallback listener) {
            m0.p(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(@l Context context) {
            m0.p(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        @l
        public final ActivityManager getInstance$vungle_ads_release() {
            return ActivityManager.instance;
        }

        public final void init(@l Context context) {
            m0.p(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(@l LifeCycleCallback listener) {
            m0.p(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(@l Context context, @m Intent intent, @m Intent intent2, @m PresenterAdOpenCallback presenterAdOpenCallback) {
            m0.p(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, intent, intent2, presenterAdOpenCallback);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new TargetActivityInfo(new WeakReference(context), intent, intent2, presenterAdOpenCallback);
            return false;
        }

        private Companion() {
        }

        @h1
        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class TargetActivityInfo {

        @m
        private final PresenterAdOpenCallback adOpenCallback;

        @l
        private final WeakReference<Context> context;

        @m
        private final Intent deepLinkOverrideIntent;

        @m
        private final Intent defaultIntent;

        public TargetActivityInfo(@l WeakReference<Context> context, @m Intent intent, @m Intent intent2, @m PresenterAdOpenCallback presenterAdOpenCallback) {
            m0.p(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = presenterAdOpenCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TargetActivityInfo copy$default(TargetActivityInfo targetActivityInfo, WeakReference weakReference, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = targetActivityInfo.context;
            }
            if ((i10 & 2) != 0) {
                intent = targetActivityInfo.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = targetActivityInfo.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                presenterAdOpenCallback = targetActivityInfo.adOpenCallback;
            }
            return targetActivityInfo.copy(weakReference, intent, intent2, presenterAdOpenCallback);
        }

        @l
        public final WeakReference<Context> component1() {
            return this.context;
        }

        @m
        public final Intent component2() {
            return this.deepLinkOverrideIntent;
        }

        @m
        public final Intent component3() {
            return this.defaultIntent;
        }

        @m
        public final PresenterAdOpenCallback component4() {
            return this.adOpenCallback;
        }

        @l
        public final TargetActivityInfo copy(@l WeakReference<Context> context, @m Intent intent, @m Intent intent2, @m PresenterAdOpenCallback presenterAdOpenCallback) {
            m0.p(context, "context");
            return new TargetActivityInfo(context, intent, intent2, presenterAdOpenCallback);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TargetActivityInfo)) {
                return false;
            }
            TargetActivityInfo targetActivityInfo = (TargetActivityInfo) obj;
            return m0.g(this.context, targetActivityInfo.context) && m0.g(this.deepLinkOverrideIntent, targetActivityInfo.deepLinkOverrideIntent) && m0.g(this.defaultIntent, targetActivityInfo.defaultIntent) && m0.g(this.adOpenCallback, targetActivityInfo.adOpenCallback);
        }

        @m
        public final PresenterAdOpenCallback getAdOpenCallback() {
            return this.adOpenCallback;
        }

        @l
        public final WeakReference<Context> getContext() {
            return this.context;
        }

        @m
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        @m
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            PresenterAdOpenCallback presenterAdOpenCallback = this.adOpenCallback;
            return iHashCode3 + (presenterAdOpenCallback != null ? presenterAdOpenCallback.hashCode() : 0);
        }

        @l
        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.add(lifeCycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        m0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objB;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            i1.a aVar = i1.f79460c;
            Context applicationContext = context.getApplicationContext();
            m0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objB = i1.b(w2.f79517a);
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            objB = i1.b(j1.a(th2));
        }
        Throwable thE = i1.e(objB);
        if (thE != null) {
            Logger.Companion.e(TAG, "Error initializing ActivityManager", thE);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
        try {
            if (intent == null) {
                if (intent2 != null) {
                    context.startActivity(intent2);
                }
                return false;
            }
            context.startActivity(intent);
            if (presenterAdOpenCallback != null) {
                presenterAdOpenCallback.onDeeplinkClick(true);
            }
            return true;
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "Failed to start activity: " + e10);
            if (intent != null && presenterAdOpenCallback != null) {
                try {
                    presenterAdOpenCallback.onDeeplinkClick(false);
                    if (intent != null) {
                        context.startActivity(intent2);
                        return true;
                    }
                } catch (Exception unused) {
                }
            } else if (intent != null && intent2 != null) {
                context.startActivity(intent2);
                return true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@l Activity activity, @m Bundle bundle) {
        m0.p(activity, "activity");
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l Activity activity, @l Bundle outState) {
        m0.p(activity, "activity");
        m0.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@l Activity activity) {
        m0.p(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        TargetActivityInfo targetActivityInfo = this.targetActivityInfo;
        if (targetActivityInfo != null) {
            Context it = targetActivityInfo.getContext().get();
            if (it != null) {
                Companion companion = Companion;
                m0.o(it, "it");
                companion.startWhenForeground(it, targetActivityInfo.getDeepLinkOverrideIntent(), targetActivityInfo.getDefaultIntent(), targetActivityInfo.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((LifeCycleCallback) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@l Activity activity) {
        m0.p(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((LifeCycleCallback) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(@l LifeCycleCallback callback) {
        m0.p(callback, "callback");
        this.callbacks.remove(callback);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class LifeCycleCallback {
        public void onBackground() {
        }

        public void onForeground() {
        }
    }
}
