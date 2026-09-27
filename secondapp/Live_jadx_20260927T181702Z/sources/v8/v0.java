package v8;

import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final List<r0> f140284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Uri f140285b;

    public v0(@oy.l List<r0> webTriggerParams, @oy.l Uri destination) {
        kotlin.jvm.internal.m0.p(webTriggerParams, "webTriggerParams");
        kotlin.jvm.internal.m0.p(destination, "destination");
        this.f140284a = webTriggerParams;
        this.f140285b = destination;
    }

    @oy.l
    @k.u0.a({@k.u0(extension = 1000000, version = 4), @k.u0(extension = 31, version = 9)})
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final WebTriggerRegistrationRequest a() {
        u0.a();
        WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = t0.a(r0.f140281c.a(this.f140284a), this.f140285b).build();
        kotlin.jvm.internal.m0.o(webTriggerRegistrationRequestBuild, "Builder(\n               …   )\n            .build()");
        return webTriggerRegistrationRequestBuild;
    }

    @oy.l
    public final Uri b() {
        return this.f140285b;
    }

    @oy.l
    public final List<r0> c() {
        return this.f140284a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.m0.g(this.f140284a, v0Var.f140284a) && kotlin.jvm.internal.m0.g(this.f140285b, v0Var.f140285b);
    }

    public int hashCode() {
        return (this.f140284a.hashCode() * 31) + this.f140285b.hashCode();
    }

    @oy.l
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f140284a + ", Destination=" + this.f140285b;
    }
}
