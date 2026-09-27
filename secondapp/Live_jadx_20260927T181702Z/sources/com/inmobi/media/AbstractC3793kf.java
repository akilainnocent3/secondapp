package com.inmobi.media;

import android.content.Context;
import com.iab.omid.library.inmobi.Omid;

/* JADX INFO: renamed from: com.inmobi.media.kf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3793kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56820a = 0;

    static {
        kotlin.jvm.internal.m0.o(AbstractC3793kf.class.getSimpleName(), "getSimpleName(...)");
    }

    public static boolean a(Context applicationContext) {
        kotlin.jvm.internal.m0.p(applicationContext, "applicationContext");
        try {
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            return Omid.isActive();
        } catch (Throwable th2) {
            th2.getStackTrace();
            return false;
        }
    }
}
