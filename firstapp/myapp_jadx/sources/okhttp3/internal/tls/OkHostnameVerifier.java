package okhttp3.internal.tls;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPlugSeon;
import defpackage.efe0;
import defpackage.gb5;
import defpackage.gvf;
import defpackage.kb5;
import defpackage.m2g;
import defpackage.pe4;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._HostnamesCommonKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", "host", "Ljavax/net/ssl/SSLSession;", JsPlugSeon.KEY_SESSION, "", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.g(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return m2g.a;
        }
    }

    public static boolean b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            kb5.a(pe4.b(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            gb5.a(str.length(), efe0.a(length2, "endIndex > string.length: ", " > "));
            return false;
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        certificate.getClass();
        return CollectionsKt.i0(a(certificate, 2), a(certificate, 7));
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    public final boolean verify(String host, X509Certificate certificate) {
        boolean zEquals;
        int length;
        host.getClass();
        certificate.getClass();
        if (_HostnamesCommonKt.canParseAsIpAddress(host)) {
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(host);
            List listA = a(certificate, 7);
            if (listA == null || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.g(canonicalHost, _HostnamesCommonKt.toCanonicalHost((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale locale = Locale.US;
            host = gvf.a(locale, host, locale);
        }
        List<String> listA2 = a(certificate, 2);
        if (listA2 == null || !listA2.isEmpty()) {
            for (String strA : listA2) {
                INSTANCE.getClass();
                if (host.length() == 0 || c.u(host, ".", false) || c.k(host, "..", false) || strA == null || strA.length() == 0 || c.u(strA, ".", false) || c.k(strA, "..", false)) {
                    zEquals = false;
                } else {
                    String strConcat = !c.k(host, ".", false) ? host.concat(".") : host;
                    if (!c.k(strA, ".", false)) {
                        strA = strA.concat(".");
                    }
                    if (b(strA)) {
                        Locale locale2 = Locale.US;
                        strA = gvf.a(locale2, strA, locale2);
                    }
                    if (!StringsKt.M(strA, "*", false)) {
                        zEquals = strConcat.equals(strA);
                    } else if (!c.u(strA, "*.", false) || StringsKt.S(strA, '*', 1, 4) != -1 || strConcat.length() < strA.length() || "*.".equals(strA)) {
                        zEquals = false;
                    } else {
                        String strSubstring = strA.substring(1);
                        if (c.k(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || StringsKt.W(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        host.getClass();
        session.getClass();
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                certificate.getClass();
                return verify(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
