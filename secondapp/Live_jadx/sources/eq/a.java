package eq;

import android.net.Uri;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Uri f81500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final Map<String, String> f81501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final JSONObject f81502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f81503d;

    /* JADX INFO: renamed from: eq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0798a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oy.l
        public final fq.a f81504e;

        public C0798a(@oy.l Uri uri, @oy.l Map<String, String> map, @oy.m JSONObject jSONObject, long j10, @oy.l fq.a aVar) {
            super(uri, map, jSONObject, j10);
            this.f81504e = aVar;
        }

        @Override // eq.a
        @oy.m
        public b a() {
            return null;
        }

        @Override // eq.a
        @oy.l
        public fq.a c() {
            return this.f81504e;
        }
    }

    public a(@oy.l Uri uri, @oy.l Map<String, String> map, @oy.m JSONObject jSONObject, long j10) {
        this.f81500a = uri;
        this.f81501b = map;
        this.f81502c = jSONObject;
        this.f81503d = j10;
    }

    @oy.m
    public abstract b a();

    public final long b() {
        return this.f81503d;
    }

    @oy.m
    public abstract fq.a c();

    @oy.l
    public final Map<String, String> d() {
        return this.f81501b;
    }

    @oy.m
    public final JSONObject e() {
        return this.f81502c;
    }

    @oy.l
    public final Uri f() {
        return this.f81500a;
    }

    @oy.l
    public String toString() {
        return "BeaconItem{url=" + this.f81500a + ", headers=" + this.f81501b + ", addTimestamp=" + this.f81503d;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f81505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oy.m
        public final fq.a f81506f;

        public b(@oy.l Uri uri, @oy.l Map<String, String> map, @oy.m JSONObject jSONObject, long j10, long j11) {
            super(uri, map, jSONObject, j10);
            this.f81505e = j11;
        }

        @Override // eq.a
        @oy.m
        public fq.a c() {
            return this.f81506f;
        }

        public final long g() {
            return this.f81505e;
        }

        @Override // eq.a
        @oy.l
        public b a() {
            return this;
        }
    }
}
