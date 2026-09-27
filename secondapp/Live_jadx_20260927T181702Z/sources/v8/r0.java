package v8;

import android.adservices.measurement.WebTriggerParams;
import android.annotation.SuppressLint;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f140281c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Uri f140282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140283b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @k.u0.a({@k.u0(extension = 1000000, version = 4), @k.u0(extension = 31, version = 9)})
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public final List<WebTriggerParams> a(@oy.l List<r0> request) {
            kotlin.jvm.internal.m0.p(request, "request");
            ArrayList arrayList = new ArrayList();
            for (r0 r0Var : request) {
                q0.a();
                WebTriggerParams webTriggerParamsBuild = p0.a(r0Var.b()).setDebugKeyAllowed(r0Var.a()).build();
                kotlin.jvm.internal.m0.o(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        public a() {
        }
    }

    public r0(@oy.l Uri registrationUri, boolean z10) {
        kotlin.jvm.internal.m0.p(registrationUri, "registrationUri");
        this.f140282a = registrationUri;
        this.f140283b = z10;
    }

    public final boolean a() {
        return this.f140283b;
    }

    @oy.l
    public final Uri b() {
        return this.f140282a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m0.g(this.f140282a, r0Var.f140282a) && this.f140283b == r0Var.f140283b;
    }

    public int hashCode() {
        return (this.f140282a.hashCode() * 31) + g8.a.a(this.f140283b);
    }

    @oy.l
    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.f140282a + ", DebugKeyAllowed=" + this.f140283b + " }";
    }
}
