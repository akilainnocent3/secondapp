package wc;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f142802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f142803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f142804e;

    public u() {
        this("", "", "", "", "");
    }

    @oy.l
    public final String a() {
        return this.f142801b;
    }

    @oy.l
    public final String b() {
        return this.f142802c;
    }

    @oy.l
    public final String c() {
        return this.f142800a;
    }

    @oy.l
    public final String d() {
        return this.f142804e;
    }

    @oy.l
    public final String e() {
        return this.f142803d;
    }

    public /* synthetic */ u(String str, String str2, String str3, String str4, String str5, int i10, kotlin.jvm.internal.x xVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }

    public u(@oy.l String headline, @oy.l String adText, @oy.l String destinationURL, @oy.l String imageURL, @oy.l String iconURL) {
        m0.p(headline, "headline");
        m0.p(adText, "adText");
        m0.p(destinationURL, "destinationURL");
        m0.p(imageURL, "imageURL");
        m0.p(iconURL, "iconURL");
        this.f142800a = headline;
        this.f142801b = adText;
        this.f142802c = destinationURL;
        this.f142803d = imageURL;
        this.f142804e = iconURL;
    }
}
