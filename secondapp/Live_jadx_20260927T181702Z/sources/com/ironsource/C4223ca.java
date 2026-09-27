package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4223ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C4223ca f61196a = new C4223ca();

    private C4223ca() {
    }

    @cs.o
    public static final <T> T a(@oy.m T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    @cs.k
    @cs.o
    public static final boolean a(@oy.m Object obj) {
        return a(obj, null, false, 6, null);
    }

    @cs.k
    @cs.o
    public static final boolean a(@oy.m Object obj, @oy.l String errorMessage) {
        kotlin.jvm.internal.m0.p(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }

    @cs.k
    @cs.o
    public static final boolean a(@oy.m Object obj, @oy.l String errorMessage, boolean z10) {
        kotlin.jvm.internal.m0.p(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(errorMessage);
        }
        if (!z10) {
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new dr.o0();
    }
}
