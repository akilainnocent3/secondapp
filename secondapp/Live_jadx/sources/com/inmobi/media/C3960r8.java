package com.inmobi.media;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3960r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f57531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f57532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57535e;

    public C3960r8(ArrayList omidTrackers, Map macros, String customReferenceData, String str, boolean z10) {
        kotlin.jvm.internal.m0.p(omidTrackers, "omidTrackers");
        kotlin.jvm.internal.m0.p(macros, "macros");
        kotlin.jvm.internal.m0.p(customReferenceData, "customReferenceData");
        this.f57531a = omidTrackers;
        this.f57532b = macros;
        this.f57533c = customReferenceData;
        this.f57534d = str;
        this.f57535e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3960r8)) {
            return false;
        }
        C3960r8 c3960r8 = (C3960r8) obj;
        return kotlin.jvm.internal.m0.g(this.f57531a, c3960r8.f57531a) && kotlin.jvm.internal.m0.g(this.f57532b, c3960r8.f57532b) && kotlin.jvm.internal.m0.g(this.f57533c, c3960r8.f57533c) && kotlin.jvm.internal.m0.g(this.f57534d, c3960r8.f57534d) && this.f57535e == c3960r8.f57535e;
    }

    public final int hashCode() {
        int iHashCode = (this.f57533c.hashCode() + ((this.f57532b.hashCode() + (this.f57531a.hashCode() * 31)) * 31)) * 31;
        String str = this.f57534d;
        return g8.a.a(this.f57535e) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HybridOmidInfo(omidTrackers=" + this.f57531a + ", macros=" + this.f57532b + ", customReferenceData=" + this.f57533c + ", contentUrl=" + this.f57534d + ", isolateVerificationScripts=" + this.f57535e + gi.j.f86771d;
    }
}
