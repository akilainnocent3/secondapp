package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3594ci f54670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f54671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f54672c;

    public Fn(GestureDetectorOnGestureListenerC3594ci container) {
        kotlin.jvm.internal.m0.p(container, "container");
        this.f54670a = container;
        this.f54672c = container.getAdConfig();
    }

    public void a() {
        WeakReference weakReference = this.f54671b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.f54671b;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public abstract View c();

    public abstract void d();
}
