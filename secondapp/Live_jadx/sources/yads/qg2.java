package yads;

import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qg2 {
    public static final String[] a(SSLSocketFactory sSLSocketFactory) {
        int i10 = rg2.f154956b;
        String[] defaultCipherSuites = sSLSocketFactory.getDefaultCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(defaultCipherSuites, defaultCipherSuites.length)));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final String[] b(SSLSocketFactory sSLSocketFactory) {
        int i10 = rg2.f154956b;
        String[] supportedCipherSuites = sSLSocketFactory.getSupportedCipherSuites();
        ArrayList arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(supportedCipherSuites, supportedCipherSuites.length)));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
