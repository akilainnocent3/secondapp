package com.bytedance.adsdk.tq.vy;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import s7.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class vgm {
    private final hv hww;

    public vgm(hv hvVar) {
        this.hww = hvVar;
    }

    private File tq(String str) throws FileNotFoundException {
        File file = new File(hww(), hww(str, sd.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(hww(), hww(str, sd.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public Pair<sd, InputStream> hww(String str) {
        try {
            File fileTq = tq(str);
            if (fileTq == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileTq);
            sd sdVar = fileTq.getAbsolutePath().endsWith(d.f129681l) ? sd.ZIP : sd.JSON;
            fileTq.getAbsolutePath();
            return new Pair<>(sdVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File hww(String str, InputStream inputStream, sd sdVar) throws IOException {
        File file = new File(hww(), hww(str, sdVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 != -1) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    public void hww(String str, sd sdVar) {
        File file = new File(hww(), hww(str, sdVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File hww() {
        File fileHww = this.hww.hww();
        if (fileHww.isFile()) {
            fileHww.delete();
        }
        if (!fileHww.exists()) {
            fileHww.mkdirs();
        }
        return fileHww;
    }

    private static String hww(String str, sd sdVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? sdVar.hww() : sdVar.f32356sd);
        return sb2.toString();
    }
}
