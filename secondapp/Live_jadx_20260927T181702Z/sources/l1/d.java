package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Method;
import k.t;
import k.t0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f103284a = "DrawableCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f103285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f103286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f103287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f103288e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class a {
        @t
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @t
        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @t
        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @t
        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @t
        public static void e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        @t
        public static void f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        @t
        public static void g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        @t
        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @t
        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    public static class b {
        @t
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @t
        public static boolean b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    public static void a(@NonNull Drawable drawable, @NonNull Resources.Theme theme) {
        a.a(drawable, theme);
    }

    public static boolean b(@NonNull Drawable drawable) {
        return a.b(drawable);
    }

    public static void c(@NonNull Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(@NonNull Drawable drawable) {
        return drawable.getAlpha();
    }

    @Nullable
    public static ColorFilter e(@NonNull Drawable drawable) {
        return a.c(drawable);
    }

    public static int f(@NonNull Drawable drawable) {
        return b.a(drawable);
    }

    public static void g(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(@NonNull Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    @Deprecated
    public static void i(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(@NonNull Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    public static void k(@NonNull Drawable drawable, float f10, float f11) {
        a.e(drawable, f10, f11);
    }

    public static void l(@NonNull Drawable drawable, int i10, int i11, int i12, int i13) {
        a.f(drawable, i10, i11, i12, i13);
    }

    public static boolean m(@NonNull Drawable drawable, int i10) {
        return b.b(drawable, i10);
    }

    public static void n(@NonNull Drawable drawable, @k.k int i10) {
        a.g(drawable, i10);
    }

    public static void o(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        a.h(drawable, colorStateList);
    }

    public static void p(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T q(@NonNull Drawable drawable) {
        return drawable instanceof l ? (T) ((l) drawable).b() : drawable;
    }

    @NonNull
    public static Drawable r(@NonNull Drawable drawable) {
        return drawable;
    }
}
