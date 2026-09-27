package com.applovin.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f28366a = new a("Age Restricted User", b5.f26585r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f28367b = new a("Has User Consent", b5.f26584q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f28368c = new a("\"Do Not Sell\"", b5.f26586s);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b5 f28370b;

        public a(String str, b5 b5Var) {
            this.f28369a = str;
            this.f28370b = b5Var;
        }

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) c5.a(this.f28370b, (Object) null, context);
            }
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to get value for key: " + this.f28370b);
            return null;
        }

        public String a() {
            return this.f28369a;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f28368c;
    }

    public static a b() {
        return f28367b;
    }

    public static a c() {
        return f28366a;
    }

    public static boolean a(boolean z10, Context context) {
        return a(b5.f26586s, Boolean.valueOf(z10), context);
    }

    public static boolean b(boolean z10, Context context) {
        return a(b5.f26584q, Boolean.valueOf(z10), context);
    }

    public static String a(Context context) {
        return a(f28367b, context) + a(f28368c, context);
    }

    private static boolean a(b5 b5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to update compliance value for key: " + b5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) c5.a(b5Var, (Object) null, context);
            c5.b(b5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th2) {
            com.applovin.impl.sdk.p.c("ComplianceManager", "Unable to update compliance", th2);
            com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
            if (lVar != null) {
                lVar.E().a("ComplianceManager", "updateCompliance", th2);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return IOUtils.LINE_SEPARATOR_UNIX + aVar.f28369a + " - " + aVar.a(context);
    }
}
