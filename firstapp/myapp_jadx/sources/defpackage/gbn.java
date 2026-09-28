package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RemoteViews;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public interface gbn {
    void a(String str, ImageView imageView);

    void b(String str, ImageView imageView);

    void c(String str, j5f0<Bitmap> j5f0Var);

    void d(int i, ImageView imageView, String str);

    void e(String str, ImageView imageView, int i, int i2);

    void f(String str, ibn<Bitmap> ibnVar);

    void g(ImageView imageView, int i, int i2);

    void h(String str, ibn<File> ibnVar);

    void i(String str, RemoteViews remoteViews, int i, Notification notification);
}
