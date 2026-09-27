package a0;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3283a = "PackageIdentity";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class a implements c {
        @Override // a0.l.c
        @Nullable
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (!signingInfo.hasMultipleSigners()) {
                arrayList.add(l.a(signingInfo.getSigningCertificateHistory()[0]));
                return arrayList;
            }
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(l.a(signature));
            }
            return arrayList;
        }

        @Override // a0.l.c
        public boolean b(String str, PackageManager packageManager, p pVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> listA;
            if (pVar.h().equals(str) && (listA = a(str, packageManager)) != null) {
                return listA.size() == 1 ? packageManager.hasSigningCertificate(str, pVar.f(0), 1) : pVar.equals(p.c(str, listA));
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements c {
        @Override // a0.l.c
        @Nullable
        @SuppressLint({"PackageManagerGetSignatures"})
        public List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] bArrA = l.a(signature);
                if (bArrA == null) {
                    return null;
                }
                arrayList.add(bArrA);
            }
            return arrayList;
        }

        @Override // a0.l.c
        public boolean b(String str, PackageManager packageManager, p pVar) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> listA;
            if (str.equals(pVar.h()) && (listA = a(str, packageManager)) != null) {
                return pVar.equals(p.c(str, listA));
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        @Nullable
        List<byte[]> a(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;

        boolean b(String str, PackageManager packageManager, p pVar) throws PackageManager.NameNotFoundException, IOException;
    }

    @Nullable
    public static byte[] a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Nullable
    public static List<byte[]> b(String str, PackageManager packageManager) {
        try {
            return c().a(str, packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f3283a, "Could not get fingerprint for package.", e10);
            return null;
        }
    }

    public static c c() {
        return Build.VERSION.SDK_INT >= 28 ? new a() : new b();
    }

    public static boolean d(String str, PackageManager packageManager, p pVar) {
        try {
            return c().b(str, packageManager, pVar);
        } catch (PackageManager.NameNotFoundException | IOException e10) {
            Log.e(f3283a, "Could not check if package matches token.", e10);
            return false;
        }
    }
}
