package zw;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f162691a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        @l
        public final c a(@l X509TrustManager trustManager) {
            m0.p(trustManager, "trustManager");
            return okhttp3.internal.platform.d.f119157a.e().f(trustManager);
        }

        @l
        public final c b(@l X509Certificate... caCerts) {
            m0.p(caCerts, "caCerts");
            return new zw.a(new b((X509Certificate[]) Arrays.copyOf(caCerts, caCerts.length)));
        }

        public a() {
        }
    }

    @l
    public abstract List<Certificate> a(@l List<? extends Certificate> list, @l String str) throws SSLPeerUnverifiedException;
}
