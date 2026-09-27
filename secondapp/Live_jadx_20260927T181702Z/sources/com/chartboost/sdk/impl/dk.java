package com.chartboost.sdk.impl;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class dk {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f38592i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f38598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f38600h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final dk a(JSONObject config) {
            kotlin.jvm.internal.m0.p(config, "config");
            long jOptLong = config.optLong("maxBytes", 52428800L);
            int iOptInt = config.optInt("maxUnitsPerTimeWindow", 10);
            int iOptInt2 = config.optInt("maxUnitsPerTimeWindowCellular", 10);
            long jOptLong2 = config.optLong("timeWindow", 18000L);
            long jOptLong3 = config.optLong("timeWindowCellular", 18000L);
            long jOptLong4 = config.optLong("ttl", TelemetryConfig.DEFAULT_EVENT_TTL_SEC);
            int iOptInt3 = config.optInt("bufferSize", 3);
            String strOptString = config.optString("videoPlayer", ek.f38838a);
            b.a aVar = b.f38601c;
            kotlin.jvm.internal.m0.m(strOptString);
            return new dk(jOptLong, iOptInt, iOptInt2, jOptLong2, jOptLong3, jOptLong4, iOptInt3, aVar.a(strOptString));
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        EXO_PLAYER("exoplayer"),
        MEDIA_PLAYER("mediaplayer");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f38606b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ sr.a f38605g = sr.c.c(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f38601c = new a(null);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public a() {
            }

            public final b a(String value) {
                Object next;
                kotlin.jvm.internal.m0.p(value, "value");
                Iterator<E> it = b.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m0.g(((b) next).c(), value));
                b bVar = (b) next;
                return bVar == null ? b.EXO_PLAYER : bVar;
            }

            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }
        }

        b(String str) {
            this.f38606b = str;
        }

        public static sr.a b() {
            return f38605g;
        }

        public final String c() {
            return this.f38606b;
        }
    }

    public dk(long j10, int i10, int i11, long j11, long j12, long j13, int i12, b videoPlayer) {
        kotlin.jvm.internal.m0.p(videoPlayer, "videoPlayer");
        this.f38593a = j10;
        this.f38594b = i10;
        this.f38595c = i11;
        this.f38596d = j11;
        this.f38597e = j12;
        this.f38598f = j13;
        this.f38599g = i12;
        this.f38600h = videoPlayer;
    }

    public final int a() {
        return this.f38599g;
    }

    public final long b() {
        return this.f38593a;
    }

    public final int c() {
        return this.f38594b;
    }

    public final int d() {
        return this.f38595c;
    }

    public final long e() {
        return this.f38596d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        return this.f38593a == dkVar.f38593a && this.f38594b == dkVar.f38594b && this.f38595c == dkVar.f38595c && this.f38596d == dkVar.f38596d && this.f38597e == dkVar.f38597e && this.f38598f == dkVar.f38598f && this.f38599g == dkVar.f38599g && this.f38600h == dkVar.f38600h;
    }

    public final long f() {
        return this.f38597e;
    }

    public final long g() {
        return this.f38598f;
    }

    public final b h() {
        return this.f38600h;
    }

    public int hashCode() {
        return (((((((((((((f0.p.a(this.f38593a) * 31) + this.f38594b) * 31) + this.f38595c) * 31) + f0.p.a(this.f38596d)) * 31) + f0.p.a(this.f38597e)) * 31) + f0.p.a(this.f38598f)) * 31) + this.f38599g) * 31) + this.f38600h.hashCode();
    }

    public String toString() {
        return "VideoPreCachingModel(maxBytes=" + this.f38593a + ", maxUnitsPerTimeWindow=" + this.f38594b + ", maxUnitsPerTimeWindowCellular=" + this.f38595c + ", timeWindow=" + this.f38596d + ", timeWindowCellular=" + this.f38597e + ", ttl=" + this.f38598f + ", bufferSize=" + this.f38599g + ", videoPlayer=" + this.f38600h + gi.j.f86771d;
    }

    public static final dk a(JSONObject jSONObject) {
        return f38592i.a(jSONObject);
    }

    public /* synthetic */ dk(long j10, int i10, int i11, long j11, long j12, long j13, int i12, b bVar, int i13, kotlin.jvm.internal.x xVar) {
        this((i13 & 1) != 0 ? 52428800L : j10, (i13 & 2) != 0 ? 10 : i10, (i13 & 4) == 0 ? i11 : 10, (i13 & 8) != 0 ? 18000L : j11, (i13 & 16) == 0 ? j12 : 18000L, (i13 & 32) != 0 ? TelemetryConfig.DEFAULT_EVENT_TTL_SEC : j13, (i13 & 64) != 0 ? 3 : i12, (i13 & 128) != 0 ? b.EXO_PLAYER : bVar);
    }
}
