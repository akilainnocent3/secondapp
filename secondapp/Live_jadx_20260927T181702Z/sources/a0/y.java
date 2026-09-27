package a0;

import android.app.Notification;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3331c = "android.support.customtabs.trusted.PLATFORM_TAG";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3332d = "android.support.customtabs.trusted.PLATFORM_ID";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3333e = "android.support.customtabs.trusted.NOTIFICATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f3334f = "android.support.customtabs.trusted.CHANNEL_NAME";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f3335g = "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3336h = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d.b f3337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f3338b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends d.a.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f3339c;

        public a(r rVar) {
            this.f3339c = rVar;
        }

        @Override // d.a
        public void D2(String str, Bundle bundle) throws RemoteException {
            this.f3339c.a(str, bundle);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable[] f3340a;

        public b(Parcelable[] parcelableArr) {
            this.f3340a = parcelableArr;
        }

        public static b a(Bundle bundle) {
            y.c(bundle, y.f3335g);
            return new b(bundle.getParcelableArray(y.f3335g));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(y.f3335g, this.f3340a);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3342b;

        public c(String str, int i10) {
            this.f3341a = str;
            this.f3342b = i10;
        }

        public static c a(Bundle bundle) {
            y.c(bundle, y.f3331c);
            y.c(bundle, y.f3332d);
            return new c(bundle.getString(y.f3331c), bundle.getInt(y.f3332d));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(y.f3331c, this.f3341a);
            bundle.putInt(y.f3332d, this.f3342b);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3343a;

        public d(String str) {
            this.f3343a = str;
        }

        public static d a(Bundle bundle) {
            y.c(bundle, y.f3334f);
            return new d(bundle.getString(y.f3334f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(y.f3334f, this.f3343a);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Notification f3346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3347d;

        public e(String str, int i10, Notification notification, String str2) {
            this.f3344a = str;
            this.f3345b = i10;
            this.f3346c = notification;
            this.f3347d = str2;
        }

        public static e a(Bundle bundle) {
            y.c(bundle, y.f3331c);
            y.c(bundle, y.f3332d);
            y.c(bundle, y.f3333e);
            y.c(bundle, y.f3334f);
            return new e(bundle.getString(y.f3331c), bundle.getInt(y.f3332d), (Notification) bundle.getParcelable(y.f3333e), bundle.getString(y.f3334f));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString(y.f3331c, this.f3344a);
            bundle.putInt(y.f3332d, this.f3345b);
            bundle.putParcelable(y.f3333e, this.f3346c);
            bundle.putString(y.f3334f, this.f3347d);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3348a;

        public f(boolean z10) {
            this.f3348a = z10;
        }

        public static f a(Bundle bundle) {
            y.c(bundle, y.f3336h);
            return new f(bundle.getBoolean(y.f3336h));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(y.f3336h, this.f3348a);
            return bundle;
        }
    }

    public y(@NonNull d.b bVar, @NonNull ComponentName componentName) {
        this.f3337a = bVar;
        this.f3338b = componentName;
    }

    public static void c(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }

    @Nullable
    public static d.a j(@Nullable r rVar) {
        if (rVar == null) {
            return null;
        }
        return new a(rVar);
    }

    public boolean a(@NonNull String str) throws RemoteException {
        return f.a(this.f3337a.v2(new d(str).b())).f3348a;
    }

    public void b(@NonNull String str, int i10) throws RemoteException {
        this.f3337a.y2(new c(str, i10).b());
    }

    @NonNull
    @t0(23)
    @y0({y0.a.LIBRARY})
    public Parcelable[] d() throws RemoteException {
        return b.a(this.f3337a.Z1()).f3340a;
    }

    @NonNull
    public ComponentName e() {
        return this.f3338b;
    }

    @Nullable
    public Bitmap f() throws RemoteException {
        return (Bitmap) this.f3337a.w1().getParcelable(x.f3324g);
    }

    public int g() throws RemoteException {
        return this.f3337a.t2();
    }

    public boolean h(@NonNull String str, int i10, @NonNull Notification notification, @NonNull String str2) throws RemoteException {
        return f.a(this.f3337a.W(new e(str, i10, notification, str2).b())).f3348a;
    }

    @Nullable
    public Bundle i(@NonNull String str, @NonNull Bundle bundle, @Nullable r rVar) throws RemoteException {
        d.a aVarJ = j(rVar);
        return this.f3337a.k1(str, bundle, aVarJ == null ? null : aVarJ.asBinder());
    }
}
