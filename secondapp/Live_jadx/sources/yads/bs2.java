package yads;

import android.net.http.SslCertificate;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class bs2 {
    public static final X509Certificate a(SslCertificate sslCertificate, CertificateFactory certificateFactory) {
        byte[] byteArray;
        if (!kotlin.jvm.internal.m0.g(certificateFactory.getType(), AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509)) {
            certificateFactory.getType();
            boolean z10 = ad1.f146762a;
            return null;
        }
        Bundle bundleSaveState = SslCertificate.saveState(sslCertificate);
        if (bundleSaveState != null && (byteArray = bundleSaveState.getByteArray("x509-certificate")) != null) {
            try {
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                if (certificateGenerateCertificate instanceof X509Certificate) {
                    return (X509Certificate) certificateGenerateCertificate;
                }
                return null;
            } catch (CertificateException unused) {
                boolean z11 = ad1.f146762a;
            }
        }
        return null;
    }
}
