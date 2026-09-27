package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f96361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f96363e;

    public Q3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f96359a = str;
        this.f96360b = str2;
        this.f96361c = num;
        this.f96362d = str3;
        this.f96363e = counterConfigurationReporterType;
    }

    public static Q3 a(I3 i10) {
        return new Q3(i10.f95926b.getApiKey(), i10.f95925a.f95694a.getAsString("PROCESS_CFG_PACKAGE_NAME"), i10.f95925a.f95694a.getAsInteger("PROCESS_CFG_PROCESS_ID"), i10.f95925a.f95694a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), i10.f95926b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q3.class == obj.getClass()) {
            Q3 q10 = (Q3) obj;
            String str = this.f96359a;
            if (str == null ? q10.f96359a != null : !str.equals(q10.f96359a)) {
                return false;
            }
            if (!this.f96360b.equals(q10.f96360b)) {
                return false;
            }
            Integer num = this.f96361c;
            if (num == null ? q10.f96361c != null : !num.equals(q10.f96361c)) {
                return false;
            }
            String str2 = this.f96362d;
            if (str2 == null ? q10.f96362d != null : !str2.equals(q10.f96362d)) {
                return false;
            }
            if (this.f96363e == q10.f96363e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f96359a;
        int iHashCode = (this.f96360b.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        Integer num = this.f96361c;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f96362d;
        return this.f96363e.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f96359a + "', mPackageName='" + this.f96360b + "', mProcessID=" + this.f96361c + ", mProcessSessionID='" + this.f96362d + "', mReporterType=" + this.f96363e + fw.b.f85383j;
    }
}
