package ah;

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
import re.k2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f5056l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f5057m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f5058n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f5059o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f5060p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f5061q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f5062r = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f5066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f5067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f5068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f5071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Object f5073k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Uri f5074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f5075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public byte[] f5077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f5078e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5079f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f5080g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public String f5081h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5082i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public Object f5083j;

        public d0 a() {
            eh.a.l(this.f5074a, "The uri must be set.");
            return new d0(this.f5074a, this.f5075b, this.f5076c, this.f5077d, this.f5078e, this.f5079f, this.f5080g, this.f5081h, this.f5082i, this.f5083j);
        }

        @qj.a
        public b b(@Nullable Object obj) {
            this.f5083j = obj;
            return this;
        }

        @qj.a
        public b c(int i10) {
            this.f5082i = i10;
            return this;
        }

        @qj.a
        public b d(@Nullable byte[] bArr) {
            this.f5077d = bArr;
            return this;
        }

        @qj.a
        public b e(int i10) {
            this.f5076c = i10;
            return this;
        }

        @qj.a
        public b f(Map<String, String> map) {
            this.f5078e = map;
            return this;
        }

        @qj.a
        public b g(@Nullable String str) {
            this.f5081h = str;
            return this;
        }

        @qj.a
        public b h(long j10) {
            this.f5080g = j10;
            return this;
        }

        @qj.a
        public b i(long j10) {
            this.f5079f = j10;
            return this;
        }

        @qj.a
        public b j(Uri uri) {
            this.f5074a = uri;
            return this;
        }

        @qj.a
        public b k(String str) {
            this.f5074a = Uri.parse(str);
            return this;
        }

        @qj.a
        public b l(long j10) {
            this.f5075b = j10;
            return this;
        }

        public b() {
            this.f5076c = 1;
            this.f5078e = Collections.EMPTY_MAP;
            this.f5080g = -1L;
        }

        public b(d0 d0Var) {
            this.f5074a = d0Var.f5063a;
            this.f5075b = d0Var.f5064b;
            this.f5076c = d0Var.f5065c;
            this.f5077d = d0Var.f5066d;
            this.f5078e = d0Var.f5067e;
            this.f5079f = d0Var.f5069g;
            this.f5080g = d0Var.f5070h;
            this.f5081h = d0Var.f5071i;
            this.f5082i = d0Var.f5072j;
            this.f5083j = d0Var.f5073k;
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
        k2.a("goog.exo.datasource");
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
        return c(this.f5065c);
    }

    public boolean d(int i10) {
        return (this.f5072j & i10) == i10;
    }

    public d0 e(long j10) {
        long j11 = this.f5070h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public d0 f(long j10, long j11) {
        return (j10 == 0 && this.f5070h == j11) ? this : new d0(this.f5063a, this.f5064b, this.f5065c, this.f5066d, this.f5067e, this.f5069g + j10, j11, this.f5071i, this.f5072j, this.f5073k);
    }

    public d0 g(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f5067e);
        map2.putAll(map);
        return new d0(this.f5063a, this.f5064b, this.f5065c, this.f5066d, map2, this.f5069g, this.f5070h, this.f5071i, this.f5072j, this.f5073k);
    }

    public d0 h(Map<String, String> map) {
        return new d0(this.f5063a, this.f5064b, this.f5065c, this.f5066d, map, this.f5069g, this.f5070h, this.f5071i, this.f5072j, this.f5073k);
    }

    public d0 i(Uri uri) {
        return new d0(uri, this.f5064b, this.f5065c, this.f5066d, this.f5067e, this.f5069g, this.f5070h, this.f5071i, this.f5072j, this.f5073k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f5063a + ", " + this.f5069g + ", " + this.f5070h + ", " + this.f5071i + ", " + this.f5072j + C4235d4.j.f61462e;
    }

    public d0(Uri uri) {
        this(uri, 0L, -1L);
    }

    public d0(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }

    @Deprecated
    public d0(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    @Deprecated
    public d0(Uri uri, long j10, long j11, @Nullable String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    @Deprecated
    public d0(Uri uri, long j10, long j11, @Nullable String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    @Deprecated
    public d0(Uri uri, long j10, long j11, @Nullable String str, int i10, Map<String, String> map) {
        this(uri, 1, null, j10, j10, j11, str, i10, map);
    }

    @Deprecated
    public d0(Uri uri, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    @Deprecated
    public d0(Uri uri, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    @Deprecated
    public d0(Uri uri, int i10, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.EMPTY_MAP);
    }

    @Deprecated
    public d0(Uri uri, int i10, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i11, Map<String, String> map) {
        this(uri, j10 - j11, i10, bArr, map, j11, j12, str, i11, null);
    }

    public d0(Uri uri, long j10, int i10, @Nullable byte[] bArr, Map<String, String> map, long j11, long j12, @Nullable String str, int i11, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        eh.a.a(j13 >= 0);
        eh.a.a(j11 >= 0);
        eh.a.a(j12 > 0 || j12 == -1);
        this.f5063a = uri;
        this.f5064b = j10;
        this.f5065c = i10;
        this.f5066d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f5067e = Collections.unmodifiableMap(new HashMap(map));
        this.f5069g = j11;
        this.f5068f = j13;
        this.f5070h = j12;
        this.f5071i = str;
        this.f5072j = i11;
        this.f5073k = obj;
    }
}
