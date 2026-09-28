package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.ft7;
import defpackage.i08;
import defpackage.ll5;
import defpackage.nlh;
import defpackage.r1h;
import defpackage.xx0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdl {
    public zzdl(Context context) {
    }

    public static final byte[] zza(File file) throws IOException {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    r1h r1hVar = new r1h(8193);
                    r1hVar.write(i5);
                    ll5.a(fileInputStream, r1hVar);
                    int size = r1hVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrD = r1hVar.d();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    xx0.f(bArrD, i, bArrCopyOf, 0, r1hVar.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ft7.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] bArr) throws IOException {
        if (!file.exists() || file.delete()) {
            nlh.d(file, bArr);
        } else {
            i08.a("Unable to delete existing encrypted file");
        }
    }
}
