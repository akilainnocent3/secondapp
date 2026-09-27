package zw;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final C1598a f162687c = new C1598a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f162688d = 9;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final e f162689b;

    /* JADX INFO: renamed from: zw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1598a {
        public /* synthetic */ C1598a(x xVar) {
            this();
        }

        public C1598a() {
        }
    }

    public a(@l e trustRootIndex) {
        m0.p(trustRootIndex, "trustRootIndex");
        this.f162689b = trustRootIndex;
    }

    @Override // zw.c
    @l
    public List<Certificate> a(@l List<? extends Certificate> chain, @l String hostname) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        m0.p(chain, "chain");
        m0.p(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        m0.o(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            m0.n(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f162689b.findByIssuerAndSignature(x509Certificate2);
            if (x509CertificateFindByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !m0.g(x509Certificate2, x509CertificateFindByIssuerAndSignature)) {
                    arrayList.add(x509CertificateFindByIssuerAndSignature);
                }
                if (b(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature, arrayList.size() - 2)) {
                    return arrayList;
                }
                z10 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                m0.o(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        if (!z10) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    m0.n(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    x509Certificate = (X509Certificate) next;
                } while (!b(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i10) {
        if (!m0.g(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i10) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(@m Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && m0.g(((a) obj).f162689b, this.f162689b);
    }

    public int hashCode() {
        return this.f162689b.hashCode();
    }
}
