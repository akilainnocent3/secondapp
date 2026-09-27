package z;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final String A = "android.support.customtabs.customaction.DESCRIPTION";
    public static final int A0 = 0;
    public static final String B = "android.support.customtabs.customaction.PENDING_INTENT";
    public static final int B0 = 5;
    public static final String C = "android.support.customtabs.extra.TINT_ACTION_BUTTON";
    public static final int C0 = 16;
    public static final String D = "android.support.customtabs.extra.MENU_ITEMS";
    public static final String D0 = "Accept-Language";
    public static final String E = "android.support.customtabs.customaction.MENU_ITEM_TITLE";
    public static final String F = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 2;
    public static final String K = "androidx.browser.customtabs.extra.SHARE_STATE";

    @Deprecated
    public static final String L = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String M = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String N = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String O = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String P = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String Q = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String R = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String S = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String T = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX";
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = 2;
    public static final String Y = "androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR";
    public static final String Z = "androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f160109a0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ENABLE_MAXIMIZATION";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f160110b0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f160111c = "android.support.customtabs.extra.user_opt_out";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f160112c0 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f160113d = "android.support.customtabs.extra.SESSION";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f160114d0 = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f160115e = "android.support.customtabs.extra.SESSION_ID";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f160116e0 = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f160117f = 0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f160118f0 = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f160119g = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f160120g0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_POSITION";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f160121h = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f160122h0 = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f160123i = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f160124i0 = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f160125j = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f160126j0 = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f160127k = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f160128k0 = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f160129l = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f160130l0 = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f160131m = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f160132m0 = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f160133n = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f160134n0 = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f160135o = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f160136o0 = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f160137p = "org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f160138p0 = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f160139q = "android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f160140q0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_DECORATION_TYPE";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f160141r = "androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f160142r0 = "androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_ROUNDED_CORNERS_POSITION";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f160143s = "androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f160144s0 = "androidx.browser.customtabs.extra.TOOLBAR_CORNER_RADIUS_DP";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f160145t = "androidx.browser.customtabs.extra.SECONDARY_TOOLBAR_SWIPE_UP_GESTURE";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f160146t0 = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f160147u = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f160148u0 = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f160149v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f160150v0 = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f160151w = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f160152w0 = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f160153x = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f160154x0 = "androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f160155y = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final String f160156y0 = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f160157z = "android.support.customtabs.customaction.ICON";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f160158z0 = "android.support.customtabs.customaction.ID";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f160159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Bundle f160160b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 21)
    public static class e {
        @Nullable
        @k.t
        public static Locale a(Intent intent) {
            String stringExtra = intent.getStringExtra(f.f160141r);
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        @k.t
        public static void b(Intent intent, Locale locale) {
            intent.putExtra(f.f160141r, locale.toLanguageTag());
        }
    }

    /* JADX INFO: renamed from: z.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 23)
    public static class C1568f {
        @k.t
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 24)
    public static class g {
        @Nullable
        @k.t
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(api = 34)
    public static class h {
        @k.t
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface j {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface k {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface l {
    }

    public f(@NonNull Intent intent, @Nullable Bundle bundle) {
        this.f160159a = intent;
        this.f160160b = bundle;
    }

    public static int a(@NonNull Intent intent) {
        return intent.getIntExtra(Y, 0);
    }

    @k.q(unit = 0)
    public static int b(@NonNull Intent intent) {
        return intent.getIntExtra(f160110b0, 0);
    }

    public static int c(@NonNull Intent intent) {
        return intent.getIntExtra(f160140q0, 0);
    }

    public static int d(@NonNull Intent intent) {
        return intent.getIntExtra(f160120g0, 0);
    }

    public static int e(@NonNull Intent intent) {
        return intent.getIntExtra(f160142r0, 0);
    }

    public static int f(@NonNull Intent intent) {
        return intent.getIntExtra(f160154x0, 0);
    }

    @NonNull
    public static z.b g(@NonNull Intent intent, int i10) {
        Bundle bundle;
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException("Invalid colorScheme: " + i10);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return z.b.a(null);
        }
        z.b bVarA = z.b.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(R);
        return (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i10)) == null) ? bVarA : z.b.a(bundle).c(bVarA);
    }

    @k.q(unit = 1)
    public static int h(@NonNull Intent intent) {
        return intent.getIntExtra(T, 0);
    }

    @k.q(unit = 1)
    public static int i(@NonNull Intent intent) {
        return intent.getIntExtra(Z, 0);
    }

    @Nullable
    @t0(api = 24)
    public static Locale j(Intent intent) {
        return e.a(intent);
    }

    public static int k() {
        return 5;
    }

    @Nullable
    public static PendingIntent l(@NonNull Intent intent) {
        return (PendingIntent) intent.getParcelableExtra(f160145t);
    }

    @k.q(unit = 0)
    public static int m(@NonNull Intent intent) {
        return intent.getIntExtra(f160144s0, 16);
    }

    @Nullable
    public static Locale n(@NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 24) {
            return j(intent);
        }
        return null;
    }

    public static boolean o(@NonNull Intent intent) {
        return intent.getBooleanExtra(f160109a0, false);
    }

    public static boolean p(@NonNull Intent intent) {
        return !intent.getBooleanExtra(f160143s, false);
    }

    public static boolean q(@NonNull Intent intent) {
        return !intent.getBooleanExtra(f160135o, false);
    }

    public static boolean r(@NonNull Intent intent) {
        return !intent.getBooleanExtra(f160137p, false);
    }

    public static boolean s(@NonNull Intent intent) {
        return intent.getBooleanExtra(f160139q, false);
    }

    @NonNull
    public static Intent u(@Nullable Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra(f160111c, true);
        return intent;
    }

    public static boolean v(@NonNull Intent intent) {
        return intent.getBooleanExtra(f160111c, false) && (intent.getFlags() & 268435456) != 0;
    }

    public void t(@NonNull Context context, @NonNull Uri uri) {
        this.f160159a.setData(uri);
        f1.d.startActivity(context, this.f160159a, this.f160160b);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ArrayList<Bundle> f160163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public ActivityOptions f160164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public ArrayList<Bundle> f160165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public SparseArray<Bundle> f160166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public Bundle f160167g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f160170j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f160161a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z.b.a f160162b = new z.b.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f160168h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f160169i = true;

        public i() {
        }

        @NonNull
        public i A(boolean z10) {
            this.f160169i = z10;
            return this;
        }

        @t0(api = 24)
        public final void B(@NonNull Locale locale) {
            e.b(this.f160161a, locale);
        }

        @NonNull
        @Deprecated
        public i C(@k.k int i10) {
            this.f160162b.b(i10);
            return this;
        }

        @NonNull
        @Deprecated
        public i D(@k.k int i10) {
            this.f160162b.c(i10);
            return this;
        }

        @NonNull
        @y0({y0.a.LIBRARY})
        public i E(@NonNull m.d dVar) {
            K(null, dVar.b());
            return this;
        }

        @NonNull
        @Deprecated
        public i F(@k.k int i10) {
            this.f160162b.d(i10);
            return this;
        }

        @NonNull
        public i G(@Nullable PendingIntent pendingIntent) {
            this.f160161a.putExtra(f.f160145t, pendingIntent);
            return this;
        }

        @NonNull
        public i H(@NonNull RemoteViews remoteViews, @Nullable int[] iArr, @Nullable PendingIntent pendingIntent) {
            this.f160161a.putExtra(f.M, remoteViews);
            this.f160161a.putExtra(f.N, iArr);
            this.f160161a.putExtra(f.O, pendingIntent);
            return this;
        }

        @NonNull
        public i I(boolean z10) {
            this.f160161a.putExtra(f.f160139q, z10);
            return this;
        }

        @NonNull
        public i J(@NonNull m mVar) {
            this.f160161a.setPackage(mVar.h().getPackageName());
            K(mVar.g(), mVar.i());
            return this;
        }

        public final void K(@Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder(f.f160113d, iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable(f.f160115e, pendingIntent);
            }
            this.f160161a.putExtras(bundle);
        }

        @NonNull
        public i L(boolean z10) {
            this.f160170j = z10;
            return this;
        }

        @t0(api = 34)
        public final void M() {
            if (this.f160164d == null) {
                this.f160164d = C1568f.a();
            }
            h.a(this.f160164d, this.f160170j);
        }

        @NonNull
        public i N(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f160168h = i10;
            if (i10 == 1) {
                this.f160161a.putExtra(f.L, true);
                return this;
            }
            if (i10 == 2) {
                this.f160161a.putExtra(f.L, false);
                return this;
            }
            this.f160161a.removeExtra(f.L);
            return this;
        }

        @NonNull
        public i O(boolean z10) {
            this.f160161a.putExtra(f.f160133n, z10 ? 1 : 0);
            return this;
        }

        @NonNull
        public i P(@NonNull Context context, @k.a int i10, @k.a int i11) {
            this.f160164d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        @NonNull
        @Deprecated
        public i Q(@k.k int i10) {
            this.f160162b.e(i10);
            return this;
        }

        @NonNull
        public i R(@k.q(unit = 0) int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new IllegalArgumentException("Invalid value for the cornerRadiusDp argument");
            }
            this.f160161a.putExtra(f.f160144s0, i10);
            return this;
        }

        @NonNull
        public i S(@NonNull Locale locale) {
            if (Build.VERSION.SDK_INT >= 24) {
                B(locale);
            }
            return this;
        }

        @NonNull
        public i T(boolean z10) {
            this.f160161a.putExtra(f.f160129l, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public i a() {
            N(1);
            return this;
        }

        @NonNull
        public i b(@NonNull String str, @NonNull PendingIntent pendingIntent) {
            if (this.f160163c == null) {
                this.f160163c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString(f.E, str);
            bundle.putParcelable(f.B, pendingIntent);
            this.f160163c.add(bundle);
            return this;
        }

        @NonNull
        @Deprecated
        public i c(int i10, @NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) throws IllegalStateException {
            if (this.f160165e == null) {
                this.f160165e = new ArrayList<>();
            }
            if (this.f160165e.size() >= 5) {
                throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(f.f160158z0, i10);
            bundle.putParcelable(f.f160157z, bitmap);
            bundle.putString(f.A, str);
            bundle.putParcelable(f.B, pendingIntent);
            this.f160165e.add(bundle);
            return this;
        }

        @NonNull
        public f d() {
            if (!this.f160161a.hasExtra(f.f160113d)) {
                K(null, null);
            }
            ArrayList<Bundle> arrayList = this.f160163c;
            if (arrayList != null) {
                this.f160161a.putParcelableArrayListExtra(f.D, arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f160165e;
            if (arrayList2 != null) {
                this.f160161a.putParcelableArrayListExtra(f.f160153x, arrayList2);
            }
            this.f160161a.putExtra(f.Q, this.f160169i);
            this.f160161a.putExtras(this.f160162b.a().b());
            Bundle bundle = this.f160167g;
            if (bundle != null) {
                this.f160161a.putExtras(bundle);
            }
            if (this.f160166f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray(f.R, this.f160166f);
                this.f160161a.putExtras(bundle2);
            }
            this.f160161a.putExtra(f.K, this.f160168h);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                s();
            }
            if (i10 >= 34) {
                M();
            }
            ActivityOptions activityOptions = this.f160164d;
            return new f(this.f160161a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        @NonNull
        @Deprecated
        public i e() {
            this.f160161a.putExtra(f.f160129l, true);
            return this;
        }

        @NonNull
        public i f(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent) {
            return g(bitmap, str, pendingIntent, false);
        }

        @NonNull
        public i g(@NonNull Bitmap bitmap, @NonNull String str, @NonNull PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt(f.f160158z0, 0);
            bundle.putParcelable(f.f160157z, bitmap);
            bundle.putString(f.A, str);
            bundle.putParcelable(f.B, pendingIntent);
            this.f160161a.putExtra(f.f160151w, bundle);
            this.f160161a.putExtra(f.C, z10);
            return this;
        }

        @NonNull
        public i h(@k.q(unit = 0) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f160161a.putExtra(f.f160110b0, i10);
            return this;
        }

        @NonNull
        public i i(int i10) {
            if (i10 < 0 || i10 > 3) {
                throw new IllegalArgumentException("Invalid value for the decorationType argument");
            }
            this.f160161a.putExtra(f.f160140q0, i10);
            return this;
        }

        @NonNull
        public i j(boolean z10) {
            this.f160161a.putExtra(f.f160109a0, z10);
            return this;
        }

        @NonNull
        public i k(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the sideSheetPosition argument");
            }
            this.f160161a.putExtra(f.f160120g0, i10);
            return this;
        }

        @NonNull
        public i l(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the roundedCornersPosition./ argument");
            }
            this.f160161a.putExtra(f.f160142r0, i10);
            return this;
        }

        @NonNull
        public i m(boolean z10) {
            this.f160161a.putExtra(f.f160143s, !z10);
            return this;
        }

        @NonNull
        public i n(boolean z10) {
            this.f160161a.putExtra(f.f160135o, !z10);
            return this;
        }

        @NonNull
        public i o(@NonNull Bitmap bitmap) {
            this.f160161a.putExtra(f.f160131m, bitmap);
            return this;
        }

        @NonNull
        public i p(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f160161a.putExtra(f.f160154x0, i10);
            return this;
        }

        @NonNull
        public i q(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f160161a.putExtra(f.f160125j, i10);
            return this;
        }

        @NonNull
        public i r(int i10, @NonNull z.b bVar) {
            if (i10 < 0 || i10 > 2 || i10 == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i10);
            }
            if (this.f160166f == null) {
                this.f160166f = new SparseArray<>();
            }
            this.f160166f.put(i10, bVar.b());
            return this;
        }

        @t0(api = 24)
        public final void s() {
            String strA = g.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f160161a.hasExtra("com.android.browser.headers") ? this.f160161a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strA);
            this.f160161a.putExtra("com.android.browser.headers", bundleExtra);
        }

        @NonNull
        public i t(@NonNull z.b bVar) {
            this.f160167g = bVar.b();
            return this;
        }

        @NonNull
        @Deprecated
        public i u(boolean z10) {
            if (z10) {
                N(1);
                return this;
            }
            N(2);
            return this;
        }

        @NonNull
        public i v(boolean z10) {
            this.f160161a.putExtra(f.f160137p, !z10);
            return this;
        }

        @NonNull
        public i w(@NonNull Context context, @k.a int i10, @k.a int i11) {
            this.f160161a.putExtra(f.F, d1.e.d(context, i10, i11).m());
            return this;
        }

        @NonNull
        public i x(@k.q(unit = 1) int i10) {
            return y(i10, 0);
        }

        @NonNull
        public i y(@k.q(unit = 1) int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f160161a.putExtra(f.T, i10);
            this.f160161a.putExtra(f.Y, i11);
            return this;
        }

        @NonNull
        public i z(@k.q(unit = 1) int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f160161a.putExtra(f.Z, i10);
            return this;
        }

        public i(@Nullable m mVar) {
            if (mVar != null) {
                J(mVar);
            }
        }
    }
}
