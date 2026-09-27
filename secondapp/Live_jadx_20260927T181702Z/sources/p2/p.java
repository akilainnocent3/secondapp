package p2;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:tint", method = "setImageTintList", type = ImageView.class), @androidx.databinding.g(attribute = "android:tintMode", method = "setImageTintMode", type = ImageView.class)})
@y0({y0.a.LIBRARY})
public class p {
    @androidx.databinding.d({"android:src"})
    public static void a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
    }

    @androidx.databinding.d({"android:src"})
    public static void b(ImageView imageView, Uri uri) {
        imageView.setImageURI(uri);
    }

    @androidx.databinding.d({"android:src"})
    public static void c(ImageView imageView, String str) {
        if (str == null) {
            imageView.setImageURI(null);
        } else {
            imageView.setImageURI(Uri.parse(str));
        }
    }
}
