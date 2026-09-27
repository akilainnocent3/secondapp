package yads;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qe1 implements ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh1 f154447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f154448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j53 f154449c;

    public qe1(Context context, eh1 eh1Var) {
        this.f154447a = eh1Var;
        Object systemService = context.getApplicationContext().getSystemService(FirebaseAnalytics.d.f52112s);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        this.f154448b = locationManager;
        this.f154449c = new j53(context.getApplicationContext(), locationManager);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    @Override // yads.ch1
    public final Location a() {
        List<String> allProviders;
        Location lastKnownLocation;
        try {
            LocationManager locationManager = this.f154448b;
            allProviders = locationManager != null ? locationManager.getAllProviders() : null;
        } catch (Throwable unused) {
            boolean z10 = ad1.f146762a;
        }
        if (allProviders == null) {
            return null;
        }
        List listJ = fr.g0.j();
        for (String str : allProviders) {
            j53 j53Var = this.f154449c;
            boolean zA = j53Var.f150940b.a("android.permission.ACCESS_COARSE_LOCATION");
            boolean zA2 = j53Var.f150940b.a("android.permission.ACCESS_FINE_LOCATION");
            boolean zContains = j53.f150937c.contains(str);
            if (!j53.f150938d.contains(str) ? zContains || !zA : !(!zContains && zA && zA2)) {
                lastKnownLocation = null;
            } else {
                try {
                    LocationManager locationManager2 = j53Var.f150939a;
                    if (locationManager2 != null) {
                        lastKnownLocation = locationManager2.getLastKnownLocation(str);
                        boolean z11 = ad1.f146762a;
                    } else {
                        lastKnownLocation = null;
                    }
                } catch (Throwable unused2) {
                    boolean z12 = ad1.f146762a;
                }
            }
            if (lastKnownLocation != null) {
                listJ.add(lastKnownLocation);
            }
        }
        return this.f154447a.a(fr.g0.b(listJ));
    }
}
