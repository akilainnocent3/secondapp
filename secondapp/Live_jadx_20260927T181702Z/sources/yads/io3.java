package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class io3 implements go3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr.i0 f150761a = dr.k0.b(ho3.f150212b);

    public final boolean a(Context context, SslError sslError) {
        Object obj = dw2.f148384j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && nt2VarA.f153196y) {
            X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : bs2.a(sslError.getCertificate(), (CertificateFactory) this.f150761a.getValue());
            if (x509Certificate == null) {
                return false;
            }
            try {
                cf1.a(new lt2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
                return true;
            } catch (Exception unused) {
                boolean z10 = ad1.f146762a;
            }
        }
        return false;
    }
}
