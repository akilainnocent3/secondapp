package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f65665a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65666b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65667c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f65668d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f65669e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Handler f65670f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f65671g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f65690b.c();
        }
    };

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    public void b(a aVar) {
        this.f65665a.add(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f65667c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f65667c == 0) {
            this.f65670f.postDelayed(this.f65671g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.f65667c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f65667c == 1) {
            if (!this.f65668d) {
                this.f65670f.removeCallbacks(this.f65671g);
            } else {
                a("916003", "");
                this.f65668d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f65666b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f65666b == 1 && this.f65669e) {
            this.f65669e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.f65666b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    private void b() {
        if (this.f65666b == 0 && this.f65668d) {
            a("916004", "");
            this.f65669e = true;
        }
    }

    public void a(a aVar) {
        this.f65665a.add(aVar);
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<a> it = this.f65665a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.a(StatisticData.ERROR_CODE_NOT_FOUND), str2);
        bVar.a(map);
        a(bVar);
    }

    private void a() {
        if (this.f65667c == 0) {
            this.f65668d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
