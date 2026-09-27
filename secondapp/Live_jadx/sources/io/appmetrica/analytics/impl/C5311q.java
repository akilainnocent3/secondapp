package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5311q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f98158a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC5286p enumC5286p) {
        if (activity != null && this.f98158a.get(activity) == enumC5286p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f98158a.put(activity, enumC5286p);
        return true;
    }
}
