package r1;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123412a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123413b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123414c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123415d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123416e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123417f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123418g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f123419h = 7;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface b {
    }

    @NonNull
    @k.t0(24)
    public static a n(@NonNull GnssStatus gnssStatus) {
        return new n(gnssStatus);
    }

    @NonNull
    @SuppressLint({"ReferencesDeprecated"})
    public static a o(@NonNull GpsStatus gpsStatus) {
        return new o(gpsStatus);
    }

    @k.w(from = 0.0d, to = 360.0d)
    public abstract float a(@k.e0(from = 0) int i10);

    @k.w(from = 0.0d, to = 63.0d)
    public abstract float b(@k.e0(from = 0) int i10);

    @k.w(from = 0.0d)
    public abstract float c(@k.e0(from = 0) int i10);

    @k.w(from = 0.0d, to = 63.0d)
    public abstract float d(@k.e0(from = 0) int i10);

    public abstract int e(@k.e0(from = 0) int i10);

    @k.w(from = -90.0d, to = 90.0d)
    public abstract float f(@k.e0(from = 0) int i10);

    @k.e0(from = 0)
    public abstract int g();

    @k.e0(from = 1, to = 200)
    public abstract int h(@k.e0(from = 0) int i10);

    public abstract boolean i(@k.e0(from = 0) int i10);

    public abstract boolean j(@k.e0(from = 0) int i10);

    public abstract boolean k(@k.e0(from = 0) int i10);

    public abstract boolean l(@k.e0(from = 0) int i10);

    public abstract boolean m(@k.e0(from = 0) int i10);

    /* JADX INFO: renamed from: r1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractC1201a {
        public void a(@k.e0(from = 0) int i10) {
        }

        public void b(@NonNull a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }
}
