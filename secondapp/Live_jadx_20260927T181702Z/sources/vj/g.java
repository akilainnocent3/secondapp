package vj;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj.a.b f141226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppMeasurementSdk f141227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f141228c;

    public g(AppMeasurementSdk appMeasurementSdk, uj.a.b bVar) {
        this.f141226a = bVar;
        this.f141227b = appMeasurementSdk;
        f fVar = new f(this);
        this.f141228c = fVar;
        appMeasurementSdk.registerOnMeasurementEventListener(fVar);
    }

    public final /* synthetic */ uj.a.b b() {
        return this.f141226a;
    }

    @Override // vj.a
    public final uj.a.b zza() {
        return this.f141226a;
    }

    @Override // vj.a
    public final void zzc() {
    }

    @Override // vj.a
    public final void a(Set set) {
    }
}
