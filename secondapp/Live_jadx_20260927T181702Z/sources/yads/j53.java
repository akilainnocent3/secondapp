package yads;

import android.content.Context;
import android.location.LocationManager;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j53 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f150937c = new HashSet(fr.g0.l("gps"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f150938d = new HashSet(fr.h0.Q("gps", "passive"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f150939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc2 f150940b;

    public /* synthetic */ j53(Context context, LocationManager locationManager) {
        this(locationManager, new gc2(context));
    }

    public j53(LocationManager locationManager, gc2 gc2Var) {
        this.f150939a = locationManager;
        this.f150940b = gc2Var;
    }
}
