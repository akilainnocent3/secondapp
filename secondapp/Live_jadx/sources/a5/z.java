package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f3827l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f3828m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f3829n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3830o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f3831p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f3832q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f3833r = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f3834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f3837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f3838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f3839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f3842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Object f3844k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Uri f3845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f3846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3847c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public byte[] f3848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f3849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f3850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f3851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f3852h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3853i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f3854j;

        public z a() {
            zi.l0.F(this.f3845a, "The uri must be set.");
            return new z(this.f3845a, this.f3846b, this.f3847c, this.f3848d, this.f3849e, this.f3850f, this.f3851g, this.f3852h, this.f3853i, this.f3854j);
        }

        @qj.a
        public b b(@Nullable Object obj) {
            this.f3854j = obj;
            return this;
        }

        @qj.a
        public b c(int i10) {
            this.f3853i = i10;
            return this;
        }

        @qj.a
        public b d(@Nullable byte[] bArr) {
            this.f3848d = bArr;
            return this;
        }

        @qj.a
        public b e(int i10) {
            this.f3847c = i10;
            return this;
        }

        @qj.a
        public b f(Map<String, String> map) {
            this.f3849e = map;
            return this;
        }

        @qj.a
        public b g(@Nullable String str) {
            this.f3852h = str;
            return this;
        }

        @qj.a
        public b h(long j10) {
            this.f3851g = j10;
            return this;
        }

        @qj.a
        public b i(long j10) {
            this.f3850f = j10;
            return this;
        }

        @qj.a
        public b j(Uri uri) {
            this.f3845a = uri;
            return this;
        }

        @qj.a
        public b k(String str) {
            this.f3845a = Uri.parse(str);
            return this;
        }

        @qj.a
        public b l(long j10) {
            this.f3846b = j10;
            return this;
        }

        public b() {
            this.f3847c = 1;
            this.f3849e = Collections.EMPTY_MAP;
            this.f3851g = -1L;
        }

        public b(z zVar) {
            this.f3845a = zVar.f3834a;
            this.f3846b = zVar.f3835b;
            this.f3847c = zVar.f3836c;
            this.f3848d = zVar.f3837d;
            this.f3849e = zVar.f3838e;
            this.f3850f = zVar.f3840g;
            this.f3851g = zVar.f3841h;
            this.f3852h = zVar.f3842i;
            this.f3853i = zVar.f3843j;
            this.f3854j = zVar.f3844k;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    static {
        u4.h1.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f3836c);
    }

    public boolean d(int i10) {
        return (this.f3843j & i10) == i10;
    }

    public z e(long j10) {
        long j11 = this.f3841h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public z f(long j10, long j11) {
        return (j10 == 0 && this.f3841h == j11) ? this : new z(this.f3834a, this.f3835b, this.f3836c, this.f3837d, this.f3838e, this.f3840g + j10, j11, this.f3842i, this.f3843j, this.f3844k);
    }

    public z g(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f3838e);
        map2.putAll(map);
        return new z(this.f3834a, this.f3835b, this.f3836c, this.f3837d, map2, this.f3840g, this.f3841h, this.f3842i, this.f3843j, this.f3844k);
    }

    public z h(Map<String, String> map) {
        return new z(this.f3834a, this.f3835b, this.f3836c, this.f3837d, map, this.f3840g, this.f3841h, this.f3842i, this.f3843j, this.f3844k);
    }

    public z i(Uri uri) {
        return new z(uri, this.f3835b, this.f3836c, this.f3837d, this.f3838e, this.f3840g, this.f3841h, this.f3842i, this.f3843j, this.f3844k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f3834a + ", " + this.f3840g + ", " + this.f3841h + ", " + this.f3842i + ", " + this.f3843j + C4235d4.j.f61462e;
    }

    public z(Uri uri) {
        this(uri, 0L, -1L);
    }

    public z(Uri uri, long j10, long j11) {
        this(uri, j10, j11, null);
    }

    @Deprecated
    public z(Uri uri, long j10, long j11, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, str, 0, null);
    }

    public z(Uri uri, long j10, int i10, @Nullable byte[] bArr, Map<String, String> map, long j11, long j12, @Nullable String str, int i11, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        zi.l0.d(j13 >= 0);
        zi.l0.d(j11 >= 0);
        zi.l0.d(j12 > 0 || j12 == -1);
        this.f3834a = (Uri) zi.l0.E(uri);
        this.f3835b = j10;
        this.f3836c = i10;
        this.f3837d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f3838e = Collections.unmodifiableMap(new HashMap(map));
        this.f3840g = j11;
        this.f3839f = j13;
        this.f3841h = j12;
        this.f3842i = str;
        this.f3843j = i11;
        this.f3844k = obj;
    }
}
