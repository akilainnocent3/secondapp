package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f41769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41770d;

    public zk(String str, List viewableUrls, List notViewableUrls, List viewUndeterminedUrls) {
        kotlin.jvm.internal.m0.p(viewableUrls, "viewableUrls");
        kotlin.jvm.internal.m0.p(notViewableUrls, "notViewableUrls");
        kotlin.jvm.internal.m0.p(viewUndeterminedUrls, "viewUndeterminedUrls");
        this.f41767a = str;
        this.f41768b = viewableUrls;
        this.f41769c = notViewableUrls;
        this.f41770d = viewUndeterminedUrls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return kotlin.jvm.internal.m0.g(this.f41767a, zkVar.f41767a) && kotlin.jvm.internal.m0.g(this.f41768b, zkVar.f41768b) && kotlin.jvm.internal.m0.g(this.f41769c, zkVar.f41769c) && kotlin.jvm.internal.m0.g(this.f41770d, zkVar.f41770d);
    }

    public int hashCode() {
        String str = this.f41767a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f41768b.hashCode()) * 31) + this.f41769c.hashCode()) * 31) + this.f41770d.hashCode();
    }

    public String toString() {
        return "ViewableImpression(id=" + this.f41767a + ", viewableUrls=" + this.f41768b + ", notViewableUrls=" + this.f41769c + ", viewUndeterminedUrls=" + this.f41770d + gi.j.f86771d;
    }
}
