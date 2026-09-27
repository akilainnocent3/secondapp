package yads;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nu2 implements o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f153207b;

    public nu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.f153206a = str;
        this.f153207b = sSLSocketFactory;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new ku2(this.f153206a, 8000, 8000, false, new t11(), this.f153207b);
    }
}
