package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yj f39863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f39865e;

    public lb(String str, List trackingEvents, yj yjVar, List mediaFiles, List icons) {
        kotlin.jvm.internal.m0.p(trackingEvents, "trackingEvents");
        kotlin.jvm.internal.m0.p(mediaFiles, "mediaFiles");
        kotlin.jvm.internal.m0.p(icons, "icons");
        this.f39861a = str;
        this.f39862b = trackingEvents;
        this.f39863c = yjVar;
        this.f39864d = mediaFiles;
        this.f39865e = icons;
    }

    public final List a() {
        return this.f39864d;
    }

    public final List b() {
        return this.f39862b;
    }

    public final yj c() {
        return this.f39863c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return kotlin.jvm.internal.m0.g(this.f39861a, lbVar.f39861a) && kotlin.jvm.internal.m0.g(this.f39862b, lbVar.f39862b) && kotlin.jvm.internal.m0.g(this.f39863c, lbVar.f39863c) && kotlin.jvm.internal.m0.g(this.f39864d, lbVar.f39864d) && kotlin.jvm.internal.m0.g(this.f39865e, lbVar.f39865e);
    }

    public int hashCode() {
        String str = this.f39861a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f39862b.hashCode()) * 31;
        yj yjVar = this.f39863c;
        return ((((iHashCode + (yjVar != null ? yjVar.hashCode() : 0)) * 31) + this.f39864d.hashCode()) * 31) + this.f39865e.hashCode();
    }

    public String toString() {
        return "Linear(duration=" + this.f39861a + ", trackingEvents=" + this.f39862b + ", videoClicks=" + this.f39863c + ", mediaFiles=" + this.f39864d + ", icons=" + this.f39865e + gi.j.f86771d;
    }
}
