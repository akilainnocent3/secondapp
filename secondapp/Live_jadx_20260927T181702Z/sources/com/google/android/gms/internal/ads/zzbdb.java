package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbdb {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(l3.a.R4)) {
            return null;
        }
        final zzhcb zzhcbVarZze = zzhcb.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbda
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhcb zzhcbVar = zzhcbVarZze;
                if (list2 == null) {
                    zzhcbVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksumA = z.a(list2.get(i10));
                        if (apkChecksumA.getType() == 8) {
                            zzhcbVar.zza(zzbbo.zza(apkChecksumA.getValue()));
                            return;
                        }
                    }
                    zzhcbVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhcbVar.zza((Object) null);
                }
            }
        });
        return (String) zzhcbVarZze.get();
    }
}
