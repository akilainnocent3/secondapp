package com.mbridge.msdk.mbsignalcommon.windvane;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", sc.c.f129748e),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f68240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f68241b;

    d(String str, String str2) {
        this.f68240a = str;
        this.f68241b = str2;
    }

    public String g() {
        return this.f68241b;
    }

    public String h() {
        return this.f68240a;
    }
}
