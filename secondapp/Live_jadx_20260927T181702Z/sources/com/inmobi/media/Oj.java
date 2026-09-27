package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dr.i0 f55282a = dr.k0.b(new ds.a() { // from class: com.inmobi.media.yt
        @Override // ds.a
        public final Object invoke() {
            return Oj.a();
        }
    });

    public static final void a(Runnable runnable) {
        kotlin.jvm.internal.m0.p(runnable, "runnable");
        ((Handler) f55282a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
