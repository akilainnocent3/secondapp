package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @k.t
        public static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        @k.t
        public static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        @k.t
        public static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        @k.t
        public static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    @Nullable
    public static ColorStateList a(@NonNull ImageView imageView) {
        return a.a(imageView);
    }

    @Nullable
    public static PorterDuff.Mode b(@NonNull ImageView imageView) {
        return a.b(imageView);
    }

    public static void c(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        a.c(imageView, colorStateList);
    }

    public static void d(@NonNull ImageView imageView, @Nullable PorterDuff.Mode mode) {
        a.d(imageView, mode);
    }
}
