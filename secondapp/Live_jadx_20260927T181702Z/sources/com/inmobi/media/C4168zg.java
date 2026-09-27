package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.zg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4168zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ea f58265a;

    public C4168zg(Context context, String sharePrefFile) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(sharePrefFile, "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f54559b;
        this.f58265a = Da.a(context, sharePrefFile);
    }

    public final String a(String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        Ea ea2 = this.f58265a;
        ea2.getClass();
        kotlin.jvm.internal.m0.p(key, "key");
        return ea2.f54560a.getString(key, null);
    }
}
