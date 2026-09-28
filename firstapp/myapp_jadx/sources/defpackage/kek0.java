package defpackage;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class kek0 {
    public static X509Certificate a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArrA = idk0.a(str);
        if (bArrA.length != 0) {
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArrA));
                if (certificateGenerateCertificate instanceof X509Certificate) {
                    return (X509Certificate) certificateGenerateCertificate;
                }
            } catch (CertificateException e) {
                gek0.b.a("X509CertUtil", "Failed to get cert: " + e.getMessage());
            }
        }
        return null;
    }

    public static boolean b(X509Certificate x509Certificate, String str, String str2) {
        String strSubstring;
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        String name = x509Certificate.getSubjectDN().getName();
        int iIndexOf = name.toUpperCase(Locale.getDefault()).indexOf(str.concat("="));
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int iIndexOf2 = name.indexOf(",", iIndexOf);
            int length = str.length() + iIndexOf + 1;
            strSubstring = iIndexOf2 != -1 ? name.substring(length, iIndexOf2) : name.substring(length);
        }
        return str2.equals(strSubstring);
    }
}
