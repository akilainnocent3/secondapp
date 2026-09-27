package f2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f82409b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f82410c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f82411d = 1001;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f82412e = 1002;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f82413f = 1003;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f82414g = 1004;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f82415h = 1006;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f82416i = 1007;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f82417j = 1008;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f82418k = 1009;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f82419l = 1010;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f82420m = 1011;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f82421n = 1012;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f82422o = 1013;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f82423p = 1014;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f82424q = 1015;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f82425r = 1016;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f82426s = 1017;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f82427t = 1018;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f82428u = 1019;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f82429v = 1020;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f82430w = 1021;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f82431x = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f82432a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(24)
    public static class a {
        @k.t
        public static PointerIcon a(Bitmap bitmap, float f10, float f11) {
            return PointerIcon.create(bitmap, f10, f11);
        }

        @k.t
        public static PointerIcon b(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }

        @k.t
        public static PointerIcon c(Resources resources, int i10) {
            return PointerIcon.load(resources, i10);
        }
    }

    public i1(PointerIcon pointerIcon) {
        this.f82432a = pointerIcon;
    }

    @NonNull
    public static i1 a(@NonNull Bitmap bitmap, float f10, float f11) {
        return Build.VERSION.SDK_INT >= 24 ? new i1(a.a(bitmap, f10, f11)) : new i1(null);
    }

    @NonNull
    public static i1 c(@NonNull Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new i1(a.b(context, i10)) : new i1(null);
    }

    @NonNull
    public static i1 d(@NonNull Resources resources, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new i1(a.c(resources, i10)) : new i1(null);
    }

    @Nullable
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f82432a;
    }
}
