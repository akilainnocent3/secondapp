package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4230d implements InterfaceC4201b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4226cd f61249a;

    public C4230d(@oy.l C4226cd folderRootUrl) {
        kotlin.jvm.internal.m0.p(folderRootUrl, "folderRootUrl");
        this.f61249a = folderRootUrl;
    }

    @Override // com.ironsource.InterfaceC4201b6
    @oy.l
    public String value() {
        return this.f61249a.a() + "/abTestMap.json";
    }
}
