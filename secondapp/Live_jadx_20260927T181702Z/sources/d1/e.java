package d1;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f77473a = "android.activity.usage_time";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77474b = "android.usage_time_packages";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ActivityOptions f77475c;

        public a(ActivityOptions activityOptions) {
            this.f77475c = activityOptions;
        }

        @Override // d1.e
        public Rect a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return d.a(this.f77475c);
        }

        @Override // d1.e
        public void j(@NonNull PendingIntent pendingIntent) {
            c.c(this.f77475c, pendingIntent);
        }

        @Override // d1.e
        @NonNull
        public e k(@Nullable Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(d.b(this.f77475c, rect));
        }

        @Override // d1.e
        public e l(boolean z10) {
            return Build.VERSION.SDK_INT < 34 ? this : new a(C0760e.a(this.f77475c, z10));
        }

        @Override // d1.e
        public Bundle m() {
            return this.f77475c.toBundle();
        }

        @Override // d1.e
        public void n(@NonNull e eVar) {
            if (eVar instanceof a) {
                this.f77475c.update(((a) eVar).f77475c);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(21)
    public static class b {
        @k.t
        public static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @k.t
        public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @k.t
        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(23)
    public static class c {
        @k.t
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        @k.t
        public static ActivityOptions b(View view, int i10, int i11, int i12, int i13) {
            return ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13);
        }

        @k.t
        public static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(24)
    public static class d {
        @k.t
        public static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @k.t
        public static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* JADX INFO: renamed from: d1.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static class C0760e {
        @k.t
        public static ActivityOptions a(ActivityOptions activityOptions, boolean z10) {
            return activityOptions.setShareIdentityEnabled(z10);
        }
    }

    @NonNull
    public static e b() {
        return new a(c.a());
    }

    @NonNull
    public static e c(@NonNull View view, int i10, int i11, int i12, int i13) {
        return new a(c.b(view, i10, i11, i12, i13));
    }

    @NonNull
    public static e d(@NonNull Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    @NonNull
    public static e e(@NonNull View view, int i10, int i11, int i12, int i13) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13));
    }

    @NonNull
    public static e f(@NonNull Activity activity, @NonNull View view, @NonNull String str) {
        return new a(b.a(activity, view, str));
    }

    @NonNull
    public static e g(@NonNull Activity activity, @Nullable e2.t<View, String>... tVarArr) {
        Pair[] pairArr;
        if (tVarArr != null) {
            pairArr = new Pair[tVarArr.length];
            for (int i10 = 0; i10 < tVarArr.length; i10++) {
                e2.t<View, String> tVar = tVarArr[i10];
                pairArr[i10] = Pair.create(tVar.f79831a, tVar.f79832b);
            }
        } else {
            pairArr = null;
        }
        return new a(b.b(activity, pairArr));
    }

    @NonNull
    public static e h() {
        return new a(b.c());
    }

    @NonNull
    public static e i(@NonNull View view, @NonNull Bitmap bitmap, int i10, int i11) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11));
    }

    @Nullable
    public Rect a() {
        return null;
    }

    @Nullable
    public Bundle m() {
        return null;
    }

    public void j(@NonNull PendingIntent pendingIntent) {
    }

    @NonNull
    public e k(@Nullable Rect rect) {
        return this;
    }

    @NonNull
    public e l(boolean z10) {
        return this;
    }

    public void n(@NonNull e eVar) {
    }
}
