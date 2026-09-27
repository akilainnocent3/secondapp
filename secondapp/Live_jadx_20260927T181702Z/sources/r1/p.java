package r1;

import android.annotation.SuppressLint;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123466a = "mockLocation";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f123467b = "verticalAccuracy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f123468c = "speedAccuracy";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f123469d = "bearingAccuracy";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f123470e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f123471f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static Method f123472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static Field f123473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public static Integer f123474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static Integer f123475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public static Integer f123476k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class a {
        @k.t
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @k.t
        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @k.t
        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @k.t
        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        @k.t
        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @k.t
        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @k.t
        public static void g(Location location) {
            try {
                p.e().setByte(location, (byte) (p.e().getByte(location) & (~p.f())));
            } catch (IllegalAccessException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            } catch (NoSuchFieldException e11) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e11);
                throw noSuchFieldError;
            }
        }

        @k.t
        public static void h(Location location) {
            try {
                p.e().setByte(location, (byte) (p.e().getByte(location) & (~p.g())));
            } catch (IllegalAccessException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            } catch (NoSuchFieldException e11) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e11);
                throw noSuchFieldError;
            }
        }

        @k.t
        public static void i(Location location) {
            try {
                p.e().setByte(location, (byte) (p.e().getByte(location) & (~p.h())));
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e10);
                throw illegalAccessError;
            }
        }

        @k.t
        public static void j(Location location, float f10) {
            location.setBearingAccuracyDegrees(f10);
        }

        @k.t
        public static void k(Location location, float f10) {
            location.setSpeedAccuracyMetersPerSecond(f10);
        }

        @k.t
        public static void l(Location location, float f10) {
            location.setVerticalAccuracyMeters(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(28)
    public static class b {
        @k.t
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @k.t
        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        @k.t
        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class c {
        @k.t
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @k.t
        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        @k.t
        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                b.c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(33)
    public static class d {
        @k.t
        public static void a(Location location) {
            location.removeBearingAccuracy();
        }

        @k.t
        public static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        @k.t
        public static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(34)
    public static class e {
        @k.t
        public static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        @k.t
        public static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        @k.t
        public static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        @k.t
        public static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        @k.t
        public static void e(Location location) {
            location.removeMslAltitude();
        }

        @k.t
        public static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        @k.t
        public static void g(Location location, float f10) {
            location.setMslAltitudeAccuracyMeters(f10);
        }

        @k.t
        public static void h(Location location, double d10) {
            location.setMslAltitudeMeters(d10);
        }
    }

    public static void A(@NonNull Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.j(location, f10);
        } else {
            k(location).putFloat(f123469d, f10);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void B(@NonNull Location location, boolean z10) {
        try {
            l().invoke(location, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e10);
            throw illegalAccessError;
        } catch (NoSuchMethodException e11) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e11);
            throw noSuchMethodError;
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static void C(@NonNull Location location, @k.w(from = 0.0d) float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.g(location, f10);
        } else {
            k(location).putFloat(f123471f, f10);
        }
    }

    public static void D(@NonNull Location location, double d10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.h(location, d10);
        } else {
            k(location).putDouble(f123470e, d10);
        }
    }

    public static void E(@NonNull Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.k(location, f10);
        } else {
            k(location).putFloat(f123468c, f10);
        }
    }

    public static void F(@NonNull Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.l(location, f10);
        } else {
            k(location).putFloat("verticalAccuracy", f10);
        }
    }

    public static boolean a(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float b(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f123469d, 0.0f);
    }

    public static long c(@NonNull Location location) {
        return TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static long d(@NonNull Location location) {
        return location.getElapsedRealtimeNanos();
    }

    @SuppressLint({"BlockedPrivateApi"})
    public static Field e() throws NoSuchFieldException {
        if (f123473h == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f123473h = declaredField;
            declaredField.setAccessible(true);
        }
        return f123473h;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int f() throws IllegalAccessException, NoSuchFieldException {
        if (f123475j == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f123475j = Integer.valueOf(declaredField.getInt(null));
        }
        return f123475j.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int g() throws IllegalAccessException, NoSuchFieldException {
        if (f123474i == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f123474i = Integer.valueOf(declaredField.getInt(null));
        }
        return f123474i.intValue();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int h() throws IllegalAccessException, NoSuchFieldException {
        if (f123476k == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f123476k = Integer.valueOf(declaredField.getInt(null));
        }
        return f123476k.intValue();
    }

    @k.w(from = 0.0d)
    public static float i(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? e.a(location) : k(location).getFloat(f123471f);
    }

    public static double j(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? e.b(location) : k(location).getDouble(f123470e);
    }

    public static Bundle k(@NonNull Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    public static Method l() throws NoSuchMethodException {
        if (f123472g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f123472g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f123472g;
    }

    public static float m(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f123468c, 0.0f);
    }

    public static float n(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean o(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.d(location) : a(location, f123469d);
    }

    public static boolean p(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? e.c(location) : a(location, f123470e);
    }

    public static boolean q(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 34 ? e.d(location) : a(location, f123471f);
    }

    public static boolean r(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.e(location) : a(location, f123468c);
    }

    public static boolean s(@NonNull Location location) {
        return Build.VERSION.SDK_INT >= 26 ? a.f(location) : a(location, "verticalAccuracy");
    }

    public static boolean t(@NonNull Location location) {
        return location.isFromMockProvider();
    }

    public static void u(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            d.a(location);
            return;
        }
        if (i10 >= 29) {
            c.a(location);
            return;
        }
        if (i10 >= 28) {
            b.a(location);
        } else if (i10 >= 26) {
            a.g(location);
        } else {
            v(location, f123469d);
        }
    }

    public static void v(@NonNull Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void w(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.e(location);
        } else {
            v(location, f123470e);
        }
    }

    public static void x(@NonNull Location location) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.f(location);
        } else {
            v(location, f123471f);
        }
    }

    public static void y(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            d.b(location);
            return;
        }
        if (i10 >= 29) {
            c.b(location);
            return;
        }
        if (i10 >= 28) {
            b.b(location);
        } else if (i10 >= 26) {
            a.h(location);
        } else {
            v(location, f123468c);
        }
    }

    public static void z(@NonNull Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            d.c(location);
            return;
        }
        if (i10 >= 29) {
            c.c(location);
            return;
        }
        if (i10 >= 28) {
            b.c(location);
        } else if (i10 >= 26) {
            a.i(location);
        } else {
            v(location, "verticalAccuracy");
        }
    }
}
