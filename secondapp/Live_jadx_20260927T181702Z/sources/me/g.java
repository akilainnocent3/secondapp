package me;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f107270a = 86400000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f107271b = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f107272c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f107273d = 10000;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public pe.a f107274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<ae.h, b> f107275b = new HashMap();

        public a a(ae.h hVar, b bVar) {
            this.f107275b.put(hVar, bVar);
            return this;
        }

        public g b() {
            if (this.f107274a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f107275b.keySet().size() < ae.h.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<ae.h, b> map = this.f107275b;
            this.f107275b = new HashMap();
            return g.d(this.f107274a, map);
        }

        public a c(pe.a aVar) {
            this.f107274a = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @AutoValue
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new d.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static g d(pe.a aVar, Map<ae.h, b> map) {
        return new me.c(aVar, map);
    }

    public static g f(pe.a aVar) {
        return b().a(ae.h.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(ae.h.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(ae.h.VERY_LOW, b.a().b(86400000L).d(86400000L).c(j(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static <T> Set<T> j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i10, long j10) {
        int i11 = i10 - 1;
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i11))));
    }

    @t0(api = 21)
    public JobInfo.Builder c(JobInfo.Builder builder, ae.h hVar, long j10, int i10) {
        builder.setMinimumLatency(h(hVar, j10, i10));
        k(builder, i().get(hVar).c());
        return builder;
    }

    public abstract pe.a e();

    public Set<c> g(ae.h hVar) {
        return i().get(hVar).c();
    }

    public long h(ae.h hVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = i().get(hVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    public abstract Map<ae.h, b> i();

    @t0(api = 21)
    public final void k(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
