package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class e2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f74713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f74714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f74715c;

    public e2(String str, Bitmap bitmap, Context context) {
        this.f74713a = str;
        this.f74714b = bitmap;
        this.f74715c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f2.f74782a.put(this.f74713a.concat(".png"), this.f74714b);
        try {
            Context context = this.f74715c;
            String strConcat = this.f74713a.concat(".png");
            File file = new File(context.getCacheDir(), "StartIoImages");
            file.mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, strConcat));
            try {
                this.f74714b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable unused) {
        }
    }
}
