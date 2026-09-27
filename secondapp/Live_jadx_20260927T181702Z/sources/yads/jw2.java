package yads;

import android.util.Log;
import com.yandex.mobile.ads.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u20 f151289a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyStore f151291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X509TrustManager f151292d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dr.i0 f151290b = dr.k0.b(iw2.f150847b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f151293e = new Object();

    public jw2(u20 u20Var) {
        this.f151289a = u20Var;
    }

    public final void a(X509Certificate[] x509CertificateArr, String str) {
        dr.w2 w2Var;
        try {
            ((X509TrustManager) this.f151290b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e10) {
            synchronized (this.f151293e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f151292d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        w2Var = dr.w2.f79517a;
                    } else {
                        w2Var = null;
                    }
                    if (w2Var != null) {
                        dr.w2 w2Var2 = dr.w2.f79517a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void b() {
        if (!Thread.holdsLock(this.f151293e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        KeyStore keyStore;
        X509Certificate x509Certificate;
        b();
        b();
        if (this.f151291c == null) {
            dr.i0 i0Var = b93.f147125a;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                lt2 lt2Var = (lt2) this.f151289a;
                lt2Var.getClass();
                try {
                    InputStream inputStreamOpenRawResource = lt2Var.f152125b.getResources().openRawResource(R.raw.monetization_ads_sdkinternalca);
                    try {
                        byte[] bArrP = xr.b.p(inputStreamOpenRawResource);
                        xr.c.a(inputStreamOpenRawResource, null);
                        try {
                            InputStream inputStreamOpenRawResource2 = lt2Var.f147307a.getResources().openRawResource(R.raw.monetization_ads_bundled_cert);
                            try {
                                byte[] bArrP2 = xr.b.p(inputStreamOpenRawResource2);
                                xr.c.a(inputStreamOpenRawResource2, null);
                                byte[][] bArr = (byte[][]) fr.q.y3(new byte[][]{bArrP2}, new byte[][]{bArrP});
                                ArrayList arrayList = new ArrayList();
                                for (byte[] bArr2 : bArr) {
                                    dr.i0 i0Var2 = b93.f147125a;
                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        CertificateFactory certificateFactory = (CertificateFactory) i0Var2.getValue();
                                        x509Certificate = (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
                                    } catch (CertificateException unused3) {
                                        x509Certificate = null;
                                    }
                                    if (x509Certificate != null) {
                                        arrayList.add(x509Certificate);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a(keyStore, (X509Certificate) it.next());
                                }
                                keyStore2 = keyStore;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    xr.c.a(inputStreamOpenRawResource2, th2);
                                    throw th3;
                                }
                            }
                        } catch (IOException e10) {
                            throw new IllegalStateException("Failed to create cert", e10);
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            xr.c.a(inputStreamOpenRawResource, th4);
                            throw th5;
                        }
                    }
                } catch (IOException e11) {
                    throw new IllegalStateException("Failed to create cert", e11);
                }
            }
            this.f151291c = keyStore2;
        }
        b();
        if (this.f151292d == null) {
            b();
            if (this.f151291c != null) {
                b();
                this.f151292d = b93.a(this.f151291c);
            }
        }
    }

    public static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e10) {
            Log.w("SdkTrustManager", "Failed to store certificate", e10);
        }
    }
}
