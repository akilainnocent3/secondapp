package yads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dr.i0 f147125a = dr.k0.b(a93.f146707b);

    public static final X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) fr.r0.L2(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
