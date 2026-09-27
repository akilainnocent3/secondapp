package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f157835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f157836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f157837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f157838e;

    public xf0(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.f157834a = str;
        this.f157835b = str2;
        this.f157836c = str3;
        this.f157837d = arrayList;
        this.f157838e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0)) {
            return false;
        }
        xf0 xf0Var = (xf0) obj;
        return kotlin.jvm.internal.m0.g(this.f157834a, xf0Var.f157834a) && kotlin.jvm.internal.m0.g(this.f157835b, xf0Var.f157835b) && kotlin.jvm.internal.m0.g(this.f157836c, xf0Var.f157836c) && kotlin.jvm.internal.m0.g(this.f157837d, xf0Var.f157837d) && kotlin.jvm.internal.m0.g(this.f157838e, xf0Var.f157838e);
    }

    public final int hashCode() {
        int iA = k4.a(this.f157836c, k4.a(this.f157835b, this.f157834a.hashCode() * 31, 31), 31);
        List list = this.f157837d;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f157838e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "Design(type=" + this.f157834a + ", target=" + this.f157835b + ", layout=" + this.f157836c + ", images=" + this.f157837d + ", analyticsParameters=" + this.f157838e + gi.j.f86771d;
    }
}
