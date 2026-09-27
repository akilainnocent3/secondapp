package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4226cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String f61221a;

    public C4226cd(@oy.l String baseControllerUrl) {
        kotlin.jvm.internal.m0.p(baseControllerUrl, "baseControllerUrl");
        this.f61221a = baseControllerUrl;
    }

    @oy.l
    public final String a() {
        String str = this.f61221a;
        String strSubstring = str.substring(0, cv.p0.Y3(str, to.c.userBaseDel, 0, false, 6, null));
        kotlin.jvm.internal.m0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
