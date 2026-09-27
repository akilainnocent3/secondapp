package com.bykv.vk.openvk.hww.hww.tq.vy;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class tq {
    public static long hww(String str, String str2) {
        File fileSd = sd(str, str2);
        if (fileSd.exists()) {
            return fileSd.length();
        }
        File fileTq = tq(str, str2);
        if (fileTq.exists()) {
            return fileTq.length();
        }
        return 0L;
    }

    public static File sd(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static File tq(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    public static void hww(RandomAccessFile randomAccessFile, byte[] bArr, int i10, int i11, String str) throws IOException {
        try {
            randomAccessFile.seek(i10);
            randomAccessFile.write(bArr, 0, i11);
        } catch (Throwable unused) {
        }
    }
}
