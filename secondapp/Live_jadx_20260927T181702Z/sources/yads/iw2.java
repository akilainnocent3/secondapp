package yads;

import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class iw2 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final iw2 f150847b = new iw2();

    public iw2() {
        super(0);
    }

    @Override // ds.a
    public final Object invoke() {
        X509TrustManager x509TrustManagerA = b93.a(null);
        if (x509TrustManagerA != null) {
            return x509TrustManagerA;
        }
        throw new IllegalArgumentException("Failed to create default TrustManager");
    }
}
