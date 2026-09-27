package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f26890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26892d;

    public f0(String str, Map map, Map map2, String str2) {
        this.f26889a = str;
        this.f26890b = map;
        this.f26891c = map2;
        this.f26892d = str2;
    }

    public boolean a(Object obj) {
        return obj instanceof f0;
    }

    public String b() {
        return this.f26889a;
    }

    public Map c() {
        return this.f26891c;
    }

    public Map d() {
        return this.f26890b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!f0Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = f0Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        Map mapD = d();
        Map mapD2 = f0Var.d();
        if (mapD != null ? !mapD.equals(mapD2) : mapD2 != null) {
            return false;
        }
        Map mapC = c();
        Map mapC2 = f0Var.c();
        if (mapC != null ? !mapC.equals(mapC2) : mapC2 != null) {
            return false;
        }
        String strA = a();
        String strA2 = f0Var.a();
        return strA != null ? strA.equals(strA2) : strA2 == null;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        Map mapD = d();
        int iHashCode2 = ((iHashCode + 59) * 59) + (mapD == null ? 43 : mapD.hashCode());
        Map mapC = c();
        int iHashCode3 = (iHashCode2 * 59) + (mapC == null ? 43 : mapC.hashCode());
        String strA = a();
        return (iHashCode3 * 59) + (strA != null ? strA.hashCode() : 43);
    }

    public String toString() {
        return "AxonEventModel(eventName=" + b() + ", parameters=" + d() + ", options=" + c() + ", errorMessage=" + a() + gi.j.f86771d;
    }

    public String a() {
        return this.f26892d;
    }
}
