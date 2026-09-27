package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f44404b;

    public i(Context context, Context context2) {
        h hVar = new h(this);
        this.f44403a = context2;
        if (context instanceof Activity) {
            this.f44404b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.f44404b);
        return context != null ? context : this.f44403a;
    }
}
