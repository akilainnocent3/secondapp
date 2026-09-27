package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfwl {

    @k.h1
    protected static final byte[] zza = {yr.a.f159811k, 122, zi.c.f161643u, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, l3.a.f103436o7, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, l3.a.f103452q7, 63, 50, 108, -113, -103, 74};

    @k.h1
    protected static final byte[] zzb = {-110, -13, -34, 70, -83, 43, 97, zi.c.f161647y, -44, zi.c.f161640r, l3.a.f103502w7, -125, -28, l3.a.f103484u7, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, rg.a.f127263w, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrZza = zzasd.zza(file.getAbsolutePath());
            if (x509CertificateArrZza.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance(to.c.algoTypeS2).digest(x509CertificateArrZza[0][0].getEncoded());
            if (Arrays.equals(this.zzd, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.zzc, bArrDigest);
        } catch (zzasa e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e12) {
            e = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
