package ww;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n37#2:77\n36#2,3:78\n1#3:81\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n44#1:77\n44#1:78,3\n*E\n"})
public final class b extends zw.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f143934d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final X509TrustManager f143935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final X509TrustManagerExtensions f143936c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @kw.c
        @m
        public final b a(@oy.l X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            m0.p(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public a() {
        }
    }

    public b(@oy.l X509TrustManager trustManager, @oy.l X509TrustManagerExtensions x509TrustManagerExtensions) {
        m0.p(trustManager, "trustManager");
        m0.p(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f143935b = trustManager;
        this.f143936c = x509TrustManagerExtensions;
    }

    @Override // zw.c
    @oy.l
    @kw.c
    public List<Certificate> a(@oy.l List<? extends Certificate> chain, @oy.l String hostname) throws SSLPeerUnverifiedException {
        m0.p(chain, "chain");
        m0.p(hostname, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f143936c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            m0.o(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(@m Object obj) {
        return (obj instanceof b) && ((b) obj).f143935b == this.f143935b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f143935b);
    }
}
