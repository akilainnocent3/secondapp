package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4378l4 implements InterfaceC4607y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f62259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f62260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f62261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private final C4226cd f62262d;

    public C4378l4() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC4607y7
    @oy.l
    public String a() {
        return this.f62259a;
    }

    @Override // com.ironsource.InterfaceC4607y7
    public boolean b() {
        return this.f62261c;
    }

    @Override // com.ironsource.InterfaceC4607y7
    @oy.l
    public C4226cd c() {
        return this.f62262d;
    }

    @Override // com.ironsource.InterfaceC4607y7
    @oy.l
    public String d() {
        return this.f62260b;
    }

    public C4378l4(@oy.l String controllerUrl, @oy.l String cacheFolder, boolean z10, @oy.l C4226cd rootFolder) {
        kotlin.jvm.internal.m0.p(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.m0.p(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.m0.p(rootFolder, "rootFolder");
        this.f62259a = controllerUrl;
        this.f62260b = cacheFolder;
        this.f62261c = z10;
        this.f62262d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4378l4(String str, String str2, boolean z10, C4226cd c4226cd, int i10, kotlin.jvm.internal.x xVar) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new C4226cd(str) : c4226cd);
    }
}
