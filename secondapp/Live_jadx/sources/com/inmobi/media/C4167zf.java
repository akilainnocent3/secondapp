package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4167zf extends C4066ve {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f58264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4167zf(String vendor, String str, String url) {
        super(url, "OMID_VIEWABILITY");
        kotlin.jvm.internal.m0.p(vendor, "vendor");
        kotlin.jvm.internal.m0.p(url, "url");
        this.f58263c = vendor;
        this.f58264d = str;
    }
}
