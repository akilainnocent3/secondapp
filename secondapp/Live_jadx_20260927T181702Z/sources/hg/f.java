package hg;

import android.net.Uri;
import androidx.annotation.Nullable;
import cj.v6;
import cj.x6;
import cj.z7;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f extends h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f88258w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f88259x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f88260y = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f88263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f88264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f88265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f88266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f88267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f88268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f88269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f88270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f88271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f88272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f88273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final DrmInitData f88274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<e> f88275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<b> f88276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map<Uri, d> f88277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f88278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f88279v;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends C0882f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f88280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f88281n;

        public b(String str, @Nullable e eVar, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, eVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f88280m = z11;
            this.f88281n = z12;
        }

        public b b(long j10, int i10) {
            return new b(this.f88287b, this.f88288c, this.f88289d, i10, j10, this.f88292g, this.f88293h, this.f88294i, this.f88295j, this.f88296k, this.f88297l, this.f88280m, this.f88281n);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f88282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f88283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f88284c;

        public d(Uri uri, long j10, int i10) {
            this.f88282a = uri;
            this.f88283b = j10;
            this.f88284c = i10;
        }
    }

    /* JADX INFO: renamed from: hg.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0882f implements Comparable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final e f88288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f88289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f88290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f88291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final DrmInitData f88292g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f88293h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f88294i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f88295j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f88296k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f88297l;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f88291f > l10.longValue()) {
                return 1;
            }
            return this.f88291f < l10.longValue() ? -1 : 0;
        }

        public C0882f(String str, @Nullable e eVar, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j12, long j13, boolean z10) {
            this.f88287b = str;
            this.f88288c = eVar;
            this.f88289d = j10;
            this.f88290e = i10;
            this.f88291f = j11;
            this.f88292g = drmInitData;
            this.f88293h = str2;
            this.f88294i = str3;
            this.f88295j = j12;
            this.f88296k = j13;
            this.f88297l = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f88298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f88299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f88300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f88301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f88302e;

        public g(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f88298a = j10;
            this.f88299b = z10;
            this.f88300c = j11;
            this.f88301d = j12;
            this.f88302e = z11;
        }
    }

    public f(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, @Nullable DrmInitData drmInitData, List<e> list2, List<b> list3, g gVar, Map<Uri, d> map) {
        super(str, list, z12);
        this.f88261d = i10;
        this.f88265h = j11;
        this.f88264g = z10;
        this.f88266i = z11;
        this.f88267j = i11;
        this.f88268k = j12;
        this.f88269l = i12;
        this.f88270m = j13;
        this.f88271n = j14;
        this.f88272o = z13;
        this.f88273p = z14;
        this.f88274q = drmInitData;
        this.f88275r = v6.u(list2);
        this.f88276s = v6.u(list3);
        this.f88277t = x6.m(map);
        if (!list3.isEmpty()) {
            b bVar = (b) z7.w(list3);
            this.f88278u = bVar.f88291f + bVar.f88289d;
        } else if (list2.isEmpty()) {
            this.f88278u = 0L;
        } else {
            e eVar = (e) z7.w(list2);
            this.f88278u = eVar.f88291f + eVar.f88289d;
        }
        this.f88262e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f88278u, j10) : Math.max(0L, this.f88278u + j10) : -9223372036854775807L;
        this.f88263f = j10 >= 0;
        this.f88279v = gVar;
    }

    public f b(long j10, int i10) {
        return new f(this.f88261d, this.f88327a, this.f88328b, this.f88262e, this.f88264g, j10, true, i10, this.f88268k, this.f88269l, this.f88270m, this.f88271n, this.f88329c, this.f88272o, this.f88273p, this.f88274q, this.f88275r, this.f88276s, this.f88279v, this.f88277t);
    }

    public f c() {
        return this.f88272o ? this : new f(this.f88261d, this.f88327a, this.f88328b, this.f88262e, this.f88264g, this.f88265h, this.f88266i, this.f88267j, this.f88268k, this.f88269l, this.f88270m, this.f88271n, this.f88329c, true, this.f88273p, this.f88274q, this.f88275r, this.f88276s, this.f88279v, this.f88277t);
    }

    public long d() {
        return this.f88265h + this.f88278u;
    }

    public boolean e(@Nullable f fVar) {
        if (fVar != null) {
            long j10 = this.f88268k;
            long j11 = fVar.f88268k;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f88275r.size() - fVar.f88275r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f88276s.size();
                int size3 = fVar.f88276s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f88272o || fVar.f88272o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends C0882f {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f88285m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<b> f88286n;

        public e(String str, long j10, long j11, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, v6.z());
        }

        public e b(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f88286n.size(); i11++) {
                b bVar = this.f88286n.get(i11);
                arrayList.add(bVar.b(j11, i10));
                j11 += bVar.f88289d;
            }
            return new e(this.f88287b, this.f88288c, this.f88285m, this.f88289d, i10, j10, this.f88292g, this.f88293h, this.f88294i, this.f88295j, this.f88296k, this.f88297l, arrayList);
        }

        public e(String str, @Nullable e eVar, String str2, long j10, int i10, long j11, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j12, long j13, boolean z10, List<b> list) {
            super(str, eVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f88285m = str2;
            this.f88286n = v6.u(list);
        }
    }

    @Override // xf.z
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f copy(List<StreamKey> list) {
        return this;
    }
}
