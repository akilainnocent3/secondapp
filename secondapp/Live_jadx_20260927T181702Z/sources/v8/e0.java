package v8;

import android.adservices.measurement.WebSourceParams;
import android.annotation.SuppressLint;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f140245c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Uri f140246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140247b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @k.u0.a({@k.u0(extension = 1000000, version = 4), @k.u0(extension = 31, version = 9)})
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public final List<WebSourceParams> a(@oy.l List<e0> request) {
            kotlin.jvm.internal.m0.p(request, "request");
            ArrayList arrayList = new ArrayList();
            for (e0 e0Var : request) {
                d0.a();
                WebSourceParams webSourceParamsBuild = c0.a(e0Var.b()).setDebugKeyAllowed(e0Var.a()).build();
                kotlin.jvm.internal.m0.o(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        public a() {
        }
    }

    public e0(@oy.l Uri registrationUri, boolean z10) {
        kotlin.jvm.internal.m0.p(registrationUri, "registrationUri");
        this.f140246a = registrationUri;
        this.f140247b = z10;
    }

    public final boolean a() {
        return this.f140247b;
    }

    @oy.l
    public final Uri b() {
        return this.f140246a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.m0.g(this.f140246a, e0Var.f140246a) && this.f140247b == e0Var.f140247b;
    }

    public int hashCode() {
        return (this.f140246a.hashCode() * 31) + g8.a.a(this.f140247b);
    }

    @oy.l
    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.f140246a + ", DebugKeyAllowed=" + this.f140247b + " }";
    }
}
