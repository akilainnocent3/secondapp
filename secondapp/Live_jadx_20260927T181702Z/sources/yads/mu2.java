package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mu2 implements a5.r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f152692b;

    public mu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f152691a = str;
        this.f152692b = sSLSocketFactory;
    }

    @Override // a5.r.a
    public final a5.r createDataSource() {
        return new ju2(this.f152691a, 8000, 8000, false, new a5.k0.g(), this.f152692b);
    }
}
