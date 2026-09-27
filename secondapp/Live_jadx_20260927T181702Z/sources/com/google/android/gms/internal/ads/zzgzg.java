package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgzg {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgyv zzgyvVar = new zzgyv();
        file.getClass();
        zzgwj zzgwjVarZzq = zzgwj.zzq(new zzgzd[0]);
        bArr.getClass();
        FileOutputStream fileOutputStreamZza = zzgze.zza(file, zzgwjVarZzq, zzgyvVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th2) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgsw.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgsw.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgzf zzgzfVar = new zzgzf(file, null);
        zzgyv zzgyvVar = new zzgyv();
        zzgwj zzgwjVarZzq = zzgwj.zzq(new zzgzd[0]);
        zzgzc zzgzcVarZza = zzgzc.zza();
        try {
            InputStream inputStreamZza = zzgzfVar.zza();
            zzgzcVarZza.zzb(inputStreamZza);
            FileOutputStream fileOutputStreamZza = zzgze.zza(file2, zzgwjVarZzq, zzgyvVar);
            zzgzcVarZza.zzb(fileOutputStreamZza);
            int i10 = zzgyz.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int i11 = inputStreamZza.read(bArr);
                if (i11 == -1) {
                    break;
                } else {
                    fileOutputStreamZza.write(bArr, 0, i11);
                }
            }
            zzgzcVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th2) {
            try {
                throw zzgzcVarZza.zzc(th2);
            } catch (Throwable th3) {
                zzgzcVarZza.close();
                throw th3;
            }
        }
    }
}
