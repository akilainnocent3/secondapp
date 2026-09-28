package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ge4 implements zg50<Bitmap> {
    public static final h2z<Integer> b = h2z.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final h2z<Bitmap.CompressFormat> c = new h2z<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, h2z.e);
    public final px0 a;

    public ge4(px0 px0Var) {
        this.a = px0Var;
    }

    @Override // defpackage.zg50
    public final c4g a(s2z s2zVar) {
        return c4g.b;
    }

    @Override // defpackage.g4g
    public final boolean b(Object obj, File file, s2z s2zVar) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((qg50) obj).get();
        h2z<Bitmap.CompressFormat> h2zVar = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) s2zVar.c(h2zVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = agt.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) s2zVar.c(b)).intValue();
        OutputStream ac5Var = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    px0 px0Var = this.a;
                    if (px0Var != null) {
                        try {
                            ac5Var = new ac5(fileOutputStream, px0Var);
                        } catch (IOException e) {
                            e = e;
                            ac5Var = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (ac5Var != null) {
                                try {
                                    ac5Var.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            ac5Var = fileOutputStream;
                            if (ac5Var != null) {
                                try {
                                    ac5Var.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        ac5Var = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, ac5Var);
                    ac5Var.close();
                    try {
                        ac5Var.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + erh0.c(bitmap) + " in " + agt.a(jElapsedRealtimeNanos) + ", options format: " + s2zVar.c(h2zVar) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
