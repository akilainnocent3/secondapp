package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;
import k.h1;
import k.x0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f6415d = "TwilightManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f6416e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f6417f = 22;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static i0 f6418g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f6420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6421c = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6423b;
    }

    @h1
    public i0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f6419a = context;
        this.f6420b = locationManager;
    }

    public static i0 a(@NonNull Context context) {
        if (f6418g == null) {
            Context applicationContext = context.getApplicationContext();
            f6418g = new i0(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.d.f52112s));
        }
        return f6418g;
    }

    @h1
    public static void f(i0 i0Var) {
        f6418g = i0Var;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location locationC = f1.i0.d(this.f6419a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = f1.i0.d(this.f6419a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @x0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location c(String str) {
        try {
            if (this.f6420b.isProviderEnabled(str)) {
                return this.f6420b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d(f6415d, "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f6421c;
        if (e()) {
            return aVar.f6422a;
        }
        Location locationB = b();
        if (locationB != null) {
            g(locationB);
            return aVar.f6422a;
        }
        Log.i(f6415d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f6421c.f6423b > System.currentTimeMillis();
    }

    public final void g(@NonNull Location location) {
        long j10;
        a aVar = this.f6421c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        h0 h0VarB = h0.b();
        h0VarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        h0VarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = h0VarB.f6414c == 1;
        long j11 = h0VarB.f6413b;
        long j12 = h0VarB.f6412a;
        h0VarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = h0VarB.f6413b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f6422a = z10;
        aVar.f6423b = j10;
    }
}
