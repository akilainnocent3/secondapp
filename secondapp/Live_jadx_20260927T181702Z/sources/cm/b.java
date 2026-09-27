package cm;

import android.content.Context;
import android.os.Bundle;
import dr.w2;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@cr.f
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f24844b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    @Deprecated
    public static final String f24845c = "firebase_sessions_enabled";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    @Deprecated
    public static final String f24846d = "firebase_sessions_sessions_restart_timeout";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @Deprecated
    public static final String f24847e = "firebase_sessions_sampling_rate";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f24848a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(x xVar) {
            this();
        }

        public a() {
        }
    }

    @cr.a
    public b(@oy.l Context appContext) {
        m0.p(appContext, "appContext");
        Bundle bundle = appContext.getPackageManager().getApplicationInfo(appContext.getPackageName(), 128).metaData;
        this.f24848a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // cm.o
    @oy.m
    public Double a() {
        if (this.f24848a.containsKey(f24847e)) {
            return Double.valueOf(this.f24848a.getDouble(f24847e));
        }
        return null;
    }

    @Override // cm.o
    @oy.m
    public Boolean b() {
        if (this.f24848a.containsKey(f24845c)) {
            return Boolean.valueOf(this.f24848a.getBoolean(f24845c));
        }
        return null;
    }

    @Override // cm.o
    @oy.m
    public ev.h c() {
        if (this.f24848a.containsKey(f24846d)) {
            return ev.h.f(ev.j.w(this.f24848a.getInt(f24846d), ev.k.SECONDS));
        }
        return null;
    }

    @Override // cm.o
    @oy.m
    public Object d(@oy.l or.f<? super w2> fVar) {
        return o.a.b(this, fVar);
    }

    @Override // cm.o
    public boolean e() {
        return o.a.a(this);
    }
}
