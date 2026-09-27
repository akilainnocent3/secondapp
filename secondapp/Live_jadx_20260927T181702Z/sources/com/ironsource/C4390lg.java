package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4390lg implements InterfaceC4201b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4226cd f62274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f62275b;

    public C4390lg(@oy.l C4226cd folderRootUrl, @oy.l String version) {
        kotlin.jvm.internal.m0.p(folderRootUrl, "folderRootUrl");
        kotlin.jvm.internal.m0.p(version, "version");
        this.f62274a = folderRootUrl;
        this.f62275b = version;
    }

    @oy.l
    public final String a() {
        return this.f62275b;
    }

    @Override // com.ironsource.InterfaceC4201b6
    @oy.l
    public String value() {
        return this.f62274a.a() + "/versions/" + this.f62275b + "/mobileController.html";
    }
}
