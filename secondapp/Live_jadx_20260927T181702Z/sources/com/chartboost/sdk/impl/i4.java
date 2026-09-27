package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum i4 {
    CLICK_PREFERENCE_EMBEDDED(0),
    CLICK_PREFERENCE_NATIVE(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39250b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sr.a f39249g = sr.c.c(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39245c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final i4 a(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? i4.CLICK_PREFERENCE_EMBEDDED : i4.CLICK_PREFERENCE_NATIVE;
            }
            return i4.CLICK_PREFERENCE_EMBEDDED;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    i4(int i10) {
        this.f39250b = i10;
    }

    public final int b() {
        return this.f39250b;
    }
}
