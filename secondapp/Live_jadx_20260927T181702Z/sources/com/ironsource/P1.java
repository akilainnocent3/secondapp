package com.ironsource;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f59747a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @cs.o
        public final void a() {
            if (kotlin.jvm.internal.m0.g(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        private a() {
        }
    }

    @cs.o
    public static final void a() {
        f59747a.a();
    }
}
