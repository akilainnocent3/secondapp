package a2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3543a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f3544b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3545c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f3546d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f3547e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3548f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f3549g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f3550h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f3551i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f3552j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f3553k = 63;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class a {
        @k.t
        public static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        @k.t
        public static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        @k.t
        public static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    @NonNull
    public static Spanned a(@NonNull String str, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.a(str, i10) : Html.fromHtml(str);
    }

    @NonNull
    public static Spanned b(@NonNull String str, int i10, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? a.b(str, i10, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @NonNull
    public static String c(@NonNull Spanned spanned, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? a.c(spanned, i10) : Html.toHtml(spanned);
    }
}
