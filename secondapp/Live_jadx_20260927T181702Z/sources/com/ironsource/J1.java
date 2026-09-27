package com.ironsource;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Map<String, String> f59290a;

    /* JADX WARN: Multi-variable type inference failed */
    public J1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @oy.l
    public final Map<String, String> a() {
        return this.f59290a;
    }

    @oy.l
    public final Map<String, String> b() {
        return this.f59290a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && kotlin.jvm.internal.m0.g(this.f59290a, ((J1) obj).f59290a);
    }

    public int hashCode() {
        return this.f59290a.hashCode();
    }

    @oy.l
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f59290a + gi.j.f86771d;
    }

    public J1(@oy.l Map<String, String> mediationTypes) {
        kotlin.jvm.internal.m0.p(mediationTypes, "mediationTypes");
        this.f59290a = mediationTypes;
    }

    @oy.l
    public final J1 a(@oy.l Map<String, String> mediationTypes) {
        kotlin.jvm.internal.m0.p(mediationTypes, "mediationTypes");
        return new J1(mediationTypes);
    }

    public /* synthetic */ J1(Map map, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? fr.n1.z() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J1 a(J1 j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = j10.f59290a;
        }
        return j10.a(map);
    }
}
