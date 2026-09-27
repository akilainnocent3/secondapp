package com.chartboost.sdk.impl;

import com.chartboost.sdk.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class nc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40135c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f40136d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug f40137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg f40138b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public nc(ug sharedPrefsHelper, dg resourcesLoader) {
        kotlin.jvm.internal.m0.p(sharedPrefsHelper, "sharedPrefsHelper");
        kotlin.jvm.internal.m0.p(resourcesLoader, "resourcesLoader");
        this.f40137a = sharedPrefsHelper;
        this.f40138b = resourcesLoader;
    }

    public final String a() {
        String strA = a(R.raw.omsdk_v1, "com.chartboost.sdk.omidjs");
        return strA == null ? "" : strA;
    }

    public final String a(String str, int i10) {
        try {
            String strA = this.f40138b.a(i10);
            if (strA == null) {
                return null;
            }
            this.f40137a.a(str, strA);
            return strA;
        } catch (Exception e10) {
            sb.b("OmidJS resource file exception", e10);
            return null;
        }
    }

    public final String a(int i10, String str) {
        try {
            if (f40136d) {
                f40136d = false;
                return a(str, i10);
            }
            String strA = this.f40137a.a(str);
            return strA == null ? a(str, i10) : strA;
        } catch (Exception e10) {
            sb.b("OmidJS exception", e10);
            return null;
        }
    }
}
