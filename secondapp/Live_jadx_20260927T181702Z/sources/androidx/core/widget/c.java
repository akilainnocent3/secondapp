package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @Nullable
        public static ColorStateList a(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        @Nullable
        public static PorterDuff.Mode b(@NonNull CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }

        public static void c(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        public static void d(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    @Nullable
    public static Drawable a(@NonNull CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    @Nullable
    public static ColorStateList b(@NonNull CheckedTextView checkedTextView) {
        return a.a(checkedTextView);
    }

    @Nullable
    public static PorterDuff.Mode c(@NonNull CheckedTextView checkedTextView) {
        return a.b(checkedTextView);
    }

    public static void d(@NonNull CheckedTextView checkedTextView, @Nullable ColorStateList colorStateList) {
        a.c(checkedTextView, colorStateList);
    }

    public static void e(@NonNull CheckedTextView checkedTextView, @Nullable PorterDuff.Mode mode) {
        a.d(checkedTextView, mode);
    }
}
