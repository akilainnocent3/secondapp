package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40731c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40733b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final r3 a(String content) {
            Object next;
            Object next2;
            kotlin.jvm.internal.m0.p(content, "content");
            try {
                List<String> listE4 = cv.p0.e4(content);
                Iterator<T> it = listE4.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!cv.k0.J2((String) next, "url=", false, 2, null));
                String str = (String) next;
                Iterator<T> it2 = listE4.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!cv.k0.J2((String) next2, "expiry=", false, 2, null));
                String str2 = (String) next2;
                if (str != null && str2 != null) {
                    String strSubstring = str.substring(4);
                    kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
                    String strSubstring2 = str2.substring(7);
                    kotlin.jvm.internal.m0.o(strSubstring2, "substring(...)");
                    Long lR1 = cv.j0.r1(strSubstring2);
                    if (lR1 != null) {
                        return new r3(strSubstring, lR1.longValue());
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public r3(String originalUrl, long j10) {
        kotlin.jvm.internal.m0.p(originalUrl, "originalUrl");
        this.f40732a = originalUrl;
        this.f40733b = j10;
    }

    public final long a() {
        return this.f40733b;
    }

    public final String b() {
        return this.f40732a;
    }

    public final String c() {
        return "url=" + this.f40732a + "\nexpiry=" + this.f40733b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return kotlin.jvm.internal.m0.g(this.f40732a, r3Var.f40732a) && this.f40733b == r3Var.f40733b;
    }

    public int hashCode() {
        return (this.f40732a.hashCode() * 31) + f0.p.a(this.f40733b);
    }

    public String toString() {
        return "CacheMetadata(originalUrl=" + this.f40732a + ", expiryTimestampMillis=" + this.f40733b + gi.j.f86771d;
    }
}
