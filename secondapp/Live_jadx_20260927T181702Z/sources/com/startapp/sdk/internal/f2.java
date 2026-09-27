package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f74782a = new ConcurrentHashMap();

    public static boolean a(Context context, String str) {
        if (!str.endsWith(".png")) {
            str = str.concat(".png");
        }
        if (f74782a.containsKey(str)) {
            return true;
        }
        File file = new File(context.getCacheDir(), "StartIoImages");
        file.mkdirs();
        return new File(file, str).exists();
    }

    public static Bitmap b(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = f74782a;
        Bitmap bitmapDecodeStream = (Bitmap) concurrentHashMap.get(str);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileInputStream fileInputStream = new FileInputStream(new File(file, str));
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                concurrentHashMap.put(str, bitmapDecodeStream);
                fileInputStream.close();
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            return bitmapDecodeStream;
        }
    }
}
