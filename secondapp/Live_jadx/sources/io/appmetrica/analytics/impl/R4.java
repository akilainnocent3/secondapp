package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96408b;

    public R4(String str, String str2) {
        this.f96407a = str;
        this.f96408b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f96408b);
    }

    @Nullable
    public final String b() {
        return this.f96408b;
    }

    public final String c() {
        return this.f96407a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f96407a + lk.e.f104695m + ApiKeyUtils.createPartialApiKey(this.f96408b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            R4 r10 = (R4) obj;
            String str = this.f96407a;
            if (str == null ? r10.f96407a != null : !str.equals(r10.f96407a)) {
                return false;
            }
            String str2 = this.f96408b;
            String str3 = r10.f96408b;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f96407a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96408b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f96407a + lk.e.f104695m + this.f96408b;
    }
}
