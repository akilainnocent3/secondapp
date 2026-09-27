package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Tb {
    public static final boolean a(String tag, String data, String filePath) {
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(data, "data");
        kotlin.jvm.internal.m0.p(filePath, "filePath");
        try {
            a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(cv.g.f77202b);
            kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String filePath) {
        kotlin.jvm.internal.m0.p(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            try {
                return xr.p.D(file, null, 1, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void a(String filePath) {
        kotlin.jvm.internal.m0.p(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
