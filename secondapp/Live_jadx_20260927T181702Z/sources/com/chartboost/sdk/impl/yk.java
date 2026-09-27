package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class yk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f41679e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f41681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41683d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f41686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f41687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f41688e;

        public a(String javascriptResourceUrl) {
            kotlin.jvm.internal.m0.p(javascriptResourceUrl, "javascriptResourceUrl");
            this.f41684a = javascriptResourceUrl;
            this.f41685b = CampaignEx.KEY_OMID;
        }

        public final a a(String str) {
            this.f41685b = str;
            return this;
        }

        public final String b() {
            return this.f41685b;
        }

        public final String c() {
            return this.f41684a;
        }

        public final String d() {
            return this.f41686c;
        }

        public final String e() {
            return this.f41688e;
        }

        public final String f() {
            return this.f41687d;
        }

        public final yk a() {
            try {
                return new yk(this);
            } catch (Exception unused) {
                return null;
            }
        }

        public final a b(String str) {
            this.f41686c = str;
            return this;
        }

        public final a c(String str) {
            this.f41687d = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public b() {
        }

        public final yk a(s0 adVerification) {
            String strB;
            kotlin.jvm.internal.m0.p(adVerification, "adVerification");
            jb jbVarA = adVerification.a();
            if (jbVarA == null || (strB = jbVarA.b()) == null) {
                return null;
            }
            a aVar = new a(strB);
            String strA = jbVarA.a();
            if (strA == null) {
                strA = "";
            }
            a aVarA = aVar.a(strA);
            String strB2 = adVerification.b();
            aVarA.b(strB2 != null ? strB2 : "").c(adVerification.c());
            return aVar.a();
        }

        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final Set a(List adVerifications) {
            kotlin.jvm.internal.m0.p(adVerifications, "adVerifications");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = adVerifications.iterator();
            while (it.hasNext()) {
                yk ykVarA = yk.f41679e.a((s0) it.next());
                if (ykVarA != null) {
                    linkedHashSet.add(ykVarA);
                }
            }
            return linkedHashSet;
        }
    }

    public yk(a builder) {
        kotlin.jvm.internal.m0.p(builder, "builder");
        if (!cv.k0.c2(CampaignEx.KEY_OMID, builder.b(), true) || TextUtils.isEmpty(builder.c())) {
            throw new InvalidParameterException("ViewabilityVendor cannot be created.");
        }
        this.f41680a = builder.d();
        this.f41681b = new URL(builder.c());
        this.f41682c = builder.f();
        this.f41683d = builder.e();
    }

    public final URL a() {
        return this.f41681b;
    }

    public final String b() {
        return this.f41680a;
    }

    public final String c() {
        return this.f41682c;
    }
}
