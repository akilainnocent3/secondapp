package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f39586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39587c;

    public jb(String str, Boolean bool, String str2) {
        this.f39585a = str;
        this.f39586b = bool;
        this.f39587c = str2;
    }

    public final String a() {
        return this.f39585a;
    }

    public final String b() {
        return this.f39587c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return kotlin.jvm.internal.m0.g(this.f39585a, jbVar.f39585a) && kotlin.jvm.internal.m0.g(this.f39586b, jbVar.f39586b) && kotlin.jvm.internal.m0.g(this.f39587c, jbVar.f39587c);
    }

    public int hashCode() {
        String str = this.f39585a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f39586b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f39587c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "JavaScriptResource(apiFramework=" + this.f39585a + ", browserOptional=" + this.f39586b + ", uri=" + this.f39587c + gi.j.f86771d;
    }
}
