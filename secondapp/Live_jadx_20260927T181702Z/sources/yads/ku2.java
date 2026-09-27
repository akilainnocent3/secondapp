package yads;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ku2 extends td0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SSLSocketFactory f151716s;

    public ku2(String str, int i10, int i11, boolean z10, t11 t11Var, SSLSocketFactory sSLSocketFactory) {
        super(str, i10, i11, z10, t11Var);
        this.f151716s = sSLSocketFactory;
    }

    @Override // yads.td0
    public final HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        SSLSocketFactory sSLSocketFactory = this.f151716s;
        if (sSLSocketFactory != null && (httpURLConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnection;
    }
}
